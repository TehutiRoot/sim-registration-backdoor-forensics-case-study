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
    public List f72446a;

    /* renamed from: b */
    public float f72447b;

    /* renamed from: c */
    public float f72448c;

    /* renamed from: d */
    public float f72449d;

    /* renamed from: e */
    public float f72450e;

    /* renamed from: f */
    public float f72451f;

    /* renamed from: g */
    public float f72452g;

    /* renamed from: h */
    public float f72453h;

    /* renamed from: i */
    public Paint f72454i;

    /* renamed from: j */
    public Path f72455j;

    /* renamed from: k */
    public List f72456k;

    /* renamed from: l */
    public Interpolator f72457l;

    /* renamed from: m */
    public Interpolator f72458m;

    public BezierPagerIndicator(Context context) {
        super(context);
        this.f72455j = new Path();
        this.f72457l = new AccelerateInterpolator();
        this.f72458m = new DecelerateInterpolator();
        m26344b(context);
    }

    /* renamed from: a */
    public final void m26345a(Canvas canvas) {
        this.f72455j.reset();
        float height = (getHeight() - this.f72451f) - this.f72452g;
        this.f72455j.moveTo(this.f72450e, height);
        this.f72455j.lineTo(this.f72450e, height - this.f72449d);
        Path path = this.f72455j;
        float f = this.f72450e;
        float f2 = this.f72448c;
        path.quadTo(f + ((f2 - f) / 2.0f), height, f2, height - this.f72447b);
        this.f72455j.lineTo(this.f72448c, this.f72447b + height);
        Path path2 = this.f72455j;
        float f3 = this.f72450e;
        path2.quadTo(((this.f72448c - f3) / 2.0f) + f3, height, f3, this.f72449d + height);
        this.f72455j.close();
        canvas.drawPath(this.f72455j, this.f72454i);
    }

    /* renamed from: b */
    public final void m26344b(Context context) {
        Paint paint = new Paint(1);
        this.f72454i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72452g = UIUtil.dip2px(context, 3.5d);
        this.f72453h = UIUtil.dip2px(context, 2.0d);
        this.f72451f = UIUtil.dip2px(context, 1.5d);
    }

    public float getMaxCircleRadius() {
        return this.f72452g;
    }

    public float getMinCircleRadius() {
        return this.f72453h;
    }

    public float getYOffset() {
        return this.f72451f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f72448c, (getHeight() - this.f72451f) - this.f72452g, this.f72447b, this.f72454i);
        canvas.drawCircle(this.f72450e, (getHeight() - this.f72451f) - this.f72452g, this.f72449d, this.f72454i);
        m26345a(canvas);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72446a;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f72456k;
            if (list2 != null && list2.size() > 0) {
                this.f72454i.setColor(ArgbEvaluatorHolder.eval(f, ((Integer) this.f72456k.get(Math.abs(i) % this.f72456k.size())).intValue(), ((Integer) this.f72456k.get(Math.abs(i + 1) % this.f72456k.size())).intValue()));
            }
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72446a, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72446a, i + 1);
            int i3 = imitativePositionData.mLeft;
            float f2 = i3 + ((imitativePositionData.mRight - i3) / 2);
            int i4 = imitativePositionData2.mLeft;
            float f3 = (i4 + ((imitativePositionData2.mRight - i4) / 2)) - f2;
            this.f72448c = (this.f72457l.getInterpolation(f) * f3) + f2;
            this.f72450e = f2 + (f3 * this.f72458m.getInterpolation(f));
            float f4 = this.f72452g;
            this.f72447b = f4 + ((this.f72453h - f4) * this.f72458m.getInterpolation(f));
            float f5 = this.f72453h;
            this.f72449d = f5 + ((this.f72452g - f5) * this.f72457l.getInterpolation(f));
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72446a = list;
    }

    public void setColors(Integer... numArr) {
        this.f72456k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f72458m = interpolator;
        if (interpolator == null) {
            this.f72458m = new DecelerateInterpolator();
        }
    }

    public void setMaxCircleRadius(float f) {
        this.f72452g = f;
    }

    public void setMinCircleRadius(float f) {
        this.f72453h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72457l = interpolator;
        if (interpolator == null) {
            this.f72457l = new AccelerateInterpolator();
        }
    }

    public void setYOffset(float f) {
        this.f72451f = f;
    }
}