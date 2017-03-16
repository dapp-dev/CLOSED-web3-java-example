/*  ______ __    ______ ______ __  __ ______ __   __  _____  __ __  __
 * |  ___ |  |  |  __  |  ____|  |/ _|  ____|  |_|  |/  _  \|..|  \|  | (C)opyright 2017 HSH Nordbank
 * |  ___<|  \__|  \_| |  \___|    <_|  \___|   _   |  |_|  |  |      | The dapp-dev team.
 *  \_____|\____|\_____|\_____|__|\__|\_____|__| |__|__| |__|__|__|\__|
 */
package com.hshnordbank.web3j;

import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.Response;

import java.io.IOException;
import java.util.concurrent.Future;

public final class AsyncHelper {

    private AsyncHelper() {
        throw new IllegalAccessError();
    }

    /**
     * Waits for the result of an asynchronous blockchain request.
     *
     * @param request an asynchronous blockchain request
     * @param <T> response type
     * @return A new Response instance
     * @throws IllegalStateException if something unexpected happens (like an IOException)
     */
    public static <T extends Response<?>> T waitForResult(Request<?, T> request) {
        try {
            return request.send();
        } catch (IOException x) {
            throw new IllegalStateException("Error retrieving the async result from the blockchain.", x);
        }
    }

    /**
     * Waits for the result of an asynchronous Future computation.
     *
     * @param future a Future instance
     * @param <T> result type
     * @return The resulting value of the Future computation
     * @throws IllegalStateException if something unexpected happens (like an IOException)
     */
    public static <T> T waitForResult(Future<? extends T> future) {
        try {
            return future.get();
        } catch (Exception x) {
            throw new IllegalStateException("Error retrieving the async result from the blockchain.", x);
        }
    }

}
