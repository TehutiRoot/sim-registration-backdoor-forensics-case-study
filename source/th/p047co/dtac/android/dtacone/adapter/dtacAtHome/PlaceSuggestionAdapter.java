package th.p047co.dtac.android.dtacone.adapter.dtacAtHome;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.fontbox.ttf.PostScriptTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.dtacAtHome.PlaceSuggestionAdapter;
import th.p047co.dtac.android.dtacone.model.dtacAtHome.placeSuggest.PlaceSuggestionItem;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003/01B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J3\u0010%\u001a\u00020\f2\n\u0010\u001a\u001a\u00060!R\u00020\u00002\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010+R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/dtacAtHome/placeSuggest/PlaceSuggestionItem;", "placeSuggestionList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "", "word", "", "setSearchWord", "(Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$OnClickPlaceSuggestion;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$OnClickPlaceSuggestion;)V", "Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$PlaceSuggestionItemViewHolder;", Constant.FLAVOR_PREPRODUCTION, "mid", PostScriptTable.TAG, OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$PlaceSuggestionItemViewHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "Ljava/lang/String;", "searchWord", "d", "Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$OnClickPlaceSuggestion;", "Companion", "OnClickPlaceSuggestion", "PlaceSuggestionItemViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.dtacAtHome.PlaceSuggestionAdapter */
/* loaded from: classes7.dex */
public final class PlaceSuggestionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81176a;

    /* renamed from: b */
    public final List f81177b;

    /* renamed from: c */
    public String f81178c;

    /* renamed from: d */
    public OnClickPlaceSuggestion f81179d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.dtacAtHome.PlaceSuggestionAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$OnClickPlaceSuggestion;", "", "onClickPlaceSuggestionItem", "", "placeSuggest", "Lth/co/dtac/android/dtacone/model/dtacAtHome/placeSuggest/PlaceSuggestionItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.dtacAtHome.PlaceSuggestionAdapter$OnClickPlaceSuggestion */
    /* loaded from: classes7.dex */
    public interface OnClickPlaceSuggestion {
        void onClickPlaceSuggestionItem(@NotNull PlaceSuggestionItem placeSuggestionItem);
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter$PlaceSuggestionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceSuggestionAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutPlaceSuggestion", "()Landroid/widget/RelativeLayout;", "layoutPlaceSuggestion", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvPrePlaceSuggestion", "()Landroid/widget/TextView;", "tvPrePlaceSuggestion", OperatorName.CURVE_TO, "getTvMidPlaceSuggestion", "tvMidPlaceSuggestion", "d", "getTvPostPlaceSuggestion", "tvPostPlaceSuggestion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.dtacAtHome.PlaceSuggestionAdapter$PlaceSuggestionItemViewHolder */
    /* loaded from: classes7.dex */
    public final class PlaceSuggestionItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81180a;

        /* renamed from: b */
        public final TextView f81181b;

        /* renamed from: c */
        public final TextView f81182c;

        /* renamed from: d */
        public final TextView f81183d;

        /* renamed from: e */
        public final /* synthetic */ PlaceSuggestionAdapter f81184e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaceSuggestionItemViewHolder(@NotNull PlaceSuggestionAdapter placeSuggestionAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81184e = placeSuggestionAdapter;
            View findViewById = view.findViewById(R.id.layoutPlaceSuggestion);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81180a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvPrePlaceSuggestion);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81181b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvMidPlaceSuggestion);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81182c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvPostPlaceSuggestion);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f81183d = (TextView) findViewById4;
        }

        @NotNull
        public final RelativeLayout getLayoutPlaceSuggestion() {
            return this.f81180a;
        }

        @NotNull
        public final TextView getTvMidPlaceSuggestion() {
            return this.f81182c;
        }

        @NotNull
        public final TextView getTvPostPlaceSuggestion() {
            return this.f81183d;
        }

        @NotNull
        public final TextView getTvPrePlaceSuggestion() {
            return this.f81181b;
        }
    }

    @Inject
    public PlaceSuggestionAdapter(@NotNull Activity activity, @Nullable List<PlaceSuggestionItem> list) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81176a = activity;
        this.f81177b = list;
        this.f81178c = "";
    }

    /* renamed from: a */
    public static /* synthetic */ void m20369a(OnClickPlaceSuggestion onClickPlaceSuggestion, PlaceSuggestionItem placeSuggestionItem, View view) {
        m20368b(onClickPlaceSuggestion, placeSuggestionItem, view);
    }

    /* renamed from: b */
    public static final void m20368b(OnClickPlaceSuggestion theListener, PlaceSuggestionItem placeSuggest, View view) {
        Intrinsics.checkNotNullParameter(theListener, "$theListener");
        Intrinsics.checkNotNullParameter(placeSuggest, "$placeSuggest");
        theListener.onClickPlaceSuggestionItem(placeSuggest);
    }

    /* renamed from: c */
    public final void m20367c(PlaceSuggestionItemViewHolder placeSuggestionItemViewHolder, String str, String str2, String str3) {
        placeSuggestionItemViewHolder.getTvPrePlaceSuggestion().setText(str);
        placeSuggestionItemViewHolder.getTvMidPlaceSuggestion().setText(str2);
        placeSuggestionItemViewHolder.getTvPostPlaceSuggestion().setText(str3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81177b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list2 = this.f81177b;
        Intrinsics.checkNotNull(list2);
        final PlaceSuggestionItem placeSuggestionItem = (PlaceSuggestionItem) list2.get(i);
        if (holder instanceof PlaceSuggestionItemViewHolder) {
            String locationName = placeSuggestionItem.getLocationName();
            if (locationName != null) {
                list = StringsKt__StringsKt.split$default((CharSequence) locationName, new String[]{this.f81178c}, false, 0, 6, (Object) null);
            } else {
                list = null;
            }
            List list3 = list;
            if (list3 != null && !list3.isEmpty()) {
                if (list.size() == 2 && ((CharSequence) list.get(0)).length() == 0) {
                    m20367c((PlaceSuggestionItemViewHolder) holder, "", String.valueOf(this.f81178c), (String) list.get(1));
                } else if (list.size() > 2) {
                    m20367c((PlaceSuggestionItemViewHolder) holder, "", "", placeSuggestionItem.getLocationName());
                } else {
                    m20367c((PlaceSuggestionItemViewHolder) holder, "", "", placeSuggestionItem.getLocationName());
                }
            } else {
                PlaceSuggestionItemViewHolder placeSuggestionItemViewHolder = (PlaceSuggestionItemViewHolder) holder;
                String locationName2 = placeSuggestionItem.getLocationName();
                if (locationName2 == null) {
                    locationName2 = "";
                }
                m20367c(placeSuggestionItemViewHolder, "", "", locationName2);
            }
            final OnClickPlaceSuggestion onClickPlaceSuggestion = this.f81179d;
            if (onClickPlaceSuggestion != null) {
                ((PlaceSuggestionItemViewHolder) holder).getLayoutPlaceSuggestion().setOnClickListener(new View.OnClickListener() { // from class: rk1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PlaceSuggestionAdapter.m20369a(onClickPlaceSuggestion, placeSuggestionItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81176a).inflate(R.layout.item_place_suggestion, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new PlaceSuggestionItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickPlaceSuggestion listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81179d = listener;
    }

    public final void setSearchWord(@NotNull String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        this.f81178c = word;
    }
}
