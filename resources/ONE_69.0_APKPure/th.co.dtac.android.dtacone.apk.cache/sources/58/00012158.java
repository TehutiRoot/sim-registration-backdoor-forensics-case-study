package th.p047co.dtac.android.dtacone.presenter.address;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter_Factory */
/* loaded from: classes8.dex */
public final class QueryAddressFromDbPresenter_Factory implements Factory<QueryAddressFromDbPresenter> {

    /* renamed from: a */
    public final Provider f85249a;

    /* renamed from: b */
    public final Provider f85250b;

    /* renamed from: c */
    public final Provider f85251c;

    public QueryAddressFromDbPresenter_Factory(Provider<BriteDatabase> provider, Provider<LanguageService> provider2, Provider<RxThreadService> provider3) {
        this.f85249a = provider;
        this.f85250b = provider2;
        this.f85251c = provider3;
    }

    public static QueryAddressFromDbPresenter_Factory create(Provider<BriteDatabase> provider, Provider<LanguageService> provider2, Provider<RxThreadService> provider3) {
        return new QueryAddressFromDbPresenter_Factory(provider, provider2, provider3);
    }

    public static QueryAddressFromDbPresenter newInstance(BriteDatabase briteDatabase, LanguageService languageService, RxThreadService rxThreadService) {
        return new QueryAddressFromDbPresenter(briteDatabase, languageService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public QueryAddressFromDbPresenter get() {
        return newInstance((BriteDatabase) this.f85249a.get(), (LanguageService) this.f85250b.get(), (RxThreadService) this.f85251c.get());
    }
}