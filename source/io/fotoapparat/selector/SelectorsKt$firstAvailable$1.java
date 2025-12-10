package io.fotoapparat.selector;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: Input
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28851d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0002H\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "Output", "Input", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class SelectorsKt$firstAvailable$1 extends Lambda implements Function1<Input, Output> {
    final /* synthetic */ Function1<Input, Output>[] $functions;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0019\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28850d2 = {"<anonymous>", "Output", "Input", "it", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "invoke", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: io.fotoapparat.selector.SelectorsKt$firstAvailable$1$1 */
    /* loaded from: classes5.dex */
    public static final class C104991 extends Lambda implements Function1<?, Output> {
        final /* synthetic */ Input $this_null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104991(Input input) {
            super(1);
            this.$this_null = input;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Function1<? super Input, ? extends Object>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [Output, java.lang.Object] */
        @Nullable
        public final Output invoke(@NotNull Function1<? super Input, ? extends Output> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.invoke(this.$this_null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectorsKt$firstAvailable$1(Function1<? super Input, ? extends Output>[] function1Arr) {
        super(1);
        this.$functions = function1Arr;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Output, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Output invoke(Input input) {
        ?? m30474a;
        m30474a = SelectorsKt.m30474a(this.$functions, new C104991(input));
        return m30474a;
    }
}
