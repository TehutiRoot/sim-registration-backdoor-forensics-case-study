package th.p047co.dtac.android.dtacone.manager.service;

import android.app.Application;
import android.provider.Settings;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.service.UdidService */
/* loaded from: classes7.dex */
public class UdidService {

    /* renamed from: a */
    public Application f85144a;

    @Inject
    public UdidService(Application application) {
        this.f85144a = application;
    }

    public String getAndroidID() {
        return Settings.Secure.getString(this.f85144a.getContentResolver(), "android_id");
    }
}