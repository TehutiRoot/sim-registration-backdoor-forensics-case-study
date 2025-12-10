package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class NotFoundClasses$classes$1 extends Lambda implements Function1<NotFoundClasses.C11734a, ClassDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ClassDescriptor invoke(@NotNull NotFoundClasses.C11734a c11734a) {
        MemoizedFunctionToNotNull memoizedFunctionToNotNull;
        DeclarationDescriptor declarationDescriptor;
        StorageManager storageManager;
        Intrinsics.checkNotNullParameter(c11734a, "<name for destructuring parameter 0>");
        ClassId m28849a = c11734a.m28849a();
        List m28848b = c11734a.m28848b();
        if (!m28849a.isLocal()) {
            ClassId outerClassId = m28849a.getOuterClassId();
            if (outerClassId == null || (declarationDescriptor = this.this$0.getClass(outerClassId, CollectionsKt___CollectionsKt.drop(m28848b, 1))) == null) {
                memoizedFunctionToNotNull = this.this$0.f68663c;
                FqName packageFqName = m28849a.getPackageFqName();
                Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
                declarationDescriptor = (ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(packageFqName);
            }
            DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
            boolean isNestedClass = m28849a.isNestedClass();
            storageManager = this.this$0.f68661a;
            Name shortClassName = m28849a.getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "classId.shortClassName");
            Integer num = (Integer) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m28848b);
            return new NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, isNestedClass, num != null ? num.intValue() : 0);
        }
        throw new UnsupportedOperationException("Unresolved local class: " + m28849a);
    }
}