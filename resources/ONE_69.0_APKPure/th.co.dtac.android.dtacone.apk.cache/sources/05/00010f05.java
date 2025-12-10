package th.p047co.dtac.android.dtacone.adapter;

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
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.CampiagnDiscountItemAdapter;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.MrtrDiscountItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$DiscountItemViewHolder;", "", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", "discountItemList", "Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$OnItemClick;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$DiscountItemViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$DiscountItemViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getDiscountItemList", "()Ljava/util/List;", "setDiscountItemList", "(Ljava/util/List;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$OnItemClick;", "getListener", "()Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$OnItemClick;", "setListener", "(Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$OnItemClick;)V", "DiscountItemViewHolder", "OnItemClick", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.CampiagnDiscountItemAdapter */
/* loaded from: classes7.dex */
public final class CampiagnDiscountItemAdapter extends RecyclerView.Adapter<DiscountItemViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81017a;

    /* renamed from: b */
    public OnItemClick f81018b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020*0.R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$DiscountItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "buttonBin", "Landroid/widget/ImageView;", "getButtonBin", "()Landroid/widget/ImageView;", "setButtonBin", "(Landroid/widget/ImageView;)V", "discountCode", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "getDiscountCode", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "setDiscountCode", "(Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;)V", "discountItemPrice", "getDiscountItemPrice", "setDiscountItemPrice", "discountName", "getDiscountName", "setDiscountName", "extraAdvance", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getExtraAdvance", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setExtraAdvance", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "extraAdvanceAmount", "getExtraAdvanceAmount", "setExtraAdvanceAmount", "groupContract", "Landroidx/constraintlayout/widget/Group;", "getGroupContract", "()Landroidx/constraintlayout/widget/Group;", "setGroupContract", "(Landroidx/constraintlayout/widget/Group;)V", "textContractMonth", "getTextContractMonth", "setTextContractMonth", "bind", "", "item", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.CampiagnDiscountItemAdapter$DiscountItemViewHolder */
    /* loaded from: classes7.dex */
    public static final class DiscountItemViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        public ImageView buttonBin;
        public DtacFontTextView discountCode;
        public DtacFontTextView discountItemPrice;
        public DtacFontTextView discountName;
        public ConstraintLayout extraAdvance;
        public DtacFontTextView extraAdvanceAmount;
        public Group groupContract;
        public DtacFontTextView textContractMonth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountItemViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* renamed from: b */
        public static /* synthetic */ void m20671b(Function1 function1, DiscountItemViewHolder discountItemViewHolder, View view) {
            m20670c(function1, discountItemViewHolder, view);
        }

        /* renamed from: c */
        public static final void m20670c(Function1 listener, DiscountItemViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            listener.invoke(Integer.valueOf(this$0.getAdapterPosition()));
        }

        public final void bind(@NotNull MrtrDiscountItem item, @NotNull final Function1<? super Integer, Unit> listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            View findViewById = view.findViewById(R.id.discountName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.discountName)");
            setDiscountName((DtacFontTextView) findViewById);
            View findViewById2 = view.findViewById(R.id.discountCode);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.discountCode)");
            setDiscountCode((DtacFontTextView) findViewById2);
            View findViewById3 = view.findViewById(R.id.discountItemPrice);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.discountItemPrice)");
            setDiscountItemPrice((DtacFontTextView) findViewById3);
            View findViewById4 = view.findViewById(R.id.groupContract);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.groupContract)");
            setGroupContract((Group) findViewById4);
            View findViewById5 = view.findViewById(R.id.textContractMonth);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.textContractMonth)");
            setTextContractMonth((DtacFontTextView) findViewById5);
            View findViewById6 = view.findViewById(R.id.extraAdvanceAmount);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.extraAdvanceAmount)");
            setExtraAdvanceAmount((DtacFontTextView) findViewById6);
            View findViewById7 = view.findViewById(R.id.extraAdvance);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.extraAdvance)");
            setExtraAdvance((ConstraintLayout) findViewById7);
            View findViewById8 = view.findViewById(R.id.buttonBin);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(R.id.buttonBin)");
            setButtonBin((ImageView) findViewById8);
            DtacFontTextView discountName = getDiscountName();
            String campaignNameCode = item.getCampaignNameCode();
            String name = item.getName();
            discountName.setText(campaignNameCode + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + name);
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
            getButtonBin().setOnClickListener(new View.OnClickListener() { // from class: nl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CampiagnDiscountItemAdapter.DiscountItemViewHolder.m20671b(Function1.this, this, view2);
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
        public final DtacFontTextView getDiscountCode() {
            DtacFontTextView dtacFontTextView = this.discountCode;
            if (dtacFontTextView != null) {
                return dtacFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("discountCode");
            return null;
        }

        @NotNull
        public final DtacFontTextView getDiscountItemPrice() {
            DtacFontTextView dtacFontTextView = this.discountItemPrice;
            if (dtacFontTextView != null) {
                return dtacFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("discountItemPrice");
            return null;
        }

        @NotNull
        public final DtacFontTextView getDiscountName() {
            DtacFontTextView dtacFontTextView = this.discountName;
            if (dtacFontTextView != null) {
                return dtacFontTextView;
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
        public final DtacFontTextView getExtraAdvanceAmount() {
            DtacFontTextView dtacFontTextView = this.extraAdvanceAmount;
            if (dtacFontTextView != null) {
                return dtacFontTextView;
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
        public final DtacFontTextView getTextContractMonth() {
            DtacFontTextView dtacFontTextView = this.textContractMonth;
            if (dtacFontTextView != null) {
                return dtacFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("textContractMonth");
            return null;
        }

        public final void setButtonBin(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.buttonBin = imageView;
        }

        public final void setDiscountCode(@NotNull DtacFontTextView dtacFontTextView) {
            Intrinsics.checkNotNullParameter(dtacFontTextView, "<set-?>");
            this.discountCode = dtacFontTextView;
        }

        public final void setDiscountItemPrice(@NotNull DtacFontTextView dtacFontTextView) {
            Intrinsics.checkNotNullParameter(dtacFontTextView, "<set-?>");
            this.discountItemPrice = dtacFontTextView;
        }

        public final void setDiscountName(@NotNull DtacFontTextView dtacFontTextView) {
            Intrinsics.checkNotNullParameter(dtacFontTextView, "<set-?>");
            this.discountName = dtacFontTextView;
        }

        public final void setExtraAdvance(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
            this.extraAdvance = constraintLayout;
        }

        public final void setExtraAdvanceAmount(@NotNull DtacFontTextView dtacFontTextView) {
            Intrinsics.checkNotNullParameter(dtacFontTextView, "<set-?>");
            this.extraAdvanceAmount = dtacFontTextView;
        }

        public final void setGroupContract(@NotNull Group group) {
            Intrinsics.checkNotNullParameter(group, "<set-?>");
            this.groupContract = group;
        }

        public final void setTextContractMonth(@NotNull DtacFontTextView dtacFontTextView) {
            Intrinsics.checkNotNullParameter(dtacFontTextView, "<set-?>");
            this.textContractMonth = dtacFontTextView;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/CampiagnDiscountItemAdapter$OnItemClick;", "", "onClickDelete", "", "pos", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.CampiagnDiscountItemAdapter$OnItemClick */
    /* loaded from: classes7.dex */
    public interface OnItemClick {
        void onClickDelete(int i);
    }

    public CampiagnDiscountItemAdapter(@NotNull List<MrtrDiscountItem> discountItemList, @NotNull OnItemClick listener) {
        Intrinsics.checkNotNullParameter(discountItemList, "discountItemList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81017a = discountItemList;
        this.f81018b = listener;
    }

    @NotNull
    public final List<MrtrDiscountItem> getDiscountItemList() {
        return this.f81017a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81017a.size();
    }

    @NotNull
    public final OnItemClick getListener() {
        return this.f81018b;
    }

    public final void setDiscountItemList(@NotNull List<MrtrDiscountItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f81017a = list;
    }

    public final void setListener(@NotNull OnItemClick onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "<set-?>");
        this.f81018b = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DiscountItemViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((MrtrDiscountItem) this.f81017a.get(i), new CampiagnDiscountItemAdapter$onBindViewHolder$1(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DiscountItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sales_order_discount_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DiscountItemViewHolder(view);
    }
}