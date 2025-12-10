package th.p047co.dtac.android.dtacone.presenter.home;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupPermissionList;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupServiceItem;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupPermissionList;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.home.HomePresenter$getCurrentBalanceAndStaffDetailAndGroupMenuRefresh$2 */
/* loaded from: classes8.dex */
public final class C14332xe8b299aa extends Lambda implements Function1<GroupPermissionList, List<? extends GroupServiceItem>> {
    final /* synthetic */ HomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14332xe8b299aa(HomePresenter homePresenter) {
        super(1);
        this.this$0 = homePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<GroupServiceItem> invoke(@NotNull GroupPermissionList it) {
        List<GroupServiceItem> m18152k0;
        Intrinsics.checkNotNullParameter(it, "it");
        List<GroupServiceItem> groupPermission = it.getGroupPermission();
        Intrinsics.checkNotNull(groupPermission);
        m18152k0 = this.this$0.m18152k0(groupPermission);
        return m18152k0;
    }
}