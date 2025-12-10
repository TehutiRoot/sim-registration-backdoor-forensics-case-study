package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5655L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* renamed from: c */
    public final InterfaceC5686c f41165c;
    @Nullable
    protected LottieValueCallback<A> valueCallback;

    /* renamed from: a */
    public final List f41163a = new ArrayList(1);

    /* renamed from: b */
    public boolean f41164b = false;
    protected float progress = 0.0f;

    /* renamed from: d */
    public Object f41166d = null;

    /* renamed from: e */
    public float f41167e = -1.0f;

    /* renamed from: f */
    public float f41168f = -1.0f;

    /* loaded from: classes3.dex */
    public interface AnimationListener {
        void onValueChanged();
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$b */
    /* loaded from: classes3.dex */
    public static final class C5685b implements InterfaceC5686c {
        public C5685b() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: a */
        public Keyframe mo50873a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: b */
        public float mo50872b() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: c */
        public boolean mo50871c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: d */
        public boolean mo50870d(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: e */
        public float mo50869e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5686c {
        /* renamed from: a */
        Keyframe mo50873a();

        /* renamed from: b */
        float mo50872b();

        /* renamed from: c */
        boolean mo50871c(float f);

        /* renamed from: d */
        boolean mo50870d(float f);

        /* renamed from: e */
        float mo50869e();

        boolean isEmpty();
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$d */
    /* loaded from: classes3.dex */
    public static final class C5687d implements InterfaceC5686c {

        /* renamed from: a */
        public final List f41169a;

        /* renamed from: c */
        public Keyframe f41171c = null;

        /* renamed from: d */
        public float f41172d = -1.0f;

        /* renamed from: b */
        public Keyframe f41170b = m50874f(0.0f);

        public C5687d(List list) {
            this.f41169a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: a */
        public Keyframe mo50873a() {
            return this.f41170b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: b */
        public float mo50872b() {
            return ((Keyframe) this.f41169a.get(0)).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: c */
        public boolean mo50871c(float f) {
            Keyframe keyframe = this.f41171c;
            Keyframe keyframe2 = this.f41170b;
            if (keyframe == keyframe2 && this.f41172d == f) {
                return true;
            }
            this.f41171c = keyframe2;
            this.f41172d = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: d */
        public boolean mo50870d(float f) {
            if (this.f41170b.containsProgress(f)) {
                return !this.f41170b.isStatic();
            }
            this.f41170b = m50874f(f);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: e */
        public float mo50869e() {
            List list = this.f41169a;
            return ((Keyframe) list.get(list.size() - 1)).getEndProgress();
        }

        /* renamed from: f */
        public final Keyframe m50874f(float f) {
            List list = this.f41169a;
            Keyframe keyframe = (Keyframe) list.get(list.size() - 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = this.f41169a.size() - 2; size >= 1; size--) {
                Keyframe keyframe2 = (Keyframe) this.f41169a.get(size);
                if (this.f41170b != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
            }
            return (Keyframe) this.f41169a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$e */
    /* loaded from: classes3.dex */
    public static final class C5688e implements InterfaceC5686c {

        /* renamed from: a */
        public final Keyframe f41173a;

        /* renamed from: b */
        public float f41174b = -1.0f;

        public C5688e(List list) {
            this.f41173a = (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: a */
        public Keyframe mo50873a() {
            return this.f41173a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: b */
        public float mo50872b() {
            return this.f41173a.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: c */
        public boolean mo50871c(float f) {
            if (this.f41174b == f) {
                return true;
            }
            this.f41174b = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: d */
        public boolean mo50870d(float f) {
            return !this.f41173a.isStatic();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        /* renamed from: e */
        public float mo50869e() {
            return this.f41173a.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5686c
        public boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List list) {
        this.f41165c = m50875d(list);
    }

    /* renamed from: d */
    public static InterfaceC5686c m50875d(List list) {
        if (list.isEmpty()) {
            return new C5685b();
        }
        if (list.size() == 1) {
            return new C5688e(list);
        }
        return new C5687d(list);
    }

    /* renamed from: a */
    public float mo50859a() {
        if (this.f41168f == -1.0f) {
            this.f41168f = this.f41165c.mo50869e();
        }
        return this.f41168f;
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.f41163a.add(animationListener);
    }

    /* renamed from: b */
    public float m50877b() {
        if (this.f41164b) {
            return 0.0f;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    /* renamed from: c */
    public final float m50876c() {
        if (this.f41167e == -1.0f) {
            this.f41167e = this.f41165c.mo50872b();
        }
        return this.f41167e;
    }

    public Keyframe<K> getCurrentKeyframe() {
        C5655L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        Keyframe<K> mo50873a = this.f41165c.mo50873a();
        C5655L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo50873a;
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe != null && !currentKeyframe.isStatic()) {
            return currentKeyframe.interpolator.getInterpolation(m50877b());
        }
        return 0.0f;
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        A a;
        float m50877b = m50877b();
        if (this.valueCallback == null && this.f41165c.mo50871c(m50877b)) {
            return (A) this.f41166d;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        if (interpolator != null && currentKeyframe.yInterpolator != null) {
            a = getValue(currentKeyframe, m50877b, interpolator.getInterpolation(m50877b), currentKeyframe.yInterpolator.getInterpolation(m50877b));
        } else {
            a = (A) getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress());
        }
        this.f41166d = a;
        return a;
    }

    public abstract Object getValue(Keyframe keyframe, float f);

    public void notifyListeners() {
        for (int i = 0; i < this.f41163a.size(); i++) {
            ((AnimationListener) this.f41163a.get(i)).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.f41164b = true;
    }

    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        if (this.f41165c.isEmpty()) {
            return;
        }
        if (f < m50876c()) {
            f = m50876c();
        } else if (f > mo50859a()) {
            f = mo50859a();
        }
        if (f == this.progress) {
            return;
        }
        this.progress = f;
        if (this.f41165c.mo50870d(f)) {
            notifyListeners();
        }
    }

    public void setValueCallback(@Nullable LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public A getValue(Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
