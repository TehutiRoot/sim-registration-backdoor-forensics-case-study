package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Xf */
/* loaded from: classes5.dex */
public class C1694Xf {

    /* renamed from: a */
    public final C1695a f7540a = new C1695a();

    /* renamed from: b */
    public int f7541b;

    /* renamed from: Xf$a */
    /* loaded from: classes5.dex */
    public static class C1695a {

        /* renamed from: a */
        public final Map f7542a = new HashMap();

        /* renamed from: b */
        public Object f7543b = null;

        /* renamed from: b */
        public Object m65459b() {
            return this.f7543b;
        }

        /* renamed from: c */
        public void m65458c(Object obj) {
            if (this.f7543b == null) {
                this.f7543b = obj;
                return;
            }
            throw new IllegalStateException("Value already set for this trie node");
        }
    }

    /* renamed from: a */
    public void m65464a(Object obj, byte[]... bArr) {
        C1695a c1695a = this.f7540a;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b : bArr2) {
                C1695a c1695a2 = (C1695a) c1695a.f7542a.get(Byte.valueOf(b));
                if (c1695a2 == null) {
                    c1695a2 = new C1695a();
                    c1695a.f7542a.put(Byte.valueOf(b), c1695a2);
                }
                c1695a = c1695a2;
                i++;
            }
        }
        c1695a.m65458c(obj);
        this.f7541b = Math.max(this.f7541b, i);
    }

    /* renamed from: b */
    public Object m65463b(byte[] bArr) {
        C1695a c1695a = this.f7540a;
        Object m65459b = c1695a.m65459b();
        for (byte b : bArr) {
            c1695a = (C1695a) c1695a.f7542a.get(Byte.valueOf(b));
            if (c1695a == null) {
                break;
            }
            if (c1695a.m65459b() != null) {
                m65459b = c1695a.m65459b();
            }
        }
        return m65459b;
    }

    /* renamed from: c */
    public int m65462c() {
        return this.f7541b;
    }

    /* renamed from: d */
    public void m65461d(Object obj) {
        this.f7540a.m65458c(obj);
    }
}
