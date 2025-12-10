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
public final class C4629h extends ViewModel {

    /* renamed from: h */
    public static final ViewModelProvider.Factory f35663h = new C4630a();

    /* renamed from: d */
    public final boolean f35667d;

    /* renamed from: a */
    public final HashMap f35664a = new HashMap();

    /* renamed from: b */
    public final HashMap f35665b = new HashMap();

    /* renamed from: c */
    public final HashMap f35666c = new HashMap();

    /* renamed from: e */
    public boolean f35668e = false;

    /* renamed from: f */
    public boolean f35669f = false;

    /* renamed from: g */
    public boolean f35670g = false;

    /* renamed from: androidx.fragment.app.h$a */
    /* loaded from: classes2.dex */
    public class C4630a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return U22.m66144b(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            return new C4629h(true);
        }
    }

    public C4629h(boolean z) {
        this.f35667d = z;
    }

    /* renamed from: h */
    public static C4629h m54236h(ViewModelStore viewModelStore) {
        return (C4629h) new ViewModelProvider(viewModelStore, f35663h).get(C4629h.class);
    }

    /* renamed from: b */
    public void m54242b(Fragment fragment) {
        if (this.f35670g) {
            FragmentManager.isLoggingEnabled(2);
        } else if (this.f35664a.containsKey(fragment.mWho)) {
        } else {
            this.f35664a.put(fragment.mWho, fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    /* renamed from: c */
    public void m54241c(Fragment fragment) {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        m54239e(fragment.mWho);
    }

    /* renamed from: d */
    public void m54240d(String str) {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        m54239e(str);
    }

    /* renamed from: e */
    public final void m54239e(String str) {
        C4629h c4629h = (C4629h) this.f35665b.get(str);
        if (c4629h != null) {
            c4629h.onCleared();
            this.f35665b.remove(str);
        }
        ViewModelStore viewModelStore = (ViewModelStore) this.f35666c.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.f35666c.remove(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4629h.class != obj.getClass()) {
            return false;
        }
        C4629h c4629h = (C4629h) obj;
        if (this.f35664a.equals(c4629h.f35664a) && this.f35665b.equals(c4629h.f35665b) && this.f35666c.equals(c4629h.f35666c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Fragment m54238f(String str) {
        return (Fragment) this.f35664a.get(str);
    }

    /* renamed from: g */
    public C4629h m54237g(Fragment fragment) {
        C4629h c4629h = (C4629h) this.f35665b.get(fragment.mWho);
        if (c4629h == null) {
            C4629h c4629h2 = new C4629h(this.f35667d);
            this.f35665b.put(fragment.mWho, c4629h2);
            return c4629h2;
        }
        return c4629h;
    }

    public int hashCode() {
        return (((this.f35664a.hashCode() * 31) + this.f35665b.hashCode()) * 31) + this.f35666c.hashCode();
    }

    /* renamed from: i */
    public Collection m54235i() {
        return new ArrayList(this.f35664a.values());
    }

    /* renamed from: j */
    public FragmentManagerNonConfig m54234j() {
        if (this.f35664a.isEmpty() && this.f35665b.isEmpty() && this.f35666c.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f35665b.entrySet()) {
            FragmentManagerNonConfig m54234j = ((C4629h) entry.getValue()).m54234j();
            if (m54234j != null) {
                hashMap.put((String) entry.getKey(), m54234j);
            }
        }
        this.f35669f = true;
        if (this.f35664a.isEmpty() && hashMap.isEmpty() && this.f35666c.isEmpty()) {
            return null;
        }
        return new FragmentManagerNonConfig(new ArrayList(this.f35664a.values()), hashMap, new HashMap(this.f35666c));
    }

    /* renamed from: k */
    public ViewModelStore m54233k(Fragment fragment) {
        ViewModelStore viewModelStore = (ViewModelStore) this.f35666c.get(fragment.mWho);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.f35666c.put(fragment.mWho, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    /* renamed from: l */
    public boolean m54232l() {
        return this.f35668e;
    }

    /* renamed from: m */
    public void m54231m(Fragment fragment) {
        if (this.f35670g) {
            FragmentManager.isLoggingEnabled(2);
        } else if (this.f35664a.remove(fragment.mWho) != null && FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* renamed from: n */
    public void m54230n(FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.f35664a.clear();
        this.f35665b.clear();
        this.f35666c.clear();
        if (fragmentManagerNonConfig != null) {
            Collection<Fragment> m54315b = fragmentManagerNonConfig.m54315b();
            if (m54315b != null) {
                for (Fragment fragment : m54315b) {
                    if (fragment != null) {
                        this.f35664a.put(fragment.mWho, fragment);
                    }
                }
            }
            Map m54316a = fragmentManagerNonConfig.m54316a();
            if (m54316a != null) {
                for (Map.Entry entry : m54316a.entrySet()) {
                    C4629h c4629h = new C4629h(this.f35667d);
                    c4629h.m54230n((FragmentManagerNonConfig) entry.getValue());
                    this.f35665b.put((String) entry.getKey(), c4629h);
                }
            }
            Map m54314c = fragmentManagerNonConfig.m54314c();
            if (m54314c != null) {
                this.f35666c.putAll(m54314c);
            }
        }
        this.f35669f = false;
    }

    /* renamed from: o */
    public void m54229o(boolean z) {
        this.f35670g = z;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f35668e = true;
    }

    /* renamed from: p */
    public boolean m54228p(Fragment fragment) {
        if (!this.f35664a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f35667d) {
            return this.f35668e;
        }
        return !this.f35669f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f35664a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f35665b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f35666c.keySet().iterator();
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
