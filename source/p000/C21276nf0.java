package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: nf0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21276nf0 extends AbstractC23280zG1 {
    public C21276nf0(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public Integer mo99a(int i) {
        Object valueAtIndex = this.f109019a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Integer.valueOf(((Long) valueAtIndex).intValue());
    }
}
