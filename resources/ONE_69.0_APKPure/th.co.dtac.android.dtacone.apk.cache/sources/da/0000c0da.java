package com.tom_roush.pdfbox.contentstream;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.contentstream.operator.state.EmptyGraphicsStackException;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.filter.MissingImageReaderException;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.MissingResourceException;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType3CharProc;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDTextState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class PDFStreamEngine {

    /* renamed from: b */
    public Matrix f59724b;

    /* renamed from: c */
    public Matrix f59725c;

    /* renamed from: e */
    public PDResources f59727e;

    /* renamed from: f */
    public PDPage f59728f;

    /* renamed from: g */
    public boolean f59729g;

    /* renamed from: h */
    public Matrix f59730h;

    /* renamed from: a */
    public final Map f59723a = new HashMap(80);

    /* renamed from: d */
    public Deque f59726d = new ArrayDeque();

    /* renamed from: i */
    public int f59731i = 0;

    /* renamed from: a */
    public final void m32790a(PDRectangle pDRectangle) {
        if (pDRectangle != null) {
            PDGraphicsState graphicsState = getGraphicsState();
            graphicsState.intersectClippingPath(pDRectangle.transform(graphicsState.getCurrentTransformationMatrix()));
        }
    }

    public final void addOperator(OperatorProcessor operatorProcessor) {
        operatorProcessor.setContext(this);
        this.f59723a.put(operatorProcessor.getName(), operatorProcessor);
    }

    public void applyTextAdjustment(float f, float f2) throws IOException {
        this.f59724b.concatenate(Matrix.getTranslateInstance(f, f2));
    }

    /* renamed from: b */
    public final void m32789b(PDPage pDPage) {
        if (pDPage != null) {
            this.f59728f = pDPage;
            this.f59726d.clear();
            this.f59726d.push(new PDGraphicsState(pDPage.getCropBox()));
            this.f59724b = null;
            this.f59725c = null;
            this.f59727e = null;
            this.f59730h = pDPage.getMatrix();
            return;
        }
        throw new IllegalArgumentException("Page cannot be null");
    }

    public void beginMarkedContentSequence(COSName cOSName, COSDictionary cOSDictionary) {
    }

    public void beginText() throws IOException {
    }

    /* renamed from: c */
    public final void m32788c(PDResources pDResources) {
        this.f59727e = pDResources;
    }

    /* renamed from: d */
    public final void m32787d(PDContentStream pDContentStream) {
        PDResources m32785f = m32785f(pDContentStream);
        Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
        Matrix matrix = this.f59730h;
        PDGraphicsState graphicsState = getGraphicsState();
        graphicsState.getCurrentTransformationMatrix().concatenate(pDContentStream.getMatrix());
        this.f59730h = graphicsState.getCurrentTransformationMatrix().m74246clone();
        m32790a(pDContentStream.getBBox());
        m32786e(pDContentStream);
        this.f59730h = matrix;
        restoreGraphicsStack(saveGraphicsStack);
        m32788c(m32785f);
    }

    public void decreaseLevel() {
        int i = this.f59731i - 1;
        this.f59731i = i;
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("level is ");
            sb.append(this.f59731i);
        }
    }

    /* renamed from: e */
    public final void m32786e(PDContentStream pDContentStream) {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(pDContentStream);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                processOperator((Operator) parseNextToken, arrayList);
                arrayList.clear();
            } else {
                arrayList.add((COSBase) parseNextToken);
            }
        }
    }

    public void endMarkedContentSequence() {
    }

    public void endText() throws IOException {
    }

    /* renamed from: f */
    public final PDResources m32785f(PDContentStream pDContentStream) {
        PDResources pDResources = this.f59727e;
        PDResources resources = pDContentStream.getResources();
        if (resources != null) {
            this.f59727e = resources;
        } else if (this.f59727e == null) {
            PDResources resources2 = this.f59728f.getResources();
            this.f59727e = resources2;
            if (resources2 == null) {
                this.f59727e = new PDResources();
            }
        }
        return pDResources;
    }

    public PDAppearanceStream getAppearance(PDAnnotation pDAnnotation) {
        return pDAnnotation.getNormalAppearanceStream();
    }

    public PDPage getCurrentPage() {
        return this.f59728f;
    }

    public int getGraphicsStackSize() {
        return this.f59726d.size();
    }

    public PDGraphicsState getGraphicsState() {
        return (PDGraphicsState) this.f59726d.peek();
    }

    public Matrix getInitialMatrix() {
        return this.f59730h;
    }

    public int getLevel() {
        return this.f59731i;
    }

    public PDResources getResources() {
        return this.f59727e;
    }

    public Matrix getTextLineMatrix() {
        return this.f59725c;
    }

    public Matrix getTextMatrix() {
        return this.f59724b;
    }

    public void increaseLevel() {
        this.f59731i++;
    }

    public void operatorException(Operator operator, List<COSBase> list, IOException iOException) throws IOException {
        if (!(iOException instanceof MissingOperandException) && !(iOException instanceof MissingResourceException) && !(iOException instanceof MissingImageReaderException)) {
            if (iOException instanceof EmptyGraphicsStackException) {
                Log.w("PdfBox-Android", iOException.getMessage());
                return;
            } else if (operator.getName().equals(OperatorName.DRAW_OBJECT)) {
                Log.w("PdfBox-Android", iOException.getMessage());
                return;
            } else {
                throw iOException;
            }
        }
        iOException.getMessage();
    }

    public void processAnnotation(PDAnnotation pDAnnotation, PDAppearanceStream pDAppearanceStream) throws IOException {
        PDResources m32785f = m32785f(pDAppearanceStream);
        Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
        PDRectangle bBox = pDAppearanceStream.getBBox();
        PDRectangle rectangle = pDAnnotation.getRectangle();
        if (rectangle != null && rectangle.getWidth() > 0.0f && rectangle.getHeight() > 0.0f && bBox != null && bBox.getWidth() > 0.0f && bBox.getHeight() > 0.0f) {
            Matrix matrix = pDAppearanceStream.getMatrix();
            RectF rectF = new RectF();
            bBox.transform(matrix).computeBounds(rectF, true);
            Matrix translateInstance = Matrix.getTranslateInstance(rectangle.getLowerLeftX(), rectangle.getLowerLeftY());
            translateInstance.concatenate(Matrix.getScaleInstance(rectangle.getWidth() / rectF.width(), rectangle.getHeight() / rectF.height()));
            translateInstance.concatenate(Matrix.getTranslateInstance(-rectF.left, -rectF.top));
            Matrix concatenate = Matrix.concatenate(translateInstance, matrix);
            getGraphicsState().setCurrentTransformationMatrix(concatenate);
            m32790a(bBox);
            this.f59730h = concatenate.m74246clone();
            m32786e(pDAppearanceStream);
        }
        restoreGraphicsStack(saveGraphicsStack);
        m32788c(m32785f);
    }

    public void processChildStream(PDContentStream pDContentStream, PDPage pDPage) throws IOException {
        if (!this.f59729g) {
            m32789b(pDPage);
            m32787d(pDContentStream);
            this.f59728f = null;
            return;
        }
        throw new IllegalStateException("Current page has already been set via  #processPage(PDPage) call #processChildStream(PDContentStream) instead");
    }

    public void processOperator(String str, List<COSBase> list) throws IOException {
        processOperator(Operator.getOperator(str), list);
    }

    public void processPage(PDPage pDPage) throws IOException {
        m32789b(pDPage);
        if (pDPage.hasContents()) {
            this.f59729g = true;
            m32787d(pDPage);
            this.f59729g = false;
        }
    }

    public void processSoftMask(PDTransparencyGroup pDTransparencyGroup) throws IOException {
        saveGraphicsState();
        getGraphicsState().setCurrentTransformationMatrix(getGraphicsState().getSoftMask().getInitialTransformationMatrix());
        processTransparencyGroup(pDTransparencyGroup);
        restoreGraphicsState();
    }

    public final void processTilingPattern(PDTilingPattern pDTilingPattern, PDColor pDColor, PDColorSpace pDColorSpace) throws IOException {
        processTilingPattern(pDTilingPattern, pDColor, pDColorSpace, pDTilingPattern.getMatrix());
    }

    public void processTransparencyGroup(PDTransparencyGroup pDTransparencyGroup) throws IOException {
        if (this.f59728f != null) {
            PDResources m32785f = m32785f(pDTransparencyGroup);
            Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
            Matrix matrix = this.f59730h;
            PDGraphicsState graphicsState = getGraphicsState();
            this.f59730h = graphicsState.getCurrentTransformationMatrix().m74246clone();
            graphicsState.getCurrentTransformationMatrix().concatenate(pDTransparencyGroup.getMatrix());
            graphicsState.setBlendMode(BlendMode.NORMAL);
            graphicsState.setAlphaConstant(1.0d);
            graphicsState.setNonStrokeAlphaConstant(1.0d);
            graphicsState.setSoftMask(null);
            m32790a(pDTransparencyGroup.getBBox());
            m32786e(pDTransparencyGroup);
            this.f59730h = matrix;
            restoreGraphicsStack(saveGraphicsStack);
            m32788c(m32785f);
            return;
        }
        throw new IllegalStateException("No current page, call #processChildStream(PDContentStream, PDPage) instead");
    }

    public void processType3Stream(PDType3CharProc pDType3CharProc, Matrix matrix) throws IOException {
        if (this.f59728f != null) {
            PDResources m32785f = m32785f(pDType3CharProc);
            Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
            getGraphicsState().setCurrentTransformationMatrix(matrix);
            getGraphicsState().getCurrentTransformationMatrix().concatenate(pDType3CharProc.getMatrix());
            Matrix matrix2 = this.f59724b;
            this.f59724b = new Matrix();
            Matrix matrix3 = this.f59725c;
            this.f59725c = new Matrix();
            m32786e(pDType3CharProc);
            this.f59724b = matrix2;
            this.f59725c = matrix3;
            restoreGraphicsStack(saveGraphicsStack);
            m32788c(m32785f);
            return;
        }
        throw new IllegalStateException("No current page, call #processChildStream(PDContentStream, PDPage) instead");
    }

    @Deprecated
    public void registerOperatorProcessor(String str, OperatorProcessor operatorProcessor) {
        operatorProcessor.setContext(this);
        this.f59723a.put(str, operatorProcessor);
    }

    public final void restoreGraphicsStack(Deque<PDGraphicsState> deque) {
        this.f59726d = deque;
    }

    public void restoreGraphicsState() {
        this.f59726d.pop();
    }

    public final Deque<PDGraphicsState> saveGraphicsStack() {
        Deque<PDGraphicsState> deque = this.f59726d;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f59726d = arrayDeque;
        arrayDeque.add(deque.peek().m74244clone());
        return deque;
    }

    public void saveGraphicsState() {
        Deque deque = this.f59726d;
        deque.push(((PDGraphicsState) deque.peek()).m74244clone());
    }

    public void setLineDashPattern(COSArray cOSArray, int i) {
        if (i < 0) {
            Log.w("PdfBox-Android", "Dash phase has negative value " + i + ", set to 0");
            i = 0;
        }
        getGraphicsState().setLineDashPattern(new PDLineDashPattern(cOSArray, i));
    }

    public void setTextLineMatrix(Matrix matrix) {
        this.f59725c = matrix;
    }

    public void setTextMatrix(Matrix matrix) {
        this.f59724b = matrix;
    }

    public void showAnnotation(PDAnnotation pDAnnotation) throws IOException {
        PDAppearanceStream appearance = getAppearance(pDAnnotation);
        if (appearance != null) {
            processAnnotation(pDAnnotation, appearance);
        }
    }

    public void showFontGlyph(Matrix matrix, PDFont pDFont, int i, String str, Vector vector) throws IOException {
    }

    public void showForm(PDFormXObject pDFormXObject) throws IOException {
        if (this.f59728f != null) {
            if (pDFormXObject.getCOSObject().getLength() > 0) {
                m32787d(pDFormXObject);
                return;
            }
            return;
        }
        throw new IllegalStateException("No current page, call #processChildStream(PDContentStream, PDPage) instead");
    }

    public void showGlyph(Matrix matrix, PDFont pDFont, int i, String str, Vector vector) throws IOException {
        if (pDFont instanceof PDType3Font) {
            showType3Glyph(matrix, (PDType3Font) pDFont, i, vector);
        } else {
            showFontGlyph(matrix, pDFont, i, vector);
        }
    }

    public void showText(byte[] bArr) throws IOException {
        float f;
        float f2;
        PDGraphicsState graphicsState = getGraphicsState();
        PDTextState textState = graphicsState.getTextState();
        PDFont font = textState.getFont();
        if (font == null) {
            Log.w("PdfBox-Android", "No current font, will use default");
            font = PDType1Font.HELVETICA;
        }
        float fontSize = textState.getFontSize();
        float horizontalScaling = textState.getHorizontalScaling() / 100.0f;
        float characterSpacing = textState.getCharacterSpacing();
        Matrix matrix = new Matrix(fontSize * horizontalScaling, 0.0f, 0.0f, fontSize, 0.0f, textState.getRise());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            int available = byteArrayInputStream.available();
            int readCode = font.readCode(byteArrayInputStream);
            float f3 = 0.0f;
            if (available - byteArrayInputStream.available() == 1 && readCode == 32) {
                f = textState.getWordSpacing() + 0.0f;
            } else {
                f = 0.0f;
            }
            Matrix multiply = matrix.multiply(this.f59724b).multiply(graphicsState.getCurrentTransformationMatrix());
            if (font.isVertical()) {
                multiply.translate(font.getPositionVector(readCode));
            }
            Vector displacement = font.getDisplacement(readCode);
            showGlyph(multiply, font, readCode, displacement);
            if (font.isVertical()) {
                f2 = (displacement.getY() * fontSize) + characterSpacing + f;
            } else {
                f3 = ((displacement.getX() * fontSize) + characterSpacing + f) * horizontalScaling;
                f2 = 0.0f;
            }
            this.f59724b.concatenate(Matrix.getTranslateInstance(f3, f2));
        }
    }

    public void showTextString(byte[] bArr) throws IOException {
        showText(bArr);
    }

    public void showTextStrings(COSArray cOSArray) throws IOException {
        boolean z;
        float f;
        PDTextState textState = getGraphicsState().getTextState();
        float fontSize = textState.getFontSize();
        float horizontalScaling = textState.getHorizontalScaling() / 100.0f;
        PDFont font = textState.getFont();
        if (font != null) {
            z = font.isVertical();
        } else {
            z = false;
        }
        Iterator<COSBase> it = cOSArray.iterator();
        while (it.hasNext()) {
            COSBase next = it.next();
            if (next instanceof COSNumber) {
                float floatValue = ((COSNumber) next).floatValue();
                float f2 = 0.0f;
                if (z) {
                    f = ((-floatValue) / 1000.0f) * fontSize;
                } else {
                    f2 = ((-floatValue) / 1000.0f) * fontSize * horizontalScaling;
                    f = 0.0f;
                }
                applyTextAdjustment(f2, f);
            } else if (next instanceof COSString) {
                showText(((COSString) next).getBytes());
            } else if (next instanceof COSArray) {
                StringBuilder sb = new StringBuilder();
                sb.append("Nested arrays are not allowed in an array for TJ operation:");
                sb.append(next);
            } else {
                throw new IOException("Unknown type " + next.getClass().getSimpleName() + " in array for TJ operation:" + next);
            }
        }
    }

    public void showTransparencyGroup(PDTransparencyGroup pDTransparencyGroup) throws IOException {
        processTransparencyGroup(pDTransparencyGroup);
    }

    public void showType3Glyph(Matrix matrix, PDType3Font pDType3Font, int i, String str, Vector vector) throws IOException {
        PDType3CharProc charProc = pDType3Font.getCharProc(i);
        if (charProc != null) {
            processType3Stream(charProc, matrix);
        }
    }

    public float transformWidth(float f) {
        Matrix currentTransformationMatrix = getGraphicsState().getCurrentTransformationMatrix();
        float scaleX = currentTransformationMatrix.getScaleX() + currentTransformationMatrix.getShearX();
        float scaleY = currentTransformationMatrix.getScaleY() + currentTransformationMatrix.getShearY();
        return f * ((float) Math.sqrt(((scaleX * scaleX) + (scaleY * scaleY)) * 0.5d));
    }

    public PointF transformedPoint(float f, float f2) {
        float[] fArr = {f, f2};
        getGraphicsState().getCurrentTransformationMatrix().createAffineTransform().transform(fArr, 0, fArr, 0, 1);
        return new PointF(fArr[0], fArr[1]);
    }

    public void unsupportedOperator(Operator operator, List<COSBase> list) throws IOException {
    }

    public final void processTilingPattern(PDTilingPattern pDTilingPattern, PDColor pDColor, PDColorSpace pDColorSpace, Matrix matrix) throws IOException {
        PDResources m32785f = m32785f(pDTilingPattern);
        Matrix matrix2 = this.f59730h;
        this.f59730h = Matrix.concatenate(matrix2, matrix);
        Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
        RectF rectF = new RectF();
        pDTilingPattern.getBBox().transform(matrix).computeBounds(rectF, true);
        this.f59726d.push(new PDGraphicsState(new PDRectangle(rectF.left, rectF.top, rectF.width(), rectF.height())));
        PDGraphicsState graphicsState = getGraphicsState();
        if (pDColorSpace != null) {
            PDColor pDColor2 = new PDColor(pDColor.getComponents(), pDColorSpace);
            graphicsState.setNonStrokingColorSpace(pDColorSpace);
            graphicsState.setNonStrokingColor(pDColor2);
            graphicsState.setStrokingColorSpace(pDColorSpace);
            graphicsState.setStrokingColor(pDColor2);
        }
        graphicsState.getCurrentTransformationMatrix().concatenate(matrix);
        m32790a(pDTilingPattern.getBBox());
        Matrix matrix3 = this.f59724b;
        Matrix matrix4 = this.f59725c;
        m32786e(pDTilingPattern);
        this.f59724b = matrix3;
        this.f59725c = matrix4;
        this.f59730h = matrix2;
        restoreGraphicsStack(saveGraphicsStack);
        m32788c(m32785f);
    }

    public void showFontGlyph(Matrix matrix, PDFont pDFont, int i, Vector vector) throws IOException {
        showFontGlyph(matrix, pDFont, i, pDFont.toUnicode(i), vector);
    }

    public void processOperator(Operator operator, List<COSBase> list) throws IOException {
        OperatorProcessor operatorProcessor = (OperatorProcessor) this.f59723a.get(operator.getName());
        if (operatorProcessor != null) {
            operatorProcessor.setContext(this);
            try {
                operatorProcessor.process(operator, list);
                return;
            } catch (IOException e) {
                operatorException(operator, list, e);
                return;
            }
        }
        unsupportedOperator(operator, list);
    }

    public void showType3Glyph(Matrix matrix, PDType3Font pDType3Font, int i, Vector vector) throws IOException {
        showType3Glyph(matrix, pDType3Font, i, pDType3Font.toUnicode(i), vector);
    }

    public void showGlyph(Matrix matrix, PDFont pDFont, int i, Vector vector) throws IOException {
        showGlyph(matrix, pDFont, i, pDFont.toUnicode(i), vector);
    }
}