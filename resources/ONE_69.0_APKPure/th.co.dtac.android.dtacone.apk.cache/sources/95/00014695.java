package th.p047co.dtac.android.dtacone.view.appOne.topup.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpUpdateOfferRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopupTrueRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopupTrueResponse;
import th.p047co.dtac.android.dtacone.model.topup.TopUpPriceListCollection;
import th.p047co.dtac.android.dtacone.model.topup.offer.RefillAlwaysRequest;
import th.p047co.dtac.android.dtacone.model.topup.offer.RefillAlwaysResponse;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferRequest;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepositoryImpl;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016¢\u0006\u0004\b\r\u0010\fJ)\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u0014\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u0010\u0014\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\b2\u0006\u0010\u0014\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00192\u0006\u0010\u0014\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00192\u0006\u0010\u0014\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00192\u0006\u0010\u0014\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/topup/repository/OneTopUpRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/topup/repository/OneTopUpRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;)V", "Lio/reactivex/Observable;", "", "Lth/co/dtac/android/dtacone/model/topup/TopUpPriceListCollection;", "getPriceListFromNetwork", "()Lio/reactivex/Observable;", "getPriceListFromDB", "topupCollection", "savePriceListToDB", "(Ljava/util/List;)Lio/reactivex/Observable;", "", "customerNumber", "Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferRequest;", "request", "Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "getOffer", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpRequest;", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpResponse;", "topUp", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopupTrueRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopupTrueResponse;", "topUpTrueV1", "(Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopupTrueRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpUpdateOfferRequest;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "updateOfferStatus", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpUpdateOfferRequest;)Lio/reactivex/Single;", "suffixApi", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "getOneBalance", "(Ljava/lang/String;)Lio/reactivex/Observable;", "userCode", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/model/topup/offer/RefillAlwaysRequest;", "Lth/co/dtac/android/dtacone/model/topup/offer/RefillAlwaysResponse;", "getRefillRecommendTrueCompany", "(Lth/co/dtac/android/dtacone/model/topup/offer/RefillAlwaysRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberResponse;", "checkSubscriberPrepaid", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceResponse;", "getMainBalance", "(Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyRequest;", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyResponse;", "getMainBalanceTrueCompany", "(Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyRequest;)Lio/reactivex/Single;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneTopUpRepositoryImpl implements OneTopUpRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f98519a;

    /* renamed from: b */
    public final RtrRx2Repository f98520b;

    @Inject
    public OneTopUpRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        this.f98519a = api;
        this.f98520b = rtrRx2Repository;
    }

    /* renamed from: b */
    public static final ObservableSource m9240b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Single<OneTopUpCheckSubscriberResponse> checkSubscriberPrepaid(@NotNull OneTopUpCheckSubscriberRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.checkSubscriberPrepaid(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Single<OneTopUpGetMainBalanceResponse> getMainBalance(@NotNull OneTopUpGetMainBalanceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.getMainBalance(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Single<OneTopUpGetMainBalanceTrueCompanyResponse> getMainBalanceTrueCompany(@NotNull OneTopUpGetMainBalanceTrueCompanyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.getMainBalanceTrueCompany(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Observable<TopupOfferResponse> getOffer(@NotNull String customerNumber, @NotNull TopupOfferRequest request) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.getOffer(customerNumber, request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Observable<BalanceResponse> getOneBalance(@NotNull String suffixApi) {
        Intrinsics.checkNotNullParameter(suffixApi, "suffixApi");
        return this.f98519a.oneGetBalance(suffixApi);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Observable<List<TopUpPriceListCollection>> getPriceListFromDB() {
        return this.f98520b.getPriceList();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Observable<List<TopUpPriceListCollection>> getPriceListFromNetwork() {
        Observable<List<TopUpPriceListCollection>> topupPriceList = this.f98519a.getTopupPriceList();
        final OneTopUpRepositoryImpl$getPriceListFromNetwork$1 oneTopUpRepositoryImpl$getPriceListFromNetwork$1 = new OneTopUpRepositoryImpl$getPriceListFromNetwork$1(this);
        Observable flatMap = topupPriceList.flatMap(new Function() { // from class: wf1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m9240b;
                m9240b = OneTopUpRepositoryImpl.m9240b(Function1.this, obj);
                return m9240b;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun getPriceLis…tToDB(it)\n        }\n    }");
        return flatMap;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Observable<RefillAlwaysResponse> getRefillRecommendTrueCompany(@NotNull RefillAlwaysRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.getRefillRecommendTrueCompany(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Observable<List<TopUpPriceListCollection>> savePriceListToDB(@NotNull List<TopUpPriceListCollection> topupCollection) {
        Intrinsics.checkNotNullParameter(topupCollection, "topupCollection");
        return this.f98520b.savePriceList(topupCollection);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Single<OneTopUpResponse> topUp(@NotNull OneTopUpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.topUpV3(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Single<OneTopupTrueResponse> topUpTrueV1(@NotNull OneTopupTrueRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.topUpTrueV1(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public Single<OneCommonResponse> updateOfferStatus(@NotNull OneTopUpUpdateOfferRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f98519a.topUpUpdateOffer(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository
    @NotNull
    public String userCode() {
        String userCode = this.f98520b.getUserSession().getUserCode();
        Intrinsics.checkNotNullExpressionValue(userCode, "rtrRx2Repository.userSession.userCode");
        return userCode;
    }
}