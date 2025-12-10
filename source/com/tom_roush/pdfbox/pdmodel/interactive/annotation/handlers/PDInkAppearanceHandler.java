package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDInkAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDInkAppearanceHandler(PDAnnotation pDAnnotation) {
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
        float[][] inkList;
        float[][] inkList2;
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) m32349k();
        PDColor color = pDAnnotationMarkup.getColor();
        if (color != null && color.getComponents().length != 0) {
            C0989O4 m67130a = C0989O4.m67130a(pDAnnotationMarkup, pDAnnotationMarkup.getBorderStyle());
            if (Float.compare(m67130a.f4292c, 0.0f) == 0) {
                return;
            }
            float f = Float.MIN_VALUE;
            float f2 = Float.MIN_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            for (float[] fArr : pDAnnotationMarkup.getInkList()) {
                int length = fArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    float f5 = fArr[i2];
                    float f6 = fArr[i2 + 1];
                    f3 = Math.min(f3, f5);
                    f4 = Math.min(f4, f6);
                    f = Math.max(f, f5);
                    f2 = Math.max(f2, f6);
                }
            }
            PDRectangle rectangle = pDAnnotationMarkup.getRectangle();
            rectangle.setLowerLeftX(Math.min(f3 - (m67130a.f4292c * 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f4 - (m67130a.f4292c * 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max(f + (m67130a.f4292c * 2.0f), rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max(f2 + (m67130a.f4292c * 2.0f), rectangle.getUpperRightY()));
            pDAnnotationMarkup.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
            try {
                try {
                    pDAppearanceContentStream = m32344p();
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                    throw th;
                }
                try {
                    m32339u(pDAppearanceContentStream, pDAnnotationMarkup.getConstantOpacity());
                    pDAppearanceContentStream.setStrokingColor(color);
                    float[] fArr2 = m67130a.f4290a;
                    if (fArr2 != null) {
                        pDAppearanceContentStream.setLineDashPattern(fArr2, 0.0f);
                    }
                    pDAppearanceContentStream.setLineWidth(m67130a.f4292c);
                    for (float[] fArr3 : pDAnnotationMarkup.getInkList()) {
                        int length2 = fArr3.length / 2;
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i3 * 2;
                            float f7 = fArr3[i4];
                            float f8 = fArr3[i4 + 1];
                            if (i3 == 0) {
                                pDAppearanceContentStream.moveTo(f7, f8);
                            } else {
                                pDAppearanceContentStream.lineTo(f7, f8);
                            }
                        }
                        pDAppearanceContentStream.stroke();
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.getMessage();
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                }
                IOUtils.closeQuietly(pDAppearanceContentStream);
            } catch (Throwable th3) {
                th = th3;
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th;
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    public PDInkAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
