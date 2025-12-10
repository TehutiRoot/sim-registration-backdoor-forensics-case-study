package th.p047co.dtac.android.dtacone.presenter.reports;

import javax.inject.Inject;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.rtr_performance.RetailerProfileCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.reports.RetailerProfilePresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RetailerProfilePresenter */
/* loaded from: classes8.dex */
public class RetailerProfilePresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f86328a;

    /* renamed from: b */
    public RxThreadService f86329b;

    /* renamed from: c */
    public ServerErrorService f86330c;

    /* renamed from: d */
    public CompositeSubscription f86331d = new CompositeSubscription();

    /* renamed from: e */
    public View f86332e;

    /* renamed from: th.co.dtac.android.dtacone.presenter.reports.RetailerProfilePresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onSuccessFetchRetailerProfile(RetailerProfileCollection retailerProfileCollection);
    }

    @Inject
    public RetailerProfilePresenter(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        this.f86328a = rTRApi;
        this.f86329b = rxThreadService;
        this.f86330c = serverErrorService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17480a(RetailerProfilePresenter retailerProfilePresenter, Throwable th2) {
        retailerProfilePresenter.m17475f(th2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17479b(RetailerProfilePresenter retailerProfilePresenter, RetailerProfileCollection retailerProfileCollection) {
        retailerProfilePresenter.m17476e(retailerProfileCollection);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17478c(RetailerProfilePresenter retailerProfilePresenter) {
        retailerProfilePresenter.m17477d();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86332e = (View) iView;
    }

    /* renamed from: d */
    public final /* synthetic */ void m17477d() {
        this.f86332e.dismissLoading();
    }

    /* renamed from: e */
    public final /* synthetic */ void m17476e(RetailerProfileCollection retailerProfileCollection) {
        this.f86332e.onSuccessFetchRetailerProfile(retailerProfileCollection);
    }

    /* renamed from: f */
    public final /* synthetic */ void m17475f(Throwable th2) {
        this.f86330c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    public void fetchRetailerProfile() {
        this.f86332e.showLoading();
        this.f86331d.add(this.f86328a.getRetailerProfile().compose(this.f86329b.applyAsync()).doOnTerminate(new Action0() { // from class: Oy1
            @Override // p046rx.functions.Action0
            public final void call() {
                RetailerProfilePresenter.m17478c(RetailerProfilePresenter.this);
            }
        }).subscribe(new Action1() { // from class: Py1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RetailerProfilePresenter.m17479b(RetailerProfilePresenter.this, (RetailerProfileCollection) obj);
            }
        }, new Action1() { // from class: Qy1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RetailerProfilePresenter.m17480a(RetailerProfilePresenter.this, (Throwable) obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86331d.clear();
    }
}