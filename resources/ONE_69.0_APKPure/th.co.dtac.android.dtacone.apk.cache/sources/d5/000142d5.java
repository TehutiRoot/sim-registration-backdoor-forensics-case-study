package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdCardScreen$2 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdCardScreen$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputIdCardScreenKt$InputIdCardScreen$2(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager) {
        super(0);
        this.$keyboardController = softwareKeyboardController;
        this.$focusManager = focusManager;
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
        F30.m68540a(this.$focusManager, false, 1, null);
    }
}