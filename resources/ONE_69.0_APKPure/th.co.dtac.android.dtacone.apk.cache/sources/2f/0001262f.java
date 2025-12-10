package th.p047co.dtac.android.dtacone.repository.mrtr_pre2post;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrPre2PostRepository_Factory implements Factory<MrtrPre2PostRepository> {

    /* renamed from: a */
    public final Provider f86926a;

    /* renamed from: b */
    public final Provider f86927b;

    /* renamed from: c */
    public final Provider f86928c;

    /* renamed from: d */
    public final Provider f86929d;

    /* renamed from: e */
    public final Provider f86930e;

    public MrtrPre2PostRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4, Provider<CompressImage> provider5) {
        this.f86926a = provider;
        this.f86927b = provider2;
        this.f86928c = provider3;
        this.f86929d = provider4;
        this.f86930e = provider5;
    }

    public static MrtrPre2PostRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4, Provider<CompressImage> provider5) {
        return new MrtrPre2PostRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPre2PostRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, FileUtil fileUtil, CompressImage compressImage) {
        return new MrtrPre2PostRepository(rTRApiRx2, rtrRx2Repository, configurationRepository, fileUtil, compressImage);
    }

    @Override // javax.inject.Provider
    public MrtrPre2PostRepository get() {
        return newInstance((RTRApiRx2) this.f86926a.get(), (RtrRx2Repository) this.f86927b.get(), (ConfigurationRepository) this.f86928c.get(), (FileUtil) this.f86929d.get(), (CompressImage) this.f86930e.get());
    }
}