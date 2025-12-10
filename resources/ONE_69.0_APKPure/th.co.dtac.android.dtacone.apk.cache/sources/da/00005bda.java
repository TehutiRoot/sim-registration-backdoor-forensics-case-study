package androidx.compose.material3;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$TimeInputImpl$hourValue$2$1 extends Lambda implements Function0<MutableState<TextFieldValue>> {
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$hourValue$2$1(TimePickerState timePickerState) {
        super(0);
        this.$state = timePickerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MutableState<TextFieldValue> invoke() {
        String m60369z;
        MutableState<TextFieldValue> m65148g;
        m60369z = TimePickerKt.m60369z(this.$state.getHourForDisplay$material3_release(), 2);
        m65148g = AbstractC19036aL1.m65148g(new TextFieldValue(m60369z, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
        return m65148g;
    }
}