package th.p047co.dtac.android.dtacone.adapter.online_register;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.AdditionalPicture;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.online_register.OnlineRegistBankAdapter_Factory */
/* loaded from: classes7.dex */
public final class OnlineRegistBankAdapter_Factory implements Factory<OnlineRegistBankAdapter> {

    /* renamed from: a */
    public final Provider f81443a;

    /* renamed from: b */
    public final Provider f81444b;

    public OnlineRegistBankAdapter_Factory(Provider<Activity> provider, Provider<List<AdditionalPicture>> provider2) {
        this.f81443a = provider;
        this.f81444b = provider2;
    }

    public static OnlineRegistBankAdapter_Factory create(Provider<Activity> provider, Provider<List<AdditionalPicture>> provider2) {
        return new OnlineRegistBankAdapter_Factory(provider, provider2);
    }

    public static OnlineRegistBankAdapter newInstance(Activity activity, List<AdditionalPicture> list) {
        return new OnlineRegistBankAdapter(activity, list);
    }

    @Override // javax.inject.Provider
    public OnlineRegistBankAdapter get() {
        return newInstance((Activity) this.f81443a.get(), (List) this.f81444b.get());
    }
}