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
    public final List f50728a = new ArrayList();

    /* renamed from: b */
    public final List f50729b = new ArrayList();

    /* renamed from: c */
    public boolean f50730c;
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
        public static final RectF f50731a = new RectF();
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
            m44144p(f);
            m44140t(f2);
            m44143q(f3);
            m44145o(f4);
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f50731a;
            rectF.set(m44150j(), m44146n(), m44149k(), m44151i());
            path.arcTo(rectF, m44148l(), m44147m(), false);
            path.transform(matrix);
        }

        /* renamed from: i */
        public final float m44151i() {
            return this.bottom;
        }

        /* renamed from: j */
        public final float m44150j() {
            return this.left;
        }

        /* renamed from: k */
        public final float m44149k() {
            return this.right;
        }

        /* renamed from: l */
        public final float m44148l() {
            return this.startAngle;
        }

        /* renamed from: m */
        public final float m44147m() {
            return this.sweepAngle;
        }

        /* renamed from: n */
        public final float m44146n() {
            return this.top;
        }

        /* renamed from: o */
        public final void m44145o(float f) {
            this.bottom = f;
        }

        /* renamed from: p */
        public final void m44144p(float f) {
            this.left = f;
        }

        /* renamed from: q */
        public final void m44143q(float f) {
            this.right = f;
        }

        /* renamed from: r */
        public final void m44142r(float f) {
            this.startAngle = f;
        }

        /* renamed from: s */
        public final void m44141s(float f) {
            this.sweepAngle = f;
        }

        /* renamed from: t */
        public final void m44140t(float f) {
            this.top = f;
        }
    }

    /* loaded from: classes4.dex */
    public static class PathCubicOperation extends PathOperation {

        /* renamed from: a */
        public float f50732a;

        /* renamed from: b */
        public float f50733b;

        /* renamed from: c */
        public float f50734c;

        /* renamed from: d */
        public float f50735d;

        /* renamed from: e */
        public float f50736e;

        /* renamed from: f */
        public float f50737f;

        public PathCubicOperation(float f, float f2, float f3, float f4, float f5, float f6) {
            m44139a(f);
            m44137c(f2);
            m44138b(f3);
            m44136d(f4);
            m44135e(f5);
            m44134f(f6);
        }

        /* renamed from: a */
        public final void m44139a(float f) {
            this.f50732a = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f50732a, this.f50733b, this.f50734c, this.f50735d, this.f50736e, this.f50737f);
            path.transform(matrix);
        }

        /* renamed from: b */
        public final void m44138b(float f) {
            this.f50734c = f;
        }

        /* renamed from: c */
        public final void m44137c(float f) {
            this.f50733b = f;
        }

        /* renamed from: d */
        public final void m44136d(float f) {
            this.f50735d = f;
        }

        /* renamed from: e */
        public final void m44135e(float f) {
            this.f50736e = f;
        }

        /* renamed from: f */
        public final void m44134f(float f) {
            this.f50737f = f;
        }
    }

    /* loaded from: classes4.dex */
    public static class PathLineOperation extends PathOperation {

        /* renamed from: a */
        public float f50738a;

        /* renamed from: b */
        public float f50739b;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f50738a, this.f50739b);
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
        public void m44119k(float f) {
            this.endX = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m44118l(float f) {
            this.endY = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(m44125e(), m44124f(), m44123g(), m44122h());
            path.transform(matrix);
        }

        /* renamed from: e */
        public final float m44125e() {
            return this.controlX;
        }

        /* renamed from: f */
        public final float m44124f() {
            return this.controlY;
        }

        /* renamed from: g */
        public final float m44123g() {
            return this.endX;
        }

        /* renamed from: h */
        public final float m44122h() {
            return this.endY;
        }

        /* renamed from: i */
        public final void m44121i(float f) {
            this.controlX = f;
        }

        /* renamed from: j */
        public final void m44120j(float f) {
            this.controlY = f;
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$a */
    /* loaded from: classes4.dex */
    public class C7063a extends AbstractC7067e {

        /* renamed from: c */
        public final /* synthetic */ List f50740c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f50741d;

        public C7063a(List list, Matrix matrix) {
            this.f50740c = list;
            this.f50741d = matrix;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7067e
        /* renamed from: a */
        public void mo44113a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            for (AbstractC7067e abstractC7067e : this.f50740c) {
                abstractC7067e.mo44113a(this.f50741d, shadowRenderer, i, canvas);
            }
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$b */
    /* loaded from: classes4.dex */
    public static class C7064b extends AbstractC7067e {

        /* renamed from: c */
        public final PathArcOperation f50743c;

        public C7064b(PathArcOperation pathArcOperation) {
            this.f50743c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7067e
        /* renamed from: a */
        public void mo44113a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.f50743c.m44150j(), this.f50743c.m44146n(), this.f50743c.m44149k(), this.f50743c.m44151i()), i, this.f50743c.m44148l(), this.f50743c.m44147m());
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$c */
    /* loaded from: classes4.dex */
    public static class C7065c extends AbstractC7067e {

        /* renamed from: c */
        public final PathLineOperation f50744c;

        /* renamed from: d */
        public final PathLineOperation f50745d;

        /* renamed from: e */
        public final float f50746e;

        /* renamed from: f */
        public final float f50747f;

        public C7065c(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
            this.f50744c = pathLineOperation;
            this.f50745d = pathLineOperation2;
            this.f50746e = f;
            this.f50747f = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7067e
        /* renamed from: a */
        public void mo44113a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            float m44115e = m44115e();
            if (m44115e > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.f50744c.f50738a - this.f50746e, this.f50744c.f50739b - this.f50747f);
            double hypot2 = Math.hypot(this.f50745d.f50738a - this.f50744c.f50738a, this.f50745d.f50739b - this.f50744c.f50739b);
            float min = (float) Math.min(i, Math.min(hypot, hypot2));
            double d = min;
            double tan = Math.tan(Math.toRadians((-m44115e) / 2.0f)) * d;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.f50752a.set(matrix);
                this.f50752a.preTranslate(this.f50746e, this.f50747f);
                this.f50752a.preRotate(m44116d());
                shadowRenderer.drawEdgeShadow(canvas, this.f50752a, rectF, i);
            }
            float f = 2.0f * min;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
            this.f50752a.set(matrix);
            this.f50752a.preTranslate(this.f50744c.f50738a, this.f50744c.f50739b);
            this.f50752a.preRotate(m44116d());
            this.f50752a.preTranslate((float) ((-tan) - d), (-2.0f) * min);
            shadowRenderer.drawInnerCornerShadow(canvas, this.f50752a, rectF2, (int) min, 450.0f, m44115e, new float[]{(float) (d + tan), f});
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.f50752a.set(matrix);
                this.f50752a.preTranslate(this.f50744c.f50738a, this.f50744c.f50739b);
                this.f50752a.preRotate(m44117c());
                this.f50752a.preTranslate((float) tan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.f50752a, rectF3, i);
            }
        }

        /* renamed from: c */
        public float m44117c() {
            return (float) Math.toDegrees(Math.atan((this.f50745d.f50739b - this.f50744c.f50739b) / (this.f50745d.f50738a - this.f50744c.f50738a)));
        }

        /* renamed from: d */
        public float m44116d() {
            return (float) Math.toDegrees(Math.atan((this.f50744c.f50739b - this.f50747f) / (this.f50744c.f50738a - this.f50746e)));
        }

        /* renamed from: e */
        public float m44115e() {
            float m44117c = ((m44117c() - m44116d()) + 360.0f) % 360.0f;
            if (m44117c <= 180.0f) {
                return m44117c;
            }
            return m44117c - 360.0f;
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$d */
    /* loaded from: classes4.dex */
    public static class C7066d extends AbstractC7067e {

        /* renamed from: c */
        public final PathLineOperation f50748c;

        /* renamed from: d */
        public final float f50749d;

        /* renamed from: e */
        public final float f50750e;

        public C7066d(PathLineOperation pathLineOperation, float f, float f2) {
            this.f50748c = pathLineOperation;
            this.f50749d = f;
            this.f50750e = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.AbstractC7067e
        /* renamed from: a */
        public void mo44113a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f50748c.f50739b - this.f50750e, this.f50748c.f50738a - this.f50749d), 0.0f);
            this.f50752a.set(matrix);
            this.f50752a.preTranslate(this.f50749d, this.f50750e);
            this.f50752a.preRotate(m44114c());
            shadowRenderer.drawEdgeShadow(canvas, this.f50752a, rectF, i);
        }

        /* renamed from: c */
        public float m44114c() {
            return (float) Math.toDegrees(Math.atan((this.f50748c.f50739b - this.f50750e) / (this.f50748c.f50738a - this.f50749d)));
        }
    }

    /* renamed from: com.google.android.material.shape.ShapePath$e */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7067e {

        /* renamed from: b */
        public static final Matrix f50751b = new Matrix();

        /* renamed from: a */
        public final Matrix f50752a = new Matrix();

        /* renamed from: a */
        public abstract void mo44113a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);

        /* renamed from: b */
        public final void m44112b(ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            mo44113a(f50751b, shadowRenderer, i, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m44175a(float f) {
        if (m44171e() == f) {
            return;
        }
        float m44171e = ((f - m44171e()) + 360.0f) % 360.0f;
        if (m44171e > 180.0f) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(m44169g(), m44168h(), m44169g(), m44168h());
        pathArcOperation.m44142r(m44171e());
        pathArcOperation.m44141s(m44171e);
        this.f50729b.add(new C7064b(pathArcOperation));
        m44165k(f);
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.m44142r(f5);
        pathArcOperation.m44141s(f6);
        this.f50728a.add(pathArcOperation);
        C7064b c7064b = new C7064b(pathArcOperation);
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
        m44174b(c7064b, f5, f7);
        double d = f8;
        m44163m(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m44162n(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.f50728a.size();
        for (int i = 0; i < size; i++) {
            ((PathOperation) this.f50728a.get(i)).applyToPath(matrix, path);
        }
    }

    /* renamed from: b */
    public final void m44174b(AbstractC7067e abstractC7067e, float f, float f2) {
        m44175a(f);
        this.f50729b.add(abstractC7067e);
        m44165k(f2);
    }

    /* renamed from: c */
    public boolean m44173c() {
        return this.f50730c;
    }

    @RequiresApi(21)
    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f50728a.add(new PathCubicOperation(f, f2, f3, f4, f5, f6));
        this.f50730c = true;
        m44163m(f5);
        m44162n(f6);
    }

    /* renamed from: d */
    public AbstractC7067e m44172d(Matrix matrix) {
        m44175a(m44170f());
        return new C7063a(new ArrayList(this.f50729b), new Matrix(matrix));
    }

    /* renamed from: e */
    public final float m44171e() {
        return this.currentShadowAngle;
    }

    /* renamed from: f */
    public final float m44170f() {
        return this.endShadowAngle;
    }

    /* renamed from: g */
    public float m44169g() {
        return this.endX;
    }

    /* renamed from: h */
    public float m44168h() {
        return this.endY;
    }

    /* renamed from: i */
    public float m44167i() {
        return this.startX;
    }

    /* renamed from: j */
    public float m44166j() {
        return this.startY;
    }

    /* renamed from: k */
    public final void m44165k(float f) {
        this.currentShadowAngle = f;
    }

    /* renamed from: l */
    public final void m44164l(float f) {
        this.endShadowAngle = f;
    }

    public void lineTo(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f50738a = f;
        pathLineOperation.f50739b = f2;
        this.f50728a.add(pathLineOperation);
        C7066d c7066d = new C7066d(pathLineOperation, m44169g(), m44168h());
        m44174b(c7066d, c7066d.m44114c() + 270.0f, c7066d.m44114c() + 270.0f);
        m44163m(f);
        m44162n(f2);
    }

    /* renamed from: m */
    public final void m44163m(float f) {
        this.endX = f;
    }

    /* renamed from: n */
    public final void m44162n(float f) {
        this.endY = f;
    }

    /* renamed from: o */
    public final void m44161o(float f) {
        this.startX = f;
    }

    /* renamed from: p */
    public final void m44160p(float f) {
        this.startY = f;
    }

    @RequiresApi(21)
    public void quadToPoint(float f, float f2, float f3, float f4) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.m44121i(f);
        pathQuadOperation.m44120j(f2);
        pathQuadOperation.m44119k(f3);
        pathQuadOperation.m44118l(f4);
        this.f50728a.add(pathQuadOperation);
        this.f50730c = true;
        m44163m(f3);
        m44162n(f4);
    }

    public void reset(float f, float f2) {
        reset(f, f2, 270.0f, 0.0f);
    }

    public void reset(float f, float f2, float f3, float f4) {
        m44161o(f);
        m44160p(f2);
        m44163m(f);
        m44162n(f2);
        m44165k(f3);
        m44164l((f3 + f4) % 360.0f);
        this.f50728a.clear();
        this.f50729b.clear();
        this.f50730c = false;
    }

    public ShapePath(float f, float f2) {
        reset(f, f2);
    }

    public void lineTo(float f, float f2, float f3, float f4) {
        if ((Math.abs(f - m44169g()) < 0.001f && Math.abs(f2 - m44168h()) < 0.001f) || (Math.abs(f - f3) < 0.001f && Math.abs(f2 - f4) < 0.001f)) {
            lineTo(f3, f4);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f50738a = f;
        pathLineOperation.f50739b = f2;
        this.f50728a.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f50738a = f3;
        pathLineOperation2.f50739b = f4;
        this.f50728a.add(pathLineOperation2);
        C7065c c7065c = new C7065c(pathLineOperation, pathLineOperation2, m44169g(), m44168h());
        if (c7065c.m44115e() > 0.0f) {
            lineTo(f, f2);
            lineTo(f3, f4);
            return;
        }
        m44174b(c7065c, c7065c.m44116d() + 270.0f, c7065c.m44117c() + 270.0f);
        m44163m(f3);
        m44162n(f4);
    }
}
