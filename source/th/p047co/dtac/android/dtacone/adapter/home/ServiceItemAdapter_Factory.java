package th.p047co.dtac.android.dtacone.adapter.home;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupItemItem;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.home.ServiceItemAdapter_Factory */
/* loaded from: classes7.dex */
public final class ServiceItemAdapter_Factory implements Factory<ServiceItemAdapter> {

    /* renamed from: a */
    public final Provider f81219a;

    /* renamed from: b */
    public final Provider f81220b;

    public ServiceItemAdapter_Factory(Provider<Activity> provider, Provider<List<GroupItemItem>> provider2) {
        this.f81219a = provider;
        this.f81220b = provider2;
    }

    public static ServiceItemAdapter_Factory create(Provider<Activity> provider, Provider<List<GroupItemItem>> provider2) {
        return new ServiceItemAdapter_Factory(provider, provider2);
    }

    public static ServiceItemAdapter newInstance(Activity activity, List<GroupItemItem> list) {
        return new ServiceItemAdapter(activity, list);
    }

    @Override // javax.inject.Provider
    public ServiceItemAdapter get() {
        return newInstance((Activity) this.f81219a.get(), (List) this.f81220b.get());
    }
}
