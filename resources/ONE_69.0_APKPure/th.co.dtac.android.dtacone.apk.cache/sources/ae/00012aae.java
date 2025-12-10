package th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.appOne.OneLoadImageUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneCampaignRedemptionAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneCampaignRedemptionAdapter_Factory implements Factory<OneCampaignRedemptionAdapter> {

    /* renamed from: a */
    public final Provider f88703a;

    /* renamed from: b */
    public final Provider f88704b;

    public OneCampaignRedemptionAdapter_Factory(Provider<OneLoadImageUtil> provider, Provider<Activity> provider2) {
        this.f88703a = provider;
        this.f88704b = provider2;
    }

    public static OneCampaignRedemptionAdapter_Factory create(Provider<OneLoadImageUtil> provider, Provider<Activity> provider2) {
        return new OneCampaignRedemptionAdapter_Factory(provider, provider2);
    }

    public static OneCampaignRedemptionAdapter newInstance(OneLoadImageUtil oneLoadImageUtil, Activity activity) {
        return new OneCampaignRedemptionAdapter(oneLoadImageUtil, activity);
    }

    @Override // javax.inject.Provider
    public OneCampaignRedemptionAdapter get() {
        return newInstance((OneLoadImageUtil) this.f88703a.get(), (Activity) this.f88704b.get());
    }
}