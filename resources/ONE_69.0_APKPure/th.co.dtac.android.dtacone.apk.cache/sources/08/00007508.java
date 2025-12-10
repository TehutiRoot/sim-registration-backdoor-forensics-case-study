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
    public static final Interpolator f37619g = new LinearInterpolator();

    /* renamed from: h */
    public static final Interpolator f37620h = new FastOutSlowInInterpolator();

    /* renamed from: i */
    public static final int[] f37621i = {-16777216};

    /* renamed from: a */
    public final C5038c f37622a;

    /* renamed from: b */
    public float f37623b;

    /* renamed from: c */
    public Resources f37624c;

    /* renamed from: d */
    public Animator f37625d;

    /* renamed from: e */
    public float f37626e;

    /* renamed from: f */
    public boolean f37627f;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface ProgressDrawableSize {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$a */
    /* loaded from: classes2.dex */
    public class C5036a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C5038c f37628a;

        public C5036a(C5038c c5038c) {
            this.f37628a = c5038c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.m52730g(floatValue, this.f37628a);
            CircularProgressDrawable.this.m52735b(floatValue, this.f37628a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$b */
    /* loaded from: classes2.dex */
    public class C5037b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C5038c f37630a;

        public C5037b(C5038c c5038c) {
            this.f37630a = c5038c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.m52735b(1.0f, this.f37630a, true);
            this.f37630a.m52717M();
            this.f37630a.m52695v();
            CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
            if (circularProgressDrawable.f37627f) {
                circularProgressDrawable.f37627f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f37630a.m52721I(false);
                return;
            }
            circularProgressDrawable.f37626e += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.f37626e = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$c */
    /* loaded from: classes2.dex */
    public static class C5038c {

        /* renamed from: a */
        public final RectF f37632a = new RectF();

        /* renamed from: b */
        public final Paint f37633b;

        /* renamed from: c */
        public final Paint f37634c;

        /* renamed from: d */
        public final Paint f37635d;

        /* renamed from: e */
        public float f37636e;

        /* renamed from: f */
        public float f37637f;

        /* renamed from: g */
        public float f37638g;

        /* renamed from: h */
        public float f37639h;

        /* renamed from: i */
        public int[] f37640i;

        /* renamed from: j */
        public int f37641j;

        /* renamed from: k */
        public float f37642k;

        /* renamed from: l */
        public float f37643l;

        /* renamed from: m */
        public float f37644m;

        /* renamed from: n */
        public boolean f37645n;

        /* renamed from: o */
        public Path f37646o;

        /* renamed from: p */
        public float f37647p;

        /* renamed from: q */
        public float f37648q;

        /* renamed from: r */
        public int f37649r;

        /* renamed from: s */
        public int f37650s;

        /* renamed from: t */
        public int f37651t;

        /* renamed from: u */
        public int f37652u;

        public C5038c() {
            Paint paint = new Paint();
            this.f37633b = paint;
            Paint paint2 = new Paint();
            this.f37634c = paint2;
            Paint paint3 = new Paint();
            this.f37635d = paint3;
            this.f37636e = 0.0f;
            this.f37637f = 0.0f;
            this.f37638g = 0.0f;
            this.f37639h = 5.0f;
            this.f37647p = 1.0f;
            this.f37651t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void m52729A(int i) {
            this.f37635d.setColor(i);
        }

        /* renamed from: B */
        public void m52728B(float f) {
            this.f37648q = f;
        }

        /* renamed from: C */
        public void m52727C(int i) {
            this.f37652u = i;
        }

        /* renamed from: D */
        public void m52726D(ColorFilter colorFilter) {
            this.f37633b.setColorFilter(colorFilter);
        }

        /* renamed from: E */
        public void m52725E(int i) {
            this.f37641j = i;
            this.f37652u = this.f37640i[i];
        }

        /* renamed from: F */
        public void m52724F(int[] iArr) {
            this.f37640i = iArr;
            m52725E(0);
        }

        /* renamed from: G */
        public void m52723G(float f) {
            this.f37637f = f;
        }

        /* renamed from: H */
        public void m52722H(float f) {
            this.f37638g = f;
        }

        /* renamed from: I */
        public void m52721I(boolean z) {
            if (this.f37645n != z) {
                this.f37645n = z;
            }
        }

        /* renamed from: J */
        public void m52720J(float f) {
            this.f37636e = f;
        }

        /* renamed from: K */
        public void m52719K(Paint.Cap cap) {
            this.f37633b.setStrokeCap(cap);
        }

        /* renamed from: L */
        public void m52718L(float f) {
            this.f37639h = f;
            this.f37633b.setStrokeWidth(f);
        }

        /* renamed from: M */
        public void m52717M() {
            this.f37642k = this.f37636e;
            this.f37643l = this.f37637f;
            this.f37644m = this.f37638g;
        }

        /* renamed from: a */
        public void m52716a(Canvas canvas, Rect rect) {
            RectF rectF = this.f37632a;
            float f = this.f37648q;
            float f2 = (this.f37639h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f37649r * this.f37647p) / 2.0f, this.f37639h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f37636e;
            float f4 = this.f37638g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f37637f + f4) * 360.0f) - f5;
            this.f37633b.setColor(this.f37652u);
            this.f37633b.setAlpha(this.f37651t);
            float f7 = this.f37639h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f37635d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f37633b);
            m52715b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        public void m52715b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f37645n) {
                Path path = this.f37646o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f37646o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f37646o.moveTo(0.0f, 0.0f);
                this.f37646o.lineTo(this.f37649r * this.f37647p, 0.0f);
                Path path3 = this.f37646o;
                float f3 = this.f37647p;
                path3.lineTo((this.f37649r * f3) / 2.0f, this.f37650s * f3);
                this.f37646o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f37649r * this.f37647p) / 2.0f), rectF.centerY() + (this.f37639h / 2.0f));
                this.f37646o.close();
                this.f37634c.setColor(this.f37652u);
                this.f37634c.setAlpha(this.f37651t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f37646o, this.f37634c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int m52714c() {
            return this.f37651t;
        }

        /* renamed from: d */
        public float m52713d() {
            return this.f37650s;
        }

        /* renamed from: e */
        public float m52712e() {
            return this.f37647p;
        }

        /* renamed from: f */
        public float m52711f() {
            return this.f37649r;
        }

        /* renamed from: g */
        public int m52710g() {
            return this.f37635d.getColor();
        }

        /* renamed from: h */
        public float m52709h() {
            return this.f37648q;
        }

        /* renamed from: i */
        public int[] m52708i() {
            return this.f37640i;
        }

        /* renamed from: j */
        public float m52707j() {
            return this.f37637f;
        }

        /* renamed from: k */
        public int m52706k() {
            return this.f37640i[m52705l()];
        }

        /* renamed from: l */
        public int m52705l() {
            return (this.f37641j + 1) % this.f37640i.length;
        }

        /* renamed from: m */
        public float m52704m() {
            return this.f37638g;
        }

        /* renamed from: n */
        public boolean m52703n() {
            return this.f37645n;
        }

        /* renamed from: o */
        public float m52702o() {
            return this.f37636e;
        }

        /* renamed from: p */
        public int m52701p() {
            return this.f37640i[this.f37641j];
        }

        /* renamed from: q */
        public float m52700q() {
            return this.f37643l;
        }

        /* renamed from: r */
        public float m52699r() {
            return this.f37644m;
        }

        /* renamed from: s */
        public float m52698s() {
            return this.f37642k;
        }

        /* renamed from: t */
        public Paint.Cap m52697t() {
            return this.f37633b.getStrokeCap();
        }

        /* renamed from: u */
        public float m52696u() {
            return this.f37639h;
        }

        /* renamed from: v */
        public void m52695v() {
            m52725E(m52705l());
        }

        /* renamed from: w */
        public void m52694w() {
            this.f37642k = 0.0f;
            this.f37643l = 0.0f;
            this.f37644m = 0.0f;
            m52720J(0.0f);
            m52723G(0.0f);
            m52722H(0.0f);
        }

        /* renamed from: x */
        public void m52693x(int i) {
            this.f37651t = i;
        }

        /* renamed from: y */
        public void m52692y(float f, float f2) {
            this.f37649r = (int) f;
            this.f37650s = (int) f2;
        }

        /* renamed from: z */
        public void m52691z(float f) {
            if (f != this.f37647p) {
                this.f37647p = f;
            }
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.f37624c = ((Context) Preconditions.checkNotNull(context)).getResources();
        C5038c c5038c = new C5038c();
        this.f37622a = c5038c;
        c5038c.m52724F(f37621i);
        setStrokeWidth(2.5f);
        m52731f();
    }

    /* renamed from: a */
    public final void m52736a(float f, C5038c c5038c) {
        m52730g(f, c5038c);
        c5038c.m52720J(c5038c.m52698s() + (((c5038c.m52700q() - 0.01f) - c5038c.m52698s()) * f));
        c5038c.m52723G(c5038c.m52700q());
        c5038c.m52722H(c5038c.m52699r() + ((((float) (Math.floor(c5038c.m52699r() / 0.8f) + 1.0d)) - c5038c.m52699r()) * f));
    }

    /* renamed from: b */
    public void m52735b(float f, C5038c c5038c, boolean z) {
        float interpolation;
        float f2;
        if (this.f37627f) {
            m52736a(f, c5038c);
        } else if (f != 1.0f || z) {
            float m52699r = c5038c.m52699r();
            if (f < 0.5f) {
                interpolation = c5038c.m52698s();
                f2 = (f37620h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m52698s = c5038c.m52698s() + 0.79f;
                interpolation = m52698s - (((1.0f - f37620h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m52698s;
            }
            c5038c.m52720J(interpolation);
            c5038c.m52723G(f2);
            c5038c.m52722H(m52699r + (0.20999998f * f));
            m52733d((f + this.f37626e) * 216.0f);
        }
    }

    /* renamed from: c */
    public final int m52734c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: d */
    public final void m52733d(float f) {
        this.f37623b = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f37623b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f37622a.m52716a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public final void m52732e(float f, float f2, float f3, float f4) {
        C5038c c5038c = this.f37622a;
        float f5 = this.f37624c.getDisplayMetrics().density;
        c5038c.m52718L(f2 * f5);
        c5038c.m52728B(f * f5);
        c5038c.m52725E(0);
        c5038c.m52692y(f3 * f5, f4 * f5);
    }

    /* renamed from: f */
    public final void m52731f() {
        C5038c c5038c = this.f37622a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C5036a(c5038c));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f37619g);
        ofFloat.addListener(new C5037b(c5038c));
        this.f37625d = ofFloat;
    }

    /* renamed from: g */
    public void m52730g(float f, C5038c c5038c) {
        if (f > 0.75f) {
            c5038c.m52727C(m52734c((f - 0.75f) / 0.25f, c5038c.m52701p(), c5038c.m52706k()));
        } else {
            c5038c.m52727C(c5038c.m52701p());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37622a.m52714c();
    }

    public boolean getArrowEnabled() {
        return this.f37622a.m52703n();
    }

    public float getArrowHeight() {
        return this.f37622a.m52713d();
    }

    public float getArrowScale() {
        return this.f37622a.m52712e();
    }

    public float getArrowWidth() {
        return this.f37622a.m52711f();
    }

    public int getBackgroundColor() {
        return this.f37622a.m52710g();
    }

    public float getCenterRadius() {
        return this.f37622a.m52709h();
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.f37622a.m52708i();
    }

    public float getEndTrim() {
        return this.f37622a.m52707j();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.f37622a.m52704m();
    }

    public float getStartTrim() {
        return this.f37622a.m52702o();
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.f37622a.m52697t();
    }

    public float getStrokeWidth() {
        return this.f37622a.m52696u();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f37625d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f37622a.m52693x(i);
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        this.f37622a.m52692y(f, f2);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        this.f37622a.m52721I(z);
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        this.f37622a.m52691z(f);
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        this.f37622a.m52729A(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.f37622a.m52728B(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37622a.m52726D(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        this.f37622a.m52724F(iArr);
        this.f37622a.m52725E(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.f37622a.m52722H(f);
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        this.f37622a.m52720J(f);
        this.f37622a.m52723G(f2);
        invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
        this.f37622a.m52719K(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.f37622a.m52718L(f);
        invalidateSelf();
    }

    public void setStyle(int i) {
        if (i == 0) {
            m52732e(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m52732e(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f37625d.cancel();
        this.f37622a.m52717M();
        if (this.f37622a.m52707j() != this.f37622a.m52702o()) {
            this.f37627f = true;
            this.f37625d.setDuration(666L);
            this.f37625d.start();
            return;
        }
        this.f37622a.m52725E(0);
        this.f37622a.m52694w();
        this.f37625d.setDuration(1332L);
        this.f37625d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f37625d.cancel();
        m52733d(0.0f);
        this.f37622a.m52721I(false);
        this.f37622a.m52725E(0);
        this.f37622a.m52694w();
        invalidateSelf();
    }
}