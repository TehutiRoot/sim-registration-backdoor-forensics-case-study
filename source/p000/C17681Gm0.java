package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: Gm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17681Gm0 extends AbstractC17619Fn0 {
    public C17681Gm0(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        this.f1694b.addLong(((Number) obj).longValue());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", obj.getClass().getName()));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return false;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: j */
    public Object mo23404j(int i) {
        Long l = (Long) this.f1694b.getValue(i);
        if (l == null) {
            return null;
        }
        Class cls = this.f1695c;
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
        throw new IllegalStateException("Unexpected element type: " + this.f1695c.getName());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        this.f1694b.insertLong(i, ((Number) obj).longValue());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        this.f1694b.setLong(i, ((Number) obj).longValue());
    }
}
