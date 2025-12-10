package com.netcetera.threeds.sdk.infrastructure;

import android.util.Base64;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
class setNavigationContentDescription implements setSubtitleTextColor<String, String> {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;

    public String ThreeDS2Service(String str) {
        String str2 = new String(Base64.decode(((String) C9658om.ThreeDS2Service(str, "")).getBytes(Charset.defaultCharset()), 8), Charset.defaultCharset());
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 25) + (i | 25);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ String valueOf(String str) {
        int i = valueOf;
        ThreeDS2ServiceInstance = ((((i | 106) << 1) - (i ^ 106)) - 1) % 128;
        String ThreeDS2Service = ThreeDS2Service(str);
        int i2 = ThreeDS2ServiceInstance;
        int i3 = (((i2 | 25) << 1) - (~(-(((~i2) & 25) | (i2 & (-26)))))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return ThreeDS2Service;
    }
}