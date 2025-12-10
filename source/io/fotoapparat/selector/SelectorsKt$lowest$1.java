package io.fotoapparat.selector;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class SelectorsKt$lowest$1 extends FunctionReferenceImpl implements Function1<Iterable<? extends T>, T> {
    public static final SelectorsKt$lowest$1 INSTANCE = new SelectorsKt$lowest$1();

    public SelectorsKt$lowest$1() {
        super(1, CollectionsKt.class, "minOrNull", "minOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;", 1);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Iterable<+TT;>;)TT; */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Comparable invoke(@NotNull Iterable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return CollectionsKt___CollectionsKt.minOrNull((Iterable<? extends Comparable>) p0);
    }
}
