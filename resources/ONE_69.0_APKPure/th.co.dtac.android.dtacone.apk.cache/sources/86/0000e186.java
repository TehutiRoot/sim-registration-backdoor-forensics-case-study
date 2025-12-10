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
    public final NameResolver f70039a;

    /* renamed from: b */
    public final ProtoBuf.Class f70040b;

    /* renamed from: c */
    public final BinaryVersion f70041c;

    /* renamed from: d */
    public final SourceElement f70042d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class classProto, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f70039a = nameResolver;
        this.f70040b = classProto;
        this.f70041c = metadataVersion;
        this.f70042d = sourceElement;
    }

    @NotNull
    public final NameResolver component1() {
        return this.f70039a;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.f70040b;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.f70041c;
    }

    @NotNull
    public final SourceElement component4() {
        return this.f70042d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassData) {
            ClassData classData = (ClassData) obj;
            return Intrinsics.areEqual(this.f70039a, classData.f70039a) && Intrinsics.areEqual(this.f70040b, classData.f70040b) && Intrinsics.areEqual(this.f70041c, classData.f70041c) && Intrinsics.areEqual(this.f70042d, classData.f70042d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f70039a.hashCode() * 31) + this.f70040b.hashCode()) * 31) + this.f70041c.hashCode()) * 31) + this.f70042d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.f70039a + ", classProto=" + this.f70040b + ", metadataVersion=" + this.f70041c + ", sourceElement=" + this.f70042d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}