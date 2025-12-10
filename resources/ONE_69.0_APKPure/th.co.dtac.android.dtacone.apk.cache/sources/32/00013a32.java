package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostRecommendPackageAdapter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment$onStart$1$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostRecommendedPackageFragment$onStart$1$1 extends Lambda implements Function1<Resource<? extends RecommendPackageResponse>, Unit> {
    final /* synthetic */ OnePre2PostRecommendedPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostRecommendedPackageFragment$onStart$1$1(OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment) {
        super(1);
        this.this$0 = onePre2PostRecommendedPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends RecommendPackageResponse> resource) {
        invoke2((Resource<RecommendPackageResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<RecommendPackageResponse> resource) {
        Resource<RecommendPackageResponse> peekContent;
        List m11285r;
        OnePre2PostRecommendPackageAdapter onePre2PostRecommendPackageAdapter;
        ArrayList arrayList;
        TextView textView;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (resource == null || (peekContent = resource.peekContent()) == null) {
            return;
        }
        OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment = this.this$0;
        if (peekContent.getStatus() == StatusResource.SUCCESS) {
            onePre2PostRecommendedPackageFragment.dismissLoading();
            RecommendPackageResponse data = peekContent.getData();
            if (data != null) {
                m11285r = onePre2PostRecommendedPackageFragment.m11285r(data);
                if (m11285r != null) {
                    arrayList2 = onePre2PostRecommendedPackageFragment.f95022u;
                    arrayList2.clear();
                    arrayList3 = onePre2PostRecommendedPackageFragment.f95022u;
                    arrayList3.addAll(m11285r);
                }
                onePre2PostRecommendPackageAdapter = onePre2PostRecommendedPackageFragment.f95021t;
                if (onePre2PostRecommendPackageAdapter != null) {
                    onePre2PostRecommendPackageAdapter.notifyDataSetChanged();
                }
                arrayList = onePre2PostRecommendedPackageFragment.f95022u;
                onePre2PostRecommendedPackageFragment.m11282u(!arrayList.isEmpty());
                textView = onePre2PostRecommendedPackageFragment.f95014m;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRecommended");
                    textView = null;
                }
                textView.setText(data.getOffersInformation().getColorMessage());
            }
        }
    }
}