package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.filter.GrayScaleFilter;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidUploadImagePresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidUploadImagePresenter_Factory implements Factory<PrepaidUploadImagePresenter> {

    /* renamed from: a */
    public final Provider f86233a;

    /* renamed from: b */
    public final Provider f86234b;

    /* renamed from: c */
    public final Provider f86235c;

    /* renamed from: d */
    public final Provider f86236d;

    /* renamed from: e */
    public final Provider f86237e;

    public PrepaidUploadImagePresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<Application> provider3, Provider<FileUtil> provider4, Provider<GrayScaleFilter> provider5) {
        this.f86233a = provider;
        this.f86234b = provider2;
        this.f86235c = provider3;
        this.f86236d = provider4;
        this.f86237e = provider5;
    }

    public static PrepaidUploadImagePresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<Application> provider3, Provider<FileUtil> provider4, Provider<GrayScaleFilter> provider5) {
        return new PrepaidUploadImagePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PrepaidUploadImagePresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, Application application, FileUtil fileUtil, GrayScaleFilter grayScaleFilter) {
        return new PrepaidUploadImagePresenter(rTRApi, rxThreadService, application, fileUtil, grayScaleFilter);
    }

    @Override // javax.inject.Provider
    public PrepaidUploadImagePresenter get() {
        return newInstance((RTRApi) this.f86233a.get(), (RxThreadService) this.f86234b.get(), (Application) this.f86235c.get(), (FileUtil) this.f86236d.get(), (GrayScaleFilter) this.f86237e.get());
    }
}