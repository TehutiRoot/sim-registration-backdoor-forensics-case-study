package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.os.Handler;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController$destroy$1 */
/* loaded from: classes10.dex */
public final class WebViewController$destroy$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ WebView $webView;
    final /* synthetic */ WebViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewController$destroy$1(WebViewController webViewController, WebView webView) {
        super(0);
        this.this$0 = webViewController;
        this.$webView = webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(WebViewController this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m9092c(webView);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        long j;
        Handler m9089f;
        long j2;
        try {
            j = this.this$0.f98631a;
            if (j > 0) {
                m9089f = this.this$0.m9089f();
                final WebViewController webViewController = this.this$0;
                final WebView webView = this.$webView;
                Runnable runnable = new Runnable() { // from class: th.co.dtac.android.dtacone.view.compose.upPass.widget.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebViewController$destroy$1.invoke$lambda$0(WebViewController.this, webView);
                    }
                };
                j2 = this.this$0.f98631a;
                m9089f.postDelayed(runnable, j2);
            } else {
                this.this$0.m9092c(this.$webView);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("destroy() error: ");
            sb.append(message);
        }
    }
}