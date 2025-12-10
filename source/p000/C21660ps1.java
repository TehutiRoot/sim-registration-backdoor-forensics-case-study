package p000;

import io.realm.BaseRealm;
import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: ps1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21660ps1 extends AbstractC23280zG1 {
    public C21660ps1(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public RealmAny mo99a(int i) {
        return new RealmAny(RealmAnyOperator.m29704b(this.f109020b, new NativeRealmAny(this.f109019a.getRealmAny(i))));
    }
}
