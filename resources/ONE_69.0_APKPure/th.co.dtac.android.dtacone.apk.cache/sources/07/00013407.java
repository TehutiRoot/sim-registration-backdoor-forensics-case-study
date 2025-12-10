package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
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
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSearchAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\n\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001/B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter$NadItemViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "nadSearchList", "", "searchText", "Lkotlin/Function1;", "", "onClickNadItem", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter$NadItemViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter$NadItemViewHolder;I)V", "", TextBundle.TEXT_ENTRY, SearchIntents.EXTRA_QUERY, "Landroid/text/SpannableString;", "highlightText", "(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/text/SpannableString;", "original", "Lkotlin/Pair;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/CharSequence;)Lkotlin/Pair;", "", OperatorName.CURVE_TO, "(C)Ljava/lang/Character;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Ljava/util/List;", "Ljava/lang/String;", "d", "Lkotlin/jvm/functions/Function1;", "NadItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneNadOutboundSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundSearchAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,207:1\n1183#2,3:208\n*S KotlinDebug\n*F\n+ 1 OneNadOutboundSearchAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter\n*L\n171#1:208,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSearchAdapter */
/* loaded from: classes10.dex */
public final class OneNadOutboundSearchAdapter extends RecyclerView.Adapter<NadItemViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f92272a;

    /* renamed from: b */
    public final List f92273b;

    /* renamed from: c */
    public final String f92274c;

    /* renamed from: d */
    public final Function1 f92275d;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\"\u0010\nR\u0017\u0010&\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b%\u0010\n¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter$NadItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSearchAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getServiceIdTextView", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "serviceIdTextView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getContactStatusItemTextView", "contactStatusItemTextView", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getContactStatusImageView", "()Landroid/widget/ImageView;", "contactStatusImageView", "d", "getOverdueBillValueItemTextView", "overdueBillValueItemTextView", "e", "getBeforePaymentBillValueItemTextView", "beforePaymentBillValueItemTextView", "Landroidx/constraintlayout/widget/ConstraintLayout;", OperatorName.FILL_NON_ZERO, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOverdueBillLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "overdueBillLayout", OperatorName.NON_STROKING_GRAY, "getBeforePaymentBillItemTextView", "beforePaymentBillItemTextView", OperatorName.CLOSE_PATH, "getOverdueBillItemTextView", "overdueBillItemTextView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSearchAdapter$NadItemViewHolder */
    /* loaded from: classes10.dex */
    public final class NadItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneFontTextView f92276a;

        /* renamed from: b */
        public final OneFontTextView f92277b;

        /* renamed from: c */
        public final ImageView f92278c;

        /* renamed from: d */
        public final OneFontTextView f92279d;

        /* renamed from: e */
        public final OneFontTextView f92280e;

        /* renamed from: f */
        public final ConstraintLayout f92281f;

        /* renamed from: g */
        public final OneFontTextView f92282g;

        /* renamed from: h */
        public final OneFontTextView f92283h;

        /* renamed from: i */
        public final /* synthetic */ OneNadOutboundSearchAdapter f92284i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NadItemViewHolder(@NotNull OneNadOutboundSearchAdapter oneNadOutboundSearchAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f92284i = oneNadOutboundSearchAdapter;
            View findViewById = this.itemView.findViewById(R.id.serviceNumberValueTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.…rviceNumberValueTextView)");
            this.f92276a = (OneFontTextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.contactStatusItemTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.…ontactStatusItemTextView)");
            this.f92277b = (OneFontTextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.contactStatusImageView);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.contactStatusImageView)");
            this.f92278c = (ImageView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.overdueBillValueItemTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.…dueBillValueItemTextView)");
            this.f92279d = (OneFontTextView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.beforePaymentBillValueItemTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.…entBillValueItemTextView)");
            this.f92280e = (OneFontTextView) findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.overdueBillLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.overdueBillLayout)");
            this.f92281f = (ConstraintLayout) findViewById6;
            View findViewById7 = this.itemView.findViewById(R.id.beforePaymentBillItemTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "itemView.findViewById(R.…ePaymentBillItemTextView)");
            this.f92282g = (OneFontTextView) findViewById7;
            View findViewById8 = this.itemView.findViewById(R.id.overdueBillItemTextView);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "itemView.findViewById(R.….overdueBillItemTextView)");
            this.f92283h = (OneFontTextView) findViewById8;
        }

        @NotNull
        public final OneFontTextView getBeforePaymentBillItemTextView() {
            return this.f92282g;
        }

        @NotNull
        public final OneFontTextView getBeforePaymentBillValueItemTextView() {
            return this.f92280e;
        }

        @NotNull
        public final ImageView getContactStatusImageView() {
            return this.f92278c;
        }

        @NotNull
        public final OneFontTextView getContactStatusItemTextView() {
            return this.f92277b;
        }

        @NotNull
        public final OneFontTextView getOverdueBillItemTextView() {
            return this.f92283h;
        }

        @NotNull
        public final ConstraintLayout getOverdueBillLayout() {
            return this.f92281f;
        }

        @NotNull
        public final OneFontTextView getOverdueBillValueItemTextView() {
            return this.f92279d;
        }

        @NotNull
        public final OneFontTextView getServiceIdTextView() {
            return this.f92276a;
        }
    }

    public OneNadOutboundSearchAdapter(@NotNull Context context, @NotNull List<OneNadOutboundBillingItem> nadSearchList, @NotNull String searchText, @NotNull Function1<? super OneNadOutboundBillingItem, Unit> onClickNadItem) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nadSearchList, "nadSearchList");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(onClickNadItem, "onClickNadItem");
        this.f92272a = context;
        this.f92273b = nadSearchList;
        this.f92274c = searchText;
        this.f92275d = onClickNadItem;
    }

    /* renamed from: a */
    public static /* synthetic */ void m13381a(OneNadOutboundSearchAdapter oneNadOutboundSearchAdapter, OneNadOutboundBillingItem oneNadOutboundBillingItem, View view) {
        m13378d(oneNadOutboundSearchAdapter, oneNadOutboundBillingItem, view);
    }

    /* renamed from: d */
    public static final void m13378d(OneNadOutboundSearchAdapter this$0, OneNadOutboundBillingItem nadItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nadItem, "$nadItem");
        this$0.f92275d.invoke(nadItem);
    }

    /* renamed from: b */
    public final Pair m13380b(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Character m13379c = m13379c(charSequence.charAt(i));
            if (m13379c != null) {
                sb.append(Character.toLowerCase(m13379c.charValue()));
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return TuplesKt.m29136to(sb2, CollectionsKt___CollectionsKt.toIntArray(arrayList));
    }

    /* renamed from: c */
    public final Character m13379c(char c) {
        if (('A' <= c && c < '[') || ('a' <= c && c < '{')) {
            return Character.valueOf(c);
        }
        if ('0' <= c && c < ':') {
            return Character.valueOf(c);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92273b.size();
    }

    @NotNull
    public final SpannableString highlightText(@NotNull Context context, @NotNull CharSequence text, @NotNull CharSequence query) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(query, "query");
        SpannableString spannableString = new SpannableString(text);
        String lowerCase = SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.mapNotNull(StringsKt___StringsKt.asSequence(query), new OneNadOutboundSearchAdapter$highlightText$q$1(this)), "", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (AbstractC19741eO1.isBlank(lowerCase)) {
            return spannableString;
        }
        Pair m13380b = m13380b(text);
        String str = (String) m13380b.component1();
        int[] iArr = (int[]) m13380b.component2();
        if (str.length() == 0) {
            return spannableString;
        }
        int color = ContextCompat.getColor(context, R.color.red5);
        int i = 0;
        while (true) {
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, lowerCase, i, false, 4, (Object) null);
            if (indexOf$default != -1) {
                spannableString.setSpan(new ForegroundColorSpan(color), iArr[indexOf$default], iArr[(lowerCase.length() + indexOf$default) - 1] + 1, 33);
                i = indexOf$default + 1;
            } else {
                return spannableString;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull NadItemViewHolder holder, int i) {
        Drawable drawable;
        SpannableString highlightText;
        String string;
        String string2;
        int i2;
        int color;
        String string3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final OneNadOutboundBillingItem oneNadOutboundBillingItem = (OneNadOutboundBillingItem) this.f92273b.get(i);
        if (oneNadOutboundBillingItem.getContactStatus()) {
            drawable = ContextCompat.getDrawable(this.f92272a, R.drawable.ic_icon_status_green);
        } else {
            drawable = ContextCompat.getDrawable(this.f92272a, R.drawable.ic_icon_status_red);
        }
        holder.getContactStatusImageView().setImageDrawable(drawable);
        String serviceId = oneNadOutboundBillingItem.getServiceId();
        OneFontTextView serviceIdTextView = holder.getServiceIdTextView();
        if (Intrinsics.areEqual(oneNadOutboundBillingItem.getProduct(), "MOBILE")) {
            highlightText = highlightText(this.f92272a, PhoneNumberExtKt.toPretty(serviceId), this.f92274c);
        } else {
            highlightText = highlightText(this.f92272a, serviceId, this.f92274c);
        }
        serviceIdTextView.setText(highlightText);
        OneFontTextView contactStatusItemTextView = holder.getContactStatusItemTextView();
        if (oneNadOutboundBillingItem.getContactStatus()) {
            string = this.f92272a.getString(R.string.one_nad_outbound_already_contacted_title);
        } else {
            string = this.f92272a.getString(R.string.one_nad_outbound_have_not_contacted_yet_title);
        }
        contactStatusItemTextView.setText(string);
        holder.getOverdueBillItemTextView().setTextSize(12.0f);
        OneFontTextView overdueBillValueItemTextView = holder.getOverdueBillValueItemTextView();
        if (Integer.parseInt(oneNadOutboundBillingItem.getUnpaidBillCount()) > 3) {
            string2 = this.f92272a.getString(R.string.one_nad_outbound_over_due_more_than_tree_bill_count);
        } else {
            string2 = this.f92272a.getString(R.string.one_nad_outbound_over_due_bill_count, oneNadOutboundBillingItem.getUnpaidBillCount());
        }
        overdueBillValueItemTextView.setText(string2);
        holder.getOverdueBillValueItemTextView().setTextSize(Integer.parseInt(oneNadOutboundBillingItem.getUnpaidBillCount()) > 3 ? 14.0f : 16.0f);
        boolean areEqual = Intrinsics.areEqual(oneNadOutboundBillingItem.getDueStatus(), OneNadOutboundActivity.DUE_STATUS_OVERDUE);
        if (areEqual) {
            i2 = R.drawable.background_yellow_radius_corner_red_border;
        } else {
            i2 = R.drawable.background_yellow_radius_corner_yellow_border;
        }
        if (areEqual) {
            color = ResourcesCompat.getColor(this.f92272a.getResources(), R.color.red5, null);
        } else {
            color = ResourcesCompat.getColor(this.f92272a.getResources(), R.color.colorCreamy, null);
        }
        OneFontTextView beforePaymentBillItemTextView = holder.getBeforePaymentBillItemTextView();
        if (areEqual) {
            string3 = beforePaymentBillItemTextView.getContext().getString(R.string.one_nad_outbound_select_overdue_title);
        } else {
            string3 = beforePaymentBillItemTextView.getContext().getString(R.string.one_nad_outbound_select_before_due_date_title);
        }
        beforePaymentBillItemTextView.setText(string3);
        beforePaymentBillItemTextView.setTextColor(color);
        OneFontTextView beforePaymentBillValueItemTextView = holder.getBeforePaymentBillValueItemTextView();
        beforePaymentBillValueItemTextView.setText(beforePaymentBillValueItemTextView.getContext().getString(R.string.one_nad_outbound_over_due_bill_date, oneNadOutboundBillingItem.getDaysFromDue()));
        beforePaymentBillValueItemTextView.setTextColor(color);
        holder.getOverdueBillLayout().setBackgroundResource(i2);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: GX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneNadOutboundSearchAdapter.m13381a(OneNadOutboundSearchAdapter.this, oneNadOutboundBillingItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public NadItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nad_outbound_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new NadItemViewHolder(this, view);
    }
}