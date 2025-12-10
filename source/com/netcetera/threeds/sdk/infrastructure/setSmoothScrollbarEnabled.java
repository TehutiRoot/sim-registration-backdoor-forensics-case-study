package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class setSmoothScrollbarEnabled {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final Context ThreeDS2Service;

    public setSmoothScrollbarEnabled(Context context) {
        this.ThreeDS2Service = context;
    }

    public boolean ThreeDS2Service(setFastScrollStyle... setfastscrollstyleArr) {
        int i = get;
        ThreeDS2ServiceInstance = (i + 11) % 128;
        int length = setfastscrollstyleArr.length;
        ThreeDS2ServiceInstance = (((i & (-6)) | ((~i) & 5)) + ((i & 5) << 1)) % 128;
        int i2 = 0;
        while (i2 < length) {
            ThreeDS2ServiceInstance = (get + 31) % 128;
            if (this.ThreeDS2Service.checkCallingOrSelfPermission(setfastscrollstyleArr[i2].ThreeDS2Service$InitializationCallback) == 0) {
                int i3 = ThreeDS2ServiceInstance;
                int i4 = (i3 & (-116)) | ((~i3) & 115);
                int i5 = -(-((i3 & 115) << 1));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                get = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                return false;
            }
            int i7 = i2 & 1;
            i2 = (i7 - (~(-(-((i2 ^ 1) | i7))))) - 1;
            int i8 = get;
            ThreeDS2ServiceInstance = ((((i8 | 12) << 1) - (i8 ^ 12)) - 1) % 128;
        }
        int i9 = get;
        int i10 = i9 & 85;
        int i11 = i9 | 85;
        ThreeDS2ServiceInstance = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
        return true;
    }
}
