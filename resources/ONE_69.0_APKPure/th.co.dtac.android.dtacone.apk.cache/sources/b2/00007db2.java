package coil.compose;

import coil.compose.AsyncImagePainter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcoil/compose/AsyncImagePainter$State;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt$onStateOf$1 extends Lambda implements Function1<AsyncImagePainter.State, Unit> {
    final /* synthetic */ Function1<AsyncImagePainter.State.Error, Unit> $onError;
    final /* synthetic */ Function1<AsyncImagePainter.State.Loading, Unit> $onLoading;
    final /* synthetic */ Function1<AsyncImagePainter.State.Success, Unit> $onSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UtilsKt$onStateOf$1(Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13) {
        super(1);
        this.$onLoading = function1;
        this.$onSuccess = function12;
        this.$onError = function13;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AsyncImagePainter.State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            Function1<AsyncImagePainter.State.Loading, Unit> function1 = this.$onLoading;
            if (function1 != null) {
                function1.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Success) {
            Function1<AsyncImagePainter.State.Success, Unit> function12 = this.$onSuccess;
            if (function12 != null) {
                function12.invoke(state);
            }
        } else if (!(state instanceof AsyncImagePainter.State.Error)) {
            boolean z = state instanceof AsyncImagePainter.State.Empty;
        } else {
            Function1<AsyncImagePainter.State.Error, Unit> function13 = this.$onError;
            if (function13 != null) {
                function13.invoke(state);
            }
        }
    }
}