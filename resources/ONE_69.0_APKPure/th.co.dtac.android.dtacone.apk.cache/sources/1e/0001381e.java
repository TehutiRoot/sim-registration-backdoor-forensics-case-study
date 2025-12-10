package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterInfoItem;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidMaterialCodeAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterData;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidMaterialCodeFragment$setObserve$1$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidMaterialCodeFragment$setObserve$1$1 extends Lambda implements Function1<Resource<? extends ProductMasterData>, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel $this_apply;
    final /* synthetic */ OnePostpaidMaterialCodeFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidMaterialCodeFragment$setObserve$1$1$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidMaterialCodeFragment$setObserve$1$1(OnePostpaidMaterialCodeFragment onePostpaidMaterialCodeFragment, OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidMaterialCodeFragment;
        this.$this_apply = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ProductMasterData> resource) {
        invoke2((Resource<ProductMasterData>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ProductMasterData> resource) {
        Resource<ProductMasterData> resourceContentIfNotHandled;
        List<ProductMasterInfoItem> productInfo;
        OneFontTextView oneFontTextView;
        RecyclerView recyclerView;
        OnePostpaidMaterialCodeAdapter m11981q;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePostpaidMaterialCodeFragment onePostpaidMaterialCodeFragment = this.this$0;
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                onePostpaidMaterialCodeFragment.m11986B();
                return;
            }
            ProductMasterData data = resourceContentIfNotHandled.getData();
            RecyclerView recyclerView2 = null;
            String warningMessage = data != null ? data.getWarningMessage() : null;
            ProductMasterData data2 = resourceContentIfNotHandled.getData();
            if (data2 == null || (productInfo = data2.getProductInfo()) == null || !(!productInfo.isEmpty())) {
                onePostpaidMaterialCodeFragment.m11986B();
                return;
            }
            oneFontTextView = onePostpaidMaterialCodeFragment.f94282q;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                oneFontTextView = null;
            }
            oneFontTextView.setVisibility(8);
            recyclerView = onePostpaidMaterialCodeFragment.f94287v;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("materialCodeListView");
            } else {
                recyclerView2 = recyclerView;
            }
            recyclerView2.setVisibility(0);
            m11981q = onePostpaidMaterialCodeFragment.m11981q();
            List<ProductMasterInfoItem> productInfo2 = resourceContentIfNotHandled.getData().getProductInfo();
            String value = onePostpaidRegistrationViewModel.getSearchQueryProductMaster().getValue();
            if (value == null) {
                value = "";
            }
            Intrinsics.checkNotNullExpressionValue(value, "searchQueryProductMaster.value ?: \"\"");
            m11981q.update(productInfo2, value, warningMessage);
        }
    }
}