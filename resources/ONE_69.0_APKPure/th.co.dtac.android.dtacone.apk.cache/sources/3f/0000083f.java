package p000;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ii0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17828Ii0 implements Function2 {

    /* renamed from: a */
    public final Function2 f2754a;

    /* renamed from: b */
    public long f2755b;

    /* renamed from: c */
    public float f2756c;

    /* renamed from: d */
    public LazyStaggeredGridSlots f2757d;

    public C17828Ii0(Function2 calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f2754a = calculation;
        this.f2755b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public LazyStaggeredGridSlots m67994a(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (this.f2757d != null && Constraints.m73804equalsimpl0(this.f2755b, j) && this.f2756c == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.f2757d;
            Intrinsics.checkNotNull(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.f2755b = j;
        this.f2756c = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.f2754a.invoke(density, Constraints.m73799boximpl(j));
        this.f2757d = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m67994a((Density) obj, ((Constraints) obj2).m73816unboximpl());
    }
}