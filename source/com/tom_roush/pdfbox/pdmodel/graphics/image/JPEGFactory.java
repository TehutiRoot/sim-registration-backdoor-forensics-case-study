package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class JPEGFactory {

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.image.JPEGFactory$b */
    /* loaded from: classes5.dex */
    public static class C9947b {

        /* renamed from: a */
        public int f60477a;

        /* renamed from: b */
        public int f60478b;

        public C9947b() {
        }
    }

    /* renamed from: a */
    public static PDImageXObject m32398a(PDDocument pDDocument, Bitmap bitmap) {
        if (!bitmap.hasAlpha()) {
            return null;
        }
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < height; i++) {
            byteArrayOutputStream.write(Color.alpha(iArr[i]));
        }
        return m32395d(pDDocument, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE);
    }

    /* renamed from: b */
    public static PDImageXObject m32397b(PDDocument pDDocument, Bitmap bitmap, float f, int i) {
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(m32396c(bitmap, f, i)), COSName.DCT_DECODE, bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceRGB.INSTANCE);
        if (bitmap.hasAlpha()) {
            pDImageXObject.getCOSObject().setItem(COSName.SMASK, m32398a(pDDocument, bitmap));
        }
        return pDImageXObject;
    }

    /* renamed from: c */
    public static byte[] m32396c(Bitmap bitmap, float f, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C9947b m32394e = m32394e(byteArrayInputStream);
        return new PDImageXObject(pDDocument, byteArrayInputStream, COSName.DCT_DECODE, m32394e.f60477a, m32394e.f60478b, 8, PDDeviceRGB.INSTANCE);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) throws IOException {
        return createFromImage(pDDocument, bitmap, 0.75f);
    }

    public static PDImageXObject createFromStream(PDDocument pDDocument, InputStream inputStream) throws IOException {
        return createFromByteArray(pDDocument, IOUtils.toByteArray(inputStream));
    }

    /* renamed from: d */
    public static PDImageXObject m32395d(PDDocument pDDocument, byte[] bArr, int i, int i2, int i3, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.FLATE_DECODE;
        filterFactory.getFilter(cOSName).encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, new COSDictionary(), 0);
        return new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i, i2, i3, pDColorSpace);
    }

    /* renamed from: e */
    public static C9947b m32394e(ByteArrayInputStream byteArrayInputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        byteArrayInputStream.reset();
        C9947b c9947b = new C9947b();
        c9947b.f60477a = options.outWidth;
        c9947b.f60478b = options.outHeight;
        return c9947b;
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap, float f) throws IOException {
        return createFromImage(pDDocument, bitmap, f, 72);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap, float f, int i) throws IOException {
        return m32397b(pDDocument, bitmap, f, i);
    }
}
