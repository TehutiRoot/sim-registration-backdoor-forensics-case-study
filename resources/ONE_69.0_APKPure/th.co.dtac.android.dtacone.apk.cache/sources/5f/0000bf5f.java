package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setTransitionName extends setSystemUiVisibility {
    private static int valueOf = 0;
    private static int values = 1;
    private final setShowSoftInputOnFocus ThreeDS2Service;

    public setTransitionName(setShowSoftInputOnFocus setshowsoftinputonfocus, setOnCapturedPointerListener setoncapturedpointerlistener) {
        super(setoncapturedpointerlistener);
        this.ThreeDS2Service = setshowsoftinputonfocus;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSystemUiVisibility
    public void values(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        int i = valueOf;
        int i2 = i & 75;
        values = ((((i | 75) & (~i2)) - (~(i2 << 1))) - 1) % 128;
        this.ThreeDS2Service.ThreeDS2ServiceInstance(runtimeErrorEvent);
        int i3 = values + 53;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }
}