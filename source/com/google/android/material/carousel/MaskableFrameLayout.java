package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;

/* loaded from: classes4.dex */
public class MaskableFrameLayout extends FrameLayout implements InterfaceC18899Zn0, Shapeable {

    /* renamed from: a */
    public float f49379a;

    /* renamed from: b */
    public final RectF f49380b;

    /* renamed from: c */
    public OnMaskChangedListener f49381c;

    /* renamed from: d */
    public ShapeAppearanceModel f49382d;

    /* renamed from: e */
    public final AbstractC6862b f49383e;

    /* renamed from: f */
    public Boolean f49384f;

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC6862b {

        /* renamed from: a */
        public boolean f49385a;

        /* renamed from: b */
        public ShapeAppearanceModel f49386b;

        /* renamed from: c */
        public RectF f49387c;

        /* renamed from: d */
        public final Path f49388d;

        public AbstractC6862b() {
            this.f49385a = false;
            this.f49387c = new RectF();
            this.f49388d = new Path();
        }

        /* renamed from: a */
        public abstract void mo45490a(View view);

        /* renamed from: b */
        public boolean m45500b() {
            return this.f49385a;
        }

        /* renamed from: c */
        public void m45499c(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
            if (mo45489g() && !this.f49388d.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.f49388d);
                canvasOperation.run(canvas);
                canvas.restore();
                return;
            }
            canvasOperation.run(canvas);
        }

        /* renamed from: d */
        public void m45498d(View view, RectF rectF) {
            this.f49387c = rectF;
            m45495h();
            mo45490a(view);
        }

        /* renamed from: e */
        public void m45497e(View view, ShapeAppearanceModel shapeAppearanceModel) {
            this.f49386b = shapeAppearanceModel;
            m45495h();
            mo45490a(view);
        }

        /* renamed from: f */
        public void m45496f(View view, boolean z) {
            if (z != this.f49385a) {
                this.f49385a = z;
                mo45490a(view);
            }
        }

        /* renamed from: g */
        public abstract boolean mo45489g();

        /* renamed from: h */
        public final void m45495h() {
            if (!this.f49387c.isEmpty() && this.f49386b != null) {
                ShapeAppearancePathProvider.getInstance().calculatePath(this.f49386b, 1.0f, this.f49387c, this.f49388d);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$c */
    /* loaded from: classes4.dex */
    public static class C6863c extends AbstractC6862b {
        public C6863c() {
            super();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6862b
        /* renamed from: a */
        public void mo45490a(View view) {
            if (this.f49386b != null && !this.f49387c.isEmpty() && mo45489g()) {
                view.invalidate();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6862b
        /* renamed from: g */
        public boolean mo45489g() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$d */
    /* loaded from: classes4.dex */
    public static class C6864d extends AbstractC6862b {

        /* renamed from: e */
        public boolean f49389e;

        /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$d$a */
        /* loaded from: classes4.dex */
        public class C6865a extends ViewOutlineProvider {
            public C6865a() {
                C6864d.this = r1;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                C6864d c6864d = C6864d.this;
                if (c6864d.f49386b != null && !c6864d.f49387c.isEmpty()) {
                    C6864d c6864d2 = C6864d.this;
                    RectF rectF = c6864d2.f49387c;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c6864d2.m45493j(c6864d2.f49386b, rectF));
                }
            }
        }

        public C6864d(View view) {
            super();
            this.f49389e = false;
            m45492k(view);
        }

        @DoNotInline
        /* renamed from: k */
        private void m45492k(View view) {
            view.setOutlineProvider(new C6865a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6862b
        /* renamed from: a */
        public void mo45490a(View view) {
            m45491l();
            view.setClipToOutline(!mo45489g());
            if (mo45489g()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6862b
        /* renamed from: g */
        public boolean mo45489g() {
            if (this.f49389e && !this.f49385a) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final float m45493j(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            return shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF);
        }

        /* renamed from: l */
        public final void m45491l() {
            ShapeAppearanceModel shapeAppearanceModel;
            if (!this.f49387c.isEmpty() && (shapeAppearanceModel = this.f49386b) != null) {
                this.f49389e = shapeAppearanceModel.isRoundRect(this.f49387c);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$e */
    /* loaded from: classes4.dex */
    public static class C6866e extends AbstractC6862b {

        /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$e$a */
        /* loaded from: classes4.dex */
        public class C6867a extends ViewOutlineProvider {
            public C6867a() {
                C6866e.this = r1;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (!C6866e.this.f49388d.isEmpty()) {
                    outline.setPath(C6866e.this.f49388d);
                }
            }
        }

        public C6866e(View view) {
            super();
            m45488i(view);
        }

        @DoNotInline
        /* renamed from: i */
        private void m45488i(View view) {
            view.setOutlineProvider(new C6867a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6862b
        /* renamed from: a */
        public void mo45490a(View view) {
            view.setClipToOutline(!mo45489g());
            if (mo45489g()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6862b
        /* renamed from: g */
        public boolean mo45489g() {
            return this.f49385a;
        }
    }

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ CornerSize m45506a(CornerSize cornerSize) {
        return m45502e(cornerSize);
    }

    /* renamed from: b */
    public static /* synthetic */ void m45505b(MaskableFrameLayout maskableFrameLayout, Canvas canvas) {
        maskableFrameLayout.m45503d(canvas);
    }

    /* renamed from: e */
    public static /* synthetic */ CornerSize m45502e(CornerSize cornerSize) {
        if (cornerSize instanceof AbsoluteCornerSize) {
            return ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize);
        }
        return cornerSize;
    }

    /* renamed from: c */
    public final AbstractC6862b m45504c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return new C6866e(this);
        }
        if (i >= 22) {
            return new C6864d(this);
        }
        return new C6863c();
    }

    /* renamed from: d */
    public final /* synthetic */ void m45503d(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f49383e.m45499c(canvas, new CanvasCompat.CanvasOperation() { // from class: bo0
            {
                MaskableFrameLayout.this = this;
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                MaskableFrameLayout.m45505b(MaskableFrameLayout.this, canvas2);
            }
        });
    }

    /* renamed from: f */
    public final void m45501f() {
        if (getWidth() == 0) {
            return;
        }
        float lerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f49379a);
        this.f49380b.set(lerp, 0.0f, getWidth() - lerp, getHeight());
        this.f49383e.m45498d(this, this.f49380b);
        OnMaskChangedListener onMaskChangedListener = this.f49381c;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.f49380b);
        }
    }

    @NonNull
    public RectF getMaskRectF() {
        return this.f49380b;
    }

    public float getMaskXPercentage() {
        return this.f49379a;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f49382d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f49384f;
        if (bool != null) {
            this.f49383e.m45496f(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f49384f = Boolean.valueOf(this.f49383e.m45500b());
        this.f49383e.m45496f(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m45501f();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f49380b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f49380b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        this.f49383e.m45496f(this, z);
    }

    @Override // p000.InterfaceC18899Zn0
    public void setMaskXPercentage(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (this.f49379a != clamp) {
            this.f49379a = clamp;
            m45501f();
        }
    }

    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.f49381c = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel withTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: ao0
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return MaskableFrameLayout.m45506a(cornerSize);
            }
        });
        this.f49382d = withTransformedCornerSizes;
        this.f49383e.m45497e(this, withTransformedCornerSizes);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49379a = 0.0f;
        this.f49380b = new RectF();
        this.f49383e = m45504c();
        this.f49384f = null;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i, 0, 0).build());
    }
}
