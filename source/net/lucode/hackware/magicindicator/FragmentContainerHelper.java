package net.lucode.hackware.magicindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

@TargetApi(11)
/* loaded from: classes6.dex */
public class FragmentContainerHelper {

    /* renamed from: b */
    public ValueAnimator f72269b;

    /* renamed from: c */
    public int f72270c;

    /* renamed from: a */
    public List f72268a = new ArrayList();

    /* renamed from: d */
    public int f72271d = 150;

    /* renamed from: e */
    public Interpolator f72272e = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    public Animator.AnimatorListener f72273f = new C12372a();

    /* renamed from: g */
    public ValueAnimator.AnimatorUpdateListener f72274g = new C12373b();

    /* renamed from: net.lucode.hackware.magicindicator.FragmentContainerHelper$a */
    /* loaded from: classes6.dex */
    public class C12372a extends AnimatorListenerAdapter {
        public C12372a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FragmentContainerHelper.this.m26104d(0);
            FragmentContainerHelper.this.f72269b = null;
        }
    }

    /* renamed from: net.lucode.hackware.magicindicator.FragmentContainerHelper$b */
    /* loaded from: classes6.dex */
    public class C12373b implements ValueAnimator.AnimatorUpdateListener {
        public C12373b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = (int) floatValue;
            float f = floatValue - i;
            if (floatValue < 0.0f) {
                i--;
                f += 1.0f;
            }
            FragmentContainerHelper.this.m26103e(i, f, 0);
        }
    }

    public FragmentContainerHelper() {
    }

    public static PositionData getImitativePositionData(List<PositionData> list, int i) {
        PositionData positionData;
        if (i >= 0 && i <= list.size() - 1) {
            return list.get(i);
        }
        PositionData positionData2 = new PositionData();
        if (i < 0) {
            positionData = list.get(0);
        } else {
            i = (i - list.size()) + 1;
            positionData = list.get(list.size() - 1);
        }
        positionData2.mLeft = positionData.mLeft + (positionData.width() * i);
        positionData2.mTop = positionData.mTop;
        positionData2.mRight = positionData.mRight + (positionData.width() * i);
        positionData2.mBottom = positionData.mBottom;
        positionData2.mContentLeft = positionData.mContentLeft + (positionData.width() * i);
        positionData2.mContentTop = positionData.mContentTop;
        positionData2.mContentRight = positionData.mContentRight + (i * positionData.width());
        positionData2.mContentBottom = positionData.mContentBottom;
        return positionData2;
    }

    public void attachMagicIndicator(MagicIndicator magicIndicator) {
        this.f72268a.add(magicIndicator);
    }

    /* renamed from: d */
    public final void m26104d(int i) {
        for (MagicIndicator magicIndicator : this.f72268a) {
            magicIndicator.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: e */
    public final void m26103e(int i, float f, int i2) {
        for (MagicIndicator magicIndicator : this.f72268a) {
            magicIndicator.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: f */
    public final void m26102f(int i) {
        for (MagicIndicator magicIndicator : this.f72268a) {
            magicIndicator.onPageSelected(i);
        }
    }

    public void handlePageSelected(int i) {
        handlePageSelected(i, true);
    }

    public void setDuration(int i) {
        this.f72271d = i;
    }

    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.f72272e = new AccelerateDecelerateInterpolator();
        } else {
            this.f72272e = interpolator;
        }
    }

    public void handlePageSelected(int i, boolean z) {
        if (this.f72270c == i) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.f72269b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m26104d(2);
            }
            m26102f(i);
            float f = this.f72270c;
            ValueAnimator valueAnimator2 = this.f72269b;
            if (valueAnimator2 != null) {
                f = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                this.f72269b.cancel();
                this.f72269b = null;
            }
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.f72269b = valueAnimator3;
            valueAnimator3.setFloatValues(f, i);
            this.f72269b.addUpdateListener(this.f72274g);
            this.f72269b.addListener(this.f72273f);
            this.f72269b.setInterpolator(this.f72272e);
            this.f72269b.setDuration(this.f72271d);
            this.f72269b.start();
        } else {
            m26102f(i);
            ValueAnimator valueAnimator4 = this.f72269b;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                m26103e(this.f72270c, 0.0f, 0);
            }
            m26104d(0);
            m26103e(i, 0.0f, 0);
        }
        this.f72270c = i;
    }

    public FragmentContainerHelper(MagicIndicator magicIndicator) {
        this.f72268a.add(magicIndicator);
    }
}
