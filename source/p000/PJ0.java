package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.ObjectId;

/* renamed from: PJ0 */
/* loaded from: classes5.dex */
public final class PJ0 extends AbstractC17619Fn0 {
    public PJ0(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        this.f1694b.addObjectId((ObjectId) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj == null || (obj instanceof ObjectId)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", obj.getClass().getName()));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return false;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        this.f1694b.insertObjectId(i, (ObjectId) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        this.f1694b.setObjectId(i, (ObjectId) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: x */
    public ObjectId mo23404j(int i) {
        return (ObjectId) this.f1694b.getValue(i);
    }
}
