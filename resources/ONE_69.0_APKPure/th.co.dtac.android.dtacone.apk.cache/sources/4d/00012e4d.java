package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDiscountItemAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002/0B1\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OneDiscountViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", FirebaseAnalytics.Param.ITEMS, "", "searchQuery", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OnSelectItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OnSelectItemListener;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OneDiscountViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OneDiscountViewHolder;I)V", "getItemCount", "()I", TextBundle.TEXT_ENTRY, "filter", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OnSelectItemListener;", "getListener", "()Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OnSelectItemListener;", "", "e", "filteredList", "OnSelectItemListener", "OneDiscountViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDiscountItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDiscountItemAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n766#2:115\n857#2,2:116\n*S KotlinDebug\n*F\n+ 1 OneDiscountItemAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter\n*L\n48#1:115\n48#1:116,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDiscountItemAdapter */
/* loaded from: classes10.dex */
public final class OneDiscountItemAdapter extends RecyclerView.Adapter<OneDiscountViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f90131a;

    /* renamed from: b */
    public List f90132b;

    /* renamed from: c */
    public String f90133c;

    /* renamed from: d */
    public final OnSelectItemListener f90134d;

    /* renamed from: e */
    public final List f90135e;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OnSelectItemListener;", "", "onSelected", "", FirebaseAnalytics.Param.DISCOUNT, "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDiscountItemAdapter$OnSelectItemListener */
    /* loaded from: classes10.dex */
    public interface OnSelectItemListener {
        void onSelected(@NotNull Discount discount);
    }

    @Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter$OneDiscountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDiscountItemAdapter;Landroid/view/View;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvCampaignName", "", "itemText", "searchQuery", "", "d", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;Ljava/lang/String;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "item", "Lkotlin/Function1;", "onSelect", "bindView", "(Lth/co/dtac/android/dtacone/model/device_sale/Discount;Lkotlin/jvm/functions/Function1;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "textViewName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "textViewType", OperatorName.CURVE_TO, "textViewAmount", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDiscountItemAdapter$OneDiscountViewHolder */
    /* loaded from: classes10.dex */
    public final class OneDiscountViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public OneFontTextView f90136a;

        /* renamed from: b */
        public OneFontTextView f90137b;

        /* renamed from: c */
        public OneFontTextView f90138c;

        /* renamed from: d */
        public final /* synthetic */ OneDiscountItemAdapter f90139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneDiscountViewHolder(@NotNull OneDiscountItemAdapter oneDiscountItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f90139d = oneDiscountItemAdapter;
        }

        /* renamed from: b */
        public static /* synthetic */ void m14759b(Function1 function1, Discount discount, View view) {
            m14758c(function1, discount, view);
        }

        /* renamed from: c */
        public static final void m14758c(Function1 onSelect, Discount item, View view) {
            Intrinsics.checkNotNullParameter(onSelect, "$onSelect");
            Intrinsics.checkNotNullParameter(item, "$item");
            onSelect.invoke(item);
        }

        /* renamed from: d */
        private final void m14757d(Context context, OneFontTextView oneFontTextView, String str, String str2) {
            SpannableString spannableString = new SpannableString(str);
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, true, 2, (Object) null);
            if (indexOf$default != -1) {
                int length = str2.length() + indexOf$default;
                int color = ContextCompat.getColor(context, R.color.darkBlueFive);
                spannableString.setSpan(new StyleSpan(1), indexOf$default, length, 33);
                spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, length, 33);
            }
            oneFontTextView.setText(spannableString);
        }

        public final void bindView(@NotNull final Discount item, @NotNull final Function1<? super Discount, Unit> onSelect) {
            String moneyFormatNoFloating;
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            View view = this.itemView;
            OneDiscountItemAdapter oneDiscountItemAdapter = this.f90139d;
            View findViewById = view.findViewById(R.id.textViewName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.textViewName)");
            this.f90136a = (OneFontTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.textViewType);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.textViewType)");
            this.f90137b = (OneFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.textViewAmount);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.textViewAmount)");
            this.f90138c = (OneFontTextView) findViewById3;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            OneFontTextView oneFontTextView = this.f90136a;
            OneFontTextView oneFontTextView2 = null;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewName");
                oneFontTextView = null;
            }
            String name = item.getName();
            String str = "";
            if (name == null) {
                name = "";
            }
            m14757d(context, oneFontTextView, name, oneDiscountItemAdapter.f90133c);
            OneFontTextView oneFontTextView3 = this.f90138c;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewAmount");
                oneFontTextView3 = null;
            }
            Double amount = item.getAmount();
            if (amount != null && (moneyFormatNoFloating = MoneyFormatExtKt.toMoneyFormatNoFloating(amount.doubleValue())) != null) {
                str = moneyFormatNoFloating;
            }
            oneFontTextView3.setText(str);
            if (item.getCampaignType().length() > 0) {
                OneFontTextView oneFontTextView4 = this.f90137b;
                if (oneFontTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewType");
                } else {
                    oneFontTextView2 = oneFontTextView4;
                }
                oneFontTextView2.setText(item.getCampaignTypeDisplay());
            } else {
                OneFontTextView oneFontTextView5 = this.f90137b;
                if (oneFontTextView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewType");
                } else {
                    oneFontTextView2 = oneFontTextView5;
                }
                oneFontTextView2.setVisibility(4);
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: IS0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OneDiscountItemAdapter.OneDiscountViewHolder.m14759b(Function1.this, item, view2);
                }
            });
        }
    }

    public /* synthetic */ OneDiscountItemAdapter(int i, List list, String str, OnSelectItemListener onSelectItemListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? "" : str, onSelectItemListener);
    }

    public final void filter(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f90135e.clear();
        this.f90133c = text;
        if (text.length() > 0) {
            List list = this.f90135e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f90132b) {
                if (StringsKt__StringsKt.contains((CharSequence) ((Discount) obj).getName(), (CharSequence) text, true)) {
                    arrayList.add(obj);
                }
            }
            list.addAll(arrayList);
        } else {
            this.f90135e.addAll(this.f90132b);
        }
        notifyDataSetChanged();
    }

    public final int getIdLayout() {
        return this.f90131a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90135e.size();
    }

    @NotNull
    public final List<Discount> getItems() {
        return this.f90132b;
    }

    @NotNull
    public final OnSelectItemListener getListener() {
        return this.f90134d;
    }

    public final void setItems(@NotNull List<Discount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f90132b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OneDiscountViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((Discount) this.f90135e.get(i), new OneDiscountItemAdapter$onBindViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OneDiscountViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f90131a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OneDiscountViewHolder(this, view);
    }

    public OneDiscountItemAdapter(@LayoutRes int i, @NotNull List<Discount> items, @NotNull String searchQuery, @NotNull OnSelectItemListener listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f90131a = i;
        this.f90132b = items;
        this.f90133c = searchQuery;
        this.f90134d = listener;
        this.f90135e = new ArrayList();
    }
}