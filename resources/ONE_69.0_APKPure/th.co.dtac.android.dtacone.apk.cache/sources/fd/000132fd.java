package th.p047co.dtac.android.dtacone.view.appOne.mnp.mockData;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.CustomerItem;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.Data;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.NumberItem;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m29142d2 = {"checkSIMInfo", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;", "mockValidateProfile", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.mockData.MockDataMNPKt */
/* loaded from: classes10.dex */
public final class MockDataMNPKt {
    @NotNull
    public static final MnpCheckSimInfoResponse checkSIMInfo() {
        return new MnpCheckSimInfoResponse("0", Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE, "520000000000000", "520000000000000", "520000000000000", "520000000000000", "520000000000000");
    }

    @NotNull
    public static final OneChangeOwnerValidateProfileResponse mockValidateProfile() {
        return new OneChangeOwnerValidateProfileResponse("", "200", "S", "18-02-2568 10:30", new Data(new CustomerItem("1", "2025-02-18T10:30:00", "Success", "1"), new NumberItem("0", null, "Success", "PASS", 2, null)), CollectionsKt__CollectionsKt.emptyList(), "");
    }
}