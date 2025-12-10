package androidx.compose.material;

import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ State<Float> $baseRotation$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation$delegate;
    final /* synthetic */ State<Float> $endAngle$delegate;
    final /* synthetic */ State<Float> $startAngle$delegate;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j, Stroke stroke, float f, long j2, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j;
        this.$stroke = stroke;
        this.$strokeWidth = f;
        this.$color = j2;
        this.$currentRotation$delegate = state;
        this.$endAngle$delegate = state2;
        this.$startAngle$delegate = state3;
        this.$baseRotation$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        int m60804c;
        float m60806a;
        float m60805b;
        float m60803d;
        float m60805b2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        ProgressIndicatorKt.m60797j(Canvas, this.$backgroundColor, this.$stroke);
        m60804c = ProgressIndicatorKt.m60804c(this.$currentRotation$delegate);
        m60806a = ProgressIndicatorKt.m60806a(this.$endAngle$delegate);
        m60805b = ProgressIndicatorKt.m60805b(this.$startAngle$delegate);
        float abs = Math.abs(m60806a - m60805b);
        m60803d = ProgressIndicatorKt.m60803d(this.$baseRotation$delegate);
        float f = (((m60804c * 216.0f) % 360.0f) - 90.0f) + m60803d;
        m60805b2 = ProgressIndicatorKt.m60805b(this.$startAngle$delegate);
        ProgressIndicatorKt.m60795l(Canvas, m60805b2 + f, this.$strokeWidth, abs, this.$color, this.$stroke);
    }
}