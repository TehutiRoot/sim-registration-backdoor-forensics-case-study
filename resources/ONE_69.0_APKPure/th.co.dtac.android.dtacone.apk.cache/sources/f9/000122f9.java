package th.p047co.dtac.android.dtacone.presenter.content;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.util.CustomTabsUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.content.ContentPresenter_Factory */
/* loaded from: classes8.dex */
public final class ContentPresenter_Factory implements Factory<ContentPresenter> {

    /* renamed from: a */
    public final Provider f85714a;

    /* renamed from: b */
    public final Provider f85715b;

    /* renamed from: c */
    public final Provider f85716c;

    /* renamed from: d */
    public final Provider f85717d;

    /* renamed from: e */
    public final Provider f85718e;

    public ContentPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3, Provider<Activity> provider4, Provider<CustomTabsUtil> provider5) {
        this.f85714a = provider;
        this.f85715b = provider2;
        this.f85716c = provider3;
        this.f85717d = provider4;
        this.f85718e = provider5;
    }

    public static ContentPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3, Provider<Activity> provider4, Provider<CustomTabsUtil> provider5) {
        return new ContentPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ContentPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService, Activity activity, CustomTabsUtil customTabsUtil) {
        return new ContentPresenter(rTRApi, serverErrorService, rxThreadService, activity, customTabsUtil);
    }

    @Override // javax.inject.Provider
    public ContentPresenter get() {
        return newInstance((RTRApi) this.f85714a.get(), (ServerErrorService) this.f85715b.get(), (RxThreadService) this.f85716c.get(), (Activity) this.f85717d.get(), (CustomTabsUtil) this.f85718e.get());
    }
}