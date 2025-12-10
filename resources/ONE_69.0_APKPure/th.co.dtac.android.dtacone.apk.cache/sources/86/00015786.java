package th.p047co.dtac.android.dtacone.viewmodel.image.upload;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.image.upload.UploadImageFactory_Factory */
/* loaded from: classes9.dex */
public final class UploadImageFactory_Factory implements Factory<UploadImageFactory> {

    /* renamed from: a */
    public final Provider f106064a;

    /* renamed from: b */
    public final Provider f106065b;

    /* renamed from: c */
    public final Provider f106066c;

    /* renamed from: d */
    public final Provider f106067d;

    public UploadImageFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        this.f106064a = provider;
        this.f106065b = provider2;
        this.f106066c = provider3;
        this.f106067d = provider4;
    }

    public static UploadImageFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        return new UploadImageFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static UploadImageFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, MultiPartService multiPartService) {
        return new UploadImageFactory(rTRApiRx2, rx2ThreadService, serverErrorService, multiPartService);
    }

    @Override // javax.inject.Provider
    public UploadImageFactory get() {
        return newInstance((RTRApiRx2) this.f106064a.get(), (Rx2ThreadService) this.f106065b.get(), (ServerErrorService) this.f106066c.get(), (MultiPartService) this.f106067d.get());
    }
}