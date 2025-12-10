package th.p047co.dtac.android.dtacone.adapter.campaign.myCampaign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.campaign.RewardDescriptionAdapter;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.RewardItem;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.CampaignDetailHistoryItem;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.DisplayPointDetailItem;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.image.LoadImageUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000278B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J)\u0010)\u001a\u00020\u00122\n\u0010#\u001a\u00060&R\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0007H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;", "loadImageUtil", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "historyPointList", "", "isSilver", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;Ljava/util/List;Z)V", "", "imageResource", "Landroid/widget/ImageView;", "ivImageBanner", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILandroid/widget/ImageView;)V", "", "id", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Landroid/widget/ImageView;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter$MyCampaignPointHistoryItemViewHolder;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/DisplayPointDetailItem;", "descriptionList", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter$MyCampaignPointHistoryItemViewHolder;Ljava/util/List;)V", "Landroid/content/Context;", "Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;", "Ljava/util/List;", "d", "Z", "Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/HistoryDescriptionAdapter;", "adapter", "Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/HistoryDescriptionAdapter;", "getAdapter", "()Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/HistoryDescriptionAdapter;", "setAdapter", "(Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/HistoryDescriptionAdapter;)V", "Companion", "MyCampaignPointHistoryItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMyCampaignDetailPointHIstoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyCampaignDetailPointHIstoryAdapter.kt\nth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailPointHIstoryAdapter */
/* loaded from: classes7.dex */
public final class MyCampaignDetailPointHIstoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Context f81169a;
    public HistoryDescriptionAdapter adapter;

    /* renamed from: b */
    public final LoadImageUtil f81170b;

    /* renamed from: c */
    public final List f81171c;

    /* renamed from: d */
    public final boolean f81172d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailPointHIstoryAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010)\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010,\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010/\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019R\u0017\u00102\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter$MyCampaignPointHistoryItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/campaign/myCampaign/MyCampaignDetailPointHIstoryAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutReward", "()Landroid/widget/RelativeLayout;", "layoutReward", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLayoutDescription", "layoutDescription", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.CURVE_TO, "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerItemDescription", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerItemDescription", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getIvHistoryIcon", "()Landroid/widget/ImageView;", "ivHistoryIcon", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTvHistoryTitle", "()Landroid/widget/TextView;", "tvHistoryTitle", OperatorName.FILL_NON_ZERO, "getTvHistoryTitleCenter", "tvHistoryTitleCenter", OperatorName.NON_STROKING_GRAY, "getTvHistoryDate", "tvHistoryDate", OperatorName.CLOSE_PATH, "getTvHistoryPoint", "tvHistoryPoint", "i", "getTvHistoryPointUnit", "tvHistoryPointUnit", OperatorName.SET_LINE_JOINSTYLE, "getIvGetReward", "ivGetReward", OperatorName.NON_STROKING_CMYK, "getRecyclerReward", "recyclerReward", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.myCampaign.MyCampaignDetailPointHIstoryAdapter$MyCampaignPointHistoryItemViewHolder */
    /* loaded from: classes7.dex */
    public final class MyCampaignPointHistoryItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81173a;

        /* renamed from: b */
        public final RelativeLayout f81174b;

        /* renamed from: c */
        public final RecyclerView f81175c;

        /* renamed from: d */
        public final ImageView f81176d;

        /* renamed from: e */
        public final TextView f81177e;

        /* renamed from: f */
        public final TextView f81178f;

        /* renamed from: g */
        public final TextView f81179g;

        /* renamed from: h */
        public final TextView f81180h;

        /* renamed from: i */
        public final TextView f81181i;

        /* renamed from: j */
        public final ImageView f81182j;

        /* renamed from: k */
        public final RecyclerView f81183k;

        /* renamed from: l */
        public final /* synthetic */ MyCampaignDetailPointHIstoryAdapter f81184l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyCampaignPointHistoryItemViewHolder(@NotNull MyCampaignDetailPointHIstoryAdapter myCampaignDetailPointHIstoryAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81184l = myCampaignDetailPointHIstoryAdapter;
            View findViewById = view.findViewById(R.id.layoutReward);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81173a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.layoutDescription);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81174b = (RelativeLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.recyclerItemDescription);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            this.f81175c = (RecyclerView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ivHistoryIcon);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81176d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvHistoryTitle);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f81177e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvHistoryTitleCenter);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.f81178f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tvHistoryDate);
            Intrinsics.checkNotNull(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.f81179g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.tvHistoryPoint);
            Intrinsics.checkNotNull(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f81180h = (TextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.tvHistoryPointUnit);
            Intrinsics.checkNotNull(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.f81181i = (TextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.ivGetReward);
            Intrinsics.checkNotNull(findViewById10, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81182j = (ImageView) findViewById10;
            View findViewById11 = view.findViewById(R.id.recyclerReward);
            Intrinsics.checkNotNull(findViewById11, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            this.f81183k = (RecyclerView) findViewById11;
        }

        @NotNull
        public final ImageView getIvGetReward() {
            return this.f81182j;
        }

        @NotNull
        public final ImageView getIvHistoryIcon() {
            return this.f81176d;
        }

        @NotNull
        public final RelativeLayout getLayoutDescription() {
            return this.f81174b;
        }

        @NotNull
        public final RelativeLayout getLayoutReward() {
            return this.f81173a;
        }

        @NotNull
        public final RecyclerView getRecyclerItemDescription() {
            return this.f81175c;
        }

        @NotNull
        public final RecyclerView getRecyclerReward() {
            return this.f81183k;
        }

        @NotNull
        public final TextView getTvHistoryDate() {
            return this.f81179g;
        }

        @NotNull
        public final TextView getTvHistoryPoint() {
            return this.f81180h;
        }

        @NotNull
        public final TextView getTvHistoryPointUnit() {
            return this.f81181i;
        }

        @NotNull
        public final TextView getTvHistoryTitle() {
            return this.f81177e;
        }

        @NotNull
        public final TextView getTvHistoryTitleCenter() {
            return this.f81178f;
        }
    }

    public MyCampaignDetailPointHIstoryAdapter(@NotNull Context context, @NotNull LoadImageUtil loadImageUtil, @NotNull List<CampaignDetailHistoryItem> historyPointList, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loadImageUtil, "loadImageUtil");
        Intrinsics.checkNotNullParameter(historyPointList, "historyPointList");
        this.f81169a = context;
        this.f81170b = loadImageUtil;
        this.f81171c = historyPointList;
        this.f81172d = z;
    }

    /* renamed from: a */
    private final void m20583a(int i, ImageView imageView) {
        Glide.with(this.f81169a).clear(imageView);
        Glide.with(this.f81169a).m74227load(Integer.valueOf(i)).fitCenter().into(imageView);
    }

    /* renamed from: b */
    private final void m20582b(String str, ImageView imageView) {
        Glide.with(this.f81169a).clear(imageView);
        Glide.with(this.f81169a).m74228load((Object) this.f81170b.getGlideUrlByIdWithHeader(str)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).error(ContextCompat.getDrawable(this.f81169a, R.drawable.image_default)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
    }

    /* renamed from: c */
    public final void m20581c(MyCampaignPointHistoryItemViewHolder myCampaignPointHistoryItemViewHolder, List list) {
        myCampaignPointHistoryItemViewHolder.getLayoutDescription().setVisibility(0);
        setAdapter(new HistoryDescriptionAdapter(this.f81169a, list));
        myCampaignPointHistoryItemViewHolder.getRecyclerItemDescription().setLayoutManager(new LinearLayoutManager(this.f81169a, 1, false));
        myCampaignPointHistoryItemViewHolder.getRecyclerItemDescription().setHasFixedSize(true);
        myCampaignPointHistoryItemViewHolder.getRecyclerItemDescription().setNestedScrollingEnabled(false);
        myCampaignPointHistoryItemViewHolder.getRecyclerItemDescription().setAdapter(getAdapter());
    }

    @NotNull
    public final HistoryDescriptionAdapter getAdapter() {
        HistoryDescriptionAdapter historyDescriptionAdapter = this.adapter;
        if (historyDescriptionAdapter != null) {
            return historyDescriptionAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81171c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        CampaignDetailHistoryItem campaignDetailHistoryItem = (CampaignDetailHistoryItem) this.f81171c.get(i);
        if (holder instanceof MyCampaignPointHistoryItemViewHolder) {
            if (AbstractC19741eO1.equals$default(campaignDetailHistoryItem.getPointType(), Constant.CampaignType.HISTORY_TYPE_ADJUST, false, 2, null)) {
                if (this.f81172d) {
                    i3 = R.drawable.ic_sim_edit_circle;
                } else {
                    i3 = R.drawable.ic_star_edit_circle;
                }
                MyCampaignPointHistoryItemViewHolder myCampaignPointHistoryItemViewHolder = (MyCampaignPointHistoryItemViewHolder) holder;
                m20583a(i3, myCampaignPointHistoryItemViewHolder.getIvHistoryIcon());
                myCampaignPointHistoryItemViewHolder.getTvHistoryTitle().setText(campaignDetailHistoryItem.getDisplayPointType());
                myCampaignPointHistoryItemViewHolder.getTvHistoryTitle().setVisibility(0);
                myCampaignPointHistoryItemViewHolder.getTvHistoryDate().setVisibility(0);
                myCampaignPointHistoryItemViewHolder.getTvHistoryTitleCenter().setVisibility(8);
                List<DisplayPointDetailItem> displayPointDetail = campaignDetailHistoryItem.getDisplayPointDetail();
                if (displayPointDetail == null) {
                    displayPointDetail = new ArrayList<>();
                }
                m20581c(myCampaignPointHistoryItemViewHolder, displayPointDetail);
            } else if (AbstractC19741eO1.equals$default(campaignDetailHistoryItem.getPointType(), Constant.CampaignType.HISTORY_TYPE_REDEEM, false, 2, null)) {
                MyCampaignPointHistoryItemViewHolder myCampaignPointHistoryItemViewHolder2 = (MyCampaignPointHistoryItemViewHolder) holder;
                m20583a(R.drawable.ic_gift_circle, myCampaignPointHistoryItemViewHolder2.getIvHistoryIcon());
                myCampaignPointHistoryItemViewHolder2.getTvHistoryTitle().setText(campaignDetailHistoryItem.getDisplayPointType());
                myCampaignPointHistoryItemViewHolder2.getTvHistoryTitle().setVisibility(0);
                myCampaignPointHistoryItemViewHolder2.getTvHistoryDate().setVisibility(0);
                myCampaignPointHistoryItemViewHolder2.getTvHistoryTitleCenter().setVisibility(8);
            } else if (AbstractC19741eO1.equals$default(campaignDetailHistoryItem.getPointType(), Constant.CampaignType.HISTORY_TYPE_POINT, false, 2, null)) {
                if (this.f81172d) {
                    i2 = R.drawable.ic_sim_add_circle;
                } else {
                    i2 = R.drawable.ic_star_add_circle;
                }
                MyCampaignPointHistoryItemViewHolder myCampaignPointHistoryItemViewHolder3 = (MyCampaignPointHistoryItemViewHolder) holder;
                m20583a(i2, myCampaignPointHistoryItemViewHolder3.getIvHistoryIcon());
                myCampaignPointHistoryItemViewHolder3.getTvHistoryTitleCenter().setText(campaignDetailHistoryItem.getDisplayPointType());
                myCampaignPointHistoryItemViewHolder3.getTvHistoryTitle().setVisibility(8);
                myCampaignPointHistoryItemViewHolder3.getTvHistoryDate().setVisibility(8);
                myCampaignPointHistoryItemViewHolder3.getTvHistoryTitleCenter().setVisibility(0);
                List<DisplayPointDetailItem> displayPointDetail2 = campaignDetailHistoryItem.getDisplayPointDetail();
                if (displayPointDetail2 == null) {
                    displayPointDetail2 = new ArrayList<>();
                }
                m20581c(myCampaignPointHistoryItemViewHolder3, displayPointDetail2);
            } else {
                MyCampaignPointHistoryItemViewHolder myCampaignPointHistoryItemViewHolder4 = (MyCampaignPointHistoryItemViewHolder) holder;
                myCampaignPointHistoryItemViewHolder4.getTvHistoryTitle().setText(campaignDetailHistoryItem.getDisplayPointType());
                myCampaignPointHistoryItemViewHolder4.getTvHistoryTitle().setVisibility(0);
                myCampaignPointHistoryItemViewHolder4.getTvHistoryDate().setVisibility(0);
                myCampaignPointHistoryItemViewHolder4.getTvHistoryTitleCenter().setVisibility(8);
            }
            MyCampaignPointHistoryItemViewHolder myCampaignPointHistoryItemViewHolder5 = (MyCampaignPointHistoryItemViewHolder) holder;
            myCampaignPointHistoryItemViewHolder5.getTvHistoryPoint().setText(campaignDetailHistoryItem.getDisplayTotalPoint());
            myCampaignPointHistoryItemViewHolder5.getTvHistoryPointUnit().setText(campaignDetailHistoryItem.getPointUnit());
            myCampaignPointHistoryItemViewHolder5.getTvHistoryDate().setText(campaignDetailHistoryItem.getDisplayCampaignSumDate());
            myCampaignPointHistoryItemViewHolder5.getLayoutReward().setVisibility(0);
            if (campaignDetailHistoryItem.getDisplayImage() != null) {
                myCampaignPointHistoryItemViewHolder5.getLayoutReward().setVisibility(0);
                String imageId = campaignDetailHistoryItem.getDisplayImage().getImageId();
                if (imageId != null) {
                    m20582b(imageId, myCampaignPointHistoryItemViewHolder5.getIvGetReward());
                }
                Context context = this.f81169a;
                List<RewardItem> imageDetail = campaignDetailHistoryItem.getDisplayImage().getImageDetail();
                if (imageDetail == null) {
                    imageDetail = new ArrayList<>();
                }
                RewardDescriptionAdapter rewardDescriptionAdapter = new RewardDescriptionAdapter(context, imageDetail);
                myCampaignPointHistoryItemViewHolder5.getRecyclerReward().setLayoutManager(new LinearLayoutManager(this.f81169a, 1, false));
                myCampaignPointHistoryItemViewHolder5.getRecyclerReward().setItemAnimator(new DefaultItemAnimator());
                myCampaignPointHistoryItemViewHolder5.getRecyclerReward().setNestedScrollingEnabled(false);
                myCampaignPointHistoryItemViewHolder5.getRecyclerReward().setAdapter(rewardDescriptionAdapter);
                return;
            }
            myCampaignPointHistoryItemViewHolder5.getLayoutReward().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81169a).inflate(R.layout.item_my_campaign_detail_point_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new MyCampaignPointHistoryItemViewHolder(this, view);
    }

    public final void setAdapter(@NotNull HistoryDescriptionAdapter historyDescriptionAdapter) {
        Intrinsics.checkNotNullParameter(historyDescriptionAdapter, "<set-?>");
        this.adapter = historyDescriptionAdapter;
    }
}