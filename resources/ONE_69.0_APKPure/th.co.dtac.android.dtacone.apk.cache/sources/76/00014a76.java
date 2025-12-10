package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentPreSubscriberInfoEnquiryBinding;
import th.p047co.dtac.android.dtacone.extension.ShimmerExtenKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SuspendInfo;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SuspendInfo;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$6 */
/* loaded from: classes9.dex */
public final class PreSubscriberInfoFragment$onViewCreated$6 extends Lambda implements Function1<Resource<? extends List<? extends SuspendInfo>>, Unit> {
    final /* synthetic */ PreSubscriberInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment$onViewCreated$6$WhenMappings */
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
    public PreSubscriberInfoFragment$onViewCreated$6(PreSubscriberInfoFragment preSubscriberInfoFragment) {
        super(1);
        this.this$0 = preSubscriberInfoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1$lambda$0(PreSubscriberInfoFragment this$0, View view) {
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
        if (resource != null) {
            final PreSubscriberInfoFragment preSubscriberInfoFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                m8331n = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout = m8331n.shimmerStatusSuspend;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerStatusSuspend");
                ViewVisibleExtKt.toVisible(shimmerFrameLayout);
                m8331n2 = preSubscriberInfoFragment.m8331n();
                m8331n2.shimmerStatusSuspend.startShimmer();
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                m8331n9 = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout2 = m8331n9.shimmerStatusSuspend;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerStatusSuspend");
                ViewVisibleExtKt.toVisible(shimmerFrameLayout2);
                m8331n10 = preSubscriberInfoFragment.m8331n();
                m8331n10.shimmerStatusSuspend.stopShimmer();
            } else {
                m8331n3 = preSubscriberInfoFragment.m8331n();
                ConstraintLayout constraintLayout = m8331n3.layoutStatusSuspend;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutStatusSuspend");
                ViewVisibleExtKt.toVisible(constraintLayout);
                m8331n4 = preSubscriberInfoFragment.m8331n();
                ShimmerFrameLayout shimmerFrameLayout3 = m8331n4.shimmerStatusSuspend;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "binding.shimmerStatusSuspend");
                ShimmerExtenKt.finish(shimmerFrameLayout3);
                List<SuspendInfo> data = resource.getData();
                if (data != null) {
                    if (!data.isEmpty()) {
                        m8331n7 = preSubscriberInfoFragment.m8331n();
                        m8331n7.textViewSuspendNums.setText(String.valueOf(data.size()));
                        m8331n8 = preSubscriberInfoFragment.m8331n();
                        m8331n8.layoutStatusSuspend.setOnClickListener(new View.OnClickListener() { // from class: th.co.dtac.android.dtacone.view.fragment.customerenquiry.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PreSubscriberInfoFragment$onViewCreated$6.invoke$lambda$2$lambda$1$lambda$0(PreSubscriberInfoFragment.this, view);
                            }
                        });
                        return;
                    }
                    m8331n5 = preSubscriberInfoFragment.m8331n();
                    m8331n5.textViewSuspendNums.toInvisible();
                    m8331n6 = preSubscriberInfoFragment.m8331n();
                    m8331n6.arrowSuspend.toInvisible();
                }
            }
        }
    }
}