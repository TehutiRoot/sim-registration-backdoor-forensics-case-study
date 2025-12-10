package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 8197;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;

    /* renamed from: a */
    public final FragmentFactory f35561a;

    /* renamed from: b */
    public final ClassLoader f35562b;

    /* renamed from: c */
    public ArrayList f35563c;

    /* renamed from: d */
    public int f35564d;

    /* renamed from: e */
    public int f35565e;

    /* renamed from: f */
    public int f35566f;

    /* renamed from: g */
    public int f35567g;

    /* renamed from: h */
    public int f35568h;

    /* renamed from: i */
    public boolean f35569i;

    /* renamed from: j */
    public boolean f35570j;

    /* renamed from: k */
    public String f35571k;

    /* renamed from: l */
    public int f35572l;

    /* renamed from: m */
    public CharSequence f35573m;

    /* renamed from: n */
    public int f35574n;

    /* renamed from: o */
    public CharSequence f35575o;

    /* renamed from: p */
    public ArrayList f35576p;

    /* renamed from: q */
    public ArrayList f35577q;

    /* renamed from: r */
    public boolean f35578r;

    /* renamed from: s */
    public ArrayList f35579s;

    /* renamed from: androidx.fragment.app.FragmentTransaction$a */
    /* loaded from: classes2.dex */
    public static final class C4610a {

        /* renamed from: a */
        public int f35580a;

        /* renamed from: b */
        public Fragment f35581b;

        /* renamed from: c */
        public boolean f35582c;

        /* renamed from: d */
        public int f35583d;

        /* renamed from: e */
        public int f35584e;

        /* renamed from: f */
        public int f35585f;

        /* renamed from: g */
        public int f35586g;

        /* renamed from: h */
        public Lifecycle.State f35587h;

        /* renamed from: i */
        public Lifecycle.State f35588i;

        public C4610a() {
        }

        public C4610a(int i, Fragment fragment) {
            this.f35580a = i;
            this.f35581b = fragment;
            this.f35582c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f35587h = state;
            this.f35588i = state;
        }

        public C4610a(int i, Fragment fragment, boolean z) {
            this.f35580a = i;
            this.f35581b = fragment;
            this.f35582c = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f35587h = state;
            this.f35588i = state;
        }

        public C4610a(int i, Fragment fragment, Lifecycle.State state) {
            this.f35580a = i;
            this.f35581b = fragment;
            this.f35582c = false;
            this.f35587h = fragment.mMaxState;
            this.f35588i = state;
        }

        public C4610a(C4610a c4610a) {
            this.f35580a = c4610a.f35580a;
            this.f35581b = c4610a.f35581b;
            this.f35582c = c4610a.f35582c;
            this.f35583d = c4610a.f35583d;
            this.f35584e = c4610a.f35584e;
            this.f35585f = c4610a.f35585f;
            this.f35586g = c4610a.f35586g;
            this.f35587h = c4610a.f35587h;
            this.f35588i = c4610a.f35588i;
        }
    }

    @Deprecated
    public FragmentTransaction() {
        this.f35563c = new ArrayList();
        this.f35570j = true;
        this.f35578r = false;
        this.f35561a = null;
        this.f35562b = null;
    }

    @NonNull
    public final FragmentTransaction add(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(m54303d(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction addSharedElement(@NonNull View view, @NonNull String str) {
        if (FragmentTransition.supportsTransition()) {
            String transitionName = ViewCompat.getTransitionName(view);
            if (transitionName != null) {
                if (this.f35576p == null) {
                    this.f35576p = new ArrayList();
                    this.f35577q = new ArrayList();
                } else if (!this.f35577q.contains(str)) {
                    if (this.f35576p.contains(transitionName)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + transitionName + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.f35576p.add(transitionName);
                this.f35577q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @NonNull
    public FragmentTransaction addToBackStack(@Nullable String str) {
        if (this.f35570j) {
            this.f35569i = true;
            this.f35571k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @NonNull
    public FragmentTransaction attach(@NonNull Fragment fragment) {
        m54304c(new C4610a(7, fragment));
        return this;
    }

    /* renamed from: b */
    public FragmentTransaction m54305b(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return add(viewGroup.getId(), fragment, str);
    }

    /* renamed from: c */
    public void m54304c(C4610a c4610a) {
        this.f35563c.add(c4610a);
        c4610a.f35583d = this.f35564d;
        c4610a.f35584e = this.f35565e;
        c4610a.f35585f = this.f35566f;
        c4610a.f35586g = this.f35567g;
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    @MainThread
    public abstract void commitNow();

    @MainThread
    public abstract void commitNowAllowingStateLoss();

    /* renamed from: d */
    public final Fragment m54303d(Class cls, Bundle bundle) {
        FragmentFactory fragmentFactory = this.f35561a;
        if (fragmentFactory != null) {
            ClassLoader classLoader = this.f35562b;
            if (classLoader != null) {
                Fragment instantiate = fragmentFactory.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        m54304c(new C4610a(6, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction disallowAddToBackStack() {
        if (!this.f35569i) {
            this.f35570j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: e */
    public void mo54283e(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m54304c(new C4610a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        m54304c(new C4610a(4, fragment));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.f35570j;
    }

    public boolean isEmpty() {
        return this.f35563c.isEmpty();
    }

    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        m54304c(new C4610a(3, fragment));
        return this;
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return replace(i, cls, bundle, null);
    }

    @NonNull
    public FragmentTransaction runOnCommit(@NonNull Runnable runnable) {
        disallowAddToBackStack();
        if (this.f35579s == null) {
            this.f35579s = new ArrayList();
        }
        this.f35579s.add(runnable);
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z) {
        return setReorderingAllowed(z);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@StringRes int i) {
        this.f35574n = i;
        this.f35575o = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@StringRes int i) {
        this.f35572l = i;
        this.f35573m = null;
        return this;
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int i, @AnimRes @AnimatorRes int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        m54304c(new C4610a(10, fragment, state));
        return this;
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        m54304c(new C4610a(8, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction setReorderingAllowed(boolean z) {
        this.f35578r = z;
        return this;
    }

    @NonNull
    public FragmentTransaction setTransition(int i) {
        this.f35568h = i;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setTransitionStyle(@StyleRes int i) {
        return this;
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        m54304c(new C4610a(5, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction add(@NonNull Fragment fragment, @Nullable String str) {
        mo54283e(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int i, @NonNull Fragment fragment) {
        return replace(i, fragment, (String) null);
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int i, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4) {
        this.f35564d = i;
        this.f35565e = i2;
        this.f35566f = i3;
        this.f35567g = i4;
        return this;
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return add(i, m54303d(cls, bundle));
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return replace(i, m54303d(cls, bundle), str);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@Nullable CharSequence charSequence) {
        this.f35574n = 0;
        this.f35575o = charSequence;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@Nullable CharSequence charSequence) {
        this.f35572l = 0;
        this.f35573m = charSequence;
        return this;
    }

    @NonNull
    public FragmentTransaction add(@IdRes int i, @NonNull Fragment fragment) {
        mo54283e(i, fragment, null, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int i, @NonNull Fragment fragment, @Nullable String str) {
        if (i != 0) {
            mo54283e(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(i, m54303d(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction add(@IdRes int i, @NonNull Fragment fragment, @Nullable String str) {
        mo54283e(i, fragment, str, 1);
        return this;
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        this.f35563c = new ArrayList();
        this.f35570j = true;
        this.f35578r = false;
        this.f35561a = fragmentFactory;
        this.f35562b = classLoader;
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader, FragmentTransaction fragmentTransaction) {
        this(fragmentFactory, classLoader);
        Iterator it = fragmentTransaction.f35563c.iterator();
        while (it.hasNext()) {
            this.f35563c.add(new C4610a((C4610a) it.next()));
        }
        this.f35564d = fragmentTransaction.f35564d;
        this.f35565e = fragmentTransaction.f35565e;
        this.f35566f = fragmentTransaction.f35566f;
        this.f35567g = fragmentTransaction.f35567g;
        this.f35568h = fragmentTransaction.f35568h;
        this.f35569i = fragmentTransaction.f35569i;
        this.f35570j = fragmentTransaction.f35570j;
        this.f35571k = fragmentTransaction.f35571k;
        this.f35574n = fragmentTransaction.f35574n;
        this.f35575o = fragmentTransaction.f35575o;
        this.f35572l = fragmentTransaction.f35572l;
        this.f35573m = fragmentTransaction.f35573m;
        if (fragmentTransaction.f35576p != null) {
            ArrayList arrayList = new ArrayList();
            this.f35576p = arrayList;
            arrayList.addAll(fragmentTransaction.f35576p);
        }
        if (fragmentTransaction.f35577q != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f35577q = arrayList2;
            arrayList2.addAll(fragmentTransaction.f35577q);
        }
        this.f35578r = fragmentTransaction.f35578r;
    }
}
