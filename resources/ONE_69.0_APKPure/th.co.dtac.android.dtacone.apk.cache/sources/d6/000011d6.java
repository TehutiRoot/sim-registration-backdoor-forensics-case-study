package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: Sn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18493Sn0 {

    /* renamed from: a */
    public final Map f5939a;

    /* renamed from: b */
    public volatile transient Map.Entry f5940b;

    /* renamed from: Sn0$a */
    /* loaded from: classes4.dex */
    public class C1318a extends AbstractSet {

        /* renamed from: Sn0$a$a */
        /* loaded from: classes4.dex */
        public class C1319a extends UnmodifiableIterator {

            /* renamed from: a */
            public final /* synthetic */ Iterator f5942a;

            /* renamed from: b */
            public final /* synthetic */ C1318a f5943b;

            public C1319a(C1318a c1318a, Iterator it) {
                this.f5942a = it;
                this.f5943b = c1318a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5942a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f5942a.next();
                C18493Sn0.this.f5940b = entry;
                return entry.getKey();
            }
        }

        public C1318a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            return new C1319a(this, C18493Sn0.this.f5939a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C18493Sn0.this.m66448d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C18493Sn0.this.f5939a.size();
        }
    }

    public C18493Sn0(Map map) {
        this.f5939a = (Map) Preconditions.checkNotNull(map);
    }

    /* renamed from: c */
    public void mo65864c() {
        this.f5940b = null;
    }

    /* renamed from: d */
    public final boolean m66448d(Object obj) {
        if (mo65862f(obj) == null && !this.f5939a.containsKey(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public Object mo65863e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object mo65862f = mo65862f(obj);
        if (mo65862f == null) {
            return m66447g(obj);
        }
        return mo65862f;
    }

    /* renamed from: f */
    public Object mo65862f(Object obj) {
        Map.Entry entry = this.f5940b;
        if (entry != null && entry.getKey() == obj) {
            return entry.getValue();
        }
        return null;
    }

    /* renamed from: g */
    public final Object m66447g(Object obj) {
        Preconditions.checkNotNull(obj);
        return this.f5939a.get(obj);
    }

    /* renamed from: h */
    public final Object m66446h(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        mo65864c();
        return this.f5939a.put(obj, obj2);
    }

    /* renamed from: i */
    public final Object m66445i(Object obj) {
        Preconditions.checkNotNull(obj);
        mo65864c();
        return this.f5939a.remove(obj);
    }

    /* renamed from: j */
    public final Set m66444j() {
        return new C1318a();
    }
}