package androidx.compose.p003ui.text.font;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.ui.text.font.AsyncTypefaceCache", m28800f = "FontListFontFamilyTypefaceAdapter.kt", m28799i = {0, 0, 0}, m28798l = {394}, m28797m = "runCached", m28796n = {"this", Action.KEY_ATTRIBUTE, "forever"}, m28795s = {"L$0", "L$1", "Z$0"})
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
/* loaded from: classes2.dex */
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, Continuation<? super AsyncTypefaceCache$runCached$1> continuation) {
        super(continuation);
        this.this$0 = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runCached(null, null, false, null, this);
    }
}
