package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCancelAndCheckNumberResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCancelAndCheckNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$cancelAndCheckNumber$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$cancelAndCheckNumber$3 extends Lambda implements Function1<OneCancelAndCheckNumberResponse, Unit> {
    final /* synthetic */ String $msisdn;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$cancelAndCheckNumber$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, String str) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$msisdn = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCancelAndCheckNumberResponse oneCancelAndCheckNumberResponse) {
        invoke2(oneCancelAndCheckNumberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCancelAndCheckNumberResponse oneCancelAndCheckNumberResponse) {
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        OnePostpaidRepository onePostpaidRepository3;
        this.this$0.setReserveNumber(this.$msisdn);
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.getModel().setLastMsisdn(this.$msisdn);
        onePostpaidRepository2 = this.this$0.f94609b;
        onePostpaidRepository2.getModel().setLastMsisdnForSummary(null);
        onePostpaidRepository3 = this.this$0.f94609b;
        onePostpaidRepository3.getModel().setReserveInputNumberAllResponse(oneCancelAndCheckNumberResponse);
        this.this$0.m11738A2();
    }
}