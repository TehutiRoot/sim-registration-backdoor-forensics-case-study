package th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.buy_dol.OmisePublicKey;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolChargeV2Request;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneSaveBuyDolDirectAccountRequest;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolCardListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolChargeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolHistoryTransactionResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneSaveBuyDolDirectAccountResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u0018J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010&\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0006H\u0016¢\u0006\u0004\b-\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/repository/OneBuyDolRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/repository/OneBuyDolRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolCardListResponse;", "getCreditCardList", "()Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", "getBankAccountList", "", "accountCode", "cardToken", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "deleteCreditOrDebitCard", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/buy_dol/OmisePublicKey;", "getOmisePublicKey", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneBuyDolChargeV2Request;", "charge", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;", "chargeCreditCard", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneBuyDolChargeV2Request;)Lio/reactivex/Observable;", "transactionId", "getOnePaymentTransactionById", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "requestOtpBody", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "requestOneBuyDolOTP", "(Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "verifyOtpRequest", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "verifyOneBuyDolOTP", "(Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;)Lio/reactivex/Observable;", "request", "chargeBankAccount", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneSaveBuyDolDirectAccountResponse;", "saveOneBuyDolDirectAccount", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/request/OneSaveBuyDolDirectAccountRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolHistoryTransactionResponse;", "getOneBuyDolHistory", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneBuyDolRepositoryImpl implements OneBuyDolRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f88622a;

    @Inject
    public OneBuyDolRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f88622a = api;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneBuyDolChargeResponse> chargeBankAccount(@NotNull OneBuyDolChargeV2Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f88622a.chargeBankAccount(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneBuyDolChargeResponse> chargeCreditCard(@Nullable OneBuyDolChargeV2Request oneBuyDolChargeV2Request) {
        return this.f88622a.chargeCreditCard(oneBuyDolChargeV2Request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<StatusResponse> deleteCreditOrDebitCard(@Nullable String str, @Nullable String str2) {
        return this.f88622a.deleteCreditOrDebitCard(str, str2);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneBuyDolDirectAccountResponse> getBankAccountList() {
        return this.f88622a.getBankAccountList();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneBuyDolCardListResponse> getCreditCardList() {
        return this.f88622a.getCreditCardList();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OmisePublicKey> getOmisePublicKey() {
        return this.f88622a.getOmisePublicKey();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneBuyDolHistoryTransactionResponse> getOneBuyDolHistory() {
        return this.f88622a.getOneBuyDolHistory();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneBuyDolChargeResponse> getOnePaymentTransactionById(@Nullable String str) {
        return this.f88622a.getOnePaymentTransactionById(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<RequestOtpResponse> requestOneBuyDolOTP(@NotNull RequestOtpBody requestOtpBody) {
        Intrinsics.checkNotNullParameter(requestOtpBody, "requestOtpBody");
        return this.f88622a.requestOneBuyDolOtp(requestOtpBody);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<OneSaveBuyDolDirectAccountResponse> saveOneBuyDolDirectAccount(@NotNull OneSaveBuyDolDirectAccountRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f88622a.saveOneBuyDolDirectAccount(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository
    @NotNull
    public Observable<TokenCollection> verifyOneBuyDolOTP(@NotNull VerifyOtpRequest verifyOtpRequest) {
        Intrinsics.checkNotNullParameter(verifyOtpRequest, "verifyOtpRequest");
        return this.f88622a.verifyOneBuyDolOTP(verifyOtpRequest);
    }
}