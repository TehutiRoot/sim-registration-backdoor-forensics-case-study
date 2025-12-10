package p000;

import io.realm.MapChangeSet;
import io.realm.internal.OsMapChangeSet;

/* renamed from: VM1 */
/* loaded from: classes5.dex */
public class VM1 implements MapChangeSet {

    /* renamed from: a */
    public final OsMapChangeSet f6633a;

    public VM1(long j) {
        this.f6633a = new OsMapChangeSet(j);
    }

    @Override // io.realm.MapChangeSet
    /* renamed from: a */
    public String[] getChanges() {
        return this.f6633a.getStringKeyModifications();
    }

    @Override // io.realm.MapChangeSet
    /* renamed from: b */
    public String[] getDeletions() {
        return this.f6633a.getStringKeyDeletions();
    }

    @Override // io.realm.MapChangeSet
    /* renamed from: c */
    public String[] getInsertions() {
        return this.f6633a.getStringKeyInsertions();
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
        return this.f6633a.isEmpty();
    }
}
