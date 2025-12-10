package co.omise.android.p009ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import co.omise.android.AuthorizingPaymentURLVerifier;
import co.omise.android.C5511R;
import co.omise.android.OmiseException;
import co.omise.android.config.UiCustomization;
import co.omise.android.config.UiCustomizationType;
import co.omise.android.models.Authentication;
import co.omise.android.p009ui.AuthorizingPaymentActivity;
import co.omise.android.p009ui.AuthorizingPaymentResult;
import co.omise.android.p009ui.TransactionStatus;
import com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0#2\u0006\u0010$\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010-\u001a\u00020\nH\u0002J\"\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\u0012\u00104\u001a\u00020&2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020&H\u0014J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020:H\u0002J\u0006\u0010;\u001a\u00020&J\u000e\u0010<\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010=\u001a\u00020&H\u0002J\b\u0010>\u001a\u00020&H\u0002J\b\u0010?\u001a\u00020&H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 ¨\u0006A"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "externalActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "isDeepLinkSuccOpened", "", "isWebViewSetup", "threeDSRequestorAppURL", "", "uiCustomization", "Lco/omise/android/config/UiCustomization;", "getUiCustomization", "()Lco/omise/android/config/UiCustomization;", "uiCustomization$delegate", "Lkotlin/Lazy;", "verifier", "Lco/omise/android/AuthorizingPaymentURLVerifier;", "getVerifier", "()Lco/omise/android/AuthorizingPaymentURLVerifier;", "verifier$delegate", "viewModel", "Lco/omise/android/ui/AuthorizingPaymentViewModel;", "getViewModel", "()Lco/omise/android/ui/AuthorizingPaymentViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView$delegate", "createMapFromQueryString", "", "queryString", "finishActivityWithFailure", "", "throwable", "", "finishActivityWithSuccessful", "data", NotificationCompat.CATEGORY_STATUS, "Lco/omise/android/ui/TransactionStatus;", "returnedUrl", "handleExternalActivityResult", "requestCode", "", "resultCode", "handlePaymentAuthorization", "observeData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openDeepLink", "uri", "Landroid/net/Uri;", "setTestWebView", "setViewModelFactory", "setupActionBarTitle", "setupWebView", "setupWebViewClient", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.AuthorizingPaymentActivity */
/* loaded from: classes3.dex */
public final class AuthorizingPaymentActivity extends AppCompatActivity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_AUTHORIZING_PAYMENT_RESULT = "OmiseActivity.authorizingPaymentResult";
    @NotNull
    public static final String EXTRA_THREE_DS_REQUESTOR_APP_URL = "OmiseActivity.threeDSRequestorAppURL";
    @NotNull
    public static final String EXTRA_UI_CUSTOMIZATION = "OmiseActivity.uiCustomization";
    public static final int WEBVIEW_CLOSED_RESULT_CODE = 5;
    private ActivityResultLauncher<Intent> externalActivityLauncher;
    private boolean isDeepLinkSuccOpened;
    private boolean isWebViewSetup;
    private String threeDSRequestorAppURL;
    @Nullable
    private ViewModelProvider.Factory viewModelFactory;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy webView$delegate = LazyKt__LazyJVMKt.lazy(new C5554d());
    @NotNull
    private final Lazy verifier$delegate = LazyKt__LazyJVMKt.lazy(new C5552b());
    @NotNull
    private final Lazy uiCustomization$delegate = LazyKt__LazyJVMKt.lazy(new C5551a());
    @NotNull
    private final Lazy viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AuthorizingPaymentViewModel.class), new AuthorizingPaymentActivity$special$$inlined$viewModels$2(this), new C5553c());

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentActivity$Companion;", "", "()V", "EXTRA_AUTHORIZING_PAYMENT_RESULT", "", "EXTRA_THREE_DS_REQUESTOR_APP_URL", "EXTRA_UI_CUSTOMIZATION", "WEBVIEW_CLOSED_RESULT_CODE", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$WhenMappings */
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Authentication.AuthenticationStatus.values().length];
            iArr[Authentication.AuthenticationStatus.SUCCESS.ordinal()] = 1;
            iArr[Authentication.AuthenticationStatus.CHALLENGE_V1.ordinal()] = 2;
            iArr[Authentication.AuthenticationStatus.CHALLENGE.ordinal()] = 3;
            iArr[Authentication.AuthenticationStatus.FAILED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$a */
    /* loaded from: classes3.dex */
    public static final class C5551a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5551a() {
            super(0);
            AuthorizingPaymentActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final UiCustomization invoke() {
            Parcelable parcelable;
            Object parcelableExtra;
            Intent intent = AuthorizingPaymentActivity.this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra(AuthorizingPaymentActivity.EXTRA_UI_CUSTOMIZATION, UiCustomization.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra(AuthorizingPaymentActivity.EXTRA_UI_CUSTOMIZATION);
                if (!(parcelableExtra2 instanceof UiCustomization)) {
                    parcelableExtra2 = null;
                }
                parcelable = (UiCustomization) parcelableExtra2;
            }
            UiCustomization uiCustomization = (UiCustomization) parcelable;
            if (uiCustomization == null) {
                return UiCustomization.Companion.getDefault();
            }
            return uiCustomization;
        }
    }

    /* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$b */
    /* loaded from: classes3.dex */
    public static final class C5552b extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5552b() {
            super(0);
            AuthorizingPaymentActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AuthorizingPaymentURLVerifier invoke() {
            Intent intent = AuthorizingPaymentActivity.this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            return new AuthorizingPaymentURLVerifier(intent);
        }
    }

    /* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$c */
    /* loaded from: classes3.dex */
    public static final class C5553c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5553c() {
            super(0);
            AuthorizingPaymentActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory factory = AuthorizingPaymentActivity.this.viewModelFactory;
            if (factory == null) {
                AuthorizingPaymentActivity authorizingPaymentActivity = AuthorizingPaymentActivity.this;
                AuthorizingPaymentURLVerifier verifier = authorizingPaymentActivity.getVerifier();
                UiCustomization uiCustomization = AuthorizingPaymentActivity.this.getUiCustomization();
                String str = AuthorizingPaymentActivity.this.threeDSRequestorAppURL;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("threeDSRequestorAppURL");
                    str = null;
                }
                factory = new AuthorizingPaymentViewModelFactory(authorizingPaymentActivity, verifier, uiCustomization, str);
            }
            return factory;
        }
    }

    /* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$d */
    /* loaded from: classes3.dex */
    public static final class C5554d extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5554d() {
            super(0);
            AuthorizingPaymentActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final WebView invoke() {
            return (WebView) AuthorizingPaymentActivity.this._$_findCachedViewById(C5511R.C5514id.authorizing_payment_webview);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m51261A(AuthorizingPaymentActivity authorizingPaymentActivity, Boolean bool) {
        m73926observeData$lambda3(authorizingPaymentActivity, bool);
    }

    public static final /* synthetic */ void access$finishActivityWithSuccessful(AuthorizingPaymentActivity authorizingPaymentActivity, Intent intent) {
        authorizingPaymentActivity.finishActivityWithSuccessful(intent);
    }

    public static final /* synthetic */ AuthorizingPaymentURLVerifier access$getVerifier(AuthorizingPaymentActivity authorizingPaymentActivity) {
        return authorizingPaymentActivity.getVerifier();
    }

    public static final /* synthetic */ void access$openDeepLink(AuthorizingPaymentActivity authorizingPaymentActivity, Uri uri) {
        authorizingPaymentActivity.openDeepLink(uri);
    }

    private final Map<String, String> createMapFromQueryString(String str) {
        List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList<List> arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(split$default, 10));
        for (String str2 : split$default) {
            arrayList.add(StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (List list : arrayList) {
            if (list.size() == 2) {
                linkedHashMap.put((String) list.get(0), (String) list.get(1));
            }
        }
        return linkedHashMap;
    }

    private final void finishActivityWithFailure(Throwable th2) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_AUTHORIZING_PAYMENT_RESULT, new AuthorizingPaymentResult.Failure(th2));
        if (ArraysKt___ArraysKt.contains(new String[]{ChallengeStatus.PROTOCOL_ERROR.getValue(), ChallengeStatus.RUNTIME_ERROR.getValue(), OmiseSDKError.THREE_DS2_INITIALIZATION_FAILED.getValue(), OmiseSDKError.UNABLE_TO_GET_CONFIGS.getValue()}, th2.getMessage())) {
            setupWebView();
            return;
        }
        setResult(-1, intent);
        finish();
    }

    public final void finishActivityWithSuccessful(String str) {
        Intent intent = new Intent();
        intent.putExtra(AuthorizingPaymentURLVerifier.EXTRA_RETURNED_URLSTRING, str);
        intent.putExtra(EXTRA_AUTHORIZING_PAYMENT_RESULT, new AuthorizingPaymentResult.ThreeDS1Completed(str));
        setResult(-1, intent);
        finish();
    }

    public final UiCustomization getUiCustomization() {
        return (UiCustomization) this.uiCustomization$delegate.getValue();
    }

    public final AuthorizingPaymentURLVerifier getVerifier() {
        return (AuthorizingPaymentURLVerifier) this.verifier$delegate.getValue();
    }

    private final AuthorizingPaymentViewModel getViewModel() {
        return (AuthorizingPaymentViewModel) this.viewModel$delegate.getValue();
    }

    private final WebView getWebView() {
        Object value = this.webView$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-webView>(...)");
        return (WebView) value;
    }

    private final void handleExternalActivityResult(int i, int i2, Intent intent) {
        if (i == 300 && this.isDeepLinkSuccOpened) {
            finishActivityWithSuccessful(intent);
        }
    }

    private final void handlePaymentAuthorization() {
        Uri authorizedURL = getVerifier().getAuthorizedURL();
        String query = authorizedURL.getQuery();
        if (query == null) {
            query = "";
        }
        if (Intrinsics.areEqual(createMapFromQueryString(query).get("acs"), "true")) {
            if (getVerifier().verifyExternalURL(authorizedURL)) {
                openDeepLink(authorizedURL);
            }
            observeData();
            return;
        }
        setupWebView();
    }

    private final void observeData() {
        getViewModel().getAuthenticationStatus().observe(this, new Observer() { // from class: J7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthorizingPaymentActivity.m51259w(AuthorizingPaymentActivity.this, (Authentication.AuthenticationStatus) obj);
            }
        });
        getViewModel().isLoading().observe(this, new Observer() { // from class: K7
            {
                AuthorizingPaymentActivity.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthorizingPaymentActivity.m51261A(AuthorizingPaymentActivity.this, (Boolean) obj);
            }
        });
        getViewModel().getError().observe(this, new Observer() { // from class: L7
            {
                AuthorizingPaymentActivity.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthorizingPaymentActivity.m51257y(AuthorizingPaymentActivity.this, (OmiseException) obj);
            }
        });
        getViewModel().getTransactionStatus().observe(this, new Observer() { // from class: M7
            {
                AuthorizingPaymentActivity.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AuthorizingPaymentActivity.m51256z(AuthorizingPaymentActivity.this, (TransactionStatus) obj);
            }
        });
    }

    /* renamed from: observeData$lambda-2 */
    public static final void m73925observeData$lambda2(AuthorizingPaymentActivity this$0, Authentication.AuthenticationStatus authenticationStatus) {
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (authenticationStatus == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[authenticationStatus.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                    } else {
                        this$0.getViewModel().doChallenge(this$0);
                        return;
                    }
                } else {
                    this$0.setupWebView();
                    return;
                }
            } else {
                this$0.finishActivityWithSuccessful(TransactionStatus.AUTHENTICATED);
                return;
            }
        }
        String message = Authentication.AuthenticationStatus.FAILED.getMessage();
        Intrinsics.checkNotNull(message);
        this$0.finishActivityWithFailure(new OmiseException(message, null, 2, null));
    }

    /* renamed from: observeData$lambda-3 */
    public static final void m73926observeData$lambda3(AuthorizingPaymentActivity this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.getViewModel().getTransaction().getProgressView(this$0).showProgress();
        }
    }

    /* renamed from: observeData$lambda-4 */
    public static final void m73927observeData$lambda4(AuthorizingPaymentActivity this$0, OmiseException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.finishActivityWithFailure(it);
    }

    /* renamed from: observeData$lambda-5 */
    public static final void m73928observeData$lambda5(AuthorizingPaymentActivity this$0, TransactionStatus it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.finishActivityWithSuccessful(it);
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m73929onCreate$lambda0(AuthorizingPaymentActivity this$0, ActivityResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        this$0.handleExternalActivityResult(300, result.getResultCode(), result.getData());
    }

    public final void openDeepLink(Uri uri) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            ActivityResultLauncher<Intent> activityResultLauncher = this.externalActivityLauncher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("externalActivityLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(intent);
            z = true;
        } catch (ActivityNotFoundException unused) {
            z = false;
        }
        this.isDeepLinkSuccOpened = z;
    }

    private final void setupActionBarTitle() {
        String string;
        ToolbarCustomization toolbarCustomization;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization = getUiCustomization().getUiCustomizationMap$sdk_productionRelease().get(UiCustomizationType.DEFAULT.getValue());
            if (uiCustomization == null || (toolbarCustomization = uiCustomization.getToolbarCustomization()) == null || (string = toolbarCustomization.getHeaderText()) == null) {
                string = getString(C5511R.C5518string.title_authorizing_payment);
            }
            supportActionBar.setTitle(string);
        }
    }

    private final void setupWebView() {
        this.isWebViewSetup = true;
        setupWebViewClient();
        WebSettings settings = getWebView().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        runOnUiThread(new Runnable() { // from class: N7
            {
                AuthorizingPaymentActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AuthorizingPaymentActivity.m51260v(AuthorizingPaymentActivity.this);
            }
        });
    }

    /* renamed from: setupWebView$lambda-8 */
    public static final void m73930setupWebView$lambda8(AuthorizingPaymentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getVerifier().isReady()) {
            this$0.getWebView().setVisibility(0);
            this$0.getWebView().loadUrl(this$0.getVerifier().getAuthorizedURLString());
        }
    }

    private final void setupWebViewClient() {
        getWebView().setWebViewClient(new WebViewClient() { // from class: co.omise.android.ui.AuthorizingPaymentActivity$setupWebViewClient$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                Uri uri = request.getUrl();
                AuthorizingPaymentURLVerifier access$getVerifier = AuthorizingPaymentActivity.access$getVerifier(AuthorizingPaymentActivity.this);
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                if (access$getVerifier.verifyURL(uri)) {
                    AuthorizingPaymentActivity authorizingPaymentActivity = AuthorizingPaymentActivity.this;
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
                    AuthorizingPaymentActivity.access$finishActivityWithSuccessful(authorizingPaymentActivity, uri2);
                    return true;
                } else if (AuthorizingPaymentActivity.access$getVerifier(AuthorizingPaymentActivity.this).verifyExternalURL(uri)) {
                    AuthorizingPaymentActivity.access$openDeepLink(AuthorizingPaymentActivity.this, uri);
                    return true;
                } else {
                    return false;
                }
            }
        });
        getWebView().setWebChromeClient(new AuthorizingPaymentActivity$setupWebViewClient$2(this));
    }

    /* renamed from: v */
    public static /* synthetic */ void m51260v(AuthorizingPaymentActivity authorizingPaymentActivity) {
        m73930setupWebView$lambda8(authorizingPaymentActivity);
    }

    /* renamed from: w */
    public static /* synthetic */ void m51259w(AuthorizingPaymentActivity authorizingPaymentActivity, Authentication.AuthenticationStatus authenticationStatus) {
        m73925observeData$lambda2(authorizingPaymentActivity, authenticationStatus);
    }

    /* renamed from: x */
    public static /* synthetic */ void m51258x(AuthorizingPaymentActivity authorizingPaymentActivity, ActivityResult activityResult) {
        m73929onCreate$lambda0(authorizingPaymentActivity, activityResult);
    }

    /* renamed from: y */
    public static /* synthetic */ void m51257y(AuthorizingPaymentActivity authorizingPaymentActivity, OmiseException omiseException) {
        m73927observeData$lambda4(authorizingPaymentActivity, omiseException);
    }

    /* renamed from: z */
    public static /* synthetic */ void m51256z(AuthorizingPaymentActivity authorizingPaymentActivity, TransactionStatus transactionStatus) {
        m73928observeData$lambda5(authorizingPaymentActivity, transactionStatus);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra(OmiseActivity.EXTRA_IS_SECURE, true)) {
            getWindow().addFlags(8192);
        }
        setContentView(C5511R.C5515layout.activity_authorizing_payment);
        setupActionBarTitle();
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: O7
            {
                AuthorizingPaymentActivity.this = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AuthorizingPaymentActivity.m51258x(AuthorizingPaymentActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…          )\n            }");
        this.externalActivityLauncher = registerForActivityResult;
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: co.omise.android.ui.AuthorizingPaymentActivity$onCreate$onBackPressedCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
                AuthorizingPaymentActivity.this = this;
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                AuthorizingPaymentActivity.access$finishActivityWithSuccessful(AuthorizingPaymentActivity.this, (Intent) null);
            }
        });
        String stringExtra = getIntent().getStringExtra(EXTRA_THREE_DS_REQUESTOR_APP_URL);
        if (stringExtra == null) {
            finishActivityWithFailure(new OmiseException("The threeDSRequestorAppURL must be provided in the intent", null, 2, null));
            return;
        }
        this.threeDSRequestorAppURL = stringExtra;
        handlePaymentAuthorization();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        getWebView().clearCache(true);
        getWebView().clearHistory();
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        super.onDestroy();
    }

    public final void setTestWebView() {
        getWebView().setWebViewClient(new WebViewClient() { // from class: co.omise.android.ui.AuthorizingPaymentActivity$setTestWebView$1
            @Override // android.webkit.WebViewClient
            public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                Uri uri = Uri.parse(str);
                AuthorizingPaymentURLVerifier access$getVerifier = AuthorizingPaymentActivity.access$getVerifier(AuthorizingPaymentActivity.this);
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                if (access$getVerifier.verifyURL(uri)) {
                    AuthorizingPaymentActivity authorizingPaymentActivity = AuthorizingPaymentActivity.this;
                    Intrinsics.checkNotNull(str);
                    AuthorizingPaymentActivity.access$finishActivityWithSuccessful(authorizingPaymentActivity, str);
                } else if (AuthorizingPaymentActivity.access$getVerifier(AuthorizingPaymentActivity.this).verifyExternalURL(uri)) {
                    AuthorizingPaymentActivity.access$openDeepLink(AuthorizingPaymentActivity.this, uri);
                }
            }
        });
    }

    public final void setViewModelFactory(@NotNull ViewModelProvider.Factory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.viewModelFactory = viewModelFactory;
    }

    public static final /* synthetic */ void access$finishActivityWithSuccessful(AuthorizingPaymentActivity authorizingPaymentActivity, String str) {
        authorizingPaymentActivity.finishActivityWithSuccessful(str);
    }

    private final void finishActivityWithSuccessful(TransactionStatus transactionStatus) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_AUTHORIZING_PAYMENT_RESULT, new AuthorizingPaymentResult.ThreeDS2Completed(transactionStatus));
        setResult(-1, intent);
        finish();
    }

    public final void finishActivityWithSuccessful(Intent intent) {
        setResult(this.isWebViewSetup ? 5 : -1, intent);
        finish();
    }
}
