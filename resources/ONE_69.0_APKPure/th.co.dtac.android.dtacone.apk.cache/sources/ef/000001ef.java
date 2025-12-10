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
public abstract class AbstractC0149C implements InterfaceC20239hH0 {

    /* renamed from: a */
    public final Map f611a;

    /* renamed from: b */
    public final Map f612b;

    /* renamed from: c */
    public int f613c;

    /* renamed from: C$a */
    /* loaded from: classes4.dex */
    public class C0150a extends AbstractSet {
        public C0150a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            Iterable union;
            if (AbstractC0149C.this.f613c == 0) {
                union = Iterables.concat(AbstractC0149C.this.f611a.keySet(), AbstractC0149C.this.f612b.keySet());
            } else {
                union = Sets.union(AbstractC0149C.this.f611a.keySet(), AbstractC0149C.this.f612b.keySet());
            }
            return Iterators.unmodifiableIterator(union.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!AbstractC0149C.this.f611a.containsKey(obj) && !AbstractC0149C.this.f612b.containsKey(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.saturatedAdd(AbstractC0149C.this.f611a.size(), AbstractC0149C.this.f612b.size() - AbstractC0149C.this.f613c);
        }
    }

    public AbstractC0149C(Map map, Map map2, int i) {
        boolean z;
        this.f611a = (Map) Preconditions.checkNotNull(map);
        this.f612b = (Map) Preconditions.checkNotNull(map2);
        this.f613c = Graphs.m40132b(i);
        if (i <= map.size() && i <= map2.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: a */
    public Set mo30962a() {
        return Sets.union(mo821c(), mo822b());
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: d */
    public Object mo820d(Object obj) {
        Object obj2 = this.f612b.get(obj);
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: e */
    public Set mo819e() {
        return Collections.unmodifiableSet(this.f611a.keySet());
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: f */
    public Object mo818f(Object obj) {
        Object remove = this.f612b.remove(obj);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: g */
    public Set mo817g() {
        return Collections.unmodifiableSet(this.f612b.keySet());
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: h */
    public Object mo816h(Object obj, boolean z) {
        if (z) {
            int i = this.f613c - 1;
            this.f613c = i;
            Graphs.m40132b(i);
        }
        Object remove = this.f611a.remove(obj);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: i */
    public void mo815i(Object obj, Object obj2) {
        boolean z;
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        if (this.f612b.put(obj, obj2) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: j */
    public void mo814j(Object obj, Object obj2, boolean z) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        boolean z2 = true;
        if (z) {
            int i = this.f613c + 1;
            this.f613c = i;
            Graphs.m40130d(i);
        }
        if (this.f611a.put(obj, obj2) != null) {
            z2 = false;
        }
        Preconditions.checkState(z2);
    }

    @Override // p000.InterfaceC20239hH0
    /* renamed from: k */
    public Set mo813k() {
        return new C0150a();
    }
}