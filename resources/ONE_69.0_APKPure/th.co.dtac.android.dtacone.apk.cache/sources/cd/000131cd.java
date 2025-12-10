package th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.ReplaceNewlineExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.PackageSetListItem;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter.OnePackageSetAdapter;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00060\u001dR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u00142\n\u0010\u0012\u001a\u00060\u001dR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "Lkotlin/collections/ArrayList;", "packageList", "", "fontColor", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$OnClickItemPackageSet;", "listen", "setOnClickPackageListener", "(Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$OnClickItemPackageSet;)V", "Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$PackageSetItemViewHolder;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/view/ViewGroup;)Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$PackageSetItemViewHolder;", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$PackageSetItemViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Ljava/util/ArrayList;", "I", "d", "Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$OnClickItemPackageSet;", "e", "lastPosition", "OnClickItemPackageSet", "PackageSetItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OnePackageSetAdapter */
/* loaded from: classes10.dex */
public final class OnePackageSetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f91402a;

    /* renamed from: b */
    public final ArrayList f91403b;

    /* renamed from: c */
    public final int f91404c;

    /* renamed from: d */
    public OnClickItemPackageSet f91405d;

    /* renamed from: e */
    public int f91406e;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$OnClickItemPackageSet;", "", "onClickPackage", "", "packages", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OnePackageSetAdapter$OnClickItemPackageSet */
    /* loaded from: classes10.dex */
    public interface OnClickItemPackageSet {
        void onClickPackage(@NotNull PackageSetListItem packageSetListItem);
    }

    @Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u0017\u0010,\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010\u0010R\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00108\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b7\u0010\u0010¨\u00069"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter$PackageSetItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OnePackageSetAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", "getCardViewPackageItem", "()Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", "cardViewPackageItem", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvPackageName", "()Landroid/widget/TextView;", "tvPackageName", "Landroid/widget/RelativeLayout;", OperatorName.CURVE_TO, "Landroid/widget/RelativeLayout;", "getLayoutPrice", "()Landroid/widget/RelativeLayout;", "layoutPrice", "d", "getTvPriceValue", "tvPriceValue", "Landroidx/appcompat/widget/LinearLayoutCompat;", "e", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLayoutVoiceData", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutVoiceData", OperatorName.FILL_NON_ZERO, "getTvVoiceDataValue", "tvVoiceDataValue", OperatorName.NON_STROKING_GRAY, "getLayoutVoiceBox", "layoutVoiceBox", OperatorName.CLOSE_PATH, "getTvVoiceBoxValue", "tvVoiceBoxValue", "i", "getLayoutWifiData", "layoutWifiData", OperatorName.SET_LINE_JOINSTYLE, "getTvWifiDataValue", "tvWifiDataValue", "Landroidx/constraintlayout/widget/ConstraintLayout;", OperatorName.NON_STROKING_CMYK, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutPackageDesc", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutPackageDesc", OperatorName.LINE_TO, "getTvPackageDesc", "tvPackageDesc", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OnePackageSetAdapter$PackageSetItemViewHolder */
    /* loaded from: classes10.dex */
    public final class PackageSetItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final DtacCardView f91407a;

        /* renamed from: b */
        public final TextView f91408b;

        /* renamed from: c */
        public final RelativeLayout f91409c;

        /* renamed from: d */
        public final TextView f91410d;

        /* renamed from: e */
        public final LinearLayoutCompat f91411e;

        /* renamed from: f */
        public final TextView f91412f;

        /* renamed from: g */
        public final LinearLayoutCompat f91413g;

        /* renamed from: h */
        public final TextView f91414h;

        /* renamed from: i */
        public final LinearLayoutCompat f91415i;

        /* renamed from: j */
        public final TextView f91416j;

        /* renamed from: k */
        public final ConstraintLayout f91417k;

        /* renamed from: l */
        public final TextView f91418l;

        /* renamed from: m */
        public final /* synthetic */ OnePackageSetAdapter f91419m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageSetItemViewHolder(@NotNull OnePackageSetAdapter onePackageSetAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f91419m = onePackageSetAdapter;
            View findViewById = view.findViewById(R.id.cardViewPackageItem);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.view.DtacCardView");
            this.f91407a = (DtacCardView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvPackageName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f91408b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.layoutPrice);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f91409c = (RelativeLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvPriceValue);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f91410d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.layoutVoiceData);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f91411e = (LinearLayoutCompat) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvVoiceDataValue);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.f91412f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.layoutVoiceBox);
            Intrinsics.checkNotNull(findViewById7, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f91413g = (LinearLayoutCompat) findViewById7;
            View findViewById8 = view.findViewById(R.id.tvVoiceBoxValue);
            Intrinsics.checkNotNull(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f91414h = (TextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.layoutWifiData);
            Intrinsics.checkNotNull(findViewById9, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f91415i = (LinearLayoutCompat) findViewById9;
            View findViewById10 = view.findViewById(R.id.tvWifiDataValue);
            Intrinsics.checkNotNull(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.f91416j = (TextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.layoutPackageDesc);
            Intrinsics.checkNotNull(findViewById11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            this.f91417k = (ConstraintLayout) findViewById11;
            View findViewById12 = view.findViewById(R.id.tvPackageDesc);
            Intrinsics.checkNotNull(findViewById12, "null cannot be cast to non-null type android.widget.TextView");
            this.f91418l = (TextView) findViewById12;
        }

        @NotNull
        public final DtacCardView getCardViewPackageItem() {
            return this.f91407a;
        }

        @NotNull
        public final ConstraintLayout getLayoutPackageDesc() {
            return this.f91417k;
        }

        @NotNull
        public final RelativeLayout getLayoutPrice() {
            return this.f91409c;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutVoiceBox() {
            return this.f91413g;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutVoiceData() {
            return this.f91411e;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutWifiData() {
            return this.f91415i;
        }

        @NotNull
        public final TextView getTvPackageDesc() {
            return this.f91418l;
        }

        @NotNull
        public final TextView getTvPackageName() {
            return this.f91408b;
        }

        @NotNull
        public final TextView getTvPriceValue() {
            return this.f91410d;
        }

        @NotNull
        public final TextView getTvVoiceBoxValue() {
            return this.f91414h;
        }

        @NotNull
        public final TextView getTvVoiceDataValue() {
            return this.f91412f;
        }

        @NotNull
        public final TextView getTvWifiDataValue() {
            return this.f91416j;
        }
    }

    public OnePackageSetAdapter(@NotNull Context mContext, @NotNull ArrayList<PackageSetListItem> packageList, int i) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        this.f91402a = mContext;
        this.f91403b = packageList;
        this.f91404c = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m13980a(OnePackageSetAdapter onePackageSetAdapter, PackageSetListItem packageSetListItem, View view) {
        m13977d(onePackageSetAdapter, packageSetListItem, view);
    }

    /* renamed from: d */
    public static final void m13977d(OnePackageSetAdapter this$0, PackageSetListItem packages, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packages, "$packages");
        OnClickItemPackageSet onClickItemPackageSet = this$0.f91405d;
        if (onClickItemPackageSet != null) {
            onClickItemPackageSet.onClickPackage(packages);
        }
    }

    /* renamed from: b */
    public final PackageSetItemViewHolder m13979b(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.one_package_item_row, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new PackageSetItemViewHolder(this, view);
    }

    /* renamed from: c */
    public final void m13978c(PackageSetItemViewHolder packageSetItemViewHolder, int i) {
        if (packageSetItemViewHolder.getAdapterPosition() > this.f91406e) {
            packageSetItemViewHolder.getCardViewPackageItem().startAnimation(AnimationUtils.loadAnimation(this.f91402a, R.anim.slide_up));
            this.f91406e = packageSetItemViewHolder.getAdapterPosition();
        }
        packageSetItemViewHolder.getTvVoiceDataValue().setTextColor(ContextCompat.getColor(this.f91402a, this.f91404c));
        packageSetItemViewHolder.getTvVoiceBoxValue().setTextColor(ContextCompat.getColor(this.f91402a, this.f91404c));
        packageSetItemViewHolder.getTvWifiDataValue().setTextColor(ContextCompat.getColor(this.f91402a, this.f91404c));
        packageSetItemViewHolder.getTvPriceValue().setTextColor(ContextCompat.getColor(this.f91402a, this.f91404c));
        Object obj = this.f91403b.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "packageList[position]");
        final PackageSetListItem packageSetListItem = (PackageSetListItem) obj;
        packageSetItemViewHolder.getTvPackageName().setText(ReplaceNewlineExtKt.toReplaceNewLineWithBlank(packageSetListItem.getPackageSetDescTh()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutVoiceData(), packageSetListItem.getNet());
        packageSetItemViewHolder.getTvVoiceDataValue().setText(StringExtKt.toDisplayDash(packageSetListItem.getNet()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutVoiceBox(), packageSetListItem.getVoice());
        packageSetItemViewHolder.getTvVoiceBoxValue().setText(StringExtKt.toDisplayDash(packageSetListItem.getVoice()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutWifiData(), packageSetListItem.getWifi());
        packageSetItemViewHolder.getTvWifiDataValue().setText(StringExtKt.toDisplayDash(packageSetListItem.getWifi()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutPackageDesc(), packageSetListItem.getPackageDetailTh());
        packageSetItemViewHolder.getTvPackageDesc().setText(packageSetListItem.getPackageDetailTh());
        TextView tvPriceValue = packageSetItemViewHolder.getTvPriceValue();
        String str = "0";
        if (!Intrinsics.areEqual(packageSetListItem.getMarketPrice(), "0") && !Intrinsics.areEqual(packageSetListItem.getMarketPrice(), "0.00")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String marketPrice = packageSetListItem.getMarketPrice();
            if (marketPrice != null) {
                str = marketPrice;
            }
            String format = String.format("%s.-", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            tvPriceValue.setText(format);
        } else {
            tvPriceValue.setText(this.f91402a.getString(R.string.select_label));
        }
        packageSetItemViewHolder.getCardViewPackageItem().setOnClickListener(new View.OnClickListener() { // from class: c11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnePackageSetAdapter.m13980a(OnePackageSetAdapter.this, packageSetListItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91403b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof PackageSetItemViewHolder) {
            m13978c((PackageSetItemViewHolder) holder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return m13979b(parent);
    }

    public final void setOnClickPackageListener(@NotNull OnClickItemPackageSet listen) {
        Intrinsics.checkNotNullParameter(listen, "listen");
        this.f91405d = listen;
    }
}