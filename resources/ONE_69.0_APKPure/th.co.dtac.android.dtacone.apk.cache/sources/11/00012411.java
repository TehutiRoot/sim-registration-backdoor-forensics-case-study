package th.p047co.dtac.android.dtacone.presenter.new_register;

import javax.inject.Inject;
import javax.inject.Named;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.mixpanel.RegisterTracker;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IMixpanelTracker;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.new_register.RegisterOneSimRPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterOneSimRPresenter */
/* loaded from: classes8.dex */
public class RegisterOneSimRPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f86047a;

    /* renamed from: b */
    public RxThreadService f86048b;

    /* renamed from: c */
    public ServerErrorService f86049c;

    /* renamed from: d */
    public TemporaryCache f86050d;

    /* renamed from: e */
    public CompositeSubscription f86051e = new CompositeSubscription();

    /* renamed from: f */
    public View f86052f;

    /* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterOneSimRPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable, IMixpanelTracker {
        void onRegisterSuccess(String str, String str2);

        void onRequestOtpSuccess(RequestOtpResponse requestOtpResponse);

        void onVerifySimROTPSuccess();
    }

    @Inject
    public RegisterOneSimRPresenter(@Named("PREVENT_RETRY") RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        this.f86047a = rTRApi;
        this.f86048b = rxThreadService;
        this.f86049c = serverErrorService;
        this.f86050d = temporaryCache;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17862a(RegisterOneSimRPresenter registerOneSimRPresenter, RequestOtpResponse requestOtpResponse) {
        registerOneSimRPresenter.m17850m(requestOtpResponse);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17861b(RegisterOneSimRPresenter registerOneSimRPresenter) {
        registerOneSimRPresenter.m17851l();
    }

    /* renamed from: c */
    public static /* synthetic */ void m17860c(RegisterOneSimRPresenter registerOneSimRPresenter, Throwable th2) {
        registerOneSimRPresenter.m17843t(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17859d(RegisterOneSimRPresenter registerOneSimRPresenter, Throwable th2) {
        registerOneSimRPresenter.m17846q(th2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17858e(RegisterOneSimRPresenter registerOneSimRPresenter) {
        registerOneSimRPresenter.m17848o();
    }

    /* renamed from: f */
    public static /* synthetic */ void m17857f(RegisterOneSimRPresenter registerOneSimRPresenter, String str, String str2, String str3, String str4, Void r5) {
        registerOneSimRPresenter.m17845r(str, str2, str3, str4, r5);
    }

    /* renamed from: g */
    public static /* synthetic */ void m17856g(RegisterOneSimRPresenter registerOneSimRPresenter, TokenCollection tokenCollection) {
        registerOneSimRPresenter.m17841v(tokenCollection);
    }

    /* renamed from: h */
    public static /* synthetic */ void m17855h(RegisterOneSimRPresenter registerOneSimRPresenter) {
        registerOneSimRPresenter.m17842u();
    }

    /* renamed from: i */
    public static /* synthetic */ void m17854i(RegisterOneSimRPresenter registerOneSimRPresenter, Throwable th2) {
        registerOneSimRPresenter.m17849n(th2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m17853j(RegisterOneSimRPresenter registerOneSimRPresenter, String str, RequestOtpResponse requestOtpResponse) {
        registerOneSimRPresenter.m17847p(str, requestOtpResponse);
    }

    /* renamed from: k */
    public static /* synthetic */ void m17852k(RegisterOneSimRPresenter registerOneSimRPresenter, Throwable th2) {
        registerOneSimRPresenter.m17844s(th2);
    }

    /* renamed from: t */
    public /* synthetic */ void m17843t(Throwable th2) {
        this.f86049c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: u */
    public /* synthetic */ void m17842u() {
        this.f86052f.dismissLoading();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86052f = (View) iView;
    }

    public void getOTP(String str) {
        this.f86052f.showLoading();
        this.f86051e.add(this.f86047a.requestOtp(new RequestOtpBody(str, "register")).compose(this.f86048b.applyAsync()).doOnTerminate(new Action0() { // from class: cv1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterOneSimRPresenter.m17861b(RegisterOneSimRPresenter.this);
            }
        }).subscribe(new Action1() { // from class: dv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17862a(RegisterOneSimRPresenter.this, (RequestOtpResponse) obj);
            }
        }, new Action1() { // from class: Uu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17854i(RegisterOneSimRPresenter.this, (Throwable) obj);
            }
        }));
    }

    public void getSimROTP(final String str) {
        this.f86052f.showLoading();
        this.f86051e.add(this.f86047a.requestOtp(new RequestOtpBody(str, "register")).compose(this.f86048b.applyAsync()).doOnTerminate(new Action0() { // from class: Tu1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterOneSimRPresenter.m17858e(RegisterOneSimRPresenter.this);
            }
        }).subscribe(new Action1() { // from class: Vu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17853j(RegisterOneSimRPresenter.this, str, (RequestOtpResponse) obj);
            }
        }, new Action1() { // from class: Wu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17859d(RegisterOneSimRPresenter.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: l */
    public final /* synthetic */ void m17851l() {
        this.f86052f.dismissLoading();
    }

    /* renamed from: m */
    public final /* synthetic */ void m17850m(RequestOtpResponse requestOtpResponse) {
        this.f86052f.onRequestOtpSuccess(requestOtpResponse);
    }

    /* renamed from: n */
    public final /* synthetic */ void m17849n(Throwable th2) {
        this.f86049c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: o */
    public final /* synthetic */ void m17848o() {
        this.f86052f.dismissLoading();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        super.onStop();
        this.f86051e.clear();
    }

    /* renamed from: p */
    public final /* synthetic */ void m17847p(String str, RequestOtpResponse requestOtpResponse) {
        this.f86052f.onRequestOtpSuccess(requestOtpResponse);
        this.f86052f.sendEvent(new RegisterTracker("Register", "Request: Get Sim R OTP (Owner non SIMR with SIMR)", null, str, null, this.f86050d.getLatitudeLongitude()).getProperties());
    }

    /* renamed from: q */
    public final /* synthetic */ void m17846q(Throwable th2) {
        this.f86049c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: r */
    public final /* synthetic */ void m17845r(String str, String str2, String str3, String str4, Void r12) {
        this.f86052f.onRegisterSuccess(str, str2);
        this.f86052f.sendEvent(new RegisterTracker("Register", "Submit: Register (Owner non SIMR with SIMR)", str3, str, str4, this.f86050d.getLatitudeLongitude()).getProperties());
    }

    public void registerOneSimR(String str, final String str2, final String str3, final String str4, final String str5) {
        this.f86052f.showLoading();
        this.f86051e.add(this.f86047a.register(new RegisterCollection(str, str2, str4, str5, "", str3)).compose(this.f86048b.applyAsync()).subscribe(new Action1() { // from class: av1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17857f(RegisterOneSimRPresenter.this, str2, str3, str4, str5, (Void) obj);
            }
        }, new Action1() { // from class: bv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17852k(RegisterOneSimRPresenter.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: s */
    public final /* synthetic */ void m17844s(Throwable th2) {
        this.f86052f.dismissLoading();
        this.f86049c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: v */
    public final /* synthetic */ void m17841v(TokenCollection tokenCollection) {
        this.f86050d.setSimRToken(tokenCollection.getToken());
        this.f86052f.onVerifySimROTPSuccess();
    }

    public void verifyOTP(String str, String str2, String str3) {
        this.f86052f.showLoading();
        this.f86051e.add(this.f86047a.verifyOTP(new VerifyOtpRequest(str, str2, str3, "register")).compose(this.f86048b.applyAsync()).doOnTerminate(new Action0() { // from class: Xu1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterOneSimRPresenter.m17855h(RegisterOneSimRPresenter.this);
            }
        }).subscribe(new Action1() { // from class: Yu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17856g(RegisterOneSimRPresenter.this, (TokenCollection) obj);
            }
        }, new Action1() { // from class: Zu1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterOneSimRPresenter.m17860c(RegisterOneSimRPresenter.this, (Throwable) obj);
            }
        }));
    }
}