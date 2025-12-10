package p000;

import io.realm.BaseRealm;
import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: mt1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21206mt1 extends AbstractC22835wH1 {
    public C21206mt1(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public RealmAny mo765a(int i) {
        return new RealmAny(RealmAnyOperator.m30044b(this.f108392b, new NativeRealmAny(this.f108391a.getRealmAny(i))));
    }
}