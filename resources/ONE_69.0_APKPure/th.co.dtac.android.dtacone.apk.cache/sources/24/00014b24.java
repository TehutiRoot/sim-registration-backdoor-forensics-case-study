package th.p047co.dtac.android.dtacone.view.fragment.device_sale;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.device_sale.DeviceSaleBundleAdapter;
import th.p047co.dtac.android.dtacone.extension.format.PriceExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetProductSaleOrderResponse;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/device_sale/GetProductSaleOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleDeviceInfoFragment$onViewCreated$3$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleDeviceInfoFragment$onViewCreated$3$1 extends Lambda implements Function1<Resource<? extends GetProductSaleOrderResponse>, Unit> {
    final /* synthetic */ DeviceSaleViewModel $this_apply;
    final /* synthetic */ DeviceSaleDeviceInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleDeviceInfoFragment$onViewCreated$3$1(DeviceSaleDeviceInfoFragment deviceSaleDeviceInfoFragment, DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleDeviceInfoFragment;
        this.$this_apply = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetProductSaleOrderResponse> resource) {
        invoke2((Resource<GetProductSaleOrderResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<GetProductSaleOrderResponse> resource) {
        GetProductSaleOrderResponse data;
        DtacFontTextView dtacFontTextView;
        FrameLayout frameLayout;
        DtacFontTextView dtacFontTextView2;
        DtacFontTextView dtacFontTextView3;
        DtacFontTextView dtacFontTextView4;
        DtacFontTextView dtacFontTextView5;
        DtacFontTextView dtacFontTextView6;
        DtacFontTextView dtacFontTextView7;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        DtacFontTextView dtacFontTextView8;
        RecyclerView recyclerView3;
        FrameLayout frameLayout2;
        if (resource.getStatus() != StatusResource.SUCCESS || (data = resource.getData()) == null) {
            return;
        }
        DeviceSaleDeviceInfoFragment deviceSaleDeviceInfoFragment = this.this$0;
        DeviceSaleViewModel deviceSaleViewModel = this.$this_apply;
        dtacFontTextView = deviceSaleDeviceInfoFragment.f99842m;
        DeviceSaleBundleAdapter deviceSaleBundleAdapter = null;
        RecyclerView recyclerView4 = null;
        if (dtacFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDeviceName");
            dtacFontTextView = null;
        }
        dtacFontTextView.setText(data.getProductName());
        if (Intrinsics.areEqual(deviceSaleViewModel.isDtacDevice(), Boolean.FALSE)) {
            frameLayout2 = deviceSaleDeviceInfoFragment.f99843n;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("framePrice");
                frameLayout2 = null;
            }
            ViewVisibleExtKt.toGone(frameLayout2);
        } else {
            frameLayout = deviceSaleDeviceInfoFragment.f99843n;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("framePrice");
                frameLayout = null;
            }
            ViewVisibleExtKt.toVisible(frameLayout);
            dtacFontTextView2 = deviceSaleDeviceInfoFragment.f99844o;
            if (dtacFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPrice");
                dtacFontTextView2 = null;
            }
            dtacFontTextView2.setText(PriceExtKt.toPriceWithBath(StringExtKt.formatMoneyNoDecimal(String.valueOf(data.getLineAmount()))));
        }
        dtacFontTextView3 = deviceSaleDeviceInfoFragment.f99845p;
        if (dtacFontTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIMEI");
            dtacFontTextView3 = null;
        }
        dtacFontTextView3.setText(deviceSaleViewModel.getImeiNumber());
        dtacFontTextView4 = deviceSaleDeviceInfoFragment.f99846q;
        if (dtacFontTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriber");
            dtacFontTextView4 = null;
        }
        dtacFontTextView4.setText(deviceSaleViewModel.getSubscriberNumberDisplay());
        dtacFontTextView5 = deviceSaleDeviceInfoFragment.f99847r;
        if (dtacFontTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPackage");
            dtacFontTextView5 = null;
        }
        dtacFontTextView5.setText(deviceSaleViewModel.getPackageDescription());
        if (data.getBundleItem().isEmpty()) {
            dtacFontTextView8 = deviceSaleDeviceInfoFragment.f99848s;
            if (dtacFontTextView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvNoBundleItem");
                dtacFontTextView8 = null;
            }
            ViewVisibleExtKt.toVisible(dtacFontTextView8);
            recyclerView3 = deviceSaleDeviceInfoFragment.f99840k;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
            } else {
                recyclerView4 = recyclerView3;
            }
            ViewVisibleExtKt.toGone(recyclerView4);
            return;
        }
        dtacFontTextView6 = deviceSaleDeviceInfoFragment.f99848s;
        if (dtacFontTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoBundleItem");
            dtacFontTextView6 = null;
        }
        ViewVisibleExtKt.toGone(dtacFontTextView6);
        dtacFontTextView7 = deviceSaleDeviceInfoFragment.f99849t;
        if (dtacFontTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBundleTitle");
            dtacFontTextView7 = null;
        }
        dtacFontTextView7.setText(deviceSaleDeviceInfoFragment.getString(R.string.device_sale_title_bundled_item, String.valueOf(data.getBundleItem().size())));
        deviceSaleDeviceInfoFragment.f99839j = new DeviceSaleBundleAdapter(data.getBundleItem());
        recyclerView = deviceSaleDeviceInfoFragment.f99840k;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
            recyclerView = null;
        }
        ViewVisibleExtKt.toVisible(recyclerView);
        recyclerView2 = deviceSaleDeviceInfoFragment.f99840k;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
            recyclerView2 = null;
        }
        DeviceSaleBundleAdapter deviceSaleBundleAdapter2 = deviceSaleDeviceInfoFragment.f99839j;
        if (deviceSaleBundleAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            deviceSaleBundleAdapter2 = null;
        }
        recyclerView2.setAdapter(deviceSaleBundleAdapter2);
        DeviceSaleBundleAdapter deviceSaleBundleAdapter3 = deviceSaleDeviceInfoFragment.f99839j;
        if (deviceSaleBundleAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            deviceSaleBundleAdapter = deviceSaleBundleAdapter3;
        }
        deviceSaleBundleAdapter.setListener(deviceSaleDeviceInfoFragment);
    }
}