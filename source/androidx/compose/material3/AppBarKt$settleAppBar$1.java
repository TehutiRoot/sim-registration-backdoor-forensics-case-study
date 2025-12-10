package androidx.compose.material3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material3.AppBarKt", m28800f = "AppBar.kt", m28799i = {0, 0, 0, 1}, m28798l = {1622, 1638}, m28797m = "settleAppBar", m28796n = {RemoteConfigConstants.ResponseFieldKey.STATE, "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, m28795s = {"L$0", "L$1", "L$2", "L$0"})
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
        Object m60697f;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60697f = AppBarKt.m60697f(null, 0.0f, null, null, this);
        return m60697f;
    }
}
