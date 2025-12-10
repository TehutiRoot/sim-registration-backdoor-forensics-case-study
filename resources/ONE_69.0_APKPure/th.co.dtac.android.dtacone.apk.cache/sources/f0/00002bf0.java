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

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
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
        float m60802e;
        float m60801f;
        float m60800g;
        float m60799h;
        float m60800g2;
        float m60799h2;
        float m60802e2;
        float m60801f2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m71752getHeightimpl = Size.m71752getHeightimpl(Canvas.mo72328getSizeNHjbRc());
        ProgressIndicatorKt.m60793n(Canvas, this.$backgroundColor, m71752getHeightimpl, this.$strokeCap);
        m60802e = ProgressIndicatorKt.m60802e(this.$firstLineHead$delegate);
        m60801f = ProgressIndicatorKt.m60801f(this.$firstLineTail$delegate);
        if (m60802e - m60801f > 0.0f) {
            m60802e2 = ProgressIndicatorKt.m60802e(this.$firstLineHead$delegate);
            m60801f2 = ProgressIndicatorKt.m60801f(this.$firstLineTail$delegate);
            ProgressIndicatorKt.m60794m(Canvas, m60802e2, m60801f2, this.$color, m71752getHeightimpl, this.$strokeCap);
        }
        m60800g = ProgressIndicatorKt.m60800g(this.$secondLineHead$delegate);
        m60799h = ProgressIndicatorKt.m60799h(this.$secondLineTail$delegate);
        if (m60800g - m60799h > 0.0f) {
            m60800g2 = ProgressIndicatorKt.m60800g(this.$secondLineHead$delegate);
            m60799h2 = ProgressIndicatorKt.m60799h(this.$secondLineTail$delegate);
            ProgressIndicatorKt.m60794m(Canvas, m60800g2, m60799h2, this.$color, m71752getHeightimpl, this.$strokeCap);
        }
    }
}