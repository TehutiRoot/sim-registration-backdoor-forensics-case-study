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
    public List f72477a;

    /* renamed from: b */
    public Paint f72478b;

    /* renamed from: c */
    public int f72479c;

    /* renamed from: d */
    public int f72480d;

    /* renamed from: e */
    public int f72481e;

    /* renamed from: f */
    public int f72482f;

    /* renamed from: g */
    public boolean f72483g;

    /* renamed from: h */
    public float f72484h;

    /* renamed from: i */
    public Path f72485i;

    /* renamed from: j */
    public Interpolator f72486j;

    /* renamed from: k */
    public float f72487k;

    public TriangularPagerIndicator(Context context) {
        super(context);
        this.f72485i = new Path();
        this.f72486j = new LinearInterpolator();
        m26341a(context);
    }

    /* renamed from: a */
    private void m26341a(Context context) {
        Paint paint = new Paint(1);
        this.f72478b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72479c = UIUtil.dip2px(context, 3.0d);
        this.f72482f = UIUtil.dip2px(context, 14.0d);
        this.f72481e = UIUtil.dip2px(context, 8.0d);
    }

    public int getLineColor() {
        return this.f72480d;
    }

    public int getLineHeight() {
        return this.f72479c;
    }

    public Interpolator getStartInterpolator() {
        return this.f72486j;
    }

    public int getTriangleHeight() {
        return this.f72481e;
    }

    public int getTriangleWidth() {
        return this.f72482f;
    }

    public float getYOffset() {
        return this.f72484h;
    }

    public boolean isReverse() {
        return this.f72483g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f72478b.setColor(this.f72480d);
        if (this.f72483g) {
            canvas.drawRect(0.0f, (getHeight() - this.f72484h) - this.f72481e, getWidth(), ((getHeight() - this.f72484h) - this.f72481e) + this.f72479c, this.f72478b);
        } else {
            canvas.drawRect(0.0f, (getHeight() - this.f72479c) - this.f72484h, getWidth(), getHeight() - this.f72484h, this.f72478b);
        }
        this.f72485i.reset();
        if (this.f72483g) {
            this.f72485i.moveTo(this.f72487k - (this.f72482f / 2), (getHeight() - this.f72484h) - this.f72481e);
            this.f72485i.lineTo(this.f72487k, getHeight() - this.f72484h);
            this.f72485i.lineTo(this.f72487k + (this.f72482f / 2), (getHeight() - this.f72484h) - this.f72481e);
        } else {
            this.f72485i.moveTo(this.f72487k - (this.f72482f / 2), getHeight() - this.f72484h);
            this.f72485i.lineTo(this.f72487k, (getHeight() - this.f72481e) - this.f72484h);
            this.f72485i.lineTo(this.f72487k + (this.f72482f / 2), getHeight() - this.f72484h);
        }
        this.f72485i.close();
        canvas.drawPath(this.f72485i, this.f72478b);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72477a;
        if (list != null && !list.isEmpty()) {
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72477a, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72477a, i + 1);
            int i3 = imitativePositionData.mLeft;
            float f2 = i3 + ((imitativePositionData.mRight - i3) / 2);
            int i4 = imitativePositionData2.mLeft;
            this.f72487k = f2 + (((i4 + ((imitativePositionData2.mRight - i4) / 2)) - f2) * this.f72486j.getInterpolation(f));
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72477a = list;
    }

    public void setLineColor(int i) {
        this.f72480d = i;
    }

    public void setLineHeight(int i) {
        this.f72479c = i;
    }

    public void setReverse(boolean z) {
        this.f72483g = z;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72486j = interpolator;
        if (interpolator == null) {
            this.f72486j = new LinearInterpolator();
        }
    }

    public void setTriangleHeight(int i) {
        this.f72481e = i;
    }

    public void setTriangleWidth(int i) {
        this.f72482f = i;
    }

    public void setYOffset(float f) {
        this.f72484h = f;
    }
}