package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.BlacklistSubscriberInfoItemBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.customerenquiry.BSubsInfo;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberInfoAdapter$ViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/BSubsInfo;", FirebaseAnalytics.Param.ITEMS, "<init>", "(ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberInfoAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberInfoAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.SubscriberInfoAdapter */
/* loaded from: classes7.dex */
public final class SubscriberInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f81244a;

    /* renamed from: b */
    public final List f81245b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/BlacklistSubscriberInfoItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/BlacklistSubscriberInfoItemBinding;)V", "Lth/co/dtac/android/dtacone/model/customerenquiry/BSubsInfo;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/customerenquiry/BSubsInfo;)V", "", NotificationCompat.CATEGORY_STATUS, "", OperatorName.CURVE_TO, "(Ljava/lang/String;)I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/BlacklistSubscriberInfoItemBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.SubscriberInfoAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final BlacklistSubscriberInfoItemBinding f81246a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull BlacklistSubscriberInfoItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81246a = binding;
        }

        /* renamed from: b */
        public final int m20558b(String str) {
            if (Intrinsics.areEqual(str, "S")) {
                return R.color.yellowOne;
            }
            if (Intrinsics.areEqual(str, "C")) {
                return R.color.grayishBrown48;
            }
            return R.color.colorGreen;
        }

        public final void bind(@NotNull BSubsInfo item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f81246a.valueSubscriberNumber.setText(StringExtKt.maskText(PhoneNumberExtKt.toPretty(item.getSubscriberNumber()), Constant.PHONE_FORMAT));
            this.f81246a.valueName.setText(item.getName());
            this.f81246a.valueCompanyName.setText(item.getCompanyName());
            DtacFontTextView dtacFontTextView = this.f81246a.valueSubscriberStatus;
            dtacFontTextView.setText(dtacFontTextView.getContext().getString(m20557c(item.getSubscriberStatus())));
            dtacFontTextView.setTextColor(ContextCompat.getColor(dtacFontTextView.getContext(), m20558b(item.getSubscriberStatus())));
        }

        /* renamed from: c */
        public final int m20557c(String str) {
            if (Intrinsics.areEqual(str, "S")) {
                return R.string.advisory_enquiry_customer_subscriber_status_suspend;
            }
            if (Intrinsics.areEqual(str, "C")) {
                return R.string.advisory_enquiry_customer_subscriber_status_close;
            }
            return R.string.advisory_enquiry_customer_subscriber_status_active;
        }
    }

    public SubscriberInfoAdapter(@LayoutRes int i, @NotNull List<BSubsInfo> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f81244a = i;
        this.f81245b = items;
    }

    public final int getIdLayout() {
        return this.f81244a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81245b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind((BSubsInfo) this.f81245b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BlacklistSubscriberInfoItemBinding inflate = BlacklistSubscriberInfoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(inflate);
    }
}