package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.webkit.WebViewClient;
import com.netcetera.threeds.sdk.infrastructure.C9256au;
import com.netcetera.threeds.sdk.infrastructure.C9309co;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ba */
/* loaded from: classes5.dex */
public final class C9263ba extends AbstractC9260ay implements containsValue {
    private static int ConfigParameters = 1;
    private static int onError;
    private C9273bi createTransaction;
    private boolean getWarnings;
    private final setLinksClickable initialize;

    public C9263ba(Context context, C9250ap c9250ap, setLinksClickable setlinksclickable) {
        super(context, c9250ap);
        this.getWarnings = false;
        this.createTransaction = new C9273bi("");
        this.initialize = setlinksclickable;
    }

    public static /* synthetic */ C9309co.get ThreeDS2Service(C9263ba c9263ba) {
        int i = ConfigParameters;
        int i2 = i | 43;
        int i3 = ((i2 << 1) - (~(-((~(i & 43)) & i2)))) - 1;
        onError = i3 % 128;
        int i4 = i3 % 2;
        C9309co.get sDKInfo = c9263ba.getSDKInfo();
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = ConfigParameters;
        int i7 = i6 & 51;
        int i8 = (i6 ^ 51) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        onError = i9 % 128;
        if (i9 % 2 == 0) {
            return sDKInfo;
        }
        throw null;
    }

