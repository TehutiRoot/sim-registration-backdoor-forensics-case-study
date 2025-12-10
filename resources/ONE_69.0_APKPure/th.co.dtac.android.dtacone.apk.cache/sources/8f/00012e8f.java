package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePackageAdapter;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SubscriberPackageInfo;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$initView$1$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$initView$1$2 extends Lambda implements Function1<List<? extends SubscriberPackageInfo>, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$initView$1$2(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends SubscriberPackageInfo> list) {
        invoke2((List<SubscriberPackageInfo>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<SubscriberPackageInfo> it) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        recyclerView = this.this$0.f90255u;
        RecyclerView recyclerView4 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewMainPackage");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.this$0.requireContext()));
        recyclerView2 = this.this$0.f90255u;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewMainPackage");
            recyclerView2 = null;
        }
        recyclerView2.setHasFixedSize(true);
        recyclerView3 = this.this$0.f90255u;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewMainPackage");
        } else {
            recyclerView4 = recyclerView3;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        recyclerView4.setAdapter(new OneDeviceSalePackageAdapter(it));
    }
}