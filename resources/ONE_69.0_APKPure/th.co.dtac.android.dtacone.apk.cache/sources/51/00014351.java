package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInfoAddress;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$InputInfoScreen$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1296:1\n1559#2:1297\n1590#2,4:1298\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$InputInfoScreen$5\n*L\n192#1:1297\n192#1:1298,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$5 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$5 extends Lambda implements Function1<District, Unit> {
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;
    final /* synthetic */ MutableState<AddressSelectType> $targetSheet$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$InputInfoScreen$5(Function1<? super CustomerInformation, Unit> function1, CustomerInformation customerInformation, MutableState<AddressSelectType> mutableState) {
        super(1);
        this.$onCustomerInfoChange = function1;
        this.$customerInfo = customerInformation;
        this.$targetSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(District district) {
        invoke2(district);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull District it) {
        CustomerInformation copy;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<CustomerInformation, Unit> function1 = this.$onCustomerInfoChange;
        CustomerInformation customerInformation = this.$customerInfo;
        List<CustomerInfoAddress> addressList = customerInformation.getAddressList();
        CustomerInformation customerInformation2 = this.$customerInfo;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(addressList, 10));
        int i = 0;
        for (Object obj : addressList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CustomerInfoAddress customerInfoAddress = (CustomerInfoAddress) obj;
            if (i == customerInformation2.getAddressType().ordinal()) {
                customerInfoAddress = CustomerInfoAddress.copy$default(customerInfoAddress, null, null, "", it.getName(), null, "", 19, null);
            }
            arrayList.add(customerInfoAddress);
            i = i2;
        }
        copy = customerInformation.copy((r24 & 1) != 0 ? customerInformation.f97990a : null, (r24 & 2) != 0 ? customerInformation.f97991b : null, (r24 & 4) != 0 ? customerInformation.f97992c : null, (r24 & 8) != 0 ? customerInformation.f97993d : null, (r24 & 16) != 0 ? customerInformation.f97994e : null, (r24 & 32) != 0 ? customerInformation.f97995f : arrayList, (r24 & 64) != 0 ? customerInformation.f97996g : null, (r24 & 128) != 0 ? customerInformation.f97997h : null, (r24 & 256) != 0 ? customerInformation.f97998i : null, (r24 & 512) != 0 ? customerInformation.f97999j : null, (r24 & 1024) != 0 ? customerInformation.f98000k : null);
        function1.invoke(copy);
        InputInfoScreenKt.m9503r(this.$targetSheet$delegate, AddressSelectType.SUB_DISTRICT);
    }
}