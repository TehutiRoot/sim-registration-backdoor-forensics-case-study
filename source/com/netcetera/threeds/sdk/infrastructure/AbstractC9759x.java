package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.x */
/* loaded from: classes5.dex */
public abstract class AbstractC9759x extends AbstractC9758w<LinearLayout> implements save {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    protected final AbstractC9758w<View> get;
    protected final AbstractC9758w<View> valueOf;

    public AbstractC9759x(Context context, AbstractC9758w abstractC9758w, AbstractC9758w abstractC9758w2) {
        super(context);
        this.get = abstractC9758w;
        this.valueOf = abstractC9758w2;
    }

    public LinearLayout ThreeDS2Service(Context context) {
        ThreeDS2ServiceInstance = (ThreeDS2Service + 43) % 128;
        LinearLayout ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(context);
        LinearLayout values = values(context);
        values.addView(this.get.ThreeDS2Service());
        ThreeDS2ServiceInstance2.addView(values);
        LinearLayout values2 = values(context);
        values2.addView(this.valueOf.ThreeDS2Service());
        ThreeDS2ServiceInstance2.addView(values2);
        int i = ThreeDS2Service;
        int i2 = i ^ 11;
        int i3 = ((i & 11) | i2) << 1;
        int i4 = -i2;
        ThreeDS2ServiceInstance = ((i3 & i4) + (i3 | i4)) % 128;
        return ThreeDS2ServiceInstance2;
    }

    public abstract LinearLayout ThreeDS2ServiceInstance(Context context);

