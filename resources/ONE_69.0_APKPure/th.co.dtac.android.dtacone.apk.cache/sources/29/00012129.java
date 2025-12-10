package th.p047co.dtac.android.dtacone.presenter;

import javax.inject.Inject;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.ForgotPasswordCollection;
import th.p047co.dtac.android.dtacone.presenter.ForgotPasswordPresenterImpl;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

/* renamed from: th.co.dtac.android.dtacone.presenter.ForgotPasswordPresenterImpl */
/* loaded from: classes8.dex */
public class ForgotPasswordPresenterImpl extends LifecyclePresenter {

    /* renamed from: a */
    public View f85202a;

    /* renamed from: b */
    public RTRApi f85203b;

    /* renamed from: c */
    public RxThreadService f85204c;

    /* renamed from: d */
    public ServerErrorService f85205d;

    /* renamed from: e */
    public CompositeSubscription f85206e = new CompositeSubscription();

    /* renamed from: th.co.dtac.android.dtacone.presenter.ForgotPasswordPresenterImpl$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void clearOtp();

        void onForgotPasswordSuccess();
    }

    @Inject
    public ForgotPasswordPresenterImpl(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        this.f85203b = rTRApi;
        this.f85204c = rxThreadService;
        this.f85205d = serverErrorService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19217a(ForgotPasswordPresenterImpl forgotPasswordPresenterImpl, Void r1) {
        forgotPasswordPresenterImpl.m19212f(r1);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19216b(ForgotPasswordPresenterImpl forgotPasswordPresenterImpl, Throwable th2) {
        forgotPasswordPresenterImpl.m19211g(th2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19215c(ForgotPasswordPresenterImpl forgotPasswordPresenterImpl) {
        forgotPasswordPresenterImpl.m19213e();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f85202a = (View) iView;
    }

    public void callForgotPasswordEventFirstLogin(String str, String str2, String str3) {
        m19214d(str, str2, str3, Constant.EVENT_FIRST_LOGIN);
    }

    public void callForgotPasswordEventForceChangePassword(String str, String str2, String str3) {
        m19214d(str, str2, str3, Constant.EVENT_FORCE_CHANGE_PASSWORD);
    }

    public void callForgotPasswordEventForgotPassword(String str, String str2, String str3) {
        m19214d(str, str2, str3, Constant.EVENT_FORGOT_PASSWORD);
    }

    /* renamed from: d */
    public final void m19214d(String str, String str2, String str3, String str4) {
        this.f85206e.add(this.f85203b.forgotPassword(new ForgotPasswordCollection(PhoneNumberFormat.toInternationalNumberFormat(PhoneNumberFormat.removeAllSpecialCharacter(str), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND), str2, str3, str4)).compose(this.f85204c.applyAsync()).doOnTerminate(new Action0() { // from class: A40
            @Override // p046rx.functions.Action0
            public final void call() {
                ForgotPasswordPresenterImpl.m19215c(ForgotPasswordPresenterImpl.this);
            }
        }).subscribe(new Action1() { // from class: B40
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ForgotPasswordPresenterImpl.m19217a(ForgotPasswordPresenterImpl.this, (Void) obj);
            }
        }, new Action1() { // from class: C40
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ForgotPasswordPresenterImpl.m19216b(ForgotPasswordPresenterImpl.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: e */
    public final /* synthetic */ void m19213e() {
        this.f85202a.dismissLoading();
    }

    /* renamed from: f */
    public final /* synthetic */ void m19212f(Void r1) {
        this.f85202a.onForgotPasswordSuccess();
    }

    /* renamed from: g */
    public final /* synthetic */ void m19211g(Throwable th2) {
        this.f85205d.handleException(th2, new ServerErrorService.ExceptionHandler[0]);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f85206e.clear();
    }
}