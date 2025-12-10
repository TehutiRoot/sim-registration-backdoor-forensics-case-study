package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class MaterialContainerTransform extends Transition {

    /* renamed from: A */
    public static final String[] f51461A = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: B */
    public static final C7166c f51462B = new C7166c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);

    /* renamed from: C */
    public static final C7166c f51463C = new C7166c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), null);

    /* renamed from: D */
    public static final C7166c f51464D = new C7166c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    /* renamed from: E */
    public static final C7166c f51465E = new C7166c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), null);
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;

    /* renamed from: z */
    public static final String f51466z = "MaterialContainerTransform";

    /* renamed from: a */
    public boolean f51467a;

    /* renamed from: b */
    public boolean f51468b;

    /* renamed from: c */
    public boolean f51469c;

    /* renamed from: d */
    public boolean f51470d;

    /* renamed from: e */
    public int f51471e;

    /* renamed from: f */
    public int f51472f;

    /* renamed from: g */
    public int f51473g;

    /* renamed from: h */
    public int f51474h;

    /* renamed from: i */
    public int f51475i;

    /* renamed from: j */
    public int f51476j;

    /* renamed from: k */
    public int f51477k;

    /* renamed from: l */
    public int f51478l;

    /* renamed from: m */
    public int f51479m;

    /* renamed from: n */
    public int f51480n;

    /* renamed from: o */
    public View f51481o;

    /* renamed from: p */
    public View f51482p;

    /* renamed from: q */
    public ShapeAppearanceModel f51483q;

    /* renamed from: r */
    public ShapeAppearanceModel f51484r;

    /* renamed from: s */
    public ProgressThresholds f51485s;

    /* renamed from: t */
    public ProgressThresholds f51486t;

    /* renamed from: u */
    public ProgressThresholds f51487u;

    /* renamed from: v */
    public ProgressThresholds f51488v;

    /* renamed from: w */
    public boolean f51489w;

    /* renamed from: x */
    public float f51490x;

    /* renamed from: y */
    public float f51491y;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface FitMode {
    }

    /* loaded from: classes4.dex */
    public static class ProgressThresholds {

        /* renamed from: a */
        public final float f51492a;

        /* renamed from: b */
        public final float f51493b;

        public ProgressThresholds(@FloatRange(from = 0.0d, m64694to = 1.0d) float f, @FloatRange(from = 0.0d, m64694to = 1.0d) float f2) {
            this.f51492a = f;
            this.f51493b = f2;
        }

        @FloatRange(from = 0.0d, m64694to = 1.0d)
        public float getEnd() {
            return this.f51493b;
        }

        @FloatRange(from = 0.0d, m64694to = 1.0d)
        public float getStart() {
            return this.f51492a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TransitionDirection {
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$a */
    /* loaded from: classes4.dex */
    public class C7164a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C7167d f51494a;

        public C7164a(C7167d c7167d) {
            this.f51494a = c7167d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51494a.m43436o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$b */
    /* loaded from: classes4.dex */
    public class C7165b extends AbstractC20103gW1 {

        /* renamed from: a */
        public final /* synthetic */ View f51496a;

        /* renamed from: b */
        public final /* synthetic */ C7167d f51497b;

        /* renamed from: c */
        public final /* synthetic */ View f51498c;

        /* renamed from: d */
        public final /* synthetic */ View f51499d;

        public C7165b(View view, C7167d c7167d, View view2, View view3) {
            this.f51496a = view;
            this.f51497b = c7167d;
            this.f51498c = view2;
            this.f51499d = view3;
        }

        @Override // p000.AbstractC20103gW1, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransform.this.removeListener(this);
            if (MaterialContainerTransform.this.f51468b) {
                return;
            }
            this.f51498c.setAlpha(1.0f);
            this.f51499d.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f51496a).remove(this.f51497b);
        }

        @Override // p000.AbstractC20103gW1, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ViewUtils.getOverlay(this.f51496a).add(this.f51497b);
            this.f51498c.setAlpha(0.0f);
            this.f51499d.setAlpha(0.0f);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$c */
    /* loaded from: classes4.dex */
    public static class C7166c {

        /* renamed from: a */
        public final ProgressThresholds f51501a;

        /* renamed from: b */
        public final ProgressThresholds f51502b;

        /* renamed from: c */
        public final ProgressThresholds f51503c;

        /* renamed from: d */
        public final ProgressThresholds f51504d;

        public /* synthetic */ C7166c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C7164a c7164a) {
            this(progressThresholds, progressThresholds2, progressThresholds3, progressThresholds4);
        }

        public C7166c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f51501a = progressThresholds;
            this.f51502b = progressThresholds2;
            this.f51503c = progressThresholds3;
            this.f51504d = progressThresholds4;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d */
    /* loaded from: classes4.dex */
    public static final class C7167d extends Drawable {

        /* renamed from: A */
        public final C7166c f51505A;

        /* renamed from: B */
        public final InterfaceC1373TV f51506B;

        /* renamed from: C */
        public final C20 f51507C;

        /* renamed from: D */
        public final boolean f51508D;

        /* renamed from: E */
        public final Paint f51509E;

        /* renamed from: F */
        public final Path f51510F;

        /* renamed from: G */
        public C1671XV f51511G;

        /* renamed from: H */
        public G20 f51512H;

        /* renamed from: I */
        public RectF f51513I;

        /* renamed from: J */
        public float f51514J;

        /* renamed from: K */
        public float f51515K;

        /* renamed from: L */
        public float f51516L;

        /* renamed from: a */
        public final View f51517a;

        /* renamed from: b */
        public final RectF f51518b;

        /* renamed from: c */
        public final ShapeAppearanceModel f51519c;

        /* renamed from: d */
        public final float f51520d;

        /* renamed from: e */
        public final View f51521e;

        /* renamed from: f */
        public final RectF f51522f;

        /* renamed from: g */
        public final ShapeAppearanceModel f51523g;

        /* renamed from: h */
        public final float f51524h;

        /* renamed from: i */
        public final Paint f51525i;

        /* renamed from: j */
        public final Paint f51526j;

        /* renamed from: k */
        public final Paint f51527k;

        /* renamed from: l */
        public final Paint f51528l;

        /* renamed from: m */
        public final Paint f51529m;

        /* renamed from: n */
        public final C7176a f51530n;

        /* renamed from: o */
        public final PathMeasure f51531o;

        /* renamed from: p */
        public final float f51532p;

        /* renamed from: q */
        public final float[] f51533q;

        /* renamed from: r */
        public final boolean f51534r;

        /* renamed from: s */
        public final float f51535s;

        /* renamed from: t */
        public final float f51536t;

        /* renamed from: u */
        public final boolean f51537u;

        /* renamed from: v */
        public final MaterialShapeDrawable f51538v;

        /* renamed from: w */
        public final RectF f51539w;

        /* renamed from: x */
        public final RectF f51540x;

        /* renamed from: y */
        public final RectF f51541y;

        /* renamed from: z */
        public final RectF f51542z;

        /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d$a */
        /* loaded from: classes4.dex */
        public class C7168a implements CanvasCompat.CanvasOperation {
            public C7168a() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7167d.this.f51517a.draw(canvas);
            }
        }

        /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d$b */
        /* loaded from: classes4.dex */
        public class C7169b implements CanvasCompat.CanvasOperation {
            public C7169b() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7167d.this.f51521e.draw(canvas);
            }
        }

        public /* synthetic */ C7167d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1373TV interfaceC1373TV, C20 c20, C7166c c7166c, boolean z3, C7164a c7164a) {
            this(pathMotion, view, rectF, shapeAppearanceModel, f, view2, rectF2, shapeAppearanceModel2, f2, i, i2, i3, i4, z, z2, interfaceC1373TV, c20, c7166c, z3);
        }

        /* renamed from: d */
        public static float m43447d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m43446e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m43438m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i;
            if (this.f51529m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f51529m);
            }
            if (this.f51508D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f51537u && this.f51514J > 0.0f) {
                m43443h(canvas);
            }
            this.f51530n.m43409a(canvas);
            m43437n(canvas, this.f51525i);
            if (this.f51511G.f7570c) {
                m43439l(canvas);
                m43440k(canvas);
            } else {
                m43440k(canvas);
                m43439l(canvas);
            }
            if (this.f51508D) {
                canvas.restoreToCount(i);
                m43445f(canvas, this.f51539w, this.f51510F, -65281);
                m43444g(canvas, this.f51540x, -256);
                m43444g(canvas, this.f51539w, -16711936);
                m43444g(canvas, this.f51542z, -16711681);
                m43444g(canvas, this.f51541y, -16776961);
            }
        }

        /* renamed from: f */
        public final void m43445f(Canvas canvas, RectF rectF, Path path, int i) {
            PointF m43438m = m43438m(rectF);
            if (this.f51516L == 0.0f) {
                path.reset();
                path.moveTo(m43438m.x, m43438m.y);
                return;
            }
            path.lineTo(m43438m.x, m43438m.y);
            this.f51509E.setColor(i);
            canvas.drawPath(path, this.f51509E);
        }

        /* renamed from: g */
        public final void m43444g(Canvas canvas, RectF rectF, int i) {
            this.f51509E.setColor(i);
            canvas.drawRect(rectF, this.f51509E);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void m43443h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f51530n.m43406d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m43441j(canvas);
            } else {
                m43442i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void m43442i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f51538v;
            RectF rectF = this.f51513I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f51538v.setElevation(this.f51514J);
            this.f51538v.setShadowVerticalOffset((int) this.f51515K);
            this.f51538v.setShapeAppearanceModel(this.f51530n.m43407c());
            this.f51538v.draw(canvas);
        }

        /* renamed from: j */
        public final void m43441j(Canvas canvas) {
            ShapeAppearanceModel m43407c = this.f51530n.m43407c();
            if (m43407c.isRoundRect(this.f51513I)) {
                float cornerSize = m43407c.getTopLeftCornerSize().getCornerSize(this.f51513I);
                canvas.drawRoundRect(this.f51513I, cornerSize, cornerSize, this.f51528l);
                return;
            }
            canvas.drawPath(this.f51530n.m43406d(), this.f51528l);
        }

        /* renamed from: k */
        public final void m43440k(Canvas canvas) {
            m43437n(canvas, this.f51527k);
            Rect bounds = getBounds();
            RectF rectF = this.f51541y;
            AbstractC21141mW1.m26633w(canvas, bounds, rectF.left, rectF.top, this.f51512H.f1851b, this.f51511G.f7569b, new C7169b());
        }

        /* renamed from: l */
        public final void m43439l(Canvas canvas) {
            m43437n(canvas, this.f51526j);
            Rect bounds = getBounds();
            RectF rectF = this.f51539w;
            AbstractC21141mW1.m26633w(canvas, bounds, rectF.left, rectF.top, this.f51512H.f1850a, this.f51511G.f7568a, new C7168a());
        }

        /* renamed from: n */
        public final void m43437n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void m43436o(float f) {
            if (this.f51516L != f) {
                m43435p(f);
            }
        }

        /* renamed from: p */
        public final void m43435p(float f) {
            float f2;
            float f3;
            this.f51516L = f;
            this.f51529m.setAlpha((int) (this.f51534r ? AbstractC21141mW1.m26643m(0.0f, 255.0f, f) : AbstractC21141mW1.m26643m(255.0f, 0.0f, f)));
            this.f51531o.getPosTan(this.f51532p * f, this.f51533q, null);
            float[] fArr = this.f51533q;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.f51531o.getPosTan(this.f51532p * f2, fArr, null);
                float[] fArr2 = this.f51533q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            G20 mo68547a = this.f51507C.mo68547a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51505A.f51502b.f51492a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51505A.f51502b.f51493b))).floatValue(), this.f51518b.width(), this.f51518b.height(), this.f51522f.width(), this.f51522f.height());
            this.f51512H = mo68547a;
            RectF rectF = this.f51539w;
            float f8 = mo68547a.f1852c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, mo68547a.f1853d + f7);
            RectF rectF2 = this.f51541y;
            G20 g20 = this.f51512H;
            float f9 = g20.f1854e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), g20.f1855f + f7);
            this.f51540x.set(this.f51539w);
            this.f51542z.set(this.f51541y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51505A.f51503c.f51492a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51505A.f51503c.f51493b))).floatValue();
            boolean mo68546b = this.f51507C.mo68546b(this.f51512H);
            RectF rectF3 = mo68546b ? this.f51540x : this.f51542z;
            float m26642n = AbstractC21141mW1.m26642n(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!mo68546b) {
                m26642n = 1.0f - m26642n;
            }
            this.f51507C.mo68545c(rectF3, m26642n, this.f51512H);
            this.f51513I = new RectF(Math.min(this.f51540x.left, this.f51542z.left), Math.min(this.f51540x.top, this.f51542z.top), Math.max(this.f51540x.right, this.f51542z.right), Math.max(this.f51540x.bottom, this.f51542z.bottom));
            this.f51530n.m43408b(f, this.f51519c, this.f51523g, this.f51539w, this.f51540x, this.f51542z, this.f51505A.f51504d);
            this.f51514J = AbstractC21141mW1.m26643m(this.f51520d, this.f51524h, f);
            float m43447d = m43447d(this.f51513I, this.f51535s);
            float m43446e = m43446e(this.f51513I, this.f51536t);
            float f10 = this.f51514J;
            float f11 = (int) (m43446e * f10);
            this.f51515K = f11;
            this.f51528l.setShadowLayer(f10, (int) (m43447d * f10), f11, 754974720);
            this.f51511G = this.f51506B.mo65750a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51505A.f51501a.f51492a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51505A.f51501a.f51493b))).floatValue(), 0.35f);
            if (this.f51526j.getColor() != 0) {
                this.f51526j.setAlpha(this.f51511G.f7568a);
            }
            if (this.f51527k.getColor() != 0) {
                this.f51527k.setAlpha(this.f51511G.f7569b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        public C7167d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1373TV interfaceC1373TV, C20 c20, C7166c c7166c, boolean z3) {
            Paint paint = new Paint();
            this.f51525i = paint;
            Paint paint2 = new Paint();
            this.f51526j = paint2;
            Paint paint3 = new Paint();
            this.f51527k = paint3;
            this.f51528l = new Paint();
            Paint paint4 = new Paint();
            this.f51529m = paint4;
            this.f51530n = new C7176a();
            this.f51533q = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f51538v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f51509E = paint5;
            this.f51510F = new Path();
            this.f51517a = view;
            this.f51518b = rectF;
            this.f51519c = shapeAppearanceModel;
            this.f51520d = f;
            this.f51521e = view2;
            this.f51522f = rectF2;
            this.f51523g = shapeAppearanceModel2;
            this.f51524h = f2;
            this.f51534r = z;
            this.f51537u = z2;
            this.f51506B = interfaceC1373TV;
            this.f51507C = c20;
            this.f51505A = c7166c;
            this.f51508D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f51535s = displayMetrics.widthPixels;
            this.f51536t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f51539w = rectF3;
            this.f51540x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f51541y = rectF4;
            this.f51542z = new RectF(rectF4);
            PointF m43438m = m43438m(rectF);
            PointF m43438m2 = m43438m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m43438m.x, m43438m.y, m43438m2.x, m43438m2.y), false);
            this.f51531o = pathMeasure;
            this.f51532p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(AbstractC21141mW1.m26652d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m43435p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f51467a = false;
        this.f51468b = false;
        this.f51469c = false;
        this.f51470d = false;
        this.f51471e = 16908290;
        this.f51472f = -1;
        this.f51473g = -1;
        this.f51474h = 0;
        this.f51475i = 0;
        this.f51476j = 0;
        this.f51477k = 1375731712;
        this.f51478l = 0;
        this.f51479m = 0;
        this.f51480n = 0;
        this.f51489w = Build.VERSION.SDK_INT >= 28;
        this.f51490x = -1.0f;
        this.f51491y = -1.0f;
    }

    /* renamed from: c */
    public static RectF m43465c(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF m26648h = AbstractC21141mW1.m26648h(view2);
            m26648h.offset(f, f2);
            return m26648h;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    /* renamed from: d */
    public static ShapeAppearanceModel m43464d(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return AbstractC21141mW1.m26653c(m43461g(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: e */
    public static void m43463e(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        RectF m26648h;
        if (i != -1) {
            transitionValues.view = AbstractC21141mW1.m26649g(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view2 = transitionValues.view;
        if (ViewCompat.isLaidOut(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            if (view2.getParent() == null) {
                m26648h = AbstractC21141mW1.m26647i(view2);
            } else {
                m26648h = AbstractC21141mW1.m26648h(view2);
            }
            transitionValues.values.put("materialContainerTransition:bounds", m26648h);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m43464d(view2, m26648h, shapeAppearanceModel));
        }
    }

    /* renamed from: f */
    public static float m43462f(float f, View view) {
        if (f == -1.0f) {
            return ViewCompat.getElevation(view);
        }
        return f;
    }

    /* renamed from: g */
    public static ShapeAppearanceModel m43461g(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int m43459i = m43459i(context);
        if (m43459i != -1) {
            return ShapeAppearanceModel.builder(context, m43459i, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    /* renamed from: i */
    public static int m43459i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: b */
    public final C7166c m43466b(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof MaterialArcMotion)) {
            return m43460h(z, f51462B, f51463C);
        }
        return m43460h(z, f51464D, f51465E);
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m43463e(transitionValues, this.f51482p, this.f51473g, this.f51484r);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m43463e(transitionValues, this.f51481o, this.f51472f, this.f51483q);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View view;
        View m26650f;
        View view2;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && shapeAppearanceModel2 != null) {
                    View view3 = transitionValues.view;
                    View view4 = transitionValues2.view;
                    if (view4.getParent() != null) {
                        view = view4;
                    } else {
                        view = view3;
                    }
                    if (this.f51471e == view.getId()) {
                        m26650f = (View) view.getParent();
                        view2 = view;
                    } else {
                        m26650f = AbstractC21141mW1.m26650f(view, this.f51471e);
                        view2 = null;
                    }
                    RectF m26648h = AbstractC21141mW1.m26648h(m26650f);
                    float f = -m26648h.left;
                    float f2 = -m26648h.top;
                    RectF m43465c = m43465c(m26650f, view2, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean m43458j = m43458j(rectF, rectF2);
                    if (!this.f51470d) {
                        m43457k(view.getContext(), m43458j);
                    }
                    C7167d c7167d = new C7167d(getPathMotion(), view3, rectF, shapeAppearanceModel, m43462f(this.f51490x, view3), view4, rectF2, shapeAppearanceModel2, m43462f(this.f51491y, view4), this.f51474h, this.f51475i, this.f51476j, this.f51477k, m43458j, this.f51489w, AbstractC1601WV.m65751a(this.f51479m, m43458j), F20.m68549a(this.f51480n, m43458j, rectF, rectF2), m43466b(m43458j), this.f51467a, null);
                    c7167d.setBounds(Math.round(m43465c.left), Math.round(m43465c.top), Math.round(m43465c.right), Math.round(m43465c.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new C7164a(c7167d));
                    addListener(new C7165b(m26650f, c7167d, view3, view4));
                    return ofFloat;
                }
                Log.w(f51466z, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f51466z, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f51474h;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f51471e;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f51476j;
    }

    public float getEndElevation() {
        return this.f51491y;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f51484r;
    }

    @Nullable
    public View getEndView() {
        return this.f51482p;
    }

    @IdRes
    public int getEndViewId() {
        return this.f51473g;
    }

    public int getFadeMode() {
        return this.f51479m;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f51485s;
    }

    public int getFitMode() {
        return this.f51480n;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f51487u;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f51486t;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f51477k;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f51488v;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f51475i;
    }

    public float getStartElevation() {
        return this.f51490x;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f51483q;
    }

    @Nullable
    public View getStartView() {
        return this.f51481o;
    }

    @IdRes
    public int getStartViewId() {
        return this.f51472f;
    }

    public int getTransitionDirection() {
        return this.f51478l;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f51461A;
    }

    /* renamed from: h */
    public final C7166c m43460h(boolean z, C7166c c7166c, C7166c c7166c2) {
        if (!z) {
            c7166c = c7166c2;
        }
        return new C7166c((ProgressThresholds) AbstractC21141mW1.m26651e(this.f51485s, c7166c.f51501a), (ProgressThresholds) AbstractC21141mW1.m26651e(this.f51486t, c7166c.f51502b), (ProgressThresholds) AbstractC21141mW1.m26651e(this.f51487u, c7166c.f51503c), (ProgressThresholds) AbstractC21141mW1.m26651e(this.f51488v, c7166c.f51504d), null);
    }

    public boolean isDrawDebugEnabled() {
        return this.f51467a;
    }

    public boolean isElevationShadowEnabled() {
        return this.f51489w;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f51468b;
    }

    /* renamed from: j */
    public final boolean m43458j(RectF rectF, RectF rectF2) {
        int i = this.f51478l;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f51478l);
        } else if (AbstractC21141mW1.m26654b(rectF2) <= AbstractC21141mW1.m26654b(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: k */
    public final void m43457k(Context context, boolean z) {
        int i;
        AbstractC21141mW1.m26637s(this, context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        if (z) {
            i = R.attr.motionDurationLong2;
        } else {
            i = R.attr.motionDurationMedium4;
        }
        AbstractC21141mW1.m26638r(this, context, i);
        if (!this.f51469c) {
            AbstractC21141mW1.m26636t(this, context, R.attr.motionPath);
        }
    }

    public void setAllContainerColors(@ColorInt int i) {
        this.f51474h = i;
        this.f51475i = i;
        this.f51476j = i;
    }

    public void setContainerColor(@ColorInt int i) {
        this.f51474h = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f51467a = z;
    }

    public void setDrawingViewId(@IdRes int i) {
        this.f51471e = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f51489w = z;
    }

    public void setEndContainerColor(@ColorInt int i) {
        this.f51476j = i;
    }

    public void setEndElevation(float f) {
        this.f51491y = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51484r = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f51482p = view;
    }

    public void setEndViewId(@IdRes int i) {
        this.f51473g = i;
    }

    public void setFadeMode(int i) {
        this.f51479m = i;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51485s = progressThresholds;
    }

    public void setFitMode(int i) {
        this.f51480n = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f51468b = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f51469c = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51487u = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51486t = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i) {
        this.f51477k = i;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51488v = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i) {
        this.f51475i = i;
    }

    public void setStartElevation(float f) {
        this.f51490x = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51483q = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f51481o = view;
    }

    public void setStartViewId(@IdRes int i) {
        this.f51472f = i;
    }

    public void setTransitionDirection(int i) {
        this.f51478l = i;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z) {
        this.f51467a = false;
        this.f51468b = false;
        this.f51469c = false;
        this.f51470d = false;
        this.f51471e = 16908290;
        this.f51472f = -1;
        this.f51473g = -1;
        this.f51474h = 0;
        this.f51475i = 0;
        this.f51476j = 0;
        this.f51477k = 1375731712;
        this.f51478l = 0;
        this.f51479m = 0;
        this.f51480n = 0;
        this.f51489w = Build.VERSION.SDK_INT >= 28;
        this.f51490x = -1.0f;
        this.f51491y = -1.0f;
        m43457k(context, z);
        this.f51470d = true;
    }
}