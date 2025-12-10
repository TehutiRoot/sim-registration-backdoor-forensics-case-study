package th.p047co.dtac.android.dtacone.presenter.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
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
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.ISwipeRefresh;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002,-B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/self_update/RtrProfilePresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "isForUpdate", "", "requestId", "getRrtProfile", "(ZI)V", "onDestroy", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "getErrorService", "()Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "Lth/co/dtac/android/dtacone/presenter/self_update/RtrProfilePresenter$View;", "d", "Lth/co/dtac/android/dtacone/presenter/self_update/RtrProfilePresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lkotlin/Lazy;", OperatorName.NON_STROKING_GRAY, "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Companion", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter */
/* loaded from: classes8.dex */
public final class RtrProfilePresenter extends LifecyclePresenter {

    /* renamed from: a */
    public final RTRApiRx2 f86403a;

    /* renamed from: b */
    public final Rx2ThreadService f86404b;

    /* renamed from: c */
    public final ServerErrorService f86405c;

    /* renamed from: d */
    public View f86406d;

    /* renamed from: e */
    public final Lazy f86407e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/self_update/RtrProfilePresenter$Companion;", "", "()V", "REQUEST_CODE_EDIT_ADDRESS", "", "REQUEST_CODE_EDIT_PROFILE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/self_update/RtrProfilePresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ISwipeRefresh;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onRtrProfileNotFound", "", "message", "", "onRtrProfileResult", "rtrProfile", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileResponse;", "onRtrProfileResultForUpdateAddress", "onRtrProfileResultForUpdateProfile", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ISwipeRefresh, ILoadingViewable {
        void onRtrProfileNotFound(@Nullable String str);

        void onRtrProfileResult(@NotNull RtrProfileResponse rtrProfileResponse);

        void onRtrProfileResultForUpdateAddress(@NotNull RtrProfileResponse rtrProfileResponse);

        void onRtrProfileResultForUpdateProfile(@NotNull RtrProfileResponse rtrProfileResponse);
    }

    @Inject
    public RtrProfilePresenter(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f86403a = api;
        this.f86404b = threadService;
        this.f86405c = errorService;
        this.f86407e = LazyKt__LazyJVMKt.lazy(RtrProfilePresenter$subscription$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ void m17404a(boolean z, RtrProfilePresenter rtrProfilePresenter) {
        m17401d(z, rtrProfilePresenter);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17403b(Function1 function1, Object obj) {
        m17399f(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17402c(Function1 function1, Object obj) {
        m17400e(function1, obj);
    }

    /* renamed from: d */
    public static final void m17401d(boolean z, RtrProfilePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = null;
        if (z) {
            View view2 = this$0.f86406d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view = view2;
            }
            view.dismissLoading();
            return;
        }
        View view3 = this$0.f86406d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view = view3;
        }
        view.dismissSwipeRefresh();
    }

    /* renamed from: e */
    public static final void m17400e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m17399f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    private final CompositeDisposable m17398g() {
        return (CompositeDisposable) this.f86407e.getValue();
    }

    public static /* synthetic */ void getRrtProfile$default(RtrProfilePresenter rtrProfilePresenter, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 99;
        }
        rtrProfilePresenter.getRrtProfile(z, i);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter.View");
        this.f86406d = (View) iView;
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f86403a;
    }

    @NotNull
    public final ServerErrorService getErrorService() {
        return this.f86405c;
    }

    public final void getRrtProfile(final boolean z, int i) {
        View view = null;
        if (z) {
            View view2 = this.f86406d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view = view2;
            }
            view.showLoading();
        } else {
            View view3 = this.f86406d;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view = view3;
            }
            view.showSwipeRefresh();
        }
        CompositeDisposable m17398g = m17398g();
        Observable doOnTerminate = this.f86403a.getRtrProfile().compose(this.f86404b.applyAsync()).doOnTerminate(new Action() { // from class: hA1
            @Override // io.reactivex.functions.Action
            public final void run() {
                RtrProfilePresenter.m17404a(z, this);
            }
        });
        final RtrProfilePresenter$getRrtProfile$2 rtrProfilePresenter$getRrtProfile$2 = new RtrProfilePresenter$getRrtProfile$2(i, this);
        Consumer consumer = new Consumer() { // from class: iA1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RtrProfilePresenter.m17402c(Function1.this, obj);
            }
        };
        final RtrProfilePresenter$getRrtProfile$3 rtrProfilePresenter$getRrtProfile$3 = new RtrProfilePresenter$getRrtProfile$3(this);
        m17398g.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: jA1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RtrProfilePresenter.m17403b(Function1.this, obj);
            }
        }));
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f86404b;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m17398g().clear();
    }
}