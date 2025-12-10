package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes2.dex */
public class WindowInsetsCompat {
    @NonNull
    public static final WindowInsetsCompat CONSUMED;

    /* renamed from: a */
    public final C4178k f34269a;

    /* loaded from: classes2.dex */
    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes2.dex */
        public @interface InsetsType {
        }

        /* renamed from: a */
        public static int m56705a() {
            return -1;
        }

        /* renamed from: b */
        public static int m56704b(int i) {
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 4) {
                    return 2;
                }
                if (i != 8) {
                    if (i == 16) {
                        return 4;
                    }
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                if (i == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$a */
    /* loaded from: classes2.dex */
    public static class C4168a {

        /* renamed from: a */
        public static Field f34271a;

        /* renamed from: b */
        public static Field f34272b;

        /* renamed from: c */
        public static Field f34273c;

        /* renamed from: d */
        public static boolean f34274d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f34271a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f34272b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f34273c = declaredField3;
                declaredField3.setAccessible(true);
                f34274d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static WindowInsetsCompat m56703a(View view) {
            if (f34274d && view.isAttachedToWindow()) {
                try {
                    Object obj = f34271a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f34272b.get(obj);
                        Rect rect2 = (Rect) f34273c.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat build = new Builder().setStableInsets(Insets.m57370of(rect)).setSystemWindowInsets(Insets.m57370of(rect2)).build();
                            build.m56707e(build);
                            build.m56711a(view.getRootView());
                            return build;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$d */
    /* loaded from: classes2.dex */
    public static class C4171d extends C4170c {
        public C4171d() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: d */
        public void mo56698d(int i, @NonNull Insets insets) {
            this.f34281c.setInsets(C4179l.m56663a(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: e */
        public void mo56697e(int i, @NonNull Insets insets) {
            this.f34281c.setInsetsIgnoringVisibility(C4179l.m56663a(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: k */
        public void mo56691k(int i, boolean z) {
            this.f34281c.setVisible(C4179l.m56663a(i), z);
        }

        public C4171d(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$e */
    /* loaded from: classes2.dex */
    public static class C4172e {

        /* renamed from: a */
        public final WindowInsetsCompat f34282a;

        /* renamed from: b */
        public Insets[] f34283b;

        public C4172e() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* renamed from: a */
        public final void m56701a() {
            Insets[] insetsArr = this.f34283b;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.m56704b(1)];
                Insets insets2 = this.f34283b[Type.m56704b(2)];
                if (insets2 == null) {
                    insets2 = this.f34282a.getInsets(2);
                }
                if (insets == null) {
                    insets = this.f34282a.getInsets(1);
                }
                mo56693i(Insets.max(insets, insets2));
                Insets insets3 = this.f34283b[Type.m56704b(16)];
                if (insets3 != null) {
                    mo56694h(insets3);
                }
                Insets insets4 = this.f34283b[Type.m56704b(32)];
                if (insets4 != null) {
                    mo56696f(insets4);
                }
                Insets insets5 = this.f34283b[Type.m56704b(64)];
                if (insets5 != null) {
                    mo56692j(insets5);
                }
            }
        }

        @NonNull
        /* renamed from: b */
        public abstract WindowInsetsCompat mo56700b();

        /* renamed from: c */
        public void mo56699c(@Nullable DisplayCutoutCompat displayCutoutCompat) {
        }

        /* renamed from: d */
        public void mo56698d(int i, @NonNull Insets insets) {
            if (this.f34283b == null) {
                this.f34283b = new Insets[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f34283b[Type.m56704b(i2)] = insets;
                }
            }
        }

        /* renamed from: e */
        public void mo56697e(int i, @NonNull Insets insets) {
            if (i != 8) {
                return;
            }
            throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
        }

        /* renamed from: f */
        public void mo56696f(@NonNull Insets insets) {
        }

        /* renamed from: g */
        public abstract void mo56695g(@NonNull Insets insets);

        /* renamed from: h */
        public void mo56694h(@NonNull Insets insets) {
        }

        /* renamed from: i */
        public abstract void mo56693i(@NonNull Insets insets);

        /* renamed from: j */
        public void mo56692j(@NonNull Insets insets) {
        }

        /* renamed from: k */
        public void mo56691k(int i, boolean z) {
        }

        public C4172e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f34282a = windowInsetsCompat;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$h */
    /* loaded from: classes2.dex */
    public static class C4175h extends C4174g {
        public C4175h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo56684a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f34289c.consumeDisplayCutout();
            return WindowInsetsCompat.toWindowInsetsCompat(consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4173f, androidx.core.view.WindowInsetsCompat.C4178k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4175h)) {
                return false;
            }
            C4175h c4175h = (C4175h) obj;
            if (Objects.equals(this.f34289c, c4175h.f34289c) && Objects.equals(this.f34293g, c4175h.f34293g)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @Nullable
        /* renamed from: f */
        public DisplayCutoutCompat mo56679f() {
            DisplayCutout displayCutout;
            displayCutout = this.f34289c.getDisplayCutout();
            return DisplayCutoutCompat.m57017c(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        public int hashCode() {
            return this.f34289c.hashCode();
        }

        public C4175h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull C4175h c4175h) {
            super(windowInsetsCompat, c4175h);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$j */
    /* loaded from: classes2.dex */
    public static class C4177j extends C4176i {

        /* renamed from: q */
        public static final WindowInsetsCompat f34298q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f34298q = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }

        public C4177j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4173f, androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: d */
        public final void mo56681d(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4173f, androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: g */
        public Insets mo56678g(int i) {
            android.graphics.Insets insets;
            insets = this.f34289c.getInsets(C4179l.m56663a(i));
            return Insets.toCompatInsets(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4173f, androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: h */
        public Insets mo56677h(int i) {
            android.graphics.Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f34289c.getInsetsIgnoringVisibility(C4179l.m56663a(i));
            return Insets.toCompatInsets(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4173f, androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: q */
        public boolean mo56668q(int i) {
            boolean isVisible;
            isVisible = this.f34289c.isVisible(C4179l.m56663a(i));
            return isVisible;
        }

        public C4177j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull C4177j c4177j) {
            super(windowInsetsCompat, c4177j);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$k */
    /* loaded from: classes2.dex */
    public static class C4178k {

        /* renamed from: b */
        public static final WindowInsetsCompat f34299b = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();

        /* renamed from: a */
        public final WindowInsetsCompat f34300a;

        public C4178k(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f34300a = windowInsetsCompat;
        }

        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo56684a() {
            return this.f34300a;
        }

        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo56683b() {
            return this.f34300a;
        }

        @NonNull
        /* renamed from: c */
        public WindowInsetsCompat mo56682c() {
            return this.f34300a;
        }

        /* renamed from: d */
        public void mo56681d(@NonNull View view) {
        }

        /* renamed from: e */
        public void mo56680e(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4178k)) {
                return false;
            }
            C4178k c4178k = (C4178k) obj;
            if (mo56669p() == c4178k.mo56669p() && mo56670o() == c4178k.mo56670o() && ObjectsCompat.equals(mo56673l(), c4178k.mo56673l()) && ObjectsCompat.equals(mo56675j(), c4178k.mo56675j()) && ObjectsCompat.equals(mo56679f(), c4178k.mo56679f())) {
                return true;
            }
            return false;
        }

        @Nullable
        /* renamed from: f */
        public DisplayCutoutCompat mo56679f() {
            return null;
        }

        @NonNull
        /* renamed from: g */
        public Insets mo56678g(int i) {
            return Insets.NONE;
        }

        @NonNull
        /* renamed from: h */
        public Insets mo56677h(int i) {
            if ((i & 8) == 0) {
                return Insets.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return ObjectsCompat.hash(Boolean.valueOf(mo56669p()), Boolean.valueOf(mo56670o()), mo56673l(), mo56675j(), mo56679f());
        }

        @NonNull
        /* renamed from: i */
        public Insets mo56676i() {
            return mo56673l();
        }

        @NonNull
        /* renamed from: j */
        public Insets mo56675j() {
            return Insets.NONE;
        }

        @NonNull
        /* renamed from: k */
        public Insets mo56674k() {
            return mo56673l();
        }

        @NonNull
        /* renamed from: l */
        public Insets mo56673l() {
            return Insets.NONE;
        }

        @NonNull
        /* renamed from: m */
        public Insets mo56672m() {
            return mo56673l();
        }

        @NonNull
        /* renamed from: n */
        public WindowInsetsCompat mo56671n(int i, int i2, int i3, int i4) {
            return f34299b;
        }

        /* renamed from: o */
        public boolean mo56670o() {
            return false;
        }

        /* renamed from: p */
        public boolean mo56669p() {
            return false;
        }

        /* renamed from: q */
        public boolean mo56668q(int i) {
            return true;
        }

        /* renamed from: r */
        public void mo56667r(Insets[] insetsArr) {
        }

        /* renamed from: s */
        public void mo56666s(@NonNull Insets insets) {
        }

        /* renamed from: t */
        public void mo56665t(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        /* renamed from: u */
        public void mo56664u(Insets insets) {
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$l */
    /* loaded from: classes2.dex */
    public static final class C4179l {
        /* renamed from: a */
        public static int m56663a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = C4177j.f34298q;
        } else {
            CONSUMED = C4178k.f34299b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f34269a = new C4177j(this, windowInsets);
        } else if (i >= 29) {
            this.f34269a = new C4176i(this, windowInsets);
        } else if (i >= 28) {
            this.f34269a = new C4175h(this, windowInsets);
        } else {
            this.f34269a = new C4174g(this, windowInsets);
        }
    }

    /* renamed from: b */
    public static Insets m56710b(Insets insets, int i, int i2, int i3, int i4) {
        int max = Math.max(0, insets.left - i);
        int max2 = Math.max(0, insets.top - i2);
        int max3 = Math.max(0, insets.right - i3);
        int max4 = Math.max(0, insets.bottom - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return insets;
        }
        return Insets.m57371of(max, max2, max3, max4);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    /* renamed from: a */
    public void m56711a(View view) {
        this.f34269a.mo56681d(view);
    }

    /* renamed from: c */
    public void m56709c(Insets[] insetsArr) {
        this.f34269a.mo56667r(insetsArr);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.f34269a.mo56684a();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.f34269a.mo56683b();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.f34269a.mo56682c();
    }

    /* renamed from: d */
    public void m56708d(Insets insets) {
        this.f34269a.mo56666s(insets);
    }

    /* renamed from: e */
    public void m56707e(WindowInsetsCompat windowInsetsCompat) {
        this.f34269a.mo56665t(windowInsetsCompat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return ObjectsCompat.equals(this.f34269a, ((WindowInsetsCompat) obj).f34269a);
    }

    /* renamed from: f */
    public void m56706f(Insets insets) {
        this.f34269a.mo56664u(insets);
    }

    @Nullable
    public DisplayCutoutCompat getDisplayCutout() {
        return this.f34269a.mo56679f();
    }

    @NonNull
    public Insets getInsets(int i) {
        return this.f34269a.mo56678g(i);
    }

    @NonNull
    public Insets getInsetsIgnoringVisibility(int i) {
        return this.f34269a.mo56677h(i);
    }

    @NonNull
    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.f34269a.mo56676i();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.f34269a.mo56675j().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.f34269a.mo56675j().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.f34269a.mo56675j().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.f34269a.mo56675j().top;
    }

    @NonNull
    @Deprecated
    public Insets getStableInsets() {
        return this.f34269a.mo56675j();
    }

    @NonNull
    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.f34269a.mo56674k();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.f34269a.mo56673l().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.f34269a.mo56673l().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.f34269a.mo56673l().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.f34269a.mo56673l().top;
    }

    @NonNull
    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.f34269a.mo56673l();
    }

    @NonNull
    @Deprecated
    public Insets getTappableElementInsets() {
        return this.f34269a.mo56672m();
    }

    public boolean hasInsets() {
        Insets insets = getInsets(Type.m56705a());
        Insets insets2 = Insets.NONE;
        if (insets.equals(insets2) && getInsetsIgnoringVisibility(Type.m56705a() ^ Type.ime()).equals(insets2) && getDisplayCutout() == null) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.f34269a.mo56675j().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.f34269a.mo56673l().equals(Insets.NONE);
    }

    public int hashCode() {
        C4178k c4178k = this.f34269a;
        if (c4178k == null) {
            return 0;
        }
        return c4178k.hashCode();
    }

    @NonNull
    public WindowInsetsCompat inset(@NonNull Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        return this.f34269a.mo56670o();
    }

    public boolean isRound() {
        return this.f34269a.mo56669p();
    }

    public boolean isVisible(int i) {
        return this.f34269a.mo56668q(i);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return new Builder(this).setSystemWindowInsets(Insets.m57371of(i, i2, i3, i4)).build();
    }

    @Nullable
    @RequiresApi(20)
    public WindowInsets toWindowInsets() {
        C4178k c4178k = this.f34269a;
        if (c4178k instanceof C4173f) {
            return ((C4173f) c4178k).f34289c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$b */
    /* loaded from: classes2.dex */
    public static class C4169b extends C4172e {

        /* renamed from: e */
        public static Field f34275e = null;

        /* renamed from: f */
        public static boolean f34276f = false;

        /* renamed from: g */
        public static Constructor f34277g = null;

        /* renamed from: h */
        public static boolean f34278h = false;

        /* renamed from: c */
        public WindowInsets f34279c;

        /* renamed from: d */
        public Insets f34280d;

        public C4169b() {
            this.f34279c = m56702l();
        }

        @Nullable
        /* renamed from: l */
        private static WindowInsets m56702l() {
            if (!f34276f) {
                try {
                    f34275e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f34276f = true;
            }
            Field field = f34275e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f34278h) {
                try {
                    f34277g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f34278h = true;
            }
            Constructor constructor = f34277g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo56700b() {
            m56701a();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.f34279c);
            windowInsetsCompat.m56709c(this.f34283b);
            windowInsetsCompat.m56706f(this.f34280d);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: g */
        public void mo56695g(@Nullable Insets insets) {
            this.f34280d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: i */
        public void mo56693i(@NonNull Insets insets) {
            WindowInsets windowInsets = this.f34279c;
            if (windowInsets != null) {
                this.f34279c = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        public C4169b(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f34279c = windowInsetsCompat.toWindowInsets();
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$c */
    /* loaded from: classes2.dex */
    public static class C4170c extends C4172e {

        /* renamed from: c */
        public final WindowInsets.Builder f34281c;

        public C4170c() {
            this.f34281c = D42.m68692a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo56700b() {
            WindowInsets build;
            m56701a();
            build = this.f34281c.build();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(build);
            windowInsetsCompat.m56709c(this.f34283b);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: c */
        public void mo56699c(@Nullable DisplayCutoutCompat displayCutoutCompat) {
            DisplayCutout displayCutout;
            WindowInsets.Builder builder = this.f34281c;
            if (displayCutoutCompat != null) {
                displayCutout = displayCutoutCompat.m57018b();
            } else {
                displayCutout = null;
            }
            builder.setDisplayCutout(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: f */
        public void mo56696f(@NonNull Insets insets) {
            this.f34281c.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: g */
        public void mo56695g(@NonNull Insets insets) {
            this.f34281c.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: h */
        public void mo56694h(@NonNull Insets insets) {
            this.f34281c.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: i */
        public void mo56693i(@NonNull Insets insets) {
            this.f34281c.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4172e
        /* renamed from: j */
        public void mo56692j(@NonNull Insets insets) {
            this.f34281c.setTappableElementInsets(insets.toPlatformInsets());
        }

        public C4170c(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder m68692a;
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                m68692a = C42.m68834a(windowInsets);
            } else {
                m68692a = D42.m68692a();
            }
            this.f34281c = m68692a;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$g */
    /* loaded from: classes2.dex */
    public static class C4174g extends C4173f {

        /* renamed from: m */
        public Insets f34294m;

        public C4174g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f34294m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo56683b() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.f34289c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: c */
        public WindowInsetsCompat mo56682c() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.f34289c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: j */
        public final Insets mo56675j() {
            if (this.f34294m == null) {
                this.f34294m = Insets.m57371of(this.f34289c.getStableInsetLeft(), this.f34289c.getStableInsetTop(), this.f34289c.getStableInsetRight(), this.f34289c.getStableInsetBottom());
            }
            return this.f34294m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: o */
        public boolean mo56670o() {
            return this.f34289c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: u */
        public void mo56664u(@Nullable Insets insets) {
            this.f34294m = insets;
        }

        public C4174g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull C4174g c4174g) {
            super(windowInsetsCompat, c4174g);
            this.f34294m = null;
            this.f34294m = c4174g.f34294m;
        }
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets, @Nullable View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) Preconditions.checkNotNull(windowInsets));
        if (view != null && ViewCompat.isAttachedToWindow(view)) {
            windowInsetsCompat.m56707e(ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.m56711a(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @NonNull
    public WindowInsetsCompat inset(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        return this.f34269a.mo56671n(i, i2, i3, i4);
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$f */
    /* loaded from: classes2.dex */
    public static class C4173f extends C4178k {

        /* renamed from: h */
        public static boolean f34284h = false;

        /* renamed from: i */
        public static Method f34285i;

        /* renamed from: j */
        public static Class f34286j;

        /* renamed from: k */
        public static Field f34287k;

        /* renamed from: l */
        public static Field f34288l;

        /* renamed from: c */
        public final WindowInsets f34289c;

        /* renamed from: d */
        public Insets[] f34290d;

        /* renamed from: e */
        public Insets f34291e;

        /* renamed from: f */
        public WindowInsetsCompat f34292f;

        /* renamed from: g */
        public Insets f34293g;

        public C4173f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f34291e = null;
            this.f34289c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: A */
        private static void m56690A() {
            try {
                f34285i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f34286j = cls;
                f34287k = cls.getDeclaredField("mVisibleInsets");
                f34288l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f34287k.setAccessible(true);
                f34288l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            f34284h = true;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        /* renamed from: v */
        private Insets m56689v(int i, boolean z) {
            Insets insets = Insets.NONE;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insets = Insets.max(insets, m56688w(i2, z));
                }
            }
            return insets;
        }

        /* renamed from: x */
        private Insets m56687x() {
            WindowInsetsCompat windowInsetsCompat = this.f34292f;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.getStableInsets();
            }
            return Insets.NONE;
        }

        @Nullable
        /* renamed from: y */
        private Insets m56686y(@NonNull View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f34284h) {
                    m56690A();
                }
                Method method = f34285i;
                if (method != null && f34286j != null && f34287k != null) {
                    try {
                        Object invoke = method.invoke(view, null);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f34287k.get(f34288l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return Insets.m57370of(rect);
                    } catch (ReflectiveOperationException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get visible insets. (Reflection error). ");
                        sb.append(e.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: d */
        public void mo56681d(@NonNull View view) {
            Insets m56686y = m56686y(view);
            if (m56686y == null) {
                m56686y = Insets.NONE;
            }
            mo56666s(m56686y);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: e */
        public void mo56680e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.m56707e(this.f34292f);
            windowInsetsCompat.m56708d(this.f34293g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f34293g, ((C4173f) obj).f34293g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: g */
        public Insets mo56678g(int i) {
            return m56689v(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: h */
        public Insets mo56677h(int i) {
            return m56689v(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: l */
        public final Insets mo56673l() {
            if (this.f34291e == null) {
                this.f34291e = Insets.m57371of(this.f34289c.getSystemWindowInsetLeft(), this.f34289c.getSystemWindowInsetTop(), this.f34289c.getSystemWindowInsetRight(), this.f34289c.getSystemWindowInsetBottom());
            }
            return this.f34291e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: n */
        public WindowInsetsCompat mo56671n(int i, int i2, int i3, int i4) {
            Builder builder = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.f34289c));
            builder.setSystemWindowInsets(WindowInsetsCompat.m56710b(mo56673l(), i, i2, i3, i4));
            builder.setStableInsets(WindowInsetsCompat.m56710b(mo56675j(), i, i2, i3, i4));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: p */
        public boolean mo56669p() {
            return this.f34289c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @SuppressLint({"WrongConstant"})
        /* renamed from: q */
        public boolean mo56668q(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m56685z(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: r */
        public void mo56667r(Insets[] insetsArr) {
            this.f34290d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: s */
        public void mo56666s(@NonNull Insets insets) {
            this.f34293g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: t */
        public void mo56665t(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f34292f = windowInsetsCompat;
        }

        @NonNull
        /* renamed from: w */
        public Insets m56688w(int i, boolean z) {
            int i2;
            DisplayCutoutCompat mo56679f;
            if (i != 1) {
                Insets insets = null;
                if (i != 2) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i != 64) {
                                    if (i != 128) {
                                        return Insets.NONE;
                                    }
                                    WindowInsetsCompat windowInsetsCompat = this.f34292f;
                                    if (windowInsetsCompat != null) {
                                        mo56679f = windowInsetsCompat.getDisplayCutout();
                                    } else {
                                        mo56679f = mo56679f();
                                    }
                                    if (mo56679f != null) {
                                        return Insets.m57371of(mo56679f.getSafeInsetLeft(), mo56679f.getSafeInsetTop(), mo56679f.getSafeInsetRight(), mo56679f.getSafeInsetBottom());
                                    }
                                    return Insets.NONE;
                                }
                                return mo56672m();
                            }
                            return mo56676i();
                        }
                        return mo56674k();
                    }
                    Insets[] insetsArr = this.f34290d;
                    if (insetsArr != null) {
                        insets = insetsArr[Type.m56704b(8)];
                    }
                    if (insets != null) {
                        return insets;
                    }
                    Insets mo56673l = mo56673l();
                    Insets m56687x = m56687x();
                    int i3 = mo56673l.bottom;
                    if (i3 > m56687x.bottom) {
                        return Insets.m57371of(0, 0, 0, i3);
                    }
                    Insets insets2 = this.f34293g;
                    if (insets2 != null && !insets2.equals(Insets.NONE) && (i2 = this.f34293g.bottom) > m56687x.bottom) {
                        return Insets.m57371of(0, 0, 0, i2);
                    }
                    return Insets.NONE;
                } else if (z) {
                    Insets m56687x2 = m56687x();
                    Insets mo56675j = mo56675j();
                    return Insets.m57371of(Math.max(m56687x2.left, mo56675j.left), 0, Math.max(m56687x2.right, mo56675j.right), Math.max(m56687x2.bottom, mo56675j.bottom));
                } else {
                    Insets mo56673l2 = mo56673l();
                    WindowInsetsCompat windowInsetsCompat2 = this.f34292f;
                    if (windowInsetsCompat2 != null) {
                        insets = windowInsetsCompat2.getStableInsets();
                    }
                    int i4 = mo56673l2.bottom;
                    if (insets != null) {
                        i4 = Math.min(i4, insets.bottom);
                    }
                    return Insets.m57371of(mo56673l2.left, 0, mo56673l2.right, i4);
                }
            } else if (z) {
                return Insets.m57371of(0, Math.max(m56687x().top, mo56673l().top), 0, 0);
            } else {
                return Insets.m57371of(0, mo56673l().top, 0, 0);
            }
        }

        /* renamed from: z */
        public boolean m56685z(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m56688w(i, false).equals(Insets.NONE);
        }

        public C4173f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull C4173f c4173f) {
            this(windowInsetsCompat, new WindowInsets(c4173f.f34289c));
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$i */
    /* loaded from: classes2.dex */
    public static class C4176i extends C4175h {

        /* renamed from: n */
        public Insets f34295n;

        /* renamed from: o */
        public Insets f34296o;

        /* renamed from: p */
        public Insets f34297p;

        public C4176i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f34295n = null;
            this.f34296o = null;
            this.f34297p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: i */
        public Insets mo56676i() {
            android.graphics.Insets mandatorySystemGestureInsets;
            if (this.f34296o == null) {
                mandatorySystemGestureInsets = this.f34289c.getMandatorySystemGestureInsets();
                this.f34296o = Insets.toCompatInsets(mandatorySystemGestureInsets);
            }
            return this.f34296o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: k */
        public Insets mo56674k() {
            android.graphics.Insets systemGestureInsets;
            if (this.f34295n == null) {
                systemGestureInsets = this.f34289c.getSystemGestureInsets();
                this.f34295n = Insets.toCompatInsets(systemGestureInsets);
            }
            return this.f34295n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: m */
        public Insets mo56672m() {
            android.graphics.Insets tappableElementInsets;
            if (this.f34297p == null) {
                tappableElementInsets = this.f34289c.getTappableElementInsets();
                this.f34297p = Insets.toCompatInsets(tappableElementInsets);
            }
            return this.f34297p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4173f, androidx.core.view.WindowInsetsCompat.C4178k
        @NonNull
        /* renamed from: n */
        public WindowInsetsCompat mo56671n(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.f34289c.inset(i, i2, i3, i4);
            return WindowInsetsCompat.toWindowInsetsCompat(inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C4174g, androidx.core.view.WindowInsetsCompat.C4178k
        /* renamed from: u */
        public void mo56664u(@Nullable Insets insets) {
        }

        public C4176i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull C4176i c4176i) {
            super(windowInsetsCompat, c4176i);
            this.f34295n = null;
            this.f34296o = null;
            this.f34297p = null;
        }
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(@NonNull Rect rect) {
        return new Builder(this).setSystemWindowInsets(Insets.m57370of(rect)).build();
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final C4172e f34270a;

        public Builder() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f34270a = new C4171d();
            } else if (i >= 29) {
                this.f34270a = new C4170c();
            } else {
                this.f34270a = new C4169b();
            }
        }

        @NonNull
        public WindowInsetsCompat build() {
            return this.f34270a.mo56700b();
        }

        @NonNull
        public Builder setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
            this.f34270a.mo56699c(displayCutoutCompat);
            return this;
        }

        @NonNull
        public Builder setInsets(int i, @NonNull Insets insets) {
            this.f34270a.mo56698d(i, insets);
            return this;
        }

        @NonNull
        public Builder setInsetsIgnoringVisibility(int i, @NonNull Insets insets) {
            this.f34270a.mo56697e(i, insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setMandatorySystemGestureInsets(@NonNull Insets insets) {
            this.f34270a.mo56696f(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setStableInsets(@NonNull Insets insets) {
            this.f34270a.mo56695g(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemGestureInsets(@NonNull Insets insets) {
            this.f34270a.mo56694h(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemWindowInsets(@NonNull Insets insets) {
            this.f34270a.mo56693i(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTappableElementInsets(@NonNull Insets insets) {
            this.f34270a.mo56692j(insets);
            return this;
        }

        @NonNull
        public Builder setVisible(int i, boolean z) {
            this.f34270a.mo56691k(i, z);
            return this;
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f34270a = new C4171d(windowInsetsCompat);
            } else if (i >= 29) {
                this.f34270a = new C4170c(windowInsetsCompat);
            } else {
                this.f34270a = new C4169b(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            C4178k c4178k = windowInsetsCompat.f34269a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c4178k instanceof C4177j)) {
                this.f34269a = new C4177j(this, (C4177j) c4178k);
            } else if (i >= 29 && (c4178k instanceof C4176i)) {
                this.f34269a = new C4176i(this, (C4176i) c4178k);
            } else if (i >= 28 && (c4178k instanceof C4175h)) {
                this.f34269a = new C4175h(this, (C4175h) c4178k);
            } else if (c4178k instanceof C4174g) {
                this.f34269a = new C4174g(this, (C4174g) c4178k);
            } else if (c4178k instanceof C4173f) {
                this.f34269a = new C4173f(this, (C4173f) c4178k);
            } else {
                this.f34269a = new C4178k(this);
            }
            c4178k.mo56680e(this);
            return;
        }
        this.f34269a = new C4178k(this);
    }
}
