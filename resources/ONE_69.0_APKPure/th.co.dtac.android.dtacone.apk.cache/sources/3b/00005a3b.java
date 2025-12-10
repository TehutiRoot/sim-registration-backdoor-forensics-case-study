package androidx.compose.material3;

import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n154#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$3$1\n*L\n232#1:747\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBarKt$SearchBar$3$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ State<C3623Dp> $topPadding;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$3$1$1 */
    /* loaded from: classes2.dex */
    public static final class C33371 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $animatedTopPadding;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33371(Placeable placeable, int i) {
            super(1);
            this.$placeable = placeable;
            this.$animatedTopPadding = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, this.$animatedTopPadding, 0.0f, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$3$1(State<C3623Dp> state, State<Float> state2) {
        super(3);
        this.$topPadding = state;
        this.$animationProgress = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m70713invoke3p2s80s(measureScope, measurable, constraints.m73816unboximpl());
    }

    @NotNull
    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m70713invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j) {
        float f;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int mo69616roundToPx0680j_4 = layout.mo69616roundToPx0680j_4(DpKt.m73885lerpMdfbLM(this.$topPadding.getValue().m73856unboximpl(), C3623Dp.m73842constructorimpl(0), this.$animationProgress.getValue().floatValue()));
        int max = Math.max(Constraints.m73812getMinWidthimpl(j), layout.mo69616roundToPx0680j_4(SearchBarKt.getSearchBarMinWidth()));
        int m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        f = SearchBarKt.f26086d;
        int coerceAtMost = AbstractC11695c.coerceAtMost(max, Math.min(m73810getMaxWidthimpl, layout.mo69616roundToPx0680j_4(f)));
        int coerceAtMost2 = AbstractC11695c.coerceAtMost(Math.max(Constraints.m73811getMinHeightimpl(j), layout.mo69616roundToPx0680j_4(SearchBarDefaults.INSTANCE.m70708getInputFieldHeightD9Ej5fM())), Constraints.m73809getMaxHeightimpl(j));
        int m73810getMaxWidthimpl2 = Constraints.m73810getMaxWidthimpl(j);
        int m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(j);
        int lerp = MathHelpersKt.lerp(coerceAtMost, m73810getMaxWidthimpl2, this.$animationProgress.getValue().floatValue());
        int lerp2 = MathHelpersKt.lerp(coerceAtMost2, m73809getMaxHeightimpl, this.$animationProgress.getValue().floatValue()) + mo69616roundToPx0680j_4;
        return MeasureScope.CC.m59482q(layout, lerp, lerp2, null, new C33371(measurable.mo72995measureBRTryo0(ConstraintsKt.m73827offsetNN6EwU$default(Constraints.Companion.m73818fixedJhjzzOo(lerp, lerp2), 0, -mo69616roundToPx0680j_4, 1, null)), mo69616roundToPx0680j_4), 4, null);
    }
}