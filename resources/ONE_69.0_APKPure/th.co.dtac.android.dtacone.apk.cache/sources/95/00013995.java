package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

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
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateSimBarcodeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidateBarcodeViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R'\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001a\u0010+R#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R'\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b!\u0010+R#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030-8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R'\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:030&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b\u001e\u0010+R#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:030-8\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u00101R'\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:030&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\b\u001c\u0010+R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:030-8\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u00101R'\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E030&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\b)\u0010+R#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E030-8\u0006¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u00101R\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bK\u0010LR(\u0010S\u001a\u0004\u0018\u0001042\b\u0010N\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010U\u001a\u00020T2\u0006\u0010N\u001a\u00020T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Y\u001a\u00020T2\u0006\u0010N\u001a\u00020T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010[\u001a\u00020T2\u0006\u0010N\u001a\u00020T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR$\u0010_\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010L\"\u0004\b^\u0010\u0012¨\u0006`"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidValidateBarcodeViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "cardReaderService", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;)V", "", OptionalModuleUtils.BARCODE, "", "validateSimBarcode", "(Ljava/lang/String;)V", "validateSimTrue", "onCleared", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_navigateTakeIdentity", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getNavigateTakeIdentity", "()Landroidx/lifecycle/LiveData;", "navigateTakeIdentity", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", OperatorName.SET_LINE_JOINSTYLE, "_navigateToPackages", OperatorName.NON_STROKING_CMYK, "getNavigateToPackages", "navigateToPackages", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateSimTrueResponse;", OperatorName.LINE_TO, "_navigateToInputNumber", OperatorName.MOVE_TO, "getNavigateToInputNumber", "navigateToInputNumber", OperatorName.ENDPATH, "_navigateToForScanSimTrue", "o", "getNavigateToForScanSimTrue", "navigateToForScanSimTrue", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "p", "_showErrorMessage", OperatorName.SAVE, "getShowErrorMessage", "showErrorMessage", "getUserFormatType", "()Ljava/lang/String;", "userFormatType", "value", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;)V", "validateSimBarcodeResponse", "", "isCheckSimStock", "()Z", "setCheckSimStock", "(Z)V", "isWithContract", "setWithContract", "isWithDevice", "setWithDevice", "getSimBarcode", "setSimBarcode", "simBarcode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidateBarcodeViewModel */
/* loaded from: classes10.dex */
public final class OnePostpaidValidateBarcodeViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OnePostpaidRepository f94689b;

    /* renamed from: c */
    public final ConfigurationRepository f94690c;

    /* renamed from: d */
    public final Rx2ThreadService f94691d;

    /* renamed from: e */
    public final OneErrorService f94692e;

    /* renamed from: f */
    public final CardReaderService f94693f;

    /* renamed from: g */
    public final CompositeDisposable f94694g;

    /* renamed from: h */
    public final Lazy f94695h;

    /* renamed from: i */
    public final LiveData f94696i;

    /* renamed from: j */
    public final Lazy f94697j;

    /* renamed from: k */
    public final LiveData f94698k;

    /* renamed from: l */
    public final Lazy f94699l;

    /* renamed from: m */
    public final LiveData f94700m;

    /* renamed from: n */
    public final Lazy f94701n;

    /* renamed from: o */
    public final LiveData f94702o;

    /* renamed from: p */
    public final Lazy f94703p;

    /* renamed from: q */
    public final LiveData f94704q;

    @Inject
    public OnePostpaidValidateBarcodeViewModel(@NotNull OnePostpaidRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService, @NotNull CardReaderService cardReaderService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(cardReaderService, "cardReaderService");
        this.f94689b = repository;
        this.f94690c = configurationRepository;
        this.f94691d = threadService;
        this.f94692e = errorService;
        this.f94693f = cardReaderService;
        this.f94694g = new CompositeDisposable();
        this.f94695h = LazyKt__LazyJVMKt.lazy(OnePostpaidValidateBarcodeViewModel$_navigateTakeIdentity$2.INSTANCE);
        this.f94696i = m11516d();
        this.f94697j = LazyKt__LazyJVMKt.lazy(OnePostpaidValidateBarcodeViewModel$_navigateToPackages$2.INSTANCE);
        this.f94698k = m11513g();
        this.f94699l = LazyKt__LazyJVMKt.lazy(OnePostpaidValidateBarcodeViewModel$_navigateToInputNumber$2.INSTANCE);
        this.f94700m = m11514f();
        this.f94701n = LazyKt__LazyJVMKt.lazy(OnePostpaidValidateBarcodeViewModel$_navigateToForScanSimTrue$2.INSTANCE);
        this.f94702o = m11515e();
        this.f94703p = LazyKt__LazyJVMKt.lazy(OnePostpaidValidateBarcodeViewModel$_showErrorMessage$2.INSTANCE);
        this.f94704q = m11512h();
    }

    /* renamed from: b */
    public static /* synthetic */ void m11518b(Function1 function1, Object obj) {
        m11511i(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m11517c(Function1 function1, Object obj) {
        m11510j(function1, obj);
    }

    /* renamed from: g */
    public final MutableLiveData m11513g() {
        return (MutableLiveData) this.f94697j.getValue();
    }

    /* renamed from: h */
    public final MutableLiveData m11512h() {
        return (MutableLiveData) this.f94703p.getValue();
    }

    /* renamed from: i */
    public static final void m11511i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m11510j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final MutableLiveData m11516d() {
        return (MutableLiveData) this.f94695h.getValue();
    }

    /* renamed from: e */
    public final MutableLiveData m11515e() {
        return (MutableLiveData) this.f94701n.getValue();
    }

    /* renamed from: f */
    public final MutableLiveData m11514f() {
        return (MutableLiveData) this.f94699l.getValue();
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f94694g;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeIdentity() {
        return this.f94696i;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidValidateSimTrueResponse>> getNavigateToForScanSimTrue() {
        return this.f94702o;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidValidateSimTrueResponse>> getNavigateToInputNumber() {
        return this.f94700m;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidValidateSimBarcodeResponse>> getNavigateToPackages() {
        return this.f94698k;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f94704q;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.f94689b.getSimBarcode();
    }

    @NotNull
    public final String getUserFormatType() {
        return this.f94689b.getUserFormatType();
    }

    @Nullable
    public final OnePostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.f94689b.getValidateSimBarcodeResponse();
    }

    public final boolean isCheckSimStock() {
        return this.f94689b.isCheckSimStock();
    }

    public final boolean isWithContract() {
        return this.f94689b.getWithContract();
    }

    public final boolean isWithDevice() {
        return this.f94689b.isWithDevice();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f94694g.clear();
    }

    public final void setCheckSimStock(boolean z) {
        this.f94689b.setCheckSimStock(z);
    }

    public final void setSimBarcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f94689b.setSimBarcode(value);
    }

    public final void setValidateSimBarcodeResponse(@Nullable OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse) {
        this.f94689b.setValidateSimBarcodeResponse(onePostpaidValidateSimBarcodeResponse);
    }

    public final void setWithContract(boolean z) {
        this.f94689b.setWithContract(z);
    }

    public final void setWithDevice(boolean z) {
        this.f94689b.setWithDevice(z);
    }

    public final void validateSimBarcode(@NotNull String barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        OnePostpaidRepository onePostpaidRepository = this.f94689b;
        Single<R> compose = onePostpaidRepository.onePostpaidValidateSimBarcode(new OnePostpaidValidateSimBarcodeRequest(this.f94689b.getUserLan(), this.f94689b.getUserFormatType(), barcode, onePostpaidRepository.getUserCode())).compose(this.f94691d.applySingleAsync());
        final OnePostpaidValidateBarcodeViewModel$validateSimBarcode$1 onePostpaidValidateBarcodeViewModel$validateSimBarcode$1 = new OnePostpaidValidateBarcodeViewModel$validateSimBarcode$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: j61
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidValidateBarcodeViewModel.m11518b(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateSimBarcode(b… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OnePostpaidValidateBarcodeViewModel$validateSimBarcode$2(this), new OnePostpaidValidateBarcodeViewModel$validateSimBarcode$3(this, barcode)), this.f94694g);
    }

    public final void validateSimTrue(@NotNull String barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        OnePostpaidRepository onePostpaidRepository = this.f94689b;
        String encryptCBC = onePostpaidRepository.encryptCBC(barcode);
        String dtrCode = this.f94689b.getModel().getDtrCode();
        if (dtrCode == null) {
            dtrCode = "";
        }
        Single<R> compose = onePostpaidRepository.onePostpaidValidateSimTrue(encryptCBC, dtrCode).compose(this.f94691d.applySingleAsync());
        final OnePostpaidValidateBarcodeViewModel$validateSimTrue$1 onePostpaidValidateBarcodeViewModel$validateSimTrue$1 = new OnePostpaidValidateBarcodeViewModel$validateSimTrue$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: i61
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidValidateBarcodeViewModel.m11517c(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateSimTrue(barc… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OnePostpaidValidateBarcodeViewModel$validateSimTrue$2(this), new OnePostpaidValidateBarcodeViewModel$validateSimTrue$3(this, barcode)), this.f94694g);
    }
}