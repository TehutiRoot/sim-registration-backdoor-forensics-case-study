package th.p047co.dtac.android.dtacone.presenter.staff;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.model.permission.Permission;
import th.p047co.dtac.android.dtacone.model.permission.PermissionResponseCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.staff.UserPermissionPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.staff.UserPermissionPresenter */
/* loaded from: classes8.dex */
public class UserPermissionPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public View f86599a;

    /* renamed from: b */
    public RTRApi f86600b;

    /* renamed from: c */
    public RxThreadService f86601c;

    /* renamed from: d */
    public ServerErrorService f86602d;

    /* renamed from: e */
    public RtrRepository f86603e;

    /* renamed from: f */
    public CompositeSubscription f86604f = new CompositeSubscription();

    /* renamed from: th.co.dtac.android.dtacone.presenter.staff.UserPermissionPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onPerformPermissionError(String str);

        void onPerformPermissionSuccess();
    }

    /* renamed from: th.co.dtac.android.dtacone.presenter.staff.UserPermissionPresenter$a */
    /* loaded from: classes8.dex */
    public class C14390a implements ServerErrorService.ExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Throwable f86605a;

        public C14390a(Throwable th2) {
            UserPermissionPresenter.this = r1;
            this.f86605a = th2;
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public void handle(Throwable th2) {
            UserPermissionPresenter.this.f86599a.onPerformPermissionError(UserPermissionPresenter.this.f86602d.getErrorMessage(this.f86605a));
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public boolean supportHttpCode(int i) {
            return i != 401;
        }
    }

    @Inject
    public UserPermissionPresenter(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository) {
        this.f86600b = rTRApi;
        this.f86601c = rxThreadService;
        this.f86602d = serverErrorService;
        this.f86603e = rtrRepository;
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m17204a(Permission permission) {
        return m17186s(permission);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m17203b(PermissionResponseCollection permissionResponseCollection) {
        return m17184u(permissionResponseCollection);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17202c(UserPermissionPresenter userPermissionPresenter, SessionEntity sessionEntity) {
        userPermissionPresenter.m17188q(sessionEntity);
    }

    /* renamed from: d */
    public static /* synthetic */ Observable m17201d(UserPermissionPresenter userPermissionPresenter, List list) {
        return userPermissionPresenter.m17190o(list);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17200e(UserPermissionPresenter userPermissionPresenter, Throwable th2) {
        userPermissionPresenter.m17187r(th2);
    }

    /* renamed from: f */
    public static /* synthetic */ Observable m17199f(UserPermissionPresenter userPermissionPresenter, SessionEntity sessionEntity) {
        return userPermissionPresenter.m17189p(sessionEntity);
    }

    /* renamed from: g */
    public static /* synthetic */ List m17198g(List list) {
        return m17192m(list);
    }

    /* renamed from: h */
    public static /* synthetic */ String m17197h(Permission permission) {
        return permission.getName();
    }

    /* renamed from: i */
    public static /* synthetic */ SessionEntity m17196i(List list, SessionEntity sessionEntity) {
        return m17191n(list, sessionEntity);
    }

    /* renamed from: m */
    public static /* synthetic */ List m17192m(List list) {
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: n */
    public static /* synthetic */ SessionEntity m17191n(List list, SessionEntity sessionEntity) {
        return new SessionEntity(sessionEntity.getToken(), sessionEntity.getRetailerNumber(), sessionEntity.getDolStatus(), list);
    }

    /* renamed from: s */
    public static /* synthetic */ Boolean m17186s(Permission permission) {
        return Boolean.valueOf(permission.isAllow());
    }

    /* renamed from: u */
    public static /* synthetic */ Observable m17184u(PermissionResponseCollection permissionResponseCollection) {
        return Observable.from(permissionResponseCollection.getPermissions()).filter(new Func1() { // from class: f12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17204a((Permission) obj);
            }
        }).map(new Func1() { // from class: g12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17197h((Permission) obj);
            }
        }).toList();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86599a = (View) iView;
    }

    public void getUserPermission(Long l) {
        m17193l(this.f86600b.getMrtrPermission().concatMap(new Func1() { // from class: e12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17203b((PermissionResponseCollection) obj);
            }
        }));
    }

    /* renamed from: l */
    public final void m17193l(Observable observable) {
        this.f86604f.add(observable.map(new Func1() { // from class: h12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17198g((List) obj);
            }
        }).flatMap(new Func1() { // from class: i12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17201d(UserPermissionPresenter.this, (List) obj);
            }
        }).flatMap(new Func1() { // from class: j12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17199f(UserPermissionPresenter.this, (SessionEntity) obj);
            }
        }).compose(this.f86601c.applyAsync()).subscribe(new Action1() { // from class: k12
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                UserPermissionPresenter.m17202c(UserPermissionPresenter.this, (SessionEntity) obj);
            }
        }, new Action1() { // from class: l12
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                UserPermissionPresenter.m17200e(UserPermissionPresenter.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: o */
    public final /* synthetic */ Observable m17190o(final List list) {
        return this.f86603e.getSession().map(new Func1() { // from class: m12
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return UserPermissionPresenter.m17196i(list, (SessionEntity) obj);
            }
        });
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86604f.clear();
    }

    /* renamed from: p */
    public final /* synthetic */ Observable m17189p(SessionEntity sessionEntity) {
        return this.f86603e.saveSession(sessionEntity);
    }

    /* renamed from: q */
    public final /* synthetic */ void m17188q(SessionEntity sessionEntity) {
        this.f86599a.onPerformPermissionSuccess();
    }

    /* renamed from: r */
    public final /* synthetic */ void m17187r(Throwable th2) {
        this.f86602d.handleException(th2, new C14390a(th2));
    }
}