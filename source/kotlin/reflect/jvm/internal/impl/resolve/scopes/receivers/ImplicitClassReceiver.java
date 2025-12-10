package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* renamed from: a */
    public final ClassDescriptor f69977a;

    /* renamed from: b */
    public final ImplicitClassReceiver f69978b;

    /* renamed from: c */
    public final ClassDescriptor f69979c;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f69977a = classDescriptor;
        this.f69978b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f69979c = classDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        ImplicitClassReceiver implicitClassReceiver;
        ClassDescriptor classDescriptor = this.f69977a;
        ClassDescriptor classDescriptor2 = null;
        if (obj instanceof ImplicitClassReceiver) {
            implicitClassReceiver = (ImplicitClassReceiver) obj;
        } else {
            implicitClassReceiver = null;
        }
        if (implicitClassReceiver != null) {
            classDescriptor2 = implicitClassReceiver.f69977a;
        }
        return Intrinsics.areEqual(classDescriptor, classDescriptor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.f69977a;
    }

    public int hashCode() {
        return this.f69977a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.f69977a.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }
}
