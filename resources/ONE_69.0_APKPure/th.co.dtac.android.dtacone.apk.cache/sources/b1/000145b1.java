package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModelFactory_Factory implements Factory<OneRegisterTrueOnlineViewModelFactory> {

    /* renamed from: a */
    public final Provider f98297a;

    /* renamed from: b */
    public final Provider f98298b;

    /* renamed from: c */
    public final Provider f98299c;

    /* renamed from: d */
    public final Provider f98300d;

    /* renamed from: e */
    public final Provider f98301e;

    /* renamed from: f */
    public final Provider f98302f;

    /* renamed from: g */
    public final Provider f98303g;

    /* renamed from: h */
    public final Provider f98304h;

    public OneRegisterTrueOnlineViewModelFactory_Factory(Provider<RoomLocationDatabase> provider, Provider<OneTolRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6, Provider<BitmapUtil> provider7, Provider<FileUtil> provider8) {
        this.f98297a = provider;
        this.f98298b = provider2;
        this.f98299c = provider3;
        this.f98300d = provider4;
        this.f98301e = provider5;
        this.f98302f = provider6;
        this.f98303g = provider7;
        this.f98304h = provider8;
    }

    public static OneRegisterTrueOnlineViewModelFactory_Factory create(Provider<RoomLocationDatabase> provider, Provider<OneTolRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6, Provider<BitmapUtil> provider7, Provider<FileUtil> provider8) {
        return new OneRegisterTrueOnlineViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneRegisterTrueOnlineViewModelFactory newInstance(RoomLocationDatabase roomLocationDatabase, OneTolRepository oneTolRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, FileUtil fileUtil) {
        return new OneRegisterTrueOnlineViewModelFactory(roomLocationDatabase, oneTolRepository, rx2ThreadService, oneErrorService, preferencesViewModel, configurationRepository, bitmapUtil, fileUtil);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineViewModelFactory get() {
        return newInstance((RoomLocationDatabase) this.f98297a.get(), (OneTolRepository) this.f98298b.get(), (Rx2ThreadService) this.f98299c.get(), (OneErrorService) this.f98300d.get(), (PreferencesViewModel) this.f98301e.get(), (ConfigurationRepository) this.f98302f.get(), (BitmapUtil) this.f98303g.get(), (FileUtil) this.f98304h.get());
    }
}