package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ClockHandView extends View {

    /* renamed from: a */
    public final int f51147a;

    /* renamed from: b */
    public final TimeInterpolator f51148b;

    /* renamed from: c */
    public final ValueAnimator f51149c;

    /* renamed from: d */
    public boolean f51150d;

    /* renamed from: e */
    public float f51151e;

    /* renamed from: f */
    public float f51152f;

    /* renamed from: g */
    public boolean f51153g;

    /* renamed from: h */
    public final int f51154h;

    /* renamed from: i */
    public boolean f51155i;

    /* renamed from: j */
    public final List f51156j;

    /* renamed from: k */
    public final int f51157k;

    /* renamed from: l */
    public final float f51158l;

    /* renamed from: m */
    public final Paint f51159m;

    /* renamed from: n */
    public final RectF f51160n;

    /* renamed from: o */
    public final int f51161o;

    /* renamed from: p */
    public float f51162p;

    /* renamed from: q */
    public boolean f51163q;

    /* renamed from: r */
    public OnActionUpListener f51164r;

    /* renamed from: s */
    public double f51165s;

    /* renamed from: t */
    public int f51166t;

    /* renamed from: u */
    public int f51167u;

    /* loaded from: classes4.dex */
    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, m64743to = 360.0d) float f, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, m64743to = 360.0d) float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes4.dex */
    public class C7127a extends AnimatorListenerAdapter {
        public C7127a() {
            ClockHandView.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    /* renamed from: a */
    public static /* synthetic */ void m43669a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.m43657m(valueAnimator);
    }

    /* renamed from: b */
    public void m43668b(OnRotateListener onRotateListener) {
        this.f51156j.add(onRotateListener);
    }

    /* renamed from: c */
    public final void m43667c(float f, float f2) {
        int i = 2;
        if (MathUtils.dist(getWidth() / 2, getHeight() / 2, f, f2) > m43661i(2) + ViewUtils.dpToPx(getContext(), 12)) {
            i = 1;
        }
        this.f51167u = i;
    }

    /* renamed from: d */
    public final void m43666d(Canvas canvas) {
        int m43661i;
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float m43661i2 = m43661i(this.f51167u);
        float f2 = height;
        this.f51159m.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f51165s)) * m43661i2) + f, (m43661i2 * ((float) Math.sin(this.f51165s))) + f2, this.f51157k, this.f51159m);
        double sin = Math.sin(this.f51165s);
        double cos = Math.cos(this.f51165s);
        this.f51159m.setStrokeWidth(this.f51161o);
        canvas.drawLine(f, f2, width + ((int) (cos * r7)), height + ((int) (r7 * sin)), this.f51159m);
        canvas.drawCircle(f, f2, this.f51158l, this.f51159m);
    }

    /* renamed from: e */
    public int m43665e() {
        return this.f51167u;
    }

    /* renamed from: f */
    public RectF m43664f() {
        return this.f51160n;
    }

    /* renamed from: g */
    public final int m43663g(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            return degrees + 450;
        }
        return i;
    }

    /* renamed from: h */
    public float m43662h() {
        return this.f51162p;
    }

    /* renamed from: i */
    public final int m43661i(int i) {
        if (i == 2) {
            return Math.round(this.f51166t * 0.66f);
        }
        return this.f51166t;
    }

    /* renamed from: j */
    public int m43660j() {
        return this.f51157k;
    }

    /* renamed from: k */
    public final Pair m43659k(float f) {
        float m43662h = m43662h();
        if (Math.abs(m43662h - f) > 180.0f) {
            if (m43662h > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (m43662h < 180.0f && f > 180.0f) {
                m43662h += 360.0f;
            }
        }
        return new Pair(Float.valueOf(m43662h), Float.valueOf(f));
    }

    /* renamed from: l */
    public final boolean m43658l(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float m43663g = m43663g(f, f2);
        boolean z5 = false;
        if (m43662h() != m43663g) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f51150d) {
            z5 = true;
        }
        m43652r(m43663g, z5);
        return true;
    }

    /* renamed from: m */
    public final /* synthetic */ void m43657m(ValueAnimator valueAnimator) {
        m43651s(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* renamed from: n */
    public void m43656n(boolean z) {
        this.f51150d = z;
    }

    /* renamed from: o */
    public void m43655o(int i) {
        this.f51166t = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m43666d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f51149c.isRunning()) {
            m43653q(m43662h());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        OnActionUpListener onActionUpListener;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z = false;
                z2 = false;
            } else {
                int i = (int) (x - this.f51151e);
                int i2 = (int) (y - this.f51152f);
                if ((i * i) + (i2 * i2) > this.f51154h) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f51153g = z4;
                boolean z5 = this.f51163q;
                if (actionMasked == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f51155i) {
                    m43667c(x, y);
                }
                z2 = z5;
            }
            z3 = false;
        } else {
            this.f51151e = x;
            this.f51152f = y;
            this.f51153g = true;
            this.f51163q = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean m43658l = m43658l(x, y, z2, z3, z) | this.f51163q;
        this.f51163q = m43658l;
        if (m43658l && z && (onActionUpListener = this.f51164r) != null) {
            onActionUpListener.onActionUp(m43663g(x, y), this.f51153g);
        }
        return true;
    }

    /* renamed from: p */
    public void m43654p(int i) {
        this.f51167u = i;
        invalidate();
    }

    /* renamed from: q */
    public void m43653q(float f) {
        m43652r(f, false);
    }

    /* renamed from: r */
    public void m43652r(float f, boolean z) {
        ValueAnimator valueAnimator = this.f51149c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m43651s(f, false);
            return;
        }
        Pair m43659k = m43659k(f);
        this.f51149c.setFloatValues(((Float) m43659k.first).floatValue(), ((Float) m43659k.second).floatValue());
        this.f51149c.setDuration(this.f51147a);
        this.f51149c.setInterpolator(this.f51148b);
        this.f51149c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            {
                ClockHandView.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.m43669a(ClockHandView.this, valueAnimator2);
            }
        });
        this.f51149c.addListener(new C7127a());
        this.f51149c.start();
    }

    /* renamed from: s */
    public final void m43651s(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f51162p = f2;
        this.f51165s = Math.toRadians(f2 - 90.0f);
        float m43661i = m43661i(this.f51167u);
        float width = (getWidth() / 2) + (((float) Math.cos(this.f51165s)) * m43661i);
        float height = (getHeight() / 2) + (m43661i * ((float) Math.sin(this.f51165s)));
        RectF rectF = this.f51160n;
        int i = this.f51157k;
        rectF.set(width - i, height - i, width + i, height + i);
        for (OnRotateListener onRotateListener : this.f51156j) {
            onRotateListener.onRotate(f2, z);
        }
        invalidate();
    }

    /* renamed from: t */
    public void m43650t(boolean z) {
        if (this.f51155i && !z) {
            this.f51167u = 1;
        }
        this.f51155i = z;
        invalidate();
    }

    /* renamed from: u */
    public void m43649u(OnActionUpListener onActionUpListener) {
        this.f51164r = onActionUpListener;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51149c = new ValueAnimator();
        this.f51156j = new ArrayList();
        Paint paint = new Paint();
        this.f51159m = paint;
        this.f51160n = new RectF();
        this.f51167u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f51147a = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.f51148b = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.f51166t = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f51157k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f51161o = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f51158l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m43653q(0.0f);
        this.f51154h = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }
}
