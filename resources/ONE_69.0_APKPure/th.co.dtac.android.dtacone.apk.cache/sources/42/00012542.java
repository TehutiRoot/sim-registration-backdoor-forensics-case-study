package th.p047co.dtac.android.dtacone.presenter.service;

import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.PerformanceReportsCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.service.PerformanceReportPresenter;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;

/* renamed from: th.co.dtac.android.dtacone.presenter.service.PerformanceReportPresenter */
/* loaded from: classes8.dex */
public class PerformanceReportPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public View f86484a;

    /* renamed from: b */
    public RTRApi f86485b;

    /* renamed from: c */
    public RtrRepository f86486c;

    /* renamed from: d */
    public RxThreadService f86487d;

    /* renamed from: e */
    public ServerErrorService f86488e;

    /* renamed from: f */
    public CompositeSubscription f86489f = new CompositeSubscription();

    /* renamed from: th.co.dtac.android.dtacone.presenter.service.PerformanceReportPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void dismissRefreshingProgress();

        void displayPerformanceReportsFail();

        void displayPerformanceReportsSuccess(Parcelable parcelable);
    }

    /* renamed from: th.co.dtac.android.dtacone.presenter.service.PerformanceReportPresenter$a */
    /* loaded from: classes8.dex */
    public class C14381a implements ServerErrorService.ExceptionHandler {
        public C14381a() {
            PerformanceReportPresenter.this = r1;
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public void handle(Throwable th2) {
            PerformanceReportPresenter.this.f86484a.displayPerformanceReportsFail();
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public boolean supportHttpCode(int i) {
            return i != 401;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.presenter.service.PerformanceReportPresenter$b */
    /* loaded from: classes8.dex */
    public class C14382b implements ServerErrorService.ExceptionHandler {
        public C14382b() {
            PerformanceReportPresenter.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m17319a(Boolean bool) {
            m17317c(bool);
        }

        /* renamed from: b */
        public static /* synthetic */ void m17318b(Throwable th2) {
            m17316d(th2);
        }

        /* renamed from: c */
        public static /* synthetic */ void m17317c(Boolean bool) {
        }

        /* renamed from: d */
        public static /* synthetic */ void m17316d(Throwable th2) {
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public void handle(Throwable th2) {
            PerformanceReportPresenter.this.f86489f.add(PerformanceReportPresenter.this.f86486c.deletePerformanceReports().compose(PerformanceReportPresenter.this.f86487d.applyAsync()).subscribe(new Action1() { // from class: Tk1
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    PerformanceReportPresenter.C14382b.m17319a((Boolean) obj);
                }
            }, new Action1() { // from class: Uk1
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    PerformanceReportPresenter.C14382b.m17318b((Throwable) obj);
                }
            }));
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
        public boolean supportHttpCode(int i) {
            return i == 404;
        }
    }

    @Inject
    public PerformanceReportPresenter(RTRApi rTRApi, RtrRepository rtrRepository, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        this.f86485b = rTRApi;
        this.f86486c = rtrRepository;
        this.f86487d = rxThreadService;
        this.f86488e = serverErrorService;
    }

    /* renamed from: a */
    public static /* synthetic */ Observable m17337a(PerformanceReportPresenter performanceReportPresenter, StaffDetailCollection staffDetailCollection) {
        return performanceReportPresenter.m17320r(staffDetailCollection);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17336b(PerformanceReportPresenter performanceReportPresenter, Throwable th2) {
        performanceReportPresenter.m17322p(th2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17335c(PerformanceReportPresenter performanceReportPresenter, Parcelable parcelable) {
        performanceReportPresenter.m17323o(parcelable);
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m17334d(Parcelable parcelable) {
        return m17325m(parcelable);
    }

    /* renamed from: e */
    public static /* synthetic */ Observable m17333e(PerformanceReportPresenter performanceReportPresenter, PerformanceReportsCollection performanceReportsCollection) {
        return performanceReportPresenter.m17321q(performanceReportsCollection);
    }

    /* renamed from: f */
    public static /* synthetic */ void m17332f(PerformanceReportPresenter performanceReportPresenter) {
        performanceReportPresenter.m17324n();
    }

    /* renamed from: m */
    public static /* synthetic */ Boolean m17325m(Parcelable parcelable) {
        boolean z;
        if (parcelable != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86484a = (View) iView;
    }

    public <T extends Parcelable> void fetchPerformanceReports(boolean z, Class<T> cls, Long l) {
        this.f86489f.add(Observable.concat(getPerformanceReportsFromDB(z, cls), getPerformanceReportsFromNetwork(cls, l)).first(new Func1() { // from class: Nk1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return PerformanceReportPresenter.m17334d((Parcelable) obj);
            }
        }).compose(this.f86487d.applyAsync()).doOnTerminate(new Action0() { // from class: Ok1
            @Override // p046rx.functions.Action0
            public final void call() {
                PerformanceReportPresenter.m17332f(PerformanceReportPresenter.this);
            }
        }).subscribe(new Action1() { // from class: Pk1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                PerformanceReportPresenter.m17335c(PerformanceReportPresenter.this, (Parcelable) obj);
            }
        }, new Action1() { // from class: Qk1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                PerformanceReportPresenter.m17336b(PerformanceReportPresenter.this, (Throwable) obj);
            }
        }));
    }

    public <T> Observable<T> getPerformanceReportsFromDB(boolean z, Class<T> cls) {
        if (z) {
            return Observable.empty();
        }
        return this.f86486c.getPerformanceReports(cls);
    }

    public <T> Observable<T> getPerformanceReportsFromNetwork(Class<T> cls, Long l) {
        if (cls.isAssignableFrom(PerformanceReportsCollection.class)) {
            return m17327k().cast(cls);
        }
        if (cls.isAssignableFrom(StaffDetailCollection.class)) {
            return m17326l(l).cast(cls);
        }
        return Observable.empty();
    }

    /* renamed from: k */
    public final Observable m17327k() {
        return this.f86485b.getPerformanceReports().flatMap(new Func1() { // from class: Sk1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return PerformanceReportPresenter.m17333e(PerformanceReportPresenter.this, (PerformanceReportsCollection) obj);
            }
        });
    }

    /* renamed from: l */
    public final Observable m17326l(Long l) {
        return this.f86485b.getStaffDetail(l).flatMap(new Func1() { // from class: Rk1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return PerformanceReportPresenter.m17337a(PerformanceReportPresenter.this, (StaffDetailCollection) obj);
            }
        });
    }

    /* renamed from: n */
    public final /* synthetic */ void m17324n() {
        this.f86484a.dismissRefreshingProgress();
    }

    /* renamed from: o */
    public final /* synthetic */ void m17323o(Parcelable parcelable) {
        if (parcelable != null) {
            this.f86484a.displayPerformanceReportsSuccess(parcelable);
        } else {
            this.f86484a.displayPerformanceReportsFail();
        }
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86489f.clear();
    }

    /* renamed from: p */
    public final /* synthetic */ void m17322p(Throwable th2) {
        this.f86488e.handleException(th2, new C14381a(), new C14382b());
    }

    /* renamed from: r */
    public final /* synthetic */ Observable m17320r(StaffDetailCollection staffDetailCollection) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        staffDetailCollection.setDisplayDate(new SimpleDateFormat(DateUtil.FORMAT_SERVER_DATE_TIME, Locale.US).format(calendar.getTime()));
        return m17321q(staffDetailCollection);
    }

    /* renamed from: savePerformanceReportsToDB */
    public <T> Observable<T> m17321q(T t) {
        return this.f86486c.savePerformanceReports(t);
    }
}