package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5644L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* renamed from: c */
    public final InterfaceC5675c f41177c;
    @Nullable
    protected LottieValueCallback<A> valueCallback;

    /* renamed from: a */
    public final List f41175a = new ArrayList(1);

    /* renamed from: b */
    public boolean f41176b = false;
    protected float progress = 0.0f;

    /* renamed from: d */
    public Object f41178d = null;

    /* renamed from: e */
    public float f41179e = -1.0f;

    /* renamed from: f */
    public float f41180f = -1.0f;

    /* loaded from: classes3.dex */
    public interface AnimationListener {
        void onValueChanged();
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$b */
    /* loaded from: classes3.dex */
    public static final class C5674b implements InterfaceC5675c {
        public C5674b() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: a */
        public Keyframe mo50870a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: b */
        public float mo50869b() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: c */
        public boolean mo50868c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: d */
        public boolean mo50867d(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: e */
        public float mo50866e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5675c {
        /* renamed from: a */
        Keyframe mo50870a();

        /* renamed from: b */
        float mo50869b();

        /* renamed from: c */
        boolean mo50868c(float f);

        /* renamed from: d */
        boolean mo50867d(float f);

        /* renamed from: e */
        float mo50866e();

        boolean isEmpty();
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$d */
    /* loaded from: classes3.dex */
    public static final class C5676d implements InterfaceC5675c {

        /* renamed from: a */
        public final List f41181a;

        /* renamed from: c */
        public Keyframe f41183c = null;

        /* renamed from: d */
        public float f41184d = -1.0f;

        /* renamed from: b */
        public Keyframe f41182b = m50871f(0.0f);

        public C5676d(List list) {
            this.f41181a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: a */
        public Keyframe mo50870a() {
            return this.f41182b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: b */
        public float mo50869b() {
            return ((Keyframe) this.f41181a.get(0)).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: c */
        public boolean mo50868c(float f) {
            Keyframe keyframe = this.f41183c;
            Keyframe keyframe2 = this.f41182b;
            if (keyframe == keyframe2 && this.f41184d == f) {
                return true;
            }
            this.f41183c = keyframe2;
            this.f41184d = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: d */
        public boolean mo50867d(float f) {
            if (this.f41182b.containsProgress(f)) {
                return !this.f41182b.isStatic();
            }
            this.f41182b = m50871f(f);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: e */
        public float mo50866e() {
            List list = this.f41181a;
            return ((Keyframe) list.get(list.size() - 1)).getEndProgress();
        }

        /* renamed from: f */
        public final Keyframe m50871f(float f) {
            List list = this.f41181a;
            Keyframe keyframe = (Keyframe) list.get(list.size() - 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = this.f41181a.size() - 2; size >= 1; size--) {
                Keyframe keyframe2 = (Keyframe) this.f41181a.get(size);
                if (this.f41182b != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
            }
            return (Keyframe) this.f41181a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$e */
    /* loaded from: classes3.dex */
    public static final class C5677e implements InterfaceC5675c {

        /* renamed from: a */
        public final Keyframe f41185a;

        /* renamed from: b */
        public float f41186b = -1.0f;

        public C5677e(List list) {
            this.f41185a = (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: a */
        public Keyframe mo50870a() {
            return this.f41185a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: b */
        public float mo50869b() {
            return this.f41185a.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: c */
        public boolean mo50868c(float f) {
            if (this.f41186b == f) {
                return true;
            }
            this.f41186b = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: d */
        public boolean mo50867d(float f) {
            return !this.f41185a.isStatic();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        /* renamed from: e */
        public float mo50866e() {
            return this.f41185a.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.InterfaceC5675c
        public boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List list) {
        this.f41177c = m50872d(list);
    }

    /* renamed from: d */
    public static InterfaceC5675c m50872d(List list) {
        if (list.isEmpty()) {
            return new C5674b();
        }
        if (list.size() == 1) {
            return new C5677e(list);
        }
        return new C5676d(list);
    }

    /* renamed from: a */
    public float mo50856a() {
        if (this.f41180f == -1.0f) {
            this.f41180f = this.f41177c.mo50866e();
        }
        return this.f41180f;
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.f41175a.add(animationListener);
    }

    /* renamed from: b */
    public float m50874b() {
        if (this.f41176b) {
            return 0.0f;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    /* renamed from: c */
    public final float m50873c() {
        if (this.f41179e == -1.0f) {
            this.f41179e = this.f41177c.mo50869b();
        }
        return this.f41179e;
    }

    public Keyframe<K> getCurrentKeyframe() {
        C5644L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        Keyframe<K> mo50870a = this.f41177c.mo50870a();
        C5644L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo50870a;
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe != null && !currentKeyframe.isStatic()) {
            return currentKeyframe.interpolator.getInterpolation(m50874b());
        }
        return 0.0f;
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        A a;
        float m50874b = m50874b();
        if (this.valueCallback == null && this.f41177c.mo50868c(m50874b)) {
            return (A) this.f41178d;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        if (interpolator != null && currentKeyframe.yInterpolator != null) {
            a = getValue(currentKeyframe, m50874b, interpolator.getInterpolation(m50874b), currentKeyframe.yInterpolator.getInterpolation(m50874b));
        } else {
            a = (A) getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress());
        }
        this.f41178d = a;
        return a;
    }

    public abstract Object getValue(Keyframe keyframe, float f);

    public void notifyListeners() {
        for (int i = 0; i < this.f41175a.size(); i++) {
            ((AnimationListener) this.f41175a.get(i)).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.f41176b = true;
    }

    public void setProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        if (this.f41177c.isEmpty()) {
            return;
        }
        if (f < m50873c()) {
            f = m50873c();
        } else if (f > mo50856a()) {
            f = mo50856a();
        }
        if (f == this.progress) {
            return;
        }
        this.progress = f;
        if (this.f41177c.mo50867d(f)) {
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