package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdCardScreen$3$1$1 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdCardScreen$3$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $cardReaderMode;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ Function1<Boolean, Unit> $onSwitchCardReaderMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdCardScreen$3$1$1(SoftwareKeyboardController softwareKeyboardController, Function1<? super Boolean, Unit> function1, boolean z) {
        super(0);
        this.$keyboardController = softwareKeyboardController;
        this.$onSwitchCardReaderMode = function1;
        this.$cardReaderMode = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        this.$onSwitchCardReaderMode.invoke(Boolean.valueOf(!this.$cardReaderMode));
    }
}