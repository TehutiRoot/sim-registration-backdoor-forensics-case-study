package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$1", m29092f = "UpPassFormWebView.kt", m29091i = {}, m29090l = {57}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$1 */
/* loaded from: classes10.dex */
public final class UpPassFormWebViewKt$UpPassFormWebView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $alertMessage$delegate;
    final /* synthetic */ MutableState<JsResult> $alertResult$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isWebViewReady$delegate;
    final /* synthetic */ Function0<Unit> $onFailed;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ MutableState<Boolean> $showAlertDialog$delegate;
    final /* synthetic */ WebViewController $webCtrl;
    final /* synthetic */ MutableState<WebView> $webView$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormWebViewKt$UpPassFormWebView$1(WebViewController webViewController, Context context, MutableState<WebView> mutableState, MutableState<Boolean> mutableState2, Function0<Unit> function0, Function0<Unit> function02, MutableState<String> mutableState3, MutableState<JsResult> mutableState4, MutableState<Boolean> mutableState5, Continuation<? super UpPassFormWebViewKt$UpPassFormWebView$1> continuation) {
        super(2, continuation);
        this.$webCtrl = webViewController;
        this.$context = context;
        this.$webView$delegate = mutableState;
        this.$isWebViewReady$delegate = mutableState2;
        this.$onSuccess = function0;
        this.$onFailed = function02;
        this.$alertMessage$delegate = mutableState3;
        this.$alertResult$delegate = mutableState4;
        this.$showAlertDialog$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassFormWebViewKt$UpPassFormWebView$1(this.$webCtrl, this.$context, this.$webView$delegate, this.$isWebViewReady$delegate, this.$onSuccess, this.$onFailed, this.$alertMessage$delegate, this.$alertResult$delegate, this.$showAlertDialog$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        WebView m9107b;
        WebView m9107b2;
        UpPassFormWebViewKt$createWebViewClient$1 m9097l;
        UpPassFormWebViewKt$createWebChromeClient$1 m9098k;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            m9107b = UpPassFormWebViewKt.m9107b(this.$webView$delegate);
            UpPassFormWebViewKt.m9095n(m9107b);
            m9107b2 = UpPassFormWebViewKt.m9107b(this.$webView$delegate);
            UpPassFormWebViewKt.m9096m(m9107b2);
            WebViewController webViewController = this.$webCtrl;
            if (webViewController != null) {
                webViewController.stopCamera();
            }
            WebViewController webViewController2 = this.$webCtrl;
            if (webViewController2 != null) {
                webViewController2.destroy();
            }
            UpPassFormWebViewKt.m9106c(this.$webView$delegate, null);
            UpPassFormWebViewKt.m9104e(this.$isWebViewReady$delegate, false);
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        try {
            WebView webView = new WebView(this.$context);
            Function0<Unit> function0 = this.$onSuccess;
            Function0<Unit> function02 = this.$onFailed;
            MutableState<String> mutableState = this.$alertMessage$delegate;
            MutableState<JsResult> mutableState2 = this.$alertResult$delegate;
            MutableState<Boolean> mutableState3 = this.$showAlertDialog$delegate;
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setCacheMode(-1);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(false);
            webView.clearCache(true);
            m9097l = UpPassFormWebViewKt.m9097l(function0, function02);
            webView.setWebViewClient(m9097l);
            m9098k = UpPassFormWebViewKt.m9098k(new UpPassFormWebViewKt$UpPassFormWebView$1$newWebView$1$2(mutableState, mutableState2, mutableState3));
            webView.setWebChromeClient(m9098k);
            webView.canGoForward();
            webView.canGoBack();
            UpPassFormWebViewKt.m9106c(this.$webView$delegate, webView);
            WebViewController webViewController3 = this.$webCtrl;
            if (webViewController3 != null) {
                webViewController3.bind(webView);
            }
            UpPassFormWebViewKt.m9104e(this.$isWebViewReady$delegate, true);
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            String str3 = Build.VERSION.RELEASE;
            StringBuilder sb = new StringBuilder();
            sb.append("WebView created successfully on ");
            sb.append(str);
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(str2);
            sb.append(" Android ");
            sb.append(str3);
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to create WebView: ");
            sb2.append(message);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassFormWebViewKt$UpPassFormWebView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}