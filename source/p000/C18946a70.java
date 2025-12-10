package p000;

import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18946a70 implements Function2 {

    /* renamed from: a */
    public final Function2 f8234a;

    /* renamed from: b */
    public long f8235b;

    /* renamed from: c */
    public float f8236c;

    /* renamed from: d */
    public LazyGridSlots f8237d;

    public C18946a70(Function2 calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f8234a = calculation;
        this.f8235b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public LazyGridSlots m65122a(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (this.f8237d != null && Constraints.m73620equalsimpl0(this.f8235b, j) && this.f8236c == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.f8237d;
            Intrinsics.checkNotNull(lazyGridSlots);
            return lazyGridSlots;
        }
        this.f8235b = j;
        this.f8236c = density.getDensity();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.f8234a.invoke(density, Constraints.m73615boximpl(j));
        this.f8237d = lazyGridSlots2;
        return lazyGridSlots2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m65122a((Density) obj, ((Constraints) obj2).m73632unboximpl());
    }
}
