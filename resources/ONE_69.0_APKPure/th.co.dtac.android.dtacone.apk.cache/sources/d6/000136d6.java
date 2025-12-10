package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonCheckBoxExpired;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonOtherCardLengthRule;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.databinding.FragmentOnePostpaidOtherCardFormBinding;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidThemeColorModel;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.livedata.EventObserver;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;
import th.p047co.dtac.android.dtacone.util.date.DateTime;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 H2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J-\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bG\u0010F¨\u0006I"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBoxConfirm$ConfirmDialogListener;", "Ljava/lang/Void;", "<init>", "()V", "", OperatorName.SET_LINE_WIDTH, "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", PDPageLabelRange.STYLE_ROMAN_LOWER, "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", OperatorName.SAVE, "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "", "message", "messageIDXDevice", "u", "(Ljava/lang/String;Ljava/lang/String;)V", "gotoCamera", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setTheme", Constant.ServiceAPIName.onStart, "getScreenName", "()Ljava/lang/String;", "", "requestCode", "result", "onOkButtonClick", "(ILjava/lang/Void;)V", "onCancelButtonClick", "(I)V", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "setFileUtil", "(Lth/co/dtac/android/dtacone/util/FileUtil;)V", "Lth/co/dtac/android/dtacone/databinding/FragmentOnePostpaidOtherCardFormBinding;", "i", "Lth/co/dtac/android/dtacone/databinding/FragmentOnePostpaidOtherCardFormBinding;", "_binding", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/activity/OnePostpaidRegistrationActivity;", "p", "()Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/activity/OnePostpaidRegistrationActivity;", "postpaidActivity", "o", "()Lth/co/dtac/android/dtacone/databinding/FragmentOnePostpaidOtherCardFormBinding;", "binding", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidRegistrationViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidRegistrationViewModel;", "viewModel", "", "isWithContract", "()Z", "isWithDevice", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnePostpaidOtherCardFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidOtherCardFormFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidOtherCardFormFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n1#2:284\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment */
/* loaded from: classes10.dex */
public final class OnePostpaidOtherCardFormFragment extends BaseFragment implements CustomDialogBoxConfirm.ConfirmDialogListener<Void> {
    @Inject
    public FileUtil fileUtil;

