package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class CheckResult {

    /* renamed from: a */
    public final boolean f70359a;

    /* loaded from: classes6.dex */
    public static final class IllegalFunctionName extends CheckResult {
        @NotNull
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        public IllegalFunctionName() {
            super(false, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class IllegalSignature extends CheckResult {

        /* renamed from: b */
        public final String f70360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(@NotNull String error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f70360b = error;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SuccessCheck extends CheckResult {
        @NotNull
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        public SuccessCheck() {
            super(true, null);
        }
    }

    public /* synthetic */ CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean isSuccess() {
        return this.f70359a;
    }

    public CheckResult(boolean z) {
        this.f70359a = z;
    }
}
