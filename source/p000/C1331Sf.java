package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

/* renamed from: Sf */
/* loaded from: classes5.dex */
public class C1331Sf extends BG1 {
    public C1331Sf(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // p000.BG1
    /* renamed from: C */
    public boolean mo589C(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.BG1
    /* renamed from: F */
    public boolean mo588F(Object obj) {
        return this.f340b.remove((Byte) obj);
    }

    @Override // p000.BG1
    /* renamed from: H */
    public boolean mo587H(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.BG1
    /* renamed from: K */
    public boolean mo585a(Byte b) {
        return this.f340b.add(b);
    }

    @Override // p000.BG1
    /* renamed from: c */
    public boolean mo584c(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.BG1
    /* renamed from: i */
    public boolean mo583i(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.BG1
    /* renamed from: j */
    public boolean mo582j(Object obj) {
        Long valueOf;
        if (obj == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(((Byte) obj).longValue());
        }
        return this.f340b.contains(valueOf);
    }
}
