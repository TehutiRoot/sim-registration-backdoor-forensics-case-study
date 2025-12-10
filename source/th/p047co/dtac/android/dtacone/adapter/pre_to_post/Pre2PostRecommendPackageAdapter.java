package th.p047co.dtac.android.dtacone.adapter.pre_to_post;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.pre_to_post.Pre2PostRecommendPackageAdapter;
import th.p047co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "recommendPackageList", "", "intParentWidth", "<init>", "(Landroid/content/Context;Ljava/util/List;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "itemPosition", "getItem", "(I)Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter$OnClickRecommendPackage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter$OnClickRecommendPackage;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "I", "d", "Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter$OnClickRecommendPackage;", "Companion", "OnClickRecommendPackage", "RecommendPackageItemViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.pre_to_post.Pre2PostRecommendPackageAdapter */
/* loaded from: classes7.dex */
public final class Pre2PostRecommendPackageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: e */
    public static final int f81411e = 0;

    /* renamed from: a */
    public final Context f81412a;

    /* renamed from: b */
    public final List f81413b;

    /* renamed from: c */
    public final int f81414c;

    /* renamed from: d */
    public OnClickRecommendPackage f81415d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.pre_to_post.Pre2PostRecommendPackageAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter$OnClickRecommendPackage;", "", "onClickRecommendPackageItem", "", "recommendPackage", "Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.pre_to_post.Pre2PostRecommendPackageAdapter$OnClickRecommendPackage */
    /* loaded from: classes7.dex */
    public interface OnClickRecommendPackage {
        void onClickRecommendPackageItem(@NotNull PackagesItem packagesItem);
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010#\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter$RecommendPackageItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/pre_to_post/Pre2PostRecommendPackageAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getRecommendPackageLayout", "()Landroid/widget/RelativeLayout;", "recommendPackageLayout", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvPackageTitle", "()Landroid/widget/TextView;", "tvPackageTitle", OperatorName.CURVE_TO, "getTvPackageDataDetail", "tvPackageDataDetail", "d", "getTvPackagePhoneDetail", "tvPackagePhoneDetail", "e", "getTvPackageWifiDetail", "tvPackageWifiDetail", OperatorName.FILL_NON_ZERO, "getTvPackageStorageDetail", "tvPackageStorageDetail", OperatorName.NON_STROKING_GRAY, "getTvPackageBillCycleDetail", "tvPackageBillCycleDetail", OperatorName.CLOSE_PATH, "getTvPriceValue", "tvPriceValue", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.pre_to_post.Pre2PostRecommendPackageAdapter$RecommendPackageItemViewHolder */
    /* loaded from: classes7.dex */
    public final class RecommendPackageItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81416a;

        /* renamed from: b */
        public final TextView f81417b;

        /* renamed from: c */
        public final TextView f81418c;

        /* renamed from: d */
        public final TextView f81419d;

        /* renamed from: e */
        public final TextView f81420e;

        /* renamed from: f */
        public final TextView f81421f;

        /* renamed from: g */
        public final TextView f81422g;

        /* renamed from: h */
        public final TextView f81423h;

        /* renamed from: i */
        public final /* synthetic */ Pre2PostRecommendPackageAdapter f81424i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendPackageItemViewHolder(@NotNull Pre2PostRecommendPackageAdapter pre2PostRecommendPackageAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81424i = pre2PostRecommendPackageAdapter;
            View findViewById = view.findViewById(R.id.recommendPackageLayout);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81416a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvPackageTitle);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81417b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvPackageDataDetail);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81418c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvPackagePhoneDetail);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f81419d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvPackageWifiDetail);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f81420e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvPackageStorageDetail);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.f81421f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tvPackageBillCycleDetail);
            Intrinsics.checkNotNull(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.f81422g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.tvPriceValue);
            Intrinsics.checkNotNull(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f81423h = (TextView) findViewById8;
        }

        @NotNull
        public final RelativeLayout getRecommendPackageLayout() {
            return this.f81416a;
        }

        @NotNull
        public final TextView getTvPackageBillCycleDetail() {
            return this.f81422g;
        }

        @NotNull
        public final TextView getTvPackageDataDetail() {
            return this.f81418c;
        }

        @NotNull
        public final TextView getTvPackagePhoneDetail() {
            return this.f81419d;
        }

        @NotNull
        public final TextView getTvPackageStorageDetail() {
            return this.f81421f;
        }

        @NotNull
        public final TextView getTvPackageTitle() {
            return this.f81417b;
        }

        @NotNull
        public final TextView getTvPackageWifiDetail() {
            return this.f81420e;
        }

        @NotNull
        public final TextView getTvPriceValue() {
            return this.f81423h;
        }
    }

    public Pre2PostRecommendPackageAdapter(@NotNull Context context, @NotNull List<PackagesItem> recommendPackageList, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recommendPackageList, "recommendPackageList");
        this.f81412a = context;
        this.f81413b = recommendPackageList;
        this.f81414c = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20272a(Pre2PostRecommendPackageAdapter pre2PostRecommendPackageAdapter, PackagesItem packagesItem, View view) {
        m20271b(pre2PostRecommendPackageAdapter, packagesItem, view);
    }

    /* renamed from: b */
    public static final void m20271b(Pre2PostRecommendPackageAdapter this$0, PackagesItem recommendPackage, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recommendPackage, "$recommendPackage");
        OnClickRecommendPackage onClickRecommendPackage = this$0.f81415d;
        if (onClickRecommendPackage != null) {
            onClickRecommendPackage.onClickRecommendPackageItem(recommendPackage);
        }
    }

    @NotNull
    public final PackagesItem getItem(int i) {
        return (PackagesItem) this.f81413b.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81413b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return f81411e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final PackagesItem packagesItem = (PackagesItem) this.f81413b.get(i);
        if (holder instanceof RecommendPackageItemViewHolder) {
            RecommendPackageItemViewHolder recommendPackageItemViewHolder = (RecommendPackageItemViewHolder) holder;
            recommendPackageItemViewHolder.getTvPackageTitle().setText(packagesItem.getPackageName());
            String str = "";
            if (TextUtils.isEmpty(packagesItem.getData())) {
                recommendPackageItemViewHolder.getTvPackageDataDetail().setVisibility(8);
            } else {
                TextView tvPackageDataDetail = recommendPackageItemViewHolder.getTvPackageDataDetail();
                String data = packagesItem.getData();
                String dataUnit = packagesItem.getDataUnit();
                if (dataUnit == null) {
                    dataUnit = "";
                }
                tvPackageDataDetail.setText(data + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + dataUnit);
            }
            if (TextUtils.isEmpty(packagesItem.getVoice())) {
                recommendPackageItemViewHolder.getTvPackagePhoneDetail().setVisibility(8);
            } else {
                TextView tvPackagePhoneDetail = recommendPackageItemViewHolder.getTvPackagePhoneDetail();
                String voice = packagesItem.getVoice();
                String voiceUnit = packagesItem.getVoiceUnit();
                if (voiceUnit == null) {
                    voiceUnit = "";
                }
                tvPackagePhoneDetail.setText(voice + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + voiceUnit);
            }
            if (TextUtils.isEmpty(packagesItem.getWifi())) {
                recommendPackageItemViewHolder.getTvPackageWifiDetail().setVisibility(8);
            } else {
                TextView tvPackageWifiDetail = recommendPackageItemViewHolder.getTvPackageWifiDetail();
                String wifi = packagesItem.getWifi();
                String wifiUnit = packagesItem.getWifiUnit();
                if (wifiUnit == null) {
                    wifiUnit = "";
                }
                tvPackageWifiDetail.setText(wifi + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + wifiUnit);
            }
            if (TextUtils.isEmpty(packagesItem.getStorage())) {
                recommendPackageItemViewHolder.getTvPackageStorageDetail().setVisibility(8);
            } else {
                TextView tvPackageStorageDetail = recommendPackageItemViewHolder.getTvPackageStorageDetail();
                String storage = packagesItem.getStorage();
                String storageUnit = packagesItem.getStorageUnit();
                if (storageUnit == null) {
                    storageUnit = "";
                }
                tvPackageStorageDetail.setText(storage + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + storageUnit);
            }
            if (TextUtils.isEmpty(packagesItem.getBillCycle())) {
                recommendPackageItemViewHolder.getTvPackageBillCycleDetail().setVisibility(8);
            } else {
                TextView tvPackageBillCycleDetail = recommendPackageItemViewHolder.getTvPackageBillCycleDetail();
                String billCycle = packagesItem.getBillCycle();
                String billCycleUnit = packagesItem.getBillCycleUnit();
                if (billCycleUnit != null) {
                    str = billCycleUnit;
                }
                tvPackageBillCycleDetail.setText(billCycle + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str);
            }
            TextView tvPriceValue = recommendPackageItemViewHolder.getTvPriceValue();
            String marketPrice = packagesItem.getMarketPrice();
            tvPriceValue.setText(marketPrice + " .-");
            if (this.f81415d != null) {
                recommendPackageItemViewHolder.getRecommendPackageLayout().setOnClickListener(new View.OnClickListener() { // from class: Al1
                    {
                        Pre2PostRecommendPackageAdapter.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Pre2PostRecommendPackageAdapter.m20272a(Pre2PostRecommendPackageAdapter.this, packagesItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81412a).inflate(R.layout.z_pre2post_recommend_package_item, parent, false);
        if (getItemCount() > 1) {
            view.getLayoutParams().width = AbstractC21140mr0.roundToInt(this.f81414c * 0.8d);
        }
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new RecommendPackageItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickRecommendPackage listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81415d = listener;
    }
}
