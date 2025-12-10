package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: Mm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18100Mm0 extends AbstractC18038Ln0 {
    public C18100Mm0(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: c */
    public void mo26196c(Object obj) {
        this.f3692b.addLong(((Number) obj).longValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: e */
    public void mo26195e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", obj.getClass().getName()));
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: i */
    public boolean mo26194i() {
        return false;
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: j */
    public Object mo26193j(int i) {
        Long l = (Long) this.f3692b.getValue(i);
        if (l == null) {
            return null;
        }
        Class cls = this.f3693c;
        if (cls == Long.class) {
            return l;
        }
        if (cls == Integer.class) {
            return cls.cast(Integer.valueOf(l.intValue()));
        }
        if (cls == Short.class) {
            return cls.cast(Short.valueOf(l.shortValue()));
        }
        if (cls == Byte.class) {
            return cls.cast(Byte.valueOf(l.byteValue()));
        }
        throw new IllegalStateException("Unexpected element type: " + this.f3693c.getName());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: n */
    public void mo26191n(int i, Object obj) {
        this.f3692b.insertLong(i, ((Number) obj).longValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: v */
    public void mo26189v(int i, Object obj) {
        this.f3692b.setLong(i, ((Number) obj).longValue());
    }
}