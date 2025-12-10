package th.p047co.dtac.android.dtacone.configuration;

import com.squareup.sqlbrite.SqlBrite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideSqlBriteFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideSqlBriteFactory implements Factory<SqlBrite> {

    /* renamed from: a */
    public final AndroidModule f83083a;

    public AndroidModule_ProvideSqlBriteFactory(AndroidModule androidModule) {
        this.f83083a = androidModule;
    }

    public static AndroidModule_ProvideSqlBriteFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideSqlBriteFactory(androidModule);
    }

    public static SqlBrite provideSqlBrite(AndroidModule androidModule) {
        return (SqlBrite) Preconditions.checkNotNullFromProvides(androidModule.m19626s());
    }

    @Override // javax.inject.Provider
    public SqlBrite get() {
        return provideSqlBrite(this.f83083a);
    }
}
