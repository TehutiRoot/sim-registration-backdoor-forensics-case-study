package th.p047co.dtac.android.dtacone.viewmodel.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.self_update.RtrProfileResponse;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.ISwipeRefresh;
import th.p047co.dtac.android.dtacone.viewmodel.self_update.RtrProfileViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R!\u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/self_update/RtrProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "requestId", "getRrtProfile", "(I)V", "onCleared", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "getErrorService", "()Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "Lth/co/dtac/android/dtacone/viewmodel/self_update/RtrProfileViewModel$View;", "d", "Lth/co/dtac/android/dtacone/viewmodel/self_update/RtrProfileViewModel$View;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileResponse;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", "getViewModelRtrProfile", "()Landroidx/lifecycle/MutableLiveData;", "viewModelRtrProfile", "Companion", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.self_update.RtrProfileViewModel */
/* loaded from: classes9.dex */
public final class RtrProfileViewModel extends ViewModel {
    public static final int REQUEST_CODE_EDIT_ADDRESS = 1;
    public static final int REQUEST_CODE_EDIT_PROFILE = 0;

    /* renamed from: a */
    public final RTRApiRx2 f107041a;

    /* renamed from: b */
    public final Rx2ThreadService f107042b;

    /* renamed from: c */
    public final ServerErrorService f107043c;

    /* renamed from: d */
    public View f107044d;

    /* renamed from: e */
    public final CompositeDisposable f107045e;

    /* renamed from: f */
    public final Lazy f107046f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/self_update/RtrProfileViewModel$Companion;", "", "()V", "REQUEST_CODE_EDIT_ADDRESS", "", "REQUEST_CODE_EDIT_PROFILE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.self_update.RtrProfileViewModel$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/self_update/RtrProfileViewModel$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ISwipeRefresh;", "onRtrProfileNotFound", "", "message", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.self_update.RtrProfileViewModel$View */
    /* loaded from: classes9.dex */
    public interface View extends IPresenter.IView, ISwipeRefresh {
        void onRtrProfileNotFound(@Nullable String str);
    }

    @Inject
    public RtrProfileViewModel(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f107041a = api;
        this.f107042b = threadService;
        this.f107043c = errorService;
        this.f107045e = new CompositeDisposable();
        this.f107046f = LazyKt__LazyJVMKt.lazy(RtrProfileViewModel$viewModelRtrProfile$2.INSTANCE);
    }

    /* renamed from: f */
    public static final RtrProfileResponse m1906f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RtrProfileResponse) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m1905g(RtrProfileViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f107044d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSwipeRefresh();
    }

    public static /* synthetic */ void getRrtProfile$default(RtrProfileViewModel rtrProfileViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 99;
        }
        rtrProfileViewModel.getRrtProfile(i);
    }

    /* renamed from: h */
    public static final void m1904h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m1903i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.viewmodel.self_update.RtrProfileViewModel.View");
        this.f107044d = (View) iView;
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f107041a;
    }

    @NotNull
    public final ServerErrorService getErrorService() {
        return this.f107043c;
    }

    public final void getRrtProfile(int i) {
        View view = this.f107044d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSwipeRefresh();
        CompositeDisposable compositeDisposable = this.f107045e;
        Observable<R> compose = this.f107041a.getRtrProfile().compose(this.f107042b.applyAsync());
        final RtrProfileViewModel$getRrtProfile$1 rtrProfileViewModel$getRrtProfile$1 = new RtrProfileViewModel$getRrtProfile$1(i);
        Observable doOnTerminate = compose.map(new Function() { // from class: kA1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                RtrProfileResponse m1906f;
                m1906f = RtrProfileViewModel.m1906f(rtrProfileViewModel$getRrtProfile$1, obj);
                return m1906f;
            }
        }).doOnTerminate(new Action() { // from class: lA1
            {
                RtrProfileViewModel.this = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                RtrProfileViewModel.m1905g(RtrProfileViewModel.this);
            }
        });
        final RtrProfileViewModel$getRrtProfile$3 rtrProfileViewModel$getRrtProfile$3 = new RtrProfileViewModel$getRrtProfile$3(this);
        Consumer consumer = new Consumer() { // from class: mA1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RtrProfileViewModel.m1904h(rtrProfileViewModel$getRrtProfile$3, obj);
            }
        };
        final RtrProfileViewModel$getRrtProfile$4 rtrProfileViewModel$getRrtProfile$4 = new RtrProfileViewModel$getRrtProfile$4(this);
        compositeDisposable.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: nA1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RtrProfileViewModel.m1903i(rtrProfileViewModel$getRrtProfile$4, obj);
            }
        }));
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f107042b;
    }

    @NotNull
    public final MutableLiveData<RtrProfileResponse> getViewModelRtrProfile() {
        return (MutableLiveData) this.f107046f.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f107045e.clear();
    }
}