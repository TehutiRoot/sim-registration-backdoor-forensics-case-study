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
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackage;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001a\u001b\u001cB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackage;", "stvRecommendPackages", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$OnSelectPackageListener;", "onSelectPackageListener", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$OnSelectPackageListener;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$OnSelectPackageListener;", "Companion", "OnSelectPackageListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter */
/* loaded from: classes10.dex */
public final class OneStvRecommendPackageAdapter extends RecyclerView.Adapter<ViewHolder> {
    @NotNull
    public static final String DEFAULT_COLOR = "#178729";

    /* renamed from: a */
    public final List f97543a;

    /* renamed from: b */
    public final OnSelectPackageListener f97544b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$Companion;", "", "()V", "DEFAULT_COLOR", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$OnSelectPackageListener;", "", "onSelectPackage", "", "pack", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackage;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter$OnSelectPackageListener */
    /* loaded from: classes10.dex */
    public interface OnSelectPackageListener {
        void onSelectPackage(@NotNull OneStvRecommendPackage oneStvRecommendPackage);
    }

    public OneStvRecommendPackageAdapter(@NotNull List<OneStvRecommendPackage> stvRecommendPackages, @NotNull OnSelectPackageListener onSelectPackageListener) {
        Intrinsics.checkNotNullParameter(stvRecommendPackages, "stvRecommendPackages");
        Intrinsics.checkNotNullParameter(onSelectPackageListener, "onSelectPackageListener");
        this.f97543a = stvRecommendPackages;
        this.f97544b = onSelectPackageListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97543a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind((OneStvRecommendPackage) this.f97543a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneProsermRecommBinding inflate = ItemOneProsermRecommBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(this, inflate, null, 2, null);
    }

    @Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "Lth/co/dtac/android/dtacone/databinding/ItemOneProsermRecommBinding;", "binding", "Landroid/view/View;", "containerView", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OneStvRecommendPackageAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneProsermRecommBinding;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackage;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackage;)V", "", "type", "", "d", "(Ljava/lang/String;)I", "Landroid/widget/ImageView;", "ivImageBanner", "imageUrl", "defaultImageId", "e", "(Landroid/widget/ImageView;Ljava/lang/String;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneProsermRecommBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder implements LayoutContainer {

        /* renamed from: a */
        public final ItemOneProsermRecommBinding f97545a;

        /* renamed from: b */
        public final View f97546b;

        /* renamed from: c */
        public final /* synthetic */ OneStvRecommendPackageAdapter f97547c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneStvRecommendPackageAdapter oneStvRecommendPackageAdapter, @NotNull ItemOneProsermRecommBinding binding, View containerView) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.f97547c = oneStvRecommendPackageAdapter;
            this.f97545a = binding;
            this.f97546b = containerView;
        }

        /* renamed from: c */
        public static final void m9843c(OneStvRecommendPackageAdapter this$0, OneStvRecommendPackage item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.f97544b.onSelectPackage(item);
        }

        public final void bind(@NotNull final OneStvRecommendPackage item) {
            int parseColor;
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView imageView = this.f97545a.ivType;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivType");
            m9841e(imageView, item.getTypeImage(), m9842d(item.getType()));
            this.f97545a.tvTitle.setText(item.getTitle());
            String descriptionTitle = item.getDescriptionTitle();
            if (descriptionTitle != null && descriptionTitle.length() != 0) {
                OneFontTextView oneFontTextView = this.f97545a.tvDescription;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvDescription");
                ViewVisibleExtKt.toVisible(oneFontTextView);
                this.f97545a.tvDescription.setText(item.getDescriptionTitle());
            } else {
                OneFontTextView oneFontTextView2 = this.f97545a.tvDescription;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView2, "binding.tvDescription");
                ViewVisibleExtKt.toGone(oneFontTextView2);
            }
            this.f97545a.tvNet.setText(item.getNet());
            this.f97545a.tvValidity.setText(item.getValidity());
            this.f97545a.tvPackageGroupType.setText(item.getPackageGroupType());
            this.f97545a.tvPriceLabel.setText(item.getPriceLabel());
            OneFontTextView oneFontTextView3 = this.f97545a.tvPrice;
            String price = item.getPrice();
            oneFontTextView3.setText(price + ".-");
            this.f97545a.tvCommission.setText(item.getCommission());
            try {
                parseColor = Color.parseColor(item.getCommissionColor());
            } catch (Exception unused) {
                parseColor = Color.parseColor("#178729");
            }
            this.f97545a.vgCommissionColor.setBackgroundColor(parseColor);
            View containerView = getContainerView();
            final OneStvRecommendPackageAdapter oneStvRecommendPackageAdapter = this.f97547c;
            containerView.setOnClickListener(new View.OnClickListener() { // from class: if1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStvRecommendPackageAdapter.ViewHolder.m9843c(oneStvRecommendPackageAdapter, item, view);
                }
            });
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
        public final int m9842d(java.lang.String r2) {
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
                int r2 = th.p047co.dtac.android.dtacone.R.drawable.z_transparent
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter.ViewHolder.m9842d(java.lang.String):int");
        }

        /* renamed from: e */
        public final void m9841e(ImageView imageView, String str, int i) {
            Glide.with(getContainerView().getContext()).clear(imageView);
            Glide.with(getContainerView().getContext()).m74229load(str).transition(DrawableTransitionOptions.withCrossFade()).centerCrop().placeholder(ContextCompat.getDrawable(getContainerView().getContext(), R.drawable.z_transparent)).error(i).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(imageView);
        }

        @Override // kotlinx.android.extensions.LayoutContainer
        @NotNull
        public View getContainerView() {
            return this.f97546b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ ViewHolder(th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter r1, th.p047co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding r2, android.view.View r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
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
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter.ViewHolder.<init>(th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneStvRecommendPackageAdapter, th.co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding, android.view.View, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}