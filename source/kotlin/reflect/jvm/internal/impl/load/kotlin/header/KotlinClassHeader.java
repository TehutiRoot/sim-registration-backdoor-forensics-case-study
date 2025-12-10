package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes6.dex */
public final class KotlinClassHeader {

    /* renamed from: a */
    public final Kind f69333a;

    /* renamed from: b */
    public final JvmMetadataVersion f69334b;

    /* renamed from: c */
    public final String[] f69335c;

    /* renamed from: d */
    public final String[] f69336d;

    /* renamed from: e */
    public final String[] f69337e;

    /* renamed from: f */
    public final String f69338f;

    /* renamed from: g */
    public final int f69339g;

    /* renamed from: h */
    public final String f69340h;

    /* renamed from: i */
    public final byte[] f69341i;

    @SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n8811#2,2:79\n9071#2,4:81\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:79,2\n34#1:81,4\n*E\n"})
    /* loaded from: classes6.dex */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final Map<Integer, Kind> entryById;

        /* renamed from: id */
        private final int f69342id;

        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                if (kind == null) {
                    return Kind.UNKNOWN;
                }
                return kind;
            }

            public Companion() {
            }
        }

        static {
            Kind[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11719c.coerceAtLeast(AbstractC18515Tn0.mapCapacity(values.length), 16));
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.f69342id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i) {
            this.f69342id = i;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull JvmMetadataVersion metadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i, @Nullable String str2, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f69333a = kind;
        this.f69334b = metadataVersion;
        this.f69335c = strArr;
        this.f69336d = strArr2;
        this.f69337e = strArr3;
        this.f69338f = str;
        this.f69339g = i;
        this.f69340h = str2;
        this.f69341i = bArr;
    }

    /* renamed from: a */
    public final boolean m28244a(int i, int i2) {
        return (i & i2) != 0;
    }

    @Nullable
    public final String[] getData() {
        return this.f69335c;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.f69336d;
    }

    @NotNull
    public final Kind getKind() {
        return this.f69333a;
    }

    @NotNull
    public final JvmMetadataVersion getMetadataVersion() {
        return this.f69334b;
    }

    @Nullable
    public final String getMultifileClassName() {
        String str = this.f69338f;
        if (this.f69333a != Kind.MULTIFILE_CLASS_PART) {
            return null;
        }
        return str;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        String[] strArr = this.f69335c;
        List<String> list = null;
        if (this.f69333a != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        if (strArr != null) {
            list = ArraysKt___ArraysJvmKt.asList(strArr);
        }
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    @Nullable
    public final String[] getStrings() {
        return this.f69337e;
    }

    public final boolean isPreRelease() {
        return m28244a(this.f69339g, 2);
    }

    public final boolean isUnstableFirBinary() {
        if (m28244a(this.f69339g, 64) && !m28244a(this.f69339g, 32)) {
            return true;
        }
        return false;
    }

    public final boolean isUnstableJvmIrBinary() {
        if (m28244a(this.f69339g, 16) && !m28244a(this.f69339g, 32)) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return this.f69333a + " version=" + this.f69334b;
    }
}
