package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.webkit.WebView;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUpPassFormWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassFormWebView.kt\nth/co/dtac/android/dtacone/view/compose/upPass/widget/UpPassFormWebViewKt$UpPassFormWebView$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,271:1\n63#2,5:272\n*S KotlinDebug\n*F\n+ 1 UpPassFormWebView.kt\nth/co/dtac/android/dtacone/view/compose/upPass/widget/UpPassFormWebViewKt$UpPassFormWebView$4\n*L\n122#1:272,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$4 */
/* loaded from: classes10.dex */
public final class UpPassFormWebViewKt$UpPassFormWebView$4 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ WebViewController $webCtrl;
    final /* synthetic */ MutableState<WebView> $webView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormWebViewKt$UpPassFormWebView$4(WebViewController webViewController, MutableState<WebView> mutableState) {
        super(1);
        this.$webCtrl = webViewController;
        this.$webView$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final WebViewController webViewController = this.$webCtrl;
        final MutableState<WebView> mutableState = this.$webView$delegate;
        return new DisposableEffectResult() { // from class: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$4$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                WebView m9107b;
                WebView m9107b2;
                m9107b = UpPassFormWebViewKt.m9107b(mutableState);
                UpPassFormWebViewKt.m9095n(m9107b);
                m9107b2 = UpPassFormWebViewKt.m9107b(mutableState);
                UpPassFormWebViewKt.m9096m(m9107b2);
                WebViewController webViewController2 = WebViewController.this;
                if (webViewController2 != null) {
                    webViewController2.stopCamera();
                }
                WebViewController webViewController3 = WebViewController.this;
                if (webViewController3 != null) {
                    webViewController3.destroy();
                }
                UpPassFormWebViewKt.m9106c(mutableState, null);
            }
        };
    }
}