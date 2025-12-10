package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Xf */
/* loaded from: classes5.dex */
public class C1682Xf {

    /* renamed from: a */
    public final C1683a f7608a = new C1683a();

    /* renamed from: b */
    public int f7609b;

    /* renamed from: Xf$a */
    /* loaded from: classes5.dex */
    public static class C1683a {

        /* renamed from: a */
        public final Map f7610a = new HashMap();

        /* renamed from: b */
        public Object f7611b = null;

        /* renamed from: b */
        public Object m65587b() {
            return this.f7611b;
        }

        /* renamed from: c */
        public void m65586c(Object obj) {
            if (this.f7611b == null) {
                this.f7611b = obj;
                return;
            }
            throw new IllegalStateException("Value already set for this trie node");
        }
    }

    /* renamed from: a */
    public void m65592a(Object obj, byte[]... bArr) {
        C1683a c1683a = this.f7608a;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b : bArr2) {
                C1683a c1683a2 = (C1683a) c1683a.f7610a.get(Byte.valueOf(b));
                if (c1683a2 == null) {
                    c1683a2 = new C1683a();
                    c1683a.f7610a.put(Byte.valueOf(b), c1683a2);
                }
                c1683a = c1683a2;
                i++;
            }
        }
        c1683a.m65586c(obj);
        this.f7609b = Math.max(this.f7609b, i);
    }

    /* renamed from: b */
    public Object m65591b(byte[] bArr) {
        C1683a c1683a = this.f7608a;
        Object m65587b = c1683a.m65587b();
        for (byte b : bArr) {
            c1683a = (C1683a) c1683a.f7610a.get(Byte.valueOf(b));
            if (c1683a == null) {
                break;
            }
            if (c1683a.m65587b() != null) {
                m65587b = c1683a.m65587b();
            }
        }
        return m65587b;
    }

    /* renamed from: c */
    public int m65590c() {
        return this.f7609b;
    }

    /* renamed from: d */
    public void m65589d(Object obj) {
        this.f7608a.m65586c(obj);
    }
}