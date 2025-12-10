package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class ClassData {

    /* renamed from: a */
    public final NameResolver f70005a;

    /* renamed from: b */
    public final ProtoBuf.Class f70006b;

    /* renamed from: c */
    public final BinaryVersion f70007c;

    /* renamed from: d */
    public final SourceElement f70008d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class classProto, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f70005a = nameResolver;
        this.f70006b = classProto;
        this.f70007c = metadataVersion;
        this.f70008d = sourceElement;
    }

    @NotNull
    public final NameResolver component1() {
        return this.f70005a;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.f70006b;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.f70007c;
    }

    @NotNull
    public final SourceElement component4() {
        return this.f70008d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassData) {
            ClassData classData = (ClassData) obj;
            return Intrinsics.areEqual(this.f70005a, classData.f70005a) && Intrinsics.areEqual(this.f70006b, classData.f70006b) && Intrinsics.areEqual(this.f70007c, classData.f70007c) && Intrinsics.areEqual(this.f70008d, classData.f70008d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f70005a.hashCode() * 31) + this.f70006b.hashCode()) * 31) + this.f70007c.hashCode()) * 31) + this.f70008d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.f70005a + ", classProto=" + this.f70006b + ", metadataVersion=" + this.f70007c + ", sourceElement=" + this.f70008d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
