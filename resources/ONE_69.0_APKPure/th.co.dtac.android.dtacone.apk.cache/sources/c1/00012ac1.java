package th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter;

import android.util.Base64;
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
import io.realm.CollectionUtils;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.OneCampaignThemeModel;
import th.p047co.dtac.android.dtacone.util.WindowUtil;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003567B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel;", "viewModel", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel;)V", "", "base64", "Landroid/widget/ImageView;", "ivImageBanner", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Landroid/widget/ImageView;)V", "", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", CollectionUtils.LIST_TYPE, "setList", "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneCampaignThemeModel;", "theme", "setTheme", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneCampaignThemeModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter$OnClickNewCampaign;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter$OnClickNewCampaign;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/fragment/app/FragmentActivity;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter$OnClickNewCampaign;", "d", "Ljava/util/List;", "newCampaignList", "e", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneCampaignThemeModel;", "Companion", "NewCampaignItemViewHolder", "OnClickNewCampaign", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneTrueNewCampaignAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTrueNewCampaignAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter */
/* loaded from: classes10.dex */
public final class OneTrueNewCampaignAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final FragmentActivity f88752a;

    /* renamed from: b */
    public final OneCampaignViewModel f88753b;

    /* renamed from: c */
    public OnClickNewCampaign f88754c;

    /* renamed from: d */
    public List f88755d;

    /* renamed from: e */
    public OneCampaignThemeModel f88756e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter$NewCampaignItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutNewCampaign", "()Landroid/widget/RelativeLayout;", "layoutNewCampaign", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "getIvCampaignBanner", "()Landroid/widget/ImageView;", "ivCampaignBanner", "Landroid/widget/TextView;", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "getTvCampaignName", "()Landroid/widget/TextView;", "tvCampaignName", "d", "getTvCampaignDetail", "tvCampaignDetail", "e", "getBtnCampaignDetail", "btnCampaignDetail", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter$NewCampaignItemViewHolder */
    /* loaded from: classes10.dex */
    public final class NewCampaignItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f88757a;

        /* renamed from: b */
        public final ImageView f88758b;

        /* renamed from: c */
        public final TextView f88759c;

        /* renamed from: d */
        public final TextView f88760d;

        /* renamed from: e */
        public final ImageView f88761e;

        /* renamed from: f */
        public final /* synthetic */ OneTrueNewCampaignAdapter f88762f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewCampaignItemViewHolder(@NotNull OneTrueNewCampaignAdapter oneTrueNewCampaignAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f88762f = oneTrueNewCampaignAdapter;
            View findViewById = view.findViewById(R.id.layoutNewCampaign);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f88757a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivCampaignBanner);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88758b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f88759c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCampaignDetail);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f88760d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.btnCampaignDetail);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            this.f88761e = (ImageView) findViewById5;
        }

        @NotNull
        public final ImageView getBtnCampaignDetail() {
            return this.f88761e;
        }

        @NotNull
        public final ImageView getIvCampaignBanner() {
            return this.f88758b;
        }

        @NotNull
        public final RelativeLayout getLayoutNewCampaign() {
            return this.f88757a;
        }

        @NotNull
        public final TextView getTvCampaignDetail() {
            return this.f88760d;
        }

        @NotNull
        public final TextView getTvCampaignName() {
            return this.f88759c;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/campaign/adapter/OneTrueNewCampaignAdapter$OnClickNewCampaign;", "", "onClickNewCampaignItem", "", "campaign", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/DataItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter$OnClickNewCampaign */
    /* loaded from: classes10.dex */
    public interface OnClickNewCampaign {
        void onClickNewCampaignItem(@NotNull DataItem dataItem);
    }

    public OneTrueNewCampaignAdapter(@NotNull FragmentActivity activity, @NotNull OneCampaignViewModel viewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f88752a = activity;
        this.f88753b = viewModel;
    }

    /* renamed from: a */
    public static /* synthetic */ void m15812a(OneTrueNewCampaignAdapter oneTrueNewCampaignAdapter, DataItem dataItem, View view) {
        m15810c(oneTrueNewCampaignAdapter, dataItem, view);
    }

    /* renamed from: b */
    public final void m15811b(String str, ImageView imageView) {
        Glide.with(this.f88752a).clear(imageView);
        if (str.length() == 0) {
            Glide.with(this.f88752a).m74227load(Integer.valueOf(R.drawable.image_one_campaign_default)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f88752a, R.drawable.image_one_campaign_default)).error(ContextCompat.getDrawable(this.f88752a, R.drawable.image_one_campaign_default)).transform(new CenterCrop(), new RoundedCornersTransformation((int) WindowUtil.Companion.convertDpToPx(this.f88752a, 8.0f), 0, RoundedCornersTransformation.CornerType.TOP)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
        } else {
            Glide.with(this.f88752a).m74231load(Base64.decode(str, 0)).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).placeholder(ContextCompat.getDrawable(this.f88752a, R.drawable.image_one_campaign_default)).error(ContextCompat.getDrawable(this.f88752a, R.drawable.image_one_campaign_default)).transform(new RoundedCornersTransformation((int) WindowUtil.Companion.convertDpToPx(this.f88752a, 8.0f), 0, RoundedCornersTransformation.CornerType.LEFT)).diskCacheStrategy(DiskCacheStrategy.DATA).into(imageView);
        }
    }

    /* renamed from: c */
    public static final void m15810c(OneTrueNewCampaignAdapter this$0, DataItem campaign, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(campaign, "$campaign");
        OnClickNewCampaign onClickNewCampaign = this$0.f88754c;
        if (onClickNewCampaign != null) {
            onClickNewCampaign.onClickNewCampaignItem(campaign);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f88755d;
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
        List list = this.f88755d;
        Intrinsics.checkNotNull(list);
        final DataItem dataItem = (DataItem) list.get(i);
        if (holder instanceof NewCampaignItemViewHolder) {
            NewCampaignItemViewHolder newCampaignItemViewHolder = (NewCampaignItemViewHolder) holder;
            Glide.with(this.f88752a).clear(newCampaignItemViewHolder.getIvCampaignBanner());
            OneCampaignThemeModel oneCampaignThemeModel = this.f88756e;
            if (oneCampaignThemeModel != null) {
                newCampaignItemViewHolder.getTvCampaignName().setTextColor(ResourcesCompat.getColor(this.f88752a.getResources(), oneCampaignThemeModel.getFontColor(), null));
                newCampaignItemViewHolder.getBtnCampaignDetail().setColorFilter(ResourcesCompat.getColor(this.f88752a.getResources(), oneCampaignThemeModel.getNavigationNewCampaignColor(), null));
            }
            newCampaignItemViewHolder.getTvCampaignName().setText(dataItem.getCpName());
            TextView tvCampaignDetail = newCampaignItemViewHolder.getTvCampaignDetail();
            FragmentActivity fragmentActivity = this.f88752a;
            int i2 = R.string.one_campaign_new_detail_prefix;
            String cpRegisterDateTo = dataItem.getCpRegisterDateTo();
            if (cpRegisterDateTo != null && cpRegisterDateTo.length() != 0) {
                str = DateFormatExtKt.getThaiDateShortMonthYear(DateFormatExtKt.getToDate(dataItem.getCpRegisterDateTo()));
            } else {
                str = "";
            }
            tvCampaignDetail.setText(fragmentActivity.getString(i2, str));
            this.f88753b.getGetCampaignImageForListResponse().observe(this.f88752a, new Observer() { // from class: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter$onBindViewHolder$2

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.adapter.OneTrueNewCampaignAdapter$onBindViewHolder$2$WhenMappings */
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
                        OneTrueNewCampaignAdapter.this.m15811b((String) pair.getFirst(), (ImageView) pair.getSecond());
                    }
                }
            });
            String cpPhoto = dataItem.getCpPhoto();
            if (cpPhoto != null) {
                this.f88753b.getTrueCampaignImageForList(cpPhoto, newCampaignItemViewHolder.getIvCampaignBanner(), dataItem);
            }
            if (this.f88754c != null) {
                newCampaignItemViewHolder.getLayoutNewCampaign().setOnClickListener(new View.OnClickListener() { // from class: yg1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneTrueNewCampaignAdapter.m15812a(OneTrueNewCampaignAdapter.this, dataItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f88752a).inflate(R.layout.item_one_new_campaign, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new NewCampaignItemViewHolder(this, view);
    }

    public final void setList(@NotNull List<DataItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f88755d = list;
    }

    public final void setListener(@NotNull OnClickNewCampaign listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f88754c = listener;
    }

    public final void setTheme(@NotNull OneCampaignThemeModel theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f88756e = theme;
    }
}