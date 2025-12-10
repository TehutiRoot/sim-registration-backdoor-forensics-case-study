package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.ZVerifyPasswordKycDialogBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.face_recognition.VerifyPasswordKyc;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.card.LaserIdValidate;
import th.p047co.dtac.android.dtacone.widget.dialog.VerifyPasswordKycDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.listener.DialogFragmentListener;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacLaserIdEditText;
import th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001mB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0004J\r\u0010&\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u0004J#\u0010*\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010'¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\u0004R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u0007R\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0016\u0010g\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010cR\u0014\u0010l\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordKycDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", "<init>", "()V", "", "t", "I", "B", "z", "Lth/co/dtac/android/dtacone/widget/dialog/listener/DialogFragmentListener;", "Lth/co/dtac/android/dtacone/model/face_recognition/VerifyPasswordKyc;", OperatorName.SET_LINE_WIDTH, "()Lth/co/dtac/android/dtacone/widget/dialog/listener/DialogFragmentListener;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "setBackgroundResourceButtonOk", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener$DrawablePosition;", TypedValues.AttributesType.S_TARGET, "onClickDrawable", "(Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener$DrawablePosition;)V", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "setTargetFragment", "(Landroidx/fragment/app/Fragment;I)V", "onClickConfirm", "onClickCancel", "", "errorMessage", "errorCode", "updateErrorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "onDestroy", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "edtPassword", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEdtPassword", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "setEdtPassword", "(Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacLaserIdEditText;", "edtLaserId", "Lth/co/dtac/android/dtacone/widget/view/DtacLaserIdEditText;", "getEdtLaserId", "()Lth/co/dtac/android/dtacone/widget/view/DtacLaserIdEditText;", "setEdtLaserId", "(Lth/co/dtac/android/dtacone/widget/view/DtacLaserIdEditText;)V", "Landroid/widget/TextView;", "tvErrorCode", "Landroid/widget/TextView;", "getTvErrorCode", "()Landroid/widget/TextView;", "setTvErrorCode", "(Landroid/widget/TextView;)V", "tvErrorMessage", "getTvErrorMessage", "setTvErrorMessage", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvKycMessage", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "getTvKycMessage", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "setTvKycMessage", "(Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "btnOk", "Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "getBtnOk", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;", "setBtnOk", "(Lth/co/dtac/android/dtacone/widget/view/DtacFontButton;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "getSubscription", "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/databinding/ZVerifyPasswordKycDialogBinding;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/databinding/ZVerifyPasswordKycDialogBinding;", "_binding", "u", "()Lth/co/dtac/android/dtacone/databinding/ZVerifyPasswordKycDialogBinding;", "binding", "", "A", "()Z", "isShowLaserId", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Ljava/lang/String;", "titleMessage", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "kycEnable", "x", "()I", UriUtil.LOCAL_RESOURCE_SCHEME, "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVerifyPasswordKycDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyPasswordKycDialog.kt\nth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordKycDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.VerifyPasswordKycDialog */
/* loaded from: classes9.dex */
public final class VerifyPasswordKycDialog extends BaseDialogFragment implements DrawableClickListener {
    @NotNull
    public static final String ARG_LASER_ID = "ARG_LASER_ID";
    @NotNull
    public static final String KYC_ENABLE = "TITLE_MESAGE";
    @NotNull
    public static final String RES_BTN_OK = "BACKGROUND_BTN_OK";
    @NotNull
    public static final String TITLE_MESAGE = "TITLE_MESAGE";

    /* renamed from: a */
    public int f107362a;

    /* renamed from: b */
    public final Lazy f107363b = LazyKt__LazyJVMKt.lazy(VerifyPasswordKycDialog$subscription$2.INSTANCE);
    public DtacFontButton btnOk;

