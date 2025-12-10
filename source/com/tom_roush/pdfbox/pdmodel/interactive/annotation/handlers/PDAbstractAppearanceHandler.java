package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class PDAbstractAppearanceHandler implements PDAppearanceHandler {

    /* renamed from: a */
    public final PDAnnotation f60592a;
    protected PDDocument document;
    protected static final Set<String> SHORT_STYLES = m32355e();

    /* renamed from: b */
    public static final double f60591b = Math.toRadians(30.0d);
    protected static final Set<String> INTERIOR_COLOR_STYLES = m32356d();
    protected static final Set<String> ANGLED_STYLES = m32357c();

    public PDAbstractAppearanceHandler(PDAnnotation pDAnnotation) {
        this(pDAnnotation, null);
    }

    /* renamed from: c */
    public static Set m32357c() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add(PDAnnotationLine.LE_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_R_CLOSED_ARROW);
        hashSet.add(PDAnnotationLine.LE_R_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_BUTT);
        hashSet.add(PDAnnotationLine.LE_SLASH);
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: d */
    public static Set m32356d() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add("Circle");
        hashSet.add(PDAnnotationLine.LE_DIAMOND);
        hashSet.add(PDAnnotationLine.LE_R_CLOSED_ARROW);
        hashSet.add("Square");
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    public static Set m32355e() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add("Square");
        hashSet.add("Circle");
        hashSet.add(PDAnnotationLine.LE_DIAMOND);
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public PDRectangle m32359a(PDRectangle pDRectangle, float[] fArr) {
        if (fArr != null && fArr.length == 4) {
            return new PDRectangle(pDRectangle.getLowerLeftX() - fArr[0], pDRectangle.getLowerLeftY() - fArr[1], pDRectangle.getWidth() + fArr[0] + fArr[2], pDRectangle.getHeight() + fArr[1] + fArr[3]);
        }
        return pDRectangle;
    }

    /* renamed from: b */
    public PDRectangle m32358b(PDRectangle pDRectangle, float[] fArr) {
        if (fArr != null && fArr.length == 4) {
            return new PDRectangle(pDRectangle.getLowerLeftX() + fArr[0], pDRectangle.getLowerLeftY() + fArr[1], (pDRectangle.getWidth() - fArr[0]) - fArr[2], (pDRectangle.getHeight() - fArr[1]) - fArr[3]);
        }
        return pDRectangle;
    }

    public COSStream createCOSStream() {
        PDDocument pDDocument = this.document;
        if (pDDocument == null) {
            return new COSStream();
        }
        return pDDocument.getDocument().createCOSStream();
    }

    /* renamed from: f */
    public void m32354f(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
        double d = f60591b;
        double d2 = f3;
        float cos = ((float) (Math.cos(d) * d2)) + f;
        float sin = (float) (Math.sin(d) * d2);
        pDAppearanceContentStream.moveTo(cos, f2 + sin);
        pDAppearanceContentStream.lineTo(f, f2);
        pDAppearanceContentStream.lineTo(cos, f2 - sin);
    }

    /* renamed from: g */
    public void m32353g(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
        float f4 = f3 * 0.551784f;
        float f5 = f2 + f3;
        pDAppearanceContentStream.moveTo(f, f5);
        float f6 = f + f4;
        float f7 = f + f3;
        float f8 = f2 + f4;
        pDAppearanceContentStream.curveTo(f6, f5, f7, f8, f7, f2);
        float f9 = f2 - f4;
        float f10 = f2 - f3;
        pDAppearanceContentStream.curveTo(f7, f9, f6, f10, f, f10);
        float f11 = f - f4;
        float f12 = f - f3;
        pDAppearanceContentStream.curveTo(f11, f10, f12, f9, f12, f2);
        pDAppearanceContentStream.curveTo(f12, f8, f11, f5, f, f5);
        pDAppearanceContentStream.closePath();
    }

    /* renamed from: h */
    public void m32352h(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
        float f4 = f3 * 0.551784f;
        float f5 = f2 + f3;
        pDAppearanceContentStream.moveTo(f, f5);
        float f6 = f - f4;
        float f7 = f - f3;
        float f8 = f2 + f4;
        pDAppearanceContentStream.curveTo(f6, f5, f7, f8, f7, f2);
        float f9 = f2 - f4;
        float f10 = f2 - f3;
        pDAppearanceContentStream.curveTo(f7, f9, f6, f10, f, f10);
        float f11 = f4 + f;
        float f12 = f + f3;
        pDAppearanceContentStream.curveTo(f11, f10, f12, f9, f12, f2);
        pDAppearanceContentStream.curveTo(f12, f8, f11, f5, f, f5);
        pDAppearanceContentStream.closePath();
    }

    /* renamed from: i */
    public void m32351i(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
        pDAppearanceContentStream.moveTo(f - f3, f2);
        pDAppearanceContentStream.lineTo(f, f2 + f3);
        pDAppearanceContentStream.lineTo(f + f3, f2);
        pDAppearanceContentStream.lineTo(f, f2 - f3);
        pDAppearanceContentStream.closePath();
    }

    /* renamed from: j */
    public void m32350j(String str, PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4 = true;
        if (z3) {
            i = -1;
        } else {
            i = 1;
        }
        if (!PDAnnotationLine.LE_OPEN_ARROW.equals(str) && !PDAnnotationLine.LE_CLOSED_ARROW.equals(str)) {
            if (PDAnnotationLine.LE_BUTT.equals(str)) {
                float f4 = f3 * 3.0f;
                pDAppearanceContentStream.moveTo(f, f2 - f4);
                pDAppearanceContentStream.lineTo(f, f2 + f4);
            } else if (PDAnnotationLine.LE_DIAMOND.equals(str)) {
                m32351i(pDAppearanceContentStream, f, f2, f3 * 3.0f);
            } else if ("Square".equals(str)) {
                float f5 = f3 * 3.0f;
                float f6 = f - f5;
                float f7 = f2 - f5;
                float f8 = 6.0f * f3;
                pDAppearanceContentStream.addRect(f6, f7, f8, f8);
            } else if ("Circle".equals(str)) {
                m32353g(pDAppearanceContentStream, f, f2, f3 * 3.0f);
            } else if (!PDAnnotationLine.LE_R_OPEN_ARROW.equals(str) && !PDAnnotationLine.LE_R_CLOSED_ARROW.equals(str)) {
                if (PDAnnotationLine.LE_SLASH.equals(str)) {
                    double d = f3 * 9.0f;
                    pDAppearanceContentStream.moveTo(((float) (Math.cos(Math.toRadians(60.0d)) * d)) + f, ((float) (Math.sin(Math.toRadians(60.0d)) * d)) + f2);
                    pDAppearanceContentStream.lineTo(f + ((float) (Math.cos(Math.toRadians(240.0d)) * d)), f2 + ((float) (Math.sin(Math.toRadians(240.0d)) * d)));
                }
            } else {
                float f9 = (-i) * f3;
                m32354f(pDAppearanceContentStream, f + f9, f2, f9 * 9.0f);
            }
        } else {
            float f10 = i * f3;
            m32354f(pDAppearanceContentStream, f + f10, f2, f10 * 9.0f);
        }
        if (PDAnnotationLine.LE_R_CLOSED_ARROW.equals(str) || PDAnnotationLine.LE_CLOSED_ARROW.equals(str)) {
            pDAppearanceContentStream.closePath();
        }
        pDAppearanceContentStream.drawShape(f3, z, (INTERIOR_COLOR_STYLES.contains(str) && z2) ? false : false);
    }

    /* renamed from: k */
    public PDAnnotation m32349k() {
        return this.f60592a;
    }

    /* renamed from: l */
    public PDAppearanceDictionary m32348l() {
        PDAppearanceDictionary appearance = this.f60592a.getAppearance();
        if (appearance == null) {
            PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary();
            this.f60592a.setAppearance(pDAppearanceDictionary);
            return pDAppearanceDictionary;
        }
        return appearance;
    }

    /* renamed from: m */
    public final PDAppearanceContentStream m32347m(PDAppearanceEntry pDAppearanceEntry, boolean z) {
        PDAppearanceStream appearanceStream = pDAppearanceEntry.getAppearanceStream();
        m32338v(appearanceStream);
        if (appearanceStream.getResources() == null) {
            appearanceStream.setResources(new PDResources());
        }
        return new PDAppearanceContentStream(appearanceStream, z);
    }

    /* renamed from: n */
    public PDColor m32346n() {
        return this.f60592a.getColor();
    }

    /* renamed from: o */
    public final PDAppearanceEntry m32345o() {
        PDAppearanceDictionary m32348l = m32348l();
        PDAppearanceEntry normalAppearance = m32348l.getNormalAppearance();
        if (normalAppearance == null || normalAppearance.isSubDictionary()) {
            PDAppearanceEntry pDAppearanceEntry = new PDAppearanceEntry(createCOSStream());
            m32348l.setNormalAppearance(pDAppearanceEntry);
            return pDAppearanceEntry;
        }
        return normalAppearance;
    }

    /* renamed from: p */
    public PDAppearanceContentStream m32344p() {
        return m32343q(false);
    }

    /* renamed from: q */
    public PDAppearanceContentStream m32343q(boolean z) {
        return m32347m(m32345o(), z);
    }

    /* renamed from: r */
    public PDRectangle m32342r(PDRectangle pDRectangle, float f) {
        float lowerLeftX = pDRectangle.getLowerLeftX() + f;
        float lowerLeftY = pDRectangle.getLowerLeftY() + f;
        float f2 = f * 2.0f;
        return new PDRectangle(lowerLeftX, lowerLeftY, pDRectangle.getWidth() - f2, pDRectangle.getHeight() - f2);
    }

    /* renamed from: s */
    public PDRectangle m32341s() {
        return this.f60592a.getRectangle();
    }

    /* renamed from: t */
    public PDRectangle m32340t(PDAnnotationSquareCircle pDAnnotationSquareCircle, float f) {
        float[] rectDifferences = pDAnnotationSquareCircle.getRectDifferences();
        if (rectDifferences.length == 0) {
            float f2 = f / 2.0f;
            PDRectangle m32342r = m32342r(m32341s(), f2);
            pDAnnotationSquareCircle.setRectDifferences(f2);
            pDAnnotationSquareCircle.setRectangle(m32359a(m32341s(), pDAnnotationSquareCircle.getRectDifferences()));
            PDRectangle m32341s = m32341s();
            PDAppearanceStream normalAppearanceStream = pDAnnotationSquareCircle.getNormalAppearanceStream();
            AffineTransform translateInstance = AffineTransform.getTranslateInstance(-m32341s.getLowerLeftX(), -m32341s.getLowerLeftY());
            normalAppearanceStream.setBBox(m32341s);
            normalAppearanceStream.setMatrix(translateInstance);
            return m32342r;
        }
        return m32342r(m32358b(m32341s(), rectDifferences), f / 2.0f);
    }

    /* renamed from: u */
    public void m32339u(PDAppearanceContentStream pDAppearanceContentStream, float f) {
        if (f < 1.0f) {
            PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
            pDExtendedGraphicsState.setStrokingAlphaConstant(Float.valueOf(f));
            pDExtendedGraphicsState.setNonStrokingAlphaConstant(Float.valueOf(f));
            pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        }
    }

    /* renamed from: v */
    public final void m32338v(PDAppearanceStream pDAppearanceStream) {
        PDRectangle m32341s = m32341s();
        pDAppearanceStream.setBBox(m32341s);
        pDAppearanceStream.setMatrix(AffineTransform.getTranslateInstance(-m32341s.getLowerLeftX(), -m32341s.getLowerLeftY()));
    }

    public PDAbstractAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        this.f60592a = pDAnnotation;
        this.document = pDDocument;
    }
}
