package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDFormContentStream;
import com.tom_roush.pdfbox.pdmodel.PDPatternContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDSquigglyAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDSquigglyAppearanceHandler(PDAnnotation pDAnnotation) {
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
        int i;
        PDAppearanceContentStream pDAppearanceContentStream;
        PDAppearanceContentStream m32344p;
        PDFormContentStream pDFormContentStream;
        PDPatternContentStream pDPatternContentStream;
        PDPatternContentStream pDPatternContentStream2;
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
            int i2 = 0;
            float f = Float.MIN_VALUE;
            float f2 = Float.MIN_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            int i3 = 0;
            while (true) {
                i = 2;
                if (i3 >= quadPoints.length / 2) {
                    break;
                }
                int i4 = i3 * 2;
                float f5 = quadPoints[i4];
                float f6 = quadPoints[i4 + 1];
                f3 = Math.min(f3, f5);
                f4 = Math.min(f4, f6);
                f = Math.max(f, f5);
                f2 = Math.max(f2, f6);
                i3++;
            }
            rectangle.setLowerLeftX(Math.min(f3 - (m67130a.f4292c / 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f4 - (m67130a.f4292c / 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max(f + (m67130a.f4292c / 2.0f), rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max(f2 + (m67130a.f4292c / 2.0f), rectangle.getUpperRightY()));
            pDAnnotationTextMarkup.setRectangle(rectangle);
            try {
                m32344p = m32344p();
                try {
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
                pDAppearanceContentStream = null;
            } catch (Throwable th3) {
                th = th3;
                pDAppearanceContentStream = null;
            }
            try {
                m32339u(m32344p, pDAnnotationTextMarkup.getConstantOpacity());
                m32344p.setStrokingColor(color);
                while (i2 < quadPoints.length / 8) {
                    int i5 = i2 * 8;
                    float f7 = quadPoints[i5 + 1];
                    float f8 = quadPoints[i5 + 5];
                    float f9 = f7 - f8;
                    float f10 = f9 / 40.0f;
                    m32344p.transform(new Matrix(f10, 0.0f, 0.0f, f10 / 1.8f, quadPoints[i5 + 4], f8));
                    PDFormXObject pDFormXObject = new PDFormXObject(createCOSStream());
                    int i6 = i5 + 2;
                    pDFormXObject.setBBox(new PDRectangle(-0.5f, -0.5f, (((quadPoints[i6] - quadPoints[i5]) / f9) * 40.0f) + 0.5f, 13.0f));
                    pDFormXObject.setResources(new PDResources());
                    pDFormXObject.setMatrix(AffineTransform.getTranslateInstance(0.5d, 0.5d));
                    m32344p.drawForm(pDFormXObject);
                    try {
                        PDFormContentStream pDFormContentStream2 = new PDFormContentStream(pDFormXObject);
                        try {
                            PDTilingPattern pDTilingPattern = new PDTilingPattern();
                            pDTilingPattern.setBBox(new PDRectangle(0.0f, 0.0f, 10.0f, 12.0f));
                            pDTilingPattern.setXStep(10.0f);
                            pDTilingPattern.setYStep(13.0f);
                            pDTilingPattern.setTilingType(3);
                            pDTilingPattern.setPaintType(i);
                            try {
                                pDPatternContentStream2 = new PDPatternContentStream(pDTilingPattern);
                            } catch (Throwable th4) {
                                th = th4;
                                pDPatternContentStream = null;
                            }
                            try {
                                pDPatternContentStream2.setLineCapStyle(1);
                                pDPatternContentStream2.setLineJoinStyle(1);
                                pDPatternContentStream2.setLineWidth(1.0f);
                                pDPatternContentStream2.setMiterLimit(10.0f);
                                pDPatternContentStream2.moveTo(0.0f, 1.0f);
                                pDPatternContentStream2.lineTo(5.0f, 11.0f);
                                pDPatternContentStream2.lineTo(10.0f, 1.0f);
                                pDPatternContentStream2.stroke();
                                IOUtils.closeQuietly(pDPatternContentStream2);
                                pDFormXObject.getResources().add(pDTilingPattern);
                                pDFormContentStream2.addRect(0.0f, 0.0f, ((quadPoints[i6] - quadPoints[i5]) / f9) * 40.0f, 12.0f);
                                pDFormContentStream2.fill();
                                IOUtils.closeQuietly(pDFormContentStream2);
                                i2++;
                                i = 2;
                            } catch (Throwable th5) {
                                th = th5;
                                pDPatternContentStream = pDPatternContentStream2;
                                IOUtils.closeQuietly(pDPatternContentStream);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            pDFormContentStream = pDFormContentStream2;
                            IOUtils.closeQuietly(pDFormContentStream);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        pDFormContentStream = null;
                    }
                }
                IOUtils.closeQuietly(m32344p);
            } catch (IOException e3) {
                e = e3;
                pDAppearanceContentStream = m32344p;
                try {
                    e.getMessage();
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                } catch (Throwable th8) {
                    th = th8;
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                pDAppearanceContentStream = m32344p;
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th;
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    public PDSquigglyAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
