package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: yH1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C23111yH1 extends AbstractC23280zG1 {
    public C23111yH1(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC23280zG1
    /* renamed from: b */
    public Short mo99a(int i) {
        Object valueAtIndex = this.f109019a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Short.valueOf(((Long) valueAtIndex).shortValue());
    }
}
