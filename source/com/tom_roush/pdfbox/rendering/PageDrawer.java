package com.tom_roush.pdfbox.rendering;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.Log;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.function.PDFunction;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDTrueTypeFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType1CFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentMembershipDictionary;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationUnknown;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
public class PageDrawer extends PDFGraphicsStreamEngine {

    /* renamed from: F */
    public static final int f60750F = m32165G();

    /* renamed from: A */
    public final Deque f60751A;

    /* renamed from: B */
    public int f60752B;

    /* renamed from: C */
    public final RenderDestination f60753C;

    /* renamed from: D */
    public final float f60754D;

    /* renamed from: E */
    public AnnotationFilter f60755E;

    /* renamed from: k */
    public final PDFRenderer f60756k;

    /* renamed from: l */
    public final boolean f60757l;

    /* renamed from: m */
    public Paint f60758m;

    /* renamed from: n */
    public Canvas f60759n;

    /* renamed from: o */
    public AffineTransform f60760o;

    /* renamed from: p */
    public float f60761p;

    /* renamed from: q */
    public float f60762q;

    /* renamed from: r */
    public PDRectangle f60763r;

    /* renamed from: s */
    public boolean f60764s;

    /* renamed from: t */
    public Path.FillType f60765t;

    /* renamed from: u */
    public Path f60766u;

    /* renamed from: v */
    public Region f60767v;

    /* renamed from: w */
    public int f60768w;

    /* renamed from: x */
    public List f60769x;

    /* renamed from: y */
    public final Map f60770y;

    /* renamed from: z */
    public PointF f60771z;

