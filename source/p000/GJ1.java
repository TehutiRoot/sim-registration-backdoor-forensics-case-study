package p000;

/* renamed from: GJ1 */
/* loaded from: classes6.dex */
public class GJ1 {

    /* renamed from: a */
    public final Object f1884a;

    /* renamed from: b */
    public final Thread f1885b = Thread.currentThread();

    public GJ1(Object obj) {
        this.f1884a = obj;
    }

    /* renamed from: a */
    public Object m68275a() {
        if (m68274b()) {
            return this.f1884a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean m68274b() {
        if (this.f1885b == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
