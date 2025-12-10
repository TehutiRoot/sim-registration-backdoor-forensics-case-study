package th.p047co.dtac.android.dtacone.app_one.viewmodel.registration;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.model.registration.Data;
import th.p047co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerResponse;
import th.p047co.dtac.android.dtacone.app_one.model.registration.RetailerProfileItem;
import th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRegistrationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegistrationViewModel.kt\nth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel$getListSIMRetailer$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1855#2:423\n1855#2,2:424\n1856#2:426\n1747#2,3:427\n288#2,2:430\n1855#2,2:432\n288#2,2:434\n*S KotlinDebug\n*F\n+ 1 OneRegistrationViewModel.kt\nth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel$getListSIMRetailer$2\n*L\n208#1:423\n210#1:424,2\n208#1:426\n226#1:427,3\n229#1:430,2\n242#1:432,2\n252#1:434,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel$getListSIMRetailer$2 */
/* loaded from: classes7.dex */
public final class OneRegistrationViewModel$getListSIMRetailer$2 extends Lambda implements Function1<ListSIMRetailerResponse, Unit> {
    final /* synthetic */ OneRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationViewModel$getListSIMRetailer$2(OneRegistrationViewModel oneRegistrationViewModel) {
        super(1);
        this.this$0 = oneRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ListSIMRetailerResponse listSIMRetailerResponse) {
        invoke2(listSIMRetailerResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ListSIMRetailerResponse listSIMRetailerResponse) {
        MutableLiveData m20228E;
        Object obj;
        RegistrationType registrationType;
        RegistrationType registrationType2;
        OneRegistrationRepository oneRegistrationRepository;
        ArrayList<SimData> arrayList = new ArrayList<>();
        Data data = listSIMRetailerResponse.getData();
        Object obj2 = null;
        List<RetailerProfileItem> retailerProfile = data != null ? data.getRetailerProfile() : null;
        List<RetailerProfileItem> list = retailerProfile;
        if (list != null && !list.isEmpty()) {
            OneRegistrationViewModel oneRegistrationViewModel = this.this$0;
            for (RetailerProfileItem retailerProfileItem : retailerProfile) {
                List<String> simRList = retailerProfileItem.getSimRList();
                if (simRList != null) {
                    for (String str : simRList) {
                        String rtrCode = retailerProfileItem.getRtrCode();
                        oneRegistrationRepository = oneRegistrationViewModel.f82710b;
                        arrayList.add(new SimData(rtrCode, oneRegistrationRepository.decryptCBC(str), retailerProfileItem.getCompany()));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean z = arrayList.size() == 1;
                OneRegistrationViewModel oneRegistrationViewModel2 = this.this$0;
                if (!arrayList.isEmpty()) {
                    for (SimData simData : arrayList) {
                        String international = PhoneNumberExtKt.toInternational(simData.getSimR());
                        OneInputInfoData inputData = oneRegistrationViewModel2.getInputData();
                        if (Intrinsics.areEqual(international, PhoneNumberExtKt.toInternational(inputData != null ? inputData.getPhoneNumber() : null))) {
                            break;
                        }
                    }
                }
                r3 = false;
                OneRegistrationViewModel oneRegistrationViewModel3 = this.this$0;
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String international2 = PhoneNumberExtKt.toInternational(((SimData) next).getSimR());
                    OneInputInfoData inputData2 = oneRegistrationViewModel3.getInputData();
                    if (Intrinsics.areEqual(international2, PhoneNumberExtKt.toInternational(inputData2 != null ? inputData2.getPhoneNumber() : null))) {
                        obj2 = next;
                        break;
                    }
                }
                this.this$0.setItemSelected((SimData) obj2);
                OneRegistrationViewModel oneRegistrationViewModel4 = this.this$0;
                if (r3) {
                    registrationType2 = RegistrationType.Phone;
                } else if (z) {
                    registrationType2 = RegistrationType.PhoneOnlyOne;
                } else {
                    registrationType2 = RegistrationType.PhoneMultiple;
                }
                oneRegistrationViewModel4.setRegistrationType(registrationType2);
            } else {
                r3 = retailerProfile.size() == 1;
                for (RetailerProfileItem retailerProfileItem2 : retailerProfile) {
                    arrayList.add(new SimData(retailerProfileItem2.getRtrCode(), null, retailerProfileItem2.getCompany()));
                }
                OneRegistrationViewModel oneRegistrationViewModel5 = this.this$0;
                Iterator<T> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String rtrCode2 = ((SimData) obj).getRtrCode();
                    OneInputInfoData inputData3 = oneRegistrationViewModel5.getInputData();
                    if (Intrinsics.areEqual(rtrCode2, inputData3 != null ? inputData3.getRtrCode() : null)) {
                        break;
                    }
                }
                SimData simData2 = (SimData) obj;
                if (simData2 != null) {
                    new SimData(simData2.getRtrCode(), null, simData2.getCompany());
                }
                oneRegistrationViewModel5.setItemSelected(simData2);
                OneRegistrationViewModel oneRegistrationViewModel6 = this.this$0;
                if (r3) {
                    registrationType = RegistrationType.RtrCodeOnlyOne;
                } else {
                    registrationType = RegistrationType.RtrCodeMultiple;
                }
                oneRegistrationViewModel6.setRegistrationType(registrationType);
            }
        } else {
            this.this$0.setRegistrationType(RegistrationType.Normal);
        }
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.getGetRtrCodeAndSimRList().setValue(arrayList);
        m20228E = this.this$0.m20228E();
        m20228E.setValue(Resource.Companion.success(arrayList));
    }
}