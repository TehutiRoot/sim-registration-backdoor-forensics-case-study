package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetSubscriberOutstandingInvoiceResponse;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetSubscriberOutstandingInvoiceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$5 */
/* loaded from: classes9.dex */
public final class PostSubscriberInfoFragment$onViewCreated$5 extends Lambda implements Function1<Resource<? extends GetSubscriberOutstandingInvoiceResponse>, Unit> {
    final /* synthetic */ PostSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment$onViewCreated$5$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSubscriberInfoFragment$onViewCreated$5(PostSubscriberInfoFragment postSubscriberInfoFragment) {
        super(1);
        this.this$0 = postSubscriberInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetSubscriberOutstandingInvoiceResponse> resource) {
        invoke2((Resource<GetSubscriberOutstandingInvoiceResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<GetSubscriberOutstandingInvoiceResponse> resource) {
        ShimmerFrameLayout shimmerFrameLayout;
        ShimmerFrameLayout shimmerFrameLayout2;
        ShimmerFrameLayout shimmerFrameLayout3;
        TextViewTopLabelView textViewTopLabelView;
        ShimmerFrameLayout shimmerFrameLayout4;
        ShimmerFrameLayout shimmerFrameLayout5;
        if (resource != null) {
            PostSubscriberInfoFragment postSubscriberInfoFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            ShimmerFrameLayout shimmerFrameLayout6 = null;
            ShimmerFrameLayout shimmerFrameLayout7 = null;
            ShimmerFrameLayout shimmerFrameLayout8 = null;
            TextViewTopLabelView textViewTopLabelView2 = null;
            if (i == 1) {
                shimmerFrameLayout = postSubscriberInfoFragment.f99489w;
                if (shimmerFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerBillingOutstanding");
                } else {
                    shimmerFrameLayout6 = shimmerFrameLayout;
                }
                shimmerFrameLayout6.startShimmer();
            } else if (i != 2) {
                if (i != 3) {
                    shimmerFrameLayout5 = postSubscriberInfoFragment.f99489w;
                    if (shimmerFrameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shimmerBillingOutstanding");
                    } else {
                        shimmerFrameLayout7 = shimmerFrameLayout5;
                    }
                    shimmerFrameLayout7.stopShimmer();
                    return;
                }
                shimmerFrameLayout4 = postSubscriberInfoFragment.f99489w;
                if (shimmerFrameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerBillingOutstanding");
                } else {
                    shimmerFrameLayout8 = shimmerFrameLayout4;
                }
                shimmerFrameLayout8.stopShimmer();
            } else {
                shimmerFrameLayout2 = postSubscriberInfoFragment.f99489w;
                if (shimmerFrameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerBillingOutstanding");
                    shimmerFrameLayout2 = null;
                }
                shimmerFrameLayout2.stopShimmer();
                shimmerFrameLayout3 = postSubscriberInfoFragment.f99489w;
                if (shimmerFrameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shimmerBillingOutstanding");
                    shimmerFrameLayout3 = null;
                }
                shimmerFrameLayout3.setVisibility(4);
                GetSubscriberOutstandingInvoiceResponse data = resource.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.customerenquiry.GetSubscriberOutstandingInvoiceResponse");
                GetSubscriberOutstandingInvoiceResponse getSubscriberOutstandingInvoiceResponse = data;
                textViewTopLabelView = postSubscriberInfoFragment.f99484r;
                if (textViewTopLabelView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewBillingAmount");
                } else {
                    textViewTopLabelView2 = textViewTopLabelView;
                }
                textViewTopLabelView2.setText(StringExtKt.formatMoneyWithDecimal(getSubscriberOutstandingInvoiceResponse.getTotalOutstandingBalanceAmountIncVAT()));
            }
        }
    }
}