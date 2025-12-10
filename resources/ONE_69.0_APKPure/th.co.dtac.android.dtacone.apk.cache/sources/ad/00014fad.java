package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidOtherCardFormBinding;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.livedata.EventObserver;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;
import th.p047co.dtac.android.dtacone.util.date.DateTime;
import th.p047co.dtac.android.dtacone.util.validation.postpaid.CheckBoxExpiredPassportCardValidate;
import th.p047co.dtac.android.dtacone.util.validation.postpaid.PassportCardValidate;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_x_sim.MrtrPostpaidConsentXSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device.MrtrPostpaidBlacklistSharingConsentFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 C2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J!\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010?\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0014\u0010B\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBoxConfirm$ConfirmDialogListener;", "Ljava/lang/Void;", "<init>", "()V", "", OperatorName.SAVE, PDPageLabelRange.STYLE_ROMAN_LOWER, "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", "p", "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "", "message", "messageIDXDevice", "t", "(Ljava/lang/String;Ljava/lang/String;)V", "gotoCamera", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", Constant.ServiceAPIName.onStart, "", "requestCode", "result", "onOkButtonClick", "(ILjava/lang/Void;)V", "onCancelButtonClick", "(I)V", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "setFileUtil", "(Lth/co/dtac/android/dtacone/util/FileUtil;)V", "Lth/co/dtac/android/dtacone/databinding/FragmentMrtrPostpaidOtherCardFormBinding;", "i", "Lth/co/dtac/android/dtacone/databinding/FragmentMrtrPostpaidOtherCardFormBinding;", "_binding", "Lth/co/dtac/android/dtacone/view/activity/mrtr_postpaid_registration/MrtrPostpaidRegistrationActivity;", "o", "()Lth/co/dtac/android/dtacone/view/activity/mrtr_postpaid_registration/MrtrPostpaidRegistrationActivity;", "postpaidActivity", "Lth/co/dtac/android/dtacone/viewmodel/mrtr_postpaid_registration/MrtrPostpaidRegistrationViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/viewmodel/mrtr_postpaid_registration/MrtrPostpaidRegistrationViewModel;", "viewModel", "", "isWithContract", "()Z", "isWithDevice", OperatorName.ENDPATH, "()Lth/co/dtac/android/dtacone/databinding/FragmentMrtrPostpaidOtherCardFormBinding;", "binding", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMrtrPostpaidOtherCardFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPostpaidOtherCardFormFragment.kt\nth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidOtherCardFormFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment */
/* loaded from: classes9.dex */
public final class MrtrPostpaidOtherCardFormFragment extends BaseFragment implements CustomDialogBoxConfirm.ConfirmDialogListener<Void> {
    @Inject
    public FileUtil fileUtil;

