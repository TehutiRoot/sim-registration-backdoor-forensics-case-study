package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.BuildConfig;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Version;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.util.KeyboardUtil;
import th.p047co.dtac.android.dtacone.util.SingleTime;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.util.date.DateTime;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneBuyDolPriceListSimRModel;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.activity.OneSTVProSermOnlineActivity;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.model.ThemeColorModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0002rsB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0007J-\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0007J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b0\u00101J1\u00107\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+H\u0016¢\u0006\u0004\b7\u00108J1\u0010:\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020+2\u0006\u00109\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0016¢\u0006\u0004\b:\u00108J\u0019\u0010<\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\u0007R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010M\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010HR\u0016\u0010P\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010HR\u0016\u0010S\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u0016\u0010U\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010HR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010HR\u0016\u0010[\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010HR\u0016\u0010]\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010HR\u0016\u0010^\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0016\u0010a\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010`R\u0016\u0010d\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010mR\u0014\u0010q\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010p¨\u0006t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText$OnePinTextWatcher;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBoxConfirm$ConfirmDialogListener;", "Ljava/lang/Void;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog$OneConsentDialogCallback;", "<init>", "()V", "", "setThemeView", "Landroid/view/View;", Promotion.ACTION_VIEW, "bindingView", "(Landroid/view/View;)V", "u", "initView", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "featureCode", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneBuyDolPriceListSimRModel;", "buyDolPriceListSimR", "o", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneBuyDolPriceListSimRModel;)V", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "x", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", OperatorName.SET_LINE_WIDTH, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "getScreenName", "()Ljava/lang/String;", "", "requestCode", "result", "onOkButtonClick", "(ILjava/lang/Void;)V", "onCancelButtonClick", "(I)V", "", OperatorName.CLOSE_AND_STROKE, "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "onAcceptOneConsent", "(ILjava/lang/Object;)V", "onDestroy", "Lth/co/dtac/android/dtacone/widget/loading/DtacSwipeRefresh;", "i", "Lth/co/dtac/android/dtacone/widget/loading/DtacSwipeRefresh;", "confirmSwipeRefresh", "Landroid/widget/TextView;", OperatorName.SET_LINE_JOINSTYLE, "Landroid/widget/TextView;", "tvPhoneNumber", OperatorName.NON_STROKING_CMYK, "tvPromotionName", OperatorName.LINE_TO, "tvDescription", OperatorName.MOVE_TO, "Landroid/view/View;", "line", OperatorName.ENDPATH, "tvLastUpdate", "tvBalance", "p", "tvSimRCount", "Landroid/widget/ImageButton;", OperatorName.SAVE, "Landroid/widget/ImageButton;", "btnBuyDolShortCut", "tvSubscriberNumber", "tvPricePackage", "t", "tvPriceUnit", "labelTitleCheckData", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "icPhone", "Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText;", "edtConfirmPin", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneConsentDialog;", "oneConsentDialog", "Lth/co/dtac/android/dtacone/util/KeyboardUtil;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Lth/co/dtac/android/dtacone/util/KeyboardUtil;", "keyboardUtil", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/activity/OneSTVProSermOnlineActivity;", "()Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/activity/OneSTVProSermOnlineActivity;", "activityStv", "Lth/co/dtac/android/dtacone/app_one/viewmodel/stv/OneStvProsermOnlineViewModel;", "()Lth/co/dtac/android/dtacone/app_one/viewmodel/stv/OneStvProsermOnlineViewModel;", "viewModel", "Companion", "MrtrConsentId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneProsermOnlineConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneProsermOnlineConfirmFragment.kt\nth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,468:1\n3792#2:469\n4307#2,2:470\n1#3:472\n*S KotlinDebug\n*F\n+ 1 OneProsermOnlineConfirmFragment.kt\nth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment\n*L\n205#1:469\n205#1:470,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment */
/* loaded from: classes10.dex */
public final class OneProsermOnlineConfirmFragment extends BaseFragment implements OnePinEditText.OnePinTextWatcher, OneCustomDialogBoxConfirm.ConfirmDialogListener<Void>, OneConsentDialog.OneConsentDialogCallback {

    /* renamed from: i */
    public DtacSwipeRefresh f97553i;

    /* renamed from: j */
    public TextView f97554j;

    /* renamed from: k */
    public TextView f97555k;

    /* renamed from: l */
    public TextView f97556l;

    /* renamed from: m */
    public View f97557m;

    /* renamed from: n */
    public TextView f97558n;

    /* renamed from: o */
    public TextView f97559o;

    /* renamed from: p */
    public TextView f97560p;

    /* renamed from: q */
    public ImageButton f97561q;

    /* renamed from: r */
    public TextView f97562r;

    /* renamed from: s */
    public TextView f97563s;

    /* renamed from: t */
    public TextView f97564t;

    /* renamed from: u */
    public TextView f97565u;

    /* renamed from: v */
    public ImageView f97566v;

    /* renamed from: w */
    public OnePinEditText f97567w;

    /* renamed from: x */
    public OneConsentDialog f97568x;

    /* renamed from: y */
    public KeyboardUtil f97569y;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneProsermOnlineConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneProsermOnlineConfirmFragment.kt\nth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,468:1\n1#2:469\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneProsermOnlineConfirmFragment newInstance() {
            OneProsermOnlineConfirmFragment oneProsermOnlineConfirmFragment = new OneProsermOnlineConfirmFragment();
            oneProsermOnlineConfirmFragment.setArguments(new Bundle());
            return oneProsermOnlineConfirmFragment;
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineConfirmFragment$MrtrConsentId;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getConsentId", "()Ljava/lang/Integer;", "setConsentId", "(Ljava/lang/Integer;)V", "getConsentId$annotations", "consentId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment$MrtrConsentId */
    /* loaded from: classes10.dex */
    public static final class MrtrConsentId {

        /* renamed from: a */
        public static Integer f97570a;
        @NotNull
        public static final MrtrConsentId INSTANCE = new MrtrConsentId();
        public static final int $stable = 8;

        @Nullable
        public static final Integer getConsentId() {
            return f97570a;
        }

        @JvmStatic
        public static /* synthetic */ void getConsentId$annotations() {
        }

        public static final void setConsentId(@Nullable Integer num) {
            f97570a = num;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15167a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f97571a;

        public C15167a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f97571a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f97571a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97571a.invoke(obj);
        }
    }

    private final void bindingView(View view) {
        View findViewById = view.findViewById(R.id.confirmSwipeRefresh);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.confirmSwipeRefresh)");
        this.f97553i = (DtacSwipeRefresh) findViewById;
        View findViewById2 = view.findViewById(R.id.tvPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.tvPhoneNumber)");
        this.f97554j = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tvPromotionName);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.tvPromotionName)");
        this.f97555k = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tvDescription);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.tvDescription)");
        this.f97556l = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.line);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.line)");
        this.f97557m = findViewById5;
        View findViewById6 = view.findViewById(R.id.tvLastUpdate);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.tvLastUpdate)");
        this.f97558n = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.tvBalance);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.tvBalance)");
        this.f97559o = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.tvSimRCount);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(R.id.tvSimRCount)");
        TextView textView = (TextView) findViewById8;
        this.f97560p = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSimRCount");
            textView = null;
        }
        ViewVisibleExtKt.toGone(textView);
        View findViewById9 = view.findViewById(R.id.tv_confirm_subscriber_number);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(R.id.tv_confirm_subscriber_number)");
        this.f97562r = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.tvPricePackage);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(R.id.tvPricePackage)");
        this.f97563s = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.tvPriceUnit);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(R.id.tvPriceUnit)");
        this.f97564t = (TextView) findViewById11;
        View findViewById12 = view.findViewById(R.id.btnBuyDolShortCut);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(R.id.btnBuyDolShortCut)");
        this.f97561q = (ImageButton) findViewById12;
        View findViewById13 = view.findViewById(R.id.edt_confirm_pin);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(R.id.edt_confirm_pin)");
        this.f97567w = (OnePinEditText) findViewById13;
        View findViewById14 = view.findViewById(R.id.labelCheckData);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(R.id.labelCheckData)");
        this.f97565u = (TextView) findViewById14;
        View findViewById15 = view.findViewById(R.id.icPhone);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(R.id.icPhone)");
        this.f97566v = (ImageView) findViewById15;
    }

    private final void initView() {
        KeyboardVisibilityEvent.setEventListener(getActivity(), new KeyboardVisibilityEventListener() { // from class: qa1
            {
                OneProsermOnlineConfirmFragment.this = this;
            }

            @Override // net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener
            public final void onVisibilityChanged(boolean z) {
                OneProsermOnlineConfirmFragment.m9830s(OneProsermOnlineConfirmFragment.this, z);
            }
        });
        m9832q().getConfirmMultiTrans().setValue("N");
        DtacSwipeRefresh dtacSwipeRefresh = this.f97553i;
        ImageButton imageButton = null;
        if (dtacSwipeRefresh == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmSwipeRefresh");
            dtacSwipeRefresh = null;
        }
        dtacSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: ra1
            {
                OneProsermOnlineConfirmFragment.this = this;
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                OneProsermOnlineConfirmFragment.m9829t(OneProsermOnlineConfirmFragment.this);
            }
        });
        ImageButton imageButton2 = this.f97561q;
        if (imageButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnBuyDolShortCut");
        } else {
            imageButton = imageButton2;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(imageButton, new OneProsermOnlineConfirmFragment$initView$4(this));
    }

    @JvmStatic
    @NotNull
    public static final OneProsermOnlineConfirmFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: o */
    public final void m9834o(OneBuyDolPriceListSimRModel oneBuyDolPriceListSimRModel) {
        OneConsentDialog oneConsentDialog = this.f97568x;
        if (oneConsentDialog != null) {
            oneConsentDialog.dismiss();
        }
        OneSTVProSermOnlineActivity.openBuyDolActivity$default(m9833p(), oneBuyDolPriceListSimRModel.getSimR(), oneBuyDolPriceListSimRModel.getPriceList(), null, 4, null);
    }

    /* renamed from: p */
    public final OneSTVProSermOnlineActivity m9833p() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.activity.OneSTVProSermOnlineActivity");
        return (OneSTVProSermOnlineActivity) activity;
    }

    /* renamed from: q */
    public final OneStvProsermOnlineViewModel m9832q() {
        return m9833p().getViewModel();
    }

    /* renamed from: r */
    public final void m9831r(String str) {
        m9832q().getPriceList(str);
    }

    /* renamed from: s */
    public static final void m9830s(OneProsermOnlineConfirmFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        KeyboardUtil keyboardUtil = this$0.f97569y;
        if (keyboardUtil != null) {
            keyboardUtil.setShow(z);
        }
    }

    private final void setThemeView() {
        ThemeColorModel themeColorModel = m9833p().getThemeColorModel();
        ImageButton imageButton = this.f97561q;
        DtacSwipeRefresh dtacSwipeRefresh = null;
        if (imageButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnBuyDolShortCut");
            imageButton = null;
        }
        imageButton.setBackgroundResource(themeColorModel.getBuyDolBackground());
        TextView textView = this.f97565u;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTitleCheckData");
            textView = null;
        }
        textView.setBackgroundResource(themeColorModel.getConfirmTitleBackground());
        TextView textView2 = this.f97565u;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTitleCheckData");
            textView2 = null;
        }
        textView2.setTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getFontColor2(), null));
        TextView textView3 = this.f97562r;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriberNumber");
            textView3 = null;
        }
        textView3.setTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getFontColor2(), null));
        TextView textView4 = this.f97563s;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPricePackage");
            textView4 = null;
        }
        textView4.setTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getFontColor2(), null));
        TextView textView5 = this.f97564t;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPriceUnit");
            textView5 = null;
        }
        textView5.setTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getDialogRemainingTextTitleColor(), null));
        ImageView imageView = this.f97566v;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icPhone");
            imageView = null;
        }
        imageView.setColorFilter(ResourcesCompat.getColor(getResources(), themeColorModel.getFontColor2(), null));
        OnePinEditText onePinEditText = this.f97567w;
        if (onePinEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmPin");
            onePinEditText = null;
        }
        OneCustomClearableEditText editText = onePinEditText.getEditText();
        editText.setTextColor(ResourcesCompat.getColor(editText.getResources(), themeColorModel.getEditTextColor(), null));
        editText.setFocusColor(themeColorModel.getEditTextColor());
        editText.setBackgroundResource(themeColorModel.getEditTextBackground());
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(themeColorModel.getEditTextCursor());
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
                declaredField.setAccessible(true);
                declaredField.set(editText, Integer.valueOf(themeColorModel.getEditTextCursor()));
            } catch (Exception unused) {
            }
        }
        DtacSwipeRefresh dtacSwipeRefresh2 = this.f97553i;
        if (dtacSwipeRefresh2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmSwipeRefresh");
        } else {
            dtacSwipeRefresh = dtacSwipeRefresh2;
        }
        dtacSwipeRefresh.setColorSchemeResources(themeColorModel.getLoading(), themeColorModel.getLoadingtwo(), themeColorModel.getLoadingthree());
    }

    /* renamed from: t */
    public static final void m9829t(OneProsermOnlineConfirmFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m9832q().callBalance();
    }

    /* renamed from: u */
    private final void m9828u() {
        if (m9832q().getPermissions().contains(PermissionConstant.M_BUY_DOL)) {
            ImageButton imageButton = this.f97561q;
            if (imageButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnBuyDolShortCut");
                imageButton = null;
            }
            ViewVisibleExtKt.toVisible(imageButton);
        }
    }

    /* renamed from: v */
    private final void m9827v() {
        String pretty;
        boolean z;
        m9832q().getGetBalanceResponse().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$1(this)));
        TextView textView = this.f97554j;
        OnePinEditText onePinEditText = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumber");
            textView = null;
        }
        textView.setText(getString(R.string.stv_phone_label, m9832q().getSimRNumberDisplay()));
        OneStvPackageCollection value = m9832q().getSelectedStvPackage().getValue();
        String str = "";
        if (value != null) {
            if (value.getDescriptions().length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                TextView textView2 = this.f97556l;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvDescription");
                    textView2 = null;
                }
                ViewVisibleExtKt.toVisible(textView2);
                View view = this.f97557m;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("line");
                    view = null;
                }
                ViewVisibleExtKt.toVisible(view);
                TextView textView3 = this.f97556l;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvDescription");
                    textView3 = null;
                }
                String[] descriptions = value.getDescriptions();
                ArrayList arrayList = new ArrayList();
                for (String str2 : descriptions) {
                    arrayList.add(str2);
                }
                textView3.setText(CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new OneProsermOnlineConfirmFragment$setupViewModel$2$2(this), 30, null));
            } else {
                TextView textView4 = this.f97556l;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvDescription");
                    textView4 = null;
                }
                ViewVisibleExtKt.toGone(textView4);
                View view2 = this.f97557m;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("line");
                    view2 = null;
                }
                ViewVisibleExtKt.toGone(view2);
            }
            TextView textView5 = this.f97555k;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPromotionName");
                textView5 = null;
            }
            String name = value.getName();
            if (name == null) {
                name = "";
            }
            textView5.setText(name);
            TextView textView6 = this.f97563s;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPricePackage");
                textView6 = null;
            }
            textView6.setText(value.getPrice());
        }
        TextView textView7 = this.f97562r;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriberNumber");
            textView7 = null;
        }
        String subscriberNumber = m9832q().getSubscriberNumber();
        if (subscriberNumber != null && (pretty = PhoneNumberExtKt.toPretty(subscriberNumber)) != null) {
            str = pretty;
        }
        textView7.setText(str);
        OnePinEditText onePinEditText2 = this.f97567w;
        if (onePinEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmPin");
            onePinEditText2 = null;
        }
        onePinEditText2.setHint(getString(R.string.please_enter_pin_code));
        OnePinEditText onePinEditText3 = this.f97567w;
        if (onePinEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmPin");
            onePinEditText3 = null;
        }
        onePinEditText3.addOnePinTextChangedListener(this);
        OnePinEditText onePinEditText4 = this.f97567w;
        if (onePinEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmPin");
        } else {
            onePinEditText = onePinEditText4;
        }
        onePinEditText.focus();
        m9832q().getSubmitSuccess().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$3(this)));
        m9832q().getShowDialogError().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$4(this)));
        m9832q().getShowDialogDuplicateStv().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$5(this)));
        m9832q().isRefreshing().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$6(this)));
        m9832q().getDisplayConsentLiveData().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$7(this)));
        m9832q().getPriceListLiveData().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$8(this)));
        m9832q().getAcceptOnConsentLiveData().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$9(this)));
        m9832q().getBankListLiveData().observe(getViewLifecycleOwner(), new C15167a(new OneProsermOnlineConfirmFragment$setupViewModel$10(this)));
    }

    /* renamed from: x */
    public final void m9825x(ErrorCollection errorCollection) {
        OneCustomDialogBoxConfirm.Builder timestamp = new OneCustomDialogBoxConfirm.Builder().setTransparent(Boolean.TRUE).setLayout(R.layout.one_dialog_warning_duplicate).setMessage(String.valueOf(errorCollection.getDescription())).setTextOkButton(R.string.confirm_text).setTextCancelButton(R.string.cancel_text).setTimestamp(DateTime.INSTANCE.errorDateTimeFormat());
        String username = errorCollection.getUsername();
        String company = m9832q().getCompany();
        OneCustomDialogBoxConfirm create = timestamp.setUser(username + " (" + company + ")").setErrorCode(String.valueOf(errorCollection.getStatusCode())).setCancelable(false).setBackgroundOkButton(m9832q().getThemeColorModel().getButtonBackground()).create();
        create.setTargetFragment(this, 2);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            create.show(fragmentManager, (String) null);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText.OnePinTextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        int i;
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        if (i == 4) {
            m9832q().getSecurePin().setValue(String.valueOf(editable));
            OnePinEditText onePinEditText = this.f97567w;
            if (onePinEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtConfirmPin");
                onePinEditText = null;
            }
            onePinEditText.setText("");
            KeyboardUtil keyboardUtil = this.f97569y;
            if (keyboardUtil != null) {
                keyboardUtil.hideKeyboard();
                Unit unit = Unit.INSTANCE;
            }
            new SingleTime().run(new OneProsermOnlineConfirmFragment$afterTextChanged$1$1(this));
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText.OnePinTextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneProsermOnlineConfirmFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        return name;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneConsentDialog.OneConsentDialogCallback
    public void onAcceptOneConsent(int i, @Nullable Object obj) {
        OneConsentDialog oneConsentDialog = this.f97568x;
        if (oneConsentDialog != null) {
            oneConsentDialog.dismiss();
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        m9832q().acceptBuyDOLConsent(MrtrConsentId.getConsentId(), new Version(MODEL, "android", BuildConfig.VERSION_NAME, RELEASE), PermissionConstant.M_BUY_DOL);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm.ConfirmDialogListener
    public void onCancelButtonClick(int i) {
        FragmentManager supportFragmentManager = m9833p().getSupportFragmentManager();
        if (supportFragmentManager != null) {
            supportFragmentManager.popBackStack();
        }
        m9832q().callBalance();
        String subscriberNumber = m9832q().getSubscriberNumber();
        if (subscriberNumber != null) {
            m9832q().getProsermRecommend(subscriberNumber);
        }
        m9832q().callGetSTVPackages(m9832q().getSubscriberGroup());
        m9832q().setSubscriberGroup("");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_one_proserm_online_confirm, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m9832q().clearSelectedPackData();
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m9832q().callBalance();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText.OnePinTextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        bindingView(view);
        setThemeView();
        m9827v();
        initView();
        m9828u();
        Context context = getContext();
        if (context != null) {
            this.f97569y = new KeyboardUtil(context, view, false, 4, null);
        }
    }

    /* renamed from: w */
    public final void m9826w() {
        ThemeColorModel themeColorModel = m9832q().getThemeColorModel();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        new OneDialogSuccess(requireContext, new OneDialogSuccess.Callback() { // from class: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment$showDialogSuccess$1$dialogSuccess$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess.Callback
            public void onButtonClick() {
                OneSTVProSermOnlineActivity m9833p;
                m9833p = OneProsermOnlineConfirmFragment.this.m9833p();
                m9833p.finish();
            }
        }, R.string.completed, themeColorModel.getDialogSuccessIcon(), themeColorModel.getButtonBackground()).show();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm.ConfirmDialogListener
    public void onOkButtonClick(int i, @Nullable Void r3) {
        OneStvProsermOnlineViewModel m9832q = m9832q();
        m9832q.getConfirmMultiTrans().setValue("Y");
        m9832q.submit();
    }
}