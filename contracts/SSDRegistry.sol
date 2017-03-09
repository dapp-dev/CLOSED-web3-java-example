/*
 * Copyright (c) 2016 by HSH Nordbank AG All rights reserved.
 *
 * This software is the confidential and proprietary information of HSH Nordbank AG
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with HSH Nordbank
 * AG.
 */
pragma solidity ^0.4.0;

import { SSD } from "SSD.sol";

contract SSDRegistry {

  mapping(address => SSD[]) private ssds;

  modifier indexWithinBounds(uint index, uint length) {
    if (index < 0 || index >= length) { throw; }
    _;
  }

  function isDeployed() constant returns (bool) {
    return true;
  }

  function createSSD(
    address counterparty,
    bytes3 currency,
    uint nominal,
    int interestRate,
    uint8 interestRateDecimalUnits,
    uint32 valueDate,
    uint32 maturityDate,
    uint8 structured,
    uint denominationSize,
    bytes32 contractHash
  ) returns (SSD ssd) {
    SSD[] ssdArray = ssds[counterparty];
    ssd = new SSD(
      counterparty,
      currency,
      nominal,
      interestRate,
      interestRateDecimalUnits,
      valueDate,
      maturityDate,
      structured,
      denominationSize,
      contractHash
    );
    ssdArray.push(ssd);
    logNewSSD(ssd);
  }

  function getSSDCount(address counterparty) returns (uint) {
    return ssds[counterparty].length;
  }

  function getSSD(address counterparty, uint index) returns (
    SSD,     // the ssd (address)
    uint8,   // ssd state
    address, // counterparty
    bytes3,  // currency
    uint,    // nominal
    int,     // interest rate
    uint8,   // interest rate decimal units
    uint32,  // value date
    uint32,  // maturity date
    uint8,   // structured
    uint     // denominationSize
  ) {
    SSD ssd = ssds[counterparty][index];
    return (
      ssd,
      uint8(ssd.state()),
      ssd.counterparty(),
      ssd.currency(),
      ssd.nominal(),
      ssd.interestRate(),
      ssd.interestRateDecimalUnits(),
      ssd.valueDate(),
      ssd.maturityDate(),
      ssd.structured(),
      ssd.denominationSize()
    );
  }

  // reject ether
  function() {
    throw;
  }

  event logNewSSD(address ssd);

}
