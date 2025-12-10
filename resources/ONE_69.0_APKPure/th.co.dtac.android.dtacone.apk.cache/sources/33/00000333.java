package p000;

/* renamed from: DK1 */
/* loaded from: classes6.dex */
public class DK1 {

    /* renamed from: a */
    public final Object f989a;

    /* renamed from: b */
    public final Thread f990b = Thread.currentThread();

    public DK1(Object obj) {
        this.f989a = obj;
    }

    /* renamed from: a */
    public Object m68846a() {
        if (m68845b()) {
            return this.f989a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean m68845b() {
        if (this.f990b == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}