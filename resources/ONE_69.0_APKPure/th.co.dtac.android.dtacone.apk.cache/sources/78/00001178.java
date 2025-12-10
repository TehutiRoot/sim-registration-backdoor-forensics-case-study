package p000;

import io.realm.MapChangeSet;
import io.realm.internal.OsMapChangeSet;

/* renamed from: SN1 */
/* loaded from: classes5.dex */
public class SN1 implements MapChangeSet {

    /* renamed from: a */
    public final OsMapChangeSet f5824a;

    public SN1(long j) {
        this.f5824a = new OsMapChangeSet(j);
    }

    @Override // io.realm.MapChangeSet
    /* renamed from: a */
    public String[] getChanges() {
        return this.f5824a.getStringKeyModifications();
    }

    @Override // io.realm.MapChangeSet
    /* renamed from: b */
    public String[] getDeletions() {
        return this.f5824a.getStringKeyDeletions();
    }

    @Override // io.realm.MapChangeSet
    /* renamed from: c */
    public String[] getInsertions() {
        return this.f5824a.getStringKeyInsertions();
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
        return this.f5824a.isEmpty();
    }
}