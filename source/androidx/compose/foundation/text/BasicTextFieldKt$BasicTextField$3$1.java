package androidx.compose.foundation.text;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        TextFieldValue m61083a;
        TextFieldValue m61083a2;
        long m73425getSelectiond9O1mEE = this.$textFieldValue.m73425getSelectiond9O1mEE();
        m61083a = BasicTextFieldKt.m61083a(this.$textFieldValueState$delegate);
        if (TextRange.m73209equalsimpl0(m73425getSelectiond9O1mEE, m61083a.m73425getSelectiond9O1mEE())) {
            TextRange m73424getCompositionMzsxiRA = this.$textFieldValue.m73424getCompositionMzsxiRA();
            m61083a2 = BasicTextFieldKt.m61083a(this.$textFieldValueState$delegate);
            if (Intrinsics.areEqual(m73424getCompositionMzsxiRA, m61083a2.m73424getCompositionMzsxiRA())) {
                return;
            }
        }
        BasicTextFieldKt.m61082b(this.$textFieldValueState$delegate, this.$textFieldValue);
    }
}
