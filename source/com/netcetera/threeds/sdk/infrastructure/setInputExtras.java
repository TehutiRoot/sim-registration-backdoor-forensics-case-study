package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTextKeepState;

/* loaded from: classes5.dex */
public class setInputExtras implements setTextKeepState {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final int valueOf;
    private final C9619nh values;

    public setInputExtras(C9619nh c9619nh, int i) {
        this.values = c9619nh;
        this.valueOf = i;
    }

    public static /* synthetic */ String valueOf(setInputExtras setinputextras, String str) {
        int i = get;
        ThreeDS2ServiceInstance = ((((i | 33) << 1) - (~(-(((~i) & 33) | (i & (-34)))))) - 1) % 128;
        String ThreeDS2Service = setinputextras.ThreeDS2Service(str);
        int i2 = ThreeDS2ServiceInstance;
        int i3 = (i2 & (-80)) | ((~i2) & 79);
        int i4 = (i2 & 79) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    public static /* synthetic */ String values(setInputExtras setinputextras, setTitleMargin settitlemargin) {
        int i = get;
        int i2 = i & 41;
        int i3 = ((i ^ 41) | i2) << 1;
        int i4 = -((i | 41) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        ThreeDS2ServiceInstance = i5 % 128;
        int i6 = i5 % 2;
        String values = setinputextras.values(settitlemargin);
        if (i6 != 0) {
            int i7 = 31 / 0;
        }
        return values;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTextKeepState
    public setTextKeepState.get ThreeDS2Service(final setTitleMargin settitlemargin) {
        setTextKeepState.get getVar = new setTextKeepState.get() { // from class: com.netcetera.threeds.sdk.infrastructure.setInputExtras.4
            private static int ThreeDS2ServiceInstance = 0;
            private static int get = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.setTextKeepState.get
            public String ThreeDS2ServiceInstance() {
                int i = get;
                int i2 = ((i ^ 59) - (~(-(-((i & 59) << 1))))) - 1;
                ThreeDS2ServiceInstance = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 68 / 0;
                    return null;
                }
                return null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.setTextKeepState.get
            public String valueOf() {
                int i = ThreeDS2ServiceInstance;
                int i2 = i ^ 119;
                int i3 = -(-((i & 119) << 1));
                get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                String valueOf = setInputExtras.valueOf(setInputExtras.this, setInputExtras.values(setInputExtras.this, settitlemargin));
                int i4 = get;
                ThreeDS2ServiceInstance = (((i4 & 30) + (i4 | 30)) - 1) % 128;
                return valueOf;
            }
        };
        int i = get;
        ThreeDS2ServiceInstance = (((i & 1) - (~(i | 1))) - 1) % 128;
        return getVar;
    }

    private String ThreeDS2Service(String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 41;
        int i3 = (i | 41) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            if (C9669om.ThreeDS2ServiceInstance(str)) {
                str = this.values.ThreeDS2Service(str);
                get = (ThreeDS2ServiceInstance + 125) % 128;
            }
            int i6 = ThreeDS2ServiceInstance + 117;
            get = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }
        C9669om.ThreeDS2ServiceInstance(str);
        throw null;
    }

    public static setTextKeepState values() {
        setInputExtras setinputextras = new setInputExtras(new C9619nh(), C9624nm.get());
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 59;
        int i3 = (i & 59) << 1;
        get = ((i2 & i3) + (i3 | i2)) % 128;
        return setinputextras;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r6.valueOf() == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        r6 = r6.valueOf();
        r0 = new java.util.LinkedHashMap();
        r0.put(480, r6.ThreeDS2ServiceInstance());
        r0.put(java.lang.Integer.valueOf((int) com.feitian.readerdk.Tool.C6150DK.ERROR_RECEIVE_LRC), r6.values());
        r0.put(java.lang.Integer.valueOf((int) ch.qos.logback.core.net.SyslogConstants.LOG_LOCAL4), r6.ThreeDS2Service());
        r6 = r0.entrySet().iterator();
        r0 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = ((r0 & 3) + (r0 | 3)) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
        if (r6.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
        r2 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        r3 = r2 & 39;
        r2 = -(-((r2 ^ 39) | r3));
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
        if ((r4 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
        r2 = (java.util.Map.Entry) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance;
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.get = (((r0 & 72) + (r0 | 72)) - 1) % 128;
        r0 = (java.lang.String) r2.getValue();
        r2 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance;
        r3 = (r2 & 58) + (r2 | 58);
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.get = ((r3 ^ (-1)) + (r3 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
        if (((java.lang.Integer) r2.getKey()).intValue() < r5.valueOf) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
        r3 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance;
        r4 = ((r3 ^ 119) - (~(-(-((r3 & 119) << 1))))) - 1;
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.get = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
        if ((r4 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
        r4 = 53 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
        if (r2.getValue() == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
        if (r2.getValue() == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = (((r0 | 89) << 1) - (r0 ^ 89)) % 128;
        r0 = (java.lang.String) r2.getValue();
        r2 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        r3 = r2 & 43;
        r2 = -(-((r2 ^ 43) | r3));
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = (((r3 | r2) << 1) - (r2 ^ r3)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
        if (r5.valueOf <= ((java.lang.Integer) r2.getKey()).intValue()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = ((((r6 ^ 59) | (r6 & 59)) << 1) - (((~r6) & 59) | (r6 & (-60)))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0140, code lost:
        r2 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        r3 = r2 & 37;
        r2 = (r2 | 37) & (~r3);
        r3 = r3 << 1;
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = ((r2 & r3) + (r2 | r3)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0154, code lost:
        r6 = (java.util.Map.Entry) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015b, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.setInputExtras.get;
        r2 = (r6 & 1) + (r6 | 1);
        com.netcetera.threeds.sdk.infrastructure.setInputExtras.ThreeDS2ServiceInstance = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0168, code lost:
        if ((r2 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r6.valueOf() == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String values(com.netcetera.threeds.sdk.infrastructure.setTitleMargin r6) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setInputExtras.values(com.netcetera.threeds.sdk.infrastructure.setTitleMargin):java.lang.String");
    }
}
