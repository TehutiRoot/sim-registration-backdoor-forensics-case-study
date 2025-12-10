package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    public static final int DEFAULT = 1;
    public static final int LARGE = 0;

    /* renamed from: g */
    public static final Interpolator f37531g = new LinearInterpolator();

    /* renamed from: h */
    public static final Interpolator f37532h = new FastOutSlowInInterpolator();

    /* renamed from: i */
    public static final int[] f37533i = {-16777216};

    /* renamed from: a */
    public final C5056c f37534a;

    /* renamed from: b */
    public float f37535b;

    /* renamed from: c */
    public Resources f37536c;

    /* renamed from: d */
    public Animator f37537d;

    /* renamed from: e */
    public float f37538e;

    /* renamed from: f */
    public boolean f37539f;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface ProgressDrawableSize {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$a */
    /* loaded from: classes2.dex */
    public class C5054a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C5056c f37540a;

        public C5054a(C5056c c5056c) {
            this.f37540a = c5056c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.m52779g(floatValue, this.f37540a);
            CircularProgressDrawable.this.m52784b(floatValue, this.f37540a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$b */
    /* loaded from: classes2.dex */
    public class C5055b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C5056c f37542a;

        public C5055b(C5056c c5056c) {
            this.f37542a = c5056c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.m52784b(1.0f, this.f37542a, true);
            this.f37542a.m52766M();
            this.f37542a.m52744v();
            CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
            if (circularProgressDrawable.f37539f) {
                circularProgressDrawable.f37539f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f37542a.m52770I(false);
                return;
            }
            circularProgressDrawable.f37538e += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.f37538e = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$c */
    /* loaded from: classes2.dex */
    public static class C5056c {

        /* renamed from: a */
        public final RectF f37544a = new RectF();

        /* renamed from: b */
        public final Paint f37545b;

        /* renamed from: c */
        public final Paint f37546c;

        /* renamed from: d */
        public final Paint f37547d;

        /* renamed from: e */
        public float f37548e;

        /* renamed from: f */
        public float f37549f;

        /* renamed from: g */
        public float f37550g;

        /* renamed from: h */
        public float f37551h;

        /* renamed from: i */
        public int[] f37552i;

        /* renamed from: j */
        public int f37553j;

        /* renamed from: k */
        public float f37554k;

        /* renamed from: l */
        public float f37555l;

        /* renamed from: m */
        public float f37556m;

        /* renamed from: n */
        public boolean f37557n;

        /* renamed from: o */
        public Path f37558o;

        /* renamed from: p */
        public float f37559p;

        /* renamed from: q */
        public float f37560q;

        /* renamed from: r */
        public int f37561r;

        /* renamed from: s */
        public int f37562s;

        /* renamed from: t */
        public int f37563t;

        /* renamed from: u */
        public int f37564u;

        public C5056c() {
            Paint paint = new Paint();
            this.f37545b = paint;
            Paint paint2 = new Paint();
            this.f37546c = paint2;
            Paint paint3 = new Paint();
            this.f37547d = paint3;
            this.f37548e = 0.0f;
            this.f37549f = 0.0f;
            this.f37550g = 0.0f;
            this.f37551h = 5.0f;
            this.f37559p = 1.0f;
            this.f37563t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void m52778A(int i) {
            this.f37547d.setColor(i);
        }

        /* renamed from: B */
        public void m52777B(float f) {
            this.f37560q = f;
        }

        /* renamed from: C */
        public void m52776C(int i) {
            this.f37564u = i;
        }

        /* renamed from: D */
        public void m52775D(ColorFilter colorFilter) {
            this.f37545b.setColorFilter(colorFilter);
        }

        /* renamed from: E */
        public void m52774E(int i) {
            this.f37553j = i;
            this.f37564u = this.f37552i[i];
        }

        /* renamed from: F */
        public void m52773F(int[] iArr) {
            this.f37552i = iArr;
            m52774E(0);
        }

        /* renamed from: G */
        public void m52772G(float f) {
            this.f37549f = f;
        }

        /* renamed from: H */
        public void m52771H(float f) {
            this.f37550g = f;
        }

        /* renamed from: I */
        public void m52770I(boolean z) {
            if (this.f37557n != z) {
                this.f37557n = z;
            }
        }

        /* renamed from: J */
        public void m52769J(float f) {
            this.f37548e = f;
        }

        /* renamed from: K */
        public void m52768K(Paint.Cap cap) {
            this.f37545b.setStrokeCap(cap);
        }

        /* renamed from: L */
        public void m52767L(float f) {
            this.f37551h = f;
            this.f37545b.setStrokeWidth(f);
        }

        /* renamed from: M */
        public void m52766M() {
            this.f37554k = this.f37548e;
            this.f37555l = this.f37549f;
            this.f37556m = this.f37550g;
        }

        /* renamed from: a */
        public void m52765a(Canvas canvas, Rect rect) {
            RectF rectF = this.f37544a;
            float f = this.f37560q;
            float f2 = (this.f37551h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f37561r * this.f37559p) / 2.0f, this.f37551h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f37548e;
            float f4 = this.f37550g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f37549f + f4) * 360.0f) - f5;
            this.f37545b.setColor(this.f37564u);
            this.f37545b.setAlpha(this.f37563t);
            float f7 = this.f37551h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f37547d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f37545b);
            m52764b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        public void m52764b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f37557n) {
                Path path = this.f37558o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f37558o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f37558o.moveTo(0.0f, 0.0f);
                this.f37558o.lineTo(this.f37561r * this.f37559p, 0.0f);
                Path path3 = this.f37558o;
                float f3 = this.f37559p;
                path3.lineTo((this.f37561r * f3) / 2.0f, this.f37562s * f3);
                this.f37558o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f37561r * this.f37559p) / 2.0f), rectF.centerY() + (this.f37551h / 2.0f));
                this.f37558o.close();
                this.f37546c.setColor(this.f37564u);
                this.f37546c.setAlpha(this.f37563t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f37558o, this.f37546c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int m52763c() {
            return this.f37563t;
        }

        /* renamed from: d */
        public float m52762d() {
            return this.f37562s;
        }

        /* renamed from: e */
        public float m52761e() {
            return this.f37559p;
        }

        /* renamed from: f */
        public float m52760f() {
            return this.f37561r;
        }

        /* renamed from: g */
        public int m52759g() {
            return this.f37547d.getColor();
        }

        /* renamed from: h */
        public float m52758h() {
            return this.f37560q;
        }

        /* renamed from: i */
        public int[] m52757i() {
            return this.f37552i;
        }

        /* renamed from: j */
        public float m52756j() {
            return this.f37549f;
        }

        /* renamed from: k */
        public int m52755k() {
            return this.f37552i[m52754l()];
        }

        /* renamed from: l */
        public int m52754l() {
            return (this.f37553j + 1) % this.f37552i.length;
        }

        /* renamed from: m */
        public float m52753m() {
            return this.f37550g;
        }

        /* renamed from: n */
        public boolean m52752n() {
            return this.f37557n;
        }

        /* renamed from: o */
        public float m52751o() {
            return this.f37548e;
        }

        /* renamed from: p */
        public int m52750p() {
            return this.f37552i[this.f37553j];
        }

        /* renamed from: q */
        public float m52749q() {
            return this.f37555l;
        }

        /* renamed from: r */
        public float m52748r() {
            return this.f37556m;
        }

        /* renamed from: s */
        public float m52747s() {
            return this.f37554k;
        }

        /* renamed from: t */
        public Paint.Cap m52746t() {
            return this.f37545b.getStrokeCap();
        }

        /* renamed from: u */
        public float m52745u() {
            return this.f37551h;
        }

        /* renamed from: v */
        public void m52744v() {
            m52774E(m52754l());
        }

        /* renamed from: w */
        public void m52743w() {
            this.f37554k = 0.0f;
            this.f37555l = 0.0f;
            this.f37556m = 0.0f;
            m52769J(0.0f);
            m52772G(0.0f);
            m52771H(0.0f);
        }

        /* renamed from: x */
        public void m52742x(int i) {
            this.f37563t = i;
        }

        /* renamed from: y */
        public void m52741y(float f, float f2) {
            this.f37561r = (int) f;
            this.f37562s = (int) f2;
        }

        /* renamed from: z */
        public void m52740z(float f) {
            if (f != this.f37559p) {
                this.f37559p = f;
            }
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.f37536c = ((Context) Preconditions.checkNotNull(context)).getResources();
        C5056c c5056c = new C5056c();
        this.f37534a = c5056c;
        c5056c.m52773F(f37533i);
        setStrokeWidth(2.5f);
        m52780f();
    }

    /* renamed from: a */
    public final void m52785a(float f, C5056c c5056c) {
        m52779g(f, c5056c);
        c5056c.m52769J(c5056c.m52747s() + (((c5056c.m52749q() - 0.01f) - c5056c.m52747s()) * f));
        c5056c.m52772G(c5056c.m52749q());
        c5056c.m52771H(c5056c.m52748r() + ((((float) (Math.floor(c5056c.m52748r() / 0.8f) + 1.0d)) - c5056c.m52748r()) * f));
    }

    /* renamed from: b */
    public void m52784b(float f, C5056c c5056c, boolean z) {
        float interpolation;
        float f2;
        if (this.f37539f) {
            m52785a(f, c5056c);
        } else if (f != 1.0f || z) {
            float m52748r = c5056c.m52748r();
            if (f < 0.5f) {
                interpolation = c5056c.m52747s();
                f2 = (f37532h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m52747s = c5056c.m52747s() + 0.79f;
                interpolation = m52747s - (((1.0f - f37532h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m52747s;
            }
            c5056c.m52769J(interpolation);
            c5056c.m52772G(f2);
            c5056c.m52771H(m52748r + (0.20999998f * f));
            m52782d((f + this.f37538e) * 216.0f);
        }
    }

    /* renamed from: c */
    public final int m52783c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: d */
    public final void m52782d(float f) {
        this.f37535b = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f37535b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f37534a.m52765a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public final void m52781e(float f, float f2, float f3, float f4) {
        C5056c c5056c = this.f37534a;
        float f5 = this.f37536c.getDisplayMetrics().density;
        c5056c.m52767L(f2 * f5);
        c5056c.m52777B(f * f5);
        c5056c.m52774E(0);
        c5056c.m52741y(f3 * f5, f4 * f5);
    }

    /* renamed from: f */
    public final void m52780f() {
        C5056c c5056c = this.f37534a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C5054a(c5056c));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f37531g);
        ofFloat.addListener(new C5055b(c5056c));
        this.f37537d = ofFloat;
    }

    /* renamed from: g */
    public void m52779g(float f, C5056c c5056c) {
        if (f > 0.75f) {
            c5056c.m52776C(m52783c((f - 0.75f) / 0.25f, c5056c.m52750p(), c5056c.m52755k()));
        } else {
            c5056c.m52776C(c5056c.m52750p());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37534a.m52763c();
    }

    public boolean getArrowEnabled() {
        return this.f37534a.m52752n();
    }

    public float getArrowHeight() {
        return this.f37534a.m52762d();
    }

    public float getArrowScale() {
        return this.f37534a.m52761e();
    }

    public float getArrowWidth() {
        return this.f37534a.m52760f();
    }

    public int getBackgroundColor() {
        return this.f37534a.m52759g();
    }

    public float getCenterRadius() {
        return this.f37534a.m52758h();
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.f37534a.m52757i();
    }

    public float getEndTrim() {
        return this.f37534a.m52756j();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.f37534a.m52753m();
    }

    public float getStartTrim() {
        return this.f37534a.m52751o();
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.f37534a.m52746t();
    }

    public float getStrokeWidth() {
        return this.f37534a.m52745u();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f37537d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f37534a.m52742x(i);
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        this.f37534a.m52741y(f, f2);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        this.f37534a.m52770I(z);
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        this.f37534a.m52740z(f);
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        this.f37534a.m52778A(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.f37534a.m52777B(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37534a.m52775D(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        this.f37534a.m52773F(iArr);
        this.f37534a.m52774E(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.f37534a.m52771H(f);
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        this.f37534a.m52769J(f);
        this.f37534a.m52772G(f2);
        invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
        this.f37534a.m52768K(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.f37534a.m52767L(f);
        invalidateSelf();
    }

    public void setStyle(int i) {
        if (i == 0) {
            m52781e(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m52781e(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f37537d.cancel();
        this.f37534a.m52766M();
        if (this.f37534a.m52756j() != this.f37534a.m52751o()) {
            this.f37539f = true;
            this.f37537d.setDuration(666L);
            this.f37537d.start();
            return;
        }
        this.f37534a.m52774E(0);
        this.f37534a.m52743w();
        this.f37537d.setDuration(1332L);
        this.f37537d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f37537d.cancel();
        m52782d(0.0f);
        this.f37534a.m52770I(false);
        this.f37534a.m52774E(0);
        this.f37534a.m52743w();
        invalidateSelf();
    }
}
