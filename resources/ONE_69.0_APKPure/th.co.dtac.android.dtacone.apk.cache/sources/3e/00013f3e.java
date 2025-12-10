package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffDetailFragment$setUpViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneStaffDetailFragment$setUpViewModel$1$2 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneStaffDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffDetailFragment$setUpViewModel$1$2(OneStaffDetailFragment oneStaffDetailFragment) {
        super(1);
        this.this$0 = oneStaffDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        if (resource != null) {
            OneStaffDetailFragment oneStaffDetailFragment = this.this$0;
            if (resource.getStatus() == StatusResource.SUCCESS) {
                resource.getStatus();
                Bundle bundle = new Bundle();
                bundle.putBoolean(OneStaffDetailFragment.KEY_DELETE_STAFF, true);
                FragmentActivity activity = oneStaffDetailFragment.getActivity();
                if (activity != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager2.setFragmentResult(OneStaffDetailFragment.KEY_DELETE_STAFF, bundle);
                }
                FragmentActivity activity2 = oneStaffDetailFragment.getActivity();
                if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
                    return;
                }
                supportFragmentManager.popBackStack();
            }
        }
    }
}