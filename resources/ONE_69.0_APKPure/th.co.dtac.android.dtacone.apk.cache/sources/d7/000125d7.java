package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidValidatePresenter_Factory */
/* loaded from: classes8.dex */
public final class UpdatePrepaidValidatePresenter_Factory implements Factory<UpdatePrepaidValidatePresenter> {

    /* renamed from: a */
    public final Provider f86738a;

    /* renamed from: b */
    public final Provider f86739b;

    /* renamed from: c */
    public final Provider f86740c;

    /* renamed from: d */
    public final Provider f86741d;

    /* renamed from: e */
    public final Provider f86742e;

    /* renamed from: f */
    public final Provider f86743f;

    public UpdatePrepaidValidatePresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3, Provider<Application> provider4, Provider<FileUtil> provider5, Provider<BitmapUtil> provider6) {
        this.f86738a = provider;
        this.f86739b = provider2;
        this.f86740c = provider3;
        this.f86741d = provider4;
        this.f86742e = provider5;
        this.f86743f = provider6;
    }

    public static UpdatePrepaidValidatePresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3, Provider<Application> provider4, Provider<FileUtil> provider5, Provider<BitmapUtil> provider6) {
        return new UpdatePrepaidValidatePresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static UpdatePrepaidValidatePresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService, Application application, FileUtil fileUtil, BitmapUtil bitmapUtil) {
        return new UpdatePrepaidValidatePresenter(rTRApi, serverErrorService, rxThreadService, application, fileUtil, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public UpdatePrepaidValidatePresenter get() {
        return newInstance((RTRApi) this.f86738a.get(), (ServerErrorService) this.f86739b.get(), (RxThreadService) this.f86740c.get(), (Application) this.f86741d.get(), (FileUtil) this.f86742e.get(), (BitmapUtil) this.f86743f.get());
    }
}