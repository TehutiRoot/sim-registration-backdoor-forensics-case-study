package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SwitchOffModel;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/SwitchOffModel;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class PostSubscriberInfoFragment$onViewCreated$3 extends Lambda implements Function1<Resource<? extends SwitchOffModel>, Unit> {
    final /* synthetic */ PostSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$3$WhenMappings */
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
    public PostSubscriberInfoFragment$onViewCreated$3(PostSubscriberInfoFragment postSubscriberInfoFragment) {
        super(1);
        this.this$0 = postSubscriberInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends SwitchOffModel> resource) {
        invoke2((Resource<SwitchOffModel>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<SwitchOffModel> resource) {
        ShimmerFrameLayout shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2;
        TextViewTopLabelView textViewTopLabelView;
        TextViewTopLabelView textViewTopLabelView2;
        ShimmerFrameLayout shimmerFrameLayout3;
        ShimmerFrameLayout shimmerFrameLayout4;
        if (resource != null) {
            PostSubscriberInfoFragment postSubscriberInfoFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            TextViewTopLabelView textViewTopLabelView3 = null;
            ShimmerFrameLayout shimmerFrameLayout5 = null;
            ShimmerFrameLayout shimmerFrameLayout6 = null;
            if (i != 1) {
                if (i == 2) {
                    shimmerFrameLayout3 = postSubscriberInfoFragment.f99487u;
                    if (shimmerFrameLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shimmerDeviceContract");
                    } else {
                        shimmerFrameLayout6 = shimmerFrameLayout3;
                    }
                    shimmerFrameLayout6.stopShimmer();
                    return;
                } else if (i != 3) {
                    return;
                } else {
                    shimmerFrameLayout4 = postSubscriberInfoFragment.f99487u;
                    if (shimmerFrameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shimmerDeviceContract");
                    } else {
                        shimmerFrameLayout5 = shimmerFrameLayout4;
                    }
                    shimmerFrameLayout5.startShimmer();
                    return;
                }
            }
            shimmerFrameLayout = postSubscriberInfoFragment.f99487u;
            if (shimmerFrameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerDeviceContract");
                shimmerFrameLayout = null;
            }
            shimmerFrameLayout.stopShimmer();
            shimmerFrameLayout2 = postSubscriberInfoFragment.f99487u;
            if (shimmerFrameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerDeviceContract");
                shimmerFrameLayout2 = null;
            }
            ViewVisibleExtKt.toGone(shimmerFrameLayout2);
            textViewTopLabelView = postSubscriberInfoFragment.f99483q;
            if (textViewTopLabelView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewStatus");
                textViewTopLabelView = null;
            }
            ViewVisibleExtKt.toVisible(textViewTopLabelView);
            SwitchOffModel data = resource.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.customerenquiry.SwitchOffModel");
            SwitchOffModel switchOffModel = data;
            textViewTopLabelView2 = postSubscriberInfoFragment.f99483q;
            if (textViewTopLabelView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewStatus");
            } else {
                textViewTopLabelView3 = textViewTopLabelView2;
            }
            textViewTopLabelView3.setVisibility(switchOffModel.getVisibility());
            textViewTopLabelView3.setText(switchOffModel.getMessage());
        }
    }
}