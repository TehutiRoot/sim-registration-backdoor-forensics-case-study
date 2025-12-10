package androidx.compose.material3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.AppBarKt", m29092f = "AppBar.kt", m29091i = {0, 0, 0, 1}, m29090l = {1622, 1638}, m29089m = "settleAppBar", m29088n = {RemoteConfigConstants.ResponseFieldKey.STATE, "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, m29087s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes2.dex */
public final class AppBarKt$settleAppBar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public AppBarKt$settleAppBar$1(Continuation<? super AppBarKt$settleAppBar$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60647f;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60647f = AppBarKt.m60647f(null, 0.0f, null, null, this);
        return m60647f;
    }
}