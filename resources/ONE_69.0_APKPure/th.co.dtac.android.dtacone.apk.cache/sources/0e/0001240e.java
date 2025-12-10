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
import th.p047co.dtac.android.dtacone.presenter.new_register.RegisterNoSimRPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterNoSimRPresenter */
/* loaded from: classes8.dex */
public class RegisterNoSimRPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f86037a;

    /* renamed from: b */
    public RxThreadService f86038b;

    /* renamed from: c */
    public ServerErrorService f86039c;

    /* renamed from: d */
    public TemporaryCache f86040d;

    /* renamed from: e */
    public CompositeSubscription f86041e = new CompositeSubscription();

    /* renamed from: f */
    public View f86042f;

    /* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterNoSimRPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable, IMixpanelTracker {
        void onRegisterSuccess(String str, String str2);
    }

    @Inject
    public RegisterNoSimRPresenter(@Named("PREVENT_RETRY") RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        this.f86037a = rTRApi;
        this.f86038b = rxThreadService;
        this.f86039c = serverErrorService;
        this.f86040d = temporaryCache;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17866a(RegisterNoSimRPresenter registerNoSimRPresenter, String str, String str2, String str3, String str4, Void r5) {
        registerNoSimRPresenter.m17864c(str, str2, str3, str4, r5);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17865b(RegisterNoSimRPresenter registerNoSimRPresenter, Throwable th2) {
        registerNoSimRPresenter.m17863d(th2);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86042f = (View) iView;
    }

    /* renamed from: c */
    public final /* synthetic */ void m17864c(String str, String str2, String str3, String str4, Void r12) {
        this.f86042f.onRegisterSuccess(str, str2);
        this.f86042f.sendEvent(new RegisterTracker("Register", "Submit: Register (No SIM R)", str3, str, str4, this.f86040d.getLatitudeLongitude()).getProperties());
    }

    /* renamed from: d */
    public final /* synthetic */ void m17863d(Throwable th2) {
        this.f86042f.dismissLoading();
        this.f86039c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        super.onStop();
        this.f86041e.clear();
    }

    public void registers(String str, final String str2, final String str3, final String str4, final String str5, String str6) {
        this.f86042f.showLoading();
        this.f86041e.add(this.f86037a.register(new RegisterCollection(str, str2, str4, str5, str6, str3)).compose(this.f86038b.applyAsync()).subscribe(new Action1() { // from class: Ou1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterNoSimRPresenter.m17866a(RegisterNoSimRPresenter.this, str2, str3, str4, str5, (Void) obj);
            }
        }, new Action1() { // from class: Pu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterNoSimRPresenter.m17865b(RegisterNoSimRPresenter.this, (Throwable) obj);
            }
        }));
    }
}