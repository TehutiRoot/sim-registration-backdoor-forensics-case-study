package th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.commission.OneCommissionResponse;
import th.p047co.dtac.android.dtacone.app_one.model.profit_report.OneProfitReportResponse;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.OneReportThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.request.OneCommissionDetailTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.profit.OneProfitReportDetailResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel.OneProfitReportViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R'\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0*8\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-R'\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0#0*8\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R'\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060#0*8\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b:\u0010-R'\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b=\u0010(R#\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0#0*8\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b?\u0010-R\u0011\u0010B\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010G\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/viewmodel/OneProfitReportViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneProfitReportRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneProfitReportRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "", "getOneProfitReport", "()V", "", TypedValues.CycleType.S_WAVE_PERIOD, "getOneDetailProfitReport", "(Ljava/lang/String;)V", "getCommissionReport", "onCleared", OperatorName.FILL_NON_ZERO, OperatorName.CLOSE_PATH, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneProfitReportRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "e", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lio/reactivex/disposables/CompositeDisposable;", "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/OneProfitReportResponse;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", "o", "()Landroidx/lifecycle/MutableLiveData;", "_profitSummaryReportLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getProfitSummaryReportLiveData", "()Landroidx/lifecycle/LiveData;", "profitSummaryReportLiveData", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/profit/OneProfitReportDetailResponse;", "i", OperatorName.ENDPATH, "_profitDetailReportLiveData", OperatorName.SET_LINE_JOINSTYLE, "getProfitDetailReportLiveData", "profitDetailReportLiveData", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionResponse;", OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, "_commissionReportDtacCompanyLiveData", "getCommissionReportDtacCompanyLiveData", "commissionReportDtacCompanyLiveData", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionTrueCompanyResponse;", OperatorName.MOVE_TO, "_commissionReportTrueCompanyLiveData", "getCommissionReportTrueCompanyLiveData", "commissionReportTrueCompanyLiveData", "", "isCompanyTrue", "()Z", "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;", "getThemeColorModel", "()Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;", "themeColorModel", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneProfitReportViewModel */
/* loaded from: classes10.dex */
public final class OneProfitReportViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneProfitReportRepository f96730b;

    /* renamed from: c */
    public final Rx2ThreadService f96731c;

    /* renamed from: d */
    public final OneErrorService f96732d;

    /* renamed from: e */
    public PreferencesViewModel f96733e;

    /* renamed from: f */
    public final CompositeDisposable f96734f;

    /* renamed from: g */
    public final Lazy f96735g;

    /* renamed from: h */
    public final LiveData f96736h;

    /* renamed from: i */
    public final Lazy f96737i;

    /* renamed from: j */
    public final LiveData f96738j;

    /* renamed from: k */
    public final Lazy f96739k;

    /* renamed from: l */
    public final LiveData f96740l;

    /* renamed from: m */
    public final Lazy f96741m;

    /* renamed from: n */
    public final LiveData f96742n;

    @Inject
    public OneProfitReportViewModel(@NotNull OneProfitReportRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f96730b = repository;
        this.f96731c = threadService;
        this.f96732d = errorService;
        this.f96733e = pfViewModel;
        this.f96734f = new CompositeDisposable();
        this.f96735g = LazyKt__LazyJVMKt.lazy(OneProfitReportViewModel$_profitSummaryReportLiveData$2.INSTANCE);
        this.f96736h = m10218o();
        this.f96737i = LazyKt__LazyJVMKt.lazy(OneProfitReportViewModel$_profitDetailReportLiveData$2.INSTANCE);
        this.f96738j = m10219n();
        this.f96739k = LazyKt__LazyJVMKt.lazy(OneProfitReportViewModel$_commissionReportDtacCompanyLiveData$2.INSTANCE);
        this.f96740l = m10221l();
        this.f96741m = LazyKt__LazyJVMKt.lazy(OneProfitReportViewModel$_commissionReportTrueCompanyLiveData$2.INSTANCE);
        this.f96742n = m10220m();
    }

    /* renamed from: g */
    public static final void m10226g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getCommissionReport$default(OneProfitReportViewModel oneProfitReportViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oneProfitReportViewModel.getCommissionReport(str);
    }

    /* renamed from: i */
    public static final void m10224i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m10223j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m10222k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public final MutableLiveData m10221l() {
        return (MutableLiveData) this.f96739k.getValue();
    }

    /* renamed from: m */
    public final MutableLiveData m10220m() {
        return (MutableLiveData) this.f96741m.getValue();
    }

    /* renamed from: f */
    public final void m10227f(String str) {
        Observable<R> compose = this.f96730b.getCommissionReportDtacCompanyByPeriod(str).compose(this.f96731c.applyAsync());
        final OneProfitReportViewModel$getCommissionReportDtacCompany$1 oneProfitReportViewModel$getCommissionReportDtacCompany$1 = new OneProfitReportViewModel$getCommissionReportDtacCompany$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: pa1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneProfitReportViewModel.m10226g(oneProfitReportViewModel$getCommissionReportDtacCompany$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun getCommissio…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneProfitReportViewModel$getCommissionReportDtacCompany$2(this), (Function0) null, new OneProfitReportViewModel$getCommissionReportDtacCompany$3(this), 2, (Object) null);
    }

    public final void getCommissionReport(@NotNull String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        if (Intrinsics.areEqual(this.f96733e.getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            m10227f(period);
        } else {
            m10225h(period);
        }
    }

    @NotNull
    public final LiveData<Resource<OneCommissionResponse>> getCommissionReportDtacCompanyLiveData() {
        return this.f96740l;
    }

    @NotNull
    public final LiveData<Resource<OneCommissionTrueCompanyResponse>> getCommissionReportTrueCompanyLiveData() {
        return this.f96742n;
    }

    public final void getOneDetailProfitReport(@NotNull String period) {
        Observable<OneProfitReportDetailResponse> oneDetailProfitReportTrueCompany;
        Intrinsics.checkNotNullParameter(period, "period");
        if (Intrinsics.areEqual(this.f96733e.getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            oneDetailProfitReportTrueCompany = this.f96730b.getOneDetailProfitReportDtacCompany(period);
        } else {
            oneDetailProfitReportTrueCompany = this.f96730b.getOneDetailProfitReportTrueCompany(period);
        }
        Observable<R> compose = oneDetailProfitReportTrueCompany.compose(this.f96731c.applyAsync());
        final OneProfitReportViewModel$getOneDetailProfitReport$1 oneProfitReportViewModel$getOneDetailProfitReport$1 = new OneProfitReportViewModel$getOneDetailProfitReport$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: na1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneProfitReportViewModel.m10223j(oneProfitReportViewModel$getOneDetailProfitReport$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getOneDetailProfitRe…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneProfitReportViewModel$getOneDetailProfitReport$2(this), (Function0) null, new OneProfitReportViewModel$getOneDetailProfitReport$3(this), 2, (Object) null);
    }

    public final void getOneProfitReport() {
        Observable<OneProfitReportResponse> oneSummaryProfitTrueCompany;
        if (Intrinsics.areEqual(this.f96733e.getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            oneSummaryProfitTrueCompany = this.f96730b.getOneSummaryProfitDtacCompany();
        } else {
            oneSummaryProfitTrueCompany = this.f96730b.getOneSummaryProfitTrueCompany();
        }
        Observable<R> compose = oneSummaryProfitTrueCompany.compose(this.f96731c.applyAsync());
        final OneProfitReportViewModel$getOneProfitReport$1 oneProfitReportViewModel$getOneProfitReport$1 = new OneProfitReportViewModel$getOneProfitReport$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: oa1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneProfitReportViewModel.m10222k(oneProfitReportViewModel$getOneProfitReport$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getOneProfitReport()…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneProfitReportViewModel$getOneProfitReport$2(this), (Function0) null, new OneProfitReportViewModel$getOneProfitReport$3(this), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Resource<OneProfitReportDetailResponse>> getProfitDetailReportLiveData() {
        return this.f96738j;
    }

    @NotNull
    public final LiveData<Resource<OneProfitReportResponse>> getProfitSummaryReportLiveData() {
        return this.f96736h;
    }

    @NotNull
    public final OneReportThemeColorModel getThemeColorModel() {
        if (Intrinsics.areEqual(this.f96733e.getCompany(), "TRUE")) {
            int i = R.drawable.ic_small_prev_true;
            int i2 = R.drawable.ic_small_next_true;
            int i3 = R.drawable.rectangle_profit_from_sales_true;
            int i4 = R.drawable.bg_box_tail_profit_true;
            int i5 = R.drawable.rectangle_campaign_true;
            int i6 = R.drawable.bg_box_tail_campaign_true;
            OneReportThemeColorModel.SummaryTheme summaryTheme = new OneReportThemeColorModel.SummaryTheme(R.color.red5, R.drawable.ic_report_graph_arrow_true, R.drawable.stats_full_true, R.drawable.stats_progress_true);
            OneReportThemeColorModel.CommissionTheme commissionTheme = new OneReportThemeColorModel.CommissionTheme(R.drawable.bg_rectangle_true, R.drawable.bg_box_tail_commission_true);
            int i7 = R.drawable.bg_profit_detail_true;
            int i8 = R.color.red10;
            int i9 = R.drawable.ic_one_triangle_true;
            int i10 = R.drawable.ic_bluepattern_true;
            int i11 = R.drawable.bg_profit_detail_item_true;
            int i12 = R.drawable.background_one_white_button_blue_border_true;
            int i13 = R.drawable.ic_one_retry_red;
            int i14 = R.color.red5;
            int i15 = R.drawable.background_one_toolbar_red;
            int i16 = R.drawable.selector_rectangle_red;
            int i17 = R.drawable.background_cursor_red;
            int i18 = R.color.red18;
            int i19 = R.color.red6;
            return new OneReportThemeColorModel(i15, i14, i16, i17, R.drawable.success_dialog_red, R.drawable.background_one_button_red, i18, i19, R.color.red8, R.color.redDark, R.color.red7, i, i2, i3, i4, i5, i6, summaryTheme, commissionTheme, i7, i8, i9, i10, i11, i12, i13, i14);
        }
        int i20 = R.drawable.ic_small_prev;
        int i21 = R.drawable.ic_small_next;
        int i22 = R.drawable.rectangle_profit_from_sales;
        int i23 = R.drawable.bg_one_box_tail_profit;
        int i24 = R.drawable.rectangle_campaign;
        int i25 = R.drawable.bg_one_box_tail_campaign;
        OneReportThemeColorModel.SummaryTheme summaryTheme2 = new OneReportThemeColorModel.SummaryTheme(R.color.niceBlueFive, R.drawable.ic_report_graph_arrow, R.drawable.one_stats_full, R.drawable.one_stats_progress);
        OneReportThemeColorModel.CommissionTheme commissionTheme2 = new OneReportThemeColorModel.CommissionTheme(R.drawable.bg_rectangle, R.drawable.bg_one_box_tail_commission);
        int i26 = R.drawable.bg_profit_detail;
        int i27 = R.color.niceBlueFive;
        int i28 = R.drawable.ic_one_triangle;
        int i29 = R.drawable.ic_bluepattern;
        int i30 = R.drawable.one_bg_profit_detail_item;
        int i31 = R.drawable.background_one_profit_report_white_button_blue_border;
        int i32 = R.drawable.ic_one_retry_blue;
        int i33 = R.color.niceBlueEleven;
        int i34 = R.drawable.background_one_toolbar_blue;
        int i35 = R.drawable.selector_rectangle_blue;
        int i36 = R.drawable.background_cursor_blue;
        int i37 = R.color.iceBlue;
        return new OneReportThemeColorModel(i34, i27, i35, i36, R.drawable.success_dialog, R.drawable.background_one_button_blue, i27, i37, R.color.darkBlueFive, R.color.niceBlue, R.color.darkBlueFour, i20, i21, i22, i23, i24, i25, summaryTheme2, commissionTheme2, i26, i27, i28, i29, i30, i31, i32, i33);
    }

    /* renamed from: h */
    public final void m10225h(String str) {
        Observable<R> compose = this.f96730b.getCommissionReportByPeriodTrueCompany(new OneCommissionDetailTrueCompanyRequest(str)).compose(this.f96731c.applyAsync());
        final OneProfitReportViewModel$getCommissionReportTrueCompany$1 oneProfitReportViewModel$getCommissionReportTrueCompany$1 = new OneProfitReportViewModel$getCommissionReportTrueCompany$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: ma1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneProfitReportViewModel.m10224i(oneProfitReportViewModel$getCommissionReportTrueCompany$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun getCommissio…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneProfitReportViewModel$getCommissionReportTrueCompany$2(this), (Function0) null, new OneProfitReportViewModel$getCommissionReportTrueCompany$3(this), 2, (Object) null);
    }

    public final boolean isCompanyTrue() {
        return Intrinsics.areEqual(this.f96733e.getCompany(), "TRUE");
    }

    /* renamed from: n */
    public final MutableLiveData m10219n() {
        return (MutableLiveData) this.f96737i.getValue();
    }

    /* renamed from: o */
    public final MutableLiveData m10218o() {
        return (MutableLiveData) this.f96735g.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f96734f.clear();
    }
}