package th.p047co.dtac.android.dtacone.adapter.phoenix;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.phoenix.PhoenixAdapter;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;
import th.p047co.dtac.android.dtacone.util.Pair;
import th.p047co.dtac.android.dtacone.util.WindowUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 K2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003KLMB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u0010\u001a\u00020\u000f2,\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\b0\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u000f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020%2\u0006\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020#H\u0002¢\u0006\u0004\b4\u00105JA\u00109\u001a\u00020\u000f2\u0006\u00102\u001a\u00020%2\u0006\u00106\u001a\u00020#2\u0006\u0010,\u001a\u00020+2\u0006\u00107\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010\r2\u0006\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0002¢\u0006\u0004\b;\u0010\u001cJ!\u0010?\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010+2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR>\u0010\u000e\u001a*\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\b\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010CR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$PhoenixViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "phoenixPackage", "", "setPhoenixPackage", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$PhoenixViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$PhoenixViewHolder;I)V", "clearCheckedRadioButton", "()V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$OnClickPackageListener;", "listen", "setOnClickPackageListener", "(Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$OnClickPackageListener;)V", "Landroid/widget/LinearLayout;", "layoutPrice", "Landroid/widget/TextView;", "textViewPrice", "percentColor", OperatorName.CURVE_TO, "(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;)V", "tvStvCommissionPercent", "Landroid/view/View;", "viewOpacity", "pkg", "d", "(Landroid/widget/TextView;Landroid/view/View;Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;)V", OperatorName.CLOSE_PATH, "(Landroid/widget/TextView;Ljava/lang/String;)V", "tvStvPrice", "layoutStv", "i", "(Landroid/widget/TextView;Landroid/widget/LinearLayout;)V", "layoutStvPrice", "tvCommissionPercent", "speed", "e", "(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/TextView;Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, Promotion.ACTION_VIEW, "Landroid/graphics/drawable/Drawable;", "drawable", OperatorName.NON_STROKING_GRAY, "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Ljava/util/List;", "Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$OnClickPackageListener;", "Landroid/widget/LinearLayout;", "lastGroupChecked", "lastChecked", OperatorName.FILL_NON_ZERO, "Landroid/widget/TextView;", "lastTvStvPrice", "Companion", "OnClickPackageListener", "PhoenixViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.phoenix.PhoenixAdapter */
/* loaded from: classes7.dex */
public final class PhoenixAdapter extends RecyclerView.Adapter<PhoenixViewHolder> {

    /* renamed from: a */
    public final Context f81445a;

    /* renamed from: b */
    public List f81446b;

    /* renamed from: c */
    public OnClickPackageListener f81447c;

    /* renamed from: d */
    public LinearLayout f81448d;

    /* renamed from: e */
    public LinearLayout f81449e;

    /* renamed from: f */
    public TextView f81450f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$Companion;", "", "()V", "colorPrimary", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.phoenix.PhoenixAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$OnClickPackageListener;", "", "onClickPackage", "", "pkg", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "speed", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.phoenix.PhoenixAdapter$OnClickPackageListener */
    /* loaded from: classes7.dex */
    public interface OnClickPackageListener {
        void onClickPackage(@Nullable StvPackageCollection stvPackageCollection, @Nullable String str);
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010%\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0010R\u0017\u0010(\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010\u0010R\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter$PhoenixViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/phoenix/PhoenixAdapter;Landroid/view/View;)V", "Landroidx/cardview/widget/CardView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "cardView", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvSpeed", "()Landroid/widget/TextView;", "tvSpeed", "Landroid/widget/LinearLayout;", OperatorName.CURVE_TO, "Landroid/widget/LinearLayout;", "getRdb7Day", "()Landroid/widget/LinearLayout;", "rdb7Day", "d", "getRdb30Day", "rdb30Day", "e", "Landroid/view/View;", "getV7DayOpacity", "()Landroid/view/View;", "v7DayOpacity", OperatorName.FILL_NON_ZERO, "getV30DayOpacity", "v30DayOpacity", OperatorName.NON_STROKING_GRAY, "getTv7DayStvPrice", "tv7DayStvPrice", OperatorName.CLOSE_PATH, "getTv30DayStvPrice", "tv30DayStvPrice", "i", "getTv7DayStvCommissionPercent", "tv7DayStvCommissionPercent", OperatorName.SET_LINE_JOINSTYLE, "getTv30DayStvCommissionPercent", "tv30DayStvCommissionPercent", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.phoenix.PhoenixAdapter$PhoenixViewHolder */
    /* loaded from: classes7.dex */
    public final class PhoenixViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final CardView f81451a;

