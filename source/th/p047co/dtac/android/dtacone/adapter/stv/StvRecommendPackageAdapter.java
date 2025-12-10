package th.p047co.dtac.android.dtacone.adapter.stv;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.stv.StvRecommendPackageAdapter;
import th.p047co.dtac.android.dtacone.databinding.ItemProsermRecommBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.stv.StvRecommendPackage;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001a\u001b\u001cB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackage;", "stvRecommendPackages", "Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$OnSelectPackageListener;", "onSelectPackageListener", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$OnSelectPackageListener;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$OnSelectPackageListener;", "Companion", "OnSelectPackageListener", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.stv.StvRecommendPackageAdapter */
/* loaded from: classes7.dex */
public final class StvRecommendPackageAdapter extends RecyclerView.Adapter<ViewHolder> {
    @NotNull
    public static final String DEFAULT_COLOR = "#178729";

    /* renamed from: a */
    public final List f81547a;

    /* renamed from: b */
    public final OnSelectPackageListener f81548b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$Companion;", "", "()V", "DEFAULT_COLOR", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.stv.StvRecommendPackageAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$OnSelectPackageListener;", "", "onSelectPackage", "", "pack", "Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackage;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.stv.StvRecommendPackageAdapter$OnSelectPackageListener */
    /* loaded from: classes7.dex */
    public interface OnSelectPackageListener {
        void onSelectPackage(@NotNull StvRecommendPackage stvRecommendPackage);
    }

    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemProsermRecommBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/stv/StvRecommendPackageAdapter;Lth/co/dtac/android/dtacone/databinding/ItemProsermRecommBinding;)V", "Landroid/widget/ImageView;", "ivImageBanner", "", "imageUrl", "", "defaultImageId", "", "e", "(Landroid/widget/ImageView;Ljava/lang/String;I)V", "Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackage;", "item", "bind", "(Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackage;)V", "type", "d", "(Ljava/lang/String;)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemProsermRecommBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.stv.StvRecommendPackageAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemProsermRecommBinding f81549a;

        /* renamed from: b */
        public final /* synthetic */ StvRecommendPackageAdapter f81550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull StvRecommendPackageAdapter stvRecommendPackageAdapter, ItemProsermRecommBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81550b = stvRecommendPackageAdapter;
            this.f81549a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20212b(StvRecommendPackageAdapter stvRecommendPackageAdapter, StvRecommendPackage stvRecommendPackage, View view) {
            m20211c(stvRecommendPackageAdapter, stvRecommendPackage, view);
        }

        /* renamed from: c */
        public static final void m20211c(StvRecommendPackageAdapter this$0, StvRecommendPackage item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.f81548b.onSelectPackage(item);
        }

        /* renamed from: e */
        private final void m20209e(ImageView imageView, String str, int i) {
            Glide.with(this.itemView.getContext()).clear(imageView);
            Glide.with(this.itemView.getContext()).m74045load(str).transition(DrawableTransitionOptions.withCrossFade()).centerCrop().placeholder(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.z_grey)).error(i).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(imageView);
        }

        public final void bind(@NotNull final StvRecommendPackage item) {
            int parseColor;
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView imageView = this.f81549a.ivType;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
            m20209e(imageView, item.getTypeImage(), m20210d(item.getType()));
            this.f81549a.tvTitle.setText(item.getTitle());
            if (item.getDescriptionTitle().length() > 0) {
                this.f81549a.tvDescription.setText(item.getDescriptionTitle());
            } else {
                DtacFontTextView dtacFontTextView = this.f81549a.tvDescription;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvDescription");
                ViewVisibleExtKt.toGone(dtacFontTextView);
            }
            this.f81549a.tvNet.setText(item.getNet());
            this.f81549a.tvValidity.setText(item.getValidity());
            this.f81549a.tvPackageGroupType.setText(item.getPackageGroupType());
            this.f81549a.tvPriceLabel.setText(item.getPriceLabel());
            this.f81549a.tvPrice.setText(item.getPrice());
            this.f81549a.tvCommission.setText(item.getCommission());
            try {
                parseColor = Color.parseColor(item.getCommissionColor());
            } catch (Exception unused) {
                parseColor = Color.parseColor("#178729");
            }
            this.f81549a.vgCommissionColor.setBackgroundColor(parseColor);
            View view = this.itemView;
            final StvRecommendPackageAdapter stvRecommendPackageAdapter = this.f81550b;
            view.setOnClickListener(new View.OnClickListener() { // from class: iO1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StvRecommendPackageAdapter.ViewHolder.m20212b(stvRecommendPackageAdapter, item, view2);
                }
            });
        }

        /* renamed from: d */
        public final int m20210d(String str) {
            switch (str.hashCode()) {
                case -934918565:
                    if (str.equals("recent")) {
                        return R.drawable.ic_type_recent;
                    }
                    break;
                case 751319234:
                    if (str.equals("packplan")) {
                        return R.drawable.ic_type_packplan;
                    }
                    break;
                case 989204668:
                    if (str.equals("recommend")) {
                        return R.drawable.ic_type_recommend;
                    }
                    break;
                case 1241217027:
                    if (str.equals("mostBuy")) {
                        return R.drawable.ic_type_hot;
                    }
                    break;
            }
            return R.drawable.ic_type_default;
        }
    }

    public StvRecommendPackageAdapter(@NotNull List<StvRecommendPackage> stvRecommendPackages, @NotNull OnSelectPackageListener onSelectPackageListener) {
        Intrinsics.checkNotNullParameter(stvRecommendPackages, "stvRecommendPackages");
        Intrinsics.checkNotNullParameter(onSelectPackageListener, "onSelectPackageListener");
        this.f81547a = stvRecommendPackages;
        this.f81548b = onSelectPackageListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81547a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind((StvRecommendPackage) this.f81547a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemProsermRecommBinding inflate = ItemProsermRecommBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay….context), parent, false)");
        return new ViewHolder(this, inflate);
    }
}
