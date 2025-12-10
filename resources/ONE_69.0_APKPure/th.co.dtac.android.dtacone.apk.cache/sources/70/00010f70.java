package th.p047co.dtac.android.dtacone.adapter.device_sale;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSalePackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSalePackageAdapter$ViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", FirebaseAnalytics.Param.ITEMS, "<init>", "(ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSalePackageAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSalePackageAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.device_sale.DeviceSalePackageAdapter */
/* loaded from: classes7.dex */
public final class DeviceSalePackageAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f81259a;

    /* renamed from: b */
    public final List f81260b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/device_sale/DeviceSalePackageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindView", "", "item", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.device_sale.DeviceSalePackageAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public final void bindView(@NotNull SubscriberPackageInfo item) {
            String str;
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) this.itemView.findViewById(R.id.itemName);
            if (item.getNextDay().length() == 0) {
                str = "[" + item.getCode() + "] " + item.getName();
            } else {
                List split$default = StringsKt__StringsKt.split$default((CharSequence) item.getNextDay(), new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, (Object) null);
                String str2 = this.itemView.getContext().getString(R.string.start_date) + ": " + split$default.get(2) + RemoteSettings.FORWARD_SLASH_STRING + split$default.get(1) + RemoteSettings.FORWARD_SLASH_STRING + split$default.get(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + "\n[" + item.getCode() + "] " + item.getName());
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), R.color.warningMessage)), 0, str2.length(), 33);
                str = spannableStringBuilder;
            }
            textView.setText(str);
        }
    }

    public DeviceSalePackageAdapter(@LayoutRes int i, @NotNull List<SubscriberPackageInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f81259a = i;
        this.f81260b = items;
    }

    public final int getIdLayout() {
        return this.f81259a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81260b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((SubscriberPackageInfo) this.f81260b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f81259a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}