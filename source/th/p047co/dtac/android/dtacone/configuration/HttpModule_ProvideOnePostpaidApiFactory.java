package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOnePostpaidApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOnePostpaidApiFactory implements Factory<OnePostpaidApi> {

    /* renamed from: a */
    public final HttpModule f83167a;

    /* renamed from: b */
    public final Provider f83168b;

    public HttpModule_ProvideOnePostpaidApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83167a = httpModule;
        this.f83168b = provider;
    }

    public static HttpModule_ProvideOnePostpaidApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOnePostpaidApiFactory(httpModule, provider);
    }

    public static OnePostpaidApi provideOnePostpaidApi(HttpModule httpModule, Retrofit retrofit) {
        return (OnePostpaidApi) Preconditions.checkNotNullFromProvides(httpModule.m19606q(retrofit));
    }

    @Override // javax.inject.Provider
    public OnePostpaidApi get() {
        return provideOnePostpaidApi(this.f83167a, (Retrofit) this.f83168b.get());
    }
}
