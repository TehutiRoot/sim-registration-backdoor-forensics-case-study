package androidx.compose.animation.graphics.res;

import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.graphics.vector.VectorPainter;
import androidx.compose.p003ui.graphics.vector.VectorPainterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aO\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022.\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m29142d2 = {"Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "animatedImageVector", "", "atEnd", "Landroidx/compose/ui/graphics/painter/Painter;", "rememberAnimatedVectorPainter", "(Landroidx/compose/animation/graphics/vector/AnimatedImageVector;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "render", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/animation/graphics/vector/AnimatedImageVector;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "animation-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimatedVectorPainterResources_androidKt {
    /* renamed from: a */
    public static final Painter m61608a(AnimatedImageVector animatedImageVector, boolean z, Function4 function4, Composer composer, int i) {
        composer.startReplaceableGroup(546888339);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(546888339, i, -1, "androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter (AnimatedVectorPainterResources.android.kt:51)");
        }
        VectorPainter m72449rememberVectorPaintervIP8VLU = VectorPainterKt.m72449rememberVectorPaintervIP8VLU(animatedImageVector.getImageVector().m72429getDefaultWidthD9Ej5fM(), animatedImageVector.getImageVector().m72428getDefaultHeightD9Ej5fM(), animatedImageVector.getImageVector().getViewportWidth(), animatedImageVector.getImageVector().getViewportHeight(), animatedImageVector.getImageVector().getName(), animatedImageVector.getImageVector().m72431getTintColor0d7_KjU(), animatedImageVector.getImageVector().m72430getTintBlendMode0nO6VwU(), true, ComposableLambdaKt.composableLambda(composer, 10512245, true, new C2736xeaba97da(z, animatedImageVector, i, function4)), composer, 113246208, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m72449rememberVectorPaintervIP8VLU;
    }

    @ExperimentalAnimationGraphicsApi
    @Composable
    @NotNull
    public static final Painter rememberAnimatedVectorPainter(@NotNull AnimatedImageVector animatedImageVector, boolean z, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedImageVector, "animatedImageVector");
        composer.startReplaceableGroup(1724527265);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1724527265, i, -1, "androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter (AnimatedVectorPainterResources.android.kt:40)");
        }
        Painter m61608a = m61608a(animatedImageVector, z, ComposableSingletons$AnimatedVectorPainterResources_androidKt.INSTANCE.m69495getLambda1$animation_graphics_release(), composer, (i & 112) | (i & 14) | 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m61608a;
    }
}