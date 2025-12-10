package th.p047co.dtac.android.dtacone.presenter.new_register;

import javax.inject.Inject;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.mixpanel.RegisterTracker;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IMixpanelTracker;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.new_register.RegisterRtrCodeFormPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterRtrCodeFormPresenter */
/* loaded from: classes8.dex */
public class RegisterRtrCodeFormPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f86057a;

    /* renamed from: b */
    public RxThreadService f86058b;

    /* renamed from: c */
    public ServerErrorService f86059c;

    /* renamed from: d */
    public TemporaryCache f86060d;

    /* renamed from: e */
    public CompositeSubscription f86061e = new CompositeSubscription();

    /* renamed from: f */
    public View f86062f;

    /* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterRtrCodeFormPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends ILoadingViewable, IPresenter.IView, IMixpanelTracker {
        void onNotAlreadyRegister();

        void onRequestOTPSuccess(RequestOtpResponse requestOtpResponse);
    }

    @Inject
    public RegisterRtrCodeFormPresenter(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        this.f86057a = rTRApi;
        this.f86058b = rxThreadService;
        this.f86059c = serverErrorService;
        this.f86060d = temporaryCache;
    }

    /* renamed from: a */
    public static /* synthetic */ Observable m17840a(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, String str, String str2) {
        return registerRtrCodeFormPresenter.m17829l(str, str2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17839b(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, Throwable th2) {
        registerRtrCodeFormPresenter.m17826o(th2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17838c(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, String str) {
        registerRtrCodeFormPresenter.m17830k(str);
    }

    /* renamed from: d */
    public static /* synthetic */ Observable m17837d(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, String str) {
        return registerRtrCodeFormPresenter.m17824q(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17836e(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, String str) {
        registerRtrCodeFormPresenter.m17825p(str);
    }

    /* renamed from: f */
    public static /* synthetic */ void m17835f(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter) {
        registerRtrCodeFormPresenter.m17823r();
    }

    /* renamed from: g */
    public static /* synthetic */ void m17834g(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, Void r1) {
        registerRtrCodeFormPresenter.m17827n(r1);
    }

    /* renamed from: h */
    public static /* synthetic */ void m17833h(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter) {
        registerRtrCodeFormPresenter.m17828m();
    }

    /* renamed from: i */
    public static /* synthetic */ void m17832i(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, Throwable th2) {
        registerRtrCodeFormPresenter.m17821t(th2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m17831j(RegisterRtrCodeFormPresenter registerRtrCodeFormPresenter, String str, RequestOtpResponse requestOtpResponse) {
        registerRtrCodeFormPresenter.m17822s(str, requestOtpResponse);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86062f = (View) iView;
    }

    public void checkRegisterStatus(String str, final String str2) {
        this.f86062f.showLoading();
        this.f86061e.add(Observable.just(str).doOnNext(new Action1() { // from class: qv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterRtrCodeFormPresenter.m17838c(RegisterRtrCodeFormPresenter.this, (String) obj);
            }
        }).flatMap(new Func1() { // from class: rv1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return RegisterRtrCodeFormPresenter.m17840a(RegisterRtrCodeFormPresenter.this, str2, (String) obj);
            }
        }).compose(this.f86058b.applyAsync()).doOnTerminate(new Action0() { // from class: sv1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterRtrCodeFormPresenter.m17833h(RegisterRtrCodeFormPresenter.this);
            }
        }).subscribe(new Action1() { // from class: tv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterRtrCodeFormPresenter.m17834g(RegisterRtrCodeFormPresenter.this, (Void) obj);
            }
        }, new Action1() { // from class: uv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterRtrCodeFormPresenter.m17839b(RegisterRtrCodeFormPresenter.this, (Throwable) obj);
            }
        }));
    }

    public void getOTP(final String str) {
        this.f86061e.add(Observable.just(str).doOnNext(new Action1() { // from class: lv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterRtrCodeFormPresenter.m17836e(RegisterRtrCodeFormPresenter.this, (String) obj);
            }
        }).flatMap(new Func1() { // from class: mv1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return RegisterRtrCodeFormPresenter.m17837d(RegisterRtrCodeFormPresenter.this, (String) obj);
            }
        }).doOnTerminate(new Action0() { // from class: nv1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterRtrCodeFormPresenter.m17835f(RegisterRtrCodeFormPresenter.this);
            }
        }).compose(this.f86058b.applyAsync()).subscribe(new Action1() { // from class: ov1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterRtrCodeFormPresenter.m17831j(RegisterRtrCodeFormPresenter.this, str, (RequestOtpResponse) obj);
            }
        }, new Action1() { // from class: pv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterRtrCodeFormPresenter.m17832i(RegisterRtrCodeFormPresenter.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: k */
    public final /* synthetic */ void m17830k(String str) {
        this.f86060d.setRetailerNumber(str);
    }

    /* renamed from: l */
    public final /* synthetic */ Observable m17829l(String str, String str2) {
        return this.f86057a.checkRegisterStatus(str2, str);
    }

    /* renamed from: m */
    public final /* synthetic */ void m17828m() {
        this.f86060d.setRetailerNumber(null);
        this.f86062f.dismissLoading();
    }

    /* renamed from: n */
    public final /* synthetic */ void m17827n(Void r1) {
        this.f86062f.onNotAlreadyRegister();
    }

    /* renamed from: o */
    public final /* synthetic */ void m17826o(Throwable th2) {
        this.f86059c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        super.onStop();
        this.f86061e.clear();
    }

    /* renamed from: p */
    public final /* synthetic */ void m17825p(String str) {
        this.f86060d.setRetailerNumber(str);
    }

    /* renamed from: q */
    public final /* synthetic */ Observable m17824q(String str) {
        return this.f86057a.requestOtp(new RequestOtpBody(str, "register"));
    }

    /* renamed from: r */
    public final /* synthetic */ void m17823r() {
        this.f86060d.setRetailerNumber(null);
    }

    /* renamed from: s */
    public final /* synthetic */ void m17822s(String str, RequestOtpResponse requestOtpResponse) {
        this.f86062f.onRequestOTPSuccess(requestOtpResponse);
        this.f86062f.sendEvent(new RegisterTracker("Register", "Request: OTP Request", null, str, null, this.f86060d.getLatitudeLongitude()).getProperties());
    }

    /* renamed from: t */
    public final /* synthetic */ void m17821t(Throwable th2) {
        this.f86059c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }
}