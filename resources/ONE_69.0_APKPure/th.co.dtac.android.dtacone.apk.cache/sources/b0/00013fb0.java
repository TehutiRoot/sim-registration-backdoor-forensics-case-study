package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter;

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
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;
import th.p047co.dtac.android.dtacone.util.Pair;
import th.p047co.dtac.android.dtacone.util.WindowUtil;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OnePhoenixAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 P2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003PQRB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010&\u001a\u00020\r2,\u0010%\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0!\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0#0 0\u001f¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\r2\n\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010.\u001a\u00020\"H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b1\u0010\u0018J\u000f\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\r2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\r2\u0006\u0010.\u001a\u00020\"¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\r2\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b=\u0010>JU\u0010B\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010$2\u0006\u0010A\u001a\u00020\u000b2\n\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER>\u0010%\u001a*\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0!\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0#0 \u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010N¨\u0006S"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnePhoenixViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/widget/LinearLayout;", "layoutPrice", "Landroid/widget/TextView;", "textViewPrice", "", "percentColor", "", OperatorName.CURVE_TO, "(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;)V", "tvStvCommissionPercent", OperatorName.CLOSE_PATH, "(Landroid/widget/TextView;Ljava/lang/String;)V", "stvPriceTextView", "layoutStv", "i", "(Landroid/widget/TextView;Landroid/widget/LinearLayout;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/graphics/drawable/Drawable;", "drawable", OperatorName.NON_STROKING_GRAY, "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "phoenixPackage", "setPhoenixPackage", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnePhoenixViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnePhoenixViewHolder;I)V", "clearCheckedRadioButton", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnClickPackageListener;", "listen", "setOnClickPackageListener", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnClickPackageListener;)V", "updateSTVPackageItem", "(I)V", "stvCommissionPercentTextView", "opacityView", "packageItem", "d", "(Landroid/widget/TextView;Landroid/view/View;Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;)V", "stvPriceLayout", "commissionPercentTextView", "speed", "e", "(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/TextView;Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnePhoenixViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "Ljava/util/List;", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnClickPackageListener;", "Landroid/widget/LinearLayout;", "lastGroupChecked", "lastChecked", OperatorName.FILL_NON_ZERO, "Landroid/widget/TextView;", "lastTvStvPrice", "I", "positionItem", "Companion", "OnClickPackageListener", "OnePhoenixViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OnePhoenixAdapter */
/* loaded from: classes10.dex */
public final class OnePhoenixAdapter extends RecyclerView.Adapter<OnePhoenixViewHolder> {

    /* renamed from: a */
    public final Context f97513a;

    /* renamed from: b */
    public List f97514b;

    /* renamed from: c */
    public OnClickPackageListener f97515c;

    /* renamed from: d */
    public LinearLayout f97516d;

    /* renamed from: e */
    public LinearLayout f97517e;

    /* renamed from: f */
    public TextView f97518f;

