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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneAddressViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneAddressViewModelFactory_Factory implements Factory<OneAddressViewModelFactory> {

    /* renamed from: a */
    public final Provider f97017a;

    /* renamed from: b */
    public final Provider f97018b;

    /* renamed from: c */
    public final Provider f97019c;

    /* renamed from: d */
    public final Provider f97020d;

    /* renamed from: e */
    public final Provider f97021e;

    /* renamed from: f */
    public final Provider f97022f;

    public OneAddressViewModelFactory_Factory(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<LanguageService> provider5, Provider<BriteDatabase> provider6) {
        this.f97017a = provider;
        this.f97018b = provider2;
        this.f97019c = provider3;
        this.f97020d = provider4;
        this.f97021e = provider5;
        this.f97022f = provider6;
    }

    public static OneAddressViewModelFactory_Factory create(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<LanguageService> provider5, Provider<BriteDatabase> provider6) {
        return new OneAddressViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneAddressViewModelFactory newInstance(OneRetailerProfileUpdateRepository oneRetailerProfileUpdateRepository, RtrRepository rtrRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, LanguageService languageService, BriteDatabase briteDatabase) {
        return new OneAddressViewModelFactory(oneRetailerProfileUpdateRepository, rtrRepository, rx2ThreadService, oneErrorService, languageService, briteDatabase);
    }

    @Override // javax.inject.Provider
    public OneAddressViewModelFactory get() {
        return newInstance((OneRetailerProfileUpdateRepository) this.f97017a.get(), (RtrRepository) this.f97018b.get(), (Rx2ThreadService) this.f97019c.get(), (OneErrorService) this.f97020d.get(), (LanguageService) this.f97021e.get(), (BriteDatabase) this.f97022f.get());
    }
}