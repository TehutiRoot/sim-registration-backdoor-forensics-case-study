package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewEnableKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter;
import th.p047co.dtac.android.dtacone.widget.dialog.DtacDatePickerDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005?@ABCBk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00103R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010=¨\u0006D"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/fragment/app/FragmentActivity;", "mContext", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "verifyKeyList", "", "idNumber", "idDocType", "birthdayFromSmartCard", "birthdayFromOCR", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "phoneNumberList", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "", "updateBirthdayFromSmartCard", "(Ljava/lang/String;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "showBirthDay", OperatorName.NON_STROKING_GRAY, "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/fragment/app/FragmentActivity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "e", OperatorName.FILL_NON_ZERO, "Ljava/util/ArrayList;", "Landroid/app/DatePickerDialog;", OperatorName.CLOSE_PATH, "Landroid/app/DatePickerDialog;", "datePicker", "i", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "selectedBirthDayCollection", OperatorName.SET_LINE_JOINSTYLE, "getGetVerifyKeyList", "()Ljava/util/List;", "getVerifyKeyList", "BirthDateViewHolder", "DefaultViewHolder", "MSISDNSelectViewHolder", "MSISDNViewHolder", "ThaiIdViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDeviceSaleCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleCampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignVerifyKeyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FragmentActivity f89694a;

    /* renamed from: b */
    public final List f89695b;

    /* renamed from: c */
    public final String f89696c;

    /* renamed from: d */
    public final String f89697d;

    /* renamed from: e */
    public final String f89698e;

    /* renamed from: f */
    public String f89699f;

    /* renamed from: g */
    public ArrayList f89700g;

    /* renamed from: h */
    public DatePickerDialog f89701h;

    /* renamed from: i */
    public BirthDayCollection f89702i;

    /* renamed from: j */
    public final List f89703j;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$BirthDateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "birthdayFromSmartCard", "birthdayFromOCR", "Lkotlin/Function1;", "", "itemValue", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvHintBirthDay", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "setTvHintBirthDay", "(Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;)V", "tvHintBirthDay", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "getBirthDayTextInputLayout", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "setBirthDayTextInputLayout", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;)V", "birthDayTextInputLayout", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getCalendarImageView", "()Landroid/widget/ImageView;", "setCalendarImageView", "(Landroid/widget/ImageView;)V", "calendarImageView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$BirthDateViewHolder */
    /* loaded from: classes10.dex */
    public static final class BirthDateViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneFontTextView f89704a;

        /* renamed from: b */
        public OneTextLayoutView f89705b;

        /* renamed from: c */
        public ImageView f89706c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BirthDateViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tvHintBirthDay);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvHintBirthDay)");
            this.f89704a = (OneFontTextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.birthDayTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.….birthDayTextInputLayout)");
            this.f89705b = (OneTextLayoutView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.calendarImageView);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.calendarImageView)");
            this.f89706c = (ImageView) findViewById3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(BirthDateViewHolder birthDateViewHolder, VerifyKeyListItem verifyKeyListItem, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 8) != 0) {
                function1 = null;
            }
            birthDateViewHolder.bind(verifyKeyListItem, str, str2, function1);
        }

        public final void bind(@NotNull VerifyKeyListItem item, @Nullable String str, @Nullable String str2, @Nullable Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(item, "item");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f89704a.setText(verifyDesc);
                this.f89705b.setTextLabel(verifyDesc);
                if (str != null) {
                    if (function1 != null) {
                        function1.invoke(str);
                    }
                    this.f89705b.setText(str);
                    item.setValue(DateFormatExtKt.thaiDateToDateFormatServer(str, true, false));
                    ViewVisibleExtKt.toVisible(this.f89705b);
                    ViewVisibleExtKt.toGone(this.f89704a);
                }
                if (str2 != null) {
                    if (function1 != null) {
                        function1.invoke(str2);
                    }
                    this.f89705b.setText(str2);
                    item.setValue(DateFormatExtKt.thaiDateToDateFormatServer(str2, true, false));
                    ViewVisibleExtKt.toVisible(this.f89705b);
                    ViewVisibleExtKt.toGone(this.f89704a);
                }
            }
        }

        @NotNull
        public final OneTextLayoutView getBirthDayTextInputLayout() {
            return this.f89705b;
        }

        @NotNull
        public final ImageView getCalendarImageView() {
            return this.f89706c;
        }

        @NotNull
        public final OneFontTextView getTvHintBirthDay() {
            return this.f89704a;
        }

        public final void setBirthDayTextInputLayout(@NotNull OneTextLayoutView oneTextLayoutView) {
            Intrinsics.checkNotNullParameter(oneTextLayoutView, "<set-?>");
            this.f89705b = oneTextLayoutView;
        }

        public final void setCalendarImageView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.f89706c = imageView;
        }

        public final void setTvHintBirthDay(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.f89704a = oneFontTextView;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$DefaultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "getDefaultTextInputLayout", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "setDefaultTextInputLayout", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;)V", "defaultTextInputLayout", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneDeviceSaleCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleCampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$DefaultViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$DefaultViewHolder */
    /* loaded from: classes10.dex */
    public static final class DefaultViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextInputLayoutText f89707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.defaultTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.defaultTextInputLayout)");
            this.f89707a = (OneTextInputLayoutText) findViewById;
        }

        public final void bind(@NotNull VerifyKeyListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f89707a.setInputLayoutHint(verifyDesc);
            }
        }

        @NotNull
        public final OneTextInputLayoutText getDefaultTextInputLayout() {
            return this.f89707a;
        }

        public final void setDefaultTextInputLayout(@NotNull OneTextInputLayoutText oneTextInputLayoutText) {
            Intrinsics.checkNotNullParameter(oneTextInputLayoutText, "<set-?>");
            this.f89707a = oneTextInputLayoutText;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$MSISDNSelectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "", "phoneNumberList", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "getTvPhoneNumber", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "setTvPhoneNumber", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;)V", "tvPhoneNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneDeviceSaleCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleCampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$MSISDNSelectViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$MSISDNSelectViewHolder */
    /* loaded from: classes10.dex */
    public static final class MSISDNSelectViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextLayoutView f89708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MSISDNSelectViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tvPhoneNumber);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvPhoneNumber)");
            this.f89708a = (OneTextLayoutView) findViewById;
        }

        public final void bind(@NotNull VerifyKeyListItem item, @NotNull List<String> phoneNumberList) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(phoneNumberList, "phoneNumberList");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f89708a.setTextLabel(verifyDesc);
            }
            if (phoneNumberList.size() > 1) {
                this.f89708a.isShowIconRight(true);
            } else {
                this.f89708a.isShowIconRight(false);
                ViewEnableKt.toDisable(this.f89708a);
            }
            this.f89708a.setText(PhoneNumberExtKt.toPretty((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) phoneNumberList)));
            item.setValue((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) phoneNumberList));
        }

        @NotNull
        public final OneTextLayoutView getTvPhoneNumber() {
            return this.f89708a;
        }

        public final void setTvPhoneNumber(@NotNull OneTextLayoutView oneTextLayoutView) {
            Intrinsics.checkNotNullParameter(oneTextLayoutView, "<set-?>");
            this.f89708a = oneTextLayoutView;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$MSISDNViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone;", "getPhoneTextInputLayout", "()Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone;", "setPhoneTextInputLayout", "(Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone;)V", "phoneTextInputLayout", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneDeviceSaleCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleCampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$MSISDNViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$MSISDNViewHolder */
    /* loaded from: classes10.dex */
    public static final class MSISDNViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneEditTextInputLayoutPhone f89709a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MSISDNViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.inputLayoutPhone);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.inputLayoutPhone)");
            this.f89709a = (OneEditTextInputLayoutPhone) findViewById;
        }

        public final void bind(@NotNull VerifyKeyListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f89709a.setHintText(verifyDesc);
            }
        }

        @NotNull
        public final OneEditTextInputLayoutPhone getPhoneTextInputLayout() {
            return this.f89709a;
        }

        public final void setPhoneTextInputLayout(@NotNull OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone) {
            Intrinsics.checkNotNullParameter(oneEditTextInputLayoutPhone, "<set-?>");
            this.f89709a = oneEditTextInputLayoutPhone;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/adapter/OneDeviceSaleCampaignVerifyKeyAdapter$ThaiIdViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "idNumber", "idDocType", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "bind", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "getTvIdCard", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "setTvIdCard", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;)V", "tvIdCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$ThaiIdViewHolder */
    /* loaded from: classes10.dex */
    public static final class ThaiIdViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextLayoutView f89710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThaiIdViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tvIdCard);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvIdCard)");
            this.f89710a = (OneTextLayoutView) findViewById;
        }

        public static /* synthetic */ void bind$default(ThaiIdViewHolder thaiIdViewHolder, Context context, String str, String str2, VerifyKeyListItem verifyKeyListItem, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            thaiIdViewHolder.bind(context, str, str2, verifyKeyListItem);
        }

        public final void bind(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable VerifyKeyListItem verifyKeyListItem) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (Intrinsics.areEqual(str2, IdDocumentType.ID_CARD)) {
                this.f89710a.setTextLabel(context.getResources().getString(R.string.id_card_num));
            } else {
                this.f89710a.setTextLabel(context.getResources().getString(R.string.postpaid_passport));
            }
            this.f89710a.setText(StringExtKt.toIdCardFormat$default(str, (char) 0, 1, null));
            if (verifyKeyListItem != null) {
                verifyKeyListItem.setValue(str);
            }
        }

        @NotNull
        public final OneTextLayoutView getTvIdCard() {
            return this.f89710a;
        }

        public final void setTvIdCard(@NotNull OneTextLayoutView oneTextLayoutView) {
            Intrinsics.checkNotNullParameter(oneTextLayoutView, "<set-?>");
            this.f89710a = oneTextLayoutView;
        }
    }

    public /* synthetic */ OneDeviceSaleCampaignVerifyKeyAdapter(FragmentActivity fragmentActivity, List list, String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null, (i & 64) != 0 ? new ArrayList() : arrayList);
    }

    /* renamed from: a */
    public static /* synthetic */ void m15089a(DialogInterface dialogInterface, int i) {
        m15082h(dialogInterface, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m15088b(RecyclerView.ViewHolder viewHolder, OneDeviceSaleCampaignVerifyKeyAdapter oneDeviceSaleCampaignVerifyKeyAdapter, VerifyKeyListItem verifyKeyListItem, View view) {
        m15080j(viewHolder, oneDeviceSaleCampaignVerifyKeyAdapter, verifyKeyListItem, view);
    }

    /* renamed from: c */
    public static /* synthetic */ void m15087c(Function1 function1, DatePicker datePicker, int i, int i2, int i3) {
        m15081i(function1, datePicker, i, i2, i3);
    }

    /* renamed from: d */
    public static /* synthetic */ void m15086d(RecyclerView.ViewHolder viewHolder, View view) {
        m15078l(viewHolder, view);
    }

    /* renamed from: e */
    public static /* synthetic */ void m15085e(OneDeviceSaleCampaignVerifyKeyAdapter oneDeviceSaleCampaignVerifyKeyAdapter, RecyclerView.ViewHolder viewHolder, VerifyKeyListItem verifyKeyListItem, View view) {
        m15079k(oneDeviceSaleCampaignVerifyKeyAdapter, viewHolder, verifyKeyListItem, view);
    }

    /* renamed from: h */
    public static final void m15082h(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: i */
    public static final void m15081i(Function1 function1, DatePicker datePicker, int i, int i2, int i3) {
        BirthDayCollection birthDayCollection = new BirthDayCollection(i3, i2, i);
        if (function1 != null) {
            function1.invoke(birthDayCollection);
        }
    }

    /* renamed from: j */
    public static final void m15080j(RecyclerView.ViewHolder holder, OneDeviceSaleCampaignVerifyKeyAdapter this$0, VerifyKeyListItem verifyKeyListItem, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnePhoneListDialog newInstance = OnePhoneListDialog.Companion.newInstance();
        newInstance.setLastSelectedItem(((MSISDNSelectViewHolder) holder).getTvPhoneNumber().getTextLabel());
        newInstance.setData(this$0.f89700g);
        newInstance.setOnButtonClick(new OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$4$1$1(holder, verifyKeyListItem, newInstance));
        newInstance.show(this$0.f89694a.getSupportFragmentManager(), (String) null);
    }

    /* renamed from: k */
    public static final void m15079k(OneDeviceSaleCampaignVerifyKeyAdapter this$0, RecyclerView.ViewHolder holder, VerifyKeyListItem verifyKeyListItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        String str = this$0.f89698e;
        if (str == null || str.length() == 0) {
            this$0.m15083g(this$0.f89694a, new OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$6$1(this$0, holder, verifyKeyListItem));
        }
    }

    /* renamed from: l */
    public static final void m15078l(RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        ((BirthDateViewHolder) holder).getCalendarImageView().performClick();
    }

    /* renamed from: m */
    public static final void m15077m(RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        ((BirthDateViewHolder) holder).getCalendarImageView().performClick();
    }

    /* renamed from: g */
    public final void m15083g(Context context, final Function1 function1) {
        DatePickerDialog build = DtacDatePickerDialog.Companion.build(context, this.f89702i, new DatePickerDialog.OnDateSetListener() { // from class: vP0
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                OneDeviceSaleCampaignVerifyKeyAdapter.m15087c(Function1.this, datePicker, i, i2, i3);
            }
        });
        this.f89701h = build;
        DatePickerDialog datePickerDialog = null;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("datePicker");
            build = null;
        }
        build.setButton(-2, context.getString(R.string.cancel_text), new DialogInterface.OnClickListener() { // from class: wP0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OneDeviceSaleCampaignVerifyKeyAdapter.m15089a(dialogInterface, i);
            }
        });
        DatePickerDialog datePickerDialog2 = this.f89701h;
        if (datePickerDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("datePicker");
            datePickerDialog2 = null;
        }
        if (!datePickerDialog2.isShowing()) {
            DatePickerDialog datePickerDialog3 = this.f89701h;
            if (datePickerDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("datePicker");
            } else {
                datePickerDialog = datePickerDialog3;
            }
            datePickerDialog.show();
        }
    }

    @NotNull
    public final List<VerifyKeyListItem> getGetVerifyKeyList() {
        return this.f89703j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f89695b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        VerifyKeyListItem verifyKeyListItem;
        List list = this.f89695b;
        String str = (list == null || (verifyKeyListItem = (VerifyKeyListItem) list.get(i)) == null || (str = verifyKeyListItem.getVerifyKey()) == null) ? "" : "";
        int hashCode = str.hashCode();
        if (hashCode != -2011613734) {
            if (hashCode != -1791079433) {
                if (hashCode == 793936109 && str.equals(Constant.OnePostpaidVerifyKey.BirthDate)) {
                    return 3;
                }
            } else if (str.equals(Constant.OnePostpaidVerifyKey.ThaiId)) {
                return 1;
            }
        } else if (str.equals(Constant.OnePostpaidVerifyKey.MSISDN)) {
            if (!this.f89700g.isEmpty()) {
                return 4;
            }
            return 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder holder, int i) {
        final VerifyKeyListItem verifyKeyListItem;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f89695b;
        if (list != null) {
            verifyKeyListItem = (VerifyKeyListItem) list.get(i);
        } else {
            verifyKeyListItem = null;
        }
        if (holder instanceof ThaiIdViewHolder) {
            ThaiIdViewHolder thaiIdViewHolder = (ThaiIdViewHolder) holder;
            thaiIdViewHolder.bind(this.f89694a, this.f89696c, this.f89697d, verifyKeyListItem);
            if (verifyKeyListItem != null) {
                verifyKeyListItem.setValue(StringExtKt.toReplaceSpace(thaiIdViewHolder.getTvIdCard().getText()));
            }
        } else if (holder instanceof MSISDNViewHolder) {
            if (verifyKeyListItem != null) {
                ((MSISDNViewHolder) holder).bind(verifyKeyListItem);
            }
            ((MSISDNViewHolder) holder).getPhoneTextInputLayout().setOnTextChangeListener(new OneEditTextInputLayoutPhone.OnTextChangListener() { // from class: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$2
                @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone.OnTextChangListener
                public void afterTextChanged(@Nullable Editable editable) {
                    VerifyKeyListItem verifyKeyListItem2 = VerifyKeyListItem.this;
                    if (verifyKeyListItem2 != null) {
                        verifyKeyListItem2.setValue(StringExtKt.toRemoveDash(String.valueOf(editable)));
                    }
                }
            });
        } else if (holder instanceof MSISDNSelectViewHolder) {
            if (verifyKeyListItem != null) {
                ((MSISDNSelectViewHolder) holder).bind(verifyKeyListItem, this.f89700g);
            }
            ((MSISDNSelectViewHolder) holder).getTvPhoneNumber().setOnClickListener(new View.OnClickListener() { // from class: rP0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneDeviceSaleCampaignVerifyKeyAdapter.m15088b(RecyclerView.ViewHolder.this, this, verifyKeyListItem, view);
                }
            });
        } else if (holder instanceof BirthDateViewHolder) {
            if (verifyKeyListItem != null) {
                ((BirthDateViewHolder) holder).bind(verifyKeyListItem, this.f89698e, this.f89699f, new OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$5$1(verifyKeyListItem));
            }
            BirthDateViewHolder birthDateViewHolder = (BirthDateViewHolder) holder;
            birthDateViewHolder.getCalendarImageView().setOnClickListener(new View.OnClickListener() { // from class: sP0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneDeviceSaleCampaignVerifyKeyAdapter.m15085e(OneDeviceSaleCampaignVerifyKeyAdapter.this, holder, verifyKeyListItem, view);
                }
            });
            birthDateViewHolder.getBirthDayTextInputLayout().setOnClickListener(new View.OnClickListener() { // from class: tP0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneDeviceSaleCampaignVerifyKeyAdapter.m15086d(RecyclerView.ViewHolder.this, view);
                }
            });
            birthDateViewHolder.getTvHintBirthDay().setOnClickListener(new View.OnClickListener() { // from class: uP0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneDeviceSaleCampaignVerifyKeyAdapter.m15077m(RecyclerView.ViewHolder.this, view);
                }
            });
        } else if (holder instanceof DefaultViewHolder) {
            if (verifyKeyListItem != null) {
                ((DefaultViewHolder) holder).bind(verifyKeyListItem);
            }
            ((DefaultViewHolder) holder).getDefaultTextInputLayout().setOnTextChangeListener(new OneTextInputLayoutText.OnTextChangListener() { // from class: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$10
                @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText.OnTextChangListener
                public void afterTextChanged(@Nullable Editable editable) {
                    VerifyKeyListItem verifyKeyListItem2 = VerifyKeyListItem.this;
                    if (verifyKeyListItem2 != null) {
                        verifyKeyListItem2.setValue(String.valueOf(editable));
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_verify_campaign_default, parent, false);
                        Intrinsics.checkNotNullExpressionValue(view, "view");
                        return new DefaultViewHolder(view);
                    }
                    View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_verify_campaign_msisdn_select, parent, false);
                    Intrinsics.checkNotNullExpressionValue(view2, "view");
                    return new MSISDNSelectViewHolder(view2);
                }
                View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_verify_campaign_birth_date, parent, false);
                Intrinsics.checkNotNullExpressionValue(view3, "view");
                return new BirthDateViewHolder(view3);
            }
            View view4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_verify_campaign_msisdn_true, parent, false);
            Intrinsics.checkNotNullExpressionValue(view4, "view");
            return new MSISDNViewHolder(view4);
        }
        View view5 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_verify_campaign_thai_id, parent, false);
        Intrinsics.checkNotNullExpressionValue(view5, "view");
        return new ThaiIdViewHolder(view5);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateBirthdayFromSmartCard(@Nullable String str) {
        if (str != null && str.length() != 0) {
            this.f89699f = DateFormatExtKt.fromSmartCardToThaiDateFormat(str);
            BirthDayCollection oCRBirthDateCollectionFormat = DateFormatExtKt.toOCRBirthDateCollectionFormat(str);
            Intrinsics.checkNotNull(oCRBirthDateCollectionFormat, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection");
            this.f89702i = oCRBirthDateCollectionFormat;
            notifyDataSetChanged();
        }
    }

    public OneDeviceSaleCampaignVerifyKeyAdapter(@NotNull FragmentActivity mContext, @Nullable List<VerifyKeyListItem> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull ArrayList<String> phoneNumberList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(phoneNumberList, "phoneNumberList");
        this.f89694a = mContext;
        this.f89695b = list;
        this.f89696c = str;
        this.f89697d = str2;
        this.f89698e = str3;
        this.f89699f = str4;
        this.f89700g = phoneNumberList;
        this.f89703j = list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}