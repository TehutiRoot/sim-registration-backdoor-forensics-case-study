package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.change_pack.OfferPackageData;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.change_pack.ChangePackActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_pack/OfferPackageData;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostInfoAnalyticFragment$onViewCreated$1$6 */
/* loaded from: classes9.dex */
public final class PostInfoAnalyticFragment$onViewCreated$1$6 extends Lambda implements Function1<OfferPackageData, Unit> {
    final /* synthetic */ PostInfoAnalyticFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInfoAnalyticFragment$onViewCreated$1$6(PostInfoAnalyticFragment postInfoAnalyticFragment) {
        super(1);
        this.this$0 = postInfoAnalyticFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OfferPackageData offerPackageData) {
        invoke2(offerPackageData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull OfferPackageData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this.this$0.getActivity(), ChangePackActivity.class);
        intent.putExtra(Constant.OFFER_DATA_BUNDLE, it);
        this.this$0.startActivity(intent);
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}