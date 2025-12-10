package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.repository.OneOnlineRegisterRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModelFactory_Factory implements Factory<OneOnlineRegisterViewModelFactory> {

    /* renamed from: a */
    public final Provider f92973a;

    /* renamed from: b */
    public final Provider f92974b;

    /* renamed from: c */
    public final Provider f92975c;

    /* renamed from: d */
    public final Provider f92976d;

    /* renamed from: e */
    public final Provider f92977e;

    /* renamed from: f */
    public final Provider f92978f;

    public OneOnlineRegisterViewModelFactory_Factory(Provider<OneOnlineRegisterRepository> provider, Provider<CompressImage> provider2, Provider<UdidService> provider3, Provider<FileUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        this.f92973a = provider;
        this.f92974b = provider2;
        this.f92975c = provider3;
        this.f92976d = provider4;
        this.f92977e = provider5;
        this.f92978f = provider6;
    }

    public static OneOnlineRegisterViewModelFactory_Factory create(Provider<OneOnlineRegisterRepository> provider, Provider<CompressImage> provider2, Provider<UdidService> provider3, Provider<FileUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        return new OneOnlineRegisterViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneOnlineRegisterViewModelFactory newInstance(OneOnlineRegisterRepository oneOnlineRegisterRepository, CompressImage compressImage, UdidService udidService, FileUtil fileUtil, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneOnlineRegisterViewModelFactory(oneOnlineRegisterRepository, compressImage, udidService, fileUtil, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneOnlineRegisterViewModelFactory get() {
        return newInstance((OneOnlineRegisterRepository) this.f92973a.get(), (CompressImage) this.f92974b.get(), (UdidService) this.f92975c.get(), (FileUtil) this.f92976d.get(), (Rx2ThreadService) this.f92977e.get(), (OneErrorService) this.f92978f.get());
    }
}