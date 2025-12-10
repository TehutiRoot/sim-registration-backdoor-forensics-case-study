package p000;

import java.util.logging.Logger;

/* renamed from: xi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23005xi0 {

    /* renamed from: a */
    public final Object f108471a = new Object();

    /* renamed from: b */
    public final String f108472b;

    /* renamed from: c */
    public volatile Logger f108473c;

    public C23005xi0(Class cls) {
        this.f108472b = cls.getName();
    }

    /* renamed from: a */
    public Logger m405a() {
        Logger logger = this.f108473c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f108471a) {
            try {
                Logger logger2 = this.f108473c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f108472b);
                this.f108473c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
