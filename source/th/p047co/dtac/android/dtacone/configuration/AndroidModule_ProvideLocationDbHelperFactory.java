package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.data.cache.database.LocationDbHelper;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideLocationDbHelperFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideLocationDbHelperFactory implements Factory<LocationDbHelper> {

    /* renamed from: a */
    public final AndroidModule f83073a;

    public AndroidModule_ProvideLocationDbHelperFactory(AndroidModule androidModule) {
        this.f83073a = androidModule;
    }

    public static AndroidModule_ProvideLocationDbHelperFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideLocationDbHelperFactory(androidModule);
    }

    public static LocationDbHelper provideLocationDbHelper(AndroidModule androidModule) {
        return (LocationDbHelper) Preconditions.checkNotNullFromProvides(androidModule.m19633l());
    }

    @Override // javax.inject.Provider
    public LocationDbHelper get() {
        return provideLocationDbHelper(this.f83073a);
    }
}