    public abstract LinearLayout values(Context context);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ThreeDS2ServiceInstance(InterfaceC9370eo interfaceC9370eo, save saveVar) {
        int i = ThreeDS2Service;
        int i2 = ((i | 121) << 1) - (i ^ 121);
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        saveVar.valueOf(interfaceC9370eo);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ThreeDS2Service;
        int i5 = i4 ^ 71;
        int i6 = (i4 & 71) << 1;
        ThreeDS2ServiceInstance = ((i5 & i6) + (i6 | i5)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ LinearLayout get(Context context) {
        int i = ThreeDS2Service;
        int i2 = i & 89;
        int i3 = (i ^ 89) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            ThreeDS2Service(context);
            throw null;
        }
        LinearLayout ThreeDS2Service2 = ThreeDS2Service(context);
        int i5 = ThreeDS2Service;
        int i6 = ((i5 & 64) + (i5 | 64)) - 1;
        ThreeDS2ServiceInstance = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
        return ThreeDS2Service2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void valueOf(com.netcetera.threeds.sdk.infrastructure.setAllCaps r4) {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r1 = r0 & 104(0x68, float:1.46E-43)
            r0 = r0 | 104(0x68, float:1.46E-43)
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r1
            com.netcetera.threeds.sdk.infrastructure.w<android.view.View> r0 = r3.get
            r0.valueOf(r4)
            com.netcetera.threeds.sdk.infrastructure.w<android.view.View> r0 = r3.valueOf
            r0.valueOf(r4)
            com.netcetera.threeds.sdk.infrastructure.w<android.view.View> r4 = r3.get
            boolean r4 = r3.get(r4)
            r0 = 0
            if (r4 == 0) goto L21
            goto L3a
        L21:
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance
            r1 = r4 ^ 121(0x79, float:1.7E-43)
            r4 = r4 & 121(0x79, float:1.7E-43)
            int r4 = r4 << 1
            int r1 = r1 + r4
            int r4 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.w<android.view.View> r4 = r3.valueOf
            boolean r4 = r3.get(r4)
            if (r4 == 0) goto L57
        L3a:
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r1 = r4 & 9
            r4 = r4 | 9
            int r1 = r1 + r4
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r1
            r4 = r1 ^ 17
            r1 = r1 & 17
            int r1 = r1 << 1
            r2 = r4 ^ r1
            r4 = r4 & r1
            int r4 = r4 << 1
            int r2 = r2 + r4
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service = r2
            r4 = 0
            goto L66
        L57:
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r1 = r4 & 110(0x6e, float:1.54E-43)
            r4 = r4 | 110(0x6e, float:1.54E-43)
            int r1 = r1 + r4
            int r1 = r1 + (-1)
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r1
            r4 = 8
        L66:
            android.view.View r1 = r3.ThreeDS2Service()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r1 = r4 | 46
            int r1 = r1 << 1
            r4 = r4 ^ 46
            int r1 = r1 - r4
            int r1 = r1 + (-1)
            int r4 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L83
            return
        L83:
            throw r0
        L84:
            com.netcetera.threeds.sdk.infrastructure.w<android.view.View> r4 = r3.valueOf
            r3.get(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.valueOf(com.netcetera.threeds.sdk.infrastructure.setAllCaps):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9373er interfaceC9373er) {
        values(this.get, new C9761z(interfaceC9373er));
        values(this.valueOf, new C9234aa(interfaceC9373er));
        ThreeDS2Service = (ThreeDS2ServiceInstance + 109) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r5 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r5 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service;
        r0 = r5 & 99;
        r5 = -(-(r5 | 99));
        com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = (((r0 | r5) << 1) - (r5 ^ r0)) % 128;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service;
        r0 = (r5 & (-104)) | ((~r5) & 103);
        r5 = (r5 & 103) << 1;
        com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = ((r0 ^ r5) + ((r5 & r0) << 1)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean get(com.netcetera.threeds.sdk.infrastructure.AbstractC9758w<android.view.View> r5) {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            android.view.View r5 = r5.ThreeDS2Service()
            int r5 = r5.getVisibility()
            if (r0 != 0) goto L1c
            r0 = 55
            int r0 = r0 / r1
            if (r5 != 0) goto L31
            goto L1e
        L1c:
            if (r5 != 0) goto L31
        L1e:
            int r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r0 = r5 & 99
            r5 = r5 | 99
            int r5 = -r5
            int r5 = -r5
            r1 = r0 | r5
            int r1 = r1 << r2
            r5 = r5 ^ r0
            int r1 = r1 - r5
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r1
            r1 = 1
            goto L45
        L31:
            int r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r0 = r5 & (-104(0xffffffffffffff98, float:NaN))
            int r3 = ~r5
            r3 = r3 & 103(0x67, float:1.44E-43)
            r0 = r0 | r3
            r5 = r5 & 103(0x67, float:1.44E-43)
            int r5 = r5 << r2
            r3 = r0 ^ r5
            r5 = r5 & r0
            int r5 = r5 << r2
            int r3 = r3 + r5
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r3
        L45:
            int r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2Service
            r0 = r5 & 17
            r5 = r5 | 17
            int r5 = -r5
            int r5 = -r5
            r3 = r0 ^ r5
            r5 = r5 & r0
            int r5 = r5 << r2
            int r3 = r3 + r5
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.ThreeDS2ServiceInstance = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9759x.get(com.netcetera.threeds.sdk.infrastructure.w):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void values(InterfaceC9373er interfaceC9373er, save saveVar) {
        int i = ThreeDS2Service;
        int i2 = i & 79;
        int i3 = (i ^ 79) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        saveVar.values(interfaceC9373er);
        if (i5 != 0) {
            int i6 = 6 / 0;
        }
    }

    private void values(AbstractC9758w<View> abstractC9758w, InterfaceC9625nn<save> interfaceC9625nn) {
        int i = (ThreeDS2ServiceInstance + 35) % 128;
        ThreeDS2Service = i;
        if (abstractC9758w instanceof save) {
            int i2 = (i & 67) + (i | 67);
            ThreeDS2ServiceInstance = i2 % 128;
            int i3 = i2 % 2;
            interfaceC9625nn.values((save) abstractC9758w);
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            int i5 = ThreeDS2Service;
            int i6 = i5 | 91;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 91)) & i6);
            ThreeDS2ServiceInstance = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        }
        int i9 = ThreeDS2Service;
        int i10 = i9 & 67;
        int i11 = (i9 ^ 67) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        ThreeDS2ServiceInstance = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ThreeDS2Service(InterfaceC9370eo interfaceC9370eo, save saveVar) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 7;
        int i3 = (i | 7) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        saveVar.valueOf(interfaceC9370eo);
        if (i6 == 0) {
            throw null;
        }
        int i7 = ThreeDS2ServiceInstance;
        int i8 = ((i7 | 29) << 1) - (i7 ^ 29);
        ThreeDS2Service = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        values(this.get, new C9757v(interfaceC9370eo));
        values(this.valueOf, new C9236ac(interfaceC9370eo));
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 59;
        int i3 = (i | 59) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ThreeDS2Service(InterfaceC9373er interfaceC9373er, save saveVar) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 113;
        int i3 = ((i | 113) & (~i2)) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2;
        saveVar.values(interfaceC9373er);
        if (i4 == 0) {
            int i5 = 81 / 0;
        }
        int i6 = ThreeDS2ServiceInstance;
        ThreeDS2Service = (((i6 | 61) << 1) - (i6 ^ 61)) % 128;
    }
}
