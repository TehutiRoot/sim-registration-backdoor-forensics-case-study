package p000;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19672e10 extends AbstractCollection {

    /* renamed from: a */
    public final InterfaceC19499d10 f61446a;

    public C19672e10(InterfaceC19499d10 interfaceC19499d10) {
        this.f61446a = (InterfaceC19499d10) Preconditions.checkNotNull(interfaceC19499d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f61446a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f61446a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Maps.m40699R(this.f61446a.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        Predicate mo31943c = this.f61446a.mo31943c();
        Iterator it = this.f61446a.mo31559a().entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (mo31943c.apply(entry) && Objects.equal(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        return Iterables.removeIf(this.f61446a.mo31559a().entries(), Predicates.and(this.f61446a.mo31943c(), Maps.m40697T(Predicates.m41291in(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        return Iterables.removeIf(this.f61446a.mo31559a().entries(), Predicates.and(this.f61446a.mo31943c(), Maps.m40697T(Predicates.not(Predicates.m41291in(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f61446a.size();
    }
}