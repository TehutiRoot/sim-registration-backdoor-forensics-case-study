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
    public static boolean f60479a = false;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.image.LosslessFactory$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9948a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60480a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f60480a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60480a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.image.LosslessFactory$b */
    /* loaded from: classes5.dex */
    public static class C9949b {

        /* renamed from: a */
        public final PDDocument f60481a;

        /* renamed from: b */
        public final Bitmap f60482b;

        /* renamed from: c */
        public final int f60483c = 1;

        /* renamed from: d */
        public final int f60484d = 3;

        /* renamed from: e */
        public final int f60485e;

        /* renamed from: f */
        public final int f60486f;

        /* renamed from: g */
        public final byte[] f60487g;

        /* renamed from: h */
        public final byte[] f60488h;

        /* renamed from: i */
        public final byte[] f60489i;

        /* renamed from: j */
        public final byte[] f60490j;

        /* renamed from: k */
        public final byte[] f60491k;

        /* renamed from: l */
        public final Bitmap.Config f60492l;

        /* renamed from: m */
        public final boolean f60493m;

        /* renamed from: n */
        public final byte[] f60494n;

        /* renamed from: o */
        public final byte[] f60495o;

        /* renamed from: p */
        public final byte[] f60496p;

        /* renamed from: q */
        public final byte[] f60497q;

        /* renamed from: r */
        public final byte[] f60498r;

        /* renamed from: s */
        public final byte[] f60499s;

        public C9949b(PDDocument pDDocument, Bitmap bitmap) {
            byte[] bArr;
            this.f60481a = pDDocument;
            this.f60482b = bitmap;
            int height = bitmap.getHeight();
            this.f60485e = height;
            int width = bitmap.getWidth();
            this.f60486f = width;
            this.f60492l = bitmap.getConfig();
            boolean hasAlpha = bitmap.hasAlpha();
            this.f60493m = hasAlpha;
            if (hasAlpha) {
                bArr = new byte[height * width];
            } else {
                bArr = null;
            }
            this.f60494n = bArr;
            int i = (width * 3) + 1;
            byte[] bArr2 = new byte[i];
            this.f60487g = bArr2;
            byte[] bArr3 = new byte[i];
            this.f60488h = bArr3;
            byte[] bArr4 = new byte[i];
            this.f60489i = bArr4;
            byte[] bArr5 = new byte[i];
            this.f60490j = bArr5;
            byte[] bArr6 = new byte[i];
            this.f60491k = bArr6;
            bArr2[0] = 0;
            bArr3[0] = 1;
            bArr4[0] = 2;
            bArr5[0] = 3;
            bArr6[0] = 4;
            this.f60495o = new byte[3];
            this.f60496p = new byte[3];
            this.f60497q = new byte[3];
            this.f60498r = new byte[3];
            this.f60499s = new byte[3];
        }

        /* renamed from: d */
        public static long m32382d(byte[] bArr) {
            long j = 0;
            for (byte b : bArr) {
                j += Math.abs((int) b);
            }
            return j;
        }

        /* renamed from: e */
        public static byte m32381e(int i, int i2, int i3) {
            return (byte) (i - ((i3 + i2) / 2));
        }

        /* renamed from: f */
        public static byte m32380f(int i, int i2, int i3, int i4) {
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
        public static byte m32379g(int i, int i2) {
            return (byte) ((i & 255) - (i2 & 255));
        }

        /* renamed from: h */
        public static byte m32378h(int i, int i2) {
            return m32379g(i, i2);
        }

        /* renamed from: a */
        public final byte[] m32385a() {
            byte[] bArr = this.f60487g;
            long m32382d = m32382d(bArr);
            long m32382d2 = m32382d(this.f60488h);
            long m32382d3 = m32382d(this.f60489i);
            long m32382d4 = m32382d(this.f60490j);
            long m32382d5 = m32382d(this.f60491k);
            if (m32382d > m32382d2) {
                bArr = this.f60488h;
                m32382d = m32382d2;
            }
            if (m32382d > m32382d3) {
                bArr = this.f60489i;
            } else {
                m32382d3 = m32382d;
            }
            if (m32382d3 > m32382d4) {
                bArr = this.f60490j;
            } else {
                m32382d4 = m32382d3;
            }
            if (m32382d4 > m32382d5) {
                return this.f60491k;
            }
            return bArr;
        }

        /* renamed from: b */
        public final void m32384b(int[] iArr, int i, byte[] bArr, byte[] bArr2, int i2) {
            int i3 = iArr[i];
            byte blue = (byte) Color.blue(i3);
            byte green = (byte) Color.green(i3);
            byte red = (byte) Color.red(i3);
            int i4 = C9948a.f60480a[this.f60492l.ordinal()];
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
        public PDImageXObject m32383c() {
            int i = C9948a.f60480a[this.f60492l.ordinal()];
            if (i != 1 && i != 2) {
                return null;
            }
            int i2 = this.f60486f;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((this.f60485e * this.f60486f) * this.f60484d) / 2);
            Deflater deflater = new Deflater(Filter.getCompressionLevel());
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            byte b = 0;
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < this.f60485e) {
                Bitmap bitmap = this.f60482b;
                int i5 = this.f60486f;
                bitmap.getPixels(iArr2, 0, i5, 0, i4, i5, 1);
                Arrays.fill(this.f60495o, b);
                Arrays.fill(this.f60496p, b);
                int i6 = i3;
                int i7 = 0;
                int i8 = 1;
                while (i7 < i2) {
                    int i9 = i7;
                    int i10 = i4;
                    m32384b(iArr2, i9, this.f60498r, this.f60494n, i6);
                    m32384b(iArr, i9, this.f60497q, null, 0);
                    int length = this.f60498r.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = this.f60498r[i11] & 255;
                        int i13 = this.f60495o[i11] & 255;
                        int i14 = this.f60497q[i11] & 255;
                        this.f60487g[i8] = (byte) i12;
                        this.f60488h[i8] = m32379g(i12, i13);
                        this.f60489i[i8] = m32378h(i12, i14);
                        this.f60490j[i8] = m32381e(i12, i13, i14);
                        this.f60491k[i8] = m32380f(i12, i13, i14, this.f60496p[i11] & 255);
                        i8++;
                    }
                    System.arraycopy(this.f60498r, 0, this.f60495o, 0, this.f60484d);
                    System.arraycopy(this.f60497q, 0, this.f60496p, 0, this.f60484d);
                    i7++;
                    i6 += this.f60483c;
                    i4 = i10;
                }
                byte[] m32385a = m32385a();
                deflaterOutputStream.write(m32385a, 0, m32385a.length);
                i4++;
                i3 = i6;
                b = 0;
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            deflaterOutputStream.close();
            deflater.end();
            return m32377i(byteArrayOutputStream, this.f60483c * 8);
        }

        /* renamed from: i */
        public final PDImageXObject m32377i(ByteArrayOutputStream byteArrayOutputStream, int i) {
            int height = this.f60482b.getHeight();
            int width = this.f60482b.getWidth();
            PDImageXObject pDImageXObject = new PDImageXObject(this.f60481a, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE, width, height, i, PDDeviceRGB.INSTANCE);
            COSDictionary cOSDictionary = new COSDictionary();
            cOSDictionary.setItem(COSName.BITS_PER_COMPONENT, (COSBase) COSInteger.get(i));
            cOSDictionary.setItem(COSName.PREDICTOR, (COSBase) COSInteger.get(15L));
            cOSDictionary.setItem(COSName.COLUMNS, (COSBase) COSInteger.get(width));
            cOSDictionary.setItem(COSName.COLORS, (COSBase) COSInteger.get(3L));
            pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
            if (this.f60493m) {
                pDImageXObject.getCOSObject().setItem(COSName.SMASK, LosslessFactory.m32386d(this.f60481a, this.f60494n, this.f60482b.getWidth(), this.f60482b.getHeight(), this.f60483c * 8, PDDeviceGray.INSTANCE));
            }
            return pDImageXObject;
        }
    }

    /* renamed from: a */
    public static PDImageXObject m32389a(Bitmap bitmap, PDDocument pDDocument) {
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
        return m32386d(pDDocument, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE);
    }

    /* renamed from: b */
    public static PDImageXObject m32388b(Bitmap bitmap, PDDocument pDDocument) {
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
        PDImageXObject m32386d = m32386d(pDDocument, bArr2, bitmap.getWidth(), bitmap.getHeight(), 8, pDDeviceRGB);
        if (bitmap.hasAlpha()) {
            m32386d.getCOSObject().setItem(COSName.SMASK, m32386d(pDDocument, bArr3, bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE));
        }
        return m32386d;
    }

    /* renamed from: c */
    public static boolean m32387c(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return true;
        }
        return false;
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) throws IOException {
        PDImageXObject m32383c;
        if (m32387c(bitmap)) {
            return m32389a(bitmap, pDDocument);
        }
        if (f60479a && (m32383c = new C9949b(pDDocument, bitmap).m32383c()) != null) {
            if (m32383c.getColorSpace() == PDDeviceRGB.INSTANCE && m32383c.getBitsPerComponent() < 16 && bitmap.getWidth() * bitmap.getHeight() <= 2500) {
                PDImageXObject m32388b = m32388b(bitmap, pDDocument);
                if (m32388b.getCOSObject().getLength() < m32383c.getCOSObject().getLength()) {
                    m32383c.getCOSObject().close();
                    return m32388b;
                }
                m32388b.getCOSObject().close();
            }
            return m32383c;
        }
        return m32388b(bitmap, pDDocument);
    }

    /* renamed from: d */
    public static PDImageXObject m32386d(PDDocument pDDocument, byte[] bArr, int i, int i2, int i3, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length / 2);
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.FLATE_DECODE;
        filterFactory.getFilter(cOSName).encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, new COSDictionary(), 0);
        return new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i, i2, i3, pDColorSpace);
    }
}
