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
    public static final String[] f51449A = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: B */
    public static final C7177c f51450B = new C7177c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);

    /* renamed from: C */
    public static final C7177c f51451C = new C7177c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), null);

    /* renamed from: D */
    public static final C7177c f51452D = new C7177c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    /* renamed from: E */
    public static final C7177c f51453E = new C7177c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), null);
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
    public static final String f51454z = "MaterialContainerTransform";

    /* renamed from: a */
    public boolean f51455a;

    /* renamed from: b */
    public boolean f51456b;

    /* renamed from: c */
    public boolean f51457c;

    /* renamed from: d */
    public boolean f51458d;

    /* renamed from: e */
    public int f51459e;

    /* renamed from: f */
    public int f51460f;

    /* renamed from: g */
    public int f51461g;

    /* renamed from: h */
    public int f51462h;

    /* renamed from: i */
    public int f51463i;

    /* renamed from: j */
    public int f51464j;

    /* renamed from: k */
    public int f51465k;

    /* renamed from: l */
    public int f51466l;

    /* renamed from: m */
    public int f51467m;

    /* renamed from: n */
    public int f51468n;

    /* renamed from: o */
    public View f51469o;

    /* renamed from: p */
    public View f51470p;

    /* renamed from: q */
    public ShapeAppearanceModel f51471q;

    /* renamed from: r */
    public ShapeAppearanceModel f51472r;

    /* renamed from: s */
    public ProgressThresholds f51473s;

    /* renamed from: t */
    public ProgressThresholds f51474t;

    /* renamed from: u */
    public ProgressThresholds f51475u;

    /* renamed from: v */
    public ProgressThresholds f51476v;

    /* renamed from: w */
    public boolean f51477w;

    /* renamed from: x */
    public float f51478x;

    /* renamed from: y */
    public float f51479y;

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
        public final float f51480a;

        /* renamed from: b */
        public final float f51481b;

        public ProgressThresholds(@FloatRange(from = 0.0d, m64743to = 1.0d) float f, @FloatRange(from = 0.0d, m64743to = 1.0d) float f2) {
            this.f51480a = f;
            this.f51481b = f2;
        }

        @FloatRange(from = 0.0d, m64743to = 1.0d)
        public float getEnd() {
            return this.f51481b;
        }

        @FloatRange(from = 0.0d, m64743to = 1.0d)
        public float getStart() {
            return this.f51480a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TransitionDirection {
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$a */
    /* loaded from: classes4.dex */
    public class C7175a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C7178d f51482a;

        public C7175a(C7178d c7178d) {
            this.f51482a = c7178d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51482a.m43449o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$b */
    /* loaded from: classes4.dex */
    public class C7176b extends AbstractC20564jV1 {

        /* renamed from: a */
        public final /* synthetic */ View f51484a;

        /* renamed from: b */
        public final /* synthetic */ C7178d f51485b;

        /* renamed from: c */
        public final /* synthetic */ View f51486c;

        /* renamed from: d */
        public final /* synthetic */ View f51487d;

        public C7176b(View view, C7178d c7178d, View view2, View view3) {
            this.f51484a = view;
            this.f51485b = c7178d;
            this.f51486c = view2;
            this.f51487d = view3;
        }

        @Override // p000.AbstractC20564jV1, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransform.this.removeListener(this);
            if (MaterialContainerTransform.this.f51456b) {
                return;
            }
            this.f51486c.setAlpha(1.0f);
            this.f51487d.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f51484a).remove(this.f51485b);
        }

        @Override // p000.AbstractC20564jV1, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ViewUtils.getOverlay(this.f51484a).add(this.f51485b);
            this.f51486c.setAlpha(0.0f);
            this.f51487d.setAlpha(0.0f);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$c */
    /* loaded from: classes4.dex */
    public static class C7177c {

        /* renamed from: a */
        public final ProgressThresholds f51489a;

        /* renamed from: b */
        public final ProgressThresholds f51490b;

        /* renamed from: c */
        public final ProgressThresholds f51491c;

        /* renamed from: d */
        public final ProgressThresholds f51492d;

        public /* synthetic */ C7177c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C7175a c7175a) {
            this(progressThresholds, progressThresholds2, progressThresholds3, progressThresholds4);
        }

        public C7177c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f51489a = progressThresholds;
            this.f51490b = progressThresholds2;
            this.f51491c = progressThresholds3;
            this.f51492d = progressThresholds4;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d */
    /* loaded from: classes4.dex */
    public static final class C7178d extends Drawable {

        /* renamed from: A */
        public final C7177c f51493A;

        /* renamed from: B */
        public final InterfaceC1102PV f51494B;

        /* renamed from: C */
        public final InterfaceC23065y20 f51495C;

        /* renamed from: D */
        public final boolean f51496D;

        /* renamed from: E */
        public final Paint f51497E;

        /* renamed from: F */
        public final Path f51498F;

        /* renamed from: G */
        public C1391TV f51499G;

        /* renamed from: H */
        public C20 f51500H;

        /* renamed from: I */
        public RectF f51501I;

        /* renamed from: J */
        public float f51502J;

        /* renamed from: K */
        public float f51503K;

        /* renamed from: L */
        public float f51504L;

        /* renamed from: a */
        public final View f51505a;

        /* renamed from: b */
        public final RectF f51506b;

        /* renamed from: c */
        public final ShapeAppearanceModel f51507c;

        /* renamed from: d */
        public final float f51508d;

        /* renamed from: e */
        public final View f51509e;

        /* renamed from: f */
        public final RectF f51510f;

        /* renamed from: g */
        public final ShapeAppearanceModel f51511g;

        /* renamed from: h */
        public final float f51512h;

        /* renamed from: i */
        public final Paint f51513i;

        /* renamed from: j */
        public final Paint f51514j;

        /* renamed from: k */
        public final Paint f51515k;

        /* renamed from: l */
        public final Paint f51516l;

        /* renamed from: m */
        public final Paint f51517m;

        /* renamed from: n */
        public final C7187a f51518n;

        /* renamed from: o */
        public final PathMeasure f51519o;

        /* renamed from: p */
        public final float f51520p;

        /* renamed from: q */
        public final float[] f51521q;

        /* renamed from: r */
        public final boolean f51522r;

        /* renamed from: s */
        public final float f51523s;

        /* renamed from: t */
        public final float f51524t;

        /* renamed from: u */
        public final boolean f51525u;

        /* renamed from: v */
        public final MaterialShapeDrawable f51526v;

        /* renamed from: w */
        public final RectF f51527w;

        /* renamed from: x */
        public final RectF f51528x;

        /* renamed from: y */
        public final RectF f51529y;

        /* renamed from: z */
        public final RectF f51530z;

        /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d$a */
        /* loaded from: classes4.dex */
        public class C7179a implements CanvasCompat.CanvasOperation {
            public C7179a() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7178d.this.f51505a.draw(canvas);
            }
        }

        /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$d$b */
        /* loaded from: classes4.dex */
        public class C7180b implements CanvasCompat.CanvasOperation {
            public C7180b() {
            }

            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public void run(Canvas canvas) {
                C7178d.this.f51509e.draw(canvas);
            }
        }

        public /* synthetic */ C7178d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1102PV interfaceC1102PV, InterfaceC23065y20 interfaceC23065y20, C7177c c7177c, boolean z3, C7175a c7175a) {
            this(pathMotion, view, rectF, shapeAppearanceModel, f, view2, rectF2, shapeAppearanceModel2, f2, i, i2, i3, i4, z, z2, interfaceC1102PV, interfaceC23065y20, c7177c, z3);
        }

        /* renamed from: d */
        public static float m43460d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m43459e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m43451m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i;
            if (this.f51517m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f51517m);
            }
            if (this.f51496D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f51525u && this.f51502J > 0.0f) {
                m43456h(canvas);
            }
            this.f51518n.m43422a(canvas);
            m43450n(canvas, this.f51513i);
            if (this.f51499G.f6029c) {
                m43452l(canvas);
                m43453k(canvas);
            } else {
                m43453k(canvas);
                m43452l(canvas);
            }
            if (this.f51496D) {
                canvas.restoreToCount(i);
                m43458f(canvas, this.f51527w, this.f51498F, -65281);
                m43457g(canvas, this.f51528x, -256);
                m43457g(canvas, this.f51527w, -16711936);
                m43457g(canvas, this.f51530z, -16711681);
                m43457g(canvas, this.f51529y, -16776961);
            }
        }

        /* renamed from: f */
        public final void m43458f(Canvas canvas, RectF rectF, Path path, int i) {
            PointF m43451m = m43451m(rectF);
            if (this.f51504L == 0.0f) {
                path.reset();
                path.moveTo(m43451m.x, m43451m.y);
                return;
            }
            path.lineTo(m43451m.x, m43451m.y);
            this.f51497E.setColor(i);
            canvas.drawPath(path, this.f51497E);
        }

        /* renamed from: g */
        public final void m43457g(Canvas canvas, RectF rectF, int i) {
            this.f51497E.setColor(i);
            canvas.drawRect(rectF, this.f51497E);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void m43456h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f51518n.m43419d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m43454j(canvas);
            } else {
                m43455i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void m43455i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.f51526v;
            RectF rectF = this.f51501I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f51526v.setElevation(this.f51502J);
            this.f51526v.setShadowVerticalOffset((int) this.f51503K);
            this.f51526v.setShapeAppearanceModel(this.f51518n.m43420c());
            this.f51526v.draw(canvas);
        }

        /* renamed from: j */
        public final void m43454j(Canvas canvas) {
            ShapeAppearanceModel m43420c = this.f51518n.m43420c();
            if (m43420c.isRoundRect(this.f51501I)) {
                float cornerSize = m43420c.getTopLeftCornerSize().getCornerSize(this.f51501I);
                canvas.drawRoundRect(this.f51501I, cornerSize, cornerSize, this.f51516l);
                return;
            }
            canvas.drawPath(this.f51518n.m43419d(), this.f51516l);
        }

        /* renamed from: k */
        public final void m43453k(Canvas canvas) {
            m43450n(canvas, this.f51515k);
            Rect bounds = getBounds();
            RectF rectF = this.f51529y;
            AbstractC21596pV1.m23664w(canvas, bounds, rectF.left, rectF.top, this.f51500H.f594b, this.f51499G.f6028b, new C7180b());
        }

        /* renamed from: l */
        public final void m43452l(Canvas canvas) {
            m43450n(canvas, this.f51514j);
            Rect bounds = getBounds();
            RectF rectF = this.f51527w;
            AbstractC21596pV1.m23664w(canvas, bounds, rectF.left, rectF.top, this.f51500H.f593a, this.f51499G.f6027a, new C7179a());
        }

        /* renamed from: n */
        public final void m43450n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void m43449o(float f) {
            if (this.f51504L != f) {
                m43448p(f);
            }
        }

        /* renamed from: p */
        public final void m43448p(float f) {
            float f2;
            float f3;
            this.f51504L = f;
            this.f51517m.setAlpha((int) (this.f51522r ? AbstractC21596pV1.m23674m(0.0f, 255.0f, f) : AbstractC21596pV1.m23674m(255.0f, 0.0f, f)));
            this.f51519o.getPosTan(this.f51520p * f, this.f51521q, null);
            float[] fArr = this.f51521q;
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
                this.f51519o.getPosTan(this.f51520p * f2, fArr, null);
                float[] fArr2 = this.f51521q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            C20 mo352a = this.f51495C.mo352a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51493A.f51490b.f51480a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51493A.f51490b.f51481b))).floatValue(), this.f51506b.width(), this.f51506b.height(), this.f51510f.width(), this.f51510f.height());
            this.f51500H = mo352a;
            RectF rectF = this.f51527w;
            float f8 = mo352a.f595c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, mo352a.f596d + f7);
            RectF rectF2 = this.f51529y;
            C20 c20 = this.f51500H;
            float f9 = c20.f597e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), c20.f598f + f7);
            this.f51528x.set(this.f51527w);
            this.f51530z.set(this.f51529y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51493A.f51491c.f51480a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51493A.f51491c.f51481b))).floatValue();
            boolean mo351b = this.f51495C.mo351b(this.f51500H);
            RectF rectF3 = mo351b ? this.f51528x : this.f51530z;
            float m23673n = AbstractC21596pV1.m23673n(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!mo351b) {
                m23673n = 1.0f - m23673n;
            }
            this.f51495C.mo350c(rectF3, m23673n, this.f51500H);
            this.f51501I = new RectF(Math.min(this.f51528x.left, this.f51530z.left), Math.min(this.f51528x.top, this.f51530z.top), Math.max(this.f51528x.right, this.f51530z.right), Math.max(this.f51528x.bottom, this.f51530z.bottom));
            this.f51518n.m43421b(f, this.f51507c, this.f51511g, this.f51527w, this.f51528x, this.f51530z, this.f51493A.f51492d);
            this.f51502J = AbstractC21596pV1.m23674m(this.f51508d, this.f51512h, f);
            float m43460d = m43460d(this.f51501I, this.f51523s);
            float m43459e = m43459e(this.f51501I, this.f51524t);
            float f10 = this.f51502J;
            float f11 = (int) (m43459e * f10);
            this.f51503K = f11;
            this.f51516l.setShadowLayer(f10, (int) (m43460d * f10), f11, 754974720);
            this.f51499G = this.f51494B.mo66323a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51493A.f51489a.f51480a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.f51493A.f51489a.f51481b))).floatValue(), 0.35f);
            if (this.f51514j.getColor() != 0) {
                this.f51514j.setAlpha(this.f51499G.f6027a);
            }
            if (this.f51515k.getColor() != 0) {
                this.f51515k.setAlpha(this.f51499G.f6028b);
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

        public C7178d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1102PV interfaceC1102PV, InterfaceC23065y20 interfaceC23065y20, C7177c c7177c, boolean z3) {
            Paint paint = new Paint();
            this.f51513i = paint;
            Paint paint2 = new Paint();
            this.f51514j = paint2;
            Paint paint3 = new Paint();
            this.f51515k = paint3;
            this.f51516l = new Paint();
            Paint paint4 = new Paint();
            this.f51517m = paint4;
            this.f51518n = new C7187a();
            this.f51521q = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f51526v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f51497E = paint5;
            this.f51498F = new Path();
            this.f51505a = view;
            this.f51506b = rectF;
            this.f51507c = shapeAppearanceModel;
            this.f51508d = f;
            this.f51509e = view2;
            this.f51510f = rectF2;
            this.f51511g = shapeAppearanceModel2;
            this.f51512h = f2;
            this.f51522r = z;
            this.f51525u = z2;
            this.f51494B = interfaceC1102PV;
            this.f51495C = interfaceC23065y20;
            this.f51493A = c7177c;
            this.f51496D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f51523s = displayMetrics.widthPixels;
            this.f51524t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f51527w = rectF3;
            this.f51528x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f51529y = rectF4;
            this.f51530z = new RectF(rectF4);
            PointF m43451m = m43451m(rectF);
            PointF m43451m2 = m43451m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m43451m.x, m43451m.y, m43451m2.x, m43451m2.y), false);
            this.f51519o = pathMeasure;
            this.f51520p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(AbstractC21596pV1.m23683d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m43448p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        this.f51455a = false;
        this.f51456b = false;
        this.f51457c = false;
        this.f51458d = false;
        this.f51459e = 16908290;
        this.f51460f = -1;
        this.f51461g = -1;
        this.f51462h = 0;
        this.f51463i = 0;
        this.f51464j = 0;
        this.f51465k = 1375731712;
        this.f51466l = 0;
        this.f51467m = 0;
        this.f51468n = 0;
        this.f51477w = Build.VERSION.SDK_INT >= 28;
        this.f51478x = -1.0f;
        this.f51479y = -1.0f;
    }

    /* renamed from: c */
    public static RectF m43478c(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF m23679h = AbstractC21596pV1.m23679h(view2);
            m23679h.offset(f, f2);
            return m23679h;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    /* renamed from: d */
    public static ShapeAppearanceModel m43477d(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return AbstractC21596pV1.m23684c(m43474g(view, shapeAppearanceModel), rectF);
    }

    /* renamed from: e */
    public static void m43476e(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        RectF m23679h;
        if (i != -1) {
            transitionValues.view = AbstractC21596pV1.m23680g(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view2 = transitionValues.view;
        if (ViewCompat.isLaidOut(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            if (view2.getParent() == null) {
                m23679h = AbstractC21596pV1.m23678i(view2);
            } else {
                m23679h = AbstractC21596pV1.m23679h(view2);
            }
            transitionValues.values.put("materialContainerTransition:bounds", m23679h);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m43477d(view2, m23679h, shapeAppearanceModel));
        }
    }

    /* renamed from: f */
    public static float m43475f(float f, View view) {
        if (f == -1.0f) {
            return ViewCompat.getElevation(view);
        }
        return f;
    }

    /* renamed from: g */
    public static ShapeAppearanceModel m43474g(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int m43472i = m43472i(context);
        if (m43472i != -1) {
            return ShapeAppearanceModel.builder(context, m43472i, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    /* renamed from: i */
    public static int m43472i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: b */
    public final C7177c m43479b(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof MaterialArcMotion)) {
            return m43473h(z, f51450B, f51451C);
        }
        return m43473h(z, f51452D, f51453E);
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m43476e(transitionValues, this.f51470p, this.f51461g, this.f51472r);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m43476e(transitionValues, this.f51469o, this.f51460f, this.f51471q);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View view;
        View m23681f;
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
                    if (this.f51459e == view.getId()) {
                        m23681f = (View) view.getParent();
                        view2 = view;
                    } else {
                        m23681f = AbstractC21596pV1.m23681f(view, this.f51459e);
                        view2 = null;
                    }
                    RectF m23679h = AbstractC21596pV1.m23679h(m23681f);
                    float f = -m23679h.left;
                    float f2 = -m23679h.top;
                    RectF m43478c = m43478c(m23681f, view2, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean m43471j = m43471j(rectF, rectF2);
                    if (!this.f51458d) {
                        m43470k(view.getContext(), m43471j);
                    }
                    C7178d c7178d = new C7178d(getPathMotion(), view3, rectF, shapeAppearanceModel, m43475f(this.f51478x, view3), view4, rectF2, shapeAppearanceModel2, m43475f(this.f51479y, view4), this.f51462h, this.f51463i, this.f51464j, this.f51465k, m43471j, this.f51477w, AbstractC1317SV.m66324a(this.f51467m, m43471j), B20.m69029a(this.f51468n, m43471j, rectF, rectF2), m43479b(m43471j), this.f51455a, null);
                    c7178d.setBounds(Math.round(m43478c.left), Math.round(m43478c.top), Math.round(m43478c.right), Math.round(m43478c.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new C7175a(c7178d));
                    addListener(new C7176b(m23681f, c7178d, view3, view4));
                    return ofFloat;
                }
                Log.w(f51454z, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f51454z, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f51462h;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f51459e;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f51464j;
    }

    public float getEndElevation() {
        return this.f51479y;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.f51472r;
    }

    @Nullable
    public View getEndView() {
        return this.f51470p;
    }

    @IdRes
    public int getEndViewId() {
        return this.f51461g;
    }

    public int getFadeMode() {
        return this.f51467m;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.f51473s;
    }

    public int getFitMode() {
        return this.f51468n;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f51475u;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.f51474t;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f51465k;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.f51476v;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f51463i;
    }

    public float getStartElevation() {
        return this.f51478x;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f51471q;
    }

    @Nullable
    public View getStartView() {
        return this.f51469o;
    }

    @IdRes
    public int getStartViewId() {
        return this.f51460f;
    }

    public int getTransitionDirection() {
        return this.f51466l;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f51449A;
    }

    /* renamed from: h */
    public final C7177c m43473h(boolean z, C7177c c7177c, C7177c c7177c2) {
        if (!z) {
            c7177c = c7177c2;
        }
        return new C7177c((ProgressThresholds) AbstractC21596pV1.m23682e(this.f51473s, c7177c.f51489a), (ProgressThresholds) AbstractC21596pV1.m23682e(this.f51474t, c7177c.f51490b), (ProgressThresholds) AbstractC21596pV1.m23682e(this.f51475u, c7177c.f51491c), (ProgressThresholds) AbstractC21596pV1.m23682e(this.f51476v, c7177c.f51492d), null);
    }

    public boolean isDrawDebugEnabled() {
        return this.f51455a;
    }

    public boolean isElevationShadowEnabled() {
        return this.f51477w;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f51456b;
    }

    /* renamed from: j */
    public final boolean m43471j(RectF rectF, RectF rectF2) {
        int i = this.f51466l;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f51466l);
        } else if (AbstractC21596pV1.m23685b(rectF2) <= AbstractC21596pV1.m23685b(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: k */
    public final void m43470k(Context context, boolean z) {
        int i;
        AbstractC21596pV1.m23668s(this, context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        if (z) {
            i = R.attr.motionDurationLong2;
        } else {
            i = R.attr.motionDurationMedium4;
        }
        AbstractC21596pV1.m23669r(this, context, i);
        if (!this.f51457c) {
            AbstractC21596pV1.m23667t(this, context, R.attr.motionPath);
        }
    }

    public void setAllContainerColors(@ColorInt int i) {
        this.f51462h = i;
        this.f51463i = i;
        this.f51464j = i;
    }

    public void setContainerColor(@ColorInt int i) {
        this.f51462h = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f51455a = z;
    }

    public void setDrawingViewId(@IdRes int i) {
        this.f51459e = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f51477w = z;
    }

    public void setEndContainerColor(@ColorInt int i) {
        this.f51464j = i;
    }

    public void setEndElevation(float f) {
        this.f51479y = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51472r = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f51470p = view;
    }

    public void setEndViewId(@IdRes int i) {
        this.f51461g = i;
    }

    public void setFadeMode(int i) {
        this.f51467m = i;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51473s = progressThresholds;
    }

    public void setFitMode(int i) {
        this.f51468n = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f51456b = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f51457c = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51475u = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51474t = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i) {
        this.f51465k = i;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.f51476v = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i) {
        this.f51463i = i;
    }

    public void setStartElevation(float f) {
        this.f51478x = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f51471q = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f51469o = view;
    }

    public void setStartViewId(@IdRes int i) {
        this.f51460f = i;
    }

    public void setTransitionDirection(int i) {
        this.f51466l = i;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z) {
        this.f51455a = false;
        this.f51456b = false;
        this.f51457c = false;
        this.f51458d = false;
        this.f51459e = 16908290;
        this.f51460f = -1;
        this.f51461g = -1;
        this.f51462h = 0;
        this.f51463i = 0;
        this.f51464j = 0;
        this.f51465k = 1375731712;
        this.f51466l = 0;
        this.f51467m = 0;
        this.f51468n = 0;
        this.f51477w = Build.VERSION.SDK_INT >= 28;
        this.f51478x = -1.0f;
        this.f51479y = -1.0f;
        m43470k(context, z);
        this.f51458d = true;
    }
}
