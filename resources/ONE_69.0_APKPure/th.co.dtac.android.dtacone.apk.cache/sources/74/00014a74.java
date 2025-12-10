package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.FragmentPreSubscriberInfoEnquiryBinding;
import th.p047co.dtac.android.dtacone.extension.ShimmerExtenKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$5 */
/* loaded from: classes9.dex */
public final class PreSubscriberInfoFragment$onViewCreated$5 extends Lambda implements Function1<Resource<? extends ResponseBody>, Unit> {
    final /* synthetic */ PreSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$5$WhenMappings */
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
    public PreSubscriberInfoFragment$onViewCreated$5(PreSubscriberInfoFragment preSubscriberInfoFragment) {
        super(1);
        this.this$0 = preSubscriberInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ResponseBody> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends ResponseBody> resource) {
        FragmentPreSubscriberInfoEnquiryBinding m8331n;
        FragmentPreSubscriberInfoEnquiryBinding m8331n2;
        FragmentPreSubscriberInfoEnquiryBinding m8331n3;
        FragmentPreSubscriberInfoEnquiryBinding m8331n4;
        FragmentPreSubscriberInfoEnquiryBinding m8331n5;
        FragmentPreSubscriberInfoEnquiryBinding m8331n6;
        FragmentPreSubscriberInfoEnquiryBinding m8331n7;
        FragmentPreSubscriberInfoEnquiryBinding m8331n8;
        FragmentPreSubscriberInfoEnquiryBinding m8331n9;
        FragmentPreSubscriberInfoEnquiryBinding m8331n10;
        FragmentPreSubscriberInfoEnquiryBinding m8331n11;
        if (resource != null) {
            PreSubscriberInfoFragment preSubscriberInfoFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                m8331n = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout = m8331n.shimmerFaceRecogStatus;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFaceRecogStatus");
                ShimmerExtenKt.finish(shimmerFrameLayout);
                m8331n2 = preSubscriberInfoFragment.m8331n();
                ImageView imageView = m8331n2.imageViewFaceRegStatus;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageViewFaceRegStatus");
                ViewVisibleExtKt.toVisible(imageView);
                m8331n3 = preSubscriberInfoFragment.m8331n();
                m8331n3.imageViewFaceRegStatus.setImageResource(R.mipmap.face);
            } else if (i == 2) {
                m8331n4 = preSubscriberInfoFragment.m8331n();
                ImageView imageView2 = m8331n4.imageViewFaceRegStatus;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.imageViewFaceRegStatus");
                ViewVisibleExtKt.toVisible(imageView2);
                m8331n5 = preSubscriberInfoFragment.m8331n();
                m8331n5.imageViewFaceRegStatus.setImageResource(R.mipmap.no_face);
                m8331n6 = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout2 = m8331n6.shimmerFaceRecogStatus;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerFaceRecogStatus");
                ShimmerExtenKt.finish(shimmerFrameLayout2);
            } else if (i != 3) {
                m8331n9 = preSubscriberInfoFragment.m8331n();
                ImageView imageView3 = m8331n9.imageViewFaceRegStatus;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.imageViewFaceRegStatus");
                ViewVisibleExtKt.toVisible(imageView3);
                m8331n10 = preSubscriberInfoFragment.m8331n();
                m8331n10.imageViewFaceRegStatus.setImageResource(R.mipmap.no_face);
                m8331n11 = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout3 = m8331n11.shimmerFaceRecogStatus;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "binding.shimmerFaceRecogStatus");
                ShimmerExtenKt.finish(shimmerFrameLayout3);
            } else {
                m8331n7 = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout4 = m8331n7.shimmerFaceRecogStatus;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout4, "binding.shimmerFaceRecogStatus");
                ViewVisibleExtKt.toVisible(shimmerFrameLayout4);
                m8331n8 = preSubscriberInfoFragment.m8331n();
                m8331n8.shimmerFaceRecogStatus.startShimmer();
            }
        }
    }
}