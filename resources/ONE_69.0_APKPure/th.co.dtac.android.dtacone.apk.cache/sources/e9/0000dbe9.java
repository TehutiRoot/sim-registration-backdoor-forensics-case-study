package kotlin.reflect;

import ch.qos.logback.classic.spi.CallerData;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class WildcardTypeImpl implements WildcardType, Type {

    /* renamed from: c */
    public static final Companion f68380c = new Companion(null);

    /* renamed from: d */
    public static final WildcardTypeImpl f68381d = new WildcardTypeImpl(null, null);

    /* renamed from: a */
    public final Type f68382a;

    /* renamed from: b */
    public final Type f68383b;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WildcardTypeImpl getSTAR() {
            return WildcardTypeImpl.f68381d;
        }

        public Companion() {
        }
    }

    public WildcardTypeImpl(Type type, Type type2) {
        this.f68382a = type;
        this.f68383b = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f68383b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m29011e;
        String m29011e2;
        if (this.f68383b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            m29011e2 = TypesJVMKt.m29011e(this.f68383b);
            sb.append(m29011e2);
            return sb.toString();
        }
        Type type = this.f68382a;
        if (type != null && !Intrinsics.areEqual(type, Object.class)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? extends ");
            m29011e = TypesJVMKt.m29011e(this.f68382a);
            sb2.append(m29011e);
            return sb2.toString();
        }
        return CallerData.f39637NA;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f68382a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}