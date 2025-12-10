package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOneCampaignApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOneCampaignApiFactory implements Factory<OneCampaignApi> {

    /* renamed from: a */
    public final HttpModule f83157a;

    /* renamed from: b */
    public final Provider f83158b;

    public HttpModule_ProvideOneCampaignApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83157a = httpModule;
        this.f83158b = provider;
    }

    public static HttpModule_ProvideOneCampaignApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOneCampaignApiFactory(httpModule, provider);
    }

    public static OneCampaignApi provideOneCampaignApi(HttpModule httpModule, Retrofit retrofit) {
        return (OneCampaignApi) Preconditions.checkNotNullFromProvides(httpModule.m19611l(retrofit));
    }

    @Override // javax.inject.Provider
    public OneCampaignApi get() {
        return provideOneCampaignApi(this.f83157a, (Retrofit) this.f83158b.get());
    }
}
