package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    @NotNull
    public static final Companion Companion = Companion.f70315a;

    /* loaded from: classes6.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f70315a = new Companion();

        /* renamed from: b */
        public static final NewKotlinTypeCheckerImpl f70316b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, null);

        @NotNull
        public final NewKotlinTypeCheckerImpl getDefault() {
            return f70316b;
        }
    }

    @NotNull
    KotlinTypeRefiner getKotlinTypeRefiner();

    @NotNull
    OverridingUtil getOverridingUtil();
}
