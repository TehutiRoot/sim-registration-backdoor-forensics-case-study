package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnCampaignSelectedListener;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010+¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter$CampaignViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "campaignList", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnCampaignSelectedListener;", "campaignSelectedListener", "<init>", "(Landroid/content/Context;Ljava/util/List;Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnCampaignSelectedListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter$CampaignViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter$CampaignViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnCampaignSelectedListener;", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "getOnItemSelected", "()Lkotlin/jvm/functions/Function0;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function0;)V", "onItemSelected", "e", "I", "getSelectedPosition", "setSelectedPosition", "(I)V", "selectedPosition", "CampaignViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter.OnePrepaidCampaignAdapter */
/* loaded from: classes10.dex */
public final class OnePrepaidCampaignAdapter extends RecyclerView.Adapter<CampaignViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f95663a;

    /* renamed from: b */
    public final List f95664b;

    /* renamed from: c */
    public final OnCampaignSelectedListener f95665c;

    /* renamed from: d */
    public Function0 f95666d;

    /* renamed from: e */
    public int f95667e;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter$CampaignViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnCampaignSelectedListener;", "campaignSelectedListener", "<init>", "(Landroid/view/View;Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnCampaignSelectedListener;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;", "campaign", "", "selectedPosition", "Lkotlin/Function1;", "", "onItemSelected", "bind", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/CampaignItem;ILkotlin/jvm/functions/Function1;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnCampaignSelectedListener;", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvCampaignName", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "arrow", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "Landroidx/constraintlayout/widget/ConstraintLayout;", "itemCampaign", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOnePrepaidCampaignAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePrepaidCampaignAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter$CampaignViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter.OnePrepaidCampaignAdapter$CampaignViewHolder */
    /* loaded from: classes10.dex */
    public static final class CampaignViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final View f95668a;

        /* renamed from: b */
        public final OnCampaignSelectedListener f95669b;

        /* renamed from: c */
        public OneFontTextView f95670c;

        /* renamed from: d */
        public ImageView f95671d;

        /* renamed from: e */
        public ConstraintLayout f95672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CampaignViewHolder(@NotNull View itemView, @NotNull OnCampaignSelectedListener campaignSelectedListener) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(campaignSelectedListener, "campaignSelectedListener");
            this.f95668a = itemView;
            this.f95669b = campaignSelectedListener;
            View findViewById = itemView.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvCampaignName)");
            this.f95670c = (OneFontTextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.arrow);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.arrow)");
            this.f95671d = (ImageView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.itemCampaign);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.itemCampaign)");
            this.f95672e = (ConstraintLayout) findViewById3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(CampaignViewHolder campaignViewHolder, Context context, CampaignItem campaignItem, int i, Function1 function1, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            campaignViewHolder.bind(context, campaignItem, i, function1);
        }

        public final void bind(@NotNull Context context, @NotNull CampaignItem campaign, int i, @Nullable Function1<? super Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(campaign, "campaign");
            OneFontTextView oneFontTextView = this.f95670c;
            String campaignNameTh = campaign.getCampaignNameTh();
            if (campaignNameTh == null) {
                campaignNameTh = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            oneFontTextView.setText(campaignNameTh);
            if (i == getAbsoluteAdapterPosition()) {
                this.f95670c.setTextColor(ContextCompat.getColor(context, R.color.red5));
                this.f95670c.setTypeface(ResourcesCompat.getFont(context, R.font.better_together_bold));
                this.f95672e.setBackgroundResource(R.color.red6);
            } else {
                this.f95670c.setTextColor(ContextCompat.getColor(context, R.color.jet_back));
                this.f95672e.setBackgroundResource(R.color.white);
            }
            View itemView = this.f95668a;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            OnSingleClickListenerKt.setOnSingleClickListener(itemView, new OnePrepaidCampaignAdapter$CampaignViewHolder$bind$2(this, campaign, function1));
        }
    }

    public OnePrepaidCampaignAdapter(@NotNull Context context, @NotNull List<CampaignItem> campaignList, @NotNull OnCampaignSelectedListener campaignSelectedListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignList, "campaignList");
        Intrinsics.checkNotNullParameter(campaignSelectedListener, "campaignSelectedListener");
        this.f95663a = context;
        this.f95664b = campaignList;
        this.f95665c = campaignSelectedListener;
        this.f95667e = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f95664b.size();
    }

    @Nullable
    public final Function0<Unit> getOnItemSelected() {
        return this.f95666d;
    }

    public final int getSelectedPosition() {
        return this.f95667e;
    }

    public final void setOnItemSelected(@Nullable Function0<Unit> function0) {
        this.f95666d = function0;
    }

    public final void setSelectedPosition(int i) {
        this.f95667e = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CampaignViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.f95663a, (CampaignItem) this.f95664b.get(i), this.f95667e, new OnePrepaidCampaignAdapter$onBindViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CampaignViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prepaid_campaign, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new CampaignViewHolder(view, this.f95665c);
    }
}