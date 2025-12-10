package th.p047co.dtac.android.dtacone.configuration;

import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import p046rx.Scheduler;
import th.p047co.dtac.android.dtacone.data.cache.database.LocationDbHelper;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideBriteLocationDatabaseFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideBriteLocationDatabaseFactory implements Factory<BriteDatabase> {

    /* renamed from: a */
    public final AndroidModule f83063a;

    /* renamed from: b */
    public final Provider f83064b;

    /* renamed from: c */
    public final Provider f83065c;

    /* renamed from: d */
    public final Provider f83066d;

    public AndroidModule_ProvideBriteLocationDatabaseFactory(AndroidModule androidModule, Provider<SqlBrite> provider, Provider<LocationDbHelper> provider2, Provider<Scheduler> provider3) {
        this.f83063a = androidModule;
        this.f83064b = provider;
        this.f83065c = provider2;
        this.f83066d = provider3;
    }

    public static AndroidModule_ProvideBriteLocationDatabaseFactory create(AndroidModule androidModule, Provider<SqlBrite> provider, Provider<LocationDbHelper> provider2, Provider<Scheduler> provider3) {
        return new AndroidModule_ProvideBriteLocationDatabaseFactory(androidModule, provider, provider2, provider3);
    }

    public static BriteDatabase provideBriteLocationDatabase(AndroidModule androidModule, SqlBrite sqlBrite, LocationDbHelper locationDbHelper, Scheduler scheduler) {
        return (BriteDatabase) Preconditions.checkNotNullFromProvides(androidModule.m19639f(sqlBrite, locationDbHelper, scheduler));
    }

    @Override // javax.inject.Provider
    public BriteDatabase get() {
        return provideBriteLocationDatabase(this.f83063a, (SqlBrite) this.f83064b.get(), (LocationDbHelper) this.f83065c.get(), (Scheduler) this.f83066d.get());
    }
}
