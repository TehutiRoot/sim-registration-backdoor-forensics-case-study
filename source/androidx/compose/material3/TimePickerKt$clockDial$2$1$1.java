package androidx.compose.material3;

import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$clockDial$2$1$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$clockDial$2$1$1(TimePickerState timePickerState) {
        super(1);
        this.$state = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m70720invokeozmzZPI(intSize.m73822unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m70720invokeozmzZPI(long j) {
        this.$state.m70736setCentergyyYBs$material3_release(IntSizeKt.m73824getCenterozmzZPI(j));
    }
}
