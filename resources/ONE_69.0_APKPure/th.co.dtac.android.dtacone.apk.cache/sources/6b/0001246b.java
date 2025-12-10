package th.p047co.dtac.android.dtacone.presenter.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PermissionActivation;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.prepaid.PrepaidPermissionPresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001-B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u000b\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/prepaid/PrepaidPermissionPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/service/RTRApi;", "api", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/RTRApi;Lth/co/dtac/android/dtacone/manager/service/RxThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "card", "getActivationPermission", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;)V", "onStop", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/RTRApi;", "getApi", "()Lth/co/dtac/android/dtacone/manager/service/RTRApi;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "getErrorService", "()Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "Lth/co/dtac/android/dtacone/presenter/prepaid/PrepaidPermissionPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/prepaid/PrepaidPermissionPresenter$View;", "getView", "()Lth/co/dtac/android/dtacone/presenter/prepaid/PrepaidPermissionPresenter$View;", "setView", "(Lth/co/dtac/android/dtacone/presenter/prepaid/PrepaidPermissionPresenter$View;)V", "Lrx/subscriptions/CompositeSubscription;", "d", "Lrx/subscriptions/CompositeSubscription;", "getSubscription", "()Lrx/subscriptions/CompositeSubscription;", "subscription", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidPermissionPresenter */
/* loaded from: classes8.dex */
public final class PrepaidPermissionPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApi f86180a;

    /* renamed from: b */
    public final RxThreadService f86181b;

    /* renamed from: c */
    public final ServerErrorService f86182c;

    /* renamed from: d */
    public final CompositeSubscription f86183d;
    public View view;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/prepaid/PrepaidPermissionPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onActivationPermission", "", "permissionForActivate", "Lth/co/dtac/android/dtacone/model/prepaid/PermissionActivation;", "card", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "onPoolingSim", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidPermissionPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onActivationPermission(@NotNull PermissionActivation permissionActivation, @NotNull CardCollection cardCollection);

        void onPoolingSim();
    }

    @Inject
    public PrepaidPermissionPresenter(@NotNull RTRApi api, @NotNull RxThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f86180a = api;
        this.f86181b = threadService;
        this.f86182c = errorService;
        this.f86183d = new CompositeSubscription();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17652a(PrepaidPermissionPresenter prepaidPermissionPresenter) {
        m17649d(prepaidPermissionPresenter);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17651b(Function1 function1, Object obj) {
        m17648e(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17650c(PrepaidPermissionPresenter prepaidPermissionPresenter, Throwable th2) {
        m17647f(prepaidPermissionPresenter, th2);
    }

    /* renamed from: d */
    public static final void m17649d(PrepaidPermissionPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getView().dismissLoading();
    }

    /* renamed from: e */
    public static final void m17648e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m17647f(PrepaidPermissionPresenter this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getView().onPoolingSim();
        this$0.f86182c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.prepaid.PrepaidPermissionPresenter.View");
        setView((View) iView);
    }

    public final void getActivationPermission(@NotNull CardCollection card) {
        Intrinsics.checkNotNullParameter(card, "card");
        getView().showLoading();
        CompositeSubscription compositeSubscription = this.f86183d;
        Observable doOnTerminate = this.f86180a.getPermissionActivation().compose(this.f86181b.applyAsync()).doOnTerminate(new Action0() { // from class: nn1
            @Override // p046rx.functions.Action0
            public final void call() {
                PrepaidPermissionPresenter.m17652a(PrepaidPermissionPresenter.this);
            }
        });
        final PrepaidPermissionPresenter$getActivationPermission$2 prepaidPermissionPresenter$getActivationPermission$2 = new PrepaidPermissionPresenter$getActivationPermission$2(this, card);
        compositeSubscription.add(doOnTerminate.subscribe(new Action1() { // from class: on1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                PrepaidPermissionPresenter.m17651b(Function1.this, obj);
            }
        }, new Action1() { // from class: pn1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                PrepaidPermissionPresenter.m17650c(PrepaidPermissionPresenter.this, (Throwable) obj);
            }
        }));
    }

    @NotNull
    public final RTRApi getApi() {
        return this.f86180a;
    }

    @NotNull
    public final ServerErrorService getErrorService() {
        return this.f86182c;
    }

    @NotNull
    public final CompositeSubscription getSubscription() {
        return this.f86183d;
    }

    @NotNull
    public final RxThreadService getThreadService() {
        return this.f86181b;
    }

    @NotNull
    public final View getView() {
        View view = this.view;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86183d.clear();
    }

    public final void setView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.view = view;
    }
}