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
public final class TimePickerKt$TimeInputImpl$1$1$5$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1$1 */
    /* loaded from: classes2.dex */
    public static final class C34081 extends Lambda implements Function1<TextFieldValue, Unit> {
        final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34081(MutableState<TextFieldValue> mutableState) {
            super(1);
            this.$minuteValue$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TimePickerKt.m60431n(this.$minuteValue$delegate, it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$5$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$minuteValue$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldValue newValue) {
        TextFieldValue m60432m;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int m70539getMinuteJiIwxys = Selection.Companion.m70539getMinuteJiIwxys();
        TimePickerState timePickerState = this.$state;
        m60432m = TimePickerKt.m60432m(this.$minuteValue$delegate);
        TimePickerKt.m60420y(m70539getMinuteJiIwxys, timePickerState, newValue, m60432m, 59, new C34081(this.$minuteValue$delegate));
    }
}
