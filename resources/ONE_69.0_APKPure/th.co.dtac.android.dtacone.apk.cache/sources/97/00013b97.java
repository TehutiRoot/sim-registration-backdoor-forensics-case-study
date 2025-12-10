package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheck1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostModel;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheck1IDXDeviceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$check1IDXDevice$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$check1IDXDevice$2 extends Lambda implements Function1<OneCheck1IDXDeviceResponse, Unit> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$check1IDXDevice$2(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCheck1IDXDeviceResponse oneCheck1IDXDeviceResponse) {
        invoke2(oneCheck1IDXDeviceResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCheck1IDXDeviceResponse oneCheck1IDXDeviceResponse) {
        MutableLiveData m10777x1;
        MutableLiveData m10803p1;
        OnePre2PostModel oneModel = this.this$0.getOneModel();
        Check1IDXDeviceResponse data = oneCheck1IDXDeviceResponse.getData();
        oneModel.setCanBuyDeviceWithContract(data != null ? data.getCanBuyDeviceWithContract() : null);
        Check1IDXDeviceResponse data2 = oneCheck1IDXDeviceResponse.getData();
        if (Intrinsics.areEqual(data2 != null ? data2.getCanBuyDeviceWithContract() : null, "N")) {
            m10803p1 = this.this$0.m10803p1();
            m10803p1.setValue(Resource.Companion.success(oneCheck1IDXDeviceResponse));
            return;
        }
        m10777x1 = this.this$0.m10777x1();
        m10777x1.setValue(Resource.Companion.success(oneCheck1IDXDeviceResponse));
    }
}