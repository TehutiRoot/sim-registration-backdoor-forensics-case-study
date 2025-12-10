package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.UpPassFormWebViewKt$UpPassFormWebView$2$1 */
/* loaded from: classes10.dex */
public final class UpPassFormWebViewKt$UpPassFormWebView$2$1 extends Lambda implements Function1<Context, WebView> {
    final /* synthetic */ MutableState<WebView> $webView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormWebViewKt$UpPassFormWebView$2$1(MutableState<WebView> mutableState) {
        super(1);
        this.$webView$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final WebView invoke(@NotNull Context it) {
        WebView m9107b;
        Intrinsics.checkNotNullParameter(it, "it");
        m9107b = UpPassFormWebViewKt.m9107b(this.$webView$delegate);
        Intrinsics.checkNotNull(m9107b);
        return m9107b;
    }
}