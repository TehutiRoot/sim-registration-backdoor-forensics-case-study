package th.p047co.dtac.android.dtacone.view.fragment.eSIM.select_sku;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.adapter.ViewPagerCardAdapter;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.esim.JsonMemberPackageItem;
import th.p047co.dtac.android.dtacone.model.esim.PackageGroup;
import th.p047co.dtac.android.dtacone.model.esim.PackageSubGroupItem;
import th.p047co.dtac.android.dtacone.model.esim.SIMSKUResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.packages.TabPackage;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.select_sku.ESimPackageListFragment;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/esim/SIMSKUResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nESimSelectSKUFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ESimSelectSKUFragment.kt\nth/co/dtac/android/dtacone/view/fragment/eSIM/select_sku/ESimSelectSKUFragment$initObserve$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1855#2,2:179\n*S KotlinDebug\n*F\n+ 1 ESimSelectSKUFragment.kt\nth/co/dtac/android/dtacone/view/fragment/eSIM/select_sku/ESimSelectSKUFragment$initObserve$1$1\n*L\n79#1:179,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.select_sku.ESimSelectSKUFragment$initObserve$1$1 */
/* loaded from: classes9.dex */
public final class ESimSelectSKUFragment$initObserve$1$1 extends Lambda implements Function1<Resource<? extends SIMSKUResponse>, Unit> {
    final /* synthetic */ ESimSelectSKUFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.select_sku.ESimSelectSKUFragment$initObserve$1$1$WhenMappings */
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
    public ESimSelectSKUFragment$initObserve$1$1(ESimSelectSKUFragment eSimSelectSKUFragment) {
        super(1);
        this.this$0 = eSimSelectSKUFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends SIMSKUResponse> resource) {
        invoke2((Resource<SIMSKUResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<SIMSKUResponse> resource) {
        DtacSwipeRefresh dtacSwipeRefresh;
        ViewPagerCardAdapter viewPagerCardAdapter;
        DtacSwipeRefresh dtacSwipeRefresh2;
        ViewPagerCardAdapter viewPagerCardAdapter2;
        PackageGroup packageGroup;
        DtacSwipeRefresh dtacSwipeRefresh3;
        if (resource != null) {
            ESimSelectSKUFragment eSimSelectSKUFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            DtacSwipeRefresh dtacSwipeRefresh4 = null;
            if (i == 1) {
                dtacSwipeRefresh = eSimSelectSKUFragment.f101372j;
                if (dtacSwipeRefresh == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
                } else {
                    dtacSwipeRefresh4 = dtacSwipeRefresh;
                }
                dtacSwipeRefresh4.setRefreshing(true);
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                dtacSwipeRefresh3 = eSimSelectSKUFragment.f101372j;
                if (dtacSwipeRefresh3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
                } else {
                    dtacSwipeRefresh4 = dtacSwipeRefresh3;
                }
                dtacSwipeRefresh4.setRefreshing(false);
                eSimSelectSKUFragment.m6908n(String.valueOf(resource.getMessage()));
            } else {
                SIMSKUResponse data = resource.getData();
                List<PackageSubGroupItem> packageSubGroup = (data == null || (packageGroup = data.getPackageGroup()) == null) ? null : packageGroup.getPackageSubGroup();
                viewPagerCardAdapter = eSimSelectSKUFragment.f101371i;
                if (viewPagerCardAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cardAdapter");
                    viewPagerCardAdapter = null;
                }
                viewPagerCardAdapter.removeFragment();
                if (packageSubGroup != null) {
                    for (PackageSubGroupItem packageSubGroupItem : packageSubGroup) {
                        viewPagerCardAdapter2 = eSimSelectSKUFragment.f101371i;
                        if (viewPagerCardAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cardAdapter");
                            viewPagerCardAdapter2 = null;
                        }
                        ESimPackageListFragment.Companion companion = ESimPackageListFragment.Companion;
                        String packageSubGroupName = packageSubGroupItem.getPackageSubGroupName();
                        if (packageSubGroupName == null) {
                            packageSubGroupName = "";
                        }
                        List<JsonMemberPackageItem> jsonMemberPackage = packageSubGroupItem.getJsonMemberPackage();
                        if (jsonMemberPackage == null) {
                            jsonMemberPackage = CollectionsKt__CollectionsKt.emptyList();
                        }
                        viewPagerCardAdapter2.addFragmentCard(companion.newInstance(new TabPackage(packageSubGroupName, jsonMemberPackage)), packageSubGroupItem.getPackageSubGroupName());
                    }
                }
                eSimSelectSKUFragment.m6902t();
                dtacSwipeRefresh2 = eSimSelectSKUFragment.f101372j;
                if (dtacSwipeRefresh2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
                } else {
                    dtacSwipeRefresh4 = dtacSwipeRefresh2;
                }
                dtacSwipeRefresh4.setRefreshing(false);
            }
        }
    }
}