package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;

/* renamed from: Ln0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18038Ln0 {

    /* renamed from: a */
    public final BaseRealm f3691a;

    /* renamed from: b */
    public final OsList f3692b;

    /* renamed from: c */
    public final Class f3693c;

    public AbstractC18038Ln0(BaseRealm baseRealm, OsList osList, Class cls) {
        this.f3691a = baseRealm;
        this.f3693c = cls;
        this.f3692b = osList;
    }

    /* renamed from: a */
    public final void m67505a(Object obj) {
        mo26195e(obj);
        if (obj == null) {
            m67504b();
        } else {
            mo26196c(obj);
        }
    }

    /* renamed from: b */
    public final void m67504b() {
        this.f3692b.addNull();
    }

    /* renamed from: c */
    public abstract void mo26196c(Object obj);

    /* renamed from: d */
    public void m67503d(int i) {
        int m67491w = m67491w();
        if (i >= 0 && m67491w >= i) {
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f3692b.size());
    }

    /* renamed from: e */
    public abstract void mo26195e(Object obj);

    /* renamed from: f */
    public final void m67502f(int i) {
        this.f3692b.delete(i);
    }

    /* renamed from: g */
    public final void m67501g() {
        this.f3692b.deleteAll();
    }

    /* renamed from: h */
    public final void m67500h() {
        OsList osList = this.f3692b;
        osList.delete(osList.size() - 1);
    }

    /* renamed from: i */
    public abstract boolean mo26194i();

    /* renamed from: j */
    public abstract Object mo26193j(int i);

    /* renamed from: k */
    public final OsList m67499k() {
        return this.f3692b;
    }

    /* renamed from: l */
    public final void m67498l(int i, Object obj) {
        mo26195e(obj);
        if (obj == null) {
            mo26192m(i);
        } else {
            mo26191n(i, obj);
        }
    }

    /* renamed from: m */
    public void mo26192m(int i) {
        this.f3692b.insertNull(i);
    }

    /* renamed from: n */
    public abstract void mo26191n(int i, Object obj);

    /* renamed from: o */
    public final boolean m67497o() {
        return this.f3692b.isEmpty();
    }

    /* renamed from: p */
    public final boolean m67496p() {
        return this.f3692b.isValid();
    }

    /* renamed from: q */
    public final void m67495q(int i, int i2) {
        this.f3692b.move(i, i2);
    }

    /* renamed from: r */
    public final void m67494r(int i) {
        this.f3692b.remove(i);
    }

    /* renamed from: s */
    public final void m67493s() {
        this.f3692b.removeAll();
    }

    /* renamed from: t */
    public final Object m67492t(int i, Object obj) {
        mo26195e(obj);
        Object mo26193j = mo26193j(i);
        if (obj == null) {
            mo26190u(i);
        } else {
            mo26189v(i, obj);
        }
        return mo26193j;
    }

    /* renamed from: u */
    public void mo26190u(int i) {
        this.f3692b.setNull(i);
    }

    /* renamed from: v */
    public abstract void mo26189v(int i, Object obj);

    /* renamed from: w */
    public final int m67491w() {
        long size = this.f3692b.size();
        if (size < 2147483647L) {
            return (int) size;
        }
        return Integer.MAX_VALUE;
    }
}