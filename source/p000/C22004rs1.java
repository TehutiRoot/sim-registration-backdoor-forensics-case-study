package p000;

import io.realm.BaseRealm;
import io.realm.RealmModel;
import io.realm.internal.OsSet;
import java.util.ArrayList;

/* renamed from: rs1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22004rs1 extends AbstractC23280zG1 {

    /* renamed from: d */
    public final Class f77445d;

    public C22004rs1(OsSet osSet, BaseRealm baseRealm, Class cls) {
        super(osSet, baseRealm);
        this.f77445d = cls;
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public RealmModel mo99a(int i) {
        return this.f109020b.m29758j(this.f77445d, this.f109019a.getRow(i), false, new ArrayList());
    }
}
