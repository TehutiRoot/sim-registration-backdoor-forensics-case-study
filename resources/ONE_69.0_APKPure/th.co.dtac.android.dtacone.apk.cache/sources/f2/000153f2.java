package th.p047co.dtac.android.dtacone.viewmodel.change_pack;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageGroupModel;
import th.p047co.dtac.android.dtacone.repository.change_pack.ChangePackRepository;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.CheckBlockingPackageTypeResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/CheckBlockingPackageTypeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_pack.ChangePackViewModel$callApiCheckBlocking$4 */
/* loaded from: classes9.dex */
public final class ChangePackViewModel$callApiCheckBlocking$4 extends Lambda implements Function1<CheckBlockingPackageTypeResponse, Unit> {
    final /* synthetic */ MutableLiveData<Resource<Object>> $response;
    final /* synthetic */ ChangePackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackViewModel$callApiCheckBlocking$4(ChangePackViewModel changePackViewModel, MutableLiveData<Resource<Object>> mutableLiveData) {
        super(1);
        this.this$0 = changePackViewModel;
        this.$response = mutableLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckBlockingPackageTypeResponse checkBlockingPackageTypeResponse) {
        invoke2(checkBlockingPackageTypeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CheckBlockingPackageTypeResponse checkBlockingPackageTypeResponse) {
        MutableLiveData mutableLiveData;
        ChangePackRepository changePackRepository;
        PackageGroupModel tmpSelectPackage = this.this$0.getTmpSelectPackage();
        if (tmpSelectPackage != null) {
            changePackRepository = this.this$0.f105149b;
            changePackRepository.setAmount(tmpSelectPackage.getAmount());
        }
        mutableLiveData = this.this$0.f105167t;
        Resource.Companion companion = Resource.Companion;
        mutableLiveData.postValue(companion.success(""));
        this.$response.postValue(companion.success(checkBlockingPackageTypeResponse));
    }
}