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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel_Factory */
/* loaded from: classes9.dex */
public final class QRViewModel_Factory implements Factory<QRViewModel> {

    /* renamed from: a */
    public final Provider f107076a;

    public QRViewModel_Factory(Provider<Rx2ThreadService> provider) {
        this.f107076a = provider;
    }

    public static QRViewModel_Factory create(Provider<Rx2ThreadService> provider) {
        return new QRViewModel_Factory(provider);
    }

    public static QRViewModel newInstance(Rx2ThreadService rx2ThreadService) {
        return new QRViewModel(rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public QRViewModel get() {
        return newInstance((Rx2ThreadService) this.f107076a.get());
    }
}