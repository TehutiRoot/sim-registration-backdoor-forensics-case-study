package p000;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: N32 */
/* loaded from: classes6.dex */
public final class N32 {

    /* renamed from: a */
    public final WeakReference f3996a;

    /* renamed from: b */
    public final int f3997b;

    /* renamed from: c */
    public ClassLoader f3998c;

    public N32(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f3996a = new WeakReference(classLoader);
        this.f3997b = System.identityHashCode(classLoader);
        this.f3998c = classLoader;
    }

    /* renamed from: a */
    public final void m67253a(ClassLoader classLoader) {
        this.f3998c = classLoader;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof N32) && this.f3996a.get() == ((N32) obj).f3996a.get()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3997b;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f3996a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
