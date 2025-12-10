package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpOffset;", "invoke-RKDOV3M", "()J"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1673:1\n75#2:1674\n58#2:1675\n51#2:1676\n88#2:1677\n75#2:1678\n51#2:1679\n88#2:1680\n75#2:1681\n51#2:1682\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n*L\n509#1:1674\n514#1:1675\n516#1:1676\n517#1:1677\n517#1:1678\n517#1:1679\n518#1:1680\n518#1:1681\n518#1:1682\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerState$selectorPos$2 extends Lambda implements Function0<DpOffset> {
    final /* synthetic */ boolean $is24Hour;
    final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$selectorPos$2(TimePickerState timePickerState, boolean z) {
        super(0);
        this.this$0 = timePickerState;
        this.$is24Hour = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ DpOffset invoke() {
        return DpOffset.m73897boximpl(m70922invokeRKDOV3M());
    }

    /* renamed from: invoke-RKDOV3M  reason: not valid java name */
    public final long m70922invokeRKDOV3M() {
        boolean isInnerCircle$material3_release = this.this$0.isInnerCircle$material3_release();
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f = 2;
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(timePickerTokens.m71486getClockDialSelectorHandleContainerSizeD9Ej5fM() / f);
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(C3623Dp.m73842constructorimpl(((this.$is24Hour && isInnerCircle$material3_release && Selection.m70718equalsimpl0(this.this$0.m70918getSelectionJiIwxys$material3_release(), Selection.Companion.m70722getHourJiIwxys())) ? TimePickerKt.f26471b : TimePickerKt.f26470a) - m73842constructorimpl) + m73842constructorimpl);
        return DpKt.m73863DpOffsetYgX7TsA(C3623Dp.m73842constructorimpl(C3623Dp.m73842constructorimpl(((float) Math.cos(this.this$0.getCurrentAngle$material3_release().getValue().floatValue())) * m73842constructorimpl2) + C3623Dp.m73842constructorimpl(timePickerTokens.m71484getClockDialContainerSizeD9Ej5fM() / f)), C3623Dp.m73842constructorimpl(C3623Dp.m73842constructorimpl(m73842constructorimpl2 * ((float) Math.sin(this.this$0.getCurrentAngle$material3_release().getValue().floatValue()))) + C3623Dp.m73842constructorimpl(timePickerTokens.m71484getClockDialContainerSizeD9Ej5fM() / f)));
    }
}