package kotlinx.coroutines.internal;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"LNT1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/coroutines/CoroutineContext$Element;", "element", "invoke", "(LNT1;Lkotlin/coroutines/CoroutineContext$Element;)LNT1;", "<no name provided>"}, m29141k = 3, m29140mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ThreadContextKt$updateState$1 extends Lambda implements Function2<NT1, CoroutineContext.Element, NT1> {
    public static final ThreadContextKt$updateState$1 INSTANCE = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final NT1 invoke(@NotNull NT1 nt1, @NotNull CoroutineContext.Element element) {
        if (element instanceof ThreadContextElement) {
            ThreadContextElement threadContextElement = (ThreadContextElement) element;
            nt1.m67234a(threadContextElement, threadContextElement.updateThreadContext(nt1.f4178a));
        }
        return nt1;
    }
}