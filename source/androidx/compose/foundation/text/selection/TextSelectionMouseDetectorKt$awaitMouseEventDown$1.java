package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", m28800f = "TextSelectionMouseDetector.kt", m28799i = {0}, m28798l = {125}, m28797m = "awaitMouseEventDown", m28796n = {"$this$awaitMouseEventDown"}, m28795s = {"L$0"})
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TextSelectionMouseDetectorKt$awaitMouseEventDown$1(Continuation<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60969a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60969a = TextSelectionMouseDetectorKt.m60969a(null, this);
        return m60969a;
    }
}
