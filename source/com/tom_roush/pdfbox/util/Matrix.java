package com.tom_roush.pdfbox.util;

import android.graphics.PointF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Matrix implements Cloneable {
    public static final int SIZE = 9;

    /* renamed from: a */
    public float[] f60855a;

    public Matrix() {
        this.f60855a = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* renamed from: a */
    public static boolean m32080a(float f) {
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public static Matrix createMatrix(COSBase cOSBase) {
        if (!(cOSBase instanceof COSArray)) {
            return new Matrix();
        }
        COSArray cOSArray = (COSArray) cOSBase;
        if (cOSArray.size() < 6) {
            return new Matrix();
        }
        for (int i = 0; i < 6; i++) {
            if (!(cOSArray.getObject(i) instanceof COSNumber)) {
                return new Matrix();
            }
        }
        return new Matrix(cOSArray);
    }

    public static Matrix getRotateInstance(double d, float f, float f2) {
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        return new Matrix(cos, sin, -sin, cos, f, f2);
    }

    public static Matrix getScaleInstance(float f, float f2) {
        return new Matrix(f, 0.0f, 0.0f, f2, 0.0f, 0.0f);
    }

    public static Matrix getTranslateInstance(float f, float f2) {
        return new Matrix(1.0f, 0.0f, 0.0f, 1.0f, f, f2);
    }

    @Deprecated
    public static Matrix getTranslatingInstance(float f, float f2) {
        return new Matrix(1.0f, 0.0f, 0.0f, 1.0f, f, f2);
    }

    /* renamed from: b */
    public final void m32079b(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr[1];
        float f2 = fArr2[3];
        float f3 = fArr[2];
        float f4 = fArr2[6];
        fArr3[0] = (fArr[0] * fArr2[0]) + (f * f2) + (f3 * f4);
        float f5 = fArr[0];
        float f6 = fArr2[4];
        float f7 = fArr2[7];
        fArr3[1] = (fArr2[1] * f5) + (f * f6) + (f3 * f7);
        float f8 = f5 * fArr2[2];
        float f9 = fArr[1];
        float f10 = fArr2[5];
        float f11 = fArr2[8];
        fArr3[2] = f8 + (f9 * f10) + (f3 * f11);
        float f12 = fArr[3];
        float f13 = fArr2[0];
        float f14 = fArr[4];
        float f15 = (f12 * f13) + (f2 * f14);
        float f16 = fArr[5];
        fArr3[3] = f15 + (f16 * f4);
        float f17 = fArr[3];
        float f18 = fArr2[1];
        fArr3[4] = (f17 * f18) + (f14 * f6) + (f16 * f7);
        float f19 = fArr2[2];
        fArr3[5] = (f17 * f19) + (fArr[4] * f10) + (f16 * f11);
        float f20 = fArr[6] * f13;
        float f21 = fArr[7];
        float f22 = f20 + (fArr2[3] * f21);
        float f23 = fArr[8];
        fArr3[6] = f22 + (f4 * f23);
        float f24 = fArr[6];
        fArr3[7] = (f18 * f24) + (f21 * fArr2[4]) + (f7 * f23);
        fArr3[8] = (f24 * f19) + (fArr[7] * fArr2[5]) + (f23 * f11);
    }

    public void concatenate(Matrix matrix) {
        matrix.multiply(this, this);
    }

    public AffineTransform createAffineTransform() {
        float[] fArr = this.f60855a;
        return new AffineTransform(fArr[0], fArr[1], fArr[3], fArr[4], fArr[6], fArr[7]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Matrix.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f60855a, ((Matrix) obj).f60855a);
    }

    @Deprecated
    public Matrix extractScaling() {
        Matrix matrix = new Matrix();
        float[] fArr = matrix.f60855a;
        float[] fArr2 = this.f60855a;
        fArr[0] = fArr2[0];
        fArr[4] = fArr2[4];
        return matrix;
    }

    @Deprecated
    public Matrix extractTranslating() {
        Matrix matrix = new Matrix();
        float[] fArr = matrix.f60855a;
        float[] fArr2 = this.f60855a;
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        return matrix;
    }

    public float getScaleX() {
        return this.f60855a[0];
    }

    public float getScaleY() {
        return this.f60855a[4];
    }

    public float getScalingFactorX() {
        float[] fArr = this.f60855a;
        if (fArr[1] != 0.0f) {
            return (float) Math.sqrt(Math.pow(fArr[0], 2.0d) + Math.pow(this.f60855a[1], 2.0d));
        }
        return fArr[0];
    }

    public float getScalingFactorY() {
        float[] fArr = this.f60855a;
        float f = fArr[3];
        if (f != 0.0f) {
            return (float) Math.sqrt(Math.pow(f, 2.0d) + Math.pow(this.f60855a[4], 2.0d));
        }
        return fArr[4];
    }

    public float getShearX() {
        return this.f60855a[3];
    }

    public float getShearY() {
        return this.f60855a[1];
    }

    public float getTranslateX() {
        return this.f60855a[6];
    }

    public float getTranslateY() {
        return this.f60855a[7];
    }

    public float getValue(int i, int i2) {
        return this.f60855a[(i * 3) + i2];
    }

    public float[][] getValues() {
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 3, 3);
        float[] fArr2 = fArr[0];
        float[] fArr3 = this.f60855a;
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        fArr2[2] = fArr3[2];
        float[] fArr4 = fArr[1];
        fArr4[0] = fArr3[3];
        fArr4[1] = fArr3[4];
        fArr4[2] = fArr3[5];
        float[] fArr5 = fArr[2];
        fArr5[0] = fArr3[6];
        fArr5[1] = fArr3[7];
        fArr5[2] = fArr3[8];
        return fArr;
    }

    @Deprecated
    public double[][] getValuesAsDouble() {
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, 3, 3);
        double[] dArr2 = dArr[0];
        float[] fArr = this.f60855a;
        dArr2[0] = fArr[0];
        dArr2[1] = fArr[1];
        dArr2[2] = fArr[2];
        double[] dArr3 = dArr[1];
        dArr3[0] = fArr[3];
        dArr3[1] = fArr[4];
        dArr3[2] = fArr[5];
        double[] dArr4 = dArr[2];
        dArr4[0] = fArr[6];
        dArr4[1] = fArr[7];
        dArr4[2] = fArr[8];
        return dArr;
    }

    @Deprecated
    public float getXPosition() {
        return this.f60855a[6];
    }

    @Deprecated
    public float getYPosition() {
        return this.f60855a[7];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f60855a);
    }

    public Matrix multiply(Matrix matrix) {
        return multiply(matrix, new Matrix());
    }

    @Deprecated
    public void reset() {
        Arrays.fill(this.f60855a, 0.0f);
        float[] fArr = this.f60855a;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        fArr[8] = 1.0f;
    }

    public void rotate(double d) {
        concatenate(getRotateInstance(d, 0.0f, 0.0f));
    }

    public void scale(float f, float f2) {
        concatenate(getScaleInstance(f, f2));
    }

    @Deprecated
    public void setFromAffineTransform(AffineTransform affineTransform) {
        this.f60855a[0] = (float) affineTransform.getScaleX();
        this.f60855a[1] = (float) affineTransform.getShearY();
        this.f60855a[3] = (float) affineTransform.getShearX();
        this.f60855a[4] = (float) affineTransform.getScaleY();
        this.f60855a[6] = (float) affineTransform.getTranslateX();
        this.f60855a[7] = (float) affineTransform.getTranslateY();
    }

    public void setValue(int i, int i2, float f) {
        this.f60855a[(i * 3) + i2] = f;
    }

    public COSArray toCOSArray() {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) new COSFloat(this.f60855a[0]));
        cOSArray.add((COSBase) new COSFloat(this.f60855a[1]));
        cOSArray.add((COSBase) new COSFloat(this.f60855a[3]));
        cOSArray.add((COSBase) new COSFloat(this.f60855a[4]));
        cOSArray.add((COSBase) new COSFloat(this.f60855a[6]));
        cOSArray.add((COSBase) new COSFloat(this.f60855a[7]));
        return cOSArray;
    }

    public String toString() {
        return "[" + this.f60855a[0] + "," + this.f60855a[1] + "," + this.f60855a[3] + "," + this.f60855a[4] + "," + this.f60855a[6] + "," + this.f60855a[7] + "]";
    }

    public void transform(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float[] fArr = this.f60855a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        pointF.set((f3 * f) + (f5 * f2) + fArr[6], (f * f4) + (f2 * f6) + fArr[7]);
    }

    public PointF transformPoint(float f, float f2) {
        float[] fArr = this.f60855a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        return new PointF((f3 * f) + (f5 * f2) + fArr[6], (f * f4) + (f2 * f6) + fArr[7]);
    }

    public void translate(Vector vector) {
        concatenate(getTranslateInstance(vector.getX(), vector.getY()));
    }

    public static Matrix concatenate(Matrix matrix, Matrix matrix2) {
        return matrix2.multiply(matrix);
    }

    /* renamed from: clone */
    public Matrix m74062clone() {
        return new Matrix((float[]) this.f60855a.clone());
    }

    @Deprecated
    public Matrix multiply(Matrix matrix, Matrix matrix2) {
        float[] fArr;
        if (matrix2 != null && matrix2 != matrix && matrix2 != this) {
            fArr = matrix2.f60855a;
        } else {
            fArr = new float[9];
        }
        m32079b(this.f60855a, matrix.f60855a, fArr);
        if (m32080a(fArr[0]) && m32080a(fArr[1]) && m32080a(fArr[2]) && m32080a(fArr[3]) && m32080a(fArr[4]) && m32080a(fArr[5]) && m32080a(fArr[6]) && m32080a(fArr[7]) && m32080a(fArr[8])) {
            if (matrix2 == null) {
                return new Matrix(fArr);
            }
            matrix2.f60855a = fArr;
            return matrix2;
        }
        throw new IllegalArgumentException("Multiplying two matrices produces illegal values");
    }

    public void translate(float f, float f2) {
        concatenate(getTranslateInstance(f, f2));
    }

    public Matrix(float[] fArr) {
        this.f60855a = fArr;
    }

    public Matrix(COSArray cOSArray) {
        float[] fArr = new float[9];
        this.f60855a = fArr;
        fArr[0] = ((COSNumber) cOSArray.getObject(0)).floatValue();
        this.f60855a[1] = ((COSNumber) cOSArray.getObject(1)).floatValue();
        this.f60855a[3] = ((COSNumber) cOSArray.getObject(2)).floatValue();
        this.f60855a[4] = ((COSNumber) cOSArray.getObject(3)).floatValue();
        this.f60855a[6] = ((COSNumber) cOSArray.getObject(4)).floatValue();
        this.f60855a[7] = ((COSNumber) cOSArray.getObject(5)).floatValue();
        this.f60855a[8] = 1.0f;
    }

    public Vector transform(Vector vector) {
        float[] fArr = this.f60855a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[7];
        float x = vector.getX();
        float y = vector.getY();
        return new Vector((f * x) + (f3 * y) + f5, (x * f2) + (y * f4) + f6);
    }

    public Matrix(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f60855a = r0;
        float[] fArr = {f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 1.0f};
    }

    public Matrix(AffineTransform affineTransform) {
        float[] fArr = new float[9];
        this.f60855a = fArr;
        fArr[0] = (float) affineTransform.getScaleX();
        this.f60855a[1] = (float) affineTransform.getShearY();
        this.f60855a[3] = (float) affineTransform.getShearX();
        this.f60855a[4] = (float) affineTransform.getScaleY();
        this.f60855a[6] = (float) affineTransform.getTranslateX();
        this.f60855a[7] = (float) affineTransform.getTranslateY();
        this.f60855a[8] = 1.0f;
    }
}
