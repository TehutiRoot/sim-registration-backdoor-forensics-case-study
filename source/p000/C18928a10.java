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

/* renamed from: a10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18928a10 extends AbstractCollection {

    /* renamed from: a */
    public final Z00 f8207a;

    public C18928a10(Z00 z00) {
        this.f8207a = (Z00) Preconditions.checkNotNull(z00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f8207a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f8207a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Maps.m40710R(this.f8207a.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        Predicate mo40278c = this.f8207a.mo40278c();
        Iterator it = this.f8207a.mo40280a().entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (mo40278c.apply(entry) && Objects.equal(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        return Iterables.removeIf(this.f8207a.mo40280a().entries(), Predicates.and(this.f8207a.mo40278c(), Maps.m40708T(Predicates.m41304in(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        return Iterables.removeIf(this.f8207a.mo40280a().entries(), Predicates.and(this.f8207a.mo40278c(), Maps.m40708T(Predicates.not(Predicates.m41304in(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f8207a.size();
    }
}
