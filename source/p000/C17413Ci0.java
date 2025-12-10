package p000;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ci0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17413Ci0 implements Function2 {

    /* renamed from: a */
    public final Function2 f805a;

    /* renamed from: b */
    public long f806b;

    /* renamed from: c */
    public float f807c;

    /* renamed from: d */
    public LazyStaggeredGridSlots f808d;

    public C17413Ci0(Function2 calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f805a = calculation;
        this.f806b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public LazyStaggeredGridSlots m68745a(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (this.f808d != null && Constraints.m73620equalsimpl0(this.f806b, j) && this.f807c == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.f808d;
            Intrinsics.checkNotNull(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.f806b = j;
        this.f807c = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.f805a.invoke(density, Constraints.m73615boximpl(j));
        this.f808d = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m68745a((Density) obj, ((Constraints) obj2).m73632unboximpl());
    }
}
