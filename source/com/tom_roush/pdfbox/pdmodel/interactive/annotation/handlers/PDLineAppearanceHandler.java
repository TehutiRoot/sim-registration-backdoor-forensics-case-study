package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDLineAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDLineAppearanceHandler(PDAnnotation pDAnnotation) {
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
        float f;
        float f2;
        double d;
        boolean z;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        PDAnnotationLine pDAnnotationLine = (PDAnnotationLine) m32349k();
        PDRectangle rectangle = pDAnnotationLine.getRectangle();
        float[] line = pDAnnotationLine.getLine();
        if (line == null) {
            return;
        }
        C0989O4 m67130a = C0989O4.m67130a(pDAnnotationLine, pDAnnotationLine.getBorderStyle());
        PDColor color = pDAnnotationLine.getColor();
        if (color != null && color.getComponents().length != 0) {
            float leaderLineLength = pDAnnotationLine.getLeaderLineLength();
            float leaderLineExtensionLength = pDAnnotationLine.getLeaderLineExtensionLength();
            float leaderLineOffsetLength = pDAnnotationLine.getLeaderLineOffsetLength();
            float f8 = Float.MIN_VALUE;
            float f9 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            float f11 = Float.MAX_VALUE;
            for (int i = 0; i < line.length / 2; i++) {
                int i2 = i * 2;
                float f12 = line[i2];
                float f13 = line[i2 + 1];
                f10 = Math.min(f10, f12);
                f11 = Math.min(f11, f13);
                f8 = Math.max(f8, f12);
                f9 = Math.max(f9, f13);
            }
            if (leaderLineLength < 0.0f) {
                leaderLineOffsetLength = -leaderLineOffsetLength;
                leaderLineExtensionLength = -leaderLineExtensionLength;
            }
            float f14 = m67130a.f4292c;
            float f15 = f10;
            if (f14 < 1.0E-5d) {
                f14 = 1.0f;
            }
            float f16 = 10.0f * f14;
            float f17 = leaderLineLength + leaderLineOffsetLength;
            float f18 = leaderLineExtensionLength + f17;
            rectangle.setLowerLeftX(Math.min(f15 - Math.max(f16, Math.abs(f18)), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f11 - Math.max(f16, Math.abs(f18)), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max(f8 + Math.max(f16, Math.abs(f18)), rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max(f9 + Math.max(f16, Math.abs(f18)), rectangle.getUpperRightY()));
            pDAnnotationLine.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
            try {
                try {
                    pDAppearanceContentStream = m32344p();
                    m32339u(pDAppearanceContentStream, pDAnnotationLine.getConstantOpacity());
                    boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(color);
                    float[] fArr = m67130a.f4290a;
                    if (fArr != null) {
                        pDAppearanceContentStream.setLineDashPattern(fArr, 0.0f);
                    }
                    pDAppearanceContentStream.setLineWidth(m67130a.f4292c);
                    float f19 = line[0];
                    float f20 = line[1];
                    float f21 = line[2];
                    float f22 = line[3];
                    String contents = pDAnnotationLine.getContents();
                    if (contents == null) {
                        contents = "";
                    }
                    pDAppearanceContentStream.saveGraphicsState();
                    double atan2 = Math.atan2(f22 - f20, f21 - f19);
                    pDAppearanceContentStream.transform(Matrix.getRotateInstance(atan2, f19, f20));
                    float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                    pDAppearanceContentStream.moveTo(0.0f, leaderLineOffsetLength);
                    pDAppearanceContentStream.lineTo(0.0f, f18);
                    pDAppearanceContentStream.moveTo(sqrt, leaderLineOffsetLength);
                    pDAppearanceContentStream.lineTo(sqrt, f18);
                    if (pDAnnotationLine.getCaption() && !contents.isEmpty()) {
                        PDType1Font pDType1Font = PDType1Font.HELVETICA;
                        try {
                            f6 = (pDType1Font.getStringWidth(pDAnnotationLine.getContents()) / 1000.0f) * 9.0f;
                        } catch (IllegalArgumentException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("line text '");
                            sb.append(pDAnnotationLine.getContents());
                            sb.append("' can't be shown");
                            f6 = 0.0f;
                        }
                        float f23 = (sqrt - f6) / 2.0f;
                        String captionPositioning = pDAnnotationLine.getCaptionPositioning();
                        Set<String> set = PDAbstractAppearanceHandler.SHORT_STYLES;
                        if (set.contains(pDAnnotationLine.getStartPointEndingStyle())) {
                            f3 = f17;
                            pDAppearanceContentStream.moveTo(f14, f3);
                            f4 = f21;
                        } else {
                            f3 = f17;
                            f4 = f21;
                            pDAppearanceContentStream.moveTo(0.0f, f3);
                        }
                        if ("Top".equals(captionPositioning)) {
                            f7 = 1.908f;
                        } else {
                            pDAppearanceContentStream.lineTo(f23 - f14, f3);
                            pDAppearanceContentStream.moveTo((sqrt - f23) + f14, f3);
                            f7 = -2.6f;
                        }
                        if (set.contains(pDAnnotationLine.getEndPointEndingStyle())) {
                            pDAppearanceContentStream.lineTo(sqrt - f14, f3);
                        } else {
                            pDAppearanceContentStream.lineTo(sqrt, f3);
                        }
                        z = strokingColorOnDemand;
                        pDAppearanceContentStream.drawShape(f14, z, false);
                        float captionHorizontalOffset = pDAnnotationLine.getCaptionHorizontalOffset();
                        d = atan2;
                        float captionVerticalOffset = pDAnnotationLine.getCaptionVerticalOffset();
                        if (f6 > 0.0f) {
                            pDAppearanceContentStream.beginText();
                            pDAppearanceContentStream.setFont(pDType1Font, 9.0f);
                            pDAppearanceContentStream.newLineAtOffset(f23 + captionHorizontalOffset, f3 + f7 + captionVerticalOffset);
                            pDAppearanceContentStream.showText(pDAnnotationLine.getContents());
                            pDAppearanceContentStream.endText();
                        }
                        if (Float.compare(captionVerticalOffset, 0.0f) != 0) {
                            float f24 = (sqrt / 2.0f) + 0.0f;
                            pDAppearanceContentStream.moveTo(f24, f3);
                            pDAppearanceContentStream.lineTo(f24, f3 + captionVerticalOffset);
                            pDAppearanceContentStream.drawShape(f14, z, false);
                        }
                    } else {
                        d = atan2;
                        z = strokingColorOnDemand;
                        f3 = f17;
                        f4 = f21;
                        Set<String> set2 = PDAbstractAppearanceHandler.SHORT_STYLES;
                        if (set2.contains(pDAnnotationLine.getStartPointEndingStyle())) {
                            pDAppearanceContentStream.moveTo(f14, f3);
                        } else {
                            pDAppearanceContentStream.moveTo(0.0f, f3);
                        }
                        if (set2.contains(pDAnnotationLine.getEndPointEndingStyle())) {
                            pDAppearanceContentStream.lineTo(sqrt - f14, f3);
                        } else {
                            pDAppearanceContentStream.lineTo(sqrt, f3);
                        }
                        pDAppearanceContentStream.drawShape(f14, z, false);
                    }
                    pDAppearanceContentStream.restoreGraphicsState();
                    boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationLine.getInteriorColor());
                    if (m67130a.f4292c < 1.0E-5d) {
                        z = false;
                    }
                    if (!"None".equals(pDAnnotationLine.getStartPointEndingStyle())) {
                        pDAppearanceContentStream.saveGraphicsState();
                        if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationLine.getStartPointEndingStyle())) {
                            d2 = d;
                            pDAppearanceContentStream.transform(Matrix.getRotateInstance(d2, f19, f20));
                            m32350j(pDAnnotationLine.getStartPointEndingStyle(), pDAppearanceContentStream, 0.0f, f3, f14, z, nonStrokingColorOnDemand, false);
                            f5 = f3;
                        } else {
                            d2 = d;
                            double d3 = f3;
                            f5 = f3;
                            m32350j(pDAnnotationLine.getStartPointEndingStyle(), pDAppearanceContentStream, f19 - ((float) (d3 * Math.sin(d2))), f20 + ((float) (d3 * Math.cos(d2))), f14, z, nonStrokingColorOnDemand, false);
                        }
                        pDAppearanceContentStream.restoreGraphicsState();
                    } else {
                        f5 = f3;
                        d2 = d;
                    }
                    if (!"None".equals(pDAnnotationLine.getEndPointEndingStyle())) {
                        if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationLine.getEndPointEndingStyle())) {
                            pDAppearanceContentStream.transform(Matrix.getRotateInstance(d2, f4, f22));
                            m32350j(pDAnnotationLine.getEndPointEndingStyle(), pDAppearanceContentStream, 0.0f, f5, f14, z, nonStrokingColorOnDemand, true);
                        } else {
                            double d4 = f5;
                            m32350j(pDAnnotationLine.getEndPointEndingStyle(), pDAppearanceContentStream, f4 - ((float) (Math.sin(d2) * d4)), f22 + ((float) (d4 * Math.cos(d2))), f14, z, nonStrokingColorOnDemand, true);
                        }
                    }
                } catch (IOException e) {
                    e.getMessage();
                }
                IOUtils.closeQuietly(pDAppearanceContentStream);
            } catch (Throwable th2) {
                IOUtils.closeQuietly(null);
                throw th2;
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    public PDLineAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
