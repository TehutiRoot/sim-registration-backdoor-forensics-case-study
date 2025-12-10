package th.p047co.dtac.android.dtacone.repository.upPass;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.upPass.UpPassApi;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.upPass.UpPassRepository_Factory */
/* loaded from: classes8.dex */
public final class UpPassRepository_Factory implements Factory<UpPassRepository> {

    /* renamed from: a */
    public final Provider f86984a;

    /* renamed from: b */
    public final Provider f86985b;

    /* renamed from: c */
    public final Provider f86986c;

    /* renamed from: d */
    public final Provider f86987d;

    /* renamed from: e */
    public final Provider f86988e;

    public UpPassRepository_Factory(Provider<UpPassApi> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<FileUtil> provider5) {
        this.f86984a = provider;
        this.f86985b = provider2;
        this.f86986c = provider3;
        this.f86987d = provider4;
        this.f86988e = provider5;
    }

    public static UpPassRepository_Factory create(Provider<UpPassApi> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<FileUtil> provider5) {
        return new UpPassRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static UpPassRepository newInstance(UpPassApi upPassApi, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, BitmapUtil bitmapUtil, FileUtil fileUtil) {
        return new UpPassRepository(upPassApi, rtrRx2Repository, preferencesViewModel, bitmapUtil, fileUtil);
    }

    @Override // javax.inject.Provider
    public UpPassRepository get() {
        return newInstance((UpPassApi) this.f86984a.get(), (RtrRx2Repository) this.f86985b.get(), (PreferencesViewModel) this.f86986c.get(), (BitmapUtil) this.f86987d.get(), (FileUtil) this.f86988e.get());
    }
}