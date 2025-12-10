package th.p047co.dtac.android.dtacone.view.appOne.home.adapter;

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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.adapter.OneServiceItemAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneServiceItemAdapter_Factory implements Factory<OneServiceItemAdapter> {

    /* renamed from: a */
    public final Provider f91073a;

    /* renamed from: b */
    public final Provider f91074b;

    /* renamed from: c */
    public final Provider f91075c;

    public OneServiceItemAdapter_Factory(Provider<Activity> provider, Provider<List<GroupItemItem>> provider2, Provider<String> provider3) {
        this.f91073a = provider;
        this.f91074b = provider2;
        this.f91075c = provider3;
    }

    public static OneServiceItemAdapter_Factory create(Provider<Activity> provider, Provider<List<GroupItemItem>> provider2, Provider<String> provider3) {
        return new OneServiceItemAdapter_Factory(provider, provider2, provider3);
    }

    public static OneServiceItemAdapter newInstance(Activity activity, List<GroupItemItem> list, String str) {
        return new OneServiceItemAdapter(activity, list, str);
    }

    @Override // javax.inject.Provider
    public OneServiceItemAdapter get() {
        return newInstance((Activity) this.f91073a.get(), (List) this.f91074b.get(), (String) this.f91075c.get());
    }
}