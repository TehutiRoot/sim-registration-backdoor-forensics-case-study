package th.p047co.dtac.android.dtacone.adapter.postpaid_package;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageItemRowBinding;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bL\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\"\u00101\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0010\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R\"\u00105\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0010\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R\"\u00109\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0010\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\"\u0010=\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0010\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010\u0014R\"\u0010A\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0010\u001a\u0004\b?\u0010\u0012\"\u0004\b@\u0010\u0014R\"\u0010E\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0010\u001a\u0004\bC\u0010\u0012\"\u0004\bD\u0010\u0014R\"\u0010I\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0010\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R\"\u0010M\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0010\u001a\u0004\bK\u0010\u0012\"\u0004\bL\u0010\u0014R\"\u0010Q\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0010\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014R\"\u0010U\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0010\u001a\u0004\bS\u0010\u0012\"\u0004\bT\u0010\u0014R\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\b\u001a\u0004\bW\u0010\n\"\u0004\bX\u0010\fR\"\u0010]\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\b\u001a\u0004\b[\u0010\n\"\u0004\b\\\u0010\fR\"\u0010a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\b\u001a\u0004\b_\u0010\n\"\u0004\b`\u0010\fR\"\u0010e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\b\u001a\u0004\bc\u0010\n\"\u0004\bd\u0010\fR\"\u0010i\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\b\u001a\u0004\bg\u0010\n\"\u0004\bh\u0010\f¨\u0006j"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_package/PackageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageItemRowBinding;)V", "Landroid/widget/LinearLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/LinearLayout;", "getPackageInfoBox", "()Landroid/widget/LinearLayout;", "setPackageInfoBox", "(Landroid/widget/LinearLayout;)V", "packageInfoBox", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvPackageName", "()Landroid/widget/TextView;", "setTvPackageName", "(Landroid/widget/TextView;)V", "tvPackageName", "Landroidx/cardview/widget/CardView;", OperatorName.CURVE_TO, "Landroidx/cardview/widget/CardView;", "getPackagesBox", "()Landroidx/cardview/widget/CardView;", "setPackagesBox", "(Landroidx/cardview/widget/CardView;)V", "packagesBox", "Landroid/widget/RelativeLayout;", "d", "Landroid/widget/RelativeLayout;", "getRelativeLayoutPackageBox", "()Landroid/widget/RelativeLayout;", "setRelativeLayoutPackageBox", "(Landroid/widget/RelativeLayout;)V", "relativeLayoutPackageBox", "e", "getTvPrice", "setTvPrice", "tvPrice", OperatorName.FILL_NON_ZERO, "getTvVoice", "setTvVoice", "tvVoice", OperatorName.NON_STROKING_GRAY, "getTvVoiceUnit", "setTvVoiceUnit", "tvVoiceUnit", OperatorName.CLOSE_PATH, "getTvWifi", "setTvWifi", "tvWifi", "i", "getTvWifiUnit", "setTvWifiUnit", "tvWifiUnit", OperatorName.SET_LINE_JOINSTYLE, "getTvStorage", "setTvStorage", "tvStorage", OperatorName.NON_STROKING_CMYK, "getTvStorageUnit", "setTvStorageUnit", "tvStorageUnit", OperatorName.LINE_TO, "getTvData", "setTvData", "tvData", OperatorName.MOVE_TO, "getTvDataUnit", "setTvDataUnit", "tvDataUnit", OperatorName.ENDPATH, "getTvBillCycle", "setTvBillCycle", "tvBillCycle", "o", "getTvBillCycleUnit", "setTvBillCycleUnit", "tvBillCycleUnit", "p", "getTvDescription", "setTvDescription", "tvDescription", OperatorName.SAVE, "getVoiceBox", "setVoiceBox", "voiceBox", PDPageLabelRange.STYLE_ROMAN_LOWER, "getStoreBox", "setStoreBox", "storeBox", OperatorName.CLOSE_AND_STROKE, "getCallBox", "setCallBox", "callBox", "t", "getWifiBox", "setWifiBox", "wifiBox", "u", "getBillBox", "setBillBox", "billBox", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_package.PackageViewHolder */
/* loaded from: classes7.dex */
public final class PackageViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* renamed from: a */
    public LinearLayout f81463a;

    /* renamed from: b */
    public TextView f81464b;

    /* renamed from: c */
    public CardView f81465c;

    /* renamed from: d */
    public RelativeLayout f81466d;

    /* renamed from: e */
    public TextView f81467e;

    /* renamed from: f */
    public TextView f81468f;

    /* renamed from: g */
    public TextView f81469g;

    /* renamed from: h */
    public TextView f81470h;

    /* renamed from: i */
    public TextView f81471i;

    /* renamed from: j */
    public TextView f81472j;

    /* renamed from: k */
    public TextView f81473k;

    /* renamed from: l */
    public TextView f81474l;

    /* renamed from: m */
    public TextView f81475m;

    /* renamed from: n */
    public TextView f81476n;

    /* renamed from: o */
    public TextView f81477o;

    /* renamed from: p */
    public TextView f81478p;

    /* renamed from: q */
    public LinearLayout f81479q;

    /* renamed from: r */
    public LinearLayout f81480r;

    /* renamed from: s */
    public LinearLayout f81481s;

    /* renamed from: t */
    public LinearLayout f81482t;

    /* renamed from: u */
    public LinearLayout f81483u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageViewHolder(@NotNull ZPostpaidPackageItemRowBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout linearLayout = binding.packageInfoBox;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.packageInfoBox");
        this.f81463a = linearLayout;
        DtacFontTextView dtacFontTextView = binding.packageListTvPackageSetTitle;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.packageListTvPackageSetTitle");
        this.f81464b = dtacFontTextView;
        DtacCardView dtacCardView = binding.cvPackageList;
        Intrinsics.checkNotNullExpressionValue(dtacCardView, "binding.cvPackageList");
        this.f81465c = dtacCardView;
        RelativeLayout relativeLayout = binding.packageBox;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.packageBox");
        this.f81466d = relativeLayout;
        DtacFontTextView dtacFontTextView2 = binding.packageListTvPrice;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.packageListTvPrice");
        this.f81467e = dtacFontTextView2;
        DtacFontTextView dtacFontTextView3 = binding.tvVoice;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.tvVoice");
        this.f81468f = dtacFontTextView3;
        DtacFontTextView dtacFontTextView4 = binding.tvVoiceUnit;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView4, "binding.tvVoiceUnit");
        this.f81469g = dtacFontTextView4;
        DtacFontTextView dtacFontTextView5 = binding.tvWifi;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView5, "binding.tvWifi");
        this.f81470h = dtacFontTextView5;
        DtacFontTextView dtacFontTextView6 = binding.tvWifiUnit;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView6, "binding.tvWifiUnit");
        this.f81471i = dtacFontTextView6;
        DtacFontTextView dtacFontTextView7 = binding.tvStorage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView7, "binding.tvStorage");
        this.f81472j = dtacFontTextView7;
        DtacFontTextView dtacFontTextView8 = binding.tvStorageUnit;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView8, "binding.tvStorageUnit");
        this.f81473k = dtacFontTextView8;
        DtacFontTextView dtacFontTextView9 = binding.tvData;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView9, "binding.tvData");
        this.f81474l = dtacFontTextView9;
        DtacFontTextView dtacFontTextView10 = binding.tvDataUnit;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView10, "binding.tvDataUnit");
        this.f81475m = dtacFontTextView10;
        DtacFontTextView dtacFontTextView11 = binding.tvBillCycle;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView11, "binding.tvBillCycle");
        this.f81476n = dtacFontTextView11;
        DtacFontTextView dtacFontTextView12 = binding.tvBillCycleUnit;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView12, "binding.tvBillCycleUnit");
        this.f81477o = dtacFontTextView12;
        DtacFontTextView dtacFontTextView13 = binding.tvDescription;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView13, "binding.tvDescription");
        this.f81478p = dtacFontTextView13;
        LinearLayout linearLayout2 = binding.voiceBox;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.voiceBox");
        this.f81479q = linearLayout2;
        LinearLayout linearLayout3 = binding.storeBox;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.storeBox");
        this.f81480r = linearLayout3;
        LinearLayout linearLayout4 = binding.callBox;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.callBox");
        this.f81481s = linearLayout4;
        LinearLayout linearLayout5 = binding.wifiBox;
        Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.wifiBox");
        this.f81482t = linearLayout5;
        LinearLayout linearLayout6 = binding.billBox;
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "binding.billBox");
        this.f81483u = linearLayout6;
    }

    @NotNull
    public final LinearLayout getBillBox() {
        return this.f81483u;
    }

    @NotNull
    public final LinearLayout getCallBox() {
        return this.f81481s;
    }

    @NotNull
    public final LinearLayout getPackageInfoBox() {
        return this.f81463a;
    }

    @NotNull
    public final CardView getPackagesBox() {
        return this.f81465c;
    }

    @NotNull
    public final RelativeLayout getRelativeLayoutPackageBox() {
        return this.f81466d;
    }

    @NotNull
    public final LinearLayout getStoreBox() {
        return this.f81480r;
    }

    @NotNull
    public final TextView getTvBillCycle() {
        return this.f81476n;
    }

    @NotNull
    public final TextView getTvBillCycleUnit() {
        return this.f81477o;
    }

    @NotNull
    public final TextView getTvData() {
        return this.f81474l;
    }

    @NotNull
    public final TextView getTvDataUnit() {
        return this.f81475m;
    }

    @NotNull
    public final TextView getTvDescription() {
        return this.f81478p;
    }

    @NotNull
    public final TextView getTvPackageName() {
        return this.f81464b;
    }

    @NotNull
    public final TextView getTvPrice() {
        return this.f81467e;
    }

    @NotNull
    public final TextView getTvStorage() {
        return this.f81472j;
    }

    @NotNull
    public final TextView getTvStorageUnit() {
        return this.f81473k;
    }

    @NotNull
    public final TextView getTvVoice() {
        return this.f81468f;
    }

    @NotNull
    public final TextView getTvVoiceUnit() {
        return this.f81469g;
    }

    @NotNull
    public final TextView getTvWifi() {
        return this.f81470h;
    }

    @NotNull
    public final TextView getTvWifiUnit() {
        return this.f81471i;
    }

    @NotNull
    public final LinearLayout getVoiceBox() {
        return this.f81479q;
    }

    @NotNull
    public final LinearLayout getWifiBox() {
        return this.f81482t;
    }

    public final void setBillBox(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f81483u = linearLayout;
    }

    public final void setCallBox(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f81481s = linearLayout;
    }

    public final void setPackageInfoBox(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f81463a = linearLayout;
    }

    public final void setPackagesBox(@NotNull CardView cardView) {
        Intrinsics.checkNotNullParameter(cardView, "<set-?>");
        this.f81465c = cardView;
    }

    public final void setRelativeLayoutPackageBox(@NotNull RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.f81466d = relativeLayout;
    }

    public final void setStoreBox(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f81480r = linearLayout;
    }

    public final void setTvBillCycle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81476n = textView;
    }

    public final void setTvBillCycleUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81477o = textView;
    }

    public final void setTvData(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81474l = textView;
    }

    public final void setTvDataUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81475m = textView;
    }

    public final void setTvDescription(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81478p = textView;
    }

    public final void setTvPackageName(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81464b = textView;
    }

    public final void setTvPrice(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81467e = textView;
    }

    public final void setTvStorage(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81472j = textView;
    }

    public final void setTvStorageUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81473k = textView;
    }

    public final void setTvVoice(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81468f = textView;
    }

    public final void setTvVoiceUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81469g = textView;
    }

    public final void setTvWifi(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81470h = textView;
    }

    public final void setTvWifiUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f81471i = textView;
    }

    public final void setVoiceBox(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f81479q = linearLayout;
    }

    public final void setWifiBox(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f81482t = linearLayout;
    }
}