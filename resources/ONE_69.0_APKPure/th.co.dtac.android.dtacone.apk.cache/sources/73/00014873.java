package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.os.Build;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$3$1 */
/* loaded from: classes10.dex */
public final class UpPassFormWebViewKt$UpPassFormWebView$3$1 extends Lambda implements Function1<WebView, Unit> {
    final /* synthetic */ String $startUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormWebViewKt$UpPassFormWebView$3$1(String str) {
        super(1);
        this.$startUrl = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            String str = this.$startUrl;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            String str4 = Build.VERSION.RELEASE;
            StringBuilder sb = new StringBuilder();
            sb.append("Loading URL: ");
            sb.append(str);
            sb.append(" on ");
            sb.append(str2);
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(str3);
            sb.append(" Android ");
            sb.append(str4);
            view.clearCache(true);
            view.clearHistory();
            view.loadUrl(this.$startUrl);
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error loading URL: ");
            sb2.append(message);
        }
    }
}