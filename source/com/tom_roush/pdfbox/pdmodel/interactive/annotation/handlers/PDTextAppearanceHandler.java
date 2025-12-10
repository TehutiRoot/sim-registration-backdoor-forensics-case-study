package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import android.graphics.Path;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDTextAppearanceHandler extends PDAbstractAppearanceHandler {

    /* renamed from: c */
    public static final Set f60596c;

    static {
        HashSet hashSet = new HashSet();
        f60596c = hashSet;
        hashSet.add("Note");
        hashSet.add(PDAnnotationText.NAME_INSERT);
        hashSet.add(PDAnnotationText.NAME_CROSS);
        hashSet.add(PDAnnotationText.NAME_HELP);
        hashSet.add("Circle");
        hashSet.add(PDAnnotationText.NAME_PARAGRAPH);
        hashSet.add(PDAnnotationText.NAME_NEW_PARAGRAPH);
        hashSet.add(PDAnnotationText.NAME_CHECK);
        hashSet.add(PDAnnotationText.NAME_STAR);
        hashSet.add(PDAnnotationText.NAME_RIGHT_ARROW);
        hashSet.add(PDAnnotationText.NAME_RIGHT_POINTER);
        hashSet.add(PDAnnotationText.NAME_CROSS_HAIRS);
        hashSet.add(PDAnnotationText.NAME_UP_ARROW);
        hashSet.add(PDAnnotationText.NAME_UP_LEFT_ARROW);
        hashSet.add("Comment");
        hashSet.add(PDAnnotationText.NAME_KEY);
    }

    public PDTextAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
    }

    /* renamed from: A */
    public final void m32330A(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        m32315x(pDAnnotationText, 18.0f, 18.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(200.0f);
        pDAppearanceContentStream.saveGraphicsState();
        pDAppearanceContentStream.setLineWidth(1.0f);
        PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
        pDExtendedGraphicsState.setAlphaSourceFlag(false);
        Float valueOf = Float.valueOf(0.6f);
        pDExtendedGraphicsState.setStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setNonStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setBlendMode(BlendMode.NORMAL);
        pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        pDAppearanceContentStream.setNonStrokingColor(1.0f);
        pDAppearanceContentStream.addRect(0.3f, 0.3f, 17.4f, 17.4f);
        pDAppearanceContentStream.fill();
        pDAppearanceContentStream.restoreGraphicsState();
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(0.003f, 0.003f));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(500.0f, -300.0f));
        pDAppearanceContentStream.moveTo(2549.0f, 5269.0f);
        pDAppearanceContentStream.curveTo(1307.0f, 5269.0f, 300.0f, 4451.0f, 300.0f, 3441.0f);
        pDAppearanceContentStream.curveTo(300.0f, 3023.0f, 474.0f, 2640.0f, 764.0f, 2331.0f);
        pDAppearanceContentStream.curveTo(633.0f, 1985.0f, 361.0f, 1691.0f, 357.0f, 1688.0f);
        pDAppearanceContentStream.curveTo(299.0f, 1626.0f, 283.0f, 1537.0f, 316.0f, 1459.0f);
        pDAppearanceContentStream.curveTo(350.0f, 1382.0f, 426.0f, 1332.0f, 510.0f, 1332.0f);
        pDAppearanceContentStream.curveTo(1051.0f, 1332.0f, 1477.0f, 1558.0f, 1733.0f, 1739.0f);
        pDAppearanceContentStream.curveTo(1987.0f, 1659.0f, 2261.0f, 1613.0f, 2549.0f, 1613.0f);
        pDAppearanceContentStream.curveTo(3792.0f, 1613.0f, 4799.0f, 2431.0f, 4799.0f, 3441.0f);
        pDAppearanceContentStream.curveTo(4799.0f, 4451.0f, 3792.0f, 5269.0f, 2549.0f, 5269.0f);
        pDAppearanceContentStream.closePath();
        pDAppearanceContentStream.moveTo(-400.0f, 400.0f);
        pDAppearanceContentStream.lineTo(-400.0f, 6200.0f);
        pDAppearanceContentStream.lineTo(5400.0f, 6200.0f);
        pDAppearanceContentStream.lineTo(5400.0f, 400.0f);
        pDAppearanceContentStream.closeAndFillAndStroke();
    }

    /* renamed from: B */
    public final void m32329B(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 19.0f, 19.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        float f = min / 10.0f;
        float f2 = min / 5.0f;
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.moveTo(f, f2);
        pDAppearanceContentStream.lineTo(f2, f);
        float f3 = min / 2.0f;
        float f4 = f3 - f;
        pDAppearanceContentStream.lineTo(f3, f4);
        float f5 = min - f2;
        pDAppearanceContentStream.lineTo(f5, f);
        float f6 = min - f;
        pDAppearanceContentStream.lineTo(f6, f2);
        float f7 = f3 + f;
        pDAppearanceContentStream.lineTo(f7, f3);
        pDAppearanceContentStream.lineTo(f6, f5);
        pDAppearanceContentStream.lineTo(f5, f6);
        pDAppearanceContentStream.lineTo(f3, f7);
        pDAppearanceContentStream.lineTo(f2, f6);
        pDAppearanceContentStream.lineTo(f, f5);
        pDAppearanceContentStream.lineTo(f4, f3);
        pDAppearanceContentStream.closeAndFillAndStroke();
    }

    /* renamed from: C */
    public final void m32328C(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 20.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(0);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.61f);
        float f = (min * 0.001f) / 1.5f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f, f));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(0.0f, 50.0f));
        m32316w(pDAppearanceContentStream, PDType1Font.SYMBOL.getPath("circleplus"));
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: D */
    public final void m32327D(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 20.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.saveGraphicsState();
        pDAppearanceContentStream.setLineWidth(1.0f);
        PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
        pDExtendedGraphicsState.setAlphaSourceFlag(false);
        Float valueOf = Float.valueOf(0.6f);
        pDExtendedGraphicsState.setStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setNonStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setBlendMode(BlendMode.NORMAL);
        pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        pDAppearanceContentStream.setNonStrokingColor(1.0f);
        float f = min / 2.0f;
        float f2 = f - 1.0f;
        m32352h(pDAppearanceContentStream, f, f, f2);
        pDAppearanceContentStream.fill();
        pDAppearanceContentStream.restoreGraphicsState();
        pDAppearanceContentStream.saveGraphicsState();
        float f3 = (min * 0.001f) / 2.25f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f3, f3));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(500.0f, 375.0f));
        m32316w(pDAppearanceContentStream, PDType1Font.HELVETICA_BOLD.getPath("question"));
        pDAppearanceContentStream.restoreGraphicsState();
        m32352h(pDAppearanceContentStream, f, f, f2);
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: E */
    public final void m32326E(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 17.0f, 20.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(0);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.moveTo((m32315x.getWidth() / 2.0f) - 1.0f, m32315x.getHeight() - 2.0f);
        pDAppearanceContentStream.lineTo(1.0f, 1.0f);
        pDAppearanceContentStream.lineTo(m32315x.getWidth() - 2.0f, 1.0f);
        pDAppearanceContentStream.closeAndFillAndStroke();
    }

    /* renamed from: F */
    public final void m32325F(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        m32315x(pDAnnotationText, 13.0f, 18.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(200.0f);
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(0.003f, 0.003f));
        pDAppearanceContentStream.transform(Matrix.getRotateInstance(Math.toRadians(45.0d), 2500.0f, -800.0f));
        pDAppearanceContentStream.moveTo(4799.0f, 4004.0f);
        pDAppearanceContentStream.curveTo(4799.0f, 3149.0f, 4107.0f, 2457.0f, 3253.0f, 2457.0f);
        pDAppearanceContentStream.curveTo(3154.0f, 2457.0f, 3058.0f, 2466.0f, 2964.0f, 2484.0f);
        pDAppearanceContentStream.lineTo(2753.0f, 2246.0f);
        pDAppearanceContentStream.curveTo(2713.0f, 2201.0f, 2656.0f, 2175.0f, 2595.0f, 2175.0f);
        pDAppearanceContentStream.lineTo(2268.0f, 2175.0f);
        pDAppearanceContentStream.lineTo(2268.0f, 1824.0f);
        pDAppearanceContentStream.curveTo(2268.0f, 1707.0f, 2174.0f, 1613.0f, 2057.0f, 1613.0f);
        pDAppearanceContentStream.lineTo(1706.0f, 1613.0f);
        pDAppearanceContentStream.lineTo(1706.0f, 1261.0f);
        pDAppearanceContentStream.curveTo(1706.0f, 1145.0f, 1611.0f, 1050.0f, 1495.0f, 1050.0f);
        pDAppearanceContentStream.lineTo(510.0f, 1050.0f);
        pDAppearanceContentStream.curveTo(394.0f, 1050.0f, 300.0f, 1145.0f, 300.0f, 1261.0f);
        pDAppearanceContentStream.lineTo(300.0f, 1947.0f);
        pDAppearanceContentStream.curveTo(300.0f, 2003.0f, 322.0f, 2057.0f, 361.0f, 2097.0f);
        pDAppearanceContentStream.lineTo(1783.0f, 3519.0f);
        pDAppearanceContentStream.curveTo(1733.0f, 3671.0f, 1706.0f, 3834.0f, 1706.0f, 4004.0f);
        pDAppearanceContentStream.curveTo(1706.0f, 4858.0f, 2398.0f, 5550.0f, 3253.0f, 5550.0f);
        pDAppearanceContentStream.curveTo(4109.0f, 5550.0f, 4799.0f, 4860.0f, 4799.0f, 4004.0f);
        pDAppearanceContentStream.closePath();
        pDAppearanceContentStream.moveTo(3253.0f, 4425.0f);
        pDAppearanceContentStream.curveTo(3253.0f, 4192.0f, 3441.0f, 4004.0f, 3674.0f, 4004.0f);
        pDAppearanceContentStream.curveTo(3907.0f, 4004.0f, 4096.0f, 4192.0f, 4096.0f, 4425.0f);
        pDAppearanceContentStream.curveTo(4096.0f, 4658.0f, 3907.0f, 4847.0f, 3674.0f, 4847.0f);
        pDAppearanceContentStream.curveTo(3441.0f, 4847.0f, 3253.0f, 4658.0f, 3253.0f, 4425.0f);
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: G */
    public final void m32324G(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        m32315x(pDAnnotationText, 13.0f, 20.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(0);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.moveTo(6.4995f, 20.0f);
        pDAppearanceContentStream.lineTo(0.295f, 7.287f);
        pDAppearanceContentStream.lineTo(12.705f, 7.287f);
        pDAppearanceContentStream.closeAndFillAndStroke();
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(0.004f, 0.004f));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(200.0f, 0.0f));
        PDType1Font pDType1Font = PDType1Font.HELVETICA_BOLD;
        m32316w(pDAppearanceContentStream, pDType1Font.getPath("N"));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(1300.0f, 0.0f));
        m32316w(pDAppearanceContentStream, pDType1Font.getPath("P"));
        pDAppearanceContentStream.fill();
    }

    /* renamed from: H */
    public final void m32323H(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 18.0f, 20.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.61f);
        pDAppearanceContentStream.addRect(1.0f, 1.0f, m32315x.getWidth() - 2.0f, m32315x.getHeight() - 2.0f);
        pDAppearanceContentStream.moveTo(m32315x.getWidth() / 4.0f, (m32315x.getHeight() / 7.0f) * 2.0f);
        pDAppearanceContentStream.lineTo(((m32315x.getWidth() * 3.0f) / 4.0f) - 1.0f, (m32315x.getHeight() / 7.0f) * 2.0f);
        pDAppearanceContentStream.moveTo(m32315x.getWidth() / 4.0f, (m32315x.getHeight() / 7.0f) * 3.0f);
        pDAppearanceContentStream.lineTo(((m32315x.getWidth() * 3.0f) / 4.0f) - 1.0f, (m32315x.getHeight() / 7.0f) * 3.0f);
        pDAppearanceContentStream.moveTo(m32315x.getWidth() / 4.0f, (m32315x.getHeight() / 7.0f) * 4.0f);
        pDAppearanceContentStream.lineTo(((m32315x.getWidth() * 3.0f) / 4.0f) - 1.0f, (m32315x.getHeight() / 7.0f) * 4.0f);
        pDAppearanceContentStream.moveTo(m32315x.getWidth() / 4.0f, (m32315x.getHeight() / 7.0f) * 5.0f);
        pDAppearanceContentStream.lineTo(((m32315x.getWidth() * 3.0f) / 4.0f) - 1.0f, (m32315x.getHeight() / 7.0f) * 5.0f);
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: I */
    public final void m32322I(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 20.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.saveGraphicsState();
        pDAppearanceContentStream.setLineWidth(1.0f);
        PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
        pDExtendedGraphicsState.setAlphaSourceFlag(false);
        Float valueOf = Float.valueOf(0.6f);
        pDExtendedGraphicsState.setStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setNonStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setBlendMode(BlendMode.NORMAL);
        pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        pDAppearanceContentStream.setNonStrokingColor(1.0f);
        float f = min / 2.0f;
        float f2 = f - 1.0f;
        m32352h(pDAppearanceContentStream, f, f, f2);
        pDAppearanceContentStream.fill();
        pDAppearanceContentStream.restoreGraphicsState();
        pDAppearanceContentStream.saveGraphicsState();
        float f3 = (min * 0.001f) / 3.0f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f3, f3));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(850.0f, 900.0f));
        m32316w(pDAppearanceContentStream, PDType1Font.HELVETICA.getPath("paragraph"));
        pDAppearanceContentStream.restoreGraphicsState();
        pDAppearanceContentStream.fillAndStroke();
        m32353g(pDAppearanceContentStream, f, f, f2);
        pDAppearanceContentStream.stroke();
    }

    /* renamed from: J */
    public final void m32321J(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 20.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.saveGraphicsState();
        pDAppearanceContentStream.setLineWidth(1.0f);
        PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
        pDExtendedGraphicsState.setAlphaSourceFlag(false);
        Float valueOf = Float.valueOf(0.6f);
        pDExtendedGraphicsState.setStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setNonStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setBlendMode(BlendMode.NORMAL);
        pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        pDAppearanceContentStream.setNonStrokingColor(1.0f);
        float f = min / 2.0f;
        float f2 = f - 1.0f;
        m32352h(pDAppearanceContentStream, f, f, f2);
        pDAppearanceContentStream.fill();
        pDAppearanceContentStream.restoreGraphicsState();
        pDAppearanceContentStream.saveGraphicsState();
        float f3 = (min * 0.001f) / 1.3f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f3, f3));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(200.0f, 300.0f));
        m32316w(pDAppearanceContentStream, PDType1Font.ZAPF_DINGBATS.getPath("a160"));
        pDAppearanceContentStream.restoreGraphicsState();
        m32353g(pDAppearanceContentStream, f, f, f2);
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: K */
    public final void m32320K(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 17.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        float f = (min * 0.001f) / 0.8f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f, f));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(0.0f, 50.0f));
        m32316w(pDAppearanceContentStream, PDType1Font.ZAPF_DINGBATS.getPath("a174"));
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: L */
    public final void m32319L(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 19.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        float f = (min * 0.001f) / 0.8f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f, f));
        m32316w(pDAppearanceContentStream, PDType1Font.ZAPF_DINGBATS.getPath("a35"));
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: M */
    public final void m32318M(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        m32315x(pDAnnotationText, 17.0f, 20.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.moveTo(1.0f, 7.0f);
        pDAppearanceContentStream.lineTo(5.0f, 7.0f);
        pDAppearanceContentStream.lineTo(5.0f, 1.0f);
        pDAppearanceContentStream.lineTo(12.0f, 1.0f);
        pDAppearanceContentStream.lineTo(12.0f, 7.0f);
        pDAppearanceContentStream.lineTo(16.0f, 7.0f);
        pDAppearanceContentStream.lineTo(8.5f, 19.0f);
        pDAppearanceContentStream.closeAndFillAndStroke();
    }

    /* renamed from: N */
    public final void m32317N(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        m32315x(pDAnnotationText, 17.0f, 17.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        pDAppearanceContentStream.transform(Matrix.getRotateInstance(Math.toRadians(45.0d), 8.0f, -4.0f));
        pDAppearanceContentStream.moveTo(1.0f, 7.0f);
        pDAppearanceContentStream.lineTo(5.0f, 7.0f);
        pDAppearanceContentStream.lineTo(5.0f, 1.0f);
        pDAppearanceContentStream.lineTo(12.0f, 1.0f);
        pDAppearanceContentStream.lineTo(12.0f, 7.0f);
        pDAppearanceContentStream.lineTo(16.0f, 7.0f);
        pDAppearanceContentStream.lineTo(8.5f, 19.0f);
        pDAppearanceContentStream.closeAndFillAndStroke();
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
        PDAnnotationText pDAnnotationText = (PDAnnotationText) m32349k();
        if (!f60596c.contains(pDAnnotationText.getName())) {
            return;
        }
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = m32344p();
                PDColor m32346n = m32346n();
                if (m32346n == null) {
                    pDAppearanceContentStream.setNonStrokingColor(1.0f);
                } else {
                    pDAppearanceContentStream.setNonStrokingColor(m32346n);
                }
                m32339u(pDAppearanceContentStream, pDAnnotationText.getConstantOpacity());
                String name = pDAnnotationText.getName();
                if ("Note".equals(name)) {
                    m32323H(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_CROSS.equals(name)) {
                    m32329B(pDAnnotationText, pDAppearanceContentStream);
                } else if ("Circle".equals(name)) {
                    m32313z(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_INSERT.equals(name)) {
                    m32326E(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_HELP.equals(name)) {
                    m32327D(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_PARAGRAPH.equals(name)) {
                    m32322I(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_NEW_PARAGRAPH.equals(name)) {
                    m32324G(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_STAR.equals(name)) {
                    m32319L(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_CHECK.equals(name)) {
                    m32314y(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_RIGHT_ARROW.equals(name)) {
                    m32321J(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_RIGHT_POINTER.equals(name)) {
                    m32320K(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_CROSS_HAIRS.equals(name)) {
                    m32328C(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_UP_ARROW.equals(name)) {
                    m32318M(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_UP_LEFT_ARROW.equals(name)) {
                    m32317N(pDAnnotationText, pDAppearanceContentStream);
                } else if ("Comment".equals(name)) {
                    m32330A(pDAnnotationText, pDAppearanceContentStream);
                } else if (PDAnnotationText.NAME_KEY.equals(name)) {
                    m32325F(pDAnnotationText, pDAppearanceContentStream);
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

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    /* renamed from: w */
    public final void m32316w(PDAppearanceContentStream pDAppearanceContentStream, Path path) {
    }

    /* renamed from: x */
    public final PDRectangle m32315x(PDAnnotationText pDAnnotationText, float f, float f2) {
        PDRectangle m32341s = m32341s();
        if (!pDAnnotationText.isNoZoom()) {
            m32341s.setUpperRightX(m32341s.getLowerLeftX() + f);
            m32341s.setLowerLeftY(m32341s.getUpperRightY() - f2);
            pDAnnotationText.setRectangle(m32341s);
        }
        if (!pDAnnotationText.getCOSObject().containsKey(COSName.f59782F)) {
            pDAnnotationText.setNoRotate(true);
            pDAnnotationText.setNoZoom(true);
        }
        PDRectangle pDRectangle = new PDRectangle(f, f2);
        pDAnnotationText.getNormalAppearanceStream().setBBox(pDRectangle);
        return pDRectangle;
    }

    /* renamed from: y */
    public final void m32314y(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 19.0f);
        float min = Math.min(m32315x.getWidth(), m32315x.getHeight());
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.setLineWidth(0.59f);
        float f = (min * 0.001f) / 0.8f;
        pDAppearanceContentStream.transform(Matrix.getScaleInstance(f, f));
        pDAppearanceContentStream.transform(Matrix.getTranslateInstance(0.0f, 50.0f));
        m32316w(pDAppearanceContentStream, PDType1Font.ZAPF_DINGBATS.getPath("a20"));
        pDAppearanceContentStream.fillAndStroke();
    }

    /* renamed from: z */
    public final void m32313z(PDAnnotationText pDAnnotationText, PDAppearanceContentStream pDAppearanceContentStream) {
        PDRectangle m32315x = m32315x(pDAnnotationText, 20.0f, 20.0f);
        pDAppearanceContentStream.setMiterLimit(4.0f);
        pDAppearanceContentStream.setLineJoinStyle(1);
        pDAppearanceContentStream.setLineCapStyle(0);
        pDAppearanceContentStream.saveGraphicsState();
        pDAppearanceContentStream.setLineWidth(1.0f);
        PDExtendedGraphicsState pDExtendedGraphicsState = new PDExtendedGraphicsState();
        pDExtendedGraphicsState.setAlphaSourceFlag(false);
        Float valueOf = Float.valueOf(0.6f);
        pDExtendedGraphicsState.setStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setNonStrokingAlphaConstant(valueOf);
        pDExtendedGraphicsState.setBlendMode(BlendMode.NORMAL);
        pDAppearanceContentStream.setGraphicsStateParameters(pDExtendedGraphicsState);
        pDAppearanceContentStream.setNonStrokingColor(1.0f);
        m32353g(pDAppearanceContentStream, m32315x.getWidth() / 2.0f, m32315x.getHeight() / 2.0f, 6.36f);
        pDAppearanceContentStream.fill();
        pDAppearanceContentStream.restoreGraphicsState();
        pDAppearanceContentStream.setLineWidth(0.59f);
        m32353g(pDAppearanceContentStream, m32315x.getWidth() / 2.0f, m32315x.getHeight() / 2.0f, 6.36f);
        m32352h(pDAppearanceContentStream, m32315x.getWidth() / 2.0f, m32315x.getHeight() / 2.0f, 9.756f);
        pDAppearanceContentStream.fillAndStroke();
    }

    public PDTextAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
