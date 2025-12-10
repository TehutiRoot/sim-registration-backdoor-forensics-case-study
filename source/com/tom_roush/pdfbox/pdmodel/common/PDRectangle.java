package com.tom_roush.pdfbox.pdmodel.common;

import android.graphics.Path;
import android.graphics.PointF;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class PDRectangle implements COSObjectable {

    /* renamed from: a */
    public final COSArray f60180a;
    public static final PDRectangle LETTER = new PDRectangle(612.0f, 792.0f);
    public static final PDRectangle LEGAL = new PDRectangle(612.0f, 1008.0f);

    /* renamed from: A0 */
    public static final PDRectangle f60173A0 = new PDRectangle(2383.937f, 3370.3938f);

    /* renamed from: A1 */
    public static final PDRectangle f60174A1 = new PDRectangle(1683.7795f, 2383.937f);

    /* renamed from: A2 */
    public static final PDRectangle f60175A2 = new PDRectangle(1190.5513f, 1683.7795f);

    /* renamed from: A3 */
    public static final PDRectangle f60176A3 = new PDRectangle(841.8898f, 1190.5513f);

    /* renamed from: A4 */
    public static final PDRectangle f60177A4 = new PDRectangle(595.27563f, 841.8898f);

    /* renamed from: A5 */
    public static final PDRectangle f60178A5 = new PDRectangle(419.52756f, 595.27563f);

    /* renamed from: A6 */
    public static final PDRectangle f60179A6 = new PDRectangle(297.63782f, 419.52756f);

    public PDRectangle() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public boolean contains(float f, float f2) {
        float lowerLeftX = getLowerLeftX();
        float upperRightX = getUpperRightX();
        float lowerLeftY = getLowerLeftY();
        float upperRightY = getUpperRightY();
        if (f >= lowerLeftX && f <= upperRightX && f2 >= lowerLeftY && f2 <= upperRightY) {
            return true;
        }
        return false;
    }

    public PDRectangle createRetranslatedRectangle() {
        PDRectangle pDRectangle = new PDRectangle();
        pDRectangle.setUpperRightX(getWidth());
        pDRectangle.setUpperRightY(getHeight());
        return pDRectangle;
    }

    public COSArray getCOSArray() {
        return this.f60180a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60180a;
    }

    public float getHeight() {
        return getUpperRightY() - getLowerLeftY();
    }

    public float getLowerLeftX() {
        return ((COSNumber) this.f60180a.get(0)).floatValue();
    }

    public float getLowerLeftY() {
        return ((COSNumber) this.f60180a.get(1)).floatValue();
    }

    public float getUpperRightX() {
        return ((COSNumber) this.f60180a.get(2)).floatValue();
    }

    public float getUpperRightY() {
        return ((COSNumber) this.f60180a.get(3)).floatValue();
    }

    public float getWidth() {
        return getUpperRightX() - getLowerLeftX();
    }

    public void setLowerLeftX(float f) {
        this.f60180a.set(0, (COSBase) new COSFloat(f));
    }

    public void setLowerLeftY(float f) {
        this.f60180a.set(1, (COSBase) new COSFloat(f));
    }

    public void setUpperRightX(float f) {
        this.f60180a.set(2, (COSBase) new COSFloat(f));
    }

    public void setUpperRightY(float f) {
        this.f60180a.set(3, (COSBase) new COSFloat(f));
    }

    public Path toGeneralPath() {
        float lowerLeftX = getLowerLeftX();
        float lowerLeftY = getLowerLeftY();
        float upperRightX = getUpperRightX();
        float upperRightY = getUpperRightY();
        Path path = new Path();
        path.moveTo(lowerLeftX, lowerLeftY);
        path.lineTo(upperRightX, lowerLeftY);
        path.lineTo(upperRightX, upperRightY);
        path.lineTo(lowerLeftX, upperRightY);
        path.close();
        return path;
    }

    public String toString() {
        return "[" + getLowerLeftX() + "," + getLowerLeftY() + "," + getUpperRightX() + "," + getUpperRightY() + "]";
    }

    public Path transform(Matrix matrix) {
        float lowerLeftX = getLowerLeftX();
        float lowerLeftY = getLowerLeftY();
        float upperRightX = getUpperRightX();
        float upperRightY = getUpperRightY();
        PointF transformPoint = matrix.transformPoint(lowerLeftX, lowerLeftY);
        PointF transformPoint2 = matrix.transformPoint(upperRightX, lowerLeftY);
        PointF transformPoint3 = matrix.transformPoint(upperRightX, upperRightY);
        PointF transformPoint4 = matrix.transformPoint(lowerLeftX, upperRightY);
        Path path = new Path();
        path.moveTo(transformPoint.x, transformPoint.y);
        path.lineTo(transformPoint2.x, transformPoint2.y);
        path.lineTo(transformPoint3.x, transformPoint3.y);
        path.lineTo(transformPoint4.x, transformPoint4.y);
        path.close();
        return path;
    }

    public PDRectangle(float f, float f2) {
        this(0.0f, 0.0f, f, f2);
    }

    public PDRectangle(float f, float f2, float f3, float f4) {
        COSArray cOSArray = new COSArray();
        this.f60180a = cOSArray;
        cOSArray.add((COSBase) new COSFloat(f));
        cOSArray.add((COSBase) new COSFloat(f2));
        cOSArray.add((COSBase) new COSFloat(f + f3));
        cOSArray.add((COSBase) new COSFloat(f2 + f4));
    }

    public PDRectangle(BoundingBox boundingBox) {
        COSArray cOSArray = new COSArray();
        this.f60180a = cOSArray;
        cOSArray.add((COSBase) new COSFloat(boundingBox.getLowerLeftX()));
        cOSArray.add((COSBase) new COSFloat(boundingBox.getLowerLeftY()));
        cOSArray.add((COSBase) new COSFloat(boundingBox.getUpperRightX()));
        cOSArray.add((COSBase) new COSFloat(boundingBox.getUpperRightY()));
    }

    public PDRectangle(COSArray cOSArray) {
        float[] copyOf = Arrays.copyOf(cOSArray.toFloatArray(), 4);
        COSArray cOSArray2 = new COSArray();
        this.f60180a = cOSArray2;
        cOSArray2.add((COSBase) new COSFloat(Math.min(copyOf[0], copyOf[2])));
        cOSArray2.add((COSBase) new COSFloat(Math.min(copyOf[1], copyOf[3])));
        cOSArray2.add((COSBase) new COSFloat(Math.max(copyOf[0], copyOf[2])));
        cOSArray2.add((COSBase) new COSFloat(Math.max(copyOf[1], copyOf[3])));
    }
}
