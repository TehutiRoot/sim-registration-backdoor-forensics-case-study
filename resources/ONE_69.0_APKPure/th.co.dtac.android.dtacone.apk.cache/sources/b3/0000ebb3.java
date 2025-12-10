package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView;

/* loaded from: classes6.dex */
public class ClipPagerTitleView extends View implements IMeasurablePagerTitleView {

    /* renamed from: a */
    public String f72498a;

    /* renamed from: b */
    public int f72499b;

    /* renamed from: c */
    public int f72500c;

    /* renamed from: d */
    public boolean f72501d;

    /* renamed from: e */
    public float f72502e;

    /* renamed from: f */
    public Paint f72503f;

    /* renamed from: g */
    public Rect f72504g;

    public ClipPagerTitleView(Context context) {
        super(context);
        this.f72504g = new Rect();
        m26339a(context);
    }

    /* renamed from: a */
    public final void m26339a(Context context) {
        int dip2px = UIUtil.dip2px(context, 16.0d);
        Paint paint = new Paint(1);
        this.f72503f = paint;
        paint.setTextSize(dip2px);
        int dip2px2 = UIUtil.dip2px(context, 10.0d);
        setPadding(dip2px2, 0, dip2px2, 0);
    }

    /* renamed from: b */
    public final int m26338b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return this.f72504g.height() + getPaddingTop() + getPaddingBottom();
            }
            return size;
        }
        return Math.min(this.f72504g.height() + getPaddingTop() + getPaddingBottom(), size);
    }

    /* renamed from: c */
    public final void m26337c() {
        int length;
        Paint paint = this.f72503f;
        String str = this.f72498a;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        paint.getTextBounds(str, 0, length, this.f72504g);
    }

    /* renamed from: d */
    public final int m26336d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return this.f72504g.width() + getPaddingLeft() + getPaddingRight();
            }
            return size;
        }
        return Math.min(this.f72504g.width() + getPaddingLeft() + getPaddingRight(), size);
    }

    public int getClipColor() {
        return this.f72500c;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = this.f72503f.getFontMetrics();
        return (int) ((getHeight() / 2) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentLeft() {
        return (getLeft() + (getWidth() / 2)) - (this.f72504g.width() / 2);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentRight() {
        return getLeft() + (getWidth() / 2) + (this.f72504g.width() / 2);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = this.f72503f.getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public String getText() {
        return this.f72498a;
    }

    public int getTextColor() {
        return this.f72499b;
    }

    public float getTextSize() {
        return this.f72503f.getTextSize();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onDeselected(int i, int i2) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint.FontMetrics fontMetrics = this.f72503f.getFontMetrics();
        int height = (int) (((getHeight() - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        this.f72503f.setColor(this.f72499b);
        float width = (getWidth() - this.f72504g.width()) / 2;
        float f = height;
        canvas.drawText(this.f72498a, width, f, this.f72503f);
        canvas.save();
        if (this.f72501d) {
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f72502e, getHeight());
        } else {
            canvas.clipRect(getWidth() * (1.0f - this.f72502e), 0.0f, getWidth(), getHeight());
        }
        this.f72503f.setColor(this.f72500c);
        canvas.drawText(this.f72498a, width, f, this.f72503f);
        canvas.restore();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onEnter(int i, int i2, float f, boolean z) {
        this.f72501d = z;
        this.f72502e = f;
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onLeave(int i, int i2, float f, boolean z) {
        this.f72501d = !z;
        this.f72502e = 1.0f - f;
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        m26337c();
        setMeasuredDimension(m26336d(i), m26338b(i2));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onSelected(int i, int i2) {
    }

    public void setClipColor(int i) {
        this.f72500c = i;
        invalidate();
    }

    public void setText(String str) {
        this.f72498a = str;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f72499b = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f72503f.setTextSize(f);
        requestLayout();
    }
}