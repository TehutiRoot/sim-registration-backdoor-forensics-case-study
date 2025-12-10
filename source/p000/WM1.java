package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

/* renamed from: WM1 */
/* loaded from: classes5.dex */
public class WM1 extends BG1 {
    public WM1(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // p000.BG1
    /* renamed from: C */
    public boolean mo589C(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.BG1
    /* renamed from: F */
    public boolean mo588F(Object obj) {
        return this.f340b.remove((String) obj);
    }

    @Override // p000.BG1
    /* renamed from: H */
    public boolean mo587H(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.BG1
    /* renamed from: K */
    public boolean mo585a(String str) {
        return this.f340b.add(str);
    }

    @Override // p000.BG1
    /* renamed from: c */
    public boolean mo584c(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.BG1
    /* renamed from: i */
    public boolean mo583i(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.BG1
    /* renamed from: j */
    public boolean mo582j(Object obj) {
        return this.f340b.contains((String) obj);
    }
}
