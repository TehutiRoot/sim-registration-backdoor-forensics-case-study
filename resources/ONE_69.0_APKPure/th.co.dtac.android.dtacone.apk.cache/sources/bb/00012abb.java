package th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter;

import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.OneCampaignThemeModel;
import th.p047co.dtac.android.dtacone.util.WindowUtil;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003567B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel;", "viewModel", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()I", "", "base64", "Landroid/widget/ImageView;", "ivImageBanner", "", OperatorName.CURVE_TO, "(Ljava/lang/String;Landroid/widget/ImageView;)V", "", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "listSetting", "setList", "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneCampaignThemeModel;", "theme", "setTheme", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneCampaignThemeModel;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter$OnClickMyCampaign;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter$OnClickMyCampaign;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/fragment/app/FragmentActivity;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter$OnClickMyCampaign;", "d", "Ljava/util/List;", "myCampaignList", "e", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneCampaignThemeModel;", "Companion", "MyCampaignItemViewHolder", "OnClickMyCampaign", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter */
/* loaded from: classes10.dex */
public final class OneTrueMyCampaignAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final FragmentActivity f88740a;

    /* renamed from: b */
    public final OneCampaignViewModel f88741b;

    /* renamed from: c */
    public OnClickMyCampaign f88742c;

    /* renamed from: d */
    public List f88743d;

    /* renamed from: e */
    public OneCampaignThemeModel f88744e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter$MyCampaignItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutCampaign", "()Landroid/widget/RelativeLayout;", "layoutCampaign", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "getIvCampaignBanner", "()Landroid/widget/ImageView;", "ivCampaignBanner", OperatorName.CURVE_TO, "getIvCampaignDetail", "ivCampaignDetail", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTvCampaignName", "()Landroid/widget/TextView;", "tvCampaignName", "e", "getTvCampaignDetail", "tvCampaignDetail", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter$MyCampaignItemViewHolder */
    /* loaded from: classes10.dex */
    public final class MyCampaignItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f88745a;

        /* renamed from: b */
        public final ImageView f88746b;

        /* renamed from: c */
        public final ImageView f88747c;

        /* renamed from: d */
        public final TextView f88748d;

        /* renamed from: e */
        public final TextView f88749e;

        /* renamed from: f */
        public final /* synthetic */ OneTrueMyCampaignAdapter f88750f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyCampaignItemViewHolder(@NotNull OneTrueMyCampaignAdapter oneTrueMyCampaignAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f88750f = oneTrueMyCampaignAdapter;
            View findViewById = view.findViewById(R.id.layoutCampaign);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f88745a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivCampaignBanner);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88746b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ivCampaignDetail);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88747c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f88748d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvCampaignDetail);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f88749e = (TextView) findViewById5;
        }

        @NotNull
        public final ImageView getIvCampaignBanner() {
            return this.f88746b;
        }

        @NotNull
        public final ImageView getIvCampaignDetail() {
            return this.f88747c;
        }

        @NotNull
        public final RelativeLayout getLayoutCampaign() {
            return this.f88745a;
        }

        @NotNull
        public final TextView getTvCampaignDetail() {
            return this.f88749e;
        }

        @NotNull
        public final TextView getTvCampaignName() {
            return this.f88748d;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueMyCampaignAdapter$OnClickMyCampaign;", "", "onClickMyCampaignItem", "", "campaign", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter$OnClickMyCampaign */
    /* loaded from: classes10.dex */
    public interface OnClickMyCampaign {
        void onClickMyCampaignItem(@NotNull DataItem dataItem);
    }

    public OneTrueMyCampaignAdapter(@NotNull FragmentActivity activity, @NotNull OneCampaignViewModel viewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f88740a = activity;
        this.f88741b = viewModel;
    }

    /* renamed from: a */
    public static /* synthetic */ void m15817a(OnClickMyCampaign onClickMyCampaign, DataItem dataItem, View view) {
        m15814d(onClickMyCampaign, dataItem, view);
    }

    /* renamed from: b */
    private final int m15816b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f88740a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: c */
    public final void m15815c(String str, ImageView imageView) {
        Glide.with(this.f88740a).clear(imageView);
        if (str.length() == 0) {
            Glide.with(this.f88740a).m74227load(Integer.valueOf(R.drawable.image_one_campaign_default)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f88740a, R.drawable.image_one_campaign_default)).error(ContextCompat.getDrawable(this.f88740a, R.drawable.image_one_campaign_default)).transform(new CenterCrop(), new RoundedCornersTransformation((int) WindowUtil.Companion.convertDpToPx(this.f88740a, 8.0f), 0, RoundedCornersTransformation.CornerType.TOP)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
            return;
        }
        Glide.with(this.f88740a).m74231load(Base64.decode(str, 0)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f88740a, R.drawable.image_one_campaign_default)).error(ContextCompat.getDrawable(this.f88740a, R.drawable.image_one_campaign_default)).transform(new CenterCrop(), new RoundedCornersTransformation((int) WindowUtil.Companion.convertDpToPx(this.f88740a, 8.0f), 0, RoundedCornersTransformation.CornerType.TOP)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
    }

    /* renamed from: d */
    public static final void m15814d(OnClickMyCampaign theListener, DataItem campaign, View view) {
        Intrinsics.checkNotNullParameter(theListener, "$theListener");
        Intrinsics.checkNotNullParameter(campaign, "$campaign");
        theListener.onClickMyCampaignItem(campaign);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f88743d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f88743d;
        Intrinsics.checkNotNull(list);
        final DataItem dataItem = (DataItem) list.get(i);
        if (holder instanceof MyCampaignItemViewHolder) {
            MyCampaignItemViewHolder myCampaignItemViewHolder = (MyCampaignItemViewHolder) holder;
            Glide.with(this.f88740a).clear(myCampaignItemViewHolder.getIvCampaignBanner());
            if (getItemCount() > 1) {
                myCampaignItemViewHolder.getLayoutCampaign().getLayoutParams().width = AbstractC22237sr0.roundToInt(m15816b() * 0.78d);
            }
            OneCampaignThemeModel oneCampaignThemeModel = this.f88744e;
            if (oneCampaignThemeModel != null) {
                myCampaignItemViewHolder.getTvCampaignName().setTextColor(ResourcesCompat.getColor(this.f88740a.getResources(), oneCampaignThemeModel.getFontColor(), null));
                myCampaignItemViewHolder.getIvCampaignDetail().setColorFilter(ResourcesCompat.getColor(this.f88740a.getResources(), oneCampaignThemeModel.getFontColor(), null));
            }
            myCampaignItemViewHolder.getLayoutCampaign().getLayoutParams();
            myCampaignItemViewHolder.getTvCampaignName().setText(dataItem.getCpName());
            TextView tvCampaignDetail = myCampaignItemViewHolder.getTvCampaignDetail();
            FragmentActivity fragmentActivity = this.f88740a;
            int i2 = R.string.one_campaign_header_period_title;
            String cpStartDate = dataItem.getCpStartDate();
            String str2 = "";
            if (cpStartDate == null || cpStartDate.length() == 0) {
                str = "";
            } else {
                String cpEndDate = dataItem.getCpEndDate();
                if (cpEndDate == null) {
                    cpEndDate = "2499-01-01";
                }
                String substring = cpEndDate.substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = dataItem.getCpStartDate().substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                if (Intrinsics.areEqual(substring, substring2)) {
                    str = DateFormatExtKt.getThaiDateShortMonth(DateFormatExtKt.getToDate(dataItem.getCpStartDate()));
                } else {
                    str = DateFormatExtKt.getThaiDateShortMonthYear(DateFormatExtKt.getToDate(dataItem.getCpStartDate()));
                }
            }
            String cpEndDate2 = dataItem.getCpEndDate();
            if (cpEndDate2 != null && cpEndDate2.length() != 0) {
                str2 = DateFormatExtKt.getThaiDateShortMonthYear(DateFormatExtKt.getToDate(dataItem.getCpEndDate()));
            }
            tvCampaignDetail.setText(fragmentActivity.getString(i2, str, str2));
            this.f88741b.getGetCampaignImageForListResponse().observe(this.f88740a, new Observer() { // from class: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter$onBindViewHolder$2

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueMyCampaignAdapter$onBindViewHolder$2$WhenMappings */
                /* loaded from: classes10.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[StatusResource.values().length];
                        try {
                            iArr[StatusResource.SUCCESS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.Observer
                /* renamed from: a */
                public final void onChanged(Resource resource) {
                    Pair pair;
                    if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1 && (pair = (Pair) resource.getData()) != null) {
                        OneTrueMyCampaignAdapter.this.m15815c((String) pair.getFirst(), (ImageView) pair.getSecond());
                    }
                }
            });
            String cpPhoto = dataItem.getCpPhoto();
            if (cpPhoto != null) {
                this.f88741b.getTrueCampaignImageForList(cpPhoto, myCampaignItemViewHolder.getIvCampaignBanner(), dataItem);
            }
            final OnClickMyCampaign onClickMyCampaign = this.f88742c;
            if (onClickMyCampaign != null) {
                myCampaignItemViewHolder.getLayoutCampaign().setOnClickListener(new View.OnClickListener() { // from class: xg1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneTrueMyCampaignAdapter.m15817a(OneTrueMyCampaignAdapter.OnClickMyCampaign.this, dataItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f88740a).inflate(R.layout.item_one_my_campaign, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new MyCampaignItemViewHolder(this, view);
    }

    public final void setList(@NotNull List<DataItem> listSetting) {
        Intrinsics.checkNotNullParameter(listSetting, "listSetting");
        this.f88743d = listSetting;
    }

    public final void setListener(@NotNull OnClickMyCampaign listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f88742c = listener;
    }

    public final void setTheme(@NotNull OneCampaignThemeModel theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f88744e = theme;
    }
}