package th.p047co.dtac.android.dtacone.presenter.new_register;

import javax.inject.Inject;
import javax.inject.Named;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.mixpanel.RegisterTracker;
import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IMixpanelTracker;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.new_register.RegisterMsisdnSimRPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterMsisdnSimRPresenter */
/* loaded from: classes8.dex */
public class RegisterMsisdnSimRPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f86027a;

    /* renamed from: b */
    public RxThreadService f86028b;

    /* renamed from: c */
    public ServerErrorService f86029c;

    /* renamed from: d */
    public TemporaryCache f86030d;

    /* renamed from: e */
    public CompositeSubscription f86031e = new CompositeSubscription();

    /* renamed from: f */
    public View f86032f;

    /* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterMsisdnSimRPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable, IMixpanelTracker {
        void onRegisterSuccess(String str, String str2);
    }

    @Inject
    public RegisterMsisdnSimRPresenter(@Named("PREVENT_RETRY") RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        this.f86027a = rTRApi;
        this.f86028b = rxThreadService;
        this.f86029c = serverErrorService;
        this.f86030d = temporaryCache;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17870a(RegisterMsisdnSimRPresenter registerMsisdnSimRPresenter, String str, String str2, String str3, String str4, Void r5) {
        registerMsisdnSimRPresenter.m17868c(str, str2, str3, str4, r5);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17869b(RegisterMsisdnSimRPresenter registerMsisdnSimRPresenter, Throwable th2) {
        registerMsisdnSimRPresenter.m17867d(th2);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86032f = (View) iView;
    }

    /* renamed from: c */
    public final /* synthetic */ void m17868c(String str, String str2, String str3, String str4, Void r12) {
        this.f86032f.onRegisterSuccess(str, str2);
        this.f86032f.sendEvent(new RegisterTracker("Register", "Submit: Register (SIM R)", str3, str, str4, this.f86030d.getLatitudeLongitude()).getProperties());
    }

    /* renamed from: d */
    public final /* synthetic */ void m17867d(Throwable th2) {
        this.f86032f.dismissLoading();
        this.f86029c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86031e.clear();
    }

    public void register(String str, final String str2, final String str3, final String str4, final String str5, String str6) {
        this.f86032f.showLoading();
        this.f86031e.add(this.f86027a.register(new RegisterCollection(str, str2, str4, str5, str6, str3)).compose(this.f86028b.applyAsync()).subscribe(new Action1() { // from class: Mu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterMsisdnSimRPresenter.m17870a(RegisterMsisdnSimRPresenter.this, str2, str3, str4, str5, (Void) obj);
            }
        }, new Action1() { // from class: Nu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterMsisdnSimRPresenter.m17869b(RegisterMsisdnSimRPresenter.this, (Throwable) obj);
            }
        }));
    }
}