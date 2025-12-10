package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.ObjectId;

/* renamed from: VJ0 */
/* loaded from: classes5.dex */
public final class VJ0 extends AbstractC18038Ln0 {
    public VJ0(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: c */
    public void mo26196c(Object obj) {
        this.f3692b.addObjectId((ObjectId) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: e */
    public void mo26195e(Object obj) {
        if (obj == null || (obj instanceof ObjectId)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", obj.getClass().getName()));
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: i */
    public boolean mo26194i() {
        return false;
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: n */
    public void mo26191n(int i, Object obj) {
        this.f3692b.insertObjectId(i, (ObjectId) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: v */
    public void mo26189v(int i, Object obj) {
        this.f3692b.setObjectId(i, (ObjectId) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: x */
    public ObjectId mo26193j(int i) {
        return (ObjectId) this.f3692b.getValue(i);
    }
}