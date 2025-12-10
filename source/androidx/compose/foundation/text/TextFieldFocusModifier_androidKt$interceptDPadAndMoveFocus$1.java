package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.text.input.TextInputSession;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ TextFieldState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, TextFieldState textFieldState) {
        super(1);
        this.$focusManager = focusManager;
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m69786invokeZmokQxo(keyEvent.m72593unboximpl());
    }

    @NotNull
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m69786invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        boolean m61060a;
        boolean m61060a2;
        boolean m61060a3;
        boolean m61060a4;
        boolean m61060a5;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        InputDevice device2 = keyEvent.getDevice();
        boolean z = false;
        if (device2 != null && device2.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device2.isVirtual() && KeyEventType.m72597equalsimpl0(KeyEvent_androidKt.m72605getTypeZmokQxo(keyEvent), KeyEventType.Companion.m72601getKeyDownCS__XNY())) {
            m61060a = TextFieldFocusModifier_androidKt.m61060a(keyEvent, 19);
            if (!m61060a) {
                m61060a2 = TextFieldFocusModifier_androidKt.m61060a(keyEvent, 20);
                if (!m61060a2) {
                    m61060a3 = TextFieldFocusModifier_androidKt.m61060a(keyEvent, 21);
                    if (!m61060a3) {
                        m61060a4 = TextFieldFocusModifier_androidKt.m61060a(keyEvent, 22);
                        if (!m61060a4) {
                            m61060a5 = TextFieldFocusModifier_androidKt.m61060a(keyEvent, 23);
                            if (m61060a5) {
                                TextInputSession inputSession = this.$state.getInputSession();
                                if (inputSession != null) {
                                    inputSession.showSoftwareKeyboard();
                                }
                                z = true;
                            }
                        } else {
                            z = this.$focusManager.mo71450moveFocus3ESFkO8(FocusDirection.Companion.m71448getRightdhqQ8s());
                        }
                    } else {
                        z = this.$focusManager.mo71450moveFocus3ESFkO8(FocusDirection.Companion.m71444getLeftdhqQ8s());
                    }
                } else {
                    z = this.$focusManager.mo71450moveFocus3ESFkO8(FocusDirection.Companion.m71440getDowndhqQ8s());
                }
            } else {
                z = this.$focusManager.mo71450moveFocus3ESFkO8(FocusDirection.Companion.m71449getUpdhqQ8s());
            }
        }
        return Boolean.valueOf(z);
    }
}
