package th.p047co.dtac.android.dtacone.adapter.device_sale;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.device_sale.DeviceSaleBundleAdapter;
import th.p047co.dtac.android.dtacone.extension.format.PriceExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.BundleItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00122\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0007R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$DeviceSaleBundleViewHolder;", "", "Lth/co/dtac/android/dtacone/model/device_sale/BundleItem;", "bundleItemList", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$DeviceSaleBundleViewHolder;", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$OnItemClick;)V", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$DeviceSaleBundleViewHolder;I)V", "", "imeiNumber", "", "isVerified", "updateVerifiedBundleItem", "(Ljava/lang/String;IZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getBundleItemList", "()Ljava/util/List;", "setBundleItemList", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$OnItemClick;", "DeviceSaleBundleViewHolder", "OnItemClick", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.device_sale.DeviceSaleBundleAdapter */
/* loaded from: classes7.dex */
public final class DeviceSaleBundleAdapter extends RecyclerView.Adapter<DeviceSaleBundleViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81161a;

    /* renamed from: b */
    public OnItemClick f81162b;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001f\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00130\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$DeviceSaleBundleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "getCheckBoxBundleItem", "()Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "checkBoxBundleItem", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEdtIMEINumber", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "edtIMEINumber", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getImgIMEI", "()Landroid/widget/ImageView;", "imgIMEI", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.device_sale.DeviceSaleBundleAdapter$DeviceSaleBundleViewHolder */
    /* loaded from: classes7.dex */
    public final class DeviceSaleBundleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final DtacCheckBox f81163a;

        /* renamed from: b */
        public final DtacClearableEditText f81164b;

        /* renamed from: c */
        public final ImageView f81165c;

        /* renamed from: d */
        public final /* synthetic */ DeviceSaleBundleAdapter f81166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceSaleBundleViewHolder(@NotNull DeviceSaleBundleAdapter deviceSaleBundleAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f81166d = deviceSaleBundleAdapter;
            this.f81163a = (DtacCheckBox) itemView.findViewById(R.id.checkBoxBundleItem);
            this.f81164b = (DtacClearableEditText) itemView.findViewById(R.id.edtIMEINumber);
            this.f81165c = (ImageView) itemView.findViewById(R.id.imgIMEI);
        }

        public final DtacCheckBox getCheckBoxBundleItem() {
            return this.f81163a;
        }

        public final DtacClearableEditText getEdtIMEINumber() {
            return this.f81164b;
        }

        public final ImageView getImgIMEI() {
            return this.f81165c;
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSaleBundleAdapter$OnItemClick;", "", "onClick", "", "bundleItem", "Lth/co/dtac/android/dtacone/model/device_sale/BundleItem;", "position", "", "onClickDone", "imeiNumber", "", "packageCode", "showKeyboard", "isShow", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.device_sale.DeviceSaleBundleAdapter$OnItemClick */
    /* loaded from: classes7.dex */
    public interface OnItemClick {
        void onClick(@NotNull BundleItem bundleItem, int i);

        void onClickDone(@NotNull String str, @NotNull String str2, int i);

        void showKeyboard(boolean z);
    }

    public DeviceSaleBundleAdapter(@NotNull List<BundleItem> bundleItemList) {
        Intrinsics.checkNotNullParameter(bundleItemList, "bundleItemList");
        this.f81161a = bundleItemList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20377a(BundleItem bundleItem, DeviceSaleBundleAdapter deviceSaleBundleAdapter, int i, View view) {
        m20372f(bundleItem, deviceSaleBundleAdapter, i, view);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m20376b(DeviceSaleBundleAdapter deviceSaleBundleAdapter, BundleItem bundleItem, int i, TextView textView, int i2, KeyEvent keyEvent) {
        return m20373e(deviceSaleBundleAdapter, bundleItem, i, textView, i2, keyEvent);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20375c(DeviceSaleBundleViewHolder deviceSaleBundleViewHolder, BundleItem bundleItem, DeviceSaleBundleAdapter deviceSaleBundleAdapter, DtacCheckBox dtacCheckBox, View view) {
        m20374d(deviceSaleBundleViewHolder, bundleItem, deviceSaleBundleAdapter, dtacCheckBox, view);
    }

    /* renamed from: d */
    public static final void m20374d(DeviceSaleBundleViewHolder this_apply, BundleItem bundleItem, DeviceSaleBundleAdapter this$0, DtacCheckBox dtacCheckBox, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(bundleItem, "$bundleItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this_apply.getCheckBoxBundleItem().isChecked()) {
            bundleItem.setCheck(true);
            if (Intrinsics.areEqual(bundleItem.getSerialized(), "1")) {
                DtacClearableEditText edtIMEINumber = this_apply.getEdtIMEINumber();
                Intrinsics.checkNotNullExpressionValue(edtIMEINumber, "edtIMEINumber");
                ViewVisibleExtKt.toVisible(edtIMEINumber);
                ImageView imgIMEI = this_apply.getImgIMEI();
                Intrinsics.checkNotNullExpressionValue(imgIMEI, "imgIMEI");
                ViewVisibleExtKt.toVisible(imgIMEI);
                OnItemClick onItemClick = this$0.f81162b;
                if (onItemClick != null) {
                    onItemClick.showKeyboard(dtacCheckBox.isChecked());
                    return;
                }
                return;
            }
            DtacClearableEditText edtIMEINumber2 = this_apply.getEdtIMEINumber();
            Intrinsics.checkNotNullExpressionValue(edtIMEINumber2, "edtIMEINumber");
            ViewVisibleExtKt.toGone(edtIMEINumber2);
            ImageView imgIMEI2 = this_apply.getImgIMEI();
            Intrinsics.checkNotNullExpressionValue(imgIMEI2, "imgIMEI");
            ViewVisibleExtKt.toGone(imgIMEI2);
            OnItemClick onItemClick2 = this$0.f81162b;
            if (onItemClick2 != null) {
                onItemClick2.showKeyboard(false);
                return;
            }
            return;
        }
        OnItemClick onItemClick3 = this$0.f81162b;
        if (onItemClick3 != null) {
            onItemClick3.showKeyboard(false);
        }
        bundleItem.setCheck(false);
        bundleItem.setVerified(false);
        bundleItem.setImeiNumber("");
        DtacClearableEditText edtIMEINumber3 = this_apply.getEdtIMEINumber();
        edtIMEINumber3.setText("");
        Intrinsics.checkNotNullExpressionValue(edtIMEINumber3, "onBindViewHolder$lambda$…ambda$4$lambda$3$lambda$2");
        ViewVisibleExtKt.toGone(edtIMEINumber3);
        edtIMEINumber3.setEnabled(true);
        ImageView imgIMEI3 = this_apply.getImgIMEI();
        Intrinsics.checkNotNullExpressionValue(imgIMEI3, "imgIMEI");
        ViewVisibleExtKt.toGone(imgIMEI3);
    }

    /* renamed from: e */
    public static final boolean m20373e(DeviceSaleBundleAdapter this$0, BundleItem bundleItem, int i, TextView textView, int i2, KeyEvent keyEvent) {
        OnItemClick onItemClick;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundleItem, "$bundleItem");
        if (i2 == 6 && (onItemClick = this$0.f81162b) != null) {
            onItemClick.onClickDone(textView.getText().toString(), bundleItem.getItemCode(), i);
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public static final void m20372f(BundleItem bundleItem, DeviceSaleBundleAdapter this$0, int i, View view) {
        OnItemClick onItemClick;
        Intrinsics.checkNotNullParameter(bundleItem, "$bundleItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!bundleItem.isVerified() && (onItemClick = this$0.f81162b) != null) {
            onItemClick.onClick(bundleItem, i);
        }
    }

    @NotNull
    public final List<BundleItem> getBundleItemList() {
        return this.f81161a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81161a.size();
    }

    public final void setBundleItemList(@NotNull List<BundleItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f81161a = list;
    }

    public final void setListener(@NotNull OnItemClick listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81162b = listener;
    }

    public final void updateVerifiedBundleItem(@NotNull String imeiNumber, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imeiNumber, "imeiNumber");
        BundleItem bundleItem = (BundleItem) this.f81161a.get(i);
        bundleItem.setImeiNumber(imeiNumber);
        bundleItem.setVerified(z);
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final DeviceSaleBundleViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final BundleItem bundleItem = (BundleItem) this.f81161a.get(i);
        final DtacCheckBox checkBoxBundleItem = holder.getCheckBoxBundleItem();
        String priceWithBath = PriceExtKt.toPriceWithBath(StringExtKt.formatMoneyWithDecimal(String.valueOf(bundleItem.getLineAmount())));
        String itemName = bundleItem.getItemName();
        checkBoxBundleItem.setText(itemName + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + priceWithBath);
        checkBoxBundleItem.setChecked(bundleItem.isCheck());
        if (Intrinsics.areEqual(bundleItem.getSerialized(), "1") && bundleItem.isCheck()) {
            DtacClearableEditText edtIMEINumber = holder.getEdtIMEINumber();
            Intrinsics.checkNotNullExpressionValue(edtIMEINumber, "edtIMEINumber");
            ViewVisibleExtKt.toVisible(edtIMEINumber);
            ImageView imgIMEI = holder.getImgIMEI();
            Intrinsics.checkNotNullExpressionValue(imgIMEI, "imgIMEI");
            ViewVisibleExtKt.toVisible(imgIMEI);
            if (bundleItem.isVerified()) {
                holder.getEdtIMEINumber().setText(bundleItem.getImeiNumber());
                holder.getEdtIMEINumber().setEnabled(false);
            } else {
                DtacClearableEditText edtIMEINumber2 = holder.getEdtIMEINumber();
                Editable text = edtIMEINumber2.getText();
                if (text != null) {
                    text.clear();
                }
                edtIMEINumber2.clearFocus();
                edtIMEINumber2.setEnabled(true);
            }
        } else {
            DtacClearableEditText edtIMEINumber3 = holder.getEdtIMEINumber();
            Intrinsics.checkNotNullExpressionValue(edtIMEINumber3, "edtIMEINumber");
            ViewVisibleExtKt.toGone(edtIMEINumber3);
            ImageView imgIMEI2 = holder.getImgIMEI();
            Intrinsics.checkNotNullExpressionValue(imgIMEI2, "imgIMEI");
            ViewVisibleExtKt.toGone(imgIMEI2);
        }
        checkBoxBundleItem.setOnClickListener(new View.OnClickListener() { // from class: FG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceSaleBundleAdapter.m20375c(DeviceSaleBundleAdapter.DeviceSaleBundleViewHolder.this, bundleItem, this, checkBoxBundleItem, view);
            }
        });
        DtacClearableEditText edtIMEINumber4 = holder.getEdtIMEINumber();
        edtIMEINumber4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: GG
            {
                DeviceSaleBundleAdapter.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return DeviceSaleBundleAdapter.m20376b(DeviceSaleBundleAdapter.this, bundleItem, i, textView, i2, keyEvent);
            }
        });
        edtIMEINumber4.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.adapter.device_sale.DeviceSaleBundleAdapter$onBindViewHolder$1$2$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence != null && charSequence.length() != 0) {
                    ImageView imgIMEI3 = DeviceSaleBundleAdapter.DeviceSaleBundleViewHolder.this.getImgIMEI();
                    Intrinsics.checkNotNullExpressionValue(imgIMEI3, "imgIMEI");
                    ViewVisibleExtKt.toGone(imgIMEI3);
                    return;
                }
                ImageView imgIMEI4 = DeviceSaleBundleAdapter.DeviceSaleBundleViewHolder.this.getImgIMEI();
                Intrinsics.checkNotNullExpressionValue(imgIMEI4, "imgIMEI");
                ViewVisibleExtKt.toVisible(imgIMEI4);
            }
        });
        holder.getImgIMEI().setOnClickListener(new View.OnClickListener() { // from class: HG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceSaleBundleAdapter.m20377a(bundleItem, this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceSaleBundleViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bundle_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DeviceSaleBundleViewHolder(this, view);
    }
}
