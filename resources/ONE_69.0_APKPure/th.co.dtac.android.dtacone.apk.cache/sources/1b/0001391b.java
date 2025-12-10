package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCustomerPreverifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ReserveMsisdnItem;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$customerPreverify$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$customerPreverify$3 extends Lambda implements Function1<OneCustomerPreverifyResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$customerPreverify$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, boolean z, IdCardInformationCollection idCardInformationCollection, String str, String str2) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$isFromSmartCard = z;
        this.$cardInformation = idCardInformationCollection;
        this.$identityType = str;
        this.$idCardNumber = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCustomerPreverifyResponse oneCustomerPreverifyResponse) {
        invoke2(oneCustomerPreverifyResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCustomerPreverifyResponse oneCustomerPreverifyResponse) {
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        OnePostpaidRepository onePostpaidRepository3;
        String m11521z0;
        OnePostpaidRepository onePostpaidRepository4;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        ReserveMsisdnItem reserveMsisdn;
        OnePostpaidRepository onePostpaidRepository5;
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.clearMsisdn();
        this.this$0.setSmartCard(this.$isFromSmartCard);
        if (this.$cardInformation != null) {
            onePostpaidRepository5 = this.this$0.f94609b;
            onePostpaidRepository5.setCardInformation(this.$cardInformation);
        }
        onePostpaidRepository2 = this.this$0.f94609b;
        onePostpaidRepository2.setCard(new CardCollection(this.$identityType, this.$idCardNumber, "", ""));
        onePostpaidRepository3 = this.this$0.f94609b;
        m11521z0 = this.this$0.m11521z0(this.$idCardNumber);
        onePostpaidRepository3.setIdNumber(m11521z0);
        onePostpaidRepository4 = this.this$0.f94609b;
        onePostpaidRepository4.getModel().setCustomerPreverifyResponse(oneCustomerPreverifyResponse.getData());
        OneCustomerPreverifyResponse.Data data = oneCustomerPreverifyResponse.getData();
        List<String> msisdnList = (data == null || (reserveMsisdn = data.getReserveMsisdn()) == null) ? null : reserveMsisdn.getMsisdnList();
        if (msisdnList != null && !msisdnList.isEmpty()) {
            mutableLiveData2 = this.this$0.f94587N0;
            mutableLiveData2.setValue(Boolean.FALSE);
            this.this$0.m11730C2();
            return;
        }
        OnePostpaidRegistrationViewModel.preverify$default(this.this$0, null, 1, null);
        mutableLiveData = this.this$0.f94587N0;
        mutableLiveData.setValue(Boolean.TRUE);
    }
}