        /* renamed from: b */
        public final TextView f81452b;

        /* renamed from: c */
        public final LinearLayout f81453c;

        /* renamed from: d */
        public final LinearLayout f81454d;

        /* renamed from: e */
        public final View f81455e;

        /* renamed from: f */
        public final View f81456f;

        /* renamed from: g */
        public final TextView f81457g;

        /* renamed from: h */
        public final TextView f81458h;

        /* renamed from: i */
        public final TextView f81459i;

        /* renamed from: j */
        public final TextView f81460j;

        /* renamed from: k */
        public final /* synthetic */ PhoenixAdapter f81461k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoenixViewHolder(@NotNull PhoenixAdapter phoenixAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81461k = phoenixAdapter;
            View findViewById = view.findViewById(R.id.cvPhoenix);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            this.f81451a = (CardView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvSpeed);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81452b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.rdb7Day);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f81453c = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.rdb30Day);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f81454d = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.v7DayOpacity);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.view.View");
            this.f81455e = findViewById5;
            View findViewById6 = view.findViewById(R.id.v30DayOpacity);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.view.View");
            this.f81456f = findViewById6;
            View findViewById7 = view.findViewById(R.id.tv7DayStvPrice);
            Intrinsics.checkNotNull(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.f81457g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.tv30DayStvPrice);
            Intrinsics.checkNotNull(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f81458h = (TextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.tv7DayStvCommissionPercent);
            Intrinsics.checkNotNull(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.f81459i = (TextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.tv30DayStvCommissionPercent);
            Intrinsics.checkNotNull(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.f81460j = (TextView) findViewById10;
        }

        @NotNull
        public final CardView getCardView() {
            return this.f81451a;
        }

        @NotNull
        public final LinearLayout getRdb30Day() {
            return this.f81454d;
        }

        @NotNull
        public final LinearLayout getRdb7Day() {
            return this.f81453c;
        }

        @NotNull
        public final TextView getTv30DayStvCommissionPercent() {
            return this.f81460j;
        }

        @NotNull
        public final TextView getTv30DayStvPrice() {
            return this.f81458h;
        }

        @NotNull
        public final TextView getTv7DayStvCommissionPercent() {
            return this.f81459i;
        }

        @NotNull
        public final TextView getTv7DayStvPrice() {
            return this.f81457g;
        }

        @NotNull
        public final TextView getTvSpeed() {
            return this.f81452b;
        }

        @NotNull
        public final View getV30DayOpacity() {
            return this.f81456f;
        }

        @NotNull
        public final View getV7DayOpacity() {
            return this.f81455e;
        }
    }

    public PhoenixAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81445a = context;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20468a(PhoenixAdapter phoenixAdapter, TextView textView, String str, LinearLayout linearLayout, StvPackageCollection stvPackageCollection, View view) {
        m20463f(phoenixAdapter, textView, str, linearLayout, stvPackageCollection, view);
    }

    /* renamed from: f */
    public static final void m20463f(PhoenixAdapter this$0, TextView tvStvPrice, String speed, LinearLayout layoutStvPrice, StvPackageCollection stvPackageCollection, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tvStvPrice, "$tvStvPrice");
        Intrinsics.checkNotNullParameter(speed, "$speed");
        Intrinsics.checkNotNullParameter(layoutStvPrice, "$layoutStvPrice");
        LinearLayout linearLayout = this$0.f81449e;
        if (linearLayout != null && Intrinsics.areEqual(linearLayout, tvStvPrice)) {
            this$0.m20467b();
            this$0.f81449e = null;
            OnClickPackageListener onClickPackageListener = this$0.f81447c;
            if (onClickPackageListener != null) {
                onClickPackageListener.onClickPackage(null, speed);
                return;
            }
            return;
        }
        this$0.m20467b();
        this$0.m20466c(layoutStvPrice, tvStvPrice, stvPackageCollection.getCommissionColor());
        this$0.f81450f = tvStvPrice;
        this$0.f81449e = layoutStvPrice;
        OnClickPackageListener onClickPackageListener2 = this$0.f81447c;
        if (onClickPackageListener2 != null) {
            Object tag = layoutStvPrice.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.stv.StvPackageCollection");
            onClickPackageListener2.onClickPackage((StvPackageCollection) tag, speed);
        }
    }

    /* renamed from: b */
    public final void m20467b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        gradientDrawable.setStroke(Math.round(companion.convertDpToPx(this.f81445a, 1.0f)), ContextCompat.getColor(this.f81445a, R.color.warmGreyThree));
        gradientDrawable.setCornerRadius(companion.convertDpToPx(this.f81445a, 4.0f));
        gradientDrawable.setColor(-1);
        m20462g(this.f81449e, gradientDrawable);
        TextView textView = this.f81450f;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(this.f81445a, R.color.grayishBrown));
        }
    }

    /* renamed from: c */
    public final void m20466c(LinearLayout linearLayout, TextView textView, String str) {
        String str2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        int round = Math.round(companion.convertDpToPx(this.f81445a, 1.0f));
        if (str == null) {
            str2 = "#00A3DC";
        } else {
            str2 = str;
        }
        gradientDrawable.setStroke(round, Color.parseColor(str2));
        gradientDrawable.setCornerRadius(companion.convertDpToPx(this.f81445a, 4.0f));
        if (str == null) {
            str = "#00A3DC";
        }
        gradientDrawable.setColor(Color.parseColor(str));
        m20462g(linearLayout, gradientDrawable);
        textView.setTextColor(-1);
    }

    public final void clearCheckedRadioButton() {
        if (this.f81449e != null) {
            m20467b();
            this.f81448d = null;
            this.f81449e = null;
            OnClickPackageListener onClickPackageListener = this.f81447c;
            if (onClickPackageListener != null) {
                onClickPackageListener.onClickPackage(null, null);
            }
        }
    }

    /* renamed from: d */
    public final void m20465d(TextView textView, View view, StvPackageCollection stvPackageCollection) {
        if (stvPackageCollection != null) {
            if (stvPackageCollection.getCommissionText() != null && stvPackageCollection.getCommissionColor() != null) {
                textView.setVisibility(0);
                view.setVisibility(0);
                textView.setText(stvPackageCollection.getCommissionText());
                m20461h(textView, stvPackageCollection.getCommissionColor());
                return;
            }
            textView.setVisibility(8);
            view.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void m20464e(final TextView textView, final LinearLayout linearLayout, View view, TextView textView2, final StvPackageCollection stvPackageCollection, final String str) {
        if (stvPackageCollection != null) {
            view.setVisibility(0);
            textView2.setVisibility(0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{stvPackageCollection.getPrice(), this.f81445a.getString(R.string.bath_text)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
            linearLayout.setTag(stvPackageCollection);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: Zk1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PhoenixAdapter.m20468a(PhoenixAdapter.this, textView, str, linearLayout, stvPackageCollection, view2);
                }
            });
            m20460i(textView, linearLayout);
            return;
        }
        textView.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        linearLayout.setEnabled(false);
        view.setVisibility(8);
        textView2.setVisibility(8);
    }

    /* renamed from: g */
    public final void m20462g(View view, Drawable drawable) {
        if (view != null) {
            view.setBackground(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81446b;
        if (list == null || list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public final void m20461h(TextView textView, String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        gradientDrawable.setStroke(Math.round(companion.convertDpToPx(this.f81445a, 1.0f)), Color.parseColor("#00000000"));
        float convertDpToPx = companion.convertDpToPx(this.f81445a, 4.0f);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, convertDpToPx, convertDpToPx, convertDpToPx, convertDpToPx});
        gradientDrawable.setColor(Color.parseColor(str));
        m20462g(textView, gradientDrawable);
    }

    /* renamed from: i */
    public final void m20460i(TextView textView, LinearLayout linearLayout) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        gradientDrawable.setStroke(Math.round(companion.convertDpToPx(this.f81445a, 1.0f)), ContextCompat.getColor(this.f81445a, R.color.warmGreyThree));
        gradientDrawable.setCornerRadius(companion.convertDpToPx(this.f81445a, 4.0f));
        gradientDrawable.setColor(-1);
        m20462g(linearLayout, gradientDrawable);
        textView.setTextColor(ContextCompat.getColor(this.f81445a, R.color.grayishBrown));
    }

    public final void setOnClickPackageListener(@NotNull OnClickPackageListener listen) {
        Intrinsics.checkNotNullParameter(listen, "listen");
        this.f81447c = listen;
    }

    public final void setPhoenixPackage(@NotNull List<Pair<PackageKey<Integer, String>, List<StvPackageCollection>>> phoenixPackage) {
        Intrinsics.checkNotNullParameter(phoenixPackage, "phoenixPackage");
        this.f81446b = phoenixPackage;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PhoenixViewHolder holder, int i) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        PackageKey packageKey;
        PackageKey packageKey2;
        PackageKey packageKey3;
        PackageKey packageKey4;
        boolean z = true;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list8 = this.f81446b;
        StvPackageCollection stvPackageCollection = null;
        Pair pair = list8 != null ? (Pair) list8.get(i) : null;
        String valueOf = String.valueOf((pair == null || (packageKey4 = (PackageKey) pair.getFirst()) == null) ? null : (Integer) packageKey4.getValue());
        TextView tvSpeed = holder.getTvSpeed();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (Intrinsics.areEqual(valueOf, "0")) {
            valueOf = "";
        }
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{valueOf, (pair == null || (packageKey3 = (PackageKey) pair.getFirst()) == null) ? null : (String) packageKey3.getUnit()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        tvSpeed.setText(format);
        String str = ((pair == null || (packageKey2 = (PackageKey) pair.getFirst()) == null) ? null : (Integer) packageKey2.getValue()) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + ((pair == null || (packageKey = (PackageKey) pair.getFirst()) == null) ? null : (String) packageKey.getUnit());
        if (((pair == null || (list7 = (List) pair.getSecond()) == null) ? 0 : list7.size()) > 0) {
            m20464e(holder.getTv7DayStvPrice(), holder.getRdb7Day(), holder.getV7DayOpacity(), holder.getTv7DayStvCommissionPercent(), (pair == null || (list6 = (List) pair.getSecond()) == null) ? null : (StvPackageCollection) list6.get(0), str);
            m20465d(holder.getTv7DayStvCommissionPercent(), holder.getV7DayOpacity(), (pair == null || (list5 = (List) pair.getSecond()) == null) ? null : (StvPackageCollection) list5.get(0));
        }
        if (((pair == null || (list4 = (List) pair.getSecond()) == null) ? 0 : list4.size()) > 1) {
            m20464e(holder.getTv30DayStvPrice(), holder.getRdb30Day(), holder.getV30DayOpacity(), holder.getTv30DayStvCommissionPercent(), (pair == null || (list3 = (List) pair.getSecond()) == null) ? null : (StvPackageCollection) list3.get(1), str);
            TextView tv30DayStvCommissionPercent = holder.getTv30DayStvCommissionPercent();
            View v30DayOpacity = holder.getV30DayOpacity();
            if (pair != null && (list2 = (List) pair.getSecond()) != null) {
                stvPackageCollection = (StvPackageCollection) list2.get(1);
            }
            m20465d(tv30DayStvCommissionPercent, v30DayOpacity, stvPackageCollection);
            return;
        }
        if ((pair == null || (list = (List) pair.getSecond()) == null || list.size() != 1) ? false : false) {
            m20464e(holder.getTv30DayStvPrice(), holder.getRdb30Day(), holder.getV30DayOpacity(), holder.getTv30DayStvCommissionPercent(), null, str);
            m20465d(holder.getTv30DayStvCommissionPercent(), holder.getV30DayOpacity(), null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PhoenixViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_phoenix_item_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new PhoenixViewHolder(this, view);
    }
}