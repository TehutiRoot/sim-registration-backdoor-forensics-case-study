package androidx.compose.material3;

import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$TimeInputImpl$1$1$4$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$4$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$minuteValue$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m70719invokeZmokQxo(keyEvent.m72593unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean m70719invokeZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r3) {
        /*
            r2 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r3 = androidx.compose.p003ui.input.key.KeyEvent_androidKt.m72606getUtf16CodePointZmokQxo(r3)
            if (r3 != 0) goto L1d
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r3 = r2.$minuteValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r3 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$8(r3)
            long r0 = r3.m73425getSelectiond9O1mEE()
            int r3 = androidx.compose.p003ui.text.TextRange.m73216getStartimpl(r0)
            if (r3 != 0) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 == 0) goto L2b
            androidx.compose.material3.TimePickerState r0 = r2.$state
            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.Companion
            int r1 = r1.m70538getHourJiIwxys()
            r0.m70737setSelectioniHAOin8$material3_release(r1)
        L2b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1.m70719invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
    }
}
