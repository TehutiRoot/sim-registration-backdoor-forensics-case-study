package com.zxy.tiny.core;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class Degrees {
    public static Bitmap handle(Bitmap bitmap, byte[] bArr) {
        return ExifCompat.isJpeg(bArr) ? BitmapKit.rotateBitmap(bitmap, ExifCompat.getOrientation(bArr)) : bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap handle(android.graphics.Bitmap r4, int r5) {
        /*
            com.zxy.tiny.Tiny r0 = com.zxy.tiny.Tiny.getInstance()
            android.app.Application r0 = r0.getApplication()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 0
            android.util.TypedValue r2 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.InputStream r1 = r0.openRawResource(r5, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r5.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L1f:
            int r2 = r1.read(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r3 = -1
            if (r2 == r3) goto L2f
            r3 = 0
            r5.write(r0, r3, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L1f
        L2b:
            r4 = move-exception
            goto L53
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            r5.close()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            boolean r0 = com.zxy.tiny.core.ExifCompat.isJpeg(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r0 == 0) goto L48
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            int r5 = com.zxy.tiny.core.ExifCompat.getOrientation(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            android.graphics.Bitmap r4 = com.zxy.tiny.core.BitmapKit.rotateBitmap(r4, r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L48:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L52
        L4c:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L52
            goto L48
        L52:
            return r4
        L53:
            if (r1 == 0) goto L58
            r1.close()     // Catch: java.io.IOException -> L58
        L58:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zxy.tiny.core.Degrees.handle(android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
