package p000;

import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: ri0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC21973ri0 extends LazyKt__LazyJVMKt {
    @NotNull
    public static <T> Lazy<T> lazyOf(T t) {
        return new InitializedLazyImpl(t);
    }
}
