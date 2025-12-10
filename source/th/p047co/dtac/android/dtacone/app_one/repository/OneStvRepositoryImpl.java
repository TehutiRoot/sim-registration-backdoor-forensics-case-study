package th.p047co.dtac.android.dtacone.app_one.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
import th.p047co.dtac.android.dtacone.app_one.model.stv.StvProsermOnline;
import th.p047co.dtac.android.dtacone.app_one.model.stv.UpdateInterestRecommendRequest;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepositoryImpl;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\u0006\u0010\u0018\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0018\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0018\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0#2\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0018\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020\f2\u0006\u0010\u0018\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0012H\u0016¢\u0006\u0004\b9\u00107J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;0#2\u0006\u0010\u0018\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0#2\u0006\u0010\u0018\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0#2\u0006\u0010\u0018\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR8\u0010^\u001a&\u0012\f\u0012\n Z*\u0004\u0018\u00010\u00120\u0012 Z*\u0012\u0012\f\u0012\n Z*\u0004\u0018\u00010\u00120\u0012\u0018\u00010[0Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001c\u0010c\u001a\n Z*\u0004\u0018\u00010\u00120\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`R(\u0010j\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR(\u0010n\u001a\u0004\u0018\u00010\u00122\b\u0010e\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010`\"\u0004\bl\u0010mR(\u0010s\u001a\u0004\u0018\u00010\r2\b\u0010e\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR(\u0010x\u001a\u0004\u0018\u00010\u00102\b\u0010e\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010e\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010`\"\u0004\bz\u0010mR\u0014\u0010|\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010`¨\u0006}"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepositoryImpl;", "Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "getBalance", "()Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "getSimRList", "", "subscriberGroup", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupListCollection;", "oneGetSTVPackages", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageRequest;", "request", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResponse;", "oneGetSTVRecommendPackages", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneTrueRecommendPackageAdditionalResponse;", "oneGetTrueRecommendPackagesAdditional", "Lth/co/dtac/android/dtacone/app_one/model/stv/UpdateInterestRecommendRequest;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "updateInterestRecommendForTrue", "(Lth/co/dtac/android/dtacone/app_one/model/stv/UpdateInterestRecommendRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitCollection;", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitSTVProsermResponse;", "oneStvSubmit", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitCollection;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;", "oneStvSubmitTrue", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;)Lio/reactivex/Single;", "trackingID", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse;", "queryTransaction", "(Ljava/lang/String;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;", "oneProsermRecommend", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesRequest;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse;", "oneCurrentPackages", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesRequest;)Lio/reactivex/Observable;", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberResponse;", "checkSubscriberPrepaid", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceResponse;", "getMainBalance", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyResponse;", "getMainBalanceTrueCompany", "(Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyRequest;)Lio/reactivex/Single;", "", "clearModel", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lth/co/dtac/android/dtacone/app_one/model/stv/StvProsermOnline;", "e", "Lth/co/dtac/android/dtacone/app_one/model/stv/StvProsermOnline;", "getModel", "()Lth/co/dtac/android/dtacone/app_one/model/stv/StvProsermOnline;", "setModel", "(Lth/co/dtac/android/dtacone/app_one/model/stv/StvProsermOnline;)V", "model", "", "kotlin.jvm.PlatformType", "", "getPermissions", "()Ljava/util/List;", "permissions", "getTogglePrepaidEnable", "()Ljava/lang/String;", "togglePrepaidEnable", "getUserCode", "userCode", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "value", "getPackageResp", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "setPackageResp", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;)V", "packageResp", "getSubscriberNumber", "setSubscriberNumber", "(Ljava/lang/String;)V", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "getGetBalanceResponse", "()Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "setGetBalanceResponse", "(Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;)V", "getBalanceResponse", "getSimRCollection", "()Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "setSimRCollection", "(Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;)V", "simRCollection", "getSubscriberGroup", "setSubscriberGroup", "getSimRNumberDisplay", "simRNumberDisplay", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneStvRepositoryImpl */
/* loaded from: classes7.dex */
public final class OneStvRepositoryImpl implements OneStvRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f82363a;

    /* renamed from: b */
    public final RtrRx2Repository f82364b;

    /* renamed from: c */
    public final ConfigurationRepository f82365c;

    /* renamed from: d */
    public PreferencesViewModel f82366d;

    /* renamed from: e */
    public StvProsermOnline f82367e;

    @Inject
    public OneStvRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f82363a = api;
        this.f82364b = rtrRx2Repository;
        this.f82365c = configurationRepository;
        this.f82366d = pfViewModel;
        this.f82367e = new StvProsermOnline(null, null, null, null, null, 31, null);
    }

    /* renamed from: a */
    public static /* synthetic */ BalanceResponse m20090a(Function1 function1, Object obj) {
        return m20089b(function1, obj);
    }

    /* renamed from: b */
    public static final BalanceResponse m20089b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BalanceResponse) tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<OneTopUpCheckSubscriberResponse> checkSubscriberPrepaid(@NotNull OneTopUpCheckSubscriberRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.checkSubscriberPrepaid(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public void clearModel() {
        this.f82367e = new StvProsermOnline(null, null, null, null, null, 31, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f82365c.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f82365c.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<BalanceResponse> getBalance() {
        Observable<BalanceResponse> oneGetBalance = this.f82363a.oneGetBalance(this.f82366d.getSuffixApi());
        final OneStvRepositoryImpl$getBalance$1 oneStvRepositoryImpl$getBalance$1 = new OneStvRepositoryImpl$getBalance$1(this);
        Observable map = oneGetBalance.map(new Function() { // from class: ne1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneStvRepositoryImpl.m20090a(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun getBalance(…nse = it\n        it\n    }");
        return map;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @Nullable
    public BalanceResponse getGetBalanceResponse() {
        return this.f82367e.getGetBalanceResponse();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<OneTopUpGetMainBalanceResponse> getMainBalance(@NotNull OneTopUpGetMainBalanceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.getMainBalance(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<OneTopUpGetMainBalanceTrueCompanyResponse> getMainBalanceTrueCompany(@NotNull OneTopUpGetMainBalanceTrueCompanyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.getMainBalanceTrueCompany(request);
    }

    @NotNull
    public final StvProsermOnline getModel() {
        return this.f82367e;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @Nullable
    public OneStvRecommendPackageResp getPackageResp() {
        return this.f82367e.getPackageResp();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public List<String> getPermissions() {
        return this.f82364b.getSessionNow().getPermissions();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @Nullable
    public SimRCollectionResponse getSimRCollection() {
        return this.f82367e.getSimRCollection();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<SimRCollectionResponse> getSimRList() {
        return this.f82363a.oneGetSimRList();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public String getSimRNumberDisplay() {
        String simR = this.f82364b.getSessionNow().getToken().getSimR();
        Intrinsics.checkNotNullExpressionValue(simR, "rtrRx2Repository.sessionNow.token.simR");
        return PhoneNumberExtKt.toPretty(simR);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @Nullable
    public String getSubscriberGroup() {
        return this.f82367e.getSubscriberGroup();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @Nullable
    public String getSubscriberNumber() {
        return this.f82367e.getSubscriberNumber();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public String getTogglePrepaidEnable() {
        return this.f82365c.togglePrepaidEnable();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public String getUserCode() {
        return this.f82364b.getUserSession().getUserCode();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<OneCurrentPackagesResponse> oneCurrentPackages(@NotNull OneCurrentPackagesRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneCurrentPackages(this.f82366d.getSuffixApi(), request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<OneStvGroupListCollection> oneGetSTVPackages(@Nullable String str) {
        return this.f82363a.oneGetPackages(this.f82366d.getSuffixApi(), str);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<OneStvRecommendPackageResponse> oneGetSTVRecommendPackages(@NotNull OneStvRecommendPackageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneGetSTVRecommendPackages(this.f82366d.getSuffixApi(), request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<OneTrueRecommendPackageAdditionalResponse> oneGetTrueRecommendPackagesAdditional(@NotNull OneStvRecommendPackageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneGetTrueRecommendPackagesAdditional(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<OneSubmitSTVProsermResponse> oneProsermRecommend(@NotNull OneSubmitProsermRecommendReq request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneProsermRecommend(this.f82366d.getSuffixApi(), request.getSubscriberNumber(), request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<OneSubmitSTVProsermResponse> oneStvSubmit(@NotNull OneStvSubmitCollection request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneStvSubmit(this.f82366d.getSuffixApi(), request.getSubscriberNumber(), request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<OneSubmitSTVProsermResponse> oneStvSubmitTrue(@NotNull OneStvSubmitTrueRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneStvSubmitTrue(this.f82366d.getSuffixApi(), request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Single<QueryTransactionResponse> queryTransaction(@NotNull String trackingID) {
        Intrinsics.checkNotNullParameter(trackingID, "trackingID");
        return this.f82363a.queryTransaction(new QueryTransactionRequest(null, "PROSERM", trackingID, 1, null));
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public void setGetBalanceResponse(@Nullable BalanceResponse balanceResponse) {
        this.f82367e.setGetBalanceResponse(balanceResponse);
    }

    public final void setModel(@NotNull StvProsermOnline stvProsermOnline) {
        Intrinsics.checkNotNullParameter(stvProsermOnline, "<set-?>");
        this.f82367e = stvProsermOnline;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public void setPackageResp(@Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp) {
        this.f82367e.setPackageResp(oneStvRecommendPackageResp);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public void setSimRCollection(@Nullable SimRCollectionResponse simRCollectionResponse) {
        this.f82367e.setSimRCollection(simRCollectionResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public void setSubscriberGroup(@Nullable String str) {
        this.f82367e.setSubscriberGroup(str);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    public void setSubscriberNumber(@Nullable String str) {
        this.f82367e.setSubscriberNumber(str);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository
    @NotNull
    public Observable<OneCommonResponse> updateInterestRecommendForTrue(@NotNull UpdateInterestRecommendRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82363a.oneUpdateInterestRecommendForTrue(request);
    }
}
