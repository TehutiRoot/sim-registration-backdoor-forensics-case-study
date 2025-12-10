package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.SimInfo;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$validateBarcodeTrue$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$validateBarcodeTrue$3 extends Lambda implements Function1<OneValidateSimTrueResponse, Unit> {
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$validateBarcodeTrue$3(OnePrepaidViewModel onePrepaidViewModel) {
        super(1);
        this.this$0 = onePrepaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneValidateSimTrueResponse oneValidateSimTrueResponse) {
        invoke2(oneValidateSimTrueResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneValidateSimTrueResponse oneValidateSimTrueResponse) {
        OnePrepaidRepository onePrepaidRepository;
        OnePrepaidRepository onePrepaidRepository2;
        OnePrepaidRepository onePrepaidRepository3;
        OnePrepaidRepository onePrepaidRepository4;
        OnePrepaidRepository onePrepaidRepository5;
        SimInfo simInfo;
        PrepaidProfile prepaidProfile;
        PrepaidProfile prepaidProfile2;
        onePrepaidRepository = this.this$0.f95986b;
        OnePrepaidViewModel onePrepaidViewModel = this.this$0;
        onePrepaidRepository.setValidateSimTrueResponse(oneValidateSimTrueResponse);
        onePrepaidRepository2 = onePrepaidViewModel.f95986b;
        OneValidateSimTrueResponse.Data data = oneValidateSimTrueResponse.getData();
        onePrepaidRepository.setDisplaySubscriberNumber(PhoneNumberExtKt.toPretty(onePrepaidRepository2.decryptCBC((data == null || (prepaidProfile2 = data.getPrepaidProfile()) == null || (r2 = prepaidProfile2.getMsisdn()) == null) ? "" : "")));
        OneValidateSimTrueResponse.Data data2 = oneValidateSimTrueResponse.getData();
        onePrepaidRepository.setReRegisterFlag((data2 == null || (prepaidProfile = data2.getPrepaidProfile()) == null) ? false : prepaidProfile.getReRegisterFlag());
        onePrepaidRepository3 = this.this$0.f95986b;
        OnePrepaidAuthorizationResponse.Data getAuthorization = onePrepaidRepository3.getGetAuthorization();
        if (getAuthorization != null ? Intrinsics.areEqual(getAuthorization.getCampaignFlag(), Boolean.TRUE) : false) {
            OneValidateSimTrueResponse.Data data3 = oneValidateSimTrueResponse.getData();
            if (((data3 == null || (simInfo = data3.getSimInfo()) == null) ? null : simInfo.getItemId()) != null && !Intrinsics.areEqual(oneValidateSimTrueResponse.getData().getSimInfo().getItemId(), "")) {
                this.this$0.m10558b0(oneValidateSimTrueResponse.getData().getSimInfo().getItemId().toString(), "PREPAID_REGISTER");
                onePrepaidRepository5 = this.this$0.f95986b;
                onePrepaidRepository5.setItemId(oneValidateSimTrueResponse.getData().getSimInfo().getItemId());
                return;
            }
        }
        this.this$0.f96010z = 0;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        onePrepaidRepository4 = this.this$0.f95986b;
        onePrepaidRepository4.setItemId("");
        this.this$0.setCampaignFlag(Boolean.FALSE);
        this.this$0.navigateNext();
    }
}