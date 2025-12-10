package p000;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: St */
/* loaded from: classes.dex */
public final class C1345St implements FiniteAnimationSpec {

    /* renamed from: a */
    public final List f5850a;

    public C1345St(List specs) {
        Intrinsics.checkNotNullParameter(specs, "specs");
        this.f5850a = specs;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        List<Pair> list = this.f5850a;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (Pair pair : list) {
            arrayList.add(TuplesKt.m28844to(Long.valueOf(((Number) pair.component1()).intValue() * 1000000), ((FiniteAnimationSpec) pair.component2()).vectorize(converter)));
        }
        return new R02(arrayList);
    }
}
