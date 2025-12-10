package th.p047co.dtac.android.dtacone.adapter.report;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionDetail;
import th.p047co.dtac.android.dtacone.model.rtr_performance.PayByCommissionType;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/rtr_performance/PayByCommissionType;", "commissions", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "positoin", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPayByCommissionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayByCommissionAdapter.kt\nth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 PayByCommissionAdapter.kt\nth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter\n*L\n36#1:69\n36#1:70,3\n46#1:73\n46#1:74,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.report.PayByCommissionAdapter */
/* loaded from: classes7.dex */
public final class PayByCommissionAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f81467a;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\nR\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\"\u0010\nR\u0017\u0010&\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b%\u0010\nR\u0017\u0010)\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\n¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/PayByCommissionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "getCommissionType", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "commissionType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAmount", "amount", OperatorName.CURVE_TO, "getQuantity", FirebaseAnalytics.Param.QUANTITY, "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "getDetailContainer", "()Landroid/view/ViewGroup;", "detailContainer", "e", "getCommissionDetail", "commissionDetail", OperatorName.FILL_NON_ZERO, "getCommissionDetail2", "commissionDetail2", OperatorName.NON_STROKING_GRAY, "getCommissionDetail3", "commissionDetail3", OperatorName.CLOSE_PATH, "getCommissionDetail4", "commissionDetail4", "i", "getCommissionDetail5", "commissionDetail5", OperatorName.SET_LINE_JOINSTYLE, "getCommissionDetail6", "commissionDetail6", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.PayByCommissionAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final DtacFontTextView f81468a;

        /* renamed from: b */
        public final DtacFontTextView f81469b;

        /* renamed from: c */
        public final DtacFontTextView f81470c;

        /* renamed from: d */
        public final ViewGroup f81471d;

        /* renamed from: e */
        public final DtacFontTextView f81472e;

        /* renamed from: f */
        public final DtacFontTextView f81473f;

        /* renamed from: g */
        public final DtacFontTextView f81474g;

        /* renamed from: h */
        public final DtacFontTextView f81475h;

        /* renamed from: i */
        public final DtacFontTextView f81476i;

        /* renamed from: j */
        public final DtacFontTextView f81477j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.commissionType);
            Intrinsics.checkNotNull(findViewById);
            this.f81468a = (DtacFontTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.amount);
            Intrinsics.checkNotNull(findViewById2);
            this.f81469b = (DtacFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.quantity);
            Intrinsics.checkNotNull(findViewById3);
            this.f81470c = (DtacFontTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.detailContainer);
            Intrinsics.checkNotNull(findViewById4);
            this.f81471d = (ViewGroup) findViewById4;
            View findViewById5 = view.findViewById(R.id.commissionDetail);
            Intrinsics.checkNotNull(findViewById5);
            this.f81472e = (DtacFontTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.commissionDetail2);
            Intrinsics.checkNotNull(findViewById6);
            this.f81473f = (DtacFontTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.commissionDetail3);
            Intrinsics.checkNotNull(findViewById7);
            this.f81474g = (DtacFontTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.commissionDetail4);
            Intrinsics.checkNotNull(findViewById8);
            this.f81475h = (DtacFontTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.commissionDetail5);
            Intrinsics.checkNotNull(findViewById9);
            this.f81476i = (DtacFontTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.commissionDetail6);
            Intrinsics.checkNotNull(findViewById10);
            this.f81477j = (DtacFontTextView) findViewById10;
        }

        @NotNull
        public final DtacFontTextView getAmount() {
            return this.f81469b;
        }

        @NotNull
        public final DtacFontTextView getCommissionDetail() {
            return this.f81472e;
        }

        @NotNull
        public final DtacFontTextView getCommissionDetail2() {
            return this.f81473f;
        }

        @NotNull
        public final DtacFontTextView getCommissionDetail3() {
            return this.f81474g;
        }

        @NotNull
        public final DtacFontTextView getCommissionDetail4() {
            return this.f81475h;
        }

        @NotNull
        public final DtacFontTextView getCommissionDetail5() {
            return this.f81476i;
        }

        @NotNull
        public final DtacFontTextView getCommissionDetail6() {
            return this.f81477j;
        }

        @NotNull
        public final DtacFontTextView getCommissionType() {
            return this.f81468a;
        }

        @NotNull
        public final ViewGroup getDetailContainer() {
            return this.f81471d;
        }

        @NotNull
        public final DtacFontTextView getQuantity() {
            return this.f81470c;
        }
    }

    public PayByCommissionAdapter(@NotNull List<PayByCommissionType> commissions) {
        Intrinsics.checkNotNullParameter(commissions, "commissions");
        this.f81467a = commissions;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81467a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        PayByCommissionType payByCommissionType = (PayByCommissionType) this.f81467a.get(i);
        viewHolder.getCommissionType().setText(payByCommissionType.getCommissionType());
        viewHolder.getAmount().setText(payByCommissionType.getAmount());
        viewHolder.getQuantity().setText(payByCommissionType.getQuantity());
        ViewVisibleExtKt.toGone(viewHolder.getDetailContainer());
        CommissionDetail commissionDetail = payByCommissionType.getCommissionDetail();
        if (commissionDetail == null || !(!commissionDetail.getDetail().isEmpty())) {
            return;
        }
        List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(commissionDetail.getTitle());
        List<String> detail = commissionDetail.getDetail();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(detail, 10));
        Iterator<T> it = detail.iterator();
        while (it.hasNext()) {
            arrayList.add("• " + ((String) it.next()));
        }
        mutableListOf.addAll(arrayList);
        List<Pair> zip = CollectionsKt___CollectionsKt.zip(mutableListOf, CollectionsKt__CollectionsKt.listOf((Object[]) new DtacFontTextView[]{viewHolder.getCommissionDetail(), viewHolder.getCommissionDetail2(), viewHolder.getCommissionDetail3(), viewHolder.getCommissionDetail4(), viewHolder.getCommissionDetail5(), viewHolder.getCommissionDetail6()}));
        ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(zip, 10));
        for (Pair pair : zip) {
            ((DtacFontTextView) pair.getSecond()).setText((CharSequence) pair.getFirst());
            ViewVisibleExtKt.toVisible((View) pair.getSecond());
            arrayList2.add(Unit.INSTANCE);
        }
        ViewVisibleExtKt.toVisible(viewHolder.getDetailContainer());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_payby_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}
