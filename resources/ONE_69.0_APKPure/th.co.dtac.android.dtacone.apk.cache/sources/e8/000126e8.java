package th.p047co.dtac.android.dtacone.util.bitmap;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.bitmap.BitmapUtil_Factory */
/* loaded from: classes8.dex */
public final class BitmapUtil_Factory implements Factory<BitmapUtil> {

    /* renamed from: a */
    public final Provider f87114a;

    /* renamed from: b */
    public final Provider f87115b;

    public BitmapUtil_Factory(Provider<FileUtil> provider, Provider<Application> provider2) {
        this.f87114a = provider;
        this.f87115b = provider2;
    }

    public static BitmapUtil_Factory create(Provider<FileUtil> provider, Provider<Application> provider2) {
        return new BitmapUtil_Factory(provider, provider2);
    }

    public static BitmapUtil newInstance(FileUtil fileUtil, Application application) {
        return new BitmapUtil(fileUtil, application);
    }

    @Override // javax.inject.Provider
    public BitmapUtil get() {
        return newInstance((FileUtil) this.f87114a.get(), (Application) this.f87115b.get());
    }
}