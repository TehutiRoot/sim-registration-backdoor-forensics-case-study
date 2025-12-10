package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.TransactionItemListModel;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "response", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/TransactionItemListModel;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel$getOneOwnerDetail$4 */
/* loaded from: classes10.dex */
public final class OneOwnerManagementViewModel$getOneOwnerDetail$4 extends Lambda implements Function1<ArrayList<TransactionItemListModel>, Unit> {
    final /* synthetic */ OneOwnerManagementViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOwnerManagementViewModel$getOneOwnerDetail$4(OneOwnerManagementViewModel oneOwnerManagementViewModel) {
        super(1);
        this.this$0 = oneOwnerManagementViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<TransactionItemListModel> arrayList) {
        invoke2(arrayList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ArrayList<TransactionItemListModel> arrayList) {
        MutableLiveData m12771k;
        m12771k = this.this$0.m12771k();
        m12771k.setValue(Resource.Companion.success(arrayList));
    }
}