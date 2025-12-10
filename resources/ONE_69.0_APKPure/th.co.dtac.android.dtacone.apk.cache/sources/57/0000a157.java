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
public class MaskableFrameLayout extends FrameLayout implements InterfaceC19979fo0, Shapeable {

    /* renamed from: a */
    public float f49391a;

    /* renamed from: b */
    public final RectF f49392b;

    /* renamed from: c */
    public OnMaskChangedListener f49393c;

    /* renamed from: d */
    public ShapeAppearanceModel f49394d;

    /* renamed from: e */
    public final AbstractC6851b f49395e;

    /* renamed from: f */
    public Boolean f49396f;

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC6851b {

        /* renamed from: a */
        public boolean f49397a;

        /* renamed from: b */
        public ShapeAppearanceModel f49398b;

        /* renamed from: c */
        public RectF f49399c;

        /* renamed from: d */
        public final Path f49400d;

        public AbstractC6851b() {
            this.f49397a = false;
            this.f49399c = new RectF();
            this.f49400d = new Path();
        }

        /* renamed from: a */
        public abstract void mo45466a(View view);

        /* renamed from: b */
        public boolean m45476b() {
            return this.f49397a;
        }

        /* renamed from: c */
        public void m45475c(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
            if (mo45465g() && !this.f49400d.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.f49400d);
                canvasOperation.run(canvas);
                canvas.restore();
                return;
            }
            canvasOperation.run(canvas);
        }

        /* renamed from: d */
        public void m45474d(View view, RectF rectF) {
            this.f49399c = rectF;
            m45471h();
            mo45466a(view);
        }

        /* renamed from: e */
        public void m45473e(View view, ShapeAppearanceModel shapeAppearanceModel) {
            this.f49398b = shapeAppearanceModel;
            m45471h();
            mo45466a(view);
        }

        /* renamed from: f */
        public void m45472f(View view, boolean z) {
            if (z != this.f49397a) {
                this.f49397a = z;
                mo45466a(view);
            }
        }

        /* renamed from: g */
        public abstract boolean mo45465g();

        /* renamed from: h */
        public final void m45471h() {
            if (!this.f49399c.isEmpty() && this.f49398b != null) {
                ShapeAppearancePathProvider.getInstance().calculatePath(this.f49398b, 1.0f, this.f49399c, this.f49400d);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$c */
    /* loaded from: classes4.dex */
    public static class C6852c extends AbstractC6851b {
        public C6852c() {
            super();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6851b
        /* renamed from: a */
        public void mo45466a(View view) {
            if (this.f49398b != null && !this.f49399c.isEmpty() && mo45465g()) {
                view.invalidate();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6851b
        /* renamed from: g */
        public boolean mo45465g() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$d */
    /* loaded from: classes4.dex */
    public static class C6853d extends AbstractC6851b {

        /* renamed from: e */
        public boolean f49401e;

        /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$d$a */
        /* loaded from: classes4.dex */
        public class C6854a extends ViewOutlineProvider {
            public C6854a() {
                C6853d.this = r1;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                C6853d c6853d = C6853d.this;
                if (c6853d.f49398b != null && !c6853d.f49399c.isEmpty()) {
                    C6853d c6853d2 = C6853d.this;
                    RectF rectF = c6853d2.f49399c;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c6853d2.m45469j(c6853d2.f49398b, rectF));
                }
            }
        }

        public C6853d(View view) {
            super();
            this.f49401e = false;
            m45468k(view);
        }

        @DoNotInline
        /* renamed from: k */
        private void m45468k(View view) {
            view.setOutlineProvider(new C6854a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6851b
        /* renamed from: a */
        public void mo45466a(View view) {
            m45467l();
            view.setClipToOutline(!mo45465g());
            if (mo45465g()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6851b
        /* renamed from: g */
        public boolean mo45465g() {
            if (this.f49401e && !this.f49397a) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final float m45469j(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            return shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF);
        }

        /* renamed from: l */
        public final void m45467l() {
            ShapeAppearanceModel shapeAppearanceModel;
            if (!this.f49399c.isEmpty() && (shapeAppearanceModel = this.f49398b) != null) {
                this.f49401e = shapeAppearanceModel.isRoundRect(this.f49399c);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$e */
    /* loaded from: classes4.dex */
    public static class C6855e extends AbstractC6851b {

        /* renamed from: com.google.android.material.carousel.MaskableFrameLayout$e$a */
        /* loaded from: classes4.dex */
        public class C6856a extends ViewOutlineProvider {
            public C6856a() {
                C6855e.this = r1;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (!C6855e.this.f49400d.isEmpty()) {
                    outline.setPath(C6855e.this.f49400d);
                }
            }
        }

        public C6855e(View view) {
            super();
            m45464i(view);
        }

        @DoNotInline
        /* renamed from: i */
        private void m45464i(View view) {
            view.setOutlineProvider(new C6856a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6851b
        /* renamed from: a */
        public void mo45466a(View view) {
            view.setClipToOutline(!mo45465g());
            if (mo45465g()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.AbstractC6851b
        /* renamed from: g */
        public boolean mo45465g() {
            return this.f49397a;
        }
    }

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static /* synthetic */ void m45481b(MaskableFrameLayout maskableFrameLayout, Canvas canvas) {
        maskableFrameLayout.m45479d(canvas);
    }

    /* renamed from: e */
    public static /* synthetic */ CornerSize m45478e(CornerSize cornerSize) {
        if (cornerSize instanceof AbsoluteCornerSize) {
            return ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize);
        }
        return cornerSize;
    }

    /* renamed from: c */
    public final AbstractC6851b m45480c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return new C6855e(this);
        }
        if (i >= 22) {
            return new C6853d(this);
        }
        return new C6852c();
    }

    /* renamed from: d */
    public final /* synthetic */ void m45479d(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f49395e.m45475c(canvas, new CanvasCompat.CanvasOperation() { // from class: ho0
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                MaskableFrameLayout.m45481b(MaskableFrameLayout.this, canvas2);
            }
        });
    }

    /* renamed from: f */
    public final void m45477f() {
        if (getWidth() == 0) {
            return;
        }
        float lerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f49391a);
        this.f49392b.set(lerp, 0.0f, getWidth() - lerp, getHeight());
        this.f49395e.m45474d(this, this.f49392b);
        OnMaskChangedListener onMaskChangedListener = this.f49393c;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.f49392b);
        }
    }

    @NonNull
    public RectF getMaskRectF() {
        return this.f49392b;
    }

    public float getMaskXPercentage() {
        return this.f49391a;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f49394d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f49396f;
        if (bool != null) {
            this.f49395e.m45472f(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f49396f = Boolean.valueOf(this.f49395e.m45476b());
        this.f49395e.m45472f(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m45477f();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f49392b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f49392b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        this.f49395e.m45472f(this, z);
    }

    @Override // p000.InterfaceC19979fo0
    public void setMaskXPercentage(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (this.f49391a != clamp) {
            this.f49391a = clamp;
            m45477f();
        }
    }

    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.f49393c = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel withTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: go0
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                CornerSize m45478e;
                m45478e = MaskableFrameLayout.m45478e(cornerSize);
                return m45478e;
            }
        });
        this.f49394d = withTransformedCornerSizes;
        this.f49395e.m45473e(this, withTransformedCornerSizes);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49391a = 0.0f;
        this.f49392b = new RectF();
        this.f49395e = m45480c();
        this.f49396f = null;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i, 0, 0).build());
    }
}