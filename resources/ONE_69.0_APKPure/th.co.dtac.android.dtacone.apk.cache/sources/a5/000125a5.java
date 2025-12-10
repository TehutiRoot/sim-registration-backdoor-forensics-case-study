package th.p047co.dtac.android.dtacone.presenter.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.stv.StvCollection;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.stv.StvPresenter;
import th.p047co.dtac.android.dtacone.presenter.stv.StvPresenterImpl;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00106\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/stv/StvPresenterImpl;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/presenter/stv/StvPresenter;", "Lth/co/dtac/android/dtacone/manager/service/RTRApi;", "api", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "rtrRepository", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/RTRApi;Lth/co/dtac/android/dtacone/manager/service/RxThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "refresh", "callSTVList", "(Z)V", "onStop", "()V", "Lrx/Observable;", "", "Lth/co/dtac/android/dtacone/model/stv/StvCollection;", OperatorName.LINE_TO, "()Lrx/Observable;", OperatorName.SET_LINE_JOINSTYLE, "(Z)Lrx/Observable;", "stvCollections", OperatorName.NON_STROKING_CMYK, "(Ljava/util/List;)Lrx/Observable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/RTRApi;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "d", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "Lth/co/dtac/android/dtacone/presenter/stv/StvPresenter$InteractorStvView;", "e", "Lth/co/dtac/android/dtacone/presenter/stv/StvPresenter$InteractorStvView;", "interactorView", "Lrx/subscriptions/CompositeSubscription;", OperatorName.FILL_NON_ZERO, "Lrx/subscriptions/CompositeSubscription;", "subscriptions", "", "kotlin.jvm.PlatformType", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", "TAG", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPresenterImpl */
/* loaded from: classes8.dex */
public final class StvPresenterImpl extends LifecyclePresenter implements StvPresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApi f86645a;

    /* renamed from: b */
    public final RxThreadService f86646b;

    /* renamed from: c */
    public final ServerErrorService f86647c;

    /* renamed from: d */
    public final RtrRepository f86648d;

    /* renamed from: e */
    public StvPresenter.InteractorStvView f86649e;

    /* renamed from: f */
    public final CompositeSubscription f86650f;

    /* renamed from: g */
    public final String f86651g;

    @Inject
    public StvPresenterImpl(@NotNull RTRApi api, @NotNull RxThreadService threadService, @NotNull ServerErrorService errorService, @NotNull RtrRepository rtrRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        this.f86645a = api;
        this.f86646b = threadService;
        this.f86647c = errorService;
        this.f86648d = rtrRepository;
        this.f86650f = new CompositeSubscription();
        this.f86651g = StvPresenterImpl.class.getSimpleName();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17132a(StvPresenterImpl stvPresenterImpl) {
        m17126g(stvPresenterImpl);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m17131b(Function1 function1, Object obj) {
        return m17120m(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ Boolean m17130c(Function1 function1, Object obj) {
        return m17127f(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17129d(StvPresenterImpl stvPresenterImpl, Throwable th2) {
        m17124i(stvPresenterImpl, th2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17128e(Function1 function1, Object obj) {
        m17125h(function1, obj);
    }

    /* renamed from: f */
    public static final Boolean m17127f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m17126g(StvPresenterImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StvPresenter.InteractorStvView interactorStvView = this$0.f86649e;
        if (interactorStvView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("interactorView");
            interactorStvView = null;
        }
        interactorStvView.dismissRefreshingProgress();
    }

    /* renamed from: h */
    public static final void m17125h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m17124i(StvPresenterImpl this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (th2 instanceof NoSuchElementException) {
            StvPresenter.InteractorStvView interactorStvView = this$0.f86649e;
            if (interactorStvView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("interactorView");
                interactorStvView = null;
            }
            interactorStvView.showError("ไม่พบแพคเกจ");
            return;
        }
        this$0.f86647c.handleException(th2, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.stv.StvPresenterImpl$callSTVList$4$1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@NotNull Throwable e) {
                StvPresenter.InteractorStvView interactorStvView2;
                ServerErrorService serverErrorService;
                Intrinsics.checkNotNullParameter(e, "e");
                interactorStvView2 = StvPresenterImpl.this.f86649e;
                if (interactorStvView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("interactorView");
                    interactorStvView2 = null;
                }
                serverErrorService = StvPresenterImpl.this.f86647c;
                interactorStvView2.showError(serverErrorService.getErrorMessage(e));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }

    /* renamed from: m */
    public static final Observable m17120m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f86649e = (StvPresenter.InteractorStvView) view;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.stv.StvPresenter
    public void callSTVList(boolean z) {
        StvPresenter.InteractorStvView interactorStvView = this.f86649e;
        if (interactorStvView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("interactorView");
            interactorStvView = null;
        }
        interactorStvView.showRefreshingProgress();
        CompositeSubscription compositeSubscription = this.f86650f;
        Observable concat = Observable.concat(m17123j(z), m17121l());
        final StvPresenterImpl$callSTVList$1 stvPresenterImpl$callSTVList$1 = StvPresenterImpl$callSTVList$1.INSTANCE;
        Observable doOnTerminate = concat.first(new Func1() { // from class: aP1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return StvPresenterImpl.m17130c(Function1.this, obj);
            }
        }).compose(this.f86646b.applyAsync()).doOnTerminate(new Action0() { // from class: bP1
            @Override // p046rx.functions.Action0
            public final void call() {
                StvPresenterImpl.m17132a(StvPresenterImpl.this);
            }
        });
        final StvPresenterImpl$callSTVList$3 stvPresenterImpl$callSTVList$3 = new StvPresenterImpl$callSTVList$3(this);
        compositeSubscription.add(doOnTerminate.subscribe(new Action1() { // from class: cP1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                StvPresenterImpl.m17128e(Function1.this, obj);
            }
        }, new Action1() { // from class: dP1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                StvPresenterImpl.m17129d(StvPresenterImpl.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: j */
    public final Observable m17123j(boolean z) {
        if (z) {
            Observable empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "{\n            Observable.empty()\n        }");
            return empty;
        }
        Observable<List<StvCollection>> stvPackage = this.f86648d.getStvPackage();
        Intrinsics.checkNotNullExpressionValue(stvPackage, "{\n            rtrRepository.stvPackage\n        }");
        return stvPackage;
    }

    /* renamed from: k */
    public final Observable m17122k(List list) {
        Observable<List<StvCollection>> saveStvPackage = this.f86648d.saveStvPackage(list);
        Intrinsics.checkNotNullExpressionValue(saveStvPackage, "rtrRepository.saveStvPackage(stvCollections)");
        return saveStvPackage;
    }

    /* renamed from: l */
    public final Observable m17121l() {
        Observable<List<StvCollection>> sTVPackages = this.f86645a.getSTVPackages();
        final StvPresenterImpl$stvPackageFromNetwork$1 stvPresenterImpl$stvPackageFromNetwork$1 = new StvPresenterImpl$stvPackageFromNetwork$1(this);
        Observable<R> flatMap = sTVPackages.flatMap(new Func1() { // from class: eP1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return StvPresenterImpl.m17131b(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun stvPackageFr…oDB(data)\n        }\n    }");
        return flatMap;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86650f.clear();
    }
}