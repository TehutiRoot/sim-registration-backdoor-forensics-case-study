package p000;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: by1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19270by1 implements Comparator {

    /* renamed from: a */
    public final Comparator f39296a;

    public C19270by1(Comparator comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f39296a = comparator;
    }

    /* renamed from: a */
    public final Comparator m51733a() {
        return this.f39296a;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f39296a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return this.f39296a;
    }
}
