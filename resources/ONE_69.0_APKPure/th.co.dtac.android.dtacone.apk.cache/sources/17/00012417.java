package th.p047co.dtac.android.dtacone.presenter.new_register;

import java.util.List;
import javax.inject.Inject;
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
import th.p047co.dtac.android.dtacone.model.register.SimRListCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IMixpanelTracker;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.new_register.RegisterVerifyMsisdnPresenter;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterVerifyMsisdnPresenter */
/* loaded from: classes8.dex */
public class RegisterVerifyMsisdnPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public RTRApi f86067a;

    /* renamed from: b */
    public RxThreadService f86068b;

    /* renamed from: c */
    public ServerErrorService f86069c;

    /* renamed from: d */
    public TemporaryCache f86070d;

    /* renamed from: e */
    public CompositeSubscription f86071e = new CompositeSubscription();

    /* renamed from: f */
    public View f86072f;

    /* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterVerifyMsisdnPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends ILoadingViewable, IPresenter.IView, IMixpanelTracker {
        void onManySimR(List<String> list);

        void onNoSimR();

        void onOneSimR(String str);

        void onRequestOtpSuccess(RequestOtpResponse requestOtpResponse);

        void onSimR(String str);

        void onVerifyOTPSuccess(String str);
    }

    @Inject
    public RegisterVerifyMsisdnPresenter(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        this.f86067a = rTRApi;
        this.f86068b = rxThreadService;
        this.f86069c = serverErrorService;
        this.f86070d = temporaryCache;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17820a(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter, Throwable th2) {
        registerVerifyMsisdnPresenter.m17802s(th2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17819b(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter, Throwable th2) {
        registerVerifyMsisdnPresenter.m17808m(th2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17818c(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter, String str, SimRListCollection simRListCollection) {
        registerVerifyMsisdnPresenter.m17809l(str, simRListCollection);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17817d(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter, String str, RequestOtpResponse requestOtpResponse) {
        registerVerifyMsisdnPresenter.m17806o(str, requestOtpResponse);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17816e(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter) {
        registerVerifyMsisdnPresenter.m17807n();
    }

    /* renamed from: f */
    public static /* synthetic */ void m17815f(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter, String str, TokenCollection tokenCollection) {
        registerVerifyMsisdnPresenter.m17803r(str, tokenCollection);
    }

    /* renamed from: g */
    public static /* synthetic */ void m17814g(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter) {
        registerVerifyMsisdnPresenter.m17804q();
    }

    /* renamed from: h */
    public static /* synthetic */ void m17813h(RegisterVerifyMsisdnPresenter registerVerifyMsisdnPresenter, Throwable th2) {
        registerVerifyMsisdnPresenter.m17805p(th2);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86072f = (View) iView;
    }

    public void checkSimR(final String str, String str2) {
        this.f86071e.add(this.f86067a.checkSimR(str, str2).compose(this.f86068b.applyAsync()).subscribe(new Action1() { // from class: Kv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterVerifyMsisdnPresenter.m17818c(RegisterVerifyMsisdnPresenter.this, str, (SimRListCollection) obj);
            }
        }, new Action1() { // from class: Lv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterVerifyMsisdnPresenter.m17819b(RegisterVerifyMsisdnPresenter.this, (Throwable) obj);
            }
        }));
    }

    public void getRetryOTP(final String str) {
        this.f86072f.showLoading();
        this.f86071e.add(this.f86067a.requestOtp(new RequestOtpBody(str, "register")).compose(this.f86068b.applyAsync()).doOnTerminate(new Action0() { // from class: Hv1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterVerifyMsisdnPresenter.m17816e(RegisterVerifyMsisdnPresenter.this);
            }
        }).subscribe(new Action1() { // from class: Iv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterVerifyMsisdnPresenter.m17817d(RegisterVerifyMsisdnPresenter.this, str, (RequestOtpResponse) obj);
            }
        }, new Action1() { // from class: Jv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterVerifyMsisdnPresenter.m17813h(RegisterVerifyMsisdnPresenter.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: i */
    public final boolean m17812i(SimRListCollection simRListCollection) {
        if (simRListCollection.getSimRList().size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m17811j(SimRListCollection simRListCollection) {
        if (simRListCollection.getSimRList().size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m17810k(String str, SimRListCollection simRListCollection) {
        return simRListCollection.getSimRList().contains(PhoneNumberFormat.toInternationalNumberFormat(str, PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND));
    }

    /* renamed from: m */
    public final /* synthetic */ void m17808m(Throwable th2) {
        this.f86069c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: n */
    public final /* synthetic */ void m17807n() {
        this.f86072f.dismissLoading();
    }

    /* renamed from: o */
    public final /* synthetic */ void m17806o(String str, RequestOtpResponse requestOtpResponse) {
        this.f86072f.onRequestOtpSuccess(requestOtpResponse);
        this.f86072f.sendEvent(new RegisterTracker("Register", "Request: Resend OTP", null, str, null, this.f86070d.getLatitudeLongitude()).getProperties());
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        super.onStop();
        this.f86071e.clear();
    }

    /* renamed from: p */
    public final /* synthetic */ void m17805p(Throwable th2) {
        this.f86069c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: q */
    public final /* synthetic */ void m17804q() {
        this.f86072f.dismissLoading();
    }

    /* renamed from: r */
    public final /* synthetic */ void m17803r(String str, TokenCollection tokenCollection) {
        this.f86070d.setToken(tokenCollection.getToken());
        this.f86072f.onVerifyOTPSuccess(tokenCollection.getToken());
        this.f86072f.sendEvent(new RegisterTracker("Register", "Request: Verify OTP", null, str, null, this.f86070d.getLatitudeLongitude()).getProperties());
    }

    /* renamed from: s */
    public final /* synthetic */ void m17802s(Throwable th2) {
        this.f86069c.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    /* renamed from: t */
    public final void m17809l(String str, SimRListCollection simRListCollection) {
        if (simRListCollection.getSimRList() != null && simRListCollection.getSimRList().size() > 0) {
            if (m17810k(str, simRListCollection)) {
                this.f86072f.onSimR(simRListCollection.getSimRList().get(0));
                return;
            } else if (m17811j(simRListCollection)) {
                this.f86072f.onOneSimR(simRListCollection.getSimRList().get(0));
                return;
            } else if (m17812i(simRListCollection)) {
                this.f86072f.onManySimR(simRListCollection.getSimRList());
                return;
            } else {
                return;
            }
        }
        this.f86072f.onNoSimR();
    }

    public void verifyOTP(final String str, String str2, String str3) {
        this.f86072f.showLoading();
        this.f86071e.add(this.f86067a.verifyOTP(new VerifyOtpRequest(str, str2, str3, "register")).compose(this.f86068b.applyAsync()).doOnTerminate(new Action0() { // from class: Ev1
            @Override // p046rx.functions.Action0
            public final void call() {
                RegisterVerifyMsisdnPresenter.m17814g(RegisterVerifyMsisdnPresenter.this);
            }
        }).subscribe(new Action1() { // from class: Fv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterVerifyMsisdnPresenter.m17815f(RegisterVerifyMsisdnPresenter.this, str, (TokenCollection) obj);
            }
        }, new Action1() { // from class: Gv1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                RegisterVerifyMsisdnPresenter.m17820a(RegisterVerifyMsisdnPresenter.this, (Throwable) obj);
            }
        }));
    }
}