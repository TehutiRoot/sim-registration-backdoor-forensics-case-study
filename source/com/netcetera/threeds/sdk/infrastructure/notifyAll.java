package com.netcetera.threeds.sdk.infrastructure;

import androidx.appcompat.app.AppCompatDelegate;

/* loaded from: classes5.dex */
public abstract class notifyAll {
    private static int get = 1;
    private static int values;

    public notifyAll get(final notifyAll notifyall) {
        notifyAll notifyall2 = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.notifyAll.5
            private static int ThreeDS2ServiceInstance = 1;
            private static int values;

            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            public boolean values(C9651nr c9651nr, String str, boolean z) {
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 71;
                boolean z2 = true;
                int i3 = ((i | 71) & (~i2)) + (i2 << 1);
                values = i3 % 128;
                if (i3 % 2 == 0) {
                    if (notifyAll.this.values(c9651nr, str, z) && notifyall.values(c9651nr, str, z)) {
                        int i4 = ThreeDS2ServiceInstance;
                        values = ((i4 & 27) + (i4 | 27)) % 128;
                    } else {
                        int i5 = ThreeDS2ServiceInstance;
                        int i6 = i5 & 83;
                        int i7 = ((i5 ^ 83) | i6) << 1;
                        int i8 = -((i5 | 83) & (~i6));
                        values = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                        z2 = false;
                    }
                    int i9 = values;
                    ThreeDS2ServiceInstance = ((i9 & 79) + (i9 | 79)) % 128;
                    return z2;
                }
                notifyAll.this.values(c9651nr, str, z);
                throw null;
            }
        };
        int i = values;
        int i2 = (-2) - (~(((i | AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) << 1) - (i ^ AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR)));
        get = i2 % 128;
        if (i2 % 2 != 0) {
            return notifyall2;
        }
        throw null;
    }

    public notifyAll valueOf(final notifyAll notifyall) {
        notifyAll notifyall2 = new notifyAll() { // from class: com.netcetera.threeds.sdk.infrastructure.notifyAll.1
            private static int valueOf = 0;
            private static int values = 1;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
                if (r2.values(r5, r6, r7) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
                r5 = com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.valueOf;
                r6 = r5 & 25;
                r5 = (r5 ^ 25) | r6;
                com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values = ((r6 ^ r5) + ((r5 & r6) << 1)) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
                if (r5 != false) goto L13;
             */
            @Override // com.netcetera.threeds.sdk.infrastructure.notifyAll
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean values(com.netcetera.threeds.sdk.infrastructure.C9651nr r5, java.lang.String r6, boolean r7) {
                /*
                    r4 = this;
                    int r0 = com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.valueOf
                    r1 = r0 & (-88)
                    int r2 = ~r0
                    r2 = r2 & 87
                    r1 = r1 | r2
                    r0 = r0 & 87
                    r2 = 1
                    int r0 = r0 << r2
                    int r0 = -r0
                    int r0 = -r0
                    r3 = r1 & r0
                    r0 = r0 | r1
                    int r3 = r3 + r0
                    int r3 = r3 % 128
                    com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values = r3
                    com.netcetera.threeds.sdk.infrastructure.notifyAll r0 = com.netcetera.threeds.sdk.infrastructure.notifyAll.this
                    boolean r0 = r0.values(r5, r6, r7)
                    if (r0 != 0) goto L55
                    int r0 = com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.valueOf
                    r1 = r0 ^ 27
                    r0 = r0 & 27
                    int r0 = r0 << r2
                    int r1 = r1 + r0
                    int r0 = r1 % 128
                    com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values = r0
                    int r1 = r1 % 2
                    r0 = 0
                    if (r1 != 0) goto L3b
                    com.netcetera.threeds.sdk.infrastructure.notifyAll r1 = r2
                    boolean r5 = r1.values(r5, r6, r7)
                    r6 = 33
                    int r6 = r6 / r0
                    if (r5 == 0) goto L44
                    goto L55
                L3b:
                    com.netcetera.threeds.sdk.infrastructure.notifyAll r1 = r2
                    boolean r5 = r1.values(r5, r6, r7)
                    if (r5 == 0) goto L44
                    goto L55
                L44:
                    int r5 = com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.valueOf
                    r6 = r5 & 25
                    r5 = r5 ^ 25
                    r5 = r5 | r6
                    r7 = r6 ^ r5
                    r5 = r5 & r6
                    int r5 = r5 << r2
                    int r7 = r7 + r5
                    int r7 = r7 % 128
                    com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values = r7
                    goto L6c
                L55:
                    int r5 = com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.valueOf
                    r6 = r5 ^ 59
                    r7 = r5 & 59
                    r6 = r6 | r7
                    int r6 = r6 << r2
                    r7 = r5 & (-60)
                    int r5 = ~r5
                    r5 = r5 & 59
                    r5 = r5 | r7
                    int r5 = -r5
                    int r5 = ~r5
                    int r6 = r6 - r5
                    int r6 = r6 - r2
                    int r6 = r6 % 128
                    com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values = r6
                    r0 = 1
                L6c:
                    int r5 = com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.valueOf
                    int r5 = r5 + 122
                    int r6 = ~r5
                    int r5 = r5 << r2
                    int r6 = r6 + r5
                    int r6 = r6 % 128
                    com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values = r6
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notifyAll.C96481.values(com.netcetera.threeds.sdk.infrastructure.nr, java.lang.String, boolean):boolean");
            }
        };
        int i = get;
        int i2 = ((i & 51) - (~(i | 51))) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return notifyall2;
    }

    public abstract boolean values(C9651nr c9651nr, String str, boolean z);
}
