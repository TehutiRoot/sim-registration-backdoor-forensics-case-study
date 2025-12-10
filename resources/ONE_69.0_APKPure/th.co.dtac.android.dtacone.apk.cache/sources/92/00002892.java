package androidx.compose.foundation.text;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(TextFieldValue textFieldValue, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.$textFieldValue = textFieldValue;
        this.$textFieldValueState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextFieldValue m61033a;
        TextFieldValue m61033a2;
        long m73609getSelectiond9O1mEE = this.$textFieldValue.m73609getSelectiond9O1mEE();
        m61033a = BasicTextFieldKt.m61033a(this.$textFieldValueState$delegate);
        if (TextRange.m73393equalsimpl0(m73609getSelectiond9O1mEE, m61033a.m73609getSelectiond9O1mEE())) {
            TextRange m73608getCompositionMzsxiRA = this.$textFieldValue.m73608getCompositionMzsxiRA();
            m61033a2 = BasicTextFieldKt.m61033a(this.$textFieldValueState$delegate);
            if (Intrinsics.areEqual(m73608getCompositionMzsxiRA, m61033a2.m73608getCompositionMzsxiRA())) {
                return;
            }
        }
        BasicTextFieldKt.m61032b(this.$textFieldValueState$delegate, this.$textFieldValue);
    }
}