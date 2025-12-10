package p000;

import com.google.common.base.Preconditions;
import java.util.Map;

/* renamed from: Vn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18688Vn0 extends C18493Sn0 {

    /* renamed from: c */
    public volatile transient C1553a f7087c;

    /* renamed from: d */
    public volatile transient C1553a f7088d;

    /* renamed from: Vn0$a */
    /* loaded from: classes4.dex */
    public static final class C1553a {

        /* renamed from: a */
        public final Object f7089a;

        /* renamed from: b */
        public final Object f7090b;

        public C1553a(Object obj, Object obj2) {
            this.f7089a = obj;
            this.f7090b = obj2;
        }
    }

    public C18688Vn0(Map map) {
        super(map);
    }

    @Override // p000.C18493Sn0
    /* renamed from: c */
    public void mo65864c() {
        super.mo65864c();
        this.f7087c = null;
        this.f7088d = null;
    }

    @Override // p000.C18493Sn0
    /* renamed from: e */
    public Object mo65863e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object mo65862f = mo65862f(obj);
        if (mo65862f != null) {
            return mo65862f;
        }
        Object m66447g = m66447g(obj);
        if (m66447g != null) {
            m65860l(obj, m66447g);
        }
        return m66447g;
    }

    @Override // p000.C18493Sn0
    /* renamed from: f */
    public Object mo65862f(Object obj) {
        Object mo65862f = super.mo65862f(obj);
        if (mo65862f != null) {
            return mo65862f;
        }
        C1553a c1553a = this.f7087c;
        if (c1553a != null && c1553a.f7089a == obj) {
            return c1553a.f7090b;
        }
        C1553a c1553a2 = this.f7088d;
        if (c1553a2 != null && c1553a2.f7089a == obj) {
            m65861k(c1553a2);
            return c1553a2.f7090b;
        }
        return null;
    }

    /* renamed from: k */
    public final void m65861k(C1553a c1553a) {
        this.f7088d = this.f7087c;
        this.f7087c = c1553a;
    }

    /* renamed from: l */
    public final void m65860l(Object obj, Object obj2) {
        m65861k(new C1553a(obj, obj2));
    }
}