package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* loaded from: classes4.dex */
public class ShapeAppearancePathProvider {

    /* renamed from: a */
    public final ShapePath[] f50710a = new ShapePath[4];

    /* renamed from: b */
    public final Matrix[] f50711b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f50712c = new Matrix[4];

    /* renamed from: d */
    public final PointF f50713d = new PointF();

    /* renamed from: e */
    public final Path f50714e = new Path();

    /* renamed from: f */
    public final Path f50715f = new Path();

    /* renamed from: g */
    public final ShapePath f50716g = new ShapePath();

    /* renamed from: h */
    public final float[] f50717h = new float[2];

    /* renamed from: i */
    public final float[] f50718i = new float[2];

    /* renamed from: j */
    public final Path f50719j = new Path();

    /* renamed from: k */
    public final Path f50720k = new Path();

    /* renamed from: l */
    public boolean f50721l = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i);
    }

    /* renamed from: com.google.android.material.shape.ShapeAppearancePathProvider$a */
    /* loaded from: classes4.dex */
    public static class C7061a {

        /* renamed from: a */
        public static final ShapeAppearancePathProvider f50722a = new ShapeAppearancePathProvider();
    }

    /* renamed from: com.google.android.material.shape.ShapeAppearancePathProvider$b */
    /* loaded from: classes4.dex */
    public static final class C7062b {

        /* renamed from: a */
        public final ShapeAppearanceModel f50723a;

        /* renamed from: b */
        public final Path f50724b;

        /* renamed from: c */
        public final RectF f50725c;

        /* renamed from: d */
        public final PathListener f50726d;

        /* renamed from: e */
        public final float f50727e;

        public C7062b(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, Path path) {
            this.f50726d = pathListener;
            this.f50723a = shapeAppearanceModel;
            this.f50727e = f;
            this.f50725c = rectF;
            this.f50724b = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.f50710a[i] = new ShapePath();
            this.f50711b[i] = new Matrix();
            this.f50712c[i] = new Matrix();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return C7061a.f50722a;
    }

    /* renamed from: a */
    public final float m44187a(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* renamed from: b */
    public final void m44186b(C7062b c7062b, int i) {
        this.f50717h[0] = this.f50710a[i].m44167i();
        this.f50717h[1] = this.f50710a[i].m44166j();
        this.f50711b[i].mapPoints(this.f50717h);
        if (i == 0) {
            Path path = c7062b.f50724b;
            float[] fArr = this.f50717h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c7062b.f50724b;
            float[] fArr2 = this.f50717h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f50710a[i].applyToPath(this.f50711b[i], c7062b.f50724b);
        PathListener pathListener = c7062b.f50726d;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.f50710a[i], this.f50711b[i], i);
        }
    }

    /* renamed from: c */
    public final void m44185c(C7062b c7062b, int i) {
        int i2 = (i + 1) % 4;
        this.f50717h[0] = this.f50710a[i].m44169g();
        this.f50717h[1] = this.f50710a[i].m44168h();
        this.f50711b[i].mapPoints(this.f50717h);
        this.f50718i[0] = this.f50710a[i2].m44167i();
        this.f50718i[1] = this.f50710a[i2].m44166j();
        this.f50711b[i2].mapPoints(this.f50718i);
        float[] fArr = this.f50717h;
        float f = fArr[0];
        float[] fArr2 = this.f50718i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m44181g = m44181g(c7062b.f50725c, i);
        this.f50716g.reset(0.0f, 0.0f);
        EdgeTreatment m44180h = m44180h(i, c7062b.f50723a);
        m44180h.getEdgePath(max, m44181g, c7062b.f50727e, this.f50716g);
        this.f50719j.reset();
        this.f50716g.applyToPath(this.f50712c[i], this.f50719j);
        if (this.f50721l && (m44180h.mo44205a() || m44179i(this.f50719j, i) || m44179i(this.f50719j, i2))) {
            Path path = this.f50719j;
            path.op(path, this.f50715f, Path.Op.DIFFERENCE);
            this.f50717h[0] = this.f50716g.m44167i();
            this.f50717h[1] = this.f50716g.m44166j();
            this.f50712c[i].mapPoints(this.f50717h);
            Path path2 = this.f50714e;
            float[] fArr3 = this.f50717h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f50716g.applyToPath(this.f50712c[i], this.f50714e);
        } else {
            this.f50716g.applyToPath(this.f50712c[i], c7062b.f50724b);
        }
        PathListener pathListener = c7062b.f50726d;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.f50716g, this.f50712c[i], i);
        }
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f, rectF, null, path);
    }

    /* renamed from: d */
    public final void m44184d(int i, RectF rectF, PointF pointF) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    /* renamed from: e */
    public final CornerSize m44183e(int i, ShapeAppearanceModel shapeAppearanceModel) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return shapeAppearanceModel.getTopRightCornerSize();
                }
                return shapeAppearanceModel.getTopLeftCornerSize();
            }
            return shapeAppearanceModel.getBottomLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomRightCornerSize();
    }

    /* renamed from: f */
    public final CornerTreatment m44182f(int i, ShapeAppearanceModel shapeAppearanceModel) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return shapeAppearanceModel.getTopRightCorner();
                }
                return shapeAppearanceModel.getTopLeftCorner();
            }
            return shapeAppearanceModel.getBottomLeftCorner();
        }
        return shapeAppearanceModel.getBottomRightCorner();
    }

    /* renamed from: g */
    public final float m44181g(RectF rectF, int i) {
        float[] fArr = this.f50717h;
        ShapePath shapePath = this.f50710a[i];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.f50711b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.f50717h[1]);
        }
        return Math.abs(rectF.centerX() - this.f50717h[0]);
    }

    /* renamed from: h */
    public final EdgeTreatment m44180h(int i, ShapeAppearanceModel shapeAppearanceModel) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return shapeAppearanceModel.getRightEdge();
                }
                return shapeAppearanceModel.getTopEdge();
            }
            return shapeAppearanceModel.getLeftEdge();
        }
        return shapeAppearanceModel.getBottomEdge();
    }

    /* renamed from: i */
    public final boolean m44179i(Path path, int i) {
        this.f50720k.reset();
        this.f50710a[i].applyToPath(this.f50711b[i], this.f50720k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f50720k.computeBounds(rectF, true);
        path.op(this.f50720k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m44178j(C7062b c7062b, int i) {
        m44182f(i, c7062b.f50723a).getCornerPath(this.f50710a[i], 90.0f, c7062b.f50727e, c7062b.f50725c, m44183e(i, c7062b.f50723a));
        float m44187a = m44187a(i);
        this.f50711b[i].reset();
        m44184d(i, c7062b.f50725c, this.f50713d);
        Matrix matrix = this.f50711b[i];
        PointF pointF = this.f50713d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f50711b[i].preRotate(m44187a);
    }

    /* renamed from: k */
    public void m44177k(boolean z) {
        this.f50721l = z;
    }

    /* renamed from: l */
    public final void m44176l(int i) {
        this.f50717h[0] = this.f50710a[i].m44169g();
        this.f50717h[1] = this.f50710a[i].m44168h();
        this.f50711b[i].mapPoints(this.f50717h);
        float m44187a = m44187a(i);
        this.f50712c[i].reset();
        Matrix matrix = this.f50712c[i];
        float[] fArr = this.f50717h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f50712c[i].preRotate(m44187a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.f50714e.rewind();
        this.f50715f.rewind();
        this.f50715f.addRect(rectF, Path.Direction.CW);
        C7062b c7062b = new C7062b(shapeAppearanceModel, f, rectF, pathListener, path);
        for (int i = 0; i < 4; i++) {
            m44178j(c7062b, i);
            m44176l(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m44186b(c7062b, i2);
            m44185c(c7062b, i2);
        }
        path.close();
        this.f50714e.close();
        if (this.f50714e.isEmpty()) {
            return;
        }
        path.op(this.f50714e, Path.Op.UNION);
    }
}
