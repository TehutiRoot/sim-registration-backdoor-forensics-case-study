package th.p047co.dtac.android.dtacone.manager.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import androidx.annotation.UiThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Reader;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import retrofit2.Response;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.view.activity.login.SigninActivity;
import th.p047co.dtac.android.dtacone.widget.loading.DtacProgressDialog;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b*\u0002$'\b\u0017\u0018\u0000 Z2\u00020\u0001:\u0002Z[BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+¢\u0006\u0004\b-\u0010.J=\u00101\u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010/¢\u0006\u0004\b1\u00102J+\u00103\u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+¢\u0006\u0004\b3\u0010.J-\u00107\u001a\u00020!2\u0006\u00104\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0005¢\u0006\u0004\b7\u00108J/\u0010;\u001a\u00020!2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0005¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u000209¢\u0006\u0004\b?\u0010@J-\u0010C\u001a\u00020!2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0005¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u0004\u0018\u0001092\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u0004\u0018\u0001092\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bG\u0010FJ\u0019\u0010H\u001a\u0004\u0018\u0001092\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bH\u0010FJ\u0019\u0010I\u001a\u0004\u0018\u0001092\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bI\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010VR\u0014\u0010Y\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006\\"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "", "Landroid/app/Activity;", "activity", "Lcom/google/gson/Gson;", "gson", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "mrtrRepository", "Lth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic;", "messagingTopic", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "preferencesRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Landroid/app/Activity;Lcom/google/gson/Gson;Lth/co/dtac/android/dtacone/manager/TemporaryCache;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "", "throwable", "Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "o", "(Ljava/lang/Throwable;)Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "", "code", "Ljava/io/Reader;", "jsonError", "p", "(ILjava/io/Reader;)Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "Lcom/google/gson/JsonObject;", "jsonNode", OperatorName.LINE_TO, "(ILcom/google/gson/JsonObject;)Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "", OperatorName.CLOSE_AND_STROKE, "()V", "th/co/dtac/android/dtacone/manager/service/OneErrorService$killActivity$1", OperatorName.ENDPATH, "()Lth/co/dtac/android/dtacone/manager/service/OneErrorService$killActivity$1;", "th/co/dtac/android/dtacone/manager/service/OneErrorService$callbackDialog$1", OperatorName.NON_STROKING_GRAY, "()Lth/co/dtac/android/dtacone/manager/service/OneErrorService$callbackDialog$1;", "", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService$ExceptionHandler;", "handlers", "handleException", "(Ljava/lang/Throwable;[Lth/co/dtac/android/dtacone/manager/service/OneErrorService$ExceptionHandler;)V", "Lkotlin/Function0;", "onButtonClick", "handleExceptionCallback", "(Ljava/lang/Throwable;[Lth/co/dtac/android/dtacone/manager/service/OneErrorService$ExceptionHandler;Lkotlin/jvm/functions/Function0;)V", "handleExceptionNopopup", "httpCode", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;", "click", "defaultHandleException", "(ILjava/lang/Throwable;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;)V", "", "message", "showErrorDialog", "(Ljava/lang/String;Ljava/lang/Throwable;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;)V", "toCheck", "", "isNumeric", "(Ljava/lang/String;)Z", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;", "callback", "showDialog", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;Ljava/lang/Throwable;)V", "getErrorCode", "(Ljava/lang/Throwable;)Ljava/lang/String;", "getErrorMessage", "getSystemMessage", "getErrorTime", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/gson/Gson;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "d", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "e", "Lth/co/dtac/android/dtacone/manager/messaging/FirebaseMessagingTopic;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", OperatorName.MOVE_TO, "()Z", "isActivityRunning", "Companion", "ExceptionHandler", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneErrorService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneErrorService.kt\nth/co/dtac/android/dtacone/manager/service/OneErrorService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,368:1\n731#2,9:369\n37#3,2:378\n1064#4,2:380\n*S KotlinDebug\n*F\n+ 1 OneErrorService.kt\nth/co/dtac/android/dtacone/manager/service/OneErrorService\n*L\n218#1:369,9\n219#1:378,2\n286#1:380,2\n*E\n"})
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.manager.service.OneErrorService */
/* loaded from: classes7.dex */
public class OneErrorService {

    /* renamed from: a */
    public final Activity f84991a;

    /* renamed from: b */
    public final Gson f84992b;

    /* renamed from: c */
    public final TemporaryCache f84993c;

    /* renamed from: d */
    public final RtrRx2Repository f84994d;

    /* renamed from: e */
    public final FirebaseMessagingTopic f84995e;

