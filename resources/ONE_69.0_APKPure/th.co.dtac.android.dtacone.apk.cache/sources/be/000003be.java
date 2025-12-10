package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Dw */
/* loaded from: classes5.dex */
public final class C0278Dw {

    /* renamed from: d */
    public static C0278Dw f1182d;

    /* renamed from: a */
    public boolean f1183a;

    /* renamed from: b */
    public boolean f1184b;

    /* renamed from: c */
    public List f1185c = Collections.emptyList();

    /* renamed from: b */
    public static synchronized C0278Dw m68739b() {
        C0278Dw c0278Dw;
        synchronized (C0278Dw.class) {
            try {
                if (f1182d == null) {
                    f1182d = new C0278Dw();
                }
                c0278Dw = f1182d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0278Dw;
    }

    /* renamed from: a */
    public synchronized List m68740a() {
        this.f1184b = true;
        return this.f1185c;
    }

    /* renamed from: c */
    public synchronized void m68738c(List list) {
        if (!this.f1184b) {
            this.f1185c = Collections.unmodifiableList(new ArrayList(list));
            this.f1184b = true;
            this.f1183a = true;
        } else {
            throw new IllegalStateException("Configurators are already set");
        }
    }

    /* renamed from: d */
    public synchronized boolean m68737d() {
        return this.f1183a;
    }
}