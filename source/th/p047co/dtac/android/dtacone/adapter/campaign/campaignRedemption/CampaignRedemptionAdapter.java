package th.p047co.dtac.android.dtacone.adapter.campaign.campaignRedemption;

import android.app.Activity;
import android.util.DisplayMetrics;
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
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.campaign.campaignRedemption.CampaignRedemptionAdapter;
import th.p047co.dtac.android.dtacone.model.campaign.list.CampaignItem;
import th.p047co.dtac.android.dtacone.util.WindowUtil;
import th.p047co.dtac.android.dtacone.util.image.LoadImageUtil;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00030/1B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-¨\u00062"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;", "loadImageUtil", "Landroid/app/Activity;", "activity", "<init>", "(Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;Landroid/app/Activity;)V", "", "id", "Landroid/widget/ImageView;", "ivImageBanner", "", "d", "(Ljava/lang/String;Landroid/widget/ImageView;)V", "", "Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", "listSetting", "setList", "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter$OnClickMyCampaign;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter$OnClickMyCampaign;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/util/image/LoadImageUtil;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/app/Activity;", "Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter$OnClickMyCampaign;", "Ljava/util/List;", "myCampaignList", "Companion", "CampaignRedemptionViewHolder", "OnClickMyCampaign", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCampaignRedemptionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignRedemptionAdapter.kt\nth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.campaignRedemption.CampaignRedemptionAdapter */
/* loaded from: classes7.dex */
public final class CampaignRedemptionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final LoadImageUtil f81036a;

    /* renamed from: b */
    public final Activity f81037b;

    /* renamed from: c */
    public OnClickMyCampaign f81038c;

    /* renamed from: d */
    public List f81039d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter$CampaignRedemptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutCampaign", "()Landroid/widget/RelativeLayout;", "layoutCampaign", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "getIvCampaignBanner", "()Landroid/widget/ImageView;", "ivCampaignBanner", "Landroid/widget/TextView;", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "getTvCampaignName", "()Landroid/widget/TextView;", "tvCampaignName", "d", "getTvCampaignDetail", "tvCampaignDetail", "e", "getBtnJoinCampaign", "btnJoinCampaign", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.campaignRedemption.CampaignRedemptionAdapter$CampaignRedemptionViewHolder */
    /* loaded from: classes7.dex */
    public static final class CampaignRedemptionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final RelativeLayout f81040a;

        /* renamed from: b */
        public final ImageView f81041b;

        /* renamed from: c */
        public final TextView f81042c;

        /* renamed from: d */
        public final TextView f81043d;

        /* renamed from: e */
        public final TextView f81044e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CampaignRedemptionViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.layoutCampaign);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81040a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivCampaignBanner);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81041b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81042c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCampaignDetail);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f81043d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.btnJoinCampaign);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.view.DtacFontButton");
            this.f81044e = (DtacFontButton) findViewById5;
        }

        @NotNull
        public final TextView getBtnJoinCampaign() {
            return this.f81044e;
        }

        @NotNull
        public final ImageView getIvCampaignBanner() {
            return this.f81041b;
        }

        @NotNull
        public final RelativeLayout getLayoutCampaign() {
            return this.f81040a;
        }

        @NotNull
        public final TextView getTvCampaignDetail() {
            return this.f81043d;
        }

        @NotNull
        public final TextView getTvCampaignName() {
            return this.f81042c;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.campaignRedemption.CampaignRedemptionAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/campaignRedemption/CampaignRedemptionAdapter$OnClickMyCampaign;", "", "onClickCampaignRedemptionItem", "", "campaign", "Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.campaignRedemption.CampaignRedemptionAdapter$OnClickMyCampaign */
    /* loaded from: classes7.dex */
    public interface OnClickMyCampaign {
        void onClickCampaignRedemptionItem(@NotNull CampaignItem campaignItem);
    }

    @Inject
    public CampaignRedemptionAdapter(@NotNull LoadImageUtil loadImageUtil, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(loadImageUtil, "loadImageUtil");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81036a = loadImageUtil;
        this.f81037b = activity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20419a(OnClickMyCampaign onClickMyCampaign, CampaignItem campaignItem, View view) {
        m20415e(onClickMyCampaign, campaignItem, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20418b(RecyclerView.ViewHolder viewHolder, View view) {
        m20414f(viewHolder, view);
    }

    /* renamed from: d */
    private final void m20416d(String str, ImageView imageView) {
        Glide.with(this.f81037b).clear(imageView);
        Glide.with(this.f81037b).m74044load((Object) this.f81036a.getGlideUrlByIdWithHeader(str)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f81037b, R.drawable.image_banner_default)).error(ContextCompat.getDrawable(this.f81037b, R.drawable.image_banner_default)).transform(new CenterCrop(), new RoundedCornersTransformation((int) WindowUtil.Companion.convertDpToPx(this.f81037b, 8.0f), 0, RoundedCornersTransformation.CornerType.TOP)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
    }

    /* renamed from: e */
    public static final void m20415e(OnClickMyCampaign theListener, CampaignItem campaign, View view) {
        Intrinsics.checkNotNullParameter(theListener, "$theListener");
        Intrinsics.checkNotNullParameter(campaign, "$campaign");
        theListener.onClickCampaignRedemptionItem(campaign);
    }

    /* renamed from: f */
    public static final void m20414f(RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        ((CampaignRedemptionViewHolder) holder).getLayoutCampaign().performClick();
    }

    /* renamed from: c */
    public final int m20417c() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f81037b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81039d;
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
    public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f81039d;
        Intrinsics.checkNotNull(list);
        final CampaignItem campaignItem = (CampaignItem) list.get(i);
        if (holder instanceof CampaignRedemptionViewHolder) {
            if (getItemCount() > 1) {
                ((CampaignRedemptionViewHolder) holder).getLayoutCampaign().getLayoutParams().width = AbstractC21140mr0.roundToInt(m20417c() * 0.78d);
            }
            CampaignRedemptionViewHolder campaignRedemptionViewHolder = (CampaignRedemptionViewHolder) holder;
            campaignRedemptionViewHolder.getLayoutCampaign().getLayoutParams();
            campaignRedemptionViewHolder.getTvCampaignName().setText(campaignItem.getCampaignName());
            TextView tvCampaignDetail = campaignRedemptionViewHolder.getTvCampaignDetail();
            String display_redemption_period_label = campaignItem.getDisplay_redemption_period_label();
            String display_redemption_period = campaignItem.getDisplay_redemption_period();
            tvCampaignDetail.setText(display_redemption_period_label + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + display_redemption_period);
            String campaignImageId = campaignItem.getCampaignImageId();
            if (campaignImageId != null) {
                m20416d(campaignImageId, campaignRedemptionViewHolder.getIvCampaignBanner());
            }
            final OnClickMyCampaign onClickMyCampaign = this.f81038c;
            if (onClickMyCampaign != null) {
                campaignRedemptionViewHolder.getLayoutCampaign().setOnClickListener(new View.OnClickListener() { // from class: fl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CampaignRedemptionAdapter.m20419a(onClickMyCampaign, campaignItem, view);
                    }
                });
                campaignRedemptionViewHolder.getBtnJoinCampaign().setOnClickListener(new View.OnClickListener() { // from class: gl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CampaignRedemptionAdapter.m20418b(RecyclerView.ViewHolder.this, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81037b).inflate(R.layout.item_campaign_redemption, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new CampaignRedemptionViewHolder(view);
    }

    public final void setList(@NotNull List<CampaignItem> listSetting) {
        Intrinsics.checkNotNullParameter(listSetting, "listSetting");
        this.f81039d = listSetting;
    }

    public final void setListener(@NotNull OnClickMyCampaign listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81038c = listener;
    }
}
