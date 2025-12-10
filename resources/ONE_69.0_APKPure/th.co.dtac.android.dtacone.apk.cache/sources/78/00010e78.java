package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;

/* renamed from: tf0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22374tf0 extends AbstractC22835wH1 {
    public C22374tf0(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public Integer mo765a(int i) {
        Object valueAtIndex = this.f108391a.getValueAtIndex(i);
        if (valueAtIndex == null) {
            return null;
        }
        return Integer.valueOf(((Long) valueAtIndex).intValue());
    }
}