package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation.SelectGisLocationScreenKt$SelectGisLocationScreen$1$1 */
/* loaded from: classes10.dex */
public final class SelectGisLocationScreenKt$SelectGisLocationScreen$1$1 extends Lambda implements Function1<Context, WebView> {
    final /* synthetic */ C15405xb1938d0d $customWebViewClient;
    final /* synthetic */ String $url;
    final /* synthetic */ MutableState<WebView> $webView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGisLocationScreenKt$SelectGisLocationScreen$1$1(C15405xb1938d0d c15405xb1938d0d, String str, MutableState<WebView> mutableState) {
        super(1);
        this.$customWebViewClient = c15405xb1938d0d;
        this.$url = str;
        this.$webView$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final WebView invoke(@NotNull Context context) {
        WebView m9547a;
        Intrinsics.checkNotNullParameter(context, "context");
        MutableState<WebView> mutableState = this.$webView$delegate;
        WebView webView = new WebView(context);
        C15405xb1938d0d c15405xb1938d0d = this.$customWebViewClient;
        String str = this.$url;
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(c15405xb1938d0d);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.canGoForward();
        webView.canGoBack();
        webView.loadUrl(str);
        SelectGisLocationScreenKt.m9546b(mutableState, webView);
        m9547a = SelectGisLocationScreenKt.m9547a(this.$webView$delegate);
        Intrinsics.checkNotNull(m9547a);
        return m9547a;
    }
}