    /* renamed from: i */
    public FragmentMrtrPostpaidOtherCardFormBinding f102474i;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidOtherCardFormFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidOtherCardFormFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MrtrPostpaidOtherCardFormFragment newInstance() {
            MrtrPostpaidOtherCardFormFragment mrtrPostpaidOtherCardFormFragment = new MrtrPostpaidOtherCardFormFragment();
            mrtrPostpaidOtherCardFormFragment.setArguments(new Bundle());
            return mrtrPostpaidOtherCardFormFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment$WhenMappings */
    /* loaded from: classes9.dex */
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

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment$a */
    /* loaded from: classes9.dex */
    public static final class C16268a implements Observer {
        public C16268a() {
            MrtrPostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            String warningMessage2;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                MrtrPostpaidOtherCardFormFragment mrtrPostpaidOtherCardFormFragment = MrtrPostpaidOtherCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    Check1IDXDeviceResponse check1IDXDeviceResponse = (Check1IDXDeviceResponse) resourceContentIfNotHandled.getData();
                    String str = "";
                    String str2 = (check1IDXDeviceResponse == null || (str2 = check1IDXDeviceResponse.getWarningMessage()) == null) ? "" : "";
                    Check1IDXDeviceResponse check1IDXDeviceResponse2 = (Check1IDXDeviceResponse) resourceContentIfNotHandled.getData();
                    if (check1IDXDeviceResponse2 != null && (warningMessage2 = check1IDXDeviceResponse2.getWarningMessage2()) != null) {
                        str = warningMessage2;
                    }
                    mrtrPostpaidOtherCardFormFragment.m5776t(str2, str);
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment$b */
    /* loaded from: classes9.dex */
    public static final class C16269b implements Observer {
        public C16269b() {
            MrtrPostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                MrtrPostpaidOtherCardFormFragment mrtrPostpaidOtherCardFormFragment = MrtrPostpaidOtherCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    mrtrPostpaidOtherCardFormFragment.getFileUtil().deleteInternalFile(BitmapUtil.IMAGE_SIGNATURE);
                    mrtrPostpaidOtherCardFormFragment.m5779q();
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment$c */
    /* loaded from: classes9.dex */
    public static final class C16270c implements Observer {
        public C16270c() {
            MrtrPostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                MrtrPostpaidOtherCardFormFragment mrtrPostpaidOtherCardFormFragment = MrtrPostpaidOtherCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    mrtrPostpaidOtherCardFormFragment.getFileUtil().deleteInternalFile(BitmapUtil.IMAGE_SIGNATURE);
                    mrtrPostpaidOtherCardFormFragment.m5778r();
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment$d */
    /* loaded from: classes9.dex */
    public static final class C16271d implements Observer {
        public C16271d() {
            MrtrPostpaidOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(StatusResource statusResource) {
            MrtrPostpaidOtherCardFormFragment.this.m5780p(statusResource);
        }
    }

    private final void gotoCamera() {
        getViewModel().setIdDocType(IdDocumentType.OTHER_CARD);
        m5781o().replaceFragment(MrtrPostpaidIdCardCameraFragment.Companion.newInstance(), null);
    }

    @JvmStatic
    @NotNull
    public static final MrtrPostpaidOtherCardFormFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: o */
    public final MrtrPostpaidRegistrationActivity m5781o() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity");
        return (MrtrPostpaidRegistrationActivity) activity;
    }

    /* renamed from: p */
    public final void m5780p(StatusResource statusResource) {
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

    /* renamed from: q */
    public final void m5779q() {
        m5781o().replaceFragment(MrtrPostpaidConsentXSimFragment.Companion.newInstance(), null);
    }

    /* renamed from: r */
    public final void m5778r() {
        m5781o().replaceFragment(MrtrPostpaidBlacklistSharingConsentFragment.Companion.newInstance$default(MrtrPostpaidBlacklistSharingConsentFragment.Companion, null, 1, null), null);
    }

    /* renamed from: s */
    public static final void m5777s(MrtrPostpaidOtherCardFormFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            new PassportCardValidate().validate(ViewTextExtKt.toStringFormat(this$0.m5782n().edtOtherCard));
            new CheckBoxExpiredPassportCardValidate().validate((CheckBox) this$0.m5782n().checkBoxOtherCardNotifyExpired);
            this$0.getViewModel().setIdDocType(IdDocumentType.OTHER_CARD);
            this$0.getViewModel().validateIdCardNumber(null, ViewTextExtKt.toStringFormat(this$0.m5782n().edtOtherCard), "15", false);
        } catch (ValidatedRuleException e) {
            this$0.showDialog(e.getResId());
        }
    }

    /* renamed from: t */
    public final void m5776t(String str, String str2) {
        CustomDialogBoxConfirm create = new CustomDialogBoxConfirm.Builder().setLayout(R.layout.dialog_mrtr_one_id_one_device).setMessage(str).setMessageIDXDevice(str2).setSubMessage(R.string.mrtr_postpaid_registration_error_msg).setTextOkButton(R.string.cancel_text).setTextCancelButton(R.string.confirm_text).setTimestamp(DateTime.INSTANCE.errorDateTimeFormat()).setUser(getViewModel().username()).setCancelable(false).create();
        create.setTargetFragment(this, 0);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            create.show(fragmentManager, (String) null);
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
    public final MrtrPostpaidRegistrationViewModel getViewModel() {
        return m5781o().getViewModel();
    }

    public final boolean isWithContract() {
        return getViewModel().isWithContract();
    }

    public final boolean isWithDevice() {
        return getViewModel().isWithDevice();
    }

    /* renamed from: n */
    public final FragmentMrtrPostpaidOtherCardFormBinding m5782n() {
        FragmentMrtrPostpaidOtherCardFormBinding fragmentMrtrPostpaidOtherCardFormBinding = this.f102474i;
        Intrinsics.checkNotNull(fragmentMrtrPostpaidOtherCardFormBinding);
        return fragmentMrtrPostpaidOtherCardFormBinding;
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm.ConfirmDialogListener
    public void onCancelButtonClick(int i) {
        if (getViewModel().isShowConsentXSim()) {
            getViewModel().callAPIGetConsentXSimTemplate();
        } else if (isWithContract() && isWithDevice()) {
            getViewModel().callAPICheckExternalBlacklistFlag();
        } else {
            gotoCamera();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f102474i = FragmentMrtrPostpaidOtherCardFormBinding.inflate(inflater, viewGroup, false);
        return m5782n().getRoot();
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm.ConfirmDialogListener
    public void onOkButtonClick(int i, @Nullable Void r2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        MrtrPostpaidRegistrationViewModel viewModel = getViewModel();
        viewModel.getNavigateNext().observe(getViewLifecycleOwner(), new EventObserver(new MrtrPostpaidOtherCardFormFragment$onStart$1$1(this)));
        viewModel.getShowWarningDialog().observe(getViewLifecycleOwner(), new C16268a());
        viewModel.getNavigateConsentXSimTemplate().observe(getViewLifecycleOwner(), new C16269b());
        viewModel.getNavigateConsentTemplate().observe(getViewLifecycleOwner(), new C16270c());
        viewModel.getLiveDataState().observe(getViewLifecycleOwner(), new C16271d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        DtacClearableEditText dtacClearableEditText = m5782n().edtOtherCard;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtOtherCard");
        EditTextextKt.toUpperCase(dtacClearableEditText, 50);
        m5782n().btnNext.setOnClickListener(new View.OnClickListener() { // from class: Gz0
            {
                MrtrPostpaidOtherCardFormFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MrtrPostpaidOtherCardFormFragment.m5777s(MrtrPostpaidOtherCardFormFragment.this, view2);
            }
        });
    }

    public final void setFileUtil(@NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(fileUtil, "<set-?>");
        this.fileUtil = fileUtil;
    }
}