package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel_Factory implements Factory<OneRectifyViewModel> {

    /* renamed from: a */
    public final Provider f96177a;

    /* renamed from: b */
    public final Provider f96178b;

    /* renamed from: c */
    public final Provider f96179c;

    /* renamed from: d */
    public final Provider f96180d;

    public OneRectifyViewModel_Factory(Provider<OneRectifyRepository> provider, Provider<PreferencesViewModel> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        this.f96177a = provider;
        this.f96178b = provider2;
        this.f96179c = provider3;
        this.f96180d = provider4;
    }

    public static OneRectifyViewModel_Factory create(Provider<OneRectifyRepository> provider, Provider<PreferencesViewModel> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        return new OneRectifyViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRectifyViewModel newInstance(OneRectifyRepository oneRectifyRepository, PreferencesViewModel preferencesViewModel, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneRectifyViewModel(oneRectifyRepository, preferencesViewModel, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneRectifyViewModel get() {
        return newInstance((OneRectifyRepository) this.f96177a.get(), (PreferencesViewModel) this.f96178b.get(), (Rx2ThreadService) this.f96179c.get(), (OneErrorService) this.f96180d.get());
    }
}