package th.p047co.dtac.android.dtacone.adapter.sellerID;

import android.content.Context;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.sellerID.SellerIDShopAdapter;
import th.p047co.dtac.android.dtacone.model.sellerID.shopList.RetailerItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/sellerID/shopList/RetailerItem;", "retailerItemList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter$OnClickShop;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter$OnClickShop;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter$OnClickShop;", "Companion", "OnClickShop", "ShopItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSellerIDShopAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellerIDShopAdapter.kt\nth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.sellerID.SellerIDShopAdapter */
/* loaded from: classes7.dex */
public final class SellerIDShopAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final int f81601d = 0;

    /* renamed from: a */
    public final Context f81602a;

    /* renamed from: b */
    public final List f81603b;

    /* renamed from: c */
    public OnClickShop f81604c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.sellerID.SellerIDShopAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter$OnClickShop;", "", "onClickShopItem", "", "shopName", "", "shopCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.sellerID.SellerIDShopAdapter$OnClickShop */
    /* loaded from: classes7.dex */
    public interface OnClickShop {
        void onClickShopItem(@NotNull String str, @NotNull String str2);
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter$ShopItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/sellerID/SellerIDShopAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutShop", "()Landroid/widget/RelativeLayout;", "layoutShop", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvShopName", "()Landroid/widget/TextView;", "tvShopName", OperatorName.CURVE_TO, "getTvShopCode", "tvShopCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.sellerID.SellerIDShopAdapter$ShopItemViewHolder */
    /* loaded from: classes7.dex */
    public final class ShopItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81605a;

        /* renamed from: b */
        public final TextView f81606b;

        /* renamed from: c */
        public final TextView f81607c;

        /* renamed from: d */
        public final /* synthetic */ SellerIDShopAdapter f81608d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopItemViewHolder(@NotNull SellerIDShopAdapter sellerIDShopAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81608d = sellerIDShopAdapter;
            View findViewById = view.findViewById(R.id.layoutShop);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81605a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvItemShopName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81606b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvItemShopCode);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81607c = (TextView) findViewById3;
        }

        @NotNull
        public final RelativeLayout getLayoutShop() {
            return this.f81605a;
        }

        @NotNull
        public final TextView getTvShopCode() {
            return this.f81607c;
        }

        @NotNull
        public final TextView getTvShopName() {
            return this.f81606b;
        }
    }

    public SellerIDShopAdapter(@NotNull Context context, @NotNull List<RetailerItem> retailerItemList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retailerItemList, "retailerItemList");
        this.f81602a = context;
        this.f81603b = retailerItemList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20418a(RetailerItem retailerItem, SellerIDShopAdapter sellerIDShopAdapter, View view) {
        m20417b(retailerItem, sellerIDShopAdapter, view);
    }

    /* renamed from: b */
    public static final void m20417b(RetailerItem shop, SellerIDShopAdapter this$0, View view) {
        String rtrCode;
        OnClickShop onClickShop;
        Intrinsics.checkNotNullParameter(shop, "$shop");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String rtrName = shop.getRtrName();
        if (rtrName != null && (rtrCode = shop.getRtrCode()) != null && (onClickShop = this$0.f81604c) != null) {
            onClickShop.onClickShopItem(rtrName, rtrCode);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81603b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return f81601d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        final RetailerItem retailerItem = (RetailerItem) this.f81603b.get(i);
        if (p0 instanceof ShopItemViewHolder) {
            ShopItemViewHolder shopItemViewHolder = (ShopItemViewHolder) p0;
            shopItemViewHolder.getTvShopName().setText(retailerItem.getRtrName());
            shopItemViewHolder.getTvShopCode().setText(retailerItem.getRtrCode());
            shopItemViewHolder.getLayoutShop().setOnClickListener(new View.OnClickListener() { // from class: AG1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SellerIDShopAdapter.m20418a(RetailerItem.this, this, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View view = LayoutInflater.from(this.f81602a).inflate(R.layout.item_seller_id_shop, p0, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ShopItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickShop listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81604c = listener;
    }
}