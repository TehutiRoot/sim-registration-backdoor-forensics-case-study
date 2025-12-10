package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.IncludeOneAdditionalImageBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneRetailerOnlineAdditionalBlankImageBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneRetailerOnlineOptionalImageBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.online_register.additional_image.AdditionalImageItem;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004,-+.B1\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "additionalList", "", "isRetakePhoto", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Ljava/util/List;Z)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.CURVE_TO, "Ljava/util/List;", "d", "Z", "e", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;", "Companion", "AdditionalImageViewHolder", "BlankAdditionalImageViewHolder", "OnAdditionalImageListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAdditionalImageAdapter */
/* loaded from: classes10.dex */
public final class OneAdditionalImageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Context f92522a;

    /* renamed from: b */
    public final BitmapUtil f92523b;

    /* renamed from: c */
    public final List f92524c;

    /* renamed from: d */
    public final boolean f92525d;

    /* renamed from: e */
    public OnAdditionalImageListener f92526e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$AdditionalImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneRetailerOnlineOptionalImageBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneRetailerOnlineOptionalImageBinding;)V", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "item", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;", "onClickListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "bind", "(Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;Landroid/content/Context;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneRetailerOnlineOptionalImageBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAdditionalImageAdapter$AdditionalImageViewHolder */
    /* loaded from: classes10.dex */
    public final class AdditionalImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneRetailerOnlineOptionalImageBinding f92527a;

        /* renamed from: b */
        public final /* synthetic */ OneAdditionalImageAdapter f92528b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalImageViewHolder(@NotNull OneAdditionalImageAdapter oneAdditionalImageAdapter, ItemOneRetailerOnlineOptionalImageBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f92528b = oneAdditionalImageAdapter;
            this.f92527a = binding;
        }

        public final void bind(@NotNull AdditionalImageItem item, @Nullable OnAdditionalImageListener onAdditionalImageListener, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(context, "context");
            ItemOneRetailerOnlineOptionalImageBinding itemOneRetailerOnlineOptionalImageBinding = this.f92527a;
            OneAdditionalImageAdapter oneAdditionalImageAdapter = this.f92528b;
            IncludeOneAdditionalImageBinding includeOneAdditionalImageBinding = itemOneRetailerOnlineOptionalImageBinding.incAdditionalImage;
            String imageNameTitle = item.getImageNameTitle();
            if (imageNameTitle != null) {
                includeOneAdditionalImageBinding.onlineRegisterImageNameTitleTextView.setText(imageNameTitle);
            }
            if (oneAdditionalImageAdapter.f92525d) {
                ConstraintLayout retakePhotoLayout = includeOneAdditionalImageBinding.retakePhotoLayout;
                Intrinsics.checkNotNullExpressionValue(retakePhotoLayout, "retakePhotoLayout");
                ViewVisibleExtKt.toVisible(retakePhotoLayout);
            } else {
                ConstraintLayout retakePhotoLayout2 = includeOneAdditionalImageBinding.retakePhotoLayout;
                Intrinsics.checkNotNullExpressionValue(retakePhotoLayout2, "retakePhotoLayout");
                ViewVisibleExtKt.toGone(retakePhotoLayout2);
            }
            String imageName = item.getImageName();
            if (imageName != null) {
                Glide.with(context).clear(itemOneRetailerOnlineOptionalImageBinding.onlineRegisterIdCardImageImageView);
                Glide.with(context).m74223load(oneAdditionalImageAdapter.f92523b.loadInternalBitmap(imageName)).skipMemoryCache(true).error(ContextCompat.getDrawable(context, R.drawable.image_default)).diskCacheStrategy(DiskCacheStrategy.NONE).into(itemOneRetailerOnlineOptionalImageBinding.onlineRegisterIdCardImageImageView);
            }
            ConstraintLayout root = itemOneRetailerOnlineOptionalImageBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "root");
            OnSingleClickListenerKt.setOnSingleClickListener(root, new OneAdditionalImageAdapter$AdditionalImageViewHolder$bind$1$3(onAdditionalImageListener, item, this));
        }
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$BlankAdditionalImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneRetailerOnlineAdditionalBlankImageBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneRetailerOnlineAdditionalBlankImageBinding;)V", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "item", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneRetailerOnlineAdditionalBlankImageBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAdditionalImageAdapter$BlankAdditionalImageViewHolder */
    /* loaded from: classes10.dex */
    public final class BlankAdditionalImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneRetailerOnlineAdditionalBlankImageBinding f92529a;

        /* renamed from: b */
        public final /* synthetic */ OneAdditionalImageAdapter f92530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlankAdditionalImageViewHolder(@NotNull OneAdditionalImageAdapter oneAdditionalImageAdapter, ItemOneRetailerOnlineAdditionalBlankImageBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f92530b = oneAdditionalImageAdapter;
            this.f92529a = binding;
        }

        public final void bind(@NotNull AdditionalImageItem item, @Nullable OnAdditionalImageListener onAdditionalImageListener) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOneRetailerOnlineAdditionalBlankImageBinding itemOneRetailerOnlineAdditionalBlankImageBinding = this.f92529a;
            itemOneRetailerOnlineAdditionalBlankImageBinding.tvAdditionalImageTitle.setText(item.getImageNameTitle());
            ConstraintLayout root = itemOneRetailerOnlineAdditionalBlankImageBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "root");
            OnSingleClickListenerKt.setOnSingleClickListener(root, new C14808x1af743e7(onAdditionalImageListener, item, this));
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$Companion;", "", "()V", "VIEW_TYPE_ADDITIONAL", "", "VIEW_TYPE_BLANK", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAdditionalImageAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAdditionalImageAdapter$OnAdditionalImageListener;", "", "onClickAdditional", "", "additionalImageItem", "Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "position", "", "onClickBlank", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAdditionalImageAdapter$OnAdditionalImageListener */
    /* loaded from: classes10.dex */
    public interface OnAdditionalImageListener {
        void onClickAdditional(@NotNull AdditionalImageItem additionalImageItem, int i);

        void onClickBlank(@NotNull AdditionalImageItem additionalImageItem, int i);
    }

    @Inject
    public OneAdditionalImageAdapter(@Nullable Context context, @NotNull BitmapUtil bitmapUtil, @NotNull List<AdditionalImageItem> additionalList, boolean z) {
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(additionalList, "additionalList");
        this.f92522a = context;
        this.f92523b = bitmapUtil;
        this.f92524c = additionalList;
        this.f92525d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92524c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (!((AdditionalImageItem) this.f92524c.get(i)).isHavePhoto()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AdditionalImageItem additionalImageItem = (AdditionalImageItem) this.f92524c.get(i);
        if (holder instanceof AdditionalImageViewHolder) {
            Context context = this.f92522a;
            if (context != null) {
                ((AdditionalImageViewHolder) holder).bind(additionalImageItem, this.f92526e, context);
            }
        } else if ((holder instanceof BlankAdditionalImageViewHolder) && this.f92522a != null) {
            ((BlankAdditionalImageViewHolder) holder).bind(additionalImageItem, this.f92526e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == 0) {
            ItemOneRetailerOnlineOptionalImageBinding inflate = ItemOneRetailerOnlineOptionalImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            return new AdditionalImageViewHolder(this, inflate);
        }
        ItemOneRetailerOnlineAdditionalBlankImageBinding inflate2 = ItemOneRetailerOnlineAdditionalBlankImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …  false\n                )");
        return new BlankAdditionalImageViewHolder(this, inflate2);
    }

    public final void setOnClickListener(@NotNull OnAdditionalImageListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f92526e = onClickListener;
    }
}