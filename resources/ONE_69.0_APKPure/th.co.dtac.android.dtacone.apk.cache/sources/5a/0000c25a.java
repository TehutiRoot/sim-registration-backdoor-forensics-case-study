package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageOutputStream;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes5.dex */
public final class LosslessFactory {

    /* renamed from: a */
    public static boolean f60491a = false;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.image.LosslessFactory$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9937a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60492a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f60492a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60492a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.image.LosslessFactory$b */
    /* loaded from: classes5.dex */
    public static class C9938b {

        /* renamed from: a */
        public final PDDocument f60493a;

        /* renamed from: b */
        public final Bitmap f60494b;

        /* renamed from: c */
        public final int f60495c = 1;

        /* renamed from: d */
        public final int f60496d = 3;

        /* renamed from: e */
        public final int f60497e;

        /* renamed from: f */
        public final int f60498f;

        /* renamed from: g */
        public final byte[] f60499g;

        /* renamed from: h */
        public final byte[] f60500h;

        /* renamed from: i */
        public final byte[] f60501i;

        /* renamed from: j */
        public final byte[] f60502j;

        /* renamed from: k */
        public final byte[] f60503k;

        /* renamed from: l */
        public final Bitmap.Config f60504l;

        /* renamed from: m */
        public final boolean f60505m;

        /* renamed from: n */
        public final byte[] f60506n;

        /* renamed from: o */
        public final byte[] f60507o;

        /* renamed from: p */
        public final byte[] f60508p;

        /* renamed from: q */
        public final byte[] f60509q;

        /* renamed from: r */
        public final byte[] f60510r;

        /* renamed from: s */
        public final byte[] f60511s;

        public C9938b(PDDocument pDDocument, Bitmap bitmap) {
            byte[] bArr;
            this.f60493a = pDDocument;
            this.f60494b = bitmap;
            int height = bitmap.getHeight();
            this.f60497e = height;
            int width = bitmap.getWidth();
            this.f60498f = width;
            this.f60504l = bitmap.getConfig();
            boolean hasAlpha = bitmap.hasAlpha();
            this.f60505m = hasAlpha;
            if (hasAlpha) {
                bArr = new byte[height * width];
            } else {
                bArr = null;
            }
            this.f60506n = bArr;
            int i = (width * 3) + 1;
            byte[] bArr2 = new byte[i];
            this.f60499g = bArr2;
            byte[] bArr3 = new byte[i];
            this.f60500h = bArr3;
            byte[] bArr4 = new byte[i];
            this.f60501i = bArr4;
            byte[] bArr5 = new byte[i];
            this.f60502j = bArr5;
            byte[] bArr6 = new byte[i];
            this.f60503k = bArr6;
            bArr2[0] = 0;
            bArr3[0] = 1;
            bArr4[0] = 2;
            bArr5[0] = 3;
            bArr6[0] = 4;
            this.f60507o = new byte[3];
            this.f60508p = new byte[3];
            this.f60509q = new byte[3];
            this.f60510r = new byte[3];
            this.f60511s = new byte[3];
        }

        /* renamed from: d */
        public static long m32374d(byte[] bArr) {
            long j = 0;
            for (byte b : bArr) {
                j += Math.abs((int) b);
            }
            return j;
        }

        /* renamed from: e */
        public static byte m32373e(int i, int i2, int i3) {
            return (byte) (i - ((i3 + i2) / 2));
        }

        /* renamed from: f */
        public static byte m32372f(int i, int i2, int i3, int i4) {
            int i5 = (i2 + i3) - i4;
            int abs = Math.abs(i5 - i2);
            int abs2 = Math.abs(i5 - i3);
            int abs3 = Math.abs(i5 - i4);
            if (abs > abs2 || abs > abs3) {
                if (abs2 <= abs3) {
                    i2 = i3;
                } else {
                    i2 = i4;
                }
            }
            return (byte) (i - i2);
        }

        /* renamed from: g */
        public static byte m32371g(int i, int i2) {
            return (byte) ((i & 255) - (i2 & 255));
        }

        /* renamed from: h */
        public static byte m32370h(int i, int i2) {
            return m32371g(i, i2);
        }

