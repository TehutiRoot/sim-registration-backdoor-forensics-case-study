package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.Composer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1 */
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$init$3$1$composable$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $className;
    final /* synthetic */ Composer $composer;
    final /* synthetic */ String $methodName;
    final /* synthetic */ Class<? extends PreviewParameterProvider<?>> $parameterProvider;
    final /* synthetic */ int $parameterProviderIndex;
    final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$init$3$1$composable$1(String str, String str2, Composer composer, Class<? extends PreviewParameterProvider<?>> cls, int i, ComposeViewAdapter composeViewAdapter) {
        super(0);
        this.$className = str;
        this.$methodName = str2;
        this.$composer = composer;
        this.$parameterProvider = cls;
        this.$parameterProviderIndex = i;
        this.this$0 = composeViewAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ThreadSafeException threadSafeException;
        Throwable cause;
        try {
            ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
            String str = this.$className;
            String str2 = this.$methodName;
            Composer composer = this.$composer;
            Object[] previewProviderParameters = PreviewUtilsKt.getPreviewProviderParameters(this.$parameterProvider, this.$parameterProviderIndex);
            composableInvoker.invokeComposable(str, str2, composer, Arrays.copyOf(previewProviderParameters, previewProviderParameters.length));
        } catch (Throwable th2) {
            Throwable th3 = th2;
            while ((th3 instanceof ReflectiveOperationException) && (cause = th3.getCause()) != null) {
                th3 = cause;
            }
            threadSafeException = this.this$0.f31594j;
            threadSafeException.set(th3);
            throw th2;
        }
    }
}
