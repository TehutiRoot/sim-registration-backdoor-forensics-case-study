package th.p047co.dtac.android.dtacone.manager.config;

import android.app.Application;
import android.content.Context;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.ResponseBody;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.data.cache.database.LanguageDbHelper;
import th.p047co.dtac.android.dtacone.data.cache.database.LocationDbHelper;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.config.MobileConfigService;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.model.ServerVersionCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.config.MobileConfigService */
/* loaded from: classes7.dex */
public class MobileConfigService {

    /* renamed from: a */
    public Context f84915a;

    /* renamed from: b */
    public RTRApi f84916b;

    /* renamed from: c */
    public LanguageService f84917c;

    /* renamed from: d */
    public PreferencesRepository f84918d;

    /* renamed from: e */
    public ConfigRepository f84919e;

    /* renamed from: f */
    public RxThreadService f84920f;

    /* renamed from: g */
    public CompositeSubscription f84921g = new CompositeSubscription();

    @Inject
    public MobileConfigService(Application application, RTRApi rTRApi, LanguageService languageService, PreferencesRepository preferencesRepository, ConfigRepository configRepository, RxThreadService rxThreadService) {
        this.f84915a = application;
        this.f84916b = rTRApi;
        this.f84917c = languageService;
        this.f84918d = preferencesRepository;
        this.f84919e = configRepository;
        this.f84920f = rxThreadService;
    }

    /* renamed from: E */
    public static /* synthetic */ Boolean m19325E(Boolean bool) {
        return bool;
    }

    /* renamed from: G */
    public static /* synthetic */ void m19323G(Throwable th2) {
    }

