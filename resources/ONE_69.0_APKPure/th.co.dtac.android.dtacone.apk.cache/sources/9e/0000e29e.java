package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes6.dex */
public final class ClassicTypeSystemContextKt {
    /* renamed from: a */
    public static final UnwrappedType m27817a(UnwrappedType unwrappedType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(unwrappedType, false, 1, null);
    }

    public static final /* synthetic */ UnwrappedType access$makeDefinitelyNotNullOrNotNullInternal(UnwrappedType unwrappedType) {
        return m27817a(unwrappedType);
    }
}