    /* renamed from: com.tom_roush.pdfbox.rendering.PageDrawer$a */
    /* loaded from: classes5.dex */
    public class C9974a implements AnnotationFilter {
        public C9974a() {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter
        public boolean accept(PDAnnotation pDAnnotation) {
            return true;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.rendering.PageDrawer$b */
    /* loaded from: classes5.dex */
    public final class C9975b {
        public /* synthetic */ C9975b(PageDrawer pageDrawer, PDTransparencyGroup pDTransparencyGroup, boolean z, Matrix matrix, PDColor pDColor, C9974a c9974a) {
            this(pDTransparencyGroup, z, matrix, pDColor);
        }

        /* renamed from: a */
        public final boolean m32134a(PDColorSpace pDColorSpace) {
            if (pDColorSpace instanceof PDDeviceGray) {
                return true;
            }
            return false;
        }

        public C9975b(PDTransparencyGroup pDTransparencyGroup, boolean z, Matrix matrix, PDColor pDColor) {
            pDTransparencyGroup.getBBox().transform(Matrix.concatenate(matrix, pDTransparencyGroup.getMatrix()));
            AffineTransform affineTransform = PageDrawer.this.f60760o;
            PageDrawer.this.f60760o = AffineTransform.getScaleInstance(PageDrawer.this.f60761p, PageDrawer.this.f60762q);
            m32134a(pDTransparencyGroup.getGroup().getColorSpace(pDTransparencyGroup.getResources()));
            if ((z || pDTransparencyGroup.getGroup().isIsolated() || !PageDrawer.this.m32162J(pDTransparencyGroup, new HashSet())) ? false : true) {
                if (PageDrawer.this.f60751A.isEmpty()) {
                    PageDrawer.this.f60756k.m32174a();
                } else {
                    C9975b c9975b = (C9975b) PageDrawer.this.f60751A.peek();
                }
            }
            boolean z2 = PageDrawer.this.f60764s;
            PageDrawer.this.f60764s = false;
            PDRectangle pDRectangle = PageDrawer.this.f60763r;
            Path.FillType fillType = PageDrawer.this.f60765t;
            PageDrawer.this.f60765t = null;
            Path path = PageDrawer.this.f60766u;
            PageDrawer.this.f60766u = new Path();
            PageDrawer.this.m32156P();
            try {
                if (z) {
                    PageDrawer.this.processSoftMask(pDTransparencyGroup);
                } else {
                    PageDrawer.this.f60751A.push(this);
                    PageDrawer.this.processTransparencyGroup(pDTransparencyGroup);
                    if (!PageDrawer.this.f60751A.isEmpty()) {
                        PageDrawer.this.f60751A.pop();
                    }
                }
                PageDrawer.this.f60764s = z2;
                PageDrawer.this.f60765t = fillType;
                PageDrawer.this.f60766u = path;
                PageDrawer.this.f60763r = pDRectangle;
                PageDrawer.this.f60760o = affineTransform;
            } catch (Throwable th2) {
                PageDrawer.this.f60764s = z2;
                PageDrawer.this.f60765t = fillType;
                PageDrawer.this.f60766u = path;
                PageDrawer.this.f60763r = pDRectangle;
                PageDrawer.this.f60760o = affineTransform;
                throw th2;
            }
        }
    }

    public PageDrawer(PageDrawerParameters pageDrawerParameters) throws IOException {
        super(pageDrawerParameters.getPage());
        this.f60764s = false;
        this.f60765t = null;
        this.f60766u = new Path();
        this.f60768w = 0;
        this.f60770y = new HashMap();
        this.f60771z = new PointF();
        this.f60751A = new ArrayDeque();
        this.f60755E = new C9974a();
        this.f60756k = pageDrawerParameters.m32133a();
        this.f60757l = pageDrawerParameters.isSubsamplingAllowed();
        this.f60753C = pageDrawerParameters.getDestination();
        this.f60754D = pageDrawerParameters.getImageDownscalingOptimizationThreshold();
    }

    /* renamed from: G */
    public static int m32165G() {
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.specification.version"), ".");
        int i = 0;
        try {
            int parseInt = Integer.parseInt(stringTokenizer.nextToken());
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
            }
            if (parseInt == 1) {
                return i;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: A */
    public final InterfaceC22045s60 m32171A(PDFont pDFont) {
        InterfaceC22045s60 interfaceC22045s60;
        InterfaceC22045s60 interfaceC22045s602 = (InterfaceC22045s60) this.f60770y.get(pDFont);
        if (interfaceC22045s602 != null) {
            return interfaceC22045s602;
        }
        if (pDFont instanceof PDTrueTypeFont) {
            interfaceC22045s60 = new C22962xQ1((PDTrueTypeFont) pDFont);
        } else if (pDFont instanceof PDType1Font) {
            interfaceC22045s60 = new PV1((PDType1Font) pDFont);
        } else if (pDFont instanceof PDType1CFont) {
            interfaceC22045s60 = new PV1((PDType1CFont) pDFont);
        } else if (pDFont instanceof PDType0Font) {
            PDType0Font pDType0Font = (PDType0Font) pDFont;
            if (pDType0Font.getDescendantFont() instanceof PDCIDFontType2) {
                interfaceC22045s602 = new C22962xQ1(pDType0Font);
            } else if (pDType0Font.getDescendantFont() instanceof PDCIDFontType0) {
                interfaceC22045s602 = new C10242fg((PDCIDFontType0) pDType0Font.getDescendantFont());
            }
            interfaceC22045s60 = interfaceC22045s602;
        } else {
            throw new IllegalStateException("Bad font type: " + pDFont.getClass().getSimpleName());
        }
        if (interfaceC22045s60 != null) {
            this.f60770y.put(pDFont, interfaceC22045s60);
        }
        if (interfaceC22045s60 != null) {
            return interfaceC22045s60;
        }
        throw new UnsupportedOperationException("No font for " + pDFont.getName());
    }

    /* renamed from: B */
    public final void m32170B(Bitmap bitmap, AffineTransform affineTransform) {
        setClip();
        AffineTransform affineTransform2 = new AffineTransform(affineTransform);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        affineTransform2.scale(1.0d / width, (-1.0d) / height);
        affineTransform2.translate(0.0d, -height);
        if (getGraphicsState().getSoftMask() != null) {
            new RectF(0.0f, 0.0f, width, height);
            return;
        }
        COSBase transfer = getGraphicsState().getTransfer();
        if ((transfer instanceof COSArray) || (transfer instanceof COSDictionary)) {
            bitmap = m32136y(bitmap, transfer);
        }
        this.f60759n.drawBitmap(bitmap, affineTransform2.toMatrix(), this.f60758m);
    }

    /* renamed from: C */
    public final void m32169C(InterfaceC22045s60 interfaceC22045s60, PDFont pDFont, int i, Vector vector, AffineTransform affineTransform) {
        RenderingMode renderingMode = getGraphicsState().getTextState().getRenderingMode();
        Path mo512a = interfaceC22045s60.mo512a(i);
        if (mo512a != null) {
            if (!pDFont.isEmbedded() && !pDFont.isVertical() && !pDFont.isStandard14() && pDFont.hasExplicitWidth(i)) {
                float widthFromFont = pDFont.getWidthFromFont(i);
                if (widthFromFont > 0.0f && Math.abs(widthFromFont - (vector.getX() * 1000.0f)) > 1.0E-4d) {
                    affineTransform.scale((vector.getX() * 1000.0f) / widthFromFont, 1.0d);
                }
            }
            mo512a.transform(affineTransform.toMatrix());
            if (m32160L()) {
                if (renderingMode.isFill()) {
                    this.f60758m.setColor(getNonStrokingColor());
                    setClip();
                    this.f60758m.setStyle(Paint.Style.FILL);
                    this.f60759n.drawPath(mo512a, this.f60758m);
                }
                if (renderingMode.isStroke()) {
                    this.f60758m.setColor(m32164H());
                    m32155Q();
                    setClip();
                    this.f60758m.setStyle(Paint.Style.STROKE);
                    this.f60759n.drawPath(mo512a, this.f60758m);
                }
            }
            renderingMode.isClip();
        }
    }

    /* renamed from: D */
    public final void m32168D() {
        PDGraphicsState graphicsState = getGraphicsState();
        if (graphicsState.getTextState().getRenderingMode().isClip() && !this.f60769x.isEmpty()) {
            Path path = new Path();
            path.setFillType(Path.FillType.WINDING);
            for (Path path2 : this.f60769x) {
                path.addPath(path2);
            }
            graphicsState.intersectClippingPath(path);
            this.f60769x = new ArrayList();
            this.f60767v = null;
        }
    }

    /* renamed from: E */
    public final int m32167E(PDColor pDColor) {
        float[] rgb = pDColor.getColorSpace().toRGB(pDColor.getComponents());
        return Color.rgb(Math.round(rgb[0] * 255.0f), Math.round(rgb[1] * 255.0f), Math.round(rgb[2] * 255.0f));
    }

    /* renamed from: F */
    public final float[] m32166F(PDLineDashPattern pDLineDashPattern) {
        float[] dashArray = pDLineDashPattern.getDashArray();
        int phase = pDLineDashPattern.getPhase();
        if (dashArray.length != 0) {
            float f = phase;
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                int i = 0;
                for (int i2 = 0; i2 < dashArray.length; i2++) {
                    if (Float.isInfinite(dashArray[i2]) || Float.isNaN(dashArray[i2])) {
                        return null;
                    }
                }
                if (f60750F < 10) {
                    while (i < dashArray.length) {
                        float transformWidth = transformWidth(dashArray[i]);
                        if (this.f60761p < 0.5f) {
                            dashArray[i] = Math.max(transformWidth, 0.2f);
                        } else {
                            dashArray[i] = Math.max(transformWidth, 0.062f);
                        }
                        i++;
                    }
                } else {
                    while (i < dashArray.length) {
                        dashArray[i] = transformWidth(dashArray[i]);
                        i++;
                    }
                }
                return dashArray;
            }
        }
        return null;
    }

    /* renamed from: H */
    public final int m32164H() {
        return m32167E(getGraphicsState().getStrokingColor());
    }

    /* renamed from: I */
    public final int m32163I(PDImage pDImage, AffineTransform affineTransform) {
        int floor = (int) Math.floor(Math.sqrt((pDImage.getWidth() * pDImage.getHeight()) / Math.abs(affineTransform.getDeterminant() * this.f60760o.getDeterminant())));
        if (floor > 8) {
            floor = 8;
        }
        if (floor < 1) {
            floor = 1;
        }
        if (floor > pDImage.getWidth() || floor > pDImage.getHeight()) {
            return Math.min(pDImage.getWidth(), pDImage.getHeight());
        }
        return floor;
    }

    /* renamed from: J */
    public final boolean m32162J(PDTransparencyGroup pDTransparencyGroup, Set set) {
        if (set.contains(pDTransparencyGroup.getCOSObject())) {
            return false;
        }
        set.add(pDTransparencyGroup.getCOSObject());
        PDResources resources = pDTransparencyGroup.getResources();
        if (resources == null) {
            return false;
        }
        for (COSName cOSName : resources.getExtGStateNames()) {
            PDExtendedGraphicsState extGState = resources.getExtGState(cOSName);
            if (extGState != null && extGState.getBlendMode() != BlendMode.NORMAL) {
                return true;
            }
        }
        for (COSName cOSName2 : resources.getXObjectNames()) {
            try {
                PDXObject xObject = resources.getXObject(cOSName2);
                if ((xObject instanceof PDTransparencyGroup) && m32162J((PDTransparencyGroup) xObject, set)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m32161K(float[] fArr) {
        if (fArr.length <= 0) {
            return false;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] != 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public final boolean m32160L() {
        if (this.f60752B <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m32159M(PDPropertyList pDPropertyList) {
        if (pDPropertyList instanceof PDOptionalContentGroup) {
            PDOptionalContentGroup pDOptionalContentGroup = (PDOptionalContentGroup) pDPropertyList;
            PDOptionalContentGroup.RenderState renderState = pDOptionalContentGroup.getRenderState(this.f60753C);
            if (renderState == null) {
                if (!getRenderer().isGroupEnabled(pDOptionalContentGroup)) {
                    return true;
                }
                return false;
            } else if (PDOptionalContentGroup.RenderState.OFF.equals(renderState)) {
                return true;
            } else {
                return false;
            }
        } else if (pDPropertyList instanceof PDOptionalContentMembershipDictionary) {
            return m32158N((PDOptionalContentMembershipDictionary) pDPropertyList);
        } else {
            return false;
        }
    }

    /* renamed from: N */
    public final boolean m32158N(PDOptionalContentMembershipDictionary pDOptionalContentMembershipDictionary) {
        pDOptionalContentMembershipDictionary.getCOSObject().getCOSArray(COSName.f59844VE);
        List<PDPropertyList> oCGs = pDOptionalContentMembershipDictionary.getOCGs();
        if (oCGs.isEmpty()) {
            return false;
        }
        ArrayList<Boolean> arrayList = new ArrayList();
        for (PDPropertyList pDPropertyList : oCGs) {
            arrayList.add(Boolean.valueOf(!m32159M(pDPropertyList)));
        }
        COSName visibilityPolicy = pDOptionalContentMembershipDictionary.getVisibilityPolicy();
        if (COSName.ANY_OFF.equals(visibilityPolicy)) {
            for (Boolean bool : arrayList) {
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        } else if (COSName.ALL_ON.equals(visibilityPolicy)) {
            for (Boolean bool2 : arrayList) {
                if (!bool2.booleanValue()) {
                    return true;
                }
            }
            return false;
        } else if (COSName.ALL_OFF.equals(visibilityPolicy)) {
            for (Boolean bool3 : arrayList) {
                if (bool3.booleanValue()) {
                    return true;
                }
            }
            return false;
        } else {
            for (Boolean bool4 : arrayList) {
                if (bool4.booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: O */
    public final boolean m32157O(Path path) {
        return path.isRect(new RectF());
    }

    /* renamed from: P */
    public final void m32156P() {
        this.f60758m.setAntiAlias(true);
    }

    /* renamed from: Q */
    public final void m32155Q() {
        PDGraphicsState graphicsState = getGraphicsState();
        float transformWidth = transformWidth(graphicsState.getLineWidth());
        if (transformWidth < 0.25d) {
            transformWidth = 0.25f;
        }
        PDLineDashPattern lineDashPattern = graphicsState.getLineDashPattern();
        if (m32161K(lineDashPattern.getDashArray())) {
            return;
        }
        float[] m32166F = m32166F(lineDashPattern);
        float transformWidth2 = transformWidth(lineDashPattern.getPhase());
        this.f60758m.setStrokeWidth(transformWidth);
        this.f60758m.setStrokeCap(graphicsState.getLineCap());
        this.f60758m.setStrokeJoin(graphicsState.getLineJoin());
        float miterLimit = graphicsState.getMiterLimit();
        if (miterLimit < 1.0f) {
            Log.w("PdfBox-Android", "Miter limit must be >= 1, value " + miterLimit + " is ignored");
            miterLimit = 10.0f;
        }
        this.f60758m.setStrokeMiter(miterLimit);
        if (m32166F != null) {
            this.f60758m.setPathEffect(new DashPathEffect(m32166F, transformWidth2));
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void appendRectangle(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.f60766u.moveTo(pointF.x, pointF.y);
        this.f60766u.lineTo(pointF2.x, pointF2.y);
        this.f60766u.lineTo(pointF3.x, pointF3.y);
        this.f60766u.lineTo(pointF4.x, pointF4.y);
        this.f60766u.close();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void beginMarkedContentSequence(COSName cOSName, COSDictionary cOSDictionary) {
        int i = this.f60752B;
        if (i > 0) {
            this.f60752B = i + 1;
        } else if (cOSName != null && getPage().getResources() != null && m32159M(getPage().getResources().getProperties(cOSName))) {
            this.f60752B = 1;
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void beginText() throws IOException {
        setClip();
        m32135z();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void clip(Path.FillType fillType) {
        this.f60765t = fillType;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void closePath() {
        this.f60766u.close();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f60771z.set(f5, f6);
        this.f60766u.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void drawImage(PDImage pDImage) throws IOException {
        Bitmap image;
        if (((pDImage instanceof PDImageXObject) && m32159M(((PDImageXObject) pDImage).getOptionalContent())) || !m32160L()) {
            return;
        }
        AffineTransform createAffineTransform = getGraphicsState().getCurrentTransformationMatrix().createAffineTransform();
        if (!pDImage.getInterpolate()) {
            if (this.f60757l) {
                image = pDImage.getImage(null, m32163I(pDImage, createAffineTransform));
            } else {
                image = pDImage.getImage();
            }
            if (image.getWidth() >= Math.round(createAffineTransform.getScaleX())) {
                int i = (image.getHeight() > Math.round(createAffineTransform.getScaleY()) ? 1 : (image.getHeight() == Math.round(createAffineTransform.getScaleY()) ? 0 : -1));
            }
        }
        setClip();
        if (!pDImage.isStencil()) {
            if (this.f60757l) {
                m32170B(pDImage.getImage(null, m32163I(pDImage, createAffineTransform)), createAffineTransform);
            } else {
                m32170B(pDImage.getImage(), createAffineTransform);
            }
        }
        if (!pDImage.getInterpolate()) {
            m32156P();
        }
    }

    public void drawPage(Paint paint, Canvas canvas, PDRectangle pDRectangle) throws IOException {
        this.f60758m = paint;
        this.f60759n = canvas;
        AffineTransform affineTransform = new AffineTransform(canvas.getMatrix());
        this.f60760o = affineTransform;
        Matrix matrix = new Matrix(affineTransform);
        this.f60761p = Math.abs(matrix.getScalingFactorX());
        this.f60762q = Math.abs(matrix.getScalingFactorY());
        this.f60759n.save();
        this.f60763r = pDRectangle;
        m32156P();
        this.f60759n.translate(0.0f, pDRectangle.getHeight());
        this.f60759n.scale(1.0f, -1.0f);
        this.f60759n.translate(-pDRectangle.getLowerLeftX(), -pDRectangle.getLowerLeftY());
        processPage(getPage());
        for (PDAnnotation pDAnnotation : getPage().getAnnotations(this.f60755E)) {
            showAnnotation(pDAnnotation);
        }
        this.f60759n.restore();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void endMarkedContentSequence() {
        int i = this.f60752B;
        if (i > 0) {
            this.f60752B = i - 1;
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void endPath() {
        this.f60766u.reset();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void endText() throws IOException {
        m32168D();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void fillAndStrokePath(Path.FillType fillType) throws IOException {
        Path path = new Path(this.f60766u);
        fillPath(fillType);
        this.f60766u = path;
        strokePath();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void fillPath(Path.FillType fillType) throws IOException {
        getGraphicsState();
        this.f60758m.setColor(getNonStrokingColor());
        setClip();
        this.f60766u.setFillType(fillType);
        RectF rectF = new RectF();
        boolean z = true;
        this.f60766u.computeBounds(rectF, true);
        z = (!m32157O(this.f60766u) || rectF.width() <= 1.0f || rectF.height() <= 1.0f) ? false : false;
        if (z) {
            this.f60758m.setAntiAlias(false);
        }
        if (m32160L()) {
            this.f60758m.setStyle(Paint.Style.FILL);
            this.f60759n.drawPath(this.f60766u, this.f60758m);
        }
        this.f60766u.reset();
        if (z) {
            m32156P();
        }
    }

    public AnnotationFilter getAnnotationFilter() {
        return this.f60755E;
    }

    public final Canvas getCanvas() {
        return this.f60759n;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public PointF getCurrentPoint() {
        return this.f60771z;
    }

    public final Path getLinePath() {
        return this.f60766u;
    }

    public final int getNonStrokingColor() throws IOException {
        return m32167E(getGraphicsState().getNonStrokingColor());
    }

    public final PDFRenderer getRenderer() {
        return this.f60756k;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void lineTo(float f, float f2) {
        this.f60771z.set(f, f2);
        this.f60766u.lineTo(f, f2);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void moveTo(float f, float f2) {
        this.f60771z.set(f, f2);
        this.f60766u.moveTo(f, f2);
    }

    public void setAnnotationFilter(AnnotationFilter annotationFilter) {
        this.f60755E = annotationFilter;
    }

    public final void setClip() {
        Region currentClippingPath = getGraphicsState().getCurrentClippingPath();
        if (currentClippingPath != this.f60767v) {
            int i = this.f60768w;
            if (i >= 1) {
                this.f60759n.restoreToCount(i);
            }
            this.f60768w = this.f60759n.save();
            if (!currentClippingPath.isEmpty()) {
                this.f60759n.clipPath(currentClippingPath.getBoundaryPath());
            }
            this.f60767v = currentClippingPath;
        }
    }

    public void setStroke(Paint paint, float f, Paint.Cap cap, Paint.Join join, float f2, float[] fArr, float f3) {
        paint.setStrokeWidth(f);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f2);
        if (fArr != null) {
            paint.setPathEffect(new DashPathEffect(fArr, f3));
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void shadingFill(COSName cOSName) throws IOException {
        RectF bounds;
        if (!m32160L()) {
            return;
        }
        PDShading shading = getResources().getShading(cOSName);
        if (shading == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("shading ");
            sb.append(cOSName);
            sb.append(" does not exist in resources dictionary");
            return;
        }
        Matrix currentTransformationMatrix = getGraphicsState().getCurrentTransformationMatrix();
        if (shading.getBBox() == null && (bounds = shading.getBounds(new AffineTransform(), currentTransformationMatrix)) != null) {
            bounds.union((float) Math.floor(bounds.left - 1.0f), (float) Math.floor(bounds.top - 1.0f));
            bounds.union((float) Math.ceil(bounds.right + 1.0f), (float) Math.ceil(bounds.bottom + 1.0f));
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showAnnotation(PDAnnotation pDAnnotation) throws IOException {
        this.f60767v = null;
        if (pDAnnotation.isNoView() || pDAnnotation.isHidden()) {
            return;
        }
        if ((pDAnnotation.isInvisible() && (pDAnnotation instanceof PDAnnotationUnknown)) || m32159M(pDAnnotation.getOptionalContent())) {
            return;
        }
        PDAppearanceDictionary appearance = pDAnnotation.getAppearance();
        if (appearance == null || appearance.getNormalAppearance() == null) {
            pDAnnotation.constructAppearances(this.f60756k.document);
        }
        if (pDAnnotation.isNoRotate() && getCurrentPage().getRotation() != 0) {
            PDRectangle rectangle = pDAnnotation.getRectangle();
            android.graphics.Matrix matrix = this.f60759n.getMatrix();
            this.f60759n.rotate(getCurrentPage().getRotation(), rectangle.getLowerLeftX(), rectangle.getUpperRightY());
            super.showAnnotation(pDAnnotation);
            this.f60759n.setMatrix(matrix);
            return;
        }
        super.showAnnotation(pDAnnotation);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showFontGlyph(Matrix matrix, PDFont pDFont, int i, Vector vector) throws IOException {
        AffineTransform createAffineTransform = matrix.createAffineTransform();
        createAffineTransform.concatenate(pDFont.getFontMatrix().createAffineTransform());
        m32169C(m32171A(pDFont), pDFont, i, vector, createAffineTransform);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showForm(PDFormXObject pDFormXObject) throws IOException {
        if (!m32159M(pDFormXObject.getOptionalContent()) && m32160L()) {
            Path path = new Path(this.f60766u);
            this.f60766u = new Path();
            super.showForm(pDFormXObject);
            this.f60766u = path;
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showTransparencyGroup(PDTransparencyGroup pDTransparencyGroup) throws IOException {
        showTransparencyGroupOnCanvas(pDTransparencyGroup, this.f60759n);
    }

    public void showTransparencyGroupOnCanvas(PDTransparencyGroup pDTransparencyGroup, Canvas canvas) throws IOException {
        if (m32159M(pDTransparencyGroup.getOptionalContent()) || !m32160L()) {
            return;
        }
        new C9975b(this, pDTransparencyGroup, false, getGraphicsState().getCurrentTransformationMatrix(), null, null);
        setClip();
        new AffineTransform(this.f60760o).scale(1.0d / this.f60761p, 1.0d / this.f60762q);
        getGraphicsState().getSoftMask();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showType3Glyph(Matrix matrix, PDType3Font pDType3Font, int i, Vector vector) throws IOException {
        if (!RenderingMode.NEITHER.equals(getGraphicsState().getTextState().getRenderingMode())) {
            super.showType3Glyph(matrix, pDType3Font, i, vector);
        }
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine
    public void strokePath() throws IOException {
        if (m32160L()) {
            m32155Q();
            this.f60758m.setStyle(Paint.Style.STROKE);
            this.f60758m.setColor(m32164H());
            setClip();
            this.f60759n.drawPath(this.f60766u, this.f60758m);
        }
        this.f60766u.reset();
    }

    /* renamed from: y */
    public final Bitmap m32136y(Bitmap bitmap, COSBase cOSBase) {
        PDFunction create;
        Integer[] numArr;
        PDFunction pDFunction;
        PDFunction pDFunction2;
        Integer[] numArr2;
        Integer[] numArr3;
        int i;
        int i2;
        int i3;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (cOSBase instanceof COSArray) {
            COSArray cOSArray = (COSArray) cOSBase;
            create = PDFunction.create(cOSArray.getObject(0));
            pDFunction2 = PDFunction.create(cOSArray.getObject(1));
            pDFunction = PDFunction.create(cOSArray.getObject(2));
            numArr = new Integer[256];
            numArr3 = new Integer[256];
            numArr2 = new Integer[256];
        } else {
            create = PDFunction.create(cOSBase);
            numArr = new Integer[256];
            pDFunction = create;
            pDFunction2 = pDFunction;
            numArr2 = numArr;
            numArr3 = numArr2;
        }
        float[] fArr = new float[1];
        for (int i4 = 0; i4 < bitmap.getWidth(); i4++) {
            for (int i5 = 0; i5 < bitmap.getHeight(); i5++) {
                int pixel = bitmap.getPixel(i4, i5);
                int i6 = pixel >> 16;
                int i7 = i6 & 255;
                int i8 = pixel >> 8;
                int i9 = i8 & 255;
                int i10 = pixel & 255;
                Integer num = numArr[i7];
                if (num != null) {
                    i = num.intValue();
                } else {
                    fArr[0] = (i6 & 255) / 255.0f;
                    i = (int) (create.eval(fArr)[0] * 255.0f);
                    numArr[i7] = Integer.valueOf(i);
                }
                Integer num2 = numArr3[i9];
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    fArr[0] = (i8 & 255) / 255.0f;
                    int i11 = (int) (pDFunction2.eval(fArr)[0] * 255.0f);
                    numArr3[i9] = Integer.valueOf(i11);
                    i2 = i11;
                }
                Integer num3 = numArr2[i10];
                if (num3 != null) {
                    i3 = num3.intValue();
                } else {
                    fArr[0] = (pixel & 255) / 255.0f;
                    int i12 = (int) (pDFunction.eval(fArr)[0] * 255.0f);
                    numArr2[i10] = Integer.valueOf(i12);
                    i3 = i12;
                }
                createBitmap.setPixel(i4, i5, (i2 << 8) | (pixel & (-16777216)) | (i << 16) | i3);
            }
        }
        return createBitmap;
    }

    /* renamed from: z */
    public final void m32135z() {
        this.f60769x = new ArrayList();
    }
}
