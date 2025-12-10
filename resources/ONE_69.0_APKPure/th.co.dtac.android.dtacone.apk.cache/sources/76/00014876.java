package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$6 */
/* loaded from: classes10.dex */
public final class UpPassFormWebViewKt$UpPassFormWebView$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onFailed;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ String $startUrl;
    final /* synthetic */ WebViewController $webCtrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormWebViewKt$UpPassFormWebView$6(WebViewController webViewController, String str, Function0<Unit> function0, Function0<Unit> function02, Modifier modifier, int i, int i2) {
        super(2);
        this.$webCtrl = webViewController;
        this.$startUrl = str;
        this.$onFailed = function0;
        this.$onSuccess = function02;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassFormWebViewKt.UpPassFormWebView(this.$webCtrl, this.$startUrl, this.$onFailed, this.$onSuccess, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}