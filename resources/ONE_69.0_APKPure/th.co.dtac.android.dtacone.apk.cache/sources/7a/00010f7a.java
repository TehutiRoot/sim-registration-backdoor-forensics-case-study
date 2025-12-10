package th.p047co.dtac.android.dtacone.adapter.eSIM;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.eSIM.ESimNumberListAdapter;
import th.p047co.dtac.android.dtacone.adapter.listener.item.OnClickItemListener;
import th.p047co.dtac.android.dtacone.model.esim.TelephoneNumberListItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimNumberListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimNumberListAdapter$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/esim/TelephoneNumberListItem;", "telephoneNumberList", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/app/Activity;Ljava/util/List;Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/eSIM/ESimNumberListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/eSIM/ESimNumberListAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "getListener", "()Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimNumberListAdapter */
/* loaded from: classes7.dex */
public final class ESimNumberListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f81278a;

    /* renamed from: b */
    public final List f81279b;

    /* renamed from: c */
    public final OnClickItemListener f81280c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimNumberListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/esim/TelephoneNumberListItem;", "item", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bind", "(Lth/co/dtac/android/dtacone/model/esim/TelephoneNumberListItem;Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "labelNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimNumberListAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final DtacFontTextView f81281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.label_number);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.label_number)");
            this.f81281a = (DtacFontTextView) findViewById;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20541b(OnClickItemListener onClickItemListener, TelephoneNumberListItem telephoneNumberListItem, View view) {
            m20540c(onClickItemListener, telephoneNumberListItem, view);
        }

        /* renamed from: c */
        public static final void m20540c(OnClickItemListener listener, TelephoneNumberListItem telephoneNumberListItem, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            listener.setOnClickItem(telephoneNumberListItem);
        }

        public final void bind(@Nullable final TelephoneNumberListItem telephoneNumberListItem, @NotNull final OnClickItemListener<? super TelephoneNumberListItem> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f81281a.setText((telephoneNumberListItem == null || (r1 = telephoneNumberListItem.getDisplayTelephoneNumber()) == null) ? "" : "");
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: xN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ESimNumberListAdapter.ViewHolder.m20541b(OnClickItemListener.this, telephoneNumberListItem, view);
                }
            });
        }
    }

    public ESimNumberListAdapter(@NotNull Activity activity, @Nullable List<TelephoneNumberListItem> list, @NotNull OnClickItemListener<? super TelephoneNumberListItem> listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81278a = activity;
        this.f81279b = list;
        this.f81280c = listener;
    }

    @NotNull
    public final Activity getActivity() {
        return this.f81278a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81279b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @NotNull
    public final OnClickItemListener<TelephoneNumberListItem> getListener() {
        return this.f81280c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f81279b;
        holder.bind(list != null ? (TelephoneNumberListItem) list.get(i) : null, this.f81280c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81278a).inflate(R.layout.item_esim_select_number, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}