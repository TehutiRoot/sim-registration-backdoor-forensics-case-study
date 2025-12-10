package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Dw */
/* loaded from: classes5.dex */
public final class C0286Dw {

    /* renamed from: d */
    public static C0286Dw f1146d;

    /* renamed from: a */
    public boolean f1147a;

    /* renamed from: b */
    public boolean f1148b;

    /* renamed from: c */
    public List f1149c = Collections.emptyList();

    /* renamed from: b */
    public static synchronized C0286Dw m68578b() {
        C0286Dw c0286Dw;
        synchronized (C0286Dw.class) {
            try {
                if (f1146d == null) {
                    f1146d = new C0286Dw();
                }
                c0286Dw = f1146d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0286Dw;
    }

    /* renamed from: a */
    public synchronized List m68579a() {
        this.f1148b = true;
        return this.f1149c;
    }

    /* renamed from: c */
    public synchronized void m68577c(List list) {
        if (!this.f1148b) {
            this.f1149c = Collections.unmodifiableList(new ArrayList(list));
            this.f1148b = true;
            this.f1147a = true;
        } else {
            throw new IllegalStateException("Configurators are already set");
        }
    }

    /* renamed from: d */
    public synchronized boolean m68576d() {
        return this.f1147a;
    }
}