    /* renamed from: b */
    public static /* synthetic */ void m19320b(MobileConfigService mobileConfigService, Map map) {
        mobileConfigService.m19322H(map);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19319c(Throwable th2) {
        m19323G(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ ServerVersionCollection m19318d(ServerVersionCollection serverVersionCollection, Map map) {
        return m19297y(serverVersionCollection, map);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19317e(MobileConfigService mobileConfigService, Boolean bool) {
        mobileConfigService.m19324F(bool);
    }

    /* renamed from: f */
    public static /* synthetic */ Boolean m19316f(ServerVersionCollection serverVersionCollection) {
        return m19296z(serverVersionCollection);
    }

    /* renamed from: g */
    public static /* synthetic */ Boolean m19315g(Boolean bool) {
        return m19325E(bool);
    }

    /* renamed from: h */
    public static /* synthetic */ void m19314h(MobileConfigService mobileConfigService, Boolean bool) {
        mobileConfigService.m19302t(bool);
    }

    /* renamed from: i */
    public static /* synthetic */ Boolean m19313i(MobileConfigService mobileConfigService, ResponseBody responseBody) {
        return mobileConfigService.m19328B(responseBody);
    }

    /* renamed from: j */
    public static /* synthetic */ void m19312j(Throwable th2) {
        m19298x(th2);
    }

    /* renamed from: l */
    public static /* synthetic */ void m19310l(Boolean bool) {
        m19299w(bool);
    }

    /* renamed from: m */
    public static /* synthetic */ void m19309m(MobileConfigService mobileConfigService, Boolean bool) {
        mobileConfigService.m19327C(bool);
    }

    /* renamed from: n */
    public static /* synthetic */ Boolean m19308n(Boolean bool) {
        return m19300v(bool);
    }

    /* renamed from: o */
    public static /* synthetic */ Boolean m19307o(MobileConfigService mobileConfigService, ResponseBody responseBody) {
        return mobileConfigService.m19303s(responseBody);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19306p(Throwable th2) {
        m19304r(th2);
    }

    /* renamed from: q */
    public static /* synthetic */ Boolean m19305q(MobileConfigService mobileConfigService, ServerVersionCollection serverVersionCollection) {
        return mobileConfigService.m19329A(serverVersionCollection);
    }

    /* renamed from: r */
    public static /* synthetic */ void m19304r(Throwable th2) {
    }

    /* renamed from: v */
    public static /* synthetic */ Boolean m19300v(Boolean bool) {
        return bool;
    }

    /* renamed from: w */
    public static /* synthetic */ void m19299w(Boolean bool) {
    }

    /* renamed from: x */
    public static /* synthetic */ void m19298x(Throwable th2) {
    }

    /* renamed from: y */
    public static /* synthetic */ ServerVersionCollection m19297y(ServerVersionCollection serverVersionCollection, Map map) {
        int i;
        int i2 = 0;
        try {
            i = Integer.parseInt(serverVersionCollection.getVersion());
            try {
                i2 = Integer.parseInt((String) map.get(Constant.PREF_DATABASE_CONFIG_VERSION));
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Mailing address current version: ");
        sb.append(i2);
        sb.append(", server version: ");
        sb.append(i);
        if (i2 < i) {
            return serverVersionCollection;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Current mailing address is up to date with version ");
        sb2.append(i2);
        return null;
    }

    /* renamed from: z */
    public static /* synthetic */ Boolean m19296z(ServerVersionCollection serverVersionCollection) {
        boolean z;
        if (serverVersionCollection != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: A */
    public final /* synthetic */ Boolean m19329A(ServerVersionCollection serverVersionCollection) {
        int i;
        int i2 = 0;
        try {
            i = Integer.parseInt(serverVersionCollection.getVersion());
            try {
                i2 = Integer.parseInt(this.f84918d.getString(Constant.PREF_DATABASE_CONFIG_VERSION));
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration current version: ");
        sb.append(i2);
        sb.append(", server version: ");
        sb.append(i);
        if (i2 < i) {
            return Boolean.TRUE;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Current configuration is up to date with version ");
        sb2.append(i2);
        return Boolean.FALSE;
    }

    /* renamed from: B */
    public final /* synthetic */ Boolean m19328B(ResponseBody responseBody) {
        return Boolean.valueOf(FileUtil.downloadDatabaseToDisk(this.f84915a, responseBody, LanguageDbHelper.DATABASE_LANGUAGE_NAME));
    }

    /* renamed from: C */
    public final /* synthetic */ void m19327C(Boolean bool) {
        this.f84919e.reloadDatable();
    }

    /* renamed from: D */
    public final /* synthetic */ Observable m19326D(ServerVersionCollection serverVersionCollection) {
        return this.f84916b.downloadDatabase(serverVersionCollection.getUrl()).map(new Func1() { // from class: Ps0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MobileConfigService.m19313i(MobileConfigService.this, (ResponseBody) obj);
            }
        }).doOnNext(new Action1() { // from class: Qs0
            {
                MobileConfigService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19309m(MobileConfigService.this, (Boolean) obj);
            }
        });
    }

    /* renamed from: F */
    public final /* synthetic */ void m19324F(Boolean bool) {
        loadConfig();
        this.f84917c.loadLanguage();
    }

    /* renamed from: H */
    public final void m19322H(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Loading mobile config ");
            sb.append((String) entry.getKey());
            sb.append(" : ");
            sb.append((String) entry.getValue());
            this.f84918d.setString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public void cleanConfigResource() {
        this.f84921g.clear();
    }

    public void loadConfig() {
        this.f84921g.add(this.f84919e.loadConfig().compose(this.f84920f.applyBackground()).subscribe(new Action1() { // from class: Js0
            {
                MobileConfigService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19320b(MobileConfigService.this, (Map) obj);
            }
        }, new Action1() { // from class: Rs0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19306p((Throwable) obj);
            }
        }));
    }

    /* renamed from: s */
    public final /* synthetic */ Boolean m19303s(ResponseBody responseBody) {
        return Boolean.valueOf(FileUtil.downloadDatabaseToDisk(this.f84915a, responseBody, LocationDbHelper.DATABASE_LOCATION_NAME));
    }

    /* renamed from: t */
    public final /* synthetic */ void m19302t(Boolean bool) {
        this.f84919e.reloadLocationDatabase();
    }

    /* renamed from: u */
    public final /* synthetic */ Observable m19301u(ServerVersionCollection serverVersionCollection) {
        return this.f84916b.downloadDatabase(serverVersionCollection.getUrl()).map(new Func1() { // from class: Ns0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MobileConfigService.m19307o(MobileConfigService.this, (ResponseBody) obj);
            }
        }).doOnNext(new Action1() { // from class: Os0
            {
                MobileConfigService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19314h(MobileConfigService.this, (Boolean) obj);
            }
        });
    }

    public void updateMailingAddress() {
        Observable<Map<String, String>> loadLocationConfig = this.f84919e.loadLocationConfig();
        this.f84921g.add(Observable.zip(this.f84916b.checkMailingAddressVersion(), loadLocationConfig, new Func2() { // from class: Ss0
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return MobileConfigService.m19318d((ServerVersionCollection) obj, (Map) obj2);
            }
        }).filter(new Func1() { // from class: Ts0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MobileConfigService.m19316f((ServerVersionCollection) obj);
            }
        }).flatMap(new Func1() { // from class: Us0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19301u;
                m19301u = MobileConfigService.this.m19301u((ServerVersionCollection) obj);
                return m19301u;
            }
        }).filter(new Func1() { // from class: Vs0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MobileConfigService.m19308n((Boolean) obj);
            }
        }).compose(this.f84920f.applyBackground()).subscribe(new Action1() { // from class: Ws0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19310l((Boolean) obj);
            }
        }, new Action1() { // from class: Xs0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19312j((Throwable) obj);
            }
        }));
    }

    public void updateMobileConfig() {
        this.f84921g.add(this.f84916b.checkMobileConfigVersion().filter(new Func1() { // from class: Ys0
            {
                MobileConfigService.this = this;
            }

            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MobileConfigService.m19305q(MobileConfigService.this, (ServerVersionCollection) obj);
            }
        }).flatMap(new Func1() { // from class: Zs0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19326D;
                m19326D = MobileConfigService.this.m19326D((ServerVersionCollection) obj);
                return m19326D;
            }
        }).filter(new Func1() { // from class: Ks0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MobileConfigService.m19315g((Boolean) obj);
            }
        }).compose(this.f84920f.applyBackground()).subscribe(new Action1() { // from class: Ls0
            {
                MobileConfigService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19317e(MobileConfigService.this, (Boolean) obj);
            }
        }, new Action1() { // from class: Ms0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                MobileConfigService.m19319c((Throwable) obj);
            }
        }));
    }
}
