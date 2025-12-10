package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$UpPassFormWebViewSection$4 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$UpPassFormWebViewSection$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ UpPassFormState $formState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<CommonErrorResponse, Unit> $onErrorResult;
    final /* synthetic */ Function1<CommonErrorResponse, Unit> $onErrorUrl;
    final /* synthetic */ Function0<Unit> $onResultSuccess;
    final /* synthetic */ Function0<Unit> $onWebViewFailed;
    final /* synthetic */ Function0<Unit> $onWebViewSuccess;
    final /* synthetic */ ColumnScope $this_UpPassFormWebViewSection;
    final /* synthetic */ WebViewController $webCtrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassFormScreenKt$UpPassFormWebViewSection$4(ColumnScope columnScope, WebViewController webViewController, UpPassFormState upPassFormState, Function1<? super CommonErrorResponse, Unit> function1, Function1<? super CommonErrorResponse, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Modifier modifier, int i, int i2) {
        super(2);
        this.$this_UpPassFormWebViewSection = columnScope;
        this.$webCtrl = webViewController;
        this.$formState = upPassFormState;
        this.$onErrorUrl = function1;
        this.$onErrorResult = function12;
        this.$onWebViewSuccess = function0;
        this.$onWebViewFailed = function02;
        this.$onResultSuccess = function03;
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
        UpPassFormScreenKt.m9155D(this.$this_UpPassFormWebViewSection, this.$webCtrl, this.$formState, this.$onErrorUrl, this.$onErrorResult, this.$onWebViewSuccess, this.$onWebViewFailed, this.$onResultSuccess, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}