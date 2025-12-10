package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundTrueMoveHFragment;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundTrueOnlineFragment;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006 \u0007*\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneNadOutboundActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundActivity.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity$setupObserve$1$1\n+ 2 OneNadOutboundActivity.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,477:1\n435#2:478\n436#2:490\n437#2:493\n435#2:494\n436#2:506\n437#2:509\n435#2:510\n436#2:522\n437#2:525\n435#2:526\n436#2:538\n437#2:541\n435#2:542\n436#2:554\n437#2:557\n435#2:558\n436#2:570\n437#2:573\n800#3,11:479\n1855#3,2:491\n800#3,11:495\n1855#3,2:507\n800#3,11:511\n1855#3,2:523\n800#3,11:527\n1855#3,2:539\n800#3,11:543\n1855#3,2:555\n800#3,11:559\n1855#3,2:571\n*S KotlinDebug\n*F\n+ 1 OneNadOutboundActivity.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity$setupObserve$1$1\n*L\n225#1:478\n225#1:490\n225#1:493\n229#1:494\n229#1:506\n229#1:509\n236#1:510\n236#1:522\n236#1:525\n243#1:526\n243#1:538\n243#1:541\n253#1:542\n253#1:554\n253#1:557\n259#1:558\n259#1:570\n259#1:573\n225#1:479,11\n225#1:491,2\n229#1:495,11\n229#1:507,2\n236#1:511,11\n236#1:523,2\n243#1:527,11\n243#1:539,2\n253#1:543,11\n253#1:555,2\n259#1:559,11\n259#1:571,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity$setupObserve$1$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundActivity$setupObserve$1$1 extends Lambda implements Function1<Resource<? extends ArrayList<OneNadOutboundBillingItem>>, Unit> {
    final /* synthetic */ OneNadOutboundViewModel $this_apply;
    final /* synthetic */ OneNadOutboundActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity$setupObserve$1$1$WhenMappings */
    /* loaded from: classes10.dex */
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
    public OneNadOutboundActivity$setupObserve$1$1(OneNadOutboundActivity oneNadOutboundActivity, OneNadOutboundViewModel oneNadOutboundViewModel) {
        super(1);
        this.this$0 = oneNadOutboundActivity;
        this.$this_apply = oneNadOutboundViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ArrayList<OneNadOutboundBillingItem>> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends ArrayList<OneNadOutboundBillingItem>> resource) {
        Resource<? extends ArrayList<OneNadOutboundBillingItem>> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneNadOutboundActivity oneNadOutboundActivity = this.this$0;
        OneNadOutboundViewModel oneNadOutboundViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneNadOutboundActivity.showLoading(true);
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
                    oneNadOutboundTrueOnlineFragment.handleSwipeRefresh();
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
                    oneNadOutboundTrueMoveHFragment.handleSwipeRefresh();
                }
            }
        } else if (i == 2) {
            oneNadOutboundActivity.showLoading(false);
            FragmentManager supportFragmentManager3 = oneNadOutboundActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "supportFragmentManager");
            List<Fragment> fragments3 = supportFragmentManager3.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments3, "fragments");
            ArrayList<Fragment> arrayList3 = new ArrayList();
            for (Object obj3 : fragments3) {
                if (obj3 instanceof OneNadOutboundTrueOnlineFragment) {
                    arrayList3.add(obj3);
                }
            }
            for (Fragment fragment3 : arrayList3) {
                OneNadOutboundTrueOnlineFragment oneNadOutboundTrueOnlineFragment2 = (OneNadOutboundTrueOnlineFragment) fragment3;
                if (oneNadOutboundViewModel.getTabPositionSelected() == 0) {
                    ArrayList<OneNadOutboundBillingItem> data = resourceContentIfNotHandled.getData();
                    if (data == null) {
                        data = new ArrayList<>();
                    }
                    oneNadOutboundTrueOnlineFragment2.setupNadOutboundListAdapter(data);
                }
            }
            FragmentManager supportFragmentManager4 = oneNadOutboundActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "supportFragmentManager");
            List<Fragment> fragments4 = supportFragmentManager4.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments4, "fragments");
            ArrayList<Fragment> arrayList4 = new ArrayList();
            for (Object obj4 : fragments4) {
                if (obj4 instanceof OneNadOutboundTrueMoveHFragment) {
                    arrayList4.add(obj4);
                }
            }
            for (Fragment fragment4 : arrayList4) {
                OneNadOutboundTrueMoveHFragment oneNadOutboundTrueMoveHFragment2 = (OneNadOutboundTrueMoveHFragment) fragment4;
                if (oneNadOutboundViewModel.getTabPositionSelected() == 1) {
                    ArrayList<OneNadOutboundBillingItem> data2 = resourceContentIfNotHandled.getData();
                    if (data2 == null) {
                        data2 = new ArrayList<>();
                    }
                    oneNadOutboundTrueMoveHFragment2.setupNadOutboundListAdapter(data2);
                }
            }
        } else if (i != 3) {
            oneNadOutboundActivity.showLoading(false);
        } else {
            oneNadOutboundActivity.showLoading(false);
            FragmentManager supportFragmentManager5 = oneNadOutboundActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "supportFragmentManager");
            List<Fragment> fragments5 = supportFragmentManager5.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments5, "fragments");
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : fragments5) {
                if (obj5 instanceof OneNadOutboundTrueOnlineFragment) {
                    arrayList5.add(obj5);
                }
            }
            Iterator it = arrayList5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OneNadOutboundTrueOnlineFragment oneNadOutboundTrueOnlineFragment3 = (OneNadOutboundTrueOnlineFragment) ((Fragment) it.next());
                if (oneNadOutboundViewModel.getTabPositionSelected() == 0) {
                    String message = resource.getMessage();
                    oneNadOutboundTrueOnlineFragment3.handleErrorView(message != null ? message : "");
                }
            }
            FragmentManager supportFragmentManager6 = oneNadOutboundActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager6, "supportFragmentManager");
            List<Fragment> fragments6 = supportFragmentManager6.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments6, "fragments");
            ArrayList<Fragment> arrayList6 = new ArrayList();
            for (Object obj6 : fragments6) {
                if (obj6 instanceof OneNadOutboundTrueMoveHFragment) {
                    arrayList6.add(obj6);
                }
            }
            for (Fragment fragment5 : arrayList6) {
                OneNadOutboundTrueMoveHFragment oneNadOutboundTrueMoveHFragment3 = (OneNadOutboundTrueMoveHFragment) fragment5;
                if (oneNadOutboundViewModel.getTabPositionSelected() == 1) {
                    String message2 = resource.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    oneNadOutboundTrueMoveHFragment3.handleErrorView(message2);
                }
            }
        }
    }
}