package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationBusinessTypeItemResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationBusinessTypeResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationBusinessTypeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneOnlineRegisterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOnlineRegisterViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/onlineRegister/viewModel/OneOnlineRegisterViewModel$getBusinessType$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1292:1\n766#2:1293\n857#2,2:1294\n*S KotlinDebug\n*F\n+ 1 OneOnlineRegisterViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/onlineRegister/viewModel/OneOnlineRegisterViewModel$getBusinessType$3\n*L\n472#1:1293\n472#1:1294,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$getBusinessType$3 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$getBusinessType$3 extends Lambda implements Function1<OneOnlineRegistrationBusinessTypeResponse, Unit> {
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$getBusinessType$3(OneOnlineRegisterViewModel oneOnlineRegisterViewModel) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse) {
        invoke2(oneOnlineRegistrationBusinessTypeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneOnlineRegistrationBusinessTypeResponse oneOnlineRegistrationBusinessTypeResponse) {
        ArrayList arrayList;
        MutableLiveData m12884S;
        OneOnlineRegisterViewModel oneOnlineRegisterViewModel = this.this$0;
        List<OneOnlineRegistrationBusinessTypeItemResponse> businessType = oneOnlineRegistrationBusinessTypeResponse.getBusinessType();
        if (businessType != null) {
            arrayList = new ArrayList();
            for (Object obj : businessType) {
                if (Intrinsics.areEqual(((OneOnlineRegistrationBusinessTypeItemResponse) obj).getSimFlag(), "Y")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        oneOnlineRegisterViewModel.setBusinessTypeResponse(new OneOnlineRegistrationBusinessTypeResponse(arrayList));
        m12884S = this.this$0.m12884S();
        m12884S.setValue(Resource.Companion.success(oneOnlineRegistrationBusinessTypeResponse));
    }
}