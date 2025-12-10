package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.input.InputMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/InputMode;", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1 */
/* loaded from: classes2.dex */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements Function1<InputMode, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
        return m73202invokeiuPiT84(inputMode.m72471unboximpl());
    }

    @NotNull
    /* renamed from: invoke-iuPiT84  reason: not valid java name */
    public final Boolean m73202invokeiuPiT84(int i) {
        boolean z;
        InputMode.Companion companion = InputMode.Companion;
        if (InputMode.m72468equalsimpl0(i, companion.m72473getTouchaOaMEAU())) {
            z = this.this$0.isInTouchMode();
        } else if (InputMode.m72468equalsimpl0(i, companion.m72472getKeyboardaOaMEAU())) {
            if (this.this$0.isInTouchMode()) {
                z = this.this$0.requestFocusFromTouch();
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}