    /* renamed from: i */
    public FragmentOnePostpaidOtherCardFormBinding f93538i;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidOtherCardFormFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidOtherCardFormFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OnePostpaidOtherCardFormFragment newInstance() {
            return new OnePostpaidOtherCardFormFragment();
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$a */
    /* loaded from: classes10.dex */
    public static final class C14875a implements Observer {
        public C14875a() {
            OnePostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            String warningMessage2;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment = OnePostpaidOtherCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    Check1IDXDeviceResponse check1IDXDeviceResponse = (Check1IDXDeviceResponse) resourceContentIfNotHandled.getData();
                    String str = "";
                    String str2 = (check1IDXDeviceResponse == null || (str2 = check1IDXDeviceResponse.getWarningMessage()) == null) ? "" : "";
                    Check1IDXDeviceResponse check1IDXDeviceResponse2 = (Check1IDXDeviceResponse) resourceContentIfNotHandled.getData();
                    if (check1IDXDeviceResponse2 != null && (warningMessage2 = check1IDXDeviceResponse2.getWarningMessage2()) != null) {
                        str = warningMessage2;
                    }
                    onePostpaidOtherCardFormFragment.m12531u(str2, str);
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$b */
    /* loaded from: classes10.dex */
    public static final class C14876b implements Observer {
        public C14876b() {
            OnePostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment = OnePostpaidOtherCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    onePostpaidOtherCardFormFragment.getFileUtil().deleteInternalFile(BitmapUtil.IMAGE_SIGNATURE);
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$c */
    /* loaded from: classes10.dex */
    public static final class C14877c implements Observer {
        public C14877c() {
            OnePostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment = OnePostpaidOtherCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    onePostpaidOtherCardFormFragment.getFileUtil().deleteInternalFile(BitmapUtil.IMAGE_SIGNATURE);
                    onePostpaidOtherCardFormFragment.m12534r();
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$d */
    /* loaded from: classes10.dex */
    public static final class C14878d implements Observer {
        public C14878d() {
            OnePostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(StatusResource statusResource) {
            OnePostpaidOtherCardFormFragment.this.m12535q(statusResource);
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$e */
    /* loaded from: classes10.dex */
    public static final class C14879e implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f93543a;

        public C14879e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f93543a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f93543a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f93543a.invoke(obj);
        }
    }

    private final void gotoCamera() {
        getViewModel().setIdDocType(IdDocumentType.OTHER_CARD);
        m12536p().replaceFragment(OnePostpaidIdCardCameraFragment.Companion.newInstance(), null);
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m12539m(OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment, TextView textView, int i, KeyEvent keyEvent) {
        return m12533s(onePostpaidOtherCardFormFragment, textView, i, keyEvent);
    }

    /* renamed from: n */
    public static /* synthetic */ void m12538n(OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment, View view) {
        m12532t(onePostpaidOtherCardFormFragment, view);
    }

    @JvmStatic
    @NotNull
    public static final OnePostpaidOtherCardFormFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: p */
    public final OnePostpaidRegistrationActivity m12536p() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity");
        return (OnePostpaidRegistrationActivity) activity;
    }

    /* renamed from: q */
    public final void m12535q(StatusResource statusResource) {
        int i;
        if (statusResource == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[statusResource.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                dismissSecondaryLoading();
                return;
            }
            return;
        }
        showSecondaryLoading();
    }

    /* renamed from: r */
    public final void m12534r() {
        getViewModel().clearSignatureFile();
        m12536p().replaceFragment(OnePostpaidCheckBlacklistFragment.Companion.newInstance$default(OnePostpaidCheckBlacklistFragment.Companion, null, 1, null), null);
    }

    /* renamed from: s */
    public static final boolean m12533s(OnePostpaidOtherCardFormFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 6) {
            this$0.m12529w();
            return false;
        }
        return false;
    }

    /* renamed from: t */
    public static final void m12532t(OnePostpaidOtherCardFormFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m12529w();
    }

    /* renamed from: u */
    public final void m12531u(String str, String str2) {
        OneCustomDialogBoxConfirm create = new OneCustomDialogBoxConfirm.Builder().setLayout(R.layout.dialog_one_postpaid_one_id_one_device).setMessage(str).setMessageIDXDevice(str2).setTextOkButton(R.string.one_postpaid_cancel_buy_device).setTextCancelButton(R.string.one_postpaid_confirm_buy_device).setTimestamp(DateTime.INSTANCE.errorDateTimeFormat()).setUser(getViewModel().userName()).setTransparent(Boolean.TRUE).setCancelable(false).create();
        create.setTargetFragment(this, 0);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            create.show(fragmentManager, (String) null);
        }
    }

    /* renamed from: v */
    public final void m12530v(ErrorCollection errorCollection) {
        String string;
        String errorDateTimeFormat;
        String str;
        OneDialogBoxConfirm.Companion companion = OneDialogBoxConfirm.Companion;
        if (errorCollection == null || (string = errorCollection.getDescription()) == null) {
            string = getString(R.string.one_max_allow_waning_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.one_max_allow_waning_message)");
        }
        String str2 = string;
        int i = R.string.one_postpaid_max_allow_error_sub_message;
        if (errorCollection == null || (errorDateTimeFormat = errorCollection.getResponseDateTime()) == null) {
            errorDateTimeFormat = DateTime.INSTANCE.errorDateTimeFormat();
        }
        String username = getViewModel().username();
        String company = getViewModel().getCompany();
        if (errorCollection != null) {
            str = errorCollection.getStatusCode();
        } else {
            str = null;
        }
        OneDialogBoxConfirm newInstance$default = OneDialogBoxConfirm.Companion.newInstance$default(companion, null, str2, getString(i, errorDateTimeFormat, username, company, str), getString(R.string.not_want), getString(R.string.want), true, Integer.valueOf(m12536p().getViewModel().getThemeColorModel().getButtonBackground()), Integer.valueOf(m12536p().getViewModel().getThemeColorModel().getButtonBackgroundRounded()), Integer.valueOf(m12536p().getViewModel().getThemeColorModel().getFontColorDialog()), 1, null);
        newInstance$default.setOnClickListener(new OneDialogBoxConfirm.OnClickButtonListener() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment$showDialogMaxAllow$dialog$1$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm.OnClickButtonListener
            public void onClickLeftButton() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm.OnClickButtonListener
            public void onClickRightButton() {
                OnePostpaidOtherCardFormFragment.this.getViewModel().verifyAndGenAutoApproveCode();
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.beginTransaction();
        newInstance$default.show(childFragmentManager, (String) null);
    }

    /* renamed from: w */
    private final void m12529w() {
        try {
            new OneCommonOtherCardLengthRule().validate(ViewTextExtKt.toStringFormat(m12537o().postpaidEdtOtherCard));
            new OneCommonCheckBoxExpired().validate((CheckBox) m12537o().checkBoxOtherCardNotifyExpired);
            getViewModel().setIdDocType(IdDocumentType.OTHER_CARD);
            getViewModel().validateInputID(null, ViewTextExtKt.toStringFormat(m12537o().postpaidEdtOtherCard), "15", false);
        } catch (ValidatedRuleException e) {
            showDialogOne(e.getResId());
        }
    }

    @NotNull
    public final FileUtil getFileUtil() {
        FileUtil fileUtil = this.fileUtil;
        if (fileUtil != null) {
            return fileUtil;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileUtil");
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        return TrackerConstant.MRTR_POSTPAID_INPUT_OTHER_CARD;
    }

    @NotNull
    public final OnePostpaidRegistrationViewModel getViewModel() {
        return m12536p().getViewModel();
    }

    public final boolean isWithContract() {
        return getViewModel().isWithContract();
    }

    public final boolean isWithDevice() {
        return getViewModel().isWithDevice();
    }

    /* renamed from: o */
    public final FragmentOnePostpaidOtherCardFormBinding m12537o() {
        FragmentOnePostpaidOtherCardFormBinding fragmentOnePostpaidOtherCardFormBinding = this.f93538i;
        Intrinsics.checkNotNull(fragmentOnePostpaidOtherCardFormBinding);
        return fragmentOnePostpaidOtherCardFormBinding;
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm.ConfirmDialogListener
    public void onCancelButtonClick(int i) {
        if (isWithContract() && isWithDevice()) {
            getViewModel().callAPICheckExternalBlacklistFlag();
        } else {
            gotoCamera();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f93538i = FragmentOnePostpaidOtherCardFormBinding.inflate(inflater, viewGroup, false);
        return m12537o().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OnePostpaidRegistrationViewModel viewModel = getViewModel();
        viewModel.getNavigateNext().observe(getViewLifecycleOwner(), new EventObserver(new OnePostpaidOtherCardFormFragment$onStart$1$1(this)));
        viewModel.getShowDialogMaxAllow().observe(getViewLifecycleOwner(), new C14879e(new OnePostpaidOtherCardFormFragment$onStart$1$2(this)));
        viewModel.getShowWarningDialog().observe(getViewLifecycleOwner(), new C14875a());
        viewModel.getNavigateConsentXSimTemplate().observe(getViewLifecycleOwner(), new C14876b());
        viewModel.getNavigateConsentTemplate().observe(getViewLifecycleOwner(), new C14877c());
        viewModel.getLiveDataState().observe(getViewLifecycleOwner(), new C14878d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTheme();
        OneCustomClearableEditText oneCustomClearableEditText = m12537o().postpaidEdtOtherCard;
        Intrinsics.checkNotNullExpressionValue(oneCustomClearableEditText, "binding.postpaidEdtOtherCard");
        EditTextextKt.toUpperCase(oneCustomClearableEditText, 20);
        m12537o().postpaidEdtOtherCard.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: V21
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return OnePostpaidOtherCardFormFragment.m12539m(OnePostpaidOtherCardFormFragment.this, textView, i, keyEvent);
            }
        });
        m12537o().btnNext.setOnClickListener(new View.OnClickListener() { // from class: W21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OnePostpaidOtherCardFormFragment.m12538n(OnePostpaidOtherCardFormFragment.this, view2);
            }
        });
    }

    public final void setFileUtil(@NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(fileUtil, "<set-?>");
        this.fileUtil = fileUtil;
    }

    public final void setTheme() {
        OnePostpaidThemeColorModel themeColorModel = getViewModel().getThemeColorModel();
        m12537o().postpaidEdtOtherCard.setTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getEditTextColor(), null));
        m12537o().postpaidEdtOtherCard.setFocusColor(themeColorModel.getEditTextColor());
        m12537o().postpaidEdtOtherCard.setBackgroundResource(themeColorModel.getEditTextBackground());
        m12537o().postpaidEdtOtherCard.setHighlightColor(ResourcesCompat.getColor(getResources(), themeColorModel.getEditTextHighlightColor(), null));
        m12537o().postpaidEdtOtherCard.setTextAndCompoundColor(themeColorModel.getEditTextColor());
        m12537o().postpaidEdtOtherCard.setLinkTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getEditTextColor(), null));
        m12537o().checkBoxOtherCardNotifyExpired.setButtonDrawable(themeColorModel.getCheckBox());
        if (Build.VERSION.SDK_INT >= 29) {
            m12537o().postpaidEdtOtherCard.setTextCursorDrawable(themeColorModel.getEditTextCursor());
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
                declaredField.setAccessible(true);
                declaredField.set(m12537o().postpaidEdtOtherCard, Integer.valueOf(themeColorModel.getEditTextCursor()));
            } catch (Exception unused) {
            }
        }
        m12537o().btnNext.setBackgroundResource(themeColorModel.getButtonBackground());
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm.ConfirmDialogListener
    public void onOkButtonClick(int i, @Nullable Void r3) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}