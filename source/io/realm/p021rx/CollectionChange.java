package io.realm.p021rx;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollection;
import javax.annotation.Nullable;

/* renamed from: io.realm.rx.CollectionChange */
/* loaded from: classes5.dex */
public class CollectionChange<E extends OrderedRealmCollection> {

    /* renamed from: a */
    public final OrderedRealmCollection f66922a;

    /* renamed from: b */
    public final OrderedCollectionChangeSet f66923b;

    public CollectionChange(E e, @Nullable OrderedCollectionChangeSet orderedCollectionChangeSet) {
        this.f66922a = e;
        this.f66923b = orderedCollectionChangeSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectionChange collectionChange = (CollectionChange) obj;
        if (!this.f66922a.equals(collectionChange.f66922a)) {
            return false;
        }
        OrderedCollectionChangeSet orderedCollectionChangeSet = this.f66923b;
        OrderedCollectionChangeSet orderedCollectionChangeSet2 = collectionChange.f66923b;
        if (orderedCollectionChangeSet != null) {
            return orderedCollectionChangeSet.equals(orderedCollectionChangeSet2);
        }
        if (orderedCollectionChangeSet2 == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public OrderedCollectionChangeSet getChangeset() {
        return this.f66923b;
    }

    public E getCollection() {
        return (E) this.f66922a;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f66922a.hashCode() * 31;
        OrderedCollectionChangeSet orderedCollectionChangeSet = this.f66923b;
        if (orderedCollectionChangeSet != null) {
            i = orderedCollectionChangeSet.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
