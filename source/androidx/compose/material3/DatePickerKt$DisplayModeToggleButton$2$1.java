package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DatePickerKt$DisplayModeToggleButton$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<DisplayMode, Unit> $onDisplayModeChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$DisplayModeToggleButton$2$1(Function1<? super DisplayMode, Unit> function1) {
        super(0);
        this.$onDisplayModeChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDisplayModeChange.invoke(DisplayMode.m70360boximpl(DisplayMode.Companion.m70368getPickerjFl4v0()));
    }
}
