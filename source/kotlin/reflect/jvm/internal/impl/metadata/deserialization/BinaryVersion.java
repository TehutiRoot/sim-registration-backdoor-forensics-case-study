package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import androidx.core.p005os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
/* loaded from: classes6.dex */
public abstract class BinaryVersion {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int[] f69533a;

    /* renamed from: b */
    public final int f69534b;

    /* renamed from: c */
    public final int f69535c;

    /* renamed from: d */
    public final int f69536d;

    /* renamed from: e */
    public final List f69537e;

    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public BinaryVersion(@NotNull int... numbers) {
        int i;
        int i2;
        List emptyList;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f69533a = numbers;
        Integer orNull = ArraysKt___ArraysKt.getOrNull(numbers, 0);
        if (orNull != null) {
            i = orNull.intValue();
        } else {
            i = -1;
        }
        this.f69534b = i;
        Integer orNull2 = ArraysKt___ArraysKt.getOrNull(numbers, 1);
        if (orNull2 != null) {
            i2 = orNull2.intValue();
        } else {
            i2 = -1;
        }
        this.f69535c = i2;
        Integer orNull3 = ArraysKt___ArraysKt.getOrNull(numbers, 2);
        this.f69536d = orNull3 != null ? orNull3.intValue() : -1;
        if (numbers.length > 3) {
            if (numbers.length <= 1024) {
                emptyList = CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysJvmKt.asList(numbers).subList(3, numbers.length));
            } else {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this.f69537e = emptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.f69534b == binaryVersion.f69534b && this.f69535c == binaryVersion.f69535c && this.f69536d == binaryVersion.f69536d && Intrinsics.areEqual(this.f69537e, binaryVersion.f69537e)) {
                return true;
            }
        }
        return false;
    }

    public final int getMajor() {
        return this.f69534b;
    }

    public final int getMinor() {
        return this.f69535c;
    }

    public int hashCode() {
        int i = this.f69534b;
        int i2 = i + (i * 31) + this.f69535c;
        int i3 = i2 + (i2 * 31) + this.f69536d;
        return i3 + (i3 * 31) + this.f69537e.hashCode();
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.f69534b, version.f69535c, version.f69536d);
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.f69534b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f69535c;
        if (i5 < i2) {
            return true;
        }
        if (i5 <= i2 && this.f69536d <= i3) {
            return true;
        }
        return false;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i = this.f69534b;
        if (i == 0) {
            if (ourVersion.f69534b != 0 || this.f69535c != ourVersion.f69535c) {
                return false;
            }
        } else if (i != ourVersion.f69534b || this.f69535c > ourVersion.f69535c) {
            return false;
        }
        return true;
    }

    @NotNull
    public final int[] toArray() {
        return this.f69533a;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : array) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.f69534b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f69535c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f69536d >= i3;
    }
}
