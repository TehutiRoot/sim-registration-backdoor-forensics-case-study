package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneFullScreenListStringDialog;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 (2\u00020\u0001:\u0004()*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010$\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0016\u0010'\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "initialView", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$Listener;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "getTitle", "()I", MessageBundle.TITLE_ENTRY, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "o", "()Ljava/util/ArrayList;", "dataList", "p", "fontSelectedColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "priceSelectedColor", OperatorName.SAVE, "()Ljava/lang/String;", "markerData", "Companion", "Listener", "RVDataAdapter", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneFullScreenListStringDialog */
/* loaded from: classes7.dex */
public final class OneFullScreenListStringDialog extends BaseDialogFragment {
    @NotNull
    public static final String DATA = "DATA";
    @NotNull
    public static final String FONT_SELECTED_COLOR = "FONT_SELECTED_COLOR";
    @NotNull
    public static final String MARKER_DATA = "MARKER_DATA";
    @NotNull
    public static final String PRICE_SELECTED_COLOR = "PRICE_SELECTED_COLOR";
    @NotNull
    public static final String TITLE = "TITLE";

    /* renamed from: a */
    public Listener f83069a;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$Companion;", "", "()V", "DATA", "", "FONT_SELECTED_COLOR", "MARKER_DATA", "PRICE_SELECTED_COLOR", "TITLE", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dialogTitle", "", "fontSelectedColor", "priceSelectedColor", "markerData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneFullScreenListStringDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneFullScreenListStringDialog newInstance(@NotNull ArrayList<String> dataList, int i, int i2, int i3, @Nullable String str) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            Bundle bundle = new Bundle();
            bundle.putInt("TITLE", i);
            bundle.putInt("FONT_SELECTED_COLOR", i2);
            bundle.putInt("PRICE_SELECTED_COLOR", i3);
            bundle.putStringArrayList("DATA", dataList);
            bundle.putString("MARKER_DATA", str);
            OneFullScreenListStringDialog oneFullScreenListStringDialog = new OneFullScreenListStringDialog();
            oneFullScreenListStringDialog.setArguments(bundle);
            return oneFullScreenListStringDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$Listener;", "", "onChooseDataStringItem", "", "item", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneFullScreenListStringDialog$Listener */
    /* loaded from: classes7.dex */
    public interface Listener {
        void onChooseDataStringItem(@NotNull String str);
    }

    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B)\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$RVDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$ViewHolder;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "datas", "markerData", "<init>", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog;Ljava/util/ArrayList;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneFullScreenListStringDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneFullScreenListStringDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$RVDataAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n731#2,9:154\n37#3,2:163\n*S KotlinDebug\n*F\n+ 1 OneFullScreenListStringDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$RVDataAdapter\n*L\n109#1:154,9\n110#1:163,2\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneFullScreenListStringDialog$RVDataAdapter */
    /* loaded from: classes7.dex */
    public final class RVDataAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: a */
        public final ArrayList f83070a;

        /* renamed from: b */
        public final String f83071b;

        /* renamed from: c */
        public final /* synthetic */ OneFullScreenListStringDialog f83072c;

        public RVDataAdapter(@NotNull OneFullScreenListStringDialog oneFullScreenListStringDialog, @Nullable ArrayList<String> datas, String str) {
            Intrinsics.checkNotNullParameter(datas, "datas");
            this.f83072c = oneFullScreenListStringDialog;
            this.f83070a = datas;
            this.f83071b = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f83070a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
            List emptyList;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj = this.f83070a.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "datas[position]");
            List<String> split = new Regex("\\.").split((CharSequence) obj, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            String str = ((String[]) emptyList.toArray(new String[0]))[0];
            OneFontTextView tvDataString = holder.getTvDataString();
            String str2 = this.f83071b;
            if (str2 != null && Intrinsics.areEqual(str2, str)) {
                tvDataString.setTextColor(ContextCompat.getColor(this.f83072c.requireContext(), this.f83072c.m19917p()));
                holder.getLayoutText().setBackgroundResource(this.f83072c.m19915r());
            } else {
                tvDataString.setTextColor(ContextCompat.getColor(this.f83072c.requireContext(), R.color.jet_back));
                holder.getLayoutText().setBackgroundResource(R.color.white);
            }
            tvDataString.setText(StringExtKt.formatMoneyNoDecimal(str));
            holder.getLayoutDataString().setTag(str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View view = LayoutInflater.from(this.f83072c.getContext()).inflate(R.layout.item_list_string, parent, false);
            OneFullScreenListStringDialog oneFullScreenListStringDialog = this.f83072c;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new ViewHolder(oneFullScreenListStringDialog, view);
        }
    }

    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "<init>", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneFullScreenListStringDialog;Landroid/view/View;)V", "", "onClick", "(Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutDataString", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutDataString", "Landroidx/appcompat/widget/LinearLayoutCompat;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLayoutText", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutText", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvDataString", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvDataString", "d", "Landroid/view/View;", "getVSeparateLineItem", "()Landroid/view/View;", "vSeparateLineItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneFullScreenListStringDialog$ViewHolder */
    /* loaded from: classes7.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ConstraintLayout f83073a;

        /* renamed from: b */
        public final LinearLayoutCompat f83074b;

        /* renamed from: c */
        public final OneFontTextView f83075c;

        /* renamed from: d */
        public final View f83076d;

        /* renamed from: e */
        public final /* synthetic */ OneFullScreenListStringDialog f83077e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneFullScreenListStringDialog oneFullScreenListStringDialog, View v) {
            super(v);
            Intrinsics.checkNotNullParameter(v, "v");
            this.f83077e = oneFullScreenListStringDialog;
            View findViewById = v.findViewById(R.id.layoutDataString);
            Intrinsics.checkNotNullExpressionValue(findViewById, "v.findViewById(R.id.layoutDataString)");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
            this.f83073a = constraintLayout;
            View findViewById2 = v.findViewById(R.id.layoutText);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "v.findViewById(R.id.layoutText)");
            this.f83074b = (LinearLayoutCompat) findViewById2;
            View findViewById3 = v.findViewById(R.id.tvDataString);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "v.findViewById(R.id.tvDataString)");
            this.f83075c = (OneFontTextView) findViewById3;
            View findViewById4 = v.findViewById(R.id.vSeparateLineItem);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "v.findViewById(R.id.vSeparateLineItem)");
            this.f83076d = findViewById4;
            constraintLayout.setOnClickListener(this);
        }

        @NotNull
        public final ConstraintLayout getLayoutDataString() {
            return this.f83073a;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutText() {
            return this.f83074b;
        }

        @NotNull
        public final OneFontTextView getTvDataString() {
            return this.f83075c;
        }

        @NotNull
        public final View getVSeparateLineItem() {
            return this.f83076d;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Listener listener = this.f83077e.f83069a;
            if (listener != null) {
                Object tag = v.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
                listener.onChooseDataStringItem((String) tag);
            }
            this.f83077e.dismiss();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m19919n(OneFullScreenListStringDialog oneFullScreenListStringDialog, View view) {
        m19914s(oneFullScreenListStringDialog, view);
    }

    /* renamed from: s */
    public static final void m19914s(OneFullScreenListStringDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public final int getTitle() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("TITLE");
        }
        return R.string.loading;
    }

    public final void initialView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(R.id.tvTitle);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(getTitle());
        View findViewById2 = view.findViewById(R.id.rvListString);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(new RVDataAdapter(this, m19918o(), m19916q()));
        recyclerView.scrollToPosition(CollectionsKt___CollectionsKt.indexOf((List<? extends String>) m19918o(), m19916q()));
        View findViewById3 = view.findViewById(R.id.ivBtnClose);
        Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        ((AppCompatImageView) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: hT0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneFullScreenListStringDialog.m19919n(OneFullScreenListStringDialog.this, view2);
            }
        });
    }

    /* renamed from: o */
    public final ArrayList m19918o() {
        ArrayList<String> arrayList;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getStringArrayList("DATA");
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16973834);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
        Dialog dialog3 = getDialog();
        Window window2 = null;
        if (dialog3 != null) {
            window = dialog3.getWindow();
        } else {
            window = null;
        }
        Intrinsics.checkNotNull(window);
        window.setLayout(-1, -1);
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            window2 = dialog4.getWindow();
        }
        Intrinsics.checkNotNull(window2);
        window2.setBackgroundDrawable(new ColorDrawable(0));
        View inflate = inflater.inflate(R.layout.dialog_one_full_screen_list_string, viewGroup, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…_string, container, true)");
        initialView(inflate);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null && (targetFragment instanceof Listener)) {
            this.f83069a = (Listener) targetFragment;
        }
        return inflate;
    }

    /* renamed from: p */
    public final int m19917p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("FONT_SELECTED_COLOR");
        }
        return R.color.niceBlueFive;
    }

    /* renamed from: q */
    public final String m19916q() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("MARKER_DATA");
        }
        return null;
    }

    /* renamed from: r */
    public final int m19915r() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("PRICE_SELECTED_COLOR");
        }
        return R.drawable.background_top_up_price_selected_blue;
    }
}