package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.ShimmerExtenKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SuspendInfo;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SuspendInfo;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$7 */
/* loaded from: classes9.dex */
public final class PostSubscriberInfoFragment$onViewCreated$7 extends Lambda implements Function1<Resource<? extends List<? extends SuspendInfo>>, Unit> {
    final /* synthetic */ PostSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$7$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSubscriberInfoFragment$onViewCreated$7(PostSubscriberInfoFragment postSubscriberInfoFragment) {
        super(1);
        this.this$0 = postSubscriberInfoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1$lambda$0(PostSubscriberInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.navigateToShelf(new SuspendInfoFragment(), SuspendInfoFragment.TAG);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends SuspendInfo>> resource) {
        invoke2((Resource<? extends List<SuspendInfo>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<SuspendInfo>> resource) {
        ShimmerFrameLayout shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2;
        ConstraintLayout constraintLayout;
        ShimmerFrameLayout shimmerFrameLayout3;
        DtacFontTextView dtacFontTextView;
        ImageView imageView;
        DtacFontTextView dtacFontTextView2;
        ConstraintLayout constraintLayout2;
        ShimmerFrameLayout shimmerFrameLayout4;
        ShimmerFrameLayout shimmerFrameLayout5;
        if (resource != null) {
            final PostSubscriberInfoFragment postSubscriberInfoFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            ShimmerFrameLayout shimmerFrameLayout6 = null;
            ShimmerFrameLayout shimmerFrameLayout7 = null;
            ConstraintLayout constraintLayout3 = null;
            ImageView imageView2 = null;
            if (i == 1) {
                shimmerFrameLayout = postSubscriberInfoFragment.f99491y;
                if (shimmerFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerStatusSuspend");
                    shimmerFrameLayout = null;
                }
                ViewVisibleExtKt.toVisible(shimmerFrameLayout);
                shimmerFrameLayout2 = postSubscriberInfoFragment.f99491y;
                if (shimmerFrameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerStatusSuspend");
                } else {
                    shimmerFrameLayout6 = shimmerFrameLayout2;
                }
                shimmerFrameLayout6.startShimmer();
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                shimmerFrameLayout4 = postSubscriberInfoFragment.f99491y;
                if (shimmerFrameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerStatusSuspend");
                    shimmerFrameLayout4 = null;
                }
                ViewVisibleExtKt.toVisible(shimmerFrameLayout4);
                shimmerFrameLayout5 = postSubscriberInfoFragment.f99491y;
                if (shimmerFrameLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerStatusSuspend");
                } else {
                    shimmerFrameLayout7 = shimmerFrameLayout5;
                }
                shimmerFrameLayout7.stopShimmer();
            } else {
                constraintLayout = postSubscriberInfoFragment.f99471C;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutStatusSuspend");
                    constraintLayout = null;
                }
                ViewVisibleExtKt.toVisible(constraintLayout);
                shimmerFrameLayout3 = postSubscriberInfoFragment.f99491y;
                if (shimmerFrameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerStatusSuspend");
                    shimmerFrameLayout3 = null;
                }
                ShimmerExtenKt.finish(shimmerFrameLayout3);
                List<SuspendInfo> data = resource.getData();
                if (data != null) {
                    if (!data.isEmpty()) {
                        dtacFontTextView2 = postSubscriberInfoFragment.f99485s;
                        if (dtacFontTextView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textViewSuspendNums");
                            dtacFontTextView2 = null;
                        }
                        dtacFontTextView2.setText(String.valueOf(data.size()));
                        constraintLayout2 = postSubscriberInfoFragment.f99471C;
                        if (constraintLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutStatusSuspend");
                        } else {
                            constraintLayout3 = constraintLayout2;
                        }
                        constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: th.co.dtac.android.dtacone.view.fragment.customerenquiry.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PostSubscriberInfoFragment$onViewCreated$7.invoke$lambda$2$lambda$1$lambda$0(PostSubscriberInfoFragment.this, view);
                            }
                        });
                        return;
                    }
                    dtacFontTextView = postSubscriberInfoFragment.f99485s;
                    if (dtacFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textViewSuspendNums");
                        dtacFontTextView = null;
                    }
                    dtacFontTextView.setVisibility(4);
                    imageView = postSubscriberInfoFragment.f99470B;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("arrowSuspend");
                    } else {
                        imageView2 = imageView;
                    }
                    imageView2.setVisibility(4);
                }
            }
        }
    }
}