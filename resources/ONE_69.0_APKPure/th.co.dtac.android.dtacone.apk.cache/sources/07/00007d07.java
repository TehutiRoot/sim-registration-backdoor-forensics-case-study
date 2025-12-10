package co.omise.android.p009ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m29142d2 = {"Lco/omise/android/ui/OmiseItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", Promotion.ACTION_VIEW, "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/ui/OmiseListItemClickListener;", "(Landroid/view/View;Lco/omise/android/ui/OmiseListItemClickListener;)V", "getListener", "()Lco/omise/android/ui/OmiseListItemClickListener;", "getView", "()Landroid/view/View;", "bind", "", "item", "Lco/omise/android/ui/OmiseListItem;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.OmiseItemViewHolder */
/* loaded from: classes3.dex */
public final class OmiseItemViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    private final OmiseListItemClickListener listener;
    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmiseItemViewHolder(@NotNull View view, @Nullable OmiseListItemClickListener omiseListItemClickListener) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.listener = omiseListItemClickListener;
    }

    /* renamed from: b */
    public static /* synthetic */ void m51168b(OmiseItemViewHolder omiseItemViewHolder, OmiseListItem omiseListItem, View view) {
        m74130bind$lambda4(omiseItemViewHolder, omiseListItem, view);
    }

    /* renamed from: bind$lambda-4 */
    public static final void m74130bind$lambda4(OmiseItemViewHolder this$0, OmiseListItem item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        OmiseListItemClickListener omiseListItemClickListener = this$0.listener;
        if (omiseListItemClickListener != null) {
            omiseListItemClickListener.onClick(item);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0087, code lost:
        if (r1 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind(@org.jetbrains.annotations.NotNull final co.omise.android.p009ui.OmiseListItem r9) {
        /*
            r8 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.view.View r0 = r8.view
            int r1 = co.omise.android.C5500R.C5503id.list_item_view
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.view.View r1 = r8.view
            int r2 = co.omise.android.C5500R.C5503id.image_item_icon
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.view.View r2 = r8.view
            int r3 = co.omise.android.C5500R.C5503id.text_item_title
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r3 = r8.view
            int r4 = co.omise.android.C5500R.C5503id.subtext_item_title
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View r4 = r8.view
            int r5 = co.omise.android.C5500R.C5503id.image_indicator_icon
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Integer r5 = r9.getIconRes()
            r6 = 8
            r7 = 0
            if (r5 == 0) goto L52
            java.lang.Integer r5 = r9.getIconRes()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.intValue()
            r1.setImageResource(r5)
            r1.setVisibility(r7)
            goto L55
        L52:
            r1.setVisibility(r6)
        L55:
            java.lang.Integer r1 = r9.getTitleRes()
            if (r1 == 0) goto L6c
            int r1 = r1.intValue()
            android.view.View r5 = r8.view
            android.content.Context r5 = r5.getContext()
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L6c
            goto L70
        L6c:
            java.lang.String r1 = r9.getTitle()
        L70:
            r2.setText(r1)
            java.lang.Integer r1 = r9.getSubtitleRes()
            if (r1 == 0) goto L8a
            int r1 = r1.intValue()
            android.view.View r2 = r8.view
            android.content.Context r2 = r2.getContext()
            java.lang.String r1 = r2.getString(r1)
            if (r1 == 0) goto L8a
            goto L8e
        L8a:
            java.lang.String r1 = r9.getSubtitle()
        L8e:
            r3.setText(r1)
            java.lang.Boolean r1 = r9.getEnabled()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 1
            if (r1 == 0) goto Lb4
            java.lang.Integer r1 = r9.getIndicatorIconRes()
            if (r1 == 0) goto Lab
            int r1 = r1.intValue()
            r4.setImageResource(r1)
        Lab:
            r0.setEnabled(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            goto Lc9
        Lb4:
            java.lang.Integer r1 = r9.getIndicatorIconRes()
            if (r1 == 0) goto Lc0
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r4.setImageResource(r1)
        Lc0:
            r0.setEnabled(r7)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r0.setAlpha(r1)
        Lc9:
            java.lang.CharSequence r0 = r3.getText()
            java.lang.String r1 = "subtitleText.text"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = p000.AbstractC19741eO1.isBlank(r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto Ldd
            r3.setVisibility(r7)
            goto Le0
        Ldd:
            r3.setVisibility(r6)
        Le0:
            android.view.View r0 = r8.view
            tK0 r1 = new tK0
            r1.<init>()
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.OmiseItemViewHolder.bind(co.omise.android.ui.OmiseListItem):void");
    }

    @Nullable
    public final OmiseListItemClickListener getListener() {
        return this.listener;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}