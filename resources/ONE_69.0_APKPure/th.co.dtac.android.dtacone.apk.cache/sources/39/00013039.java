package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$NavigateUpload$4 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$NavigateUpload$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$NavigateUpload$4(OneConsentAndESignViewModel oneConsentAndESignViewModel) {
        super(0);
        this.$viewModel = oneConsentAndESignViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.setClearUpdateAppFormState();
    }
}