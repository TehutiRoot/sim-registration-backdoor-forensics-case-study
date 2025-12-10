package th.p047co.dtac.android.dtacone.adapter.campaign;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.RewardItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/RewardDescriptionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardItem;", "descriptionList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "Companion", "CampaignRewardDescriptionItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.campaign.RewardDescriptionAdapter */
/* loaded from: classes7.dex */
public final class RewardDescriptionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Context f81123a;

    /* renamed from: b */
    public final List f81124b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/RewardDescriptionAdapter$CampaignRewardDescriptionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/campaign/RewardDescriptionAdapter;Landroid/view/View;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvRewardDescription", "()Landroid/widget/TextView;", "tvRewardDescription", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.RewardDescriptionAdapter$CampaignRewardDescriptionItemViewHolder */
    /* loaded from: classes7.dex */
    public final class CampaignRewardDescriptionItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f81125a;

        /* renamed from: b */
        public final /* synthetic */ RewardDescriptionAdapter f81126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CampaignRewardDescriptionItemViewHolder(@NotNull RewardDescriptionAdapter rewardDescriptionAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81126b = rewardDescriptionAdapter;
            View findViewById = view.findViewById(R.id.tvRewardDescription);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f81125a = (TextView) findViewById;
        }

        @NotNull
        public final TextView getTvRewardDescription() {
            return this.f81125a;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/campaign/RewardDescriptionAdapter$Companion;", "", "()V", "VIEW_TYPE_BOLD", "", "VIEW_TYPE_NORMAL", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.campaign.RewardDescriptionAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RewardDescriptionAdapter(@NotNull Context context, @NotNull List<RewardItem> descriptionList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(descriptionList, "descriptionList");
        this.f81123a = context;
        this.f81124b = descriptionList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81124b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RewardItem rewardItem = (RewardItem) this.f81124b.get(i);
        if (holder instanceof CampaignRewardDescriptionItemViewHolder) {
            if (getItemViewType(i) == 1) {
                SpannableString spannableString = new SpannableString(rewardItem.getName());
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
                ((CampaignRewardDescriptionItemViewHolder) holder).getTvRewardDescription().setText(spannableString);
                return;
            }
            SpannableString spannableString2 = new SpannableString(rewardItem.getName());
            spannableString2.setSpan(new StyleSpan(0), 0, spannableString2.length(), 0);
            ((CampaignRewardDescriptionItemViewHolder) holder).getTvRewardDescription().setText(spannableString2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View view = LayoutInflater.from(this.f81123a).inflate(R.layout.item_campaign_reward_description, p0, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new CampaignRewardDescriptionItemViewHolder(this, view);
    }
}