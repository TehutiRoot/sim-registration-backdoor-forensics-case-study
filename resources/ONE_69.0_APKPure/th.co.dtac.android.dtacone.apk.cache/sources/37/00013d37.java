package th.p047co.dtac.android.dtacone.view.appOne.rectify.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/StatusResource;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.fragment.OneRectifyListFragment$initView$3$2 */
/* loaded from: classes10.dex */
public final class OneRectifyListFragment$initView$3$2 extends Lambda implements Function1<StatusResource, Unit> {
    final /* synthetic */ OneRectifyListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.fragment.OneRectifyListFragment$initView$3$2$WhenMappings */
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
    public OneRectifyListFragment$initView$3$2(OneRectifyListFragment oneRectifyListFragment) {
        super(1);
        this.this$0 = oneRectifyListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StatusResource statusResource) {
        invoke2(statusResource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StatusResource statusResource) {
        DtacSwipeRefresh dtacSwipeRefresh;
        DtacSwipeRefresh dtacSwipeRefresh2;
        DtacSwipeRefresh dtacSwipeRefresh3;
        DtacSwipeRefresh dtacSwipeRefresh4;
        int i = statusResource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[statusResource.ordinal()];
        DtacSwipeRefresh dtacSwipeRefresh5 = null;
        if (i == 1) {
            dtacSwipeRefresh = this.this$0.f96111o;
            if (dtacSwipeRefresh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                dtacSwipeRefresh5 = dtacSwipeRefresh;
            }
            dtacSwipeRefresh5.setRefreshing(true);
        } else if (i == 2) {
            dtacSwipeRefresh2 = this.this$0.f96111o;
            if (dtacSwipeRefresh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                dtacSwipeRefresh5 = dtacSwipeRefresh2;
            }
            dtacSwipeRefresh5.setRefreshing(false);
        } else if (i != 3) {
            dtacSwipeRefresh4 = this.this$0.f96111o;
            if (dtacSwipeRefresh4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                dtacSwipeRefresh5 = dtacSwipeRefresh4;
            }
            dtacSwipeRefresh5.setRefreshing(false);
        } else {
            dtacSwipeRefresh3 = this.this$0.f96111o;
            if (dtacSwipeRefresh3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            } else {
                dtacSwipeRefresh5 = dtacSwipeRefresh3;
            }
            dtacSwipeRefresh5.setRefreshing(false);
        }
    }
}