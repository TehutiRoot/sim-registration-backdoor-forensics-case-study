package th.p047co.dtac.android.dtacone.presenter.epin;

import java.util.List;
import javax.inject.Inject;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.epin.EPinPriceListPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.epin.EPinPriceListPresenter */
/* loaded from: classes8.dex */
public class EPinPriceListPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f85760a;

    /* renamed from: b */
    public RxThreadService f85761b;

    /* renamed from: c */
    public ServerErrorService f85762c;

    /* renamed from: d */
    public View f85763d;

    /* renamed from: e */
    public final CompositeSubscription f85764e = new CompositeSubscription();

    /* renamed from: th.co.dtac.android.dtacone.presenter.epin.EPinPriceListPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends ILoadingViewable, IPresenter.IView {
        void onEPinPricesResult(List<Integer> list);
    }

    /* renamed from: th.co.dtac.android.dtacone.presenter.epin.EPinPriceListPresenter$a */
    /* loaded from: classes8.dex */
    public class C14311a implements ServerErrorService.ExceptionHandler {
        public C14311a() {
            EPinPriceListPresenter.this = r1;
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public void handle(Throwable th2) {
            EPinPriceListPresenter.this.f85762c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public boolean supportHttpCode(int i) {
            return i != 401;
        }
    }

    @Inject
    public EPinPriceListPresenter(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        this.f85760a = rTRApi;
        this.f85761b = rxThreadService;
        this.f85762c = serverErrorService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m18353a(EPinPriceListPresenter ePinPriceListPresenter) {
        ePinPriceListPresenter.m18349e();
    }

    /* renamed from: b */
    public static /* synthetic */ void m18352b(EPinPriceListPresenter ePinPriceListPresenter, List list) {
        ePinPriceListPresenter.m18348f(list);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18351c(EPinPriceListPresenter ePinPriceListPresenter, Throwable th2) {
        ePinPriceListPresenter.m18347g(th2);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f85763d = (View) iView;
    }

    /* renamed from: e */
    public final /* synthetic */ void m18349e() {
        this.f85763d.dismissLoading();
    }

    /* renamed from: f */
    public final /* synthetic */ void m18348f(List list) {
        this.f85763d.onEPinPricesResult(list);
    }

    /* renamed from: g */
    public final /* synthetic */ void m18347g(Throwable th2) {
        this.f85762c.handleException(th2, new C14311a());
    }

    public void getEPinPrices() {
        this.f85763d.showLoading();
        this.f85764e.add(this.f85760a.getEPinPrice().compose(this.f85761b.applyAsync()).doOnTerminate(new Action0() { // from class: bM
            @Override // p046rx.functions.Action0
            public final void call() {
                EPinPriceListPresenter.m18353a(EPinPriceListPresenter.this);
            }
        }).subscribe(new Action1() { // from class: cM
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                EPinPriceListPresenter.m18352b(EPinPriceListPresenter.this, (List) obj);
            }
        }, new Action1() { // from class: dM
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                EPinPriceListPresenter.m18351c(EPinPriceListPresenter.this, (Throwable) obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        this.f85764e.clear();
    }
}