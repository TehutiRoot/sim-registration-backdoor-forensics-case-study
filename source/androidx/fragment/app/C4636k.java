package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes2.dex */
public class C4636k {

    /* renamed from: a */
    public final ArrayList f35693a = new ArrayList();

    /* renamed from: b */
    public final HashMap f35694b = new HashMap();

    /* renamed from: c */
    public final HashMap f35695c = new HashMap();

    /* renamed from: d */
    public C4629h f35696d;

    /* renamed from: A */
    public ArrayList m54202A() {
        synchronized (this.f35693a) {
            try {
                if (this.f35693a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f35693a.size());
                Iterator it = this.f35693a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(fragment.mWho);
                        sb.append("): ");
                        sb.append(fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: B */
    public void m54201B(C4629h c4629h) {
        this.f35696d = c4629h;
    }

    /* renamed from: C */
    public Bundle m54200C(String str, Bundle bundle) {
        if (bundle != null) {
            return (Bundle) this.f35695c.put(str, bundle);
        }
        return (Bundle) this.f35695c.remove(str);
    }

    /* renamed from: a */
    public void m54199a(Fragment fragment) {
        if (!this.f35693a.contains(fragment)) {
            synchronized (this.f35693a) {
                this.f35693a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void m54198b() {
        this.f35694b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m54197c(String str) {
        if (this.f35694b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m54196d(int i) {
        for (C4633j c4633j : this.f35694b.values()) {
            if (c4633j != null) {
                c4633j.m54205t(i);
            }
        }
    }

    /* renamed from: e */
    public void m54195e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f35694b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C4633j c4633j : this.f35694b.values()) {
                printWriter.print(str);
                if (c4633j != null) {
                    Fragment m54214k = c4633j.m54214k();
                    printWriter.println(m54214k);
                    m54214k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        int size = this.f35693a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f35693a.get(i)).toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m54194f(String str) {
        C4633j c4633j = (C4633j) this.f35694b.get(str);
        if (c4633j != null) {
            return c4633j.m54214k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m54193g(int i) {
        for (int size = this.f35693a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f35693a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C4633j c4633j : this.f35694b.values()) {
            if (c4633j != null) {
                Fragment m54214k = c4633j.m54214k();
                if (m54214k.mFragmentId == i) {
                    return m54214k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m54192h(String str) {
        if (str != null) {
            for (int size = this.f35693a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f35693a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C4633j c4633j : this.f35694b.values()) {
                if (c4633j != null) {
                    Fragment m54214k = c4633j.m54214k();
                    if (str.equals(m54214k.mTag)) {
                        return m54214k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m54191i(String str) {
        Fragment findFragmentByWho;
        for (C4633j c4633j : this.f35694b.values()) {
            if (c4633j != null && (findFragmentByWho = c4633j.m54214k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m54190j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f35693a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = (Fragment) this.f35693a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f35693a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f35693a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public int m54189k() {
        return this.f35694b.size();
    }

    /* renamed from: l */
    public List m54188l() {
        ArrayList arrayList = new ArrayList();
        for (C4633j c4633j : this.f35694b.values()) {
            if (c4633j != null) {
                arrayList.add(c4633j);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public List m54187m() {
        ArrayList arrayList = new ArrayList();
        for (C4633j c4633j : this.f35694b.values()) {
            if (c4633j != null) {
                arrayList.add(c4633j.m54214k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public HashMap m54186n() {
        return this.f35695c;
    }

    /* renamed from: o */
    public C4633j m54185o(String str) {
        return (C4633j) this.f35694b.get(str);
    }

    /* renamed from: p */
    public List m54184p() {
        ArrayList arrayList;
        if (this.f35693a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f35693a) {
            arrayList = new ArrayList(this.f35693a);
        }
        return arrayList;
    }

    /* renamed from: q */
    public C4629h m54183q() {
        return this.f35696d;
    }

    /* renamed from: r */
    public Bundle m54182r(String str) {
        return (Bundle) this.f35695c.get(str);
    }

    /* renamed from: s */
    public void m54181s(C4633j c4633j) {
        Fragment m54214k = c4633j.m54214k();
        if (m54197c(m54214k.mWho)) {
            return;
        }
        this.f35694b.put(m54214k.mWho, c4633j);
        if (m54214k.mRetainInstanceChangedWhileDetached) {
            if (m54214k.mRetainInstance) {
                this.f35696d.m54242b(m54214k);
            } else {
                this.f35696d.m54231m(m54214k);
            }
            m54214k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(m54214k);
        }
    }

    /* renamed from: t */
    public void m54180t(C4633j c4633j) {
        Fragment m54214k = c4633j.m54214k();
        if (m54214k.mRetainInstance) {
            this.f35696d.m54231m(m54214k);
        }
        if (this.f35694b.get(m54214k.mWho) == c4633j && ((C4633j) this.f35694b.put(m54214k.mWho, null)) != null && FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(m54214k);
        }
    }

    /* renamed from: u */
    public void m54179u() {
        Iterator it = this.f35693a.iterator();
        while (it.hasNext()) {
            C4633j c4633j = (C4633j) this.f35694b.get(((Fragment) it.next()).mWho);
            if (c4633j != null) {
                c4633j.m54212m();
            }
        }
        for (C4633j c4633j2 : this.f35694b.values()) {
            if (c4633j2 != null) {
                c4633j2.m54212m();
                Fragment m54214k = c4633j2.m54214k();
                if (m54214k.mRemoving && !m54214k.isInBackStack()) {
                    if (m54214k.mBeingSaved && !this.f35695c.containsKey(m54214k.mWho)) {
                        m54200C(m54214k.mWho, c4633j2.m54207r());
                    }
                    m54180t(c4633j2);
                }
            }
        }
    }

    /* renamed from: v */
    public void m54178v(Fragment fragment) {
        synchronized (this.f35693a) {
            this.f35693a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: w */
    public void m54177w() {
        this.f35694b.clear();
    }

    /* renamed from: x */
    public void m54176x(List list) {
        this.f35693a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment m54194f = m54194f(str);
                if (m54194f != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(str);
                        sb.append("): ");
                        sb.append(m54194f);
                    }
                    m54199a(m54194f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* renamed from: y */
    public void m54175y(HashMap hashMap) {
        this.f35695c.clear();
        this.f35695c.putAll(hashMap);
    }

    /* renamed from: z */
    public ArrayList m54174z() {
        ArrayList arrayList = new ArrayList(this.f35694b.size());
        for (C4633j c4633j : this.f35694b.values()) {
            if (c4633j != null) {
                Fragment m54214k = c4633j.m54214k();
                m54200C(m54214k.mWho, c4633j.m54207r());
                arrayList.add(m54214k.mWho);
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(m54214k);
                    sb.append(": ");
                    sb.append(m54214k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
