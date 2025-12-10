package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateBarcodeRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request.CheckSimStockRequest;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidateBarcodeViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R'\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001a\u0010)R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R'\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b\u001c\u0010)R#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010+8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R'\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b'\u0010)R#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208010+8\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/R'\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b\u001f\u0010)R#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e010+8\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/R\u0011\u0010E\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bC\u0010DR(\u0010K\u001a\u0004\u0018\u0001022\b\u0010F\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010M\u001a\u00020L2\u0006\u0010F\u001a\u00020L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u00020L2\u0006\u0010F\u001a\u00020L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010N\"\u0004\bR\u0010PR$\u0010S\u001a\u00020L2\u0006\u0010F\u001a\u00020L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR$\u0010W\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010D\"\u0004\bV\u0010\u0012¨\u0006X"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/mrtr_postpaid_registration/MrtrPostpaidValidateBarcodeViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "cardReaderService", "<init>", "(Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;)V", "", OptionalModuleUtils.BARCODE, "", "checkSimStock", "(Ljava/lang/String;)V", "validateSimBarcode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_navigateTakeIdentity", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getNavigateTakeIdentity", "()Landroidx/lifecycle/LiveData;", "navigateTakeIdentity", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", OperatorName.SET_LINE_JOINSTYLE, "_navigateToPackages", OperatorName.NON_STROKING_CMYK, "getNavigateToPackages", "navigateToPackages", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.LINE_TO, "_showErrorMessage", OperatorName.MOVE_TO, "getShowErrorMessage", "showErrorMessage", OperatorName.ENDPATH, "_showDialogConfirm", "o", "getShowDialogConfirm", "showDialogConfirm", "getUserFormatType", "()Ljava/lang/String;", "userFormatType", "value", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;)V", "validateSimBarcodeResponse", "", "isCheckSimStock", "()Z", "setCheckSimStock", "(Z)V", "isWithContract", "setWithContract", "isWithDevice", "setWithDevice", "getSimBarcode", "setSimBarcode", "simBarcode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidateBarcodeViewModel */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidateBarcodeViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MrtrPostpaidRepository f106519b;

    /* renamed from: c */
    public final ConfigurationRepository f106520c;

    /* renamed from: d */
    public final Rx2ThreadService f106521d;

    /* renamed from: e */
    public final MrtrErrorService f106522e;

    /* renamed from: f */
    public final CardReaderService f106523f;

    /* renamed from: g */
    public final CompositeDisposable f106524g;

    /* renamed from: h */
    public final Lazy f106525h;

    /* renamed from: i */
    public final LiveData f106526i;

    /* renamed from: j */
    public final Lazy f106527j;

    /* renamed from: k */
    public final LiveData f106528k;

    /* renamed from: l */
    public final Lazy f106529l;

    /* renamed from: m */
    public final LiveData f106530m;

    /* renamed from: n */
    public final Lazy f106531n;

    /* renamed from: o */
    public final LiveData f106532o;

    @Inject
    public MrtrPostpaidValidateBarcodeViewModel(@NotNull MrtrPostpaidRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService, @NotNull CardReaderService cardReaderService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(cardReaderService, "cardReaderService");
        this.f106519b = repository;
        this.f106520c = configurationRepository;
        this.f106521d = threadService;
        this.f106522e = errorService;
        this.f106523f = cardReaderService;
        this.f106524g = new CompositeDisposable();
        this.f106525h = LazyKt__LazyJVMKt.lazy(MrtrPostpaidValidateBarcodeViewModel$_navigateTakeIdentity$2.INSTANCE);
        this.f106526i = m2233e();
        this.f106527j = LazyKt__LazyJVMKt.lazy(MrtrPostpaidValidateBarcodeViewModel$_navigateToPackages$2.INSTANCE);
        this.f106528k = m2232f();
        this.f106529l = LazyKt__LazyJVMKt.lazy(MrtrPostpaidValidateBarcodeViewModel$_showErrorMessage$2.INSTANCE);
        this.f106530m = m2230h();
        this.f106531n = LazyKt__LazyJVMKt.lazy(MrtrPostpaidValidateBarcodeViewModel$_showDialogConfirm$2.INSTANCE);
        this.f106532o = m2231g();
    }

    public final void checkSimStock(String str) {
        Single<R> compose = this.f106519b.checkSimStock(new CheckSimStockRequest(str, this.f106519b.getUserLan(), this.f106519b.getLocationCode(), Constant.MrtrPriceLevel.POS_GUEST, this.f106519b.getUserCode(), false, 32, null)).compose(this.f106521d.applySingleAsync());
        final MrtrPostpaidValidateBarcodeViewModel$checkSimStock$1 mrtrPostpaidValidateBarcodeViewModel$checkSimStock$1 = new MrtrPostpaidValidateBarcodeViewModel$checkSimStock$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: QA0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidValidateBarcodeViewModel.m2234d(mrtrPostpaidValidateBarcodeViewModel$checkSimStock$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun checkSimStoc… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidValidateBarcodeViewModel$checkSimStock$2(this), new MrtrPostpaidValidateBarcodeViewModel$checkSimStock$3(this)), this.f106524g);
    }

    /* renamed from: d */
    public static final void m2234d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final MutableLiveData m2233e() {
        return (MutableLiveData) this.f106525h.getValue();
    }

    /* renamed from: f */
    public final MutableLiveData m2232f() {
        return (MutableLiveData) this.f106527j.getValue();
    }

    /* renamed from: g */
    public final MutableLiveData m2231g() {
        return (MutableLiveData) this.f106531n.getValue();
    }

    /* renamed from: h */
    public final MutableLiveData m2230h() {
        return (MutableLiveData) this.f106529l.getValue();
    }

    /* renamed from: i */
    public static final void m2229i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106524g;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeIdentity() {
        return this.f106526i;
    }

    @NotNull
    public final LiveData<Resource<MrtrPostpaidValidateSimBarcodeResponse>> getNavigateToPackages() {
        return this.f106528k;
    }

    @NotNull
    public final LiveData<Resource<String>> getShowDialogConfirm() {
        return this.f106532o;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f106530m;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.f106519b.getSimBarcode();
    }

    @NotNull
    public final String getUserFormatType() {
        return this.f106519b.getUserFormatType();
    }

    @Nullable
    public final MrtrPostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.f106519b.getValidateSimBarcodeResponse();
    }

    public final boolean isCheckSimStock() {
        return this.f106519b.isCheckSimStock();
    }

    public final boolean isWithContract() {
        return this.f106519b.getWithContract();
    }

    public final boolean isWithDevice() {
        return this.f106519b.getWithDevice();
    }

    public final void setCheckSimStock(boolean z) {
        this.f106519b.setCheckSimStock(z);
    }

    public final void setSimBarcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106519b.setSimBarcode(value);
    }

    public final void setValidateSimBarcodeResponse(@Nullable MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse) {
        this.f106519b.setValidateSimBarcodeResponse(mrtrPostpaidValidateSimBarcodeResponse);
    }

    public final void setWithContract(boolean z) {
        this.f106519b.setWithContract(z);
    }

    public final void setWithDevice(boolean z) {
        this.f106519b.setWithDevice(z);
    }

    public final void validateSimBarcode(@NotNull String barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Single<R> compose = this.f106519b.validateSimBarcode(new MrtrPostpaidValidateBarcodeRequest(barcode, this.f106519b.getUserCode(), this.f106519b.getUserLan(), this.f106519b.getUserFormatType())).compose(this.f106521d.applySingleAsync());
        final MrtrPostpaidValidateBarcodeViewModel$validateSimBarcode$1 mrtrPostpaidValidateBarcodeViewModel$validateSimBarcode$1 = new MrtrPostpaidValidateBarcodeViewModel$validateSimBarcode$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: PA0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidValidateBarcodeViewModel.m2229i(mrtrPostpaidValidateBarcodeViewModel$validateSimBarcode$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateSimBarcode(b… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidValidateBarcodeViewModel$validateSimBarcode$2(this), new MrtrPostpaidValidateBarcodeViewModel$validateSimBarcode$3(this, barcode)), this.f106524g);
    }
}