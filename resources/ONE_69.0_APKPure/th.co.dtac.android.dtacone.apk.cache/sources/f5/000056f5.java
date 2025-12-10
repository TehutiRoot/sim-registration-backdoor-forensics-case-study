package androidx.compose.material.pullrefresh;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.State;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,250:1\n136#2,5:251\n261#2,11:256\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n*L\n150#1:251,5\n150#1:256,11\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt$CircularArrowIndicator$2 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ Path $path;
    final /* synthetic */ PullRefreshState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$2(PullRefreshState pullRefreshState, State<Float> state, long j, Path path) {
        super(1);
        this.$state = pullRefreshState;
        this.$alphaState = state;
        this.$color = j;
        this.$path = path;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        C5332b7 m60698a;
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        m60698a = PullRefreshIndicatorKt.m60698a(this.$state.getProgress());
        float floatValue = this.$alphaState.getValue().floatValue();
        float m51986b = m60698a.m51986b();
        long j = this.$color;
        Path path = this.$path;
        long mo72327getCenterF1C5BW0 = Canvas.mo72327getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long mo72334getSizeNHjbRc = drawContext.mo72334getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo72340rotateUv8p0NA(m51986b, mo72327getCenterF1C5BW0);
        f = PullRefreshIndicatorKt.f25525c;
        float mo69622toPx0680j_4 = Canvas.mo69622toPx0680j_4(f);
        f2 = PullRefreshIndicatorKt.f25526d;
        float mo69622toPx0680j_42 = mo69622toPx0680j_4 + (Canvas.mo69622toPx0680j_4(f2) / 2.0f);
        Rect rect = new Rect(Offset.m71686getXimpl(SizeKt.m71765getCenteruvyYCjk(Canvas.mo72328getSizeNHjbRc())) - mo69622toPx0680j_42, Offset.m71687getYimpl(SizeKt.m71765getCenteruvyYCjk(Canvas.mo72328getSizeNHjbRc())) - mo69622toPx0680j_42, Offset.m71686getXimpl(SizeKt.m71765getCenteruvyYCjk(Canvas.mo72328getSizeNHjbRc())) + mo69622toPx0680j_42, Offset.m71687getYimpl(SizeKt.m71765getCenteruvyYCjk(Canvas.mo72328getSizeNHjbRc())) + mo69622toPx0680j_42);
        float m51984d = m60698a.m51984d();
        float m51987a = m60698a.m51987a() - m60698a.m51984d();
        long m71721getTopLeftF1C5BW0 = rect.m71721getTopLeftF1C5BW0();
        long m71719getSizeNHjbRc = rect.m71719getSizeNHjbRc();
        f3 = PullRefreshIndicatorKt.f25526d;
        AbstractC12264mK.m26681v(Canvas, j, m51984d, m51987a, false, m71721getTopLeftF1C5BW0, m71719getSizeNHjbRc, floatValue, new Stroke(Canvas.mo69622toPx0680j_4(f3), 0.0f, StrokeCap.Companion.m72229getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        PullRefreshIndicatorKt.m60694e(Canvas, path, rect, j, floatValue, m60698a);
        drawContext.getCanvas().restore();
        drawContext.mo72335setSizeuvyYCjk(mo72334getSizeNHjbRc);
    }
}