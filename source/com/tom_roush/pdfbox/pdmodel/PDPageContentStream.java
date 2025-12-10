package com.tom_roush.pdfbox.pdmodel;

import android.graphics.Path;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDInlineImage;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.NumberFormatUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public final class PDPageContentStream implements Closeable {

    /* renamed from: a */
    public final PDDocument f60123a;

    /* renamed from: b */
    public OutputStream f60124b;

    /* renamed from: c */
    public PDResources f60125c;

    /* renamed from: d */
    public boolean f60126d;

    /* renamed from: e */
    public final Stack f60127e;

    /* renamed from: f */
    public final Stack f60128f;

    /* renamed from: g */
    public final Stack f60129g;

    /* renamed from: h */
    public final NumberFormat f60130h;

    /* renamed from: i */
    public final byte[] f60131i;

    /* renamed from: j */
    public boolean f60132j;

    /* loaded from: classes5.dex */
    public enum AppendMode {
        OVERWRITE,
        APPEND,
        PREPEND;

        public boolean isOverwrite() {
            if (this == OVERWRITE) {
                return true;
            }
            return false;
        }

        public boolean isPrepend() {
            if (this == PREPEND) {
                return true;
            }
            return false;
        }
    }

    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage) throws IOException {
        this(pDDocument, pDPage, AppendMode.OVERWRITE, true, false);
        if (this.f60132j) {
            Log.w("PdfBox-Android", "You are overwriting an existing content, you should use the append mode");
        }
    }

    @Deprecated
    public void addBezier31(float f, float f2, float f3, float f4) throws IOException {
        curveTo1(f, f2, f3, f4);
    }

    @Deprecated
    public void addBezier312(float f, float f2, float f3, float f4, float f5, float f6) throws IOException {
        curveTo(f, f2, f3, f4, f5, f6);
    }

    @Deprecated
    public void addBezier32(float f, float f2, float f3, float f4) throws IOException {
        curveTo2(f, f2, f3, f4);
    }

    public void addComment(String str) throws IOException {
        if (str.indexOf(10) < 0 && str.indexOf(13) < 0) {
            this.f60124b.write(37);
            this.f60124b.write(str.getBytes(Charsets.US_ASCII));
            this.f60124b.write(10);
            return;
        }
        throw new IllegalArgumentException("comment should not include a newline");
    }

    @Deprecated
    public void addLine(float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            moveTo(f, f2);
            lineTo(f3, f4);
            return;
        }
        throw new IllegalStateException("Error: addLine is not allowed within a text block.");
    }

    @Deprecated
    public void addPolygon(float[] fArr, float[] fArr2) throws IOException {
        if (!this.f60126d) {
            if (fArr.length == fArr2.length) {
                for (int i = 0; i < fArr.length; i++) {
                    if (i == 0) {
                        moveTo(fArr[i], fArr2[i]);
                    } else {
                        lineTo(fArr[i], fArr2[i]);
                    }
                }
                closeSubPath();
                return;
            }
            throw new IllegalArgumentException("Error: some points are missing coordinate");
        }
        throw new IllegalStateException("Error: addPolygon is not allowed within a text block.");
    }

    public void addRect(float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            m32592p(OperatorName.APPEND_RECT);
            return;
        }
        throw new IllegalStateException("Error: addRect is not allowed within a text block.");
    }

    @Deprecated
    public void appendCOSName(COSName cOSName) throws IOException {
        cOSName.writePDF(this.f60124b);
    }

    @Deprecated
    public void appendRawCommands(String str) throws IOException {
        this.f60124b.write(str.getBytes(Charsets.US_ASCII));
    }

    /* renamed from: b */
    public final COSName m32602b(PDColorSpace pDColorSpace) {
        if (!(pDColorSpace instanceof PDDeviceGray) && !(pDColorSpace instanceof PDDeviceRGB)) {
            return this.f60125c.add(pDColorSpace);
        }
        return COSName.getPDFName(pDColorSpace.getName());
    }

    public void beginMarkedContent(COSName cOSName) throws IOException {
        m32593o(cOSName);
        m32592p(OperatorName.BEGIN_MARKED_CONTENT);
    }

    @Deprecated
    public void beginMarkedContentSequence(COSName cOSName) throws IOException {
        beginMarkedContent(cOSName);
    }

    public void beginText() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.BEGIN_TEXT);
            this.f60126d = true;
            return;
        }
        throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
    }

    public void clip() throws IOException {
        if (!this.f60126d) {
            m32592p("W");
            m32592p(OperatorName.ENDPATH);
            return;
        }
        throw new IllegalStateException("Error: clip is not allowed within a text block.");
    }

    public void clipEvenOdd() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.CLIP_EVEN_ODD);
            m32592p(OperatorName.ENDPATH);
            return;
        }
        throw new IllegalStateException("Error: clipEvenOdd is not allowed within a text block.");
    }

    @Deprecated
    public void clipPath(Path.FillType fillType) throws IOException {
        if (!this.f60126d) {
            if (fillType == Path.FillType.WINDING) {
                m32592p("W");
            } else if (fillType == Path.FillType.EVEN_ODD) {
                m32592p(OperatorName.CLIP_EVEN_ODD);
            } else {
                throw new IllegalArgumentException("Error: unknown value for winding rule");
            }
            m32592p(OperatorName.ENDPATH);
            return;
        }
        throw new IllegalStateException("Error: clipPath is not allowed within a text block.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f60126d) {
            Log.w("PdfBox-Android", "You did not call endText(), some viewers won't display your text");
        }
        OutputStream outputStream = this.f60124b;
        if (outputStream != null) {
            outputStream.close();
            this.f60124b = null;
        }
    }

    public void closeAndFillAndStroke() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndFillAndStroke is not allowed within a text block.");
    }

    public void closeAndFillAndStrokeEvenOdd() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.CLOSE_FILL_EVEN_ODD_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndFillAndStrokeEvenOdd is not allowed within a text block.");
    }

    public void closeAndStroke() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.CLOSE_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndStroke is not allowed within a text block.");
    }

    public void closePath() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.CLOSE_PATH);
            return;
        }
        throw new IllegalStateException("Error: closePath is not allowed within a text block.");
    }

    @Deprecated
    public void closeSubPath() throws IOException {
        closePath();
    }

    @Deprecated
    public void concatenate2CTM(double d, double d2, double d3, double d4, double d5, double d6) throws IOException {
        transform(new Matrix((float) d, (float) d2, (float) d3, (float) d4, (float) d5, (float) d6));
    }

    public void curveTo(float f, float f2, float f3, float f4, float f5, float f6) throws IOException {
        if (!this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperand(f5);
            writeOperand(f6);
            m32592p(OperatorName.CURVE_TO);
            return;
        }
        throw new IllegalStateException("Error: curveTo is not allowed within a text block.");
    }

    public void curveTo1(float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            m32592p(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
            return;
        }
        throw new IllegalStateException("Error: curveTo1 is not allowed within a text block.");
    }

    public void curveTo2(float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            m32592p(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);
            return;
        }
        throw new IllegalStateException("Error: curveTo2 is not allowed within a text block.");
    }

    /* renamed from: d */
    public final boolean m32601d(int i) {
        return i < 0 || i > 255;
    }

    public void drawForm(PDFormXObject pDFormXObject) throws IOException {
        if (!this.f60126d) {
            m32593o(this.f60125c.add(pDFormXObject));
            m32592p(OperatorName.DRAW_OBJECT);
            return;
        }
        throw new IllegalStateException("Error: drawForm is not allowed within a text block.");
    }

    public void drawImage(PDImageXObject pDImageXObject, float f, float f2) throws IOException {
        drawImage(pDImageXObject, f, f2, pDImageXObject.getWidth(), pDImageXObject.getHeight());
    }

    @Deprecated
    public void drawInlineImage(PDInlineImage pDInlineImage, float f, float f2) throws IOException {
        drawImage(pDInlineImage, f, f2, pDInlineImage.getWidth(), pDInlineImage.getHeight());
    }

    @Deprecated
    public void drawLine(float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            moveTo(f, f2);
            lineTo(f3, f4);
            stroke();
            return;
        }
        throw new IllegalStateException("Error: drawLine is not allowed within a text block.");
    }

    @Deprecated
    public void drawPolygon(float[] fArr, float[] fArr2) throws IOException {
        if (!this.f60126d) {
            addPolygon(fArr, fArr2);
            stroke();
            return;
        }
        throw new IllegalStateException("Error: drawPolygon is not allowed within a text block.");
    }

    @Deprecated
    public void drawString(String str) throws IOException {
        showText(str);
    }

    @Deprecated
    public void drawXObject(PDXObject pDXObject, float f, float f2, float f3, float f4) throws IOException {
        drawXObject(pDXObject, new AffineTransform(f3, 0.0f, 0.0f, f4, f, f2));
    }

    public void endMarkedContent() throws IOException {
        m32592p(OperatorName.END_MARKED_CONTENT);
    }

    @Deprecated
    public void endMarkedContentSequence() throws IOException {
        endMarkedContent();
    }

    public void endText() throws IOException {
        if (this.f60126d) {
            m32592p(OperatorName.END_TEXT);
            this.f60126d = false;
            return;
        }
        throw new IllegalStateException("Error: You must call beginText() before calling endText.");
    }

    @Deprecated
    public void fill(Path.FillType fillType) throws IOException {
        if (fillType == Path.FillType.WINDING) {
            fill();
        } else if (fillType == Path.FillType.EVEN_ODD) {
            fillEvenOdd();
        } else {
            throw new IllegalArgumentException("Error: unknown value for winding rule");
        }
    }

    public void fillAndStroke() throws IOException {
        if (!this.f60126d) {
            m32592p("B");
            return;
        }
        throw new IllegalStateException("Error: fillAndStroke is not allowed within a text block.");
    }

    public void fillAndStrokeEvenOdd() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.FILL_EVEN_ODD_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: fillAndStrokeEvenOdd is not allowed within a text block.");
    }

    public void fillEvenOdd() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.FILL_EVEN_ODD);
            return;
        }
        throw new IllegalStateException("Error: fillEvenOdd is not allowed within a text block.");
    }

    @Deprecated
    public void fillPolygon(float[] fArr, float[] fArr2) throws IOException {
        if (!this.f60126d) {
            addPolygon(fArr, fArr2);
            fill();
            return;
        }
        throw new IllegalStateException("Error: fillPolygon is not allowed within a text block.");
    }

    @Deprecated
    public void fillRect(float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            addRect(f, f2, f3, f4);
            fill();
            return;
        }
        throw new IllegalStateException("Error: fillRect is not allowed within a text block.");
    }

    /* renamed from: g */
    public final boolean m32600g(double d) {
        return d < 0.0d || d > 1.0d;
    }

    /* renamed from: i */
    public final void m32599i(PDColorSpace pDColorSpace) {
        if (this.f60128f.isEmpty()) {
            this.f60128f.add(pDColorSpace);
            return;
        }
        Stack stack = this.f60128f;
        stack.setElementAt(pDColorSpace, stack.size() - 1);
    }

    /* renamed from: j */
    public final void m32598j(PDColorSpace pDColorSpace) {
        if (this.f60129g.isEmpty()) {
            this.f60129g.add(pDColorSpace);
            return;
        }
        Stack stack = this.f60129g;
        stack.setElementAt(pDColorSpace, stack.size() - 1);
    }

    /* renamed from: k */
    public final void m32597k(String str) {
        this.f60124b.write(str.getBytes(Charsets.US_ASCII));
    }

    /* renamed from: l */
    public final void m32596l(AffineTransform affineTransform) {
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i = 0; i < 6; i++) {
            writeOperand((float) dArr[i]);
        }
    }

    public void lineTo(float f, float f2) throws IOException {
        if (!this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            m32592p(OperatorName.LINE_TO);
            return;
        }
        throw new IllegalStateException("Error: lineTo is not allowed within a text block.");
    }

    /* renamed from: m */
    public final void m32595m() {
        this.f60124b.write(10);
    }

    @Deprecated
    public void moveTextPositionByAmount(float f, float f2) throws IOException {
        newLineAtOffset(f, f2);
    }

    public void moveTo(float f, float f2) throws IOException {
        if (!this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            m32592p(OperatorName.MOVE_TO);
            return;
        }
        throw new IllegalStateException("Error: moveTo is not allowed within a text block.");
    }

    /* renamed from: n */
    public final void m32594n(int i) {
        m32597k(this.f60130h.format(i));
        this.f60124b.write(32);
    }

    public void newLine() throws IOException {
        if (this.f60126d) {
            m32592p(OperatorName.NEXT_LINE);
            return;
        }
        throw new IllegalStateException("Must call beginText() before newLine()");
    }

    public void newLineAtOffset(float f, float f2) throws IOException {
        if (this.f60126d) {
            writeOperand(f);
            writeOperand(f2);
            m32592p(OperatorName.MOVE_TEXT);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before newLineAtOffset()");
    }

    /* renamed from: o */
    public final void m32593o(COSName cOSName) {
        cOSName.writePDF(this.f60124b);
        this.f60124b.write(32);
    }

    /* renamed from: p */
    public final void m32592p(String str) {
        this.f60124b.write(str.getBytes(Charsets.US_ASCII));
        this.f60124b.write(10);
    }

    public void restoreGraphicsState() throws IOException {
        if (this.f60126d) {
            Log.w("PdfBox-Android", "Restoring the graphics state is not allowed within text objects.");
        }
        if (!this.f60127e.isEmpty()) {
            this.f60127e.pop();
        }
        if (!this.f60129g.isEmpty()) {
            this.f60129g.pop();
        }
        if (!this.f60128f.isEmpty()) {
            this.f60128f.pop();
        }
        m32592p(OperatorName.RESTORE);
    }

    public void saveGraphicsState() throws IOException {
        if (this.f60126d) {
            Log.w("PdfBox-Android", "Saving the graphics state is not allowed within text objects.");
        }
        if (!this.f60127e.isEmpty()) {
            Stack stack = this.f60127e;
            stack.push(stack.peek());
        }
        if (!this.f60129g.isEmpty()) {
            Stack stack2 = this.f60129g;
            stack2.push(stack2.peek());
        }
        if (!this.f60128f.isEmpty()) {
            Stack stack3 = this.f60128f;
            stack3.push(stack3.peek());
        }
        m32592p(OperatorName.SAVE);
    }

    public void setCharacterSpacing(float f) throws IOException {
        writeOperand(f);
        m32592p(OperatorName.SET_CHAR_SPACING);
    }

    public void setFont(PDFont pDFont, float f) throws IOException {
        if (this.f60127e.isEmpty()) {
            this.f60127e.add(pDFont);
        } else {
            Stack stack = this.f60127e;
            stack.setElementAt(pDFont, stack.size() - 1);
        }
        if (pDFont.willBeSubset()) {
            this.f60123a.m32607l().add(pDFont);
        }
        m32593o(this.f60125c.add(pDFont));
        writeOperand(f);
        m32592p(OperatorName.SET_FONT_AND_SIZE);
    }

    public void setGraphicsStateParameters(PDExtendedGraphicsState pDExtendedGraphicsState) throws IOException {
        m32593o(this.f60125c.add(pDExtendedGraphicsState));
        m32592p(OperatorName.SET_GRAPHICS_STATE_PARAMS);
    }

    public void setHorizontalScaling(float f) throws IOException {
        writeOperand(f);
        m32592p(OperatorName.SET_TEXT_HORIZONTAL_SCALING);
    }

    @Deprecated
    public void setLeading(double d) throws IOException {
        setLeading((float) d);
    }

    public void setLineCapStyle(int i) throws IOException {
        if (i >= 0 && i <= 2) {
            m32594n(i);
            m32592p(OperatorName.SET_LINE_CAPSTYLE);
            return;
        }
        throw new IllegalArgumentException("Error: unknown value for line cap style");
    }

    public void setLineDashPattern(float[] fArr, float f) throws IOException {
        m32597k("[");
        for (float f2 : fArr) {
            writeOperand(f2);
        }
        m32597k("] ");
        writeOperand(f);
        m32592p("d");
    }

    public void setLineJoinStyle(int i) throws IOException {
        if (i >= 0 && i <= 2) {
            m32594n(i);
            m32592p(OperatorName.SET_LINE_JOINSTYLE);
            return;
        }
        throw new IllegalArgumentException("Error: unknown value for line join style");
    }

    public void setLineWidth(float f) throws IOException {
        writeOperand(f);
        m32592p(OperatorName.SET_LINE_WIDTH);
    }

    public void setMiterLimit(float f) throws IOException {
        if (f > 0.0d) {
            writeOperand(f);
            m32592p("M");
            return;
        }
        throw new IllegalArgumentException("A miter limit <= 0 is invalid and will not render in Acrobat Reader");
    }

    public void setNonStrokingColor(PDColor pDColor) throws IOException {
        if (this.f60128f.isEmpty() || this.f60128f.peek() != pDColor.getColorSpace()) {
            m32593o(m32602b(pDColor.getColorSpace()));
            m32592p(OperatorName.NON_STROKING_COLORSPACE);
            m32599i(pDColor.getColorSpace());
        }
        for (float f : pDColor.getComponents()) {
            writeOperand(f);
        }
        m32592p(OperatorName.NON_STROKING_COLOR);
    }

    @Deprecated
    public void setNonStrokingColorSpace(PDColorSpace pDColorSpace) throws IOException {
        m32599i(pDColorSpace);
        m32593o(m32602b(pDColorSpace));
        m32592p(OperatorName.NON_STROKING_COLORSPACE);
    }

    public void setRenderingMode(RenderingMode renderingMode) throws IOException {
        m32594n(renderingMode.intValue());
        m32592p(OperatorName.SET_TEXT_RENDERINGMODE);
    }

    public void setStrokingColor(PDColor pDColor) throws IOException {
        if (this.f60129g.isEmpty() || this.f60129g.peek() != pDColor.getColorSpace()) {
            m32593o(m32602b(pDColor.getColorSpace()));
            m32592p(OperatorName.STROKING_COLORSPACE);
            m32598j(pDColor.getColorSpace());
        }
        for (float f : pDColor.getComponents()) {
            writeOperand(f);
        }
        m32592p(OperatorName.STROKING_COLOR);
    }

    @Deprecated
    public void setStrokingColorSpace(PDColorSpace pDColorSpace) throws IOException {
        m32598j(pDColorSpace);
        m32593o(m32602b(pDColorSpace));
        m32592p(OperatorName.STROKING_COLORSPACE);
    }

    @Deprecated
    public void setTextMatrix(double d, double d2, double d3, double d4, double d5, double d6) throws IOException {
        setTextMatrix(new Matrix((float) d, (float) d2, (float) d3, (float) d4, (float) d5, (float) d6));
    }

    public void setTextRise(float f) throws IOException {
        writeOperand(f);
        m32592p(OperatorName.SET_TEXT_RISE);
    }

    @Deprecated
    public void setTextRotation(double d, double d2, double d3) throws IOException {
        setTextMatrix(Matrix.getRotateInstance(d, (float) d2, (float) d3));
    }

    @Deprecated
    public void setTextScaling(double d, double d2, double d3, double d4) throws IOException {
        setTextMatrix(new Matrix((float) d, 0.0f, 0.0f, (float) d2, (float) d3, (float) d4));
    }

    @Deprecated
    public void setTextTranslation(double d, double d2) throws IOException {
        setTextMatrix(Matrix.getTranslateInstance((float) d, (float) d2));
    }

    public void setWordSpacing(float f) throws IOException {
        writeOperand(f);
        m32592p(OperatorName.SET_WORD_SPACING);
    }

    public void shadingFill(PDShading pDShading) throws IOException {
        if (!this.f60126d) {
            m32593o(this.f60125c.add(pDShading));
            m32592p(OperatorName.SHADING_FILL);
            return;
        }
        throw new IllegalStateException("Error: shadingFill is not allowed within a text block.");
    }

    public void showText(String str) throws IOException {
        showTextInternal(str);
        m32597k(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        m32592p(OperatorName.SHOW_TEXT);
    }

    public void showTextInternal(String str) throws IOException {
        if (this.f60126d) {
            if (!this.f60127e.isEmpty()) {
                PDFont pDFont = (PDFont) this.f60127e.peek();
                if (pDFont.willBeSubset()) {
                    int i = 0;
                    while (i < str.length()) {
                        int codePointAt = str.codePointAt(i);
                        pDFont.addToSubset(codePointAt);
                        i += Character.charCount(codePointAt);
                    }
                }
                COSWriter.writeString(pDFont.encode(str), this.f60124b);
                return;
            }
            throw new IllegalStateException("Must call setFont() before showText()");
        }
        throw new IllegalStateException("Must call beginText() before showText()");
    }

    public void showTextWithPositioning(Object[] objArr) throws IOException {
        m32597k("[");
        for (Object obj : objArr) {
            if (obj instanceof String) {
                showTextInternal((String) obj);
            } else if (obj instanceof Float) {
                writeOperand(((Float) obj).floatValue());
            } else {
                throw new IllegalArgumentException("Argument must consist of array of Float and String types");
            }
        }
        m32597k("] ");
        m32592p(OperatorName.SHOW_TEXT_ADJUSTED);
    }

    public void stroke() throws IOException {
        if (!this.f60126d) {
            m32592p("S");
            return;
        }
        throw new IllegalStateException("Error: stroke is not allowed within a text block.");
    }

    public void transform(Matrix matrix) throws IOException {
        if (this.f60126d) {
            Log.w("PdfBox-Android", "Modifying the current transformation matrix is not allowed within text objects.");
        }
        m32596l(matrix.createAffineTransform());
        m32592p(OperatorName.CONCAT);
    }

    public final void writeBytes(byte[] bArr) {
        this.f60124b.write(bArr);
    }

    public void writeOperand(float f) throws IOException {
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            int formatFloatFast = NumberFormatUtil.formatFloatFast(f, this.f60130h.getMaximumFractionDigits(), this.f60131i);
            if (formatFloatFast == -1) {
                m32597k(this.f60130h.format(f));
            } else {
                this.f60124b.write(this.f60131i, 0, formatFloatFast);
            }
            this.f60124b.write(32);
            return;
        }
        throw new IllegalArgumentException(f + " is not a finite number");
    }

    @Deprecated
    public void appendRawCommands(byte[] bArr) throws IOException {
        this.f60124b.write(bArr);
    }

    @Deprecated
    public void beginMarkedContentSequence(COSName cOSName, COSName cOSName2) throws IOException {
        m32593o(cOSName);
        m32593o(cOSName2);
        m32592p(OperatorName.BEGIN_MARKED_CONTENT_SEQ);
    }

    @Deprecated
    public void concatenate2CTM(AffineTransform affineTransform) throws IOException {
        transform(new Matrix(affineTransform));
    }

    public void drawImage(PDImageXObject pDImageXObject, float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            saveGraphicsState();
            transform(new Matrix(new AffineTransform(f3, 0.0f, 0.0f, f4, f, f2)));
            m32593o(this.f60125c.add(pDImageXObject));
            m32592p(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    @Deprecated
    public void drawInlineImage(PDInlineImage pDInlineImage, float f, float f2, float f3, float f4) throws IOException {
        drawImage(pDInlineImage, f, f2, f3, f4);
    }

    public void setLeading(float f) throws IOException {
        writeOperand(f);
        m32592p(OperatorName.SET_TEXT_LEADING);
    }

    @Deprecated
    public void setTextMatrix(AffineTransform affineTransform) throws IOException {
        setTextMatrix(new Matrix(affineTransform));
    }

    @Deprecated
    public void appendRawCommands(int i) throws IOException {
        this.f60124b.write(i);
    }

    public void beginMarkedContent(COSName cOSName, PDPropertyList pDPropertyList) throws IOException {
        m32593o(cOSName);
        m32593o(this.f60125c.add(pDPropertyList));
        m32592p(OperatorName.BEGIN_MARKED_CONTENT_SEQ);
    }

    @Deprecated
    public void drawXObject(PDXObject pDXObject, AffineTransform affineTransform) throws IOException {
        String str;
        if (!this.f60126d) {
            if (pDXObject instanceof PDImageXObject) {
                str = "Im";
            } else {
                str = StandardStructureTypes.FORM;
            }
            COSName add = this.f60125c.add(pDXObject, str);
            saveGraphicsState();
            transform(new Matrix(affineTransform));
            m32593o(add);
            m32592p(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawXObject is not allowed within a text block.");
    }

    public void setTextMatrix(Matrix matrix) throws IOException {
        if (this.f60126d) {
            m32596l(matrix.createAffineTransform());
            m32592p(OperatorName.SET_MATRIX);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before setTextMatrix");
    }

    @Deprecated
    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, boolean z, boolean z2) throws IOException {
        this(pDDocument, pDPage, z, z2, false);
    }

    @Deprecated
    public void appendRawCommands(double d) throws IOException {
        this.f60124b.write(this.f60130h.format(d).getBytes(Charsets.US_ASCII));
    }

    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, AppendMode appendMode, boolean z) throws IOException {
        this(pDDocument, pDPage, appendMode, z, false);
    }

    @Deprecated
    public void appendRawCommands(float f) throws IOException {
        this.f60124b.write(this.f60130h.format(f).getBytes(Charsets.US_ASCII));
    }

    @Deprecated
    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, boolean z, boolean z2, boolean z3) throws IOException {
        this(pDDocument, pDPage, z ? AppendMode.APPEND : AppendMode.OVERWRITE, z2, z3);
    }

    public void fill() throws IOException {
        if (!this.f60126d) {
            m32592p(OperatorName.FILL_NON_ZERO);
            return;
        }
        throw new IllegalStateException("Error: fill is not allowed within a text block.");
    }

    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, AppendMode appendMode, boolean z, boolean z2) throws IOException {
        COSArray cOSArray;
        this.f60126d = false;
        this.f60127e = new Stack();
        this.f60128f = new Stack();
        this.f60129g = new Stack();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f60130h = numberInstance;
        this.f60131i = new byte[32];
        this.f60132j = false;
        this.f60123a = pDDocument;
        COSName cOSName = z ? COSName.FLATE_DECODE : null;
        if (!appendMode.isOverwrite() && pDPage.hasContents()) {
            PDStream pDStream = new PDStream(pDDocument);
            COSDictionary cOSObject = pDPage.getCOSObject();
            COSName cOSName2 = COSName.CONTENTS;
            COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName2);
            if (dictionaryObject instanceof COSArray) {
                cOSArray = (COSArray) dictionaryObject;
            } else {
                COSArray cOSArray2 = new COSArray();
                cOSArray2.add(dictionaryObject);
                cOSArray = cOSArray2;
            }
            if (appendMode.isPrepend()) {
                cOSArray.add(0, pDStream.getCOSObject());
            } else {
                cOSArray.add(pDStream);
            }
            if (z2) {
                PDStream pDStream2 = new PDStream(pDDocument);
                this.f60124b = pDStream2.createOutputStream(cOSName);
                saveGraphicsState();
                close();
                cOSArray.add(0, pDStream2.getCOSObject());
            }
            pDPage.getCOSObject().setItem(cOSName2, (COSBase) cOSArray);
            this.f60124b = pDStream.createOutputStream(cOSName);
            if (z2) {
                restoreGraphicsState();
            }
        } else {
            this.f60132j = pDPage.hasContents();
            PDStream pDStream3 = new PDStream(pDDocument);
            pDPage.setContents(pDStream3);
            this.f60124b = pDStream3.createOutputStream(cOSName);
        }
        PDResources resources = pDPage.getResources();
        this.f60125c = resources;
        if (resources == null) {
            PDResources pDResources = new PDResources();
            this.f60125c = pDResources;
            pDPage.setResources(pDResources);
        }
        numberInstance.setMaximumFractionDigits(5);
        numberInstance.setGroupingUsed(false);
    }

    public void setNonStrokingColor(AWTColor aWTColor) throws IOException {
        setNonStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void setStrokingColor(AWTColor aWTColor) throws IOException {
        setStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void drawImage(PDImageXObject pDImageXObject, Matrix matrix) throws IOException {
        if (!this.f60126d) {
            saveGraphicsState();
            transform(new Matrix(matrix.createAffineTransform()));
            m32593o(this.f60125c.add(pDImageXObject));
            m32592p(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    @Deprecated
    public void setNonStrokingColor(float[] fArr) throws IOException {
        if (!this.f60128f.isEmpty()) {
            for (float f : fArr) {
                writeOperand(f);
            }
            PDColorSpace pDColorSpace = (PDColorSpace) this.f60128f.peek();
            m32592p(OperatorName.NON_STROKING_COLOR);
            return;
        }
        throw new IllegalStateException("The color space must be set before setting a color");
    }

    @Deprecated
    public void setStrokingColor(float[] fArr) throws IOException {
        if (!this.f60129g.isEmpty()) {
            for (float f : fArr) {
                writeOperand(f);
            }
            PDColorSpace pDColorSpace = (PDColorSpace) this.f60129g.peek();
            m32592p(OperatorName.STROKING_COLOR);
            return;
        }
        throw new IllegalStateException("The color space must be set before setting a color");
    }

    public void drawImage(PDInlineImage pDInlineImage, float f, float f2) throws IOException {
        drawImage(pDInlineImage, f, f2, pDInlineImage.getWidth(), pDInlineImage.getHeight());
    }

    public void setNonStrokingColor(float f, float f2, float f3) throws IOException {
        if (!m32600g(f) && !m32600g(f2) && !m32600g(f3)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            m32592p(OperatorName.NON_STROKING_RGB);
            m32599i(PDDeviceRGB.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void setStrokingColor(float f, float f2, float f3) throws IOException {
        if (!m32600g(f) && !m32600g(f2) && !m32600g(f3)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            m32592p(OperatorName.STROKING_COLOR_RGB);
            m32598j(PDDeviceRGB.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void drawImage(PDInlineImage pDInlineImage, float f, float f2, float f3, float f4) throws IOException {
        if (!this.f60126d) {
            saveGraphicsState();
            transform(new Matrix(f3, 0.0f, 0.0f, f4, f, f2));
            StringBuilder sb = new StringBuilder();
            sb.append(OperatorName.BEGIN_INLINE_IMAGE);
            sb.append("\n /W ");
            sb.append(pDInlineImage.getWidth());
            sb.append("\n /H ");
            sb.append(pDInlineImage.getHeight());
            sb.append("\n /CS ");
            sb.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb.append(pDInlineImage.getColorSpace().getName());
            COSArray decode = pDInlineImage.getDecode();
            if (decode != null && decode.size() > 0) {
                sb.append("\n /D ");
                sb.append("[");
                Iterator<COSBase> it = decode.iterator();
                while (it.hasNext()) {
                    sb.append(((COSNumber) it.next()).intValue());
                    sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                }
                sb.append("]");
            }
            if (pDInlineImage.isStencil()) {
                sb.append("\n /IM true");
            }
            sb.append("\n /BPC ");
            sb.append(pDInlineImage.getBitsPerComponent());
            m32597k(sb.toString());
            m32595m();
            m32592p(OperatorName.BEGIN_INLINE_IMAGE_DATA);
            writeBytes(pDInlineImage.getData());
            m32595m();
            m32592p(OperatorName.END_INLINE_IMAGE);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    @Deprecated
    public void setNonStrokingColor(int i, int i2, int i3) throws IOException {
        if (!m32601d(i) && !m32601d(i2) && !m32601d(i3)) {
            setNonStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Deprecated
    public void setStrokingColor(int i, int i2, int i3) throws IOException {
        if (!m32601d(i) && !m32601d(i2) && !m32601d(i3)) {
            setStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public void setNonStrokingColor(int i, int i2, int i3, int i4) throws IOException {
        if (!m32601d(i) && !m32601d(i2) && !m32601d(i3) && !m32601d(i4)) {
            setNonStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Deprecated
    public void setStrokingColor(int i, int i2, int i3, int i4) throws IOException {
        if (!m32601d(i) && !m32601d(i2) && !m32601d(i3) && !m32601d(i4)) {
            setStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Deprecated
    public void setNonStrokingColor(double d, double d2, double d3, double d4) throws IOException {
        setNonStrokingColor((float) d, (float) d2, (float) d3, (float) d4);
    }

    public void setStrokingColor(float f, float f2, float f3, float f4) throws IOException {
        if (!m32600g(f) && !m32600g(f2) && !m32600g(f3) && !m32600g(f4)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            m32592p("K");
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public void setNonStrokingColor(float f, float f2, float f3, float f4) throws IOException {
        if (!m32600g(f) && !m32600g(f2) && !m32600g(f3) && !m32600g(f4)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            m32592p(OperatorName.NON_STROKING_CMYK);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    @Deprecated
    public void setStrokingColor(int i) throws IOException {
        if (!m32601d(i)) {
            setStrokingColor(i / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..255, but is " + i);
    }

    public void setNonStrokingColor(int i) throws IOException {
        if (!m32601d(i)) {
            setNonStrokingColor(i / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..255, but is " + i);
    }

    public PDPageContentStream(PDDocument pDDocument, PDAppearanceStream pDAppearanceStream) throws IOException {
        this(pDDocument, pDAppearanceStream, pDAppearanceStream.getStream().createOutputStream());
    }

    public PDPageContentStream(PDDocument pDDocument, PDAppearanceStream pDAppearanceStream, OutputStream outputStream) throws IOException {
        this.f60126d = false;
        this.f60127e = new Stack();
        this.f60128f = new Stack();
        this.f60129g = new Stack();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f60130h = numberInstance;
        this.f60131i = new byte[32];
        this.f60132j = false;
        this.f60123a = pDDocument;
        this.f60124b = outputStream;
        this.f60125c = pDAppearanceStream.getResources();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    @Deprecated
    public void setStrokingColor(double d) throws IOException {
        setStrokingColor((float) d);
    }

    @Deprecated
    public void setNonStrokingColor(double d) throws IOException {
        setNonStrokingColor((float) d);
    }

    public void setStrokingColor(float f) throws IOException {
        if (!m32600g(f)) {
            writeOperand(f);
            m32592p(OperatorName.STROKING_COLOR_GRAY);
            m32598j(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f);
    }

    public void setNonStrokingColor(float f) throws IOException {
        if (!m32600g(f)) {
            writeOperand(f);
            m32592p(OperatorName.NON_STROKING_GRAY);
            m32599i(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f);
    }

    public PDPageContentStream(PDDocument pDDocument, PDFormXObject pDFormXObject, OutputStream outputStream) throws IOException {
        this.f60126d = false;
        this.f60127e = new Stack();
        this.f60128f = new Stack();
        this.f60129g = new Stack();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f60130h = numberInstance;
        this.f60131i = new byte[32];
        this.f60132j = false;
        this.f60123a = pDDocument;
        this.f60124b = outputStream;
        this.f60125c = pDFormXObject.getResources();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    public PDPageContentStream(PDDocument pDDocument, PDTilingPattern pDTilingPattern, OutputStream outputStream) throws IOException {
        this.f60126d = false;
        this.f60127e = new Stack();
        this.f60128f = new Stack();
        this.f60129g = new Stack();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f60130h = numberInstance;
        this.f60131i = new byte[32];
        this.f60132j = false;
        this.f60123a = pDDocument;
        this.f60124b = outputStream;
        this.f60125c = pDTilingPattern.getResources();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }
}
