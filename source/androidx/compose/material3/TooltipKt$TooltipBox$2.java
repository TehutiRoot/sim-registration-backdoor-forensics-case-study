package androidx.compose.material3;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.window.PopupPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TooltipKt$TooltipBox$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Function3<TooltipBoxScope, Composer, Integer, Unit> $content;
    final /* synthetic */ float $elevation;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tooltipContent;
    final /* synthetic */ PopupPositionProvider $tooltipPositionProvider;
    final /* synthetic */ TooltipState $tooltipState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$TooltipBox$2(Function2<? super Composer, ? super Integer, Unit> function2, PopupPositionProvider popupPositionProvider, Modifier modifier, Shape shape, TooltipState tooltipState, long j, float f, float f2, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$tooltipContent = function2;
        this.$tooltipPositionProvider = popupPositionProvider;
        this.$modifier = modifier;
        this.$shape = shape;
        this.$tooltipState = tooltipState;
        this.$containerColor = j;
        this.$elevation = f;
        this.$maxWidth = f2;
        this.$content = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TooltipKt.m60411c(this.$tooltipContent, this.$tooltipPositionProvider, this.$modifier, this.$shape, this.$tooltipState, this.$containerColor, this.$elevation, this.$maxWidth, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
