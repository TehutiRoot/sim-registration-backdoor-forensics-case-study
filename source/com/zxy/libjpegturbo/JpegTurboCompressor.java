package com.zxy.libjpegturbo;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class JpegTurboCompressor {
    static {
        System.loadLibrary("tiny");
    }

    public static boolean compress(Bitmap bitmap, String str, int i) {
        return nativeCompress(bitmap, str, i, true);
    }

    private static native int getLibjpegTurboVersion();

    private static native int getLibjpegVersion();

    public static String getVersion() {
        return "libjpeg-turbo api version : " + getLibjpegTurboVersion() + ", libjpeg api version : " + getLibjpegVersion();
    }

    private static native boolean nativeCompress(Bitmap bitmap, String str, int i, boolean z);
}
