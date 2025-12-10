package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOneChangeOwnerApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOneChangeOwnerApiFactory implements Factory<OneChangeOwnerApi> {

    /* renamed from: a */
    public final HttpModule f83159a;

    /* renamed from: b */
    public final Provider f83160b;

    public HttpModule_ProvideOneChangeOwnerApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83159a = httpModule;
        this.f83160b = provider;
    }

    public static HttpModule_ProvideOneChangeOwnerApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOneChangeOwnerApiFactory(httpModule, provider);
    }

    public static OneChangeOwnerApi provideOneChangeOwnerApi(HttpModule httpModule, Retrofit retrofit) {
        return (OneChangeOwnerApi) Preconditions.checkNotNullFromProvides(httpModule.m19610m(retrofit));
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerApi get() {
        return provideOneChangeOwnerApi(this.f83159a, (Retrofit) this.f83160b.get());
    }
}
