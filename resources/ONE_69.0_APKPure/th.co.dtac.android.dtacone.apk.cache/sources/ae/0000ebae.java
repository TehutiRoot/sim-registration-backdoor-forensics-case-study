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
    public int f72459a;

    /* renamed from: b */
    public Interpolator f72460b;

    /* renamed from: c */
    public Interpolator f72461c;

    /* renamed from: d */
    public float f72462d;

    /* renamed from: e */
    public float f72463e;

    /* renamed from: f */
    public float f72464f;

    /* renamed from: g */
    public float f72465g;

    /* renamed from: h */
    public float f72466h;

    /* renamed from: i */
    public Paint f72467i;

    /* renamed from: j */
    public List f72468j;

    /* renamed from: k */
    public List f72469k;

    /* renamed from: l */
    public RectF f72470l;

    public LinePagerIndicator(Context context) {
        super(context);
        this.f72460b = new LinearInterpolator();
        this.f72461c = new LinearInterpolator();
        this.f72470l = new RectF();
        m26343a(context);
    }

    /* renamed from: a */
    private void m26343a(Context context) {
        Paint paint = new Paint(1);
        this.f72467i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f72463e = UIUtil.dip2px(context, 3.0d);
        this.f72465g = UIUtil.dip2px(context, 10.0d);
    }

    public List<Integer> getColors() {
        return this.f72469k;
    }

    public Interpolator getEndInterpolator() {
        return this.f72461c;
    }

    public float getLineHeight() {
        return this.f72463e;
    }

    public float getLineWidth() {
        return this.f72465g;
    }

    public int getMode() {
        return this.f72459a;
    }

    public Paint getPaint() {
        return this.f72467i;
    }

    public float getRoundRadius() {
        return this.f72466h;
    }

    public Interpolator getStartInterpolator() {
        return this.f72460b;
    }

    public float getXOffset() {
        return this.f72464f;
    }

    public float getYOffset() {
        return this.f72462d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f72470l;
        float f = this.f72466h;
        canvas.drawRoundRect(rectF, f, f, this.f72467i);
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
        List list = this.f72468j;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f72469k;
            if (list2 != null && list2.size() > 0) {
                this.f72467i.setColor(ArgbEvaluatorHolder.eval(f, ((Integer) this.f72469k.get(Math.abs(i) % this.f72469k.size())).intValue(), ((Integer) this.f72469k.get(Math.abs(i + 1) % this.f72469k.size())).intValue()));
            }
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72468j, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72468j, i + 1);
            int i4 = this.f72459a;
            if (i4 == 0) {
                f3 = this.f72464f;
                width = imitativePositionData.mLeft + f3;
                f2 = imitativePositionData2.mLeft + f3;
                width2 = imitativePositionData.mRight - f3;
                i3 = imitativePositionData2.mRight;
            } else if (i4 == 1) {
                f3 = this.f72464f;
                width = imitativePositionData.mContentLeft + f3;
                f2 = imitativePositionData2.mContentLeft + f3;
                width2 = imitativePositionData.mContentRight - f3;
                i3 = imitativePositionData2.mContentRight;
            } else {
                width = imitativePositionData.mLeft + ((imitativePositionData.width() - this.f72465g) / 2.0f);
                float width4 = imitativePositionData2.mLeft + ((imitativePositionData2.width() - this.f72465g) / 2.0f);
                width2 = ((imitativePositionData.width() + this.f72465g) / 2.0f) + imitativePositionData.mLeft;
                width3 = ((imitativePositionData2.width() + this.f72465g) / 2.0f) + imitativePositionData2.mLeft;
                f2 = width4;
                this.f72470l.left = width + ((f2 - width) * this.f72460b.getInterpolation(f));
                this.f72470l.right = width2 + ((width3 - width2) * this.f72461c.getInterpolation(f));
                this.f72470l.top = (getHeight() - this.f72463e) - this.f72462d;
                this.f72470l.bottom = getHeight() - this.f72462d;
                invalidate();
            }
            width3 = i3 - f3;
            this.f72470l.left = width + ((f2 - width) * this.f72460b.getInterpolation(f));
            this.f72470l.right = width2 + ((width3 - width2) * this.f72461c.getInterpolation(f));
            this.f72470l.top = (getHeight() - this.f72463e) - this.f72462d;
            this.f72470l.bottom = getHeight() - this.f72462d;
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72468j = list;
    }

    public void setColors(Integer... numArr) {
        this.f72469k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f72461c = interpolator;
        if (interpolator == null) {
            this.f72461c = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.f72463e = f;
    }

    public void setLineWidth(float f) {
        this.f72465g = f;
    }

    public void setMode(int i) {
        if (i != 2 && i != 0 && i != 1) {
            throw new IllegalArgumentException("mode " + i + " not supported.");
        }
        this.f72459a = i;
    }

    public void setRoundRadius(float f) {
        this.f72466h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f72460b = interpolator;
        if (interpolator == null) {
            this.f72460b = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f72464f = f;
    }

    public void setYOffset(float f) {
        this.f72462d = f;
    }
}