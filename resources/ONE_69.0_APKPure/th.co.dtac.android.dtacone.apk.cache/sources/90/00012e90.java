package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePackageAdapter;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SubscriberPackageInfo;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$initView$1$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$initView$1$3 extends Lambda implements Function1<List<? extends SubscriberPackageInfo>, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$initView$1$3(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends SubscriberPackageInfo> list) {
        invoke2((List<SubscriberPackageInfo>) list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [th.co.dtac.android.dtacone.app_one.widget.OneFontTextView] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<SubscriberPackageInfo> it) {
        RecyclerView recyclerView;
        ?? r7;
        OneFontTextView oneFontTextView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        RecyclerView recyclerView6 = null;
        if (it == null || !(!it.isEmpty())) {
            recyclerView = this.this$0.f90252r;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listViewAdditionalPackage");
                recyclerView = null;
            }
            ViewVisibleExtKt.toGone(recyclerView);
            r7 = this.this$0.f90256v;
            if (r7 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewEmptyAdditionPackage");
            } else {
                recyclerView6 = r7;
            }
            ViewVisibleExtKt.toVisible(recyclerView6);
            return;
        }
        oneFontTextView = this.this$0.f90256v;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewEmptyAdditionPackage");
            oneFontTextView = null;
        }
        ViewVisibleExtKt.toGone(oneFontTextView);
        recyclerView2 = this.this$0.f90252r;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewAdditionalPackage");
            recyclerView2 = null;
        }
        ViewVisibleExtKt.toVisible(recyclerView2);
        recyclerView3 = this.this$0.f90252r;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewAdditionalPackage");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.this$0.requireContext()));
        recyclerView4 = this.this$0.f90252r;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewAdditionalPackage");
            recyclerView4 = null;
        }
        recyclerView4.setHasFixedSize(true);
        recyclerView5 = this.this$0.f90252r;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listViewAdditionalPackage");
        } else {
            recyclerView6 = recyclerView5;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        recyclerView6.setAdapter(new OneDeviceSalePackageAdapter(it));
    }
}