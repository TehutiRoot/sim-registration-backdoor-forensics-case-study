package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePre2PostRecommendedPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePre2PostRecommendedPackageFragment.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostRecommendedPackageFragment$onStart$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment$onStart$1$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostRecommendedPackageFragment$onStart$1$2 extends Lambda implements Function1<Resource<? extends DataUsageInfoResponse>, Unit> {
    final /* synthetic */ OnePre2PostRecommendedPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment$onStart$1$2$WhenMappings */
    /* loaded from: classes10.dex */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostRecommendedPackageFragment$onStart$1$2(OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment) {
        super(1);
        this.this$0 = onePre2PostRecommendedPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends DataUsageInfoResponse> resource) {
        invoke2((Resource<DataUsageInfoResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<DataUsageInfoResponse> resource) {
        Resource<DataUsageInfoResponse> resourceContentIfNotHandled;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        TextView textView5 = null;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            textView3 = onePre2PostRecommendedPackageFragment.f95011j;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPhone");
                textView3 = null;
            }
            textView3.setText("โทร -");
            textView4 = onePre2PostRecommendedPackageFragment.f95012k;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvInternet");
            } else {
                textView5 = textView4;
            }
            textView5.setText("เน็ต -");
            return;
        }
        DataUsageInfoResponse data = resourceContentIfNotHandled.getData();
        if (data != null) {
            String minuteofuseaverage3months = data.getMinuteofuseaverage3months();
            textView = onePre2PostRecommendedPackageFragment.f95011j;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPhone");
                textView = null;
            }
            if (minuteofuseaverage3months.length() == 0) {
                minuteofuseaverage3months = "0";
            }
            textView.setText("โทร " + minuteofuseaverage3months + " นาที");
            String internetusagevolumnaverage3months = data.getInternetusagevolumnaverage3months();
            textView2 = onePre2PostRecommendedPackageFragment.f95012k;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvInternet");
            } else {
                textView5 = textView2;
            }
            textView5.setText("เน็ต " + (internetusagevolumnaverage3months.length() != 0 ? internetusagevolumnaverage3months : "0") + " GB");
        }
    }
}