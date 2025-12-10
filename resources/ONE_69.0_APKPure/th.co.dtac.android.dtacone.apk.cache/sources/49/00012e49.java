package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.MrtrDiscountItem;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePromotionalAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$DeviceSalePromotionalViewHolder;", "", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", "discountItemList", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$OnItemClick;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$DeviceSalePromotionalViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$DeviceSalePromotionalViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getDiscountItemList", "()Ljava/util/List;", "setDiscountItemList", "(Ljava/util/List;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$OnItemClick;", "getListener", "()Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$OnItemClick;", "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$OnItemClick;)V", "DeviceSalePromotionalViewHolder", "OnItemClick", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePromotionalAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSalePromotionalAdapter extends RecyclerView.Adapter<DeviceSalePromotionalViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f90129a;

    /* renamed from: b */
    public OnItemClick f90130b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-01R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$DeviceSalePromotionalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "buttonBin", "Landroid/widget/ImageView;", "getButtonBin", "()Landroid/widget/ImageView;", "setButtonBin", "(Landroid/widget/ImageView;)V", "discountCode", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getDiscountCode", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "setDiscountCode", "(Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;)V", "discountItemPrice", "getDiscountItemPrice", "setDiscountItemPrice", "discountName", "getDiscountName", "setDiscountName", "extraAdvance", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getExtraAdvance", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setExtraAdvance", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "extraAdvanceAmount", "getExtraAdvanceAmount", "setExtraAdvanceAmount", "groupContract", "Landroidx/constraintlayout/widget/Group;", "getGroupContract", "()Landroidx/constraintlayout/widget/Group;", "setGroupContract", "(Landroidx/constraintlayout/widget/Group;)V", "textContractMonth", "getTextContractMonth", "setTextContractMonth", "textMonthUnit", "getTextMonthUnit", "setTextMonthUnit", "bind", "", "item", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePromotionalAdapter$DeviceSalePromotionalViewHolder */
    /* loaded from: classes10.dex */
    public static final class DeviceSalePromotionalViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        public ImageView buttonBin;
        public OneFontTextView discountCode;
        public OneFontTextView discountItemPrice;
        public OneFontTextView discountName;
        public ConstraintLayout extraAdvance;
        public OneFontTextView extraAdvanceAmount;
        public Group groupContract;
        public OneFontTextView textContractMonth;
        public OneFontTextView textMonthUnit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceSalePromotionalViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* renamed from: b */
        public static /* synthetic */ void m14761b(Function1 function1, DeviceSalePromotionalViewHolder deviceSalePromotionalViewHolder, View view) {
            m14760c(function1, deviceSalePromotionalViewHolder, view);
        }

        /* renamed from: c */
        public static final void m14760c(Function1 listener, DeviceSalePromotionalViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            listener.invoke(Integer.valueOf(this$0.getAbsoluteAdapterPosition()));
        }

        public final void bind(@NotNull MrtrDiscountItem item, @NotNull final Function1<? super Integer, Unit> listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            View findViewById = view.findViewById(R.id.discountName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.discountName)");
            setDiscountName((OneFontTextView) findViewById);
            View findViewById2 = view.findViewById(R.id.discountCode);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.discountCode)");
            setDiscountCode((OneFontTextView) findViewById2);
            View findViewById3 = view.findViewById(R.id.discountItemPrice);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.discountItemPrice)");
            setDiscountItemPrice((OneFontTextView) findViewById3);
            View findViewById4 = view.findViewById(R.id.groupContract);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.groupContract)");
            setGroupContract((Group) findViewById4);
            View findViewById5 = view.findViewById(R.id.textContractMonth);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.textContractMonth)");
            setTextContractMonth((OneFontTextView) findViewById5);
            View findViewById6 = view.findViewById(R.id.textMonthUnit);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.textMonthUnit)");
            setTextMonthUnit((OneFontTextView) findViewById6);
            View findViewById7 = view.findViewById(R.id.extraAdvanceAmount);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.extraAdvanceAmount)");
            setExtraAdvanceAmount((OneFontTextView) findViewById7);
            View findViewById8 = view.findViewById(R.id.extraAdvance);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(R.id.extraAdvance)");
            setExtraAdvance((ConstraintLayout) findViewById8);
            View findViewById9 = view.findViewById(R.id.buttonBin);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(R.id.buttonBin)");
            setButtonBin((ImageView) findViewById9);
            getDiscountName().setText(String.valueOf(item.getName()));
            getDiscountCode().setText(item.getCampaignType());
            getDiscountItemPrice().setText(StringExtKt.formatMoneyNoDecimal(String.valueOf((int) item.getAmount())));
            if (Intrinsics.areEqual(item.getEForm(), "1")) {
                getGroupContract().setVisibility(0);
                getTextContractMonth().setText(String.valueOf(item.getValidityPeriod()));
            } else {
                getGroupContract().setVisibility(8);
            }
            String extraAdvanceAmount = item.getExtraAdvanceAmount();
            if (extraAdvanceAmount != null && extraAdvanceAmount.length() != 0) {
                String extraAdvanceAmount2 = item.getExtraAdvanceAmount();
                if (extraAdvanceAmount2 != null) {
                    getExtraAdvanceAmount().setText(StringExtKt.formatMoneyNoDecimal(extraAdvanceAmount2));
                    getExtraAdvance().setVisibility(0);
                }
            } else {
                getExtraAdvance().setVisibility(8);
            }
            getButtonBin().setOnClickListener(new View.OnClickListener() { // from class: hQ0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OneDeviceSalePromotionalAdapter.DeviceSalePromotionalViewHolder.m14761b(Function1.this, this, view2);
                }
            });
        }

        @NotNull
        public final ImageView getButtonBin() {
            ImageView imageView = this.buttonBin;
            if (imageView != null) {
                return imageView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("buttonBin");
            return null;
        }

        @NotNull
        public final OneFontTextView getDiscountCode() {
            OneFontTextView oneFontTextView = this.discountCode;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("discountCode");
            return null;
        }

        @NotNull
        public final OneFontTextView getDiscountItemPrice() {
            OneFontTextView oneFontTextView = this.discountItemPrice;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("discountItemPrice");
            return null;
        }

        @NotNull
        public final OneFontTextView getDiscountName() {
            OneFontTextView oneFontTextView = this.discountName;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("discountName");
            return null;
        }

        @NotNull
        public final ConstraintLayout getExtraAdvance() {
            ConstraintLayout constraintLayout = this.extraAdvance;
            if (constraintLayout != null) {
                return constraintLayout;
            }
            Intrinsics.throwUninitializedPropertyAccessException("extraAdvance");
            return null;
        }

        @NotNull
        public final OneFontTextView getExtraAdvanceAmount() {
            OneFontTextView oneFontTextView = this.extraAdvanceAmount;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("extraAdvanceAmount");
            return null;
        }

        @NotNull
        public final Group getGroupContract() {
            Group group = this.groupContract;
            if (group != null) {
                return group;
            }
            Intrinsics.throwUninitializedPropertyAccessException("groupContract");
            return null;
        }

        @NotNull
        public final OneFontTextView getTextContractMonth() {
            OneFontTextView oneFontTextView = this.textContractMonth;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("textContractMonth");
            return null;
        }

        @NotNull
        public final OneFontTextView getTextMonthUnit() {
            OneFontTextView oneFontTextView = this.textMonthUnit;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("textMonthUnit");
            return null;
        }

        public final void setButtonBin(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.buttonBin = imageView;
        }

        public final void setDiscountCode(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.discountCode = oneFontTextView;
        }

        public final void setDiscountItemPrice(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.discountItemPrice = oneFontTextView;
        }

        public final void setDiscountName(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.discountName = oneFontTextView;
        }

        public final void setExtraAdvance(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
            this.extraAdvance = constraintLayout;
        }

        public final void setExtraAdvanceAmount(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.extraAdvanceAmount = oneFontTextView;
        }

        public final void setGroupContract(@NotNull Group group) {
            Intrinsics.checkNotNullParameter(group, "<set-?>");
            this.groupContract = group;
        }

        public final void setTextContractMonth(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.textContractMonth = oneFontTextView;
        }

        public final void setTextMonthUnit(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.textMonthUnit = oneFontTextView;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePromotionalAdapter$OnItemClick;", "", "onClickDelete", "", "pos", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePromotionalAdapter$OnItemClick */
    /* loaded from: classes10.dex */
    public interface OnItemClick {
        void onClickDelete(int i);
    }

    public OneDeviceSalePromotionalAdapter(@NotNull List<MrtrDiscountItem> discountItemList, @NotNull OnItemClick listener) {
        Intrinsics.checkNotNullParameter(discountItemList, "discountItemList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f90129a = discountItemList;
        this.f90130b = listener;
    }

    @NotNull
    public final List<MrtrDiscountItem> getDiscountItemList() {
        return this.f90129a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90129a.size();
    }

    @NotNull
    public final OnItemClick getListener() {
        return this.f90130b;
    }

    public final void setDiscountItemList(@NotNull List<MrtrDiscountItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f90129a = list;
    }

    public final void setListener(@NotNull OnItemClick onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "<set-?>");
        this.f90130b = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DeviceSalePromotionalViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((MrtrDiscountItem) this.f90129a.get(i), new OneDeviceSalePromotionalAdapter$onBindViewHolder$1(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceSalePromotionalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_device_sale_promotional_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DeviceSalePromotionalViewHolder(view);
    }
}