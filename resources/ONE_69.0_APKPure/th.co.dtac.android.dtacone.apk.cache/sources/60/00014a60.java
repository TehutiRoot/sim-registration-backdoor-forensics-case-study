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
import th.p047co.dtac.android.dtacone.extension.format.ShimmerExtenKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$6 */
/* loaded from: classes9.dex */
public final class PostSubscriberInfoFragment$onViewCreated$6 extends Lambda implements Function1<Resource<? extends ResponseBody>, Unit> {
    final /* synthetic */ PostSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$6$WhenMappings */
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
    public PostSubscriberInfoFragment$onViewCreated$6(PostSubscriberInfoFragment postSubscriberInfoFragment) {
        super(1);
        this.this$0 = postSubscriberInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ResponseBody> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends ResponseBody> resource) {
        ShimmerFrameLayout shimmerFrameLayout;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ShimmerFrameLayout shimmerFrameLayout2;
        ShimmerFrameLayout shimmerFrameLayout3;
        ShimmerFrameLayout shimmerFrameLayout4;
        if (resource != null) {
            PostSubscriberInfoFragment postSubscriberInfoFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            ImageView imageView5 = null;
            ShimmerFrameLayout shimmerFrameLayout5 = null;
            ShimmerFrameLayout shimmerFrameLayout6 = null;
            if (i == 1) {
                shimmerFrameLayout = postSubscriberInfoFragment.f99490x;
                if (shimmerFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerFaceRecogStatus");
                    shimmerFrameLayout = null;
                }
                ShimmerExtenKt.finish(shimmerFrameLayout);
                imageView = postSubscriberInfoFragment.f99469A;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewFaceRegStatus");
                    imageView = null;
                }
                ViewVisibleExtKt.toVisible(imageView);
                imageView2 = postSubscriberInfoFragment.f99469A;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewFaceRegStatus");
                } else {
                    imageView5 = imageView2;
                }
                imageView5.setImageResource(R.mipmap.face);
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                shimmerFrameLayout3 = postSubscriberInfoFragment.f99490x;
                if (shimmerFrameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerFaceRecogStatus");
                    shimmerFrameLayout3 = null;
                }
                ViewVisibleExtKt.toVisible(shimmerFrameLayout3);
                shimmerFrameLayout4 = postSubscriberInfoFragment.f99490x;
                if (shimmerFrameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerFaceRecogStatus");
                } else {
                    shimmerFrameLayout5 = shimmerFrameLayout4;
                }
                shimmerFrameLayout5.startShimmer();
            } else {
                imageView3 = postSubscriberInfoFragment.f99469A;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewFaceRegStatus");
                    imageView3 = null;
                }
                ViewVisibleExtKt.toVisible(imageView3);
                imageView4 = postSubscriberInfoFragment.f99469A;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewFaceRegStatus");
                    imageView4 = null;
                }
                imageView4.setImageResource(R.mipmap.no_face);
                shimmerFrameLayout2 = postSubscriberInfoFragment.f99490x;
                if (shimmerFrameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerFaceRecogStatus");
                } else {
                    shimmerFrameLayout6 = shimmerFrameLayout2;
                }
                ShimmerExtenKt.finish(shimmerFrameLayout6);
            }
        }
    }
}