package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation.SelectGisLocationScreenKt$SelectGisLocationScreen$2$1 */
/* loaded from: classes10.dex */
public final class SelectGisLocationScreenKt$SelectGisLocationScreen$2$1 extends Lambda implements Function1<WebView, Unit> {
    final /* synthetic */ MutableState<WebView> $webView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGisLocationScreenKt$SelectGisLocationScreen$2$1(MutableState<WebView> mutableState) {
        super(1);
        this.$webView$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull WebView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SelectGisLocationScreenKt.m9546b(this.$webView$delegate, it);
    }
}