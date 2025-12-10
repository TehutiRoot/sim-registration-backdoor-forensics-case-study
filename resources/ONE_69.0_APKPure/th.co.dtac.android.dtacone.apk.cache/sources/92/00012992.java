package th.p047co.dtac.android.dtacone.view.appOne.activateSim.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModel$checkActivateSimTrueCompany$3 */
/* loaded from: classes10.dex */
public final class OneActivateSimViewModel$checkActivateSimTrueCompany$3 extends Lambda implements Function1<OneValidateSimTrueResponse, Unit> {
    final /* synthetic */ OneActivateSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneActivateSimViewModel$checkActivateSimTrueCompany$3(OneActivateSimViewModel oneActivateSimViewModel) {
        super(1);
        this.this$0 = oneActivateSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneValidateSimTrueResponse oneValidateSimTrueResponse) {
        invoke2(oneValidateSimTrueResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneValidateSimTrueResponse oneValidateSimTrueResponse) {
        MutableLiveData m16113m;
        String decryptAES256;
        PrepaidProfile prepaidProfile;
        String simCardNumber;
        String decryptAES2562;
        PrepaidProfile prepaidProfile2;
        String decryptAES2563;
        PrepaidProfile prepaidProfile3;
        String decryptAES2564;
        PrepaidProfile prepaidProfile4;
        OneActivateSimViewModel oneActivateSimViewModel = this.this$0;
        OneValidateSimTrueResponse.Data data = oneValidateSimTrueResponse.getData();
        PrepaidProfile prepaidProfile5 = data != null ? data.getPrepaidProfile() : null;
        String str = "";
        if (prepaidProfile5 != null) {
            OneValidateSimTrueResponse.Data data2 = oneValidateSimTrueResponse.getData();
            decryptAES2564 = oneActivateSimViewModel.decryptAES256((data2 == null || (prepaidProfile4 = data2.getPrepaidProfile()) == null || (r4 = prepaidProfile4.getMsisdn()) == null) ? "" : "");
            prepaidProfile5.setMsisdn(decryptAES2564);
        }
        OneValidateSimTrueResponse.Data data3 = oneValidateSimTrueResponse.getData();
        PrepaidProfile prepaidProfile6 = data3 != null ? data3.getPrepaidProfile() : null;
        if (prepaidProfile6 != null) {
            OneValidateSimTrueResponse.Data data4 = oneValidateSimTrueResponse.getData();
            decryptAES2563 = oneActivateSimViewModel.decryptAES256((data4 == null || (prepaidProfile3 = data4.getPrepaidProfile()) == null || (r4 = prepaidProfile3.getIdNumber()) == null) ? "" : "");
            prepaidProfile6.setIdNumber(decryptAES2563);
        }
        OneValidateSimTrueResponse.Data data5 = oneValidateSimTrueResponse.getData();
        PrepaidProfile prepaidProfile7 = data5 != null ? data5.getPrepaidProfile() : null;
        if (prepaidProfile7 != null) {
            OneValidateSimTrueResponse.Data data6 = oneValidateSimTrueResponse.getData();
            decryptAES2562 = oneActivateSimViewModel.decryptAES256((data6 == null || (prepaidProfile2 = data6.getPrepaidProfile()) == null || (r4 = prepaidProfile2.getIdNumberShow()) == null) ? "" : "");
            prepaidProfile7.setIdNumberShow(decryptAES2562);
        }
        OneValidateSimTrueResponse.Data data7 = oneValidateSimTrueResponse.getData();
        PrepaidProfile prepaidProfile8 = data7 != null ? data7.getPrepaidProfile() : null;
        if (prepaidProfile8 != null) {
            OneValidateSimTrueResponse.Data data8 = oneValidateSimTrueResponse.getData();
            if (data8 != null && (prepaidProfile = data8.getPrepaidProfile()) != null && (simCardNumber = prepaidProfile.getSimCardNumber()) != null) {
                str = simCardNumber;
            }
            decryptAES256 = oneActivateSimViewModel.decryptAES256(str);
            prepaidProfile8.setSimCardNumber(decryptAES256);
        }
        m16113m = this.this$0.m16113m();
        m16113m.setValue(Resource.Companion.success(oneValidateSimTrueResponse));
    }
}