        /* renamed from: a */
        public final byte[] m32377a() {
            byte[] bArr = this.f60499g;
            long m32374d = m32374d(bArr);
            long m32374d2 = m32374d(this.f60500h);
            long m32374d3 = m32374d(this.f60501i);
            long m32374d4 = m32374d(this.f60502j);
            long m32374d5 = m32374d(this.f60503k);
            if (m32374d > m32374d2) {
                bArr = this.f60500h;
                m32374d = m32374d2;
            }
            if (m32374d > m32374d3) {
                bArr = this.f60501i;
            } else {
                m32374d3 = m32374d;
            }
            if (m32374d3 > m32374d4) {
                bArr = this.f60502j;
            } else {
                m32374d4 = m32374d3;
            }
            if (m32374d4 > m32374d5) {
                return this.f60503k;
            }
            return bArr;
        }

        /* renamed from: b */
        public final void m32376b(int[] iArr, int i, byte[] bArr, byte[] bArr2, int i2) {
            int i3 = iArr[i];
            byte blue = (byte) Color.blue(i3);
            byte green = (byte) Color.green(i3);
            byte red = (byte) Color.red(i3);
            int i4 = C9937a.f60492a[this.f60504l.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    bArr[0] = red;
                    bArr[1] = green;
                    bArr[2] = blue;
                    return;
                }
                return;
            }
            bArr[0] = red;
            bArr[1] = green;
            bArr[2] = blue;
            if (bArr2 != null) {
                bArr2[i2] = (byte) Color.alpha(i3);
            }
        }

