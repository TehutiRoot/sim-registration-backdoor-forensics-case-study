package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.adapter.listener.item.OnClickItemListener;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePackageGroups;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"th/co/dtac/android/dtacone/view/appOne/postpaid_registration/activity/OnePostpaidSearchPackageActivity$setupOneLANUserPackageList$2", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePackageGroups;", "item", "", "setOnClickItem", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePackageGroups;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidSearchPackageActivity$setupOneLANUserPackageList$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidSearchPackageActivity$setupOneLANUserPackageList$2 implements OnClickItemListener<OnePackageGroups> {

    /* renamed from: a */
    public final /* synthetic */ OnePostpaidSearchPackageActivity f93241a;

    @Override // th.p047co.dtac.android.dtacone.adapter.listener.item.OnClickItemListener
    public void setOnClickItem(@NotNull OnePackageGroups item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PACKAGE", item);
        this.f93241a.setResult(-1, intent);
        this.f93241a.finish();
    }
}