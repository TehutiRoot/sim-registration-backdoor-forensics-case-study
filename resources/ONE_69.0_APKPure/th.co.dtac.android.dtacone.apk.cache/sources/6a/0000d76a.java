package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: jb */
/* loaded from: classes5.dex */
public class C11530jb extends AbstractC22835wH1 {
    public C11530jb(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public byte[] mo765a(int i) {
        Object valueAtIndex = this.f108391a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return (byte[]) valueAtIndex;
    }
}