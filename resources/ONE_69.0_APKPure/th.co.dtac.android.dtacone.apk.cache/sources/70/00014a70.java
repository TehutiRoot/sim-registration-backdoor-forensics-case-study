package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentPreSubscriberInfoEnquiryBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;
import th.p047co.dtac.android.dtacone.widget.view.TextViewTopLabelView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class PreSubscriberInfoFragment$onViewCreated$3 extends Lambda implements Function1<Resource<? extends Object>, Unit> {
    final /* synthetic */ PreSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$3$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSubscriberInfoFragment$onViewCreated$3(PreSubscriberInfoFragment preSubscriberInfoFragment) {
        super(1);
        this.this$0 = preSubscriberInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Object> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends Object> resource) {
        Resource<? extends Object> resourceContentIfNotHandled;
        FragmentPreSubscriberInfoEnquiryBinding m8331n;
        FragmentPreSubscriberInfoEnquiryBinding m8331n2;
        FragmentPreSubscriberInfoEnquiryBinding m8331n3;
        FragmentPreSubscriberInfoEnquiryBinding m8331n4;
        FragmentPreSubscriberInfoEnquiryBinding m8331n5;
        FragmentPreSubscriberInfoEnquiryBinding m8331n6;
        SubscriberInfoViewModel subscriberInfoViewModel;
        FragmentPreSubscriberInfoEnquiryBinding m8331n7;
        SubscriberInfoViewModel subscriberInfoViewModel2;
        FragmentPreSubscriberInfoEnquiryBinding m8331n8;
        SubscriberInfoViewModel subscriberInfoViewModel3;
        FragmentPreSubscriberInfoEnquiryBinding m8331n9;
        FragmentPreSubscriberInfoEnquiryBinding m8331n10;
        FragmentPreSubscriberInfoEnquiryBinding m8331n11;
        FragmentPreSubscriberInfoEnquiryBinding m8331n12;
        FragmentPreSubscriberInfoEnquiryBinding m8331n13;
        FragmentPreSubscriberInfoEnquiryBinding m8331n14;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        PreSubscriberInfoFragment preSubscriberInfoFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                m8331n9 = preSubscriberInfoFragment.m8331n();
                m8331n9.shimmerBalance.stopShimmer();
                m8331n10 = preSubscriberInfoFragment.m8331n();
                m8331n10.shimmerCeDate.stopShimmer();
                return;
            } else if (i != 3) {
                m8331n13 = preSubscriberInfoFragment.m8331n();
                m8331n13.shimmerBalance.stopShimmer();
                m8331n14 = preSubscriberInfoFragment.m8331n();
                m8331n14.shimmerCeDate.stopShimmer();
                return;
            } else {
                m8331n11 = preSubscriberInfoFragment.m8331n();
                m8331n11.shimmerBalance.startShimmer();
                m8331n12 = preSubscriberInfoFragment.m8331n();
                m8331n12.shimmerCeDate.startShimmer();
                return;
            }
        }
        m8331n = preSubscriberInfoFragment.m8331n();
        m8331n.shimmerBalance.stopShimmer();
        m8331n2 = preSubscriberInfoFragment.m8331n();
        m8331n2.shimmerCeDate.stopShimmer();
        m8331n3 = preSubscriberInfoFragment.m8331n();
        ShimmerFrameLayout shimmerFrameLayout = m8331n3.shimmerBalance;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerBalance");
        ViewVisibleExtKt.toGone(shimmerFrameLayout);
        m8331n4 = preSubscriberInfoFragment.m8331n();
        ShimmerFrameLayout shimmerFrameLayout2 = m8331n4.shimmerCeDate;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerCeDate");
        ViewVisibleExtKt.toGone(shimmerFrameLayout2);
        m8331n5 = preSubscriberInfoFragment.m8331n();
        LinearLayout linearLayout = m8331n5.layoutBalanceSOS;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutBalanceSOS");
        ViewVisibleExtKt.toVisible(linearLayout);
        m8331n6 = preSubscriberInfoFragment.m8331n();
        TextViewTopLabelView textViewTopLabelView = m8331n6.textViewBalance;
        subscriberInfoViewModel = preSubscriberInfoFragment.f99522i;
        SubscriberInfoViewModel subscriberInfoViewModel4 = null;
        if (subscriberInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
            subscriberInfoViewModel = null;
        }
        textViewTopLabelView.setText(subscriberInfoViewModel.getBalance());
        m8331n7 = preSubscriberInfoFragment.m8331n();
        TextViewTopLabelView textViewTopLabelView2 = m8331n7.textViewSOS;
        subscriberInfoViewModel2 = preSubscriberInfoFragment.f99522i;
        if (subscriberInfoViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
            subscriberInfoViewModel2 = null;
        }
        textViewTopLabelView2.setText(subscriberInfoViewModel2.getSos());
        m8331n8 = preSubscriberInfoFragment.m8331n();
        TextViewTopLabelView textViewTopLabelView3 = m8331n8.textViewCeDate;
        subscriberInfoViewModel3 = preSubscriberInfoFragment.f99522i;
        if (subscriberInfoViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
        } else {
            subscriberInfoViewModel4 = subscriberInfoViewModel3;
        }
        textViewTopLabelView3.setText(subscriberInfoViewModel4.getCeDate());
    }
}