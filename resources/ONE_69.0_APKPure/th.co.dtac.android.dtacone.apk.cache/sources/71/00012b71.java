package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.activity.OneChangeOwnerActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/activity/OneChangeOwnerActivity;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerVerifyOtpFragment$changeOwnerActivity$2 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerVerifyOtpFragment$changeOwnerActivity$2 extends Lambda implements Function0<OneChangeOwnerActivity> {
    final /* synthetic */ OneChangeOwnerVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerVerifyOtpFragment$changeOwnerActivity$2(OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment) {
        super(0);
        this.this$0 = oneChangeOwnerVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final OneChangeOwnerActivity invoke() {
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.change_owner.activity.OneChangeOwnerActivity");
        return (OneChangeOwnerActivity) activity;
    }
}