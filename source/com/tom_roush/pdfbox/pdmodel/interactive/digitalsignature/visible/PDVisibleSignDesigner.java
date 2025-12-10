package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.stetho.dumpapp.Framer;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDVisibleSignDesigner {

    /* renamed from: a */
    public Float f60675a;

    /* renamed from: b */
    public Float f60676b;

    /* renamed from: c */
    public float f60677c;

    /* renamed from: d */
    public float f60678d;

    /* renamed from: e */
    public float f60679e;

    /* renamed from: f */
    public float f60680f;

    /* renamed from: g */
    public Bitmap f60681g;

    /* renamed from: l */
    public float f60686l;

    /* renamed from: h */
    public String f60682h = "sig";

    /* renamed from: i */
    public byte[] f60683i = {0, 0, 100, Framer.STDERR_FRAME_PREFIX};

    /* renamed from: j */
    public int[] f60684j = {0, 0, 100, 50};

    /* renamed from: k */
    public AffineTransform f60685k = new AffineTransform();

    /* renamed from: m */
    public int f60687m = 0;

    public PDVisibleSignDesigner(String str, InputStream inputStream, int i) throws IOException {
        m32276e(inputStream);
        m32279b(str, i);
    }

    /* renamed from: a */
    public final void m32280a(PDDocument pDDocument, int i) {
        if (i >= 1) {
            PDPage page = pDDocument.getPage(i - 1);
            PDRectangle mediaBox = page.getMediaBox();
            m32277d(mediaBox.getHeight());
            this.f60680f = mediaBox.getWidth();
            this.f60686l = 100.0f;
            this.f60687m = page.getRotation() % 360;
            return;
        }
        throw new IllegalArgumentException("First page of pdf is 1, not " + i);
    }

    public PDVisibleSignDesigner adjustForRotation() {
        int i = this.f60687m;
        if (i != 90) {
            if (i != 180) {
                if (i == 270) {
                    float f = this.f60677c;
                    this.f60677c = (this.f60680f - this.f60678d) - this.f60676b.floatValue();
                    this.f60678d = f;
                    this.f60685k = new AffineTransform(0.0f, (-this.f60676b.floatValue()) / this.f60675a.floatValue(), this.f60675a.floatValue() / this.f60676b.floatValue(), 0.0f, 0.0f, this.f60676b.floatValue());
                    Float f2 = this.f60676b;
                    f2.floatValue();
                    this.f60676b = this.f60675a;
                    this.f60675a = f2;
                }
            } else {
                this.f60677c = (this.f60680f - this.f60677c) - this.f60675a.floatValue();
                this.f60678d = (this.f60679e - this.f60678d) - this.f60676b.floatValue();
                this.f60685k = new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, this.f60675a.floatValue(), this.f60676b.floatValue());
            }
        } else {
            float f3 = this.f60678d;
            this.f60678d = (this.f60679e - this.f60677c) - this.f60675a.floatValue();
            this.f60677c = f3;
            this.f60685k = new AffineTransform(0.0f, this.f60676b.floatValue() / this.f60675a.floatValue(), (-this.f60675a.floatValue()) / this.f60676b.floatValue(), 0.0f, this.f60675a.floatValue(), 0.0f);
            Float f4 = this.f60676b;
            f4.floatValue();
            this.f60676b = this.f60675a;
            this.f60675a = f4;
        }
        return this;
    }

    @Deprecated
    public PDVisibleSignDesigner affineTransformParams(byte[] bArr) {
        this.f60685k = new AffineTransform(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5]);
        return this;
    }

    /* renamed from: b */
    public final void m32279b(String str, int i) {
        PDDocument load = PDDocument.load(new File(str));
        m32280a(load, i);
        load.close();
    }

    /* renamed from: c */
    public final void m32278c(InputStream inputStream, int i) {
        PDDocument load = PDDocument.load(inputStream);
        m32280a(load, i);
        load.close();
    }

    public PDVisibleSignDesigner coordinates(float f, float f2) {
        xAxis(f);
        yAxis(f2);
        return this;
    }

    /* renamed from: d */
    public final PDVisibleSignDesigner m32277d(float f) {
        this.f60679e = f;
        return this;
    }

    /* renamed from: e */
    public final void m32276e(InputStream inputStream) {
        m32275f(BitmapFactory.decodeStream(inputStream));
    }

    /* renamed from: f */
    public final void m32275f(Bitmap bitmap) {
        this.f60681g = bitmap;
        this.f60676b = Float.valueOf(bitmap.getHeight());
        this.f60675a = Float.valueOf(bitmap.getWidth());
        this.f60684j[2] = bitmap.getWidth();
        this.f60684j[3] = bitmap.getHeight();
    }

    public PDVisibleSignDesigner formatterRectangleParameters(int[] iArr) {
        this.f60684j = iArr;
        return this;
    }

    @Deprecated
    public PDVisibleSignDesigner formatterRectangleParams(byte[] bArr) {
        this.f60683i = bArr;
        return this;
    }

    @Deprecated
    public byte[] getAffineTransformParams() {
        return new byte[]{(byte) this.f60685k.getScaleX(), (byte) this.f60685k.getShearY(), (byte) this.f60685k.getShearX(), (byte) this.f60685k.getScaleY(), (byte) this.f60685k.getTranslateX(), (byte) this.f60685k.getTranslateY()};
    }

    public int[] getFormatterRectangleParameters() {
        return this.f60684j;
    }

    @Deprecated
    public byte[] getFormatterRectangleParams() {
        return this.f60683i;
    }

    public float getHeight() {
        return this.f60676b.floatValue();
    }

    public Bitmap getImage() {
        return this.f60681g;
    }

    public float getImageSizeInPercents() {
        return this.f60686l;
    }

    public float getPageHeight() {
        return this.f60679e;
    }

    public float getPageWidth() {
        return this.f60680f;
    }

    public String getSignatureFieldName() {
        return this.f60682h;
    }

    public String getSignatureText() {
        throw new UnsupportedOperationException("That method is not yet implemented");
    }

    public float getTemplateHeight() {
        return getPageHeight();
    }

    public AffineTransform getTransform() {
        return this.f60685k;
    }

    public float getWidth() {
        return this.f60675a.floatValue();
    }

    public float getxAxis() {
        return this.f60677c;
    }

    public float getyAxis() {
        return this.f60678d;
    }

    public PDVisibleSignDesigner height(float f) {
        this.f60676b = Float.valueOf(f);
        this.f60684j[3] = (int) f;
        return this;
    }

    public void imageSizeInPercents(float f) {
        this.f60686l = f;
    }

    public PDVisibleSignDesigner pageWidth(float f) {
        this.f60680f = f;
        return this;
    }

    public PDVisibleSignDesigner signatureFieldName(String str) {
        this.f60682h = str;
        return this;
    }

    public PDVisibleSignDesigner signatureImage(String str) throws IOException {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            m32276e(bufferedInputStream);
            IOUtils.closeQuietly(bufferedInputStream);
            return this;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            IOUtils.closeQuietly(bufferedInputStream2);
            throw th;
        }
    }

    public PDVisibleSignDesigner signatureText(String str) {
        throw new UnsupportedOperationException("That method is not yet implemented");
    }

    public PDVisibleSignDesigner transform(AffineTransform affineTransform) {
        this.f60685k = new AffineTransform(affineTransform);
        return this;
    }

    public PDVisibleSignDesigner width(float f) {
        this.f60675a = Float.valueOf(f);
        this.f60684j[2] = (int) f;
        return this;
    }

    public PDVisibleSignDesigner xAxis(float f) {
        this.f60677c = f;
        return this;
    }

    public PDVisibleSignDesigner yAxis(float f) {
        this.f60678d = f;
        return this;
    }

    public PDVisibleSignDesigner zoom(float f) {
        this.f60676b = Float.valueOf(this.f60676b.floatValue() + ((this.f60676b.floatValue() * f) / 100.0f));
        Float valueOf = Float.valueOf(this.f60675a.floatValue() + ((this.f60675a.floatValue() * f) / 100.0f));
        this.f60675a = valueOf;
        this.f60684j[2] = (int) valueOf.floatValue();
        this.f60684j[3] = (int) this.f60676b.floatValue();
        return this;
    }

    public PDVisibleSignDesigner(InputStream inputStream, InputStream inputStream2, int i) throws IOException {
        m32276e(inputStream2);
        m32278c(inputStream, i);
    }

    public PDVisibleSignDesigner(PDDocument pDDocument, InputStream inputStream, int i) throws IOException {
        m32276e(inputStream);
        m32280a(pDDocument, i);
    }

    public PDVisibleSignDesigner(String str, Bitmap bitmap, int i) throws IOException {
        m32275f(bitmap);
        m32279b(str, i);
    }

    public PDVisibleSignDesigner(InputStream inputStream, Bitmap bitmap, int i) throws IOException {
        m32275f(bitmap);
        m32278c(inputStream, i);
    }

    public PDVisibleSignDesigner(PDDocument pDDocument, Bitmap bitmap, int i) {
        m32275f(bitmap);
        m32280a(pDDocument, i);
    }

    public PDVisibleSignDesigner(InputStream inputStream) throws IOException {
        m32276e(inputStream);
    }
}
