package th.p047co.dtac.android.dtacone.adapter.campaign.myCampaign;

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
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignAdapter_Factory */
/* loaded from: classes7.dex */
public final class MyCampaignAdapter_Factory implements Factory<MyCampaignAdapter> {

    /* renamed from: a */
    public final Provider f81062a;

    /* renamed from: b */
    public final Provider f81063b;

    public MyCampaignAdapter_Factory(Provider<LoadImageUtil> provider, Provider<Activity> provider2) {
        this.f81062a = provider;
        this.f81063b = provider2;
    }

    public static MyCampaignAdapter_Factory create(Provider<LoadImageUtil> provider, Provider<Activity> provider2) {
        return new MyCampaignAdapter_Factory(provider, provider2);
    }

    public static MyCampaignAdapter newInstance(LoadImageUtil loadImageUtil, Activity activity) {
        return new MyCampaignAdapter(loadImageUtil, activity);
    }

    @Override // javax.inject.Provider
    public MyCampaignAdapter get() {
        return newInstance((LoadImageUtil) this.f81062a.get(), (Activity) this.f81063b.get());
    }
}
