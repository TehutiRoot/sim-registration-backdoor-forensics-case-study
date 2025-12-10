package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: kD1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20691kD1 {
    /* renamed from: a */
    public static Rect m28983a(PDImage pDImage, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, pDImage.getWidth(), pDImage.getHeight());
        }
        int max = Math.max(0, rect.left);
        int max2 = Math.max(0, rect.top);
        return new Rect(max, max2, Math.min(rect.width(), pDImage.getWidth() - max), Math.min(rect.height(), pDImage.getHeight() - max2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m28982b(java.io.InputStream r7, int r8, int r9, int r10) {
        /*
            byte[] r7 = com.tom_roush.pdfbox.p019io.IOUtils.toByteArray(r7)
            int r0 = r7.length
            int r0 = r0 / r9
            int r0 = r0 / r8
            r1 = 1
            if (r9 != r1) goto L30
            int r9 = r8 * r0
            int r2 = r9 * 4
            byte[] r2 = new byte[r2]
            int r9 = r9 - r1
        L11:
            if (r9 < 0) goto L2e
            int r3 = r9 * 4
            int r4 = r3 + 3
            r5 = r7[r9]
            r2[r4] = r5
            r4 = r7[r9]
            r2[r3] = r4
            int r4 = r3 + 1
            r5 = r7[r9]
            r2[r4] = r5
            int r3 = r3 + 2
            r4 = r7[r9]
            r2[r3] = r4
            int r9 = r9 + (-1)
            goto L11
        L2e:
            r7 = r2
            goto L5c
        L30:
            r2 = 3
            if (r9 != r2) goto L5c
            int r9 = r8 * r0
            int r2 = r9 * 4
            byte[] r2 = new byte[r2]
            int r9 = r9 - r1
        L3a:
            if (r9 < 0) goto L2e
            int r3 = r9 * 4
            int r4 = r9 * 3
            int r5 = r3 + 3
            r6 = -1
            r2[r5] = r6
            r5 = r7[r4]
            r2[r3] = r5
            int r5 = r3 + 1
            int r6 = r4 + 1
            r6 = r7[r6]
            r2[r5] = r6
            int r3 = r3 + 2
            int r4 = r4 + 2
            r4 = r7[r4]
            r2[r3] = r4
            int r9 = r9 + (-1)
            goto L3a
        L5c:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r8, r0, r9)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r9.copyPixelsFromBuffer(r7)
            if (r10 <= r1) goto L71
            int r8 = r8 / r10
            int r0 = r0 / r10
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r9, r8, r0, r1)
        L71:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC20691kD1.m28982b(java.io.InputStream, int, int, int):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r23[r16] = -1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m28981c(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage r22, android.graphics.Rect r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC20691kD1.m28981c(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage, android.graphics.Rect, int, int, int):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public static Bitmap m28980d(PDImage pDImage, Rect rect, int i, int i2, int i3) {
        int i4;
        int width;
        int height;
        int i5;
        int i6;
        int i7;
        DecodeOptions decodeOptions = new DecodeOptions(i);
        decodeOptions.setSourceRegion(rect);
        InputStream createInputStream = pDImage.createInputStream(decodeOptions);
        try {
            if (decodeOptions.isFilterSubsampled()) {
                i5 = 0;
                i6 = i2;
                width = i6;
                height = i3;
                i7 = 1;
                i4 = 0;
            } else {
                int width2 = pDImage.getWidth();
                int i8 = rect.left;
                i4 = rect.top;
                width = rect.width();
                height = rect.height();
                i5 = i8;
                i6 = width2;
                i7 = i;
            }
            int numberOfComponents = pDImage.getColorSpace().getNumberOfComponents();
            if (i5 == 0 && i4 == 0 && width == i2 && height == i3) {
                return m28982b(createInputStream, i6, numberOfComponents, i7);
            }
            Bitmap m28982b = m28982b(createInputStream, i6, numberOfComponents, i7);
            if (i7 > 1) {
                i5 /= i7;
                i4 /= i7;
            }
            return Bitmap.createBitmap(m28982b, i5, i4, i2, i3);
        } finally {
            IOUtils.closeQuietly(createInputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float[] m28979e(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage r10) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.tom_roush.pdfbox.cos.COSArray r3 = r10.getDecode()
            if (r3 == 0) goto L94
            com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace r4 = r10.getColorSpace()
            int r4 = r4.getNumberOfComponents()
            int r5 = r3.size()
            int r4 = r4 * 2
            if (r5 == r4) goto L8f
            boolean r4 = r10.isStencil()
            java.lang.String r5 = "decode array "
            if (r4 == 0) goto L7e
            int r4 = r3.size()
            if (r4 < r2) goto L7e
            com.tom_roush.pdfbox.cos.COSBase r4 = r3.get(r1)
            boolean r4 = r4 instanceof com.tom_roush.pdfbox.cos.COSNumber
            if (r4 == 0) goto L7e
            com.tom_roush.pdfbox.cos.COSBase r4 = r3.get(r0)
            boolean r4 = r4 instanceof com.tom_roush.pdfbox.cos.COSNumber
            if (r4 == 0) goto L7e
            com.tom_roush.pdfbox.cos.COSBase r4 = r3.get(r1)
            com.tom_roush.pdfbox.cos.COSNumber r4 = (com.tom_roush.pdfbox.cos.COSNumber) r4
            float r4 = r4.floatValue()
            com.tom_roush.pdfbox.cos.COSBase r6 = r3.get(r0)
            com.tom_roush.pdfbox.cos.COSNumber r6 = (com.tom_roush.pdfbox.cos.COSNumber) r6
            float r6 = r6.floatValue()
            r7 = 0
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 < 0) goto L7e
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 > 0) goto L7e
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 < 0) goto L7e
            int r7 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r7 > 0) goto L7e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r3)
            java.lang.String r3 = " not compatible with color space, using the first two entries"
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            java.lang.String r3 = "PdfBox-Android"
            android.util.Log.w(r3, r10)
            float[] r10 = new float[r2]
            r10[r1] = r4
            r10[r0] = r6
            return r10
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r3)
            java.lang.String r1 = " not compatible with color space, using default"
            r0.append(r1)
            goto L94
        L8f:
            float[] r0 = r3.toFloatArray()
            goto L95
        L94:
            r0 = 0
        L95:
            if (r0 != 0) goto La4
            com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace r0 = r10.getColorSpace()
            int r10 = r10.getBitsPerComponent()
            float[] r10 = r0.getDefaultDecode(r10)
            return r10
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC20691kD1.m28979e(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage):float[]");
    }

    /* renamed from: f */
    public static Bitmap m28978f(PDImage pDImage, Rect rect, int i, COSArray cOSArray) {
        if (!pDImage.isEmpty()) {
            Rect m28983a = m28983a(pDImage, rect);
            int numberOfComponents = pDImage.getColorSpace().getNumberOfComponents();
            int ceil = (int) Math.ceil(m28983a.width() / i);
            int ceil2 = (int) Math.ceil(m28983a.height() / i);
            int bitsPerComponent = pDImage.getBitsPerComponent();
            if (ceil > 0 && ceil2 > 0 && pDImage.getWidth() > 0 && pDImage.getHeight() > 0) {
                try {
                    if (bitsPerComponent == 1 && cOSArray == null && numberOfComponents == 1) {
                        return m28981c(pDImage, m28983a, i, ceil, ceil2);
                    }
                    float[] defaultDecode = pDImage.getColorSpace().getDefaultDecode(8);
                    float[] m28979e = m28979e(pDImage);
                    if (pDImage.getSuffix() != null && pDImage.getSuffix().equals("jpg") && i == 1) {
                        return BitmapFactory.decodeStream(pDImage.createInputStream());
                    }
                    if (bitsPerComponent == 8 && cOSArray == null && Arrays.equals(m28979e, defaultDecode)) {
                        return m28980d(pDImage, m28983a, i, ceil, ceil2);
                    }
                    return m28980d(pDImage, m28983a, i, ceil, ceil2);
                } catch (NegativeArraySizeException e) {
                    throw new IOException(e);
                }
            }
            throw new IOException("image width and height must be positive");
        }
        throw new IOException("Image stream is empty");
    }

    /* renamed from: g */
    public static Bitmap m28977g(PDImage pDImage, COSArray cOSArray) {
        return m28978f(pDImage, null, 1, cOSArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        android.util.Log.w("PdfBox-Android", "premature EOF, image will be incomplete");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m28976h(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage r17, android.graphics.Paint r18) {
        /*
            int r0 = r17.getWidth()
            int r1 = r17.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            float r6 = (float) r0
            float r7 = (float) r1
            r4 = 0
            r5 = 0
            r8 = r18
            r3.drawRect(r4, r5, r6, r7, r8)
            r3 = 0
            com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream r4 = new com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream     // Catch: java.lang.Throwable -> L91
            java.io.InputStream r5 = r17.createInputStream()     // Catch: java.lang.Throwable -> L91
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L91
            float[] r3 = m28979e(r17)     // Catch: java.lang.Throwable -> L67
            r5 = 0
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L67
            r7 = 1
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L67
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            int r6 = r0 / 8
            int r8 = r0 % 8
            if (r8 <= 0) goto L3f
            int r6 = r6 + 1
        L3f:
            byte[] r8 = new byte[r6]     // Catch: java.lang.Throwable -> L67
            r9 = 0
        L42:
            if (r9 >= r1) goto L8d
            int r10 = r4.read(r8)     // Catch: java.lang.Throwable -> L67
            r11 = 0
            r12 = 0
        L4a:
            if (r11 >= r6) goto L7b
            if (r11 >= r10) goto L7b
            r13 = r8[r11]     // Catch: java.lang.Throwable -> L67
            r14 = 128(0x80, float:1.794E-43)
            r15 = 7
        L53:
            r7 = 8
            if (r5 >= r7) goto L73
            r7 = r13 & r14
            int r7 = r7 >> r15
            r16 = 1
            int r14 = r14 >> 1
            int r15 = r15 + (-1)
            if (r7 != r3) goto L6a
            r7 = 0
            r2.setPixel(r12, r9, r7)     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r0 = move-exception
            r3 = r4
            goto L92
        L6a:
            r7 = 0
        L6b:
            int r12 = r12 + 1
            if (r12 != r0) goto L70
            goto L76
        L70:
            int r5 = r5 + 1
            goto L53
        L73:
            r7 = 0
            r16 = 1
        L76:
            int r11 = r11 + 1
            r5 = 0
            r7 = 1
            goto L4a
        L7b:
            r7 = 0
            r16 = 1
            if (r10 == r6) goto L88
            java.lang.String r0 = "PdfBox-Android"
            java.lang.String r1 = "premature EOF, image will be incomplete"
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L67
            goto L8d
        L88:
            int r9 = r9 + 1
            r5 = 0
            r7 = 1
            goto L42
        L8d:
            r4.close()
            return r2
        L91:
            r0 = move-exception
        L92:
            if (r3 == 0) goto L97
            r3.close()
        L97:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC20691kD1.m28976h(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage, android.graphics.Paint):android.graphics.Bitmap");
    }
}
