package th.p047co.dtac.android.dtacone.view.appOne.report.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.commission.OneCommissionResponse;
import th.p047co.dtac.android.dtacone.app_one.model.profit_report.OneProfitReportResponse;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.request.OneCommissionDetailTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.profit.OneProfitReportDetailResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneProfitReportRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneProfitReportRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;)V", "", TypedValues.CycleType.S_WAVE_PERIOD, "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionResponse;", "getCommissionDetail", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/OneProfitReportResponse;", "getOneSummaryProfitDtacCompany", "()Lio/reactivex/Observable;", "getOneSummaryProfitTrueCompany", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/profit/OneProfitReportDetailResponse;", "getOneDetailProfitReportDtacCompany", "getOneDetailProfitReportTrueCompany", "getCommissionReportDtacCompany", "getCommissionReportDtacCompanyByPeriod", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionTrueCompanyResponse;", "getOneCommissionReportTrueCompany", "Lth/co/dtac/android/dtacone/view/appOne/report/model/request/OneCommissionDetailTrueCompanyRequest;", "request", "getCommissionReportByPeriodTrueCompany", "(Lth/co/dtac/android/dtacone/view/appOne/report/model/request/OneCommissionDetailTrueCompanyRequest;)Lio/reactivex/Observable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "getRtrRx2Repository", "()Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "getConfigurationRepository", "()Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneProfitReportRepositoryImpl implements OneProfitReportRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f96701a;

    /* renamed from: b */
    public final RtrRx2Repository f96702b;

    /* renamed from: c */
    public final ConfigurationRepository f96703c;

    @Inject
    public OneProfitReportRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f96701a = api;
        this.f96702b = rtrRx2Repository;
        this.f96703c = configurationRepository;
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f96701a;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getCommissionDetail(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96701a.getOneCommissionReportByPeriod(period);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneCommissionTrueCompanyResponse> getCommissionReportByPeriodTrueCompany(@NotNull OneCommissionDetailTrueCompanyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f96701a.getCommissionReportDetailByPeriodTrueCompany(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getCommissionReportDtacCompany() {
        return this.f96701a.getOneCommissionReport();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getCommissionReportDtacCompanyByPeriod(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96701a.getOneCommissionReportByPeriod(period);
    }

    @NotNull
    public final ConfigurationRepository getConfigurationRepository() {
        return this.f96703c;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneCommissionTrueCompanyResponse> getOneCommissionReportTrueCompany() {
        return this.f96701a.getOneCommissionDetailReportTrueCompany();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneProfitReportDetailResponse> getOneDetailProfitReportDtacCompany(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96701a.getOneDetailProfitReportDtacCompany(period);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneProfitReportDetailResponse> getOneDetailProfitReportTrueCompany(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96701a.getOneDetailProfitReportTrueCompany(period);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneProfitReportResponse> getOneSummaryProfitDtacCompany() {
        return this.f96701a.getOneSummaryProfitDtacCompany();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository
    @NotNull
    public Observable<OneProfitReportResponse> getOneSummaryProfitTrueCompany() {
        return this.f96701a.getOneSummaryProfitTrueCompany();
    }

    @NotNull
    public final RtrRx2Repository getRtrRx2Repository() {
        return this.f96702b;
    }
}