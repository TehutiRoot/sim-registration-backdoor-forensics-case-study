package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

/* renamed from: TQ */
/* loaded from: classes4.dex */
public final class C1368TQ extends AbstractSet {

    /* renamed from: a */
    public final Map f6337a;

    /* renamed from: b */
    public final Object f6338b;

    public C1368TQ(Map map, Object obj) {
        this.f6337a = (Map) Preconditions.checkNotNull(map);
        this.f6338b = Preconditions.checkNotNull(obj);
    }

    /* renamed from: a */
    public final Object m66350a() {
        return this.f6337a.get(this.f6338b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public UnmodifiableIterator iterator() {
        Object m66350a = m66350a();
        if (m66350a == null) {
            return ImmutableSet.m40920of().iterator();
        }
        return Iterators.singletonIterator(m66350a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object m66350a = m66350a();
        if (m66350a != null && m66350a.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (m66350a() == null) {
            return 0;
        }
        return 1;
    }
}