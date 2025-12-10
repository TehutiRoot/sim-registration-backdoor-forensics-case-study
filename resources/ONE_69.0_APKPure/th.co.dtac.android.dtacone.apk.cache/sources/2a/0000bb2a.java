package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bi */
/* loaded from: classes5.dex */
public class C9262bi implements isEmpty {
    private static int ThreeDS2Service = 1;
    private static int valueOf;
    private final String get;

    public C9262bi(String str) {
        this.get = str;
    }

    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = i ^ 101;
        int i3 = -(-((i & 101) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        valueOf = i5;
        if (i4 % 2 == 0) {
            String str = this.get;
            int i6 = i5 + 95;
            ThreeDS2Service = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }
}