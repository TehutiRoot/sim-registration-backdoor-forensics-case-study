package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummarySubInfoAdapter;
import th.p047co.dtac.android.dtacone.model.customerenquiry.InfoItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummarySubInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummarySubInfoAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/InfoItem;", "info", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummarySubInfoAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummarySubInfoAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getInfo", "()Ljava/util/List;", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummarySubInfoAdapter */
/* loaded from: classes7.dex */
public final class DeviceSummarySubInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f81122a;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010,\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018¨\u0006-"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummarySubInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/customerenquiry/InfoItem;", "infoItem", "", "position", "", "bind", "(Lth/co/dtac/android/dtacone/model/customerenquiry/InfoItem;I)V", "", OperatorName.FILL_NON_ZERO, "(Ljava/lang/String;)Ljava/lang/String;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.CLOSE_PATH, OperatorName.NON_STROKING_GRAY, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvStatus", OperatorName.CURVE_TO, "tvRemainingPeriod", "d", "tvContractPeriod", "e", "tvContractStartEndDate", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "arrowdown", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "itemLayout", "layoutDescription", "i", "tvModel", OperatorName.SET_LINE_JOINSTYLE, "tvDiscount", OperatorName.NON_STROKING_CMYK, "tvReason", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummarySubInfoAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final View f81123a;

        /* renamed from: b */
        public final DtacFontTextView f81124b;

        /* renamed from: c */
        public final DtacFontTextView f81125c;

        /* renamed from: d */
        public final DtacFontTextView f81126d;

        /* renamed from: e */
        public final DtacFontTextView f81127e;

        /* renamed from: f */
        public final ImageView f81128f;

        /* renamed from: g */
        public final ConstraintLayout f81129g;

        /* renamed from: h */
        public final ConstraintLayout f81130h;

        /* renamed from: i */
        public final DtacFontTextView f81131i;

        /* renamed from: j */
        public final DtacFontTextView f81132j;

        /* renamed from: k */
        public final DtacFontTextView f81133k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.status);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.status)");
            this.f81123a = findViewById;
            View findViewById2 = itemView.findViewById(R.id.tvStatus);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tvStatus)");
            this.f81124b = (DtacFontTextView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tvRemainingPeriod);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.tvRemainingPeriod)");
            this.f81125c = (DtacFontTextView) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.tvContractPeriod);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.tvContractPeriod)");
            this.f81126d = (DtacFontTextView) findViewById4;
            View findViewById5 = itemView.findViewById(R.id.tvContractStartEndDate);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.tvContractStartEndDate)");
            this.f81127e = (DtacFontTextView) findViewById5;
            View findViewById6 = itemView.findViewById(R.id.arrowdown);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.arrowdown)");
            this.f81128f = (ImageView) findViewById6;
            View findViewById7 = itemView.findViewById(R.id.itemLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "itemView.findViewById(R.id.itemLayout)");
            this.f81129g = (ConstraintLayout) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.layoutDescription);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "itemView.findViewById(R.id.layoutDescription)");
            this.f81130h = (ConstraintLayout) findViewById8;
            View findViewById9 = itemView.findViewById(R.id.tvModel);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "itemView.findViewById(R.id.tvModel)");
            this.f81131i = (DtacFontTextView) findViewById9;
            View findViewById10 = itemView.findViewById(R.id.tvDiscount);
            Intrinsics.checkNotNullExpressionValue(findViewById10, "itemView.findViewById(R.id.tvDiscount)");
            this.f81132j = (DtacFontTextView) findViewById10;
            View findViewById11 = itemView.findViewById(R.id.tvReason);
            Intrinsics.checkNotNullExpressionValue(findViewById11, "itemView.findViewById(R.id.tvReason)");
            this.f81133k = (DtacFontTextView) findViewById11;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20392b(ViewHolder viewHolder, View view) {
            m20390d(viewHolder, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20391c(ViewHolder viewHolder, View view) {
            m20389e(viewHolder, view);
        }

        /* renamed from: d */
        public static final void m20390d(ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f81128f.performClick();
        }

        /* renamed from: e */
        public static final void m20389e(ViewHolder this$0, View view) {
            Animation loadAnimation;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.f81130h.getVisibility() == 8) {
                loadAnimation = AnimationUtils.loadAnimation(this$0.itemView.getContext(), R.anim.rotate_clockwise);
            } else {
                loadAnimation = AnimationUtils.loadAnimation(this$0.itemView.getContext(), R.anim.rotate_anti_clockwise);
            }
            if (this$0.f81130h.getVisibility() == 8) {
                this$0.m20386h(this$0.f81130h);
            } else {
                this$0.m20387g(this$0.f81130h);
            }
            loadAnimation.setDuration(300L);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setFillEnabled(true);
            loadAnimation.setFillAfter(true);
            this$0.f81128f.startAnimation(loadAnimation);
        }

        @SuppressLint({"UseCompatLoadingForDrawables"})
        public final void bind(@NotNull InfoItem infoItem, int i) {
            Intrinsics.checkNotNullParameter(infoItem, "infoItem");
            String status = infoItem.getStatus();
            if (status != null) {
                int hashCode = status.hashCode();
                if (hashCode != 355417861) {
                    if (hashCode != 1955883814) {
                        if (hashCode == 2115664355 && status.equals("Future")) {
                            this.f81123a.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.z_status_future));
                        }
                    } else if (status.equals("Active")) {
                        this.f81123a.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.z_status_active));
                    }
                } else if (status.equals(PDAnnotationRubberStamp.NAME_EXPIRED)) {
                    this.f81123a.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.z_status_expired));
                }
            }
            this.f81124b.setText(infoItem.getStatus());
            this.f81125c.setText(infoItem.getRemainingPeriod());
            this.f81126d.setText(infoItem.getContractPeriod());
            DtacFontTextView dtacFontTextView = this.f81127e;
            String contractStartDate = infoItem.getContractStartDate();
            String contractEndDate = infoItem.getContractEndDate();
            dtacFontTextView.setText(contractStartDate + " - " + contractEndDate);
            this.f81129g.setOnClickListener(new View.OnClickListener() { // from class: MI
                {
                    DeviceSummarySubInfoAdapter.ViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceSummarySubInfoAdapter.ViewHolder.m20392b(DeviceSummarySubInfoAdapter.ViewHolder.this, view);
                }
            });
            this.f81128f.setOnClickListener(new View.OnClickListener() { // from class: NI
                {
                    DeviceSummarySubInfoAdapter.ViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceSummarySubInfoAdapter.ViewHolder.m20391c(DeviceSummarySubInfoAdapter.ViewHolder.this, view);
                }
            });
            this.f81131i.setText(m20388f(infoItem.getModel()));
            this.f81132j.setText(m20388f(infoItem.getDiscount()));
            this.f81133k.setText(m20388f(infoItem.getReason()));
        }

        /* renamed from: f */
        public final String m20388f(String str) {
            if (str == null || str.length() == 0) {
                return HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            return str;
        }

        /* renamed from: g */
        public final void m20387g(final View view) {
            final int measuredHeight = view.getMeasuredHeight();
            Animation animation = new Animation() { // from class: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummarySubInfoAdapter$ViewHolder$collapse$a$1
                @Override // android.view.animation.Animation
                public void applyTransformation(float f, @Nullable Transformation transformation) {
                    if (f == 1.0f) {
                        view.setVisibility(8);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = measuredHeight;
                    layoutParams.height = i - ((int) (i * f));
                    view.requestLayout();
                }

                @Override // android.view.animation.Animation
                public boolean willChangeBounds() {
                    return true;
                }
            };
            animation.setDuration(measuredHeight / view.getContext().getResources().getDisplayMetrics().density);
            view.startAnimation(animation);
        }

        /* renamed from: h */
        public final void m20386h(final View view) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            view.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            final int measuredHeight = view.getMeasuredHeight();
            view.getLayoutParams().height = 1;
            view.setVisibility(0);
            Animation animation = new Animation() { // from class: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummarySubInfoAdapter$ViewHolder$expand$a$1
                @Override // android.view.animation.Animation
                public void applyTransformation(float f, @Nullable Transformation transformation) {
                    int i;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (f == 1.0f) {
                        i = -2;
                    } else {
                        i = (int) (measuredHeight * f);
                    }
                    layoutParams.height = i;
                    view.requestLayout();
                }

                @Override // android.view.animation.Animation
                public boolean willChangeBounds() {
                    return true;
                }
            };
            animation.setDuration(measuredHeight / view.getContext().getResources().getDisplayMetrics().density);
            view.startAnimation(animation);
        }
    }

    public DeviceSummarySubInfoAdapter(@NotNull List<InfoItem> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f81122a = info;
    }

    @NotNull
    public final List<InfoItem> getInfo() {
        return this.f81122a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81122a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((InfoItem) this.f81122a.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_info_device_summary, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}
