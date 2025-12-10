package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDCaretAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDCaretAppearanceHandler(PDAnnotation pDAnnotation) {
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
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) m32349k();
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = m32344p();
                pDAppearanceContentStream.setStrokingColor(m32346n());
                pDAppearanceContentStream.setNonStrokingColor(m32346n());
                m32339u(pDAppearanceContentStream, pDAnnotationMarkup.getConstantOpacity());
                PDRectangle m32341s = m32341s();
                PDRectangle pDRectangle = new PDRectangle(m32341s.getWidth(), m32341s.getHeight());
                if (!pDAnnotationMarkup.getCOSObject().containsKey(COSName.f59821RD)) {
                    float min = Math.min(m32341s.getHeight() / 10.0f, 5.0f);
                    pDAnnotationMarkup.setRectDifferences(min);
                    float f = -min;
                    float f2 = min * 2.0f;
                    PDRectangle pDRectangle2 = new PDRectangle(f, f, m32341s.getWidth() + f2, m32341s.getHeight() + f2);
                    Matrix matrix = pDAnnotationMarkup.getNormalAppearanceStream().getMatrix();
                    matrix.transformPoint(min, min);
                    pDAnnotationMarkup.getNormalAppearanceStream().setMatrix(matrix.createAffineTransform());
                    pDAnnotationMarkup.setRectangle(new PDRectangle(m32341s.getLowerLeftX() - min, m32341s.getLowerLeftY() - min, m32341s.getWidth() + f2, m32341s.getHeight() + f2));
                    pDRectangle = pDRectangle2;
                }
                pDAnnotationMarkup.getNormalAppearanceStream().setBBox(pDRectangle);
                float width = m32341s.getWidth() / 2.0f;
                float height = m32341s.getHeight() / 2.0f;
                pDAppearanceContentStream.moveTo(0.0f, 0.0f);
                pDAppearanceContentStream.curveTo(width, 0.0f, width, height, width, m32341s.getHeight());
                pDAppearanceContentStream.curveTo(width, height, width, 0.0f, m32341s.getWidth(), 0.0f);
                pDAppearanceContentStream.closePath();
                pDAppearanceContentStream.fill();
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

    public PDCaretAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
