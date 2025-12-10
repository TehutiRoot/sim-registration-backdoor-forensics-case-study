package th.p047co.dtac.android.dtacone.manager.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import androidx.annotation.UiThread;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Reader;
import javax.inject.Inject;
import retrofit2.HttpException;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.view.activity.login.SigninActivity;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;
import th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox;
import th.p047co.dtac.android.dtacone.widget.loading.DtacProgressDialog;

@PerActivity
/* renamed from: th.co.dtac.android.dtacone.manager.service.MrtrErrorService */
/* loaded from: classes7.dex */
public class MrtrErrorService {

    /* renamed from: a */
    public Activity f84979a;

    /* renamed from: b */
    public Gson f84980b;

    /* renamed from: c */
    public RtrRx2Repository f84981c;

    /* renamed from: d */
    public PreferencesRepository f84982d;

    /* renamed from: e */
    public TemporaryCache f84983e;

    /* renamed from: f */
    public FirebaseMessagingTopic f84984f;

    /* renamed from: th.co.dtac.android.dtacone.manager.service.MrtrErrorService$ExceptionHandler */
    /* loaded from: classes7.dex */
    public interface ExceptionHandler {
        void handle(Throwable th2);

        boolean supportHttpCode(int i);
    }

    @Inject
    public MrtrErrorService(Activity activity, Gson gson, TemporaryCache temporaryCache, RtrRx2Repository rtrRx2Repository, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesRepository preferencesRepository) {
        this.f84979a = activity;
        this.f84980b = gson;
        this.f84983e = temporaryCache;
        this.f84981c = rtrRx2Repository;
        this.f84984f = firebaseMessagingTopic;
        this.f84982d = preferencesRepository;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19244a(MrtrErrorService mrtrErrorService, CustomDialogBox.Callback callback, String str, Throwable th2) {
        mrtrErrorService.m19227r(callback, str, th2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19243b(MrtrErrorService mrtrErrorService) {
        mrtrErrorService.m19232m();
    }

    /* renamed from: c */
    public static /* synthetic */ void m19242c(Boolean bool) {
        m19230o(bool);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19241d(MrtrErrorService mrtrErrorService) {
        mrtrErrorService.m19228q();
    }

    /* renamed from: e */
    public static /* synthetic */ ObservableSource m19240e(Throwable th2) {
        return m19233l(th2);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19239f(Throwable th2) {
        m19229p(th2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m19238g(MrtrErrorService mrtrErrorService, ErrorDialogBox.Callback callback, String str, Throwable th2) {
        mrtrErrorService.m19226s(callback, str, th2);
    }

    /* renamed from: h */
    public static /* synthetic */ void m19237h(MrtrErrorService mrtrErrorService, Throwable th2) {
        mrtrErrorService.m19231n(th2);
    }

    /* renamed from: l */
    public static /* synthetic */ ObservableSource m19233l(Throwable th2) {
        return Observable.just(Boolean.TRUE);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19230o(Boolean bool) {
    }

    /* renamed from: p */
    public static /* synthetic */ void m19229p(Throwable th2) {
    }

    @SuppressLint({"RxLeakedSubscription", "CheckResult"})
    public void defaultHandleException(int i, final Throwable th2, ErrorDialogBox.Callback callback) {
        if (i == 401) {
            m19225t();
            this.f84981c.deleteAllCache().onErrorResumeNext(new Function() { // from class: ov0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MrtrErrorService.m19240e((Throwable) obj);
                }
            }).doOnComplete(new Action() { // from class: pv0
                {
                    MrtrErrorService.this = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    MrtrErrorService.m19237h(MrtrErrorService.this, th2);
                }
            }).subscribe(new Consumer() { // from class: qv0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MrtrErrorService.m19242c((Boolean) obj);
                }
            }, new Consumer() { // from class: rv0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MrtrErrorService.m19239f((Throwable) obj);
                }
            });
        } else if (i == 403) {
            showDialog(getErrorMessage(th2), m19234k(), th2);
        } else {
            showErrorDialog(getErrorMessage(th2), callback, th2);
        }
    }

    public String getErrorCode(Throwable th2) {
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getStatusCode();
        }
        return "";
    }

    public String getErrorMessage(Throwable th2) {
        if (th2 instanceof InterruptedIOException) {
            return this.f84979a.getString(R.string.request_timeout_try_again);
        }
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getDescription();
        }
        if (th2 instanceof HttpException) {
            return this.f84979a.getString(R.string.server_error_try_again);
        }
        if (th2 instanceof IOException) {
            return this.f84979a.getString(R.string.connection_error_try_again);
        }
        if (th2 instanceof ValidatedRuleException) {
            return this.f84979a.getString(((ValidatedRuleException) th2).getResId());
        }
        return this.f84979a.getString(R.string.unknow_error_please_try_again);
    }

    public String getSystemMessage(Throwable th2) {
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getSystemMessage();
        }
        return "";
    }

    public void handleException(Throwable th2, ExceptionHandler... exceptionHandlerArr) {
        int i;
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException parseErrorService = parseErrorService(th2);
        if (parseErrorService != null) {
            th2 = parseErrorService;
        }
        boolean z = false;
        for (ExceptionHandler exceptionHandler : exceptionHandlerArr) {
            if (exceptionHandler.supportHttpCode(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("User custom HttpExceptionHandler to handle HttpException code: ");
                sb.append(i);
                exceptionHandler.handle(th2);
                z = true;
            }
        }
        if (!z) {
            defaultHandleException(i, th2, null);
        }
    }

    public void handleExceptionCallback(Throwable th2, ErrorDialogBox.Callback callback) {
        int i;
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException parseErrorService = parseErrorService(th2);
        if (parseErrorService != null) {
            th2 = parseErrorService;
        }
        defaultHandleException(i, th2, callback);
    }

    /* renamed from: i */
    public final ServerErrorException m19236i(int i, JsonObject jsonObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "";
        if (jsonObject.has("desc") && !jsonObject.get("desc").getAsString().isEmpty()) {
            str = jsonObject.get("desc").getAsString();
        } else if (!jsonObject.has("message")) {
            str = "";
        } else {
            str = jsonObject.get("message").getAsString();
        }
        if (!jsonObject.has("responseDateTime")) {
            str2 = "";
        } else {
            str2 = jsonObject.get("responseDateTime").getAsString();
        }
        if (!jsonObject.has("systemMessage")) {
            str3 = "";
        } else {
            str3 = jsonObject.get("systemMessage").getAsString();
        }
        if (!jsonObject.has("codeType")) {
            str4 = "";
        } else {
            str4 = jsonObject.get("codeType").getAsString();
        }
        if (jsonObject.has("code")) {
            str5 = jsonObject.get("code").getAsString();
        }
        ErrorCollection errorCollection = new ErrorCollection();
        errorCollection.setStatusCode(str5);
        errorCollection.setDescription(str);
        errorCollection.setResponseDateTime(str2);
        errorCollection.setSystemMessage(str3);
        errorCollection.setCodeType(str4);
        errorCollection.setUsername(this.f84981c.getSessionNow().getRetailerNumber());
        return new ServerErrorException(i, errorCollection);
    }

    /* renamed from: j */
    public final boolean m19235j() {
        return !this.f84979a.isFinishing();
    }

    /* renamed from: k */
    public final CustomDialogBox.Callback m19234k() {
        return new CustomDialogBox.Callback() { // from class: vv0
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                MrtrErrorService.m19241d(MrtrErrorService.this);
            }
        };
    }

    /* renamed from: m */
    public final /* synthetic */ void m19232m() {
        this.f84982d.setBoolean(Constant.PREF_WHAT_NEW_LATER, false);
        Intent intent = new Intent(this.f84979a, SigninActivity.class);
        intent.addFlags(335544320);
        intent.addFlags(32768);
        if (StringUtil.hasText(this.f84983e.getRetailerNumber())) {
            intent.putExtra("EXTRA_PHONE_NUMBER", this.f84983e.getRetailerNumber());
        }
        intent.putExtra(SigninActivity.EXTRA_FORWARD_PAGE, TrackerConstant.LOGIN_LOGIN);
        this.f84979a.startActivity(intent);
        this.f84979a.finish();
    }

    /* renamed from: n */
    public final /* synthetic */ void m19231n(Throwable th2) {
        showDialog(getErrorMessage(th2), new CustomDialogBox.Callback() { // from class: uv0
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                MrtrErrorService.m19243b(MrtrErrorService.this);
            }
        }, th2);
    }

    public ServerErrorException parseErrorService(Throwable th2) {
        if (th2 instanceof HttpException) {
            HttpException httpException = (HttpException) th2;
            ServerErrorException parseJsonErrorService = parseJsonErrorService(httpException.code(), httpException.response().errorBody().charStream());
            if (parseJsonErrorService != null) {
                return parseJsonErrorService;
            }
            return null;
        }
        return null;
    }

    public ServerErrorException parseJsonErrorService(int i, Reader reader) {
        try {
            JsonObject jsonObject = (JsonObject) this.f84980b.fromJson(reader, (Class<Object>) JsonObject.class);
            if (jsonObject != null) {
                return m19236i(i, jsonObject);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void m19228q() {
        this.f84979a.finish();
    }

    /* renamed from: r */
    public final /* synthetic */ void m19227r(CustomDialogBox.Callback callback, String str, Throwable th2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f84979a, R.style.AppTheme);
        DtacProgressDialog.forceCancel();
        CustomDialogBox customDialogBox = new CustomDialogBox(contextThemeWrapper, callback);
        customDialogBox.setMessage(str);
        customDialogBox.showDateTime();
        try {
            customDialogBox.setErrorInformation(((ServerErrorException) th2).error().getStatusCode());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ServerErrorException class cast error : ");
            sb.append(e.getMessage());
        }
        customDialogBox.show();
    }

    /* renamed from: s */
    public final /* synthetic */ void m19226s(ErrorDialogBox.Callback callback, String str, Throwable th2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f84979a, R.style.AppTheme);
        DtacProgressDialog.forceCancel();
        ErrorDialogBox errorDialogBox = new ErrorDialogBox(contextThemeWrapper, callback);
        errorDialogBox.setMessage(str);
        try {
            ErrorCollection error = ((ServerErrorException) th2).error();
            errorDialogBox.setErrorInformation(error.getStatusCode());
            if (error.getResponseDateTime() != null) {
                errorDialogBox.showServerDateTime(error.getResponseDateTime());
            }
            if (error.getUsername() != null) {
                errorDialogBox.showUsername(error.getUsername());
            }
            if (error.getSystemMessage() != null) {
                errorDialogBox.showSystemMessage(error.getSystemMessage());
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ServerErrorException class cast error : ");
            sb.append(e.getMessage());
        }
        errorDialogBox.show();
    }

    @UiThread
    @Deprecated
    public void showDialog(final String str, final CustomDialogBox.Callback callback, final Throwable th2) {
        if (m19235j()) {
            this.f84979a.runOnUiThread(new Runnable() { // from class: sv0
                @Override // java.lang.Runnable
                public final void run() {
                    MrtrErrorService.m19244a(MrtrErrorService.this, callback, str, th2);
                }
            });
        }
    }

    @UiThread
    public void showErrorDialog(final String str, final ErrorDialogBox.Callback callback, final Throwable th2) {
        if (m19235j()) {
            this.f84979a.runOnUiThread(new Runnable() { // from class: tv0
                @Override // java.lang.Runnable
                public final void run() {
                    MrtrErrorService.m19238g(MrtrErrorService.this, callback, str, th2);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m19225t() {
        String string = this.f84982d.getString(Constant.SHARE_TOPIC_FIREBASE);
        if (string != null) {
            for (String str : string.split(",")) {
                this.f84984f.unsubscribe(str);
            }
        }
    }
}
