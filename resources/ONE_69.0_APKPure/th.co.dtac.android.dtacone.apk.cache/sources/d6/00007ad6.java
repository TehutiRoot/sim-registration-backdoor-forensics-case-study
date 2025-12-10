package ch.qos.logback.core.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    protected int maxComponents = Integer.MAX_VALUE;
    protected long timeout = ComponentTracker.DEFAULT_TIMEOUT;

    /* renamed from: a */
    public LinkedHashMap f40101a = new LinkedHashMap(32, 0.75f, true);

    /* renamed from: b */
    public LinkedHashMap f40102b = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: c */
    public long f40103c = 0;

    /* renamed from: d */
    public InterfaceC5485e f40104d = new C5481a();

    /* renamed from: e */
    public InterfaceC5485e f40105e = new C5482b();

    /* renamed from: f */
    public InterfaceC5485e f40106f = new C5483c();

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$a */
    /* loaded from: classes.dex */
    public class C5481a implements InterfaceC5485e {
        public C5481a() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.InterfaceC5485e
        /* renamed from: a */
        public boolean mo51355a(C5484d c5484d, long j) {
            return AbstractComponentTracker.this.f40101a.size() > AbstractComponentTracker.this.maxComponents;
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$b */
    /* loaded from: classes.dex */
    public class C5482b implements InterfaceC5485e {
        public C5482b() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.InterfaceC5485e
        /* renamed from: a */
        public boolean mo51355a(C5484d c5484d, long j) {
            return AbstractComponentTracker.this.m51361f(c5484d, j);
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$c */
    /* loaded from: classes.dex */
    public class C5483c implements InterfaceC5485e {
        public C5483c() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.InterfaceC5485e
        /* renamed from: a */
        public boolean mo51355a(C5484d c5484d, long j) {
            return AbstractComponentTracker.this.m51362e(c5484d, j);
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$d */
    /* loaded from: classes.dex */
    public static class C5484d {

        /* renamed from: a */
        public String f40110a;

        /* renamed from: b */
        public Object f40111b;

        /* renamed from: c */
        public long f40112c;

        public C5484d(String str, Object obj, long j) {
            this.f40110a = str;
            this.f40111b = obj;
            this.f40112c = j;
        }

        /* renamed from: a */
        public void m51356a(long j) {
            this.f40112c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C5484d c5484d = (C5484d) obj;
                String str = this.f40110a;
                if (str == null) {
                    if (c5484d.f40110a != null) {
                        return false;
                    }
                } else if (!str.equals(c5484d.f40110a)) {
                    return false;
                }
                Object obj2 = this.f40111b;
                Object obj3 = c5484d.f40111b;
                if (obj2 == null) {
                    if (obj3 != null) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f40110a.hashCode();
        }

        public String toString() {
            return "(" + this.f40110a + ", " + this.f40111b + ")";
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$e */
    /* loaded from: classes.dex */
    public interface InterfaceC5485e {
        /* renamed from: a */
        boolean mo51355a(C5484d c5484d, long j);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        for (C5484d c5484d : this.f40101a.values()) {
            arrayList.add(c5484d.f40111b);
        }
        for (C5484d c5484d2 : this.f40102b.values()) {
            arrayList.add(c5484d2.f40111b);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.f40101a.keySet());
        hashSet.addAll(this.f40102b.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m51364c(LinkedHashMap linkedHashMap, long j, InterfaceC5485e interfaceC5485e) {
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C5484d c5484d = (C5484d) ((Map.Entry) it.next()).getValue();
            if (!interfaceC5485e.mo51355a(c5484d, j)) {
                return;
            }
            it.remove();
            processPriorToRemoval(c5484d.f40111b);
        }
    }

    /* renamed from: d */
    public final C5484d m51363d(String str) {
        C5484d c5484d = (C5484d) this.f40101a.get(str);
        return c5484d != null ? c5484d : (C5484d) this.f40102b.get(str);
    }

    /* renamed from: e */
    public final boolean m51362e(C5484d c5484d, long j) {
        return c5484d.f40112c + 10000 < j;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        C5484d c5484d = (C5484d) this.f40101a.remove(str);
        if (c5484d == null) {
            return;
        }
        this.f40102b.put(str, c5484d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final boolean m51361f(C5484d c5484d, long j) {
        return isComponentStale(c5484d.f40111b) || c5484d.f40112c + this.timeout < j;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        C5484d m51363d = m51363d(str);
        if (m51363d == null) {
            return null;
        }
        return (C) m51363d.f40111b;
    }

    /* renamed from: g */
    public final boolean m51360g(long j) {
        if (this.f40103c + 1000 > j) {
            return true;
        }
        this.f40103c = j;
        return false;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.f40101a.size() + this.f40102b.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j) {
        C5484d m51363d;
        try {
            m51363d = m51363d(str);
            if (m51363d == null) {
                C5484d c5484d = new C5484d(str, buildComponent(str), j);
                this.f40101a.put(str, c5484d);
                m51363d = c5484d;
            } else {
                m51363d.m51356a(j);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C) m51363d.f40111b;
    }

    public long getTimeout() {
        return this.timeout;
    }

    /* renamed from: h */
    public final void m51359h() {
        m51364c(this.f40101a, 0L, this.f40104d);
    }

    /* renamed from: i */
    public final void m51358i(long j) {
        m51364c(this.f40102b, j, this.f40106f);
    }

    public abstract boolean isComponentStale(C c);

    /* renamed from: j */
    public final void m51357j(long j) {
        m51364c(this.f40101a, j, this.f40105e);
    }

    public abstract void processPriorToRemoval(C c);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j) {
        if (m51360g(j)) {
            return;
        }
        m51359h();
        m51357j(j);
        m51358i(j);
    }

    public void setMaxComponents(int i) {
        this.maxComponents = i;
    }

    public void setTimeout(long j) {
        this.timeout = j;
    }
}