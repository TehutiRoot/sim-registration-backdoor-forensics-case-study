package th.p047co.dtac.android.dtacone.adapter.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.report.OneCommissionHistoryAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$onClickItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "commissions", "", "company", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$onClickItemListener;Ljava/util/List;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$onClickItemListener;", OperatorName.CURVE_TO, "Ljava/util/List;", "d", "Ljava/lang/String;", "ViewHolder", "onClickItemListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneCommissionHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCommissionHistoryAdapter.kt\nth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n766#2:205\n857#2,2:206\n*S KotlinDebug\n*F\n+ 1 OneCommissionHistoryAdapter.kt\nth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter\n*L\n147#1:205\n147#1:206,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.report.OneCommissionHistoryAdapter */
/* loaded from: classes7.dex */
public final class OneCommissionHistoryAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f81542a;

    /* renamed from: b */
    public final onClickItemListener f81543b;

    /* renamed from: c */
    public final List f81544c;

    /* renamed from: d */
    public final String f81545d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010#\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u0017\u0010&\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u00101\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b0\u0010\n¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "parent", "<init>", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/ImageView;", "getBarPaidStatus", "()Landroid/widget/ImageView;", "barPaidStatus", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getBarCommissionDate", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "barCommissionDate", OperatorName.CURVE_TO, "getPaidDate", "paidDate", "d", "getTotalCommission", "totalCommission", "e", "getPaidTypeLabel", "paidTypeLabel", OperatorName.FILL_NON_ZERO, "getPaidTypeValue", "paidTypeValue", OperatorName.NON_STROKING_GRAY, "getPaidTypeValueName", "paidTypeValueName", OperatorName.CLOSE_PATH, "getPaidTypeValueDetail", "paidTypeValueDetail", "i", "getBarWarnningMessage", "barWarnningMessage", OperatorName.SET_LINE_JOINSTYLE, "Landroid/view/View;", "getHeader", "()Landroid/view/View;", "header", OperatorName.NON_STROKING_CMYK, "getBody", "body", OperatorName.LINE_TO, "getIcCalendar", "icCalendar", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.OneCommissionHistoryAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ImageView f81546a;

        /* renamed from: b */
        public final OneFontTextView f81547b;

        /* renamed from: c */
        public final OneFontTextView f81548c;

        /* renamed from: d */
        public final OneFontTextView f81549d;

        /* renamed from: e */
        public final OneFontTextView f81550e;

        /* renamed from: f */
        public final OneFontTextView f81551f;

        /* renamed from: g */
        public final OneFontTextView f81552g;

        /* renamed from: h */
        public final OneFontTextView f81553h;

        /* renamed from: i */
        public final OneFontTextView f81554i;

        /* renamed from: j */
        public final View f81555j;

        /* renamed from: k */
        public final View f81556k;

        /* renamed from: l */
        public final ImageView f81557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            View findViewById = parent.findViewById(R.id.barPaidStatus);
            Intrinsics.checkNotNullExpressionValue(findViewById, "parent.findViewById(R.id.barPaidStatus)");
            this.f81546a = (ImageView) findViewById;
            View findViewById2 = parent.findViewById(R.id.barCommissionDate);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "parent.findViewById(R.id.barCommissionDate)");
            this.f81547b = (OneFontTextView) findViewById2;
            View findViewById3 = parent.findViewById(R.id.paidDate);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "parent.findViewById(R.id.paidDate)");
            this.f81548c = (OneFontTextView) findViewById3;
            View findViewById4 = parent.findViewById(R.id.totalCommission);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "parent.findViewById(R.id.totalCommission)");
            this.f81549d = (OneFontTextView) findViewById4;
            View findViewById5 = parent.findViewById(R.id.paidTypeLabel);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "parent.findViewById(R.id.paidTypeLabel)");
            this.f81550e = (OneFontTextView) findViewById5;
            View findViewById6 = parent.findViewById(R.id.dtacOnlinePaidTypeLabel);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "parent.findViewById(R.id.dtacOnlinePaidTypeLabel)");
            this.f81551f = (OneFontTextView) findViewById6;
            View findViewById7 = parent.findViewById(R.id.paidTypeValue);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "parent.findViewById(R.id.paidTypeValue)");
            this.f81552g = (OneFontTextView) findViewById7;
            View findViewById8 = parent.findViewById(R.id.dtacOnlinePaidTypeValue);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "parent.findViewById(R.id.dtacOnlinePaidTypeValue)");
            this.f81553h = (OneFontTextView) findViewById8;
            View findViewById9 = parent.findViewById(R.id.barWarnningMessage);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "parent.findViewById(R.id.barWarnningMessage)");
            this.f81554i = (OneFontTextView) findViewById9;
            View findViewById10 = parent.findViewById(R.id.commissionHistoryHeader);
            Intrinsics.checkNotNullExpressionValue(findViewById10, "parent.findViewById(R.id.commissionHistoryHeader)");
            this.f81555j = findViewById10;
            View findViewById11 = parent.findViewById(R.id.body);
            Intrinsics.checkNotNullExpressionValue(findViewById11, "parent.findViewById(R.id.body)");
            this.f81556k = findViewById11;
            View findViewById12 = parent.findViewById(R.id.imageView3);
            Intrinsics.checkNotNullExpressionValue(findViewById12, "parent.findViewById(R.id.imageView3)");
            this.f81557l = (ImageView) findViewById12;
        }

        @NotNull
        public final OneFontTextView getBarCommissionDate() {
            return this.f81547b;
        }

        @NotNull
        public final ImageView getBarPaidStatus() {
            return this.f81546a;
        }

        @NotNull
        public final OneFontTextView getBarWarnningMessage() {
            return this.f81554i;
        }

        @NotNull
        public final View getBody() {
            return this.f81556k;
        }

        @NotNull
        public final View getHeader() {
            return this.f81555j;
        }

        @NotNull
        public final ImageView getIcCalendar() {
            return this.f81557l;
        }

        @NotNull
        public final OneFontTextView getPaidDate() {
            return this.f81548c;
        }

        @NotNull
        public final OneFontTextView getPaidTypeLabel() {
            return this.f81550e;
        }

        @NotNull
        public final OneFontTextView getPaidTypeValue() {
            return this.f81551f;
        }

        @NotNull
        public final OneFontTextView getPaidTypeValueDetail() {
            return this.f81553h;
        }

        @NotNull
        public final OneFontTextView getPaidTypeValueName() {
            return this.f81552g;
        }

        @NotNull
        public final OneFontTextView getTotalCommission() {
            return this.f81549d;
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/OneCommissionHistoryAdapter$onClickItemListener;", "", "onClickItem", "", TypedValues.CycleType.S_WAVE_PERIOD, "", "paidStatus", "hasPdf", "", "paidErrorMessage", "periodTH", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.OneCommissionHistoryAdapter$onClickItemListener */
    /* loaded from: classes7.dex */
    public interface onClickItemListener {
        void onClickItem(@NotNull String str, @NotNull String str2, boolean z, @Nullable String str3, @Nullable String str4);
    }

    public OneCommissionHistoryAdapter(@NotNull Context context, @NotNull onClickItemListener listener, @NotNull List<CommissionHistoryCollection> commissions, @NotNull String company) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(commissions, "commissions");
        Intrinsics.checkNotNullParameter(company, "company");
        this.f81542a = context;
        this.f81543b = listener;
        this.f81544c = commissions;
        this.f81545d = company;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20431a(OneCommissionHistoryAdapter oneCommissionHistoryAdapter, CommissionHistoryCollection commissionHistoryCollection, View view) {
        m20430b(oneCommissionHistoryAdapter, commissionHistoryCollection, view);
    }

    /* renamed from: b */
    public static final void m20430b(OneCommissionHistoryAdapter this$0, CommissionHistoryCollection commissionInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(commissionInfo, "$commissionInfo");
        this$0.f81543b.onClickItem(commissionInfo.getCommissionPeriod(), commissionInfo.getPaidStatus(), Intrinsics.areEqual(commissionInfo.getFlagGeneratedPdf(), "Y"), commissionInfo.getPaidErrorMessage(), commissionInfo.getCommissionDate());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81544c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final CommissionHistoryCollection commissionHistoryCollection = (CommissionHistoryCollection) this.f81544c.get(i);
        if (Intrinsics.areEqual(this.f81545d, "TRUE")) {
            String paidStatus = commissionHistoryCollection.getPaidStatus();
            if (Intrinsics.areEqual(paidStatus, "Paid")) {
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_success));
            } else {
                String upperCase = "Paid".toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (Intrinsics.areEqual(paidStatus, upperCase)) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_success));
                } else if (Intrinsics.areEqual(paidStatus, "In-Progress")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else if (Intrinsics.areEqual(paidStatus, "CALCULATION")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else if (Intrinsics.areEqual(paidStatus, "Bank Reject")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else if (Intrinsics.areEqual(paidStatus, "Invalid Profile")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else if (Intrinsics.areEqual(paidStatus, "Pay Fail")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                }
            }
        } else {
            String paidStatus2 = commissionHistoryCollection.getPaidStatus();
            if (Intrinsics.areEqual(paidStatus2, "Paid")) {
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_success));
            } else {
                String upperCase2 = "Paid".toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (Intrinsics.areEqual(paidStatus2, upperCase2)) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_success));
                } else if (Intrinsics.areEqual(paidStatus2, "In-Progress")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else if (Intrinsics.areEqual(paidStatus2, "CALCULATION")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_wait_calculate));
                } else if (Intrinsics.areEqual(paidStatus2, "Bank Reject")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_fail));
                } else if (Intrinsics.areEqual(paidStatus2, "Invalid Profile")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_fail));
                } else if (Intrinsics.areEqual(paidStatus2, "Pay Fail")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_fail));
                } else {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81542a, R.drawable.ic_paid_fail));
                }
            }
        }
        holder.getBarCommissionDate().setText(commissionHistoryCollection.getCommissionDate());
        holder.getPaidDate().setText(commissionHistoryCollection.getPaidDate());
        holder.getTotalCommission().setText(commissionHistoryCollection.getTotalCommission());
        holder.getPaidTypeLabel().setText(commissionHistoryCollection.getPaidTypeLabel());
        holder.getPaidTypeValue().setText(commissionHistoryCollection.getPaidTypeValue());
        if (Intrinsics.areEqual(this.f81545d, "TRUE")) {
            holder.getIcCalendar().setImageResource(R.drawable.ic_calendar_dark_red);
        } else {
            holder.getIcCalendar().setImageResource(R.drawable.ic_calendar_dark_blue);
        }
        if (Intrinsics.areEqual(commissionHistoryCollection.getPaidTypeValue(), "เงินสด")) {
            String cashPaidTypeBankName = commissionHistoryCollection.getCashPaidTypeBankName();
            if (cashPaidTypeBankName != null) {
                String cashPaidTypeBankAccountNumber = commissionHistoryCollection.getCashPaidTypeBankAccountNumber();
                String str = (cashPaidTypeBankAccountNumber == null || (str = StringExtKt.oneToBankAccountNumber(cashPaidTypeBankAccountNumber)) == null) ? "" : "";
                ArrayList arrayList = new ArrayList();
                for (Object obj : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{cashPaidTypeBankName, str})) {
                    if (!AbstractC19741eO1.isBlank((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
                holder.getPaidTypeValueName().setText(commissionHistoryCollection.getCashPaidTypeLabel());
                holder.getPaidTypeValueDetail().setText(joinToString$default);
            }
        } else if (!AbstractC19741eO1.isBlank(commissionHistoryCollection.getDtacOnlinePaidTypeLabel())) {
            holder.getPaidTypeValueName().setText(commissionHistoryCollection.getDtacOnlinePaidTypeLabel());
            holder.getPaidTypeValueDetail().setText(PhoneNumberExtKt.toPretty(commissionHistoryCollection.getDtacOnlinePaidTypeValue()));
        }
        String paidErrorMessage = commissionHistoryCollection.getPaidErrorMessage();
        if (paidErrorMessage != null && paidErrorMessage.length() > 0) {
            holder.getBarWarnningMessage().setText(commissionHistoryCollection.getPaidErrorMessage());
            ViewVisibleExtKt.toVisible(holder.getBarWarnningMessage());
        }
        holder.getBody().setOnClickListener(new View.OnClickListener() { // from class: nO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneCommissionHistoryAdapter.m20431a(OneCommissionHistoryAdapter.this, commissionHistoryCollection, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_monthly_one_commission_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}