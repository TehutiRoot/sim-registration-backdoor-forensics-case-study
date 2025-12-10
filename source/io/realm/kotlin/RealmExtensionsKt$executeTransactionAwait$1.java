package io.realm.kotlin;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.kotlin.RealmExtensionsKt", m28800f = "RealmExtensions.kt", m28799i = {0}, m28798l = {142}, m28797m = "executeTransactionAwait", m28796n = {"$this$executeTransactionAwait"}, m28795s = {"L$0"})
/* loaded from: classes5.dex */
public final class RealmExtensionsKt$executeTransactionAwait$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public RealmExtensionsKt$executeTransactionAwait$1(Continuation<? super RealmExtensionsKt$executeTransactionAwait$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RealmExtensionsKt.executeTransactionAwait(null, null, null, this);
    }
}
