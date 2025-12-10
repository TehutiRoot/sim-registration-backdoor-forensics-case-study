package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.ArgbEvaluatorHolder;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* loaded from: classes6.dex */
public class BezierPagerIndicator extends View implements IPagerIndicator {

    /* renamed from: a */
    public List f72324a;

    /* renamed from: b */
    public float f72325b;

    /* renamed from: c */
    public float f72326c;

    /* renamed from: d */
    public float f72327d;

    /* renamed from: e */
    public float f72328e;

    /* renamed from: f */
    public float f72329f;

    /* renamed from: g */
    public float f72330g;

    /* renamed from: h */
    public float f72331h;

    /* renamed from: i */
    public Paint f72332i;

    /* renamed from: j */
    public Path f72333j;

    /* renamed from: k */
    public List f72334k;

    /* renamed from: l */
    public Interpolator f72335l;

    /* renamed from: m */
    public Interpolator f72336m;

    public BezierPagerIndicator(Context context) {
        super(context);
        this.f72333j = new Path();
        this.f72335l = new AccelerateInterpolator();
        this.f72336m = new DecelerateInterpolator();
        m26084b(context);
    }

    /* renamed from: a */
    public final void m26085a(Canvas canvas) {
        this.f72333j.reset();
        float height = (getHeight() - this.f72329f) - this.f72330g;
        this.f72333j.moveTo(this.f72328e, height);
        this.f72333j.lineTo(this.f72328e, height - this.f72327d);
        Path path = this.f72333j;
        float f = this.f72328e;
        float f2 = this.f72326c;
        path.quadTo(f + ((f2 - f) / 2.0f), height, f2, height - this.f72325b);
        this.f72333j.lineTo(this.f72326c, this.f72325b + height);
        Path path2 = this.f72333j;
        float f3 = this.f72328e;
        path2.quadTo(((this.f72326c - f3) / 2.0f) + f3, height, f3, this.f72327d + height);
        this.f72333j.close();
        canvas.drawPath(this.f72333j, this.f72332i);
    }

    /* renamed from: b */
    public final void m26084b(Context context) {
        Paint paint = new Paint(1);
        this.f72332i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72330g = UIUtil.dip2px(context, 3.5d);
        this.f72331h = UIUtil.dip2px(context, 2.0d);
        this.f72329f = UIUtil.dip2px(context, 1.5d);
    }

    public float getMaxCircleRadius() {
        return this.f72330g;
    }

    public float getMinCircleRadius() {
        return this.f72331h;
    }

    public float getYOffset() {
        return this.f72329f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f72326c, (getHeight() - this.f72329f) - this.f72330g, this.f72325b, this.f72332i);
        canvas.drawCircle(this.f72328e, (getHeight() - this.f72329f) - this.f72330g, this.f72327d, this.f72332i);
        m26085a(canvas);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72324a;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f72334k;
            if (list2 != null && list2.size() > 0) {
                this.f72332i.setColor(ArgbEvaluatorHolder.eval(f, ((Integer) this.f72334k.get(Math.abs(i) % this.f72334k.size())).intValue(), ((Integer) this.f72334k.get(Math.abs(i + 1) % this.f72334k.size())).intValue()));
            }
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72324a, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72324a, i + 1);
            int i3 = imitativePositionData.mLeft;
            float f2 = i3 + ((imitativePositionData.mRight - i3) / 2);
            int i4 = imitativePositionData2.mLeft;
            float f3 = (i4 + ((imitativePositionData2.mRight - i4) / 2)) - f2;
            this.f72326c = (this.f72335l.getInterpolation(f) * f3) + f2;
            this.f72328e = f2 + (f3 * this.f72336m.getInterpolation(f));
            float f4 = this.f72330g;
            this.f72325b = f4 + ((this.f72331h - f4) * this.f72336m.getInterpolation(f));
            float f5 = this.f72331h;
            this.f72327d = f5 + ((this.f72330g - f5) * this.f72335l.getInterpolation(f));
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72324a = list;
    }

    public void setColors(Integer... numArr) {
        this.f72334k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f72336m = interpolator;
        if (interpolator == null) {
            this.f72336m = new DecelerateInterpolator();
        }
    }

    public void setMaxCircleRadius(float f) {
        this.f72330g = f;
    }

    public void setMinCircleRadius(float f) {
        this.f72331h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72335l = interpolator;
        if (interpolator == null) {
            this.f72335l = new AccelerateInterpolator();
        }
    }

    public void setYOffset(float f) {
        this.f72329f = f;
    }
}
