package th.p047co.dtac.android.dtacone.adapter.online_register;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.makeramen.roundedimageview.RoundedImageView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.online_register.additional_image.AdditionalImageItem;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00046758B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00069"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "<init>", "(Landroid/app/Activity;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;)V", "", "imageName", "Landroid/widget/ImageView;", "ivImageBanner", "", OperatorName.CURVE_TO, "(Ljava/lang/String;Landroid/widget/ImageView;)V", "", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "listSetting", "setList", "(Ljava/util/List;)V", "", "isTackAgain", "setTackAgain", "(Z)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$OnClickAdditionalImage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$OnClickAdditionalImage;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "Ljava/util/List;", "additionalList", "d", "Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$OnClickAdditionalImage;", "e", "Z", "Companion", "AdditionalImageViewHolder", "BlankAdditionalImageViewHolder", "OnClickAdditionalImage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter */
/* loaded from: classes7.dex */
public final class AdditionalImageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81408a;

    /* renamed from: b */
    public final BitmapUtil f81409b;

    /* renamed from: c */
    public List f81410c;

    /* renamed from: d */
    public OnClickAdditionalImage f81411d;

    /* renamed from: e */
    public boolean f81412e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$AdditionalImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter;Landroid/view/View;)V", "Landroid/widget/ImageView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/ImageView;", "getIvAdditional", "()Landroid/widget/ImageView;", "ivAdditional", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIvTackAgain", "ivTackAgain", "Landroid/widget/TextView;", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "getTvImageNameTitle", "()Landroid/widget/TextView;", "tvImageNameTitle", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter$AdditionalImageViewHolder */
    /* loaded from: classes7.dex */
    public final class AdditionalImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f81413a;

        /* renamed from: b */
        public final ImageView f81414b;

        /* renamed from: c */
        public final TextView f81415c;

        /* renamed from: d */
        public final /* synthetic */ AdditionalImageAdapter f81416d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalImageViewHolder(@NotNull AdditionalImageAdapter additionalImageAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81416d = additionalImageAdapter;
            View findViewById = view.findViewById(R.id.ivAdditional);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.makeramen.roundedimageview.RoundedImageView");
            this.f81413a = (RoundedImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ivTackAgain);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81414b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvImageNameTitle);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81415c = (TextView) findViewById3;
        }

        @NotNull
        public final ImageView getIvAdditional() {
            return this.f81413a;
        }

        @NotNull
        public final ImageView getIvTackAgain() {
            return this.f81414b;
        }

        @NotNull
        public final TextView getTvImageNameTitle() {
            return this.f81415c;
        }
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$BlankAdditionalImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter;Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutBlankAdditional", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutBlankAdditional", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvAdditionalImageTitle", "()Landroid/widget/TextView;", "tvAdditionalImageTitle", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter$BlankAdditionalImageViewHolder */
    /* loaded from: classes7.dex */
    public final class BlankAdditionalImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ConstraintLayout f81417a;

        /* renamed from: b */
        public final TextView f81418b;

        /* renamed from: c */
        public final /* synthetic */ AdditionalImageAdapter f81419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlankAdditionalImageViewHolder(@NotNull AdditionalImageAdapter additionalImageAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81419c = additionalImageAdapter;
            View findViewById = view.findViewById(R.id.layoutBlankAdditional);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            this.f81417a = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvAdditionalImageTitle);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81418b = (TextView) findViewById2;
        }

        @NotNull
        public final ConstraintLayout getLayoutBlankAdditional() {
            return this.f81417a;
        }

        @NotNull
        public final TextView getTvAdditionalImageTitle() {
            return this.f81418b;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$Companion;", "", "()V", "VIEW_TYPE_ADDITIONAL", "", "VIEW_TYPE_BLANK", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/AdditionalImageAdapter$OnClickAdditionalImage;", "", "onClickAdditional", "", "additionalImageItem", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "position", "", "onClickBlank", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter$OnClickAdditionalImage */
    /* loaded from: classes7.dex */
    public interface OnClickAdditionalImage {
        void onClickAdditional(@NotNull AdditionalImageItem additionalImageItem, int i);

        void onClickBlank(@NotNull AdditionalImageItem additionalImageItem, int i);
    }

    @Inject
    public AdditionalImageAdapter(@NotNull Activity activity, @NotNull BitmapUtil bitmapUtil) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        this.f81408a = activity;
        this.f81409b = bitmapUtil;
        this.f81410c = new ArrayList();
        this.f81412e = true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20484a(AdditionalImageAdapter additionalImageAdapter, AdditionalImageItem additionalImageItem, int i, View view) {
        m20480e(additionalImageAdapter, additionalImageItem, i, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20483b(AdditionalImageAdapter additionalImageAdapter, AdditionalImageItem additionalImageItem, int i, View view) {
        m20481d(additionalImageAdapter, additionalImageItem, i, view);
    }

    /* renamed from: c */
    private final void m20482c(String str, ImageView imageView) {
        Glide.with(this.f81408a).clear(imageView);
        Glide.with(this.f81408a).m74223load(this.f81409b.loadInternalBitmap(str)).skipMemoryCache(true).error(ContextCompat.getDrawable(this.f81408a, R.drawable.image_default)).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }

    /* renamed from: d */
    public static final void m20481d(AdditionalImageAdapter this$0, AdditionalImageItem item, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        OnClickAdditionalImage onClickAdditionalImage = this$0.f81411d;
        if (onClickAdditionalImage != null) {
            onClickAdditionalImage.onClickAdditional(item, i);
        }
    }

    /* renamed from: e */
    public static final void m20480e(AdditionalImageAdapter this$0, AdditionalImageItem item, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        OnClickAdditionalImage onClickAdditionalImage = this$0.f81411d;
        if (onClickAdditionalImage != null) {
            onClickAdditionalImage.onClickBlank(item, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81410c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (!((AdditionalImageItem) this.f81410c.get(i)).isHavePhoto()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final AdditionalImageItem additionalImageItem = (AdditionalImageItem) this.f81410c.get(i);
        if (holder instanceof AdditionalImageViewHolder) {
            AdditionalImageViewHolder additionalImageViewHolder = (AdditionalImageViewHolder) holder;
            additionalImageViewHolder.getTvImageNameTitle().setText(additionalImageItem.getImageNameTitle());
            String imageName = additionalImageItem.getImageName();
            if (imageName != null) {
                m20482c(imageName, additionalImageViewHolder.getIvAdditional());
                additionalImageViewHolder.getIvAdditional().setOnClickListener(new View.OnClickListener() { // from class: t2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdditionalImageAdapter.m20483b(AdditionalImageAdapter.this, additionalImageItem, i, view);
                    }
                });
                if (!this.f81412e) {
                    ViewVisibleExtKt.toGone(additionalImageViewHolder.getIvTackAgain());
                } else {
                    ViewVisibleExtKt.toVisible(additionalImageViewHolder.getIvTackAgain());
                }
            }
        } else if (holder instanceof BlankAdditionalImageViewHolder) {
            BlankAdditionalImageViewHolder blankAdditionalImageViewHolder = (BlankAdditionalImageViewHolder) holder;
            blankAdditionalImageViewHolder.getTvAdditionalImageTitle().setText(additionalImageItem.getImageNameTitle());
            blankAdditionalImageViewHolder.getLayoutBlankAdditional().setOnClickListener(new View.OnClickListener() { // from class: u2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdditionalImageAdapter.m20484a(AdditionalImageAdapter.this, additionalImageItem, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        if (i == 0) {
            View view = LayoutInflater.from(this.f81408a).inflate(R.layout.item_image_additional, p0, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new AdditionalImageViewHolder(this, view);
        }
        View view2 = LayoutInflater.from(this.f81408a).inflate(R.layout.item_image_additional_blank, p0, false);
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return new BlankAdditionalImageViewHolder(this, view2);
    }

    public final void setList(@NotNull List<AdditionalImageItem> listSetting) {
        Intrinsics.checkNotNullParameter(listSetting, "listSetting");
        this.f81410c = listSetting;
    }

    public final void setListener(@NotNull OnClickAdditionalImage listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81411d = listener;
    }

    public final void setTackAgain(boolean z) {
        this.f81412e = z;
    }
}