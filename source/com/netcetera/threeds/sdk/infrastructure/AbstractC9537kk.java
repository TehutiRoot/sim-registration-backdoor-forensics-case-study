package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.kk */
/* loaded from: classes5.dex */
public abstract class AbstractC9537kk {
    private static int ThreeDS2Service = 1;
    private static int values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.kk$5 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C95385 {
        static final /* synthetic */ int[] ThreeDS2Service;
        private static int ThreeDS2ServiceInstance = 1;
        private static int values;

        static {
            int[] iArr = new int[UiCustomization.UiCustomizationType.valuesCustom().length];
            ThreeDS2Service = iArr;
            try {
                iArr[UiCustomization.UiCustomizationType.DARK.ordinal()] = 1;
                int i = ThreeDS2ServiceInstance;
                int i2 = i | 91;
                int i3 = i2 << 1;
                int i4 = -((~(i & 91)) & i2);
                values = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2Service[UiCustomization.UiCustomizationType.DEFAULT.ordinal()] = 2;
                int i5 = values;
                int i6 = i5 | 5;
                int i7 = i6 << 1;
                int i8 = -((~(i5 & 5)) & i6);
                ThreeDS2ServiceInstance = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ThreeDS2Service[UiCustomization.UiCustomizationType.MONOCHROME.ordinal()] = 3;
                int i9 = ThreeDS2ServiceInstance;
                values = ((-2) - (~((i9 ^ 22) + ((i9 & 22) << 1)))) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i10 = values;
            int i11 = (((i10 | 28) << 1) - (i10 ^ 28)) - 1;
            ThreeDS2ServiceInstance = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            throw null;
        }
    }

    public abstract InterfaceC9515js valueOf(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.C9527kc.valueOf();
        r1 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.ThreeDS2Service;
        r2 = ((r1 ^ 117) | (r1 & 117)) << 1;
        r1 = -(((~r1) & 117) | (r1 & (-118)));
        com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values = ((r2 & r1) + (r1 | r2)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.C95385.ThreeDS2Service[r6.ordinal()] != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.C95385.ThreeDS2Service[r6.ordinal()] != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.C9529ke.valueOf();
        com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.ThreeDS2Service = (com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values + 49) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js values(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization r5, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization.UiCustomizationType r6) {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.ThreeDS2Service
            r1 = r0 & 39
            r0 = r0 ^ 39
            r0 = r0 | r1
            r2 = r1 & r0
            r0 = r0 | r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values = r0
            int r2 = r2 % 2
            r0 = 1
            if (r2 == 0) goto L23
            int[] r1 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.C95385.ThreeDS2Service
            int r6 = r6.ordinal()
            r6 = r1[r6]
            r1 = 13
            int r1 = r1 / 0
            if (r6 == r0) goto L3a
            goto L2d
        L23:
            int[] r1 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.C95385.ThreeDS2Service
            int r6 = r6.ordinal()
            r6 = r1[r6]
            if (r6 == r0) goto L3a
        L2d:
            com.netcetera.threeds.sdk.infrastructure.js r6 = com.netcetera.threeds.sdk.infrastructure.C9529ke.valueOf()
            int r1 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values
            int r1 = r1 + 49
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.ThreeDS2Service = r1
            goto L55
        L3a:
            com.netcetera.threeds.sdk.infrastructure.js r6 = com.netcetera.threeds.sdk.infrastructure.C9527kc.valueOf()
            int r1 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.ThreeDS2Service
            r2 = r1 ^ 117(0x75, float:1.64E-43)
            r3 = r1 & 117(0x75, float:1.64E-43)
            r2 = r2 | r3
            int r2 = r2 << r0
            r3 = r1 & (-118(0xffffffffffffff8a, float:NaN))
            int r1 = ~r1
            r1 = r1 & 117(0x75, float:1.64E-43)
            r1 = r1 | r3
            int r1 = -r1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values = r3
        L55:
            com.netcetera.threeds.sdk.infrastructure.js r5 = r4.valueOf(r5)
            com.netcetera.threeds.sdk.infrastructure.lq r1 = new com.netcetera.threeds.sdk.infrastructure.lq
            r1.<init>(r5, r6)
            int r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.ThreeDS2Service
            r6 = r5 ^ 123(0x7b, float:1.72E-43)
            r5 = r5 & 123(0x7b, float:1.72E-43)
            int r5 = r5 << r0
            r2 = r6 ^ r5
            r5 = r5 & r6
            int r5 = r5 << r0
            int r2 = r2 + r5
            int r5 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values = r5
            int r2 = r2 % 2
            if (r2 == 0) goto L76
            r5 = 8
            int r5 = r5 / 0
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9537kk.values(com.netcetera.threeds.sdk.api.ui.logic.UiCustomization, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization$UiCustomizationType):com.netcetera.threeds.sdk.infrastructure.js");
    }
}
