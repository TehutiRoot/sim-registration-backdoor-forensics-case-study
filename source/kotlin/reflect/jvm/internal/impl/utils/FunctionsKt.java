package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class FunctionsKt {

    /* renamed from: a */
    public static final Function1 f70388a = FunctionsKt$IDENTITY$1.INSTANCE;

    /* renamed from: b */
    public static final Function1 f70389b = FunctionsKt$ALWAYS_TRUE$1.INSTANCE;

    /* renamed from: c */
    public static final Function1 f70390c = FunctionsKt$ALWAYS_NULL$1.INSTANCE;

    /* renamed from: d */
    public static final Function1 f70391d = FunctionsKt$DO_NOTHING$1.INSTANCE;

    /* renamed from: e */
    public static final Function2 f70392e = FunctionsKt$DO_NOTHING_2$1.INSTANCE;

    /* renamed from: f */
    public static final Function3 f70393f = FunctionsKt$DO_NOTHING_3$1.INSTANCE;

    @NotNull
    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return f70389b;
    }

    @NotNull
    public static final Function3<Object, Object, Object, Unit> getDO_NOTHING_3() {
        return f70393f;
    }
}
