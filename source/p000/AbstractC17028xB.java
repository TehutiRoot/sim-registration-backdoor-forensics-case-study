package p000;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.Qualified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: xB */
/* loaded from: classes4.dex */
public abstract class AbstractC17028xB {

    /* renamed from: xB$b */
    /* loaded from: classes4.dex */
    public static class C17030b {

        /* renamed from: a */
        public final Component f108264a;

        /* renamed from: b */
        public final Set f108265b = new HashSet();

        /* renamed from: c */
        public final Set f108266c = new HashSet();

        public C17030b(Component component) {
            this.f108264a = component;
        }

        /* renamed from: a */
        public void m602a(C17030b c17030b) {
            this.f108265b.add(c17030b);
        }

        /* renamed from: b */
        public void m601b(C17030b c17030b) {
            this.f108266c.add(c17030b);
        }

        /* renamed from: c */
        public Component m600c() {
            return this.f108264a;
        }

        /* renamed from: d */
        public Set m599d() {
            return this.f108265b;
        }

        /* renamed from: e */
        public boolean m598e() {
            return this.f108265b.isEmpty();
        }

        /* renamed from: f */
        public boolean m597f() {
            return this.f108266c.isEmpty();
        }

        /* renamed from: g */
        public void m596g(C17030b c17030b) {
            this.f108266c.remove(c17030b);
        }
    }

    /* renamed from: xB$c */
    /* loaded from: classes4.dex */
    public static class C17031c {

        /* renamed from: a */
        public final Qualified f108267a;

        /* renamed from: b */
        public final boolean f108268b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C17031c)) {
                return false;
            }
            C17031c c17031c = (C17031c) obj;
            if (!c17031c.f108267a.equals(this.f108267a) || c17031c.f108268b != this.f108268b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f108267a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f108268b).hashCode();
        }

        public C17031c(Qualified qualified, boolean z) {
            this.f108267a = qualified;
            this.f108268b = z;
        }
    }

    /* renamed from: a */
    public static void m605a(List list) {
        Set<C17030b> m603c = m603c(list);
        Set m604b = m604b(m603c);
        int i = 0;
        while (!m604b.isEmpty()) {
            C17030b c17030b = (C17030b) m604b.iterator().next();
            m604b.remove(c17030b);
            i++;
            for (C17030b c17030b2 : c17030b.m599d()) {
                c17030b2.m596g(c17030b);
                if (c17030b2.m597f()) {
                    m604b.add(c17030b2);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C17030b c17030b3 : m603c) {
            if (!c17030b3.m597f() && !c17030b3.m598e()) {
                arrayList.add(c17030b3.m600c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    public static Set m604b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C17030b c17030b = (C17030b) it.next();
            if (c17030b.m597f()) {
                hashSet.add(c17030b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set m603c(List list) {
        Set<C17030b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            C17030b c17030b = new C17030b(component);
            for (Qualified qualified : component.getProvidedInterfaces()) {
                C17031c c17031c = new C17031c(qualified, !component.isValue());
                if (!hashMap.containsKey(c17031c)) {
                    hashMap.put(c17031c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c17031c);
                if (!set2.isEmpty() && !c17031c.f108268b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(c17030b);
            }
        }
        for (Set<C17030b> set3 : hashMap.values()) {
            for (C17030b c17030b2 : set3) {
                for (Dependency dependency : c17030b2.m600c().getDependencies()) {
                    if (dependency.isDirectInjection() && (set = (Set) hashMap.get(new C17031c(dependency.getInterface(), dependency.isSet()))) != null) {
                        for (C17030b c17030b3 : set) {
                            c17030b2.m602a(c17030b3);
                            c17030b3.m601b(c17030b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