    /* renamed from: f */
    public final PreferencesRepository f84996f;

    /* renamed from: g */
    public final PreferencesViewModel f84997g;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/service/OneErrorService$Companion;", "", "()V", "TAG", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.manager.service.OneErrorService$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/service/OneErrorService$ExceptionHandler;", "", "handle", "", "e", "", "supportHttpCode", "", "code", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.manager.service.OneErrorService$ExceptionHandler */
    /* loaded from: classes7.dex */
    public interface ExceptionHandler {
        void handle(@Nullable Throwable th2);

        boolean supportHttpCode(int i);
    }

    @Inject
    public OneErrorService(@NotNull Activity activity, @NotNull Gson gson, @NotNull TemporaryCache temporaryCache, @NotNull RtrRx2Repository mrtrRepository, @NotNull FirebaseMessagingTopic messagingTopic, @NotNull PreferencesRepository preferencesRepository, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        Intrinsics.checkNotNullParameter(mrtrRepository, "mrtrRepository");
        Intrinsics.checkNotNullParameter(messagingTopic, "messagingTopic");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f84991a = activity;
        this.f84992b = gson;
        this.f84993c = temporaryCache;
        this.f84994d = mrtrRepository;
        this.f84995e = messagingTopic;
        this.f84996f = preferencesRepository;
        this.f84997g = pfViewModel;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19224a(OneErrorService oneErrorService, OneErrorDialogBox.Callback callback, String str, Throwable th2) {
        m19207r(oneErrorService, callback, str, th2);
    }

    public static final /* synthetic */ Activity access$getActivity$p(OneErrorService oneErrorService) {
        return oneErrorService.f84991a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m19223b(OneErrorService oneErrorService, OneCustomDialogBox.Callback callback, String str, Throwable th2) {
        m19208q(oneErrorService, callback, str, th2);
    }

    /* renamed from: c */
    public static /* synthetic */ ObservableSource m19222c(Function1 function1, Object obj) {
        return m19217h(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19221d(Function1 function1, Object obj) {
        m19214k(function1, obj);
    }

    public static /* synthetic */ void defaultHandleException$default(OneErrorService oneErrorService, int i, Throwable th2, OneErrorDialogBox.Callback callback, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                callback = null;
            }
            oneErrorService.defaultHandleException(i, th2, callback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultHandleException");
    }

    /* renamed from: e */
    public static /* synthetic */ void m19220e(Function1 function1, Object obj) {
        m19215j(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19219f(OneErrorService oneErrorService, Throwable th2) {
        m19216i(oneErrorService, th2);
    }

    /* renamed from: h */
    public static final ObservableSource m19217h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleExceptionCallback$default(OneErrorService oneErrorService, Throwable th2, ExceptionHandler[] exceptionHandlerArr, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            oneErrorService.handleExceptionCallback(th2, exceptionHandlerArr, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleExceptionCallback");
    }

    /* renamed from: i */
    public static final void m19216i(OneErrorService this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDialog(this$0.f84991a.getString(R.string.error_message_authorization), this$0.m19218g(), th2);
    }

    /* renamed from: j */
    public static final void m19215j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m19214k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m19208q(OneErrorService this$0, OneCustomDialogBox.Callback callback, String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this$0.f84991a, R.style.AppTheme);
        DtacProgressDialog.forceCancel();
        OneCustomDialogBox oneCustomDialogBox = new OneCustomDialogBox(contextThemeWrapper, callback);
        oneCustomDialogBox.setMessage(str);
        oneCustomDialogBox.showDateTime();
        try {
            Intrinsics.checkNotNull(th2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.error.ServerErrorException");
            oneCustomDialogBox.setErrorInformation(((ServerErrorException) th2).error().getStatusCode());
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("ServerErrorException class cast error : ");
            sb.append(message);
        }
        oneCustomDialogBox.show();
    }

    /* renamed from: r */
    public static final void m19207r(OneErrorService this$0, OneErrorDialogBox.Callback callback, String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this$0.f84991a, R.style.AppTheme);
        DtacProgressDialog.forceCancel();
        OneErrorDialogBox oneErrorDialogBox = new OneErrorDialogBox(contextThemeWrapper, callback);
        oneErrorDialogBox.setMessage(str);
        String company = this$0.f84997g.getCompany();
        try {
            Intrinsics.checkNotNull(th2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.error.ServerErrorException");
            ErrorCollection error = ((ServerErrorException) th2).error();
            oneErrorDialogBox.setErrorInformation(error.getStatusCode());
            String responseDateTime = error.getResponseDateTime();
            if (responseDateTime != null && responseDateTime.length() != 0) {
                String responseDateTime2 = error.getResponseDateTime();
                Intrinsics.checkNotNull(responseDateTime2);
                oneErrorDialogBox.showServerDateTime(responseDateTime2);
            }
            String username = error.getUsername();
            if (username != null && username.length() != 0) {
                String username2 = error.getUsername();
                if (username2 == null) {
                    username2 = "";
                }
                oneErrorDialogBox.showUsername(username2 + " (" + company + ")");
            }
            String systemMessage = error.getSystemMessage();
            if (systemMessage != null && systemMessage.length() != 0) {
                String systemMessage2 = error.getSystemMessage();
                Intrinsics.checkNotNull(systemMessage2);
                oneErrorDialogBox.showSystemMessage(systemMessage2);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("ServerErrorException class cast error : ");
            sb.append(message);
        }
        oneErrorDialogBox.show();
    }

    public static /* synthetic */ void showErrorDialog$default(OneErrorService oneErrorService, String str, Throwable th2, OneErrorDialogBox.Callback callback, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                callback = null;
            }
            oneErrorService.showErrorDialog(str, th2, callback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorDialog");
    }

    @SuppressLint({"RxLeakedSubscription", "CheckResult"})
    public final void defaultHandleException(int i, @Nullable final Throwable th2, @Nullable OneErrorDialogBox.Callback callback) {
        if (i == 401) {
            m19206s();
            Observable<Boolean> deleteAllCache = this.f84994d.deleteAllCache();
            final OneErrorService$defaultHandleException$1 oneErrorService$defaultHandleException$1 = OneErrorService$defaultHandleException$1.INSTANCE;
            Observable<Boolean> doOnComplete = deleteAllCache.onErrorResumeNext(new Function() { // from class: KS0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return OneErrorService.m19222c(oneErrorService$defaultHandleException$1, obj);
                }
            }).doOnComplete(new Action() { // from class: LS0
                {
                    OneErrorService.this = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    OneErrorService.m19219f(OneErrorService.this, th2);
                }
            });
            final OneErrorService$defaultHandleException$3 oneErrorService$defaultHandleException$3 = OneErrorService$defaultHandleException$3.INSTANCE;
            Consumer<? super Boolean> consumer = new Consumer() { // from class: MS0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneErrorService.m19220e(oneErrorService$defaultHandleException$3, obj);
                }
            };
            final OneErrorService$defaultHandleException$4 oneErrorService$defaultHandleException$4 = OneErrorService$defaultHandleException$4.INSTANCE;
            doOnComplete.subscribe(consumer, new Consumer() { // from class: NS0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneErrorService.m19221d(oneErrorService$defaultHandleException$4, obj);
                }
            });
        } else if (i == 403) {
            showDialog(getErrorMessage(th2), m19211n(), th2);
        } else {
            showErrorDialog(getErrorMessage(th2), th2, callback);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.co.dtac.android.dtacone.manager.service.OneErrorService$callbackDialog$1] */
    /* renamed from: g */
    public final OneErrorService$callbackDialog$1 m19218g() {
        return new OneCustomDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.manager.service.OneErrorService$callbackDialog$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox.Callback
            public void onButtonClick() {
                PreferencesRepository preferencesRepository;
                Activity activity;
                TemporaryCache temporaryCache;
                Activity activity2;
                Activity activity3;
                TemporaryCache temporaryCache2;
                preferencesRepository = OneErrorService.this.f84996f;
                preferencesRepository.setBoolean(Constant.PREF_WHAT_NEW_LATER, false);
                activity = OneErrorService.this.f84991a;
                Intent intent = new Intent(activity, SigninActivity.class);
                intent.addFlags(335544320);
                intent.addFlags(32768);
                temporaryCache = OneErrorService.this.f84993c;
                if (StringUtil.hasText(temporaryCache.getRetailerNumber())) {
                    temporaryCache2 = OneErrorService.this.f84993c;
                    intent.putExtra("EXTRA_PHONE_NUMBER", temporaryCache2.getRetailerNumber());
                }
                intent.putExtra(SigninActivity.EXTRA_FORWARD_PAGE, TrackerConstant.LOGIN_LOGIN);
                activity2 = OneErrorService.this.f84991a;
                activity2.startActivity(intent);
                activity3 = OneErrorService.this.f84991a;
                activity3.finish();
            }
        };
    }

    @Nullable
    public final String getErrorCode(@Nullable Throwable th2) {
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getStatusCode();
        }
        return "";
    }

    @Nullable
    public final String getErrorMessage(@Nullable Throwable th2) {
        if (th2 instanceof InterruptedIOException) {
            return this.f84991a.getString(R.string.request_timeout_try_again);
        }
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getDescription();
        }
        if (th2 instanceof HttpException) {
            return this.f84991a.getString(R.string.server_error_try_again);
        }
        if (th2 instanceof IOException) {
            return this.f84991a.getString(R.string.connection_error_try_again);
        }
        if (th2 instanceof ValidatedRuleException) {
            return this.f84991a.getString(((ValidatedRuleException) th2).getResId());
        }
        return this.f84991a.getString(R.string.unknow_error_please_try_again);
    }

    @Nullable
    public final String getErrorTime(@Nullable Throwable th2) {
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getResponseDateTime();
        }
        return "";
    }

    @Nullable
    public final String getSystemMessage(@Nullable Throwable th2) {
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getSystemMessage();
        }
        return "";
    }

    public final void handleException(@Nullable Throwable th2, @NotNull ExceptionHandler... handlers) {
        int i;
        ServerErrorException serverErrorException;
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException m19210o = m19210o(th2);
        if (m19210o != null) {
            serverErrorException = m19210o;
        } else {
            serverErrorException = th2;
        }
        boolean z = false;
        for (ExceptionHandler exceptionHandler : handlers) {
            if (exceptionHandler.supportHttpCode(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("User custom HttpExceptionHandler to handle HttpException code: ");
                sb.append(i);
                exceptionHandler.handle(serverErrorException);
                z = true;
            }
        }
        if (!z) {
            defaultHandleException$default(this, i, serverErrorException, null, 4, null);
        }
    }

    public final void handleExceptionCallback(@Nullable Throwable th2, @NotNull ExceptionHandler[] handlers, @Nullable final Function0<Unit> function0) {
        int i;
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException m19210o = m19210o(th2);
        if (m19210o != null) {
            th2 = m19210o;
        }
        boolean z = false;
        for (ExceptionHandler exceptionHandler : handlers) {
            if (exceptionHandler.supportHttpCode(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("User custom HttpExceptionHandler to handle HttpException code: ");
                sb.append(i);
                exceptionHandler.handle(th2);
                z = true;
            }
        }
        if (!z) {
            defaultHandleException(i, th2, new OneErrorDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.manager.service.OneErrorService$handleExceptionCallback$1
                @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox.Callback
                public void onButtonClick() {
                    Function0 function02 = Function0.this;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
    }

    public final void handleExceptionNopopup(@Nullable Throwable th2, @NotNull ExceptionHandler... handlers) {
        int i;
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException m19210o = m19210o(th2);
        if (m19210o != null) {
            th2 = m19210o;
        }
        for (ExceptionHandler exceptionHandler : handlers) {
            if (exceptionHandler.supportHttpCode(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("User custom HttpExceptionHandler to handle HttpException code: ");
                sb.append(i);
                exceptionHandler.handle(th2);
            }
        }
    }

    public final boolean isNumeric(@NotNull String toCheck) {
        Intrinsics.checkNotNullParameter(toCheck, "toCheck");
        for (int i = 0; i < toCheck.length(); i++) {
            if (!Character.isDigit(toCheck.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0077  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final th.p047co.dtac.android.dtacone.model.error.ServerErrorException m19213l(int r8, com.google.gson.JsonObject r9) {
        /*
            r7 = this;
            java.lang.String r0 = "desc"
            boolean r1 = r9.has(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L27
            com.google.gson.JsonElement r1 = r9.get(r0)
            java.lang.String r1 = r1.getAsString()
            java.lang.String r3 = "jsonNode[jsonDesc].asString"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            int r1 = r1.length()
            if (r1 != 0) goto L1e
            goto L27
        L1e:
            com.google.gson.JsonElement r0 = r9.get(r0)
            java.lang.String r0 = r0.getAsString()
            goto L39
        L27:
            java.lang.String r0 = "message"
            boolean r1 = r9.has(r0)
            if (r1 == 0) goto L38
            com.google.gson.JsonElement r0 = r9.get(r0)
            java.lang.String r0 = r0.getAsString()
            goto L39
        L38:
            r0 = r2
        L39:
            java.lang.String r1 = "responseDateTime"
            boolean r3 = r9.has(r1)
            if (r3 == 0) goto L4a
            com.google.gson.JsonElement r1 = r9.get(r1)
            java.lang.String r1 = r1.getAsString()
            goto L4b
        L4a:
            r1 = r2
        L4b:
            java.lang.String r3 = "systemMessage"
            boolean r4 = r9.has(r3)
            if (r4 == 0) goto L5c
            com.google.gson.JsonElement r3 = r9.get(r3)
            java.lang.String r3 = r3.getAsString()
            goto L5d
        L5c:
            r3 = r2
        L5d:
            java.lang.String r4 = "codeType"
            boolean r5 = r9.has(r4)
            if (r5 == 0) goto L6e
            com.google.gson.JsonElement r4 = r9.get(r4)
            java.lang.String r4 = r4.getAsString()
            goto L6f
        L6e:
            r4 = r2
        L6f:
            java.lang.String r5 = "code"
            boolean r6 = r9.has(r5)
            if (r6 == 0) goto L7f
            com.google.gson.JsonElement r9 = r9.get(r5)
            java.lang.String r2 = r9.getAsString()
        L7f:
            th.co.dtac.android.dtacone.model.error.ErrorCollection r9 = new th.co.dtac.android.dtacone.model.error.ErrorCollection
            r9.<init>()
            r9.setStatusCode(r2)
            r9.setDescription(r0)
            r9.setResponseDateTime(r1)
            r9.setSystemMessage(r3)
            r9.setCodeType(r4)
            th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository r0 = r7.f84994d
            th.co.dtac.android.dtacone.model.login.SessionEntity r0 = r0.getSessionNow()
            java.lang.String r0 = r0.getRetailerNumber()
            r9.setUsername(r0)
            th.co.dtac.android.dtacone.model.error.ServerErrorException r0 = new th.co.dtac.android.dtacone.model.error.ServerErrorException
            r0.<init>(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.manager.service.OneErrorService.m19213l(int, com.google.gson.JsonObject):th.co.dtac.android.dtacone.model.error.ServerErrorException");
    }

    /* renamed from: m */
    public final boolean m19212m() {
        return !this.f84991a.isFinishing();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.co.dtac.android.dtacone.manager.service.OneErrorService$killActivity$1] */
    /* renamed from: n */
    public final OneErrorService$killActivity$1 m19211n() {
        return new OneCustomDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.manager.service.OneErrorService$killActivity$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox.Callback
            public void onButtonClick() {
                OneErrorService.access$getActivity$p(OneErrorService.this).finish();
            }
        };
    }

    /* renamed from: o */
    public final ServerErrorException m19210o(Throwable th2) {
        ResponseBody responseBody;
        Reader reader;
        if (th2 instanceof HttpException) {
            HttpException httpException = (HttpException) th2;
            Response<?> response = httpException.response();
            if (response != null) {
                responseBody = response.errorBody();
            } else {
                responseBody = null;
            }
            int code = httpException.code();
            if (responseBody != null) {
                reader = responseBody.charStream();
            } else {
                reader = null;
            }
            ServerErrorException m19209p = m19209p(code, reader);
            if (m19209p != null) {
                return m19209p;
            }
        }
        return null;
    }

    /* renamed from: p */
    public final ServerErrorException m19209p(int i, Reader reader) {
        try {
            JsonObject jsonObject = (JsonObject) this.f84992b.fromJson(reader, (Class<Object>) JsonObject.class);
            if (jsonObject != null) {
                return m19213l(i, jsonObject);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: s */
    public final void m19206s() {
        List emptyList;
        String string = this.f84996f.getString(Constant.SHARE_TOPIC_FIREBASE);
        if (string != null) {
            List<String> split = new Regex(",").split(string, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            for (String str : (String[]) emptyList.toArray(new String[0])) {
                this.f84995e.unsubscribe(str);
            }
        }
    }

    @Deprecated(message = "")
    @UiThread
    public final void showDialog(@Nullable final String str, @Nullable final OneCustomDialogBox.Callback callback, @Nullable final Throwable th2) {
        if (m19212m()) {
            this.f84991a.runOnUiThread(new Runnable() { // from class: JS0
                @Override // java.lang.Runnable
                public final void run() {
                    OneErrorService.m19223b(OneErrorService.this, callback, str, th2);
                }
            });
        }
    }

    @UiThread
    public final void showErrorDialog(@Nullable final String str, @Nullable final Throwable th2, @Nullable final OneErrorDialogBox.Callback callback) {
        if (m19212m()) {
            this.f84991a.runOnUiThread(new Runnable() { // from class: IS0
                @Override // java.lang.Runnable
                public final void run() {
                    OneErrorService.m19224a(OneErrorService.this, callback, str, th2);
                }
            });
        }
    }
}
