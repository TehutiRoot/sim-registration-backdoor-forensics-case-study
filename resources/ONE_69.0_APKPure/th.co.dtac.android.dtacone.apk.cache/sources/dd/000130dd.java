package th.p047co.dtac.android.dtacone.view.appOne.home.adapter;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.home.OneHomeThemeColorModel;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;
import th.p047co.dtac.android.dtacone.view.appOne.home.adapter.OneServiceItemAdapter;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.adapter.OneGroupServiceAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneGroupServiceAdapter_Factory implements Factory<OneGroupServiceAdapter> {

    /* renamed from: a */
    public final Provider f91050a;

    /* renamed from: b */
    public final Provider f91051b;

    /* renamed from: c */
    public final Provider f91052c;

    /* renamed from: d */
    public final Provider f91053d;

    /* renamed from: e */
    public final Provider f91054e;

    public OneGroupServiceAdapter_Factory(Provider<Activity> provider, Provider<OneServiceItemAdapter.OnClickServiceItem> provider2, Provider<List<GroupServiceItem>> provider3, Provider<String> provider4, Provider<OneHomeThemeColorModel> provider5) {
        this.f91050a = provider;
        this.f91051b = provider2;
        this.f91052c = provider3;
        this.f91053d = provider4;
        this.f91054e = provider5;
    }

    public static OneGroupServiceAdapter_Factory create(Provider<Activity> provider, Provider<OneServiceItemAdapter.OnClickServiceItem> provider2, Provider<List<GroupServiceItem>> provider3, Provider<String> provider4, Provider<OneHomeThemeColorModel> provider5) {
        return new OneGroupServiceAdapter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneGroupServiceAdapter newInstance(Activity activity, OneServiceItemAdapter.OnClickServiceItem onClickServiceItem, List<GroupServiceItem> list, String str, OneHomeThemeColorModel oneHomeThemeColorModel) {
        return new OneGroupServiceAdapter(activity, onClickServiceItem, list, str, oneHomeThemeColorModel);
    }

    @Override // javax.inject.Provider
    public OneGroupServiceAdapter get() {
        return newInstance((Activity) this.f91050a.get(), (OneServiceItemAdapter.OnClickServiceItem) this.f91051b.get(), (List) this.f91052c.get(), (String) this.f91053d.get(), (OneHomeThemeColorModel) this.f91054e.get());
    }
}