package th.p047co.dtac.android.dtacone.presenter.bitmap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveCacheImagePresenter_Factory */
/* loaded from: classes8.dex */
public final class SaveCacheImagePresenter_Factory implements Factory<SaveCacheImagePresenter> {

    /* renamed from: a */
    public final Provider f85335a;

    /* renamed from: b */
    public final Provider f85336b;

    public SaveCacheImagePresenter_Factory(Provider<Rx2ThreadService> provider, Provider<TemporaryCache> provider2) {
        this.f85335a = provider;
        this.f85336b = provider2;
    }

    public static SaveCacheImagePresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<TemporaryCache> provider2) {
        return new SaveCacheImagePresenter_Factory(provider, provider2);
    }

    public static SaveCacheImagePresenter newInstance(Rx2ThreadService rx2ThreadService, TemporaryCache temporaryCache) {
        return new SaveCacheImagePresenter(rx2ThreadService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public SaveCacheImagePresenter get() {
        return newInstance((Rx2ThreadService) this.f85335a.get(), (TemporaryCache) this.f85336b.get());
    }
}