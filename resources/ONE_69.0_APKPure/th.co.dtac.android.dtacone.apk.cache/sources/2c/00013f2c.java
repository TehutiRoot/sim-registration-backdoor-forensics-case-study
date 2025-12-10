package th.p047co.dtac.android.dtacone.view.appOne.staff.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomNumberEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffCreditLimitDialog;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.OneManageStaffThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0018\u0010+\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00103\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010@¨\u0006C"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffCreditLimitDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "oneHomeActivity", "", MessageBundle.TITLE_ENTRY, "description", "", "creditAmount", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/OneManageStaffThemeColorModel;", "oneManageStaffThemeColorModel", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;Ljava/lang/String;Ljava/lang/String;ILth/co/dtac/android/dtacone/view/appOne/staff/model/OneManageStaffThemeColorModel;Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;)V", "", OperatorName.MOVE_TO, "()V", OperatorName.NON_STROKING_CMYK, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", OperatorName.CLOSE_PATH, "i", "I", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/view/appOne/staff/model/OneManageStaffThemeColorModel;", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvTitle", "tvDescription", OperatorName.ENDPATH, "btnConfirm", "o", "btnCancel", "Lth/co/dtac/android/dtacone/app_one/widget/OneRadioButton;", "p", "Lth/co/dtac/android/dtacone/app_one/widget/OneRadioButton;", "radioNoDefine", OperatorName.SAVE, "radioDefine", PDPageLabelRange.STYLE_ROMAN_LOWER, "tvNoDefineText", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomNumberEditText;", OperatorName.CLOSE_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomNumberEditText;", "edtCredit", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "setInputMethodManager", "(Landroid/view/inputmethod/InputMethodManager;)V", "Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "()Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffCreditLimitDialog */
/* loaded from: classes10.dex */
public final class OneStaffCreditLimitDialog extends AppCompatDialog {

    /* renamed from: f */
    public final OneHomeActivity f97246f;

    /* renamed from: g */
    public final String f97247g;

    /* renamed from: h */
    public final String f97248h;

    /* renamed from: i */
    public final int f97249i;
    @Inject
    public InputMethodManager inputMethodManager;

    /* renamed from: j */
    public final OneManageStaffThemeColorModel f97250j;

    /* renamed from: k */
    public final CustomDialogBox.Callback f97251k;

    /* renamed from: l */
    public OneFontTextView f97252l;

    /* renamed from: m */
    public OneFontTextView f97253m;

    /* renamed from: n */
    public OneFontTextView f97254n;

    /* renamed from: o */
    public OneFontTextView f97255o;

    /* renamed from: p */
    public OneRadioButton f97256p;

    /* renamed from: q */
    public OneRadioButton f97257q;

    /* renamed from: r */
    public OneFontTextView f97258r;

