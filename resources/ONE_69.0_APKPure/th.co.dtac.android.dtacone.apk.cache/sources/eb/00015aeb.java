package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class QRViewModelFactory_Factory implements Factory<QRViewModelFactory> {

    /* renamed from: a */
    public final Provider f107075a;

    public QRViewModelFactory_Factory(Provider<Rx2ThreadService> provider) {
        this.f107075a = provider;
    }

    public static QRViewModelFactory_Factory create(Provider<Rx2ThreadService> provider) {
        return new QRViewModelFactory_Factory(provider);
    }

    public static QRViewModelFactory newInstance(Rx2ThreadService rx2ThreadService) {
        return new QRViewModelFactory(rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public QRViewModelFactory get() {
        return newInstance((Rx2ThreadService) this.f107075a.get());
    }
}