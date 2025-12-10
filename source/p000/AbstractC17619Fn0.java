package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;

/* renamed from: Fn0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC17619Fn0 {

    /* renamed from: a */
    public final BaseRealm f1693a;

    /* renamed from: b */
    public final OsList f1694b;

    /* renamed from: c */
    public final Class f1695c;

    public AbstractC17619Fn0(BaseRealm baseRealm, OsList osList, Class cls) {
        this.f1693a = baseRealm;
        this.f1695c = cls;
        this.f1694b = osList;
    }

    /* renamed from: a */
    public final void m68364a(Object obj) {
        mo23406e(obj);
        if (obj == null) {
            m68363b();
        } else {
            mo23407c(obj);
        }
    }

    /* renamed from: b */
    public final void m68363b() {
        this.f1694b.addNull();
    }

    /* renamed from: c */
    public abstract void mo23407c(Object obj);

    /* renamed from: d */
    public void m68362d(int i) {
        int m68350w = m68350w();
        if (i >= 0 && m68350w >= i) {
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f1694b.size());
    }

    /* renamed from: e */
    public abstract void mo23406e(Object obj);

    /* renamed from: f */
    public final void m68361f(int i) {
        this.f1694b.delete(i);
    }

    /* renamed from: g */
    public final void m68360g() {
        this.f1694b.deleteAll();
    }

    /* renamed from: h */
    public final void m68359h() {
        OsList osList = this.f1694b;
        osList.delete(osList.size() - 1);
    }

    /* renamed from: i */
    public abstract boolean mo23405i();

    /* renamed from: j */
    public abstract Object mo23404j(int i);

    /* renamed from: k */
    public final OsList m68358k() {
        return this.f1694b;
    }

    /* renamed from: l */
    public final void m68357l(int i, Object obj) {
        mo23406e(obj);
        if (obj == null) {
            mo23403m(i);
        } else {
            mo23402n(i, obj);
        }
    }

    /* renamed from: m */
    public void mo23403m(int i) {
        this.f1694b.insertNull(i);
    }

    /* renamed from: n */
    public abstract void mo23402n(int i, Object obj);

    /* renamed from: o */
    public final boolean m68356o() {
        return this.f1694b.isEmpty();
    }

    /* renamed from: p */
    public final boolean m68355p() {
        return this.f1694b.isValid();
    }

    /* renamed from: q */
    public final void m68354q(int i, int i2) {
        this.f1694b.move(i, i2);
    }

    /* renamed from: r */
    public final void m68353r(int i) {
        this.f1694b.remove(i);
    }

    /* renamed from: s */
    public final void m68352s() {
        this.f1694b.removeAll();
    }

    /* renamed from: t */
    public final Object m68351t(int i, Object obj) {
        mo23406e(obj);
        Object mo23404j = mo23404j(i);
        if (obj == null) {
            mo23401u(i);
        } else {
            mo23400v(i, obj);
        }
        return mo23404j;
    }

    /* renamed from: u */
    public void mo23401u(int i) {
        this.f1694b.setNull(i);
    }

    /* renamed from: v */
    public abstract void mo23400v(int i, Object obj);

    /* renamed from: w */
    public final int m68350w() {
        long size = this.f1694b.size();
        if (size < 2147483647L) {
            return (int) size;
        }
        return Integer.MAX_VALUE;
    }
}
