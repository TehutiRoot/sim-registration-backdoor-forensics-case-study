package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes2.dex */
public final class C4611h extends ViewModel {

    /* renamed from: h */
    public static final ViewModelProvider.Factory f35751h = new C4612a();

    /* renamed from: d */
    public final boolean f35755d;

    /* renamed from: a */
    public final HashMap f35752a = new HashMap();

    /* renamed from: b */
    public final HashMap f35753b = new HashMap();

    /* renamed from: c */
    public final HashMap f35754c = new HashMap();

    /* renamed from: e */
    public boolean f35756e = false;

    /* renamed from: f */
    public boolean f35757f = false;

    /* renamed from: g */
    public boolean f35758g = false;

    /* renamed from: androidx.fragment.app.h$a */
    /* loaded from: classes2.dex */
    public class C4612a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return R32.m66706b(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            return new C4611h(true);
        }
    }

    public C4611h(boolean z) {
        this.f35755d = z;
    }

    /* renamed from: h */
    public static C4611h m54187h(ViewModelStore viewModelStore) {
        return (C4611h) new ViewModelProvider(viewModelStore, f35751h).get(C4611h.class);
    }

    /* renamed from: b */
    public void m54193b(Fragment fragment) {
        if (this.f35758g) {
            FragmentManager.isLoggingEnabled(2);
        } else if (this.f35752a.containsKey(fragment.mWho)) {
        } else {
            this.f35752a.put(fragment.mWho, fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    /* renamed from: c */
    public void m54192c(Fragment fragment) {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        m54190e(fragment.mWho);
    }

    /* renamed from: d */
    public void m54191d(String str) {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        m54190e(str);
    }

    /* renamed from: e */
    public final void m54190e(String str) {
        C4611h c4611h = (C4611h) this.f35753b.get(str);
        if (c4611h != null) {
            c4611h.onCleared();
            this.f35753b.remove(str);
        }
        ViewModelStore viewModelStore = (ViewModelStore) this.f35754c.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.f35754c.remove(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4611h.class != obj.getClass()) {
            return false;
        }
        C4611h c4611h = (C4611h) obj;
        if (this.f35752a.equals(c4611h.f35752a) && this.f35753b.equals(c4611h.f35753b) && this.f35754c.equals(c4611h.f35754c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Fragment m54189f(String str) {
        return (Fragment) this.f35752a.get(str);
    }

    /* renamed from: g */
    public C4611h m54188g(Fragment fragment) {
        C4611h c4611h = (C4611h) this.f35753b.get(fragment.mWho);
        if (c4611h == null) {
            C4611h c4611h2 = new C4611h(this.f35755d);
            this.f35753b.put(fragment.mWho, c4611h2);
            return c4611h2;
        }
        return c4611h;
    }

    public int hashCode() {
        return (((this.f35752a.hashCode() * 31) + this.f35753b.hashCode()) * 31) + this.f35754c.hashCode();
    }

    /* renamed from: i */
    public Collection m54186i() {
        return new ArrayList(this.f35752a.values());
    }

    /* renamed from: j */
    public FragmentManagerNonConfig m54185j() {
        if (this.f35752a.isEmpty() && this.f35753b.isEmpty() && this.f35754c.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f35753b.entrySet()) {
            FragmentManagerNonConfig m54185j = ((C4611h) entry.getValue()).m54185j();
            if (m54185j != null) {
                hashMap.put((String) entry.getKey(), m54185j);
            }
        }
        this.f35757f = true;
        if (this.f35752a.isEmpty() && hashMap.isEmpty() && this.f35754c.isEmpty()) {
            return null;
        }
        return new FragmentManagerNonConfig(new ArrayList(this.f35752a.values()), hashMap, new HashMap(this.f35754c));
    }

    /* renamed from: k */
    public ViewModelStore m54184k(Fragment fragment) {
        ViewModelStore viewModelStore = (ViewModelStore) this.f35754c.get(fragment.mWho);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.f35754c.put(fragment.mWho, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    /* renamed from: l */
    public boolean m54183l() {
        return this.f35756e;
    }

    /* renamed from: m */
    public void m54182m(Fragment fragment) {
        if (this.f35758g) {
            FragmentManager.isLoggingEnabled(2);
        } else if (this.f35752a.remove(fragment.mWho) != null && FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* renamed from: n */
    public void m54181n(FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.f35752a.clear();
        this.f35753b.clear();
        this.f35754c.clear();
        if (fragmentManagerNonConfig != null) {
            Collection<Fragment> m54266b = fragmentManagerNonConfig.m54266b();
            if (m54266b != null) {
                for (Fragment fragment : m54266b) {
                    if (fragment != null) {
                        this.f35752a.put(fragment.mWho, fragment);
                    }
                }
            }
            Map m54267a = fragmentManagerNonConfig.m54267a();
            if (m54267a != null) {
                for (Map.Entry entry : m54267a.entrySet()) {
                    C4611h c4611h = new C4611h(this.f35755d);
                    c4611h.m54181n((FragmentManagerNonConfig) entry.getValue());
                    this.f35753b.put((String) entry.getKey(), c4611h);
                }
            }
            Map m54265c = fragmentManagerNonConfig.m54265c();
            if (m54265c != null) {
                this.f35754c.putAll(m54265c);
            }
        }
        this.f35757f = false;
    }

    /* renamed from: o */
    public void m54180o(boolean z) {
        this.f35758g = z;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f35756e = true;
    }

    /* renamed from: p */
    public boolean m54179p(Fragment fragment) {
        if (!this.f35752a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f35755d) {
            return this.f35756e;
        }
        return !this.f35757f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f35752a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f35753b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f35754c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}