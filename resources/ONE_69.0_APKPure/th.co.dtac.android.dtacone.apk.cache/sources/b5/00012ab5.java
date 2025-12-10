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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneMyCampaignAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneMyCampaignAdapter_Factory implements Factory<OneMyCampaignAdapter> {

    /* renamed from: a */
    public final Provider f88725a;

    /* renamed from: b */
    public final Provider f88726b;

    public OneMyCampaignAdapter_Factory(Provider<OneLoadImageUtil> provider, Provider<Activity> provider2) {
        this.f88725a = provider;
        this.f88726b = provider2;
    }

    public static OneMyCampaignAdapter_Factory create(Provider<OneLoadImageUtil> provider, Provider<Activity> provider2) {
        return new OneMyCampaignAdapter_Factory(provider, provider2);
    }

    public static OneMyCampaignAdapter newInstance(OneLoadImageUtil oneLoadImageUtil, Activity activity) {
        return new OneMyCampaignAdapter(oneLoadImageUtil, activity);
    }

    @Override // javax.inject.Provider
    public OneMyCampaignAdapter get() {
        return newInstance((OneLoadImageUtil) this.f88725a.get(), (Activity) this.f88726b.get());
    }
}