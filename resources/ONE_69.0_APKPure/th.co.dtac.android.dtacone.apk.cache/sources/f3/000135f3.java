package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.fragment;

import android.content.Intent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.activity.OneOwnerManagementActivity;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.TransactionItemListModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerItemResponse;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006 \u0007*\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/TransactionItemListModel;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementListFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneOwnerManagementListFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends ArrayList<TransactionItemListModel>>, Unit> {
    final /* synthetic */ OneOwnerManagementListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementListFragment$setupObserve$2$WhenMappings */
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
                iArr[StatusResource.LOADING.ordinal()] = 2;
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
    public OneOwnerManagementListFragment$setupObserve$2(OneOwnerManagementListFragment oneOwnerManagementListFragment) {
        super(1);
        this.this$0 = oneOwnerManagementListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ArrayList<TransactionItemListModel>> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends ArrayList<TransactionItemListModel>> resource) {
        OneOwnerItemResponse oneOwnerItemResponse;
        Resource<? extends ArrayList<TransactionItemListModel>> resourceContentIfNotHandled = resource.getResourceContentIfNotHandled();
        if (resourceContentIfNotHandled != null) {
            OneOwnerManagementListFragment oneOwnerManagementListFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    oneOwnerManagementListFragment.showLoading();
                    return;
                } else if (i != 3) {
                    return;
                } else {
                    oneOwnerManagementListFragment.dismissLoading();
                    return;
                }
            }
            oneOwnerManagementListFragment.dismissLoading();
            ArrayList<TransactionItemListModel> data = resourceContentIfNotHandled.getData();
            if (data != null) {
                Intent intent = new Intent(oneOwnerManagementListFragment.getActivity(), OneOwnerManagementActivity.class);
                oneOwnerItemResponse = oneOwnerManagementListFragment.f93088n;
                intent.putExtra(OneOwnerManagementListFragment.OWNER_DETAIL_EXTRA, oneOwnerItemResponse);
                intent.putExtra(OneOwnerManagementListFragment.OWNER_TRANSACTION_EXTRA, data);
                oneOwnerManagementListFragment.startActivityForResult(intent, 101);
            }
        }
    }
}