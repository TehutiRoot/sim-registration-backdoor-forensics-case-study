package coil.compose;

import androidx.compose.p003ui.graphics.painter.Painter;
import coil.compose.AsyncImagePainter;
import coil.request.NullRequestDataException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "Lcoil/compose/AsyncImagePainter$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt$transformOf$1 extends Lambda implements Function1<AsyncImagePainter.State, AsyncImagePainter.State> {
    final /* synthetic */ Painter $error;
    final /* synthetic */ Painter $fallback;
    final /* synthetic */ Painter $placeholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$transformOf$1(Painter painter, Painter painter2, Painter painter3) {
        super(1);
        this.$placeholder = painter;
        this.$fallback = painter2;
        this.$error = painter3;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final AsyncImagePainter.State invoke(@NotNull AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            Painter painter = this.$placeholder;
            AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
            return painter != null ? loading.copy(painter) : loading;
        } else if (state instanceof AsyncImagePainter.State.Error) {
            AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
            if (error.getResult().getThrowable() instanceof NullRequestDataException) {
                Painter painter2 = this.$fallback;
                return painter2 != null ? AsyncImagePainter.State.Error.copy$default(error, painter2, null, 2, null) : error;
            }
            Painter painter3 = this.$error;
            return painter3 != null ? AsyncImagePainter.State.Error.copy$default(error, painter3, null, 2, null) : error;
        } else {
            return state;
        }
    }
}