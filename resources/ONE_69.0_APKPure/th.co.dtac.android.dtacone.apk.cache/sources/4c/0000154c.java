package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import org.bson.types.ObjectId;

/* renamed from: WJ0 */
/* loaded from: classes5.dex */
public class WJ0 extends AbstractC23181yH1 {
    public WJ0(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: C */
    public boolean mo327C(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: F */
    public boolean mo326F(Object obj) {
        return this.f108991b.remove((ObjectId) obj);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: H */
    public boolean mo325H(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: K */
    public boolean mo323a(ObjectId objectId) {
        return this.f108991b.add(objectId);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: c */
    public boolean mo322c(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: i */
    public boolean mo321i(Collection collection) {
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: j */
    public boolean mo320j(Object obj) {
        ObjectId objectId;
        if (obj == null) {
            objectId = null;
        } else {
            objectId = (ObjectId) obj;
        }
        return this.f108991b.contains(objectId);
    }
}