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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneNewCampaignAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneNewCampaignAdapter_Factory implements Factory<OneNewCampaignAdapter> {

    /* renamed from: a */
    public final Provider f88738a;

    /* renamed from: b */
    public final Provider f88739b;

    public OneNewCampaignAdapter_Factory(Provider<OneLoadImageUtil> provider, Provider<Activity> provider2) {
        this.f88738a = provider;
        this.f88739b = provider2;
    }

    public static OneNewCampaignAdapter_Factory create(Provider<OneLoadImageUtil> provider, Provider<Activity> provider2) {
        return new OneNewCampaignAdapter_Factory(provider, provider2);
    }

    public static OneNewCampaignAdapter newInstance(OneLoadImageUtil oneLoadImageUtil, Activity activity) {
        return new OneNewCampaignAdapter(oneLoadImageUtil, activity);
    }

    @Override // javax.inject.Provider
    public OneNewCampaignAdapter get() {
        return newInstance((OneLoadImageUtil) this.f88738a.get(), (Activity) this.f88739b.get());
    }
}