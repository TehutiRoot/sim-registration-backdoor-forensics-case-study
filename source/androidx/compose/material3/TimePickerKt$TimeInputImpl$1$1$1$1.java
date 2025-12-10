package androidx.compose.material3;

import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$TimeInputImpl$1$1$1$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m70718invokeZmokQxo(keyEvent.m72593unboximpl());
    }

    @NotNull
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m70718invokeZmokQxo(@NotNull android.view.KeyEvent event) {
        TextFieldValue m60434k;
        TextFieldValue m60434k2;
        Intrinsics.checkNotNullParameter(event, "event");
        int m72606getUtf16CodePointZmokQxo = KeyEvent_androidKt.m72606getUtf16CodePointZmokQxo(event);
        if (48 <= m72606getUtf16CodePointZmokQxo && m72606getUtf16CodePointZmokQxo < 58) {
            m60434k = TimePickerKt.m60434k(this.$hourValue$delegate);
            if (TextRange.m73216getStartimpl(m60434k.m73425getSelectiond9O1mEE()) == 2) {
                m60434k2 = TimePickerKt.m60434k(this.$hourValue$delegate);
                if (m60434k2.getText().length() == 2) {
                    this.$state.m70737setSelectioniHAOin8$material3_release(Selection.Companion.m70539getMinuteJiIwxys());
                }
            }
        }
        return Boolean.FALSE;
    }
}
