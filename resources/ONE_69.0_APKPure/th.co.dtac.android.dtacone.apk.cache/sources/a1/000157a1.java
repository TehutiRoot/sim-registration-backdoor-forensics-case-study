package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Company;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Data;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.UserType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$oneGetUserProfileApp$3 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$oneGetUserProfileApp$3 extends Lambda implements Function1<OneGetProfileResponse, Unit> {
    final /* synthetic */ boolean $isLogin;
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$oneGetUserProfileApp$3(GetProfileViewModel getProfileViewModel, boolean z) {
        super(1);
        this.this$0 = getProfileViewModel;
        this.$isLogin = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetProfileResponse oneGetProfileResponse) {
        invoke2(oneGetProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetProfileResponse oneGetProfileResponse) {
        PreferencesRepository preferencesRepository;
        LoginRepository loginRepository;
        MutableLiveData m2493z;
        PreferencesRepository preferencesRepository2;
        Data data = oneGetProfileResponse.getData();
        if (data != null) {
            GetProfileViewModel getProfileViewModel = this.this$0;
            boolean z = this.$isLogin;
            boolean z2 = false;
            if (Intrinsics.areEqual(data.getUserType(), UserType.PROMOTER)) {
                preferencesRepository2 = getProfileViewModel.f106080c;
                preferencesRepository2.setBoolean(Constant.REGISTER_LEVEL_PROMOTER, true);
            } else {
                preferencesRepository = getProfileViewModel.f106080c;
                preferencesRepository.setBoolean(Constant.REGISTER_LEVEL_PROMOTER, false);
            }
            Company dtacCompany = data.getDtacCompany();
            String rtrCode = dtacCompany != null ? dtacCompany.getRtrCode() : null;
            boolean z3 = rtrCode == null || rtrCode.length() == 0;
            Company trueCompany = data.getTrueCompany();
            String rtrCode2 = trueCompany != null ? trueCompany.getRtrCode() : null;
            if (!(z3 & ((rtrCode2 == null || rtrCode2.length() == 0) ? true : true)) || !Intrinsics.areEqual(data.getUserType(), UserType.STAFF)) {
                if (z) {
                    getProfileViewModel.m2521O(data);
                    return;
                } else {
                    getProfileViewModel.m2520P(data);
                    return;
                }
            }
            loginRepository = getProfileViewModel.f106079b;
            loginRepository.setOneGetProfileResponse(oneGetProfileResponse);
            getProfileViewModel.getLiveDataState().setValue(StatusResource.DISMISS);
            m2493z = getProfileViewModel.m2493z();
            m2493z.setValue(Resource.Companion.success(null));
        }
    }
}