package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidSummaryFragment$actionClick$2$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidSummaryFragment$actionClick$2$1 extends Lambda implements Function1<Resource<? extends Void>, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel $this_apply;
    final /* synthetic */ OnePostpaidSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidSummaryFragment$actionClick$2$1(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, OnePostpaidSummaryFragment onePostpaidSummaryFragment) {
        super(1);
        this.$this_apply = onePostpaidRegistrationViewModel;
        this.this$0 = onePostpaidSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Void> resource) {
        invoke2((Resource<Void>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Void> resource) {
        Resource<Void> resourceContentIfNotHandled;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.$this_apply;
        OnePostpaidSummaryFragment onePostpaidSummaryFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel3 = null;
            if (onePostpaidRegistrationViewModel.isTrue()) {
                oneConsentNonTelcoViewModel2 = onePostpaidSummaryFragment.f93715S0;
                if (oneConsentNonTelcoViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
                } else {
                    oneConsentNonTelcoViewModel3 = oneConsentNonTelcoViewModel2;
                }
                oneConsentNonTelcoViewModel3.getConsentTmn(Constant.ConsentDomain.POSTPAID_REGISTRATION);
                return;
            }
            oneConsentNonTelcoViewModel = onePostpaidSummaryFragment.f93715S0;
            if (oneConsentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            } else {
                oneConsentNonTelcoViewModel3 = oneConsentNonTelcoViewModel;
            }
            oneConsentNonTelcoViewModel3.getConsentNonTelco(Constant.ConsentDomain.POSTPAID_REGISTRATION);
        }
    }
}