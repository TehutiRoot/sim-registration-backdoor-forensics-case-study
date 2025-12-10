package th.p047co.dtac.android.dtacone.viewmodel.change_pack;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.MainPackageGroupList;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/MainPackageGroupList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_pack.ChangePackViewModel$callApiSearchMainPackageGroup$3 */
/* loaded from: classes9.dex */
public final class ChangePackViewModel$callApiSearchMainPackageGroup$3 extends Lambda implements Function1<MainPackageGroupList, Unit> {
    final /* synthetic */ ChangePackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackViewModel$callApiSearchMainPackageGroup$3(ChangePackViewModel changePackViewModel) {
        super(1);
        this.this$0 = changePackViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MainPackageGroupList mainPackageGroupList) {
        invoke2(mainPackageGroupList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MainPackageGroupList mainPackageGroupList) {
        MutableLiveData m3330V;
        MutableLiveData mutableLiveData;
        m3330V = this.this$0.m3330V();
        m3330V.postValue(mainPackageGroupList);
        mutableLiveData = this.this$0.f105161n;
        mutableLiveData.setValue(Resource.Companion.success(null));
    }
}