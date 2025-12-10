package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.unit.DpOffset;
import com.feitian.readerdk.Tool.C6150DK;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$drawSelector$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$drawSelector$1(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(1);
        this.$state = timePickerState;
        this.$colors = timePickerColors;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        long Offset = OffsetKt.Offset(drawWithContent.mo69438toPx0680j_4(DpOffset.m73719getXD9Ej5fM(this.$state.m70735getSelectorPosRKDOV3M$material3_release())), drawWithContent.mo69438toPx0680j_4(DpOffset.m73721getYD9Ej5fM(this.$state.m70735getSelectorPosRKDOV3M$material3_release())));
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f = 2;
        float mo69438toPx0680j_4 = drawWithContent.mo69438toPx0680j_4(timePickerTokens.m71302getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
        long m70705getSelectorColor0d7_KjU$material3_release = this.$colors.m70705getSelectorColor0d7_KjU$material3_release();
        long m71761getBlack0d7_KjU = Color.Companion.m71761getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.Companion;
        AbstractC12212lK.m26490x(drawWithContent, m71761getBlack0d7_KjU, mo69438toPx0680j_4, Offset, 0.0f, null, null, companion.m71659getClear0nO6VwU(), 56, null);
        drawWithContent.drawContent();
        AbstractC12212lK.m26490x(drawWithContent, m70705getSelectorColor0d7_KjU$material3_release, mo69438toPx0680j_4, Offset, 0.0f, null, null, companion.m71687getXor0nO6VwU(), 56, null);
        AbstractC12212lK.m26524C(drawWithContent, m70705getSelectorColor0d7_KjU$material3_release, SizeKt.m71581getCenteruvyYCjk(drawWithContent.mo72144getSizeNHjbRc()), Offset.m71506minusMKHz9U(Offset, OffsetKt.Offset(((float) Math.cos(this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * mo69438toPx0680j_4, ((float) Math.sin(this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * mo69438toPx0680j_4)), drawWithContent.mo69438toPx0680j_4(timePickerTokens.m71303getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m71686getSrcOver0nO6VwU(), C6150DK.ERROR_RECEIVE_LRC, null);
        AbstractC12212lK.m26490x(drawWithContent, m70705getSelectorColor0d7_KjU$material3_release, drawWithContent.mo69438toPx0680j_4(timePickerTokens.m71301getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, SizeKt.m71581getCenteruvyYCjk(drawWithContent.mo72144getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        AbstractC12212lK.m26490x(drawWithContent, this.$colors.m70701clockDialContentColorvNxB06k$material3_release(true), mo69438toPx0680j_4, Offset, 0.0f, null, null, companion.m71669getDstOver0nO6VwU(), 56, null);
    }
}
