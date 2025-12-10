package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/StatusResource;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$initViewModel$1$5 */
/* loaded from: classes10.dex */
public final class OneStaffListFragment$initViewModel$1$5 extends Lambda implements Function1<StatusResource, Unit> {
    final /* synthetic */ OneStaffListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$initViewModel$1$5$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffListFragment$initViewModel$1$5(OneStaffListFragment oneStaffListFragment) {
        super(1);
        this.this$0 = oneStaffListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StatusResource statusResource) {
        invoke2(statusResource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StatusResource statusResource) {
        OneSwipeRefresh oneSwipeRefresh;
        OneSwipeRefresh oneSwipeRefresh2;
        OneSwipeRefresh oneSwipeRefresh3;
        OneSwipeRefresh oneSwipeRefresh4;
        int i = statusResource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[statusResource.ordinal()];
        OneSwipeRefresh oneSwipeRefresh5 = null;
        if (i == 1) {
            oneSwipeRefresh = this.this$0.f97329m;
            if (oneSwipeRefresh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                oneSwipeRefresh5 = oneSwipeRefresh;
            }
            oneSwipeRefresh5.setRefreshing(true);
        } else if (i == 2) {
            oneSwipeRefresh2 = this.this$0.f97329m;
            if (oneSwipeRefresh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                oneSwipeRefresh5 = oneSwipeRefresh2;
            }
            oneSwipeRefresh5.setRefreshing(false);
        } else if (i != 3) {
            oneSwipeRefresh4 = this.this$0.f97329m;
            if (oneSwipeRefresh4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                oneSwipeRefresh5 = oneSwipeRefresh4;
            }
            oneSwipeRefresh5.setRefreshing(false);
        } else {
            oneSwipeRefresh3 = this.this$0.f97329m;
            if (oneSwipeRefresh3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                oneSwipeRefresh5 = oneSwipeRefresh3;
            }
            oneSwipeRefresh5.setRefreshing(false);
        }
    }
}