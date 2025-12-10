package th.p047co.dtac.android.dtacone.adapter.home;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.adapter.home.ServiceItemAdapter;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.home.GroupServiceAdapter_Factory */
/* loaded from: classes7.dex */
public final class GroupServiceAdapter_Factory implements Factory<GroupServiceAdapter> {

    /* renamed from: a */
    public final Provider f81209a;

    /* renamed from: b */
    public final Provider f81210b;

    /* renamed from: c */
    public final Provider f81211c;

    public GroupServiceAdapter_Factory(Provider<Activity> provider, Provider<ServiceItemAdapter.OnClickServiceItem> provider2, Provider<List<GroupServiceItem>> provider3) {
        this.f81209a = provider;
        this.f81210b = provider2;
        this.f81211c = provider3;
    }

    public static GroupServiceAdapter_Factory create(Provider<Activity> provider, Provider<ServiceItemAdapter.OnClickServiceItem> provider2, Provider<List<GroupServiceItem>> provider3) {
        return new GroupServiceAdapter_Factory(provider, provider2, provider3);
    }

    public static GroupServiceAdapter newInstance(Activity activity, ServiceItemAdapter.OnClickServiceItem onClickServiceItem, List<GroupServiceItem> list) {
        return new GroupServiceAdapter(activity, onClickServiceItem, list);
    }

    @Override // javax.inject.Provider
    public GroupServiceAdapter get() {
        return newInstance((Activity) this.f81209a.get(), (ServiceItemAdapter.OnClickServiceItem) this.f81210b.get(), (List) this.f81211c.get());
    }
}
