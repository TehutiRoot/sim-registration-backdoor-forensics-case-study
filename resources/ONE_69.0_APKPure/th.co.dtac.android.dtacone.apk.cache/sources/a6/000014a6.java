package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: Vf */
/* loaded from: classes5.dex */
public class C1542Vf extends AbstractC22835wH1 {
    public C1542Vf(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public Byte mo765a(int i) {
        Object valueAtIndex = this.f108391a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Byte.valueOf(((Long) valueAtIndex).byteValue());
    }
}