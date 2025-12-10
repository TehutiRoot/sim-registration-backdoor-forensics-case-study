package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDCircleAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDCircleAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateNormalAppearance() {
        float m32337w = m32337w();
        PDAnnotationSquareCircle pDAnnotationSquareCircle = (PDAnnotationSquareCircle) m32349k();
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = m32344p();
                boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(m32346n());
                boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationSquareCircle.getInteriorColor());
                m32339u(pDAppearanceContentStream, pDAnnotationSquareCircle.getConstantOpacity());
                pDAppearanceContentStream.setBorderLine(m32337w, pDAnnotationSquareCircle.getBorderStyle(), pDAnnotationSquareCircle.getBorder());
                PDBorderEffectDictionary borderEffect = pDAnnotationSquareCircle.getBorderEffect();
                if (borderEffect != null && borderEffect.getStyle().equals("C")) {
                    C12399nq c12399nq = new C12399nq(pDAppearanceContentStream, borderEffect.getIntensity(), m32337w, m32341s());
                    c12399nq.m26024k(pDAnnotationSquareCircle.getRectDifference());
                    pDAnnotationSquareCircle.setRectangle(c12399nq.m26044B());
                    pDAnnotationSquareCircle.setRectDifference(c12399nq.m26045A());
                    PDAppearanceStream normalAppearanceStream = pDAnnotationSquareCircle.getNormalAppearanceStream();
                    normalAppearanceStream.setBBox(c12399nq.m26015t());
                    normalAppearanceStream.setMatrix(c12399nq.m26012w());
                } else {
                    PDRectangle m32340t = m32340t(pDAnnotationSquareCircle, m32337w);
                    float lowerLeftX = m32340t.getLowerLeftX();
                    float lowerLeftY = m32340t.getLowerLeftY();
                    float upperRightX = m32340t.getUpperRightX();
                    float upperRightY = m32340t.getUpperRightY();
                    float width = lowerLeftX + (m32340t.getWidth() / 2.0f);
                    float height = lowerLeftY + (m32340t.getHeight() / 2.0f);
                    float height2 = (m32340t.getHeight() / 2.0f) * 0.55555415f;
                    float width2 = (m32340t.getWidth() / 2.0f) * 0.55555415f;
                    pDAppearanceContentStream.moveTo(width, upperRightY);
                    float f = width + width2;
                    float f2 = height + height2;
                    pDAppearanceContentStream.curveTo(f, upperRightY, upperRightX, f2, upperRightX, height);
                    float f3 = height - height2;
                    pDAppearanceContentStream.curveTo(upperRightX, f3, f, lowerLeftY, width, lowerLeftY);
                    float f4 = width - width2;
                    pDAppearanceContentStream.curveTo(f4, lowerLeftY, lowerLeftX, f3, lowerLeftX, height);
                    pDAppearanceContentStream.curveTo(lowerLeftX, f2, f4, upperRightY, width, upperRightY);
                    pDAppearanceContentStream.closePath();
                }
                pDAppearanceContentStream.drawShape(m32337w, strokingColorOnDemand, nonStrokingColorOnDemand);
            } catch (IOException e) {
                e.getMessage();
            }
            IOUtils.closeQuietly(pDAppearanceContentStream);
        } catch (Throwable th2) {
            IOUtils.closeQuietly(pDAppearanceContentStream);
            throw th2;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    /* renamed from: w */
    public float m32337w() {
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) m32349k();
        PDBorderStyleDictionary borderStyle = pDAnnotationMarkup.getBorderStyle();
        if (borderStyle != null) {
            return borderStyle.getWidth();
        }
        COSArray border = pDAnnotationMarkup.getBorder();
        if (border.size() >= 3) {
            COSBase object = border.getObject(2);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public PDCircleAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
