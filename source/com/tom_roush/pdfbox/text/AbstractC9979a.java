package com.tom_roush.pdfbox.text;

import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.contentstream.PDFStreamEngine;
import com.tom_roush.pdfbox.contentstream.operator.DrawObject;
import com.tom_roush.pdfbox.contentstream.operator.state.Concatenate;
import com.tom_roush.pdfbox.contentstream.operator.state.Restore;
import com.tom_roush.pdfbox.contentstream.operator.state.Save;
import com.tom_roush.pdfbox.contentstream.operator.state.SetGraphicsStateParameters;
import com.tom_roush.pdfbox.contentstream.operator.state.SetMatrix;
import com.tom_roush.pdfbox.contentstream.operator.text.BeginText;
import com.tom_roush.pdfbox.contentstream.operator.text.EndText;
import com.tom_roush.pdfbox.contentstream.operator.text.MoveText;
import com.tom_roush.pdfbox.contentstream.operator.text.MoveTextSetLeading;
import com.tom_roush.pdfbox.contentstream.operator.text.NextLine;
import com.tom_roush.pdfbox.contentstream.operator.text.SetCharSpacing;
import com.tom_roush.pdfbox.contentstream.operator.text.SetFontAndSize;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextHorizontalScaling;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextLeading;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextRenderingMode;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextRise;
import com.tom_roush.pdfbox.contentstream.operator.text.SetWordSpacing;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowText;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextAdjusted;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextLine;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextLineAndSpace;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import com.tom_roush.pdfbox.pdmodel.font.PDTrueTypeFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.tom_roush.pdfbox.text.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9979a extends PDFStreamEngine {

    /* renamed from: n */
    public static final GlyphList f60846n;

    /* renamed from: j */
    public int f60847j;

    /* renamed from: k */
    public PDRectangle f60848k;

    /* renamed from: l */
    public Matrix f60849l;

    /* renamed from: m */
    public final Map f60850m = new WeakHashMap();

    static {
        InputStream resourceAsStream;
        try {
            if (PDFBoxResourceLoader.isReady()) {
                resourceAsStream = PDFBoxResourceLoader.getStream("com/tom_roush/pdfbox/resources/glyphlist/additional.txt");
            } else {
                resourceAsStream = GlyphList.class.getResourceAsStream(RemoteSettings.FORWARD_SLASH_STRING + "com/tom_roush/pdfbox/resources/glyphlist/additional.txt");
            }
            f60846n = new GlyphList(GlyphList.getAdobeGlyphList(), resourceAsStream);
            resourceAsStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC9979a() {
        addOperator(new BeginText());
        addOperator(new Concatenate());
        addOperator(new DrawObject());
        addOperator(new EndText());
        addOperator(new SetGraphicsStateParameters());
        addOperator(new Save());
        addOperator(new Restore());
        addOperator(new NextLine());
        addOperator(new SetCharSpacing());
        addOperator(new MoveText());
        addOperator(new MoveTextSetLeading());
        addOperator(new SetFontAndSize());
        addOperator(new ShowText());
        addOperator(new ShowTextAdjusted());
        addOperator(new SetTextLeading());
        addOperator(new SetMatrix());
        addOperator(new SetTextRenderingMode());
        addOperator(new SetTextRise());
        addOperator(new SetWordSpacing());
        addOperator(new SetTextHorizontalScaling());
        addOperator(new ShowTextLine());
        addOperator(new ShowTextLineAndSpace());
    }

    public float computeFontHeight(PDFont pDFont) throws IOException {
        BoundingBox boundingBox = pDFont.getBoundingBox();
        if (boundingBox.getLowerLeftY() < -32768.0f) {
            boundingBox.setLowerLeftY(-(boundingBox.getLowerLeftY() + 65536.0f));
        }
        float height = boundingBox.getHeight() / 2.0f;
        PDFontDescriptor fontDescriptor = pDFont.getFontDescriptor();
        if (fontDescriptor != null) {
            float capHeight = fontDescriptor.getCapHeight();
            if (Float.compare(capHeight, 0.0f) != 0 && (capHeight < height || Float.compare(height, 0.0f) == 0)) {
                height = capHeight;
            }
            float ascent = fontDescriptor.getAscent();
            float descent = fontDescriptor.getDescent();
            if (capHeight > ascent && ascent > 0.0f && descent < 0.0f) {
                float f = (ascent - descent) / 2.0f;
                if (f < height || Float.compare(height, 0.0f) == 0) {
                    height = f;
                }
            }
        }
        if (pDFont instanceof PDType3Font) {
            return pDFont.getFontMatrix().transformPoint(0.0f, height).y;
        }
        return height / 1000.0f;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void processPage(PDPage pDPage) {
        this.f60847j = pDPage.getRotation();
        PDRectangle cropBox = pDPage.getCropBox();
        this.f60848k = cropBox;
        if (cropBox.getLowerLeftX() == 0.0f && this.f60848k.getLowerLeftY() == 0.0f) {
            this.f60849l = null;
        } else {
            this.f60849l = Matrix.getTranslateInstance(-this.f60848k.getLowerLeftX(), -this.f60848k.getLowerLeftY());
        }
        super.processPage(pDPage);
    }

    public abstract void processTextPosition(TextPosition textPosition);

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showGlyph(Matrix matrix, PDFont pDFont, int i, String str, Vector vector) throws IOException {
        float f;
        float f2;
        String str2;
        Matrix concatenate;
        TrueTypeFont trueTypeFont;
        PDGraphicsState graphicsState = getGraphicsState();
        Matrix currentTransformationMatrix = graphicsState.getCurrentTransformationMatrix();
        float fontSize = graphicsState.getTextState().getFontSize();
        float horizontalScaling = graphicsState.getTextState().getHorizontalScaling() / 100.0f;
        Matrix textMatrix = getTextMatrix();
        float x = vector.getX();
        if (pDFont.isVertical()) {
            x = pDFont.getWidth(i) / 1000.0f;
            if (pDFont instanceof PDTrueTypeFont) {
                trueTypeFont = ((PDTrueTypeFont) pDFont).getTrueTypeFont();
            } else {
                if (pDFont instanceof PDType0Font) {
                    PDCIDFont descendantFont = ((PDType0Font) pDFont).getDescendantFont();
                    if (descendantFont instanceof PDCIDFontType2) {
                        trueTypeFont = ((PDCIDFontType2) descendantFont).getTrueTypeFont();
                    }
                }
                trueTypeFont = null;
            }
            if (trueTypeFont != null && trueTypeFont.getUnitsPerEm() != 1000) {
                x *= 1000.0f / trueTypeFont.getUnitsPerEm();
            }
        }
        Matrix multiply = Matrix.getTranslateInstance(x * fontSize * horizontalScaling, vector.getY() * fontSize).multiply(textMatrix).multiply(currentTransformationMatrix);
        float translateX = multiply.getTranslateX();
        float translateY = multiply.getTranslateY();
        float translateX2 = translateX - matrix.getTranslateX();
        Float f3 = (Float) this.f60850m.get(pDFont.getCOSObject());
        if (f3 == null) {
            f3 = Float.valueOf(computeFontHeight(pDFont));
            this.f60850m.put(pDFont.getCOSObject(), f3);
        }
        float scalingFactorY = matrix.getScalingFactorY() * f3.floatValue();
        if (pDFont instanceof PDType3Font) {
            f = pDFont.getFontMatrix().getScaleX();
        } else {
            f = 0.001f;
        }
        try {
            f2 = pDFont.getSpaceWidth() * f;
        } catch (Throwable th2) {
            Log.w("PdfBox-Android", th2.getMessage(), th2);
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            f2 = pDFont.getAverageFontWidth() * f * 0.8f;
        }
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        float scalingFactorX = f2 * matrix.getScalingFactorX();
        String unicode = pDFont.toUnicode(i, f60846n);
        if (unicode == null) {
            if (pDFont instanceof PDSimpleFont) {
                str2 = new String(new char[]{(char) i});
            } else {
                return;
            }
        } else {
            str2 = unicode;
        }
        Matrix matrix2 = this.f60849l;
        if (matrix2 == null) {
            concatenate = matrix;
        } else {
            concatenate = Matrix.concatenate(matrix2, matrix);
            translateX -= this.f60848k.getLowerLeftX();
            translateY -= this.f60848k.getLowerLeftY();
        }
        processTextPosition(new TextPosition(this.f60847j, this.f60848k.getWidth(), this.f60848k.getHeight(), concatenate, translateX, translateY, Math.abs(scalingFactorY), translateX2, Math.abs(scalingFactorX), str2, new int[]{i}, pDFont, fontSize, (int) (textMatrix.getScalingFactorX() * fontSize)));
    }
}
