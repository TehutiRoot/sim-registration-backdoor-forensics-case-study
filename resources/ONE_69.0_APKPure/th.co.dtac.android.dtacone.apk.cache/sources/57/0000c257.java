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
    public static class C9936b {

        /* renamed from: a */
        public int f60489a;

        /* renamed from: b */
        public int f60490b;

        public C9936b() {
        }
    }

    /* renamed from: a */
    public static PDImageXObject m32390a(PDDocument pDDocument, Bitmap bitmap) {
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
        return m32387d(pDDocument, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE);
    }

    /* renamed from: b */
    public static PDImageXObject m32389b(PDDocument pDDocument, Bitmap bitmap, float f, int i) {
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(m32388c(bitmap, f, i)), COSName.DCT_DECODE, bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceRGB.INSTANCE);
        if (bitmap.hasAlpha()) {
            pDImageXObject.getCOSObject().setItem(COSName.SMASK, m32390a(pDDocument, bitmap));
        }
        return pDImageXObject;
    }

    /* renamed from: c */
    public static byte[] m32388c(Bitmap bitmap, float f, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C9936b m32386e = m32386e(byteArrayInputStream);
        return new PDImageXObject(pDDocument, byteArrayInputStream, COSName.DCT_DECODE, m32386e.f60489a, m32386e.f60490b, 8, PDDeviceRGB.INSTANCE);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) throws IOException {
        return createFromImage(pDDocument, bitmap, 0.75f);
    }

    public static PDImageXObject createFromStream(PDDocument pDDocument, InputStream inputStream) throws IOException {
        return createFromByteArray(pDDocument, IOUtils.toByteArray(inputStream));
    }

    /* renamed from: d */
    public static PDImageXObject m32387d(PDDocument pDDocument, byte[] bArr, int i, int i2, int i3, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.FLATE_DECODE;
        filterFactory.getFilter(cOSName).encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, new COSDictionary(), 0);
        return new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i, i2, i3, pDColorSpace);
    }

    /* renamed from: e */
    public static C9936b m32386e(ByteArrayInputStream byteArrayInputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        byteArrayInputStream.reset();
        C9936b c9936b = new C9936b();
        c9936b.f60489a = options.outWidth;
        c9936b.f60490b = options.outHeight;
        return c9936b;
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap, float f) throws IOException {
        return createFromImage(pDDocument, bitmap, f, 72);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap, float f, int i) throws IOException {
        return m32389b(pDDocument, bitmap, f, i);
    }
}