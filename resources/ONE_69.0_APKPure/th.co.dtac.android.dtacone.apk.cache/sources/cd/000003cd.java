package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* renamed from: Dz1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC17543Dz1 {

    /* renamed from: a */
    public final Object f1212a;

    /* renamed from: b */
    public final Set f1213b = new HashSet();

    /* renamed from: c */
    public final LinkedList f1214c = new LinkedList();

    /* renamed from: d */
    public final LinkedList f1215d = new LinkedList();

    public AbstractC17543Dz1(Object obj) {
        this.f1212a = obj;
    }

    /* renamed from: a */
    public PoolEntry m68728a(Object obj) {
        PoolEntry mo24744b = mo24744b(obj);
        this.f1213b.add(mo24744b);
        return mo24744b;
    }

    /* renamed from: b */
    public abstract PoolEntry mo24744b(Object obj);

    /* renamed from: c */
    public void m68727c(PoolEntry poolEntry, boolean z) {
        Args.notNull(poolEntry, "Pool entry");
        Asserts.check(this.f1213b.remove(poolEntry), "Entry %s has not been leased from this pool", poolEntry);
        if (z) {
            this.f1214c.addFirst(poolEntry);
        }
    }

    /* renamed from: d */
    public int m68726d() {
        return this.f1214c.size() + this.f1213b.size();
    }

    /* renamed from: e */
    public int m68725e() {
        return this.f1214c.size();
    }

    /* renamed from: f */
    public PoolEntry m68724f(Object obj) {
        if (!this.f1214c.isEmpty()) {
            if (obj != null) {
                Iterator it = this.f1214c.iterator();
                while (it.hasNext()) {
                    PoolEntry poolEntry = (PoolEntry) it.next();
                    if (obj.equals(poolEntry.getState())) {
                        it.remove();
                        this.f1213b.add(poolEntry);
                        return poolEntry;
                    }
                }
            }
            Iterator it2 = this.f1214c.iterator();
            while (it2.hasNext()) {
                PoolEntry poolEntry2 = (PoolEntry) it2.next();
                if (poolEntry2.getState() == null) {
                    it2.remove();
                    this.f1213b.add(poolEntry2);
                    return poolEntry2;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public PoolEntry m68723g() {
        if (this.f1214c.isEmpty()) {
            return null;
        }
        return (PoolEntry) this.f1214c.getLast();
    }

    /* renamed from: h */
    public int m68722h() {
        return this.f1213b.size();
    }

    /* renamed from: i */
    public int m68721i() {
        return this.f1215d.size();
    }

    /* renamed from: j */
    public Future m68720j() {
        return (Future) this.f1215d.poll();
    }

    /* renamed from: k */
    public void m68719k(Future future) {
        if (future == null) {
            return;
        }
        this.f1215d.add(future);
    }

    /* renamed from: l */
    public boolean m68718l(PoolEntry poolEntry) {
        Args.notNull(poolEntry, "Pool entry");
        if (!this.f1214c.remove(poolEntry) && !this.f1213b.remove(poolEntry)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void m68717m() {
        Iterator it = this.f1215d.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f1215d.clear();
        Iterator it2 = this.f1214c.iterator();
        while (it2.hasNext()) {
            ((PoolEntry) it2.next()).close();
        }
        this.f1214c.clear();
        for (PoolEntry poolEntry : this.f1213b) {
            poolEntry.close();
        }
        this.f1213b.clear();
    }

    /* renamed from: n */
    public void m68716n(Future future) {
        if (future == null) {
            return;
        }
        this.f1215d.remove(future);
    }

    public String toString() {
        return "[route: " + this.f1212a + "][leased: " + this.f1213b.size() + "][available: " + this.f1214c.size() + "][pending: " + this.f1215d.size() + "]";
    }
}