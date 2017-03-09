/*
 * Copyright (c) 2016 by HSH Nordbank AG All rights reserved.
 *
 * This software is the confidential and proprietary information of HSH Nordbank AG
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with HSH Nordbank
 * AG.
 */
pragma solidity ^0.4.0;

contract SSD {

  // Returns (State) will be converted to returns (uint8).
  // The type is automatically adjusted if needed, e.g. uint16 etc.
  enum State { Created, Approved, Confirmed, Rejected }

  modifier isApprovable(State state) { if (state != State.Created) { throw; } _; }
  modifier isConfirmable(State state) { if (state != State.Approved) { throw; } _; }
  modifier isRejectable(State state) { if (state != State.Approved) { throw; } _; }

  State public state;
  address public issuer;
  address public counterparty;
  bytes3 public currency;
  uint public nominal;
  int public interestRate;
  uint8 public interestRateDecimalUnits;
  uint32 public valueDate;
  uint32 public maturityDate;
  uint8 public structured;
  uint public denominationSize;
  bytes32 public contractHash;

  modifier issuerUnequalCounterparty(address counterparty) {
    if (msg.sender == counterparty) {
      throw;
    }
    _;
  }

  modifier maturityAfterValueDate(uint32 valueDate, uint32 maturityDate) {
    if (valueDate > maturityDate) {
      throw;
    }
    _;
  }

  // constructor
  function SSD(
    address _counterparty,
    bytes3 _currency,
    uint _nominal,
    int _interestRate,
    uint8 _interestRateDecimalUnits,
    uint32 _valueDate,
    uint32 _maturityDate,
    uint8 _structured,
    uint _denominationSize,
    bytes32 _contractHash
  )
    issuerUnequalCounterparty(_counterparty)
    maturityAfterValueDate(valueDate, maturityDate)
  {
    state = State.Approved; // TODO: State.Created;
    issuer = msg.sender;
    counterparty = _counterparty;
    currency = _currency;
    nominal = _nominal;
    interestRate = _interestRate;
    interestRateDecimalUnits = _interestRateDecimalUnits;
    valueDate = _valueDate;
    maturityDate = _maturityDate;
    structured = _structured;
    denominationSize = _denominationSize;
    contractHash = _contractHash;
  }

  function approve() isApprovable(state) {
    if (msg.sender != issuer) {
      throw;
    }
    state = State.Approved;
  }

  function confirm() isConfirmable(state) {
    if (msg.sender != counterparty) {
      throw;
    }
    state = State.Confirmed;
  }

  function reject() isRejectable(state) {
    if (msg.sender != counterparty) {
      throw;
    }
    state = State.Rejected;
  }

  // reject ether
  function() {
    throw;
  }

}
