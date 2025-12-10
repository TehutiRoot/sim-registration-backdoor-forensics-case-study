package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.PostpaidValidateConsentViaAPIGWData;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$validateConsent$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$validateConsent$3 extends Lambda implements Function1<OnePostpaidValidateConsentViaAPIGWResponse, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$validateConsent$3(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidateConsentViaAPIGWResponse onePostpaidValidateConsentViaAPIGWResponse) {
        invoke2(onePostpaidValidateConsentViaAPIGWResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidateConsentViaAPIGWResponse onePostpaidValidateConsentViaAPIGWResponse) {
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository;
        oneDeviceSaleTrueRepository = this.this$0.f90027b;
        oneDeviceSaleTrueRepository.getDeviceSaleModel().setValidateConsentResponse(onePostpaidValidateConsentViaAPIGWResponse.getData());
        PostpaidValidateConsentViaAPIGWData data = onePostpaidValidateConsentViaAPIGWResponse.getData();
        if ((data != null ? Intrinsics.areEqual(data.getConsentFlag(), Boolean.TRUE) : false) && Intrinsics.areEqual(onePostpaidValidateConsentViaAPIGWResponse.getData().getCustomerScreening(), OneDeviceSaleTrueViewModel.BL2OPER)) {
            this.this$0.m14837f0();
            return;
        }
        PostpaidValidateConsentViaAPIGWData data2 = onePostpaidValidateConsentViaAPIGWResponse.getData();
        if ((data2 != null ? Intrinsics.areEqual(data2.getConsentFlag(), Boolean.FALSE) : false) && Intrinsics.areEqual(onePostpaidValidateConsentViaAPIGWResponse.getData().getCustomerScreening(), "4DSCORE")) {
            this.this$0.m14845c1();
            return;
        }
        PostpaidValidateConsentViaAPIGWData data3 = onePostpaidValidateConsentViaAPIGWResponse.getData();
        if (data3 != null ? Intrinsics.areEqual(data3.getConsentFlag(), Boolean.TRUE) : false) {
            this.this$0.m14837f0();
        } else {
            this.this$0.m14845c1();
        }
    }
}