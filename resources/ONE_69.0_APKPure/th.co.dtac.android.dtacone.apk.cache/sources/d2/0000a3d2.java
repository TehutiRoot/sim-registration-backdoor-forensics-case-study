package com.google.android.material.transition;

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
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public final class MaterialContainerTransform extends Transition {
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

    /* renamed from: m0 */
    public static final String f51327m0 = "MaterialContainerTransform";

    /* renamed from: n0 */
    public static final String[] f51328n0 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: o0 */
    public static final C7152c f51329o0 = new C7152c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);

    /* renamed from: p0 */
    public static final C7152c f51330p0 = new C7152c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), null);

    /* renamed from: q0 */
    public static final C7152c f51331q0 = new C7152c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    /* renamed from: r0 */
    public static final C7152c f51332r0 = new C7152c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), null);

    /* renamed from: K */
    public boolean f51333K;

    /* renamed from: L */
    public boolean f51334L;

    /* renamed from: M */
    public boolean f51335M;

    /* renamed from: N */
    public boolean f51336N;

    /* renamed from: O */
    public int f51337O;

    /* renamed from: P */
    public int f51338P;

    /* renamed from: Q */
    public int f51339Q;

    /* renamed from: R */
    public int f51340R;

    /* renamed from: S */
    public int f51341S;

    /* renamed from: T */
    public int f51342T;

    /* renamed from: U */
    public int f51343U;

    /* renamed from: V */
    public int f51344V;

    /* renamed from: W */
    public int f51345W;

    /* renamed from: a0 */
    public int f51346a0;

    /* renamed from: b0 */
    public View f51347b0;

    /* renamed from: c0 */
    public View f51348c0;

    /* renamed from: d0 */
    public ShapeAppearanceModel f51349d0;

    /* renamed from: e0 */
    public ShapeAppearanceModel f51350e0;

    /* renamed from: f0 */
    public ProgressThresholds f51351f0;

    /* renamed from: g0 */
    public ProgressThresholds f51352g0;

    /* renamed from: h0 */
    public ProgressThresholds f51353h0;

    /* renamed from: i0 */
    public ProgressThresholds f51354i0;

    /* renamed from: j0 */
    public boolean f51355j0;

    /* renamed from: k0 */
    public float f51356k0;

    /* renamed from: l0 */
    public float f51357l0;

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
        public final float f51358a;

        /* renamed from: b */
        public final float f51359b;

        public ProgressThresholds(@FloatRange(from = 0.0d, m64694to = 1.0d) float f, @FloatRange(from = 0.0d, m64694to = 1.0d) float f2) {
            this.f51358a = f;
            this.f51359b = f2;
        }

        @FloatRange(from = 0.0d, m64694to = 1.0d)
        public float getEnd() {
            return this.f51359b;
        }

        @FloatRange(from = 0.0d, m64694to = 1.0d)
        public float getStart() {
            return this.f51358a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TransitionDirection {
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$a */
    /* loaded from: classes4.dex */
    public class C7150a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C7153d f51360a;

        public C7150a(C7153d c7153d) {
            this.f51360a = c7153d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51360a.m43491o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$b */
    /* loaded from: classes4.dex */
    public class C7151b extends AbstractC20276hW1 {

        /* renamed from: a */
        public final /* synthetic */ View f51362a;

        /* renamed from: b */
        public final /* synthetic */ C7153d f51363b;

        /* renamed from: c */
        public final /* synthetic */ View f51364c;

        /* renamed from: d */
        public final /* synthetic */ View f51365d;

        public C7151b(View view, C7153d c7153d, View view2, View view3) {
            this.f51362a = view;
            this.f51363b = c7153d;
            this.f51364c = view2;
            this.f51365d = view3;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransform.this.removeListener(this);
            if (MaterialContainerTransform.this.f51334L) {
                return;
            }
            this.f51364c.setAlpha(1.0f);
            this.f51365d.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f51362a).remove(this.f51363b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ViewUtils.getOverlay(this.f51362a).add(this.f51363b);
            this.f51364c.setAlpha(0.0f);
            this.f51365d.setAlpha(0.0f);
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$c */
    /* loaded from: classes4.dex */
    public static class C7152c {

        /* renamed from: a */
        public final ProgressThresholds f51367a;

        /* renamed from: b */
        public final ProgressThresholds f51368b;

        /* renamed from: c */
        public final ProgressThresholds f51369c;

        /* renamed from: d */
        public final ProgressThresholds f51370d;

        public /* synthetic */ C7152c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C7150a c7150a) {
            this(progressThresholds, progressThresholds2, progressThresholds3, progressThresholds4);
        }

        public C7152c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f51367a = progressThresholds;
            this.f51368b = progressThresholds2;
            this.f51369c = progressThresholds3;
            this.f51370d = progressThresholds4;
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$d */
    /* loaded from: classes4.dex */
    public static final class C7153d extends Drawable {

        /* renamed from: A */
        public final C7152c f51371A;

        /* renamed from: B */
        public final InterfaceC1448UV f51372B;

        /* renamed from: C */
        public final D20 f51373C;

        /* renamed from: D */
        public final boolean f51374D;

        /* renamed from: E */
        public final Paint f51375E;

        /* renamed from: F */
        public final Path f51376F;

        /* renamed from: G */
        public C1740YV f51377G;

        /* renamed from: H */
        public H20 f51378H;

        /* renamed from: I */
        public RectF f51379I;

        /* renamed from: J */
        public float f51380J;

        /* renamed from: K */
        public float f51381K;

        /* renamed from: L */
        public float f51382L;

        /* renamed from: a */
        public final View f51383a;

        /* renamed from: b */
        public final RectF f51384b;

        /* renamed from: c */
        public final ShapeAppearanceModel f51385c;

        /* renamed from: d */
        public final float f51386d;

        /* renamed from: e */
        public final View f51387e;

        /* renamed from: f */
        public final RectF f51388f;

        /* renamed from: g */
        public final ShapeAppearanceModel f51389g;

        /* renamed from: h */
        public final float f51390h;

        /* renamed from: i */
        public final Paint f51391i;

        /* renamed from: j */
        public final Paint f51392j;

        /* renamed from: k */
        public final Paint f51393k;

        /* renamed from: l */
        public final Paint f51394l;

        /* renamed from: m */
        public final Paint f51395m;

        /* renamed from: n */
        public final C7159a f51396n;

        /* renamed from: o */
        public final PathMeasure f51397o;

        /* renamed from: p */
        public final float f51398p;

        /* renamed from: q */
        public final float[] f51399q;

        /* renamed from: r */
        public final boolean f51400r;

        /* renamed from: s */
        public final float f51401s;

        /* renamed from: t */
        public final float f51402t;

        /* renamed from: u */
        public final boolean f51403u;

        /* renamed from: v */
        public final MaterialShapeDrawable f51404v;

        /* renamed from: w */
        public final RectF f51405w;

        /* renamed from: x */
        public final RectF f51406x;

        /* renamed from: y */
        public final RectF f51407y;

        /* renamed from: z */
        public final RectF f51408z;

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$d$a */
        /* loaded from: classes4.dex */
        public class C7154a implements CanvasCompat.CanvasOperation {
            public C7154a() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7153d.this.f51383a.draw(canvas);
            }
        }

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$d$b */
        /* loaded from: classes4.dex */
        public class C7155b implements CanvasCompat.CanvasOperation {
            public C7155b() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7153d.this.f51387e.draw(canvas);
            }
        }

        public /* synthetic */ C7153d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1448UV interfaceC1448UV, D20 d20, C7152c c7152c, boolean z3, C7150a c7150a) {
            this(pathMotion, view, rectF, shapeAppearanceModel, f, view2, rectF2, shapeAppearanceModel2, f2, i, i2, i3, i4, z, z2, interfaceC1448UV, d20, c7152c, z3);
        }

        /* renamed from: d */
        public static float m43502d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m43501e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m43493m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i;
            if (this.f51395m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f51395m);
            }
            if (this.f51374D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f51403u && this.f51380J > 0.0f) {
                m43498h(canvas);
            }
            this.f51396n.m43474a(canvas);
            m43492n(canvas, this.f51391i);
            if (this.f51377G.f7878c) {
                m43494l(canvas);
                m43495k(canvas);
            } else {
                m43495k(canvas);
                m43494l(canvas);
            }
            if (this.f51374D) {
                canvas.restoreToCount(i);
                m43500f(canvas, this.f51405w, this.f51376F, -65281);
                m43499g(canvas, this.f51406x, -256);
                m43499g(canvas, this.f51405w, -16711936);
                m43499g(canvas, this.f51408z, -16711681);
                m43499g(canvas, this.f51407y, -16776961);
            }
        }

        /* renamed from: f */
        public final void m43500f(Canvas canvas, RectF rectF, Path path, int i) {
            PointF m43493m = m43493m(rectF);
            if (this.f51382L == 0.0f) {
                path.reset();
                path.moveTo(m43493m.x, m43493m.y);
                return;
            }
            path.lineTo(m43493m.x, m43493m.y);
            this.f51375E.setColor(i);
            canvas.drawPath(path, this.f51375E);
        }

        /* renamed from: g */
        public final void m43499g(Canvas canvas, RectF rectF, int i) {
            this.f51375E.setColor(i);
            canvas.drawRect(rectF, this.f51375E);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void m43498h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f51396n.m43471d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m43496j(canvas);
            } else {
                m43497i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void m43497i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f51404v;
            RectF rectF = this.f51379I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f51404v.setElevation(this.f51380J);
            this.f51404v.setShadowVerticalOffset((int) this.f51381K);
            this.f51404v.setShapeAppearanceModel(this.f51396n.m43472c());
            this.f51404v.draw(canvas);
        }

        /* renamed from: j */
        public final void m43496j(Canvas canvas) {
            ShapeAppearanceModel m43472c = this.f51396n.m43472c();
            if (m43472c.isRoundRect(this.f51379I)) {
                float cornerSize = m43472c.getTopLeftCornerSize().getCornerSize(this.f51379I);
                canvas.drawRoundRect(this.f51379I, cornerSize, cornerSize, this.f51394l);
                return;
            }
            canvas.drawPath(this.f51396n.m43471d(), this.f51394l);
        }

        /* renamed from: k */
        public final void m43495k(Canvas canvas) {
            m43492n(canvas, this.f51393k);
            Rect bounds = getBounds();
            RectF rectF = this.f51407y;
            AbstractC21314nW1.m26385v(canvas, bounds, rectF.left, rectF.top, this.f51378H.f2266b, this.f51377G.f7877b, new C7155b());
        }

        /* renamed from: l */
        public final void m43494l(Canvas canvas) {
            m43492n(canvas, this.f51392j);
            Rect bounds = getBounds();
            RectF rectF = this.f51405w;
            AbstractC21314nW1.m26385v(canvas, bounds, rectF.left, rectF.top, this.f51378H.f2265a, this.f51377G.f7876a, new C7154a());
        }

        /* renamed from: n */
        public final void m43492n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void m43491o(float f) {
            if (this.f51382L != f) {
                m43490p(f);
            }
        }

        /* renamed from: p */
        public final void m43490p(float f) {
            float f2;
            float f3;
            this.f51382L = f;
            this.f51395m.setAlpha((int) (this.f51400r ? AbstractC21314nW1.m26395l(0.0f, 255.0f, f) : AbstractC21314nW1.m26395l(255.0f, 0.0f, f)));
            this.f51397o.getPosTan(this.f51398p * f, this.f51399q, null);
            float[] fArr = this.f51399q;
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
                this.f51397o.getPosTan(this.f51398p * f2, fArr, null);
                float[] fArr2 = this.f51399q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            H20 mo68707a = this.f51373C.mo68707a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51371A.f51368b.f51358a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51371A.f51368b.f51359b))).floatValue(), this.f51384b.width(), this.f51384b.height(), this.f51388f.width(), this.f51388f.height());
            this.f51378H = mo68707a;
            RectF rectF = this.f51405w;
            float f8 = mo68707a.f2267c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, mo68707a.f2268d + f7);
            RectF rectF2 = this.f51407y;
            H20 h20 = this.f51378H;
            float f9 = h20.f2269e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), h20.f2270f + f7);
            this.f51406x.set(this.f51405w);
            this.f51408z.set(this.f51407y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51371A.f51369c.f51358a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51371A.f51369c.f51359b))).floatValue();
            boolean mo68706b = this.f51373C.mo68706b(this.f51378H);
            RectF rectF3 = mo68706b ? this.f51406x : this.f51408z;
            float m26394m = AbstractC21314nW1.m26394m(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!mo68706b) {
                m26394m = 1.0f - m26394m;
            }
            this.f51373C.mo68705c(rectF3, m26394m, this.f51378H);
            this.f51379I = new RectF(Math.min(this.f51406x.left, this.f51408z.left), Math.min(this.f51406x.top, this.f51408z.top), Math.max(this.f51406x.right, this.f51408z.right), Math.max(this.f51406x.bottom, this.f51408z.bottom));
            this.f51396n.m43473b(f, this.f51385c, this.f51389g, this.f51405w, this.f51406x, this.f51408z, this.f51371A.f51370d);
            this.f51380J = AbstractC21314nW1.m26395l(this.f51386d, this.f51390h, f);
            float m43502d = m43502d(this.f51379I, this.f51401s);
            float m43501e = m43501e(this.f51379I, this.f51402t);
            float f10 = this.f51380J;
            float f11 = (int) (m43501e * f10);
            this.f51381K = f11;
            this.f51394l.setShadowLayer(f10, (int) (m43502d * f10), f11, 754974720);
            this.f51377G = this.f51372B.mo65977a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51371A.f51367a.f51358a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51371A.f51367a.f51359b))).floatValue(), 0.35f);
            if (this.f51392j.getColor() != 0) {
                this.f51392j.setAlpha(this.f51377G.f7876a);
            }
            if (this.f51393k.getColor() != 0) {
                this.f51393k.setAlpha(this.f51377G.f7877b);
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

        public C7153d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1448UV interfaceC1448UV, D20 d20, C7152c c7152c, boolean z3) {
            Paint paint = new Paint();
            this.f51391i = paint;
            Paint paint2 = new Paint();
            this.f51392j = paint2;
            Paint paint3 = new Paint();
            this.f51393k = paint3;
            this.f51394l = new Paint();
            Paint paint4 = new Paint();
            this.f51395m = paint4;
            this.f51396n = new C7159a();
            this.f51399q = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f51404v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f51375E = paint5;
            this.f51376F = new Path();
            this.f51383a = view;
            this.f51384b = rectF;
            this.f51385c = shapeAppearanceModel;
            this.f51386d = f;
            this.f51387e = view2;
            this.f51388f = rectF2;
            this.f51389g = shapeAppearanceModel2;
            this.f51390h = f2;
            this.f51400r = z;
            this.f51403u = z2;
            this.f51372B = interfaceC1448UV;
            this.f51373C = d20;
            this.f51371A = c7152c;
            this.f51374D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f51401s = displayMetrics.widthPixels;
            this.f51402t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f51405w = rectF3;
            this.f51406x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f51407y = rectF4;
            this.f51408z = new RectF(rectF4);
            PointF m43493m = m43493m(rectF);
            PointF m43493m2 = m43493m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m43493m.x, m43493m.y, m43493m2.x, m43493m2.y), false);
            this.f51397o = pathMeasure;
            this.f51398p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(AbstractC21314nW1.m26403d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m43490p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f51333K = false;
        this.f51334L = false;
        this.f51335M = false;
        this.f51336N = false;
        this.f51337O = 16908290;
        this.f51338P = -1;
        this.f51339Q = -1;
        this.f51340R = 0;
        this.f51341S = 0;
        this.f51342T = 0;
        this.f51343U = 1375731712;
        this.f51344V = 0;
        this.f51345W = 0;
        this.f51346a0 = 0;
        this.f51355j0 = Build.VERSION.SDK_INT >= 28;
        this.f51356k0 = -1.0f;
        this.f51357l0 = -1.0f;
    }

    /* renamed from: E */
    public static RectF m43520E(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF m26399h = AbstractC21314nW1.m26399h(view2);
            m26399h.offset(f, f2);
            return m26399h;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    /* renamed from: F */
    public static ShapeAppearanceModel m43519F(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return AbstractC21314nW1.m26404c(m43516I(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: G */
    public static void m43518G(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        RectF m26399h;
        if (i != -1) {
            transitionValues.view = AbstractC21314nW1.m26400g(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view2 = transitionValues.view;
        if (ViewCompat.isLaidOut(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            if (view2.getParent() == null) {
                m26399h = AbstractC21314nW1.m26398i(view2);
            } else {
                m26399h = AbstractC21314nW1.m26399h(view2);
            }
            transitionValues.values.put("materialContainerTransition:bounds", m26399h);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m43519F(view2, m26399h, shapeAppearanceModel));
        }
    }

    /* renamed from: H */
    public static float m43517H(float f, View view) {
        if (f == -1.0f) {
            return ViewCompat.getElevation(view);
        }
        return f;
    }

    /* renamed from: I */
    public static ShapeAppearanceModel m43516I(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int m43514K = m43514K(context);
        if (m43514K != -1) {
            return ShapeAppearanceModel.builder(context, m43514K, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    /* renamed from: K */
    public static int m43514K(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: M */
    private void m43512M(Context context, boolean z) {
        int i;
        AbstractC21314nW1.m26389r(this, context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        if (z) {
            i = R.attr.motionDurationLong2;
        } else {
            i = R.attr.motionDurationMedium4;
        }
        AbstractC21314nW1.m26390q(this, context, i);
        if (!this.f51335M) {
            AbstractC21314nW1.m26388s(this, context, R.attr.motionPath);
        }
    }

    /* renamed from: D */
    public final C7152c m43521D(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof MaterialArcMotion)) {
            return m43515J(z, f51329o0, f51330p0);
        }
        return m43515J(z, f51331q0, f51332r0);
    }

    /* renamed from: J */
    public final C7152c m43515J(boolean z, C7152c c7152c, C7152c c7152c2) {
        if (!z) {
            c7152c = c7152c2;
        }
        return new C7152c((ProgressThresholds) AbstractC21314nW1.m26402e(this.f51351f0, c7152c.f51367a), (ProgressThresholds) AbstractC21314nW1.m26402e(this.f51352g0, c7152c.f51368b), (ProgressThresholds) AbstractC21314nW1.m26402e(this.f51353h0, c7152c.f51369c), (ProgressThresholds) AbstractC21314nW1.m26402e(this.f51354i0, c7152c.f51370d), null);
    }

    /* renamed from: L */
    public final boolean m43513L(RectF rectF, RectF rectF2) {
        int i = this.f51344V;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f51344V);
        } else if (AbstractC21314nW1.m26405b(rectF2) <= AbstractC21314nW1.m26405b(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m43518G(transitionValues, this.f51348c0, this.f51339Q, this.f51350e0);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m43518G(transitionValues, this.f51347b0, this.f51338P, this.f51349d0);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View view;
        View m26401f;
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
                    if (this.f51337O == view.getId()) {
                        m26401f = (View) view.getParent();
                        view2 = view;
                    } else {
                        m26401f = AbstractC21314nW1.m26401f(view, this.f51337O);
                        view2 = null;
                    }
                    RectF m26399h = AbstractC21314nW1.m26399h(m26401f);
                    float f = -m26399h.left;
                    float f2 = -m26399h.top;
                    RectF m43520E = m43520E(m26401f, view2, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean m43513L = m43513L(rectF, rectF2);
                    if (!this.f51336N) {
                        m43512M(view.getContext(), m43513L);
                    }
                    C7153d c7153d = new C7153d(getPathMotion(), view3, rectF, shapeAppearanceModel, m43517H(this.f51356k0, view3), view4, rectF2, shapeAppearanceModel2, m43517H(this.f51357l0, view4), this.f51340R, this.f51341S, this.f51342T, this.f51343U, m43513L, this.f51355j0, AbstractC1522VV.m65978a(this.f51345W, m43513L), E20.m68709a(this.f51346a0, m43513L, rectF, rectF2), m43521D(m43513L), this.f51333K, null);
                    c7153d.setBounds(Math.round(m43520E.left), Math.round(m43520E.top), Math.round(m43520E.right), Math.round(m43520E.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new C7150a(c7153d));
                    addListener(new C7151b(m26401f, c7153d, view3, view4));
                    return ofFloat;
                }
                Log.w(f51327m0, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f51327m0, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f51340R;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f51337O;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f51342T;
    }

    public float getEndElevation() {
        return this.f51357l0;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f51350e0;
    }

    @Nullable
    public View getEndView() {
        return this.f51348c0;
    }

    @IdRes
    public int getEndViewId() {
        return this.f51339Q;
    }

    public int getFadeMode() {
        return this.f51345W;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f51351f0;
    }

    public int getFitMode() {
        return this.f51346a0;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f51353h0;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f51352g0;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f51343U;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f51354i0;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f51341S;
    }

    public float getStartElevation() {
        return this.f51356k0;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f51349d0;
    }

    @Nullable
    public View getStartView() {
        return this.f51347b0;
    }

    @IdRes
    public int getStartViewId() {
        return this.f51338P;
    }

    public int getTransitionDirection() {
        return this.f51344V;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f51328n0;
    }

    public boolean isDrawDebugEnabled() {
        return this.f51333K;
    }

    public boolean isElevationShadowEnabled() {
        return this.f51355j0;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f51334L;
    }

    public void setAllContainerColors(@ColorInt int i) {
        this.f51340R = i;
        this.f51341S = i;
        this.f51342T = i;
    }

    public void setContainerColor(@ColorInt int i) {
        this.f51340R = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f51333K = z;
    }

    public void setDrawingViewId(@IdRes int i) {
        this.f51337O = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f51355j0 = z;
    }

    public void setEndContainerColor(@ColorInt int i) {
        this.f51342T = i;
    }

    public void setEndElevation(float f) {
        this.f51357l0 = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51350e0 = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f51348c0 = view;
    }

    public void setEndViewId(@IdRes int i) {
        this.f51339Q = i;
    }

    public void setFadeMode(int i) {
        this.f51345W = i;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51351f0 = progressThresholds;
    }

    public void setFitMode(int i) {
        this.f51346a0 = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f51334L = z;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f51335M = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51353h0 = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51352g0 = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i) {
        this.f51343U = i;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51354i0 = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i) {
        this.f51341S = i;
    }

    public void setStartElevation(float f) {
        this.f51356k0 = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51349d0 = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f51347b0 = view;
    }

    public void setStartViewId(@IdRes int i) {
        this.f51338P = i;
    }

    public void setTransitionDirection(int i) {
        this.f51344V = i;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z) {
        this.f51333K = false;
        this.f51334L = false;
        this.f51335M = false;
        this.f51336N = false;
        this.f51337O = 16908290;
        this.f51338P = -1;
        this.f51339Q = -1;
        this.f51340R = 0;
        this.f51341S = 0;
        this.f51342T = 0;
        this.f51343U = 1375731712;
        this.f51344V = 0;
        this.f51345W = 0;
        this.f51346a0 = 0;
        this.f51355j0 = Build.VERSION.SDK_INT >= 28;
        this.f51356k0 = -1.0f;
        this.f51357l0 = -1.0f;
        m43512M(context, z);
        this.f51336N = true;
    }
}