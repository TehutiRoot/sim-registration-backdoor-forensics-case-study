package th.p047co.dtac.android.dtacone.extension.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.print.PrintManager;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.IdRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSimAdapter;
import th.p047co.dtac.android.dtacone.extension.ButtonExtenKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;
import th.p047co.dtac.android.dtacone.model.change_pack.ConfirmPackageDialog;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SIMInfo;
import th.p047co.dtac.android.dtacone.util.PaddingItemDecoration;
import th.p047co.dtac.android.dtacone.util.SpacingGridRecyclerDecoration;
import th.p047co.dtac.android.dtacone.util.p052enum.TelephoneType;
import th.p047co.dtac.android.dtacone.util.printing.DtacOnePrintDocumentAdapter;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.LinkageMenuAdapter;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0010\u001a\u00020\u0007*\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0012\u001a\u00020\u0007*\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\n*\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u001a\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010!\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b!\u0010\"\u001aG\u0010!\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b!\u0010&\u001a/\u0010'\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b'\u0010\"\u001a?\u0010'\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b'\u0010*\u001aq\u0010'\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b'\u0010/\u001aM\u00100\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b0\u00101\u001a/\u00104\u001a\u0004\u0018\u00010 *\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b4\u00105\u001aY\u00109\u001a\u00020 *\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b9\u0010:\u001aw\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001eH\u0002¢\u0006\u0004\b<\u0010=\u001a1\u0010B\u001a\u00020 *\u00020\u00042\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>¢\u0006\u0004\bB\u0010C\u001a\u008f\u0001\u0010D\u001a\u00020 2\u0006\u0010;\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bD\u0010E\u001a'\u0010H\u001a\u00020 *\u00020\u00042\u0006\u0010G\u001a\u00020F2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\bH\u0010I\u001a7\u0010K\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\bK\u0010L\u001ag\u0010M\u001a\u00020 2\u0006\u0010;\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010J\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\u000e2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\bM\u0010N\u001aM\u0010W\u001a\u0010\u0012\f\u0012\n V*\u0004\u0018\u00018\u00008\u00000U\"\u0004\b\u0000\u0010O\"\u0004\b\u0001\u0010P*\u00020\u00042\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Q2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0004\bW\u0010X¨\u0006Y"}, m29142d2 = {"T", "Landroidx/fragment/app/FragmentActivity;", "getTopFragment", "(Landroidx/fragment/app/FragmentActivity;)Ljava/lang/Object;", "Landroid/app/Activity;", "Ljava/io/File;", "file", "", "printFile", "(Landroid/app/Activity;Ljava/io/File;)V", "", "resId", "Landroidx/fragment/app/Fragment;", "fragment", "", "tagName", "navigateFragmentTo", "(Landroidx/fragment/app/FragmentActivity;ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V", "navigateAddFragmentTo", "toPx", "(I)I", "Landroid/content/Context;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/LinkageMenuAdapter;", "menuAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "linkageMenuListView", "createLinkageMenuList", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/LinkageMenuAdapter;Landroidx/recyclerview/widget/RecyclerView;)V", MessageBundle.TITLE_ENTRY, "message", "Lkotlin/Function0;", "handler", "Landroid/app/Dialog;", "createConfirmDialogHtmlText", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "", "titleFontSize", "messageFontSize", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "createConfirmDialog", "textLeftButton", "textRightButton", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "", "isDialogAnimation", "handlerButtonLeft", "handlerButtonRight", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "createConfirmDialogTwoAction", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "onCancel", "onNext", "createDialogConfirmUsedPhoto", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "warningMessage", "textButtonLeft", "textButtonRight", "createConfirmDialog2Action", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", CoreConstants.CONTEXT_SCOPE_VALUE, OperatorName.LINE_TO, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SIMInfo;", "deviceSimListData", "dtacAppListData", "createDialogDeviceSimInfo", "(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;)Landroid/app/Dialog;", OperatorName.CLOSE_PATH, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Landroid/app/Dialog;", "Lth/co/dtac/android/dtacone/model/change_pack/ConfirmPackageDialog;", "confirmInfo", "createDialogConfirmPackage", "(Landroid/app/Activity;Lth/co/dtac/android/dtacone/model/change_pack/ConfirmPackageDialog;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", ResponseProcessor.CONTENT_TYPE_IMAGE, "createConfirmDialogWithImage", "(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "buildConfirmDialogWithImage", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/app/Dialog;", "I", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "registerForActivityResult", "(Landroid/app/Activity;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityExt.kt\nth/co/dtac/android/dtacone/extension/view/ActivityExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,438:1\n1#2:439\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.view.ActivityExtKt */
/* loaded from: classes7.dex */
public final class ActivityExtKt {
    /* renamed from: a */
    public static /* synthetic */ void m19636a(Dialog dialog, View view) {
        m19619r(dialog, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19635b(Dialog dialog, View view) {
        m19620q(dialog, view);
    }

    @NotNull
    public static final Dialog buildConfirmDialogWithImage(@NotNull Context context, @NotNull String title, int i, @NotNull String message, @NotNull String textButtonLeft, @NotNull String textButtonRight, @NotNull Function0<Unit> handlerButtonLeft, @NotNull Function0<Unit> handlerButtonRight) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(textButtonLeft, "textButtonLeft");
        Intrinsics.checkNotNullParameter(textButtonRight, "textButtonRight");
        Intrinsics.checkNotNullParameter(handlerButtonLeft, "handlerButtonLeft");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "handlerButtonRight");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_confirm_with_image);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            window.getAttributes().windowAnimations = R.style.DialogAnimation;
        }
        dialog.setCancelable(false);
        Button buttonYes = (Button) dialog.findViewById(R.id.buttonYes);
        Button buttonNo = (Button) dialog.findViewById(R.id.buttonNo);
        ((TextView) dialog.findViewById(R.id.confirmTitle)).setText(title);
        ((ImageView) dialog.findViewById(R.id.dialogIcon)).setImageResource(i);
        ((TextView) dialog.findViewById(R.id.confirmMessage)).setText(Html.fromHtml(message));
        if (!AbstractC19741eO1.isBlank(textButtonLeft)) {
            buttonNo.setText(textButtonLeft);
        }
        if (!AbstractC19741eO1.isBlank(textButtonRight)) {
            buttonYes.setText(textButtonRight);
        }
        Intrinsics.checkNotNullExpressionValue(buttonYes, "buttonYes");
        ButtonExtenKt.throttleClick$default(buttonYes, 0L, new ActivityExtKt$buildConfirmDialogWithImage$3$2(dialog, handlerButtonRight), 1, null);
        Intrinsics.checkNotNullExpressionValue(buttonNo, "buttonNo");
        ButtonExtenKt.throttleClick$default(buttonNo, 0L, new ActivityExtKt$buildConfirmDialogWithImage$3$3(dialog, handlerButtonLeft), 1, null);
        return dialog;
    }

    public static /* synthetic */ Dialog buildConfirmDialogWithImage$default(Context context, String str, int i, String str2, String str3, String str4, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        if ((i2 & 64) != 0) {
            function0 = ActivityExtKt$buildConfirmDialogWithImage$1.INSTANCE;
        }
        if ((i2 & 128) != 0) {
            function02 = ActivityExtKt$buildConfirmDialogWithImage$2.INSTANCE;
        }
        return buildConfirmDialogWithImage(context, str, i, str2, str3, str4, function0, function02);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19634c(Dialog dialog, Function0 function0, View view) {
        m19627j(dialog, function0, view);
    }

    @NotNull
    public static final Dialog createConfirmDialog(@NotNull Activity activity, @NotNull String title, @NotNull String message, @NotNull Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return m19628i(activity, title, message, null, null, null, null, null, null, handler, null, 1528, null);
    }

    public static /* synthetic */ Dialog createConfirmDialog$default(Activity activity, String str, String str2, String str3, String str4, Float f, Float f2, Boolean bool, Function0 function0, Function0 function02, int i, Object obj) {
        Float f3;
        Float f4;
        Boolean bool2;
        if ((i & 16) != 0) {
            f3 = null;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = null;
        } else {
            f4 = f2;
        }
        if ((i & 64) != 0) {
            bool2 = Boolean.TRUE;
        } else {
            bool2 = bool;
        }
        return createConfirmDialog(activity, str, str2, str3, str4, f3, f4, bool2, function0, function02);
    }

    @NotNull
    public static final Dialog createConfirmDialog2Action(@NotNull Activity activity, @NotNull String title, @NotNull String message, @Nullable String str, @NotNull String textButtonLeft, @NotNull String textButtonRight, @NotNull Function0<Unit> handlerButtonLeft, @NotNull Function0<Unit> handlerButtonRight) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(textButtonLeft, "textButtonLeft");
        Intrinsics.checkNotNullParameter(textButtonRight, "textButtonRight");
        Intrinsics.checkNotNullParameter(handlerButtonLeft, "handlerButtonLeft");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "handlerButtonRight");
        return m19628i(activity, title, message, textButtonLeft, textButtonRight, null, null, null, handlerButtonLeft, handlerButtonRight, str, 224, null);
    }

    public static /* synthetic */ Dialog createConfirmDialog2Action$default(Activity activity, String str, String str2, String str3, String str4, String str5, Function0 function0, Function0 function02, int i, Object obj) {
        String str6;
        if ((i & 4) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        return createConfirmDialog2Action(activity, str, str2, str6, str4, str5, function0, function02);
    }

    @NotNull
    public static final Dialog createConfirmDialogHtmlText(@NotNull Activity activity, @NotNull String title, @NotNull String message, @NotNull Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return m19624m(activity, title, message, null, null, null, null, null, handler, 248, null);
    }

    public static /* synthetic */ Dialog createConfirmDialogHtmlText$default(Activity activity, String str, String str2, Float f, Float f2, Function0 function0, int i, Object obj) {
        Float f3;
        Float f4;
        if ((i & 4) != 0) {
            f3 = null;
        } else {
            f3 = f;
        }
        if ((i & 8) != 0) {
            f4 = null;
        } else {
            f4 = f2;
        }
        return createConfirmDialogHtmlText(activity, str, str2, f3, f4, function0);
    }

    @NotNull
    public static final Dialog createConfirmDialogTwoAction(@NotNull Activity activity, @NotNull String title, @NotNull String message, @NotNull String textLeftButton, @NotNull String textRightButton, @NotNull Function0<Unit> handlerButtonLeft, @NotNull Function0<Unit> handlerButtonRight) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(textLeftButton, "textLeftButton");
        Intrinsics.checkNotNullParameter(textRightButton, "textRightButton");
        Intrinsics.checkNotNullParameter(handlerButtonLeft, "handlerButtonLeft");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "handlerButtonRight");
        return m19628i(activity, title, message, textLeftButton, textRightButton, null, null, null, handlerButtonLeft, handlerButtonRight, null, 1248, null);
    }

    public static final void createConfirmDialogWithImage(@NotNull Activity activity, @NotNull String title, int i, @NotNull String message, @NotNull Function0<Unit> handlerButtonRight) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "handlerButtonRight");
        buildConfirmDialogWithImage$default(activity, title, i, message, null, null, null, handlerButtonRight, 112, null).show();
    }

    @NotNull
    public static final Dialog createDialogConfirmPackage(@NotNull Activity activity, @NotNull ConfirmPackageDialog confirmInfo, @NotNull final Function0<Unit> handler) {
        String str;
        String string;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(confirmInfo, "confirmInfo");
        Intrinsics.checkNotNullParameter(handler, "handler");
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.dialog_confirm_change_package);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            window.getAttributes().windowAnimations = R.style.DialogAnimation;
        }
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.confirmMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.confirmMessage)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.confirmMessage2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.confirmMessage2)");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.confirmMessage3);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.confirmMessage3)");
        TextView textView3 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.confirmMessage5);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.confirmMessage5)");
        TextView textView4 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.confirmMessage10);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.confirmMessage10)");
        TextView textView5 = (TextView) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.confirmMessage11);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.confirmMessage11)");
        TextView textView6 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.imageView12);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.imageView12)");
        ImageView imageView = (ImageView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.buttonConfirm);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(R.id.buttonConfirm)");
        Button button = (Button) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.buttonNo);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(R.id.buttonNo)");
        Button button2 = (Button) findViewById9;
        if (Intrinsics.areEqual(confirmInfo.getTelephoneType(), TelephoneType.POSTPAID.getType())) {
            textView2.setText(activity.getString(R.string.postpaid));
            textView2.setTextColor(ContextCompat.getColor(dialog.getContext(), R.color.dtacBlue));
            textView5.setVisibility(8);
            textView6.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            textView2.setText(activity.getString(R.string.prepaid));
            textView2.setTextColor(ContextCompat.getColor(dialog.getContext(), R.color.readDark));
            if (Intrinsics.areEqual(confirmInfo.getAmount(), "0")) {
                str = "0.00";
            } else {
                String bigDecimal = new BigDecimal(String.valueOf(Math.abs(Float.parseFloat(confirmInfo.getAmount())))).toString();
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "abs(confirmInfo.amount.t…toBigDecimal().toString()");
                str = StringExtKt.formatMoneyWithDecimal(bigDecimal);
            }
            if (confirmInfo.getHaveFee()) {
                string = str + " บาท";
            } else {
                string = activity.getString(R.string.waive_fee);
            }
            textView6.setText(string);
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            imageView.setVisibility(0);
        }
        textView.setText(confirmInfo.getSubscriberNumber());
        textView3.setText(confirmInfo.getStartDate());
        textView4.setText(confirmInfo.getNewPackageDescription());
        button.setOnClickListener(new View.OnClickListener() { // from class: S1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19633d(dialog, handler, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: T1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19635b(dialog, view);
            }
        });
        return dialog;
    }

    @Nullable
    public static final Dialog createDialogConfirmUsedPhoto(@NotNull Activity activity, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onNext) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        String string = activity.getString(R.string.camera_confirm_take_photo);
        String string2 = activity.getString(R.string.face_detection_invalid_max_attempt);
        String string3 = activity.getString(R.string.cancel_text);
        String string4 = activity.getString(R.string.confirm_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.camera_confirm_take_photo)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.face_…tion_invalid_max_attempt)");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.cancel_text)");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.confirm_text)");
        return createConfirmDialog2Action(activity, string, string2, null, string3, string4, new ActivityExtKt$createDialogConfirmUsedPhoto$1(onCancel), new ActivityExtKt$createDialogConfirmUsedPhoto$2(onNext));
    }

    @NotNull
    public static final Dialog createDialogDeviceSimInfo(@NotNull Activity activity, @Nullable List<SIMInfo> list, @Nullable List<SIMInfo> list2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_device_sim_info);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setFlags(8192, 8192);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
        }
        RecyclerView recyclerView = (RecyclerView) dialog.findViewById(R.id.deviceSimList);
        DtacFontTextView deviceSimNoData = (DtacFontTextView) dialog.findViewById(R.id.deviceSimNoData);
        RecyclerView recyclerView2 = (RecyclerView) dialog.findViewById(R.id.dtacAppList);
        DtacFontTextView dtacAppNoData = (DtacFontTextView) dialog.findViewById(R.id.dtacAppNoData);
        DtacFontButton dtacFontButton = (DtacFontButton) dialog.findViewById(R.id.buttonOk);
        recyclerView.setLayoutManager(new LinearLayoutManager(dialog.getContext()));
        List<SIMInfo> list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            recyclerView.setAdapter(new DeviceSimAdapter(R.layout.device_sim_item, list, ActivityExtKt$createDialogDeviceSimInfo$1$2.INSTANCE));
            recyclerView.setVisibility(0);
        } else {
            Intrinsics.checkNotNullExpressionValue(deviceSimNoData, "deviceSimNoData");
            ViewVisibleExtKt.toVisible(deviceSimNoData);
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(dialog.getContext()));
        List<SIMInfo> list4 = list2;
        if (list4 != null && !list4.isEmpty()) {
            recyclerView2.setAdapter(new DeviceSimAdapter(R.layout.device_sim_item, list2, ActivityExtKt$createDialogDeviceSimInfo$1$3.INSTANCE));
            recyclerView2.setVisibility(0);
        } else {
            Intrinsics.checkNotNullExpressionValue(dtacAppNoData, "dtacAppNoData");
            ViewVisibleExtKt.toVisible(dtacAppNoData);
        }
        dtacFontButton.setOnClickListener(new View.OnClickListener() { // from class: R1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19636a(dialog, view);
            }
        });
        return dialog;
    }

    public static final void createLinkageMenuList(@NotNull Context context, @NotNull LinkageMenuAdapter menuAdapter, @NotNull RecyclerView linkageMenuListView) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(menuAdapter, "menuAdapter");
        Intrinsics.checkNotNullParameter(linkageMenuListView, "linkageMenuListView");
        linkageMenuListView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        linkageMenuListView.setAdapter(menuAdapter);
        Context context2 = linkageMenuListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        linkageMenuListView.addItemDecoration(new SpacingGridRecyclerDecoration(context2, R.dimen.spacing_linkage_menu));
        Context context3 = linkageMenuListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        linkageMenuListView.addItemDecoration(new PaddingItemDecoration(context3, R.dimen.spacing_linkage_menu));
    }

    /* renamed from: d */
    public static /* synthetic */ void m19633d(Dialog dialog, Function0 function0, View view) {
        m19621p(dialog, function0, view);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19632e(Dialog dialog, Function0 function0, View view) {
        m19623n(dialog, function0, view);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19631f(Dialog dialog, Function0 function0, View view) {
        m19622o(dialog, function0, view);
    }

    /* renamed from: g */
    public static /* synthetic */ void m19630g(Dialog dialog, Function0 function0, View view) {
        m19626k(dialog, function0, view);
    }

    public static final /* synthetic */ <T> T getTopFragment(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
        T t = (T) ((Fragment) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) fragments));
        if (t != null) {
            Intrinsics.reifiedOperationMarker(2, "T");
            return t;
        }
        return null;
    }

    /* renamed from: h */
    public static final Dialog m19629h(Context context, String str, String str2, String str3, String str4, Float f, Float f2, Boolean bool, final Function0 function0, final Function0 function02, String str5) {
        final Dialog dialog = new Dialog(context);
        if (str5 != null && str5.length() != 0) {
            dialog.setContentView(R.layout.dialog_confirm_with_warning);
        } else {
            dialog.setContentView(R.layout.dialog_confirm);
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                window.getAttributes().windowAnimations = R.style.DialogAnimation;
            }
        }
        dialog.setCancelable(false);
        TextView textView = (TextView) dialog.findViewById(R.id.confirmTitle);
        TextView textView2 = (TextView) dialog.findViewById(R.id.confirmMessage);
        Button button = (Button) dialog.findViewById(R.id.buttonYes);
        Button button2 = (Button) dialog.findViewById(R.id.buttonNo);
        textView.setText(str);
        textView2.setText(str2);
        if (f != null) {
            textView.setTextSize(f.floatValue());
        }
        if (f2 != null) {
            textView2.setTextSize(f2.floatValue());
        }
        if (str5 != null && str5.length() != 0) {
            ((TextView) dialog.findViewById(R.id.warningMessage)).setText(str5);
        }
        if (!AbstractC19741eO1.isBlank(str3)) {
            button2.setText(str3);
        }
        if (!AbstractC19741eO1.isBlank(str4)) {
            button.setText(str4);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: N1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19634c(dialog, function02, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: O1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19630g(dialog, function0, view);
            }
        });
        return dialog;
    }

    /* renamed from: i */
    public static /* synthetic */ Dialog m19628i(Context context, String str, String str2, String str3, String str4, Float f, Float f2, Boolean bool, Function0 function0, Function0 function02, String str5, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        if ((i & 32) != 0) {
            f = null;
        }
        if ((i & 64) != 0) {
            f2 = null;
        }
        if ((i & 128) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i & 256) != 0) {
            function0 = ActivityExtKt$buildConfirmDialog$1.INSTANCE;
        }
        if ((i & 512) != 0) {
            function02 = ActivityExtKt$buildConfirmDialog$2.INSTANCE;
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        return m19629h(context, str, str2, str3, str4, f, f2, bool, function0, function02, str5);
    }

    /* renamed from: j */
    public static final void m19627j(Dialog this_apply, Function0 handlerButtonRight, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "$handlerButtonRight");
        this_apply.dismiss();
        handlerButtonRight.invoke();
    }

    /* renamed from: k */
    public static final void m19626k(Dialog this_apply, Function0 handlerButtonLeft, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(handlerButtonLeft, "$handlerButtonLeft");
        this_apply.dismiss();
        handlerButtonLeft.invoke();
    }

    /* renamed from: l */
    public static final Dialog m19625l(Context context, String str, String str2, String str3, String str4, Float f, Float f2, final Function0 function0, final Function0 function02) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_confirm);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
        }
        dialog.setCancelable(false);
        DtacFontTextView dtacFontTextView = (DtacFontTextView) dialog.findViewById(R.id.confirmTitle);
        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) dialog.findViewById(R.id.confirmMessage);
        Button button = (Button) dialog.findViewById(R.id.buttonYes);
        Button button2 = (Button) dialog.findViewById(R.id.buttonNo);
        dtacFontTextView.setText(str);
        dtacFontTextView2.setText(Html.fromHtml(AbstractC19741eO1.replace$default(str2, "\n", "<br>", false, 4, (Object) null)));
        if (f != null) {
            dtacFontTextView.setTextSize(f.floatValue());
        }
        if (f2 != null) {
            dtacFontTextView2.setTextSize(f2.floatValue());
        }
        if (!AbstractC19741eO1.isBlank(str3)) {
            button2.setText(str3);
        }
        if (!AbstractC19741eO1.isBlank(str4)) {
            button.setText(str4);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: P1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19632e(dialog, function02, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: Q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityExtKt.m19631f(dialog, function0, view);
            }
        });
        return dialog;
    }

    /* renamed from: m */
    public static /* synthetic */ Dialog m19624m(Context context, String str, String str2, String str3, String str4, Float f, Float f2, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        if ((i & 32) != 0) {
            f = null;
        }
        if ((i & 64) != 0) {
            f2 = null;
        }
        if ((i & 128) != 0) {
            function0 = ActivityExtKt$buildConfirmDialogHtmlText$1.INSTANCE;
        }
        if ((i & 256) != 0) {
            function02 = ActivityExtKt$buildConfirmDialogHtmlText$2.INSTANCE;
        }
        return m19625l(context, str, str2, str3, str4, f, f2, function0, function02);
    }

    /* renamed from: n */
    public static final void m19623n(Dialog this_apply, Function0 handlerButtonRight, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "$handlerButtonRight");
        this_apply.dismiss();
        handlerButtonRight.invoke();
    }

    public static final void navigateAddFragmentTo(@Nullable FragmentActivity fragmentActivity, @IdRes int i, @NotNull Fragment fragment, @Nullable String str) {
        FragmentTransaction fragmentTransaction;
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (fragmentTransaction = supportFragmentManager.beginTransaction()) != null) {
            fragmentTransaction.add(i, fragment, str);
            fragmentTransaction.addToBackStack(str);
        } else {
            fragmentTransaction = null;
        }
        if (fragmentTransaction != null) {
            fragmentTransaction.commit();
        }
    }

    public static /* synthetic */ void navigateAddFragmentTo$default(FragmentActivity fragmentActivity, int i, Fragment fragment, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        navigateAddFragmentTo(fragmentActivity, i, fragment, str);
    }

    public static final void navigateFragmentTo(@Nullable FragmentActivity fragmentActivity, @IdRes int i, @NotNull Fragment fragment, @Nullable String str) {
        FragmentTransaction fragmentTransaction;
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (fragmentTransaction = supportFragmentManager.beginTransaction()) != null) {
            fragmentTransaction.replace(i, fragment, str);
            fragmentTransaction.addToBackStack(str);
        } else {
            fragmentTransaction = null;
        }
        if (fragmentTransaction != null) {
            fragmentTransaction.commit();
        }
    }

    public static /* synthetic */ void navigateFragmentTo$default(FragmentActivity fragmentActivity, int i, Fragment fragment, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        navigateFragmentTo(fragmentActivity, i, fragment, str);
    }

    /* renamed from: o */
    public static final void m19622o(Dialog this_apply, Function0 handlerButtonLeft, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(handlerButtonLeft, "$handlerButtonLeft");
        this_apply.dismiss();
        handlerButtonLeft.invoke();
    }

    /* renamed from: p */
    public static final void m19621p(Dialog this_apply, Function0 handler, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        this_apply.dismiss();
        handler.invoke();
    }

    @SuppressLint({"NewApi"})
    public static final void printFile(@NotNull Activity activity, @NotNull File file) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Object systemService = activity.getSystemService(PDWindowsLaunchParams.OPERATION_PRINT);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.print.PrintManager");
        try {
            ((PrintManager) systemService).print("testPrint", new DtacOnePrintDocumentAdapter(activity, file), null);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Exception ");
            sb.append(message);
        }
    }

    /* renamed from: q */
    public static final void m19620q(Dialog this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.dismiss();
    }

    /* renamed from: r */
    public static final void m19619r(Dialog this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.dismiss();
    }

    @NotNull
    public static final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull Activity activity, @NotNull ActivityResultContract<I, O> contract, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher<I> registerForActivityResult = ((ComponentActivity) activity).registerForActivityResult(contract, callback);
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "this as ComponentActivit…esult(contract, callback)");
        return registerForActivityResult;
    }

    public static final int toPx(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    @NotNull
    public static final Dialog createConfirmDialog(@NotNull Activity activity, @NotNull String title, @NotNull String message, @NotNull String textLeftButton, @NotNull String textRightButton, @NotNull Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(textLeftButton, "textLeftButton");
        Intrinsics.checkNotNullParameter(textRightButton, "textRightButton");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return m19628i(activity, title, message, textLeftButton, textRightButton, null, null, null, null, handler, null, 1504, null);
    }

    @NotNull
    public static final Dialog createConfirmDialogHtmlText(@NotNull Activity activity, @NotNull String title, @NotNull String message, @Nullable Float f, @Nullable Float f2, @NotNull Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return m19624m(activity, title, message, null, null, f, f2, null, handler, SyslogConstants.LOG_LOCAL3, null);
    }

    @NotNull
    public static final Dialog createConfirmDialog(@NotNull Activity activity, @NotNull String title, @NotNull String message, @NotNull String textLeftButton, @NotNull String textRightButton, @Nullable Float f, @Nullable Float f2, @Nullable Boolean bool, @NotNull Function0<Unit> handlerButtonLeft, @NotNull Function0<Unit> handlerButtonRight) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(textLeftButton, "textLeftButton");
        Intrinsics.checkNotNullParameter(textRightButton, "textRightButton");
        Intrinsics.checkNotNullParameter(handlerButtonLeft, "handlerButtonLeft");
        Intrinsics.checkNotNullParameter(handlerButtonRight, "handlerButtonRight");
        return m19628i(activity, title, message, textLeftButton, textRightButton, f, f2, bool, handlerButtonLeft, handlerButtonRight, null, 1024, null);
    }
}