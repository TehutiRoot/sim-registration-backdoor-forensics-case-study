package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.device_sale.Campaign;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleCampaignAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002/0B1\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$CampaignViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", FirebaseAnalytics.Param.ITEMS, "", "searchQuery", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$OnSelectItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$OnSelectItemListener;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$CampaignViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$CampaignViewHolder;I)V", "getItemCount", "()I", TextBundle.TEXT_ENTRY, "filter", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$OnSelectItemListener;", "getListener", "()Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$OnSelectItemListener;", "", "e", "filteredList", "CampaignViewHolder", "OnSelectItemListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDeviceSaleCampaignAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleCampaignAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n766#2:118\n857#2,2:119\n*S KotlinDebug\n*F\n+ 1 OneDeviceSaleCampaignAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter\n*L\n49#1:118\n49#1:119,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleCampaignAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignAdapter extends RecyclerView.Adapter<CampaignViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f90113a;

    /* renamed from: b */
    public List f90114b;

    /* renamed from: c */
    public String f90115c;

    /* renamed from: d */
    public final OnSelectItemListener f90116d;

    /* renamed from: e */
    public final List f90117e;

    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$CampaignViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "item", "Lkotlin/Function1;", "", "onSelect", "bindView", "(Lth/co/dtac/android/dtacone/model/device_sale/Campaign;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvCampaignName", "", "itemText", "searchQuery", "d", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "textViewName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "textViewType", OperatorName.CURVE_TO, "textViewTime", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleCampaignAdapter$CampaignViewHolder */
    /* loaded from: classes10.dex */
    public final class CampaignViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public OneFontTextView f90118a;

        /* renamed from: b */
        public OneFontTextView f90119b;

        /* renamed from: c */
        public OneFontTextView f90120c;

        /* renamed from: d */
        public final /* synthetic */ OneDeviceSaleCampaignAdapter f90121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CampaignViewHolder(@NotNull OneDeviceSaleCampaignAdapter oneDeviceSaleCampaignAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f90121d = oneDeviceSaleCampaignAdapter;
        }

        /* renamed from: b */
        public static /* synthetic */ void m14766b(Function1 function1, Campaign campaign, View view) {
            m14765c(function1, campaign, view);
        }

        /* renamed from: c */
        public static final void m14765c(Function1 onSelect, Campaign item, View view) {
            Intrinsics.checkNotNullParameter(onSelect, "$onSelect");
            Intrinsics.checkNotNullParameter(item, "$item");
            onSelect.invoke(item);
        }

        public final void bindView(@NotNull final Campaign item, @NotNull final Function1<? super Campaign, Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            View view = this.itemView;
            OneDeviceSaleCampaignAdapter oneDeviceSaleCampaignAdapter = this.f90121d;
            View findViewById = view.findViewById(R.id.textViewName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.textViewName)");
            this.f90118a = (OneFontTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.textViewType);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.textViewType)");
            this.f90119b = (OneFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.textViewTime);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.textViewTime)");
            this.f90120c = (OneFontTextView) findViewById3;
            OneFontTextView oneFontTextView = this.f90119b;
            OneFontTextView oneFontTextView2 = null;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewType");
                oneFontTextView = null;
            }
            String typeDisplay = item.getTypeDisplay();
            String str = "";
            if (typeDisplay == null) {
                typeDisplay = "";
            }
            oneFontTextView.setText(typeDisplay);
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            OneFontTextView oneFontTextView3 = this.f90118a;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewName");
                oneFontTextView3 = null;
            }
            String name = item.getName();
            if (name == null) {
                name = "";
            }
            m14764d(context, oneFontTextView3, name, oneDeviceSaleCampaignAdapter.f90115c);
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            OneFontTextView oneFontTextView4 = this.f90120c;
            if (oneFontTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewTime");
            } else {
                oneFontTextView2 = oneFontTextView4;
            }
            String period = item.getPeriod();
            if (period != null) {
                str = period;
            }
            m14764d(context2, oneFontTextView2, str, oneDeviceSaleCampaignAdapter.f90115c);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: mP0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OneDeviceSaleCampaignAdapter.CampaignViewHolder.m14766b(Function1.this, item, view2);
                }
            });
        }

        /* renamed from: d */
        public final void m14764d(Context context, OneFontTextView oneFontTextView, String str, String str2) {
            SpannableString spannableString = new SpannableString(str);
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, true, 2, (Object) null);
            if (indexOf$default != -1) {
                int length = str2.length() + indexOf$default;
                int color = ContextCompat.getColor(context, R.color.darkBlueFive);
                spannableString.setSpan(new StyleSpan(1), indexOf$default, length, 33);
                spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, length, 33);
            }
            oneFontTextView.setText(spannableString);
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleCampaignAdapter$OnSelectItemListener;", "", "onSelected", "", "campaign", "Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleCampaignAdapter$OnSelectItemListener */
    /* loaded from: classes10.dex */
    public interface OnSelectItemListener {
        void onSelected(@NotNull Campaign campaign);
    }

    public /* synthetic */ OneDeviceSaleCampaignAdapter(int i, List list, String str, OnSelectItemListener onSelectItemListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? "" : str, onSelectItemListener);
    }

    public final void filter(@NotNull String text) {
        String typeDisplay;
        String period;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f90115c = text;
        this.f90117e.clear();
        if (text.length() > 0) {
            List list = this.f90117e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f90114b) {
                Campaign campaign = (Campaign) obj;
                String name = campaign.getName();
                if ((name != null && StringsKt__StringsKt.contains((CharSequence) name, (CharSequence) text, true)) || (((typeDisplay = campaign.getTypeDisplay()) != null && StringsKt__StringsKt.contains((CharSequence) typeDisplay, (CharSequence) text, true)) || ((period = campaign.getPeriod()) != null && StringsKt__StringsKt.contains((CharSequence) period, (CharSequence) text, true)))) {
                    arrayList.add(obj);
                }
            }
            list.addAll(arrayList);
        } else {
            this.f90117e.addAll(this.f90114b);
        }
        notifyDataSetChanged();
    }

    public final int getIdLayout() {
        return this.f90113a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90117e.size();
    }

    @NotNull
    public final List<Campaign> getItems() {
        return this.f90114b;
    }

    @NotNull
    public final OnSelectItemListener getListener() {
        return this.f90116d;
    }

    public final void setItems(@NotNull List<Campaign> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f90114b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CampaignViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((Campaign) this.f90117e.get(i), new OneDeviceSaleCampaignAdapter$onBindViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CampaignViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f90113a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new CampaignViewHolder(this, view);
    }

    public OneDeviceSaleCampaignAdapter(@LayoutRes int i, @NotNull List<Campaign> items, @NotNull String searchQuery, @NotNull OnSelectItemListener listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f90113a = i;
        this.f90114b = items;
        this.f90115c = searchQuery;
        this.f90116d = listener;
        this.f90117e = new ArrayList();
    }
}