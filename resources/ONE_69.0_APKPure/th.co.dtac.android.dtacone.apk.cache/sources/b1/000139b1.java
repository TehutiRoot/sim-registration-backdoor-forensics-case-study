package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.validate_existing_customer.MrtrPostpaidValidateCustomerResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/validate_existing_customer/MrtrPostpaidValidateCustomerResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidValidationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidValidationViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidValidationViewModel$validateExistingCustomer$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidationViewModel$validateExistingCustomer$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidValidationViewModel$validateExistingCustomer$3 extends Lambda implements Function1<MrtrPostpaidValidateCustomerResponse, Unit> {
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ OnePostpaidValidationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidValidationViewModel$validateExistingCustomer$3(OnePostpaidValidationViewModel onePostpaidValidationViewModel, String str) {
        super(1);
        this.this$0 = onePostpaidValidationViewModel;
        this.$idCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidValidateCustomerResponse mrtrPostpaidValidateCustomerResponse) {
        invoke2(mrtrPostpaidValidateCustomerResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPostpaidValidateCustomerResponse mrtrPostpaidValidateCustomerResponse) {
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        OnePostpaidRepository onePostpaidRepository3;
        String m11505f;
        OnePostpaidRepository onePostpaidRepository4;
        OnePostpaidRepository onePostpaidRepository5;
        OnePostpaidRepository onePostpaidRepository6;
        OnePostpaidRepository onePostpaidRepository7;
        onePostpaidRepository = this.this$0.f94722b;
        onePostpaidRepository2 = this.this$0.f94722b;
        onePostpaidRepository.setCard(new CardCollection(onePostpaidRepository2.getIdDocType(), this.$idCardNumber, "", ""));
        onePostpaidRepository3 = this.this$0.f94722b;
        m11505f = this.this$0.m11505f(this.$idCardNumber);
        onePostpaidRepository3.setIdNumber(m11505f);
        String newIdFlag = mrtrPostpaidValidateCustomerResponse.getNewIdFlag();
        if (newIdFlag != null) {
            onePostpaidRepository7 = this.this$0.f94722b;
            onePostpaidRepository7.setNewIdFlag(newIdFlag);
        }
        onePostpaidRepository4 = this.this$0.f94722b;
        onePostpaidRepository4.setSpecialPackageForNewIDResponse(null);
        onePostpaidRepository5 = this.this$0.f94722b;
        onePostpaidRepository5.setCheck3LevelResponse(null);
        onePostpaidRepository6 = this.this$0.f94722b;
        onePostpaidRepository6.setPermitCheckProfileResponse(null);
        if (Intrinsics.areEqual(mrtrPostpaidValidateCustomerResponse.getNewIdFlag(), "Y")) {
            this.this$0.m11500k();
        } else {
            this.this$0.m11502i();
        }
    }
}