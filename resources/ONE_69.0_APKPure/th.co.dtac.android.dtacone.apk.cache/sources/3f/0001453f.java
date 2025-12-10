package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineMixpanelTrackerViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineMixpanelTrackerViewModelFactory_Factory implements Factory<OneRegisterTrueOnlineMixpanelTrackerViewModelFactory> {

    /* renamed from: a */
    public final Provider f98131a;

    /* renamed from: b */
    public final Provider f98132b;

    /* renamed from: c */
    public final Provider f98133c;

    /* renamed from: d */
    public final Provider f98134d;

    public OneRegisterTrueOnlineMixpanelTrackerViewModelFactory_Factory(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        this.f98131a = provider;
        this.f98132b = provider2;
        this.f98133c = provider3;
        this.f98134d = provider4;
    }

    public static OneRegisterTrueOnlineMixpanelTrackerViewModelFactory_Factory create(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        return new OneRegisterTrueOnlineMixpanelTrackerViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRegisterTrueOnlineMixpanelTrackerViewModelFactory newInstance(MixpanelAPI mixpanelAPI, RtrRepository rtrRepository, TemporaryCache temporaryCache, JSONObject jSONObject) {
        return new OneRegisterTrueOnlineMixpanelTrackerViewModelFactory(mixpanelAPI, rtrRepository, temporaryCache, jSONObject);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineMixpanelTrackerViewModelFactory get() {
        return newInstance((MixpanelAPI) this.f98131a.get(), (RtrRepository) this.f98132b.get(), (TemporaryCache) this.f98133c.get(), (JSONObject) this.f98134d.get());
    }
}