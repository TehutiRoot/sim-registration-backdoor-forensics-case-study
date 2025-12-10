package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOneDeviceSaleApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOneDeviceSaleApiFactory implements Factory<OneDeviceSaleApi> {

    /* renamed from: a */
    public final HttpModule f83163a;

    /* renamed from: b */
    public final Provider f83164b;

    public HttpModule_ProvideOneDeviceSaleApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83163a = httpModule;
        this.f83164b = provider;
    }

    public static HttpModule_ProvideOneDeviceSaleApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOneDeviceSaleApiFactory(httpModule, provider);
    }

    public static OneDeviceSaleApi provideOneDeviceSaleApi(HttpModule httpModule, Retrofit retrofit) {
        return (OneDeviceSaleApi) Preconditions.checkNotNullFromProvides(httpModule.m19608o(retrofit));
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleApi get() {
        return provideOneDeviceSaleApi(this.f83163a, (Retrofit) this.f83164b.get());
    }
}
