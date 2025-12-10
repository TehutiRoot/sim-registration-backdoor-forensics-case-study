package p000;

import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDInlineImage;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.NumberFormatUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: gh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20079gh1 implements Closeable {

    /* renamed from: a */
    public final NumberFormat f62227a;

    /* renamed from: b */
    public final byte[] f62228b;
    protected final PDDocument document;
    protected final OutputStream outputStream;
    protected final PDResources resources;
    protected boolean inTextMode = false;
    protected final Deque<PDFont> fontStack = new ArrayDeque();
    protected final Deque<PDColorSpace> nonStrokingColorSpaceStack = new ArrayDeque();
    protected final Deque<PDColorSpace> strokingColorSpaceStack = new ArrayDeque();

    public AbstractC20079gh1(PDDocument pDDocument, OutputStream outputStream, PDResources pDResources) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f62227a = numberInstance;
        this.f62228b = new byte[32];
        this.document = pDDocument;
        this.outputStream = outputStream;
        this.resources = pDResources;
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    public void addComment(String str) {
        if (str.indexOf(10) < 0 && str.indexOf(13) < 0) {
            this.outputStream.write(37);
            this.outputStream.write(str.getBytes(Charsets.US_ASCII));
            this.outputStream.write(10);
            return;
        }
        throw new IllegalArgumentException("comment should not include a newline");
    }

    public void addRect(float f, float f2, float f3, float f4) {
        if (!this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperator(OperatorName.APPEND_RECT);
            return;
        }
        throw new IllegalStateException("Error: addRect is not allowed within a text block.");
    }

    /* renamed from: b */
    public final boolean m31064b(double d) {
        if (d >= 0.0d && d <= 1.0d) {
            return false;
        }
        return true;
    }

    public void beginMarkedContent(COSName cOSName) {
        writeOperand(cOSName);
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT);
    }

    public void beginText() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.BEGIN_TEXT);
            this.inTextMode = true;
            return;
        }
        throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
    }

    public void clip() {
        if (!this.inTextMode) {
            writeOperator("W");
            writeOperator(OperatorName.ENDPATH);
            return;
        }
        throw new IllegalStateException("Error: clip is not allowed within a text block.");
    }

    public void clipEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLIP_EVEN_ODD);
            writeOperator(OperatorName.ENDPATH);
            return;
        }
        throw new IllegalStateException("Error: clipEvenOdd is not allowed within a text block.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.inTextMode) {
            Log.w("PdfBox-Android", "You did not call endText(), some viewers won't display your text");
        }
        this.outputStream.close();
    }

    public void closeAndFillAndStroke() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndFillAndStroke is not allowed within a text block.");
    }

    public void closeAndFillAndStrokeEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLOSE_FILL_EVEN_ODD_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndFillAndStrokeEvenOdd is not allowed within a text block.");
    }

    public void closeAndStroke() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLOSE_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndStroke is not allowed within a text block.");
    }

    public void closePath() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLOSE_PATH);
            return;
        }
        throw new IllegalStateException("Error: closePath is not allowed within a text block.");
    }

    public void curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        if (!this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperand(f5);
            writeOperand(f6);
            writeOperator(OperatorName.CURVE_TO);
            return;
        }
        throw new IllegalStateException("Error: curveTo is not allowed within a text block.");
    }

    public void curveTo1(float f, float f2, float f3, float f4) {
        if (!this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperator(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
            return;
        }
        throw new IllegalStateException("Error: curveTo1 is not allowed within a text block.");
    }

    public void curveTo2(float f, float f2, float f3, float f4) {
        if (!this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperator(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);
            return;
        }
        throw new IllegalStateException("Error: curveTo2 is not allowed within a text block.");
    }

    /* renamed from: d */
    public final void m31063d(AffineTransform affineTransform) {
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i = 0; i < 6; i++) {
            writeOperand((float) dArr[i]);
        }
    }

    public void drawForm(PDFormXObject pDFormXObject) {
        if (!this.inTextMode) {
            writeOperand(this.resources.add(pDFormXObject));
            writeOperator(OperatorName.DRAW_OBJECT);
            return;
        }
        throw new IllegalStateException("Error: drawForm is not allowed within a text block.");
    }

    public void drawImage(PDImageXObject pDImageXObject, float f, float f2) {
        drawImage(pDImageXObject, f, f2, pDImageXObject.getWidth(), pDImageXObject.getHeight());
    }

    public void endMarkedContent() {
        writeOperator(OperatorName.END_MARKED_CONTENT);
    }

    public void endText() {
        if (this.inTextMode) {
            writeOperator(OperatorName.END_TEXT);
            this.inTextMode = false;
            return;
        }
        throw new IllegalStateException("Error: You must call beginText() before calling endText.");
    }

    public void fill() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.FILL_NON_ZERO);
            return;
        }
        throw new IllegalStateException("Error: fill is not allowed within a text block.");
    }

    public void fillAndStroke() {
        if (!this.inTextMode) {
            writeOperator("B");
            return;
        }
        throw new IllegalStateException("Error: fillAndStroke is not allowed within a text block.");
    }

    public void fillAndStrokeEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.FILL_EVEN_ODD_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: fillAndStrokeEvenOdd is not allowed within a text block.");
    }

    public void fillEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.FILL_EVEN_ODD);
            return;
        }
        throw new IllegalStateException("Error: fillEvenOdd is not allowed within a text block.");
    }

    public COSName getName(PDColorSpace pDColorSpace) {
        if (!(pDColorSpace instanceof PDDeviceGray) && !(pDColorSpace instanceof PDDeviceRGB)) {
            return this.resources.add(pDColorSpace);
        }
        return COSName.getPDFName(pDColorSpace.getName());
    }

    public boolean isOutside255Interval(int i) {
        if (i >= 0 && i <= 255) {
            return false;
        }
        return true;
    }

    public void lineTo(float f, float f2) {
        if (!this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperator(OperatorName.LINE_TO);
            return;
        }
        throw new IllegalStateException("Error: lineTo is not allowed within a text block.");
    }

    public void moveTo(float f, float f2) {
        if (!this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperator(OperatorName.MOVE_TO);
            return;
        }
        throw new IllegalStateException("Error: moveTo is not allowed within a text block.");
    }

    public void newLine() {
        if (this.inTextMode) {
            writeOperator(OperatorName.NEXT_LINE);
            return;
        }
        throw new IllegalStateException("Must call beginText() before newLine()");
    }

    public void newLineAtOffset(float f, float f2) {
        if (this.inTextMode) {
            writeOperand(f);
            writeOperand(f2);
            writeOperator(OperatorName.MOVE_TEXT);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before newLineAtOffset()");
    }

    public void restoreGraphicsState() {
        if (!this.inTextMode) {
            if (!this.fontStack.isEmpty()) {
                this.fontStack.pop();
            }
            if (!this.strokingColorSpaceStack.isEmpty()) {
                this.strokingColorSpaceStack.pop();
            }
            if (!this.nonStrokingColorSpaceStack.isEmpty()) {
                this.nonStrokingColorSpaceStack.pop();
            }
            writeOperator(OperatorName.RESTORE);
            return;
        }
        throw new IllegalStateException("Error: Restoring the graphics state is not allowed within text objects.");
    }

    public void saveGraphicsState() {
        if (!this.inTextMode) {
            if (!this.fontStack.isEmpty()) {
                Deque<PDFont> deque = this.fontStack;
                deque.push(deque.peek());
            }
            if (!this.strokingColorSpaceStack.isEmpty()) {
                Deque<PDColorSpace> deque2 = this.strokingColorSpaceStack;
                deque2.push(deque2.peek());
            }
            if (!this.nonStrokingColorSpaceStack.isEmpty()) {
                Deque<PDColorSpace> deque3 = this.nonStrokingColorSpaceStack;
                deque3.push(deque3.peek());
            }
            writeOperator(OperatorName.SAVE);
            return;
        }
        throw new IllegalStateException("Error: Saving the graphics state is not allowed within text objects.");
    }

    public void setCharacterSpacing(float f) {
        writeOperand(f);
        writeOperator(OperatorName.SET_CHAR_SPACING);
    }

    public void setFont(PDFont pDFont, float f) {
        if (this.fontStack.isEmpty()) {
            this.fontStack.add(pDFont);
        } else {
            this.fontStack.pop();
            this.fontStack.push(pDFont);
        }
        if (pDFont.willBeSubset()) {
            PDDocument pDDocument = this.document;
            if (pDDocument != null) {
                pDDocument.m32607l().add(pDFont);
            } else {
                Log.w("PdfBox-Android", "Using the subsetted font '" + pDFont.getName() + "' without a PDDocument context; call subset() before saving");
            }
        }
        writeOperand(this.resources.add(pDFont));
        writeOperand(f);
        writeOperator(OperatorName.SET_FONT_AND_SIZE);
    }

    public void setGraphicsStateParameters(PDExtendedGraphicsState pDExtendedGraphicsState) {
        writeOperand(this.resources.add(pDExtendedGraphicsState));
        writeOperator(OperatorName.SET_GRAPHICS_STATE_PARAMS);
    }

    public void setHorizontalScaling(float f) {
        writeOperand(f);
        writeOperator(OperatorName.SET_TEXT_HORIZONTAL_SCALING);
    }

    public void setLeading(float f) {
        writeOperand(f);
        writeOperator(OperatorName.SET_TEXT_LEADING);
    }

    public void setLineCapStyle(int i) {
        if (i >= 0 && i <= 2) {
            writeOperand(i);
            writeOperator(OperatorName.SET_LINE_CAPSTYLE);
            return;
        }
        throw new IllegalArgumentException("Error: unknown value for line cap style");
    }

    public void setLineDashPattern(float[] fArr, float f) {
        write("[");
        for (float f2 : fArr) {
            writeOperand(f2);
        }
        write("] ");
        writeOperand(f);
        writeOperator("d");
    }

    public void setLineJoinStyle(int i) {
        if (i >= 0 && i <= 2) {
            writeOperand(i);
            writeOperator(OperatorName.SET_LINE_JOINSTYLE);
            return;
        }
        throw new IllegalArgumentException("Error: unknown value for line join style");
    }

    public void setLineWidth(float f) {
        writeOperand(f);
        writeOperator(OperatorName.SET_LINE_WIDTH);
    }

    public void setMaximumFractionDigits(int i) {
        this.f62227a.setMaximumFractionDigits(i);
    }

    public void setMiterLimit(float f) {
        if (f > 0.0d) {
            writeOperand(f);
            writeOperator("M");
            return;
        }
        throw new IllegalArgumentException("A miter limit <= 0 is invalid and will not render in Acrobat Reader");
    }

    public void setNonStrokingColor(PDColor pDColor) {
        if (this.nonStrokingColorSpaceStack.isEmpty() || this.nonStrokingColorSpaceStack.peek() != pDColor.getColorSpace()) {
            writeOperand(getName(pDColor.getColorSpace()));
            writeOperator(OperatorName.NON_STROKING_COLORSPACE);
            setNonStrokingColorSpaceStack(pDColor.getColorSpace());
        }
        for (float f : pDColor.getComponents()) {
            writeOperand(f);
        }
        writeOperator(OperatorName.NON_STROKING_COLOR);
    }

    public void setNonStrokingColorSpaceStack(PDColorSpace pDColorSpace) {
        if (this.nonStrokingColorSpaceStack.isEmpty()) {
            this.nonStrokingColorSpaceStack.add(pDColorSpace);
            return;
        }
        this.nonStrokingColorSpaceStack.pop();
        this.nonStrokingColorSpaceStack.push(pDColorSpace);
    }

    public void setRenderingMode(RenderingMode renderingMode) {
        writeOperand(renderingMode.intValue());
        writeOperator(OperatorName.SET_TEXT_RENDERINGMODE);
    }

    public void setStrokingColor(PDColor pDColor) {
        if (this.strokingColorSpaceStack.isEmpty() || this.strokingColorSpaceStack.peek() != pDColor.getColorSpace()) {
            writeOperand(getName(pDColor.getColorSpace()));
            writeOperator(OperatorName.STROKING_COLORSPACE);
            setStrokingColorSpaceStack(pDColor.getColorSpace());
        }
        for (float f : pDColor.getComponents()) {
            writeOperand(f);
        }
        writeOperator(OperatorName.STROKING_COLOR);
    }

    public void setStrokingColorSpaceStack(PDColorSpace pDColorSpace) {
        if (this.strokingColorSpaceStack.isEmpty()) {
            this.strokingColorSpaceStack.add(pDColorSpace);
            return;
        }
        this.strokingColorSpaceStack.pop();
        this.strokingColorSpaceStack.push(pDColorSpace);
    }

    public void setTextMatrix(Matrix matrix) {
        if (this.inTextMode) {
            m31063d(matrix.createAffineTransform());
            writeOperator(OperatorName.SET_MATRIX);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before setTextMatrix");
    }

    public void setTextRise(float f) {
        writeOperand(f);
        writeOperator(OperatorName.SET_TEXT_RISE);
    }

    public void setWordSpacing(float f) {
        writeOperand(f);
        writeOperator(OperatorName.SET_WORD_SPACING);
    }

    public void shadingFill(PDShading pDShading) {
        if (!this.inTextMode) {
            writeOperand(this.resources.add(pDShading));
            writeOperator(OperatorName.SHADING_FILL);
            return;
        }
        throw new IllegalStateException("Error: shadingFill is not allowed within a text block.");
    }

    public void showText(String str) {
        showTextInternal(str);
        write(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        writeOperator(OperatorName.SHOW_TEXT);
    }

    public void showTextInternal(String str) throws IOException {
        if (this.inTextMode) {
            if (!this.fontStack.isEmpty()) {
                PDFont peek = this.fontStack.peek();
                byte[] encode = peek.encode(str);
                if (peek.willBeSubset()) {
                    int i = 0;
                    while (i < str.length()) {
                        int codePointAt = str.codePointAt(i);
                        peek.addToSubset(codePointAt);
                        i += Character.charCount(codePointAt);
                    }
                }
                COSWriter.writeString(encode, this.outputStream);
                return;
            }
            throw new IllegalStateException("Must call setFont() before showText()");
        }
        throw new IllegalStateException("Must call beginText() before showText()");
    }

    public void showTextWithPositioning(Object[] objArr) {
        write("[");
        for (Object obj : objArr) {
            if (obj instanceof String) {
                showTextInternal((String) obj);
            } else if (obj instanceof Float) {
                writeOperand(((Float) obj).floatValue());
            } else {
                throw new IllegalArgumentException("Argument must consist of array of Float and String types");
            }
        }
        write("] ");
        writeOperator(OperatorName.SHOW_TEXT_ADJUSTED);
    }

    public void stroke() {
        if (!this.inTextMode) {
            writeOperator("S");
            return;
        }
        throw new IllegalStateException("Error: stroke is not allowed within a text block.");
    }

    public void transform(Matrix matrix) {
        if (!this.inTextMode) {
            m31063d(matrix.createAffineTransform());
            writeOperator(OperatorName.CONCAT);
            return;
        }
        throw new IllegalStateException("Error: Modifying the current transformation matrix is not allowed within text objects.");
    }

    public void write(String str) throws IOException {
        this.outputStream.write(str.getBytes(Charsets.US_ASCII));
    }

    public void writeBytes(byte[] bArr) throws IOException {
        this.outputStream.write(bArr);
    }

    public void writeLine() throws IOException {
        this.outputStream.write(10);
    }

    public void writeOperand(float f) throws IOException {
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            int formatFloatFast = NumberFormatUtil.formatFloatFast(f, this.f62227a.getMaximumFractionDigits(), this.f62228b);
            if (formatFloatFast == -1) {
                write(this.f62227a.format(f));
            } else {
                this.outputStream.write(this.f62228b, 0, formatFloatFast);
            }
            this.outputStream.write(32);
            return;
        }
        throw new IllegalArgumentException(f + " is not a finite number");
    }

    public void writeOperator(String str) throws IOException {
        this.outputStream.write(str.getBytes(Charsets.US_ASCII));
        this.outputStream.write(10);
    }

    public void drawImage(PDImageXObject pDImageXObject, float f, float f2, float f3, float f4) {
        if (!this.inTextMode) {
            saveGraphicsState();
            transform(new Matrix(new AffineTransform(f3, 0.0f, 0.0f, f4, f, f2)));
            writeOperand(this.resources.add(pDImageXObject));
            writeOperator(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    public void write(byte[] bArr) throws IOException {
        this.outputStream.write(bArr);
    }

    public void beginMarkedContent(COSName cOSName, PDPropertyList pDPropertyList) {
        writeOperand(cOSName);
        writeOperand(this.resources.add(pDPropertyList));
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT_SEQ);
    }

    public void writeOperand(int i) throws IOException {
        write(this.f62227a.format(i));
        this.outputStream.write(32);
    }

    public void setNonStrokingColor(AWTColor aWTColor) {
        setNonStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void setStrokingColor(AWTColor aWTColor) {
        setStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void writeOperand(COSName cOSName) throws IOException {
        cOSName.writePDF(this.outputStream);
        this.outputStream.write(32);
    }

    public void drawImage(PDImageXObject pDImageXObject, Matrix matrix) {
        if (!this.inTextMode) {
            saveGraphicsState();
            transform(new Matrix(matrix.createAffineTransform()));
            writeOperand(this.resources.add(pDImageXObject));
            writeOperator(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    public void setNonStrokingColor(float f, float f2, float f3) {
        if (!m31064b(f) && !m31064b(f2) && !m31064b(f3)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperator(OperatorName.NON_STROKING_RGB);
            setNonStrokingColorSpaceStack(PDDeviceRGB.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void setStrokingColor(float f, float f2, float f3) {
        if (!m31064b(f) && !m31064b(f2) && !m31064b(f3)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperator(OperatorName.STROKING_COLOR_RGB);
            setStrokingColorSpaceStack(PDDeviceRGB.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void drawImage(PDInlineImage pDInlineImage, float f, float f2) {
        drawImage(pDInlineImage, f, f2, pDInlineImage.getWidth(), pDInlineImage.getHeight());
    }

    public void drawImage(PDInlineImage pDInlineImage, float f, float f2, float f3, float f4) {
        if (!this.inTextMode) {
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
            write(sb.toString());
            writeLine();
            writeOperator(OperatorName.BEGIN_INLINE_IMAGE_DATA);
            writeBytes(pDInlineImage.getData());
            writeLine();
            writeOperator(OperatorName.END_INLINE_IMAGE);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    public void setNonStrokingColor(int i, int i2, int i3) {
        if (!isOutside255Interval(i) && !isOutside255Interval(i2) && !isOutside255Interval(i3)) {
            setNonStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public void setStrokingColor(int i, int i2, int i3) {
        if (!isOutside255Interval(i) && !isOutside255Interval(i2) && !isOutside255Interval(i3)) {
            setStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public void setNonStrokingColor(int i, int i2, int i3, int i4) {
        if (!isOutside255Interval(i) && !isOutside255Interval(i2) && !isOutside255Interval(i3) && !isOutside255Interval(i4)) {
            setNonStrokingColor(i / 255.0f, i2 / 255.0f, i3 / 255.0f, i4 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d,%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public void setStrokingColor(float f, float f2, float f3, float f4) {
        if (!m31064b(f) && !m31064b(f2) && !m31064b(f3) && !m31064b(f4)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperator("K");
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public void setNonStrokingColor(float f, float f2, float f3, float f4) {
        if (!m31064b(f) && !m31064b(f2) && !m31064b(f3) && !m31064b(f4)) {
            writeOperand(f);
            writeOperand(f2);
            writeOperand(f3);
            writeOperand(f4);
            writeOperator(OperatorName.NON_STROKING_CMYK);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f,%.2f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public void setStrokingColor(float f) {
        if (!m31064b(f)) {
            writeOperand(f);
            writeOperator(OperatorName.STROKING_COLOR_GRAY);
            setStrokingColorSpaceStack(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f);
    }

    public void setNonStrokingColor(int i) {
        if (!isOutside255Interval(i)) {
            setNonStrokingColor(i / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..255, but is " + i);
    }

    public void setNonStrokingColor(float f) {
        if (!m31064b(f)) {
            writeOperand(f);
            writeOperator(OperatorName.NON_STROKING_GRAY);
            setNonStrokingColorSpaceStack(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f);
    }
}
