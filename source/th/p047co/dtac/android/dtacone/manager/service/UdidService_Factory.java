package th.p047co.dtac.android.dtacone.manager.service;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.service.UdidService_Factory */
/* loaded from: classes7.dex */
public final class UdidService_Factory implements Factory<UdidService> {

    /* renamed from: a */
    public final Provider f85035a;

    public UdidService_Factory(Provider<Application> provider) {
        this.f85035a = provider;
    }

    public static UdidService_Factory create(Provider<Application> provider) {
        return new UdidService_Factory(provider);
    }

    public static UdidService newInstance(Application application) {
        return new UdidService(application);
    }

    @Override // javax.inject.Provider
    public UdidService get() {
        return newInstance((Application) this.f85035a.get());
    }
}
