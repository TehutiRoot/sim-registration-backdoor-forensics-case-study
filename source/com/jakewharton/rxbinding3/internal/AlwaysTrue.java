package com.jakewharton.rxbinding3.internal;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/internal/AlwaysTrue;", "Lkotlin/Function0;", "", "Lkotlin/Function1;", "", "()V", "invoke", "()Ljava/lang/Boolean;", "ignored", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class AlwaysTrue implements Function0<Boolean>, Function1<Object, Boolean> {
    public static final AlwaysTrue INSTANCE = new AlwaysTrue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public Boolean invoke() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public Boolean invoke(@NotNull Object ignored) {
        Intrinsics.checkParameterIsNotNull(ignored, "ignored");
        return Boolean.TRUE;
    }
}
