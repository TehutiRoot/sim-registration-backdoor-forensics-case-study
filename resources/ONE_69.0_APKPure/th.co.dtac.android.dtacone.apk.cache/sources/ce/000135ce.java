package th.p047co.dtac.android.dtacone.view.appOne.online_activation.viewModel;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.online_activation.OneOnlineActivationThemeColorModel;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.repository.OneOnlineActivationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.viewModel.OneOnlineActivationViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R3\u0010=\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020807060+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R/\u0010@\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002080706008\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R3\u0010B\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020807060+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\bA\u0010<R/\u0010D\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002080706008\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bC\u00104R\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/online_activation/viewModel/OneOnlineActivationViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/online_activation/repository/OneOnlineActivationRepository;", "repository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/online_activation/repository/OneOnlineActivationRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;)V", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "requestOtpBody", "", "isResendOtp", "", "getOTP", "(Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;Z)V", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "verifyOtpRequest", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "verifyOTP", "(Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/online_activation/repository/OneOnlineActivationRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "d", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "e", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Event;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/MutableLiveData;", "_activateResponse", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getActivateResponse", "()Landroidx/lifecycle/LiveData;", "activateResponse", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/Lazy;", OperatorName.LINE_TO, "()Landroidx/lifecycle/MutableLiveData;", "_getOTPResponse", OperatorName.NON_STROKING_CMYK, "getGetOTPResponse", "getOTPResponse", OperatorName.MOVE_TO, "_resendOTPResponse", "getResendOTPResponse", "resendOTPResponse", "Lth/co/dtac/android/dtacone/model/appOne/online_activation/OneOnlineActivationThemeColorModel;", "getThemeColorModel", "()Lth/co/dtac/android/dtacone/model/appOne/online_activation/OneOnlineActivationThemeColorModel;", "themeColorModel", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.viewModel.OneOnlineActivationViewModel */
/* loaded from: classes10.dex */
public final class OneOnlineActivationViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneOnlineActivationRepository f93013b;

    /* renamed from: c */
    public final PreferencesViewModel f93014c;

    /* renamed from: d */
    public final ConfigurationRepository f93015d;

    /* renamed from: e */
    public final Rx2ThreadService f93016e;

    /* renamed from: f */
    public final OneErrorService f93017f;

    /* renamed from: g */
    public final CompositeDisposable f93018g;

    /* renamed from: h */
    public final MutableLiveData f93019h;

    /* renamed from: i */
    public final LiveData f93020i;

    /* renamed from: j */
    public final Lazy f93021j;

    /* renamed from: k */
    public final LiveData f93022k;

    /* renamed from: l */
    public final Lazy f93023l;

    /* renamed from: m */
    public final LiveData f93024m;

    @Inject
    public OneOnlineActivationViewModel(@NotNull OneOnlineActivationRepository repository, @NotNull PreferencesViewModel pfViewModel, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f93013b = repository;
        this.f93014c = pfViewModel;
        this.f93015d = configurationRepository;
        this.f93016e = threadService;
        this.f93017f = errorService;
        this.f93018g = new CompositeDisposable();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f93019h = mutableLiveData;
        this.f93020i = mutableLiveData;
        this.f93021j = LazyKt__LazyJVMKt.lazy(OneOnlineActivationViewModel$_getOTPResponse$2.INSTANCE);
        this.f93022k = m12808l();
        this.f93023l = LazyKt__LazyJVMKt.lazy(OneOnlineActivationViewModel$_resendOTPResponse$2.INSTANCE);
        this.f93024m = m12807m();
    }

    /* renamed from: b */
    public static /* synthetic */ void m12818b(Function1 function1, Object obj) {
        m12805o(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ ObservableSource m12817c(Function1 function1, Object obj) {
        return m12806n(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m12816d(Function1 function1, Object obj) {
        m12804p(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m12815e(Function1 function1, Object obj) {
        m12810j(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m12814f(Function1 function1, Object obj) {
        m12809k(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m12813g(Function1 function1, Object obj) {
        m12811i(function1, obj);
    }

    public static /* synthetic */ void getOTP$default(OneOnlineActivationViewModel oneOnlineActivationViewModel, RequestOtpBody requestOtpBody, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        oneOnlineActivationViewModel.getOTP(requestOtpBody, z);
    }

    /* renamed from: h */
    public static /* synthetic */ void m12812h(Function1 function1, Object obj) {
        m12803q(function1, obj);
    }

    /* renamed from: i */
    public static final void m12811i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m12810j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m12809k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final ObservableSource m12806n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m12805o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m12804p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m12803q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @NotNull
    public final LiveData<Event<Boolean>> getActivateResponse() {
        return this.f93020i;
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f93018g;
    }

    @NotNull
    public final LiveData<Resource<Pair<String, RequestOtpResponse>>> getGetOTPResponse() {
        return this.f93022k;
    }

    public final void getOTP(@NotNull RequestOtpBody requestOtpBody, boolean z) {
        Intrinsics.checkNotNullParameter(requestOtpBody, "requestOtpBody");
        Observable<R> compose = this.f93013b.getOTP(requestOtpBody).compose(this.f93016e.applyAsync());
        final OneOnlineActivationViewModel$getOTP$1 oneOnlineActivationViewModel$getOTP$1 = new OneOnlineActivationViewModel$getOTP$1(z, this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: VY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOnlineActivationViewModel.m12813g(Function1.this, obj);
            }
        });
        final OneOnlineActivationViewModel$getOTP$2 oneOnlineActivationViewModel$getOTP$2 = new OneOnlineActivationViewModel$getOTP$2(z, this, requestOtpBody);
        Consumer consumer = new Consumer() { // from class: WY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOnlineActivationViewModel.m12815e(Function1.this, obj);
            }
        };
        final OneOnlineActivationViewModel$getOTP$3 oneOnlineActivationViewModel$getOTP$3 = new OneOnlineActivationViewModel$getOTP$3(this, z);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: XY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOnlineActivationViewModel.m12814f(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun getOTP(requestOtpBod…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f93018g);
    }

    @NotNull
    public final LiveData<Resource<Pair<String, RequestOtpResponse>>> getResendOTPResponse() {
        return this.f93024m;
    }

    @NotNull
    public final OneOnlineActivationThemeColorModel getThemeColorModel() {
        if (Intrinsics.areEqual(this.f93014c.getCompany(), "TRUE")) {
            return new OneOnlineActivationThemeColorModel(R.style.OneTrueAppTheme, R.drawable.background_one_toolbar_red, R.color.red4, R.drawable.selector_rectangle_red, R.drawable.background_cursor_red, R.color.red5, R.drawable.background_one_button_red, R.drawable.success_dialog_red);
        }
        int i = R.style.OneDtacAppTheme;
        int i2 = R.drawable.background_one_toolbar_blue;
        int i3 = R.color.niceBlueFive;
        return new OneOnlineActivationThemeColorModel(i, i2, i3, R.drawable.selector_rectangle_blue, R.drawable.background_cursor_blue, i3, R.drawable.background_one_button_blue, R.drawable.success_dialog);
    }

    /* renamed from: l */
    public final MutableLiveData m12808l() {
        return (MutableLiveData) this.f93021j.getValue();
    }

    /* renamed from: m */
    public final MutableLiveData m12807m() {
        return (MutableLiveData) this.f93023l.getValue();
    }

    public final void verifyOTP(@NotNull VerifyOtpRequest verifyOtpRequest, @NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(verifyOtpRequest, "verifyOtpRequest");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Observable<TokenCollection> verifyOTP = this.f93013b.verifyOTP(verifyOtpRequest);
        final OneOnlineActivationViewModel$verifyOTP$1 oneOnlineActivationViewModel$verifyOTP$1 = new OneOnlineActivationViewModel$verifyOTP$1(this, phoneNumber);
        Observable compose = verifyOTP.flatMap(new Function() { // from class: YY0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneOnlineActivationViewModel.m12817c(Function1.this, obj);
            }
        }).compose(this.f93016e.applyAsync());
        final OneOnlineActivationViewModel$verifyOTP$2 oneOnlineActivationViewModel$verifyOTP$2 = new OneOnlineActivationViewModel$verifyOTP$2(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: ZY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOnlineActivationViewModel.m12818b(Function1.this, obj);
            }
        });
        final OneOnlineActivationViewModel$verifyOTP$3 oneOnlineActivationViewModel$verifyOTP$3 = new OneOnlineActivationViewModel$verifyOTP$3(this);
        Consumer consumer = new Consumer() { // from class: aZ0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOnlineActivationViewModel.m12816d(Function1.this, obj);
            }
        };
        final OneOnlineActivationViewModel$verifyOTP$4 oneOnlineActivationViewModel$verifyOTP$4 = new OneOnlineActivationViewModel$verifyOTP$4(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: bZ0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOnlineActivationViewModel.m12812h(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun verifyOTP(verifyOtpR…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f93018g);
    }
}