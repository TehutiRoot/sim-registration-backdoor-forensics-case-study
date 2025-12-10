package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import org.bson.types.ObjectId;

/* renamed from: QJ0 */
/* loaded from: classes5.dex */
public class QJ0 extends BG1 {
    public QJ0(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // p000.BG1
    /* renamed from: C */
    public boolean mo589C(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.BG1
    /* renamed from: F */
    public boolean mo588F(Object obj) {
        return this.f340b.remove((ObjectId) obj);
    }

    @Override // p000.BG1
    /* renamed from: H */
    public boolean mo587H(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.BG1
    /* renamed from: K */
    public boolean mo585a(ObjectId objectId) {
        return this.f340b.add(objectId);
    }

    @Override // p000.BG1
    /* renamed from: c */
    public boolean mo584c(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.BG1
    /* renamed from: i */
    public boolean mo583i(Collection collection) {
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.BG1
    /* renamed from: j */
    public boolean mo582j(Object obj) {
        ObjectId objectId;
        if (obj == null) {
            objectId = null;
        } else {
            objectId = (ObjectId) obj;
        }
        return this.f340b.contains(objectId);
    }
}
