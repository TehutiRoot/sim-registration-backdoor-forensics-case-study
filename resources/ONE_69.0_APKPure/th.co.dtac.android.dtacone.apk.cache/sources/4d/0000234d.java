package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "T", "Landroidx/compose/animation/core/Transition$Segment;", "", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/PropertyValues$createAnimationSpec$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,650:1\n1549#2:651\n1620#2,3:652\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/PropertyValues$createAnimationSpec$1\n*L\n149#1:651\n149#1:652,3\n*E\n"})
/* loaded from: classes.dex */
public final class PropertyValues$createAnimationSpec$1 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<T>> {
    final /* synthetic */ int $overallDuration;
    final /* synthetic */ PropertyValues<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValues$createAnimationSpec$1(PropertyValues<T> propertyValues, int i) {
        super(3);
        this.this$0 = propertyValues;
        this.$overallDuration = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final FiniteAnimationSpec<T> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-361329948);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-361329948, i, -1, "androidx.compose.animation.graphics.vector.PropertyValues.createAnimationSpec.<anonymous> (Animator.kt:146)");
        }
        List<Timestamp> timestamps = this.this$0.getTimestamps();
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(timestamps, 10));
        for (Timestamp timestamp : timestamps) {
            arrayList.add(TuplesKt.m29136to(Integer.valueOf(timestamp.getTimeMillis()), timestamp.asAnimationSpec()));
        }
        FiniteAnimationSpec combined = AnimatorAnimationSpecsKt.combined(arrayList);
        FiniteAnimationSpec finiteAnimationSpec = combined;
        if (!segment.getTargetState().booleanValue()) {
            finiteAnimationSpec = AnimatorAnimationSpecsKt.reversed(combined, this.$overallDuration);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}