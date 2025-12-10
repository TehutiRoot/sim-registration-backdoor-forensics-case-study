package th.p047co.dtac.android.dtacone.presenter.bitmap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.ConcatBitmapPresenter_Factory */
/* loaded from: classes8.dex */
public final class ConcatBitmapPresenter_Factory implements Factory<ConcatBitmapPresenter> {

    /* renamed from: a */
    public final Provider f85305a;

    /* renamed from: b */
    public final Provider f85306b;

    /* renamed from: c */
    public final Provider f85307c;

    public ConcatBitmapPresenter_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<FileUtil> provider3) {
        this.f85305a = provider;
        this.f85306b = provider2;
        this.f85307c = provider3;
    }

    public static ConcatBitmapPresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<FileUtil> provider3) {
        return new ConcatBitmapPresenter_Factory(provider, provider2, provider3);
    }

    public static ConcatBitmapPresenter newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, FileUtil fileUtil) {
        return new ConcatBitmapPresenter(rx2ThreadService, bitmapUtil, fileUtil);
    }

    @Override // javax.inject.Provider
    public ConcatBitmapPresenter get() {
        return newInstance((Rx2ThreadService) this.f85305a.get(), (BitmapUtil) this.f85306b.get(), (FileUtil) this.f85307c.get());
    }
}