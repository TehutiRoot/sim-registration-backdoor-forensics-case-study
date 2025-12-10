package com.netcetera.threeds.sdk.api.transaction.challenge;

import com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent;
import com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent;
import com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent;

/* loaded from: classes5.dex */
public interface ChallengeStatusReceiver {
    void cancelled();

    void completed(CompletionEvent completionEvent);

    void protocolError(ProtocolErrorEvent protocolErrorEvent);

    void runtimeError(RuntimeErrorEvent runtimeErrorEvent);

    void timedout();
}