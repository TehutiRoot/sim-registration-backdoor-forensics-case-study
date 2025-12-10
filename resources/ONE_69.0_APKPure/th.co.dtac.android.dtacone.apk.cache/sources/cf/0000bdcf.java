package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setAnimation implements setActivated {
    private static int get = 0;
    private static int valueOf = 1;
    private final setPaddingRelative ThreeDS2ServiceInstance;
    private final InterfaceC9641ns values = C9642nt.ThreeDS2ServiceInstance(setAnimation.class);

    public setAnimation(setPaddingRelative setpaddingrelative) {
        this.ThreeDS2ServiceInstance = setpaddingrelative;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setActivated
    public void ThreeDS2Service(setId setid) {
        int i = valueOf;
        int i2 = i | 81;
        int i3 = i2 << 1;
        int i4 = -((~(i & 81)) & i2);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            String str = this.ThreeDS2ServiceInstance.get(setid);
            InterfaceC9641ns interfaceC9641ns = this.values;
            Object[] objArr = new Object[0];
            objArr[0] = setid.getCause();
            interfaceC9641ns.ThreeDS2Service(str, objArr);
        } else {
            this.values.ThreeDS2Service(this.ThreeDS2ServiceInstance.get(setid), setid.getCause());
        }
        int i6 = get;
        int i7 = i6 & 17;
        int i8 = (i7 - (~((i6 ^ 17) | i7))) - 1;
        valueOf = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setActivated
    public void ThreeDS2Service(Throwable th2) {
        int i = valueOf;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        get = i2 % 128;
        if (i2 % 2 == 0) {
            if (!(th2 instanceof setId)) {
                ThreeDS2Service(setForegroundGravity.get.valueOf(th2));
                int i3 = valueOf;
                int i4 = ((i3 | 38) << 1) - (i3 ^ 38);
                get = ((~i4) + (i4 << 1)) % 128;
            } else {
                int i5 = i & 99;
                int i6 = (i | 99) & (~i5);
                int i7 = -(-(i5 << 1));
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                get = i8 % 128;
                if (i8 % 2 == 0) {
                    ThreeDS2Service((setId) th2);
                } else {
                    ThreeDS2Service((setId) th2);
                    throw null;
                }
            }
            int i9 = valueOf;
            int i10 = i9 & 121;
            int i11 = (i9 | 121) & (~i10);
            int i12 = i10 << 1;
            get = ((i11 & i12) + (i11 | i12)) % 128;
            return;
        }
        boolean z = th2 instanceof setId;
        throw null;
    }
}