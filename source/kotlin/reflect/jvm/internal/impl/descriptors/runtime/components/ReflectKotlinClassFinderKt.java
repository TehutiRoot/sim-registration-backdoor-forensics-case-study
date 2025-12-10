package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes6.dex */
public final class ReflectKotlinClassFinderKt {
    /* renamed from: a */
    public static final String m28454a(ClassId classId) {
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "relativeClassName.asString()");
        String replace$default = AbstractC20204hN1.replace$default(asString, '.', '$', false, 4, (Object) null);
        if (!classId.getPackageFqName().isRoot()) {
            return classId.getPackageFqName() + '.' + replace$default;
        }
        return replace$default;
    }
}
