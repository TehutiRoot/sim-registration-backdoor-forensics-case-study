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
    public static final String f51315m0 = "MaterialContainerTransform";

    /* renamed from: n0 */
    public static final String[] f51316n0 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: o0 */
    public static final C7163c f51317o0 = new C7163c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);

    /* renamed from: p0 */
    public static final C7163c f51318p0 = new C7163c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), null);

    /* renamed from: q0 */
    public static final C7163c f51319q0 = new C7163c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    /* renamed from: r0 */
    public static final C7163c f51320r0 = new C7163c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), null);

    /* renamed from: K */
    public boolean f51321K;

    /* renamed from: L */
    public boolean f51322L;

    /* renamed from: M */
    public boolean f51323M;

    /* renamed from: N */
    public boolean f51324N;

    /* renamed from: O */
    public int f51325O;

    /* renamed from: P */
    public int f51326P;

    /* renamed from: Q */
    public int f51327Q;

    /* renamed from: R */
    public int f51328R;

    /* renamed from: S */
    public int f51329S;

    /* renamed from: T */
    public int f51330T;

    /* renamed from: U */
    public int f51331U;

    /* renamed from: V */
    public int f51332V;

    /* renamed from: W */
    public int f51333W;

    /* renamed from: a0 */
    public int f51334a0;

    /* renamed from: b0 */
    public View f51335b0;

    /* renamed from: c0 */
    public View f51336c0;

    /* renamed from: d0 */
    public ShapeAppearanceModel f51337d0;

    /* renamed from: e0 */
    public ShapeAppearanceModel f51338e0;

    /* renamed from: f0 */
    public ProgressThresholds f51339f0;

    /* renamed from: g0 */
    public ProgressThresholds f51340g0;

    /* renamed from: h0 */
    public ProgressThresholds f51341h0;

    /* renamed from: i0 */
    public ProgressThresholds f51342i0;

    /* renamed from: j0 */
    public boolean f51343j0;

    /* renamed from: k0 */
    public float f51344k0;

    /* renamed from: l0 */
    public float f51345l0;

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
        public final float f51346a;

        /* renamed from: b */
        public final float f51347b;

        public ProgressThresholds(@FloatRange(from = 0.0d, m64743to = 1.0d) float f, @FloatRange(from = 0.0d, m64743to = 1.0d) float f2) {
            this.f51346a = f;
            this.f51347b = f2;
        }

        @FloatRange(from = 0.0d, m64743to = 1.0d)
        public float getEnd() {
            return this.f51347b;
        }

        @FloatRange(from = 0.0d, m64743to = 1.0d)
        public float getStart() {
            return this.f51346a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TransitionDirection {
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$a */
    /* loaded from: classes4.dex */
    public class C7161a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C7164d f51348a;

        public C7161a(C7164d c7164d) {
            this.f51348a = c7164d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51348a.m43504o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$b */
    /* loaded from: classes4.dex */
    public class C7162b extends AbstractC20736kV1 {

        /* renamed from: a */
        public final /* synthetic */ View f51350a;

        /* renamed from: b */
        public final /* synthetic */ C7164d f51351b;

        /* renamed from: c */
        public final /* synthetic */ View f51352c;

        /* renamed from: d */
        public final /* synthetic */ View f51353d;

        public C7162b(View view, C7164d c7164d, View view2, View view3) {
            this.f51350a = view;
            this.f51351b = c7164d;
            this.f51352c = view2;
            this.f51353d = view3;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransform.this.removeListener(this);
            if (MaterialContainerTransform.this.f51322L) {
                return;
            }
            this.f51352c.setAlpha(1.0f);
            this.f51353d.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f51350a).remove(this.f51351b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ViewUtils.getOverlay(this.f51350a).add(this.f51351b);
            this.f51352c.setAlpha(0.0f);
            this.f51353d.setAlpha(0.0f);
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$c */
    /* loaded from: classes4.dex */
    public static class C7163c {

        /* renamed from: a */
        public final ProgressThresholds f51355a;

        /* renamed from: b */
        public final ProgressThresholds f51356b;

        /* renamed from: c */
        public final ProgressThresholds f51357c;

        /* renamed from: d */
        public final ProgressThresholds f51358d;

        public /* synthetic */ C7163c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C7161a c7161a) {
            this(progressThresholds, progressThresholds2, progressThresholds3, progressThresholds4);
        }

        public C7163c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f51355a = progressThresholds;
            this.f51356b = progressThresholds2;
            this.f51357c = progressThresholds3;
            this.f51358d = progressThresholds4;
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$d */
    /* loaded from: classes4.dex */
    public static final class C7164d extends Drawable {

        /* renamed from: A */
        public final C7163c f51359A;

        /* renamed from: B */
        public final InterfaceC1182QV f51360B;

        /* renamed from: C */
        public final InterfaceC23237z20 f51361C;

        /* renamed from: D */
        public final boolean f51362D;

        /* renamed from: E */
        public final Paint f51363E;

        /* renamed from: F */
        public final Path f51364F;

        /* renamed from: G */
        public C1468UV f51365G;

        /* renamed from: H */
        public D20 f51366H;

        /* renamed from: I */
        public RectF f51367I;

        /* renamed from: J */
        public float f51368J;

        /* renamed from: K */
        public float f51369K;

        /* renamed from: L */
        public float f51370L;

        /* renamed from: a */
        public final View f51371a;

        /* renamed from: b */
        public final RectF f51372b;

        /* renamed from: c */
        public final ShapeAppearanceModel f51373c;

        /* renamed from: d */
        public final float f51374d;

        /* renamed from: e */
        public final View f51375e;

        /* renamed from: f */
        public final RectF f51376f;

        /* renamed from: g */
        public final ShapeAppearanceModel f51377g;

        /* renamed from: h */
        public final float f51378h;

        /* renamed from: i */
        public final Paint f51379i;

        /* renamed from: j */
        public final Paint f51380j;

        /* renamed from: k */
        public final Paint f51381k;

        /* renamed from: l */
        public final Paint f51382l;

        /* renamed from: m */
        public final Paint f51383m;

        /* renamed from: n */
        public final C7170a f51384n;

        /* renamed from: o */
        public final PathMeasure f51385o;

        /* renamed from: p */
        public final float f51386p;

        /* renamed from: q */
        public final float[] f51387q;

        /* renamed from: r */
        public final boolean f51388r;

        /* renamed from: s */
        public final float f51389s;

        /* renamed from: t */
        public final float f51390t;

        /* renamed from: u */
        public final boolean f51391u;

        /* renamed from: v */
        public final MaterialShapeDrawable f51392v;

        /* renamed from: w */
        public final RectF f51393w;

        /* renamed from: x */
        public final RectF f51394x;

        /* renamed from: y */
        public final RectF f51395y;

        /* renamed from: z */
        public final RectF f51396z;

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$d$a */
        /* loaded from: classes4.dex */
        public class C7165a implements CanvasCompat.CanvasOperation {
            public C7165a() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7164d.this.f51371a.draw(canvas);
            }
        }

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$d$b */
        /* loaded from: classes4.dex */
        public class C7166b implements CanvasCompat.CanvasOperation {
            public C7166b() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7164d.this.f51375e.draw(canvas);
            }
        }

        public /* synthetic */ C7164d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1182QV interfaceC1182QV, InterfaceC23237z20 interfaceC23237z20, C7163c c7163c, boolean z3, C7161a c7161a) {
            this(pathMotion, view, rectF, shapeAppearanceModel, f, view2, rectF2, shapeAppearanceModel2, f2, i, i2, i3, i4, z, z2, interfaceC1182QV, interfaceC23237z20, c7163c, z3);
        }

        /* renamed from: d */
        public static float m43515d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m43514e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m43506m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i;
            if (this.f51383m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f51383m);
            }
            if (this.f51362D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f51391u && this.f51368J > 0.0f) {
                m43511h(canvas);
            }
            this.f51384n.m43487a(canvas);
            m43505n(canvas, this.f51379i);
            if (this.f51365G.f6353c) {
                m43507l(canvas);
                m43508k(canvas);
            } else {
                m43508k(canvas);
                m43507l(canvas);
            }
            if (this.f51362D) {
                canvas.restoreToCount(i);
                m43513f(canvas, this.f51393w, this.f51364F, -65281);
                m43512g(canvas, this.f51394x, -256);
                m43512g(canvas, this.f51393w, -16711936);
                m43512g(canvas, this.f51396z, -16711681);
                m43512g(canvas, this.f51395y, -16776961);
            }
        }

        /* renamed from: f */
        public final void m43513f(Canvas canvas, RectF rectF, Path path, int i) {
            PointF m43506m = m43506m(rectF);
            if (this.f51370L == 0.0f) {
                path.reset();
                path.moveTo(m43506m.x, m43506m.y);
                return;
            }
            path.lineTo(m43506m.x, m43506m.y);
            this.f51363E.setColor(i);
            canvas.drawPath(path, this.f51363E);
        }

        /* renamed from: g */
        public final void m43512g(Canvas canvas, RectF rectF, int i) {
            this.f51363E.setColor(i);
            canvas.drawRect(rectF, this.f51363E);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void m43511h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f51384n.m43484d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m43509j(canvas);
            } else {
                m43510i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void m43510i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f51392v;
            RectF rectF = this.f51367I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f51392v.setElevation(this.f51368J);
            this.f51392v.setShadowVerticalOffset((int) this.f51369K);
            this.f51392v.setShapeAppearanceModel(this.f51384n.m43485c());
            this.f51392v.draw(canvas);
        }

        /* renamed from: j */
        public final void m43509j(Canvas canvas) {
            ShapeAppearanceModel m43485c = this.f51384n.m43485c();
            if (m43485c.isRoundRect(this.f51367I)) {
                float cornerSize = m43485c.getTopLeftCornerSize().getCornerSize(this.f51367I);
                canvas.drawRoundRect(this.f51367I, cornerSize, cornerSize, this.f51382l);
                return;
            }
            canvas.drawPath(this.f51384n.m43484d(), this.f51382l);
        }

        /* renamed from: k */
        public final void m43508k(Canvas canvas) {
            m43505n(canvas, this.f51381k);
            Rect bounds = getBounds();
            RectF rectF = this.f51395y;
            AbstractC21768qV1.m23473v(canvas, bounds, rectF.left, rectF.top, this.f51366H.f892b, this.f51365G.f6352b, new C7166b());
        }

        /* renamed from: l */
        public final void m43507l(Canvas canvas) {
            m43505n(canvas, this.f51380j);
            Rect bounds = getBounds();
            RectF rectF = this.f51393w;
            AbstractC21768qV1.m23473v(canvas, bounds, rectF.left, rectF.top, this.f51366H.f891a, this.f51365G.f6351a, new C7165a());
        }

        /* renamed from: n */
        public final void m43505n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void m43504o(float f) {
            if (this.f51370L != f) {
                m43503p(f);
            }
        }

        /* renamed from: p */
        public final void m43503p(float f) {
            float f2;
            float f3;
            this.f51370L = f;
            this.f51383m.setAlpha((int) (this.f51388r ? AbstractC21768qV1.m23483l(0.0f, 255.0f, f) : AbstractC21768qV1.m23483l(255.0f, 0.0f, f)));
            this.f51385o.getPosTan(this.f51386p * f, this.f51387q, null);
            float[] fArr = this.f51387q;
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
                this.f51385o.getPosTan(this.f51386p * f2, fArr, null);
                float[] fArr2 = this.f51387q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            D20 mo151a = this.f51361C.mo151a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51359A.f51356b.f51346a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51359A.f51356b.f51347b))).floatValue(), this.f51372b.width(), this.f51372b.height(), this.f51376f.width(), this.f51376f.height());
            this.f51366H = mo151a;
            RectF rectF = this.f51393w;
            float f8 = mo151a.f893c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, mo151a.f894d + f7);
            RectF rectF2 = this.f51395y;
            D20 d20 = this.f51366H;
            float f9 = d20.f895e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), d20.f896f + f7);
            this.f51394x.set(this.f51393w);
            this.f51396z.set(this.f51395y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51359A.f51357c.f51346a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51359A.f51357c.f51347b))).floatValue();
            boolean mo150b = this.f51361C.mo150b(this.f51366H);
            RectF rectF3 = mo150b ? this.f51394x : this.f51396z;
            float m23482m = AbstractC21768qV1.m23482m(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!mo150b) {
                m23482m = 1.0f - m23482m;
            }
            this.f51361C.mo149c(rectF3, m23482m, this.f51366H);
            this.f51367I = new RectF(Math.min(this.f51394x.left, this.f51396z.left), Math.min(this.f51394x.top, this.f51396z.top), Math.max(this.f51394x.right, this.f51396z.right), Math.max(this.f51394x.bottom, this.f51396z.bottom));
            this.f51384n.m43486b(f, this.f51373c, this.f51377g, this.f51393w, this.f51394x, this.f51396z, this.f51359A.f51358d);
            this.f51368J = AbstractC21768qV1.m23483l(this.f51374d, this.f51378h, f);
            float m43515d = m43515d(this.f51367I, this.f51389s);
            float m43514e = m43514e(this.f51367I, this.f51390t);
            float f10 = this.f51368J;
            float f11 = (int) (m43514e * f10);
            this.f51369K = f11;
            this.f51382l.setShadowLayer(f10, (int) (m43515d * f10), f11, 754974720);
            this.f51365G = this.f51360B.mo66446a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51359A.f51355a.f51346a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51359A.f51355a.f51347b))).floatValue(), 0.35f);
            if (this.f51380j.getColor() != 0) {
                this.f51380j.setAlpha(this.f51365G.f6351a);
            }
            if (this.f51381k.getColor() != 0) {
                this.f51381k.setAlpha(this.f51365G.f6352b);
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

        public C7164d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1182QV interfaceC1182QV, InterfaceC23237z20 interfaceC23237z20, C7163c c7163c, boolean z3) {
            Paint paint = new Paint();
            this.f51379i = paint;
            Paint paint2 = new Paint();
            this.f51380j = paint2;
            Paint paint3 = new Paint();
            this.f51381k = paint3;
            this.f51382l = new Paint();
            Paint paint4 = new Paint();
            this.f51383m = paint4;
            this.f51384n = new C7170a();
            this.f51387q = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f51392v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f51363E = paint5;
            this.f51364F = new Path();
            this.f51371a = view;
            this.f51372b = rectF;
            this.f51373c = shapeAppearanceModel;
            this.f51374d = f;
            this.f51375e = view2;
            this.f51376f = rectF2;
            this.f51377g = shapeAppearanceModel2;
            this.f51378h = f2;
            this.f51388r = z;
            this.f51391u = z2;
            this.f51360B = interfaceC1182QV;
            this.f51361C = interfaceC23237z20;
            this.f51359A = c7163c;
            this.f51362D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f51389s = displayMetrics.widthPixels;
            this.f51390t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f51393w = rectF3;
            this.f51394x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f51395y = rectF4;
            this.f51396z = new RectF(rectF4);
            PointF m43506m = m43506m(rectF);
            PointF m43506m2 = m43506m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m43506m.x, m43506m.y, m43506m2.x, m43506m2.y), false);
            this.f51385o = pathMeasure;
            this.f51386p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(AbstractC21768qV1.m23491d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m43503p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f51321K = false;
        this.f51322L = false;
        this.f51323M = false;
        this.f51324N = false;
        this.f51325O = 16908290;
        this.f51326P = -1;
        this.f51327Q = -1;
        this.f51328R = 0;
        this.f51329S = 0;
        this.f51330T = 0;
        this.f51331U = 1375731712;
        this.f51332V = 0;
        this.f51333W = 0;
        this.f51334a0 = 0;
        this.f51343j0 = Build.VERSION.SDK_INT >= 28;
        this.f51344k0 = -1.0f;
        this.f51345l0 = -1.0f;
    }

    /* renamed from: E */
    public static RectF m43533E(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF m23487h = AbstractC21768qV1.m23487h(view2);
            m23487h.offset(f, f2);
            return m23487h;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    /* renamed from: F */
    public static ShapeAppearanceModel m43532F(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return AbstractC21768qV1.m23492c(m43529I(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: G */
    public static void m43531G(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        RectF m23487h;
        if (i != -1) {
            transitionValues.view = AbstractC21768qV1.m23488g(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view2 = transitionValues.view;
        if (ViewCompat.isLaidOut(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            if (view2.getParent() == null) {
                m23487h = AbstractC21768qV1.m23486i(view2);
            } else {
                m23487h = AbstractC21768qV1.m23487h(view2);
            }
            transitionValues.values.put("materialContainerTransition:bounds", m23487h);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m43532F(view2, m23487h, shapeAppearanceModel));
        }
    }

    /* renamed from: H */
    public static float m43530H(float f, View view) {
        if (f == -1.0f) {
            return ViewCompat.getElevation(view);
        }
        return f;
    }

    /* renamed from: I */
    public static ShapeAppearanceModel m43529I(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int m43527K = m43527K(context);
        if (m43527K != -1) {
            return ShapeAppearanceModel.builder(context, m43527K, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    /* renamed from: K */
    public static int m43527K(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: M */
    private void m43525M(Context context, boolean z) {
        int i;
        AbstractC21768qV1.m23477r(this, context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        if (z) {
            i = R.attr.motionDurationLong2;
        } else {
            i = R.attr.motionDurationMedium4;
        }
        AbstractC21768qV1.m23478q(this, context, i);
        if (!this.f51323M) {
            AbstractC21768qV1.m23476s(this, context, R.attr.motionPath);
        }
    }

    /* renamed from: D */
    public final C7163c m43534D(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof MaterialArcMotion)) {
            return m43528J(z, f51317o0, f51318p0);
        }
        return m43528J(z, f51319q0, f51320r0);
    }

    /* renamed from: J */
    public final C7163c m43528J(boolean z, C7163c c7163c, C7163c c7163c2) {
        if (!z) {
            c7163c = c7163c2;
        }
        return new C7163c((ProgressThresholds) AbstractC21768qV1.m23490e(this.f51339f0, c7163c.f51355a), (ProgressThresholds) AbstractC21768qV1.m23490e(this.f51340g0, c7163c.f51356b), (ProgressThresholds) AbstractC21768qV1.m23490e(this.f51341h0, c7163c.f51357c), (ProgressThresholds) AbstractC21768qV1.m23490e(this.f51342i0, c7163c.f51358d), null);
    }

    /* renamed from: L */
    public final boolean m43526L(RectF rectF, RectF rectF2) {
        int i = this.f51332V;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f51332V);
        } else if (AbstractC21768qV1.m23493b(rectF2) <= AbstractC21768qV1.m23493b(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m43531G(transitionValues, this.f51336c0, this.f51327Q, this.f51338e0);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m43531G(transitionValues, this.f51335b0, this.f51326P, this.f51337d0);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View view;
        View m23489f;
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
                    if (this.f51325O == view.getId()) {
                        m23489f = (View) view.getParent();
                        view2 = view;
                    } else {
                        m23489f = AbstractC21768qV1.m23489f(view, this.f51325O);
                        view2 = null;
                    }
                    RectF m23487h = AbstractC21768qV1.m23487h(m23489f);
                    float f = -m23487h.left;
                    float f2 = -m23487h.top;
                    RectF m43533E = m43533E(m23489f, view2, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean m43526L = m43526L(rectF, rectF2);
                    if (!this.f51324N) {
                        m43525M(view.getContext(), m43526L);
                    }
                    C7164d c7164d = new C7164d(getPathMotion(), view3, rectF, shapeAppearanceModel, m43530H(this.f51344k0, view3), view4, rectF2, shapeAppearanceModel2, m43530H(this.f51345l0, view4), this.f51328R, this.f51329S, this.f51330T, this.f51331U, m43526L, this.f51343j0, AbstractC1246RV.m66447a(this.f51333W, m43526L), A20.m69152a(this.f51334a0, m43526L, rectF, rectF2), m43534D(m43526L), this.f51321K, null);
                    c7164d.setBounds(Math.round(m43533E.left), Math.round(m43533E.top), Math.round(m43533E.right), Math.round(m43533E.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new C7161a(c7164d));
                    addListener(new C7162b(m23489f, c7164d, view3, view4));
                    return ofFloat;
                }
                Log.w(f51315m0, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f51315m0, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f51328R;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f51325O;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f51330T;
    }

    public float getEndElevation() {
        return this.f51345l0;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f51338e0;
    }

    @Nullable
    public View getEndView() {
        return this.f51336c0;
    }

    @IdRes
    public int getEndViewId() {
        return this.f51327Q;
    }

    public int getFadeMode() {
        return this.f51333W;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f51339f0;
    }

    public int getFitMode() {
        return this.f51334a0;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f51341h0;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f51340g0;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f51331U;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f51342i0;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f51329S;
    }

    public float getStartElevation() {
        return this.f51344k0;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f51337d0;
    }

    @Nullable
    public View getStartView() {
        return this.f51335b0;
    }

    @IdRes
    public int getStartViewId() {
        return this.f51326P;
    }

    public int getTransitionDirection() {
        return this.f51332V;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f51316n0;
    }

    public boolean isDrawDebugEnabled() {
        return this.f51321K;
    }

    public boolean isElevationShadowEnabled() {
        return this.f51343j0;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f51322L;
    }

    public void setAllContainerColors(@ColorInt int i) {
        this.f51328R = i;
        this.f51329S = i;
        this.f51330T = i;
    }

    public void setContainerColor(@ColorInt int i) {
        this.f51328R = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f51321K = z;
    }

    public void setDrawingViewId(@IdRes int i) {
        this.f51325O = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f51343j0 = z;
    }

    public void setEndContainerColor(@ColorInt int i) {
        this.f51330T = i;
    }

    public void setEndElevation(float f) {
        this.f51345l0 = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51338e0 = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f51336c0 = view;
    }

    public void setEndViewId(@IdRes int i) {
        this.f51327Q = i;
    }

    public void setFadeMode(int i) {
        this.f51333W = i;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51339f0 = progressThresholds;
    }

    public void setFitMode(int i) {
        this.f51334a0 = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f51322L = z;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f51323M = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51341h0 = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51340g0 = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i) {
        this.f51331U = i;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51342i0 = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i) {
        this.f51329S = i;
    }

    public void setStartElevation(float f) {
        this.f51344k0 = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51337d0 = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f51335b0 = view;
    }

    public void setStartViewId(@IdRes int i) {
        this.f51326P = i;
    }

    public void setTransitionDirection(int i) {
        this.f51332V = i;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z) {
        this.f51321K = false;
        this.f51322L = false;
        this.f51323M = false;
        this.f51324N = false;
        this.f51325O = 16908290;
        this.f51326P = -1;
        this.f51327Q = -1;
        this.f51328R = 0;
        this.f51329S = 0;
        this.f51330T = 0;
        this.f51331U = 1375731712;
        this.f51332V = 0;
        this.f51333W = 0;
        this.f51334a0 = 0;
        this.f51343j0 = Build.VERSION.SDK_INT >= 28;
        this.f51344k0 = -1.0f;
        this.f51345l0 = -1.0f;
        m43525M(context, z);
        this.f51324N = true;
    }
}
