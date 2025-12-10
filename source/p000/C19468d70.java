package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: d70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C19468d70 {

    /* renamed from: a */
    public final C10050a f61062a = new C10050a();

    /* renamed from: b */
    public final Map f61063b = new HashMap();

    /* renamed from: d70$a */
    /* loaded from: classes3.dex */
    public static class C10050a {

        /* renamed from: a */
        public final Object f61064a;

        /* renamed from: b */
        public List f61065b;

        /* renamed from: c */
        public C10050a f61066c;

        /* renamed from: d */
        public C10050a f61067d;

        public C10050a() {
            this(null);
        }

        /* renamed from: a */
        public void m31923a(Object obj) {
            if (this.f61065b == null) {
                this.f61065b = new ArrayList();
            }
            this.f61065b.add(obj);
        }

        /* renamed from: b */
        public Object m31922b() {
            int m31921c = m31921c();
            if (m31921c > 0) {
                return this.f61065b.remove(m31921c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m31921c() {
            List list = this.f61065b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C10050a(Object obj) {
            this.f61067d = this;
            this.f61066c = this;
            this.f61064a = obj;
        }
    }

    /* renamed from: e */
    public static void m31926e(C10050a c10050a) {
        C10050a c10050a2 = c10050a.f61067d;
        c10050a2.f61066c = c10050a.f61066c;
        c10050a.f61066c.f61067d = c10050a2;
    }

    /* renamed from: g */
    public static void m31924g(C10050a c10050a) {
        c10050a.f61066c.f61067d = c10050a;
        c10050a.f61067d.f61066c = c10050a;
    }

    /* renamed from: a */
    public Object m31930a(InterfaceC18444Sk1 interfaceC18444Sk1) {
        C10050a c10050a = (C10050a) this.f61063b.get(interfaceC18444Sk1);
        if (c10050a == null) {
            c10050a = new C10050a(interfaceC18444Sk1);
            this.f61063b.put(interfaceC18444Sk1, c10050a);
        } else {
            interfaceC18444Sk1.mo50393a();
        }
        m31929b(c10050a);
        return c10050a.m31922b();
    }

    /* renamed from: b */
    public final void m31929b(C10050a c10050a) {
        m31926e(c10050a);
        C10050a c10050a2 = this.f61062a;
        c10050a.f61067d = c10050a2;
        c10050a.f61066c = c10050a2.f61066c;
        m31924g(c10050a);
    }

    /* renamed from: c */
    public final void m31928c(C10050a c10050a) {
        m31926e(c10050a);
        C10050a c10050a2 = this.f61062a;
        c10050a.f61067d = c10050a2.f61067d;
        c10050a.f61066c = c10050a2;
        m31924g(c10050a);
    }

    /* renamed from: d */
    public void m31927d(InterfaceC18444Sk1 interfaceC18444Sk1, Object obj) {
        C10050a c10050a = (C10050a) this.f61063b.get(interfaceC18444Sk1);
        if (c10050a == null) {
            c10050a = new C10050a(interfaceC18444Sk1);
            m31928c(c10050a);
            this.f61063b.put(interfaceC18444Sk1, c10050a);
        } else {
            interfaceC18444Sk1.mo50393a();
        }
        c10050a.m31923a(obj);
    }

    /* renamed from: f */
    public Object m31925f() {
        for (C10050a c10050a = this.f61062a.f61067d; !c10050a.equals(this.f61062a); c10050a = c10050a.f61067d) {
            Object m31922b = c10050a.m31922b();
            if (m31922b != null) {
                return m31922b;
            }
            m31926e(c10050a);
            this.f61063b.remove(c10050a.f61064a);
            ((InterfaceC18444Sk1) c10050a.f61064a).mo50393a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C10050a c10050a = this.f61062a.f61066c;
        boolean z = false;
        while (!c10050a.equals(this.f61062a)) {
            sb.append('{');
            sb.append(c10050a.f61064a);
            sb.append(':');
            sb.append(c10050a.m31921c());
            sb.append("}, ");
            c10050a = c10050a.f61066c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
