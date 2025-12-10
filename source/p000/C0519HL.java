package p000;

import io.realm.BaseRealm;
import io.realm.DynamicRealmObject;
import io.realm.internal.OsSet;

/* renamed from: HL */
/* loaded from: classes5.dex */
public class C0519HL extends AbstractC23280zG1 {

    /* renamed from: d */
    public final String f2198d;

    public C0519HL(OsSet osSet, BaseRealm baseRealm, String str) {
        super(osSet, baseRealm);
        this.f2198d = str;
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public DynamicRealmObject mo99a(int i) {
        return (DynamicRealmObject) this.f109020b.m29757k(DynamicRealmObject.class, this.f2198d, this.f109019a.getRow(i));
    }
}
