package th.p047co.dtac.android.dtacone.viewmodel.change_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimResponseVerifyReason;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.change_sim.ChangeSimReasonValidator;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.change_sim.ChangeSimVerifyReasonViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0010J\u0019\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001cR\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010/R'\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u001cR!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\u001c¨\u00067"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/change_sim/ChangeSimVerifyReasonViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;", "requestVerifyReason", "", "withIdNumber", "", OperatorName.SAVE, "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;Z)V", "reasonRequest", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "idCardData", "verifyReasonChangeSim", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "verifyReasonChangeSimWithFace", "updateVerifyReasonRequest", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimResponseVerifyReason;", "getReasonResponse", "()Landroidx/lifecycle/MutableLiveData;", "getReasonRequest", "getIdCardData", "clearResult", "()V", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "e", "Lkotlin/Lazy;", "o", "verifyReasonRequest", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", OperatorName.NON_STROKING_GRAY, "p", "verifyReasonResponse", OperatorName.CLOSE_PATH, OperatorName.ENDPATH, "idCardDataLiveData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_sim.ChangeSimVerifyReasonViewModel */
/* loaded from: classes9.dex */
public final class ChangeSimVerifyReasonViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final RTRApiRx2 f105200b;

    /* renamed from: c */
    public final Rx2ThreadService f105201c;

    /* renamed from: d */
    public final ServerErrorService f105202d;

    /* renamed from: e */
    public final Lazy f105203e;

    /* renamed from: f */
    public final Lazy f105204f;

    /* renamed from: g */
    public final Lazy f105205g;

    /* renamed from: h */
    public final Lazy f105206h;

    @Inject
    public ChangeSimVerifyReasonViewModel(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f105200b = api;
        this.f105201c = threadService;
        this.f105202d = errorService;
        this.f105203e = LazyKt__LazyJVMKt.lazy(ChangeSimVerifyReasonViewModel$verifyReasonRequest$2.INSTANCE);
        this.f105204f = LazyKt__LazyJVMKt.lazy(ChangeSimVerifyReasonViewModel$disposable$2.INSTANCE);
        this.f105205g = LazyKt__LazyJVMKt.lazy(ChangeSimVerifyReasonViewModel$verifyReasonResponse$2.INSTANCE);
        this.f105206h = LazyKt__LazyJVMKt.lazy(ChangeSimVerifyReasonViewModel$idCardDataLiveData$2.INSTANCE);
    }

    /* renamed from: A */
    public static final ObservableSource m3292A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m3291B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m3290C(ChangeSimVerifyReasonViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }

    private final CompositeDisposable getDisposable() {
        return (CompositeDisposable) this.f105204f.getValue();
    }

    /* renamed from: r */
    public static final Unit m3273r(ChangeSimVerifyReasonViewModel this$0, ChangeSimRequestVerifyReason reasonRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reasonRequest, "$reasonRequest");
        this$0.m3274q(reasonRequest, true);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final ObservableSource m3272s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m3271t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m3270u(ChangeSimVerifyReasonViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }

    public static /* synthetic */ void updateVerifyReasonRequest$default(ChangeSimVerifyReasonViewModel changeSimVerifyReasonViewModel, ChangeSimRequestVerifyReason changeSimRequestVerifyReason, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        changeSimVerifyReasonViewModel.updateVerifyReasonRequest(changeSimRequestVerifyReason, z);
    }

    /* renamed from: v */
    public static final void m3269v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void verifyReasonChangeSim$default(ChangeSimVerifyReasonViewModel changeSimVerifyReasonViewModel, ChangeSimRequestVerifyReason changeSimRequestVerifyReason, IdCardInformationCollection idCardInformationCollection, int i, Object obj) {
        if ((i & 2) != 0) {
            idCardInformationCollection = null;
        }
        changeSimVerifyReasonViewModel.verifyReasonChangeSim(changeSimRequestVerifyReason, idCardInformationCollection);
    }

    public static /* synthetic */ void verifyReasonChangeSimWithFace$default(ChangeSimVerifyReasonViewModel changeSimVerifyReasonViewModel, ChangeSimRequestVerifyReason changeSimRequestVerifyReason, IdCardInformationCollection idCardInformationCollection, int i, Object obj) {
        if ((i & 2) != 0) {
            idCardInformationCollection = null;
        }
        changeSimVerifyReasonViewModel.verifyReasonChangeSimWithFace(changeSimRequestVerifyReason, idCardInformationCollection);
    }

    /* renamed from: w */
    public static final void m3268w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m3267x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m3266y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Unit m3265z(ChangeSimVerifyReasonViewModel this$0, ChangeSimRequestVerifyReason reasonRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reasonRequest, "$reasonRequest");
        this$0.m3274q(reasonRequest, true);
        return Unit.INSTANCE;
    }

    public final void clearResult() {
        m3276o().setValue(null);
        m3275p().setValue(null);
    }

    @NotNull
    public final MutableLiveData<IdCardInformationCollection> getIdCardData() {
        return m3277n();
    }

    @NotNull
    public final MutableLiveData<ChangeSimRequestVerifyReason> getReasonRequest() {
        return m3276o();
    }

    @NotNull
    public final MutableLiveData<Resource<ChangeSimResponseVerifyReason>> getReasonResponse() {
        return m3275p();
    }

    /* renamed from: n */
    public final MutableLiveData m3277n() {
        return (MutableLiveData) this.f105206h.getValue();
    }

    /* renamed from: o */
    public final MutableLiveData m3276o() {
        return (MutableLiveData) this.f105203e.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        m3276o().setValue(null);
        m3275p().setValue(null);
        getDisposable().clear();
    }

    /* renamed from: p */
    public final MutableLiveData m3275p() {
        return (MutableLiveData) this.f105205g.getValue();
    }

    /* renamed from: q */
    public final void m3274q(ChangeSimRequestVerifyReason changeSimRequestVerifyReason, boolean z) {
        new PhoneNumberValidator().validate(changeSimRequestVerifyReason.getSubscriberNumber());
        if (z && !StringUtil.hasText(changeSimRequestVerifyReason.getIdCardNumber())) {
            throw new ValidatedRuleException(R.string.change_sim_idcard_alert);
        }
        new ChangeSimReasonValidator().validate(changeSimRequestVerifyReason.getReasonCode());
    }

    public final void updateVerifyReasonRequest(@NotNull ChangeSimRequestVerifyReason requestVerifyReason, boolean z) {
        Intrinsics.checkNotNullParameter(requestVerifyReason, "requestVerifyReason");
        try {
            m3276o().setValue(null);
            m3274q(requestVerifyReason, z);
            m3276o().setValue(requestVerifyReason);
        } catch (ValidatedRuleException e) {
            this.f105202d.handleException(e, new ServerErrorService.ExceptionHandler[0]);
        }
    }

    public final void verifyReasonChangeSim(@NotNull final ChangeSimRequestVerifyReason reasonRequest, @Nullable IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(reasonRequest, "reasonRequest");
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: ro
            {
                ChangeSimVerifyReasonViewModel.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m3273r;
                m3273r = ChangeSimVerifyReasonViewModel.m3273r(ChangeSimVerifyReasonViewModel.this, reasonRequest);
                return m3273r;
            }
        });
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$2 changeSimVerifyReasonViewModel$verifyReasonChangeSim$2 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$2(this, reasonRequest);
        Observable compose = fromCallable.flatMap(new Function() { // from class: uo
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m3272s;
                m3272s = ChangeSimVerifyReasonViewModel.m3272s(Function1.this, obj);
                return m3272s;
            }
        }).compose(this.f105201c.applyAsync());
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$3 changeSimVerifyReasonViewModel$verifyReasonChangeSim$3 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$3(this);
        Observable doOnTerminate = compose.doOnSubscribe(new Consumer() { // from class: vo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonViewModel.m3271t(changeSimVerifyReasonViewModel$verifyReasonChangeSim$3, obj);
            }
        }).doOnTerminate(new Action() { // from class: wo
            {
                ChangeSimVerifyReasonViewModel.this = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                ChangeSimVerifyReasonViewModel.m3270u(ChangeSimVerifyReasonViewModel.this);
            }
        });
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$5 changeSimVerifyReasonViewModel$verifyReasonChangeSim$5 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$5(this, idCardInformationCollection, reasonRequest);
        Consumer consumer = new Consumer() { // from class: xo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonViewModel.m3269v(changeSimVerifyReasonViewModel$verifyReasonChangeSim$5, obj);
            }
        };
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$6 changeSimVerifyReasonViewModel$verifyReasonChangeSim$6 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSim$6(this);
        Disposable subscribe = doOnTerminate.subscribe(consumer, new Consumer() { // from class: yo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonViewModel.m3268w(changeSimVerifyReasonViewModel$verifyReasonChangeSim$6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun verifyReasonChangeSi…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, getDisposable());
    }

    public final void verifyReasonChangeSimWithFace(@NotNull final ChangeSimRequestVerifyReason reasonRequest, @Nullable IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(reasonRequest, "reasonRequest");
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: zo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m3265z;
                m3265z = ChangeSimVerifyReasonViewModel.m3265z(ChangeSimVerifyReasonViewModel.this, reasonRequest);
                return m3265z;
            }
        });
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$2 changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$2 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$2(this, reasonRequest);
        Observable compose = fromCallable.flatMap(new Function() { // from class: Ao
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m3292A;
                m3292A = ChangeSimVerifyReasonViewModel.m3292A(changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$2, obj);
                return m3292A;
            }
        }).compose(this.f105201c.applyAsync());
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$3 changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$3 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$3(this);
        Observable doOnTerminate = compose.doOnSubscribe(new Consumer() { // from class: Bo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonViewModel.m3291B(changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$3, obj);
            }
        }).doOnTerminate(new Action() { // from class: Co
            {
                ChangeSimVerifyReasonViewModel.this = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                ChangeSimVerifyReasonViewModel.m3290C(ChangeSimVerifyReasonViewModel.this);
            }
        });
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5 changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5(this, idCardInformationCollection, reasonRequest);
        Consumer consumer = new Consumer() { // from class: so
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonViewModel.m3267x(changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$5, obj);
            }
        };
        final ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$6 changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$6 = new ChangeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$6(this);
        Disposable subscribe = doOnTerminate.subscribe(consumer, new Consumer() { // from class: to
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonViewModel.m3266y(changeSimVerifyReasonViewModel$verifyReasonChangeSimWithFace$6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun verifyReasonChangeSi…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, getDisposable());
    }
}