package io.realm;

import io.realm.internal.OsCollectionChangeSet;

/* loaded from: classes5.dex */
public class SetChangeSet {

    /* renamed from: a */
    public final OsCollectionChangeSet f66719a;

    public SetChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        this.f66719a = osCollectionChangeSet;
    }

    public int getNumberOfDeletions() {
        return this.f66719a.getDeletions().length;
    }

    public int getNumberOfInsertions() {
        return this.f66719a.getInsertions().length;
    }

    public boolean isEmpty() {
        if (this.f66719a.getNativePtr() == 0) {
            return true;
        }
        return false;
    }
}