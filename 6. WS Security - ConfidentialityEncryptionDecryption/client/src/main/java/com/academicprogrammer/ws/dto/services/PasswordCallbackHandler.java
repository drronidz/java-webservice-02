package com.academicprogrammer.ws.dto.services;

/*
PROJECT NAME : 4. WS Security - Authentication
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/20/2022 10:21 PM
*/

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PasswordCallbackHandler implements CallbackHandler {

    Map<String, String> authCredentials = new HashMap<>();

    public PasswordCallbackHandler() {
        authCredentials.put("sum-username", "sum-password");
        authCredentials.put("clientkey", "clientkeypass");
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback: callbacks) {
            WSPasswordCallback passwordCallback = (WSPasswordCallback) callback;
            String password = authCredentials.get(passwordCallback.getIdentifier());
            passwordCallback.setPassword(password);
            return;
        }
    }
}
