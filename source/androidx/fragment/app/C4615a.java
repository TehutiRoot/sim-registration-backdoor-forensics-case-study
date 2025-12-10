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
public final class C4615a extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.InterfaceC4602o {

    /* renamed from: t */
    public final FragmentManager f35621t;

    /* renamed from: u */
    public boolean f35622u;

    /* renamed from: v */
    public int f35623v;

    /* renamed from: w */
    public boolean f35624w;

    public C4615a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().m54448b().getClassLoader() : null);
        this.f35623v = -1;
        this.f35624w = false;
        this.f35621t = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC4602o
    /* renamed from: a */
    public boolean mo54284a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f35569i) {
            this.f35621t.m54369i(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return m54280h(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return m54280h(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.f35621t.m54392a0(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f35621t.m54392a0(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35621t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: e */
    public void mo54283e(int i, Fragment fragment, String str, int i2) {
        super.mo54283e(i, fragment, str, i2);
        fragment.mFragmentManager = this.f35621t;
    }

    /* renamed from: f */
    public void m54282f(int i) {
        if (!this.f35569i) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(i);
        }
        int size = this.f35563c.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(i2);
            Fragment fragment = c4610a.f35581b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(c4610a.f35581b);
                    sb2.append(" to ");
                    sb2.append(c4610a.f35581b.mBackStackNesting);
                }
            }
        }
    }

    /* renamed from: g */
    public void m54281g() {
        int size = this.f35563c.size() - 1;
        while (size >= 0) {
            FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(size);
            if (c4610a.f35582c) {
                if (c4610a.f35580a == 8) {
                    c4610a.f35582c = false;
                    this.f35563c.remove(size - 1);
                    size--;
                } else {
                    int i = c4610a.f35581b.mContainerId;
                    c4610a.f35580a = 2;
                    c4610a.f35582c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        FragmentTransaction.C4610a c4610a2 = (FragmentTransaction.C4610a) this.f35563c.get(i2);
                        if (c4610a2.f35582c && c4610a2.f35581b.mContainerId == i) {
                            this.f35563c.remove(i2);
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
        if (this.f35574n != 0) {
            return this.f35621t.getHost().m54448b().getText(this.f35574n);
        }
        return this.f35575o;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.f35574n;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbTitle() {
        if (this.f35572l != 0) {
            return this.f35621t.getHost().m54448b().getText(this.f35572l);
        }
        return this.f35573m;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.f35572l;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.f35623v;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public String getName() {
        return this.f35571k;
    }

    /* renamed from: h */
    public int m54280h(boolean z) {
        if (!this.f35622u) {
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new C19230bl0(FragmentManager.TAG));
                m54279i("  ", printWriter);
                printWriter.close();
            }
            this.f35622u = true;
            if (this.f35569i) {
                this.f35623v = this.f35621t.m54360l();
            } else {
                this.f35623v = -1;
            }
            this.f35621t.m54399X(this, z);
            return this.f35623v;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35621t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment);
    }

    /* renamed from: i */
    public void m54279i(String str, PrintWriter printWriter) {
        m54278j(str, printWriter, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.f35563c.isEmpty();
    }

    /* renamed from: j */
    public void m54278j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f35571k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f35623v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f35622u);
            if (this.f35568h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f35568h));
            }
            if (this.f35564d != 0 || this.f35565e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f35564d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f35565e));
            }
            if (this.f35566f != 0 || this.f35567g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f35566f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f35567g));
            }
            if (this.f35572l != 0 || this.f35573m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f35572l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f35573m);
            }
            if (this.f35574n != 0 || this.f35575o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f35574n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f35575o);
            }
        }
        if (!this.f35563c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f35563c.size();
            for (int i = 0; i < size; i++) {
                FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(i);
                switch (c4610a.f35580a) {
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
                        str2 = "cmd=" + c4610a.f35580a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                printWriter.println(c4610a.f35581b);
                if (z) {
                    if (c4610a.f35583d != 0 || c4610a.f35584e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c4610a.f35583d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c4610a.f35584e));
                    }
                    if (c4610a.f35585f != 0 || c4610a.f35586g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c4610a.f35585f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c4610a.f35586g));
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m54277k() {
        int size = this.f35563c.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(i);
            Fragment fragment = c4610a.f35581b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f35624w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f35568h);
                fragment.setSharedElementNames(this.f35576p, this.f35577q);
            }
            switch (c4610a.f35580a) {
                case 1:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54364j1(fragment, false);
                    this.f35621t.m54366j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c4610a.f35580a);
                case 3:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54402V0(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54327y0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54364j1(fragment, false);
                    this.f35621t.m54352n1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54332w(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54364j1(fragment, false);
                    this.f35621t.m54354n(fragment);
                    break;
                case 8:
                    this.f35621t.m54358l1(fragment);
                    break;
                case 9:
                    this.f35621t.m54358l1(null);
                    break;
                case 10:
                    this.f35621t.m54361k1(fragment, c4610a.f35588i);
                    break;
            }
        }
    }

    /* renamed from: l */
    public void m54276l() {
        for (int size = this.f35563c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(size);
            Fragment fragment = c4610a.f35581b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f35624w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m54379e1(this.f35568h));
                fragment.setSharedElementNames(this.f35577q, this.f35576p);
            }
            switch (c4610a.f35580a) {
                case 1:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54364j1(fragment, true);
                    this.f35621t.m54402V0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c4610a.f35580a);
                case 3:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54366j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54352n1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54364j1(fragment, true);
                    this.f35621t.m54327y0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54354n(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c4610a.f35583d, c4610a.f35584e, c4610a.f35585f, c4610a.f35586g);
                    this.f35621t.m54364j1(fragment, true);
                    this.f35621t.m54332w(fragment);
                    break;
                case 8:
                    this.f35621t.m54358l1(null);
                    break;
                case 9:
                    this.f35621t.m54358l1(fragment);
                    break;
                case 10:
                    this.f35621t.m54361k1(fragment, c4610a.f35587h);
                    break;
            }
        }
    }

    /* renamed from: m */
    public Fragment m54275m(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f35563c.size()) {
            FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(i);
            int i2 = c4610a.f35580a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.f35563c.add(i, new FragmentTransaction.C4610a(9, fragment2, true));
                                c4610a.f35582c = true;
                                i++;
                                fragment2 = c4610a.f35581b;
                            }
                        }
                    } else {
                        arrayList.remove(c4610a.f35581b);
                        Fragment fragment3 = c4610a.f35581b;
                        if (fragment3 == fragment2) {
                            this.f35563c.add(i, new FragmentTransaction.C4610a(9, fragment3));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = c4610a.f35581b;
                    int i3 = fragment4.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment4) {
                                z = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f35563c.add(i, new FragmentTransaction.C4610a(9, fragment5, true));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C4610a c4610a2 = new FragmentTransaction.C4610a(3, fragment5, true);
                                c4610a2.f35583d = c4610a.f35583d;
                                c4610a2.f35585f = c4610a.f35585f;
                                c4610a2.f35584e = c4610a.f35584e;
                                c4610a2.f35586g = c4610a.f35586g;
                                this.f35563c.add(i, c4610a2);
                                arrayList.remove(fragment5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f35563c.remove(i);
                        i--;
                    } else {
                        c4610a.f35580a = 1;
                        c4610a.f35582c = true;
                        arrayList.add(fragment4);
                    }
                }
                i++;
            }
            arrayList.add(c4610a.f35581b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: n */
    public void m54274n() {
        if (this.f35579s != null) {
            for (int i = 0; i < this.f35579s.size(); i++) {
                ((Runnable) this.f35579s.get(i)).run();
            }
            this.f35579s = null;
        }
    }

    /* renamed from: o */
    public Fragment m54273o(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f35563c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) this.f35563c.get(size);
            int i = c4610a.f35580a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c4610a.f35581b;
                            break;
                        case 10:
                            c4610a.f35588i = c4610a.f35587h;
                            break;
                    }
                }
                arrayList.add(c4610a.f35581b);
            }
            arrayList.remove(c4610a.f35581b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35621t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager == this.f35621t) {
            if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
            } else if (state != Lifecycle.State.DESTROYED) {
                return super.setMaxLifecycle(fragment, state);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f35621t);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.f35621t) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f35621t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f35623v >= 0) {
            sb.append(" #");
            sb.append(this.f35623v);
        }
        if (this.f35571k != null) {
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(this.f35571k);
        }
        sb.append("}");
        return sb.toString();
    }

    public C4615a(C4615a c4615a) {
        super(c4615a.f35621t.getFragmentFactory(), c4615a.f35621t.getHost() != null ? c4615a.f35621t.getHost().m54448b().getClassLoader() : null, c4615a);
        this.f35623v = -1;
        this.f35624w = false;
        this.f35621t = c4615a.f35621t;
        this.f35622u = c4615a.f35622u;
        this.f35623v = c4615a.f35623v;
        this.f35624w = c4615a.f35624w;
    }
}
