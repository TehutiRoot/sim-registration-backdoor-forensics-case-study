package th.p047co.dtac.android.dtacone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.MainPackAdapter;
import th.p047co.dtac.android.dtacone.model.changeMainPack.packageList.response.MainPackage;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'()B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/MainPackAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "", "Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/MainPackage;", "mainPackList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/MainPackAdapter$OnClickMainPack;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/MainPackAdapter$OnClickMainPack;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getMainPackList", "()Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/MainPackAdapter$OnClickMainPack;", "Companion", "MainPackItemViewHolder", "OnClickMainPack", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.MainPackAdapter */
/* loaded from: classes7.dex */
public final class MainPackAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Context f80931a;

    /* renamed from: b */
    public final List f80932b;

    /* renamed from: c */
    public OnClickMainPack f80933c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/MainPackAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.MainPackAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/MainPackAdapter$MainPackItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/MainPackAdapter;Landroid/view/View;)V", "Landroid/widget/LinearLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/LinearLayout;", "getItemLayout", "()Landroid/widget/LinearLayout;", "setItemLayout", "(Landroid/widget/LinearLayout;)V", "itemLayout", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvMainPackName", "()Landroid/widget/TextView;", "setTvMainPackName", "(Landroid/widget/TextView;)V", "tvMainPackName", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.MainPackAdapter$MainPackItemViewHolder */
    /* loaded from: classes7.dex */
    public final class MainPackItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LinearLayout f80934a;

        /* renamed from: b */
        public TextView f80935b;

        /* renamed from: c */
        public final /* synthetic */ MainPackAdapter f80936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainPackItemViewHolder(@NotNull MainPackAdapter mainPackAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f80936c = mainPackAdapter;
            View findViewById = view.findViewById(R.id.itemLayout);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f80934a = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvMainPackName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f80935b = (TextView) findViewById2;
        }

        @NotNull
        public final LinearLayout getItemLayout() {
            return this.f80934a;
        }

        @NotNull
        public final TextView getTvMainPackName() {
            return this.f80935b;
        }

        public final void setItemLayout(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.f80934a = linearLayout;
        }

        public final void setTvMainPackName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f80935b = textView;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/MainPackAdapter$OnClickMainPack;", "", "onClickMainPackItem", "", "mainPack", "Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/MainPackage;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.MainPackAdapter$OnClickMainPack */
    /* loaded from: classes7.dex */
    public interface OnClickMainPack {
        void onClickMainPackItem(@NotNull MainPackage mainPackage);
    }

    public MainPackAdapter(@NotNull Context mContext, @NotNull List<MainPackage> mainPackList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mainPackList, "mainPackList");
        this.f80931a = mContext;
        this.f80932b = mainPackList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20492a(MainPackAdapter mainPackAdapter, MainPackage mainPackage, View view) {
        m20491b(mainPackAdapter, mainPackage, view);
    }

    /* renamed from: b */
    public static final void m20491b(MainPackAdapter this$0, MainPackage mainPack, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mainPack, "$mainPack");
        OnClickMainPack onClickMainPack = this$0.f80933c;
        if (onClickMainPack != null) {
            onClickMainPack.onClickMainPackItem(mainPack);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f80932b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @NotNull
    public final Context getMContext() {
        return this.f80931a;
    }

    @NotNull
    public final List<MainPackage> getMainPackList() {
        return this.f80932b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final MainPackage mainPackage = (MainPackage) this.f80932b.get(i);
        if (holder instanceof MainPackItemViewHolder) {
            MainPackItemViewHolder mainPackItemViewHolder = (MainPackItemViewHolder) holder;
            mainPackItemViewHolder.getTvMainPackName().setText(mainPackage.getPackageName());
            mainPackItemViewHolder.getItemLayout().setOnClickListener(new View.OnClickListener() { // from class: Cn0
                {
                    MainPackAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainPackAdapter.m20492a(MainPackAdapter.this, mainPackage, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f80931a).inflate(R.layout.item_main_pack_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new MainPackItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickMainPack listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80933c = listener;
    }
}
