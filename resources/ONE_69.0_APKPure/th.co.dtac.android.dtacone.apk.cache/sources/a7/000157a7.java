package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Company;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Data;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.UserType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$oneRetryLogin$6 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$oneRetryLogin$6 extends Lambda implements Function1<OneGetProfileResponse, Unit> {
    final /* synthetic */ String $userName;
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$oneRetryLogin$6(GetProfileViewModel getProfileViewModel, String str) {
        super(1);
        this.this$0 = getProfileViewModel;
        this.$userName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetProfileResponse oneGetProfileResponse) {
        invoke2(oneGetProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetProfileResponse oneGetProfileResponse) {
        MutableLiveData m2495x;
        RtrRx2Repository rtrRx2Repository;
        PreferencesRepository preferencesRepository;
        MutableLiveData m2494y;
        PreferencesRepository preferencesRepository2;
        MutableLiveData m2494y2;
        PreferencesRepository preferencesRepository3;
        PreferencesRepository preferencesRepository4;
        PreferencesRepository preferencesRepository5;
        LoginRepository loginRepository;
        Data data = oneGetProfileResponse.getData();
        if (data != null) {
            GetProfileViewModel getProfileViewModel = this.this$0;
            preferencesRepository3 = getProfileViewModel.f106080c;
            preferencesRepository3.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_REDEMPTION, true);
            preferencesRepository4 = getProfileViewModel.f106080c;
            preferencesRepository4.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_COUNT, true);
            preferencesRepository5 = getProfileViewModel.f106080c;
            preferencesRepository5.setBoolean(Constant.CAMPAIGN_REDEMPTION_BACK_TO_HOME, false);
            Company dtacCompany = data.getDtacCompany();
            String rtrCode = dtacCompany != null ? dtacCompany.getRtrCode() : null;
            boolean z = rtrCode == null || rtrCode.length() == 0;
            Company trueCompany = data.getTrueCompany();
            String rtrCode2 = trueCompany != null ? trueCompany.getRtrCode() : null;
            if (z & (rtrCode2 == null || rtrCode2.length() == 0) & Intrinsics.areEqual(data.getUserType(), UserType.STAFF)) {
                loginRepository = getProfileViewModel.f106079b;
                loginRepository.setOneGetProfileResponse(oneGetProfileResponse);
                getProfileViewModel.getLiveDataState().setValue(StatusResource.DISMISS);
            } else {
                getProfileViewModel.m2520P(data);
            }
        }
        m2495x = this.this$0.m2495x();
        Resource.Companion companion = Resource.Companion;
        m2495x.setValue(companion.success(this.$userName));
        rtrRx2Repository = this.this$0.f106085h;
        if (Intrinsics.areEqual(rtrRx2Repository.getSessionNow().getToken().getUserType(), UserType.PROMOTER)) {
            preferencesRepository2 = this.this$0.f106080c;
            preferencesRepository2.setBoolean(Constant.REGISTER_LEVEL_PROMOTER, true);
            m2494y2 = this.this$0.m2494y();
            m2494y2.setValue(companion.success(Boolean.TRUE));
            return;
        }
        preferencesRepository = this.this$0.f106080c;
        preferencesRepository.setBoolean(Constant.REGISTER_LEVEL_PROMOTER, false);
        m2494y = this.this$0.m2494y();
        m2494y.setValue(companion.success(Boolean.TRUE));
    }
}