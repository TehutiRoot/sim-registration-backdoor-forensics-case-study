package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.C4508a;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements C4508a.InterfaceC4510b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;

    /* renamed from: a */
    public float f35064a;

    /* renamed from: b */
    public float f35065b;

    /* renamed from: c */
    public boolean f35066c;

    /* renamed from: d */
    public final Object f35067d;

    /* renamed from: e */
    public final FloatPropertyCompat f35068e;

    /* renamed from: f */
    public boolean f35069f;

    /* renamed from: g */
    public float f35070g;

    /* renamed from: h */
    public float f35071h;

    /* renamed from: i */
    public long f35072i;

    /* renamed from: j */
    public float f35073j;

    /* renamed from: k */
    public final ArrayList f35074k;

    /* renamed from: l */
    public final ArrayList f35075l;
    public static final ViewProperty TRANSLATION_X = new C4496g("translationX");
    public static final ViewProperty TRANSLATION_Y = new C4497h("translationY");
    public static final ViewProperty TRANSLATION_Z = new C4498i("translationZ");
    public static final ViewProperty SCALE_X = new C4499j("scaleX");
    public static final ViewProperty SCALE_Y = new C4500k("scaleY");
    public static final ViewProperty ROTATION = new C4501l(Key.ROTATION);
    public static final ViewProperty ROTATION_X = new C4502m("rotationX");
    public static final ViewProperty ROTATION_Y = new C4503n("rotationY");

    /* renamed from: X */
    public static final ViewProperty f35061X = new C4504o("x");

    /* renamed from: Y */
    public static final ViewProperty f35062Y = new C4490a(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);

    /* renamed from: Z */
    public static final ViewProperty f35063Z = new C4491b("z");
    public static final ViewProperty ALPHA = new C4492c("alpha");
    public static final ViewProperty SCROLL_X = new C4493d("scrollX");
    public static final ViewProperty SCROLL_Y = new C4494e("scrollY");

    /* loaded from: classes2.dex */
    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    /* loaded from: classes2.dex */
    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2);
    }

    /* loaded from: classes2.dex */
    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        public /* synthetic */ ViewProperty(String str, C4496g c4496g) {
            this(str);
        }

        public ViewProperty(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$a */
    /* loaded from: classes2.dex */
    public static class C4490a extends ViewProperty {
        public C4490a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$b */
    /* loaded from: classes2.dex */
    public static class C4491b extends ViewProperty {
        public C4491b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return ViewCompat.getZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            ViewCompat.setZ(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$c */
    /* loaded from: classes2.dex */
    public static class C4492c extends ViewProperty {
        public C4492c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$d */
    /* loaded from: classes2.dex */
    public static class C4493d extends ViewProperty {
        public C4493d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$e */
    /* loaded from: classes2.dex */
    public static class C4494e extends ViewProperty {
        public C4494e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$f */
    /* loaded from: classes2.dex */
    public class C4495f extends FloatPropertyCompat {

        /* renamed from: b */
        public final /* synthetic */ FloatValueHolder f35076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4495f(String str, FloatValueHolder floatValueHolder) {
            super(str);
            this.f35076b = floatValueHolder;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(Object obj) {
            return this.f35076b.getValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f) {
            this.f35076b.setValue(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$g */
    /* loaded from: classes2.dex */
    public static class C4496g extends ViewProperty {
        public C4496g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$h */
    /* loaded from: classes2.dex */
    public static class C4497h extends ViewProperty {
        public C4497h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$i */
    /* loaded from: classes2.dex */
    public static class C4498i extends ViewProperty {
        public C4498i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return ViewCompat.getTranslationZ(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            ViewCompat.setTranslationZ(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$j */
    /* loaded from: classes2.dex */
    public static class C4499j extends ViewProperty {
        public C4499j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$k */
    /* loaded from: classes2.dex */
    public static class C4500k extends ViewProperty {
        public C4500k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$l */
    /* loaded from: classes2.dex */
    public static class C4501l extends ViewProperty {
        public C4501l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$m */
    /* loaded from: classes2.dex */
    public static class C4502m extends ViewProperty {
        public C4502m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$n */
    /* loaded from: classes2.dex */
    public static class C4503n extends ViewProperty {
        public C4503n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$o */
    /* loaded from: classes2.dex */
    public static class C4504o extends ViewProperty {
        public C4504o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$p */
    /* loaded from: classes2.dex */
    public static class C4505p {

        /* renamed from: a */
        public float f35078a;

        /* renamed from: b */
        public float f35079b;
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder) {
        this.f35064a = 0.0f;
        this.f35065b = Float.MAX_VALUE;
        this.f35066c = false;
        this.f35069f = false;
        this.f35070g = Float.MAX_VALUE;
        this.f35071h = -Float.MAX_VALUE;
        this.f35072i = 0L;
        this.f35074k = new ArrayList();
        this.f35075l = new ArrayList();
        this.f35067d = null;
        this.f35068e = new C4495f("FloatValueHolder", floatValueHolder);
        this.f35073j = 1.0f;
    }

    /* renamed from: d */
    public static void m54849d(ArrayList arrayList, Object obj) {
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    /* renamed from: e */
    public static void m54848e(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: a */
    public final void m54852a(boolean z) {
        this.f35069f = false;
        C4508a.m54801d().m54798g(this);
        this.f35072i = 0L;
        this.f35066c = false;
        for (int i = 0; i < this.f35074k.size(); i++) {
            if (this.f35074k.get(i) != null) {
                ((OnAnimationEndListener) this.f35074k.get(i)).onAnimationEnd(this, z, this.f35065b, this.f35064a);
            }
        }
        m54848e(this.f35074k);
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        if (!this.f35074k.contains(onAnimationEndListener)) {
            this.f35074k.add(onAnimationEndListener);
        }
        return this;
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!isRunning()) {
            if (!this.f35075l.contains(onAnimationUpdateListener)) {
                this.f35075l.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: b */
    public final float m54851b() {
        return this.f35068e.getValue(this.f35067d);
    }

    /* renamed from: c */
    public float m54850c() {
        return this.f35073j * 0.75f;
    }

    public void cancel() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f35069f) {
                m54852a(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    @Override // androidx.dynamicanimation.animation.C4508a.InterfaceC4510b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long j) {
        long j2 = this.f35072i;
        if (j2 == 0) {
            this.f35072i = j;
            m54847f(this.f35065b);
            return false;
        }
        this.f35072i = j;
        boolean mo54810i = mo54810i(j - j2);
        float min = Math.min(this.f35065b, this.f35070g);
        this.f35065b = min;
        float max = Math.max(min, this.f35071h);
        this.f35065b = max;
        m54847f(max);
        if (mo54810i) {
            m54852a(false);
        }
        return mo54810i;
    }

    /* renamed from: f */
    public void m54847f(float f) {
        this.f35068e.setValue(this.f35067d, f);
        for (int i = 0; i < this.f35075l.size(); i++) {
            if (this.f35075l.get(i) != null) {
                ((OnAnimationUpdateListener) this.f35075l.get(i)).onAnimationUpdate(this, this.f35065b, this.f35064a);
            }
        }
        m54848e(this.f35075l);
    }

    /* renamed from: g */
    public abstract void mo54811g(float f);

    public float getMinimumVisibleChange() {
        return this.f35073j;
    }

    /* renamed from: h */
    public final void m54846h() {
        if (!this.f35069f) {
            this.f35069f = true;
            if (!this.f35066c) {
                this.f35065b = m54851b();
            }
            float f = this.f35065b;
            if (f <= this.f35070g && f >= this.f35071h) {
                C4508a.m54801d().m54804a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    /* renamed from: i */
    public abstract boolean mo54810i(long j);

    public boolean isRunning() {
        return this.f35069f;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        m54849d(this.f35074k, onAnimationEndListener);
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        m54849d(this.f35075l, onAnimationUpdateListener);
    }

    public T setMaxValue(float f) {
        this.f35070g = f;
        return this;
    }

    public T setMinValue(float f) {
        this.f35071h = f;
        return this;
    }

    public T setMinimumVisibleChange(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f35073j = f;
            mo54811g(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public T setStartValue(float f) {
        this.f35065b = f;
        this.f35066c = true;
        return this;
    }

    public T setStartVelocity(float f) {
        this.f35064a = f;
        return this;
    }

    public void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f35069f) {
                m54846h();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public DynamicAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        this.f35064a = 0.0f;
        this.f35065b = Float.MAX_VALUE;
        this.f35066c = false;
        this.f35069f = false;
        this.f35070g = Float.MAX_VALUE;
        this.f35071h = -Float.MAX_VALUE;
        this.f35072i = 0L;
        this.f35074k = new ArrayList();
        this.f35075l = new ArrayList();
        this.f35067d = obj;
        this.f35068e = floatPropertyCompat;
        if (floatPropertyCompat != ROTATION && floatPropertyCompat != ROTATION_X && floatPropertyCompat != ROTATION_Y) {
            if (floatPropertyCompat == ALPHA) {
                this.f35073j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != SCALE_X && floatPropertyCompat != SCALE_Y) {
                this.f35073j = 1.0f;
                return;
            } else {
                this.f35073j = 0.00390625f;
                return;
            }
        }
        this.f35073j = 0.1f;
    }
}
