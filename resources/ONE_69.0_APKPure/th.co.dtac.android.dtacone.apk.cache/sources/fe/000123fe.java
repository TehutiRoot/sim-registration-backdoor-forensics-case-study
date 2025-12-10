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
/* renamed from: th.co.dtac.android.dtacone.presenter.mixpanel.BuyDolMixpanelTrackerPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolMixpanelTrackerPresenter_Factory implements Factory<BuyDolMixpanelTrackerPresenter> {

    /* renamed from: a */
    public final Provider f85999a;

    /* renamed from: b */
    public final Provider f86000b;

    /* renamed from: c */
    public final Provider f86001c;

    /* renamed from: d */
    public final Provider f86002d;

    public BuyDolMixpanelTrackerPresenter_Factory(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        this.f85999a = provider;
        this.f86000b = provider2;
        this.f86001c = provider3;
        this.f86002d = provider4;
    }

    public static BuyDolMixpanelTrackerPresenter_Factory create(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        return new BuyDolMixpanelTrackerPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static BuyDolMixpanelTrackerPresenter newInstance(MixpanelAPI mixpanelAPI, RtrRepository rtrRepository, TemporaryCache temporaryCache, JSONObject jSONObject) {
        return new BuyDolMixpanelTrackerPresenter(mixpanelAPI, rtrRepository, temporaryCache, jSONObject);
    }

    @Override // javax.inject.Provider
    public BuyDolMixpanelTrackerPresenter get() {
        return newInstance((MixpanelAPI) this.f85999a.get(), (RtrRepository) this.f86000b.get(), (TemporaryCache) this.f86001c.get(), (JSONObject) this.f86002d.get());
    }
}