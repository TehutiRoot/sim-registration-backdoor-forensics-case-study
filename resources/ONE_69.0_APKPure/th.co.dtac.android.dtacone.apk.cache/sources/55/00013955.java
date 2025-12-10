package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneReserveAllocateMsisdnResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneReserveAllocateMsisdnResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$reserveAllocateMsisdn$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$reserveAllocateMsisdn$3 extends Lambda implements Function1<OneReserveAllocateMsisdnResponse, Unit> {
    final /* synthetic */ String $msisdn;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$reserveAllocateMsisdn$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, String str) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$msisdn = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneReserveAllocateMsisdnResponse oneReserveAllocateMsisdnResponse) {
        invoke2(oneReserveAllocateMsisdnResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneReserveAllocateMsisdnResponse oneReserveAllocateMsisdnResponse) {
        OnePostpaidRepository onePostpaidRepository;
        this.this$0.setReserveNumber(this.$msisdn);
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.getModel().setLastMsisdnForSummary(this.$msisdn);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.navigateNextForSummary();
    }
}