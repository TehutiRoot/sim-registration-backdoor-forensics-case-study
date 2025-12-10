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
    public int f72410a;

    /* renamed from: b */
    public int f72411b;

    /* renamed from: c */
    public int f72412c;

    /* renamed from: d */
    public int f72413d;

    /* renamed from: e */
    public int f72414e;

    /* renamed from: f */
    public int f72415f;

    /* renamed from: g */
    public Interpolator f72416g;

    /* renamed from: h */
    public Paint f72417h;

    /* renamed from: i */
    public List f72418i;

    /* renamed from: j */
    public float f72419j;

    /* renamed from: k */
    public boolean f72420k;

    /* renamed from: l */
    public OnCircleClickListener f72421l;

    /* renamed from: m */
    public float f72422m;

    /* renamed from: n */
    public float f72423n;

    /* renamed from: o */
    public int f72424o;

    /* renamed from: p */
    public boolean f72425p;

    /* loaded from: classes6.dex */
    public interface OnCircleClickListener {
        void onClick(int i);
    }

    public CircleNavigator(Context context) {
        super(context);
        this.f72416g = new LinearInterpolator();
        this.f72417h = new Paint(1);
        this.f72418i = new ArrayList();
        this.f72425p = true;
        m26355c(context);
    }

    /* renamed from: a */
    public final void m26357a(Canvas canvas) {
        this.f72417h.setStyle(Paint.Style.STROKE);
        this.f72417h.setStrokeWidth(this.f72412c);
        int size = this.f72418i.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) this.f72418i.get(i);
            canvas.drawCircle(pointF.x, pointF.y, this.f72410a, this.f72417h);
        }
    }

    /* renamed from: b */
    public final void m26356b(Canvas canvas) {
        this.f72417h.setStyle(Paint.Style.FILL);
        if (this.f72418i.size() > 0) {
            canvas.drawCircle(this.f72419j, (int) ((getHeight() / 2.0f) + 0.5f), this.f72410a, this.f72417h);
        }
    }

    /* renamed from: c */
    public final void m26355c(Context context) {
        this.f72424o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f72410a = UIUtil.dip2px(context, 3.0d);
        this.f72413d = UIUtil.dip2px(context, 8.0d);
        this.f72412c = UIUtil.dip2px(context, 1.0d);
    }

    /* renamed from: d */
    public final int m26354d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        return (this.f72410a * 2) + (this.f72412c * 2) + getPaddingTop() + getPaddingBottom();
    }

    /* renamed from: e */
    public final int m26353e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        int i2 = this.f72415f;
        return (this.f72412c * 2) + (this.f72410a * i2 * 2) + ((i2 - 1) * this.f72413d) + getPaddingLeft() + getPaddingRight();
    }

    /* renamed from: f */
    public final void m26352f() {
        this.f72418i.clear();
        if (this.f72415f > 0) {
            int height = (int) ((getHeight() / 2.0f) + 0.5f);
            int i = this.f72410a;
            int i2 = (i * 2) + this.f72413d;
            int paddingLeft = i + ((int) ((this.f72412c / 2.0f) + 0.5f)) + getPaddingLeft();
            for (int i3 = 0; i3 < this.f72415f; i3++) {
                this.f72418i.add(new PointF(paddingLeft, height));
                paddingLeft += i2;
            }
            this.f72419j = ((PointF) this.f72418i.get(this.f72414e)).x;
        }
    }

    public OnCircleClickListener getCircleClickListener() {
        return this.f72421l;
    }

    public int getCircleColor() {
        return this.f72411b;
    }

    public int getCircleCount() {
        return this.f72415f;
    }

    public int getCircleSpacing() {
        return this.f72413d;
    }

    public int getRadius() {
        return this.f72410a;
    }

    public Interpolator getStartInterpolator() {
        return this.f72416g;
    }

    public int getStrokeWidth() {
        return this.f72412c;
    }

    public boolean isFollowTouch() {
        return this.f72425p;
    }

    public boolean isTouchable() {
        return this.f72420k;
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        m26352f();
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
        this.f72417h.setColor(this.f72411b);
        m26357a(canvas);
        m26356b(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m26352f();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m26353e(i), m26354d(i2));
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        if (!this.f72425p || this.f72418i.isEmpty()) {
            return;
        }
        int min = Math.min(this.f72418i.size() - 1, i);
        int min2 = Math.min(this.f72418i.size() - 1, i + 1);
        float f2 = ((PointF) this.f72418i.get(min)).x;
        this.f72419j = f2 + ((((PointF) this.f72418i.get(min2)).x - f2) * this.f72416g.getInterpolation(f));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        this.f72414e = i;
        if (!this.f72425p) {
            this.f72419j = ((PointF) this.f72418i.get(i)).x;
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.f72421l != null && Math.abs(x - this.f72422m) <= this.f72424o && Math.abs(y - this.f72423n) <= this.f72424o) {
                int i = 0;
                float f = Float.MAX_VALUE;
                for (int i2 = 0; i2 < this.f72418i.size(); i2++) {
                    float abs = Math.abs(((PointF) this.f72418i.get(i2)).x - x);
                    if (abs < f) {
                        i = i2;
                        f = abs;
                    }
                }
                this.f72421l.onClick(i);
            }
        } else if (this.f72420k) {
            this.f72422m = x;
            this.f72423n = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCircleClickListener(OnCircleClickListener onCircleClickListener) {
        if (!this.f72420k) {
            this.f72420k = true;
        }
        this.f72421l = onCircleClickListener;
    }

    public void setCircleColor(int i) {
        this.f72411b = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f72415f = i;
    }

    public void setCircleSpacing(int i) {
        this.f72413d = i;
        m26352f();
        invalidate();
    }

    public void setFollowTouch(boolean z) {
        this.f72425p = z;
    }

    public void setRadius(int i) {
        this.f72410a = i;
        m26352f();
        invalidate();
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72416g = interpolator;
        if (interpolator == null) {
            this.f72416g = new LinearInterpolator();
        }
    }

    public void setStrokeWidth(int i) {
        this.f72412c = i;
        invalidate();
    }

    public void setTouchable(boolean z) {
        this.f72420k = z;
    }
}