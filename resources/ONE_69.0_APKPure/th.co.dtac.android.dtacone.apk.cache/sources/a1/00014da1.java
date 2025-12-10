package th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.success;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.device_sale.DeviceSaleActivity;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.postpaid.success.ESimPostpaidRegisSuccessFragment$initView$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidRegisSuccessFragment$initView$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ESimPostpaidRegisSuccessFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidRegisSuccessFragment$initView$3(ESimPostpaidRegisSuccessFragment eSimPostpaidRegisSuccessFragment) {
        super(0);
        this.this$0 = eSimPostpaidRegisSuccessFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ESimActivity m6981n;
        ESimActivity m6981n2;
        boolean isWithDevice = this.this$0.getViewModel().isWithDevice();
        if (isWithDevice) {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                ESimPostpaidRegisSuccessFragment eSimPostpaidRegisSuccessFragment = this.this$0;
                Intent intent = new Intent(activity, DeviceSaleActivity.class);
                intent.putExtra("bundlePostpaidRegist", eSimPostpaidRegisSuccessFragment.getViewModel().getNavigateSalesOrder());
                eSimPostpaidRegisSuccessFragment.startActivity(intent);
                activity.finish();
            }
        } else if (!isWithDevice) {
            m6981n = this.this$0.m6981n();
            m6981n.finish();
        }
        m6981n2 = this.this$0.m6981n();
        m6981n2.clearImage();
    }
}