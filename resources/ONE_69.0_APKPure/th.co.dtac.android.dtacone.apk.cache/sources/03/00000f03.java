package p000;

import io.realm.MapChangeSet;

/* renamed from: Pn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18298Pn0 implements MapChangeSet {

    /* renamed from: a */
    public final MapChangeSet f4887a;

    public C18298Pn0(MapChangeSet mapChangeSet) {
        this.f4887a = mapChangeSet;
    }

    @Override // io.realm.MapChangeSet
    public Object[] getChanges() {
        return this.f4887a.getChanges();
    }

    @Override // io.realm.MapChangeSet
    public Object[] getDeletions() {
        return this.f4887a.getDeletions();
    }

    @Override // io.realm.MapChangeSet
    public Object[] getInsertions() {
        return this.f4887a.getInsertions();
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
        return this.f4887a.isEmpty();
    }
}