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
    public int f72488a;

    /* renamed from: b */
    public int f72489b;

    /* renamed from: c */
    public int f72490c;

    /* renamed from: d */
    public float f72491d;

    /* renamed from: e */
    public Interpolator f72492e;

    /* renamed from: f */
    public Interpolator f72493f;

    /* renamed from: g */
    public List f72494g;

    /* renamed from: h */
    public Paint f72495h;

    /* renamed from: i */
    public RectF f72496i;

    /* renamed from: j */
    public boolean f72497j;

    public WrapPagerIndicator(Context context) {
        super(context);
        this.f72492e = new LinearInterpolator();
        this.f72493f = new LinearInterpolator();
        this.f72496i = new RectF();
        m26340a(context);
    }

    /* renamed from: a */
    private void m26340a(Context context) {
        Paint paint = new Paint(1);
        this.f72495h = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72488a = UIUtil.dip2px(context, 6.0d);
        this.f72489b = UIUtil.dip2px(context, 10.0d);
    }

    public Interpolator getEndInterpolator() {
        return this.f72493f;
    }

    public int getFillColor() {
        return this.f72490c;
    }

    public int getHorizontalPadding() {
        return this.f72489b;
    }

    public Paint getPaint() {
        return this.f72495h;
    }

    public float getRoundRadius() {
        return this.f72491d;
    }

    public Interpolator getStartInterpolator() {
        return this.f72492e;
    }

    public int getVerticalPadding() {
        return this.f72488a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f72495h.setColor(this.f72490c);
        RectF rectF = this.f72496i;
        float f = this.f72491d;
        canvas.drawRoundRect(rectF, f, f, this.f72495h);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72494g;
        if (list != null && !list.isEmpty()) {
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72494g, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72494g, i + 1);
            RectF rectF = this.f72496i;
            int i3 = imitativePositionData.mContentLeft;
            rectF.left = (i3 - this.f72489b) + ((imitativePositionData2.mContentLeft - i3) * this.f72493f.getInterpolation(f));
            RectF rectF2 = this.f72496i;
            rectF2.top = imitativePositionData.mContentTop - this.f72488a;
            int i4 = imitativePositionData.mContentRight;
            rectF2.right = this.f72489b + i4 + ((imitativePositionData2.mContentRight - i4) * this.f72492e.getInterpolation(f));
            RectF rectF3 = this.f72496i;
            rectF3.bottom = imitativePositionData.mContentBottom + this.f72488a;
            if (!this.f72497j) {
                this.f72491d = rectF3.height() / 2.0f;
            }
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72494g = list;
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f72493f = interpolator;
        if (interpolator == null) {
            this.f72493f = new LinearInterpolator();
        }
    }

    public void setFillColor(int i) {
        this.f72490c = i;
    }

    public void setHorizontalPadding(int i) {
        this.f72489b = i;
    }

    public void setRoundRadius(float f) {
        this.f72491d = f;
        this.f72497j = true;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72492e = interpolator;
        if (interpolator == null) {
            this.f72492e = new LinearInterpolator();
        }
    }

    public void setVerticalPadding(int i) {
        this.f72488a = i;
    }
}