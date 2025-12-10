package th.p047co.dtac.android.dtacone.adapter.campaign.newCampaign;

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
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.newCampaign.NewCampaignAdapter_Factory */
/* loaded from: classes7.dex */
public final class NewCampaignAdapter_Factory implements Factory<NewCampaignAdapter> {

    /* renamed from: a */
    public final Provider f81194a;

    /* renamed from: b */
    public final Provider f81195b;

    public NewCampaignAdapter_Factory(Provider<LoadImageUtil> provider, Provider<Activity> provider2) {
        this.f81194a = provider;
        this.f81195b = provider2;
    }

    public static NewCampaignAdapter_Factory create(Provider<LoadImageUtil> provider, Provider<Activity> provider2) {
        return new NewCampaignAdapter_Factory(provider, provider2);
    }

    public static NewCampaignAdapter newInstance(LoadImageUtil loadImageUtil, Activity activity) {
        return new NewCampaignAdapter(loadImageUtil, activity);
    }

    @Override // javax.inject.Provider
    public NewCampaignAdapter get() {
        return newInstance((LoadImageUtil) this.f81194a.get(), (Activity) this.f81195b.get());
    }
}