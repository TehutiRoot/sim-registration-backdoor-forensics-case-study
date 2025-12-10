package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SubscriberPackageInfo;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePackageAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePackageAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePackageAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePackageAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackageAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f90128a;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSalePackageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindView", "", "item", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSalePackageAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public final void bindView(@NotNull SubscriberPackageInfo item) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) this.itemView.findViewById(R.id.itemName);
            if (item.getNextDay().length() == 0) {
                str2 = "[" + item.getCode() + "] " + item.getName();
            } else {
                List split$default = StringsKt__StringsKt.split$default((CharSequence) item.getNextDay(), new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, (Object) null);
                try {
                    str = this.itemView.getContext().getString(R.string.start_date) + ": " + split$default.get(2) + RemoteSettings.FORWARD_SLASH_STRING + split$default.get(1) + RemoteSettings.FORWARD_SLASH_STRING + split$default.get(0);
                } catch (Exception e) {
                    e.printStackTrace();
                    str = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) str) + "\n[" + item.getCode() + "] " + item.getName());
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), R.color.warningMessage)), 0, str.length(), 33);
                str2 = spannableStringBuilder;
            }
            textView.setText(str2);
        }
    }

    public OneDeviceSalePackageAdapter(@NotNull List<SubscriberPackageInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f90128a = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90128a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((SubscriberPackageInfo) this.f90128a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_package_row_show_only, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}