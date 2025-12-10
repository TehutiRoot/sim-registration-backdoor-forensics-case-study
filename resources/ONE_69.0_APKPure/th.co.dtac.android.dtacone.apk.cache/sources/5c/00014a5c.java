package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$4 */
/* loaded from: classes9.dex */
public final class PostSubscriberInfoFragment$onViewCreated$4 extends Lambda implements Function1<Resource<? extends Object>, Unit> {
    final /* synthetic */ PostSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$4$WhenMappings */
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
    public PostSubscriberInfoFragment$onViewCreated$4(PostSubscriberInfoFragment postSubscriberInfoFragment) {
        super(1);
        this.this$0 = postSubscriberInfoFragment;
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
        ShimmerFrameLayout shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2;
        ImageView imageView;
        ImageView imageView2;
        ShimmerFrameLayout shimmerFrameLayout3;
        ShimmerFrameLayout shimmerFrameLayout4;
        if (resource != null) {
            PostSubscriberInfoFragment postSubscriberInfoFragment = this.this$0;
            int i2 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            ImageView imageView3 = null;
            ShimmerFrameLayout shimmerFrameLayout5 = null;
            ShimmerFrameLayout shimmerFrameLayout6 = null;
            if (i2 != 1) {
                if (i2 == 2) {
                    shimmerFrameLayout3 = postSubscriberInfoFragment.f99488v;
                    if (shimmerFrameLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shimmerSegment");
                    } else {
                        shimmerFrameLayout6 = shimmerFrameLayout3;
                    }
                    shimmerFrameLayout6.stopShimmer();
                    return;
                } else if (i2 != 3) {
                    return;
                } else {
                    shimmerFrameLayout4 = postSubscriberInfoFragment.f99488v;
                    if (shimmerFrameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shimmerSegment");
                    } else {
                        shimmerFrameLayout5 = shimmerFrameLayout4;
                    }
                    shimmerFrameLayout5.startShimmer();
                    return;
                }
            }
            subscriberInfoViewModel = postSubscriberInfoFragment.f99472D;
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
            shimmerFrameLayout = postSubscriberInfoFragment.f99488v;
            if (shimmerFrameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerSegment");
                shimmerFrameLayout = null;
            }
            shimmerFrameLayout.stopShimmer();
            if (i != 0) {
                shimmerFrameLayout2 = postSubscriberInfoFragment.f99488v;
                if (shimmerFrameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerSegment");
                    shimmerFrameLayout2 = null;
                }
                ViewVisibleExtKt.toGone(shimmerFrameLayout2);
                imageView = postSubscriberInfoFragment.f99492z;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewMemberType");
                    imageView = null;
                }
                ViewVisibleExtKt.toVisible(imageView);
                imageView2 = postSubscriberInfoFragment.f99492z;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewMemberType");
                } else {
                    imageView3 = imageView2;
                }
                imageView3.setImageResource(i);
            }
        }
    }
}