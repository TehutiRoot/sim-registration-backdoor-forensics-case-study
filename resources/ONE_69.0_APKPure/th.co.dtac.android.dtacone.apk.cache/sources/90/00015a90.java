package th.p047co.dtac.android.dtacone.viewmodel.online_store;

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
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.online_store.AuthenOnlineStoreRequest;
import th.p047co.dtac.android.dtacone.model.online_store.AuthenOnlineStoreResponse;
import th.p047co.dtac.android.dtacone.presenter.ISecondaryLoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.online_store.AuthenticationOnlineStoreViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010(R\u0016\u0010\u000e\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/online_store/AuthenticationOnlineStoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lth/co/dtac/android/dtacone/presenter/IViewModel;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "thread", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "serverError", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "repository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;)V", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;)V", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/online_store/AuthenOnlineStoreResponse;", "getAuthenticationResponseLiveData", "()Landroidx/lifecycle/MutableLiveData;", "authenticationOnlineStore", "()V", "onCleared", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "d", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "e", "Lkotlin/Lazy;", OperatorName.CLOSE_PATH, "authenticationResponse", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Lth/co/dtac/android/dtacone/viewmodel/online_store/AuthenticationOnlineStoreViewModel$View;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/viewmodel/online_store/AuthenticationOnlineStoreViewModel$View;", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.online_store.AuthenticationOnlineStoreViewModel */
/* loaded from: classes9.dex */
public final class AuthenticationOnlineStoreViewModel extends ViewModel implements IViewModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f106970a;

    /* renamed from: b */
    public final Rx2ThreadService f106971b;

    /* renamed from: c */
    public final ServerErrorService f106972c;

    /* renamed from: d */
    public final RtrRepository f106973d;

    /* renamed from: e */
    public final Lazy f106974e;

    /* renamed from: f */
    public final Lazy f106975f;

    /* renamed from: g */
    public View f106976g;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/online_store/AuthenticationOnlineStoreViewModel$View;", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", "Lth/co/dtac/android/dtacone/presenter/ISecondaryLoadingViewable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.online_store.AuthenticationOnlineStoreViewModel$View */
    /* loaded from: classes9.dex */
    public interface View extends IViewModel.IView, ISecondaryLoadingViewable {
    }

    public AuthenticationOnlineStoreViewModel(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService thread, @NotNull ServerErrorService serverError, @NotNull RtrRepository repository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f106970a = api;
        this.f106971b = thread;
        this.f106972c = serverError;
        this.f106973d = repository;
        this.f106974e = LazyKt__LazyJVMKt.lazy(AuthenticationOnlineStoreViewModel$authenticationResponse$2.INSTANCE);
        this.f106975f = LazyKt__LazyJVMKt.lazy(AuthenticationOnlineStoreViewModel$disposable$2.INSTANCE);
    }

    /* renamed from: e */
    public static final void m1942e(AuthenticationOnlineStoreViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f106976g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
    }

    /* renamed from: f */
    public static final void m1941f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m1940g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final CompositeDisposable getDisposable() {
        return (CompositeDisposable) this.f106975f.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IViewModel
    public void attachView(@NotNull IViewModel.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f106976g = (View) view;
    }

    public final void authenticationOnlineStore() {
        String rtrCode = this.f106973d.getUserSession().getRtrCode();
        String userLogin = this.f106973d.getSessionNow().getRetailerNumber();
        Intrinsics.checkNotNullExpressionValue(userLogin, "userLogin");
        AuthenOnlineStoreRequest authenOnlineStoreRequest = new AuthenOnlineStoreRequest(rtrCode, userLogin);
        View view = this.f106976g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSecondaryLoading();
        CompositeDisposable disposable = getDisposable();
        Observable doOnTerminate = this.f106970a.authenticationOnlineStore(authenOnlineStoreRequest).compose(this.f106971b.applyAsync()).doOnTerminate(new Action() { // from class: F7
            {
                AuthenticationOnlineStoreViewModel.this = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                AuthenticationOnlineStoreViewModel.m1942e(AuthenticationOnlineStoreViewModel.this);
            }
        });
        final AuthenticationOnlineStoreViewModel$authenticationOnlineStore$2 authenticationOnlineStoreViewModel$authenticationOnlineStore$2 = new AuthenticationOnlineStoreViewModel$authenticationOnlineStore$2(this);
        Consumer consumer = new Consumer() { // from class: G7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AuthenticationOnlineStoreViewModel.m1941f(authenticationOnlineStoreViewModel$authenticationOnlineStore$2, obj);
            }
        };
        final AuthenticationOnlineStoreViewModel$authenticationOnlineStore$3 authenticationOnlineStoreViewModel$authenticationOnlineStore$3 = new AuthenticationOnlineStoreViewModel$authenticationOnlineStore$3(this);
        disposable.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: H7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AuthenticationOnlineStoreViewModel.m1940g(authenticationOnlineStoreViewModel$authenticationOnlineStore$3, obj);
            }
        }));
    }

    @NotNull
    public final MutableLiveData<AuthenOnlineStoreResponse> getAuthenticationResponseLiveData() {
        return m1939h();
    }

    /* renamed from: h */
    public final MutableLiveData m1939h() {
        return (MutableLiveData) this.f106974e.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        m1939h().setValue(null);
        getDisposable().clear();
    }
}