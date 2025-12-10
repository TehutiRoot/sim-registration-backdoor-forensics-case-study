package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.ArgbEvaluatorHolder;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* loaded from: classes6.dex */
public class LinePagerIndicator extends View implements IPagerIndicator {
    public static final int MODE_EXACTLY = 2;
    public static final int MODE_MATCH_EDGE = 0;
    public static final int MODE_WRAP_CONTENT = 1;

    /* renamed from: a */
    public int f72337a;

    /* renamed from: b */
    public Interpolator f72338b;

    /* renamed from: c */
    public Interpolator f72339c;

    /* renamed from: d */
    public float f72340d;

    /* renamed from: e */
    public float f72341e;

    /* renamed from: f */
    public float f72342f;

    /* renamed from: g */
    public float f72343g;

    /* renamed from: h */
    public float f72344h;

    /* renamed from: i */
    public Paint f72345i;

    /* renamed from: j */
    public List f72346j;

    /* renamed from: k */
    public List f72347k;

    /* renamed from: l */
    public RectF f72348l;

    public LinePagerIndicator(Context context) {
        super(context);
        this.f72338b = new LinearInterpolator();
        this.f72339c = new LinearInterpolator();
        this.f72348l = new RectF();
        m26083a(context);
    }

    /* renamed from: a */
    private void m26083a(Context context) {
        Paint paint = new Paint(1);
        this.f72345i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72341e = UIUtil.dip2px(context, 3.0d);
        this.f72343g = UIUtil.dip2px(context, 10.0d);
    }

    public List<Integer> getColors() {
        return this.f72347k;
    }

    public Interpolator getEndInterpolator() {
        return this.f72339c;
    }

    public float getLineHeight() {
        return this.f72341e;
    }

    public float getLineWidth() {
        return this.f72343g;
    }

    public int getMode() {
        return this.f72337a;
    }

    public Paint getPaint() {
        return this.f72345i;
    }

    public float getRoundRadius() {
        return this.f72344h;
    }

    public Interpolator getStartInterpolator() {
        return this.f72338b;
    }

    public float getXOffset() {
        return this.f72342f;
    }

    public float getYOffset() {
        return this.f72340d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f72348l;
        float f = this.f72344h;
        canvas.drawRoundRect(rectF, f, f, this.f72345i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        float width;
        float width2;
        float width3;
        float f2;
        float f3;
        int i3;
        List list = this.f72346j;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f72347k;
            if (list2 != null && list2.size() > 0) {
                this.f72345i.setColor(ArgbEvaluatorHolder.eval(f, ((Integer) this.f72347k.get(Math.abs(i) % this.f72347k.size())).intValue(), ((Integer) this.f72347k.get(Math.abs(i + 1) % this.f72347k.size())).intValue()));
            }
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72346j, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72346j, i + 1);
            int i4 = this.f72337a;
            if (i4 == 0) {
                f3 = this.f72342f;
                width = imitativePositionData.mLeft + f3;
                f2 = imitativePositionData2.mLeft + f3;
                width2 = imitativePositionData.mRight - f3;
                i3 = imitativePositionData2.mRight;
            } else if (i4 == 1) {
                f3 = this.f72342f;
                width = imitativePositionData.mContentLeft + f3;
                f2 = imitativePositionData2.mContentLeft + f3;
                width2 = imitativePositionData.mContentRight - f3;
                i3 = imitativePositionData2.mContentRight;
            } else {
                width = imitativePositionData.mLeft + ((imitativePositionData.width() - this.f72343g) / 2.0f);
                float width4 = imitativePositionData2.mLeft + ((imitativePositionData2.width() - this.f72343g) / 2.0f);
                width2 = ((imitativePositionData.width() + this.f72343g) / 2.0f) + imitativePositionData.mLeft;
                width3 = ((imitativePositionData2.width() + this.f72343g) / 2.0f) + imitativePositionData2.mLeft;
                f2 = width4;
                this.f72348l.left = width + ((f2 - width) * this.f72338b.getInterpolation(f));
                this.f72348l.right = width2 + ((width3 - width2) * this.f72339c.getInterpolation(f));
                this.f72348l.top = (getHeight() - this.f72341e) - this.f72340d;
                this.f72348l.bottom = getHeight() - this.f72340d;
                invalidate();
            }
            width3 = i3 - f3;
            this.f72348l.left = width + ((f2 - width) * this.f72338b.getInterpolation(f));
            this.f72348l.right = width2 + ((width3 - width2) * this.f72339c.getInterpolation(f));
            this.f72348l.top = (getHeight() - this.f72341e) - this.f72340d;
            this.f72348l.bottom = getHeight() - this.f72340d;
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72346j = list;
    }

    public void setColors(Integer... numArr) {
        this.f72347k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f72339c = interpolator;
        if (interpolator == null) {
            this.f72339c = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.f72341e = f;
    }

    public void setLineWidth(float f) {
        this.f72343g = f;
    }

    public void setMode(int i) {
        if (i != 2 && i != 0 && i != 1) {
            throw new IllegalArgumentException("mode " + i + " not supported.");
        }
        this.f72337a = i;
    }

    public void setRoundRadius(float f) {
        this.f72344h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72338b = interpolator;
        if (interpolator == null) {
            this.f72338b = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f72342f = f;
    }

    public void setYOffset(float f) {
        this.f72340d = f;
    }
}
