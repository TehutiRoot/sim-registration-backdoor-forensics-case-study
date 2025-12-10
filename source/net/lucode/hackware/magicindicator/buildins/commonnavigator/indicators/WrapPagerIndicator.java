package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* loaded from: classes6.dex */
public class WrapPagerIndicator extends View implements IPagerIndicator {

    /* renamed from: a */
    public int f72366a;

    /* renamed from: b */
    public int f72367b;

    /* renamed from: c */
    public int f72368c;

    /* renamed from: d */
    public float f72369d;

    /* renamed from: e */
    public Interpolator f72370e;

    /* renamed from: f */
    public Interpolator f72371f;

    /* renamed from: g */
    public List f72372g;

    /* renamed from: h */
    public Paint f72373h;

    /* renamed from: i */
    public RectF f72374i;

    /* renamed from: j */
    public boolean f72375j;

    public WrapPagerIndicator(Context context) {
        super(context);
        this.f72370e = new LinearInterpolator();
        this.f72371f = new LinearInterpolator();
        this.f72374i = new RectF();
        m26080a(context);
    }

    /* renamed from: a */
    private void m26080a(Context context) {
        Paint paint = new Paint(1);
        this.f72373h = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72366a = UIUtil.dip2px(context, 6.0d);
        this.f72367b = UIUtil.dip2px(context, 10.0d);
    }

    public Interpolator getEndInterpolator() {
        return this.f72371f;
    }

    public int getFillColor() {
        return this.f72368c;
    }

    public int getHorizontalPadding() {
        return this.f72367b;
    }

    public Paint getPaint() {
        return this.f72373h;
    }

    public float getRoundRadius() {
        return this.f72369d;
    }

    public Interpolator getStartInterpolator() {
        return this.f72370e;
    }

    public int getVerticalPadding() {
        return this.f72366a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f72373h.setColor(this.f72368c);
        RectF rectF = this.f72374i;
        float f = this.f72369d;
        canvas.drawRoundRect(rectF, f, f, this.f72373h);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72372g;
        if (list != null && !list.isEmpty()) {
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72372g, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72372g, i + 1);
            RectF rectF = this.f72374i;
            int i3 = imitativePositionData.mContentLeft;
            rectF.left = (i3 - this.f72367b) + ((imitativePositionData2.mContentLeft - i3) * this.f72371f.getInterpolation(f));
            RectF rectF2 = this.f72374i;
            rectF2.top = imitativePositionData.mContentTop - this.f72366a;
            int i4 = imitativePositionData.mContentRight;
            rectF2.right = this.f72367b + i4 + ((imitativePositionData2.mContentRight - i4) * this.f72370e.getInterpolation(f));
            RectF rectF3 = this.f72374i;
            rectF3.bottom = imitativePositionData.mContentBottom + this.f72366a;
            if (!this.f72375j) {
                this.f72369d = rectF3.height() / 2.0f;
            }
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72372g = list;
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f72371f = interpolator;
        if (interpolator == null) {
            this.f72371f = new LinearInterpolator();
        }
    }

    public void setFillColor(int i) {
        this.f72368c = i;
    }

    public void setHorizontalPadding(int i) {
        this.f72367b = i;
    }

    public void setRoundRadius(float f) {
        this.f72369d = f;
        this.f72375j = true;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72370e = interpolator;
        if (interpolator == null) {
            this.f72370e = new LinearInterpolator();
        }
    }

    public void setVerticalPadding(int i) {
        this.f72366a = i;
    }
}
