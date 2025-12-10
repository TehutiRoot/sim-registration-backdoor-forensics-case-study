package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setMinimumWidth extends setSystemUiVisibility {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver get;

    public setMinimumWidth(com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, setOnCapturedPointerListener setoncapturedpointerlistener) {
        super(setoncapturedpointerlistener);
        this.get = challengeStatusReceiver;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSystemUiVisibility
    public void values(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        int i = ThreeDS2Service;
        int i2 = ((i | 47) << 1) - (i ^ 47);
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        this.get.runtimeError(runtimeErrorEvent);
        if (i3 != 0) {
            return;
        }
        throw null;
    }
}