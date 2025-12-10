package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $borderColor$delegate;
    final /* synthetic */ State<Color> $boxColor$delegate;
    final /* synthetic */ C10173ep $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ State<Color> $checkColor$delegate;
    final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(C10173ep c10173ep, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = c10173ep;
        this.$boxColor$delegate = state;
        this.$borderColor$delegate = state2;
        this.$checkColor$delegate = state3;
        this.$checkDrawFraction$delegate = state4;
        this.$checkCenterGravitationShiftFraction$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float f;
        long m60926f;
        long m60930b;
        float f2;
        long m60927e;
        float m60929c;
        float m60928d;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = CheckboxKt.f14406d;
        float floor = (float) Math.floor(Canvas.mo69438toPx0680j_4(f));
        m60926f = CheckboxKt.m60926f(this.$boxColor$delegate);
        m60930b = CheckboxKt.m60930b(this.$borderColor$delegate);
        f2 = CheckboxKt.f14407e;
        CheckboxKt.m60925g(Canvas, m60926f, m60930b, Canvas.mo69438toPx0680j_4(f2), floor);
        m60927e = CheckboxKt.m60927e(this.$checkColor$delegate);
        m60929c = CheckboxKt.m60929c(this.$checkDrawFraction$delegate);
        m60928d = CheckboxKt.m60928d(this.$checkCenterGravitationShiftFraction$delegate);
        CheckboxKt.m60924h(Canvas, m60927e, m60929c, m60928d, floor, this.$checkCache);
    }
}
