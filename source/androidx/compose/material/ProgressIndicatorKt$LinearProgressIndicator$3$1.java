package androidx.compose.material;

import androidx.compose.p003ui.geometry.Size;
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
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead$delegate;
    final /* synthetic */ State<Float> $firstLineTail$delegate;
    final /* synthetic */ State<Float> $secondLineHead$delegate;
    final /* synthetic */ State<Float> $secondLineTail$delegate;
    final /* synthetic */ int $strokeCap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, int i, long j2, State<Float> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j;
        this.$strokeCap = i;
        this.$color = j2;
        this.$firstLineHead$delegate = state;
        this.$firstLineTail$delegate = state2;
        this.$secondLineHead$delegate = state3;
        this.$secondLineTail$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float m60852e;
        float m60851f;
        float m60850g;
        float m60849h;
        float m60850g2;
        float m60849h2;
        float m60852e2;
        float m60851f2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m71568getHeightimpl = Size.m71568getHeightimpl(Canvas.mo72144getSizeNHjbRc());
        ProgressIndicatorKt.m60843n(Canvas, this.$backgroundColor, m71568getHeightimpl, this.$strokeCap);
        m60852e = ProgressIndicatorKt.m60852e(this.$firstLineHead$delegate);
        m60851f = ProgressIndicatorKt.m60851f(this.$firstLineTail$delegate);
        if (m60852e - m60851f > 0.0f) {
            m60852e2 = ProgressIndicatorKt.m60852e(this.$firstLineHead$delegate);
            m60851f2 = ProgressIndicatorKt.m60851f(this.$firstLineTail$delegate);
            ProgressIndicatorKt.m60844m(Canvas, m60852e2, m60851f2, this.$color, m71568getHeightimpl, this.$strokeCap);
        }
        m60850g = ProgressIndicatorKt.m60850g(this.$secondLineHead$delegate);
        m60849h = ProgressIndicatorKt.m60849h(this.$secondLineTail$delegate);
        if (m60850g - m60849h > 0.0f) {
            m60850g2 = ProgressIndicatorKt.m60850g(this.$secondLineHead$delegate);
            m60849h2 = ProgressIndicatorKt.m60849h(this.$secondLineTail$delegate);
            ProgressIndicatorKt.m60844m(Canvas, m60850g2, m60849h2, this.$color, m71568getHeightimpl, this.$strokeCap);
        }
    }
}
