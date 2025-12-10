package th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.permission_activation.MrtrPermissionActivationRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.permission_activation.MrtrPermissionActivationResponse;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.OneActivateSimErrorModel;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckActivateSimRequest;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckActivateSimTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckSimActivateSimRequest;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckSimActivateSimTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.response.OneActivateSimResponse;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.response.OneActivateSimScanResponse;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.response.OneActivateSimTrueCompanyResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\u0010\r\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00102\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R(\u00105\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.¨\u00066"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/activateSim/repository/OneActivateSimRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/repository/OneActivateSimRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckSimActivateSimRequest;", "checkSimActivationRequest", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimScanResponse;", "oneCheckSimActivation", "(Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckSimActivateSimRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckSimActivateSimTrueCompanyRequest;", "request", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OneValidateSimTrueResponse;", "oneCheckSimActivationTrueCompany", "(Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckSimActivateSimTrueCompanyRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationRequest;", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationResponse;", "getOnePrepaidPermission", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest;", "checkSimActivationResponse", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimResponse;", "activateOneSim", "(Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimTrueCompanyRequest;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimTrueCompanyResponse;", "activateOneSimTrueCompany", "(Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimTrueCompanyRequest;)Lio/reactivex/Observable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/OneActivateSimErrorModel;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/OneActivateSimErrorModel;", "getModel", "()Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/OneActivateSimErrorModel;", "setModel", "(Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/OneActivateSimErrorModel;)V", "model", "", "value", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorCode", "getErrorTime", "setErrorTime", "errorTime", "getEncCryptCardId", "setEncCryptCardId", "encCryptCardId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneActivateSimRepositoryImpl implements OneActivateSimRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f88234a;

    /* renamed from: b */
    public OneActivateSimErrorModel f88235b;

    @Inject
    public OneActivateSimRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f88234a = api;
        this.f88235b = new OneActivateSimErrorModel(null, null, null, 7, null);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @NotNull
    public Observable<OneActivateSimResponse> activateOneSim(@Nullable OneCheckActivateSimRequest oneCheckActivateSimRequest) {
        return this.f88234a.activateOneSimDtacCompany(oneCheckActivateSimRequest);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @NotNull
    public Observable<OneActivateSimTrueCompanyResponse> activateOneSimTrueCompany(@Nullable OneCheckActivateSimTrueCompanyRequest oneCheckActivateSimTrueCompanyRequest) {
        return this.f88234a.activateOneSimTrueCompany(oneCheckActivateSimTrueCompanyRequest);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @Nullable
    public String getEncCryptCardId() {
        return this.f88235b.getEncrptyCardId();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @Nullable
    public String getErrorCode() {
        return this.f88235b.getErrorCode();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @Nullable
    public String getErrorTime() {
        return this.f88235b.getErrorTime();
    }

    @NotNull
    public final OneActivateSimErrorModel getModel() {
        return this.f88235b;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @NotNull
    public Single<MrtrPermissionActivationResponse> getOnePrepaidPermission(@NotNull MrtrPermissionActivationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f88234a.getOnePrepaidPermission(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @NotNull
    public Observable<OneActivateSimScanResponse> oneCheckSimActivation(@NotNull OneCheckSimActivateSimRequest checkSimActivationRequest) {
        Intrinsics.checkNotNullParameter(checkSimActivationRequest, "checkSimActivationRequest");
        return this.f88234a.oneCheckSimActivationDtacCompany(checkSimActivationRequest);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    @NotNull
    public Observable<OneValidateSimTrueResponse> oneCheckSimActivationTrueCompany(@NotNull OneCheckSimActivateSimTrueCompanyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f88234a.oneCheckSimActivationTrueCompany(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    public void setEncCryptCardId(@Nullable String str) {
        this.f88235b.setEncrptyCardId(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    public void setErrorCode(@Nullable String str) {
        this.f88235b.setErrorCode(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository
    public void setErrorTime(@Nullable String str) {
        this.f88235b.setErrorTime(str);
    }

    public final void setModel(@NotNull OneActivateSimErrorModel oneActivateSimErrorModel) {
        Intrinsics.checkNotNullParameter(oneActivateSimErrorModel, "<set-?>");
        this.f88235b = oneActivateSimErrorModel;
    }
}