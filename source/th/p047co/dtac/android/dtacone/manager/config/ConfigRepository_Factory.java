package th.p047co.dtac.android.dtacone.manager.config;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.manager.config.ConfigRepository_Factory */
/* loaded from: classes7.dex */
public final class ConfigRepository_Factory implements Factory<ConfigRepository> {

    /* renamed from: a */
    public final Provider f84913a;

    /* renamed from: b */
    public final Provider f84914b;

    public ConfigRepository_Factory(Provider<BriteDatabase> provider, Provider<BriteDatabase> provider2) {
        this.f84913a = provider;
        this.f84914b = provider2;
    }

    public static ConfigRepository_Factory create(Provider<BriteDatabase> provider, Provider<BriteDatabase> provider2) {
        return new ConfigRepository_Factory(provider, provider2);
    }

    public static ConfigRepository newInstance(BriteDatabase briteDatabase, BriteDatabase briteDatabase2) {
        return new ConfigRepository(briteDatabase, briteDatabase2);
    }

    @Override // javax.inject.Provider
    public ConfigRepository get() {
        return newInstance((BriteDatabase) this.f84913a.get(), (BriteDatabase) this.f84914b.get());
    }
}
