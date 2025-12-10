package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneAddressViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneAddressViewModel_Factory implements Factory<OneAddressViewModel> {

    /* renamed from: a */
    public final Provider f97023a;

    /* renamed from: b */
    public final Provider f97024b;

    /* renamed from: c */
    public final Provider f97025c;

    /* renamed from: d */
    public final Provider f97026d;

    /* renamed from: e */
    public final Provider f97027e;

    /* renamed from: f */
    public final Provider f97028f;

    public OneAddressViewModel_Factory(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<LanguageService> provider5, Provider<BriteDatabase> provider6) {
        this.f97023a = provider;
        this.f97024b = provider2;
        this.f97025c = provider3;
        this.f97026d = provider4;
        this.f97027e = provider5;
        this.f97028f = provider6;
    }

    public static OneAddressViewModel_Factory create(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<LanguageService> provider5, Provider<BriteDatabase> provider6) {
        return new OneAddressViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneAddressViewModel newInstance(OneRetailerProfileUpdateRepository oneRetailerProfileUpdateRepository, RtrRepository rtrRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, LanguageService languageService, BriteDatabase briteDatabase) {
        return new OneAddressViewModel(oneRetailerProfileUpdateRepository, rtrRepository, rx2ThreadService, oneErrorService, languageService, briteDatabase);
    }

    @Override // javax.inject.Provider
    public OneAddressViewModel get() {
        return newInstance((OneRetailerProfileUpdateRepository) this.f97023a.get(), (RtrRepository) this.f97024b.get(), (Rx2ThreadService) this.f97025c.get(), (OneErrorService) this.f97026d.get(), (LanguageService) this.f97027e.get(), (BriteDatabase) this.f97028f.get());
    }
}