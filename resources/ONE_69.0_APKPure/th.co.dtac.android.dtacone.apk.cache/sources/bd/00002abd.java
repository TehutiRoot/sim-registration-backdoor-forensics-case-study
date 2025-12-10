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

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $borderColor$delegate;
    final /* synthetic */ State<Color> $boxColor$delegate;
    final /* synthetic */ C10169ep $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ State<Color> $checkColor$delegate;
    final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(C10169ep c10169ep, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = c10169ep;
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
        long m60876f;
        long m60880b;
        float f2;
        long m60877e;
        float m60879c;
        float m60878d;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = CheckboxKt.f14494d;
        float floor = (float) Math.floor(Canvas.mo69622toPx0680j_4(f));
        m60876f = CheckboxKt.m60876f(this.$boxColor$delegate);
        m60880b = CheckboxKt.m60880b(this.$borderColor$delegate);
        f2 = CheckboxKt.f14495e;
        CheckboxKt.m60875g(Canvas, m60876f, m60880b, Canvas.mo69622toPx0680j_4(f2), floor);
        m60877e = CheckboxKt.m60877e(this.$checkColor$delegate);
        m60879c = CheckboxKt.m60879c(this.$checkDrawFraction$delegate);
        m60878d = CheckboxKt.m60878d(this.$checkCenterGravitationShiftFraction$delegate);
        CheckboxKt.m60874h(Canvas, m60877e, m60879c, m60878d, floor, this.$checkCache);
    }
}