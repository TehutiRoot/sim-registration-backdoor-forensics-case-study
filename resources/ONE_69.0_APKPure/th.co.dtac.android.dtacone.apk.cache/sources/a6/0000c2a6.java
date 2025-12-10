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
    public final PDAnnotation f60604a;
    protected PDDocument document;
    protected static final Set<String> SHORT_STYLES = m32347e();

    /* renamed from: b */
    public static final double f60603b = Math.toRadians(30.0d);
    protected static final Set<String> INTERIOR_COLOR_STYLES = m32348d();
    protected static final Set<String> ANGLED_STYLES = m32349c();

    public PDAbstractAppearanceHandler(PDAnnotation pDAnnotation) {
        this(pDAnnotation, null);
    }

    /* renamed from: c */
    public static Set m32349c() {
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
    public static Set m32348d() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add("Circle");
        hashSet.add(PDAnnotationLine.LE_DIAMOND);
        hashSet.add(PDAnnotationLine.LE_R_CLOSED_ARROW);
        hashSet.add("Square");
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    public static Set m32347e() {
        HashSet hashSet = new HashSet();
        hashSet.add(PDAnnotationLine.LE_OPEN_ARROW);
        hashSet.add(PDAnnotationLine.LE_CLOSED_ARROW);
        hashSet.add("Square");
        hashSet.add("Circle");
        hashSet.add(PDAnnotationLine.LE_DIAMOND);
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public PDRectangle m32351a(PDRectangle pDRectangle, float[] fArr) {
        if (fArr != null && fArr.length == 4) {
            return new PDRectangle(pDRectangle.getLowerLeftX() - fArr[0], pDRectangle.getLowerLeftY() - fArr[1], pDRectangle.getWidth() + fArr[0] + fArr[2], pDRectangle.getHeight() + fArr[1] + fArr[3]);
        }
        return pDRectangle;
    }

    /* renamed from: b */
    public PDRectangle m32350b(PDRectangle pDRectangle, float[] fArr) {
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
    public void m32346f(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
        double d = f60603b;
        double d2 = f3;
        float cos = ((float) (Math.cos(d) * d2)) + f;
        float sin = (float) (Math.sin(d) * d2);
        pDAppearanceContentStream.moveTo(cos, f2 + sin);
        pDAppearanceContentStream.lineTo(f, f2);
        pDAppearanceContentStream.lineTo(cos, f2 - sin);
    }

    /* renamed from: g */
    public void m32345g(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
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
    public void m32344h(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
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
    public void m32343i(PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3) {
        pDAppearanceContentStream.moveTo(f - f3, f2);
        pDAppearanceContentStream.lineTo(f, f2 + f3);
        pDAppearanceContentStream.lineTo(f + f3, f2);
        pDAppearanceContentStream.lineTo(f, f2 - f3);
        pDAppearanceContentStream.closePath();
    }

    /* renamed from: j */
    public void m32342j(String str, PDAppearanceContentStream pDAppearanceContentStream, float f, float f2, float f3, boolean z, boolean z2, boolean z3) {
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
                m32343i(pDAppearanceContentStream, f, f2, f3 * 3.0f);
            } else if ("Square".equals(str)) {
                float f5 = f3 * 3.0f;
                float f6 = f - f5;
                float f7 = f2 - f5;
                float f8 = 6.0f * f3;
                pDAppearanceContentStream.addRect(f6, f7, f8, f8);
            } else if ("Circle".equals(str)) {
                m32345g(pDAppearanceContentStream, f, f2, f3 * 3.0f);
            } else if (!PDAnnotationLine.LE_R_OPEN_ARROW.equals(str) && !PDAnnotationLine.LE_R_CLOSED_ARROW.equals(str)) {
                if (PDAnnotationLine.LE_SLASH.equals(str)) {
                    double d = f3 * 9.0f;
                    pDAppearanceContentStream.moveTo(((float) (Math.cos(Math.toRadians(60.0d)) * d)) + f, ((float) (Math.sin(Math.toRadians(60.0d)) * d)) + f2);
                    pDAppearanceContentStream.lineTo(f + ((float) (Math.cos(Math.toRadians(240.0d)) * d)), f2 + ((float) (Math.sin(Math.toRadians(240.0d)) * d)));
                }
            } else {
                float f9 = (-i) * f3;
                m32346f(pDAppearanceContentStream, f + f9, f2, f9 * 9.0f);
            }
        } else {
            float f10 = i * f3;
            m32346f(pDAppearanceContentStream, f + f10, f2, f10 * 9.0f);
        }
        if (PDAnnotationLine.LE_R_CLOSED_ARROW.equals(str) || PDAnnotationLine.LE_CLOSED_ARROW.equals(str)) {
            pDAppearanceContentStream.closePath();
        }
        pDAppearanceContentStream.drawShape(f3, z, (INTERIOR_COLOR_STYLES.contains(str) && z2) ? false : false);
    }

    /* renamed from: k */
    public PDAnnotation m32341k() {
        return this.f60604a;
    }

    /* renamed from: l */
    public PDAppearanceDictionary m32340l() {
        PDAppearanceDictionary appearance = this.f60604a.getAppearance();
        if (appearance == null) {
            PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary();
            this.f60604a.setAppearance(pDAppearanceDictionary);
            return pDAppearanceDictionary;
        }
        return appearance;
    }

    /* renamed from: m */
    public final PDAppearanceContentStream m32339m(PDAppearanceEntry pDAppearanceEntry, boolean z) {
        PDAppearanceStream appearanceStream = pDAppearanceEntry.getAppearanceStream();
        m32330v(appearanceStream);
        if (appearanceStream.getResources() == null) {
            appearanceStream.setResources(new PDResources());
        }
        return new PDAppearanceContentStream(appearanceStream, z);
    }

    /* renamed from: n */
    public PDColor m32338n() {
        return this.f60604a.getColor();
    }

    /* renamed from: o */
    public final PDAppearanceEntry m32337o() {
        PDAppearanceDictionary m32340l = m32340l();
        PDAppearanceEntry normalAppearance = m32340l.getNormalAppearance();
        if (normalAppearance == null || normalAppearance.isSubDictionary()) {
            PDAppearanceEntry pDAppearanceEntry = new PDAppearanceEntry(createCOSStream());
            m32340l.setNormalAppearance(pDAppearanceEntry);
            return pDAppearanceEntry;
        }
        return normalAppearance;
    }

    /* renamed from: p */
    public PDAppearanceContentStream m32336p() {
        return m32335q(false);
    }

    /* renamed from: q */
    public PDAppearanceContentStream m32335q(boolean z) {
        return m32339m(m32337o(), z);
    }

    /* renamed from: r */
    public PDRectangle m32334r(PDRectangle pDRectangle, float f) {
        float lowerLeftX = pDRectangle.getLowerLeftX() + f;
        float lowerLeftY = pDRectangle.getLowerLeftY() + f;
        float f2 = f * 2.0f;
        return new PDRectangle(lowerLeftX, lowerLeftY, pDRectangle.getWidth() - f2, pDRectangle.getHeight() - f2);
    }

    /* renamed from: s */
    public PDRectangle m32333s() {
        return this.f60604a.getRectangle();
    }

    /* renamed from: t */
    public PDRectangle m32332t(PDAnnotationSquareCircle pDAnnotationSquareCircle, float f) {
        float[] rectDifferences = pDAnnotationSquareCircle.getRectDifferences();
        if (rectDifferences.length == 0) {
            float f2 = f / 2.0f;
            PDRectangle m32334r = m32334r(m32333s(), f2);
            pDAnnotationSquareCircle.setRectDifferences(f2);
            pDAnnotationSquareCircle.setRectangle(m32351a(m32333s(), pDAnnotationSquareCircle.getRectDifferences()));
            PDRectangle m32333s = m32333s();
            PDAppearanceStream normalAppearanceStream = pDAnnotationSquareCircle.getNormalAppearanceStream();
            AffineTransform translateInstance = AffineTransform.getTranslateInstance(-m32333s.getLowerLeftX(), -m32333s.getLowerLeftY());
            normalAppearanceStream.setBBox(m32333s);
            normalAppearanceStream.setMatrix(translateInstance);
            return m32334r;
        }
        return m32334r(m32350b(m32333s(), rectDifferences), f / 2.0f);
    }

    /* renamed from: u */
    public void m32331u(PDAppearanceContentStream pDAppearanceContentStream, float f) {
        if (f < 1.0f) {
            PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
            pDExtendedGraphicsState.setStrokingAlphaConstant(Float.valueOf(f));
            pDExtendedGraphicsState.setNonStrokingAlphaConstant(Float.valueOf(f));
            pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        }
    }

    /* renamed from: v */
    public final void m32330v(PDAppearanceStream pDAppearanceStream) {
        PDRectangle m32333s = m32333s();
        pDAppearanceStream.setBBox(m32333s);
        pDAppearanceStream.setMatrix(AffineTransform.getTranslateInstance(-m32333s.getLowerLeftX(), -m32333s.getLowerLeftY()));
    }

    public PDAbstractAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        this.f60604a = pDAnnotation;
        this.document = pDDocument;
    }
}