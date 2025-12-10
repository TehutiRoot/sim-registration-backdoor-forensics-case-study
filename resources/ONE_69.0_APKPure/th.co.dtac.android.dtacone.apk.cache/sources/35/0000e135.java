package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class TypedArrayValue extends ArrayValue {

    /* renamed from: c */
    public final KotlinType f69951c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$1 */
    /* loaded from: classes6.dex */
    public static final class C119281 extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
        final /* synthetic */ KotlinType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119281(KotlinType kotlinType) {
            super(1);
            this.$type = kotlinType;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        super(value, new C119281(type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f69951c = type;
    }

    @NotNull
    public final KotlinType getType() {
        return this.f69951c;
    }
}