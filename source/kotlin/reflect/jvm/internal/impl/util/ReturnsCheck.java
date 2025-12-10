package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class ReturnsCheck implements Check {

    /* renamed from: a */
    public final String f70373a;

    /* renamed from: b */
    public final Function1 f70374b;

    /* renamed from: c */
    public final String f70375c;

    /* loaded from: classes6.dex */
    public static final class ReturnsBoolean extends ReturnsCheck {
        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1 */
        /* loaded from: classes6.dex */
        public static final class C120121 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final C120121 INSTANCE = new C120121();

            public C120121() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                Intrinsics.checkNotNullExpressionValue(booleanType, "booleanType");
                return booleanType;
            }
        }

        public ReturnsBoolean() {
            super("Boolean", C120121.INSTANCE, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ReturnsInt extends ReturnsCheck {
        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1 */
        /* loaded from: classes6.dex */
        public static final class C120131 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final C120131 INSTANCE = new C120131();

            public C120131() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType intType = kotlinBuiltIns.getIntType();
                Intrinsics.checkNotNullExpressionValue(intType, "intType");
                return intType;
            }
        }

        public ReturnsInt() {
            super("Int", C120131.INSTANCE, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ReturnsUnit extends ReturnsCheck {
        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1 */
        /* loaded from: classes6.dex */
        public static final class C120141 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final C120141 INSTANCE = new C120141();

            public C120141() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType unitType = kotlinBuiltIns.getUnitType();
                Intrinsics.checkNotNullExpressionValue(unitType, "unitType");
                return unitType;
            }
        }

        public ReturnsUnit() {
            super("Unit", C120141.INSTANCE, null);
        }
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.areEqual(functionDescriptor.getReturnType(), this.f70374b.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f70375c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    public ReturnsCheck(String str, Function1 function1) {
        this.f70373a = str;
        this.f70374b = function1;
        this.f70375c = "must return " + str;
    }
}
