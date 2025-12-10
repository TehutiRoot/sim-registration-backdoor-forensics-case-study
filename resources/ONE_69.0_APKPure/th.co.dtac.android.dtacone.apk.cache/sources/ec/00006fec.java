package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes2.dex */
public final class C4597a extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.InterfaceC4584o {

    /* renamed from: t */
    public final FragmentManager f35709t;

    /* renamed from: u */
    public boolean f35710u;

    /* renamed from: v */
    public int f35711v;

    /* renamed from: w */
    public boolean f35712w;

    public C4597a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().m54398b().getClassLoader() : null);
        this.f35711v = -1;
        this.f35712w = false;
        this.f35709t = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC4584o
    /* renamed from: a */
    public boolean mo54235a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f35657i) {
            this.f35709t.m54319i(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return m54231h(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return m54231h(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.f35709t.m54342a0(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f35709t.m54342a0(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35709t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: e */
    public void mo54234e(int i, Fragment fragment, String str, int i2) {
        super.mo54234e(i, fragment, str, i2);
        fragment.mFragmentManager = this.f35709t;
    }

    /* renamed from: f */
    public void m54233f(int i) {
        if (!this.f35657i) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(i);
        }
        int size = this.f35651c.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(i2);
            Fragment fragment = c4592a.f35669b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(c4592a.f35669b);
                    sb2.append(" to ");
                    sb2.append(c4592a.f35669b.mBackStackNesting);
                }
            }
        }
    }

    /* renamed from: g */
    public void m54232g() {
        int size = this.f35651c.size() - 1;
        while (size >= 0) {
            FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(size);
            if (c4592a.f35670c) {
                if (c4592a.f35668a == 8) {
                    c4592a.f35670c = false;
                    this.f35651c.remove(size - 1);
                    size--;
                } else {
                    int i = c4592a.f35669b.mContainerId;
                    c4592a.f35668a = 2;
                    c4592a.f35670c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        FragmentTransaction.C4592a c4592a2 = (FragmentTransaction.C4592a) this.f35651c.get(i2);
                        if (c4592a2.f35670c && c4592a2.f35669b.mContainerId == i) {
                            this.f35651c.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbShortTitle() {
        if (this.f35662n != 0) {
            return this.f35709t.getHost().m54398b().getText(this.f35662n);
        }
        return this.f35663o;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.f35662n;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbTitle() {
        if (this.f35660l != 0) {
            return this.f35709t.getHost().m54398b().getText(this.f35660l);
        }
        return this.f35661m;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.f35660l;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.f35711v;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public String getName() {
        return this.f35659k;
    }

    /* renamed from: h */
    public int m54231h(boolean z) {
        if (!this.f35710u) {
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new C20316hl0(FragmentManager.TAG));
                m54230i("  ", printWriter);
                printWriter.close();
            }
            this.f35710u = true;
            if (this.f35657i) {
                this.f35711v = this.f35709t.m54310l();
            } else {
                this.f35711v = -1;
            }
            this.f35709t.m54349X(this, z);
            return this.f35711v;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35709t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment);
    }

    /* renamed from: i */
    public void m54230i(String str, PrintWriter printWriter) {
        m54229j(str, printWriter, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.f35651c.isEmpty();
    }

    /* renamed from: j */
    public void m54229j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f35659k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f35711v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f35710u);
            if (this.f35656h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f35656h));
            }
            if (this.f35652d != 0 || this.f35653e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f35652d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f35653e));
            }
            if (this.f35654f != 0 || this.f35655g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f35654f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f35655g));
            }
            if (this.f35660l != 0 || this.f35661m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f35660l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f35661m);
            }
            if (this.f35662n != 0 || this.f35663o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f35662n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f35663o);
            }
        }
        if (!this.f35651c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f35651c.size();
            for (int i = 0; i < size; i++) {
                FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(i);
                switch (c4592a.f35668a) {
                    case 0:
                        str2 = ActionConst.NULL;
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c4592a.f35668a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                printWriter.println(c4592a.f35669b);
                if (z) {
                    if (c4592a.f35671d != 0 || c4592a.f35672e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c4592a.f35671d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c4592a.f35672e));
                    }
                    if (c4592a.f35673f != 0 || c4592a.f35674g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c4592a.f35673f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c4592a.f35674g));
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m54228k() {
        int size = this.f35651c.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(i);
            Fragment fragment = c4592a.f35669b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f35712w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f35656h);
                fragment.setSharedElementNames(this.f35664p, this.f35665q);
            }
            switch (c4592a.f35668a) {
                case 1:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54314j1(fragment, false);
                    this.f35709t.m54316j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c4592a.f35668a);
                case 3:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54352V0(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54277y0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54314j1(fragment, false);
                    this.f35709t.m54302n1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54282w(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54314j1(fragment, false);
                    this.f35709t.m54304n(fragment);
                    break;
                case 8:
                    this.f35709t.m54308l1(fragment);
                    break;
                case 9:
                    this.f35709t.m54308l1(null);
                    break;
                case 10:
                    this.f35709t.m54311k1(fragment, c4592a.f35676i);
                    break;
            }
        }
    }

    /* renamed from: l */
    public void m54227l() {
        for (int size = this.f35651c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(size);
            Fragment fragment = c4592a.f35669b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f35712w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m54329e1(this.f35656h));
                fragment.setSharedElementNames(this.f35665q, this.f35664p);
            }
            switch (c4592a.f35668a) {
                case 1:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54314j1(fragment, true);
                    this.f35709t.m54352V0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c4592a.f35668a);
                case 3:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54316j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54302n1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54314j1(fragment, true);
                    this.f35709t.m54277y0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54304n(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c4592a.f35671d, c4592a.f35672e, c4592a.f35673f, c4592a.f35674g);
                    this.f35709t.m54314j1(fragment, true);
                    this.f35709t.m54282w(fragment);
                    break;
                case 8:
                    this.f35709t.m54308l1(null);
                    break;
                case 9:
                    this.f35709t.m54308l1(fragment);
                    break;
                case 10:
                    this.f35709t.m54311k1(fragment, c4592a.f35675h);
                    break;
            }
        }
    }

    /* renamed from: m */
    public Fragment m54226m(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f35651c.size()) {
            FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(i);
            int i2 = c4592a.f35668a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.f35651c.add(i, new FragmentTransaction.C4592a(9, fragment2, true));
                                c4592a.f35670c = true;
                                i++;
                                fragment2 = c4592a.f35669b;
                            }
                        }
                    } else {
                        arrayList.remove(c4592a.f35669b);
                        Fragment fragment3 = c4592a.f35669b;
                        if (fragment3 == fragment2) {
                            this.f35651c.add(i, new FragmentTransaction.C4592a(9, fragment3));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = c4592a.f35669b;
                    int i3 = fragment4.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment4) {
                                z = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f35651c.add(i, new FragmentTransaction.C4592a(9, fragment5, true));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C4592a c4592a2 = new FragmentTransaction.C4592a(3, fragment5, true);
                                c4592a2.f35671d = c4592a.f35671d;
                                c4592a2.f35673f = c4592a.f35673f;
                                c4592a2.f35672e = c4592a.f35672e;
                                c4592a2.f35674g = c4592a.f35674g;
                                this.f35651c.add(i, c4592a2);
                                arrayList.remove(fragment5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f35651c.remove(i);
                        i--;
                    } else {
                        c4592a.f35668a = 1;
                        c4592a.f35670c = true;
                        arrayList.add(fragment4);
                    }
                }
                i++;
            }
            arrayList.add(c4592a.f35669b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: n */
    public void m54225n() {
        if (this.f35667s != null) {
            for (int i = 0; i < this.f35667s.size(); i++) {
                ((Runnable) this.f35667s.get(i)).run();
            }
            this.f35667s = null;
        }
    }

    /* renamed from: o */
    public Fragment m54224o(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f35651c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) this.f35651c.get(size);
            int i = c4592a.f35668a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c4592a.f35669b;
                            break;
                        case 10:
                            c4592a.f35676i = c4592a.f35675h;
                            break;
                    }
                }
                arrayList.add(c4592a.f35669b);
            }
            arrayList.remove(c4592a.f35669b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35709t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager == this.f35709t) {
            if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
            } else if (state != Lifecycle.State.DESTROYED) {
                return super.setMaxLifecycle(fragment, state);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f35709t);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.f35709t) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35709t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f35711v >= 0) {
            sb.append(" #");
            sb.append(this.f35711v);
        }
        if (this.f35659k != null) {
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(this.f35659k);
        }
        sb.append("}");
        return sb.toString();
    }

    public C4597a(C4597a c4597a) {
        super(c4597a.f35709t.getFragmentFactory(), c4597a.f35709t.getHost() != null ? c4597a.f35709t.getHost().m54398b().getClassLoader() : null, c4597a);
        this.f35711v = -1;
        this.f35712w = false;
        this.f35709t = c4597a.f35709t;
        this.f35710u = c4597a.f35710u;
        this.f35711v = c4597a.f35711v;
        this.f35712w = c4597a.f35712w;
    }
}