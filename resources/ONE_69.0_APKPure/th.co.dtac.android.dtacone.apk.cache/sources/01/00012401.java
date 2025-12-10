package th.p047co.dtac.android.dtacone.presenter.mixpanel;

import com.mixpanel.android.mpmetrics.MixpanelAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.mixpanel.PostpaidMixpanelTrackerPresenter_Factory */
/* loaded from: classes8.dex */
public final class PostpaidMixpanelTrackerPresenter_Factory implements Factory<PostpaidMixpanelTrackerPresenter> {

    /* renamed from: a */
    public final Provider f86008a;

    /* renamed from: b */
    public final Provider f86009b;

    /* renamed from: c */
    public final Provider f86010c;

    /* renamed from: d */
    public final Provider f86011d;

    public PostpaidMixpanelTrackerPresenter_Factory(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        this.f86008a = provider;
        this.f86009b = provider2;
        this.f86010c = provider3;
        this.f86011d = provider4;
    }

    public static PostpaidMixpanelTrackerPresenter_Factory create(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        return new PostpaidMixpanelTrackerPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static PostpaidMixpanelTrackerPresenter newInstance(MixpanelAPI mixpanelAPI, RtrRepository rtrRepository, TemporaryCache temporaryCache, JSONObject jSONObject) {
        return new PostpaidMixpanelTrackerPresenter(mixpanelAPI, rtrRepository, temporaryCache, jSONObject);
    }

    @Override // javax.inject.Provider
    public PostpaidMixpanelTrackerPresenter get() {
        return newInstance((MixpanelAPI) this.f86008a.get(), (RtrRepository) this.f86009b.get(), (TemporaryCache) this.f86010c.get(), (JSONObject) this.f86011d.get());
    }
}