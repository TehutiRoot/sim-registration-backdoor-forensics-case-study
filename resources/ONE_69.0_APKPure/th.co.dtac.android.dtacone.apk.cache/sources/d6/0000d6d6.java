package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: j70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C20555j70 {

    /* renamed from: a */
    public final C11500a f67231a = new C11500a();

    /* renamed from: b */
    public final Map f67232b = new HashMap();

    /* renamed from: j70$a */
    /* loaded from: classes3.dex */
    public static class C11500a {

        /* renamed from: a */
        public final Object f67233a;

        /* renamed from: b */
        public List f67234b;

        /* renamed from: c */
        public C11500a f67235c;

        /* renamed from: d */
        public C11500a f67236d;

        public C11500a() {
            this(null);
        }

        /* renamed from: a */
        public void m29613a(Object obj) {
            if (this.f67234b == null) {
                this.f67234b = new ArrayList();
            }
            this.f67234b.add(obj);
        }

        /* renamed from: b */
        public Object m29612b() {
            int m29611c = m29611c();
            if (m29611c > 0) {
                return this.f67234b.remove(m29611c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m29611c() {
            List list = this.f67234b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C11500a(Object obj) {
            this.f67236d = this;
            this.f67235c = this;
            this.f67233a = obj;
        }
    }

    /* renamed from: e */
    public static void m29616e(C11500a c11500a) {
        C11500a c11500a2 = c11500a.f67236d;
        c11500a2.f67235c = c11500a.f67235c;
        c11500a.f67235c.f67236d = c11500a2;
    }

    /* renamed from: g */
    public static void m29614g(C11500a c11500a) {
        c11500a.f67235c.f67236d = c11500a;
        c11500a.f67236d.f67235c = c11500a;
    }

    /* renamed from: a */
    public Object m29620a(InterfaceC18293Pl1 interfaceC18293Pl1) {
        C11500a c11500a = (C11500a) this.f67232b.get(interfaceC18293Pl1);
        if (c11500a == null) {
            c11500a = new C11500a(interfaceC18293Pl1);
            this.f67232b.put(interfaceC18293Pl1, c11500a);
        } else {
            interfaceC18293Pl1.mo50390a();
        }
        m29619b(c11500a);
        return c11500a.m29612b();
    }

    /* renamed from: b */
    public final void m29619b(C11500a c11500a) {
        m29616e(c11500a);
        C11500a c11500a2 = this.f67231a;
        c11500a.f67236d = c11500a2;
        c11500a.f67235c = c11500a2.f67235c;
        m29614g(c11500a);
    }

    /* renamed from: c */
    public final void m29618c(C11500a c11500a) {
        m29616e(c11500a);
        C11500a c11500a2 = this.f67231a;
        c11500a.f67236d = c11500a2.f67236d;
        c11500a.f67235c = c11500a2;
        m29614g(c11500a);
    }

    /* renamed from: d */
    public void m29617d(InterfaceC18293Pl1 interfaceC18293Pl1, Object obj) {
        C11500a c11500a = (C11500a) this.f67232b.get(interfaceC18293Pl1);
        if (c11500a == null) {
            c11500a = new C11500a(interfaceC18293Pl1);
            m29618c(c11500a);
            this.f67232b.put(interfaceC18293Pl1, c11500a);
        } else {
            interfaceC18293Pl1.mo50390a();
        }
        c11500a.m29613a(obj);
    }

    /* renamed from: f */
    public Object m29615f() {
        for (C11500a c11500a = this.f67231a.f67236d; !c11500a.equals(this.f67231a); c11500a = c11500a.f67236d) {
            Object m29612b = c11500a.m29612b();
            if (m29612b != null) {
                return m29612b;
            }
            m29616e(c11500a);
            this.f67232b.remove(c11500a.f67233a);
            ((InterfaceC18293Pl1) c11500a.f67233a).mo50390a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C11500a c11500a = this.f67231a.f67235c;
        boolean z = false;
        while (!c11500a.equals(this.f67231a)) {
            sb.append('{');
            sb.append(c11500a.f67233a);
            sb.append(':');
            sb.append(c11500a.m29611c());
            sb.append("}, ");
            c11500a = c11500a.f67235c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}