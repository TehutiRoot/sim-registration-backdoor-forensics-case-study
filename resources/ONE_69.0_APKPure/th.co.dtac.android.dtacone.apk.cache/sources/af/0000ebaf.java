package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* loaded from: classes6.dex */
public class TestPagerIndicator extends View implements IPagerIndicator {

    /* renamed from: a */
    public Paint f72471a;

    /* renamed from: b */
    public int f72472b;

    /* renamed from: c */
    public int f72473c;

    /* renamed from: d */
    public RectF f72474d;

    /* renamed from: e */
    public RectF f72475e;

    /* renamed from: f */
    public List f72476f;

    public TestPagerIndicator(Context context) {
        super(context);
        this.f72474d = new RectF();
        this.f72475e = new RectF();
        m26342a(context);
    }

    /* renamed from: a */
    private void m26342a(Context context) {
        Paint paint = new Paint(1);
        this.f72471a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f72472b = SupportMenu.CATEGORY_MASK;
        this.f72473c = -16711936;
    }

    public int getInnerRectColor() {
        return this.f72473c;
    }

    public int getOutRectColor() {
        return this.f72472b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f72471a.setColor(this.f72472b);
        canvas.drawRect(this.f72474d, this.f72471a);
        this.f72471a.setColor(this.f72473c);
        canvas.drawRect(this.f72475e, this.f72471a);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List list = this.f72476f;
        if (list != null && !list.isEmpty()) {
            PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f72476f, i);
            PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f72476f, i + 1);
            RectF rectF = this.f72474d;
            int i3 = imitativePositionData.mLeft;
            rectF.left = i3 + ((imitativePositionData2.mLeft - i3) * f);
            int i4 = imitativePositionData.mTop;
            rectF.top = i4 + ((imitativePositionData2.mTop - i4) * f);
            int i5 = imitativePositionData.mRight;
            rectF.right = i5 + ((imitativePositionData2.mRight - i5) * f);
            int i6 = imitativePositionData.mBottom;
            rectF.bottom = i6 + ((imitativePositionData2.mBottom - i6) * f);
            RectF rectF2 = this.f72475e;
            int i7 = imitativePositionData.mContentLeft;
            rectF2.left = i7 + ((imitativePositionData2.mContentLeft - i7) * f);
            int i8 = imitativePositionData.mContentTop;
            rectF2.top = i8 + ((imitativePositionData2.mContentTop - i8) * f);
            int i9 = imitativePositionData.mContentRight;
            rectF2.right = i9 + ((imitativePositionData2.mContentRight - i9) * f);
            int i10 = imitativePositionData.mContentBottom;
            rectF2.bottom = i10 + ((imitativePositionData2.mContentBottom - i10) * f);
            invalidate();
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f72476f = list;
    }

    public void setInnerRectColor(int i) {
        this.f72473c = i;
    }

    public void setOutRectColor(int i) {
        this.f72472b = i;
    }
}