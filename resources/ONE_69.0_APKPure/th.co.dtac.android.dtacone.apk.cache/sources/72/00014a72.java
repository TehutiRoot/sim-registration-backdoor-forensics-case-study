package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.FragmentPreSubscriberInfoEnquiryBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$4 */
/* loaded from: classes9.dex */
public final class PreSubscriberInfoFragment$onViewCreated$4 extends Lambda implements Function1<Resource<? extends Object>, Unit> {
    final /* synthetic */ PreSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$4$WhenMappings */
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
    public PreSubscriberInfoFragment$onViewCreated$4(PreSubscriberInfoFragment preSubscriberInfoFragment) {
        super(1);
        this.this$0 = preSubscriberInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Object> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends Object> resource) {
        SubscriberInfoViewModel subscriberInfoViewModel;
        int i;
        FragmentPreSubscriberInfoEnquiryBinding m8331n;
        FragmentPreSubscriberInfoEnquiryBinding m8331n2;
        FragmentPreSubscriberInfoEnquiryBinding m8331n3;
        FragmentPreSubscriberInfoEnquiryBinding m8331n4;
        FragmentPreSubscriberInfoEnquiryBinding m8331n5;
        FragmentPreSubscriberInfoEnquiryBinding m8331n6;
        FragmentPreSubscriberInfoEnquiryBinding m8331n7;
        if (resource != null) {
            PreSubscriberInfoFragment preSubscriberInfoFragment = this.this$0;
            int i2 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    m8331n5 = preSubscriberInfoFragment.m8331n();
                    m8331n5.shimmerSegment.stopShimmer();
                    return;
                } else if (i2 != 3) {
                    m8331n7 = preSubscriberInfoFragment.m8331n();
                    m8331n7.shimmerSegment.stopShimmer();
                    return;
                } else {
                    m8331n6 = preSubscriberInfoFragment.m8331n();
                    m8331n6.shimmerSegment.startShimmer();
                    return;
                }
            }
            subscriberInfoViewModel = preSubscriberInfoFragment.f99522i;
            if (subscriberInfoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
                subscriberInfoViewModel = null;
            }
            String segment = subscriberInfoViewModel.getSegment();
            switch (segment.hashCode()) {
                case -1848981747:
                    if (segment.equals(ConstsKt.SEGMENT_SILVER)) {
                        i = R.mipmap.advisory_segment_gray_2019;
                        break;
                    }
                    i = 0;
                    break;
                case -1689852794:
                    if (segment.equals(ConstsKt.SEGMENT_PLATINUM_BLUE)) {
                        i = R.mipmap.advisory_segment_navy_blue_2019;
                        break;
                    }
                    i = 0;
                    break;
                case 2193504:
                    if (segment.equals(ConstsKt.SEGMENT_GOLD)) {
                        i = R.mipmap.advisory_segment_gold_2019;
                        break;
                    }
                    i = 0;
                    break;
                case 1951082306:
                    if (segment.equals(ConstsKt.SEGMENT_WELCOME)) {
                        i = R.mipmap.advisory_segment_sky_blue_2019;
                        break;
                    }
                    i = 0;
                    break;
                default:
                    i = 0;
                    break;
            }
            m8331n = preSubscriberInfoFragment.m8331n();
            m8331n.shimmerSegment.stopShimmer();
            if (i != 0) {
                m8331n2 = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout = m8331n2.shimmerSegment;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerSegment");
                ViewVisibleExtKt.toGone(shimmerFrameLayout);
                m8331n3 = preSubscriberInfoFragment.m8331n();
                ImageView imageView = m8331n3.imageViewMemberType;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageViewMemberType");
                ViewVisibleExtKt.toVisible(imageView);
                m8331n4 = preSubscriberInfoFragment.m8331n();
                m8331n4.imageViewMemberType.setImageResource(i);
            }
        }
    }
}