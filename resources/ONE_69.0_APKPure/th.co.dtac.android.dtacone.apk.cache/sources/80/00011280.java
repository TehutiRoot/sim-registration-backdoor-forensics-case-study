package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextBoxKt$OneOutlineTextBox$2$1 */
/* loaded from: classes7.dex */
public final class OneOutlineTextBoxKt$OneOutlineTextBox$2$1 extends Lambda implements Function1<FocusState, Unit> {
    final /* synthetic */ MutableState<FocusState> $focusState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOutlineTextBoxKt$OneOutlineTextBox$2$1(MutableState<FocusState> mutableState) {
        super(1);
        this.$focusState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneOutlineTextBoxKt.m19999c(this.$focusState$delegate, it);
    }
}