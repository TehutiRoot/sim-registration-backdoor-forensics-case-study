package th.p047co.dtac.android.dtacone.view.fragment.device_sale;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.CodeName;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/CodeName;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleChangePackageFragment$onCreate$2 */
/* loaded from: classes9.dex */
public final class DeviceSaleChangePackageFragment$onCreate$2 extends Lambda implements Function1<CodeName, Unit> {
    final /* synthetic */ DeviceSaleChangePackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleChangePackageFragment$onCreate$2(DeviceSaleChangePackageFragment deviceSaleChangePackageFragment) {
        super(1);
        this.this$0 = deviceSaleChangePackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CodeName codeName) {
        invoke2(codeName);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CodeName it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceSaleViewModel deviceSaleViewModel = this.this$0.f99806l;
        if (deviceSaleViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            deviceSaleViewModel = null;
        }
        deviceSaleViewModel.setSelectedPromotion(it.getCode(), it.getName());
        this.this$0.m8179v(it);
    }
}