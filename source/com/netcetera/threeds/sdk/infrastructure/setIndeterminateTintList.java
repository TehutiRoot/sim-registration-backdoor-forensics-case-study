package com.netcetera.threeds.sdk.infrastructure;

import java.util.Date;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setIndeterminateTintList implements setDividerHeight {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final setBaselineAligned ThreeDS2ServiceInstance;
    private final setDividerHeight valueOf;
    private final setDividerHeight values;

    public setIndeterminateTintList(setBaselineAligned setbaselinealigned, setDividerHeight setdividerheight, setDividerHeight setdividerheight2) {
        this.ThreeDS2ServiceInstance = setbaselinealigned;
        this.values = setdividerheight;
        this.valueOf = setdividerheight2;
    }

    private boolean ThreeDS2Service(Long l) {
        int i = ThreeDS2Service + 59;
        get = i % 128;
        if (i % 2 == 0) {
            if (Objects.equals(l, C9670on.ThreeDS2Service)) {
                int i2 = ThreeDS2Service;
                int i3 = (i2 & 66) + (i2 | 66);
                int i4 = ((~i3) + (i3 << 1)) % 128;
                get = i4;
                int i5 = ((i4 | 44) << 1) - (i4 ^ 44);
                int i6 = (~i5) + (i5 << 1);
                ThreeDS2Service = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 39 / 0;
                }
                return true;
            }
            boolean after = new Date().after(new Date(l.longValue() + 2592000000L));
            int i8 = ThreeDS2Service;
            get = ((i8 & 27) + (i8 | 27)) % 128;
            return after;
        }
        Objects.equals(l, C9670on.ThreeDS2Service);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean get(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.get
            r1 = r0 | 25
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 25
            int r0 = -r0
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.ThreeDS2Service = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L86
            com.netcetera.threeds.sdk.infrastructure.setBaselineAligned r0 = r5.ThreeDS2ServiceInstance
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader r0 = r0.valueOf(r6)
            com.netcetera.threeds.sdk.infrastructure.setFooterDividersEnabled r1 = r0.valueOf()
            com.netcetera.threeds.sdk.infrastructure.setBaselineAligned r3 = r5.ThreeDS2ServiceInstance
            java.lang.Long r6 = r3.get(r6)
            boolean r0 = r0.getWarnings()
            r3 = 0
            if (r0 != 0) goto L5c
            java.lang.Boolean r0 = r1.get()
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto L37
            goto L5c
        L37:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.get
            r1 = r0 ^ 103(0x67, float:1.44E-43)
            r4 = r0 & 103(0x67, float:1.44E-43)
            r1 = r1 | r4
            int r1 = r1 << r2
            int r4 = ~r4
            r0 = r0 | 103(0x67, float:1.44E-43)
            r0 = r0 & r4
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.ThreeDS2Service = r1
            boolean r6 = r5.ThreeDS2Service(r6)
            if (r6 == 0) goto L52
            goto L5c
        L52:
            int r6 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.get
            int r6 = r6 + 103
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.ThreeDS2Service = r6
            r6 = 0
            goto L74
        L5c:
            int r6 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.ThreeDS2Service
            r0 = r6 ^ 27
            r1 = r6 & 27
            r0 = r0 | r1
            int r0 = r0 << r2
            r1 = r6 & (-28)
            int r6 = ~r6
            r6 = r6 & 27
            r6 = r6 | r1
            int r6 = -r6
            r1 = r0 & r6
            r6 = r6 | r0
            int r1 = r1 + r6
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.get = r1
            r6 = 1
        L74:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.ThreeDS2Service
            r1 = r0 | 57
            int r1 = r1 << r2
            r0 = r0 ^ 57
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.get = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L85
            int r2 = r2 / r3
        L85:
            return r6
        L86:
            com.netcetera.threeds.sdk.infrastructure.setBaselineAligned r0 = r5.ThreeDS2ServiceInstance
            com.netcetera.threeds.sdk.infrastructure.setOverscrollHeader r0 = r0.valueOf(r6)
            r0.valueOf()
            com.netcetera.threeds.sdk.infrastructure.setBaselineAligned r1 = r5.ThreeDS2ServiceInstance
            r1.get(r6)
            r0.getWarnings()
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintList.get(java.lang.String):boolean");
    }

    private boolean valueOf(String str) {
        int i = get;
        int i2 = i ^ 49;
        int i3 = -(-((i & 49) << 1));
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        setOverscrollHeader valueOf = this.ThreeDS2ServiceInstance.valueOf(str);
        Long l = this.ThreeDS2ServiceInstance.get(str);
        if (Objects.equals(l, C9670on.ThreeDS2Service)) {
            int i4 = get;
            int i5 = i4 & 61;
            int i6 = (i5 + ((i4 ^ 61) | i5)) % 128;
            ThreeDS2Service = i6;
            get = (((i6 & (-52)) | ((~i6) & 51)) + ((i6 & 51) << 1)) % 128;
            return true;
        }
        boolean after = new Date().after(new Date(l.longValue() + (valueOf.values() * 86400000)));
        int i7 = get;
        int i8 = i7 | 89;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 89)) & i8);
        ThreeDS2Service = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
        return after;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDividerHeight
    public void values(setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        int i = get;
        int i2 = i & 77;
        int i3 = ((i ^ 77) | i2) << 1;
        int i4 = -((i | 77) & (~i2));
        ThreeDS2Service = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        if (get(str)) {
            get = (ThreeDS2Service + 117) % 128;
            this.values.values(setscrollingcacheenabled, str);
            int i5 = ThreeDS2Service;
            int i6 = i5 & 105;
            int i7 = ((i5 ^ 105) | i6) << 1;
            int i8 = -((i5 | 105) & (~i6));
            get = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        } else if (valueOf(str)) {
            int i9 = get;
            int i10 = i9 ^ 101;
            int i11 = ((i9 & 101) | i10) << 1;
            int i12 = -i10;
            ThreeDS2Service = (((i11 | i12) << 1) - (i11 ^ i12)) % 128;
            this.valueOf.values(setscrollingcacheenabled, str);
            int i13 = ThreeDS2Service;
            int i14 = i13 & 37;
            int i15 = -(-((i13 ^ 37) | i14));
            get = ((i14 & i15) + (i15 | i14)) % 128;
        }
        int i16 = ThreeDS2Service;
        int i17 = (i16 & 75) + (i16 | 75);
        get = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        throw null;
    }
}
