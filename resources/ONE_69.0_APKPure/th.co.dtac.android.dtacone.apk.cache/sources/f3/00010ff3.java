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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.report.CommissionHistoryAdapter;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$onClickItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "commissions", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$onClickItemListener;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$onClickItemListener;", OperatorName.CURVE_TO, "Ljava/util/List;", "", "d", "Ljava/lang/String;", "HAS_PDF", "ViewHolder", "onClickItemListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommissionHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommissionHistoryAdapter.kt\nth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n766#2:100\n857#2,2:101\n*S KotlinDebug\n*F\n+ 1 CommissionHistoryAdapter.kt\nth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter\n*L\n54#1:100\n54#1:101,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.report.CommissionHistoryAdapter */
/* loaded from: classes7.dex */
public final class CommissionHistoryAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f81521a;

    /* renamed from: b */
    public final onClickItemListener f81522b;

    /* renamed from: c */
    public final List f81523c;

    /* renamed from: d */
    public final String f81524d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001f\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001f\u0010\u001b\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001f\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u001f\u0010!\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\u001f\u0010$\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\u001f\u0010'\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\u001f\u0010,\u001a\n \u0007*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010/\u001a\n \u0007*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "parent", "<init>", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/ImageView;", "getBarPaidStatus", "()Landroid/widget/ImageView;", "barPaidStatus", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "getBarCommissionDate", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "barCommissionDate", OperatorName.CURVE_TO, "getPaidDate", "paidDate", "d", "getTotalCommission", "totalCommission", "e", "getPaidTypeLabel", "paidTypeLabel", OperatorName.FILL_NON_ZERO, "getPaidTypeValue", "paidTypeValue", OperatorName.NON_STROKING_GRAY, "getPaidTypeValueName", "paidTypeValueName", OperatorName.CLOSE_PATH, "getPaidTypeValueDetail", "paidTypeValueDetail", "i", "getBarWarnningMessage", "barWarnningMessage", OperatorName.SET_LINE_JOINSTYLE, "Landroid/view/View;", "getHeader", "()Landroid/view/View;", "header", OperatorName.NON_STROKING_CMYK, "getBody", "body", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.CommissionHistoryAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ImageView f81525a;

        /* renamed from: b */
        public final DtacFontTextView f81526b;

        /* renamed from: c */
        public final DtacFontTextView f81527c;

        /* renamed from: d */
        public final DtacFontTextView f81528d;

        /* renamed from: e */
        public final DtacFontTextView f81529e;

        /* renamed from: f */
        public final DtacFontTextView f81530f;

        /* renamed from: g */
        public final DtacFontTextView f81531g;

        /* renamed from: h */
        public final DtacFontTextView f81532h;

        /* renamed from: i */
        public final DtacFontTextView f81533i;

        /* renamed from: j */
        public final View f81534j;

        /* renamed from: k */
        public final View f81535k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f81525a = (ImageView) parent.findViewById(R.id.barPaidStatus);
            this.f81526b = (DtacFontTextView) parent.findViewById(R.id.barCommissionDate);
            this.f81527c = (DtacFontTextView) parent.findViewById(R.id.paidDate);
            this.f81528d = (DtacFontTextView) parent.findViewById(R.id.totalCommission);
            this.f81529e = (DtacFontTextView) parent.findViewById(R.id.paidTypeLabel);
            this.f81530f = (DtacFontTextView) parent.findViewById(R.id.dtacOnlinePaidTypeLabel);
            this.f81531g = (DtacFontTextView) parent.findViewById(R.id.paidTypeValue);
            this.f81532h = (DtacFontTextView) parent.findViewById(R.id.dtacOnlinePaidTypeValue);
            this.f81533i = (DtacFontTextView) parent.findViewById(R.id.barWarnningMessage);
            this.f81534j = parent.findViewById(R.id.commissionHistoryHeader);
            this.f81535k = parent.findViewById(R.id.body);
        }

        public final DtacFontTextView getBarCommissionDate() {
            return this.f81526b;
        }

        public final ImageView getBarPaidStatus() {
            return this.f81525a;
        }

        public final DtacFontTextView getBarWarnningMessage() {
            return this.f81533i;
        }

        public final View getBody() {
            return this.f81535k;
        }

        public final View getHeader() {
            return this.f81534j;
        }

        public final DtacFontTextView getPaidDate() {
            return this.f81527c;
        }

        public final DtacFontTextView getPaidTypeLabel() {
            return this.f81529e;
        }

        public final DtacFontTextView getPaidTypeValue() {
            return this.f81530f;
        }

        public final DtacFontTextView getPaidTypeValueDetail() {
            return this.f81532h;
        }

        public final DtacFontTextView getPaidTypeValueName() {
            return this.f81531g;
        }

        public final DtacFontTextView getTotalCommission() {
            return this.f81528d;
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/CommissionHistoryAdapter$onClickItemListener;", "", "onClickItem", "", TypedValues.CycleType.S_WAVE_PERIOD, "", "paidStatus", "hasPdf", "", "paidErrorMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.CommissionHistoryAdapter$onClickItemListener */
    /* loaded from: classes7.dex */
    public interface onClickItemListener {
        void onClickItem(@NotNull String str, @NotNull String str2, boolean z, @Nullable String str3);
    }

    public CommissionHistoryAdapter(@NotNull Context context, @NotNull onClickItemListener listener, @NotNull List<CommissionHistoryCollection> commissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(commissions, "commissions");
        this.f81521a = context;
        this.f81522b = listener;
        this.f81523c = commissions;
        this.f81524d = "Y";
    }

    /* renamed from: a */
    public static /* synthetic */ void m20441a(CommissionHistoryAdapter commissionHistoryAdapter, CommissionHistoryCollection commissionHistoryCollection, View view) {
        m20440b(commissionHistoryAdapter, commissionHistoryCollection, view);
    }

    /* renamed from: b */
    public static final void m20440b(CommissionHistoryAdapter this$0, CommissionHistoryCollection commissionInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(commissionInfo, "$commissionInfo");
        this$0.f81522b.onClickItem(commissionInfo.getCommissionPeriod(), commissionInfo.getPaidStatus(), Intrinsics.areEqual(commissionInfo.getFlagGeneratedPdf(), this$0.f81524d), commissionInfo.getPaidErrorMessage());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81523c.size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final CommissionHistoryCollection commissionHistoryCollection = (CommissionHistoryCollection) this.f81523c.get(i);
        String paidStatus = commissionHistoryCollection.getPaidStatus();
        switch (paidStatus.hashCode()) {
            case -1042972608:
                if (paidStatus.equals("Invalid Profile")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                    break;
                }
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                break;
            case 2479852:
                if (paidStatus.equals("Paid")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_success));
                    break;
                }
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                break;
            case 1103441411:
                if (paidStatus.equals("Bank Reject")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                    break;
                }
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                break;
            case 1157381589:
                if (paidStatus.equals("In-Progress")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_wait_calculate));
                    break;
                }
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                break;
            case 1375279062:
                if (paidStatus.equals("Pay Fail")) {
                    holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                    break;
                }
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                break;
            default:
                holder.getBarPaidStatus().setImageDrawable(ContextCompat.getDrawable(this.f81521a, R.drawable.ic_paid_fail));
                break;
        }
        holder.getBarCommissionDate().setText(commissionHistoryCollection.getCommissionDate());
        holder.getPaidDate().setText(commissionHistoryCollection.getPaidDate());
        holder.getTotalCommission().setText(commissionHistoryCollection.getTotalCommission());
        holder.getPaidTypeLabel().setText(commissionHistoryCollection.getPaidTypeLabel());
        holder.getPaidTypeValue().setText(commissionHistoryCollection.getPaidTypeValue());
        if (Intrinsics.areEqual(commissionHistoryCollection.getPaidTypeValue(), "เงินสด")) {
            String cashPaidTypeBankName = commissionHistoryCollection.getCashPaidTypeBankName();
            if (cashPaidTypeBankName != null) {
                String cashPaidTypeBankAccountNumber = commissionHistoryCollection.getCashPaidTypeBankAccountNumber();
                String str = (cashPaidTypeBankAccountNumber == null || (str = StringExtKt.toBankAccountNumber(cashPaidTypeBankAccountNumber)) == null) ? "" : "";
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
            DtacFontTextView barWarnningMessage = holder.getBarWarnningMessage();
            Intrinsics.checkNotNullExpressionValue(barWarnningMessage, "holder.barWarnningMessage");
            ViewVisibleExtKt.toVisible(barWarnningMessage);
        }
        holder.getBody().setOnClickListener(new View.OnClickListener() { // from class: eu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommissionHistoryAdapter.m20441a(CommissionHistoryAdapter.this, commissionHistoryCollection, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_monthly_commission_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}