package co.omise.android.p009ui;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatEditText;
import co.omise.android.C5511R;
import co.omise.android.p009ui.AuthorizingPaymentActivity$setupWebViewClient$2;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, m28850d2 = {"co/omise/android/ui/AuthorizingPaymentActivity$setupWebViewClient$2", "Landroid/webkit/WebChromeClient;", "onJsAlert", "", Promotion.ACTION_VIEW, "Landroid/webkit/WebView;", ImagesContract.URL, "", "message", "result", "Landroid/webkit/JsResult;", "onJsConfirm", "onJsPrompt", "defaultValue", "Landroid/webkit/JsPromptResult;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.AuthorizingPaymentActivity$setupWebViewClient$2 */
/* loaded from: classes3.dex */
public final class AuthorizingPaymentActivity$setupWebViewClient$2 extends WebChromeClient {
    final /* synthetic */ AuthorizingPaymentActivity this$0;

    public AuthorizingPaymentActivity$setupWebViewClient$2(AuthorizingPaymentActivity authorizingPaymentActivity) {
        this.this$0 = authorizingPaymentActivity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m51255a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        m73933onJsConfirm$lambda2(jsResult, dialogInterface, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m51254b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        m73931onJsAlert$lambda0(jsResult, dialogInterface, i);
    }

    /* renamed from: c */
    public static /* synthetic */ void m51253c(JsResult jsResult, DialogInterface dialogInterface) {
        m73935onJsConfirm$lambda4(jsResult, dialogInterface);
    }

    /* renamed from: d */
    public static /* synthetic */ void m51252d(JsResult jsResult, DialogInterface dialogInterface, int i) {
        m73934onJsConfirm$lambda3(jsResult, dialogInterface, i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m51251e(JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
        m73936onJsPrompt$lambda10(jsPromptResult, dialogInterface);
    }

    /* renamed from: f */
    public static /* synthetic */ void m51250f(JsPromptResult jsPromptResult, AppCompatEditText appCompatEditText, DialogInterface dialogInterface, int i) {
        m73937onJsPrompt$lambda8(jsPromptResult, appCompatEditText, dialogInterface, i);
    }

    /* renamed from: g */
    public static /* synthetic */ void m51249g(JsResult jsResult, DialogInterface dialogInterface) {
        m73932onJsAlert$lambda1(jsResult, dialogInterface);
    }

    /* renamed from: h */
    public static /* synthetic */ void m51248h(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i) {
        m73938onJsPrompt$lambda9(jsPromptResult, dialogInterface, i);
    }

    /* renamed from: onJsAlert$lambda-0 */
    public static final void m73931onJsAlert$lambda0(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* renamed from: onJsAlert$lambda-1 */
    public static final void m73932onJsAlert$lambda1(JsResult jsResult, DialogInterface dialogInterface) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* renamed from: onJsConfirm$lambda-2 */
    public static final void m73933onJsConfirm$lambda2(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* renamed from: onJsConfirm$lambda-3 */
    public static final void m73934onJsConfirm$lambda3(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* renamed from: onJsConfirm$lambda-4 */
    public static final void m73935onJsConfirm$lambda4(JsResult jsResult, DialogInterface dialogInterface) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* renamed from: onJsPrompt$lambda-10 */
    public static final void m73936onJsPrompt$lambda10(JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    /* renamed from: onJsPrompt$lambda-8 */
    public static final void m73937onJsPrompt$lambda8(JsPromptResult jsPromptResult, AppCompatEditText promptEditText, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(promptEditText, "$promptEditText");
        if (jsPromptResult != null) {
            jsPromptResult.confirm(String.valueOf(promptEditText.getText()));
        }
    }

    /* renamed from: onJsPrompt$lambda-9 */
    public static final void m73938onJsPrompt$lambda9(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i) {
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable final JsResult jsResult) {
        new AlertDialog.Builder(this.this$0).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: P7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51254b(jsResult, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Q7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51249g(jsResult, dialogInterface);
            }
        }).show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable final JsResult jsResult) {
        new AlertDialog.Builder(this.this$0).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: U7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51255a(jsResult, dialogInterface, i);
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: V7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51252d(jsResult, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: W7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51253c(jsResult, dialogInterface);
            }
        }).show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable final JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(this.this$0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        final AppCompatEditText appCompatEditText = new AppCompatEditText(this.this$0);
        int dimension = (int) appCompatEditText.getResources().getDimension(C5511R.dimen.large_margin);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(dimension, 0, dimension, 0);
        appCompatEditText.setLayoutParams(layoutParams);
        if (str3 != null) {
            appCompatEditText.setText(str3);
        }
        linearLayout.addView(appCompatEditText);
        new AlertDialog.Builder(this.this$0).setView(linearLayout).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: R7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51250f(jsPromptResult, appCompatEditText, dialogInterface, i);
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: S7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51248h(jsPromptResult, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: T7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AuthorizingPaymentActivity$setupWebViewClient$2.m51251e(jsPromptResult, dialogInterface);
            }
        }).show();
        return true;
    }
}
