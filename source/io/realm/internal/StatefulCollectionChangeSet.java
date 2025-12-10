package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class StatefulCollectionChangeSet implements OrderedCollectionChangeSet {

    /* renamed from: a */
    public final OrderedCollectionChangeSet f66776a;

    /* renamed from: b */
    public final Throwable f66777b;

    /* renamed from: c */
    public final OrderedCollectionChangeSet.State f66778c;

    public StatefulCollectionChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        OrderedCollectionChangeSet.State state;
        this.f66776a = osCollectionChangeSet;
        boolean isFirstAsyncCallback = osCollectionChangeSet.isFirstAsyncCallback();
        Throwable error = osCollectionChangeSet.getError();
        this.f66777b = error;
        if (error != null) {
            this.f66778c = OrderedCollectionChangeSet.State.ERROR;
            return;
        }
        if (isFirstAsyncCallback) {
            state = OrderedCollectionChangeSet.State.INITIAL;
        } else {
            state = OrderedCollectionChangeSet.State.UPDATE;
        }
        this.f66778c = state;
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.Range[] getChangeRanges() {
        return this.f66776a.getChangeRanges();
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getChanges() {
        return this.f66776a.getChanges();
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.Range[] getDeletionRanges() {
        return this.f66776a.getDeletionRanges();
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getDeletions() {
        return this.f66776a.getDeletions();
    }

    @Override // io.realm.OrderedCollectionChangeSet
    @Nullable
    public Throwable getError() {
        return this.f66777b;
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.Range[] getInsertionRanges() {
        return this.f66776a.getInsertionRanges();
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getInsertions() {
        return this.f66776a.getInsertions();
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.State getState() {
        return this.f66778c;
    }
}
