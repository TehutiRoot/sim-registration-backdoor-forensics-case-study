package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: jb */
/* loaded from: classes5.dex */
public class C11545jb extends AbstractC23280zG1 {
    public C11545jb(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public byte[] mo99a(int i) {
        Object valueAtIndex = this.f109019a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return (byte[]) valueAtIndex;
    }
}
