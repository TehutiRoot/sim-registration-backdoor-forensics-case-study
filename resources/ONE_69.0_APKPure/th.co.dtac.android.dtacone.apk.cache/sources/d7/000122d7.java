package th.p047co.dtac.android.dtacone.presenter.change_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimResponseVerifyReason;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.ISecondaryLoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyReasonPresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001,B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R8\u0010+\u001a&\u0012\f\u0012\n '*\u0004\u0018\u00010&0& '*\u0012\u0012\f\u0012\n '*\u0004\u0018\u00010&0&\u0018\u00010(0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/change_sim/ChangeSimVerifyReasonPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;", "verifySimReason", "verifyReasonChangeSim", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;)V", "verifyReasonChangeSimWithFaceRecognition", "onStop", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "Lth/co/dtac/android/dtacone/presenter/change_sim/ChangeSimVerifyReasonPresenter$View;", "d", "Lth/co/dtac/android/dtacone/presenter/change_sim/ChangeSimVerifyReasonPresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lkotlin/Lazy;", OperatorName.NON_STROKING_GRAY, "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "", "", "kotlin.jvm.PlatformType", "", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "AOU_CODES", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyReasonPresenter */
/* loaded from: classes8.dex */
public final class ChangeSimVerifyReasonPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f85675a;

    /* renamed from: b */
    public final Rx2ThreadService f85676b;

    /* renamed from: c */
    public final ServerErrorService f85677c;

    /* renamed from: d */
    public View f85678d;

    /* renamed from: e */
    public final Lazy f85679e;

    /* renamed from: f */
    public final List f85680f;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/change_sim/ChangeSimVerifyReasonPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ISecondaryLoadingViewable;", "onAOU", "", "errorMessage", "Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "onVerifySuccess", "transaction", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimResponseVerifyReason;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyReasonPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ISecondaryLoadingViewable {
        void onAOU(@NotNull ServerErrorException serverErrorException);

        void onVerifySuccess(@NotNull ChangeSimResponseVerifyReason changeSimResponseVerifyReason);
    }

    @Inject
    public ChangeSimVerifyReasonPresenter(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f85675a = api;
        this.f85676b = threadService;
        this.f85677c = errorService;
        this.f85679e = LazyKt__LazyJVMKt.lazy(ChangeSimVerifyReasonPresenter$subscription$2.INSTANCE);
        this.f85680f = Arrays.asList("230202916", "230200987", "230201267", "23000015", "23000012", "23000016", "23000013", "23000018");
    }

    /* renamed from: a */
    public static /* synthetic */ void m18462a(Function1 function1, Object obj) {
        m18451l(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18461b(Function1 function1, Object obj) {
        m18450m(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18460c(Function1 function1, Object obj) {
        m18454i(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m18459d(ChangeSimVerifyReasonPresenter changeSimVerifyReasonPresenter) {
        m18455h(changeSimVerifyReasonPresenter);
    }

    /* renamed from: e */
    public static /* synthetic */ void m18458e(ChangeSimVerifyReasonPresenter changeSimVerifyReasonPresenter) {
        m18452k(changeSimVerifyReasonPresenter);
    }

    /* renamed from: f */
    public static /* synthetic */ void m18457f(Function1 function1, Object obj) {
        m18453j(function1, obj);
    }

    /* renamed from: g */
    private final CompositeDisposable m18456g() {
        return (CompositeDisposable) this.f85679e.getValue();
    }

    /* renamed from: h */
    public static final void m18455h(ChangeSimVerifyReasonPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85678d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
    }

    /* renamed from: i */
    public static final void m18454i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m18453j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m18452k(ChangeSimVerifyReasonPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85678d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
    }

    /* renamed from: l */
    public static final void m18451l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m18450m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f85678d = (View) view;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        m18456g().clear();
    }

    public final void verifyReasonChangeSim(@NotNull ChangeSimRequestVerifyReason verifySimReason) {
        Intrinsics.checkNotNullParameter(verifySimReason, "verifySimReason");
        View view = this.f85678d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSecondaryLoading();
        CompositeDisposable m18456g = m18456g();
        Observable doOnTerminate = this.f85675a.verifyReasonChangeSimWithPhoneNumber(verifySimReason).compose(this.f85676b.applyAsync()).doOnTerminate(new Action() { // from class: oo
            @Override // io.reactivex.functions.Action
            public final void run() {
                ChangeSimVerifyReasonPresenter.m18459d(ChangeSimVerifyReasonPresenter.this);
            }
        });
        final ChangeSimVerifyReasonPresenter$verifyReasonChangeSim$2 changeSimVerifyReasonPresenter$verifyReasonChangeSim$2 = new ChangeSimVerifyReasonPresenter$verifyReasonChangeSim$2(this);
        Consumer consumer = new Consumer() { // from class: po
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonPresenter.m18460c(Function1.this, obj);
            }
        };
        final ChangeSimVerifyReasonPresenter$verifyReasonChangeSim$3 changeSimVerifyReasonPresenter$verifyReasonChangeSim$3 = new ChangeSimVerifyReasonPresenter$verifyReasonChangeSim$3(this);
        m18456g.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: qo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonPresenter.m18457f(Function1.this, obj);
            }
        }));
    }

    public final void verifyReasonChangeSimWithFaceRecognition(@NotNull ChangeSimRequestVerifyReason verifySimReason) {
        Intrinsics.checkNotNullParameter(verifySimReason, "verifySimReason");
        View view = this.f85678d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSecondaryLoading();
        CompositeDisposable m18456g = m18456g();
        Observable doOnTerminate = this.f85675a.verifyReasonChangeSimWithFaceRecognition(verifySimReason).compose(this.f85676b.applyAsync()).doOnTerminate(new Action() { // from class: lo
            @Override // io.reactivex.functions.Action
            public final void run() {
                ChangeSimVerifyReasonPresenter.m18458e(ChangeSimVerifyReasonPresenter.this);
            }
        });
        final C14299xcf44c7f8 c14299xcf44c7f8 = new C14299xcf44c7f8(this);
        Consumer consumer = new Consumer() { // from class: mo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonPresenter.m18462a(Function1.this, obj);
            }
        };
        final C14300xcf44c7f9 c14300xcf44c7f9 = new C14300xcf44c7f9(this);
        m18456g.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: no
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChangeSimVerifyReasonPresenter.m18461b(Function1.this, obj);
            }
        }));
    }
}