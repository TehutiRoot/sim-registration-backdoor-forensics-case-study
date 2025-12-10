package th.p047co.dtac.android.dtacone.util;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.FileUtil_Factory */
/* loaded from: classes8.dex */
public final class FileUtil_Factory implements Factory<FileUtil> {

    /* renamed from: a */
    public final Provider f87051a;

    public FileUtil_Factory(Provider<Application> provider) {
        this.f87051a = provider;
    }

    public static FileUtil_Factory create(Provider<Application> provider) {
        return new FileUtil_Factory(provider);
    }

    public static FileUtil newInstance(Application application) {
        return new FileUtil(application);
    }

    @Override // javax.inject.Provider
    public FileUtil get() {
        return newInstance((Application) this.f87051a.get());
    }
}