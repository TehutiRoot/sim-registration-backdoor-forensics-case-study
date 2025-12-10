package th.p047co.dtac.android.dtacone.view.appOne.tol.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.adapter.OneRegisterTrueOnlineSelectNumberListAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineSelectNumberListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineSelectNumberListAdapter$ViewHolder;", "", "", "data", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineSelectNumberListAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineSelectNumberListAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "Lkotlin/Function1;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function1;)V", "onItemSelected", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.adapter.OneRegisterTrueOnlineSelectNumberListAdapter */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineSelectNumberListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f97675a;

    /* renamed from: b */
    public Function1 f97676b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/adapter/OneRegisterTrueOnlineSelectNumberListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getSelectNumber", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "setSelectNumber", "(Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;)V", "selectNumber", "Landroidx/constraintlayout/widget/ConstraintLayout;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getSelectLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setSelectLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "selectLayout", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.adapter.OneRegisterTrueOnlineSelectNumberListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneFontTextView f97677a;

        /* renamed from: b */
        public ConstraintLayout f97678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.reserveNumberTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.reserveNumberTextView)");
            this.f97677a = (OneFontTextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.reserveNumberLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.reserveNumberLayout)");
            this.f97678b = (ConstraintLayout) findViewById2;
        }

        @NotNull
        public final ConstraintLayout getSelectLayout() {
            return this.f97678b;
        }

        @NotNull
        public final OneFontTextView getSelectNumber() {
            return this.f97677a;
        }

        public final void setSelectLayout(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
            this.f97678b = constraintLayout;
        }

        public final void setSelectNumber(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.f97677a = oneFontTextView;
        }
    }

    public OneRegisterTrueOnlineSelectNumberListAdapter(@Nullable List<String> list) {
        this.f97675a = list;
    }

    /* renamed from: b */
    public static final void m9761b(OneRegisterTrueOnlineSelectNumberListAdapter this$0, int i, View view) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f97676b;
        if (function1 != null) {
            List list = this$0.f97675a;
            function1.invoke((list == null || (str = (String) list.get(i)) == null || (r0 = PhoneNumberExtKt.toLocal(str)) == null) ? "" : "");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f97675a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Nullable
    public final Function1<String, Unit> getOnItemSelected() {
        return this.f97676b;
    }

    public final void setOnItemSelected(@Nullable Function1<? super String, Unit> function1) {
        this.f97676b = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, final int i) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        OneFontTextView selectNumber = holder.getSelectNumber();
        List list = this.f97675a;
        if (i != (list != null ? list.size() : 0) - 1) {
            List list2 = this.f97675a;
            if (list2 == null || (str2 = (String) list2.get(i)) == null || (str = PhoneNumberExtKt.toPretty(str2)) == null) {
                str = "";
            }
        } else {
            List list3 = this.f97675a;
            str = list3 != null ? (String) list3.get(i) : null;
        }
        selectNumber.setText(str);
        holder.getSelectLayout().setOnClickListener(new View.OnClickListener() { // from class: Bb1
            {
                OneRegisterTrueOnlineSelectNumberListAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneRegisterTrueOnlineSelectNumberListAdapter.m9761b(OneRegisterTrueOnlineSelectNumberListAdapter.this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_postpaid_reserved_number, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}