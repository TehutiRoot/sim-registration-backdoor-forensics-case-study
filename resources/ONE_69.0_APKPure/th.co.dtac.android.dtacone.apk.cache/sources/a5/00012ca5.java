package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneDeviceSaleModelPackageInfoTrueBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleDeviceModelPackageInfo;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostThemeModel;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B)\b\u0007\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleDeviceModelPackageInfo;", "Lkotlin/collections/ArrayList;", "item", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", "themeModel", "<init>", "(Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "getItem", "()Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", "getThemeModel", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceModelPackageInfoAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueDeviceModelPackageInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f89719a;

    /* renamed from: b */
    public final OnePre2PostThemeModel f89720b;

    /* renamed from: c */
    public OnClickListener f89721c;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener;", "", "onChangeIMEIItem", "", "position", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleDeviceModelPackageInfo;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onChangeIMEIItem(int i, @Nullable OneDeviceSaleDeviceModelPackageInfo oneDeviceSaleDeviceModelPackageInfo);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneDeviceSaleModelPackageInfoTrueBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneDeviceSaleModelPackageInfoTrueBinding;)V", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleDeviceModelPackageInfo;", "item", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/OneDeviceSaleDeviceModelPackageInfo;Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleTrueDeviceModelPackageInfoAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneDeviceSaleModelPackageInfoTrueBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ItemOneDeviceSaleModelPackageInfoTrueBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceModelPackageInfoAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneDeviceSaleModelPackageInfoTrueBinding f89722a;

        /* renamed from: b */
        public final /* synthetic */ OneDeviceSaleTrueDeviceModelPackageInfoAdapter f89723b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneDeviceSaleTrueDeviceModelPackageInfoAdapter oneDeviceSaleTrueDeviceModelPackageInfoAdapter, ItemOneDeviceSaleModelPackageInfoTrueBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f89723b = oneDeviceSaleTrueDeviceModelPackageInfoAdapter;
            this.f89722a = binding;
        }

        public final void bind(@Nullable OneDeviceSaleDeviceModelPackageInfo oneDeviceSaleDeviceModelPackageInfo, @Nullable OnClickListener onClickListener) {
            int i;
            String str;
            String str2;
            String str3;
            String title2ValueItem;
            ItemOneDeviceSaleModelPackageInfoTrueBinding itemOneDeviceSaleModelPackageInfoTrueBinding = this.f89722a;
            OnePre2PostThemeModel themeModel = this.f89723b.getThemeModel();
            String str4 = null;
            int color = ResourcesCompat.getColor(this.f89722a.getRoot().getResources(), themeModel.getFontColor(), null);
            itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelIMEIValueItemTextView.setTextColor(color);
            itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelBrandValueItemTextView.setTextColor(color);
            itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelPackageDescriptionItemTextView.setTextColor(color);
            itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelScanBarcodeItemButton.setBackgroundResource(themeModel.getButtonBackground());
            String str5 = "";
            itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelInfoHeaderItemTextView.setText((oneDeviceSaleDeviceModelPackageInfo == null || (r3 = oneDeviceSaleDeviceModelPackageInfo.getTitle()) == null) ? "" : "");
            OneFontButton oneFontButton = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelScanBarcodeItemButton;
            if (oneDeviceSaleDeviceModelPackageInfo != null && oneDeviceSaleDeviceModelPackageInfo.isShowScanBarcodeIcon()) {
                i = 0;
            } else {
                i = 4;
            }
            oneFontButton.setVisibility(i);
            OneFontButton deviceModelScanBarcodeItemButton = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelScanBarcodeItemButton;
            Intrinsics.checkNotNullExpressionValue(deviceModelScanBarcodeItemButton, "deviceModelScanBarcodeItemButton");
            OnSingleClickListenerKt.setOnSingleClickListener(deviceModelScanBarcodeItemButton, new C14545xac47a004(onClickListener, this, oneDeviceSaleDeviceModelPackageInfo));
            if (oneDeviceSaleDeviceModelPackageInfo != null) {
                str = oneDeviceSaleDeviceModelPackageInfo.getTitle1ValueItem();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                ConstraintLayout deviceModelIMEILabelItemLayout = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelIMEILabelItemLayout;
                Intrinsics.checkNotNullExpressionValue(deviceModelIMEILabelItemLayout, "deviceModelIMEILabelItemLayout");
                ViewVisibleExtKt.toVisible(deviceModelIMEILabelItemLayout);
                itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelIMEILabelItemTextView.setText((oneDeviceSaleDeviceModelPackageInfo == null || (r3 = oneDeviceSaleDeviceModelPackageInfo.getTitle1Item()) == null) ? "" : "");
                itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelIMEIValueItemTextView.setText((oneDeviceSaleDeviceModelPackageInfo == null || (r3 = oneDeviceSaleDeviceModelPackageInfo.getTitle1ValueItem()) == null) ? "" : "");
            } else {
                ConstraintLayout deviceModelIMEILabelItemLayout2 = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelIMEILabelItemLayout;
                Intrinsics.checkNotNullExpressionValue(deviceModelIMEILabelItemLayout2, "deviceModelIMEILabelItemLayout");
                ViewVisibleExtKt.toGone(deviceModelIMEILabelItemLayout2);
            }
            if (oneDeviceSaleDeviceModelPackageInfo != null) {
                str2 = oneDeviceSaleDeviceModelPackageInfo.getTitle2ValueItem();
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                ConstraintLayout deviceModelBrandItemLayout = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelBrandItemLayout;
                Intrinsics.checkNotNullExpressionValue(deviceModelBrandItemLayout, "deviceModelBrandItemLayout");
                ViewVisibleExtKt.toVisible(deviceModelBrandItemLayout);
                itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelBrandItemTextView.setText((oneDeviceSaleDeviceModelPackageInfo == null || (r5 = oneDeviceSaleDeviceModelPackageInfo.getTitle2Item()) == null) ? "" : "");
                OneFontTextView oneFontTextView = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelBrandValueItemTextView;
                if (oneDeviceSaleDeviceModelPackageInfo != null && (title2ValueItem = oneDeviceSaleDeviceModelPackageInfo.getTitle2ValueItem()) != null) {
                    str5 = title2ValueItem;
                }
                oneFontTextView.setText(str5);
            } else {
                ConstraintLayout deviceModelBrandItemLayout2 = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelBrandItemLayout;
                Intrinsics.checkNotNullExpressionValue(deviceModelBrandItemLayout2, "deviceModelBrandItemLayout");
                ViewVisibleExtKt.toGone(deviceModelBrandItemLayout2);
            }
            if (oneDeviceSaleDeviceModelPackageInfo != null) {
                str3 = oneDeviceSaleDeviceModelPackageInfo.getDescriptionItem();
            } else {
                str3 = null;
            }
            if (str3 != null && str3.length() != 0) {
                ConstraintLayout deviceModelIMEILabelItemLayout3 = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelIMEILabelItemLayout;
                Intrinsics.checkNotNullExpressionValue(deviceModelIMEILabelItemLayout3, "deviceModelIMEILabelItemLayout");
                ViewVisibleExtKt.toGone(deviceModelIMEILabelItemLayout3);
                ConstraintLayout deviceModelBrandItemLayout3 = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelBrandItemLayout;
                Intrinsics.checkNotNullExpressionValue(deviceModelBrandItemLayout3, "deviceModelBrandItemLayout");
                ViewVisibleExtKt.toGone(deviceModelBrandItemLayout3);
                OneFontTextView deviceModelPackageDescriptionItemTextView = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelPackageDescriptionItemTextView;
                Intrinsics.checkNotNullExpressionValue(deviceModelPackageDescriptionItemTextView, "deviceModelPackageDescriptionItemTextView");
                ViewVisibleExtKt.toVisible(deviceModelPackageDescriptionItemTextView);
                OneFontTextView oneFontTextView2 = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelPackageDescriptionItemTextView;
                if (oneDeviceSaleDeviceModelPackageInfo != null) {
                    str4 = oneDeviceSaleDeviceModelPackageInfo.getDescriptionItem();
                }
                oneFontTextView2.setText(str4);
                return;
            }
            OneFontTextView deviceModelPackageDescriptionItemTextView2 = itemOneDeviceSaleModelPackageInfoTrueBinding.deviceModelPackageDescriptionItemTextView;
            Intrinsics.checkNotNullExpressionValue(deviceModelPackageDescriptionItemTextView2, "deviceModelPackageDescriptionItemTextView");
            ViewVisibleExtKt.toGone(deviceModelPackageDescriptionItemTextView2);
        }

        @NotNull
        public final ItemOneDeviceSaleModelPackageInfoTrueBinding getBinding() {
            return this.f89722a;
        }
    }

    @Inject
    public OneDeviceSaleTrueDeviceModelPackageInfoAdapter(@NotNull ArrayList<OneDeviceSaleDeviceModelPackageInfo> item, @NotNull OnePre2PostThemeModel themeModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(themeModel, "themeModel");
        this.f89719a = item;
        this.f89720b = themeModel;
    }

    @NotNull
    public final ArrayList<OneDeviceSaleDeviceModelPackageInfo> getItem() {
        return this.f89719a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f89719a.size();
    }

    @NotNull
    public final OnePre2PostThemeModel getThemeModel() {
        return this.f89720b;
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f89721c = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f89719a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "item[position]");
        holder.bind((OneDeviceSaleDeviceModelPackageInfo) obj, this.f89721c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneDeviceSaleModelPackageInfoTrueBinding inflate = ItemOneDeviceSaleModelPackageInfoTrueBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}