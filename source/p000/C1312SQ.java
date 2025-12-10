package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

/* renamed from: SQ */
/* loaded from: classes4.dex */
public final class C1312SQ extends AbstractSet {

    /* renamed from: a */
    public final Map f5622a;

    /* renamed from: b */
    public final Object f5623b;

    public C1312SQ(Map map, Object obj) {
        this.f5622a = (Map) Preconditions.checkNotNull(map);
        this.f5623b = Preconditions.checkNotNull(obj);
    }

    /* renamed from: a */
    public final Object m66330a() {
        return this.f5622a.get(this.f5623b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public UnmodifiableIterator iterator() {
        Object m66330a = m66330a();
        if (m66330a == null) {
            return ImmutableSet.m40931of().iterator();
        }
        return Iterators.singletonIterator(m66330a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object m66330a = m66330a();
        if (m66330a != null && m66330a.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (m66330a() == null) {
            return 0;
        }
        return 1;
    }
}
