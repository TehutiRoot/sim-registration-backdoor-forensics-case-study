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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel_Factory implements Factory<OneRegisterTrueOnlineViewModel> {

    /* renamed from: a */
    public final Provider f98305a;

    /* renamed from: b */
    public final Provider f98306b;

    /* renamed from: c */
    public final Provider f98307c;

    /* renamed from: d */
    public final Provider f98308d;

    /* renamed from: e */
    public final Provider f98309e;

    /* renamed from: f */
    public final Provider f98310f;

    /* renamed from: g */
    public final Provider f98311g;

    /* renamed from: h */
    public final Provider f98312h;

    public OneRegisterTrueOnlineViewModel_Factory(Provider<RoomLocationDatabase> provider, Provider<OneTolRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6, Provider<BitmapUtil> provider7, Provider<FileUtil> provider8) {
        this.f98305a = provider;
        this.f98306b = provider2;
        this.f98307c = provider3;
        this.f98308d = provider4;
        this.f98309e = provider5;
        this.f98310f = provider6;
        this.f98311g = provider7;
        this.f98312h = provider8;
    }

    public static OneRegisterTrueOnlineViewModel_Factory create(Provider<RoomLocationDatabase> provider, Provider<OneTolRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6, Provider<BitmapUtil> provider7, Provider<FileUtil> provider8) {
        return new OneRegisterTrueOnlineViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneRegisterTrueOnlineViewModel newInstance(RoomLocationDatabase roomLocationDatabase, OneTolRepository oneTolRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, FileUtil fileUtil) {
        return new OneRegisterTrueOnlineViewModel(roomLocationDatabase, oneTolRepository, rx2ThreadService, oneErrorService, preferencesViewModel, configurationRepository, bitmapUtil, fileUtil);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineViewModel get() {
        return newInstance((RoomLocationDatabase) this.f98305a.get(), (OneTolRepository) this.f98306b.get(), (Rx2ThreadService) this.f98307c.get(), (OneErrorService) this.f98308d.get(), (PreferencesViewModel) this.f98309e.get(), (ConfigurationRepository) this.f98310f.get(), (BitmapUtil) this.f98311g.get(), (FileUtil) this.f98312h.get());
    }
}