package th.p047co.dtac.android.dtacone.presenter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pl.charmas.android.reactivelocation.ReactiveLocationProvider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.LocationRequestPresenter_Factory */
/* loaded from: classes8.dex */
public final class LocationRequestPresenter_Factory implements Factory<LocationRequestPresenter> {

    /* renamed from: a */
    public final Provider f85214a;

    /* renamed from: b */
    public final Provider f85215b;

    /* renamed from: c */
    public final Provider f85216c;

    public LocationRequestPresenter_Factory(Provider<ReactiveLocationProvider> provider, Provider<TemporaryCache> provider2, Provider<RxThreadService> provider3) {
        this.f85214a = provider;
        this.f85215b = provider2;
        this.f85216c = provider3;
    }

    public static LocationRequestPresenter_Factory create(Provider<ReactiveLocationProvider> provider, Provider<TemporaryCache> provider2, Provider<RxThreadService> provider3) {
        return new LocationRequestPresenter_Factory(provider, provider2, provider3);
    }

    public static LocationRequestPresenter newInstance(ReactiveLocationProvider reactiveLocationProvider, TemporaryCache temporaryCache, RxThreadService rxThreadService) {
        return new LocationRequestPresenter(reactiveLocationProvider, temporaryCache, rxThreadService);
    }

    @Override // javax.inject.Provider
    public LocationRequestPresenter get() {
        return newInstance((ReactiveLocationProvider) this.f85214a.get(), (TemporaryCache) this.f85215b.get(), (RxThreadService) this.f85216c.get());
    }
}