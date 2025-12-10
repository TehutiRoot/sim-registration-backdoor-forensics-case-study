package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* loaded from: classes6.dex */
public class TriangularPagerIndicator extends View implements IPagerIndicator {

    /* renamed from: a */
    public List f72355a;

    /* renamed from: b */
    public Paint f72356b;

    /* renamed from: c */
    public int f72357c;

    /* renamed from: d */
    public int f72358d;

    /* renamed from: e */
    public int f72359e;

    /* renamed from: f */
    public int f72360f;

    /* renamed from: g */
    public boolean f72361g;

    /* renamed from: h */
    public float f72362h;

    /* renamed from: i */
    public Path f72363i;

    /* renamed from: j */
    public Interpolator f72364j;

    /* renamed from: k */
    public float f72365k;

    public TriangularPagerIndicator(Context context) {
        super(context);
        this.f72363i = new Path();
        this.f72364j = new LinearInterpolator();
        m26081a(context);
    }

    /* renamed from: a */
    private void m26081a(Context context) {
        Paint paint = new Paint(1);
        this.f72356b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72357c = UIUtil.dip2px(context, 3.0d);
        this.f72360f = UIUtil.dip2px(context, 14.0d);
        this.f72359e = UIUtil.dip2px(context, 8.0d);
    }

    public int getLineColor() {
        return this.f72358d;
    }

    public int getLineHeight() {
        return this.f72357c;
    }

    public Interpolator getStartInterpolator() {
        return this.f72364j;
    }

    public int getTriangleHeight() {
        return this.f72359e;
    }

    public int getTriangleWidth() {
        return this.f72360f;
    }

    public float getYOffset() {
        return this.f72362h;
    }

    public boolean isReverse() {
        return this.f72361g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f72356b.setColor(this.f72358d);
        if (this.f72361g) {
            canvas.drawRect(0.0f, (getHeight() - this.f72362h) - this.f72359e, getWidth(), ((getHeight() - this.f72362h) - this.f72359e) + this.f72357c, this.f72356b);
        } else {
            canvas.drawRect(0.0f, (getHeight() - this.f72357c) - this.f72362h, getWidth(), getHeight() - this.f72362h, this.f72356b);
        }
        this.f72363i.reset();
        if (this.f72361g) {
            this.f72363i.moveTo(this.f72365k - (this.f72360f / 2), (getHeight() - this.f72362h) - this.f72359e);
            this.f72363i.lineTo(this.f72365k, getHeight() - this.f72362h);
            this.f72363i.lineTo(this.f72365k + (this.f72360f / 2), (getHeight() - this.f72362h) - this.f72359e);
        } else {
            this.f72363i.moveTo(this.f72365k - (this.f72360f / 2), getHeight() - this.f72362h);
            this.f72363i.lineTo(this.f72365k, (getHeight() - this.f72359e) - this.f72362h);
            this.f72363i.lineTo(this.f72365k + (this.f72360f / 2), getHeight() - this.f72362h);
        }
        this.f72363i.close();
        canvas.drawPath(this.f72363i, this.f72356b);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72355a;
        if (list != null && !list.isEmpty()) {
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72355a, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72355a, i + 1);
            int i3 = imitativePositionData.mLeft;
            float f2 = i3 + ((imitativePositionData.mRight - i3) / 2);
            int i4 = imitativePositionData2.mLeft;
            this.f72365k = f2 + (((i4 + ((imitativePositionData2.mRight - i4) / 2)) - f2) * this.f72364j.getInterpolation(f));
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72355a = list;
    }

    public void setLineColor(int i) {
        this.f72358d = i;
    }

    public void setLineHeight(int i) {
        this.f72357c = i;
    }

    public void setReverse(boolean z) {
        this.f72361g = z;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72364j = interpolator;
        if (interpolator == null) {
            this.f72364j = new LinearInterpolator();
        }
    }

    public void setTriangleHeight(int i) {
        this.f72359e = i;
    }

    public void setTriangleWidth(int i) {
        this.f72360f = i;
    }

    public void setYOffset(float f) {
        this.f72362h = f;
    }
}
