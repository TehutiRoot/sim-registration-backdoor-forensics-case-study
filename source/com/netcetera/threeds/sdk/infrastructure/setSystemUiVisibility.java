package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class setSystemUiVisibility implements setActivated {
    private static int get = 1;
    private static int valueOf;
    private final setOnCapturedPointerListener ThreeDS2Service;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(setMinimumWidth.class);

    public setSystemUiVisibility(setOnCapturedPointerListener setoncapturedpointerlistener) {
        this.ThreeDS2Service = setoncapturedpointerlistener;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setActivated
    public final void ThreeDS2Service(setId setid) {
        int i = get;
        int i2 = (i & 9) + (i | 9);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent values = this.ThreeDS2Service.values(setid);
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2ServiceInstance;
            String errorMessage = values.getErrorMessage();
            Object[] objArr = new Object[0];
            objArr[0] = setid.getCause();
            interfaceC9652ns.ThreeDS2Service(errorMessage, objArr);
            values(values);
            return;
        }
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent values2 = this.ThreeDS2Service.values(setid);
        this.ThreeDS2ServiceInstance.ThreeDS2Service(values2.getErrorMessage(), setid.getCause());
        values(values2);
    }

    public abstract void values(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent);

    @Override // com.netcetera.threeds.sdk.infrastructure.setActivated
    public final void ThreeDS2Service(Throwable th2) {
        int i = valueOf;
        int i2 = i ^ 81;
        int i3 = ((i & 81) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            if (th2 instanceof setId) {
                ThreeDS2Service((setId) th2);
                int i6 = valueOf;
                get = ((i6 ^ 17) + ((i6 & 17) << 1)) % 128;
            } else {
                ThreeDS2Service(setId.get(setForegroundGravity.get).get(th2.getMessage()).values(th2).valueOf());
                get = (valueOf + 17) % 128;
            }
            int i7 = valueOf;
            int i8 = (i7 & (-36)) | ((~i7) & 35);
            int i9 = -(-((i7 & 35) << 1));
            get = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
            return;
        }
        boolean z = th2 instanceof setId;
        throw null;
    }
}
