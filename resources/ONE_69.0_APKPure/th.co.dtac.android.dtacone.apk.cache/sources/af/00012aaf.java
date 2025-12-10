package th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\u00142\n\u0010\u0012\u001a\u00060\u0017R\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneCampaignRewardProgressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/campaign/reward/RewardRoadmapItem;", "roadMapList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneCampaignRewardProgressAdapter$RewardProgressItemViewHolder;", "topLine", "dotCenter", "bottomLine", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneCampaignRewardProgressAdapter$RewardProgressItemViewHolder;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "RewardProgressItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneCampaignRewardProgressAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignRewardProgressAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneCampaignRewardProgressAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneCampaignRewardProgressAdapter */
/* loaded from: classes10.dex */
public final class OneCampaignRewardProgressAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f88705a;

    /* renamed from: b */
    public final List f88706b;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneCampaignRewardProgressAdapter$RewardProgressItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneCampaignRewardProgressAdapter;Landroid/view/View;)V", "Landroid/widget/ImageView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/ImageView;", "getIvLineTop", "()Landroid/widget/ImageView;", "ivLineTop", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIvLineBottom", "ivLineBottom", OperatorName.CURVE_TO, "getIvDotCenter", "ivDotCenter", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTvCampaignRewardDataLeft", "()Landroid/widget/TextView;", "tvCampaignRewardDataLeft", "e", "getTvCampaignRewardDataRight", "tvCampaignRewardDataRight", OperatorName.FILL_NON_ZERO, "Landroid/view/View;", "getVSeparateLine", "()Landroid/view/View;", "vSeparateLine", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneCampaignRewardProgressAdapter$RewardProgressItemViewHolder */
    /* loaded from: classes10.dex */
    public final class RewardProgressItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f88707a;

        /* renamed from: b */
        public final ImageView f88708b;

        /* renamed from: c */
        public final ImageView f88709c;

        /* renamed from: d */
        public final TextView f88710d;

        /* renamed from: e */
        public final TextView f88711e;

        /* renamed from: f */
        public final View f88712f;

        /* renamed from: g */
        public final /* synthetic */ OneCampaignRewardProgressAdapter f88713g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RewardProgressItemViewHolder(@NotNull OneCampaignRewardProgressAdapter oneCampaignRewardProgressAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f88713g = oneCampaignRewardProgressAdapter;
            View findViewById = view.findViewById(R.id.ivLineTop);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88707a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ivLineBottom);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88708b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ivDotCenter);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88709c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCampaignRewardDataLeft);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f88710d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvCampaignRewardDataRight);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f88711e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.vSeparateLine);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.view.View");
            this.f88712f = findViewById6;
        }

        @NotNull
        public final ImageView getIvDotCenter() {
            return this.f88709c;
        }

        @NotNull
        public final ImageView getIvLineBottom() {
            return this.f88708b;
        }

        @NotNull
        public final ImageView getIvLineTop() {
            return this.f88707a;
        }

        @NotNull
        public final TextView getTvCampaignRewardDataLeft() {
            return this.f88710d;
        }

        @NotNull
        public final TextView getTvCampaignRewardDataRight() {
            return this.f88711e;
        }

        @NotNull
        public final View getVSeparateLine() {
            return this.f88712f;
        }
    }

    public OneCampaignRewardProgressAdapter(@NotNull Activity activity, @NotNull List<RewardRoadmapItem> roadMapList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(roadMapList, "roadMapList");
        this.f88705a = activity;
        this.f88706b = roadMapList;
    }

    /* renamed from: a */
    public final void m15825a(RewardProgressItemViewHolder rewardProgressItemViewHolder, Integer num, Integer num2, Integer num3) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        if (num != null) {
            rewardProgressItemViewHolder.getIvLineTop().setImageResource(num.intValue());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            rewardProgressItemViewHolder.getIvLineTop().setImageDrawable(null);
        }
        if (num2 != null) {
            rewardProgressItemViewHolder.getIvDotCenter().setImageResource(num2.intValue());
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            rewardProgressItemViewHolder.getIvDotCenter().setImageDrawable(null);
        }
        if (num3 != null) {
            rewardProgressItemViewHolder.getIvLineBottom().setImageResource(num3.intValue());
            unit3 = Unit.INSTANCE;
        } else {
            unit3 = null;
        }
        if (unit3 == null) {
            rewardProgressItemViewHolder.getIvLineBottom().setImageDrawable(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f88706b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r4.setText(r6);
        r4 = r1.getVSeparateLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r19 != (getItemCount() - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        r4.setVisibility(r5);
        r3 = r3.getTypeLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        r4 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r4 == (-544733242)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r4 == 1367893783) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r4 == 1700031792) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r3.equals("FILL_LINE") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
        if (r19 != (getItemCount() - 1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r4 = r19 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (p000.AbstractC19741eO1.equals$default(((th.p047co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem) r17.f88706b.get(r4)).getTypeLine(), "EMPTY_LINE", false, 2, null) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r3 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
        if (p000.AbstractC19741eO1.equals$default(((th.p047co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem) r17.f88706b.get(r4)).getTypeLine(), "EMPTY_DOT", false, 2, null) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
        r3 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
        r3 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_red_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
        if (r19 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
        r10 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_red_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
        m15825a(r1, r10, java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_red_dot), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
        if (r3.equals("EMPTY_DOT") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
        if (r19 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
        r2 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_dot_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
        m15825a(r1, r2, java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_dot), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
        if (r3.equals("EMPTY_LINE") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0128, code lost:
        if (r19 != (getItemCount() - 1)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
        if (p000.AbstractC19741eO1.equals$default(((th.p047co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem) r17.f88706b.get(r19 + 1)).getTypeLine(), "EMPTY_DOT", false, 2, null) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
        r3 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
        r3 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
        if (r19 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
        r10 = java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_line);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
        m15825a(r1, r10, java.lang.Integer.valueOf(th.p047co.dtac.android.dtacone.R.drawable.campaign_reward_grey_dot), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter.OneCampaignRewardProgressAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f88705a).inflate(R.layout.item_one_campaign_reward_progress, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new RewardProgressItemViewHolder(this, view);
    }
}