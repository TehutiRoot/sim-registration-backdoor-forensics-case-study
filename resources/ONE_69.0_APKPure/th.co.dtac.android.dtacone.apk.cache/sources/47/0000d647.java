package io.realm.p021rx;

import io.realm.ObjectChangeSet;
import io.realm.RealmModel;
import javax.annotation.Nullable;

/* renamed from: io.realm.rx.ObjectChange */
/* loaded from: classes5.dex */
public class ObjectChange<E extends RealmModel> {

    /* renamed from: a */
    public final RealmModel f66987a;

    /* renamed from: b */
    public final ObjectChangeSet f66988b;

    public ObjectChange(E e, @Nullable ObjectChangeSet objectChangeSet) {
        this.f66987a = e;
        this.f66988b = objectChangeSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectChange objectChange = (ObjectChange) obj;
        if (!this.f66987a.equals(objectChange.f66987a)) {
            return false;
        }
        ObjectChangeSet objectChangeSet = this.f66988b;
        ObjectChangeSet objectChangeSet2 = objectChange.f66988b;
        if (objectChangeSet != null) {
            return objectChangeSet.equals(objectChangeSet2);
        }
        if (objectChangeSet2 == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public ObjectChangeSet getChangeset() {
        return this.f66988b;
    }

    public E getObject() {
        return (E) this.f66987a;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f66987a.hashCode() * 31;
        ObjectChangeSet objectChangeSet = this.f66988b;
        if (objectChangeSet != null) {
            i = objectChangeSet.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "ObjectChange{object=" + this.f66987a + ", changeset=" + this.f66988b + '}';
    }
}