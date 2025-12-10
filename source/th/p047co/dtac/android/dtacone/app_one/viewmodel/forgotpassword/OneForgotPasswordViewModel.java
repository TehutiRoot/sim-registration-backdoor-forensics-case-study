package th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
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
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordRequest;
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R'\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R'\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060)0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R#\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060)008\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u00104R'\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060)0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b=\u0010.R#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060)008\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R'\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060)0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b?\u0010.R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060)008\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\bC\u00104R!\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\b:\u0010.R(\u0010M\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/viewmodel/forgotpassword/OneForgotPasswordViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "<init>", "(Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/manager/TemporaryCache;)V", "", "clearNextStepRequestOtp", "()V", "clearNavigateVerifyOtp", "", "event", "checkForgotPassword", "(Ljava/lang/String;)V", "", "isLoading", "requestOtp", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "verifyOTP", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "e", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", OperatorName.NON_STROKING_CMYK, "()Landroidx/lifecycle/MutableLiveData;", "_checkForgotPasswordResponse", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getCheckForgotPasswordResponse", "()Landroidx/lifecycle/LiveData;", "checkForgotPasswordResponse", "Ljava/lang/Void;", "i", OperatorName.ENDPATH, "_nextStepRequestOtpInput", OperatorName.SET_LINE_JOINSTYLE, "getNextStepRequestOtpInput", "nextStepRequestOtpInput", OperatorName.MOVE_TO, "_nextStepRequestOtp", OperatorName.LINE_TO, "getNextStepRequestOtp", "nextStepRequestOtp", "_navigateVerifyOtp", "getNavigateVerifyOtp", "navigateVerifyOtp", "o", "verifyToken", "Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "value", "getForgotPasswordData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "setForgotPasswordData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;)V", "forgotPasswordData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel */
/* loaded from: classes7.dex */
public final class OneForgotPasswordViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneForgotPasswordRepository f82590b;

    /* renamed from: c */
    public final Rx2ThreadService f82591c;

    /* renamed from: d */
    public final OneErrorService f82592d;

    /* renamed from: e */
    public final TemporaryCache f82593e;

    /* renamed from: f */
    public final CompositeDisposable f82594f;

    /* renamed from: g */
    public final Lazy f82595g;

    /* renamed from: h */
    public final LiveData f82596h;

    /* renamed from: i */
    public final Lazy f82597i;

    /* renamed from: j */
    public final LiveData f82598j;

    /* renamed from: k */
    public final Lazy f82599k;

    /* renamed from: l */
    public final LiveData f82600l;

    /* renamed from: m */
    public final Lazy f82601m;

    /* renamed from: n */
    public final LiveData f82602n;

    /* renamed from: o */
    public final Lazy f82603o;

    @Inject
    public OneForgotPasswordViewModel(@NotNull OneForgotPasswordRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService, @NotNull TemporaryCache temporaryCache) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.f82590b = repository;
        this.f82591c = threadService;
        this.f82592d = oneErrorService;
        this.f82593e = temporaryCache;
        this.f82594f = new CompositeDisposable();
        this.f82595g = LazyKt__LazyJVMKt.lazy(OneForgotPasswordViewModel$_checkForgotPasswordResponse$2.INSTANCE);
        this.f82596h = m20067k();
        this.f82597i = LazyKt__LazyJVMKt.lazy(OneForgotPasswordViewModel$_nextStepRequestOtpInput$2.INSTANCE);
        this.f82598j = m20064n();
        this.f82599k = LazyKt__LazyJVMKt.lazy(OneForgotPasswordViewModel$_nextStepRequestOtp$2.INSTANCE);
        this.f82600l = m20065m();
        this.f82601m = LazyKt__LazyJVMKt.lazy(OneForgotPasswordViewModel$_navigateVerifyOtp$2.INSTANCE);
        this.f82602n = m20066l();
        this.f82603o = LazyKt__LazyJVMKt.lazy(OneForgotPasswordViewModel$verifyToken$2.INSTANCE);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20076b(Function1 function1, Object obj) {
        m20063o(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20075c(Function1 function1, Object obj) {
        m20059s(function1, obj);
    }

    public static /* synthetic */ void checkForgotPassword$default(OneForgotPasswordViewModel oneForgotPasswordViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constant.EVENT_ONE_FORGOT_PASSWORD;
        }
        oneForgotPasswordViewModel.checkForgotPassword(str);
    }

    /* renamed from: d */
    public static /* synthetic */ void m20074d(Function1 function1, Object obj) {
        m20062p(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m20073e(Function1 function1, Object obj) {
        m20061q(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m20072f(Function1 function1, Object obj) {
        m20060r(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m20071g(Function1 function1, Object obj) {
        m20069i(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ void m20070h(Function1 function1, Object obj) {
        m20058t(function1, obj);
    }

    /* renamed from: i */
    public static final void m20069i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m20063o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m20062p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m20061q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m20060r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void requestOtp$default(OneForgotPasswordViewModel oneForgotPasswordViewModel, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i & 2) != 0) {
            str = Constant.EVENT_ONE_FORGOT_PASSWORD;
        }
        oneForgotPasswordViewModel.requestOtp(bool, str);
    }

    /* renamed from: s */
    public static final void m20059s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m20058t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void verifyOTP$default(OneForgotPasswordViewModel oneForgotPasswordViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constant.EVENT_ONE_FORGOT_PASSWORD;
        }
        oneForgotPasswordViewModel.verifyOTP(str);
    }

    public final void checkForgotPassword(@NotNull String event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        OneForgotPasswordRepository oneForgotPasswordRepository = this.f82590b;
        OneForgotPassword forgotPasswordData = getForgotPasswordData();
        String str2 = null;
        if (forgotPasswordData != null) {
            str = forgotPasswordData.getPhoneNumber();
        } else {
            str = null;
        }
        String encryptPhoneNumberString = oneForgotPasswordRepository.encryptPhoneNumberString(PhoneNumberExtKt.toInternational(str));
        OneForgotPasswordRepository oneForgotPasswordRepository2 = this.f82590b;
        OneForgotPassword forgotPasswordData2 = getForgotPasswordData();
        if (forgotPasswordData2 != null) {
            str2 = forgotPasswordData2.getPassword();
        }
        Single<R> compose = oneForgotPasswordRepository.checkForgotPassword(new ForgotPasswordRequest(encryptPhoneNumberString, oneForgotPasswordRepository2.encryptCBC(String.valueOf(str2)), event)).compose(this.f82591c.applySingleAsync());
        final OneForgotPasswordViewModel$checkForgotPassword$1 oneForgotPasswordViewModel$checkForgotPassword$1 = new OneForgotPasswordViewModel$checkForgotPassword$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: aT0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20071g(oneForgotPasswordViewModel$checkForgotPassword$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun checkForgotPassword(…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneForgotPasswordViewModel$checkForgotPassword$2(this), new OneForgotPasswordViewModel$checkForgotPassword$3(this)), this.f82594f);
    }

    public final void clearNavigateVerifyOtp() {
        m20066l().setValue(null);
    }

    public final void clearNextStepRequestOtp() {
        m20065m().setValue(null);
    }

    @NotNull
    public final LiveData<Resource<ForgotPasswordResponse>> getCheckForgotPasswordResponse() {
        return this.f82596h;
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f82594f;
    }

    @Nullable
    public final OneForgotPassword getForgotPasswordData() {
        return this.f82590b.getForgotPasswordData();
    }

    @NotNull
    public final LiveData<Resource<Void>> getNavigateVerifyOtp() {
        return this.f82602n;
    }

    @NotNull
    public final LiveData<Resource<Void>> getNextStepRequestOtp() {
        return this.f82600l;
    }

    @NotNull
    public final LiveData<Resource<Void>> getNextStepRequestOtpInput() {
        return this.f82598j;
    }

    /* renamed from: j */
    public final MutableLiveData m20068j() {
        return (MutableLiveData) this.f82603o.getValue();
    }

    /* renamed from: k */
    public final MutableLiveData m20067k() {
        return (MutableLiveData) this.f82595g.getValue();
    }

    /* renamed from: l */
    public final MutableLiveData m20066l() {
        return (MutableLiveData) this.f82601m.getValue();
    }

    /* renamed from: m */
    public final MutableLiveData m20065m() {
        return (MutableLiveData) this.f82599k.getValue();
    }

    /* renamed from: n */
    public final MutableLiveData m20064n() {
        return (MutableLiveData) this.f82597i.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f82594f.clear();
        this.f82590b.clear();
    }

    public final void requestOtp(@Nullable Boolean bool, @NotNull String event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        OneForgotPasswordRepository oneForgotPasswordRepository = this.f82590b;
        OneForgotPassword forgotPasswordData = getForgotPasswordData();
        if (forgotPasswordData != null) {
            str = forgotPasswordData.getPhoneNumber();
        } else {
            str = null;
        }
        Observable<R> compose = oneForgotPasswordRepository.requestOtp(new RequestOtpBody(PhoneNumberExtKt.toInternational(str), event)).compose(this.f82591c.applyAsync());
        final OneForgotPasswordViewModel$requestOtp$1 oneForgotPasswordViewModel$requestOtp$1 = new OneForgotPasswordViewModel$requestOtp$1(bool, this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: US0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20076b(oneForgotPasswordViewModel$requestOtp$1, obj);
            }
        });
        final OneForgotPasswordViewModel$requestOtp$2 oneForgotPasswordViewModel$requestOtp$2 = new OneForgotPasswordViewModel$requestOtp$2(this, bool);
        Consumer consumer = new Consumer() { // from class: VS0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20074d(oneForgotPasswordViewModel$requestOtp$2, obj);
            }
        };
        final OneForgotPasswordViewModel$requestOtp$3 oneForgotPasswordViewModel$requestOtp$3 = new OneForgotPasswordViewModel$requestOtp$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: WS0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20073e(oneForgotPasswordViewModel$requestOtp$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun requestOtp(isLoading… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82594f);
    }

    public final void setForgotPasswordData(@Nullable OneForgotPassword oneForgotPassword) {
        this.f82590b.setForgotPasswordData(oneForgotPassword);
    }

    public final void verifyOTP(@NotNull String event) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(event, "event");
        CharSequence charSequence = (CharSequence) m20068j().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            checkForgotPassword(event);
            return;
        }
        OneForgotPasswordRepository oneForgotPasswordRepository = this.f82590b;
        OneForgotPassword forgotPasswordData = getForgotPasswordData();
        String str3 = null;
        if (forgotPasswordData != null) {
            str = forgotPasswordData.getPhoneNumber();
        } else {
            str = null;
        }
        String international = PhoneNumberExtKt.toInternational(str);
        OneForgotPassword forgotPasswordData2 = getForgotPasswordData();
        if (forgotPasswordData2 != null) {
            str2 = forgotPasswordData2.getVerifyOTP();
        } else {
            str2 = null;
        }
        OneForgotPassword forgotPasswordData3 = getForgotPasswordData();
        if (forgotPasswordData3 != null) {
            str3 = forgotPasswordData3.getHref();
        }
        Observable<R> compose = oneForgotPasswordRepository.verifyOTP(new VerifyOtpRequest(international, str2, str3, event)).compose(this.f82591c.applyAsync());
        final OneForgotPasswordViewModel$verifyOTP$1 oneForgotPasswordViewModel$verifyOTP$1 = new OneForgotPasswordViewModel$verifyOTP$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: XS0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20072f(oneForgotPasswordViewModel$verifyOTP$1, obj);
            }
        });
        final OneForgotPasswordViewModel$verifyOTP$2 oneForgotPasswordViewModel$verifyOTP$2 = new OneForgotPasswordViewModel$verifyOTP$2(this, event);
        Consumer consumer = new Consumer() { // from class: YS0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20075c(oneForgotPasswordViewModel$verifyOTP$2, obj);
            }
        };
        final OneForgotPasswordViewModel$verifyOTP$3 oneForgotPasswordViewModel$verifyOTP$3 = new OneForgotPasswordViewModel$verifyOTP$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: ZS0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneForgotPasswordViewModel.m20070h(oneForgotPasswordViewModel$verifyOTP$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun verifyOTP(event: Str…rd(event)\n        }\n    }");
        DisposableKt.addTo(subscribe, this.f82594f);
    }
}
