package th.p047co.dtac.android.dtacone.adapter.campaign.myCampaign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.DisplayThisMonthPointItem;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003%&'B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailCurrentSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayThisMonthPointItem;", "displayPointCurrentSummaryList", "", "isSilver", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "imageResource", "Landroid/widget/ImageView;", "ivImageBanner", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILandroid/widget/ImageView;)V", "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Z", "Companion", "MyCampaignCurrentSummaryCalculateItemViewHolder", "MyCampaignCurrentSummaryItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailCurrentSummaryAdapter */
/* loaded from: classes7.dex */
public final class MyCampaignDetailCurrentSummaryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Context f81155a;

    /* renamed from: b */
    public final List f81156b;

    /* renamed from: c */
    public final boolean f81157c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailCurrentSummaryAdapter$Companion;", "", "()V", "VIEW_TYPE_CALCULATE", "", "VIEW_TYPE_NORMAL", "VIEW_TYPE_NOT_FOUND", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailCurrentSummaryAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailCurrentSummaryAdapter$MyCampaignCurrentSummaryCalculateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailCurrentSummaryAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutCalCurrentSummary", "()Landroid/widget/RelativeLayout;", "layoutCalCurrentSummary", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvCalCurrentSummaryTitle", "()Landroid/widget/TextView;", "tvCalCurrentSummaryTitle", OperatorName.CURVE_TO, "getTvCalCurrentSummaryValue", "tvCalCurrentSummaryValue", "d", "Landroid/view/View;", "getVLine", "()Landroid/view/View;", "vLine", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailCurrentSummaryAdapter$MyCampaignCurrentSummaryCalculateItemViewHolder */
    /* loaded from: classes7.dex */
    public final class MyCampaignCurrentSummaryCalculateItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81158a;

        /* renamed from: b */
        public final TextView f81159b;

        /* renamed from: c */
        public final TextView f81160c;

        /* renamed from: d */
        public final View f81161d;

        /* renamed from: e */
        public final /* synthetic */ MyCampaignDetailCurrentSummaryAdapter f81162e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyCampaignCurrentSummaryCalculateItemViewHolder(@NotNull MyCampaignDetailCurrentSummaryAdapter myCampaignDetailCurrentSummaryAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81162e = myCampaignDetailCurrentSummaryAdapter;
            View findViewById = view.findViewById(R.id.layoutCalCurrentSummary);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81158a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvCalCurrentSummaryTitle);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81159b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvCalCurrentSummaryValue);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81160c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.vLine);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.view.View");
            this.f81161d = findViewById4;
        }

        @NotNull
        public final RelativeLayout getLayoutCalCurrentSummary() {
            return this.f81158a;
        }

        @NotNull
        public final TextView getTvCalCurrentSummaryTitle() {
            return this.f81159b;
        }

        @NotNull
        public final TextView getTvCalCurrentSummaryValue() {
            return this.f81160c;
        }

        @NotNull
        public final View getVLine() {
            return this.f81161d;
        }
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailCurrentSummaryAdapter$MyCampaignCurrentSummaryItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailCurrentSummaryAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutCurrentSummary", "()Landroid/widget/RelativeLayout;", "layoutCurrentSummary", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvCurrentSummaryTitle", "()Landroid/widget/TextView;", "tvCurrentSummaryTitle", OperatorName.CURVE_TO, "getTvCurrentSummaryValue", "tvCurrentSummaryValue", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getIvCurrentSummary", "()Landroid/widget/ImageView;", "ivCurrentSummary", "e", "Landroid/view/View;", "getVLine", "()Landroid/view/View;", "vLine", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailCurrentSummaryAdapter$MyCampaignCurrentSummaryItemViewHolder */
    /* loaded from: classes7.dex */
    public final class MyCampaignCurrentSummaryItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81163a;

        /* renamed from: b */
        public final TextView f81164b;

        /* renamed from: c */
        public final TextView f81165c;

        /* renamed from: d */
        public final ImageView f81166d;

        /* renamed from: e */
        public final View f81167e;

        /* renamed from: f */
        public final /* synthetic */ MyCampaignDetailCurrentSummaryAdapter f81168f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyCampaignCurrentSummaryItemViewHolder(@NotNull MyCampaignDetailCurrentSummaryAdapter myCampaignDetailCurrentSummaryAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81168f = myCampaignDetailCurrentSummaryAdapter;
            View findViewById = view.findViewById(R.id.layoutCurrentSummary);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81163a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvCurrentSummaryTitle);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81164b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvCurrentSummaryValue);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81165c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ivCurrentSummary);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81166d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.vLine);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.view.View");
            this.f81167e = findViewById5;
        }

        @NotNull
        public final ImageView getIvCurrentSummary() {
            return this.f81166d;
        }

        @NotNull
        public final RelativeLayout getLayoutCurrentSummary() {
            return this.f81163a;
        }

        @NotNull
        public final TextView getTvCurrentSummaryTitle() {
            return this.f81164b;
        }

        @NotNull
        public final TextView getTvCurrentSummaryValue() {
            return this.f81165c;
        }

        @NotNull
        public final View getVLine() {
            return this.f81167e;
        }
    }

    public MyCampaignDetailCurrentSummaryAdapter(@NotNull Context context, @NotNull List<DisplayThisMonthPointItem> displayPointCurrentSummaryList, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayPointCurrentSummaryList, "displayPointCurrentSummaryList");
        this.f81155a = context;
        this.f81156b = displayPointCurrentSummaryList;
        this.f81157c = z;
    }

    /* renamed from: a */
    public final void m20584a(int i, ImageView imageView) {
        Glide.with(this.f81155a).clear(imageView);
        Glide.with(this.f81155a).m74227load(Integer.valueOf(i)).fitCenter().into(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81156b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        DisplayThisMonthPointItem displayThisMonthPointItem = (DisplayThisMonthPointItem) this.f81156b.get(i);
        if (AbstractC19741eO1.equals(Constant.CampaignType.TYPE_TEXT, displayThisMonthPointItem.getType(), true)) {
            return 2;
        }
        if (AbstractC19741eO1.equals(Constant.CampaignType.TYPE_NUMBER, displayThisMonthPointItem.getType(), true)) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        DisplayThisMonthPointItem displayThisMonthPointItem = (DisplayThisMonthPointItem) this.f81156b.get(i);
        int i3 = 8;
        if (holder instanceof MyCampaignCurrentSummaryItemViewHolder) {
            MyCampaignCurrentSummaryItemViewHolder myCampaignCurrentSummaryItemViewHolder = (MyCampaignCurrentSummaryItemViewHolder) holder;
            myCampaignCurrentSummaryItemViewHolder.getLayoutCurrentSummary().setVisibility(0);
            if (this.f81157c) {
                i2 = R.drawable.ic_pink_sim;
            } else {
                i2 = R.drawable.ic_pink_circle_star;
            }
            m20584a(i2, myCampaignCurrentSummaryItemViewHolder.getIvCurrentSummary());
            myCampaignCurrentSummaryItemViewHolder.getTvCurrentSummaryTitle().setText(displayThisMonthPointItem.getName());
            myCampaignCurrentSummaryItemViewHolder.getTvCurrentSummaryValue().setText(displayThisMonthPointItem.getValue());
            View vLine = myCampaignCurrentSummaryItemViewHolder.getVLine();
            if (i != getItemCount() - 1) {
                i3 = 0;
            }
            vLine.setVisibility(i3);
        } else if (holder instanceof MyCampaignCurrentSummaryCalculateItemViewHolder) {
            MyCampaignCurrentSummaryCalculateItemViewHolder myCampaignCurrentSummaryCalculateItemViewHolder = (MyCampaignCurrentSummaryCalculateItemViewHolder) holder;
            myCampaignCurrentSummaryCalculateItemViewHolder.getLayoutCalCurrentSummary().setVisibility(0);
            myCampaignCurrentSummaryCalculateItemViewHolder.getTvCalCurrentSummaryTitle().setText(displayThisMonthPointItem.getName());
            myCampaignCurrentSummaryCalculateItemViewHolder.getTvCalCurrentSummaryValue().setText(displayThisMonthPointItem.getValue());
            View vLine2 = myCampaignCurrentSummaryCalculateItemViewHolder.getVLine();
            if (i != getItemCount() - 1) {
                i3 = 0;
            }
            vLine2.setVisibility(i3);
        } else {
            ((MyCampaignCurrentSummaryItemViewHolder) holder).getLayoutCurrentSummary().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i != 1) {
            if (i != 2) {
                View view = LayoutInflater.from(this.f81155a).inflate(R.layout.item_my_campaign_detail_current_summary, parent, false);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                return new MyCampaignCurrentSummaryItemViewHolder(this, view);
            }
            View view2 = LayoutInflater.from(this.f81155a).inflate(R.layout.item_my_campaign_detail_current_summary_calculate, parent, false);
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            return new MyCampaignCurrentSummaryCalculateItemViewHolder(this, view2);
        }
        View view3 = LayoutInflater.from(this.f81155a).inflate(R.layout.item_my_campaign_detail_current_summary, parent, false);
        Intrinsics.checkNotNullExpressionValue(view3, "view");
        return new MyCampaignCurrentSummaryItemViewHolder(this, view3);
    }
}