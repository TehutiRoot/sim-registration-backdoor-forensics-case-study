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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneRectifyViewModelFactory_Factory implements Factory<OneRectifyViewModelFactory> {

    /* renamed from: a */
    public final Provider f96173a;

    /* renamed from: b */
    public final Provider f96174b;

    /* renamed from: c */
    public final Provider f96175c;

    /* renamed from: d */
    public final Provider f96176d;

    public OneRectifyViewModelFactory_Factory(Provider<OneRectifyRepository> provider, Provider<PreferencesViewModel> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        this.f96173a = provider;
        this.f96174b = provider2;
        this.f96175c = provider3;
        this.f96176d = provider4;
    }

    public static OneRectifyViewModelFactory_Factory create(Provider<OneRectifyRepository> provider, Provider<PreferencesViewModel> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        return new OneRectifyViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRectifyViewModelFactory newInstance(OneRectifyRepository oneRectifyRepository, PreferencesViewModel preferencesViewModel, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneRectifyViewModelFactory(oneRectifyRepository, preferencesViewModel, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneRectifyViewModelFactory get() {
        return newInstance((OneRectifyRepository) this.f96173a.get(), (PreferencesViewModel) this.f96174b.get(), (Rx2ThreadService) this.f96175c.get(), (OneErrorService) this.f96176d.get());
    }
}