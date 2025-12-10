package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.model.OneAdditionalAdvance;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OneCheckBlacklistAdditionalAdvanceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OneCheckBlacklistAdditionalAdvanceAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/model/OneAdditionalAdvance;", CollectionUtils.LIST_TYPE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidThemeColorModel;", "theme", "<init>", "(Ljava/util/List;Landroid/content/Context;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidThemeColorModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OneCheckBlacklistAdditionalAdvanceAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OneCheckBlacklistAdditionalAdvanceAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidThemeColorModel;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OneCheckBlacklistAdditionalAdvanceAdapter */
/* loaded from: classes10.dex */
public final class OneCheckBlacklistAdditionalAdvanceAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f93270a;

    /* renamed from: b */
    public final Context f93271b;

    /* renamed from: c */
    public final OnePostpaidThemeColorModel f93272c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OneCheckBlacklistAdditionalAdvanceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidThemeColorModel;", "theme", "", "setTheme", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidThemeColorModel;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getLabelText", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "labelText", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValueText", "valueText", "Landroid/widget/LinearLayout;", OperatorName.CURVE_TO, "Landroid/widget/LinearLayout;", "getRowLayout", "()Landroid/widget/LinearLayout;", "rowLayout", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OneCheckBlacklistAdditionalAdvanceAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneFontTextView f93273a;

        /* renamed from: b */
        public final OneFontTextView f93274b;

        /* renamed from: c */
        public final LinearLayout f93275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.labelTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.labelTextView)");
            this.f93273a = (OneFontTextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.valueTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.valueTextView)");
            this.f93274b = (OneFontTextView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.rowItemLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.rowItemLayout)");
            this.f93275c = (LinearLayout) findViewById3;
        }

        @NotNull
        public final OneFontTextView getLabelText() {
            return this.f93273a;
        }

        @NotNull
        public final LinearLayout getRowLayout() {
            return this.f93275c;
        }

        @NotNull
        public final OneFontTextView getValueText() {
            return this.f93274b;
        }

        public final void setTheme(@NotNull OnePostpaidThemeColorModel theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.f93274b.setTextColor(ContextCompat.getColor(this.itemView.getContext(), theme.getFontColor()));
        }
    }

    public OneCheckBlacklistAdditionalAdvanceAdapter(@NotNull List<OneAdditionalAdvance> list, @NotNull Context context, @NotNull OnePostpaidThemeColorModel theme) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f93270a = list;
        this.f93271b = context;
        this.f93272c = theme;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f93270a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i % 2 == 0) {
            holder.getRowLayout().setBackgroundResource(R.color.whiteThree);
        }
        OneFontTextView labelText = holder.getLabelText();
        String label = ((OneAdditionalAdvance) this.f93270a.get(i)).getLabel();
        if (label == null) {
            label = "";
        }
        labelText.setText(label);
        OneFontTextView valueText = holder.getValueText();
        String value = ((OneAdditionalAdvance) this.f93270a.get(i)).getValue();
        valueText.setText(value != null ? value : "");
        holder.setTheme(this.f93272c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f93271b).inflate(R.layout.item_additional_advance, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}