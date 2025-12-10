package th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.commission.OneCommissionResponse;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.request.OneCommissionDetailTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionDtacCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel.OneCommissionReportViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R'\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R'\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000#0*8\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R-\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R)\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070#0*8\u0006¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010.R'\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b?\u0010(R#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0*8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\bA\u0010.R'\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\bC\u0010(R#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#0*8\u0006¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bE\u0010.¨\u0006G"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/viewmodel/OneCommissionReportViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneCommissionReportRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneCommissionReportRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "", TypedValues.CycleType.S_WAVE_PERIOD, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "getOneTaxPDF", "(Ljava/lang/String;Landroid/content/Context;)V", "getStatementPDF", "getCommissionHistory", "(Landroid/content/Context;)V", "getCommissionReportTrueCompany", "getCommissionReportDtacCompany", "onCleared", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/report/repository/OneCommissionReportRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionTrueCompanyResponse;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", OperatorName.ENDPATH, "()Landroidx/lifecycle/MutableLiveData;", "_commissionReportTrueCompanyLiveData", "Landroidx/lifecycle/LiveData;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/LiveData;", "getCommissionReportTrueCompanyLiveData", "()Landroidx/lifecycle/LiveData;", "commissionReportTrueCompanyLiveData", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionDtacCompanyResponse;", OperatorName.CLOSE_PATH, OperatorName.MOVE_TO, "_commissionReportDtacCompanyLiveData", "i", "getCommissionReportDtacCompanyLiveData", "commissionReportDtacCompanyLiveData", "", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.LINE_TO, "_commissionHistoryLiveData", OperatorName.NON_STROKING_CMYK, "getCommissionHistoryLiveData", "commissionHistoryLiveData", "p", "_withholdingTaxPDFLiveData", "getWithholdingTaxPDFLiveData", "withholdingTaxPDFLiveData", "o", "_statementPDFLiveData", "getStatementPDFLiveData", "statementPDFLiveData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneCommissionReportViewModel */
/* loaded from: classes10.dex */
public final class OneCommissionReportViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneCommissionReportRepository f96707b;

    /* renamed from: c */
    public final Rx2ThreadService f96708c;

    /* renamed from: d */
    public PreferencesViewModel f96709d;

    /* renamed from: e */
    public final CompositeDisposable f96710e;

    /* renamed from: f */
    public final Lazy f96711f;

    /* renamed from: g */
    public final LiveData f96712g;

    /* renamed from: h */
    public final Lazy f96713h;

    /* renamed from: i */
    public final LiveData f96714i;

    /* renamed from: j */
    public final Lazy f96715j;

    /* renamed from: k */
    public final LiveData f96716k;

    /* renamed from: l */
    public final Lazy f96717l;

    /* renamed from: m */
    public final LiveData f96718m;

    /* renamed from: n */
    public final Lazy f96719n;

    /* renamed from: o */
    public final LiveData f96720o;

    @Inject
    public OneCommissionReportViewModel(@NotNull OneCommissionReportRepository repository, @NotNull Rx2ThreadService threadService, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f96707b = repository;
        this.f96708c = threadService;
        this.f96709d = pfViewModel;
        this.f96710e = new CompositeDisposable();
        this.f96711f = LazyKt__LazyJVMKt.lazy(C15126x9a2c381a.INSTANCE);
        this.f96712g = m10234n();
        this.f96713h = LazyKt__LazyJVMKt.lazy(C15125x56d2576.INSTANCE);
        this.f96714i = m10235m();
        this.f96715j = LazyKt__LazyJVMKt.lazy(OneCommissionReportViewModel$_commissionHistoryLiveData$2.INSTANCE);
        this.f96716k = m10236l();
        this.f96717l = LazyKt__LazyJVMKt.lazy(OneCommissionReportViewModel$_withholdingTaxPDFLiveData$2.INSTANCE);
        this.f96718m = m10232p();
        this.f96719n = LazyKt__LazyJVMKt.lazy(OneCommissionReportViewModel$_statementPDFLiveData$2.INSTANCE);
        this.f96720o = m10233o();
    }

    /* renamed from: g */
    public static final void m10241g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getCommissionReportDtacCompany$default(OneCommissionReportViewModel oneCommissionReportViewModel, String str, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oneCommissionReportViewModel.getCommissionReportDtacCompany(str, context);
    }

    public static /* synthetic */ void getCommissionReportTrueCompany$default(OneCommissionReportViewModel oneCommissionReportViewModel, String str, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oneCommissionReportViewModel.getCommissionReportTrueCompany(str, context);
    }

    public static /* synthetic */ void getOneTaxPDF$default(OneCommissionReportViewModel oneCommissionReportViewModel, String str, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oneCommissionReportViewModel.getOneTaxPDF(str, context);
    }

    public static /* synthetic */ void getStatementPDF$default(OneCommissionReportViewModel oneCommissionReportViewModel, String str, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oneCommissionReportViewModel.getStatementPDF(str, context);
    }

    /* renamed from: h */
    public static final void m10240h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m10239i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m10238j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m10237k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void getCommissionHistory(@Nullable Context context) {
        Observable<OneCommissionResponse> commissionHistoryDtacCompany;
        if (Intrinsics.areEqual(this.f96709d.getCompany(), "TRUE")) {
            commissionHistoryDtacCompany = this.f96707b.getCommissionHistoryTrueCompany();
        } else {
            commissionHistoryDtacCompany = this.f96707b.getCommissionHistoryDtacCompany();
        }
        Observable<R> compose = commissionHistoryDtacCompany.compose(this.f96708c.applyAsync());
        final OneCommissionReportViewModel$getCommissionHistory$1 oneCommissionReportViewModel$getCommissionHistory$1 = new OneCommissionReportViewModel$getCommissionHistory$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: qO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneCommissionReportViewModel.m10241g(oneCommissionReportViewModel$getCommissionHistory$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getCommissionHistory…\n                })\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneCommissionReportViewModel$getCommissionHistory$2(this, context), (Function0) null, new OneCommissionReportViewModel$getCommissionHistory$3(this), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Resource<List<CommissionHistoryCollection>>> getCommissionHistoryLiveData() {
        return this.f96716k;
    }

    public final void getCommissionReportDtacCompany(@NotNull String period, @Nullable Context context) {
        Observable<OneCommissionDtacCompanyResponse> oneCommissionReportByPeriodDtacCompany;
        Intrinsics.checkNotNullParameter(period, "period");
        if (AbstractC19741eO1.isBlank(period)) {
            oneCommissionReportByPeriodDtacCompany = this.f96707b.getOneCommissionDetailReportDtacCompany();
        } else {
            oneCommissionReportByPeriodDtacCompany = this.f96707b.getOneCommissionReportByPeriodDtacCompany(period);
        }
        Observable<R> compose = oneCommissionReportByPeriodDtacCompany.compose(this.f96708c.applyAsync());
        final OneCommissionReportViewModel$getCommissionReportDtacCompany$1 oneCommissionReportViewModel$getCommissionReportDtacCompany$1 = new OneCommissionReportViewModel$getCommissionReportDtacCompany$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: oO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneCommissionReportViewModel.m10240h(oneCommissionReportViewModel$getCommissionReportDtacCompany$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getCommissionReportD…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneCommissionReportViewModel$getCommissionReportDtacCompany$2(period, this, context), (Function0) null, new OneCommissionReportViewModel$getCommissionReportDtacCompany$3(this), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Resource<OneCommissionDtacCompanyResponse>> getCommissionReportDtacCompanyLiveData() {
        return this.f96714i;
    }

    public final void getCommissionReportTrueCompany(@NotNull String period, @Nullable Context context) {
        Observable<OneCommissionTrueCompanyResponse> commissionReportDetailByPeriodTrueCompany;
        Intrinsics.checkNotNullParameter(period, "period");
        if (AbstractC19741eO1.isBlank(period)) {
            commissionReportDetailByPeriodTrueCompany = this.f96707b.getOneCommissionInfoTrueCompany();
        } else {
            commissionReportDetailByPeriodTrueCompany = this.f96707b.getCommissionReportDetailByPeriodTrueCompany(new OneCommissionDetailTrueCompanyRequest(period));
        }
        Observable<R> compose = commissionReportDetailByPeriodTrueCompany.compose(this.f96708c.applyAsync());
        final OneCommissionReportViewModel$getCommissionReportTrueCompany$1 oneCommissionReportViewModel$getCommissionReportTrueCompany$1 = new OneCommissionReportViewModel$getCommissionReportTrueCompany$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: rO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneCommissionReportViewModel.m10239i(oneCommissionReportViewModel$getCommissionReportTrueCompany$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getCommissionReportT…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneCommissionReportViewModel$getCommissionReportTrueCompany$2(period, this, context), (Function0) null, new OneCommissionReportViewModel$getCommissionReportTrueCompany$3(this), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Resource<OneCommissionTrueCompanyResponse>> getCommissionReportTrueCompanyLiveData() {
        return this.f96712g;
    }

    public final void getOneTaxPDF(@NotNull String period, @Nullable Context context) {
        Observable<OneCommissionResponse> withholdingTaxPDF;
        Intrinsics.checkNotNullParameter(period, "period");
        if (Intrinsics.areEqual(this.f96709d.getCompany(), "TRUE")) {
            withholdingTaxPDF = this.f96707b.getWithholdingTaxPDFTrueCompany(period);
        } else {
            withholdingTaxPDF = this.f96707b.getWithholdingTaxPDF(period);
        }
        Observable<R> compose = withholdingTaxPDF.compose(this.f96708c.applyAsync());
        final OneCommissionReportViewModel$getOneTaxPDF$1 oneCommissionReportViewModel$getOneTaxPDF$1 = new OneCommissionReportViewModel$getOneTaxPDF$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: pO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneCommissionReportViewModel.m10238j(oneCommissionReportViewModel$getOneTaxPDF$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getOneTaxPDF(\n      …    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneCommissionReportViewModel$getOneTaxPDF$2(this, context), (Function0) null, new OneCommissionReportViewModel$getOneTaxPDF$3(this), 2, (Object) null);
    }

    public final void getStatementPDF(@NotNull String period, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(period, "period");
        Observable<R> compose = this.f96707b.getReportFileStatement(period).compose(this.f96708c.applyAsync());
        final OneCommissionReportViewModel$getStatementPDF$1 oneCommissionReportViewModel$getStatementPDF$1 = new OneCommissionReportViewModel$getStatementPDF$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: sO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneCommissionReportViewModel.m10237k(oneCommissionReportViewModel$getStatementPDF$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getStatementPDF(\n   …    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneCommissionReportViewModel$getStatementPDF$2(this, context), (Function0) null, new OneCommissionReportViewModel$getStatementPDF$3(this), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Resource<String>> getStatementPDFLiveData() {
        return this.f96720o;
    }

    @NotNull
    public final LiveData<Resource<String>> getWithholdingTaxPDFLiveData() {
        return this.f96718m;
    }

    /* renamed from: l */
    public final MutableLiveData m10236l() {
        return (MutableLiveData) this.f96715j.getValue();
    }

    /* renamed from: m */
    public final MutableLiveData m10235m() {
        return (MutableLiveData) this.f96713h.getValue();
    }

    /* renamed from: n */
    public final MutableLiveData m10234n() {
        return (MutableLiveData) this.f96711f.getValue();
    }

    /* renamed from: o */
    public final MutableLiveData m10233o() {
        return (MutableLiveData) this.f96719n.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f96710e.clear();
    }

    /* renamed from: p */
    public final MutableLiveData m10232p() {
        return (MutableLiveData) this.f96717l.getValue();
    }
}