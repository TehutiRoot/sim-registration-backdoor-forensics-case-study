package androidx.compose.animation.graphics.res;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.animation.graphics.vector.AnimatedVectorTarget;
import androidx.compose.p003ui.graphics.vector.VectorConfig;
import androidx.compose.p003ui.graphics.vector.VectorGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(FFLandroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedVectorPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVectorPainterResources.android.kt\nandroidx/compose/animation/graphics/res/AnimatedVectorPainterResources_androidKt$rememberAnimatedVectorPainter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1179#2,2:80\n1253#2,4:82\n*S KotlinDebug\n*F\n+ 1 AnimatedVectorPainterResources.android.kt\nandroidx/compose/animation/graphics/res/AnimatedVectorPainterResources_androidKt$rememberAnimatedVectorPainter$1\n*L\n70#1:80,2\n70#1:82,4\n*E\n"})
/* renamed from: androidx.compose.animation.graphics.res.AnimatedVectorPainterResources_androidKt$rememberAnimatedVectorPainter$1 */
/* loaded from: classes.dex */
public final class C2754xeaba97da extends Lambda implements Function4<Float, Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AnimatedImageVector $animatedImageVector;
    final /* synthetic */ boolean $atEnd;
    final /* synthetic */ Function4<VectorGroup, Map<String, ? extends VectorConfig>, Composer, Integer, Unit> $render;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2754xeaba97da(boolean z, AnimatedImageVector animatedImageVector, int i, Function4<? super VectorGroup, ? super Map<String, ? extends VectorConfig>, ? super Composer, ? super Integer, Unit> function4) {
        super(4);
        this.$atEnd = z;
        this.$animatedImageVector = animatedImageVector;
        this.$$changed = i;
        this.$render = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2, Composer composer, Integer num) {
        invoke(f.floatValue(), f2.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public final void invoke(float f, float f2, @Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10512245, i, -1, "androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter.<anonymous> (AnimatedVectorPainterResources.android.kt:65)");
        }
        Transition<Boolean> updateTransition = TransitionKt.updateTransition(Boolean.valueOf(this.$atEnd), this.$animatedImageVector.getImageVector().getName(), composer, (this.$$changed >> 3) & 14, 0);
        Function4<VectorGroup, Map<String, ? extends VectorConfig>, Composer, Integer, Unit> function4 = this.$render;
        VectorGroup root = this.$animatedImageVector.getImageVector().getRoot();
        composer.startReplaceableGroup(-1100477015);
        List<AnimatedVectorTarget> targets$animation_graphics_release = this.$animatedImageVector.getTargets$animation_graphics_release();
        AnimatedImageVector animatedImageVector = this.$animatedImageVector;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11719c.coerceAtLeast(AbstractC18515Tn0.mapCapacity(AbstractC10176es.collectionSizeOrDefault(targets$animation_graphics_release, 10)), 16));
        for (AnimatedVectorTarget animatedVectorTarget : targets$animation_graphics_release) {
            Pair m28844to = TuplesKt.m28844to(animatedVectorTarget.getName(), animatedVectorTarget.getAnimator().createVectorConfig(updateTransition, animatedImageVector.getTotalDuration(), composer, 0));
            linkedHashMap.put(m28844to.getFirst(), m28844to.getSecond());
        }
        composer.endReplaceableGroup();
        function4.invoke(root, linkedHashMap, composer, Integer.valueOf((this.$$changed & 896) | 64));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
