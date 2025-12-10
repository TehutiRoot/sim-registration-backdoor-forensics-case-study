package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: Mn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18067Mn0 {

    /* renamed from: a */
    public final Map f3890a;

    /* renamed from: b */
    public volatile transient Map.Entry f3891b;

    /* renamed from: Mn0$a */
    /* loaded from: classes4.dex */
    public class C0898a extends AbstractSet {

        /* renamed from: Mn0$a$a */
        /* loaded from: classes4.dex */
        public class C0899a extends UnmodifiableIterator {

            /* renamed from: a */
            public final /* synthetic */ Iterator f3893a;

            /* renamed from: b */
            public final /* synthetic */ C0898a f3894b;

            public C0899a(C0898a c0898a, Iterator it) {
                this.f3893a = it;
                this.f3894b = c0898a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f3893a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f3893a.next();
                C18067Mn0.this.f3891b = entry;
                return entry.getKey();
            }
        }

        public C0898a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            return new C0899a(this, C18067Mn0.this.f3890a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C18067Mn0.this.m67290d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C18067Mn0.this.f3890a.size();
        }
    }

    public C18067Mn0(Map map) {
        this.f3890a = (Map) Preconditions.checkNotNull(map);
    }

    /* renamed from: c */
    public void mo66731c() {
        this.f3891b = null;
    }

    /* renamed from: d */
    public final boolean m67290d(Object obj) {
        if (mo66729f(obj) == null && !this.f3890a.containsKey(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public Object mo66730e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object mo66729f = mo66729f(obj);
        if (mo66729f == null) {
            return m67289g(obj);
        }
        return mo66729f;
    }

    /* renamed from: f */
    public Object mo66729f(Object obj) {
        Map.Entry entry = this.f3891b;
        if (entry != null && entry.getKey() == obj) {
            return entry.getValue();
        }
        return null;
    }

    /* renamed from: g */
    public final Object m67289g(Object obj) {
        Preconditions.checkNotNull(obj);
        return this.f3890a.get(obj);
    }

    /* renamed from: h */
    public final Object m67288h(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        mo66731c();
        return this.f3890a.put(obj, obj2);
    }

    /* renamed from: i */
    public final Object m67287i(Object obj) {
        Preconditions.checkNotNull(obj);
        mo66731c();
        return this.f3890a.remove(obj);
    }

    /* renamed from: j */
    public final Set m67286j() {
        return new C0898a();
    }
}
