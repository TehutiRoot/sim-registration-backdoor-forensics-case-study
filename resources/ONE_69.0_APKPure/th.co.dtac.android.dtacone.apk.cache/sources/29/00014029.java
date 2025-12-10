package th.p047co.dtac.android.dtacone.view.appOne.tol.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.tol.adapter.OneRegisterTrueOnlineDiscountAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0007R0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineDiscountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineDiscountAdapter$OneRegisterTrueOnlineDiscountViewHolder;", "", "", "dataList", "<init>", "(Ljava/util/List;)V", "newDataList", "", "update", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineDiscountAdapter$OneRegisterTrueOnlineDiscountViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineDiscountAdapter$OneRegisterTrueOnlineDiscountViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "Lkotlin/Function1;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function1;)V", "onItemSelected", "OneRegisterTrueOnlineDiscountViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.adapter.OneRegisterTrueOnlineDiscountAdapter */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineDiscountAdapter extends RecyclerView.Adapter<OneRegisterTrueOnlineDiscountViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f97669a;

    /* renamed from: b */
    public Function1 f97670b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineDiscountAdapter$OneRegisterTrueOnlineDiscountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "item", "", "bind", "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.adapter.OneRegisterTrueOnlineDiscountAdapter$OneRegisterTrueOnlineDiscountViewHolder */
    /* loaded from: classes10.dex */
    public static final class OneRegisterTrueOnlineDiscountViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneFontTextView f97671a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneRegisterTrueOnlineDiscountViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f97671a = (OneFontTextView) itemView.findViewById(R.id.tvItem);
        }

        public final void bind(@NotNull String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f97671a.setText(item);
        }
    }

    public OneRegisterTrueOnlineDiscountAdapter() {
        this(null, 1, null);
    }

    /* renamed from: b */
    public static final void m9765b(OneRegisterTrueOnlineDiscountAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f97670b;
        if (function1 != null) {
            function1.invoke(this$0.f97669a.get(i));
        }
    }

    @NotNull
    public final List<String> getDataList() {
        return this.f97669a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97669a.size();
    }

    @Nullable
    public final Function1<String, Unit> getOnItemSelected() {
        return this.f97670b;
    }

    public final void setDataList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97669a = list;
    }

    public final void setOnItemSelected(@Nullable Function1<? super String, Unit> function1) {
        this.f97670b = function1;
    }

    public final void update(@NotNull List<String> newDataList) {
        Intrinsics.checkNotNullParameter(newDataList, "newDataList");
        this.f97669a = newDataList;
        notifyItemRangeChanged(0, newDataList.size());
    }

    public /* synthetic */ OneRegisterTrueOnlineDiscountAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OneRegisterTrueOnlineDiscountViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((String) this.f97669a.get(i));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ib1
            {
                OneRegisterTrueOnlineDiscountAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneRegisterTrueOnlineDiscountAdapter.m9765b(OneRegisterTrueOnlineDiscountAdapter.this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OneRegisterTrueOnlineDiscountViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_register_true_online_discount, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OneRegisterTrueOnlineDiscountViewHolder(view);
    }

    public OneRegisterTrueOnlineDiscountAdapter(@NotNull List<String> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f97669a = dataList;
    }
}