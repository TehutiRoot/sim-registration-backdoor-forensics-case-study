package th.p047co.dtac.android.dtacone.presenter.address;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressPresenter_Factory */
/* loaded from: classes8.dex */
public final class QueryAddressPresenter_Factory implements Factory<QueryAddressPresenter> {

    /* renamed from: a */
    public final Provider f85266a;

    /* renamed from: b */
    public final Provider f85267b;

    /* renamed from: c */
    public final Provider f85268c;

    /* renamed from: d */
    public final Provider f85269d;

    /* renamed from: e */
    public final Provider f85270e;

    /* renamed from: f */
    public final Provider f85271f;

    /* renamed from: g */
    public final Provider f85272g;

    public QueryAddressPresenter_Factory(Provider<BriteDatabase> provider, Provider<LanguageService> provider2, Provider<RxThreadService> provider3, Provider<Rx2ThreadService> provider4, Provider<RTRApi> provider5, Provider<RTRApiRx2> provider6, Provider<ServerErrorService> provider7) {
        this.f85266a = provider;
        this.f85267b = provider2;
        this.f85268c = provider3;
        this.f85269d = provider4;
        this.f85270e = provider5;
        this.f85271f = provider6;
        this.f85272g = provider7;
    }

    public static QueryAddressPresenter_Factory create(Provider<BriteDatabase> provider, Provider<LanguageService> provider2, Provider<RxThreadService> provider3, Provider<Rx2ThreadService> provider4, Provider<RTRApi> provider5, Provider<RTRApiRx2> provider6, Provider<ServerErrorService> provider7) {
        return new QueryAddressPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static QueryAddressPresenter newInstance(BriteDatabase briteDatabase, LanguageService languageService, RxThreadService rxThreadService, Rx2ThreadService rx2ThreadService, RTRApi rTRApi, RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService) {
        return new QueryAddressPresenter(briteDatabase, languageService, rxThreadService, rx2ThreadService, rTRApi, rTRApiRx2, serverErrorService);
    }

    @Override // javax.inject.Provider
    public QueryAddressPresenter get() {
        return newInstance((BriteDatabase) this.f85266a.get(), (LanguageService) this.f85267b.get(), (RxThreadService) this.f85268c.get(), (Rx2ThreadService) this.f85269d.get(), (RTRApi) this.f85270e.get(), (RTRApiRx2) this.f85271f.get(), (ServerErrorService) this.f85272g.get());
    }
}