package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class JvmType {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static final Primitive f69302a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* renamed from: b */
    public static final Primitive f69303b = new Primitive(JvmPrimitiveType.CHAR);

    /* renamed from: c */
    public static final Primitive f69304c = new Primitive(JvmPrimitiveType.BYTE);

    /* renamed from: d */
    public static final Primitive f69305d = new Primitive(JvmPrimitiveType.SHORT);

    /* renamed from: e */
    public static final Primitive f69306e = new Primitive(JvmPrimitiveType.INT);

    /* renamed from: f */
    public static final Primitive f69307f = new Primitive(JvmPrimitiveType.FLOAT);

    /* renamed from: g */
    public static final Primitive f69308g = new Primitive(JvmPrimitiveType.LONG);

    /* renamed from: h */
    public static final Primitive f69309h = new Primitive(JvmPrimitiveType.DOUBLE);

    /* loaded from: classes6.dex */
    public static final class Array extends JvmType {

        /* renamed from: i */
        public final JvmType f69310i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType elementType) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.f69310i = elementType;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.f69310i;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.f69302a;
        }

        @NotNull
        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.f69304c;
        }

        @NotNull
        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.f69303b;
        }

        @NotNull
        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.f69309h;
        }

        @NotNull
        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f69307f;
        }

        @NotNull
        public final Primitive getINT$descriptors_jvm() {
            return JvmType.f69306e;
        }

        @NotNull
        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.f69308g;
        }

        @NotNull
        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.f69305d;
        }

        public Companion() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Object extends JvmType {

        /* renamed from: i */
        public final String f69311i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(@NotNull String internalName) {
            super(null);
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.f69311i = internalName;
        }

        @NotNull
        public final String getInternalName() {
            return this.f69311i;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Primitive extends JvmType {

        /* renamed from: i */
        public final JvmPrimitiveType f69312i;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f69312i = jvmPrimitiveType;
        }

        @Nullable
        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.f69312i;
        }
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.f69313a.toString(this);
    }

    public JvmType() {
    }
}
