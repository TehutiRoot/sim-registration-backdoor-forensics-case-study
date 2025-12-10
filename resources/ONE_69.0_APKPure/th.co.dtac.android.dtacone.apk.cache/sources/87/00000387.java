package p000;

import java.util.logging.Logger;

/* renamed from: Di0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17503Di0 {

    /* renamed from: a */
    public final Object f1086a = new Object();

    /* renamed from: b */
    public final String f1087b;

    /* renamed from: c */
    public volatile Logger f1088c;

    public C17503Di0(Class cls) {
        this.f1087b = cls.getName();
    }

    /* renamed from: a */
    public Logger m68797a() {
        Logger logger = this.f1088c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f1086a) {
            try {
                Logger logger2 = this.f1088c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f1087b);
                this.f1088c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}