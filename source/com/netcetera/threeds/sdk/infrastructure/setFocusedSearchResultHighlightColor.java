package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes5.dex */
class setFocusedSearchResultHighlightColor {
    private static int ThreeDS2Service = 0;
    private static int get = 1;

    public Bitmap get(byte[] bArr) {
        int i = get;
        int i2 = (-2) - (~(((i | 120) << 1) - (i ^ 120)));
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return BitmapFactory.decodeByteArray(bArr, 1, bArr.length);
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }
}
