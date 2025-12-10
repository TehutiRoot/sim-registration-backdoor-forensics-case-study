package p000;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: BG0 */
/* loaded from: classes6.dex */
public final class BG0 {

    /* renamed from: a */
    public volatile SoftReference f338a = new SoftReference(null);

    /* renamed from: a */
    public final synchronized Object m68985a(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = this.f338a.get();
        if (obj != null) {
            return obj;
        }
        Object invoke = factory.invoke();
        this.f338a = new SoftReference(invoke);
        return invoke;
    }
}
