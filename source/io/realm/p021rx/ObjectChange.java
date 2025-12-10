package io.realm.p021rx;

import io.realm.ObjectChangeSet;
import io.realm.RealmModel;
import javax.annotation.Nullable;

/* renamed from: io.realm.rx.ObjectChange */
/* loaded from: classes5.dex */
public class ObjectChange<E extends RealmModel> {

    /* renamed from: a */
    public final RealmModel f66924a;

    /* renamed from: b */
    public final ObjectChangeSet f66925b;

    public ObjectChange(E e, @Nullable ObjectChangeSet objectChangeSet) {
        this.f66924a = e;
        this.f66925b = objectChangeSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectChange objectChange = (ObjectChange) obj;
        if (!this.f66924a.equals(objectChange.f66924a)) {
            return false;
        }
        ObjectChangeSet objectChangeSet = this.f66925b;
        ObjectChangeSet objectChangeSet2 = objectChange.f66925b;
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
        return this.f66925b;
    }

    public E getObject() {
        return (E) this.f66924a;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f66924a.hashCode() * 31;
        ObjectChangeSet objectChangeSet = this.f66925b;
        if (objectChangeSet != null) {
            i = objectChangeSet.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "ObjectChange{object=" + this.f66924a + ", changeset=" + this.f66925b + '}';
    }
}
