package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundTrueMoveHFragment;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundTrueOnlineFragment;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneNadOutboundActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundActivity.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity$setupObserve$1$2\n+ 2 OneNadOutboundActivity.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,477:1\n435#2:478\n436#2:490\n437#2:493\n435#2:494\n436#2:506\n437#2:509\n800#3,11:479\n1855#3,2:491\n800#3,11:495\n1855#3,2:507\n*S KotlinDebug\n*F\n+ 1 OneNadOutboundActivity.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity$setupObserve$1$2\n*L\n277#1:478\n277#1:490\n277#1:493\n281#1:494\n281#1:506\n281#1:509\n277#1:479,11\n277#1:491,2\n281#1:495,11\n281#1:507,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity$setupObserve$1$2 */
/* loaded from: classes10.dex */
public final class OneNadOutboundActivity$setupObserve$1$2 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneNadOutboundViewModel $this_apply;
    final /* synthetic */ OneNadOutboundActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundActivity$setupObserve$1$2(OneNadOutboundActivity oneNadOutboundActivity, OneNadOutboundViewModel oneNadOutboundViewModel) {
        super(1);
        this.this$0 = oneNadOutboundActivity;
        this.$this_apply = oneNadOutboundViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneNadOutboundActivity oneNadOutboundActivity = this.this$0;
        OneNadOutboundViewModel oneNadOutboundViewModel = this.$this_apply;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            oneNadOutboundActivity.showLoading(false);
            FragmentManager supportFragmentManager = oneNadOutboundActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            List<Fragment> fragments = supportFragmentManager.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "fragments");
            ArrayList<Fragment> arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof OneNadOutboundTrueOnlineFragment) {
                    arrayList.add(obj);
                }
            }
            for (Fragment fragment : arrayList) {
                OneNadOutboundTrueOnlineFragment oneNadOutboundTrueOnlineFragment = (OneNadOutboundTrueOnlineFragment) fragment;
                if (oneNadOutboundViewModel.getTabPositionSelected() == 0) {
                    oneNadOutboundTrueOnlineFragment.handleNotFoundView(resourceContentIfNotHandled.getData());
                }
            }
            FragmentManager supportFragmentManager2 = oneNadOutboundActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "supportFragmentManager");
            List<Fragment> fragments2 = supportFragmentManager2.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "fragments");
            ArrayList<Fragment> arrayList2 = new ArrayList();
            for (Object obj2 : fragments2) {
                if (obj2 instanceof OneNadOutboundTrueMoveHFragment) {
                    arrayList2.add(obj2);
                }
            }
            for (Fragment fragment2 : arrayList2) {
                OneNadOutboundTrueMoveHFragment oneNadOutboundTrueMoveHFragment = (OneNadOutboundTrueMoveHFragment) fragment2;
                if (oneNadOutboundViewModel.getTabPositionSelected() == 1) {
                    oneNadOutboundTrueMoveHFragment.handleNotFoundView(resourceContentIfNotHandled.getData());
                }
            }
        }
    }
}