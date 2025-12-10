package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquirySmartCardFragment$setUpViewModel$1$1 */
/* loaded from: classes9.dex */
public final class CustomerEnquirySmartCardFragment$setUpViewModel$1$1 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ CustomerEnquirySmartCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerEnquirySmartCardFragment$setUpViewModel$1$1(CustomerEnquirySmartCardFragment customerEnquirySmartCardFragment) {
        super(1);
        this.this$0 = customerEnquirySmartCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity");
        ActivityExtKt.navigateFragmentTo((CustomerEnquiryActivity) requireActivity, R.id.contentLayout, it.buildFragment(), it.getTag());
    }
}