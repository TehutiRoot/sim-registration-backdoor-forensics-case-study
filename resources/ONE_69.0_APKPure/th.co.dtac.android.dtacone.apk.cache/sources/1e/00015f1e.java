package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: vI1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22665vI1 extends AbstractC22835wH1 {
    public C22665vI1(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public Short mo765a(int i) {
        Object valueAtIndex = this.f108391a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Short.valueOf(((Long) valueAtIndex).shortValue());
    }
}