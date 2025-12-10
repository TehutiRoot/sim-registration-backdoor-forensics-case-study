package net.lucode.hackware.magicindicator.buildins.circlenavigator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;
import net.lucode.hackware.magicindicator.buildins.UIUtil;

/* loaded from: classes6.dex */
public class CircleNavigator extends View implements IPagerNavigator {

    /* renamed from: a */
    public int f72288a;

    /* renamed from: b */
    public int f72289b;

    /* renamed from: c */
    public int f72290c;

    /* renamed from: d */
    public int f72291d;

    /* renamed from: e */
    public int f72292e;

    /* renamed from: f */
    public int f72293f;

    /* renamed from: g */
    public Interpolator f72294g;

    /* renamed from: h */
    public Paint f72295h;

    /* renamed from: i */
    public List f72296i;

    /* renamed from: j */
    public float f72297j;

    /* renamed from: k */
    public boolean f72298k;

    /* renamed from: l */
    public OnCircleClickListener f72299l;

    /* renamed from: m */
    public float f72300m;

    /* renamed from: n */
    public float f72301n;

    /* renamed from: o */
    public int f72302o;

    /* renamed from: p */
    public boolean f72303p;

    /* loaded from: classes6.dex */
    public interface OnCircleClickListener {
        void onClick(int i);
    }

    public CircleNavigator(Context context) {
        super(context);
        this.f72294g = new LinearInterpolator();
        this.f72295h = new Paint(1);
        this.f72296i = new ArrayList();
        this.f72303p = true;
        m26095c(context);
    }

    /* renamed from: a */
    public final void m26097a(Canvas canvas) {
        this.f72295h.setStyle(Paint.Style.STROKE);
        this.f72295h.setStrokeWidth(this.f72290c);
        int size = this.f72296i.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) this.f72296i.get(i);
            canvas.drawCircle(pointF.x, pointF.y, this.f72288a, this.f72295h);
        }
    }

    /* renamed from: b */
    public final void m26096b(Canvas canvas) {
        this.f72295h.setStyle(Paint.Style.FILL);
        if (this.f72296i.size() > 0) {
            canvas.drawCircle(this.f72297j, (int) ((getHeight() / 2.0f) + 0.5f), this.f72288a, this.f72295h);
        }
    }

    /* renamed from: c */
    public final void m26095c(Context context) {
        this.f72302o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f72288a = UIUtil.dip2px(context, 3.0d);
        this.f72291d = UIUtil.dip2px(context, 8.0d);
        this.f72290c = UIUtil.dip2px(context, 1.0d);
    }

    /* renamed from: d */
    public final int m26094d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        return (this.f72288a * 2) + (this.f72290c * 2) + getPaddingTop() + getPaddingBottom();
    }

    /* renamed from: e */
    public final int m26093e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        int i2 = this.f72293f;
        return (this.f72290c * 2) + (this.f72288a * i2 * 2) + ((i2 - 1) * this.f72291d) + getPaddingLeft() + getPaddingRight();
    }

    /* renamed from: f */
    public final void m26092f() {
        this.f72296i.clear();
        if (this.f72293f > 0) {
            int height = (int) ((getHeight() / 2.0f) + 0.5f);
            int i = this.f72288a;
            int i2 = (i * 2) + this.f72291d;
            int paddingLeft = i + ((int) ((this.f72290c / 2.0f) + 0.5f)) + getPaddingLeft();
            for (int i3 = 0; i3 < this.f72293f; i3++) {
                this.f72296i.add(new PointF(paddingLeft, height));
                paddingLeft += i2;
            }
            this.f72297j = ((PointF) this.f72296i.get(this.f72292e)).x;
        }
    }

    public OnCircleClickListener getCircleClickListener() {
        return this.f72299l;
    }

    public int getCircleColor() {
        return this.f72289b;
    }

    public int getCircleCount() {
        return this.f72293f;
    }

    public int getCircleSpacing() {
        return this.f72291d;
    }

    public int getRadius() {
        return this.f72288a;
    }

    public Interpolator getStartInterpolator() {
        return this.f72294g;
    }

    public int getStrokeWidth() {
        return this.f72290c;
    }

    public boolean isFollowTouch() {
        return this.f72303p;
    }

    public boolean isTouchable() {
        return this.f72298k;
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        m26092f();
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onAttachToMagicIndicator() {
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onDetachFromMagicIndicator() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f72295h.setColor(this.f72289b);
        m26097a(canvas);
        m26096b(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m26092f();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m26093e(i), m26094d(i2));
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        if (!this.f72303p || this.f72296i.isEmpty()) {
            return;
        }
        int min = Math.min(this.f72296i.size() - 1, i);
        int min2 = Math.min(this.f72296i.size() - 1, i + 1);
        float f2 = ((PointF) this.f72296i.get(min)).x;
        this.f72297j = f2 + ((((PointF) this.f72296i.get(min2)).x - f2) * this.f72294g.getInterpolation(f));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        this.f72292e = i;
        if (!this.f72303p) {
            this.f72297j = ((PointF) this.f72296i.get(i)).x;
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.f72299l != null && Math.abs(x - this.f72300m) <= this.f72302o && Math.abs(y - this.f72301n) <= this.f72302o) {
                int i = 0;
                float f = Float.MAX_VALUE;
                for (int i2 = 0; i2 < this.f72296i.size(); i2++) {
                    float abs = Math.abs(((PointF) this.f72296i.get(i2)).x - x);
                    if (abs < f) {
                        i = i2;
                        f = abs;
                    }
                }
                this.f72299l.onClick(i);
            }
        } else if (this.f72298k) {
            this.f72300m = x;
            this.f72301n = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCircleClickListener(OnCircleClickListener onCircleClickListener) {
        if (!this.f72298k) {
            this.f72298k = true;
        }
        this.f72299l = onCircleClickListener;
    }

    public void setCircleColor(int i) {
        this.f72289b = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f72293f = i;
    }

    public void setCircleSpacing(int i) {
        this.f72291d = i;
        m26092f();
        invalidate();
    }

    public void setFollowTouch(boolean z) {
        this.f72303p = z;
    }

    public void setRadius(int i) {
        this.f72288a = i;
        m26092f();
        invalidate();
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72294g = interpolator;
        if (interpolator == null) {
            this.f72294g = new LinearInterpolator();
        }
    }

    public void setStrokeWidth(int i) {
        this.f72290c = i;
        invalidate();
    }

    public void setTouchable(boolean z) {
        this.f72298k = z;
    }
}
