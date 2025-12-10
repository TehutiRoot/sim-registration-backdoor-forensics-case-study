package p000;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ay1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19098ay1 implements Comparator {

    /* renamed from: a */
    public static final C19098ay1 f38889a = new C19098ay1();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable a, Comparable b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return b.compareTo(a);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return PG0.f4697a;
    }
}
