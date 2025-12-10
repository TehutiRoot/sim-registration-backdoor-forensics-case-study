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

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        C5348b7 m60748a;
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        m60748a = PullRefreshIndicatorKt.m60748a(this.$state.getProgress());
        float floatValue = this.$alphaState.getValue().floatValue();
        float m52047b = m60748a.m52047b();
        long j = this.$color;
        Path path = this.$path;
        long mo72143getCenterF1C5BW0 = Canvas.mo72143getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo72156rotateUv8p0NA(m52047b, mo72143getCenterF1C5BW0);
        f = PullRefreshIndicatorKt.f25437c;
        float mo69438toPx0680j_4 = Canvas.mo69438toPx0680j_4(f);
        f2 = PullRefreshIndicatorKt.f25438d;
        float mo69438toPx0680j_42 = mo69438toPx0680j_4 + (Canvas.mo69438toPx0680j_4(f2) / 2.0f);
        Rect rect = new Rect(Offset.m71502getXimpl(SizeKt.m71581getCenteruvyYCjk(Canvas.mo72144getSizeNHjbRc())) - mo69438toPx0680j_42, Offset.m71503getYimpl(SizeKt.m71581getCenteruvyYCjk(Canvas.mo72144getSizeNHjbRc())) - mo69438toPx0680j_42, Offset.m71502getXimpl(SizeKt.m71581getCenteruvyYCjk(Canvas.mo72144getSizeNHjbRc())) + mo69438toPx0680j_42, Offset.m71503getYimpl(SizeKt.m71581getCenteruvyYCjk(Canvas.mo72144getSizeNHjbRc())) + mo69438toPx0680j_42);
        float m52045d = m60748a.m52045d();
        float m52048a = m60748a.m52048a() - m60748a.m52045d();
        long m71537getTopLeftF1C5BW0 = rect.m71537getTopLeftF1C5BW0();
        long m71535getSizeNHjbRc = rect.m71535getSizeNHjbRc();
        f3 = PullRefreshIndicatorKt.f25438d;
        AbstractC12212lK.m26492v(Canvas, j, m52045d, m52048a, false, m71537getTopLeftF1C5BW0, m71535getSizeNHjbRc, floatValue, new Stroke(Canvas.mo69438toPx0680j_4(f3), 0.0f, StrokeCap.Companion.m72045getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        PullRefreshIndicatorKt.m60744e(Canvas, path, rect, j, floatValue, m60748a);
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }
}
