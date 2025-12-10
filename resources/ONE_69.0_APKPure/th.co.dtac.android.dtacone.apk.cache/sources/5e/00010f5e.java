package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "listPackage", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;", "selected", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;", "Companion", "MainPackageSummaryAdapterViewHolder", "NextPackageSummaryAdapterViewHolder", "Selected", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter */
/* loaded from: classes7.dex */
public final class PackageSummaryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List f81232a;

    /* renamed from: b */
    public final Selected f81233b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Companion;", "", "()V", "getVisibility", "", "packagesType", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PACKAGE_SUMMARY;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$Companion$WhenMappings */
        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PACKAGE_SUMMARY.values().length];
                try {
                    iArr[PACKAGE_SUMMARY.MAIN_PACKAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PACKAGE_SUMMARY.NEXT_DAY_PACKAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PACKAGE_SUMMARY.NEXT_CYCLE_PACKAGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PACKAGE_SUMMARY.ADDITIONAL_PACKAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getVisibility(@Nullable PACKAGE_SUMMARY package_summary) {
            int i;
            if (package_summary == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[package_summary.ordinal()];
            }
            if (i == 1 || i == 2) {
                return 8;
            }
            if (i != 3 && i != 4) {
                return 8;
            }
            return 0;
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n \u000e*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0019\u001a\n \u000e*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u001c\u0010\u001d\u001a\n \u000e*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$MainPackageSummaryAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "packageItem", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;", "selected", "", "bind", "(Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvPackageName", OperatorName.CURVE_TO, "tvDateTitle", "d", "tvDisplayDate", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", ProductAction.ACTION_REMOVE, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$MainPackageSummaryAdapterViewHolder */
    /* loaded from: classes7.dex */
    public static final class MainPackageSummaryAdapterViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Context f81234a;

        /* renamed from: b */
        public final DtacFontTextView f81235b;

        /* renamed from: c */
        public final DtacFontTextView f81236c;

        /* renamed from: d */
        public final DtacFontTextView f81237d;

        /* renamed from: e */
        public final ImageView f81238e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainPackageSummaryAdapterViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f81234a = itemView.getContext();
            this.f81235b = (DtacFontTextView) itemView.findViewById(R.id.tvPackageName);
            this.f81236c = (DtacFontTextView) itemView.findViewById(R.id.tvDateTitle);
            this.f81237d = (DtacFontTextView) itemView.findViewById(R.id.tvDisplayDate);
            this.f81238e = (ImageView) itemView.findViewById(R.id.remove);
        }

        public final void bind(@NotNull PackageItem packageItem, @NotNull Selected selected) {
            Intrinsics.checkNotNullParameter(packageItem, "packageItem");
            Intrinsics.checkNotNullParameter(selected, "selected");
            DtacFontTextView dtacFontTextView = this.f81235b;
            String packageCode = packageItem.getPackageCode();
            String packageDescription = packageItem.getPackageDescription();
            dtacFontTextView.setText("[" + packageCode + "] " + packageDescription);
            this.f81237d.setText(packageItem.getDisplayPackageDate());
            this.f81238e.setVisibility(PackageSummaryAdapter.Companion.getVisibility(packageItem.getType()));
            ImageView remove = this.f81238e;
            Intrinsics.checkNotNullExpressionValue(remove, "remove");
            OnSingleClickListenerKt.setOnSingleClickListener(remove, new PackageSummaryAdapter$MainPackageSummaryAdapterViewHolder$bind$1(packageItem, selected));
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001b\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001f\u001a\n \u0010*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$NextPackageSummaryAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "setColorTextPackageName", "()V", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "packageItem", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;", "selected", "bind", "(Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvPackageName", OperatorName.CURVE_TO, "tvDateTitle", "d", "tvDisplayDate", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", ProductAction.ACTION_REMOVE, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$NextPackageSummaryAdapterViewHolder */
    /* loaded from: classes7.dex */
    public static final class NextPackageSummaryAdapterViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Context f81239a;

        /* renamed from: b */
        public final DtacFontTextView f81240b;

        /* renamed from: c */
        public final DtacFontTextView f81241c;

        /* renamed from: d */
        public final DtacFontTextView f81242d;

        /* renamed from: e */
        public final ImageView f81243e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NextPackageSummaryAdapterViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f81239a = itemView.getContext();
            this.f81240b = (DtacFontTextView) itemView.findViewById(R.id.tvPackageName);
            this.f81241c = (DtacFontTextView) itemView.findViewById(R.id.tvDateTitle);
            this.f81242d = (DtacFontTextView) itemView.findViewById(R.id.tvDisplayDate);
            this.f81243e = (ImageView) itemView.findViewById(R.id.remove);
        }

        public final void bind(@NotNull PackageItem packageItem, @NotNull Selected selected) {
            Intrinsics.checkNotNullParameter(packageItem, "packageItem");
            Intrinsics.checkNotNullParameter(selected, "selected");
            DtacFontTextView dtacFontTextView = this.f81240b;
            String packageCode = packageItem.getPackageCode();
            String packageDescription = packageItem.getPackageDescription();
            dtacFontTextView.setText("[" + packageCode + "] " + packageDescription);
            this.f81241c.setText(this.f81239a.getResources().getString(R.string.start_date_pack));
            this.f81241c.setTextColor(ContextCompat.getColor(this.f81239a, R.color.warmGray));
            this.f81241c.setBackgroundResource(R.drawable.background_white_btn_grayd8_border);
            this.f81242d.setText(packageItem.getDisplayPackageDate());
            this.f81243e.setVisibility(PackageSummaryAdapter.Companion.getVisibility(packageItem.getType()));
            ImageView remove = this.f81243e;
            Intrinsics.checkNotNullExpressionValue(remove, "remove");
            OnSingleClickListenerKt.setOnSingleClickListener(remove, new PackageSummaryAdapter$NextPackageSummaryAdapterViewHolder$bind$1(packageItem, selected));
        }

        public final void setColorTextPackageName() {
            this.f81240b.setTextColor(ContextCompat.getColor(this.f81239a, R.color.skyBlueDtac));
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/PackageSummaryAdapter$Selected;", "", "onItemClickAdditionalPackages", "", "item", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "onItemClickMainPackages", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$Selected */
    /* loaded from: classes7.dex */
    public interface Selected {
        void onItemClickAdditionalPackages(@NotNull PackageItem packageItem);

        void onItemClickMainPackages(@NotNull PackageItem packageItem);
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PACKAGE_SUMMARY.values().length];
            try {
                iArr[PACKAGE_SUMMARY.MAIN_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PACKAGE_SUMMARY.NEXT_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PackageSummaryAdapter(@NotNull List<PackageItem> listPackage, @NotNull Selected selected) {
        Intrinsics.checkNotNullParameter(listPackage, "listPackage");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f81232a = listPackage;
        this.f81233b = selected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81232a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2;
        PACKAGE_SUMMARY page = ((PackageItem) this.f81232a.get(i)).getPage();
        if (page == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[page.ordinal()];
        }
        if (i2 == 1 || i2 != 2) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        PackageItem packageItem = (PackageItem) this.f81232a.get(i);
        if (holder instanceof NextPackageSummaryAdapterViewHolder) {
            if (packageItem.getType() == PACKAGE_SUMMARY.NEXT_CYCLE_PACKAGE) {
                ((NextPackageSummaryAdapterViewHolder) holder).setColorTextPackageName();
            }
            ((NextPackageSummaryAdapterViewHolder) holder).bind(packageItem, this.f81233b);
        } else if (holder instanceof MainPackageSummaryAdapterViewHolder) {
            ((MainPackageSummaryAdapterViewHolder) holder).bind(packageItem, this.f81233b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_package_summary, parent, false);
        if (i == 1) {
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new NextPackageSummaryAdapterViewHolder(view);
        }
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new MainPackageSummaryAdapterViewHolder(view);
    }
}