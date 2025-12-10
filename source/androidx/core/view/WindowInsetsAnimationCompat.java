package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class WindowInsetsAnimationCompat {

    /* renamed from: a */
    public C4165c f34233a;

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;

        /* renamed from: a */
        public WindowInsets f34236a;

        /* renamed from: b */
        public final int f34237b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes2.dex */
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.f34237b = i;
        }

        public final int getDispatchMode() {
            return this.f34237b;
        }

        public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        @NonNull
        public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        @NonNull
        public BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$a */
    /* loaded from: classes2.dex */
    public static class C4158a extends C4165c {

        /* renamed from: f */
        public static final Interpolator f34238f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g */
        public static final Interpolator f34239g = new FastOutLinearInInterpolator();

        /* renamed from: h */
        public static final Interpolator f34240h = new DecelerateInterpolator();

        /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a */
        /* loaded from: classes2.dex */
        public static class View$OnApplyWindowInsetsListenerC4159a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final Callback f34241a;

            /* renamed from: b */
            public WindowInsetsCompat f34242b;

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a$a */
            /* loaded from: classes2.dex */
            public class C4160a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ WindowInsetsAnimationCompat f34243a;

                /* renamed from: b */
                public final /* synthetic */ WindowInsetsCompat f34244b;

                /* renamed from: c */
                public final /* synthetic */ WindowInsetsCompat f34245c;

                /* renamed from: d */
                public final /* synthetic */ int f34246d;

                /* renamed from: e */
                public final /* synthetic */ View f34247e;

                public C4160a(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f34243a = windowInsetsAnimationCompat;
                    this.f34244b = windowInsetsCompat;
                    this.f34245c = windowInsetsCompat2;
                    this.f34246d = i;
                    this.f34247e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f34243a.setFraction(valueAnimator.getAnimatedFraction());
                    C4158a.m56740o(this.f34247e, C4158a.m56736s(this.f34244b, this.f34245c, this.f34243a.getInterpolatedFraction(), this.f34246d), Collections.singletonList(this.f34243a));
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a$b */
            /* loaded from: classes2.dex */
            public class C4161b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ WindowInsetsAnimationCompat f34249a;

                /* renamed from: b */
                public final /* synthetic */ View f34250b;

                public C4161b(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f34249a = windowInsetsAnimationCompat;
                    this.f34250b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f34249a.setFraction(1.0f);
                    C4158a.m56742m(this.f34250b, this.f34249a);
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$a$a$c */
            /* loaded from: classes2.dex */
            public class RunnableC4162c implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ View f34252a;

                /* renamed from: b */
                public final /* synthetic */ WindowInsetsAnimationCompat f34253b;

                /* renamed from: c */
                public final /* synthetic */ BoundsCompat f34254c;

                /* renamed from: d */
                public final /* synthetic */ ValueAnimator f34255d;

                public RunnableC4162c(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat, ValueAnimator valueAnimator) {
                    this.f34252a = view;
                    this.f34253b = windowInsetsAnimationCompat;
                    this.f34254c = boundsCompat;
                    this.f34255d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C4158a.m56739p(this.f34252a, this.f34253b, this.f34254c);
                    this.f34255d.start();
                }
            }

            public View$OnApplyWindowInsetsListenerC4159a(View view, Callback callback) {
                WindowInsetsCompat windowInsetsCompat;
                this.f34241a = callback;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                if (rootWindowInsets != null) {
                    windowInsetsCompat = new WindowInsetsCompat.Builder(rootWindowInsets).build();
                } else {
                    windowInsetsCompat = null;
                }
                this.f34242b = windowInsetsCompat;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f34242b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return C4158a.m56738q(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.f34242b == null) {
                    this.f34242b = ViewCompat.getRootWindowInsets(view);
                }
                if (this.f34242b == null) {
                    this.f34242b = windowInsetsCompat;
                    return C4158a.m56738q(view, windowInsets);
                }
                Callback m56737r = C4158a.m56737r(view);
                if (m56737r != null && Objects.equals(m56737r.f34236a, windowInsets)) {
                    return C4158a.m56738q(view, windowInsets);
                }
                int m56746i = C4158a.m56746i(windowInsetsCompat, this.f34242b);
                if (m56746i == 0) {
                    return C4158a.m56738q(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f34242b;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(m56746i, C4158a.m56744k(m56746i, windowInsetsCompat, windowInsetsCompat2), 160L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                BoundsCompat m56745j = C4158a.m56745j(windowInsetsCompat, windowInsetsCompat2, m56746i);
                C4158a.m56741n(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new C4160a(windowInsetsAnimationCompat, windowInsetsCompat, windowInsetsCompat2, m56746i, view));
                duration.addListener(new C4161b(windowInsetsAnimationCompat, view));
                OneShotPreDrawListener.add(view, new RunnableC4162c(view, windowInsetsAnimationCompat, m56745j, duration));
                this.f34242b = windowInsetsCompat;
                return C4158a.m56738q(view, windowInsets);
            }
        }

        public C4158a(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        /* renamed from: i */
        public static int m56746i(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!windowInsetsCompat.getInsets(i2).equals(windowInsetsCompat2.getInsets(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        /* renamed from: j */
        public static BoundsCompat m56745j(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i) {
            Insets insets = windowInsetsCompat.getInsets(i);
            Insets insets2 = windowInsetsCompat2.getInsets(i);
            return new BoundsCompat(Insets.m57371of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.m57371of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        /* renamed from: k */
        public static Interpolator m56744k(int i, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            if ((i & 8) != 0) {
                if (windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat2.getInsets(WindowInsetsCompat.Type.ime()).bottom) {
                    return f34238f;
                }
                return f34239g;
            }
            return f34240h;
        }

        /* renamed from: l */
        public static View.OnApplyWindowInsetsListener m56743l(View view, Callback callback) {
            return new View$OnApplyWindowInsetsListenerC4159a(view, callback);
        }

        /* renamed from: m */
        public static void m56742m(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback m56737r = m56737r(view);
            if (m56737r != null) {
                m56737r.onEnd(windowInsetsAnimationCompat);
                if (m56737r.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m56742m(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        /* renamed from: n */
        public static void m56741n(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            Callback m56737r = m56737r(view);
            if (m56737r != null) {
                m56737r.f34236a = windowInsets;
                if (!z) {
                    m56737r.onPrepare(windowInsetsAnimationCompat);
                    if (m56737r.getDispatchMode() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m56741n(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        /* renamed from: o */
        public static void m56740o(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback m56737r = m56737r(view);
            if (m56737r != null) {
                windowInsetsCompat = m56737r.onProgress(windowInsetsCompat, list);
                if (m56737r.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m56740o(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        /* renamed from: p */
        public static void m56739p(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback m56737r = m56737r(view);
            if (m56737r != null) {
                m56737r.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (m56737r.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m56739p(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        /* renamed from: q */
        public static WindowInsets m56738q(View view, WindowInsets windowInsets) {
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: r */
        public static Callback m56737r(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof View$OnApplyWindowInsetsListenerC4159a) {
                return ((View$OnApplyWindowInsetsListenerC4159a) tag).f34241a;
            }
            return null;
        }

        /* renamed from: s */
        public static WindowInsetsCompat m56736s(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    builder.setInsets(i2, windowInsetsCompat.getInsets(i2));
                } else {
                    Insets insets = windowInsetsCompat.getInsets(i2);
                    Insets insets2 = windowInsetsCompat2.getInsets(i2);
                    float f2 = 1.0f - f;
                    builder.setInsets(i2, WindowInsetsCompat.m56710b(insets, (int) (((insets.left - insets2.left) * f2) + 0.5d), (int) (((insets.top - insets2.top) * f2) + 0.5d), (int) (((insets.right - insets2.right) * f2) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f2) + 0.5d)));
                }
            }
            return builder.build();
        }

        /* renamed from: t */
        public static void m56735t(View view, Callback callback) {
            Object tag = view.getTag(R.id.tag_on_apply_window_listener);
            if (callback == null) {
                view.setTag(R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener m56743l = m56743l(view, callback);
            view.setTag(R.id.tag_window_insets_animation_callback, m56743l);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(m56743l);
            }
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$c */
    /* loaded from: classes2.dex */
    public static class C4165c {

        /* renamed from: a */
        public final int f34262a;

        /* renamed from: b */
        public float f34263b;

        /* renamed from: c */
        public final Interpolator f34264c;

        /* renamed from: d */
        public final long f34265d;

        /* renamed from: e */
        public float f34266e;

        public C4165c(int i, Interpolator interpolator, long j) {
            this.f34262a = i;
            this.f34264c = interpolator;
            this.f34265d = j;
        }

        /* renamed from: a */
        public float m56729a() {
            return this.f34266e;
        }

        /* renamed from: b */
        public long mo56728b() {
            return this.f34265d;
        }

        /* renamed from: c */
        public float mo56727c() {
            return this.f34263b;
        }

        /* renamed from: d */
        public float mo56726d() {
            Interpolator interpolator = this.f34264c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f34263b);
            }
            return this.f34263b;
        }

        /* renamed from: e */
        public Interpolator mo56725e() {
            return this.f34264c;
        }

        /* renamed from: f */
        public int mo56724f() {
            return this.f34262a;
        }

        /* renamed from: g */
        public void m56723g(float f) {
            this.f34266e = f;
        }

        /* renamed from: h */
        public void mo56722h(float f) {
            this.f34263b = f;
        }
    }

    public WindowInsetsAnimationCompat(int i, @Nullable Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f34233a = new C4163b(i, interpolator, j);
        } else {
            this.f34233a = new C4158a(i, interpolator, j);
        }
    }

    /* renamed from: a */
    public static void m56748a(View view, Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            C4163b.m56731l(view, callback);
        } else {
            C4158a.m56735t(view, callback);
        }
    }

    /* renamed from: b */
    public static WindowInsetsAnimationCompat m56747b(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getAlpha() {
        return this.f34233a.m56729a();
    }

    public long getDurationMillis() {
        return this.f34233a.mo56728b();
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getFraction() {
        return this.f34233a.mo56727c();
    }

    public float getInterpolatedFraction() {
        return this.f34233a.mo56726d();
    }

    @Nullable
    public Interpolator getInterpolator() {
        return this.f34233a.mo56725e();
    }

    public int getTypeMask() {
        return this.f34233a.mo56724f();
    }

    public void setAlpha(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f34233a.m56723g(f);
    }

    public void setFraction(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f34233a.mo56722h(f);
    }

    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b */
    /* loaded from: classes2.dex */
    public static class C4163b extends C4165c {

        /* renamed from: f */
        public final WindowInsetsAnimation f34257f;

        /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a */
        /* loaded from: classes2.dex */
        public static class C4164a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final Callback f34258a;

            /* renamed from: b */
            public List f34259b;

            /* renamed from: c */
            public ArrayList f34260c;

            /* renamed from: d */
            public final HashMap f34261d;

            public C4164a(Callback callback) {
                super(callback.getDispatchMode());
                this.f34261d = new HashMap();
                this.f34258a = callback;
            }

            /* renamed from: a */
            public final WindowInsetsAnimationCompat m56730a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.f34261d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    WindowInsetsAnimationCompat m56747b = WindowInsetsAnimationCompat.m56747b(windowInsetsAnimation);
                    this.f34261d.put(windowInsetsAnimation, m56747b);
                    return m56747b;
                }
                return windowInsetsAnimationCompat;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f34258a.onEnd(m56730a(windowInsetsAnimation));
                this.f34261d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f34258a.onPrepare(m56730a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.f34260c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f34260c = arrayList2;
                    this.f34259b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation m23735a = AbstractC21525p42.m23735a(list.get(size));
                    WindowInsetsAnimationCompat m56730a = m56730a(m23735a);
                    fraction = m23735a.getFraction();
                    m56730a.setFraction(fraction);
                    this.f34260c.add(m56730a);
                }
                return this.f34258a.onProgress(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.f34259b).toWindowInsets();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f34258a.onStart(m56730a(windowInsetsAnimation), BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }
        }

        public C4163b(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f34257f = windowInsetsAnimation;
        }

        /* renamed from: i */
        public static WindowInsetsAnimation.Bounds m56734i(BoundsCompat boundsCompat) {
            AbstractC19805f42.m31355a();
            return AbstractC19633e42.m31593a(boundsCompat.getLowerBound().toPlatformInsets(), boundsCompat.getUpperBound().toPlatformInsets());
        }

        /* renamed from: j */
        public static Insets m56733j(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets upperBound;
            upperBound = bounds.getUpperBound();
            return Insets.toCompatInsets(upperBound);
        }

        /* renamed from: k */
        public static Insets m56732k(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return Insets.toCompatInsets(lowerBound);
        }

        /* renamed from: l */
        public static void m56731l(View view, Callback callback) {
            C4164a c4164a;
            if (callback != null) {
                c4164a = new C4164a(callback);
            } else {
                c4164a = null;
            }
            view.setWindowInsetsAnimationCallback(c4164a);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C4165c
        /* renamed from: b */
        public long mo56728b() {
            long durationMillis;
            durationMillis = this.f34257f.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C4165c
        /* renamed from: c */
        public float mo56727c() {
            float fraction;
            fraction = this.f34257f.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C4165c
        /* renamed from: d */
        public float mo56726d() {
            float interpolatedFraction;
            interpolatedFraction = this.f34257f.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C4165c
        /* renamed from: e */
        public Interpolator mo56725e() {
            Interpolator interpolator;
            interpolator = this.f34257f.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C4165c
        /* renamed from: f */
        public int mo56724f() {
            int typeMask;
            typeMask = this.f34257f.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C4165c
        /* renamed from: h */
        public void mo56722h(float f) {
            this.f34257f.setFraction(f);
        }

        public C4163b(int i, Interpolator interpolator, long j) {
            this(AbstractC21353o42.m25970a(i, interpolator, j));
        }
    }

    /* loaded from: classes2.dex */
    public static final class BoundsCompat {

        /* renamed from: a */
        public final Insets f34234a;

        /* renamed from: b */
        public final Insets f34235b;

        public BoundsCompat(@NonNull Insets insets, @NonNull Insets insets2) {
            this.f34234a = insets;
            this.f34235b = insets2;
        }

        @NonNull
        @RequiresApi(30)
        public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }

        @NonNull
        public Insets getLowerBound() {
            return this.f34234a;
        }

        @NonNull
        public Insets getUpperBound() {
            return this.f34235b;
        }

        @NonNull
        public BoundsCompat inset(@NonNull Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.m56710b(this.f34234a, insets.left, insets.top, insets.right, insets.bottom), WindowInsetsCompat.m56710b(this.f34235b, insets.left, insets.top, insets.right, insets.bottom));
        }

        @NonNull
        @RequiresApi(30)
        public WindowInsetsAnimation.Bounds toBounds() {
            return C4163b.m56734i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f34234a + " upper=" + this.f34235b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.f34234a = C4163b.m56732k(bounds);
            this.f34235b = C4163b.m56733j(bounds);
        }
    }

    public WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f34233a = new C4163b(windowInsetsAnimation);
        }
    }
}
