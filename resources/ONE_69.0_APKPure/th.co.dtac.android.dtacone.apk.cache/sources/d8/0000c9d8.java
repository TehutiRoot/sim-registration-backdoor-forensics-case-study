package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

/* renamed from: ib */
/* loaded from: classes5.dex */
public class C10463ib extends AbstractC23181yH1 {
    public C10463ib(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: C */
    public boolean mo327C(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: F */
    public boolean mo326F(Object obj) {
        return this.f108991b.remove((byte[]) obj);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: H */
    public boolean mo325H(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: K */
    public boolean mo323a(byte[] bArr) {
        return this.f108991b.add(bArr);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: c */
    public boolean mo322c(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: i */
    public boolean mo321i(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: j */
    public boolean mo320j(Object obj) {
        byte[] bArr;
        if (obj == null) {
            bArr = null;
        } else {
            bArr = (byte[]) obj;
        }
        return this.f108991b.contains(bArr);
    }
}