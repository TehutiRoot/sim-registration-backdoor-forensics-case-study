package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateCommissionInformationResponse;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateContactPersonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateResponse;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateStatusResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneRetailerProfileUpdateViewModel$getOneRetailerProfile$2 */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateViewModel$getOneRetailerProfile$2 extends Lambda implements Function1<OneRetailerProfileUpdateResponse, OneRetailerProfileUpdateResponse> {
    final /* synthetic */ int $requestId;
    final /* synthetic */ OneRetailerProfileUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileUpdateViewModel$getOneRetailerProfile$2(int i, OneRetailerProfileUpdateViewModel oneRetailerProfileUpdateViewModel) {
        super(1);
        this.$requestId = i;
        this.this$0 = oneRetailerProfileUpdateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneRetailerProfileUpdateResponse invoke(@NotNull OneRetailerProfileUpdateResponse it) {
        OneRetailerProfileUpdateStatusResponse oneRetailerProfileUpdateStatusResponse;
        String m10068j;
        String m10068j2;
        String m10068j3;
        String m10068j4;
        String m10068j5;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = this.$requestId;
        if (i == 0) {
            oneRetailerProfileUpdateStatusResponse = OneRetailerProfileUpdateStatusResponse.UPDATE_RTR_CONTACT;
        } else if (i != 1) {
            oneRetailerProfileUpdateStatusResponse = OneRetailerProfileUpdateStatusResponse.VIEWER;
        } else {
            oneRetailerProfileUpdateStatusResponse = OneRetailerProfileUpdateStatusResponse.UPDATE_ADDRESS;
        }
        OneRetailerProfileUpdateStatusResponse oneRetailerProfileUpdateStatusResponse2 = oneRetailerProfileUpdateStatusResponse;
        OneRetailerProfileUpdateContactPersonResponse rtrContactPerson = it.getRtrContactPerson();
        OneRetailerProfileUpdateViewModel oneRetailerProfileUpdateViewModel = this.this$0;
        if (rtrContactPerson != null) {
            String firstName = rtrContactPerson.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            m10068j5 = oneRetailerProfileUpdateViewModel.m10068j(firstName);
            rtrContactPerson.setFirstName(m10068j5);
        }
        if (rtrContactPerson != null) {
            String lastName = rtrContactPerson.getLastName();
            if (lastName == null) {
                lastName = "";
            }
            m10068j4 = oneRetailerProfileUpdateViewModel.m10068j(lastName);
            rtrContactPerson.setLastName(m10068j4);
        }
        if (rtrContactPerson != null) {
            String phoneNumber = rtrContactPerson.getPhoneNumber();
            if (phoneNumber == null) {
                phoneNumber = "";
            }
            m10068j3 = oneRetailerProfileUpdateViewModel.m10068j(phoneNumber);
            rtrContactPerson.setPhoneNumber(m10068j3);
        }
        if (rtrContactPerson != null) {
            String idCard = rtrContactPerson.getIdCard();
            if (idCard == null) {
                idCard = "";
            }
            m10068j2 = oneRetailerProfileUpdateViewModel.m10068j(idCard);
            rtrContactPerson.setIdCard(m10068j2);
        }
        OneRetailerProfileUpdateCommissionInformationResponse commissionInformation = it.getCommissionInformation();
        if (commissionInformation != null) {
            OneRetailerProfileUpdateViewModel oneRetailerProfileUpdateViewModel2 = this.this$0;
            String phoneNumber2 = commissionInformation.getPhoneNumber();
            m10068j = oneRetailerProfileUpdateViewModel2.m10068j(phoneNumber2 != null ? phoneNumber2 : "");
            commissionInformation.setPhoneNumber(m10068j);
        } else {
            commissionInformation = null;
        }
        return new OneRetailerProfileUpdateResponse(rtrContactPerson, it.getRtrInformation(), commissionInformation, it.getAreaManager(), oneRetailerProfileUpdateStatusResponse2);
    }
}