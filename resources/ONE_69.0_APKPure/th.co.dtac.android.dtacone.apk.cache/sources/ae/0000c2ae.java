package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDLinkAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDLinkAppearanceHandler(PDAnnotation pDAnnotation) {
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
        PDAppearanceContentStream pDAppearanceContentStream;
        PDAppearanceContentStream m32336p;
        boolean strokingColorOnDemand;
        boolean z;
        PDBorderStyleDictionary borderStyle;
        PDAnnotationLink pDAnnotationLink = (PDAnnotationLink) m32341k();
        PDRectangle rectangle = pDAnnotationLink.getRectangle();
        if (rectangle == null) {
            return;
        }
        float m32326w = m32326w();
        try {
            m32336p = m32336p();
            try {
                PDColor color = pDAnnotationLink.getColor();
                if (color == null) {
                    color = new PDColor(new float[]{0.0f}, PDDeviceGray.INSTANCE);
                }
                strokingColorOnDemand = m32336p.setStrokingColorOnDemand(color);
                m32336p.setBorderLine(m32326w, pDAnnotationLink.getBorderStyle(), pDAnnotationLink.getBorder());
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
            PDRectangle m32334r = m32334r(m32333s(), m32326w / 2.0f);
            float[] quadPoints = pDAnnotationLink.getQuadPoints();
            if (quadPoints != null) {
                int i = 0;
                while (true) {
                    if (i >= quadPoints.length / 2) {
                        break;
                    }
                    int i2 = i * 2;
                    int i3 = i2 + 1;
                    if (!rectangle.contains(quadPoints[i2], quadPoints[i3])) {
                        Log.w("PdfBox-Android", "At least one /QuadPoints entry (" + quadPoints[i2] + ";" + quadPoints[i3] + ") is outside of rectangle, " + rectangle + ", /QuadPoints are ignored and /Rect is used instead");
                        quadPoints = null;
                        break;
                    }
                    i++;
                }
            }
            if (quadPoints == null) {
                quadPoints = new float[]{m32334r.getLowerLeftX(), m32334r.getLowerLeftY(), m32334r.getUpperRightX(), m32334r.getLowerLeftY(), m32334r.getUpperRightX(), m32334r.getUpperRightY(), m32334r.getLowerLeftX(), m32334r.getUpperRightY()};
            }
            if (quadPoints.length >= 8 && (borderStyle = pDAnnotationLink.getBorderStyle()) != null) {
                z = PDBorderStyleDictionary.STYLE_UNDERLINE.equals(borderStyle.getStyle());
            } else {
                z = false;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 7;
                if (i5 < quadPoints.length) {
                    m32336p.moveTo(quadPoints[i4], quadPoints[i4 + 1]);
                    m32336p.lineTo(quadPoints[i4 + 2], quadPoints[i4 + 3]);
                    if (!z) {
                        m32336p.lineTo(quadPoints[i4 + 4], quadPoints[i4 + 5]);
                        m32336p.lineTo(quadPoints[i4 + 6], quadPoints[i5]);
                        m32336p.closePath();
                    }
                    i4 += 8;
                } else {
                    m32336p.drawShape(m32326w, strokingColorOnDemand, false);
                    IOUtils.closeQuietly(m32336p);
                    return;
                }
            }
        } catch (IOException e3) {
            e = e3;
            pDAppearanceContentStream = m32336p;
            try {
                e.getMessage();
                IOUtils.closeQuietly(pDAppearanceContentStream);
            } catch (Throwable th4) {
                th = th4;
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            pDAppearanceContentStream = m32336p;
            IOUtils.closeQuietly(pDAppearanceContentStream);
            throw th;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    /* renamed from: w */
    public float m32326w() {
        PDAnnotationLink pDAnnotationLink = (PDAnnotationLink) m32341k();
        PDBorderStyleDictionary borderStyle = pDAnnotationLink.getBorderStyle();
        if (borderStyle != null) {
            return borderStyle.getWidth();
        }
        COSArray border = pDAnnotationLink.getBorder();
        if (border.size() >= 3) {
            COSBase object = border.getObject(2);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public PDLinkAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}