    /* renamed from: s */
    public OneCustomNumberEditText f97259s;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffCreditLimitDialog$Companion;", "", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffCreditLimitDialog$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffCreditLimitDialog(@NotNull Context context, @NotNull OneHomeActivity oneHomeActivity, @NotNull String title, @NotNull String description, int i, @NotNull OneManageStaffThemeColorModel oneManageStaffThemeColorModel, @Nullable CustomDialogBox.Callback callback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oneHomeActivity, "oneHomeActivity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(oneManageStaffThemeColorModel, "oneManageStaffThemeColorModel");
        this.f97246f = oneHomeActivity;
        this.f97247g = title;
        this.f97248h = description;
        this.f97249i = i;
        this.f97250j = oneManageStaffThemeColorModel;
        this.f97251k = callback;
        requestWindowFeature(1);
        setContentView(R.layout.one_dialog_credit_limit);
        setCancelable(true);
    }

    /* renamed from: k */
    private final void m9993k() {
        this.f97252l = (OneFontTextView) findViewById(R.id.tvTitle);
        this.f97253m = (OneFontTextView) findViewById(R.id.tvDescription);
        this.f97254n = (OneFontTextView) findViewById(R.id.btnConfirm);
        this.f97255o = (OneFontTextView) findViewById(R.id.btnCancel);
        this.f97256p = (OneRadioButton) findViewById(R.id.rdbNoDefine);
        this.f97257q = (OneRadioButton) findViewById(R.id.rdbDefine);
        this.f97258r = (OneFontTextView) findViewById(R.id.tvNoDefineText);
        this.f97259s = (OneCustomNumberEditText) findViewById(R.id.edtCredit);
    }

    /* renamed from: l */
    private final OneStaffViewModel m9992l() {
        return this.f97246f.getViewModel();
    }

    /* renamed from: m */
    private final void m9991m() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        OneFontTextView oneFontTextView = this.f97252l;
        if (oneFontTextView != null) {
            oneFontTextView.setText(this.f97247g);
        }
        OneFontTextView oneFontTextView2 = this.f97253m;
        if (oneFontTextView2 != null) {
            oneFontTextView2.setText(this.f97248h);
        }
        OneCustomNumberEditText oneCustomNumberEditText = this.f97259s;
        if (oneCustomNumberEditText != null) {
            oneCustomNumberEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Ad1
                {
                    OneStaffCreditLimitDialog.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    OneStaffCreditLimitDialog.m9990n(OneStaffCreditLimitDialog.this, view, z);
                }
            });
        }
        OneRadioButton oneRadioButton = this.f97256p;
        if (oneRadioButton != null) {
            oneRadioButton.setOnClickListener(new View.OnClickListener() { // from class: Bd1
                {
                    OneStaffCreditLimitDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStaffCreditLimitDialog.m9987q(OneStaffCreditLimitDialog.this, inputMethodManager, view);
                }
            });
        }
        OneRadioButton oneRadioButton2 = this.f97257q;
        if (oneRadioButton2 != null) {
            oneRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: Cd1
                {
                    OneStaffCreditLimitDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStaffCreditLimitDialog.m9986r(OneStaffCreditLimitDialog.this, inputMethodManager, view);
                }
            });
        }
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = this.f97250j;
        OneCustomNumberEditText oneCustomNumberEditText2 = this.f97259s;
        if (oneCustomNumberEditText2 != null) {
            oneCustomNumberEditText2.setBackgroundResource(oneManageStaffThemeColorModel.getEditTextBackground());
        }
        OneFontTextView oneFontTextView3 = this.f97254n;
        if (oneFontTextView3 != null) {
            oneFontTextView3.setBackgroundResource(oneManageStaffThemeColorModel.getButtonOkBackground());
        }
        OneRadioButton oneRadioButton3 = this.f97257q;
        if (oneRadioButton3 != null) {
            oneRadioButton3.setButtonDrawable(oneManageStaffThemeColorModel.getRadioButton());
        }
        OneRadioButton oneRadioButton4 = this.f97256p;
        if (oneRadioButton4 != null) {
            oneRadioButton4.setButtonDrawable(oneManageStaffThemeColorModel.getRadioButton());
        }
        OneCustomNumberEditText oneCustomNumberEditText3 = this.f97259s;
        if (oneCustomNumberEditText3 != null) {
            oneCustomNumberEditText3.setTextColor(ResourcesCompat.getColor(getContext().getResources(), oneManageStaffThemeColorModel.getEditTextColor(), null));
        }
        if (this.f97249i == 9999999) {
            OneCustomNumberEditText oneCustomNumberEditText4 = this.f97259s;
            if (oneCustomNumberEditText4 != null) {
                oneCustomNumberEditText4.setBackgroundResource(R.drawable.rectangle_idle);
            }
            OneManageStaffThemeColorModel oneManageStaffThemeColorModel2 = this.f97250j;
            OneFontTextView oneFontTextView4 = this.f97258r;
            if (oneFontTextView4 != null) {
                oneFontTextView4.setTextColor(ResourcesCompat.getColor(getContext().getResources(), oneManageStaffThemeColorModel2.getEditTextColor(), null));
            }
            OneRadioButton oneRadioButton5 = this.f97256p;
            if (oneRadioButton5 != null) {
                oneRadioButton5.setChecked(true);
            }
        } else {
            OneRadioButton oneRadioButton6 = this.f97257q;
            if (oneRadioButton6 != null) {
                oneRadioButton6.setChecked(true);
            }
            OneFontTextView oneFontTextView5 = this.f97258r;
            if (oneFontTextView5 != null) {
                oneFontTextView5.setTextColor(ResourcesCompat.getColor(getContext().getResources(), R.color.jet_back, null));
            }
            OneCustomNumberEditText oneCustomNumberEditText5 = this.f97259s;
            if (oneCustomNumberEditText5 != null) {
                oneCustomNumberEditText5.setText(String.valueOf(this.f97249i));
            }
            OneCustomNumberEditText oneCustomNumberEditText6 = this.f97259s;
            if (oneCustomNumberEditText6 != null) {
                oneCustomNumberEditText6.requestFocus();
            }
        }
        OneFontTextView oneFontTextView6 = this.f97254n;
        if (oneFontTextView6 != null) {
            oneFontTextView6.setOnClickListener(new View.OnClickListener() { // from class: Dd1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStaffCreditLimitDialog.m9989o(inputMethodManager, this, view);
                }
            });
        }
        OneFontTextView oneFontTextView7 = this.f97255o;
        if (oneFontTextView7 != null) {
            oneFontTextView7.setOnClickListener(new View.OnClickListener() { // from class: Ed1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStaffCreditLimitDialog.m9988p(inputMethodManager, this, view);
                }
            });
        }
    }

    /* renamed from: n */
    public static final void m9990n(OneStaffCreditLimitDialog this$0, View view, boolean z) {
        Editable editable;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            OneCustomNumberEditText oneCustomNumberEditText = this$0.f97259s;
            if (oneCustomNumberEditText != null) {
                editable = oneCustomNumberEditText.getText();
            } else {
                editable = null;
            }
            if (editable == null || AbstractC19741eO1.isBlank(editable)) {
                OneRadioButton oneRadioButton = this$0.f97257q;
                if (oneRadioButton != null) {
                    oneRadioButton.setChecked(true);
                }
                OneManageStaffThemeColorModel oneManageStaffThemeColorModel = this$0.f97250j;
                OneFontTextView oneFontTextView = this$0.f97258r;
                if (oneFontTextView != null) {
                    oneFontTextView.setTextColor(ResourcesCompat.getColor(this$0.getContext().getResources(), R.color.jet_back, null));
                }
                OneCustomNumberEditText oneCustomNumberEditText2 = this$0.f97259s;
                if (oneCustomNumberEditText2 != null) {
                    oneCustomNumberEditText2.setBackgroundResource(oneManageStaffThemeColorModel.getEditTextBackground());
                }
                OneCustomNumberEditText oneCustomNumberEditText3 = this$0.f97259s;
                if (oneCustomNumberEditText3 != null) {
                    oneCustomNumberEditText3.setTextColor(ResourcesCompat.getColor(this$0.getContext().getResources(), oneManageStaffThemeColorModel.getEditTextColor(), null));
                }
            }
        }
    }

    /* renamed from: o */
    public static final void m9989o(InputMethodManager imm, OneStaffCreditLimitDialog this$0, View view) {
        IBinder iBinder;
        Editable editable;
        Intrinsics.checkNotNullParameter(imm, "$imm");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneCustomNumberEditText oneCustomNumberEditText = this$0.f97259s;
        Boolean bool = null;
        if (oneCustomNumberEditText != null) {
            iBinder = oneCustomNumberEditText.getWindowToken();
        } else {
            iBinder = null;
        }
        imm.hideSoftInputFromWindow(iBinder, 2);
        OneCustomNumberEditText oneCustomNumberEditText2 = this$0.f97259s;
        if (oneCustomNumberEditText2 != null) {
            editable = oneCustomNumberEditText2.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        OneRadioButton oneRadioButton = this$0.f97257q;
        if (oneRadioButton != null) {
            bool = Boolean.valueOf(oneRadioButton.isChecked());
        }
        this$0.m9992l().setAddNewStaffData(new OneAddNewStaff(null, null, null, null, null, valueOf, bool, 31, null));
        CustomDialogBox.Callback callback = this$0.f97251k;
        if (callback != null) {
            callback.onButtonClick();
        }
    }

    /* renamed from: p */
    public static final void m9988p(InputMethodManager imm, OneStaffCreditLimitDialog this$0, View view) {
        IBinder iBinder;
        Intrinsics.checkNotNullParameter(imm, "$imm");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneCustomNumberEditText oneCustomNumberEditText = this$0.f97259s;
        if (oneCustomNumberEditText != null) {
            iBinder = oneCustomNumberEditText.getWindowToken();
        } else {
            iBinder = null;
        }
        imm.hideSoftInputFromWindow(iBinder, 2);
        this$0.dismiss();
    }

    /* renamed from: q */
    public static final void m9987q(OneStaffCreditLimitDialog this$0, InputMethodManager imm, View view) {
        IBinder iBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imm, "$imm");
        OneCustomNumberEditText oneCustomNumberEditText = this$0.f97259s;
        if (oneCustomNumberEditText != null) {
            oneCustomNumberEditText.setText("");
            oneCustomNumberEditText.clearFocus();
            oneCustomNumberEditText.setBackgroundResource(R.drawable.rectangle_idle);
            OneCustomNumberEditText oneCustomNumberEditText2 = this$0.f97259s;
            if (oneCustomNumberEditText2 != null) {
                iBinder = oneCustomNumberEditText2.getWindowToken();
            } else {
                iBinder = null;
            }
            imm.hideSoftInputFromWindow(iBinder, 2);
        }
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = this$0.f97250j;
        OneFontTextView oneFontTextView = this$0.f97258r;
        if (oneFontTextView != null) {
            oneFontTextView.setTextColor(ResourcesCompat.getColor(this$0.getContext().getResources(), oneManageStaffThemeColorModel.getEditTextColor(), null));
        }
    }

    /* renamed from: r */
    public static final void m9986r(OneStaffCreditLimitDialog this$0, InputMethodManager imm, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imm, "$imm");
        OneCustomNumberEditText oneCustomNumberEditText = this$0.f97259s;
        if (oneCustomNumberEditText != null) {
            oneCustomNumberEditText.setEnabled(true);
            oneCustomNumberEditText.requestFocus();
            imm.showSoftInput(this$0.f97259s, 1);
        }
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = this$0.f97250j;
        OneFontTextView oneFontTextView = this$0.f97258r;
        if (oneFontTextView != null) {
            oneFontTextView.setTextColor(ResourcesCompat.getColor(this$0.getContext().getResources(), R.color.jet_back, null));
        }
        OneCustomNumberEditText oneCustomNumberEditText2 = this$0.f97259s;
        if (oneCustomNumberEditText2 != null) {
            oneCustomNumberEditText2.setBackgroundResource(oneManageStaffThemeColorModel.getEditTextBackground());
        }
        OneCustomNumberEditText oneCustomNumberEditText3 = this$0.f97259s;
        if (oneCustomNumberEditText3 != null) {
            oneCustomNumberEditText3.setTextColor(ResourcesCompat.getColor(this$0.getContext().getResources(), oneManageStaffThemeColorModel.getEditTextColor(), null));
        }
    }

    @NotNull
    public final InputMethodManager getInputMethodManager() {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inputMethodManager");
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.9d);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(i, -2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        m9993k();
        m9991m();
    }

    public final void setInputMethodManager(@NotNull InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<set-?>");
        this.inputMethodManager = inputMethodManager;
    }
}