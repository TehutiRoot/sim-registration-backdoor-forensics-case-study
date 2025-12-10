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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.image.upload.UploadImageViewModel_Factory */
/* loaded from: classes9.dex */
public final class UploadImageViewModel_Factory implements Factory<UploadImageViewModel> {

    /* renamed from: a */
    public final Provider f106075a;

    /* renamed from: b */
    public final Provider f106076b;

    /* renamed from: c */
    public final Provider f106077c;

    /* renamed from: d */
    public final Provider f106078d;

    public UploadImageViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        this.f106075a = provider;
        this.f106076b = provider2;
        this.f106077c = provider3;
        this.f106078d = provider4;
    }

    public static UploadImageViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        return new UploadImageViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static UploadImageViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, MultiPartService multiPartService) {
        return new UploadImageViewModel(rTRApiRx2, rx2ThreadService, serverErrorService, multiPartService);
    }

    @Override // javax.inject.Provider
    public UploadImageViewModel get() {
        return newInstance((RTRApiRx2) this.f106075a.get(), (Rx2ThreadService) this.f106076b.get(), (ServerErrorService) this.f106077c.get(), (MultiPartService) this.f106078d.get());
    }
}