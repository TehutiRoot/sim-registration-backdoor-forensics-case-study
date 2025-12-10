package th.p047co.dtac.android.dtacone.manager.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import androidx.annotation.UiThread;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Reader;
import javax.inject.Inject;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import retrofit2.HttpException;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
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
/* renamed from: th.co.dtac.android.dtacone.manager.service.ServerErrorService */
/* loaded from: classes7.dex */
public class ServerErrorService {

    /* renamed from: a */
    public Activity f85020a;

    /* renamed from: b */
    public Gson f85021b;

    /* renamed from: c */
    public RtrRepository f85022c;

    /* renamed from: d */
    public RtrRx2Repository f85023d;

    /* renamed from: e */
    public PreferencesRepository f85024e;

    /* renamed from: f */
    public TemporaryCache f85025f;

    /* renamed from: g */
    public FirebaseMessagingTopic f85026g;

    /* renamed from: th.co.dtac.android.dtacone.manager.service.ServerErrorService$ExceptionHandler */
    /* loaded from: classes7.dex */
    public interface ExceptionHandler {
        void handle(Throwable th2);

        boolean supportHttpCode(int i);
    }

    @Inject
    public ServerErrorService(Activity activity, Gson gson, TemporaryCache temporaryCache, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesRepository preferencesRepository) {
        this.f85020a = activity;
        this.f85021b = gson;
        this.f85025f = temporaryCache;
        this.f85022c = rtrRepository;
        this.f85023d = rtrRx2Repository;
        this.f85026g = firebaseMessagingTopic;
        this.f85024e = preferencesRepository;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19171a(ServerErrorService serverErrorService, CustomDialogBox.Callback callback, String str, Throwable th2) {
        serverErrorService.m19154r(callback, str, th2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19170b(ServerErrorService serverErrorService) {
        serverErrorService.m19159m();
    }

    /* renamed from: c */
    public static /* synthetic */ void m19169c(ServerErrorService serverErrorService, Throwable th2) {
        serverErrorService.m19158n(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19168d(ServerErrorService serverErrorService, ErrorDialogBox.Callback callback, String str, Throwable th2) {
        serverErrorService.m19153s(callback, str, th2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19167e(ServerErrorService serverErrorService) {
        serverErrorService.m19155q();
    }

    /* renamed from: g */
    public static /* synthetic */ void m19165g(Throwable th2) {
        m19156p(th2);
    }

    /* renamed from: h */
    public static /* synthetic */ void m19164h(Boolean bool) {
        m19157o(bool);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19157o(Boolean bool) {
    }

    /* renamed from: p */
    public static /* synthetic */ void m19156p(Throwable th2) {
    }

    @SuppressLint({"RxLeakedSubscription"})
    public void defaultHandleException(int i, final Throwable th2, Boolean bool) {
        if (i == 401) {
            m19152t();
            this.f85022c.deleteAllCache().onErrorResumeNext(new Func1() { // from class: TF1
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    Observable empty;
                    Throwable th3 = (Throwable) obj;
                    empty = Observable.empty();
                    return empty;
                }
            }).doOnCompleted(new Action0() { // from class: UF1
                {
                    ServerErrorService.this = this;
                }

                @Override // p046rx.functions.Action0
                public final void call() {
                    ServerErrorService.m19169c(ServerErrorService.this, th2);
                }
            }).subscribe(new Action1() { // from class: VF1
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    ServerErrorService.m19164h((Boolean) obj);
                }
            }, new Action1() { // from class: WF1
                @Override // p046rx.functions.Action1
                public final void call(Object obj) {
                    ServerErrorService.m19165g((Throwable) obj);
                }
            });
        } else if (i == 403) {
            showDialog(getErrorMessage(th2), m19161k(), th2);
        } else if (bool.booleanValue()) {
            showErrorDialog(getErrorMessage(th2), null, th2);
        } else {
            showDialog(getErrorMessage(th2), null, th2);
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
            return this.f85020a.getString(R.string.request_timeout_try_again);
        }
        if (th2 instanceof ServerErrorException) {
            return ((ServerErrorException) th2).error().getDescription();
        }
        if (th2 instanceof HttpException) {
            return this.f85020a.getString(R.string.server_error_try_again);
        }
        if (th2 instanceof IOException) {
            return this.f85020a.getString(R.string.connection_error_try_again);
        }
        if (th2 instanceof ValidatedRuleException) {
            return this.f85020a.getString(((ValidatedRuleException) th2).getResId());
        }
        return this.f85020a.getString(R.string.unknow_error_please_try_again);
    }

    public void handleErrorService(Throwable th2, ExceptionHandler... exceptionHandlerArr) {
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
            defaultHandleException(i, th2, Boolean.TRUE);
        }
    }

    public void handleException(Throwable th2, ExceptionHandler... exceptionHandlerArr) {
        int i;
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException parseServerError = parseServerError(th2, false);
        if (parseServerError != null) {
            th2 = parseServerError;
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
            defaultHandleException(i, th2, Boolean.FALSE);
        }
    }

    @Deprecated
    public void handleExceptionWithMessage(Throwable th2, boolean z, ExceptionHandler... exceptionHandlerArr) {
        int i;
        if (th2 instanceof HttpException) {
            i = ((HttpException) th2).code();
        } else {
            i = 0;
        }
        ServerErrorException parseServerError = parseServerError(th2, z);
        if (parseServerError != null) {
            th2 = parseServerError;
        }
        boolean z2 = false;
        for (ExceptionHandler exceptionHandler : exceptionHandlerArr) {
            if (exceptionHandler.supportHttpCode(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("User custom HttpExceptionHandler to handle HttpException code: ");
                sb.append(i);
                exceptionHandler.handle(th2);
                z2 = true;
            }
        }
        if (!z2) {
            defaultHandleException(i, th2, Boolean.FALSE);
        }
    }

    /* renamed from: i */
    public final ServerErrorException m19163i(int i, JsonObject jsonObject) {
        String str;
        String str2;
        String str3;
        String str4 = "";
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
        if (jsonObject.has("codeType")) {
            str4 = jsonObject.get("codeType").getAsString();
        }
        ErrorCollection errorCollection = new ErrorCollection();
        errorCollection.setStatusCode(String.valueOf(i));
        errorCollection.setDescription(str);
        errorCollection.setResponseDateTime(str2);
        errorCollection.setSystemMessage(str3);
        errorCollection.setCodeType(str4);
        errorCollection.setUsername(this.f85023d.getUserSession().getUserName());
        return new ServerErrorException(i, errorCollection);
    }

    /* renamed from: j */
    public final boolean m19162j() {
        return !this.f85020a.isFinishing();
    }

    /* renamed from: k */
    public final CustomDialogBox.Callback m19161k() {
        return new CustomDialogBox.Callback() { // from class: ZF1
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                ServerErrorService.m19167e(ServerErrorService.this);
            }
        };
    }

    /* renamed from: m */
    public final /* synthetic */ void m19159m() {
        this.f85024e.setBoolean(Constant.PREF_WHAT_NEW_LATER, false);
        Intent intent = new Intent(this.f85020a, SigninActivity.class);
        intent.addFlags(335544320);
        intent.addFlags(32768);
        if (StringUtil.hasText(this.f85025f.getRetailerNumber())) {
            intent.putExtra("EXTRA_PHONE_NUMBER", this.f85025f.getRetailerNumber());
        }
        intent.putExtra(SigninActivity.EXTRA_FORWARD_PAGE, TrackerConstant.LOGIN_LOGIN);
        this.f85020a.startActivity(intent);
        this.f85020a.finish();
    }

    /* renamed from: n */
    public final /* synthetic */ void m19158n(Throwable th2) {
        showDialog(getErrorMessage(th2), new CustomDialogBox.Callback() { // from class: YF1
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                ServerErrorService.m19170b(ServerErrorService.this);
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

    public ServerErrorException parseJsonError(int i, Reader reader, boolean z) {
        try {
            JsonObject jsonObject = (JsonObject) this.f85021b.fromJson(reader, (Class<Object>) JsonObject.class);
            if (jsonObject != null) {
                if (jsonObject.has("desc") && !z) {
                    return new ServerErrorException(i, (ErrorCollection) this.f85021b.fromJson((JsonElement) jsonObject, (Class<Object>) ErrorCollection.class));
                }
                if (jsonObject.has("message") && i == 401) {
                    String asString = jsonObject.get("message").getAsString();
                    ErrorCollection errorCollection = new ErrorCollection();
                    errorCollection.setStatusCode(String.valueOf(i));
                    errorCollection.setDescription(asString);
                    return new ServerErrorException(i, errorCollection);
                } else if (jsonObject.has("message") && z) {
                    String asString2 = jsonObject.get("message").getAsString();
                    ErrorCollection errorCollection2 = new ErrorCollection();
                    errorCollection2.setStatusCode(String.valueOf(i));
                    errorCollection2.setDescription(asString2);
                    return new ServerErrorException(i, errorCollection2);
                } else {
                    return null;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ServerErrorException parseJsonErrorService(int i, Reader reader) {
        try {
            JsonObject jsonObject = (JsonObject) this.f85021b.fromJson(reader, (Class<Object>) JsonObject.class);
            if (jsonObject != null) {
                return m19163i(i, jsonObject);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ServerErrorException parseServerError(Throwable th2, boolean z) {
        if (th2 instanceof HttpException) {
            HttpException httpException = (HttpException) th2;
            ServerErrorException parseJsonError = parseJsonError(httpException.code(), httpException.response().errorBody().charStream(), z);
            if (parseJsonError != null) {
                return parseJsonError;
            }
            return null;
        }
        return null;
    }

    /* renamed from: q */
    public final /* synthetic */ void m19155q() {
        this.f85020a.finish();
    }

    /* renamed from: r */
    public final /* synthetic */ void m19154r(CustomDialogBox.Callback callback, String str, Throwable th2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f85020a, R.style.AppTheme);
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
    public final /* synthetic */ void m19153s(ErrorDialogBox.Callback callback, String str, Throwable th2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f85020a, R.style.AppTheme);
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
        if (m19162j()) {
            this.f85020a.runOnUiThread(new Runnable() { // from class: SF1
                @Override // java.lang.Runnable
                public final void run() {
                    ServerErrorService.m19171a(ServerErrorService.this, callback, str, th2);
                }
            });
        }
    }

    @UiThread
    public void showErrorDialog(final String str, final ErrorDialogBox.Callback callback, final Throwable th2) {
        if (m19162j()) {
            this.f85020a.runOnUiThread(new Runnable() { // from class: XF1
                @Override // java.lang.Runnable
                public final void run() {
                    ServerErrorService.m19168d(ServerErrorService.this, callback, str, th2);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m19152t() {
        String string = this.f85024e.getString(Constant.SHARE_TOPIC_FIREBASE);
        if (string != null) {
            for (String str : string.split(",")) {
                this.f85026g.unsubscribe(str);
            }
        }
    }
}
