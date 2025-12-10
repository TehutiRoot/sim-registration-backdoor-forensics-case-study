package p000;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: PG0 */
/* loaded from: classes5.dex */
public final class PG0 implements Comparator {

    /* renamed from: a */
    public static final PG0 f4697a = new PG0();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable a, Comparable b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C19098ay1.f38889a;
    }
}
