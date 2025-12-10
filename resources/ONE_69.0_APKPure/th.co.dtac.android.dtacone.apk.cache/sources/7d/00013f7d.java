package th.p047co.dtac.android.dtacone.view.appOne.staff.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.ListStaffResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.clearSoldAmount.OneStaffClearSoldAmountRequest;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.clearSoldAmount.OneStaffClearSoldAmountResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.creditLimit.OneStaffUpdateCreditLimitRequest;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.creditLimit.OneStaffUpdateCreditLimitResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.permission.OneStaffUpdatePermissionRequest;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.permission.OneStaffUpdatePermissionResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.register.OneStaffRegisterRequest;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.register.OneStaffRegisterResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.updateProfile.StaffDetailUpdateReqeust;
import th.p047co.dtac.android.dtacone.view.appOne.staff.repository.model.OneStaffModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0015\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000e2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b.\u0010*J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u0010?\u001a\u0004\u0018\u00010\t2\b\u0010:\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010E\u001a\u0004\u0018\u00010@2\b\u0010:\u001a\u0004\u0018\u00010@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/repository/OneStaffRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/staff/repository/OneStaffRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;)V", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/ListStaffResponse;", "oneGetListStaff", "()Lio/reactivex/Observable;", "", "staffId", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/OneStaffDetailResponse;", "getStaffDetail", "(Ljava/lang/String;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "deleteStaff", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/updateProfile/StaffDetailUpdateReqeust;", "request", "updateStaffDetailName", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/updateProfile/StaffDetailUpdateReqeust;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/register/OneStaffRegisterRequest;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/register/OneStaffRegisterResponse;", "registerStaff", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/register/OneStaffRegisterRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/creditLimit/OneStaffUpdateCreditLimitRequest;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/creditLimit/OneStaffUpdateCreditLimitResponse;", "updateCreditLimitStaff", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/creditLimit/OneStaffUpdateCreditLimitRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/clearSoldAmount/OneStaffClearSoldAmountRequest;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/clearSoldAmount/OneStaffClearSoldAmountResponse;", "clearCreditLimitStaff", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/clearSoldAmount/OneStaffClearSoldAmountRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/permission/OneStaffUpdatePermissionRequest;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/permission/OneStaffUpdatePermissionResponse;", "updatePermissionStaff", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/permission/OneStaffUpdatePermissionRequest;)Lio/reactivex/Single;", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "data", "encryptPhoneNumberString", "", "clear", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "Lth/co/dtac/android/dtacone/view/appOne/staff/repository/model/OneStaffModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/staff/repository/model/OneStaffModel;", "model", "value", "getListStaffResp", "()Lth/co/dtac/android/dtacone/view/appOne/staff/model/ListStaffResponse;", "setListStaffResp", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/ListStaffResponse;)V", "listStaffResp", "Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;", "getAddNewStaffData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;", "setAddNewStaffData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;)V", "addNewStaffData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneStaffRepositoryImpl implements OneStaffRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f97461a;

    /* renamed from: b */
    public final ConfigurationRepository f97462b;

    /* renamed from: c */
    public OneStaffModel f97463c;

    @Inject
    public OneStaffRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f97461a = api;
        this.f97462b = configurationRepository;
        this.f97463c = new OneStaffModel(null, null, 3, null);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    public void clear() {
        this.f97463c = new OneStaffModel(null, null, 3, null);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneStaffClearSoldAmountResponse> clearCreditLimitStaff(@NotNull OneStaffClearSoldAmountRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97461a.clearCreditLimitStaff(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f97462b.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneCommonResponse> deleteStaff(@NotNull String staffId) {
        Intrinsics.checkNotNullParameter(staffId, "staffId");
        return this.f97461a.deleteStaff(staffId);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f97462b.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public String encryptPhoneNumberString(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
            Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(data)");
            return AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f97462b.dataPrivacyEncryptionAES256CBCKey());
        }
        return "";
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @Nullable
    public OneAddNewStaff getAddNewStaffData() {
        return this.f97463c.getAddNewStaffData();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @Nullable
    public ListStaffResponse getListStaffResp() {
        return this.f97463c.getListStaffResp();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneStaffDetailResponse> getStaffDetail(@NotNull String staffId) {
        Intrinsics.checkNotNullParameter(staffId, "staffId");
        return this.f97461a.getStaffDetail(staffId);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Observable<ListStaffResponse> oneGetListStaff() {
        return this.f97461a.oneGetListStaff();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneStaffRegisterResponse> registerStaff(@NotNull OneStaffRegisterRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97461a.registerStaff(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    public void setAddNewStaffData(@Nullable OneAddNewStaff oneAddNewStaff) {
        this.f97463c.setAddNewStaffData(oneAddNewStaff);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    public void setListStaffResp(@Nullable ListStaffResponse listStaffResponse) {
        this.f97463c.setListStaffResp(listStaffResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneStaffUpdateCreditLimitResponse> updateCreditLimitStaff(@NotNull OneStaffUpdateCreditLimitRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97461a.updateCreditLimitStaff(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneStaffUpdatePermissionResponse> updatePermissionStaff(@NotNull OneStaffUpdatePermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97461a.updatePermissionStaff(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository
    @NotNull
    public Single<OneCommonResponse> updateStaffDetailName(@NotNull StaffDetailUpdateReqeust request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97461a.updateStaffDetailName(request);
    }
}