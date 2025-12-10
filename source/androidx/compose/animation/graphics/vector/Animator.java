package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.graphics.vector.VectorConfig;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J+\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000fJ0\u0010\u0010\u001a\u00020\b2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H&J#\u0010\u0016\u001a\u00020\u00172\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/Animator;", "", "()V", "totalDuration", "", "getTotalDuration", "()I", "Configure", "", "transition", "Landroidx/compose/animation/core/Transition;", "", "config", "Landroidx/compose/animation/graphics/vector/StateVectorConfig;", "overallDuration", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/graphics/vector/StateVectorConfig;ILandroidx/compose/runtime/Composer;I)V", "collectPropertyValues", "propertyValuesMap", "", "", "Landroidx/compose/animation/graphics/vector/PropertyValues;", "parentDelay", "createVectorConfig", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "(Landroidx/compose/animation/core/Transition;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorConfig;", "Landroidx/compose/animation/graphics/vector/AnimatorSet;", "Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/Animator\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,650:1\n25#2:651\n36#2:658\n1097#3,6:652\n1097#3,6:659\n1002#4,2:665\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/Animator\n*L\n54#1:651\n65#1:658\n54#1:652,6\n65#1:659,6\n71#1:665,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class Animator {
    public /* synthetic */ Animator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L126;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Configure(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<java.lang.Boolean> r9, @org.jetbrains.annotations.NotNull androidx.compose.animation.graphics.vector.StateVectorConfig r10, int r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.graphics.vector.Animator.Configure(androidx.compose.animation.core.Transition, androidx.compose.animation.graphics.vector.StateVectorConfig, int, androidx.compose.runtime.Composer, int):void");
    }

    public abstract void collectPropertyValues(@NotNull Map<String, PropertyValues<?>> map, int i, int i2);

    @Composable
    @NotNull
    public final VectorConfig createVectorConfig(@NotNull Transition<Boolean> transition, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        composer.startReplaceableGroup(1481697905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1481697905, i2, -1, "androidx.compose.animation.graphics.vector.Animator.createVectorConfig (Animator.kt:49)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new StateVectorConfig();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        StateVectorConfig stateVectorConfig = (StateVectorConfig) rememberedValue;
        int i3 = i2 << 3;
        Configure(transition, stateVectorConfig, i, composer, (i2 & 14) | 64 | (i3 & 896) | (i3 & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateVectorConfig;
    }

    public abstract int getTotalDuration();

    public Animator() {
    }
}
