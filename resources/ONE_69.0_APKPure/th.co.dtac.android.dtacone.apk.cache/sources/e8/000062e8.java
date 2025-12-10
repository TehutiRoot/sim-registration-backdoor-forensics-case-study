package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1 */
/* loaded from: classes2.dex */
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m73203invokeZmokQxo(keyEvent.m72777unboximpl());
    }

    @NotNull
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m73203invokeZmokQxo(@NotNull android.view.KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FocusDirection mo73199getFocusDirectionP8AzH3I = this.this$0.mo73199getFocusDirectionP8AzH3I(it);
        if (mo73199getFocusDirectionP8AzH3I != null && KeyEventType.m72781equalsimpl0(KeyEvent_androidKt.m72789getTypeZmokQxo(it), KeyEventType.Companion.m72785getKeyDownCS__XNY())) {
            return Boolean.valueOf(this.this$0.getFocusOwner().mo71634moveFocus3ESFkO8(mo73199getFocusDirectionP8AzH3I.m71619unboximpl()));
        }
        return Boolean.FALSE;
    }
}