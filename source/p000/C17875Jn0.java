package p000;

import io.realm.MapChangeSet;

/* renamed from: Jn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17875Jn0 implements MapChangeSet {

    /* renamed from: a */
    public final MapChangeSet f3020a;

    public C17875Jn0(MapChangeSet mapChangeSet) {
        this.f3020a = mapChangeSet;
    }

    @Override // io.realm.MapChangeSet
    public Object[] getChanges() {
        return this.f3020a.getChanges();
    }

    @Override // io.realm.MapChangeSet
    public Object[] getDeletions() {
        return this.f3020a.getDeletions();
    }

    @Override // io.realm.MapChangeSet
    public Object[] getInsertions() {
        return this.f3020a.getInsertions();
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
        return this.f3020a.isEmpty();
    }
}
