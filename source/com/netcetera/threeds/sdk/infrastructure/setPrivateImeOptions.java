package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setPrivateImeOptions implements setFreezesText, setSearchResultHighlights {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getSDKVersion = 1;
    private final setFilters ThreeDS2Service;
    private final setTextKeepState get;
    private final setFilters valueOf;
    private final setHint values;

    public setPrivateImeOptions(setHint sethint, setTextKeepState settextkeepstate, setFilters setfilters, setFilters setfilters2) {
        this.values = sethint;
        this.get = settextkeepstate;
        this.ThreeDS2Service = setfilters;
        this.valueOf = setfilters2;
    }

    public static setPrivateImeOptions ThreeDS2ServiceInstance(setTextKeepState settextkeepstate, setFilters setfilters, setFilters setfilters2) {
        setPrivateImeOptions setprivateimeoptions = new setPrivateImeOptions(setHint.ThreeDS2ServiceInstance(), settextkeepstate, setfilters, setfilters2);
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & 93) - (~(-(-(i | 93))))) - 1;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return setprivateimeoptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
        r7 = r7 + 73;
        com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions.ThreeDS2ServiceInstance = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
        if ((r7 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
        throw null;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setSearchResultHighlights
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(com.netcetera.threeds.sdk.infrastructure.setTextIsSelectable r15) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions.get(com.netcetera.threeds.sdk.infrastructure.setTextIsSelectable):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFreezesText
    public setSelectAllOnFocus values() {
        int i = getSDKVersion;
        setFilters setfilters = this.valueOf;
        int i2 = ((i & (-126)) | ((~i) & 125)) + ((i & 125) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return setfilters;
        }
        throw null;
    }

    private boolean values(String str, String str2) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 89;
        int i3 = ((i & 89) | i2) << 1;
        int i4 = -i2;
        getSDKVersion = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        if (!C9669om.ThreeDS2Service(str)) {
            boolean ThreeDS2ServiceInstance2 = C9669om.ThreeDS2ServiceInstance((CharSequence) str, (CharSequence) str2);
            int i5 = getSDKVersion;
            ThreeDS2ServiceInstance = ((i5 ^ 37) + ((i5 & 37) << 1)) % 128;
            return ThreeDS2ServiceInstance2;
        }
        int i6 = getSDKVersion;
        int i7 = i6 ^ 45;
        int i8 = (i6 & 45) << 1;
        ThreeDS2ServiceInstance = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
        return true;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFreezesText
    public setSelectAllOnFocus ThreeDS2ServiceInstance() {
        int i = getSDKVersion;
        setFilters setfilters = this.ThreeDS2Service;
        int i2 = i + 95;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return setfilters;
    }
}
