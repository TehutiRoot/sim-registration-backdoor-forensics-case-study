package th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign.DiscountItemAdapter;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-B'\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 ¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$DiscountViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", FirebaseAnalytics.Param.ITEMS, "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$OnSelectItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/util/List;Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$OnSelectItemListener;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$DiscountViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$DiscountViewHolder;I)V", "getItemCount", "()I", "", TextBundle.TEXT_ENTRY, "filter", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$OnSelectItemListener;", "getListener", "()Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$OnSelectItemListener;", "", "d", "filteredList", "DiscountViewHolder", "OnSelectItemListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDiscountItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscountItemAdapter.kt\nth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n766#2:78\n857#2,2:79\n*S KotlinDebug\n*F\n+ 1 DiscountItemAdapter.kt\nth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter\n*L\n40#1:78\n40#1:79,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.campaign.DiscountItemAdapter */
/* loaded from: classes9.dex */
public final class DiscountItemAdapter extends RecyclerView.Adapter<DiscountViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f100083a;

    /* renamed from: b */
    public List f100084b;

    /* renamed from: c */
    public final OnSelectItemListener f100085c;

    /* renamed from: d */
    public final List f100086d;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$DiscountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "item", "Lkotlin/Function1;", "", "onSelect", "bindView", "(Lth/co/dtac/android/dtacone/model/device_sale/Discount;Lkotlin/jvm/functions/Function1;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "textViewName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "textViewType", OperatorName.CURVE_TO, "textViewAmount", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.campaign.DiscountItemAdapter$DiscountViewHolder */
    /* loaded from: classes9.dex */
    public final class DiscountViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public DtacFontTextView f100087a;

        /* renamed from: b */
        public DtacFontTextView f100088b;

        /* renamed from: c */
        public DtacFontTextView f100089c;

        /* renamed from: d */
        public final /* synthetic */ DiscountItemAdapter f100090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountViewHolder(@NotNull DiscountItemAdapter discountItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f100090d = discountItemAdapter;
        }

        /* renamed from: c */
        public static final void m8030c(Function1 onSelect, Discount item, View view) {
            Intrinsics.checkNotNullParameter(onSelect, "$onSelect");
            Intrinsics.checkNotNullParameter(item, "$item");
            onSelect.invoke(item);
        }

        public final void bindView(@NotNull final Discount item, @NotNull final Function1<? super Discount, Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            View view = this.itemView;
            View findViewById = view.findViewById(R.id.textViewName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.textViewName)");
            this.f100087a = (DtacFontTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.textViewType);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.textViewType)");
            this.f100088b = (DtacFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.textViewAmount);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.textViewAmount)");
            this.f100089c = (DtacFontTextView) findViewById3;
            DtacFontTextView dtacFontTextView = this.f100087a;
            DtacFontTextView dtacFontTextView2 = null;
            if (dtacFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewName");
                dtacFontTextView = null;
            }
            String name = item.getName();
            String str = "";
            if (name == null) {
                name = "";
            }
            dtacFontTextView.setText(name);
            DtacFontTextView dtacFontTextView3 = this.f100089c;
            if (dtacFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewAmount");
                dtacFontTextView3 = null;
            }
            Double amount = item.getAmount();
            if (amount != null) {
                String str2 = MoneyFormatExtKt.toMoneyFormatNoFloating(amount.doubleValue()) + " บ.";
                if (str2 != null) {
                    str = str2;
                }
            }
            dtacFontTextView3.setText(str);
            if (item.getCampaignType().length() > 0) {
                DtacFontTextView dtacFontTextView4 = this.f100088b;
                if (dtacFontTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewType");
                } else {
                    dtacFontTextView2 = dtacFontTextView4;
                }
                dtacFontTextView2.setText(item.getCampaignTypeDisplay());
            } else {
                DtacFontTextView dtacFontTextView5 = this.f100088b;
                if (dtacFontTextView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewType");
                } else {
                    dtacFontTextView2 = dtacFontTextView5;
                }
                dtacFontTextView2.setVisibility(4);
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: fJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DiscountItemAdapter.DiscountViewHolder.m8030c(onSelect, item, view2);
                }
            });
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountItemAdapter$OnSelectItemListener;", "", "onSelected", "", FirebaseAnalytics.Param.DISCOUNT, "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.campaign.DiscountItemAdapter$OnSelectItemListener */
    /* loaded from: classes9.dex */
    public interface OnSelectItemListener {
        void onSelected(@NotNull Discount discount);
    }

    public DiscountItemAdapter(@LayoutRes int i, @NotNull List<Discount> items, @NotNull OnSelectItemListener listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f100083a = i;
        this.f100084b = items;
        this.f100085c = listener;
        this.f100086d = new ArrayList();
    }

    public final void filter(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f100086d.clear();
        if (text.length() > 0) {
            List list = this.f100086d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f100084b) {
                if (StringsKt__StringsKt.contains((CharSequence) ((Discount) obj).getName(), (CharSequence) text, true)) {
                    arrayList.add(obj);
                }
            }
            list.addAll(arrayList);
        } else {
            this.f100086d.addAll(this.f100084b);
        }
        notifyDataSetChanged();
    }

    public final int getIdLayout() {
        return this.f100083a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f100086d.size();
    }

    @NotNull
    public final List<Discount> getItems() {
        return this.f100084b;
    }

    @NotNull
    public final OnSelectItemListener getListener() {
        return this.f100085c;
    }

    public final void setItems(@NotNull List<Discount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f100084b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DiscountViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((Discount) this.f100086d.get(i), new DiscountItemAdapter$onBindViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DiscountViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f100083a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DiscountViewHolder(this, view);
    }
}