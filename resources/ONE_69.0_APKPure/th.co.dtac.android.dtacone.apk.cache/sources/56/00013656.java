package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter;

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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter;
import th.p047co.dtac.android.dtacone.widget.dialog.DtacDatePickerDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005?@ABCBk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010=¨\u0006D"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/fragment/app/FragmentActivity;", "mContext", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "verifyKeyList", "", "idNumber", "idDocType", "birthdayFromSmartCard", "birthdayFromOCR", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "phoneNumberList", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "", "showBirthDay", OperatorName.NON_STROKING_GRAY, "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "updateBirthdayFromSmartCard", "(Ljava/lang/String;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/fragment/app/FragmentActivity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "e", OperatorName.FILL_NON_ZERO, "Ljava/util/ArrayList;", "Landroid/app/DatePickerDialog;", OperatorName.CLOSE_PATH, "Landroid/app/DatePickerDialog;", "datePicker", "i", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "selectedBirthDayCollection", OperatorName.SET_LINE_JOINSTYLE, "getGetVerifyKeyList", "()Ljava/util/List;", "getVerifyKeyList", "BirthDateViewHolder", "DefaultViewHolder", "MSISDNSelectViewHolder", "MSISDNViewHolder", "ThaiIdViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter */
/* loaded from: classes10.dex */
public final class CampaignVerifyKeyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FragmentActivity f93251a;

    /* renamed from: b */
    public final List f93252b;

    /* renamed from: c */
    public final String f93253c;

    /* renamed from: d */
    public final String f93254d;

    /* renamed from: e */
    public final String f93255e;

    /* renamed from: f */
    public String f93256f;

    /* renamed from: g */
    public ArrayList f93257g;

    /* renamed from: h */
    public DatePickerDialog f93258h;

    /* renamed from: i */
    public BirthDayCollection f93259i;

    /* renamed from: j */
    public final List f93260j;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$BirthDateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "birthdayFromSmartCard", "birthdayFromOCR", "Lkotlin/Function1;", "", "itemValue", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvHintBirthDay", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "setTvHintBirthDay", "(Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;)V", "tvHintBirthDay", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "getBirthDayTextInputLayout", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "setBirthDayTextInputLayout", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;)V", "birthDayTextInputLayout", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getCalendarImageView", "()Landroid/widget/ImageView;", "setCalendarImageView", "(Landroid/widget/ImageView;)V", "calendarImageView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$BirthDateViewHolder */
    /* loaded from: classes10.dex */
    public static final class BirthDateViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneFontTextView f93261a;

        /* renamed from: b */
        public OneTextLayoutView f93262b;

        /* renamed from: c */
        public ImageView f93263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BirthDateViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tvHintBirthDay);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvHintBirthDay)");
            this.f93261a = (OneFontTextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.birthDayTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.….birthDayTextInputLayout)");
            this.f93262b = (OneTextLayoutView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.calendarImageView);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.calendarImageView)");
            this.f93263c = (ImageView) findViewById3;
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
                this.f93261a.setText(verifyDesc);
                this.f93262b.setTextLabel(verifyDesc);
                if (str != null) {
                    if (function1 != null) {
                        function1.invoke(str);
                    }
                    this.f93262b.setText(str);
                    item.setValue(DateFormatExtKt.thaiDateToDateFormatServer(str, true, false));
                    ViewVisibleExtKt.toVisible(this.f93262b);
                    ViewVisibleExtKt.toGone(this.f93261a);
                }
                if (str2 != null) {
                    if (function1 != null) {
                        function1.invoke(str2);
                    }
                    this.f93262b.setText(str2);
                    item.setValue(DateFormatExtKt.thaiDateToDateFormatServer(str2, true, false));
                    ViewVisibleExtKt.toVisible(this.f93262b);
                    ViewVisibleExtKt.toGone(this.f93261a);
                }
            }
        }

        @NotNull
        public final OneTextLayoutView getBirthDayTextInputLayout() {
            return this.f93262b;
        }

        @NotNull
        public final ImageView getCalendarImageView() {
            return this.f93263c;
        }

        @NotNull
        public final OneFontTextView getTvHintBirthDay() {
            return this.f93261a;
        }

        public final void setBirthDayTextInputLayout(@NotNull OneTextLayoutView oneTextLayoutView) {
            Intrinsics.checkNotNullParameter(oneTextLayoutView, "<set-?>");
            this.f93262b = oneTextLayoutView;
        }

        public final void setCalendarImageView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.f93263c = imageView;
        }

        public final void setTvHintBirthDay(@NotNull OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.f93261a = oneFontTextView;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$DefaultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "getDefaultTextInputLayout", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "setDefaultTextInputLayout", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;)V", "defaultTextInputLayout", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$DefaultViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$DefaultViewHolder */
    /* loaded from: classes10.dex */
    public static final class DefaultViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextInputLayoutText f93264a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.defaultTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.defaultTextInputLayout)");
            this.f93264a = (OneTextInputLayoutText) findViewById;
        }

        public final void bind(@NotNull VerifyKeyListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f93264a.setInputLayoutHint(verifyDesc);
            }
        }

        @NotNull
        public final OneTextInputLayoutText getDefaultTextInputLayout() {
            return this.f93264a;
        }

        public final void setDefaultTextInputLayout(@NotNull OneTextInputLayoutText oneTextInputLayoutText) {
            Intrinsics.checkNotNullParameter(oneTextInputLayoutText, "<set-?>");
            this.f93264a = oneTextInputLayoutText;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$MSISDNSelectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "", "phoneNumberList", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "getTvPhoneNumber", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "setTvPhoneNumber", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;)V", "tvPhoneNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$MSISDNSelectViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$MSISDNSelectViewHolder */
    /* loaded from: classes10.dex */
    public static final class MSISDNSelectViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextLayoutView f93265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MSISDNSelectViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tvPhoneNumber);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvPhoneNumber)");
            this.f93265a = (OneTextLayoutView) findViewById;
        }

        public final void bind(@NotNull VerifyKeyListItem item, @NotNull List<String> phoneNumberList) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(phoneNumberList, "phoneNumberList");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f93265a.setTextLabel(verifyDesc);
            }
            if (phoneNumberList.size() > 1) {
                this.f93265a.isShowIconRight(true);
            } else {
                this.f93265a.isShowIconRight(false);
            }
            this.f93265a.setText(PhoneNumberExtKt.toPretty((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) phoneNumberList)));
            item.setValue((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) phoneNumberList));
        }

        @NotNull
        public final OneTextLayoutView getTvPhoneNumber() {
            return this.f93265a;
        }

        public final void setTvPhoneNumber(@NotNull OneTextLayoutView oneTextLayoutView) {
            Intrinsics.checkNotNullParameter(oneTextLayoutView, "<set-?>");
            this.f93265a = oneTextLayoutView;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$MSISDNViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", "getPhoneTextInputLayout", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", "setPhoneTextInputLayout", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;)V", "phoneTextInputLayout", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCampaignVerifyKeyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignVerifyKeyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$MSISDNViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$MSISDNViewHolder */
    /* loaded from: classes10.dex */
    public static final class MSISDNViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextInputLayoutPhone f93266a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MSISDNViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.phoneTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.phoneTextInputLayout)");
            this.f93266a = (OneTextInputLayoutPhone) findViewById;
        }

        public final void bind(@NotNull VerifyKeyListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String verifyDesc = item.getVerifyDesc();
            if (verifyDesc != null) {
                this.f93266a.setInputLayoutHint(verifyDesc);
            }
        }

        @NotNull
        public final OneTextInputLayoutPhone getPhoneTextInputLayout() {
            return this.f93266a;
        }

        public final void setPhoneTextInputLayout(@NotNull OneTextInputLayoutPhone oneTextInputLayoutPhone) {
            Intrinsics.checkNotNullParameter(oneTextInputLayoutPhone, "<set-?>");
            this.f93266a = oneTextInputLayoutPhone;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/CampaignVerifyKeyAdapter$ThaiIdViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "idNumber", "idDocType", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "item", "", "bind", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "getTvIdCard", "()Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "setTvIdCard", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;)V", "tvIdCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$ThaiIdViewHolder */
    /* loaded from: classes10.dex */
    public static final class ThaiIdViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneTextLayoutView f93267a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThaiIdViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tvIdCard);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvIdCard)");
            this.f93267a = (OneTextLayoutView) findViewById;
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
                this.f93267a.setTextLabel(context.getResources().getString(R.string.id_card_num));
            } else {
                this.f93267a.setTextLabel(context.getResources().getString(R.string.postpaid_passport));
            }
            this.f93267a.setText(str);
            if (verifyKeyListItem != null) {
                verifyKeyListItem.setValue(str);
            }
        }

        @NotNull
        public final OneTextLayoutView getTvIdCard() {
            return this.f93267a;
        }

        public final void setTvIdCard(@NotNull OneTextLayoutView oneTextLayoutView) {
            Intrinsics.checkNotNullParameter(oneTextLayoutView, "<set-?>");
            this.f93267a = oneTextLayoutView;
        }
    }

    public /* synthetic */ CampaignVerifyKeyAdapter(FragmentActivity fragmentActivity, List list, String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null, (i & 64) != 0 ? new ArrayList() : arrayList);
    }

    /* renamed from: a */
    public static /* synthetic */ void m12723a(RecyclerView.ViewHolder viewHolder, View view) {
        m12712l(viewHolder, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m12722b(RecyclerView.ViewHolder viewHolder, View view) {
        m12711m(viewHolder, view);
    }

    /* renamed from: c */
    public static /* synthetic */ void m12721c(DialogInterface dialogInterface, int i) {
        m12716h(dialogInterface, i);
    }

    /* renamed from: d */
    public static /* synthetic */ void m12720d(Function1 function1, DatePicker datePicker, int i, int i2, int i3) {
        m12715i(function1, datePicker, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ void m12719e(RecyclerView.ViewHolder viewHolder, CampaignVerifyKeyAdapter campaignVerifyKeyAdapter, VerifyKeyListItem verifyKeyListItem, View view) {
        m12714j(viewHolder, campaignVerifyKeyAdapter, verifyKeyListItem, view);
    }

    /* renamed from: f */
    public static /* synthetic */ void m12718f(CampaignVerifyKeyAdapter campaignVerifyKeyAdapter, RecyclerView.ViewHolder viewHolder, VerifyKeyListItem verifyKeyListItem, View view) {
        m12713k(campaignVerifyKeyAdapter, viewHolder, verifyKeyListItem, view);
    }

    /* renamed from: g */
    private final void m12717g(Context context, final Function1 function1) {
        DatePickerDialog build = DtacDatePickerDialog.Companion.build(context, this.f93259i, new DatePickerDialog.OnDateSetListener() { // from class: ll
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                CampaignVerifyKeyAdapter.m12720d(Function1.this, datePicker, i, i2, i3);
            }
        });
        this.f93258h = build;
        DatePickerDialog datePickerDialog = null;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("datePicker");
            build = null;
        }
        build.setButton(-2, context.getString(R.string.cancel_text), new DialogInterface.OnClickListener() { // from class: ml
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CampaignVerifyKeyAdapter.m12721c(dialogInterface, i);
            }
        });
        DatePickerDialog datePickerDialog2 = this.f93258h;
        if (datePickerDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("datePicker");
            datePickerDialog2 = null;
        }
        if (!datePickerDialog2.isShowing()) {
            DatePickerDialog datePickerDialog3 = this.f93258h;
            if (datePickerDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("datePicker");
            } else {
                datePickerDialog = datePickerDialog3;
            }
            datePickerDialog.show();
        }
    }

    /* renamed from: h */
    public static final void m12716h(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: i */
    public static final void m12715i(Function1 function1, DatePicker datePicker, int i, int i2, int i3) {
        BirthDayCollection birthDayCollection = new BirthDayCollection(i3, i2, i);
        if (function1 != null) {
            function1.invoke(birthDayCollection);
        }
    }

    /* renamed from: j */
    public static final void m12714j(RecyclerView.ViewHolder holder, CampaignVerifyKeyAdapter this$0, VerifyKeyListItem verifyKeyListItem, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnePhoneListDialog newInstance = OnePhoneListDialog.Companion.newInstance();
        newInstance.setLastSelectedItem(((MSISDNSelectViewHolder) holder).getTvPhoneNumber().getTextLabel());
        newInstance.setData(this$0.f93257g);
        newInstance.setOnButtonClick(new CampaignVerifyKeyAdapter$onBindViewHolder$4$1$1(holder, verifyKeyListItem, newInstance));
        newInstance.show(this$0.f93251a.getSupportFragmentManager(), (String) null);
    }

    /* renamed from: k */
    public static final void m12713k(CampaignVerifyKeyAdapter this$0, RecyclerView.ViewHolder holder, VerifyKeyListItem verifyKeyListItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        String str = this$0.f93255e;
        if (str == null || str.length() == 0) {
            this$0.m12717g(this$0.f93251a, new CampaignVerifyKeyAdapter$onBindViewHolder$6$1(this$0, holder, verifyKeyListItem));
        }
    }

    /* renamed from: l */
    public static final void m12712l(RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        ((BirthDateViewHolder) holder).getCalendarImageView().performClick();
    }

    /* renamed from: m */
    public static final void m12711m(RecyclerView.ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        ((BirthDateViewHolder) holder).getCalendarImageView().performClick();
    }

    @NotNull
    public final List<VerifyKeyListItem> getGetVerifyKeyList() {
        return this.f93260j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f93252b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        VerifyKeyListItem verifyKeyListItem;
        List list = this.f93252b;
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
            if (!this.f93257g.isEmpty()) {
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
        List list = this.f93252b;
        if (list != null) {
            verifyKeyListItem = (VerifyKeyListItem) list.get(i);
        } else {
            verifyKeyListItem = null;
        }
        if (holder instanceof ThaiIdViewHolder) {
            ThaiIdViewHolder thaiIdViewHolder = (ThaiIdViewHolder) holder;
            thaiIdViewHolder.bind(this.f93251a, this.f93253c, this.f93254d, verifyKeyListItem);
            if (verifyKeyListItem != null) {
                verifyKeyListItem.setValue(StringExtKt.toReplaceSpace(thaiIdViewHolder.getTvIdCard().getText()));
            }
        } else if (holder instanceof MSISDNViewHolder) {
            if (verifyKeyListItem != null) {
                ((MSISDNViewHolder) holder).bind(verifyKeyListItem);
            }
            ((MSISDNViewHolder) holder).getPhoneTextInputLayout().setOnTextChangeListener(new OneTextInputLayoutPhone.OnTextChangListener() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$onBindViewHolder$2
                @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone.OnTextChangListener
                public void afterTextChanged(@Nullable Editable editable) {
                    VerifyKeyListItem verifyKeyListItem2 = VerifyKeyListItem.this;
                    if (verifyKeyListItem2 != null) {
                        verifyKeyListItem2.setValue(StringExtKt.toRemoveDash(String.valueOf(editable)));
                    }
                }
            });
        } else if (holder instanceof MSISDNSelectViewHolder) {
            if (verifyKeyListItem != null) {
                ((MSISDNSelectViewHolder) holder).bind(verifyKeyListItem, this.f93257g);
            }
            ((MSISDNSelectViewHolder) holder).getTvPhoneNumber().setOnClickListener(new View.OnClickListener() { // from class: hl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CampaignVerifyKeyAdapter.m12719e(RecyclerView.ViewHolder.this, this, verifyKeyListItem, view);
                }
            });
        } else if (holder instanceof BirthDateViewHolder) {
            if (verifyKeyListItem != null) {
                ((BirthDateViewHolder) holder).bind(verifyKeyListItem, this.f93255e, this.f93256f, new CampaignVerifyKeyAdapter$onBindViewHolder$5$1(verifyKeyListItem));
            }
            BirthDateViewHolder birthDateViewHolder = (BirthDateViewHolder) holder;
            birthDateViewHolder.getCalendarImageView().setOnClickListener(new View.OnClickListener() { // from class: il
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CampaignVerifyKeyAdapter.m12718f(CampaignVerifyKeyAdapter.this, holder, verifyKeyListItem, view);
                }
            });
            birthDateViewHolder.getBirthDayTextInputLayout().setOnClickListener(new View.OnClickListener() { // from class: jl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CampaignVerifyKeyAdapter.m12723a(RecyclerView.ViewHolder.this, view);
                }
            });
            birthDateViewHolder.getTvHintBirthDay().setOnClickListener(new View.OnClickListener() { // from class: kl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CampaignVerifyKeyAdapter.m12722b(RecyclerView.ViewHolder.this, view);
                }
            });
        } else if (holder instanceof DefaultViewHolder) {
            if (verifyKeyListItem != null) {
                ((DefaultViewHolder) holder).bind(verifyKeyListItem);
            }
            ((DefaultViewHolder) holder).getDefaultTextInputLayout().setOnTextChangeListener(new OneTextInputLayoutText.OnTextChangListener() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.CampaignVerifyKeyAdapter$onBindViewHolder$10
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
            View view4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_verify_campaign_msisdn, parent, false);
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
            this.f93256f = DateFormatExtKt.fromSmartCardToThaiDateFormat(str);
            BirthDayCollection oCRBirthDateCollectionFormat = DateFormatExtKt.toOCRBirthDateCollectionFormat(str);
            Intrinsics.checkNotNull(oCRBirthDateCollectionFormat, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection");
            this.f93259i = oCRBirthDateCollectionFormat;
            notifyDataSetChanged();
        }
    }

    public CampaignVerifyKeyAdapter(@NotNull FragmentActivity mContext, @Nullable List<VerifyKeyListItem> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull ArrayList<String> phoneNumberList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(phoneNumberList, "phoneNumberList");
        this.f93251a = mContext;
        this.f93252b = list;
        this.f93253c = str;
        this.f93254d = str2;
        this.f93255e = str3;
        this.f93256f = str4;
        this.f93257g = phoneNumberList;
        this.f93260j = list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}