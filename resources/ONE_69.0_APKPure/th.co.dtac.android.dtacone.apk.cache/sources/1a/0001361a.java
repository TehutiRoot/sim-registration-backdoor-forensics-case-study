package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.TransactionItemListModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerTransactionResponse;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/TransactionItemListModel;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel$getOneOwnerDetail$2 */
/* loaded from: classes10.dex */
public final class OneOwnerManagementViewModel$getOneOwnerDetail$2 extends Lambda implements Function1<OneOwnerTransactionResponse, ArrayList<TransactionItemListModel>> {
    final /* synthetic */ OneOwnerManagementViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOwnerManagementViewModel$getOneOwnerDetail$2(OneOwnerManagementViewModel oneOwnerManagementViewModel) {
        super(1);
        this.this$0 = oneOwnerManagementViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<TransactionItemListModel> invoke(@NotNull OneOwnerTransactionResponse it) {
        ArrayList<TransactionItemListModel> m12769m;
        Intrinsics.checkNotNullParameter(it, "it");
        m12769m = this.this$0.m12769m(it.getData());
        return m12769m;
    }
}