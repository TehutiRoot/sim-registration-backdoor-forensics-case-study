package th.p047co.dtac.android.dtacone.app_one.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.adapter.OnePhoneNumberAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter$ViewHolder;", "<init>", "()V", "", "", CollectionUtils.LIST_TYPE, "", "setData", "(Ljava/util/List;)V", OperatorName.CLOSE_AND_STROKE, "setLastSelected", "(Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "lastSelected", "Lkotlin/Function1;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "getOnSelectItem", "()Lkotlin/jvm/functions/Function1;", "setOnSelectItem", "(Lkotlin/jvm/functions/Function1;)V", "onSelectItem", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.adapter.OnePhoneNumberAdapter */
/* loaded from: classes7.dex */
public final class OnePhoneNumberAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81666a = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: b */
    public String f81667b;

    /* renamed from: c */
    public Function1 f81668c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "item", "lastSelected", "Lkotlin/Function1;", "", "click", "bind", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/constraintlayout/widget/ConstraintLayout;", "content", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.adapter.OnePhoneNumberAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final View f81669a;

        /* renamed from: b */
        public final ConstraintLayout f81670b;

        /* renamed from: c */
        public final OneFontTextView f81671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f81669a = itemView;
            View findViewById = itemView.findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.content)");
            this.f81670b = (ConstraintLayout) findViewById;
            View findViewById2 = itemView.findViewById(R.id.tvNumber);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tvNumber)");
            this.f81671c = (OneFontTextView) findViewById2;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20364b(ViewHolder viewHolder, View view) {
            m20362d(viewHolder, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20363c(Function1 function1, String str, View view) {
            m20361e(function1, str, view);
        }

        /* renamed from: d */
        public static final void m20362d(ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f81669a.performClick();
        }

        /* renamed from: e */
        public static final void m20361e(Function1 click, String item, View view) {
            Intrinsics.checkNotNullParameter(click, "$click");
            Intrinsics.checkNotNullParameter(item, "$item");
            click.invoke(item);
        }

        @SuppressLint({"ResourceAsColor"})
        public final void bind(@NotNull final String item, @Nullable String str, @NotNull final Function1<? super String, Unit> click) {
            String str2;
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(click, "click");
            this.f81671c.setText(PhoneNumberExtKt.toPretty(item));
            if (str != null) {
                str2 = PhoneNumberExtKt.toInternational(str);
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, PhoneNumberExtKt.toInternational(item))) {
                this.f81670b.setBackgroundResource(R.color.red6);
                OneFontTextView oneFontTextView = this.f81671c;
                oneFontTextView.setTypeface(oneFontTextView.getTypeface(), 1);
                this.f81671c.setTextColor(ContextCompat.getColor(this.f81669a.getContext(), R.color.red5));
            } else {
                OneFontTextView oneFontTextView2 = this.f81671c;
                oneFontTextView2.setTypeface(oneFontTextView2.getTypeface(), 0);
                this.f81671c.setTextColor(ContextCompat.getColor(this.f81669a.getContext(), R.color.jet_back));
                this.f81670b.setBackgroundResource(R.color.white);
            }
            this.f81671c.setOnClickListener(new View.OnClickListener() { // from class: g11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnePhoneNumberAdapter.ViewHolder.m20364b(OnePhoneNumberAdapter.ViewHolder.this, view);
                }
            });
            this.f81669a.setOnClickListener(new View.OnClickListener() { // from class: h11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnePhoneNumberAdapter.ViewHolder.m20363c(Function1.this, item, view);
                }
            });
        }

        @NotNull
        public final View getItemView() {
            return this.f81669a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81666a.size();
    }

    @Nullable
    public final Function1<String, Unit> getOnSelectItem() {
        return this.f81668c;
    }

    public final void setData(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f81666a = list;
    }

    public final void setLastSelected(@Nullable String str) {
        this.f81667b = str;
    }

    public final void setOnSelectItem(@Nullable Function1<? super String, Unit> function1) {
        this.f81668c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"NotifyDataSetChanged"})
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((String) this.f81666a.get(i), this.f81667b, new OnePhoneNumberAdapter$onBindViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_phone_number, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}