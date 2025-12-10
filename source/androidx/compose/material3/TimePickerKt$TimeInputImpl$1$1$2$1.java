package androidx.compose.material3;

import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$TimeInputImpl$1$1$2$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1$1 */
    /* loaded from: classes2.dex */
    public static final class C34071 extends Lambda implements Function1<TextFieldValue, Unit> {
        final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34071(MutableState<TextFieldValue> mutableState) {
            super(1);
            this.$hourValue$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TimePickerKt.m60433l(this.$hourValue$delegate, it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$2$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldValue newValue) {
        TextFieldValue m60434k;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int m70538getHourJiIwxys = Selection.Companion.m70538getHourJiIwxys();
        TimePickerState timePickerState = this.$state;
        m60434k = TimePickerKt.m60434k(this.$hourValue$delegate);
        TimePickerKt.m60420y(m70538getHourJiIwxys, timePickerState, newValue, m60434k, this.$state.is24hour() ? 23 : 12, new C34071(this.$hourValue$delegate));
    }
}
