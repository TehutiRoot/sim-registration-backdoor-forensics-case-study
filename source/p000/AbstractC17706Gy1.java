package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* renamed from: Gy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC17706Gy1 {

    /* renamed from: a */
    public final Object f2071a;

    /* renamed from: b */
    public final Set f2072b = new HashSet();

    /* renamed from: c */
    public final LinkedList f2073c = new LinkedList();

    /* renamed from: d */
    public final LinkedList f2074d = new LinkedList();

    public AbstractC17706Gy1(Object obj) {
        this.f2071a = obj;
    }

    /* renamed from: a */
    public PoolEntry m68146a(Object obj) {
        PoolEntry mo24554b = mo24554b(obj);
        this.f2072b.add(mo24554b);
        return mo24554b;
    }

    /* renamed from: b */
    public abstract PoolEntry mo24554b(Object obj);

    /* renamed from: c */
    public void m68145c(PoolEntry poolEntry, boolean z) {
        Args.notNull(poolEntry, "Pool entry");
        Asserts.check(this.f2072b.remove(poolEntry), "Entry %s has not been leased from this pool", poolEntry);
        if (z) {
            this.f2073c.addFirst(poolEntry);
        }
    }

    /* renamed from: d */
    public int m68144d() {
        return this.f2073c.size() + this.f2072b.size();
    }

    /* renamed from: e */
    public int m68143e() {
        return this.f2073c.size();
    }

    /* renamed from: f */
    public PoolEntry m68142f(Object obj) {
        if (!this.f2073c.isEmpty()) {
            if (obj != null) {
                Iterator it = this.f2073c.iterator();
                while (it.hasNext()) {
                    PoolEntry poolEntry = (PoolEntry) it.next();
                    if (obj.equals(poolEntry.getState())) {
                        it.remove();
                        this.f2072b.add(poolEntry);
                        return poolEntry;
                    }
                }
            }
            Iterator it2 = this.f2073c.iterator();
            while (it2.hasNext()) {
                PoolEntry poolEntry2 = (PoolEntry) it2.next();
                if (poolEntry2.getState() == null) {
                    it2.remove();
                    this.f2072b.add(poolEntry2);
                    return poolEntry2;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public PoolEntry m68141g() {
        if (this.f2073c.isEmpty()) {
            return null;
        }
        return (PoolEntry) this.f2073c.getLast();
    }

    /* renamed from: h */
    public int m68140h() {
        return this.f2072b.size();
    }

    /* renamed from: i */
    public int m68139i() {
        return this.f2074d.size();
    }

    /* renamed from: j */
    public Future m68138j() {
        return (Future) this.f2074d.poll();
    }

    /* renamed from: k */
    public void m68137k(Future future) {
        if (future == null) {
            return;
        }
        this.f2074d.add(future);
    }

    /* renamed from: l */
    public boolean m68136l(PoolEntry poolEntry) {
        Args.notNull(poolEntry, "Pool entry");
        if (!this.f2073c.remove(poolEntry) && !this.f2072b.remove(poolEntry)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void m68135m() {
        Iterator it = this.f2074d.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f2074d.clear();
        Iterator it2 = this.f2073c.iterator();
        while (it2.hasNext()) {
            ((PoolEntry) it2.next()).close();
        }
        this.f2073c.clear();
        for (PoolEntry poolEntry : this.f2072b) {
            poolEntry.close();
        }
        this.f2072b.clear();
    }

    /* renamed from: n */
    public void m68134n(Future future) {
        if (future == null) {
            return;
        }
        this.f2074d.remove(future);
    }

    public String toString() {
        return "[route: " + this.f2071a + "][leased: " + this.f2072b.size() + "][available: " + this.f2073c.size() + "][pending: " + this.f2074d.size() + "]";
    }
}
