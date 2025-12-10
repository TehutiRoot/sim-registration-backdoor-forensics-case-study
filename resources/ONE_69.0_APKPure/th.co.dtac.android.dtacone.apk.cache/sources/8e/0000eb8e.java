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
    public ValueAnimator f72391b;

    /* renamed from: c */
    public int f72392c;

    /* renamed from: a */
    public List f72390a = new ArrayList();

    /* renamed from: d */
    public int f72393d = 150;

    /* renamed from: e */
    public Interpolator f72394e = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    public Animator.AnimatorListener f72395f = new C12369a();

    /* renamed from: g */
    public ValueAnimator.AnimatorUpdateListener f72396g = new C12370b();

    /* renamed from: net.lucode.hackware.magicindicator.FragmentContainerHelper$a */
    /* loaded from: classes6.dex */
    public class C12369a extends AnimatorListenerAdapter {
        public C12369a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FragmentContainerHelper.this.m26364d(0);
            FragmentContainerHelper.this.f72391b = null;
        }
    }

    /* renamed from: net.lucode.hackware.magicindicator.FragmentContainerHelper$b */
    /* loaded from: classes6.dex */
    public class C12370b implements ValueAnimator.AnimatorUpdateListener {
        public C12370b() {
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
            FragmentContainerHelper.this.m26363e(i, f, 0);
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
        this.f72390a.add(magicIndicator);
    }

    /* renamed from: d */
    public final void m26364d(int i) {
        for (MagicIndicator magicIndicator : this.f72390a) {
            magicIndicator.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: e */
    public final void m26363e(int i, float f, int i2) {
        for (MagicIndicator magicIndicator : this.f72390a) {
            magicIndicator.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: f */
    public final void m26362f(int i) {
        for (MagicIndicator magicIndicator : this.f72390a) {
            magicIndicator.onPageSelected(i);
        }
    }

    public void handlePageSelected(int i) {
        handlePageSelected(i, true);
    }

    public void setDuration(int i) {
        this.f72393d = i;
    }

    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.f72394e = new AccelerateDecelerateInterpolator();
        } else {
            this.f72394e = interpolator;
        }
    }

    public void handlePageSelected(int i, boolean z) {
        if (this.f72392c == i) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.f72391b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m26364d(2);
            }
            m26362f(i);
            float f = this.f72392c;
            ValueAnimator valueAnimator2 = this.f72391b;
            if (valueAnimator2 != null) {
                f = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                this.f72391b.cancel();
                this.f72391b = null;
            }
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.f72391b = valueAnimator3;
            valueAnimator3.setFloatValues(f, i);
            this.f72391b.addUpdateListener(this.f72396g);
            this.f72391b.addListener(this.f72395f);
            this.f72391b.setInterpolator(this.f72394e);
            this.f72391b.setDuration(this.f72393d);
            this.f72391b.start();
        } else {
            m26362f(i);
            ValueAnimator valueAnimator4 = this.f72391b;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                m26363e(this.f72392c, 0.0f, 0);
            }
            m26364d(0);
            m26363e(i, 0.0f, 0);
        }
        this.f72392c = i;
    }

    public FragmentContainerHelper(MagicIndicator magicIndicator) {
        this.f72390a.add(magicIndicator);
    }
}