package p000;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: K42 */
/* loaded from: classes6.dex */
public final class K42 {

    /* renamed from: a */
    public final WeakReference f3211a;

    /* renamed from: b */
    public final int f3212b;

    /* renamed from: c */
    public ClassLoader f3213c;

    public K42(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f3211a = new WeakReference(classLoader);
        this.f3212b = System.identityHashCode(classLoader);
        this.f3213c = classLoader;
    }

    /* renamed from: a */
    public final void m67767a(ClassLoader classLoader) {
        this.f3213c = classLoader;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof K42) && this.f3211a.get() == ((K42) obj).f3211a.get()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3212b;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f3211a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}