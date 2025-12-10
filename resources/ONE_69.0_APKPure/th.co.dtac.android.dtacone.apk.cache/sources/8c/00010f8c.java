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
    public final Provider f81310a;

    /* renamed from: b */
    public final Provider f81311b;

    public ServiceItemAdapter_Factory(Provider<Activity> provider, Provider<List<GroupItemItem>> provider2) {
        this.f81310a = provider;
        this.f81311b = provider2;
    }

    public static ServiceItemAdapter_Factory create(Provider<Activity> provider, Provider<List<GroupItemItem>> provider2) {
        return new ServiceItemAdapter_Factory(provider, provider2);
    }

    public static ServiceItemAdapter newInstance(Activity activity, List<GroupItemItem> list) {
        return new ServiceItemAdapter(activity, list);
    }

    @Override // javax.inject.Provider
    public ServiceItemAdapter get() {
        return newInstance((Activity) this.f81310a.get(), (List) this.f81311b.get());
    }
}