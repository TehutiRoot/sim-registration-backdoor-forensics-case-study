package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Pair;
import android.util.TypedValue;
import com.zxy.tiny.Tiny;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class BitmapCompressor {
    /* renamed from: a */
    public static int m31983a(int i, int i2) {
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int pow = (int) Math.pow(2.0d, i3);
            if (i >= i2 * pow) {
                i3++;
                i4 = pow;
            } else {
                return i4;
            }
        }
    }

    /* renamed from: b */
    public static int m31982b(int i, int i2, int i3) {
        return m31983a(Math.max(i, i2), i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m31981c(android.graphics.Bitmap r13, int r14, int r15, boolean r16) {
        /*
            r7 = r13
            r8 = r14
            r9 = r15
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r13.getWidth()
            float r1 = (float) r1
            int r2 = r13.getHeight()
            float r2 = (float) r2
            float r3 = r1 / r2
            float r4 = (float) r8
            float r5 = (float) r9
            float r6 = r4 / r5
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1063675494(0x3f666666, float:0.9)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L33
            float r5 = r5 / r2
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 < 0) goto L2e
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 <= 0) goto L2c
            goto L2e
        L2c:
            r0 = r10
            goto L31
        L2e:
            r0.setScale(r5, r5)
        L31:
            r5 = r0
            goto L43
        L33:
            float r4 = r4 / r1
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 < 0) goto L3f
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 <= 0) goto L3d
            goto L3f
        L3d:
            r5 = r10
            goto L43
        L3f:
            r0.setScale(r4, r4)
            goto L31
        L43:
            if (r5 == 0) goto L56
            int r3 = r13.getWidth()
            int r4 = r13.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r13
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            goto L57
        L56:
            r0 = r7
        L57:
            if (r16 == 0) goto L5e
            if (r0 == r7) goto L5e
            r13.recycle()
        L5e:
            int r1 = r0.getWidth()
            int r1 = r1 - r8
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r3 = r0.getHeight()
            int r3 = r3 - r9
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1 / 2
            int r2 = r2 / 2
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r14, r15)
            if (r1 == r0) goto L82
            if (r16 != 0) goto L7f
            if (r0 == r7) goto L82
        L7f:
            r0.recycle()
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zxy.tiny.core.BitmapCompressor.m31981c(android.graphics.Bitmap, int, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap compress(Bitmap bitmap, Tiny.BitmapCompressOptions bitmapCompressOptions, boolean z) {
        Bitmap m31980d;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        if (bitmapCompressOptions == null) {
            bitmapCompressOptions = new Tiny.BitmapCompressOptions();
        }
        int i = bitmapCompressOptions.width;
        int i2 = bitmapCompressOptions.height;
        Pair<Integer, Integer> deviceScreenSizeInPixels = CompressKit.getDeviceScreenSizeInPixels();
        boolean z2 = i > 0 && i2 > 0;
        if (z) {
            if (((Integer) deviceScreenSizeInPixels.second).intValue() < CompressKit.getBaseline(bitmapCompressOptions.baseline) && ((Integer) deviceScreenSizeInPixels.first).intValue() < CompressKit.getBaseline(bitmapCompressOptions.baseline)) {
                m31980d = m31980d(bitmap, z2 ? Math.min(CompressKit.getBaseline(bitmapCompressOptions.baseline), Math.max(i, i2)) : ((Integer) deviceScreenSizeInPixels.second).intValue(), false);
            } else {
                int baseline = CompressKit.getBaseline(bitmapCompressOptions.baseline);
                if (z2) {
                    baseline = Math.min(baseline, Math.max(i, i2));
                }
                m31980d = m31980d(bitmap, baseline, false);
            }
        } else {
            int baseline2 = CompressKit.getBaseline(bitmapCompressOptions.baseline);
            if (z2) {
                baseline2 = Math.min(baseline2, Math.max(i, i2));
            }
            m31980d = m31980d(bitmap, baseline2, false);
        }
        if (m31980d == null) {
            return null;
        }
        return z2 ? m31981c(m31980d, i, i2, false) : m31980d;
    }

    /* renamed from: d */
    public static Bitmap m31980d(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int max = Math.max(width, height);
        if (max > i) {
            Matrix matrix = new Matrix();
            float f = i / max;
            matrix.postScale(f, f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            if (z) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m31979e(byte[] bArr, int i, Tiny.BitmapCompressOptions bitmapCompressOptions) {
        BitmapFactory.Options defaultDecodeOptions = CompressKit.getDefaultDecodeOptions();
        defaultDecodeOptions.inPreferredConfig = bitmapCompressOptions.config;
        defaultDecodeOptions.inSampleSize = i;
        return Degrees.handle(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, defaultDecodeOptions), bArr);
    }

    public static Bitmap sampleCompress(int i, int i2, Tiny.BitmapCompressOptions bitmapCompressOptions) throws Exception {
        InputStream inputStream = null;
        try {
            InputStream openRawResource = Tiny.getInstance().getApplication().getResources().openRawResource(i, new TypedValue());
            try {
                BitmapFactory.Options defaultDecodeOptions = CompressKit.getDefaultDecodeOptions();
                defaultDecodeOptions.inPreferredConfig = bitmapCompressOptions.config;
                defaultDecodeOptions.inSampleSize = i2;
                Bitmap handle = Degrees.handle(BitmapFactory.decodeStream(openRawResource, null, defaultDecodeOptions), i);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return handle;
            } catch (Throwable th2) {
                th = th2;
                inputStream = openRawResource;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Bitmap compress(byte[] bArr, Tiny.BitmapCompressOptions bitmapCompressOptions, boolean z) {
        Bitmap m31980d;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (bitmapCompressOptions == null) {
            bitmapCompressOptions = new Tiny.BitmapCompressOptions();
        }
        Pair<Integer, Integer> decodeDimensions = BitmapKit.decodeDimensions(bArr);
        if (decodeDimensions == null) {
            return null;
        }
        int intValue = ((Integer) decodeDimensions.first).intValue();
        int intValue2 = ((Integer) decodeDimensions.second).intValue();
        int i = bitmapCompressOptions.width;
        int i2 = bitmapCompressOptions.height;
        Pair<Integer, Integer> deviceScreenSizeInPixels = CompressKit.getDeviceScreenSizeInPixels();
        boolean z2 = i > 0 && i2 > 0;
        if (z) {
            if (((Integer) deviceScreenSizeInPixels.second).intValue() < CompressKit.getBaseline(bitmapCompressOptions.baseline) && ((Integer) deviceScreenSizeInPixels.first).intValue() < CompressKit.getBaseline(bitmapCompressOptions.baseline)) {
                int min = z2 ? Math.min(CompressKit.getBaseline(bitmapCompressOptions.baseline), Math.max(i, i2)) : ((Integer) deviceScreenSizeInPixels.second).intValue();
                m31980d = m31980d(m31979e(bArr, m31982b(intValue, intValue2, min), bitmapCompressOptions), min, true);
            } else {
                int baseline = CompressKit.getBaseline(bitmapCompressOptions.baseline);
                if (z2) {
                    baseline = Math.min(baseline, Math.max(i, i2));
                }
                m31980d = m31980d(m31979e(bArr, m31982b(intValue, intValue2, baseline), bitmapCompressOptions), baseline, true);
            }
        } else {
            int baseline2 = CompressKit.getBaseline(bitmapCompressOptions.baseline);
            if (z2) {
                baseline2 = Math.min(baseline2, Math.max(i, i2));
            }
            m31980d = m31980d(m31979e(bArr, m31982b(intValue, intValue2, baseline2), bitmapCompressOptions), baseline2, true);
        }
        if (m31980d == null) {
            return null;
        }
        return z2 ? m31981c(m31980d, i, i2, true) : m31980d;
    }

    public static Bitmap compress(int i, Tiny.BitmapCompressOptions bitmapCompressOptions, boolean z) throws Exception {
        Bitmap m31980d;
        if (bitmapCompressOptions == null) {
            bitmapCompressOptions = new Tiny.BitmapCompressOptions();
        }
        Pair<Integer, Integer> decodeDimensions = BitmapKit.decodeDimensions(i);
        if (decodeDimensions == null) {
            return null;
        }
        int intValue = ((Integer) decodeDimensions.first).intValue();
        int intValue2 = ((Integer) decodeDimensions.second).intValue();
        int i2 = bitmapCompressOptions.width;
        int i3 = bitmapCompressOptions.height;
        Pair<Integer, Integer> deviceScreenSizeInPixels = CompressKit.getDeviceScreenSizeInPixels();
        boolean z2 = i2 > 0 && i3 > 0;
        if (z) {
            if (((Integer) deviceScreenSizeInPixels.second).intValue() < CompressKit.getBaseline(bitmapCompressOptions.baseline) && ((Integer) deviceScreenSizeInPixels.first).intValue() < CompressKit.getBaseline(bitmapCompressOptions.baseline)) {
                int min = z2 ? Math.min(CompressKit.getBaseline(bitmapCompressOptions.baseline), Math.max(i2, i3)) : ((Integer) deviceScreenSizeInPixels.second).intValue();
                m31980d = m31980d(sampleCompress(i, m31982b(intValue, intValue2, min), bitmapCompressOptions), min, true);
            } else {
                int baseline = CompressKit.getBaseline(bitmapCompressOptions.baseline);
                if (z2) {
                    baseline = Math.min(baseline, Math.max(i2, i3));
                }
                m31980d = m31980d(sampleCompress(i, m31982b(intValue, intValue2, baseline), bitmapCompressOptions), baseline, true);
            }
        } else {
            int baseline2 = CompressKit.getBaseline(bitmapCompressOptions.baseline);
            if (z2) {
                baseline2 = Math.min(baseline2, Math.max(i2, i3));
            }
            m31980d = m31980d(sampleCompress(i, m31982b(intValue, intValue2, baseline2), bitmapCompressOptions), baseline2, true);
        }
        if (m31980d == null) {
            return null;
        }
        return z2 ? m31981c(m31980d, i2, i3, true) : m31980d;
    }
}
