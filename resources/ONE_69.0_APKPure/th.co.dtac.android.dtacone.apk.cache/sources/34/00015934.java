package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.validate_existing_customer.MrtrPostpaidValidateCustomerResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/validate_existing_customer/MrtrPostpaidValidateCustomerResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrPostpaidValidationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPostpaidValidationViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_postpaid_registration/MrtrPostpaidValidationViewModel$validateExistingCustomer$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidationViewModel$validateExistingCustomer$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidationViewModel$validateExistingCustomer$3 extends Lambda implements Function1<MrtrPostpaidValidateCustomerResponse, Unit> {
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ MrtrPostpaidValidationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidValidationViewModel$validateExistingCustomer$3(MrtrPostpaidValidationViewModel mrtrPostpaidValidationViewModel, String str) {
        super(1);
        this.this$0 = mrtrPostpaidValidationViewModel;
        this.$idCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidValidateCustomerResponse mrtrPostpaidValidateCustomerResponse) {
        invoke2(mrtrPostpaidValidateCustomerResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPostpaidValidateCustomerResponse mrtrPostpaidValidateCustomerResponse) {
        MrtrPostpaidRepository mrtrPostpaidRepository;
        MrtrPostpaidRepository mrtrPostpaidRepository2;
        MrtrPostpaidRepository mrtrPostpaidRepository3;
        String m2224f;
        MrtrPostpaidRepository mrtrPostpaidRepository4;
        MrtrPostpaidRepository mrtrPostpaidRepository5;
        MrtrPostpaidRepository mrtrPostpaidRepository6;
        MrtrPostpaidRepository mrtrPostpaidRepository7;
        mrtrPostpaidRepository = this.this$0.f106550b;
        mrtrPostpaidRepository2 = this.this$0.f106550b;
        mrtrPostpaidRepository.setCard(new CardCollection(mrtrPostpaidRepository2.getIdDocType(), this.$idCardNumber, "", ""));
        mrtrPostpaidRepository3 = this.this$0.f106550b;
        m2224f = this.this$0.m2224f(this.$idCardNumber);
        mrtrPostpaidRepository3.setIdNumber(m2224f);
        String newIdFlag = mrtrPostpaidValidateCustomerResponse.getNewIdFlag();
        if (newIdFlag != null) {
            mrtrPostpaidRepository7 = this.this$0.f106550b;
            mrtrPostpaidRepository7.setNewIdFlag(newIdFlag);
        }
        mrtrPostpaidRepository4 = this.this$0.f106550b;
        mrtrPostpaidRepository4.setSpecialPackageForNewIDResponse(null);
        mrtrPostpaidRepository5 = this.this$0.f106550b;
        mrtrPostpaidRepository5.setCheck3LevelResponse(null);
        mrtrPostpaidRepository6 = this.this$0.f106550b;
        mrtrPostpaidRepository6.setPermitCheckProfileResponse(null);
        if (Intrinsics.areEqual(mrtrPostpaidValidateCustomerResponse.getNewIdFlag(), "Y")) {
            this.this$0.m2219k();
        } else {
            this.this$0.m2221i();
        }
    }
}