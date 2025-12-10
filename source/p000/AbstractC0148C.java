package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.Graphs;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: C */
/* loaded from: classes4.dex */
public abstract class AbstractC0148C implements InterfaceC19154bH0 {

    /* renamed from: a */
    public final Map f585a;

    /* renamed from: b */
    public final Map f586b;

    /* renamed from: c */
    public int f587c;

    /* renamed from: C$a */
    /* loaded from: classes4.dex */
    public class C0149a extends AbstractSet {
        public C0149a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            Iterable union;
            if (AbstractC0148C.this.f587c == 0) {
                union = Iterables.concat(AbstractC0148C.this.f585a.keySet(), AbstractC0148C.this.f586b.keySet());
            } else {
                union = Sets.union(AbstractC0148C.this.f585a.keySet(), AbstractC0148C.this.f586b.keySet());
            }
            return Iterators.unmodifiableIterator(union.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!AbstractC0148C.this.f585a.containsKey(obj) && !AbstractC0148C.this.f586b.containsKey(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.saturatedAdd(AbstractC0148C.this.f585a.size(), AbstractC0148C.this.f586b.size() - AbstractC0148C.this.f587c);
        }
    }

    public AbstractC0148C(Map map, Map map2, int i) {
        boolean z;
        this.f585a = (Map) Preconditions.checkNotNull(map);
        this.f586b = (Map) Preconditions.checkNotNull(map2);
        this.f587c = Graphs.m40141b(i);
        if (i <= map.size() && i <= map2.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: a */
    public Set mo26460a() {
        return Sets.union(mo952c(), mo953b());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: d */
    public Object mo951d(Object obj) {
        Object obj2 = this.f586b.get(obj);
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: e */
    public Set mo950e() {
        return Collections.unmodifiableSet(this.f585a.keySet());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: f */
    public Object mo949f(Object obj) {
        Object remove = this.f586b.remove(obj);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: g */
    public Set mo948g() {
        return Collections.unmodifiableSet(this.f586b.keySet());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: h */
    public Object mo947h(Object obj, boolean z) {
        if (z) {
            int i = this.f587c - 1;
            this.f587c = i;
            Graphs.m40141b(i);
        }
        Object remove = this.f585a.remove(obj);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: i */
    public void mo946i(Object obj, Object obj2) {
        boolean z;
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        if (this.f586b.put(obj, obj2) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: j */
    public void mo945j(Object obj, Object obj2, boolean z) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        boolean z2 = true;
        if (z) {
            int i = this.f587c + 1;
            this.f587c = i;
            Graphs.m40139d(i);
        }
        if (this.f585a.put(obj, obj2) != null) {
            z2 = false;
        }
        Preconditions.checkState(z2);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: k */
    public Set mo944k() {
        return new C0149a();
    }
}
