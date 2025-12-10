package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class DatePickerKt$DatePickerContent$1$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$3$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$yearPickerVisible$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean m60623b;
        MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        m60623b = DatePickerKt.m60623b(mutableState);
        DatePickerKt.m60622c(mutableState, !m60623b);
    }
}