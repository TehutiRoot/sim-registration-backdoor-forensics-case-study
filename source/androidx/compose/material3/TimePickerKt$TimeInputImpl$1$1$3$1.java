package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$TimeInputImpl$1$1$3$1 extends Lambda implements Function1<KeyboardActionScope, Unit> {
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$3$1(TimePickerState timePickerState) {
        super(1);
        this.$state = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
        invoke2(keyboardActionScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull KeyboardActionScope $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.$state.m70737setSelectioniHAOin8$material3_release(Selection.Companion.m70539getMinuteJiIwxys());
    }
}
