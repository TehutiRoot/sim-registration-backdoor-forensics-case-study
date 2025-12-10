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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineMixpanelTrackerViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineMixpanelTrackerViewModel_Factory implements Factory<OneRegisterTrueOnlineMixpanelTrackerViewModel> {

    /* renamed from: a */
    public final Provider f98135a;

    /* renamed from: b */
    public final Provider f98136b;

    /* renamed from: c */
    public final Provider f98137c;

    /* renamed from: d */
    public final Provider f98138d;

    public OneRegisterTrueOnlineMixpanelTrackerViewModel_Factory(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        this.f98135a = provider;
        this.f98136b = provider2;
        this.f98137c = provider3;
        this.f98138d = provider4;
    }

    public static OneRegisterTrueOnlineMixpanelTrackerViewModel_Factory create(Provider<MixpanelAPI> provider, Provider<RtrRepository> provider2, Provider<TemporaryCache> provider3, Provider<JSONObject> provider4) {
        return new OneRegisterTrueOnlineMixpanelTrackerViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRegisterTrueOnlineMixpanelTrackerViewModel newInstance(MixpanelAPI mixpanelAPI, RtrRepository rtrRepository, TemporaryCache temporaryCache, JSONObject jSONObject) {
        return new OneRegisterTrueOnlineMixpanelTrackerViewModel(mixpanelAPI, rtrRepository, temporaryCache, jSONObject);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineMixpanelTrackerViewModel get() {
        return newInstance((MixpanelAPI) this.f98135a.get(), (RtrRepository) this.f98136b.get(), (TemporaryCache) this.f98137c.get(), (JSONObject) this.f98138d.get());
    }
}