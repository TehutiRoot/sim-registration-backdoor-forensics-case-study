package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,770:1\n36#2:771\n1114#3,6:772\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1$2\n*L\n266#1:771\n266#1:772,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TooltipKt$TooltipBox$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tooltipContent;
    final /* synthetic */ String $tooltipPaneDescription;
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$TooltipBox$1$2(Modifier modifier, float f, Transition<Boolean> transition, String str, Shape shape, long j, float f2, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$modifier = modifier;
        this.$maxWidth = f;
        this.$transition = transition;
        this.$tooltipPaneDescription = str;
        this.$shape = shape;
        this.$containerColor = j;
        this.$elevation = f2;
        this.$tooltipContent = function2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        Modifier m60410d;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-442150991, i, -1, "androidx.compose.material3.TooltipBox.<anonymous>.<anonymous> (Tooltip.kt:256)");
        }
        m60410d = TooltipKt.m60410d(SizeKt.m69568sizeInqDBjuR0$default(this.$modifier, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), this.$maxWidth, 0.0f, 8, null), this.$transition);
        String str = this.$tooltipPaneDescription;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(str);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TooltipKt$TooltipBox$1$2$1$1(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(m60410d, false, (Function1) rememberedValue, 1, null);
        Shape shape = this.$shape;
        long j = this.$containerColor;
        float f = this.$elevation;
        Function2<Composer, Integer, Unit> function2 = this.$tooltipContent;
        int i2 = this.$$dirty;
        SurfaceKt.m70628SurfaceT9BRK9s(semantics$default, shape, j, 0L, f, f, null, function2, composer, ((i2 >> 6) & 112) | ((i2 >> 9) & 896) | (57344 & (i2 >> 6)) | ((i2 >> 3) & 458752) | ((i2 << 21) & 29360128), 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
