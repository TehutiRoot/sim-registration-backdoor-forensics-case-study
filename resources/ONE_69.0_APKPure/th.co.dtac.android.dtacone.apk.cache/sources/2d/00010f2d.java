package th.p047co.dtac.android.dtacone.adapter.buy_dol;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolHistoryAdapter_Factory */
/* loaded from: classes7.dex */
public final class BuyDolHistoryAdapter_Factory implements Factory<BuyDolHistoryAdapter> {

    /* renamed from: a */
    public final Provider f81097a;

    public BuyDolHistoryAdapter_Factory(Provider<Activity> provider) {
        this.f81097a = provider;
    }

    public static BuyDolHistoryAdapter_Factory create(Provider<Activity> provider) {
        return new BuyDolHistoryAdapter_Factory(provider);
    }

    public static BuyDolHistoryAdapter newInstance(Activity activity) {
        return new BuyDolHistoryAdapter(activity);
    }

    @Override // javax.inject.Provider
    public BuyDolHistoryAdapter get() {
        return newInstance((Activity) this.f81097a.get());
    }
}