package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$clearFocusOnKeyboardDismiss$1$2$1 */
/* loaded from: classes7.dex */
public final class KeyboardHelperKt$clearFocusOnKeyboardDismiss$1$2$1 extends Lambda implements Function1<FocusState, Unit> {
    final /* synthetic */ MutableState<Boolean> $isFocused$delegate;
    final /* synthetic */ MutableState<Boolean> $keyboardAppearedSinceLastFocused$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardHelperKt$clearFocusOnKeyboardDismiss$1$2$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$isFocused$delegate = mutableState;
        this.$keyboardAppearedSinceLastFocused$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FocusState it) {
        boolean invoke$lambda$1;
        boolean invoke$lambda$12;
        Intrinsics.checkNotNullParameter(it, "it");
        invoke$lambda$1 = KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$1(this.$isFocused$delegate);
        if (invoke$lambda$1 != it.isFocused()) {
            KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$2(this.$isFocused$delegate, it.isFocused());
            invoke$lambda$12 = KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$1(this.$isFocused$delegate);
            if (invoke$lambda$12) {
                KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.invoke$lambda$5(this.$keyboardAppearedSinceLastFocused$delegate, false);
            }
        }
    }
}