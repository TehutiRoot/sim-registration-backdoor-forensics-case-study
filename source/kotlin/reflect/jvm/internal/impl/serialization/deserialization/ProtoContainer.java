package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class ProtoContainer {

    /* renamed from: a */
    public final NameResolver f70067a;

    /* renamed from: b */
    public final TypeTable f70068b;

    /* renamed from: c */
    public final SourceElement f70069c;

    /* loaded from: classes6.dex */
    public static final class Class extends ProtoContainer {

        /* renamed from: d */
        public final ProtoBuf.Class f70070d;

        /* renamed from: e */
        public final Class f70071e;

        /* renamed from: f */
        public final ClassId f70072f;

        /* renamed from: g */
        public final ProtoBuf.Class.Kind f70073g;

        /* renamed from: h */
        public final boolean f70074h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull ProtoBuf.Class classProto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.checkNotNullParameter(classProto, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f70070d = classProto;
            this.f70071e = r6;
            this.f70072f = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
            ProtoBuf.Class.Kind kind = Flags.CLASS_KIND.get(classProto.getFlags());
            this.f70073g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            Boolean bool = Flags.IS_INNER.get(classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "IS_INNER.get(classProto.flags)");
            this.f70074h = bool.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            FqName asSingleFqName = this.f70072f.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(asSingleFqName, "classId.asSingleFqName()");
            return asSingleFqName;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f70072f;
        }

        @NotNull
        public final ProtoBuf.Class getClassProto() {
            return this.f70070d;
        }

        @NotNull
        public final ProtoBuf.Class.Kind getKind() {
            return this.f70073g;
        }

        @Nullable
        public final Class getOuterClass() {
            return this.f70071e;
        }

        public final boolean isInner() {
            return this.f70074h;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Package extends ProtoContainer {

        /* renamed from: d */
        public final FqName f70075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f70075d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            return this.f70075d;
        }
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }

    @NotNull
    public abstract FqName debugFqName();

    @NotNull
    public final NameResolver getNameResolver() {
        return this.f70067a;
    }

    @Nullable
    public final SourceElement getSource() {
        return this.f70069c;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.f70068b;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f70067a = nameResolver;
        this.f70068b = typeTable;
        this.f70069c = sourceElement;
    }
}
