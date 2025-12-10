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
    public static final Companion f68346c = new Companion(null);

    /* renamed from: d */
    public static final WildcardTypeImpl f68347d = new WildcardTypeImpl(null, null);

    /* renamed from: a */
    public final Type f68348a;

    /* renamed from: b */
    public final Type f68349b;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WildcardTypeImpl getSTAR() {
            return WildcardTypeImpl.f68347d;
        }

        public Companion() {
        }
    }

    public WildcardTypeImpl(Type type, Type type2) {
        this.f68348a = type;
        this.f68349b = type2;
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
        Type type = this.f68349b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m28719e;
        String m28719e2;
        if (this.f68349b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            m28719e2 = TypesJVMKt.m28719e(this.f68349b);
            sb.append(m28719e2);
            return sb.toString();
        }
        Type type = this.f68348a;
        if (type != null && !Intrinsics.areEqual(type, Object.class)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? extends ");
            m28719e = TypesJVMKt.m28719e(this.f68348a);
            sb2.append(m28719e);
            return sb2.toString();
        }
        return CallerData.f39639NA;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f68348a;
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
