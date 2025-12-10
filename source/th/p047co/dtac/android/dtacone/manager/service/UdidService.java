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
    public Application f85034a;

    @Inject
    public UdidService(Application application) {
        this.f85034a = application;
    }

    public String getAndroidID() {
        return Settings.Secure.getString(this.f85034a.getContentResolver(), "android_id");
    }
}
