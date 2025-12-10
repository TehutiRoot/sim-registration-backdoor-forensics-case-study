package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* renamed from: a */
    public final ClassDescriptor f70011a;

    /* renamed from: b */
    public final ImplicitClassReceiver f70012b;

    /* renamed from: c */
    public final ClassDescriptor f70013c;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f70011a = classDescriptor;
        this.f70012b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f70013c = classDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        ImplicitClassReceiver implicitClassReceiver;
        ClassDescriptor classDescriptor = this.f70011a;
        ClassDescriptor classDescriptor2 = null;
        if (obj instanceof ImplicitClassReceiver) {
            implicitClassReceiver = (ImplicitClassReceiver) obj;
        } else {
            implicitClassReceiver = null;
        }
        if (implicitClassReceiver != null) {
            classDescriptor2 = implicitClassReceiver.f70011a;
        }
        return Intrinsics.areEqual(classDescriptor, classDescriptor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.f70011a;
    }

    public int hashCode() {
        return this.f70011a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.f70011a.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }
}