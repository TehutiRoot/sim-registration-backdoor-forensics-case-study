package th.p047co.dtac.android.dtacone.presenter.bitmap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter_Factory */
/* loaded from: classes8.dex */
public final class DeleteBitmapPresenter_Factory implements Factory<DeleteBitmapPresenter> {

    /* renamed from: a */
    public final Provider f85313a;

    /* renamed from: b */
    public final Provider f85314b;

    public DeleteBitmapPresenter_Factory(Provider<RxThreadService> provider, Provider<FileUtil> provider2) {
        this.f85313a = provider;
        this.f85314b = provider2;
    }

    public static DeleteBitmapPresenter_Factory create(Provider<RxThreadService> provider, Provider<FileUtil> provider2) {
        return new DeleteBitmapPresenter_Factory(provider, provider2);
    }

    public static DeleteBitmapPresenter newInstance(RxThreadService rxThreadService, FileUtil fileUtil) {
        return new DeleteBitmapPresenter(rxThreadService, fileUtil);
    }

    @Override // javax.inject.Provider
    public DeleteBitmapPresenter get() {
        return newInstance((RxThreadService) this.f85313a.get(), (FileUtil) this.f85314b.get());
    }
}