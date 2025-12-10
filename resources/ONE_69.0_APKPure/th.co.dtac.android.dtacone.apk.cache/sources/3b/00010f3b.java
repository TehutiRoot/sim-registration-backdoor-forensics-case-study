package th.p047co.dtac.android.dtacone.adapter.campaign.campaignRedemption;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.image.LoadImageUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.campaignRedemption.CampaignRedemptionAdapter_Factory */
/* loaded from: classes7.dex */
public final class CampaignRedemptionAdapter_Factory implements Factory<CampaignRedemptionAdapter> {

    /* renamed from: a */
    public final Provider f81136a;

    /* renamed from: b */
    public final Provider f81137b;

    public CampaignRedemptionAdapter_Factory(Provider<LoadImageUtil> provider, Provider<Activity> provider2) {
        this.f81136a = provider;
        this.f81137b = provider2;
    }

    public static CampaignRedemptionAdapter_Factory create(Provider<LoadImageUtil> provider, Provider<Activity> provider2) {
        return new CampaignRedemptionAdapter_Factory(provider, provider2);
    }

    public static CampaignRedemptionAdapter newInstance(LoadImageUtil loadImageUtil, Activity activity) {
        return new CampaignRedemptionAdapter(loadImageUtil, activity);
    }

    @Override // javax.inject.Provider
    public CampaignRedemptionAdapter get() {
        return newInstance((LoadImageUtil) this.f81136a.get(), (Activity) this.f81137b.get());
    }
}