package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackagePaginate;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSearchPackageFragment$setupObserve$1$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostSearchPackageFragment$setupObserve$1$2 extends Lambda implements Function1<Resource<? extends OnePostpaidSearchPackage>, Unit> {
    final /* synthetic */ OnePre2PostSearchPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSearchPackageFragment$setupObserve$1$2(OnePre2PostSearchPackageFragment onePre2PostSearchPackageFragment) {
        super(1);
        this.this$0 = onePre2PostSearchPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OnePostpaidSearchPackage> resource) {
        invoke2((Resource<OnePostpaidSearchPackage>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OnePostpaidSearchPackage> resource) {
        Resource<OnePostpaidSearchPackage> resourceContentIfNotHandled;
        OnePostpaidSearchPackage data;
        OneFontTextView oneFontTextView;
        RecyclerView recyclerView;
        OneFontTextView oneFontTextView2;
        OneFontTextView oneFontTextView3;
        OneFontTextView oneFontTextView4;
        RecyclerView recyclerView2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostSearchPackageFragment onePre2PostSearchPackageFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() != StatusResource.SUCCESS || (data = resource.getData()) == null) {
            return;
        }
        onePre2PostSearchPackageFragment.m11246G(data);
        data.getPackages();
        oneFontTextView = onePre2PostSearchPackageFragment.f95058k;
        OneFontTextView oneFontTextView5 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchNotFoundTextView");
            oneFontTextView = null;
        }
        ViewVisibleExtKt.toGone(oneFontTextView);
        recyclerView = onePre2PostSearchPackageFragment.f95061n;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPackageRecyclerView");
            recyclerView = null;
        }
        ViewVisibleExtKt.toVisible(recyclerView);
        OnePostpaidSearchPackagePaginate paginate = data.getPaginate();
        if (paginate != null) {
            if (paginate.getTotalItem() == 0) {
                oneFontTextView4 = onePre2PostSearchPackageFragment.f95058k;
                if (oneFontTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchNotFoundTextView");
                    oneFontTextView4 = null;
                }
                ViewVisibleExtKt.toVisible(oneFontTextView4);
                recyclerView2 = onePre2PostSearchPackageFragment.f95061n;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchPackageRecyclerView");
                    recyclerView2 = null;
                }
                ViewVisibleExtKt.toGone(recyclerView2);
            }
            if (paginate.getTotalItem() > 50) {
                oneFontTextView3 = onePre2PostSearchPackageFragment.f95059l;
                if (oneFontTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("warningMessageTextView");
                } else {
                    oneFontTextView5 = oneFontTextView3;
                }
                ViewVisibleExtKt.toVisible(oneFontTextView5);
                return;
            }
            oneFontTextView2 = onePre2PostSearchPackageFragment.f95059l;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("warningMessageTextView");
            } else {
                oneFontTextView5 = oneFontTextView2;
            }
            ViewVisibleExtKt.toGone(oneFontTextView5);
        }
    }
}