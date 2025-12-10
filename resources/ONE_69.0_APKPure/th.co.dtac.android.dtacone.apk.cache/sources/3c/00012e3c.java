package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.annotation.SuppressLint;
import android.content.res.Resources;
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
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneClearableEditText;
import th.p047co.dtac.android.dtacone.extension.format.PriceExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.device_salve.OneDeviceSaleThemeColorModel;
import th.p047co.dtac.android.dtacone.model.device_sale.BundleItem;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleBundleAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002/0B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OneDeviceSaleBundleViewHolder;", "", "Lth/co/dtac/android/dtacone/model/device_sale/BundleItem;", "bundleItemList", "Lth/co/dtac/android/dtacone/model/appOne/device_salve/OneDeviceSaleThemeColorModel;", "themeColorModel", "Landroid/content/res/Resources;", "resources", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/device_salve/OneDeviceSaleThemeColorModel;Landroid/content/res/Resources;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OneDeviceSaleBundleViewHolder;", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OnItemClick;)V", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OneDeviceSaleBundleViewHolder;I)V", "", "imeiNumber", "", "isVerified", "updateVerifiedBundleItem", "(Ljava/lang/String;IZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getBundleItemList", "()Ljava/util/List;", "setBundleItemList", "(Ljava/util/List;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/appOne/device_salve/OneDeviceSaleThemeColorModel;", OperatorName.CURVE_TO, "Landroid/content/res/Resources;", "d", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OnItemClick;", "OnItemClick", "OneDeviceSaleBundleViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleBundleAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleBundleAdapter extends RecyclerView.Adapter<OneDeviceSaleBundleViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f90104a;

    /* renamed from: b */
    public OneDeviceSaleThemeColorModel f90105b;

    /* renamed from: c */
    public Resources f90106c;

    /* renamed from: d */
    public OnItemClick f90107d;

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OnItemClick;", "", "onClick", "", "bundleItem", "Lth/co/dtac/android/dtacone/model/device_sale/BundleItem;", "position", "", "onClickDone", "imeiNumber", "", "packageCode", "showKeyboard", "isShow", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleBundleAdapter$OnItemClick */
    /* loaded from: classes10.dex */
    public interface OnItemClick {
        void onClick(@NotNull BundleItem bundleItem, int i);

        void onClickDone(@NotNull String str, @NotNull String str2, int i);

        void showKeyboard(boolean z);
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter$OneDeviceSaleBundleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleBundleAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneCheckBox;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneCheckBox;", "getCheckBoxBundleItem", "()Lth/co/dtac/android/dtacone/app_one/widget/OneCheckBox;", "checkBoxBundleItem", "Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", "getEdtIMEINumber", "()Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", "edtIMEINumber", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getImgIMEI", "()Landroid/widget/ImageView;", "imgIMEI", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleBundleAdapter$OneDeviceSaleBundleViewHolder */
    /* loaded from: classes10.dex */
    public final class OneDeviceSaleBundleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneCheckBox f90108a;

        /* renamed from: b */
        public final OneClearableEditText f90109b;

        /* renamed from: c */
        public final ImageView f90110c;

        /* renamed from: d */
        public final /* synthetic */ OneDeviceSaleBundleAdapter f90111d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneDeviceSaleBundleViewHolder(@NotNull OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f90111d = oneDeviceSaleBundleAdapter;
            View findViewById = itemView.findViewById(R.id.checkBoxBundleItem);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.checkBoxBundleItem)");
            this.f90108a = (OneCheckBox) findViewById;
            View findViewById2 = itemView.findViewById(R.id.edtIMEINumber);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.edtIMEINumber)");
            this.f90109b = (OneClearableEditText) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.imgIMEI);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.imgIMEI)");
            this.f90110c = (ImageView) findViewById3;
        }

        @NotNull
        public final OneCheckBox getCheckBoxBundleItem() {
            return this.f90108a;
        }

        @NotNull
        public final OneClearableEditText getEdtIMEINumber() {
            return this.f90109b;
        }

        @NotNull
        public final ImageView getImgIMEI() {
            return this.f90110c;
        }
    }

    public OneDeviceSaleBundleAdapter(@NotNull List<BundleItem> bundleItemList, @NotNull OneDeviceSaleThemeColorModel themeColorModel, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(bundleItemList, "bundleItemList");
        Intrinsics.checkNotNullParameter(themeColorModel, "themeColorModel");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f90104a = bundleItemList;
        this.f90105b = themeColorModel;
        this.f90106c = resources;
    }

    /* renamed from: a */
    public static /* synthetic */ void m14772a(OneDeviceSaleBundleViewHolder oneDeviceSaleBundleViewHolder, BundleItem bundleItem, OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter, OneCheckBox oneCheckBox, View view) {
        m14769d(oneDeviceSaleBundleViewHolder, bundleItem, oneDeviceSaleBundleAdapter, oneCheckBox, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14771b(OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter, BundleItem bundleItem, int i, View view) {
        m14767f(oneDeviceSaleBundleAdapter, bundleItem, i, view);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m14770c(OneDeviceSaleBundleAdapter oneDeviceSaleBundleAdapter, BundleItem bundleItem, int i, TextView textView, int i2, KeyEvent keyEvent) {
        return m14768e(oneDeviceSaleBundleAdapter, bundleItem, i, textView, i2, keyEvent);
    }

    /* renamed from: d */
    public static final void m14769d(OneDeviceSaleBundleViewHolder this_apply, BundleItem bundleItem, OneDeviceSaleBundleAdapter this$0, OneCheckBox this_apply$1, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(bundleItem, "$bundleItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply$1, "$this_apply$1");
        if (this_apply.getCheckBoxBundleItem().isChecked()) {
            bundleItem.setCheck(true);
            if (Intrinsics.areEqual(bundleItem.getSerialized(), "1")) {
                ViewVisibleExtKt.toVisible(this_apply.getEdtIMEINumber());
                ViewVisibleExtKt.toVisible(this_apply.getImgIMEI());
                OnItemClick onItemClick = this$0.f90107d;
                if (onItemClick != null) {
                    onItemClick.showKeyboard(this_apply$1.isChecked());
                    return;
                }
                return;
            }
            ViewVisibleExtKt.toGone(this_apply.getEdtIMEINumber());
            ViewVisibleExtKt.toGone(this_apply.getImgIMEI());
            OnItemClick onItemClick2 = this$0.f90107d;
            if (onItemClick2 != null) {
                onItemClick2.showKeyboard(false);
                return;
            }
            return;
        }
        OnItemClick onItemClick3 = this$0.f90107d;
        if (onItemClick3 != null) {
            onItemClick3.showKeyboard(false);
        }
        bundleItem.setCheck(false);
        bundleItem.setVerified(false);
        bundleItem.setImeiNumber("");
        OneClearableEditText edtIMEINumber = this_apply.getEdtIMEINumber();
        edtIMEINumber.setText("");
        ViewVisibleExtKt.toGone(edtIMEINumber);
        edtIMEINumber.setEnabled(true);
        ViewVisibleExtKt.toGone(this_apply.getImgIMEI());
    }

    /* renamed from: e */
    public static final boolean m14768e(OneDeviceSaleBundleAdapter this$0, BundleItem bundleItem, int i, TextView textView, int i2, KeyEvent keyEvent) {
        OnItemClick onItemClick;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundleItem, "$bundleItem");
        if (i2 == 6 && (onItemClick = this$0.f90107d) != null) {
            onItemClick.onClickDone(textView.getText().toString(), bundleItem.getItemCode(), i);
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public static final void m14767f(OneDeviceSaleBundleAdapter this$0, BundleItem bundleItem, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundleItem, "$bundleItem");
        OnItemClick onItemClick = this$0.f90107d;
        if (onItemClick != null) {
            onItemClick.onClick(bundleItem, i);
        }
    }

    @NotNull
    public final List<BundleItem> getBundleItemList() {
        return this.f90104a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90104a.size();
    }

    public final void setBundleItemList(@NotNull List<BundleItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f90104a = list;
    }

    public final void setListener(@NotNull OnItemClick listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f90107d = listener;
    }

    public final void updateVerifiedBundleItem(@NotNull String imeiNumber, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imeiNumber, "imeiNumber");
        BundleItem bundleItem = (BundleItem) this.f90104a.get(i);
        bundleItem.setImeiNumber(imeiNumber);
        bundleItem.setVerified(z);
        bundleItem.setCheck(true);
        bundleItem.setVerified(true);
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull final OneDeviceSaleBundleViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final BundleItem bundleItem = (BundleItem) this.f90104a.get(i);
        final OneCheckBox checkBoxBundleItem = holder.getCheckBoxBundleItem();
        checkBoxBundleItem.setLineSpacing(16.0f, 1.0f);
        String priceWithBath = PriceExtKt.toPriceWithBath(StringExtKt.formatMoneyWithDecimal(String.valueOf(bundleItem.getLineAmount())));
        String itemName = bundleItem.getItemName();
        checkBoxBundleItem.setText(itemName + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + priceWithBath);
        checkBoxBundleItem.setChecked(bundleItem.isCheck());
        if (Intrinsics.areEqual(bundleItem.getSerialized(), "1") && bundleItem.isCheck()) {
            ViewVisibleExtKt.toVisible(holder.getEdtIMEINumber());
            ViewVisibleExtKt.toVisible(holder.getImgIMEI());
            if (bundleItem.isVerified()) {
                holder.getEdtIMEINumber().setText(bundleItem.getImeiNumber());
                holder.getEdtIMEINumber().setEnabled(false);
            } else {
                OneClearableEditText edtIMEINumber = holder.getEdtIMEINumber();
                Editable text = edtIMEINumber.getText();
                if (text != null) {
                    text.clear();
                }
                edtIMEINumber.clearFocus();
                edtIMEINumber.setEnabled(true);
            }
        } else {
            ViewVisibleExtKt.toGone(holder.getEdtIMEINumber());
            ViewVisibleExtKt.toGone(holder.getImgIMEI());
        }
        checkBoxBundleItem.setOnClickListener(new View.OnClickListener() { // from class: jP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneDeviceSaleBundleAdapter.m14772a(OneDeviceSaleBundleAdapter.OneDeviceSaleBundleViewHolder.this, bundleItem, this, checkBoxBundleItem, view);
            }
        });
        OneClearableEditText edtIMEINumber2 = holder.getEdtIMEINumber();
        edtIMEINumber2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: kP0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return OneDeviceSaleBundleAdapter.m14770c(OneDeviceSaleBundleAdapter.this, bundleItem, i, textView, i2, keyEvent);
            }
        });
        edtIMEINumber2.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleBundleAdapter$onBindViewHolder$1$2$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence != null && charSequence.length() != 0) {
                    ViewVisibleExtKt.toGone(OneDeviceSaleBundleAdapter.OneDeviceSaleBundleViewHolder.this.getImgIMEI());
                } else {
                    ViewVisibleExtKt.toVisible(OneDeviceSaleBundleAdapter.OneDeviceSaleBundleViewHolder.this.getImgIMEI());
                }
            }
        });
        holder.getImgIMEI().setOnClickListener(new View.OnClickListener() { // from class: lP0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneDeviceSaleBundleAdapter.m14771b(OneDeviceSaleBundleAdapter.this, bundleItem, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OneDeviceSaleBundleViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_bundle_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OneDeviceSaleBundleViewHolder(this, view);
    }
}