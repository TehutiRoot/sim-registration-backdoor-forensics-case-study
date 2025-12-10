package com.tom_roush.pdfbox.rendering;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageTree;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDFRenderer {

    /* renamed from: c */
    public RenderDestination f60745c;

    /* renamed from: d */
    public Bitmap f60746d;
    protected final PDDocument document;

    /* renamed from: f */
    public final PDPageTree f60748f;

    /* renamed from: a */
    public AnnotationFilter f60743a = new C9973a();

    /* renamed from: b */
    public boolean f60744b = false;

    /* renamed from: e */
    public float f60747e = 0.5f;

    /* renamed from: com.tom_roush.pdfbox.rendering.PDFRenderer$a */
    /* loaded from: classes5.dex */
    public class C9973a implements AnnotationFilter {
        public C9973a() {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter
        public boolean accept(PDAnnotation pDAnnotation) {
            return true;
        }
    }

    public PDFRenderer(PDDocument pDDocument) {
        this.document = pDDocument;
        this.f60748f = pDDocument.getPages();
    }

    /* renamed from: a */
    public Bitmap m32174a() {
        return this.f60746d;
    }

    /* renamed from: b */
    public final boolean m32173b(PDPage pDPage) {
        PDResources resources = pDPage.getResources();
        if (resources == null) {
            return false;
        }
        for (COSName cOSName : resources.getExtGStateNames()) {
            PDExtendedGraphicsState extGState = resources.getExtGState(cOSName);
            if (extGState != null && extGState.getBlendMode() != BlendMode.NORMAL) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m32172c(Canvas canvas, PDPage pDPage, float f, float f2) {
        float f3;
        canvas.scale(f, f2);
        int rotation = pDPage.getRotation();
        if (rotation != 0) {
            PDRectangle cropBox = pDPage.getCropBox();
            float f4 = 0.0f;
            if (rotation != 90) {
                if (rotation != 180) {
                    if (rotation == 270) {
                        f3 = cropBox.getWidth();
                    }
                } else {
                    f4 = cropBox.getWidth();
                    f3 = cropBox.getHeight();
                }
                canvas.translate(f4, f3);
                canvas.rotate(rotation);
            }
            f4 = cropBox.getHeight();
            f3 = 0.0f;
            canvas.translate(f4, f3);
            canvas.rotate(rotation);
        }
    }

    public PageDrawer createPageDrawer(PageDrawerParameters pageDrawerParameters) throws IOException {
        PageDrawer pageDrawer = new PageDrawer(pageDrawerParameters);
        pageDrawer.setAnnotationFilter(this.f60743a);
        return pageDrawer;
    }

    public AnnotationFilter getAnnotationsFilter() {
        return this.f60743a;
    }

    public RenderDestination getDefaultDestination() {
        return this.f60745c;
    }

    public float getImageDownscalingOptimizationThreshold() {
        return this.f60747e;
    }

    public boolean isGroupEnabled(PDOptionalContentGroup pDOptionalContentGroup) {
        PDOptionalContentProperties oCProperties = this.document.getDocumentCatalog().getOCProperties();
        if (oCProperties != null && !oCProperties.isGroupEnabled(pDOptionalContentGroup)) {
            return false;
        }
        return true;
    }

    public boolean isSubsamplingAllowed() {
        return this.f60744b;
    }

    public Bitmap renderImage(int i) throws IOException {
        return renderImage(i, 1.0f);
    }

    public Bitmap renderImageWithDPI(int i, float f) throws IOException {
        return renderImage(i, f / 72.0f, ImageType.RGB);
    }

    public void renderPageToGraphics(int i, Paint paint, Canvas canvas) throws IOException {
        renderPageToGraphics(i, paint, canvas, 1.0f);
    }

    public void setAnnotationsFilter(AnnotationFilter annotationFilter) {
        this.f60743a = annotationFilter;
    }

    public void setDefaultDestination(RenderDestination renderDestination) {
        this.f60745c = renderDestination;
    }

    public void setImageDownscalingOptimizationThreshold(float f) {
        this.f60747e = f;
    }

    public void setSubsamplingAllowed(boolean z) {
        this.f60744b = z;
    }

    public Bitmap renderImage(int i, float f) throws IOException {
        return renderImage(i, f, ImageType.RGB);
    }

    public Bitmap renderImageWithDPI(int i, float f, ImageType imageType) throws IOException {
        return renderImage(i, f / 72.0f, imageType);
    }

    public void renderPageToGraphics(int i, Paint paint, Canvas canvas, float f) throws IOException {
        renderPageToGraphics(i, paint, canvas, f, f);
    }

    public Bitmap renderImage(int i, float f, ImageType imageType) throws IOException {
        RenderDestination renderDestination = this.f60745c;
        if (renderDestination == null) {
            renderDestination = RenderDestination.EXPORT;
        }
        return renderImage(i, f, imageType, renderDestination);
    }

    public void renderPageToGraphics(int i, Paint paint, Canvas canvas, float f, float f2) throws IOException {
        RenderDestination renderDestination = this.f60745c;
        if (renderDestination == null) {
            renderDestination = RenderDestination.VIEW;
        }
        renderPageToGraphics(i, paint, canvas, f, f2, renderDestination);
    }

    public Bitmap renderImage(int i, float f, ImageType imageType, RenderDestination renderDestination) throws IOException {
        Bitmap.Config bitmapConfig;
        Bitmap createBitmap;
        PDPage pDPage = this.f60748f.get(i);
        PDRectangle cropBox = pDPage.getCropBox();
        float width = cropBox.getWidth();
        float height = cropBox.getHeight();
        int max = (int) Math.max(Math.floor(width * f), 1.0d);
        int max2 = (int) Math.max(Math.floor(height * f), 1.0d);
        if (max * max2 <= 2147483647L) {
            int rotation = pDPage.getRotation();
            ImageType imageType2 = ImageType.ARGB;
            if (imageType != imageType2 && m32173b(pDPage)) {
                bitmapConfig = Bitmap.Config.ARGB_8888;
            } else {
                bitmapConfig = imageType.toBitmapConfig();
            }
            if (rotation != 90 && rotation != 270) {
                createBitmap = Bitmap.createBitmap(max, max2, bitmapConfig);
            } else {
                createBitmap = Bitmap.createBitmap(max2, max, bitmapConfig);
            }
            Bitmap bitmap = createBitmap;
            this.f60746d = bitmap;
            Paint paint = new Paint();
            Canvas canvas = new Canvas(bitmap);
            if (imageType == imageType2) {
                paint.setColor(0);
            } else {
                paint.setColor(-1);
            }
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
            paint.reset();
            m32172c(canvas, pDPage, f, f);
            createPageDrawer(new PageDrawerParameters(this, pDPage, this.f60744b, renderDestination, this.f60747e)).drawPage(paint, canvas, pDPage.getCropBox());
            if (bitmap.getConfig() != imageType.toBitmapConfig()) {
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), imageType.toBitmapConfig());
                Canvas canvas2 = new Canvas(createBitmap2);
                paint.setColor(-1);
                paint.setStyle(style);
                canvas2.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return createBitmap2;
            }
            return bitmap;
        }
        throw new IOException("Maximum size of image exceeded (w * h * scale ^ 2) = " + width + " * " + height + " * " + f + " ^ 2 > 2147483647");
    }

    public void renderPageToGraphics(int i, Paint paint, Canvas canvas, float f, float f2, RenderDestination renderDestination) throws IOException {
        PDPage pDPage = this.f60748f.get(i);
        m32172c(canvas, pDPage, f, f2);
        PDRectangle cropBox = pDPage.getCropBox();
        canvas.drawRect(0.0f, 0.0f, cropBox.getWidth(), cropBox.getHeight(), paint);
        createPageDrawer(new PageDrawerParameters(this, pDPage, this.f60744b, renderDestination, this.f60747e)).drawPage(paint, canvas, cropBox);
    }
}
