package p000;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: vr0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22756vr0 {

    /* renamed from: a */
    public static final Matrix f108239a = new C16936a();

    /* renamed from: vr0$a */
    /* loaded from: classes2.dex */
    public static class C16936a extends Matrix {
        /* renamed from: a */
        public void m842a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f, float f2, float f3) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2, float f3, float f4) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2, float f3, float f4) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f, float f2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f, float f2, float f3) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2, float f3, float f4) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2, float f3, float f4) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f, float f2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f, float f2, float f3) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2, float f3, float f4) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2, float f3, float f4) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2, float f3, float f4) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f, float f2) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2) {
            m842a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2) {
            m842a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2) {
            m842a();
        }
    }
}