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
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class PDPolygonAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDPolygonAppearanceHandler(PDAnnotation pDAnnotation) {
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
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) m32341k();
        float m32325w = m32325w();
        PDRectangle rectangle = pDAnnotationMarkup.getRectangle();
        float[][] m32324x = m32324x(pDAnnotationMarkup);
        if (m32324x == null) {
            return;
        }
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MIN_VALUE;
        float f4 = Float.MIN_VALUE;
        for (float[] fArr : m32324x) {
            int i = 0;
            while (true) {
                if (i < fArr.length / 2) {
                    int i2 = i * 2;
                    float f5 = fArr[i2];
                    float f6 = fArr[i2 + 1];
                    f = Math.min(f, f5);
                    f2 = Math.min(f2, f6);
                    f3 = Math.max(f3, f5);
                    f4 = Math.max(f4, f6);
                    i++;
                }
            }
        }
        rectangle.setLowerLeftX(Math.min(f - m32325w, rectangle.getLowerLeftX()));
        rectangle.setLowerLeftY(Math.min(f2 - m32325w, rectangle.getLowerLeftY()));
        rectangle.setUpperRightX(Math.max(f3 + m32325w, rectangle.getUpperRightX()));
        rectangle.setUpperRightY(Math.max(f4 + m32325w, rectangle.getUpperRightY()));
        pDAnnotationMarkup.setRectangle(rectangle);
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = m32336p();
                boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(m32338n());
                boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationMarkup.getInteriorColor());
                m32331u(pDAppearanceContentStream, pDAnnotationMarkup.getConstantOpacity());
                pDAppearanceContentStream.setBorderLine(m32325w, pDAnnotationMarkup.getBorderStyle(), pDAnnotationMarkup.getBorder());
                PDBorderEffectDictionary borderEffect = pDAnnotationMarkup.getBorderEffect();
                if (borderEffect != null && borderEffect.getStyle().equals("C")) {
                    C12396nq c12396nq = new C12396nq(pDAppearanceContentStream, borderEffect.getIntensity(), m32325w, m32333s());
                    c12396nq.m26220l(m32324x);
                    pDAnnotationMarkup.setRectangle(c12396nq.m26241B());
                    PDAppearanceStream normalAppearanceStream = pDAnnotationMarkup.getNormalAppearanceStream();
                    normalAppearanceStream.setBBox(c12396nq.m26212t());
                    normalAppearanceStream.setMatrix(c12396nq.m26209w());
                } else {
                    for (int i3 = 0; i3 < m32324x.length; i3++) {
                        float[] fArr2 = m32324x[i3];
                        if (i3 == 0 && fArr2.length == 2) {
                            pDAppearanceContentStream.moveTo(fArr2[0], fArr2[1]);
                        } else if (fArr2.length == 2) {
                            pDAppearanceContentStream.lineTo(fArr2[0], fArr2[1]);
                        } else if (fArr2.length == 6) {
                            pDAppearanceContentStream.curveTo(fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]);
                        }
                    }
                    pDAppearanceContentStream.closePath();
                }
                pDAppearanceContentStream.drawShape(m32325w, strokingColorOnDemand, nonStrokingColorOnDemand);
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
    public float m32325w() {
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) m32341k();
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

    /* renamed from: x */
    public final float[][] m32324x(PDAnnotationMarkup pDAnnotationMarkup) {
        float[][] path = pDAnnotationMarkup.getPath();
        if (path == null) {
            float[] vertices = pDAnnotationMarkup.getVertices();
            if (vertices == null) {
                return null;
            }
            int length = vertices.length / 2;
            float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, length, 2);
            for (int i = 0; i < length; i++) {
                float[] fArr2 = fArr[i];
                int i2 = i * 2;
                fArr2[0] = vertices[i2];
                fArr2[1] = vertices[i2 + 1];
            }
            return fArr;
        }
        return path;
    }

    public PDPolygonAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}