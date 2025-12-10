package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDPolylineAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDPolylineAppearanceHandler(PDAnnotation pDAnnotation) {
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
        String str;
        PDAnnotationMarkup pDAnnotationMarkup;
        boolean z;
        boolean z2;
        String str2 = "None";
        PDAnnotationMarkup pDAnnotationMarkup2 = (PDAnnotationMarkup) m32349k();
        PDRectangle rectangle = pDAnnotationMarkup2.getRectangle();
        float[] vertices = pDAnnotationMarkup2.getVertices();
        if (vertices != null && vertices.length >= 4) {
            C0989O4 m67130a = C0989O4.m67130a(pDAnnotationMarkup2, pDAnnotationMarkup2.getBorderStyle());
            PDColor color = pDAnnotationMarkup2.getColor();
            if (color != null && color.getComponents().length != 0 && Float.compare(m67130a.f4292c, 0.0f) != 0) {
                float f = Float.MIN_VALUE;
                float f2 = Float.MIN_VALUE;
                float f3 = Float.MAX_VALUE;
                float f4 = Float.MAX_VALUE;
                for (int i = 0; i < vertices.length / 2; i++) {
                    int i2 = i * 2;
                    float f5 = vertices[i2];
                    float f6 = vertices[i2 + 1];
                    f3 = Math.min(f3, f5);
                    f4 = Math.min(f4, f6);
                    f = Math.max(f, f5);
                    f2 = Math.max(f2, f6);
                }
                rectangle.setLowerLeftX(Math.min(f3 - (m67130a.f4292c * 10.0f), rectangle.getLowerLeftX()));
                rectangle.setLowerLeftY(Math.min(f4 - (m67130a.f4292c * 10.0f), rectangle.getLowerLeftY()));
                rectangle.setUpperRightX(Math.max(f + (m67130a.f4292c * 10.0f), rectangle.getUpperRightX()));
                rectangle.setUpperRightY(Math.max(f2 + (m67130a.f4292c * 10.0f), rectangle.getUpperRightY()));
                pDAnnotationMarkup2.setRectangle(rectangle);
                PDAppearanceContentStream pDAppearanceContentStream = null;
                try {
                    try {
                        pDAppearanceContentStream = m32344p();
                        boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationMarkup2.getInteriorColor());
                        m32339u(pDAppearanceContentStream, pDAnnotationMarkup2.getConstantOpacity());
                        boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(color);
                        float[] fArr = m67130a.f4290a;
                        if (fArr != null) {
                            pDAppearanceContentStream.setLineDashPattern(fArr, 0.0f);
                        }
                        pDAppearanceContentStream.setLineWidth(m67130a.f4292c);
                        int i3 = 0;
                        while (i3 < vertices.length / 2) {
                            int i4 = i3 * 2;
                            float f7 = vertices[i4];
                            float f8 = vertices[i4 + 1];
                            if (i3 == 0) {
                                if (PDAbstractAppearanceHandler.SHORT_STYLES.contains(pDAnnotationMarkup2.getStartPointEndingStyle())) {
                                    float f9 = vertices[2];
                                    float f10 = vertices[3];
                                    z = strokingColorOnDemand;
                                    z2 = nonStrokingColorOnDemand;
                                    str = str2;
                                    pDAnnotationMarkup = pDAnnotationMarkup2;
                                    float sqrt = (float) Math.sqrt(Math.pow(f7 - f9, 2.0d) + Math.pow(f8 - f10, 2.0d));
                                    if (Float.compare(sqrt, 0.0f) != 0) {
                                        float f11 = m67130a.f4292c;
                                        f7 += ((f9 - f7) / sqrt) * f11;
                                        f8 += ((f10 - f8) / sqrt) * f11;
                                    }
                                } else {
                                    str = str2;
                                    pDAnnotationMarkup = pDAnnotationMarkup2;
                                    z = strokingColorOnDemand;
                                    z2 = nonStrokingColorOnDemand;
                                }
                                pDAppearanceContentStream.moveTo(f7, f8);
                            } else {
                                str = str2;
                                pDAnnotationMarkup = pDAnnotationMarkup2;
                                z = strokingColorOnDemand;
                                z2 = nonStrokingColorOnDemand;
                                if (i3 == (vertices.length / 2) - 1 && PDAbstractAppearanceHandler.SHORT_STYLES.contains(pDAnnotationMarkup.getEndPointEndingStyle())) {
                                    float f12 = vertices[vertices.length - 4];
                                    float f13 = vertices[vertices.length - 3];
                                    float sqrt2 = (float) Math.sqrt(Math.pow(f12 - f7, 2.0d) + Math.pow(f13 - f8, 2.0d));
                                    if (Float.compare(sqrt2, 0.0f) != 0) {
                                        float f14 = m67130a.f4292c;
                                        f7 -= ((f7 - f12) / sqrt2) * f14;
                                        f8 -= ((f8 - f13) / sqrt2) * f14;
                                    }
                                }
                                pDAppearanceContentStream.lineTo(f7, f8);
                            }
                            i3++;
                            nonStrokingColorOnDemand = z2;
                            strokingColorOnDemand = z;
                            str2 = str;
                            pDAnnotationMarkup2 = pDAnnotationMarkup;
                        }
                        String str3 = str2;
                        PDAnnotationMarkup pDAnnotationMarkup3 = pDAnnotationMarkup2;
                        boolean z3 = strokingColorOnDemand;
                        boolean z4 = nonStrokingColorOnDemand;
                        pDAppearanceContentStream.stroke();
                        if (!str3.equals(pDAnnotationMarkup3.getStartPointEndingStyle())) {
                            float f15 = vertices[2];
                            float f16 = vertices[3];
                            float f17 = vertices[0];
                            float f18 = vertices[1];
                            pDAppearanceContentStream.saveGraphicsState();
                            if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationMarkup3.getStartPointEndingStyle())) {
                                pDAppearanceContentStream.transform(Matrix.getRotateInstance(Math.atan2(f16 - f18, f15 - f17), f17, f18));
                            } else {
                                pDAppearanceContentStream.transform(Matrix.getTranslateInstance(f17, f18));
                            }
                            m32350j(pDAnnotationMarkup3.getStartPointEndingStyle(), pDAppearanceContentStream, 0.0f, 0.0f, m67130a.f4292c, z3, z4, false);
                            pDAppearanceContentStream.restoreGraphicsState();
                        }
                        if (!str3.equals(pDAnnotationMarkup3.getEndPointEndingStyle())) {
                            float f19 = vertices[vertices.length - 4];
                            float f20 = vertices[vertices.length - 3];
                            float f21 = vertices[vertices.length - 2];
                            float f22 = vertices[vertices.length - 1];
                            if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationMarkup3.getEndPointEndingStyle())) {
                                pDAppearanceContentStream.transform(Matrix.getRotateInstance(Math.atan2(f22 - f20, f21 - f19), f21, f22));
                            } else {
                                pDAppearanceContentStream.transform(Matrix.getTranslateInstance(f21, f22));
                            }
                            m32350j(pDAnnotationMarkup3.getEndPointEndingStyle(), pDAppearanceContentStream, 0.0f, 0.0f, m67130a.f4292c, z3, z4, true);
                        }
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
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    public PDPolylineAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
