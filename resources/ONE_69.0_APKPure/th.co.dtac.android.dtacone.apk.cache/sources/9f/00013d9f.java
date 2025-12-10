package th.p047co.dtac.android.dtacone.view.appOne.report.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemBinding;
import th.p047co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemTrueBinding;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionPayByCommissionTypeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionPayByCommissionTypeResponseDtacCompany;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter$DataViewHolder;", "", "company", "", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionPayByCommissionTypeResponseDtacCompany;", "commissionDtacCompany", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionPayByCommissionTypeResponse;", "commissionsTrueCompany", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter$DataViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter$DataViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "DataViewHolder", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnePayByCommissionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePayByCommissionAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1549#2:171\n1620#2,3:172\n1549#2:175\n1620#2,3:176\n1549#2:179\n1620#2,3:180\n1549#2:183\n1620#2,3:184\n1549#2:187\n1620#2,3:188\n*S KotlinDebug\n*F\n+ 1 OnePayByCommissionAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter\n*L\n116#1:171\n116#1:172,3\n139#1:175\n139#1:176,3\n147#1:179\n147#1:180,3\n151#1:183\n151#1:184,3\n157#1:187\n157#1:188,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OnePayByCommissionAdapter */
/* loaded from: classes10.dex */
public final class OnePayByCommissionAdapter extends RecyclerView.Adapter<DataViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f96277a;

    /* renamed from: b */
    public final List f96278b;

    /* renamed from: c */
    public final List f96279c;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/viewbinding/ViewBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter;Landroidx/viewbinding/ViewBinding;)V", "", "", "result", "", "bind", "(Ljava/util/List;)V", "bindT", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/viewbinding/ViewBinding;", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getCommissionType", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "commissionType", OperatorName.CURVE_TO, "getAmount", "amount", "d", "getQuantity", FirebaseAnalytics.Param.QUANTITY, "e", "getDot", "dot", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OnePayByCommissionAdapter$DataViewHolder */
    /* loaded from: classes10.dex */
    public final class DataViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ViewBinding f96280a;

        /* renamed from: b */
        public final OneFontTextView f96281b;

        /* renamed from: c */
        public final OneFontTextView f96282c;

        /* renamed from: d */
        public final OneFontTextView f96283d;

        /* renamed from: e */
        public final OneFontTextView f96284e;

        /* renamed from: f */
        public final /* synthetic */ OnePayByCommissionAdapter f96285f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataViewHolder(@NotNull OnePayByCommissionAdapter onePayByCommissionAdapter, ViewBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96285f = onePayByCommissionAdapter;
            this.f96280a = binding;
            View findViewById = this.itemView.findViewById(R.id.commissionType);
            Intrinsics.checkNotNull(findViewById);
            this.f96281b = (OneFontTextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.amount);
            Intrinsics.checkNotNull(findViewById2);
            this.f96282c = (OneFontTextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.quantity);
            Intrinsics.checkNotNull(findViewById3);
            this.f96283d = (OneFontTextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.dotView);
            Intrinsics.checkNotNull(findViewById4);
            this.f96284e = (OneFontTextView) findViewById4;
        }

        public final void bind(@Nullable List<String> list) {
            OnePayByCommissionDetailListAdapter onePayByCommissionDetailListAdapter = new OnePayByCommissionDetailListAdapter(list, null, this.f96285f.f96277a);
            if (Intrinsics.areEqual(this.f96285f.f96277a, "TRUE")) {
                ViewBinding viewBinding = this.f96280a;
                Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type th.co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemTrueBinding");
                RecyclerViewOneCommissionPaybyItemTrueBinding recyclerViewOneCommissionPaybyItemTrueBinding = (RecyclerViewOneCommissionPaybyItemTrueBinding) viewBinding;
                recyclerViewOneCommissionPaybyItemTrueBinding.payByCommissionDetailList.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
                recyclerViewOneCommissionPaybyItemTrueBinding.payByCommissionDetailList.setAdapter(onePayByCommissionDetailListAdapter);
                return;
            }
            ViewBinding viewBinding2 = this.f96280a;
            Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemBinding");
            RecyclerViewOneCommissionPaybyItemBinding recyclerViewOneCommissionPaybyItemBinding = (RecyclerViewOneCommissionPaybyItemBinding) viewBinding2;
            recyclerViewOneCommissionPaybyItemBinding.payByCommissionDetailList.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
            recyclerViewOneCommissionPaybyItemBinding.payByCommissionDetailList.setAdapter(onePayByCommissionDetailListAdapter);
        }

        public final void bindT(@Nullable List<String> list) {
            OnePayByCommissionDetailListAdapter onePayByCommissionDetailListAdapter = new OnePayByCommissionDetailListAdapter(null, list, this.f96285f.f96277a);
            if (Intrinsics.areEqual(this.f96285f.f96277a, "TRUE")) {
                ViewBinding viewBinding = this.f96280a;
                Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type th.co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemTrueBinding");
                RecyclerViewOneCommissionPaybyItemTrueBinding recyclerViewOneCommissionPaybyItemTrueBinding = (RecyclerViewOneCommissionPaybyItemTrueBinding) viewBinding;
                recyclerViewOneCommissionPaybyItemTrueBinding.payByCommissionDetailList.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
                recyclerViewOneCommissionPaybyItemTrueBinding.payByCommissionDetailList.setAdapter(onePayByCommissionDetailListAdapter);
                return;
            }
            ViewBinding viewBinding2 = this.f96280a;
            Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.databinding.RecyclerViewOneCommissionPaybyItemBinding");
            RecyclerViewOneCommissionPaybyItemBinding recyclerViewOneCommissionPaybyItemBinding = (RecyclerViewOneCommissionPaybyItemBinding) viewBinding2;
            recyclerViewOneCommissionPaybyItemBinding.payByCommissionDetailList.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
            recyclerViewOneCommissionPaybyItemBinding.payByCommissionDetailList.setAdapter(onePayByCommissionDetailListAdapter);
        }

        @NotNull
        public final OneFontTextView getAmount() {
            return this.f96282c;
        }

        @NotNull
        public final OneFontTextView getCommissionType() {
            return this.f96281b;
        }

        @NotNull
        public final OneFontTextView getDot() {
            return this.f96284e;
        }

        @NotNull
        public final OneFontTextView getQuantity() {
            return this.f96283d;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OnePayByCommissionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getCommissionType", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "commissionType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAmount", "amount", OperatorName.CURVE_TO, "getQuantity", FirebaseAnalytics.Param.QUANTITY, "d", "getDot", "dot", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OnePayByCommissionAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneFontTextView f96286a;

        /* renamed from: b */
        public final OneFontTextView f96287b;

        /* renamed from: c */
        public final OneFontTextView f96288c;

        /* renamed from: d */
        public final OneFontTextView f96289d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.commissionType);
            Intrinsics.checkNotNull(findViewById);
            this.f96286a = (OneFontTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.amount);
            Intrinsics.checkNotNull(findViewById2);
            this.f96287b = (OneFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.quantity);
            Intrinsics.checkNotNull(findViewById3);
            this.f96288c = (OneFontTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.dotView);
            Intrinsics.checkNotNull(findViewById4);
            this.f96289d = (OneFontTextView) findViewById4;
        }

        @NotNull
        public final OneFontTextView getAmount() {
            return this.f96287b;
        }

        @NotNull
        public final OneFontTextView getCommissionType() {
            return this.f96286a;
        }

        @NotNull
        public final OneFontTextView getDot() {
            return this.f96289d;
        }

        @NotNull
        public final OneFontTextView getQuantity() {
            return this.f96288c;
        }
    }

    public /* synthetic */ OnePayByCommissionAdapter(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Integer num;
        List list = this.f96278b;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null) {
            return this.f96278b.size();
        }
        List list2 = this.f96279c;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    public OnePayByCommissionAdapter(@NotNull String company, @Nullable List<OneCommissionPayByCommissionTypeResponseDtacCompany> list, @Nullable List<OneCommissionPayByCommissionTypeResponse> list2) {
        Intrinsics.checkNotNullParameter(company, "company");
        this.f96277a = company;
        this.f96278b = list;
        this.f96279c = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0187, code lost:
        if (r4 == null) goto L82;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @android.annotation.SuppressLint({"SuspiciousIndentation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.view.appOne.report.adapter.OnePayByCommissionAdapter.DataViewHolder r12, int r13) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.report.adapter.OnePayByCommissionAdapter.onBindViewHolder(th.co.dtac.android.dtacone.view.appOne.report.adapter.OnePayByCommissionAdapter$DataViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DataViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        ViewBinding inflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (Intrinsics.areEqual(this.f96277a, "TRUE")) {
            inflate = RecyclerViewOneCommissionPaybyItemTrueBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "{\n                Recycl…ent, false)\n            }");
        } else {
            inflate = RecyclerViewOneCommissionPaybyItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "{\n                Recycl…ent, false)\n            }");
        }
        return new DataViewHolder(this, inflate);
    }
}