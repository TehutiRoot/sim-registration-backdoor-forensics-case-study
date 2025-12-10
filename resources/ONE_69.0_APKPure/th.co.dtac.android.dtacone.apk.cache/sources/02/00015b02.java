package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.take_photo.TakePhotoRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.TakePhotoViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class TakePhotoViewModelFactory_Factory implements Factory<TakePhotoViewModelFactory> {

    /* renamed from: a */
    public final Provider f107096a;

    /* renamed from: b */
    public final Provider f107097b;

    /* renamed from: c */
    public final Provider f107098c;

    /* renamed from: d */
    public final Provider f107099d;

    public TakePhotoViewModelFactory_Factory(Provider<TakePhotoRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<MrtrErrorService> provider4) {
        this.f107096a = provider;
        this.f107097b = provider2;
        this.f107098c = provider3;
        this.f107099d = provider4;
    }

    public static TakePhotoViewModelFactory_Factory create(Provider<TakePhotoRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<MrtrErrorService> provider4) {
        return new TakePhotoViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static TakePhotoViewModelFactory newInstance(TakePhotoRepository takePhotoRepository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, MrtrErrorService mrtrErrorService) {
        return new TakePhotoViewModelFactory(takePhotoRepository, rx2ThreadService, configurationRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public TakePhotoViewModelFactory get() {
        return newInstance((TakePhotoRepository) this.f107096a.get(), (Rx2ThreadService) this.f107097b.get(), (ConfigurationRepository) this.f107098c.get(), (MrtrErrorService) this.f107099d.get());
    }
}