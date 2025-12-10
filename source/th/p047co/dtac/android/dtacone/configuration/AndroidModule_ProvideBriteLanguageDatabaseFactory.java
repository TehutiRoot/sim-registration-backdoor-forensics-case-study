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
import th.p047co.dtac.android.dtacone.data.cache.database.LanguageDbHelper;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideBriteLanguageDatabaseFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideBriteLanguageDatabaseFactory implements Factory<BriteDatabase> {

    /* renamed from: a */
    public final AndroidModule f83059a;

    /* renamed from: b */
    public final Provider f83060b;

    /* renamed from: c */
    public final Provider f83061c;

    /* renamed from: d */
    public final Provider f83062d;

    public AndroidModule_ProvideBriteLanguageDatabaseFactory(AndroidModule androidModule, Provider<SqlBrite> provider, Provider<LanguageDbHelper> provider2, Provider<Scheduler> provider3) {
        this.f83059a = androidModule;
        this.f83060b = provider;
        this.f83061c = provider2;
        this.f83062d = provider3;
    }

    public static AndroidModule_ProvideBriteLanguageDatabaseFactory create(AndroidModule androidModule, Provider<SqlBrite> provider, Provider<LanguageDbHelper> provider2, Provider<Scheduler> provider3) {
        return new AndroidModule_ProvideBriteLanguageDatabaseFactory(androidModule, provider, provider2, provider3);
    }

    public static BriteDatabase provideBriteLanguageDatabase(AndroidModule androidModule, SqlBrite sqlBrite, LanguageDbHelper languageDbHelper, Scheduler scheduler) {
        return (BriteDatabase) Preconditions.checkNotNullFromProvides(androidModule.m19640e(sqlBrite, languageDbHelper, scheduler));
    }

    @Override // javax.inject.Provider
    public BriteDatabase get() {
        return provideBriteLanguageDatabase(this.f83059a, (SqlBrite) this.f83060b.get(), (LanguageDbHelper) this.f83061c.get(), (Scheduler) this.f83062d.get());
    }
}
