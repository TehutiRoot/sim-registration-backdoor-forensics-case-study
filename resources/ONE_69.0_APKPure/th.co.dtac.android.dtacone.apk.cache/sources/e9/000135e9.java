package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.fragment;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.activity.OneOwnerManagementActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementDetailFragment$setObserve$1 */
/* loaded from: classes10.dex */
public final class OneOwnerManagementDetailFragment$setObserve$1 extends Lambda implements Function1<Resource<? extends StatusResponse>, Unit> {
    final /* synthetic */ OneOwnerManagementDetailFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementDetailFragment$setObserve$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOwnerManagementDetailFragment$setObserve$1(OneOwnerManagementDetailFragment oneOwnerManagementDetailFragment) {
        super(1);
        this.this$0 = oneOwnerManagementDetailFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(OneOwnerManagementDetailFragment this$0) {
        OneOwnerManagementActivity m12794m;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissLoading();
        m12794m = this$0.m12794m();
        Intent intent = new Intent();
        intent.putExtra(OneOwnerManagementDetailFragment.EXTRA_DELETE_OWNER_SUCCESS, true);
        m12794m.setResult(101, intent);
        m12794m.finish();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends StatusResponse> resource) {
        invoke2((Resource<StatusResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<StatusResponse> resource) {
        Resource<StatusResponse> resourceContentIfNotHandled = resource.getResourceContentIfNotHandled();
        if (resourceContentIfNotHandled != null) {
            final OneOwnerManagementDetailFragment oneOwnerManagementDetailFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
            if (i == 1) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        OneOwnerManagementDetailFragment$setObserve$1.invoke$lambda$2$lambda$1(OneOwnerManagementDetailFragment.this);
                    }
                }, 1200L);
            } else if (i == 2) {
                oneOwnerManagementDetailFragment.showLoading();
            } else if (i != 3) {
            } else {
                oneOwnerManagementDetailFragment.dismissLoading();
            }
        }
    }
}