    /* renamed from: g */
    public int f97519g;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$Companion;", "", "()V", "COLOR_PRIMARY", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OnePhoenixAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnClickPackageListener;", "", "onClickPackage", "", "pkg", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "speed", "", "position", "", "rowPosition", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OnePhoenixAdapter$OnClickPackageListener */
    /* loaded from: classes10.dex */
    public interface OnClickPackageListener {
        void onClickPackage(@Nullable OneStvPackageCollection oneStvPackageCollection, @Nullable String str, int i, int i2);
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010R\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010\u0010R\u0017\u00104\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010\u000e\u001a\u0004\b3\u0010\u0010R\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u0010\u000e\u001a\u0004\b6\u0010\u0010R\u0017\u0010:\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u0010\u000e\u001a\u0004\b9\u0010\u0010¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter$OnePhoenixViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/adapter/OnePhoenixAdapter;Landroid/view/View;)V", "Landroidx/cardview/widget/CardView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "cardView", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvSpeed", "()Landroid/widget/TextView;", "tvSpeed", "Landroid/widget/LinearLayout;", OperatorName.CURVE_TO, "Landroid/widget/LinearLayout;", "getRdb7Day", "()Landroid/widget/LinearLayout;", "rdb7Day", "d", "getRdb30Day", "rdb30Day", "e", "getRdb60Day", "rdb60Day", OperatorName.FILL_NON_ZERO, "Landroid/view/View;", "getV7DayOpacity", "()Landroid/view/View;", "v7DayOpacity", OperatorName.NON_STROKING_GRAY, "getV30DayOpacity", "v30DayOpacity", OperatorName.CLOSE_PATH, "getV60DayOpacity", "v60DayOpacity", "i", "getTv7DayStvPrice", "tv7DayStvPrice", OperatorName.SET_LINE_JOINSTYLE, "getTv30DayStvPrice", "tv30DayStvPrice", OperatorName.NON_STROKING_CMYK, "getTv60DayStvPrice", "tv60DayStvPrice", OperatorName.LINE_TO, "getTv7DayStvCommissionPercent", "tv7DayStvCommissionPercent", OperatorName.MOVE_TO, "getTv30DayStvCommissionPercent", "tv30DayStvCommissionPercent", OperatorName.ENDPATH, "getTv60DayStvCommissionPercent", "tv60DayStvCommissionPercent", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OnePhoenixAdapter$OnePhoenixViewHolder */
    /* loaded from: classes10.dex */
    public final class OnePhoenixViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final CardView f97520a;

        /* renamed from: b */
        public final TextView f97521b;

        /* renamed from: c */
        public final LinearLayout f97522c;

        /* renamed from: d */
        public final LinearLayout f97523d;

        /* renamed from: e */
        public final LinearLayout f97524e;

        /* renamed from: f */
        public final View f97525f;

        /* renamed from: g */
        public final View f97526g;

        /* renamed from: h */
        public final View f97527h;

        /* renamed from: i */
        public final TextView f97528i;

        /* renamed from: j */
        public final TextView f97529j;

        /* renamed from: k */
        public final TextView f97530k;

        /* renamed from: l */
        public final TextView f97531l;

        /* renamed from: m */
        public final TextView f97532m;

        /* renamed from: n */
        public final TextView f97533n;

