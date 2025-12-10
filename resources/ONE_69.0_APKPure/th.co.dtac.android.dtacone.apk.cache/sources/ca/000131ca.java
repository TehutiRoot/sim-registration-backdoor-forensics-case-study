package th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.PropositionData;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPropositionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPropositionAdapter$OneMnpPropositionViewHolder;", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PropositionData;", "propositionList", "Lkotlin/Function0;", "", "getSearchText", "Lkotlin/Function1;", "", "onClickItem", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, TextBundle.TEXT_ENTRY, SearchIntents.EXTRA_QUERY, "Landroid/text/SpannableString;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPropositionAdapter$OneMnpPropositionViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPropositionAdapter$OneMnpPropositionViewHolder;I)V", "Ljava/util/List;", "getPropositionList", "()Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", "getGetSearchText", "()Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "getOnClickItem", "()Lkotlin/jvm/functions/Function1;", "d", "Landroid/content/Context;", "OneMnpPropositionViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPropositionAdapter */
/* loaded from: classes10.dex */
public final class OneMnpPropositionAdapter extends RecyclerView.Adapter<OneMnpPropositionViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f91397a;

    /* renamed from: b */
    public final Function0 f91398b;

    /* renamed from: c */
    public final Function1 f91399c;

    /* renamed from: d */
    public Context f91400d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPropositionAdapter$OneMnpPropositionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvCampaignName", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvCampaignName", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPropositionAdapter$OneMnpPropositionViewHolder */
    /* loaded from: classes10.dex */
    public static final class OneMnpPropositionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneFontTextView f91401a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneMnpPropositionViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.OneFontTextView");
            this.f91401a = (OneFontTextView) findViewById;
        }

        @NotNull
        public final OneFontTextView getTvCampaignName() {
            return this.f91401a;
        }
    }

    public OneMnpPropositionAdapter(@NotNull List<PropositionData> propositionList, @NotNull Function0<String> getSearchText, @NotNull Function1<? super PropositionData, Unit> onClickItem) {
        Intrinsics.checkNotNullParameter(propositionList, "propositionList");
        Intrinsics.checkNotNullParameter(getSearchText, "getSearchText");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        this.f91397a = propositionList;
        this.f91398b = getSearchText;
        this.f91399c = onClickItem;
    }

    /* renamed from: a */
    private final SpannableString m13981a(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int color = ContextCompat.getColor(context, R.color.red5);
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, true, 2, (Object) null);
        if (indexOf$default != -1) {
            spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, str2.length() + indexOf$default, 33);
        }
        return spannableString;
    }

    @NotNull
    public final Function0<String> getGetSearchText() {
        return this.f91398b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91397a.size();
    }

    @NotNull
    public final Function1<PropositionData, Unit> getOnClickItem() {
        return this.f91399c;
    }

    @NotNull
    public final List<PropositionData> getPropositionList() {
        return this.f91397a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OneMnpPropositionViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PropositionData propositionData = (PropositionData) this.f91397a.get(i);
        String str = (String) this.f91398b.invoke();
        OneFontTextView tvCampaignName = holder.getTvCampaignName();
        Context context = this.f91400d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            context = null;
        }
        String propositionInfo = propositionData.getPropositionInfo();
        if (propositionInfo == null) {
            propositionInfo = "";
        }
        tvCampaignName.setText(m13981a(context, propositionInfo, str));
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        OnSingleClickListenerKt.setOnSingleClickListener(view, new OneMnpPropositionAdapter$onBindViewHolder$1(this, propositionData));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OneMnpPropositionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_campaign_list, parent, false);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        this.f91400d = context;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OneMnpPropositionViewHolder(view);
    }
}