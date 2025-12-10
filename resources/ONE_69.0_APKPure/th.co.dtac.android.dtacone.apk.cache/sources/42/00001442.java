package p000;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: VG0 */
/* loaded from: classes5.dex */
public final class VG0 implements Comparator {

    /* renamed from: a */
    public static final VG0 f6868a = new VG0();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable a, Comparable b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C18841Xy1.f7734a;
    }
}