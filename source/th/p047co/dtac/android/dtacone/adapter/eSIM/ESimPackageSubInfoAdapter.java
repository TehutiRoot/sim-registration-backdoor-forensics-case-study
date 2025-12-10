package th.p047co.dtac.android.dtacone.adapter.eSIM;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.eSIM.ESimPackageSubInfoAdapter;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.esim.PackageBenefitItem;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSubInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSubInfoAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/esim/PackageBenefitItem;", "packageBenefit", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSubInfoAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSubInfoAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimPackageSubInfoAdapter */
/* loaded from: classes7.dex */
public final class ESimPackageSubInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f81198a;

    /* renamed from: b */
    public final Function0 f81199b;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSubInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/esim/PackageBenefitItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/esim/PackageBenefitItem;)V", "", "benefitName", "", "getImageResource", "(Ljava/lang/String;)I", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/appcompat/widget/AppCompatImageView;", "icInfo", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.eSIM.ESimPackageSubInfoAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final AppCompatImageView f81200a;

        /* renamed from: b */
        public final DtacFontTextView f81201b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f81200a = (AppCompatImageView) itemView.findViewById(R.id.icInfo);
            this.f81201b = (DtacFontTextView) itemView.findViewById(R.id.tvData);
        }

        public final void bind(@Nullable PackageBenefitItem packageBenefitItem) {
            String str;
            String benefitDesc;
            AppCompatImageView appCompatImageView = this.f81200a;
            if (packageBenefitItem != null) {
                str = packageBenefitItem.getBenefitName();
            } else {
                str = null;
            }
            appCompatImageView.setImageResource(getImageResource(str));
            DtacFontTextView tvData = this.f81201b;
            Intrinsics.checkNotNullExpressionValue(tvData, "tvData");
            String str2 = "";
            String str3 = (packageBenefitItem == null || (str3 = packageBenefitItem.getBenefitQuota()) == null) ? "" : "";
            if (packageBenefitItem != null && (benefitDesc = packageBenefitItem.getBenefitDesc()) != null) {
                str2 = benefitDesc;
            }
            StringExtKt.setFontSize(tvData, str3, str2);
        }

        public final int getImageResource(@Nullable String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 78205:
                        if (str.equals(Constant.BenefitName.Net)) {
                            return R.drawable.icons_internet;
                        }
                        break;
                    case 2122698:
                        if (str.equals(Constant.BenefitName.Data)) {
                            return R.drawable.icons_internet;
                        }
                        break;
                    case 2695989:
                        if (str.equals(Constant.BenefitName.Wifi)) {
                            return R.drawable.icons_wifi;
                        }
                        break;
                    case 82833682:
                        if (str.equals(Constant.BenefitName.Voice)) {
                            return R.drawable.icons_call_black;
                        }
                        break;
                }
            }
            return R.drawable.icons_internet;
        }
    }

    public ESimPackageSubInfoAdapter(@Nullable List<PackageBenefitItem> list, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f81198a = list;
        this.f81199b = onClick;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20364a(ESimPackageSubInfoAdapter eSimPackageSubInfoAdapter, View view) {
        m20363b(eSimPackageSubInfoAdapter, view);
    }

    /* renamed from: b */
    public static final void m20363b(ESimPackageSubInfoAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81199b.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81198a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f81198a;
        holder.bind(list != null ? (PackageBenefitItem) list.get(i) : null);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: BN
            {
                ESimPackageSubInfoAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ESimPackageSubInfoAdapter.m20364a(ESimPackageSubInfoAdapter.this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_item_package_info_sku, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}
