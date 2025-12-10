package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerDataResponse;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerItemResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerDataResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneOwnerManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOwnerManagementViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/OneOwnerManagementViewModel$getOneOwnerList$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1855#2,2:186\n*S KotlinDebug\n*F\n+ 1 OneOwnerManagementViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/OneOwnerManagementViewModel$getOneOwnerList$3\n*L\n66#1:186,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel$getOneOwnerList$3 */
/* loaded from: classes10.dex */
public final class OneOwnerManagementViewModel$getOneOwnerList$3 extends Lambda implements Function1<OneOwnerDataResponse, Unit> {
    final /* synthetic */ OneOwnerManagementViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOwnerManagementViewModel$getOneOwnerList$3(OneOwnerManagementViewModel oneOwnerManagementViewModel) {
        super(1);
        this.this$0 = oneOwnerManagementViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneOwnerDataResponse oneOwnerDataResponse) {
        invoke2(oneOwnerDataResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneOwnerDataResponse oneOwnerDataResponse) {
        MutableLiveData m12770l;
        List<OneOwnerItemResponse> ownerList;
        ConfigurationRepository configurationRepository;
        OneOwnerDataResponse.Data data = oneOwnerDataResponse.getData();
        if (data != null && (ownerList = data.getOwnerList()) != null) {
            OneOwnerManagementViewModel oneOwnerManagementViewModel = this.this$0;
            for (OneOwnerItemResponse oneOwnerItemResponse : ownerList) {
                String userId = oneOwnerItemResponse.getUserId();
                configurationRepository = oneOwnerManagementViewModel.f93157f;
                oneOwnerItemResponse.setUserId(AESCryptUtil.decryptCBC(userId, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
            }
        }
        m12770l = this.this$0.m12770l();
        m12770l.setValue(Resource.Companion.success(oneOwnerDataResponse));
    }
}