package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter;

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
import kotlinx.android.extensions.LayoutContainer;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.PackagesItem;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001a\u001b\u001cB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", "stvRecommendPackages", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$OnSelectPackageListener;", "onSelectPackageListener", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$OnSelectPackageListener;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$OnSelectPackageListener;", "Companion", "OnSelectPackageListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter */
/* loaded from: classes10.dex */
public final class OneStvRecommendPackageForTrueAdapter extends RecyclerView.Adapter<ViewHolder> {
    @NotNull
    public static final String DEFAULT_COLOR = "#178729";

    /* renamed from: a */
    public final List f97548a;

    /* renamed from: b */
    public final OnSelectPackageListener f97549b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$Companion;", "", "()V", "DEFAULT_COLOR", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$OnSelectPackageListener;", "", "onSelectRecommendPackageTrue", "", "pack", "Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter$OnSelectPackageListener */
    /* loaded from: classes10.dex */
    public interface OnSelectPackageListener {
        void onSelectRecommendPackageTrue(@NotNull PackagesItem packagesItem);
    }

    public OneStvRecommendPackageForTrueAdapter(@NotNull List<PackagesItem> stvRecommendPackages, @NotNull OnSelectPackageListener onSelectPackageListener) {
        Intrinsics.checkNotNullParameter(stvRecommendPackages, "stvRecommendPackages");
        Intrinsics.checkNotNullParameter(onSelectPackageListener, "onSelectPackageListener");
        this.f97548a = stvRecommendPackages;
        this.f97549b = onSelectPackageListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97548a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind((PackagesItem) this.f97548a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneProsermRecommBinding inflate = ItemOneProsermRecommBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(this, inflate, null, 2, null);
    }

    @Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "Lth/co/dtac/android/dtacone/databinding/ItemOneProsermRecommBinding;", "binding", "Landroid/view/View;", "containerView", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageForTrueAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneProsermRecommBinding;Landroid/view/View;)V", "", "type", "", "d", "(Ljava/lang/String;)I", "Landroid/widget/ImageView;", "ivImageBanner", "imageUrl", "defaultImageId", "", "e", "(Landroid/widget/ImageView;Ljava/lang/String;I)V", "Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", "item", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneProsermRecommBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder implements LayoutContainer {

        /* renamed from: a */
        public final ItemOneProsermRecommBinding f97550a;

        /* renamed from: b */
        public final View f97551b;

        /* renamed from: c */
        public final /* synthetic */ OneStvRecommendPackageForTrueAdapter f97552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneStvRecommendPackageForTrueAdapter oneStvRecommendPackageForTrueAdapter, @NotNull ItemOneProsermRecommBinding binding, View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.f97552c = oneStvRecommendPackageForTrueAdapter;
            this.f97550a = binding;
            this.f97551b = containerView;
        }

        /* renamed from: c */
        public static final void m9839c(OneStvRecommendPackageForTrueAdapter this$0, PackagesItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.f97549b.onSelectRecommendPackageTrue(item);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x001c, code lost:
            if (r2.equals("current") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0031, code lost:
            if (r2.equals("packplan") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
            return th.p047co.dtac.android.dtacone.R.drawable.ic_type_packplan;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final int m9838d(java.lang.String r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L43
                int r0 = r2.hashCode()
                switch(r0) {
                    case -934918565: goto L37;
                    case 751319234: goto L2b;
                    case 989204668: goto L1f;
                    case 1126940025: goto L16;
                    case 1241217027: goto La;
                    default: goto L9;
                }
            L9:
                goto L43
            La:
                java.lang.String r0 = "mostBuy"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L13
                goto L43
            L13:
                int r2 = th.p047co.dtac.android.dtacone.R.drawable.ic_type_hot
                goto L45
            L16:
                java.lang.String r0 = "current"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L34
                goto L43
            L1f:
                java.lang.String r0 = "recommend"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L28
                goto L43
            L28:
                int r2 = th.p047co.dtac.android.dtacone.R.drawable.ic_type_recommend
                goto L45
            L2b:
                java.lang.String r0 = "packplan"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L34
                goto L43
            L34:
                int r2 = th.p047co.dtac.android.dtacone.R.drawable.ic_type_packplan
                goto L45
            L37:
                java.lang.String r0 = "recent"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L40
                goto L43
            L40:
                int r2 = th.p047co.dtac.android.dtacone.R.drawable.ic_type_recent
                goto L45
            L43:
                int r2 = th.p047co.dtac.android.dtacone.R.drawable.image_default
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter.ViewHolder.m9838d(java.lang.String):int");
        }

        /* renamed from: e */
        private final void m9837e(ImageView imageView, String str, int i) {
            Glide.with(getContainerView().getContext()).clear(imageView);
            Glide.with(getContainerView().getContext()).m74229load(str).transition(DrawableTransitionOptions.withCrossFade()).centerCrop().placeholder(ContextCompat.getDrawable(getContainerView().getContext(), R.drawable.z_transparent)).error(i).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(imageView);
        }

        public final void bind(@NotNull final PackagesItem item) {
            int parseColor;
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView imageView = this.f97550a.ivType;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
            m9837e(imageView, item.getTypeImage(), m9838d(item.getCategoryId()));
            this.f97550a.tvTitle.setText(item.getTitle());
            String descriptionTitle = item.getDescriptionTitle();
            if (descriptionTitle != null && descriptionTitle.length() != 0) {
                OneFontTextView oneFontTextView = this.f97550a.tvDescription;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvDescription");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f97550a.tvDescription.setText(item.getDescriptionTitle());
            } else {
                OneFontTextView oneFontTextView2 = this.f97550a.tvDescription;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.tvDescription");
                ViewVisibleExtKt.toGone(oneFontTextView2);
            }
            this.f97550a.tvNet.setText(item.getNet());
            this.f97550a.tvValidity.setText(item.getValidity());
            this.f97550a.tvPackageGroupType.setText(item.getPackageGroupType());
            this.f97550a.tvPriceLabel.setText(item.getPriceLabel());
            OneFontTextView oneFontTextView3 = this.f97550a.tvPrice;
            String price = item.getPrice();
            oneFontTextView3.setText(price + ".-");
            this.f97550a.tvCommission.setText(item.getCommission());
            try {
                parseColor = Color.parseColor(item.getCommissionColor());
            } catch (Exception unused) {
                parseColor = Color.parseColor("#178729");
            }
            this.f97550a.vgCommissionColor.setBackgroundColor(parseColor);
            View containerView = getContainerView();
            final OneStvRecommendPackageForTrueAdapter oneStvRecommendPackageForTrueAdapter = this.f97552c;
            containerView.setOnClickListener(new View.OnClickListener() { // from class: jf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStvRecommendPackageForTrueAdapter.ViewHolder.m9839c(oneStvRecommendPackageForTrueAdapter, item, view);
                }
            });
        }

        @Override // kotlinx.android.extensions.LayoutContainer
        @NotNull
        public View getContainerView() {
            return this.f97551b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ ViewHolder(th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter r1, th.p047co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding r2, android.view.View r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r4 = r4 & 2
                if (r4 == 0) goto Ld
                androidx.constraintlayout.widget.ConstraintLayout r3 = r2.getRoot()
                java.lang.String r4 = "binding.root"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            Ld:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter.ViewHolder.<init>(th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageForTrueAdapter, th.co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding, android.view.View, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}