        /* renamed from: c */
        public PDImageXObject m32375c() {
            int i = C9937a.f60492a[this.f60504l.ordinal()];
            if (i != 1 && i != 2) {
                return null;
            }
            int i2 = this.f60498f;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((this.f60497e * this.f60498f) * this.f60496d) / 2);
            Deflater deflater = new Deflater(Filter.getCompressionLevel());
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            byte b = 0;
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < this.f60497e) {
                Bitmap bitmap = this.f60494b;
                int i5 = this.f60498f;
                bitmap.getPixels(iArr2, 0, i5, 0, i4, i5, 1);
                Arrays.fill(this.f60507o, b);
                Arrays.fill(this.f60508p, b);
                int i6 = i3;
                int i7 = 0;
                int i8 = 1;
                while (i7 < i2) {
                    int i9 = i7;
                    int i10 = i4;
                    m32376b(iArr2, i9, this.f60510r, this.f60506n, i6);
                    m32376b(iArr, i9, this.f60509q, null, 0);
                    int length = this.f60510r.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = this.f60510r[i11] & 255;
                        int i13 = this.f60507o[i11] & 255;
                        int i14 = this.f60509q[i11] & 255;
                        this.f60499g[i8] = (byte) i12;
                        this.f60500h[i8] = m32371g(i12, i13);
                        this.f60501i[i8] = m32370h(i12, i14);
                        this.f60502j[i8] = m32373e(i12, i13, i14);
                        this.f60503k[i8] = m32372f(i12, i13, i14, this.f60508p[i11] & 255);
                        i8++;
                    }
                    System.arraycopy(this.f60510r, 0, this.f60507o, 0, this.f60496d);
                    System.arraycopy(this.f60509q, 0, this.f60508p, 0, this.f60496d);
                    i7++;
                    i6 += this.f60495c;
                    i4 = i10;
                }
                byte[] m32377a = m32377a();
                deflaterOutputStream.write(m32377a, 0, m32377a.length);
                i4++;
                i3 = i6;
                b = 0;
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            deflaterOutputStream.close();
            deflater.end();
            return m32369i(byteArrayOutputStream, this.f60495c * 8);
        }

        /* renamed from: i */
        public final PDImageXObject m32369i(ByteArrayOutputStream byteArrayOutputStream, int i) {
            int height = this.f60494b.getHeight();
            int width = this.f60494b.getWidth();
            PDImageXObject pDImageXObject = new PDImageXObject(this.f60493a, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE, width, height, i, PDDeviceRGB.INSTANCE);
            COSDictionary cOSDictionary = new COSDictionary();
            cOSDictionary.setItem(COSName.BITS_PER_COMPONENT, (COSBase) COSInteger.get(i));
            cOSDictionary.setItem(COSName.PREDICTOR, (COSBase) COSInteger.get(15L));
            cOSDictionary.setItem(COSName.COLUMNS, (COSBase) COSInteger.get(width));
            cOSDictionary.setItem(COSName.COLORS, (COSBase) COSInteger.get(3L));
            pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
            if (this.f60505m) {
                pDImageXObject.getCOSObject().setItem(COSName.SMASK, LosslessFactory.m32378d(this.f60493a, this.f60506n, this.f60494b.getWidth(), this.f60494b.getHeight(), this.f60495c * 8, PDDeviceGray.INSTANCE));
            }
            return pDImageXObject;
        }
    }

    /* renamed from: a */
    public static PDImageXObject m32381a(Bitmap bitmap, PDDocument pDDocument) {
        int i;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        int i2 = width * 8;
        int i3 = i2 / 8;
        if (i2 % 8 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((i3 + i) * height);
        MemoryCacheImageOutputStream memoryCacheImageOutputStream = new MemoryCacheImageOutputStream(byteArrayOutputStream);
        for (int i4 = 0; i4 < height; i4++) {
            bitmap.getPixels(iArr, 0, width, 0, i4, width, 1);
            for (int i5 = 0; i5 < width; i5++) {
                memoryCacheImageOutputStream.writeBits(iArr[i5] & 255, 8);
            }
            int bitOffset = memoryCacheImageOutputStream.getBitOffset();
            if (bitOffset != 0) {
                memoryCacheImageOutputStream.writeBits(0L, 8 - bitOffset);
            }
        }
        memoryCacheImageOutputStream.flush();
        memoryCacheImageOutputStream.close();
        return m32378d(pDDocument, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE);
    }

    /* renamed from: b */
    public static PDImageXObject m32380b(Bitmap bitmap, PDDocument pDDocument) {
        byte[] bArr;
        int i;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        PDDeviceRGB pDDeviceRGB = PDDeviceRGB.INSTANCE;
        byte[] bArr2 = new byte[width * height * 3];
        if (bitmap.hasAlpha()) {
            int i2 = width * 8;
            int i3 = i2 / 8;
            if (i2 % 8 != 0) {
                i = 1;
            } else {
                i = 0;
            }
            bArr = new byte[(i3 + i) * height];
        } else {
            bArr = new byte[0];
        }
        byte[] bArr3 = bArr;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < height; i6++) {
            bitmap.getPixels(iArr, 0, width, 0, i6, width, 1);
            for (int i7 = 0; i7 < width; i7++) {
                int i8 = iArr[i7];
                bArr2[i4] = (byte) ((i8 >> 16) & 255);
                int i9 = i4 + 2;
                bArr2[i4 + 1] = (byte) ((i8 >> 8) & 255);
                i4 += 3;
                bArr2[i9] = (byte) (i8 & 255);
                if (bitmap.hasAlpha()) {
                    bArr3[i5] = (byte) ((i8 >> 24) & 255);
                    i5++;
                }
            }
        }
        PDImageXObject m32378d = m32378d(pDDocument, bArr2, bitmap.getWidth(), bitmap.getHeight(), 8, pDDeviceRGB);
        if (bitmap.hasAlpha()) {
            m32378d.getCOSObject().setItem(COSName.SMASK, m32378d(pDDocument, bArr3, bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE));
        }
        return m32378d;
    }

    /* renamed from: c */
    public static boolean m32379c(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return true;
        }
        return false;
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) throws IOException {
        PDImageXObject m32375c;
        if (m32379c(bitmap)) {
            return m32381a(bitmap, pDDocument);
        }
        if (f60491a && (m32375c = new C9938b(pDDocument, bitmap).m32375c()) != null) {
            if (m32375c.getColorSpace() == PDDeviceRGB.INSTANCE && m32375c.getBitsPerComponent() < 16 && bitmap.getWidth() * bitmap.getHeight() <= 2500) {
                PDImageXObject m32380b = m32380b(bitmap, pDDocument);
                if (m32380b.getCOSObject().getLength() < m32375c.getCOSObject().getLength()) {
                    m32375c.getCOSObject().close();
                    return m32380b;
                }
                m32380b.getCOSObject().close();
            }
            return m32375c;
        }
        return m32380b(bitmap, pDDocument);
    }

    /* renamed from: d */
    public static PDImageXObject m32378d(PDDocument pDDocument, byte[] bArr, int i, int i2, int i3, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length / 2);
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.FLATE_DECODE;
        filterFactory.getFilter(cOSName).encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, new COSDictionary(), 0);
        return new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i, i2, i3, pDColorSpace);
    }
}