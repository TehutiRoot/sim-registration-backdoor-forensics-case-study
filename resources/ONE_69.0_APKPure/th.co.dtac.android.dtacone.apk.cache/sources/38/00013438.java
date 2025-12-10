package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneNadOutboundTrueOnlineBinding;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundTrueOnlineFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundTrueOnlineFragment$setupObserve$1 extends Lambda implements Function1<Pair<? extends Integer, ? extends String>, Unit> {
    final /* synthetic */ OneNadOutboundTrueOnlineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundTrueOnlineFragment$setupObserve$1(OneNadOutboundTrueOnlineFragment oneNadOutboundTrueOnlineFragment) {
        super(1);
        this.this$0 = oneNadOutboundTrueOnlineFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends String> pair) {
        invoke2((Pair<Integer, String>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<Integer, String> pair) {
        FragmentOneNadOutboundTrueOnlineBinding fragmentOneNadOutboundTrueOnlineBinding;
        Drawable drawable;
        FragmentOneNadOutboundTrueOnlineBinding fragmentOneNadOutboundTrueOnlineBinding2;
        FragmentOneNadOutboundTrueOnlineBinding fragmentOneNadOutboundTrueOnlineBinding3;
        FragmentOneNadOutboundTrueOnlineBinding fragmentOneNadOutboundTrueOnlineBinding4;
        int intValue = pair.getFirst().intValue();
        String second = pair.getSecond();
        FragmentOneNadOutboundTrueOnlineBinding fragmentOneNadOutboundTrueOnlineBinding5 = null;
        if (intValue != 0) {
            if (intValue == 1) {
                fragmentOneNadOutboundTrueOnlineBinding3 = this.this$0.f92319k;
                if (fragmentOneNadOutboundTrueOnlineBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentOneNadOutboundTrueOnlineBinding5 = fragmentOneNadOutboundTrueOnlineBinding3;
                }
                fragmentOneNadOutboundTrueOnlineBinding5.filterOverdueBillValueTextView.setText(second);
                return;
            } else if (intValue != 2) {
                return;
            } else {
                fragmentOneNadOutboundTrueOnlineBinding4 = this.this$0.f92319k;
                if (fragmentOneNadOutboundTrueOnlineBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentOneNadOutboundTrueOnlineBinding5 = fragmentOneNadOutboundTrueOnlineBinding4;
                }
                fragmentOneNadOutboundTrueOnlineBinding5.filterPaymentDueStatusValueTextView.setText(second);
                return;
            }
        }
        fragmentOneNadOutboundTrueOnlineBinding = this.this$0.f92319k;
        if (fragmentOneNadOutboundTrueOnlineBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneNadOutboundTrueOnlineBinding = null;
        }
        fragmentOneNadOutboundTrueOnlineBinding.filterContactStatusValueTextView.setText(second);
        Context context = this.this$0.getContext();
        if (Intrinsics.areEqual(second, context != null ? context.getString(R.string.one_nad_outbound_already_contacted_title) : null)) {
            drawable = ContextCompat.getDrawable(this.this$0.requireContext(), R.drawable.ic_icon_status_green);
        } else {
            drawable = ContextCompat.getDrawable(this.this$0.requireContext(), R.drawable.ic_icon_status_red);
        }
        fragmentOneNadOutboundTrueOnlineBinding2 = this.this$0.f92319k;
        if (fragmentOneNadOutboundTrueOnlineBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentOneNadOutboundTrueOnlineBinding5 = fragmentOneNadOutboundTrueOnlineBinding2;
        }
        fragmentOneNadOutboundTrueOnlineBinding5.filterContactStatusImageView.setImageDrawable(drawable);
    }
}