package p000;

import com.google.common.base.Preconditions;
import java.util.Map;

/* renamed from: Pn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18259Pn0 extends C18067Mn0 {

    /* renamed from: c */
    public volatile transient C1122a f4846c;

    /* renamed from: d */
    public volatile transient C1122a f4847d;

    /* renamed from: Pn0$a */
    /* loaded from: classes4.dex */
    public static final class C1122a {

        /* renamed from: a */
        public final Object f4848a;

        /* renamed from: b */
        public final Object f4849b;

        public C1122a(Object obj, Object obj2) {
            this.f4848a = obj;
            this.f4849b = obj2;
        }
    }

    public C18259Pn0(Map map) {
        super(map);
    }

    @Override // p000.C18067Mn0
    /* renamed from: c */
    public void mo66731c() {
        super.mo66731c();
        this.f4846c = null;
        this.f4847d = null;
    }

    @Override // p000.C18067Mn0
    /* renamed from: e */
    public Object mo66730e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object mo66729f = mo66729f(obj);
        if (mo66729f != null) {
            return mo66729f;
        }
        Object m67289g = m67289g(obj);
        if (m67289g != null) {
            m66727l(obj, m67289g);
        }
        return m67289g;
    }

    @Override // p000.C18067Mn0
    /* renamed from: f */
    public Object mo66729f(Object obj) {
        Object mo66729f = super.mo66729f(obj);
        if (mo66729f != null) {
            return mo66729f;
        }
        C1122a c1122a = this.f4846c;
        if (c1122a != null && c1122a.f4848a == obj) {
            return c1122a.f4849b;
        }
        C1122a c1122a2 = this.f4847d;
        if (c1122a2 != null && c1122a2.f4848a == obj) {
            m66728k(c1122a2);
            return c1122a2.f4849b;
        }
        return null;
    }

    /* renamed from: k */
    public final void m66728k(C1122a c1122a) {
        this.f4847d = this.f4846c;
        this.f4846c = c1122a;
    }

    /* renamed from: l */
    public final void m66727l(Object obj, Object obj2) {
        m66728k(new C1122a(obj, obj2));
    }
}
