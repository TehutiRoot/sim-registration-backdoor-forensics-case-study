package th.p047co.dtac.android.dtacone.presenter.login;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.login.NewVerifyOtpPresenter;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00012B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/login/NewVerifyOtpPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/TemporaryCache;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "verifyOtpRequest", "", "forVerifySimR", "verifyOtp", "(Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;Z)V", "onDestroy", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "getErrorService", "()Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "d", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "getTemporaryCache", "()Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "Lth/co/dtac/android/dtacone/presenter/login/NewVerifyOtpPresenter$View;", "e", "Lth/co/dtac/android/dtacone/presenter/login/NewVerifyOtpPresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", "i", "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.login.NewVerifyOtpPresenter */
/* loaded from: classes8.dex */
public final class NewVerifyOtpPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f85963a;

    /* renamed from: b */
    public final Rx2ThreadService f85964b;

    /* renamed from: c */
    public final ServerErrorService f85965c;

    /* renamed from: d */
    public final TemporaryCache f85966d;

    /* renamed from: e */
    public View f85967e;

    /* renamed from: f */
    public final Lazy f85968f;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/login/NewVerifyOtpPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onVerifyOtpFail", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "onVerifyOtpSuccess", "token", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.login.NewVerifyOtpPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onVerifyOtpFail(@NotNull ErrorCollection errorCollection);

        void onVerifyOtpSuccess(@NotNull TokenCollection tokenCollection);
    }

    @Inject
    public NewVerifyOtpPresenter(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService, @NotNull TemporaryCache temporaryCache) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.f85963a = api;
        this.f85964b = threadService;
        this.f85965c = errorService;
        this.f85966d = temporaryCache;
        this.f85968f = LazyKt__LazyJVMKt.lazy(NewVerifyOtpPresenter$subscription$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m17920a(Function1 function1, Object obj) {
        return m17910k(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ String m17919b(Function1 function1, Object obj) {
        return m17911j(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ ObservableSource m17918c(Function1 function1, Object obj) {
        return m17908m(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17917d(NewVerifyOtpPresenter newVerifyOtpPresenter) {
        m17906o(newVerifyOtpPresenter);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17916e(Function1 function1, Object obj) {
        m17905p(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m17915f(Function1 function1, Object obj) {
        m17907n(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m17914g(Function1 function1, Object obj) {
        m17904q(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ void m17913h(Function1 function1, Object obj) {
        m17909l(function1, obj);
    }

    /* renamed from: i */
    private final CompositeDisposable m17912i() {
        return (CompositeDisposable) this.f85968f.getValue();
    }

    /* renamed from: j */
    public static final String m17911j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final boolean m17910k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: l */
    public static final void m17909l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final ObservableSource m17908m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m17907n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m17906o(NewVerifyOtpPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85967e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: p */
    public static final void m17905p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m17904q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.login.NewVerifyOtpPresenter.View");
        this.f85967e = (View) iView;
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f85963a;
    }

    @NotNull
    public final ServerErrorService getErrorService() {
        return this.f85965c;
    }

    @NotNull
    public final TemporaryCache getTemporaryCache() {
        return this.f85966d;
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f85964b;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m17912i().clear();
    }

    public final void verifyOtp(@NotNull VerifyOtpRequest verifyOtpRequest, boolean z) {
        Intrinsics.checkNotNullParameter(verifyOtpRequest, "verifyOtpRequest");
        View view = this.f85967e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable m17912i = m17912i();
        Observable just = Observable.just(PhoneNumberFormat.removeAllSpecialCharacter(verifyOtpRequest.getMobileNumber()));
        final NewVerifyOtpPresenter$verifyOtp$1 newVerifyOtpPresenter$verifyOtp$1 = NewVerifyOtpPresenter$verifyOtp$1.INSTANCE;
        Observable map = just.map(new Function() { // from class: xH0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return NewVerifyOtpPresenter.m17919b(Function1.this, obj);
            }
        });
        final NewVerifyOtpPresenter$verifyOtp$2 newVerifyOtpPresenter$verifyOtp$2 = NewVerifyOtpPresenter$verifyOtp$2.INSTANCE;
        Observable filter = map.filter(new Predicate() { // from class: yH0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return NewVerifyOtpPresenter.m17920a(Function1.this, obj);
            }
        });
        final NewVerifyOtpPresenter$verifyOtp$3 newVerifyOtpPresenter$verifyOtp$3 = new NewVerifyOtpPresenter$verifyOtp$3(verifyOtpRequest);
        Observable doOnNext = filter.doOnNext(new Consumer() { // from class: zH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NewVerifyOtpPresenter.m17913h(Function1.this, obj);
            }
        });
        final NewVerifyOtpPresenter$verifyOtp$4 newVerifyOtpPresenter$verifyOtp$4 = new NewVerifyOtpPresenter$verifyOtp$4(this, verifyOtpRequest);
        Observable flatMap = doOnNext.flatMap(new Function() { // from class: AH0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return NewVerifyOtpPresenter.m17918c(Function1.this, obj);
            }
        });
        final NewVerifyOtpPresenter$verifyOtp$5 newVerifyOtpPresenter$verifyOtp$5 = new NewVerifyOtpPresenter$verifyOtp$5(z, this);
        Observable doOnTerminate = flatMap.doOnNext(new Consumer() { // from class: BH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NewVerifyOtpPresenter.m17915f(Function1.this, obj);
            }
        }).compose(this.f85964b.applyAsync()).doOnTerminate(new Action() { // from class: CH0
            @Override // io.reactivex.functions.Action
            public final void run() {
                NewVerifyOtpPresenter.m17917d(NewVerifyOtpPresenter.this);
            }
        });
        final NewVerifyOtpPresenter$verifyOtp$7 newVerifyOtpPresenter$verifyOtp$7 = new NewVerifyOtpPresenter$verifyOtp$7(this);
        Consumer consumer = new Consumer() { // from class: DH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NewVerifyOtpPresenter.m17916e(Function1.this, obj);
            }
        };
        final NewVerifyOtpPresenter$verifyOtp$8 newVerifyOtpPresenter$verifyOtp$8 = new NewVerifyOtpPresenter$verifyOtp$8(this);
        m17912i.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: EH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NewVerifyOtpPresenter.m17914g(Function1.this, obj);
            }
        }));
    }
}