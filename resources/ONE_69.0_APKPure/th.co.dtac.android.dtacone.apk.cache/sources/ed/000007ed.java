package p000;

import io.realm.BaseRealm;
import io.realm.DynamicRealmObject;
import io.realm.internal.OsSet;

/* renamed from: IL */
/* loaded from: classes5.dex */
public class C0582IL extends AbstractC22835wH1 {

    /* renamed from: d */
    public final String f2668d;

    public C0582IL(OsSet osSet, BaseRealm baseRealm, String str) {
        super(osSet, baseRealm);
        this.f2668d = str;
    }

    @Override // p000.AbstractC22835wH1
    /* renamed from: b */
    public DynamicRealmObject mo765a(int i) {
        return (DynamicRealmObject) this.f108392b.m30097k(DynamicRealmObject.class, this.f2668d, this.f108391a.getRow(i));
    }
}