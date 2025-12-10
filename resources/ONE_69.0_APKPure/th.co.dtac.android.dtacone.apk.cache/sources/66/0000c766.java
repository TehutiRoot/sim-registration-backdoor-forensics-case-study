package p000;

import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20036g70 implements Function2 {

    /* renamed from: a */
    public final Function2 f62078a;

    /* renamed from: b */
    public long f62079b;

    /* renamed from: c */
    public float f62080c;

    /* renamed from: d */
    public LazyGridSlots f62081d;

    public C20036g70(Function2 calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f62078a = calculation;
        this.f62079b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public LazyGridSlots m31432a(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (this.f62081d != null && Constraints.m73804equalsimpl0(this.f62079b, j) && this.f62080c == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.f62081d;
            Intrinsics.checkNotNull(lazyGridSlots);
            return lazyGridSlots;
        }
        this.f62079b = j;
        this.f62080c = density.getDensity();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.f62078a.invoke(density, Constraints.m73799boximpl(j));
        this.f62081d = lazyGridSlots2;
        return lazyGridSlots2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m31432a((Density) obj, ((Constraints) obj2).m73816unboximpl());
    }
}