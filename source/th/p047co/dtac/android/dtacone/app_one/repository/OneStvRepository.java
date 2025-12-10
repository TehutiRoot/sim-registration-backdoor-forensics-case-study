package th.p047co.dtac.android.dtacone.app_one.repository;

import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesRequest;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvGroupListCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageRequest;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResp;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvSubmitCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvSubmitTrueRequest;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneSubmitProsermRecommendReq;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneSubmitSTVProsermResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneTrueRecommendPackageAdditionalResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.SimRCollectionResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.UpdateInterestRecommendRequest;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@Metadata(m28851d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020-H&J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0010H&J\u0010\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010H&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303H&J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002050(2\u0006\u0010*\u001a\u000206H&J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002080(2\u0006\u0010*\u001a\u000209H&J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001403H&J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020<032\u0006\u0010*\u001a\u00020=H&J\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020?032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010H&J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020A032\u0006\u0010*\u001a\u00020BH&J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020D032\u0006\u0010*\u001a\u00020BH&J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020F0(2\u0006\u0010*\u001a\u00020GH&J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020F0(2\u0006\u0010*\u001a\u00020IH&J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020F0(2\u0006\u0010*\u001a\u00020KH&J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020M0(2\u0006\u0010N\u001a\u00020\u0010H&J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020P032\u0006\u0010*\u001a\u00020QH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b¨\u0006R"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", "", "getBalanceResponse", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "getGetBalanceResponse", "()Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "setGetBalanceResponse", "(Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;)V", "packageResp", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "getPackageResp", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "setPackageResp", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;)V", "permissions", "", "", "getPermissions", "()Ljava/util/List;", "simRCollection", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "getSimRCollection", "()Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "setSimRCollection", "(Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;)V", "simRNumberDisplay", "getSimRNumberDisplay", "()Ljava/lang/String;", "subscriberGroup", "getSubscriberGroup", "setSubscriberGroup", "(Ljava/lang/String;)V", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "getSubscriberNumber", "setSubscriberNumber", "togglePrepaidEnable", "getTogglePrepaidEnable", "userCode", "getUserCode", "checkSubscriberPrepaid", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberRequest;", "clearModel", "", "decryptCBC", "cipher", "encryptCBC", TextBundle.TEXT_ENTRY, "getBalance", "Lio/reactivex/Observable;", "getMainBalance", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceResponse;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceRequest;", "getMainBalanceTrueCompany", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyResponse;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyRequest;", "getSimRList", "oneCurrentPackages", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesRequest;", "oneGetSTVPackages", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupListCollection;", "oneGetSTVRecommendPackages", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResponse;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageRequest;", "oneGetTrueRecommendPackagesAdditional", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneTrueRecommendPackageAdditionalResponse;", "oneProsermRecommend", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitSTVProsermResponse;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;", "oneStvSubmit", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitCollection;", "oneStvSubmitTrue", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;", "queryTransaction", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse;", "trackingID", "updateInterestRecommendForTrue", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "Lth/co/dtac/android/dtacone/app_one/model/stv/UpdateInterestRecommendRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneStvRepository */
/* loaded from: classes7.dex */
public interface OneStvRepository {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneStvRepository$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Observable oneGetSTVPackages$default(OneStvRepository oneStvRepository, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return oneStvRepository.oneGetSTVPackages(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oneGetSTVPackages");
        }
    }

    @NotNull
    Single<OneTopUpCheckSubscriberResponse> checkSubscriberPrepaid(@NotNull OneTopUpCheckSubscriberRequest oneTopUpCheckSubscriberRequest);

    void clearModel();

    @NotNull
    String decryptCBC(@NotNull String str);

    @NotNull
    String encryptCBC(@NotNull String str);

    @NotNull
    Observable<BalanceResponse> getBalance();

    @Nullable
    BalanceResponse getGetBalanceResponse();

    @NotNull
    Single<OneTopUpGetMainBalanceResponse> getMainBalance(@NotNull OneTopUpGetMainBalanceRequest oneTopUpGetMainBalanceRequest);

    @NotNull
    Single<OneTopUpGetMainBalanceTrueCompanyResponse> getMainBalanceTrueCompany(@NotNull OneTopUpGetMainBalanceTrueCompanyRequest oneTopUpGetMainBalanceTrueCompanyRequest);

    @Nullable
    OneStvRecommendPackageResp getPackageResp();

    @NotNull
    List<String> getPermissions();

    @Nullable
    SimRCollectionResponse getSimRCollection();

    @NotNull
    Observable<SimRCollectionResponse> getSimRList();

    @NotNull
    String getSimRNumberDisplay();

    @Nullable
    String getSubscriberGroup();

    @Nullable
    String getSubscriberNumber();

    @Nullable
    String getTogglePrepaidEnable();

    @Nullable
    String getUserCode();

    @NotNull
    Observable<OneCurrentPackagesResponse> oneCurrentPackages(@NotNull OneCurrentPackagesRequest oneCurrentPackagesRequest);

    @NotNull
    Observable<OneStvGroupListCollection> oneGetSTVPackages(@Nullable String str);

    @NotNull
    Observable<OneStvRecommendPackageResponse> oneGetSTVRecommendPackages(@NotNull OneStvRecommendPackageRequest oneStvRecommendPackageRequest);

    @NotNull
    Observable<OneTrueRecommendPackageAdditionalResponse> oneGetTrueRecommendPackagesAdditional(@NotNull OneStvRecommendPackageRequest oneStvRecommendPackageRequest);

    @NotNull
    Single<OneSubmitSTVProsermResponse> oneProsermRecommend(@NotNull OneSubmitProsermRecommendReq oneSubmitProsermRecommendReq);

    @NotNull
    Single<OneSubmitSTVProsermResponse> oneStvSubmit(@NotNull OneStvSubmitCollection oneStvSubmitCollection);

    @NotNull
    Single<OneSubmitSTVProsermResponse> oneStvSubmitTrue(@NotNull OneStvSubmitTrueRequest oneStvSubmitTrueRequest);

    @NotNull
    Single<QueryTransactionResponse> queryTransaction(@NotNull String str);

    void setGetBalanceResponse(@Nullable BalanceResponse balanceResponse);

    void setPackageResp(@Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp);

    void setSimRCollection(@Nullable SimRCollectionResponse simRCollectionResponse);

    void setSubscriberGroup(@Nullable String str);

    void setSubscriberNumber(@Nullable String str);

    @NotNull
    Observable<OneCommonResponse> updateInterestRecommendForTrue(@NotNull UpdateInterestRecommendRequest updateInterestRecommendRequest);
}
