package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleTrueModel;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPropositionResponse;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPropositionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDeviceSaleTrueViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleTrueViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/viewModel/OneDeviceSaleTrueViewModel$getProposition$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1127:1\n1#2:1128\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$getProposition$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$getProposition$2 extends Lambda implements Function1<OneGetPropositionResponse, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$getProposition$2(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetPropositionResponse oneGetPropositionResponse) {
        invoke2(oneGetPropositionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetPropositionResponse oneGetPropositionResponse) {
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository;
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository2;
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository3;
        oneDeviceSaleTrueRepository = this.this$0.f90027b;
        oneDeviceSaleTrueRepository.getDeviceSaleModel().setPropositionList(oneGetPropositionResponse.getData());
        oneDeviceSaleTrueRepository2 = this.this$0.f90027b;
        List<DataItem> propositionList = oneDeviceSaleTrueRepository2.getDeviceSaleModel().getPropositionList();
        if (propositionList != null) {
            if (!(!propositionList.isEmpty())) {
                propositionList = null;
            }
            if (propositionList != null) {
                OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.this$0;
                oneDeviceSaleTrueRepository3 = oneDeviceSaleTrueViewModel.f90027b;
                OneDeviceSaleTrueModel deviceSaleModel = oneDeviceSaleTrueRepository3.getDeviceSaleModel();
                deviceSaleModel.setSkipPropositionFlg(true);
                deviceSaleModel.setPropositionTrueItem(propositionList.get(0));
                oneDeviceSaleTrueViewModel.clearPricePlans();
                oneDeviceSaleTrueViewModel.getPropositionRebate();
            }
        }
    }
}