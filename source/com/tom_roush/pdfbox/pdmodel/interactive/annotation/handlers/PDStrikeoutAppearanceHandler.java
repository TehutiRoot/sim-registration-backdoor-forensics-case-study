package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDStrikeoutAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDStrikeoutAppearanceHandler(PDAnnotation pDAnnotation) {
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
        PDAnnotationTextMarkup pDAnnotationTextMarkup = (PDAnnotationTextMarkup) m32349k();
        PDRectangle rectangle = pDAnnotationTextMarkup.getRectangle();
        float[] quadPoints = pDAnnotationTextMarkup.getQuadPoints();
        if (quadPoints == null) {
            return;
        }
        C0989O4 m67130a = C0989O4.m67130a(pDAnnotationTextMarkup, pDAnnotationTextMarkup.getBorderStyle());
        PDColor color = pDAnnotationTextMarkup.getColor();
        if (color != null && color.getComponents().length != 0) {
            if (Float.compare(m67130a.f4292c, 0.0f) == 0) {
                m67130a.f4292c = 1.5f;
            }
            int i = 0;
            float f = Float.MIN_VALUE;
            float f2 = Float.MIN_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            for (int i2 = 0; i2 < quadPoints.length / 2; i2++) {
                int i3 = i2 * 2;
                float f5 = quadPoints[i3];
                float f6 = quadPoints[i3 + 1];
                f3 = Math.min(f3, f5);
                f4 = Math.min(f4, f6);
                f = Math.max(f, f5);
                f2 = Math.max(f2, f6);
            }
            rectangle.setLowerLeftX(Math.min(f3 - (m67130a.f4292c / 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f4 - (m67130a.f4292c / 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max(f + (m67130a.f4292c / 2.0f), rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max(f2 + (m67130a.f4292c / 2.0f), rectangle.getUpperRightY()));
            pDAnnotationTextMarkup.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
            try {
                try {
                    pDAppearanceContentStream = m32344p();
                    m32339u(pDAppearanceContentStream, pDAnnotationTextMarkup.getConstantOpacity());
                    pDAppearanceContentStream.setStrokingColor(color);
                    float[] fArr = m67130a.f4290a;
                    if (fArr != null) {
                        pDAppearanceContentStream.setLineDashPattern(fArr, 0.0f);
                    }
                    pDAppearanceContentStream.setLineWidth(m67130a.f4292c);
                    while (i < quadPoints.length / 8) {
                        int i4 = i * 8;
                        int i5 = i4 + 4;
                        int i6 = i4 + 1;
                        int i7 = i4 + 5;
                        float sqrt = (float) Math.sqrt(Math.pow(quadPoints[i4] - quadPoints[i5], 2.0d) + Math.pow(quadPoints[i6] - quadPoints[i7], 2.0d));
                        float f7 = quadPoints[i5];
                        float f8 = quadPoints[i7];
                        if (Float.compare(sqrt, 0.0f) != 0) {
                            float f9 = sqrt / 2.0f;
                            float f10 = m67130a.f4292c;
                            f7 += ((quadPoints[i4] - quadPoints[i5]) / sqrt) * (f9 - f10);
                            f8 += ((quadPoints[i6] - quadPoints[i7]) / sqrt) * (f9 - f10);
                        }
                        int i8 = i4 + 2;
                        int i9 = i4 + 6;
                        int i10 = i4 + 3;
                        int i11 = i4 + 7;
                        int i12 = i;
                        float sqrt2 = (float) Math.sqrt(Math.pow(quadPoints[i8] - quadPoints[i9], 2.0d) + Math.pow(quadPoints[i10] - quadPoints[i11], 2.0d));
                        float f11 = quadPoints[i9];
                        float f12 = quadPoints[i11];
                        if (Float.compare(sqrt2, 0.0f) != 0) {
                            float f13 = sqrt2 / 2.0f;
                            float f14 = m67130a.f4292c;
                            f11 += ((quadPoints[i8] - quadPoints[i9]) / sqrt2) * (f13 - f14);
                            f12 += ((quadPoints[i10] - quadPoints[i11]) / sqrt2) * (f13 - f14);
                        }
                        pDAppearanceContentStream.moveTo(f7, f8);
                        pDAppearanceContentStream.lineTo(f11, f12);
                        i = i12 + 1;
                    }
                    pDAppearanceContentStream.stroke();
                } catch (IOException e) {
                    e.getMessage();
                }
                IOUtils.closeQuietly(pDAppearanceContentStream);
            } catch (Throwable th2) {
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th2;
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    public PDStrikeoutAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
