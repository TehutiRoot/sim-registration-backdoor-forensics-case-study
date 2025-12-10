package io.realm;

import io.realm.internal.OsCollectionChangeSet;

/* loaded from: classes5.dex */
public class SetChangeSet {

    /* renamed from: a */
    public final OsCollectionChangeSet f66656a;

    public SetChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        this.f66656a = osCollectionChangeSet;
    }

    public int getNumberOfDeletions() {
        return this.f66656a.getDeletions().length;
    }

    public int getNumberOfInsertions() {
        return this.f66656a.getInsertions().length;
    }

    public boolean isEmpty() {
        if (this.f66656a.getNativePtr() == 0) {
            return true;
        }
        return false;
    }
}
