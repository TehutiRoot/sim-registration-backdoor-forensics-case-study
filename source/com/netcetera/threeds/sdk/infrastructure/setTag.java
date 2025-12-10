package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public abstract class setTag implements com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver {
    private static int get = 0;
    private static int values = 1;
    private final setSelected valueOf;

    public setTag(com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver) {
        this.valueOf = setNestedScrollingEnabled.valueOf(challengeStatusReceiver);
    }

    public abstract void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent);

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void cancelled() {
        this.valueOf.ThreeDS2Service(new setTextDirection(this));
        int i = get;
        int i2 = i ^ 125;
        int i3 = ((i & 125) | i2) << 1;
        int i4 = -i2;
        values = ((i3 & i4) + (i3 | i4)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void completed(com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent) {
        this.valueOf.ThreeDS2Service(new setMinimumHeight(this, completionEvent));
        int i = values;
        int i2 = i & 63;
        int i3 = ((i ^ 63) | i2) << 1;
        int i4 = -((i | 63) & (~i2));
        get = ((i3 & i4) + (i4 | i3)) % 128;
    }

    public abstract void get();

    public abstract void get(com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent);

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void protocolError(com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent) {
        this.valueOf.ThreeDS2Service(new setTextAlignment(this, protocolErrorEvent));
        int i = get;
        values = (((i & (-90)) | ((~i) & 89)) + ((i & 89) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void runtimeError(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        this.valueOf.ThreeDS2Service(new setOnSystemUiVisibilityChangeListener(this, runtimeErrorEvent));
        int i = get;
        int i2 = i & 105;
        int i3 = (i ^ 105) | i2;
        values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public final void timedout() {
        this.valueOf.ThreeDS2Service(new setOverScrollMode(this));
        int i = get;
        values = (((i | 107) << 1) - (i ^ 107)) % 128;
    }

    public abstract void valueOf(com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent);

    public abstract void values();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent) throws Exception {
        int i = get;
        int i2 = i & 7;
        int i3 = (i | 7) & (~i2);
        int i4 = i2 << 1;
        values = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        valueOf(completionEvent);
        int i5 = values;
        int i6 = i5 ^ 67;
        int i7 = (((i5 & 67) | i6) << 1) - i6;
        get = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent) throws Exception {
        int i = values;
        int i2 = (((i ^ 31) | (i & 31)) << 1) - (((~i) & 31) | (i & (-32)));
        get = i2 % 128;
        int i3 = i2 % 2;
        get(protocolErrorEvent);
        if (i3 != 0) {
            throw null;
        }
        int i4 = get;
        int i5 = ((i4 ^ 107) | (i4 & 107)) << 1;
        int i6 = -(((~i4) & 107) | (i4 & (-108)));
        values = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) throws Exception {
        int i = get + 19;
        values = i % 128;
        int i2 = i % 2;
        ThreeDS2ServiceInstance(runtimeErrorEvent);
        if (i2 == 0) {
            throw null;
        }
        int i3 = values;
        get = ((i3 & 71) + (i3 | 71)) % 128;
    }
}
