package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.presenter.prepaid.OCRPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$validateProfileForOCR$3 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$validateProfileForOCR$3 extends Lambda implements Function1<OneChangeOwnerValidateProfileResponse, Unit> {
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$validateProfileForOCR$3(OneMnpViewModel oneMnpViewModel, String str) {
        super(1);
        this.this$0 = oneMnpViewModel;
        this.$idCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        invoke2(oneChangeOwnerValidateProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        Boolean bool;
        MutableLiveData m13553I1;
        String matCode;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.f92029F0 = oneChangeOwnerValidateProfileResponse;
        bool = this.this$0.f92041I0;
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            m13553I1 = this.this$0.m13553I1();
            m13553I1.setValue(Resource.Companion.success(null));
            return;
        }
        OneMnpViewModel oneMnpViewModel = this.this$0;
        CampaignItem selectedCampaign = oneMnpViewModel.getSelectedCampaign();
        String str = "";
        String str2 = (selectedCampaign == null || (str2 = selectedCampaign.getPrivilegeCode()) == null) ? "" : "";
        CampaignItem selectedCampaign2 = this.this$0.getSelectedCampaign();
        if (selectedCampaign2 != null && (matCode = selectedCampaign2.getMatCode()) != null) {
            str = matCode;
        }
        String str3 = this.$idCardNumber;
        String ocrBirthDate = this.this$0.getOcrBirthDate();
        if (ocrBirthDate == null) {
            ocrBirthDate = OCRPresenter.defaultDate;
        }
        oneMnpViewModel.m13427r0(str2, str, str3, ocrBirthDate);
    }
}