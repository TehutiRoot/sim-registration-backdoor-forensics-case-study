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
import th.p047co.dtac.android.dtacone.model.profile.GetProfileResponse;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.UserType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$retryLoginMrtr$7 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$retryLoginMrtr$7 extends Lambda implements Function1<GetProfileResponse, Unit> {
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$retryLoginMrtr$7(GetProfileViewModel getProfileViewModel) {
        super(1);
        this.this$0 = getProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetProfileResponse getProfileResponse) {
        invoke2(getProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetProfileResponse it) {
        PreferencesRepository preferencesRepository;
        PreferencesRepository preferencesRepository2;
        PreferencesRepository preferencesRepository3;
        MutableLiveData m2495x;
        MutableLiveData m2494y;
        LoginRepository loginRepository;
        preferencesRepository = this.this$0.f106080c;
        boolean z = true;
        preferencesRepository.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_REDEMPTION, true);
        preferencesRepository2 = this.this$0.f106080c;
        preferencesRepository2.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_COUNT, true);
        preferencesRepository3 = this.this$0.f106080c;
        preferencesRepository3.setBoolean(Constant.CAMPAIGN_REDEMPTION_BACK_TO_HOME, false);
        String rtrCode = it.getRtrCode();
        if (rtrCode != null && rtrCode.length() != 0) {
            z = false;
        }
        if (Intrinsics.areEqual(it.getUserType(), UserType.STAFF) & z) {
            loginRepository = this.this$0.f106079b;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            loginRepository.storeGetProfileResponse(it);
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        } else {
            this.this$0.m2504o();
        }
        m2495x = this.this$0.m2495x();
        Resource.Companion companion = Resource.Companion;
        m2495x.setValue(companion.success(it.getUserName()));
        m2494y = this.this$0.m2494y();
        m2494y.setValue(companion.success(Boolean.FALSE));
    }
}