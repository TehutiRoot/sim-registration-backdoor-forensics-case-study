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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel_Factory implements Factory<OneOnlineRegisterViewModel> {

    /* renamed from: a */
    public final Provider f92979a;

    /* renamed from: b */
    public final Provider f92980b;

    /* renamed from: c */
    public final Provider f92981c;

    /* renamed from: d */
    public final Provider f92982d;

    /* renamed from: e */
    public final Provider f92983e;

    /* renamed from: f */
    public final Provider f92984f;

    public OneOnlineRegisterViewModel_Factory(Provider<OneOnlineRegisterRepository> provider, Provider<CompressImage> provider2, Provider<UdidService> provider3, Provider<FileUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        this.f92979a = provider;
        this.f92980b = provider2;
        this.f92981c = provider3;
        this.f92982d = provider4;
        this.f92983e = provider5;
        this.f92984f = provider6;
    }

    public static OneOnlineRegisterViewModel_Factory create(Provider<OneOnlineRegisterRepository> provider, Provider<CompressImage> provider2, Provider<UdidService> provider3, Provider<FileUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        return new OneOnlineRegisterViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneOnlineRegisterViewModel newInstance(OneOnlineRegisterRepository oneOnlineRegisterRepository, CompressImage compressImage, UdidService udidService, FileUtil fileUtil, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneOnlineRegisterViewModel(oneOnlineRegisterRepository, compressImage, udidService, fileUtil, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneOnlineRegisterViewModel get() {
        return newInstance((OneOnlineRegisterRepository) this.f92979a.get(), (CompressImage) this.f92980b.get(), (UdidService) this.f92981c.get(), (FileUtil) this.f92982d.get(), (Rx2ThreadService) this.f92983e.get(), (OneErrorService) this.f92984f.get());
    }
}