    public static /* synthetic */ C9273bi ThreeDS2ServiceInstance(C9263ba c9263ba, C9273bi c9273bi) {
        int i = onError;
        int i2 = i + 14;
        ConfigParameters = ((~i2) + (i2 << 1)) % 128;
        c9263ba.createTransaction = c9273bi;
        int i3 = i ^ 53;
        int i4 = ((i & 53) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        ConfigParameters = i6 % 128;
        if (i6 % 2 != 0) {
            return c9273bi;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        r1 = (com.netcetera.threeds.sdk.infrastructure.C9309co.get) r1;
        r2 = r0 & 73;
        r0 = (r0 ^ 73) | r2;
        com.netcetera.threeds.sdk.infrastructure.C9263ba.ConfigParameters = ((r2 & r0) + (r0 | r2)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        r1 = (com.netcetera.threeds.sdk.infrastructure.C9309co.get) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        throw com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.getDeviceData.valueOf(new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if ((!(r1 instanceof com.netcetera.threeds.sdk.infrastructure.C9309co.get)) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
        if ((r1 instanceof com.netcetera.threeds.sdk.infrastructure.C9309co.get) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9263ba.onError;
        r3 = r0 & 63;
        r4 = -(-((r0 ^ 63) | r3));
        r5 = (r3 ^ r4) + ((r3 & r4) << 1);
        com.netcetera.threeds.sdk.infrastructure.C9263ba.ConfigParameters = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.netcetera.threeds.sdk.infrastructure.C9309co.get getSDKInfo() {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9263ba.onError
            r1 = r0 ^ 27
            r2 = r0 & 27
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & (-28)
            int r0 = ~r0
            r0 = r0 & 27
            r0 = r0 | r3
            int r0 = -r0
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9263ba.ConfigParameters = r0
            int r3 = r3 % 2
            r0 = 0
            if (r3 != 0) goto L2a
            com.netcetera.threeds.sdk.infrastructure.forEach r1 = r6.ThreeDS2ServiceInstance()
            boolean r3 = r1 instanceof com.netcetera.threeds.sdk.infrastructure.C9309co.get
            r4 = 13
            int r4 = r4 / r0
            r3 = r3 ^ r2
            if (r3 == r2) goto L5d
            goto L32
        L2a:
            com.netcetera.threeds.sdk.infrastructure.forEach r1 = r6.ThreeDS2ServiceInstance()
            boolean r3 = r1 instanceof com.netcetera.threeds.sdk.infrastructure.C9309co.get
            if (r3 == 0) goto L5d
        L32:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9263ba.onError
            r3 = r0 & 63
            r4 = r0 ^ 63
            r4 = r4 | r3
            int r4 = -r4
            int r4 = -r4
            r5 = r3 ^ r4
            r3 = r3 & r4
            int r2 = r3 << 1
            int r5 = r5 + r2
            int r2 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.C9263ba.ConfigParameters = r2
            int r5 = r5 % 2
            if (r5 == 0) goto L59
            com.netcetera.threeds.sdk.infrastructure.co$get r1 = (com.netcetera.threeds.sdk.infrastructure.C9309co.get) r1
            r2 = r0 & 73
            r0 = r0 ^ 73
            r0 = r0 | r2
            r3 = r2 & r0
            r0 = r0 | r2
            int r3 = r3 + r0
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9263ba.ConfigParameters = r3
            return r1
        L59:
            com.netcetera.threeds.sdk.infrastructure.co$get r1 = (com.netcetera.threeds.sdk.infrastructure.C9309co.get) r1
            r0 = 0
            throw r0
        L5d:
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r1 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.getDeviceData
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.netcetera.threeds.sdk.infrastructure.setId r0 = r1.valueOf(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9263ba.getSDKInfo():com.netcetera.threeds.sdk.infrastructure.co$get");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void valueOf() {
        int i = onError;
        int i2 = i & 85;
        ConfigParameters = ((((i | 85) & (~i2)) - (~(i2 << 1))) - 1) % 128;
        this.getWarnings = true;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void values(getServices getservices) {
        int i = onError;
        int i2 = i & 99;
        int i3 = i | 99;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        ConfigParameters = i4 % 128;
        if (i4 % 2 != 0) {
            if (this.getWarnings) {
                int i5 = i + 11;
                ConfigParameters = i5 % 128;
                if (i5 % 2 != 0) {
                    getSDKInfo().valueOf(this.createTransaction);
                    int i6 = ConfigParameters;
                    int i7 = (i6 | 119) << 1;
                    int i8 = -(i6 ^ 119);
                    onError = ((i7 & i8) + (i8 | i7)) % 128;
                } else {
                    getSDKInfo().valueOf(this.createTransaction);
                    throw null;
                }
            }
            int i9 = onError;
            int i10 = i9 & 97;
            int i11 = (i9 ^ 97) | i10;
            ConfigParameters = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
            return;
        }
        throw null;
    }

    public static C9263ba ThreeDS2Service(Context context, setLinksClickable setlinksclickable) {
        C9263ba c9263ba = new C9263ba(context, new C9250ap(), setlinksclickable);
        int i = onError;
        int i2 = i | 85;
        int i3 = ((i2 << 1) - (~(-((~(i & 85)) & i2)))) - 1;
        ConfigParameters = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return c9263ba;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9260ay
    public WebViewClient ThreeDS2ServiceInstance(Context context) {
        C9256au ThreeDS2ServiceInstance = C9256au.ThreeDS2ServiceInstance(context, this.initialize, new C9256au.valueOf() { // from class: com.netcetera.threeds.sdk.infrastructure.ba.4
            private static int ThreeDS2ServiceInstance = 0;
            private static int get = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.C9256au.valueOf
            public void ThreeDS2Service(String str) {
                C9263ba.ThreeDS2ServiceInstance(C9263ba.this, new C9273bi(str));
                int i = get + 48;
                int i2 = (~i) + (i << 1);
                ThreeDS2ServiceInstance = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.C9256au.valueOf
            public void valueOf(String str) {
                C9263ba.ThreeDS2Service(C9263ba.this).ThreeDS2Service(new C9273bi(str));
                int i = get;
                int i2 = i & 121;
                int i3 = (((i ^ 121) | i2) << 1) - ((i | 121) & (~i2));
                ThreeDS2ServiceInstance = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9760y.values
            public void values(String str) {
                C9263ba.ThreeDS2Service(C9263ba.this).ThreeDS2ServiceInstance(new C9273bi(str));
                int i = ThreeDS2ServiceInstance;
                int i2 = i ^ 43;
                int i3 = -(-((i & 43) << 1));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                get = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
            }
        });
        int i = onError;
        ConfigParameters = ((((i & (-86)) | ((~i) & 85)) - (~(-(-((i & 85) << 1))))) - 1) % 128;
        return ThreeDS2ServiceInstance;
    }
}
