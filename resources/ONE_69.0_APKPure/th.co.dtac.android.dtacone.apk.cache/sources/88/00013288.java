package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpVerifyOtpFragment$setUpView$eventKeyDel$1 */
/* loaded from: classes10.dex */
public final class OneMnpVerifyOtpFragment$setUpView$eventKeyDel$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ EditText $current;
    final /* synthetic */ KeyEvent $event;
    final /* synthetic */ EditText $previewView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpVerifyOtpFragment$setUpView$eventKeyDel$1(KeyEvent keyEvent, EditText editText, EditText editText2) {
        super(0);
        this.$event = keyEvent;
        this.$current = editText;
        this.$previewView = editText2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        if (this.$event.getAction() == 1 && this.$event.getKeyCode() == 67) {
            Editable text = this.$current.getText();
            Intrinsics.checkNotNullExpressionValue(text, "current.text");
            if (text.length() == 0) {
                this.$previewView.setText("");
                this.$previewView.requestFocus();
            }
        }
        return Boolean.FALSE;
    }
}