package th.p047co.dtac.android.dtacone.adapter.mrtr_mnp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
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
import th.p047co.dtac.android.dtacone.adapter.mrtr_mnp.MrtrPackageSetAdapter;
import th.p047co.dtac.android.dtacone.extension.format.ReplaceNewlineExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.PackageSetListItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "Lkotlin/collections/ArrayList;", "packageList", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$OnClickItemPackageSet;", "listen", "setOnClickPackageListener", "(Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$OnClickItemPackageSet;)V", "Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$PackageSetItemViewHolder;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/view/ViewGroup;)Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$PackageSetItemViewHolder;", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$PackageSetItemViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$OnClickItemPackageSet;", "d", "I", "lastPosition", "OnClickItemPackageSet", "PackageSetItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_mnp.MrtrPackageSetAdapter */
/* loaded from: classes7.dex */
public final class MrtrPackageSetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f81334a;

    /* renamed from: b */
    public final ArrayList f81335b;

    /* renamed from: c */
    public OnClickItemPackageSet f81336c;

    /* renamed from: d */
    public int f81337d;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$OnClickItemPackageSet;", "", "onClickPackage", "", "packages", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_mnp.MrtrPackageSetAdapter$OnClickItemPackageSet */
    /* loaded from: classes7.dex */
    public interface OnClickItemPackageSet {
        void onClickPackage(@NotNull PackageSetListItem packageSetListItem);
    }

    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u0017\u0010,\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010\u0010¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter$PackageSetItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/mrtr_mnp/MrtrPackageSetAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", "getCardViewPackageItem", "()Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", "cardViewPackageItem", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvPackageName", "()Landroid/widget/TextView;", "tvPackageName", "Landroid/widget/RelativeLayout;", OperatorName.CURVE_TO, "Landroid/widget/RelativeLayout;", "getLayoutPrice", "()Landroid/widget/RelativeLayout;", "layoutPrice", "d", "getTvPriceValue", "tvPriceValue", "Landroidx/appcompat/widget/LinearLayoutCompat;", "e", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLayoutVoiceData", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutVoiceData", OperatorName.FILL_NON_ZERO, "getTvVoiceDataValue", "tvVoiceDataValue", OperatorName.NON_STROKING_GRAY, "getLayoutVoiceBox", "layoutVoiceBox", OperatorName.CLOSE_PATH, "getTvVoiceBoxValue", "tvVoiceBoxValue", "i", "getLayoutWifiData", "layoutWifiData", OperatorName.SET_LINE_JOINSTYLE, "getTvWifiDataValue", "tvWifiDataValue", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_mnp.MrtrPackageSetAdapter$PackageSetItemViewHolder */
    /* loaded from: classes7.dex */
    public final class PackageSetItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final DtacCardView f81338a;

        /* renamed from: b */
        public final TextView f81339b;

        /* renamed from: c */
        public final RelativeLayout f81340c;

        /* renamed from: d */
        public final TextView f81341d;

        /* renamed from: e */
        public final LinearLayoutCompat f81342e;

        /* renamed from: f */
        public final TextView f81343f;

        /* renamed from: g */
        public final LinearLayoutCompat f81344g;

        /* renamed from: h */
        public final TextView f81345h;

        /* renamed from: i */
        public final LinearLayoutCompat f81346i;

        /* renamed from: j */
        public final TextView f81347j;

        /* renamed from: k */
        public final /* synthetic */ MrtrPackageSetAdapter f81348k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageSetItemViewHolder(@NotNull MrtrPackageSetAdapter mrtrPackageSetAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81348k = mrtrPackageSetAdapter;
            View findViewById = view.findViewById(R.id.cardViewPackageItem);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.view.DtacCardView");
            this.f81338a = (DtacCardView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvPackageName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81339b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.layoutPrice);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81340c = (RelativeLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvPriceValue);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f81341d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.layoutVoiceData);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f81342e = (LinearLayoutCompat) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvVoiceDataValue);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.f81343f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.layoutVoiceBox);
            Intrinsics.checkNotNull(findViewById7, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f81344g = (LinearLayoutCompat) findViewById7;
            View findViewById8 = view.findViewById(R.id.tvVoiceBoxValue);
            Intrinsics.checkNotNull(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f81345h = (TextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.layoutWifiData);
            Intrinsics.checkNotNull(findViewById9, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f81346i = (LinearLayoutCompat) findViewById9;
            View findViewById10 = view.findViewById(R.id.tvWifiDataValue);
            Intrinsics.checkNotNull(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.f81347j = (TextView) findViewById10;
        }

        @NotNull
        public final DtacCardView getCardViewPackageItem() {
            return this.f81338a;
        }

        @NotNull
        public final RelativeLayout getLayoutPrice() {
            return this.f81340c;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutVoiceBox() {
            return this.f81344g;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutVoiceData() {
            return this.f81342e;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutWifiData() {
            return this.f81346i;
        }

        @NotNull
        public final TextView getTvPackageName() {
            return this.f81339b;
        }

        @NotNull
        public final TextView getTvPriceValue() {
            return this.f81341d;
        }

        @NotNull
        public final TextView getTvVoiceBoxValue() {
            return this.f81345h;
        }

        @NotNull
        public final TextView getTvVoiceDataValue() {
            return this.f81343f;
        }

        @NotNull
        public final TextView getTvWifiDataValue() {
            return this.f81347j;
        }
    }

    public MrtrPackageSetAdapter(@NotNull Context mContext, @NotNull ArrayList<PackageSetListItem> packageList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        this.f81334a = mContext;
        this.f81335b = packageList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20527a(MrtrPackageSetAdapter mrtrPackageSetAdapter, PackageSetListItem packageSetListItem, View view) {
        m20524d(mrtrPackageSetAdapter, packageSetListItem, view);
    }

    /* renamed from: d */
    public static final void m20524d(MrtrPackageSetAdapter this$0, PackageSetListItem packages, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packages, "$packages");
        OnClickItemPackageSet onClickItemPackageSet = this$0.f81336c;
        if (onClickItemPackageSet != null) {
            onClickItemPackageSet.onClickPackage(packages);
        }
    }

    /* renamed from: b */
    public final PackageSetItemViewHolder m20526b(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mrtr_package_item_row, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new PackageSetItemViewHolder(this, view);
    }

    /* renamed from: c */
    public final void m20525c(PackageSetItemViewHolder packageSetItemViewHolder, int i) {
        if (packageSetItemViewHolder.getAdapterPosition() > this.f81337d) {
            packageSetItemViewHolder.getCardViewPackageItem().startAnimation(AnimationUtils.loadAnimation(this.f81334a, R.anim.slide_up));
            this.f81337d = packageSetItemViewHolder.getAdapterPosition();
        }
        Object obj = this.f81335b.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "packageList[position]");
        final PackageSetListItem packageSetListItem = (PackageSetListItem) obj;
        packageSetItemViewHolder.getTvPackageName().setText(ReplaceNewlineExtKt.toReplaceNewLineWithBlank(packageSetListItem.getPackageSetDescTh()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutVoiceData(), packageSetListItem.getNet());
        packageSetItemViewHolder.getTvVoiceDataValue().setText(StringExtKt.toDisplayDash(packageSetListItem.getNet()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutVoiceBox(), packageSetListItem.getVoice());
        packageSetItemViewHolder.getTvVoiceBoxValue().setText(StringExtKt.toDisplayDash(packageSetListItem.getVoice()));
        VisibleExtensionKt.toVisibleOrGone(packageSetItemViewHolder.getLayoutWifiData(), packageSetListItem.getWifi());
        packageSetItemViewHolder.getTvWifiDataValue().setText(StringExtKt.toDisplayDash(packageSetListItem.getWifi()));
        TextView tvPriceValue = packageSetItemViewHolder.getTvPriceValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String marketPrice = packageSetListItem.getMarketPrice();
        if (marketPrice == null) {
            marketPrice = "0";
        }
        String format = String.format("%s.-", Arrays.copyOf(new Object[]{marketPrice}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        tvPriceValue.setText(format);
        packageSetItemViewHolder.getCardViewPackageItem().setOnClickListener(new View.OnClickListener() { // from class: xy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MrtrPackageSetAdapter.m20527a(MrtrPackageSetAdapter.this, packageSetListItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81335b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof PackageSetItemViewHolder) {
            m20525c((PackageSetItemViewHolder) holder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return m20526b(parent);
    }

    public final void setOnClickPackageListener(@NotNull OnClickItemPackageSet listen) {
        Intrinsics.checkNotNullParameter(listen, "listen");
        this.f81336c = listen;
    }
}