        /* renamed from: o */
        public final /* synthetic */ OnePhoenixAdapter f97534o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnePhoenixViewHolder(@NotNull OnePhoenixAdapter onePhoenixAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97534o = onePhoenixAdapter;
            View findViewById = view.findViewById(R.id.cvPhoenix);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            this.f97520a = (CardView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvSpeed);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f97521b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.rdb7Day);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f97522c = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.rdb30Day);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f97523d = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.rdb60Day);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f97524e = (LinearLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.v7DayOpacity);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById(R.id.v7DayOpacity)");
            this.f97525f = findViewById6;
            View findViewById7 = view.findViewById(R.id.v30DayOpacity);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "view.findViewById(R.id.v30DayOpacity)");
            this.f97526g = findViewById7;
            View findViewById8 = view.findViewById(R.id.v60DayOpacity);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "view.findViewById(R.id.v60DayOpacity)");
            this.f97527h = findViewById8;
            View findViewById9 = view.findViewById(R.id.tv7DayStvPrice);
            Intrinsics.checkNotNull(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.f97528i = (TextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.tv30DayStvPrice);
            Intrinsics.checkNotNull(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.f97529j = (TextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.tv60DayStvPrice);
            Intrinsics.checkNotNull(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
            this.f97530k = (TextView) findViewById11;
            View findViewById12 = view.findViewById(R.id.tv7DayStvCommissionPercent);
            Intrinsics.checkNotNull(findViewById12, "null cannot be cast to non-null type android.widget.TextView");
            this.f97531l = (TextView) findViewById12;
            View findViewById13 = view.findViewById(R.id.tv30DayStvCommissionPercent);
            Intrinsics.checkNotNull(findViewById13, "null cannot be cast to non-null type android.widget.TextView");
            this.f97532m = (TextView) findViewById13;
            View findViewById14 = view.findViewById(R.id.tv60DayStvCommissionPercent);
            Intrinsics.checkNotNull(findViewById14, "null cannot be cast to non-null type android.widget.TextView");
            this.f97533n = (TextView) findViewById14;
        }

        @NotNull
        public final CardView getCardView() {
            return this.f97520a;
        }

        @NotNull
        public final LinearLayout getRdb30Day() {
            return this.f97523d;
        }

        @NotNull
        public final LinearLayout getRdb60Day() {
            return this.f97524e;
        }

        @NotNull
        public final LinearLayout getRdb7Day() {
            return this.f97522c;
        }

        @NotNull
        public final TextView getTv30DayStvCommissionPercent() {
            return this.f97532m;
        }

        @NotNull
        public final TextView getTv30DayStvPrice() {
            return this.f97529j;
        }

        @NotNull
        public final TextView getTv60DayStvCommissionPercent() {
            return this.f97533n;
        }

        @NotNull
        public final TextView getTv60DayStvPrice() {
            return this.f97530k;
        }

        @NotNull
        public final TextView getTv7DayStvCommissionPercent() {
            return this.f97531l;
        }

        @NotNull
        public final TextView getTv7DayStvPrice() {
            return this.f97528i;
        }

        @NotNull
        public final TextView getTvSpeed() {
            return this.f97521b;
        }

        @NotNull
        public final View getV30DayOpacity() {
            return this.f97526g;
        }

        @NotNull
        public final View getV60DayOpacity() {
            return this.f97527h;
        }

        @NotNull
        public final View getV7DayOpacity() {
            return this.f97525f;
        }
    }

    public OnePhoenixAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97513a = context;
        this.f97519g = -1;
    }

    /* renamed from: b */
    private final void m9852b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        gradientDrawable.setStroke(Math.round(companion.convertDpToPx(this.f97513a, 1.0f)), ContextCompat.getColor(this.f97513a, R.color.opacityWhite25PercentOne));
        gradientDrawable.setCornerRadius(companion.convertDpToPx(this.f97513a, 4.0f));
        gradientDrawable.setColor(-1);
        m9847g(this.f97517e, gradientDrawable);
        TextView textView = this.f97518f;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(this.f97513a, R.color.grayishBrown));
        }
    }

    /* renamed from: c */
    private final void m9851c(LinearLayout linearLayout, TextView textView, String str) {
        String str2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        int round = Math.round(companion.convertDpToPx(this.f97513a, 1.0f));
        if (str == null) {
            str2 = "#00A3DC";
        } else {
            str2 = str;
        }
        gradientDrawable.setStroke(round, Color.parseColor(str2));
        gradientDrawable.setCornerRadius(companion.convertDpToPx(this.f97513a, 4.0f));
        if (str == null) {
            str = "#00A3DC";
        }
        gradientDrawable.setColor(Color.parseColor(str));
        m9847g(linearLayout, gradientDrawable);
        textView.setTextColor(-1);
    }

    /* renamed from: f */
    public static final void m9848f(OnePhoenixAdapter this$0, TextView stvPriceTextView, String speed, OnePhoenixViewHolder holder, int i, LinearLayout stvPriceLayout, OneStvPackageCollection oneStvPackageCollection, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stvPriceTextView, "$stvPriceTextView");
        Intrinsics.checkNotNullParameter(speed, "$speed");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(stvPriceLayout, "$stvPriceLayout");
        LinearLayout linearLayout = this$0.f97517e;
        if (linearLayout != null && Intrinsics.areEqual(linearLayout, stvPriceTextView)) {
            this$0.m9852b();
            this$0.f97517e = null;
            OnClickPackageListener onClickPackageListener = this$0.f97515c;
            if (onClickPackageListener != null) {
                onClickPackageListener.onClickPackage(null, speed, holder.getAbsoluteAdapterPosition(), i);
                return;
            }
            return;
        }
        this$0.m9852b();
        this$0.m9851c(stvPriceLayout, stvPriceTextView, oneStvPackageCollection.getCommissionColor());
        this$0.f97518f = stvPriceTextView;
        this$0.f97517e = stvPriceLayout;
        OnClickPackageListener onClickPackageListener2 = this$0.f97515c;
        if (onClickPackageListener2 != null) {
            Object tag = stvPriceLayout.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection");
            onClickPackageListener2.onClickPackage((OneStvPackageCollection) tag, speed, holder.getAbsoluteAdapterPosition(), i);
        }
    }

    /* renamed from: g */
    private final void m9847g(View view, Drawable drawable) {
        if (view != null) {
            view.setBackground(drawable);
        }
    }

    /* renamed from: h */
    private final void m9846h(TextView textView, String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        gradientDrawable.setStroke(Math.round(companion.convertDpToPx(this.f97513a, 1.0f)), Color.parseColor("#00000000"));
        float convertDpToPx = companion.convertDpToPx(this.f97513a, 4.0f);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, convertDpToPx, convertDpToPx, convertDpToPx, convertDpToPx});
        gradientDrawable.setColor(Color.parseColor(str));
        m9847g(textView, gradientDrawable);
    }

    /* renamed from: i */
    private final void m9845i(TextView textView, LinearLayout linearLayout) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        WindowUtil.Companion companion = WindowUtil.Companion;
        gradientDrawable.setStroke(Math.round(companion.convertDpToPx(this.f97513a, 1.0f)), ContextCompat.getColor(this.f97513a, R.color.opacityWhite25PercentOne));
        gradientDrawable.setCornerRadius(companion.convertDpToPx(this.f97513a, 4.0f));
        gradientDrawable.setColor(-1);
        m9847g(linearLayout, gradientDrawable);
        textView.setTextColor(ContextCompat.getColor(this.f97513a, R.color.grayishBrown));
    }

    public final void clearCheckedRadioButton() {
        if (this.f97517e != null) {
            m9852b();
            this.f97516d = null;
            this.f97517e = null;
            OnClickPackageListener onClickPackageListener = this.f97515c;
            if (onClickPackageListener != null) {
                onClickPackageListener.onClickPackage(null, null, -1, -1);
            }
        }
    }

    /* renamed from: d */
    public final void m9850d(TextView textView, View view, OneStvPackageCollection oneStvPackageCollection) {
        if (oneStvPackageCollection != null) {
            if (oneStvPackageCollection.getCommissionText() != null && oneStvPackageCollection.getCommissionColor() != null) {
                textView.setVisibility(0);
                view.setVisibility(0);
                textView.setText(oneStvPackageCollection.getCommissionText());
                m9846h(textView, oneStvPackageCollection.getCommissionColor());
                return;
            }
            textView.setVisibility(8);
            view.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void m9849e(final TextView textView, final LinearLayout linearLayout, View view, TextView textView2, final OneStvPackageCollection oneStvPackageCollection, final String str, final OnePhoenixViewHolder onePhoenixViewHolder, final int i) {
        if (oneStvPackageCollection != null) {
            view.setVisibility(0);
            textView2.setVisibility(0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{oneStvPackageCollection.getPrice(), this.f97513a.getString(R.string.bath_text)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
            linearLayout.setTag(oneStvPackageCollection);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: e11
                {
                    OnePhoenixAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnePhoenixAdapter.m9848f(OnePhoenixAdapter.this, textView, str, onePhoenixViewHolder, i, linearLayout, oneStvPackageCollection, view2);
                }
            });
            m9845i(textView, linearLayout);
            if (onePhoenixViewHolder.getAbsoluteAdapterPosition() == this.f97519g) {
                m9852b();
                return;
            }
            return;
        }
        textView.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        linearLayout.setEnabled(false);
        view.setVisibility(8);
        textView2.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f97514b;
        if (list == null || list == null) {
            return 0;
        }
        return list.size();
    }

    public final void setOnClickPackageListener(@NotNull OnClickPackageListener listen) {
        Intrinsics.checkNotNullParameter(listen, "listen");
        this.f97515c = listen;
    }

    public final void setPhoenixPackage(@NotNull List<Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>>> phoenixPackage) {
        Intrinsics.checkNotNullParameter(phoenixPackage, "phoenixPackage");
        this.f97514b = phoenixPackage;
    }

    public final void updateSTVPackageItem(int i) {
        this.f97519g = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OnePhoenixViewHolder holder, int i) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        PackageKey packageKey;
        PackageKey packageKey2;
        PackageKey packageKey3;
        PackageKey packageKey4;
        boolean z = true;
        int i2 = 0;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list11 = this.f97514b;
        OneStvPackageCollection oneStvPackageCollection = null;
        Pair pair = list11 != null ? (Pair) list11.get(i) : null;
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
        if (((pair == null || (list10 = (List) pair.getSecond()) == null) ? 0 : list10.size()) > 0) {
            m9849e(holder.getTv7DayStvPrice(), holder.getRdb7Day(), holder.getV7DayOpacity(), holder.getTv7DayStvCommissionPercent(), (pair == null || (list9 = (List) pair.getSecond()) == null) ? null : (OneStvPackageCollection) list9.get(0), str, holder, 0);
            m9850d(holder.getTv7DayStvCommissionPercent(), holder.getV7DayOpacity(), (pair == null || (list8 = (List) pair.getSecond()) == null) ? null : (OneStvPackageCollection) list8.get(0));
        }
        if (((pair == null || (list7 = (List) pair.getSecond()) == null) ? 0 : list7.size()) > 1) {
            m9849e(holder.getTv30DayStvPrice(), holder.getRdb30Day(), holder.getV30DayOpacity(), holder.getTv30DayStvCommissionPercent(), (pair == null || (list6 = (List) pair.getSecond()) == null) ? null : (OneStvPackageCollection) list6.get(1), str, holder, 1);
            m9850d(holder.getTv30DayStvCommissionPercent(), holder.getV30DayOpacity(), (pair == null || (list5 = (List) pair.getSecond()) == null) ? null : (OneStvPackageCollection) list5.get(1));
        } else {
            if ((pair == null || (list = (List) pair.getSecond()) == null || list.size() != 1) ? false : false) {
                m9849e(holder.getTv30DayStvPrice(), holder.getRdb30Day(), holder.getV30DayOpacity(), holder.getTv30DayStvCommissionPercent(), null, str, holder, 1);
                m9850d(holder.getTv30DayStvCommissionPercent(), holder.getV30DayOpacity(), null);
            }
        }
        if (pair != null && (list4 = (List) pair.getSecond()) != null) {
            i2 = list4.size();
        }
        if (i2 > 2) {
            ViewVisibleExtKt.toVisible(holder.getRdb60Day());
            m9849e(holder.getTv60DayStvPrice(), holder.getRdb60Day(), holder.getV60DayOpacity(), holder.getTv60DayStvCommissionPercent(), (pair == null || (list3 = (List) pair.getSecond()) == null) ? null : (OneStvPackageCollection) list3.get(2), str, holder, 2);
            TextView tv60DayStvCommissionPercent = holder.getTv60DayStvCommissionPercent();
            View v60DayOpacity = holder.getV60DayOpacity();
            if (pair != null && (list2 = (List) pair.getSecond()) != null) {
                oneStvPackageCollection = (OneStvPackageCollection) list2.get(2);
            }
            m9850d(tv60DayStvCommissionPercent, v60DayOpacity, oneStvPackageCollection);
            return;
        }
        ViewVisibleExtKt.toGone(holder.getRdb60Day());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OnePhoenixViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_phoenix_item_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OnePhoenixViewHolder(this, view);
    }
}