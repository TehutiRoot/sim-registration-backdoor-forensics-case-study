package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.upPass.UpPassApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideUpPassApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideUpPassApiFactory implements Factory<UpPassApi> {

    /* renamed from: a */
    public final HttpModule f83190a;

    /* renamed from: b */
    public final Provider f83191b;

    public HttpModule_ProvideUpPassApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83190a = httpModule;
        this.f83191b = provider;
    }

    public static HttpModule_ProvideUpPassApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideUpPassApiFactory(httpModule, provider);
    }

    public static UpPassApi provideUpPassApi(HttpModule httpModule, Retrofit retrofit) {
        return (UpPassApi) Preconditions.checkNotNullFromProvides(httpModule.m19623A(retrofit));
    }

    @Override // javax.inject.Provider
    public UpPassApi get() {
        return provideUpPassApi(this.f83190a, (Retrofit) this.f83191b.get());
    }
}
