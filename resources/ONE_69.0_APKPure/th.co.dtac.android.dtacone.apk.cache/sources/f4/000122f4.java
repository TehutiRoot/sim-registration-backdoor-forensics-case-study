package th.p047co.dtac.android.dtacone.presenter.cli;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.network.NetworkUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.cli.CliPresenterImpl_Factory */
/* loaded from: classes8.dex */
public final class CliPresenterImpl_Factory implements Factory<CliPresenterImpl> {

    /* renamed from: a */
    public final Provider f85703a;

    /* renamed from: b */
    public final Provider f85704b;

    /* renamed from: c */
    public final Provider f85705c;

    /* renamed from: d */
    public final Provider f85706d;

    public CliPresenterImpl_Factory(Provider<RTRApi> provider, Provider<TemporaryCache> provider2, Provider<RxThreadService> provider3, Provider<NetworkUtil> provider4) {
        this.f85703a = provider;
        this.f85704b = provider2;
        this.f85705c = provider3;
        this.f85706d = provider4;
    }

    public static CliPresenterImpl_Factory create(Provider<RTRApi> provider, Provider<TemporaryCache> provider2, Provider<RxThreadService> provider3, Provider<NetworkUtil> provider4) {
        return new CliPresenterImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static CliPresenterImpl newInstance(RTRApi rTRApi, TemporaryCache temporaryCache, RxThreadService rxThreadService, NetworkUtil networkUtil) {
        return new CliPresenterImpl(rTRApi, temporaryCache, rxThreadService, networkUtil);
    }

    @Override // javax.inject.Provider
    public CliPresenterImpl get() {
        return newInstance((RTRApi) this.f85703a.get(), (TemporaryCache) this.f85704b.get(), (RxThreadService) this.f85705c.get(), (NetworkUtil) this.f85706d.get());
    }
}