    /* renamed from: c */
    public ZVerifyPasswordKycDialogBinding f107364c;
    public DtacLaserIdEditText edtLaserId;
    public DtacClearableEditText edtPassword;
    public TextView tvErrorCode;
    public TextView tvErrorMessage;
    public DtacFontTextView tvKycMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0004J$\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000bJ,\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordKycDialog$Companion;", "", "()V", VerifyPasswordKycDialog.ARG_LASER_ID, "", "KYC_ENABLE", "RES_BTN_OK", "TITLE_MESAGE", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/VerifyPasswordKycDialog;", "isShowLaserId", "", "titleMessage", "kycEnable", UriUtil.LOCAL_RESOURCE_SCHEME, "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.VerifyPasswordKycDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ VerifyPasswordKycDialog newInstance$default(Companion companion, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.newInstance(z, str);
        }

        @NotNull
        public final VerifyPasswordKycDialog newInstance(boolean z, @NotNull String titleMessage) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            VerifyPasswordKycDialog verifyPasswordKycDialog = new VerifyPasswordKycDialog();
            bundle.putBoolean(VerifyPasswordKycDialog.ARG_LASER_ID, z);
            bundle.putString("TITLE_MESAGE", titleMessage);
            verifyPasswordKycDialog.setArguments(bundle);
            return verifyPasswordKycDialog;
        }

        public Companion() {
        }

        public static /* synthetic */ VerifyPasswordKycDialog newInstance$default(Companion companion, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return companion.newInstance(z, str, z2);
        }

        public static /* synthetic */ VerifyPasswordKycDialog newInstance$default(Companion companion, boolean z, String str, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = true;
            }
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return companion.newInstance(z, str, z2, i);
        }

        @NotNull
        public final VerifyPasswordKycDialog newInstance(boolean z, @NotNull String titleMessage, boolean z2) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            VerifyPasswordKycDialog verifyPasswordKycDialog = new VerifyPasswordKycDialog();
            bundle.putBoolean(VerifyPasswordKycDialog.ARG_LASER_ID, z);
            bundle.putString("TITLE_MESAGE", titleMessage);
            bundle.putBoolean("TITLE_MESAGE", z2);
            verifyPasswordKycDialog.setArguments(bundle);
            return verifyPasswordKycDialog;
        }

        @NotNull
        public final VerifyPasswordKycDialog newInstance(boolean z, @NotNull String titleMessage, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(titleMessage, "titleMessage");
            Bundle bundle = new Bundle();
            VerifyPasswordKycDialog verifyPasswordKycDialog = new VerifyPasswordKycDialog();
            bundle.putBoolean(VerifyPasswordKycDialog.ARG_LASER_ID, z);
            bundle.putString("TITLE_MESAGE", titleMessage);
            bundle.putBoolean("TITLE_MESAGE", z2);
            bundle.putInt(VerifyPasswordKycDialog.RES_BTN_OK, i);
            verifyPasswordKycDialog.setArguments(bundle);
            return verifyPasswordKycDialog;
        }
    }

    /* renamed from: C */
    public static final String m1513C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final boolean m1512D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E */
    public static final String m1511E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m1510F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m1509G(VerifyPasswordKycDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickConfirm();
    }

    /* renamed from: H */
    public static final void m1508H(VerifyPasswordKycDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickCancel();
    }

    private final CompositeDisposable getSubscription() {
        return (CompositeDisposable) this.f107363b.getValue();
    }

    /* renamed from: t */
    private final void m1500t() {
        DtacClearableEditText dtacClearableEditText = m1499u().edtPassword;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.edtPassword");
        setEdtPassword(dtacClearableEditText);
        DtacLaserIdEditText dtacLaserIdEditText = m1499u().edtLaserId;
        Intrinsics.checkNotNullExpressionValue(dtacLaserIdEditText, "binding.edtLaserId");
        setEdtLaserId(dtacLaserIdEditText);
        DtacFontTextView dtacFontTextView = m1499u().tvErrorCode;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvErrorCode");
        setTvErrorCode(dtacFontTextView);
        DtacFontTextView dtacFontTextView2 = m1499u().tvErrorMessage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.tvErrorMessage");
        setTvErrorMessage(dtacFontTextView2);
        DtacFontTextView dtacFontTextView3 = m1499u().tvKycMessage;
        Intrinsics.checkNotNullExpressionValue(dtacFontTextView3, "binding.tvKycMessage");
        setTvKycMessage(dtacFontTextView3);
        DtacFontButton dtacFontButton = m1499u().incButtonOkCancel.btnOk;
        Intrinsics.checkNotNullExpressionValue(dtacFontButton, "binding.incButtonOkCancel.btnOk");
        setBtnOk(dtacFontButton);
    }

    public static /* synthetic */ void updateErrorMessage$default(VerifyPasswordKycDialog verifyPasswordKycDialog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        verifyPasswordKycDialog.updateErrorMessage(str, str2);
    }

    /* renamed from: A */
    public final boolean m1515A() {
        return requireArguments().getBoolean(ARG_LASER_ID);
    }

    /* renamed from: B */
    public final void m1514B() {
        InitialValueObservable<CharSequence> textChanges = RxTextView.textChanges(getEdtPassword());
        Intrinsics.checkNotNullExpressionValue(textChanges, "textChanges(edtPassword)");
        CompositeDisposable subscription = getSubscription();
        Observable<CharSequence> skipInitialValue = textChanges.skipInitialValue();
        final VerifyPasswordKycDialog$observablePasswordTextChange$1 verifyPasswordKycDialog$observablePasswordTextChange$1 = VerifyPasswordKycDialog$observablePasswordTextChange$1.INSTANCE;
        Observable<R> map = skipInitialValue.map(new Function() { // from class: k22
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m1513C;
                m1513C = VerifyPasswordKycDialog.m1513C(verifyPasswordKycDialog$observablePasswordTextChange$1, obj);
                return m1513C;
            }
        });
        final VerifyPasswordKycDialog$observablePasswordTextChange$2 verifyPasswordKycDialog$observablePasswordTextChange$2 = VerifyPasswordKycDialog$observablePasswordTextChange$2.INSTANCE;
        Observable filter = map.filter(new Predicate() { // from class: l22
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m1512D;
                m1512D = VerifyPasswordKycDialog.m1512D(verifyPasswordKycDialog$observablePasswordTextChange$2, obj);
                return m1512D;
            }
        });
        final VerifyPasswordKycDialog$observablePasswordTextChange$3 verifyPasswordKycDialog$observablePasswordTextChange$3 = new VerifyPasswordKycDialog$observablePasswordTextChange$3(this);
        Observable onErrorReturn = filter.onErrorReturn(new Function() { // from class: m22
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m1511E;
                m1511E = VerifyPasswordKycDialog.m1511E(verifyPasswordKycDialog$observablePasswordTextChange$3, obj);
                return m1511E;
            }
        });
        final VerifyPasswordKycDialog$observablePasswordTextChange$4 verifyPasswordKycDialog$observablePasswordTextChange$4 = new VerifyPasswordKycDialog$observablePasswordTextChange$4(this);
        subscription.add(onErrorReturn.subscribe(new Consumer() { // from class: n22
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VerifyPasswordKycDialog.m1510F(verifyPasswordKycDialog$observablePasswordTextChange$4, obj);
            }
        }));
    }

    /* renamed from: I */
    public final void m1507I() {
        getEdtLaserId().registerDrawableAction(this);
    }

    @NotNull
    public final DtacFontButton getBtnOk() {
        DtacFontButton dtacFontButton = this.btnOk;
        if (dtacFontButton != null) {
            return dtacFontButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnOk");
        return null;
    }

    @NotNull
    public final DtacLaserIdEditText getEdtLaserId() {
        DtacLaserIdEditText dtacLaserIdEditText = this.edtLaserId;
        if (dtacLaserIdEditText != null) {
            return dtacLaserIdEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edtLaserId");
        return null;
    }

    @NotNull
    public final DtacClearableEditText getEdtPassword() {
        DtacClearableEditText dtacClearableEditText = this.edtPassword;
        if (dtacClearableEditText != null) {
            return dtacClearableEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edtPassword");
        return null;
    }

    @NotNull
    public final TextView getTvErrorCode() {
        TextView textView = this.tvErrorCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvErrorCode");
        return null;
    }

    @NotNull
    public final TextView getTvErrorMessage() {
        TextView textView = this.tvErrorMessage;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvErrorMessage");
        return null;
    }

    @NotNull
    public final DtacFontTextView getTvKycMessage() {
        DtacFontTextView dtacFontTextView = this.tvKycMessage;
        if (dtacFontTextView != null) {
            return dtacFontTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvKycMessage");
        return null;
    }

    public final void onClickCancel() {
        m1497w().onClickCancelConfirmDialogFragment();
    }

    public final void onClickConfirm() {
        String stringFormat = ViewTextExtKt.toStringFormat(getEdtPassword());
        String stringFormat2 = ViewTextExtKt.toStringFormat(getEdtLaserId());
        try {
            if (m1515A() && m1498v()) {
                new LaserIdValidate().validate(stringFormat2);
            }
            m1497w().onClickConfirmDialogFragment(this.f107362a, new VerifyPasswordKyc(stringFormat, stringFormat2));
        } catch (ValidatedRuleException e) {
            updateErrorMessage$default(this, getString(e.getResId()), null, 2, null);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener
    public void onClickDrawable(@NotNull DrawableClickListener.DrawablePosition target) {
        Intrinsics.checkNotNullParameter(target, "target");
        TutorialLaserIdDialog tutorialLaserIdDialog = new TutorialLaserIdDialog();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            tutorialLaserIdDialog.show(fragmentManager, (String) null);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f107364c = ZVerifyPasswordKycDialogBinding.inflate(inflater, viewGroup, false);
        m1500t();
        getBtnOk().setOnClickListener(new View.OnClickListener() { // from class: i22
            {
                VerifyPasswordKycDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPasswordKycDialog.m1509G(VerifyPasswordKycDialog.this, view);
            }
        });
        m1499u().incButtonOkCancel.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: j22
            {
                VerifyPasswordKycDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPasswordKycDialog.m1508H(VerifyPasswordKycDialog.this, view);
            }
        });
        if (m1515A() && m1498v()) {
            z = true;
        } else {
            z = false;
        }
        VisibleExtensionKt.toVisibleOrGone(getEdtLaserId(), z);
        if (!m1498v()) {
            getEdtPassword().setText(getString(R.string.kyc_password_tmp));
            getEdtPassword().setEnabled(false);
            getEdtPassword().setTextAndCompoundColor(R.color.warmGreySeven);
            getTvKycMessage().setText(R.string.manual_kyc_no_jc_message);
            getBtnOk().setText(R.string.confirm_text);
        } else {
            m1514B();
            m1507I();
            if (!StringUtil.isEmpty(m1495y())) {
                getTvKycMessage().setText(m1495y());
            }
        }
        m1494z();
        setBackgroundResourceButtonOk();
        return m1499u().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getSubscription().clear();
        super.onDestroy();
    }

    public final void setBackgroundResourceButtonOk() {
        if (m1496x() > 0) {
            getBtnOk().setBackgroundResource(m1496x());
        }
    }

    public final void setBtnOk(@NotNull DtacFontButton dtacFontButton) {
        Intrinsics.checkNotNullParameter(dtacFontButton, "<set-?>");
        this.btnOk = dtacFontButton;
    }

    public final void setEdtLaserId(@NotNull DtacLaserIdEditText dtacLaserIdEditText) {
        Intrinsics.checkNotNullParameter(dtacLaserIdEditText, "<set-?>");
        this.edtLaserId = dtacLaserIdEditText;
    }

    public final void setEdtPassword(@NotNull DtacClearableEditText dtacClearableEditText) {
        Intrinsics.checkNotNullParameter(dtacClearableEditText, "<set-?>");
        this.edtPassword = dtacClearableEditText;
    }

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f107362a = i;
    }

    public final void setTvErrorCode(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvErrorCode = textView;
    }

    public final void setTvErrorMessage(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvErrorMessage = textView;
    }

    public final void setTvKycMessage(@NotNull DtacFontTextView dtacFontTextView) {
        Intrinsics.checkNotNullParameter(dtacFontTextView, "<set-?>");
        this.tvKycMessage = dtacFontTextView;
    }

    /* renamed from: u */
    public final ZVerifyPasswordKycDialogBinding m1499u() {
        ZVerifyPasswordKycDialogBinding zVerifyPasswordKycDialogBinding = this.f107364c;
        Intrinsics.checkNotNull(zVerifyPasswordKycDialogBinding);
        return zVerifyPasswordKycDialogBinding;
    }

    public final void updateErrorMessage(@Nullable String str, @Nullable String str2) {
        VisibleExtensionKt.toVisibleOrGone(getTvErrorMessage(), str);
        VisibleExtensionKt.toVisibleOrGone(getTvErrorCode(), str2);
        ViewTextExtKt.toStringEmpty(getEdtPassword());
        getTvErrorMessage().setText(str);
        TextView tvErrorCode = getTvErrorCode();
        String displayDateTimeOnErrorDialog = DateUtil.displayDateTimeOnErrorDialog();
        tvErrorCode.setText("วันที่ " + displayDateTimeOnErrorDialog + " (code: " + str2 + ")");
    }

    /* renamed from: v */
    public final boolean m1498v() {
        return requireArguments().getBoolean("TITLE_MESAGE", false);
    }

    /* renamed from: w */
    public final DialogFragmentListener m1497w() {
        Fragment targetFragment = getTargetFragment();
        Intrinsics.checkNotNull(targetFragment, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.dialog.listener.DialogFragmentListener<th.co.dtac.android.dtacone.model.face_recognition.VerifyPasswordKyc>");
        return (DialogFragmentListener) targetFragment;
    }

    /* renamed from: x */
    public final int m1496x() {
        return requireArguments().getInt(RES_BTN_OK, 0);
    }

    /* renamed from: y */
    public final String m1495y() {
        return requireArguments().getString("TITLE_MESAGE");
    }

    /* renamed from: z */
    public final void m1494z() {
        ViewVisibleExtKt.toGone(getTvErrorMessage());
        ViewVisibleExtKt.toGone(getTvErrorCode());
    }
}