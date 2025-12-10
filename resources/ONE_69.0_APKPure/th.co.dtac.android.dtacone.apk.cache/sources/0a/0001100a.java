package th.p047co.dtac.android.dtacone.adapter.sellerID;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.sellerID.OneShopListAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+BG\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/sellerID/OneShopListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/ShopData;", "Lkotlin/collections/ArrayList;", "shopList", "Lkotlin/Function0;", "", "getSearchText", "Lkotlin/Function2;", "", "onClickShop", "<init>", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, TextBundle.TEXT_ENTRY, SearchIntents.EXTRA_QUERY, "Landroid/text/SpannableString;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "getShopList", "()Ljava/util/ArrayList;", "Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function2;", "d", "Landroid/content/Context;", "ShopListViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.sellerID.OneShopListAdapter */
/* loaded from: classes7.dex */
public final class OneShopListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f81592a;

    /* renamed from: b */
    public final Function0 f81593b;

    /* renamed from: c */
    public final Function2 f81594c;

    /* renamed from: d */
    public Context f81595d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/sellerID/OneShopListAdapter$ShopListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOneShopItem", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "oneShopItem", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvSellerName", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvSellerName", OperatorName.CURVE_TO, "getTvSellerId", "tvSellerId", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getIvNext", "()Landroid/widget/ImageView;", "ivNext", "e", "Landroid/view/View;", "getViewLine", "()Landroid/view/View;", "viewLine", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.sellerID.OneShopListAdapter$ShopListViewHolder */
    /* loaded from: classes7.dex */
    public static final class ShopListViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ConstraintLayout f81596a;

        /* renamed from: b */
        public final OneFontTextView f81597b;

        /* renamed from: c */
        public final OneFontTextView f81598c;

        /* renamed from: d */
        public final ImageView f81599d;

        /* renamed from: e */
        public final View f81600e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopListViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.one_shop_item);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            this.f81596a = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvSellerName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.OneFontTextView");
            this.f81597b = (OneFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvSellerId);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.OneFontTextView");
            this.f81598c = (OneFontTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ivNext);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81599d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.viewLine);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.view.View");
            this.f81600e = findViewById5;
        }

        @NotNull
        public final ImageView getIvNext() {
            return this.f81599d;
        }

        @NotNull
        public final ConstraintLayout getOneShopItem() {
            return this.f81596a;
        }

        @NotNull
        public final OneFontTextView getTvSellerId() {
            return this.f81598c;
        }

        @NotNull
        public final OneFontTextView getTvSellerName() {
            return this.f81597b;
        }

        @NotNull
        public final View getViewLine() {
            return this.f81600e;
        }
    }

    public OneShopListAdapter(@NotNull ArrayList<ShopData> shopList, @NotNull Function0<String> getSearchText, @NotNull Function2<? super String, ? super String, Unit> onClickShop) {
        Intrinsics.checkNotNullParameter(shopList, "shopList");
        Intrinsics.checkNotNullParameter(getSearchText, "getSearchText");
        Intrinsics.checkNotNullParameter(onClickShop, "onClickShop");
        this.f81592a = shopList;
        this.f81593b = getSearchText;
        this.f81594c = onClickShop;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20421a(OneShopListAdapter oneShopListAdapter, ShopData shopData, View view) {
        m20419c(oneShopListAdapter, shopData, view);
    }

    /* renamed from: c */
    public static final void m20419c(OneShopListAdapter this$0, ShopData data, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        Function2 function2 = this$0.f81594c;
        String rtrName = data.getRtrName();
        String str = "";
        if (rtrName == null) {
            rtrName = "";
        }
        String rtrCode = data.getRtrCode();
        if (rtrCode != null) {
            str = rtrCode;
        }
        function2.invoke(rtrName, str);
    }

    /* renamed from: b */
    public final SpannableString m20420b(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int color = ContextCompat.getColor(context, R.color.blueTitle);
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, true, 2, (Object) null);
        if (indexOf$default != -1) {
            spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, str2.length() + indexOf$default, 33);
        }
        return spannableString;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81592a.size();
    }

    @NotNull
    public final ArrayList<ShopData> getShopList() {
        return this.f81592a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f81592a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "shopList[position]");
        final ShopData shopData = (ShopData) obj;
        if (holder instanceof ShopListViewHolder) {
            String str = (String) this.f81593b.invoke();
            ShopListViewHolder shopListViewHolder = (ShopListViewHolder) holder;
            OneFontTextView tvSellerName = shopListViewHolder.getTvSellerName();
            Context context = this.f81595d;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
                context = null;
            }
            String rtrName = shopData.getRtrName();
            String str2 = "";
            if (rtrName == null) {
                rtrName = "";
            }
            tvSellerName.setText(m20420b(context, rtrName, str));
            OneFontTextView tvSellerId = shopListViewHolder.getTvSellerId();
            Context context3 = this.f81595d;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            } else {
                context2 = context3;
            }
            String rtrCode = shopData.getRtrCode();
            if (rtrCode != null) {
                str2 = rtrCode;
            }
            tvSellerId.setText(m20420b(context2, str2, str));
            shopListViewHolder.getOneShopItem().setOnClickListener(new View.OnClickListener() { // from class: vd1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneShopListAdapter.m20421a(OneShopListAdapter.this, shopData, view);
                }
            });
            if (i == this.f81592a.size() - 1) {
                shopListViewHolder.getViewLine().setVisibility(8);
            } else {
                shopListViewHolder.getViewLine().setVisibility(0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_shop_item_layout, parent, false);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        this.f81595d = context;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ShopListViewHolder(view);
    }
}