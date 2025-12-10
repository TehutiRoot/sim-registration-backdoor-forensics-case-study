package androidx.compose.material;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n*L\n124#1:234\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$2$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<C3641Dp> $dotRadius;
    final /* synthetic */ State<Color> $radioColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(State<Color> state, State<C3641Dp> state2) {
        super(1);
        this.$radioColor = state;
        this.$dotRadius = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = RadioButtonKt.f14569f;
        float mo69438toPx0680j_4 = Canvas.mo69438toPx0680j_4(f);
        long m71745unboximpl = this.$radioColor.getValue().m71745unboximpl();
        f2 = RadioButtonKt.f14567d;
        float f3 = mo69438toPx0680j_4 / 2;
        AbstractC12212lK.m26490x(Canvas, m71745unboximpl, Canvas.mo69438toPx0680j_4(f2) - f3, 0L, 0.0f, new Stroke(mo69438toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        if (C3641Dp.m73657compareTo0680j_4(this.$dotRadius.getValue().m73672unboximpl(), C3641Dp.m73658constructorimpl(0)) > 0) {
            AbstractC12212lK.m26490x(Canvas, this.$radioColor.getValue().m71745unboximpl(), Canvas.mo69438toPx0680j_4(this.$dotRadius.getValue().m73672unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        }
    }
}
