package th.p047co.dtac.android.dtacone.adapter.campaign.newCampaign;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.List;
import javax.inject.Inject;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.campaign.newCampaign.NewCampaignAdapter;
import th.p047co.dtac.android.dtacone.model.campaign.list.CampaignItem;
import th.p047co.dtac.android.dtacone.util.WindowUtil;
import th.p047co.dtac.android.dtacone.util.image.LoadImageUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003/01B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;", "loadImageUtil", "Landroid/app/Activity;", "activity", "<init>", "(Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;Landroid/app/Activity;)V", "", "id", "Landroid/widget/ImageView;", "ivImageBanner", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Landroid/widget/ImageView;)V", "", "Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", CollectionUtils.LIST_TYPE, "setList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter$OnClickNewCampaign;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter$OnClickNewCampaign;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;", "Landroid/app/Activity;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter$OnClickNewCampaign;", "d", "Ljava/util/List;", "newCampaignList", "Companion", "NewCampaignItemViewHolder", "OnClickNewCampaign", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNewCampaignAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCampaignAdapter.kt\nth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.newCampaign.NewCampaignAdapter */
/* loaded from: classes7.dex */
public final class NewCampaignAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final LoadImageUtil f81094a;

    /* renamed from: b */
    public final Activity f81095b;

    /* renamed from: c */
    public OnClickNewCampaign f81096c;

    /* renamed from: d */
    public List f81097d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.newCampaign.NewCampaignAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter$NewCampaignItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutNewCampaign", "()Landroid/widget/RelativeLayout;", "layoutNewCampaign", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "getIvCampaignBanner", "()Landroid/widget/ImageView;", "ivCampaignBanner", "Landroid/widget/TextView;", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "getTvCampaignName", "()Landroid/widget/TextView;", "tvCampaignName", "d", "getTvCampaignDetail", "tvCampaignDetail", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.newCampaign.NewCampaignAdapter$NewCampaignItemViewHolder */
    /* loaded from: classes7.dex */
    public final class NewCampaignItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81098a;

        /* renamed from: b */
        public final ImageView f81099b;

        /* renamed from: c */
        public final TextView f81100c;

        /* renamed from: d */
        public final TextView f81101d;

        /* renamed from: e */
        public final /* synthetic */ NewCampaignAdapter f81102e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewCampaignItemViewHolder(@NotNull NewCampaignAdapter newCampaignAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81102e = newCampaignAdapter;
            View findViewById = view.findViewById(R.id.layoutNewCampaign);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81098a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivCampaignBanner);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81099b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81100c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCampaignDetail);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f81101d = (TextView) findViewById4;
        }

        @NotNull
        public final ImageView getIvCampaignBanner() {
            return this.f81099b;
        }

        @NotNull
        public final RelativeLayout getLayoutNewCampaign() {
            return this.f81098a;
        }

        @NotNull
        public final TextView getTvCampaignDetail() {
            return this.f81101d;
        }

        @NotNull
        public final TextView getTvCampaignName() {
            return this.f81100c;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/newCampaign/NewCampaignAdapter$OnClickNewCampaign;", "", "onClickNewCampaignItem", "", "campaign", "Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.newCampaign.NewCampaignAdapter$OnClickNewCampaign */
    /* loaded from: classes7.dex */
    public interface OnClickNewCampaign {
        void onClickNewCampaignItem(@NotNull CampaignItem campaignItem);
    }

    @Inject
    public NewCampaignAdapter(@NotNull LoadImageUtil loadImageUtil, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(loadImageUtil, "loadImageUtil");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81094a = loadImageUtil;
        this.f81095b = activity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20405a(NewCampaignAdapter newCampaignAdapter, CampaignItem campaignItem, View view) {
        m20403c(newCampaignAdapter, campaignItem, view);
    }

    /* renamed from: b */
    private final void m20404b(String str, ImageView imageView) {
        Glide.with(this.f81095b).clear(imageView);
        Glide.with(this.f81095b).m74044load((Object) this.f81094a.getGlideUrlByIdWithHeader(str)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f81095b, R.drawable.image_banner_default)).error(ContextCompat.getDrawable(this.f81095b, R.drawable.image_banner_default)).transform(new RoundedCornersTransformation((int) WindowUtil.Companion.convertDpToPx(this.f81095b, 8.0f), 0, RoundedCornersTransformation.CornerType.LEFT)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
    }

    /* renamed from: c */
    public static final void m20403c(NewCampaignAdapter this$0, CampaignItem campaign, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(campaign, "$campaign");
        OnClickNewCampaign onClickNewCampaign = this$0.f81096c;
        if (onClickNewCampaign != null) {
            onClickNewCampaign.onClickNewCampaignItem(campaign);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81097d;
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
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f81097d;
        Intrinsics.checkNotNull(list);
        final CampaignItem campaignItem = (CampaignItem) list.get(i);
        if (holder instanceof NewCampaignItemViewHolder) {
            NewCampaignItemViewHolder newCampaignItemViewHolder = (NewCampaignItemViewHolder) holder;
            newCampaignItemViewHolder.getTvCampaignName().setText(campaignItem.getCampaignName());
            newCampaignItemViewHolder.getTvCampaignDetail().setText(campaignItem.getDisplayOptInPeriod());
            String campaignImageId = campaignItem.getCampaignImageId();
            if (campaignImageId != null) {
                m20404b(campaignImageId, newCampaignItemViewHolder.getIvCampaignBanner());
            }
            if (this.f81096c != null) {
                newCampaignItemViewHolder.getLayoutNewCampaign().setOnClickListener(new View.OnClickListener() { // from class: eH0
                    {
                        NewCampaignAdapter.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewCampaignAdapter.m20405a(NewCampaignAdapter.this, campaignItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81095b).inflate(R.layout.item_new_campaign, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new NewCampaignItemViewHolder(this, view);
    }

    public final void setList(@NotNull List<CampaignItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f81097d = list;
    }

    public final void setListener(@NotNull OnClickNewCampaign listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81096c = listener;
    }
}
