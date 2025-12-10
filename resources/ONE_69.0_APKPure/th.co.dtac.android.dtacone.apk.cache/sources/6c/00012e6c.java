package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import android.content.res.Resources;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PriceExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetProductSaleOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_salve.OneDeviceSaleThemeColorModel;
import th.p047co.dtac.android.dtacone.model.device_sale.BundleItem;
import th.p047co.dtac.android.dtacone.model.device_sale.GetProductSaleOrderResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleBundleAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetProductSaleOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleDeviceInfoFragment$setObserveViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleDeviceInfoFragment$setObserveViewModel$1$1 extends Lambda implements Function1<Resource<? extends OneGetProductSaleOrderResponse>, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel $this_apply;
    final /* synthetic */ OneDeviceSaleDeviceInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleDeviceInfoFragment$setObserveViewModel$1$1(OneDeviceSaleDeviceInfoFragment oneDeviceSaleDeviceInfoFragment, OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleDeviceInfoFragment;
        this.$this_apply = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneGetProductSaleOrderResponse> resource) {
        invoke2((Resource<OneGetProductSaleOrderResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneGetProductSaleOrderResponse> resource) {
        OneFontTextView oneFontTextView;
        RecyclerView recyclerView;
        OneFontTextView oneFontTextView2;
        FrameLayout frameLayout;
        OneFontTextView oneFontTextView3;
        OneFontTextView oneFontTextView4;
        OneFontTextView oneFontTextView5;
        OneFontTextView oneFontTextView6;
        OneFontTextView oneFontTextView7;
        OneFontTextView oneFontTextView8;
        OneDeviceSaleViewModel oneDeviceSaleViewModel;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter;
        OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter2;
        OneFontTextView oneFontTextView9;
        RecyclerView recyclerView4;
        FrameLayout frameLayout2;
        if (resource.getStatus() == StatusResource.SUCCESS) {
            OneGetProductSaleOrderResponse data = resource.getData();
            RecyclerView recyclerView5 = null;
            RecyclerView recyclerView6 = null;
            OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter3 = null;
            if ((data != null ? data.getData() : null) == null) {
                oneFontTextView = this.this$0.f90197r;
                if (oneFontTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvNoBundleItem");
                    oneFontTextView = null;
                }
                ViewVisibleExtKt.toVisible(oneFontTextView);
                recyclerView = this.this$0.f90190k;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
                } else {
                    recyclerView5 = recyclerView;
                }
                ViewVisibleExtKt.toGone(recyclerView5);
                return;
            }
            GetProductSaleOrderResponse data2 = resource.getData().getData();
            oneFontTextView2 = this.this$0.f90192m;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDeviceName");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setText(data2.getProductName());
            if (Intrinsics.areEqual(this.$this_apply.isDtacDevice(), Boolean.FALSE)) {
                frameLayout2 = this.this$0.f90199t;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("framePrice");
                    frameLayout2 = null;
                }
                ViewVisibleExtKt.toGone(frameLayout2);
            } else {
                frameLayout = this.this$0.f90199t;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("framePrice");
                    frameLayout = null;
                }
                ViewVisibleExtKt.toVisible(frameLayout);
                oneFontTextView3 = this.this$0.f90193n;
                if (oneFontTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPrice");
                    oneFontTextView3 = null;
                }
                oneFontTextView3.setText(PriceExtKt.toPriceWithBath(StringExtKt.formatMoneyNoDecimal(String.valueOf(data2.getLineAmount()))));
            }
            oneFontTextView4 = this.this$0.f90194o;
            if (oneFontTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvIMEI");
                oneFontTextView4 = null;
            }
            oneFontTextView4.setText(this.$this_apply.getImeiNumber());
            oneFontTextView5 = this.this$0.f90195p;
            if (oneFontTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSubscriber");
                oneFontTextView5 = null;
            }
            oneFontTextView5.setText(this.$this_apply.getSubscriberNumberDisplay());
            oneFontTextView6 = this.this$0.f90196q;
            if (oneFontTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPackage");
                oneFontTextView6 = null;
            }
            oneFontTextView6.setText(this.$this_apply.getPackageDescription());
            if (data2.getBundleItem().isEmpty()) {
                oneFontTextView9 = this.this$0.f90197r;
                if (oneFontTextView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvNoBundleItem");
                    oneFontTextView9 = null;
                }
                ViewVisibleExtKt.toVisible(oneFontTextView9);
                recyclerView4 = this.this$0.f90190k;
                if (recyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
                } else {
                    recyclerView6 = recyclerView4;
                }
                ViewVisibleExtKt.toGone(recyclerView6);
                return;
            }
            oneFontTextView7 = this.this$0.f90197r;
            if (oneFontTextView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvNoBundleItem");
                oneFontTextView7 = null;
            }
            ViewVisibleExtKt.toGone(oneFontTextView7);
            oneFontTextView8 = this.this$0.f90198s;
            if (oneFontTextView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvBundleTitle");
                oneFontTextView8 = null;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.this$0.getString(R.string.device_sale_title_bundled_item);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.device_sale_title_bundled_item)");
            String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(data2.getBundleItem().size())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            oneFontTextView8.setText(format);
            OneDeviceSaleDeviceInfoFragment oneDeviceSaleDeviceInfoFragment = this.this$0;
            List<BundleItem> bundleItem = data2.getBundleItem();
            oneDeviceSaleViewModel = this.this$0.f90188i;
            if (oneDeviceSaleViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceSaleViewModel");
                oneDeviceSaleViewModel = null;
            }
            OneDeviceSaleThemeColorModel themeColorModel = oneDeviceSaleViewModel.getThemeColorModel();
            Resources resources = this.this$0.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            oneDeviceSaleDeviceInfoFragment.f90189j = new OneDeviceSaleBundleAdapter(bundleItem, themeColorModel, resources);
            recyclerView2 = this.this$0.f90190k;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
                recyclerView2 = null;
            }
            ViewVisibleExtKt.toVisible(recyclerView2);
            recyclerView3 = this.this$0.f90190k;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bundleItemListView");
                recyclerView3 = null;
            }
            oneDeviceSaleBundleAdapter = this.this$0.f90189j;
            if (oneDeviceSaleBundleAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oneDeviceSaleBundleAdapter = null;
            }
            recyclerView3.setAdapter(oneDeviceSaleBundleAdapter);
            oneDeviceSaleBundleAdapter2 = this.this$0.f90189j;
            if (oneDeviceSaleBundleAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oneDeviceSaleBundleAdapter3 = oneDeviceSaleBundleAdapter2;
            }
            oneDeviceSaleBundleAdapter3.setListener(this.this$0);
        }
    }
}