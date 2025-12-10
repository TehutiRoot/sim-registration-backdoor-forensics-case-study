package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PostpaidValidateConsentViaAPIGWData;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$validateConsentViaAPIGW$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$validateConsentViaAPIGW$3 extends Lambda implements Function1<OnePostpaidValidateConsentViaAPIGWResponse, Unit> {
    final /* synthetic */ String $action;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$validateConsentViaAPIGW$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, String str) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$action = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidateConsentViaAPIGWResponse onePostpaidValidateConsentViaAPIGWResponse) {
        invoke2(onePostpaidValidateConsentViaAPIGWResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidateConsentViaAPIGWResponse onePostpaidValidateConsentViaAPIGWResponse) {
        OnePostpaidRepository onePostpaidRepository;
        this.this$0.setValidateConsentViaAPIGWResponse(onePostpaidValidateConsentViaAPIGWResponse.getData());
        onePostpaidRepository = this.this$0.f94609b;
        PostpaidValidateConsentViaAPIGWData data = onePostpaidValidateConsentViaAPIGWResponse.getData();
        onePostpaidRepository.setHasConsentTMN(data != null ? Intrinsics.areEqual(data.getConsentTMN(), Boolean.TRUE) : false);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        PostpaidValidateConsentViaAPIGWData data2 = onePostpaidValidateConsentViaAPIGWResponse.getData();
        if (data2 != null ? Intrinsics.areEqual(data2.getConsentFlag(), Boolean.TRUE) : false) {
            this.this$0.m11596i1(this.$action);
        } else {
            this.this$0.m11584k3();
        }
    }
}