package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;

    /* renamed from: a */
    public final List f50740a = new ArrayList();

    /* renamed from: b */
    public final List f50741b = new ArrayList();

    /* renamed from: c */
    public boolean f50742c;
    @Deprecated
    public float currentShadowAngle;
    @Deprecated
    public float endShadowAngle;
    @Deprecated
    public float endX;
    @Deprecated
    public float endY;
    @Deprecated
    public float startX;
    @Deprecated
    public float startY;

    /* loaded from: classes4.dex */
    public static class PathArcOperation extends PathOperation {

        /* renamed from: a */
        public static final RectF f50743a = new RectF();
        @Deprecated
        public float bottom;
        @Deprecated
        public float left;
        @Deprecated
        public float right;
        @Deprecated
        public float startAngle;
        @Deprecated
        public float sweepAngle;
        @Deprecated
        public float top;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            m44131p(f);
            m44127t(f2);
            m44130q(f3);
            m44132o(f4);
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f50743a;
            rectF.set(m44137j(), m44133n(), m44136k(), m44138i());
            path.arcTo(rectF, m44135l(), m44134m(), false);
            path.transform(matrix);
        }

        /* renamed from: i */
        public final float m44138i() {
            return this.bottom;
        }

        /* renamed from: j */
        public final float m44137j() {
            return this.left;
        }

        /* renamed from: k */
        public final float m44136k() {
            return this.right;
        }

        /* renamed from: l */
        public final float m44135l() {
            return this.startAngle;
        }

        /* renamed from: m */
        public final float m44134m() {
            return this.sweepAngle;
        }

        /* renamed from: n */
        public final float m44133n() {
            return this.top;
        }

        /* renamed from: o */
        public final void m44132o(float f) {
            this.bottom = f;
        }

        /* renamed from: p */
        public final void m44131p(float f) {
            this.left = f;
        }

        /* renamed from: q */
        public final void m44130q(float f) {
            this.right = f;
        }

        /* renamed from: r */
        public final void m44129r(float f) {
            this.startAngle = f;
        }

        /* renamed from: s */
        public final void m44128s(float f) {
            this.sweepAngle = f;
        }

        /* renamed from: t */
        public final void m44127t(float f) {
            this.top = f;
        }
    }

    /* loaded from: classes4.dex */
    public static class PathCubicOperation extends PathOperation {

        /* renamed from: a */
        public float f50744a;

        /* renamed from: b */
        public float f50745b;

        /* renamed from: c */
        public float f50746c;

        /* renamed from: d */
        public float f50747d;

        /* renamed from: e */
        public float f50748e;

        /* renamed from: f */
        public float f50749f;

        public PathCubicOperation(float f, float f2, float f3, float f4, float f5, float f6) {
            m44126a(f);
            m44124c(f2);
            m44125b(f3);
            m44123d(f4);
            m44122e(f5);
            m44121f(f6);
        }

        /* renamed from: a */
        public final void m44126a(float f) {
            this.f50744a = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f50744a, this.f50745b, this.f50746c, this.f50747d, this.f50748e, this.f50749f);
            path.transform(matrix);
        }

        /* renamed from: b */
        public final void m44125b(float f) {
            this.f50746c = f;
        }

        /* renamed from: c */
        public final void m44124c(float f) {
            this.f50745b = f;
        }

        /* renamed from: d */
        public final void m44123d(float f) {
            this.f50747d = f;
        }

        /* renamed from: e */
        public final void m44122e(float f) {
            this.f50748e = f;
        }

        /* renamed from: f */
        public final void m44121f(float f) {
            this.f50749f = f;
        }
    }

    /* loaded from: classes4.dex */
    public static class PathLineOperation extends PathOperation {

        /* renamed from: a */
        public float f50750a;

        /* renamed from: b */
        public float f50751b;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f50750a, this.f50751b);
            path.transform(matrix);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* loaded from: classes4.dex */
    public static class PathQuadOperation extends PathOperation {
        @Deprecated
        public float controlX;
        @Deprecated
        public float controlY;
        @Deprecated
        public float endX;
        @Deprecated
        public float endY;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m44106k(float f) {
            this.endX = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m44105l(float f) {
            this.endY = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(m44112e(), m44111f(), m44110g(), m44109h());
            path.transform(matrix);
        }

        /* renamed from: e */
        public final float m44112e() {
            return this.controlX;
        }

        /* renamed from: f */
        public final float m44111f() {
            return this.controlY;
        }

        /* renamed from: g */
        public final float m44110g() {
            return this.endX;
        }

        /* renamed from: h */
        public final float m44109h() {
            return this.endY;
        }

        /* renamed from: i */
        public final void m44108i(float f) {
            this.controlX = f;
        }

        /* renamed from: j */
        public final void m44107j(float f) {
            this.controlY = f;
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$a */
    /* loaded from: classes4.dex */
    public class C7052a extends AbstractC7056e {

        /* renamed from: c */
        public final /* synthetic */ List f50752c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f50753d;

        public C7052a(List list, Matrix matrix) {
            this.f50752c = list;
            this.f50753d = matrix;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7056e
        /* renamed from: a */
        public void mo44100a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            for (AbstractC7056e abstractC7056e : this.f50752c) {
                abstractC7056e.mo44100a(this.f50753d, shadowRenderer, i, canvas);
            }
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$b */
    /* loaded from: classes4.dex */
    public static class C7053b extends AbstractC7056e {

        /* renamed from: c */
        public final PathArcOperation f50755c;

        public C7053b(PathArcOperation pathArcOperation) {
            this.f50755c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7056e
        /* renamed from: a */
        public void mo44100a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.f50755c.m44137j(), this.f50755c.m44133n(), this.f50755c.m44136k(), this.f50755c.m44138i()), i, this.f50755c.m44135l(), this.f50755c.m44134m());
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$c */
    /* loaded from: classes4.dex */
    public static class C7054c extends AbstractC7056e {

        /* renamed from: c */
        public final PathLineOperation f50756c;

        /* renamed from: d */
        public final PathLineOperation f50757d;

        /* renamed from: e */
        public final float f50758e;

        /* renamed from: f */
        public final float f50759f;

        public C7054c(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
            this.f50756c = pathLineOperation;
            this.f50757d = pathLineOperation2;
            this.f50758e = f;
            this.f50759f = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7056e
        /* renamed from: a */
        public void mo44100a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            float m44102e = m44102e();
            if (m44102e > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.f50756c.f50750a - this.f50758e, this.f50756c.f50751b - this.f50759f);
            double hypot2 = Math.hypot(this.f50757d.f50750a - this.f50756c.f50750a, this.f50757d.f50751b - this.f50756c.f50751b);
            float min = (float) Math.min(i, Math.min(hypot, hypot2));
            double d = min;
            double tan = Math.tan(Math.toRadians((-m44102e) / 2.0f)) * d;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.f50764a.set(matrix);
                this.f50764a.preTranslate(this.f50758e, this.f50759f);
                this.f50764a.preRotate(m44103d());
                shadowRenderer.drawEdgeShadow(canvas, this.f50764a, rectF, i);
            }
            float f = 2.0f * min;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
            this.f50764a.set(matrix);
            this.f50764a.preTranslate(this.f50756c.f50750a, this.f50756c.f50751b);
            this.f50764a.preRotate(m44103d());
            this.f50764a.preTranslate((float) ((-tan) - d), (-2.0f) * min);
            shadowRenderer.drawInnerCornerShadow(canvas, this.f50764a, rectF2, (int) min, 450.0f, m44102e, new float[]{(float) (d + tan), f});
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.f50764a.set(matrix);
                this.f50764a.preTranslate(this.f50756c.f50750a, this.f50756c.f50751b);
                this.f50764a.preRotate(m44104c());
                this.f50764a.preTranslate((float) tan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.f50764a, rectF3, i);
            }
        }

        /* renamed from: c */
        public float m44104c() {
            return (float) Math.toDegrees(Math.atan((this.f50757d.f50751b - this.f50756c.f50751b) / (this.f50757d.f50750a - this.f50756c.f50750a)));
        }

        /* renamed from: d */
        public float m44103d() {
            return (float) Math.toDegrees(Math.atan((this.f50756c.f50751b - this.f50759f) / (this.f50756c.f50750a - this.f50758e)));
        }

        /* renamed from: e */
        public float m44102e() {
            float m44104c = ((m44104c() - m44103d()) + 360.0f) % 360.0f;
            if (m44104c <= 180.0f) {
                return m44104c;
            }
            return m44104c - 360.0f;
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$d */
    /* loaded from: classes4.dex */
    public static class C7055d extends AbstractC7056e {

        /* renamed from: c */
        public final PathLineOperation f50760c;

        /* renamed from: d */
        public final float f50761d;

        /* renamed from: e */
        public final float f50762e;

        public C7055d(PathLineOperation pathLineOperation, float f, float f2) {
            this.f50760c = pathLineOperation;
            this.f50761d = f;
            this.f50762e = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7056e
        /* renamed from: a */
        public void mo44100a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f50760c.f50751b - this.f50762e, this.f50760c.f50750a - this.f50761d), 0.0f);
            this.f50764a.set(matrix);
            this.f50764a.preTranslate(this.f50761d, this.f50762e);
            this.f50764a.preRotate(m44101c());
            shadowRenderer.drawEdgeShadow(canvas, this.f50764a, rectF, i);
        }

        /* renamed from: c */
        public float m44101c() {
            return (float) Math.toDegrees(Math.atan((this.f50760c.f50751b - this.f50762e) / (this.f50760c.f50750a - this.f50761d)));
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$e */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7056e {

        /* renamed from: b */
        public static final Matrix f50763b = new Matrix();

        /* renamed from: a */
        public final Matrix f50764a = new Matrix();

        /* renamed from: a */
        public abstract void mo44100a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);

        /* renamed from: b */
        public final void m44099b(ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            mo44100a(f50763b, shadowRenderer, i, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m44162a(float f) {
        if (m44158e() == f) {
            return;
        }
        float m44158e = ((f - m44158e()) + 360.0f) % 360.0f;
        if (m44158e > 180.0f) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(m44156g(), m44155h(), m44156g(), m44155h());
        pathArcOperation.m44129r(m44158e());
        pathArcOperation.m44128s(m44158e);
        this.f50741b.add(new C7053b(pathArcOperation));
        m44152k(f);
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.m44129r(f5);
        pathArcOperation.m44128s(f6);
        this.f50740a.add(pathArcOperation);
        C7053b c7053b = new C7053b(pathArcOperation);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m44161b(c7053b, f5, f7);
        double d = f8;
        m44150m(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m44149n(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.f50740a.size();
        for (int i = 0; i < size; i++) {
            ((PathOperation) this.f50740a.get(i)).applyToPath(matrix, path);
        }
    }

    /* renamed from: b */
    public final void m44161b(AbstractC7056e abstractC7056e, float f, float f2) {
        m44162a(f);
        this.f50741b.add(abstractC7056e);
        m44152k(f2);
    }

    /* renamed from: c */
    public boolean m44160c() {
        return this.f50742c;
    }

    @RequiresApi(21)
    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f50740a.add(new PathCubicOperation(f, f2, f3, f4, f5, f6));
        this.f50742c = true;
        m44150m(f5);
        m44149n(f6);
    }

    /* renamed from: d */
    public AbstractC7056e m44159d(Matrix matrix) {
        m44162a(m44157f());
        return new C7052a(new ArrayList(this.f50741b), new Matrix(matrix));
    }

    /* renamed from: e */
    public final float m44158e() {
        return this.currentShadowAngle;
    }

    /* renamed from: f */
    public final float m44157f() {
        return this.endShadowAngle;
    }

    /* renamed from: g */
    public float m44156g() {
        return this.endX;
    }

    /* renamed from: h */
    public float m44155h() {
        return this.endY;
    }

    /* renamed from: i */
    public float m44154i() {
        return this.startX;
    }

    /* renamed from: j */
    public float m44153j() {
        return this.startY;
    }

    /* renamed from: k */
    public final void m44152k(float f) {
        this.currentShadowAngle = f;
    }

    /* renamed from: l */
    public final void m44151l(float f) {
        this.endShadowAngle = f;
    }

    public void lineTo(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f50750a = f;
        pathLineOperation.f50751b = f2;
        this.f50740a.add(pathLineOperation);
        C7055d c7055d = new C7055d(pathLineOperation, m44156g(), m44155h());
        m44161b(c7055d, c7055d.m44101c() + 270.0f, c7055d.m44101c() + 270.0f);
        m44150m(f);
        m44149n(f2);
    }

    /* renamed from: m */
    public final void m44150m(float f) {
        this.endX = f;
    }

    /* renamed from: n */
    public final void m44149n(float f) {
        this.endY = f;
    }

    /* renamed from: o */
    public final void m44148o(float f) {
        this.startX = f;
    }

    /* renamed from: p */
    public final void m44147p(float f) {
        this.startY = f;
    }

    @RequiresApi(21)
    public void quadToPoint(float f, float f2, float f3, float f4) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.m44108i(f);
        pathQuadOperation.m44107j(f2);
        pathQuadOperation.m44106k(f3);
        pathQuadOperation.m44105l(f4);
        this.f50740a.add(pathQuadOperation);
        this.f50742c = true;
        m44150m(f3);
        m44149n(f4);
    }

    public void reset(float f, float f2) {
        reset(f, f2, 270.0f, 0.0f);
    }

    public void reset(float f, float f2, float f3, float f4) {
        m44148o(f);
        m44147p(f2);
        m44150m(f);
        m44149n(f2);
        m44152k(f3);
        m44151l((f3 + f4) % 360.0f);
        this.f50740a.clear();
        this.f50741b.clear();
        this.f50742c = false;
    }

    public ShapePath(float f, float f2) {
        reset(f, f2);
    }

    public void lineTo(float f, float f2, float f3, float f4) {
        if ((Math.abs(f - m44156g()) < 0.001f && Math.abs(f2 - m44155h()) < 0.001f) || (Math.abs(f - f3) < 0.001f && Math.abs(f2 - f4) < 0.001f)) {
            lineTo(f3, f4);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f50750a = f;
        pathLineOperation.f50751b = f2;
        this.f50740a.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f50750a = f3;
        pathLineOperation2.f50751b = f4;
        this.f50740a.add(pathLineOperation2);
        C7054c c7054c = new C7054c(pathLineOperation, pathLineOperation2, m44156g(), m44155h());
        if (c7054c.m44102e() > 0.0f) {
            lineTo(f, f2);
            lineTo(f3, f4);
            return;
        }
        m44161b(c7054c, c7054c.m44103d() + 270.0f, c7054c.m44104c() + 270.0f);
        m44150m(f3);
        m44149n(f4);
    }
}