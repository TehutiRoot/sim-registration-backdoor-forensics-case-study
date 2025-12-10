package th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.customer_info;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/activity/eSIM/ESimActivity;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.postpaid.customer_info.ESimPostpaidMailingFragment$activity$2 */
/* loaded from: classes9.dex */
public final class ESimPostpaidMailingFragment$activity$2 extends Lambda implements Function0<ESimActivity> {
    final /* synthetic */ ESimPostpaidMailingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidMailingFragment$activity$2(ESimPostpaidMailingFragment eSimPostpaidMailingFragment) {
        super(0);
        this.this$0 = eSimPostpaidMailingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ESimActivity invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.eSIM.ESimActivity");
        return (ESimActivity) requireActivity;
    }
}