package p000;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yy1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18905Yy1 implements Comparator {

    /* renamed from: a */
    public final Comparator f8072a;

    public C18905Yy1(Comparator comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f8072a = comparator;
    }

    /* renamed from: a */
    public final Comparator m65271a() {
        return this.f8072a;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f8072a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return this.f8072a;
    }
}