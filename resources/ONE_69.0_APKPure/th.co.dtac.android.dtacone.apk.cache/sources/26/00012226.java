package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolListCard;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.buy_dol.BuyDolListCardPresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/buy_dol/BuyDolListCardPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/service/RTRApi;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/RTRApi;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "getCards", "()V", "onDestroy", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/RTRApi;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CURVE_TO, "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/presenter/buy_dol/BuyDolListCardPresenter$View;", "d", "Lth/co/dtac/android/dtacone/presenter/buy_dol/BuyDolListCardPresenter$View;", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolListCardPresenter */
/* loaded from: classes8.dex */
public final class BuyDolListCardPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApi f85445a;

    /* renamed from: b */
    public final Rx2ThreadService f85446b;

    /* renamed from: c */
    public final CompositeDisposable f85447c;

    /* renamed from: d */
    public View f85448d;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/buy_dol/BuyDolListCardPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onCardsResult", "", "cards", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolListCard;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolListCardPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onCardsResult(@NotNull BuyDolListCard buyDolListCard);
    }

    @Inject
    public BuyDolListCardPresenter(@Named("RX_JAVA2") @NotNull RTRApi api, @NotNull Rx2ThreadService threadService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f85445a = api;
        this.f85446b = threadService;
        this.f85447c = new CompositeDisposable();
    }

    /* renamed from: a */
    public static /* synthetic */ void m18726a(BuyDolListCardPresenter buyDolListCardPresenter) {
        m18721f(buyDolListCardPresenter);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18725b(Function1 function1, Object obj) {
        m18720g(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ BuyDolListCard m18724c(Function1 function1, Object obj) {
        return m18722e(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m18723d(Function1 function1, Object obj) {
        m18719h(function1, obj);
    }

    /* renamed from: e */
    public static final BuyDolListCard m18722e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BuyDolListCard) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m18721f(BuyDolListCardPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85448d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: g */
    public static final void m18720g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m18719h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolListCardPresenter.View");
        this.f85448d = (View) iView;
    }

    public final void getCards() {
        View view = this.f85448d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable compositeDisposable = this.f85447c;
        Observable<R> compose = this.f85445a.getCards().compose(this.f85446b.applyAsync());
        final BuyDolListCardPresenter$getCards$1 buyDolListCardPresenter$getCards$1 = BuyDolListCardPresenter$getCards$1.INSTANCE;
        Observable doOnTerminate = compose.onErrorReturn(new Function() { // from class: Ne
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BuyDolListCardPresenter.m18724c(Function1.this, obj);
            }
        }).doOnTerminate(new Action() { // from class: Oe
            @Override // io.reactivex.functions.Action
            public final void run() {
                BuyDolListCardPresenter.m18726a(BuyDolListCardPresenter.this);
            }
        });
        final BuyDolListCardPresenter$getCards$3 buyDolListCardPresenter$getCards$3 = new BuyDolListCardPresenter$getCards$3(this);
        Consumer consumer = new Consumer() { // from class: Pe
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolListCardPresenter.m18725b(Function1.this, obj);
            }
        };
        final BuyDolListCardPresenter$getCards$4 buyDolListCardPresenter$getCards$4 = BuyDolListCardPresenter$getCards$4.INSTANCE;
        compositeDisposable.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: Qe
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyDolListCardPresenter.m18723d(Function1.this, obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        this.f85447c.clear();
    }
}