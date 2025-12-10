package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.webkit.JsResult;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$5$1 */
/* loaded from: classes10.dex */
public final class UpPassFormWebViewKt$UpPassFormWebView$5$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<JsResult> $alertResult$delegate;
    final /* synthetic */ MutableState<Boolean> $showAlertDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormWebViewKt$UpPassFormWebView$5$1(MutableState<JsResult> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$alertResult$delegate = mutableState;
        this.$showAlertDialog$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        JsResult m9100i;
        m9100i = UpPassFormWebViewKt.m9100i(this.$alertResult$delegate);
        if (m9100i != null) {
            m9100i.cancel();
        }
        UpPassFormWebViewKt.m9101h(this.$showAlertDialog$delegate, false);
    }
}