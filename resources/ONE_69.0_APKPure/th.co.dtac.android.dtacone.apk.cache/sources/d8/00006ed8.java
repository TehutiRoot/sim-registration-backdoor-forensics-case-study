package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.C4490a;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements C4490a.InterfaceC4492b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;

    /* renamed from: a */
    public float f35152a;

    /* renamed from: b */
    public float f35153b;

    /* renamed from: c */
    public boolean f35154c;

    /* renamed from: d */
    public final Object f35155d;

    /* renamed from: e */
    public final FloatPropertyCompat f35156e;

    /* renamed from: f */
    public boolean f35157f;

    /* renamed from: g */
    public float f35158g;

    /* renamed from: h */
    public float f35159h;

    /* renamed from: i */
    public long f35160i;

    /* renamed from: j */
    public float f35161j;

    /* renamed from: k */
    public final ArrayList f35162k;

    /* renamed from: l */
    public final ArrayList f35163l;
    public static final ViewProperty TRANSLATION_X = new C4478g("translationX");
    public static final ViewProperty TRANSLATION_Y = new C4479h("translationY");
    public static final ViewProperty TRANSLATION_Z = new C4480i("translationZ");
    public static final ViewProperty SCALE_X = new C4481j("scaleX");
    public static final ViewProperty SCALE_Y = new C4482k("scaleY");
    public static final ViewProperty ROTATION = new C4483l(Key.ROTATION);
    public static final ViewProperty ROTATION_X = new C4484m("rotationX");
    public static final ViewProperty ROTATION_Y = new C4485n("rotationY");

    /* renamed from: X */
    public static final ViewProperty f35149X = new C4486o("x");

    /* renamed from: Y */
    public static final ViewProperty f35150Y = new C4472a(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);

    /* renamed from: Z */
    public static final ViewProperty f35151Z = new C4473b("z");
    public static final ViewProperty ALPHA = new C4474c("alpha");
    public static final ViewProperty SCROLL_X = new C4475d("scrollX");
    public static final ViewProperty SCROLL_Y = new C4476e("scrollY");

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
        public /* synthetic */ ViewProperty(String str, C4478g c4478g) {
            this(str);
        }

        public ViewProperty(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$a */
    /* loaded from: classes2.dex */
    public static class C4472a extends ViewProperty {
        public C4472a(String str) {
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
    public static class C4473b extends ViewProperty {
        public C4473b(String str) {
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
    public static class C4474c extends ViewProperty {
        public C4474c(String str) {
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
    public static class C4475d extends ViewProperty {
        public C4475d(String str) {
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
    public static class C4476e extends ViewProperty {
        public C4476e(String str) {
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
    public class C4477f extends FloatPropertyCompat {

        /* renamed from: b */
        public final /* synthetic */ FloatValueHolder f35164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4477f(String str, FloatValueHolder floatValueHolder) {
            super(str);
            this.f35164b = floatValueHolder;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(Object obj) {
            return this.f35164b.getValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f) {
            this.f35164b.setValue(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$g */
    /* loaded from: classes2.dex */
    public static class C4478g extends ViewProperty {
        public C4478g(String str) {
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
    public static class C4479h extends ViewProperty {
        public C4479h(String str) {
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
    public static class C4480i extends ViewProperty {
        public C4480i(String str) {
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
    public static class C4481j extends ViewProperty {
        public C4481j(String str) {
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
    public static class C4482k extends ViewProperty {
        public C4482k(String str) {
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
    public static class C4483l extends ViewProperty {
        public C4483l(String str) {
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
    public static class C4484m extends ViewProperty {
        public C4484m(String str) {
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
    public static class C4485n extends ViewProperty {
        public C4485n(String str) {
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
    public static class C4486o extends ViewProperty {
        public C4486o(String str) {
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
    public static class C4487p {

        /* renamed from: a */
        public float f35166a;

        /* renamed from: b */
        public float f35167b;
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder) {
        this.f35152a = 0.0f;
        this.f35153b = Float.MAX_VALUE;
        this.f35154c = false;
        this.f35157f = false;
        this.f35158g = Float.MAX_VALUE;
        this.f35159h = -Float.MAX_VALUE;
        this.f35160i = 0L;
        this.f35162k = new ArrayList();
        this.f35163l = new ArrayList();
        this.f35155d = null;
        this.f35156e = new C4477f("FloatValueHolder", floatValueHolder);
        this.f35161j = 1.0f;
    }

    /* renamed from: d */
    public static void m54799d(ArrayList arrayList, Object obj) {
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    /* renamed from: e */
    public static void m54798e(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: a */
    public final void m54802a(boolean z) {
        this.f35157f = false;
        C4490a.m54751d().m54748g(this);
        this.f35160i = 0L;
        this.f35154c = false;
        for (int i = 0; i < this.f35162k.size(); i++) {
            if (this.f35162k.get(i) != null) {
                ((OnAnimationEndListener) this.f35162k.get(i)).onAnimationEnd(this, z, this.f35153b, this.f35152a);
            }
        }
        m54798e(this.f35162k);
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        if (!this.f35162k.contains(onAnimationEndListener)) {
            this.f35162k.add(onAnimationEndListener);
        }
        return this;
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!isRunning()) {
            if (!this.f35163l.contains(onAnimationUpdateListener)) {
                this.f35163l.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: b */
    public final float m54801b() {
        return this.f35156e.getValue(this.f35155d);
    }

    /* renamed from: c */
    public float m54800c() {
        return this.f35161j * 0.75f;
    }

    public void cancel() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f35157f) {
                m54802a(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    @Override // androidx.dynamicanimation.animation.C4490a.InterfaceC4492b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long j) {
        long j2 = this.f35160i;
        if (j2 == 0) {
            this.f35160i = j;
            m54797f(this.f35153b);
            return false;
        }
        this.f35160i = j;
        boolean mo54760i = mo54760i(j - j2);
        float min = Math.min(this.f35153b, this.f35158g);
        this.f35153b = min;
        float max = Math.max(min, this.f35159h);
        this.f35153b = max;
        m54797f(max);
        if (mo54760i) {
            m54802a(false);
        }
        return mo54760i;
    }

    /* renamed from: f */
    public void m54797f(float f) {
        this.f35156e.setValue(this.f35155d, f);
        for (int i = 0; i < this.f35163l.size(); i++) {
            if (this.f35163l.get(i) != null) {
                ((OnAnimationUpdateListener) this.f35163l.get(i)).onAnimationUpdate(this, this.f35153b, this.f35152a);
            }
        }
        m54798e(this.f35163l);
    }

    /* renamed from: g */
    public abstract void mo54761g(float f);

    public float getMinimumVisibleChange() {
        return this.f35161j;
    }

    /* renamed from: h */
    public final void m54796h() {
        if (!this.f35157f) {
            this.f35157f = true;
            if (!this.f35154c) {
                this.f35153b = m54801b();
            }
            float f = this.f35153b;
            if (f <= this.f35158g && f >= this.f35159h) {
                C4490a.m54751d().m54754a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    /* renamed from: i */
    public abstract boolean mo54760i(long j);

    public boolean isRunning() {
        return this.f35157f;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        m54799d(this.f35162k, onAnimationEndListener);
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        m54799d(this.f35163l, onAnimationUpdateListener);
    }

    public T setMaxValue(float f) {
        this.f35158g = f;
        return this;
    }

    public T setMinValue(float f) {
        this.f35159h = f;
        return this;
    }

    public T setMinimumVisibleChange(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f35161j = f;
            mo54761g(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public T setStartValue(float f) {
        this.f35153b = f;
        this.f35154c = true;
        return this;
    }

    public T setStartVelocity(float f) {
        this.f35152a = f;
        return this;
    }

    public void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f35157f) {
                m54796h();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public DynamicAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        this.f35152a = 0.0f;
        this.f35153b = Float.MAX_VALUE;
        this.f35154c = false;
        this.f35157f = false;
        this.f35158g = Float.MAX_VALUE;
        this.f35159h = -Float.MAX_VALUE;
        this.f35160i = 0L;
        this.f35162k = new ArrayList();
        this.f35163l = new ArrayList();
        this.f35155d = obj;
        this.f35156e = floatPropertyCompat;
        if (floatPropertyCompat != ROTATION && floatPropertyCompat != ROTATION_X && floatPropertyCompat != ROTATION_Y) {
            if (floatPropertyCompat == ALPHA) {
                this.f35161j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != SCALE_X && floatPropertyCompat != SCALE_Y) {
                this.f35161j = 1.0f;
                return;
            } else {
                this.f35161j = 0.00390625f;
                return;
            }
        }
        this.f35161j = 0.1f;
    }
}