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
/* renamed from: th.co.dtac.android.dtacone.presenter.mixpanel.PrepaidMixpanelTrackerPresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidMixpanelTrackerPresenter_Factory implements Factory<PrepaidMixpanelTrackerPresenter> {

    /* renamed from: a */
    public final Provider f86017a;

    /* renamed from: b */
    public final Provider f86018b;

    /* renamed from: c */
    public final Provider f86019c;

    /* renamed from: d */
    public final Provider f86020d;

    public PrepaidMixpanelTrackerPresenter_Factory(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        this.f86017a = provider;
        this.f86018b = provider2;
        this.f86019c = provider3;
        this.f86020d = provider4;
    }

    public static PrepaidMixpanelTrackerPresenter_Factory create(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        return new PrepaidMixpanelTrackerPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static PrepaidMixpanelTrackerPresenter newInstance(MixpanelAPI mixpanelAPI, RtrRepository rtrRepository, TemporaryCache temporaryCache, JSONObject jSONObject) {
        return new PrepaidMixpanelTrackerPresenter(mixpanelAPI, rtrRepository, temporaryCache, jSONObject);
    }

    @Override // javax.inject.Provider
    public PrepaidMixpanelTrackerPresenter get() {
        return newInstance((MixpanelAPI) this.f86017a.get(), (RtrRepository) this.f86018b.get(), (TemporaryCache) this.f86019c.get(), (JSONObject) this.f86020d.get());
    }
}