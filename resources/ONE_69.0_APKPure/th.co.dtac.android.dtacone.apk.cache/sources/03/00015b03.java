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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.TakePhotoViewModel_Factory */
/* loaded from: classes9.dex */
public final class TakePhotoViewModel_Factory implements Factory<TakePhotoViewModel> {

    /* renamed from: a */
    public final Provider f107100a;

    /* renamed from: b */
    public final Provider f107101b;

    /* renamed from: c */
    public final Provider f107102c;

    /* renamed from: d */
    public final Provider f107103d;

    public TakePhotoViewModel_Factory(Provider<TakePhotoRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f107100a = provider;
        this.f107101b = provider2;
        this.f107102c = provider3;
        this.f107103d = provider4;
    }

    public static TakePhotoViewModel_Factory create(Provider<TakePhotoRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new TakePhotoViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static TakePhotoViewModel newInstance(TakePhotoRepository takePhotoRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new TakePhotoViewModel(takePhotoRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public TakePhotoViewModel get() {
        return newInstance((TakePhotoRepository) this.f107100a.get(), (ConfigurationRepository) this.f107101b.get(), (Rx2ThreadService) this.f107102c.get(), (MrtrErrorService) this.f107103d.get());
    }
}