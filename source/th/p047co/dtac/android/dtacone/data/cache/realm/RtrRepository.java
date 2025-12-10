package th.p047co.dtac.android.dtacone.data.cache.realm;

import ch.qos.logback.core.joran.action.Action;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import io.realm.ImportFlag;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.XCompany;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.messaging.FirebaseSubscribeTopic;
import th.p047co.dtac.android.dtacone.model.rtr_performance.SaleReportListCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvGroupListCollection;
import th.p047co.dtac.android.dtacone.model.topup.TopUpPriceListCollection;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RtrRepository */
/* loaded from: classes7.dex */
public class RtrRepository {
    public static final String DTACX = "DTACX";
    public static final String MRTR = "MRTR";

    /* renamed from: a */
    public RealmConfiguration f83436a;

    /* renamed from: c */
    public PreferencesViewModel f83438c;

    /* renamed from: e */
    public String f83440e;

    /* renamed from: d */
    public String f83439d = "MRTR";

    /* renamed from: b */
    public Gson f83437b = new GsonBuilder().create();

    @Inject
    public RtrRepository(RealmConfiguration realmConfiguration, PreferencesViewModel preferencesViewModel) {
        this.f83436a = realmConfiguration;
        this.f83438c = preferencesViewModel;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m19578c(Object obj, CacheModel cacheModel) {
        return m19563r(obj, cacheModel);
    }

    /* renamed from: l */
    public static /* synthetic */ CacheModel m19569l(String str, Realm realm) {
        CacheModel cacheModel = (CacheModel) realm.where(CacheModel.class).equalTo(Action.KEY_ATTRIBUTE, str).findFirst();
        if (cacheModel != null) {
            cacheModel.deleteFromRealm();
        }
        return cacheModel;
    }

    /* renamed from: m */
    public static /* synthetic */ Observable m19568m(CacheModel cacheModel) {
        return Observable.just(Boolean.TRUE);
    }

    /* renamed from: o */
    public static /* synthetic */ CacheModel m19566o(String str, Realm realm) {
        return (CacheModel) realm.where(CacheModel.class).equalTo(Action.KEY_ATTRIBUTE, str).findFirst();
    }

    /* renamed from: r */
    public static /* synthetic */ Object m19563r(Object obj, CacheModel cacheModel) {
        return obj;
    }

    public Observable<Boolean> deleteAllCache() {
        return m19573h();
    }

    public Observable<Boolean> deletePerformanceReports() {
        return m19572i("KEY_PERFORMANCE_REPORTS");
    }

    public Observable<Boolean> deleteSaleReports() {
        return m19572i("KEY_RETAILER_SALE_REPORTS");
    }

    public Observable<FirebaseSubscribeTopic> getAllTopicSubscribe() {
        return m19571j(FirebaseSubscribeTopic.class, "KEY_FIREBASE_SUBSCRIBE_TOPIC");
    }

    public String getEnvironmentForUrl() {
        return this.f83440e;
    }

    public String getHeaderApplication() {
        return this.f83439d;
    }

    public <T> Observable<T> getPerformanceReports(Class<T> cls) {
        return m19571j(cls, "KEY_PERFORMANCE_REPORTS");
    }

    public Observable<List<TopUpPriceListCollection>> getPriceList() {
        return m19570k(new TypeToken<List<TopUpPriceListCollection>>() { // from class: th.co.dtac.android.dtacone.data.cache.realm.RtrRepository.1
            {
                RtrRepository.this = this;
            }
        }.getType(), "KEY_PRICE_LIST");
    }

    public Observable<SaleReportListCollection> getSaleReports() {
        return m19571j(SaleReportListCollection.class, "KEY_RETAILER_SALE_REPORTS");
    }

    public Observable<SessionEntity> getSession() {
        if (Objects.equals(this.f83438c.getCompany(), XCompany.TRUE.name())) {
            return getSessionTrue();
        }
        if (Objects.equals(this.f83438c.getCompany(), XCompany.DTAC.name())) {
            return getSessionDtac();
        }
        return getSessionMrtr();
    }

    public Observable<SessionEntity> getSessionDtac() {
        return m19571j(SessionEntity.class, "KEY_LOGIN_SESSION_DTAC");
    }

    public Observable<SessionEntity> getSessionMrtr() {
        return m19571j(SessionEntity.class, "KEY_LOGIN_SESSION");
    }

    public SessionEntity getSessionNow() {
        try {
            if (Objects.equals(this.f83438c.getCompany(), XCompany.TRUE.name())) {
                return getSessionTrue().defaultIfEmpty(new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new ArrayList())).toBlocking().first();
            }
            if (Objects.equals(this.f83438c.getCompany(), XCompany.DTAC.name())) {
                return getSessionDtac().defaultIfEmpty(new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new ArrayList())).toBlocking().first();
            }
            return getSessionMrtr().defaultIfEmpty(new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new ArrayList())).toBlocking().first();
        } catch (Exception unused) {
            return new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new ArrayList());
        }
    }

    public Observable<SessionEntity> getSessionTrue() {
        return m19571j(SessionEntity.class, "KEY_LOGIN_SESSION_TRUE");
    }

    public Observable<List<StvCollection>> getStvPackage() {
        return m19570k(new TypeToken<List<StvCollection>>() { // from class: th.co.dtac.android.dtacone.data.cache.realm.RtrRepository.2
            {
                RtrRepository.this = this;
            }
        }.getType(), "KEY_STV_PACKAGE");
    }

    public Observable<StvGroupListCollection> getStvPhoenixPackage() {
        return m19571j(StvGroupListCollection.class, "KEY_STV_PHOENIX_PACKAGE");
    }

    public TokenCollection getUserSession() {
        return getSessionNow().getToken();
    }

    /* renamed from: h */
    public final Observable m19573h() {
        return RealmObservable.call(this.f83436a, new Action1() { // from class: Ez1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                ((Realm) obj).delete(CacheModel.class);
            }
        });
    }

    /* renamed from: i */
    public final Observable m19572i(final String str) {
        return RealmObservable.object(this.f83436a, new Func1() { // from class: Cz1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                CacheModel m19569l;
                m19569l = RtrRepository.m19569l(str, (Realm) obj);
                return m19569l;
            }
        }).flatMap(new Func1() { // from class: Dz1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19568m;
                m19568m = RtrRepository.m19568m((CacheModel) obj);
                return m19568m;
            }
        }).defaultIfEmpty(Boolean.FALSE);
    }

    /* renamed from: j */
    public final Observable m19571j(Class cls, String str) {
        return m19570k(cls, str);
    }

    /* renamed from: k */
    public final Observable m19570k(final Type type, final String str) {
        return RealmObservable.object(this.f83436a, new Func1() { // from class: Fz1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                CacheModel m19566o;
                m19566o = RtrRepository.m19566o(str, (Realm) obj);
                return m19566o;
            }
        }).flatMap(new Func1() { // from class: Gz1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19565p;
                m19565p = RtrRepository.this.m19565p(type, (CacheModel) obj);
                return m19565p;
            }
        });
    }

    /* renamed from: p */
    public final /* synthetic */ Observable m19565p(Type type, CacheModel cacheModel) {
        if (1 > DateUtil.getDayDifference(cacheModel.realmGet$updatedDate(), new Date())) {
            return Observable.empty();
        }
        return Observable.just(this.f83437b.fromJson(cacheModel.getValue(), type));
    }

    /* renamed from: q */
    public final /* synthetic */ CacheModel m19564q(String str, Object obj, Realm realm) {
        CacheModel cacheModel = new CacheModel();
        cacheModel.setKey(str);
        cacheModel.setValue(this.f83437b.toJson(obj));
        cacheModel.setUpdatedDate(new Date());
        return (CacheModel) realm.copyToRealmOrUpdate((Realm) cacheModel, new ImportFlag[0]);
    }

    /* renamed from: s */
    public final Observable m19562s(final Object obj, final String str) {
        return RealmObservable.object(this.f83436a, new Func1() { // from class: Hz1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj2) {
                CacheModel m19564q;
                m19564q = RtrRepository.this.m19564q(str, obj, (Realm) obj2);
                return m19564q;
            }
        }).map(new Func1() { // from class: Iz1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj2) {
                return RtrRepository.m19578c(obj, (CacheModel) obj2);
            }
        });
    }

    public <T> Observable<T> savePerformanceReports(T t) {
        return m19562s(t, "KEY_PERFORMANCE_REPORTS");
    }

    public Observable<List<TopUpPriceListCollection>> savePriceList(List<TopUpPriceListCollection> list) {
        return m19562s(list, "KEY_PRICE_LIST");
    }

    public Observable<SaleReportListCollection> saveSaleReports(SaleReportListCollection saleReportListCollection) {
        return m19562s(saleReportListCollection, "KEY_RETAILER_SALE_REPORTS");
    }

    public Observable<SessionEntity> saveSession(SessionEntity sessionEntity) {
        return m19562s(sessionEntity, "KEY_LOGIN_SESSION");
    }

    public Observable<List<StvCollection>> saveStvPackage(List<StvCollection> list) {
        return m19562s(list, "KEY_STV_PACKAGE");
    }

    public Observable<StvGroupListCollection> saveStvPhoenixPackage(StvGroupListCollection stvGroupListCollection) {
        return m19562s(stvGroupListCollection, "KEY_STV_PHOENIX_PACKAGE");
    }

    public void setEnvironmentForUrl(String str) {
        this.f83440e = str;
    }

    public void setHeaderApplication(String str) {
        this.f83439d = str;
    }
}
