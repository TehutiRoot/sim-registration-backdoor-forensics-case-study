package com.netcetera.threeds.sdk.infrastructure;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class setOverscrollHeader {
    private static int cleanup = 1;
    private static int initialize;
    private final String ThreeDS2Service;
    private final List<setOverscrollFooter> ThreeDS2ServiceInstance;
    private final setFooterDividersEnabled get;
    private final Boolean valueOf;
    private final int values;

    public setOverscrollHeader(List<setOverscrollFooter> list, setFooterDividersEnabled setfooterdividersenabled, String str, int i, Boolean bool) {
        this.ThreeDS2ServiceInstance = list;
        this.get = setfooterdividersenabled;
        this.ThreeDS2Service = str;
        this.values = i;
        this.valueOf = bool;
    }

    public static setOverscrollHeader getSDKVersion() {
        setOverscrollHeader setoverscrollheader = new setOverscrollHeader(Collections.emptyList(), setFooterDividersEnabled.ThreeDS2Service(), "", 0, Boolean.TRUE);
        int i = cleanup;
        initialize = (((i ^ 100) + ((i & 100) << 1)) - 1) % 128;
        return setoverscrollheader;
    }

    public String ThreeDS2Service() {
        int i = initialize;
        int i2 = ~i;
        int i3 = (i & (-40)) | (i2 & 39);
        int i4 = -(-((i & 39) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        cleanup = i5 % 128;
        if (i5 % 2 != 0) {
            String str = this.ThreeDS2Service;
            int i6 = (i2 & 101) | (i & (-102));
            int i7 = -(-((i & 101) << 1));
            cleanup = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            return str;
        }
        throw null;
    }

    public List<setOverscrollFooter> ThreeDS2ServiceInstance() {
        int i = initialize;
        int i2 = (i & 81) + (i | 81);
        int i3 = i2 % 128;
        cleanup = i3;
        if (i2 % 2 != 0) {
            List<setOverscrollFooter> list = this.ThreeDS2ServiceInstance;
            int i4 = i3 & 23;
            int i5 = ((((i3 ^ 23) | i4) << 1) - (~(-((i3 | 23) & (~i4))))) - 1;
            initialize = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }
        throw null;
    }

    public Boolean get() {
        int i = initialize;
        int i2 = i & 75;
        int i3 = (i ^ 75) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        cleanup = i5;
        if (i4 % 2 != 0) {
            Boolean bool = this.valueOf;
            int i6 = i5 + 75;
            initialize = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 59 / 0;
            }
            return bool;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r4.get.valueOf()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        r1 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup;
        r3 = (((r1 | 54) << 1) - (r1 ^ 54)) - 1;
        com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        if ((r3 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        r3 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r4.ThreeDS2Service) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r4.ThreeDS2Service) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup;
        r3 = r0 & 19;
        r1 = ((r0 ^ 19) | r3) << 1;
        r0 = -((r0 | 19) & (~r3));
        com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = ((r1 & r0) + (r0 | r1)) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        r1 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup;
        com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = ((r1 & 63) + (r1 | 63)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r4.ThreeDS2ServiceInstance.isEmpty() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r4.ThreeDS2ServiceInstance.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean getWarnings() {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup
            r1 = r0 | 21
            int r2 = r1 << 1
            r0 = r0 & 21
            int r0 = ~r0
            r0 = r0 & r1
            int r0 = -r0
            r1 = r2 ^ r0
            r0 = r0 & r2
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 == 0) goto L26
            java.util.List<com.netcetera.threeds.sdk.infrastructure.setOverscrollFooter> r1 = r4.ThreeDS2ServiceInstance
            boolean r1 = r1.isEmpty()
            r3 = 72
            int r3 = r3 / r0
            if (r1 == 0) goto L77
            goto L2e
        L26:
            java.util.List<com.netcetera.threeds.sdk.infrastructure.setOverscrollFooter> r1 = r4.ThreeDS2ServiceInstance
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L77
        L2e:
            com.netcetera.threeds.sdk.infrastructure.setFooterDividersEnabled r1 = r4.get
            java.lang.String r1 = r1.valueOf()
            boolean r1 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r1)
            if (r1 == 0) goto L77
            int r1 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup
            r3 = r1 | 54
            int r3 = r3 << r2
            r1 = r1 ^ 54
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = r1
            int r3 = r3 % 2
            if (r3 == 0) goto L57
            java.lang.String r1 = r4.ThreeDS2Service
            boolean r1 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r1)
            r3 = 43
            int r3 = r3 / r0
            if (r1 == 0) goto L77
            goto L60
        L57:
            java.lang.String r1 = r4.ThreeDS2Service
            boolean r1 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r1)
            if (r1 == r2) goto L60
            goto L77
        L60:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup
            r1 = r0 ^ 19
            r3 = r0 & 19
            r1 = r1 | r3
            int r1 = r1 << r2
            int r3 = ~r3
            r0 = r0 | 19
            r0 = r0 & r3
            int r0 = -r0
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = r3
            r0 = 1
            goto L82
        L77:
            int r1 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup
            r3 = r1 & 63
            r1 = r1 | 63
            int r3 = r3 + r1
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = r3
        L82:
            int r1 = com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.cleanup
            r3 = r1 & 41
            r1 = r1 | 41
            int r1 = ~r1
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.initialize = r1
            int r3 = r3 % 2
            if (r3 != 0) goto L94
            return r0
        L94:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader.getWarnings():boolean");
    }

    public setFooterDividersEnabled valueOf() {
        int i = cleanup;
        int i2 = ((i ^ 63) | (i & 63)) << 1;
        int i3 = -(((~i) & 63) | (i & (-64)));
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        initialize = i5;
        if (i4 % 2 == 0) {
            setFooterDividersEnabled setfooterdividersenabled = this.get;
            int i6 = (((i5 & (-8)) | ((~i5) & 7)) - (~((i5 & 7) << 1))) - 1;
            cleanup = i6 % 128;
            if (i6 % 2 != 0) {
                return setfooterdividersenabled;
            }
            throw null;
        }
        throw null;
    }

    public int values() {
        int i = cleanup;
        int i2 = ((i ^ 101) + ((i & 101) << 1)) % 128;
        initialize = i2;
        int i3 = this.values;
        cleanup = ((i2 & 61) + (i2 | 61)) % 128;
        return i3;
    }
}
