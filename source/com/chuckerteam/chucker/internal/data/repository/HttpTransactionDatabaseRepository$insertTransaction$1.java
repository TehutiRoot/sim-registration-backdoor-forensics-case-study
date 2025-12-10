package com.chuckerteam.chucker.internal.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository", m28800f = "HttpTransactionDatabaseRepository.kt", m28799i = {0}, m28798l = {40}, m28797m = "insertTransaction", m28796n = {"transaction"}, m28795s = {"L$0"})
/* loaded from: classes3.dex */
public final class HttpTransactionDatabaseRepository$insertTransaction$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpTransactionDatabaseRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTransactionDatabaseRepository$insertTransaction$1(HttpTransactionDatabaseRepository httpTransactionDatabaseRepository, Continuation<? super HttpTransactionDatabaseRepository$insertTransaction$1> continuation) {
        super(continuation);
        this.this$0 = httpTransactionDatabaseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.insertTransaction(null, this);
    }
}
