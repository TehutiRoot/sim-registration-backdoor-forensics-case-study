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
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.request.OneCommissionDetailTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDtacCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionTrueCompanyResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\nH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\nH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneCommissionReportRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneCommissionReportRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;)V", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionTrueCompanyResponse;", "getOneCommissionInfoTrueCompany", "()Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/request/OneCommissionDetailTrueCompanyRequest;", "request", "getCommissionReportDetailByPeriodTrueCompany", "(Lth/co/dtac/android/dtacone/view/appOne/report/model/request/OneCommissionDetailTrueCompanyRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionDtacCompanyResponse;", "getOneCommissionDetailReportDtacCompany", "", TypedValues.CycleType.S_WAVE_PERIOD, "getOneCommissionReportByPeriodDtacCompany", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionResponse;", "getCommissionHistoryDtacCompany", "getCommissionHistoryTrueCompany", "getWithholdingTaxPDFDtacCompany", "getWithholdingTaxPDFTrueCompany", "getReportFileStatement", "getWithholdingTaxPDF", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "getRtrRx2Repository", "()Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "getConfigurationRepository", "()Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneCommissionReportRepositoryImpl implements OneCommissionReportRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f96695a;

    /* renamed from: b */
    public final RtrRx2Repository f96696b;

    /* renamed from: c */
    public final ConfigurationRepository f96697c;

    @Inject
    public OneCommissionReportRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f96695a = api;
        this.f96696b = rtrRx2Repository;
        this.f96697c = configurationRepository;
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f96695a;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getCommissionHistoryDtacCompany() {
        return this.f96695a.getOneCommissionHistoryDtacCompany();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getCommissionHistoryTrueCompany() {
        return this.f96695a.getOneCommissionHistoryTrueCompany();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionTrueCompanyResponse> getCommissionReportDetailByPeriodTrueCompany(@NotNull OneCommissionDetailTrueCompanyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f96695a.getCommissionReportDetailByPeriodTrueCompany(request);
    }

    @NotNull
    public final ConfigurationRepository getConfigurationRepository() {
        return this.f96697c;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionDtacCompanyResponse> getOneCommissionDetailReportDtacCompany() {
        return this.f96695a.getOneCommissionDetailReportDtacCompany();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionTrueCompanyResponse> getOneCommissionInfoTrueCompany() {
        return this.f96695a.getOneCommissionDetailReportTrueCompany();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionDtacCompanyResponse> getOneCommissionReportByPeriodDtacCompany(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96695a.getCommissionReportDetailByPeriodDtacCompany(period);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getReportFileStatement(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96695a.getOneCommissionReportFileStatement(period);
    }

    @NotNull
    public final RtrRx2Repository getRtrRx2Repository() {
        return this.f96696b;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getWithholdingTaxPDF(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96695a.getOneCommissionWithholdingTaxPDF(period);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getWithholdingTaxPDFDtacCompany(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96695a.getOneCommissionWithholdingTaxPDF(period);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository
    @NotNull
    public Observable<OneCommissionResponse> getWithholdingTaxPDFTrueCompany(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f96695a.getOneCommissionTWithholdingTaxPDF(period);
    }
}