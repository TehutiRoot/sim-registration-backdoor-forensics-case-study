package th.p047co.dtac.android.dtacone.presenter.campaign.detail;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.campaign.detail.MyCampaignDetailResponse;
import th.p047co.dtac.android.dtacone.model.campaign.detail.history.MyCampaignDetailHistoryResponse;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.ISwipeRefresh;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.campaign.detail.MyCampaignDetailPresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001+B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/campaign/detail/MyCampaignDetailPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "campaignId", "getMyCampaignDetail", "(I)V", "getMyCampaignDetailHistory", "onDestroy", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "getErrorService", "()Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "Lth/co/dtac/android/dtacone/presenter/campaign/detail/MyCampaignDetailPresenter$View;", "d", "Lth/co/dtac/android/dtacone/presenter/campaign/detail/MyCampaignDetailPresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lkotlin/Lazy;", OperatorName.MOVE_TO, "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.detail.MyCampaignDetailPresenter */
/* loaded from: classes8.dex */
public final class MyCampaignDetailPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f85536a;

    /* renamed from: b */
    public final Rx2ThreadService f85537b;

    /* renamed from: c */
    public final ServerErrorService f85538c;

    /* renamed from: d */
    public View f85539d;

    /* renamed from: e */
    public final Lazy f85540e;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/campaign/detail/MyCampaignDetailPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ISwipeRefresh;", "onGetMyCampaignDetailFailed", "", "message", "", "onGetMyCampaignDetailHistoryFailed", "onGetMyCampaignDetailHistorySuccess", "pointHistory", "Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;", "onGetMyCampaignDetailSuccess", "myCampaignDetailResponse", "Lth/co/dtac/android/dtacone/model/campaign/detail/MyCampaignDetailResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.campaign.detail.MyCampaignDetailPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ISwipeRefresh {
        void onGetMyCampaignDetailFailed(@NotNull String str);

        void onGetMyCampaignDetailHistoryFailed(@NotNull String str);

        void onGetMyCampaignDetailHistorySuccess(@NotNull MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse);

        void onGetMyCampaignDetailSuccess(@NotNull MyCampaignDetailResponse myCampaignDetailResponse);
    }

    @Inject
    public MyCampaignDetailPresenter(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f85536a = api;
        this.f85537b = threadService;
        this.f85538c = errorService;
        this.f85540e = LazyKt__LazyJVMKt.lazy(MyCampaignDetailPresenter$subscription$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18624a(Function1 function1, Object obj) {
        m18617h(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18623b(Function1 function1, Object obj) {
        m18613l(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18622c(Function1 function1, Object obj) {
        m18616i(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m18621d() {
        m18618g();
    }

    /* renamed from: e */
    public static /* synthetic */ void m18620e(Function1 function1, Object obj) {
        m18614k(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m18619f() {
        m18615j();
    }

    /* renamed from: g */
    public static final void m18618g() {
    }

    /* renamed from: h */
    public static final void m18617h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m18616i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m18615j() {
    }

    /* renamed from: k */
    public static final void m18614k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m18613l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    private final CompositeDisposable m18612m() {
        return (CompositeDisposable) this.f85540e.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.campaign.detail.MyCampaignDetailPresenter.View");
        this.f85539d = (View) iView;
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f85536a;
    }

    @NotNull
    public final ServerErrorService getErrorService() {
        return this.f85538c;
    }

    public final void getMyCampaignDetail(int i) {
        CompositeDisposable m18612m = m18612m();
        Observable doOnTerminate = this.f85536a.getCampaignDetail(i).compose(this.f85537b.applyAsync()).doOnTerminate(new Action() { // from class: MG0
            @Override // io.reactivex.functions.Action
            public final void run() {
                MyCampaignDetailPresenter.m18621d();
            }
        });
        final MyCampaignDetailPresenter$getMyCampaignDetail$2 myCampaignDetailPresenter$getMyCampaignDetail$2 = new MyCampaignDetailPresenter$getMyCampaignDetail$2(this);
        Consumer consumer = new Consumer() { // from class: NG0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyCampaignDetailPresenter.m18624a(Function1.this, obj);
            }
        };
        final MyCampaignDetailPresenter$getMyCampaignDetail$3 myCampaignDetailPresenter$getMyCampaignDetail$3 = new MyCampaignDetailPresenter$getMyCampaignDetail$3(this);
        m18612m.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: OG0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyCampaignDetailPresenter.m18622c(Function1.this, obj);
            }
        }));
    }

    public final void getMyCampaignDetailHistory(int i) {
        CompositeDisposable m18612m = m18612m();
        Observable doOnTerminate = this.f85536a.getCampaignDetailHistory(i).compose(this.f85537b.applyAsync()).doOnTerminate(new Action() { // from class: PG0
            @Override // io.reactivex.functions.Action
            public final void run() {
                MyCampaignDetailPresenter.m18619f();
            }
        });
        final MyCampaignDetailPresenter$getMyCampaignDetailHistory$2 myCampaignDetailPresenter$getMyCampaignDetailHistory$2 = new MyCampaignDetailPresenter$getMyCampaignDetailHistory$2(this);
        Consumer consumer = new Consumer() { // from class: QG0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyCampaignDetailPresenter.m18620e(Function1.this, obj);
            }
        };
        final MyCampaignDetailPresenter$getMyCampaignDetailHistory$3 myCampaignDetailPresenter$getMyCampaignDetailHistory$3 = new MyCampaignDetailPresenter$getMyCampaignDetailHistory$3(this);
        m18612m.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: RG0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyCampaignDetailPresenter.m18623b(Function1.this, obj);
            }
        }));
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f85537b;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m18612m().clear();
    }
}