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
    public LinkedHashMap f40103a = new LinkedHashMap(32, 0.75f, true);

    /* renamed from: b */
    public LinkedHashMap f40104b = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: c */
    public long f40105c = 0;

    /* renamed from: d */
    public InterfaceC5496e f40106d = new C5492a();

    /* renamed from: e */
    public InterfaceC5496e f40107e = new C5493b();

    /* renamed from: f */
    public InterfaceC5496e f40108f = new C5494c();

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$a */
    /* loaded from: classes.dex */
    public class C5492a implements InterfaceC5496e {
        public C5492a() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.InterfaceC5496e
        /* renamed from: a */
        public boolean mo51360a(C5495d c5495d, long j) {
            return AbstractComponentTracker.this.f40103a.size() > AbstractComponentTracker.this.maxComponents;
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$b */
    /* loaded from: classes.dex */
    public class C5493b implements InterfaceC5496e {
        public C5493b() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.InterfaceC5496e
        /* renamed from: a */
        public boolean mo51360a(C5495d c5495d, long j) {
            return AbstractComponentTracker.this.m51366f(c5495d, j);
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$c */
    /* loaded from: classes.dex */
    public class C5494c implements InterfaceC5496e {
        public C5494c() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.InterfaceC5496e
        /* renamed from: a */
        public boolean mo51360a(C5495d c5495d, long j) {
            return AbstractComponentTracker.this.m51367e(c5495d, j);
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$d */
    /* loaded from: classes.dex */
    public static class C5495d {

        /* renamed from: a */
        public String f40112a;

        /* renamed from: b */
        public Object f40113b;

        /* renamed from: c */
        public long f40114c;

        public C5495d(String str, Object obj, long j) {
            this.f40112a = str;
            this.f40113b = obj;
            this.f40114c = j;
        }

        /* renamed from: a */
        public void m51361a(long j) {
            this.f40114c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C5495d c5495d = (C5495d) obj;
                String str = this.f40112a;
                if (str == null) {
                    if (c5495d.f40112a != null) {
                        return false;
                    }
                } else if (!str.equals(c5495d.f40112a)) {
                    return false;
                }
                Object obj2 = this.f40113b;
                Object obj3 = c5495d.f40113b;
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
            return this.f40112a.hashCode();
        }

        public String toString() {
            return "(" + this.f40112a + ", " + this.f40113b + ")";
        }
    }

    /* renamed from: ch.qos.logback.core.spi.AbstractComponentTracker$e */
    /* loaded from: classes.dex */
    public interface InterfaceC5496e {
        /* renamed from: a */
        boolean mo51360a(C5495d c5495d, long j);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        for (C5495d c5495d : this.f40103a.values()) {
            arrayList.add(c5495d.f40113b);
        }
        for (C5495d c5495d2 : this.f40104b.values()) {
            arrayList.add(c5495d2.f40113b);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.f40103a.keySet());
        hashSet.addAll(this.f40104b.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m51369c(LinkedHashMap linkedHashMap, long j, InterfaceC5496e interfaceC5496e) {
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C5495d c5495d = (C5495d) ((Map.Entry) it.next()).getValue();
            if (!interfaceC5496e.mo51360a(c5495d, j)) {
                return;
            }
            it.remove();
            processPriorToRemoval(c5495d.f40113b);
        }
    }

    /* renamed from: d */
    public final C5495d m51368d(String str) {
        C5495d c5495d = (C5495d) this.f40103a.get(str);
        return c5495d != null ? c5495d : (C5495d) this.f40104b.get(str);
    }

    /* renamed from: e */
    public final boolean m51367e(C5495d c5495d, long j) {
        return c5495d.f40114c + 10000 < j;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        C5495d c5495d = (C5495d) this.f40103a.remove(str);
        if (c5495d == null) {
            return;
        }
        this.f40104b.put(str, c5495d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final boolean m51366f(C5495d c5495d, long j) {
        return isComponentStale(c5495d.f40113b) || c5495d.f40114c + this.timeout < j;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        C5495d m51368d = m51368d(str);
        if (m51368d == null) {
            return null;
        }
        return (C) m51368d.f40113b;
    }

    /* renamed from: g */
    public final boolean m51365g(long j) {
        if (this.f40105c + 1000 > j) {
            return true;
        }
        this.f40105c = j;
        return false;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.f40103a.size() + this.f40104b.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j) {
        C5495d m51368d;
        try {
            m51368d = m51368d(str);
            if (m51368d == null) {
                C5495d c5495d = new C5495d(str, buildComponent(str), j);
                this.f40103a.put(str, c5495d);
                m51368d = c5495d;
            } else {
                m51368d.m51361a(j);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C) m51368d.f40113b;
    }

    public long getTimeout() {
        return this.timeout;
    }

    /* renamed from: h */
    public final void m51364h() {
        m51369c(this.f40103a, 0L, this.f40106d);
    }

    /* renamed from: i */
    public final void m51363i(long j) {
        m51369c(this.f40104b, j, this.f40108f);
    }

    public abstract boolean isComponentStale(C c);

    /* renamed from: j */
    public final void m51362j(long j) {
        m51369c(this.f40103a, j, this.f40107e);
    }

    public abstract void processPriorToRemoval(C c);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j) {
        if (m51365g(j)) {
            return;
        }
        m51364h();
        m51362j(j);
        m51363i(j);
    }

    public void setMaxComponents(int i) {
        this.maxComponents = i;
    }

    public void setTimeout(long j) {
        this.timeout = j;
    }
}
