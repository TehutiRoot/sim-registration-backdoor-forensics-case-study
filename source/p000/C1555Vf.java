package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: Vf */
/* loaded from: classes5.dex */
public class C1555Vf extends AbstractC23280zG1 {
    public C1555Vf(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public Byte mo99a(int i) {
        Object valueAtIndex = this.f109019a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Byte.valueOf(((Long) valueAtIndex).byteValue());
    }
}
