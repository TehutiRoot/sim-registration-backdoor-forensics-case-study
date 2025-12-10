package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import coil.memory.MemoryCache;
import coil.util.Utils;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aJ\b\u0010\r\u001a\u00020\u000eH&J\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H¦\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0019\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0010H¦\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m28850d2 = {"Lcoil/memory/MemoryCache;", "", UserMetadata.KEYDATA_FILENAME, "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "maxSize", "", "getMaxSize", "()I", "size", "getSize", "clear", "", "get", "Lcoil/memory/MemoryCache$Value;", Action.KEY_ATTRIBUTE, ProductAction.ACTION_REMOVE, "", "set", "value", "trimMemory", "level", "Builder", PDAnnotationText.NAME_KEY, "Value", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface MemoryCache {

    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m28850d2 = {"Lcoil/memory/MemoryCache$Builder;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "percent", "maxSizePercent", "(D)Lcoil/memory/MemoryCache$Builder;", "", "size", "maxSizeBytes", "(I)Lcoil/memory/MemoryCache$Builder;", "", "enable", "strongReferencesEnabled", "(Z)Lcoil/memory/MemoryCache$Builder;", "weakReferencesEnabled", "Lcoil/memory/MemoryCache;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcoil/memory/MemoryCache;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "D", OperatorName.CURVE_TO, "I", "d", "Z", "e", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Context f40611a;

        /* renamed from: b */
        public double f40612b;

        /* renamed from: c */
        public int f40613c;

        /* renamed from: d */
        public boolean f40614d = true;

        /* renamed from: e */
        public boolean f40615e = true;

        public Builder(@NotNull Context context) {
            this.f40611a = context;
            this.f40612b = Utils.defaultMemoryCacheSizePercent(context);
        }

        @NotNull
        public final MemoryCache build() {
            WeakMemoryCache emptyWeakMemoryCache;
            StrongMemoryCache emptyStrongMemoryCache;
            int i;
            if (this.f40615e) {
                emptyWeakMemoryCache = new RealWeakMemoryCache();
            } else {
                emptyWeakMemoryCache = new EmptyWeakMemoryCache();
            }
            if (this.f40614d) {
                double d = this.f40612b;
                if (d > 0.0d) {
                    i = Utils.calculateMemoryCacheSize(this.f40611a, d);
                } else {
                    i = this.f40613c;
                }
                if (i > 0) {
                    emptyStrongMemoryCache = new RealStrongMemoryCache(i, emptyWeakMemoryCache);
                } else {
                    emptyStrongMemoryCache = new EmptyStrongMemoryCache(emptyWeakMemoryCache);
                }
            } else {
                emptyStrongMemoryCache = new EmptyStrongMemoryCache(emptyWeakMemoryCache);
            }
            return new RealMemoryCache(emptyStrongMemoryCache, emptyWeakMemoryCache);
        }

        @NotNull
        public final Builder maxSizeBytes(int i) {
            if (i >= 0) {
                this.f40612b = 0.0d;
                this.f40613c = i;
                return this;
            }
            throw new IllegalArgumentException("size must be >= 0.".toString());
        }

        @NotNull
        public final Builder maxSizePercent(@FloatRange(from = 0.0d, m64743to = 1.0d) double d) {
            if (0.0d <= d && d <= 1.0d) {
                this.f40613c = 0;
                this.f40612b = d;
                return this;
            }
            throw new IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
        }

        @NotNull
        public final Builder strongReferencesEnabled(boolean z) {
            this.f40614d = z;
            return this;
        }

        @NotNull
        public final Builder weakReferencesEnabled(boolean z) {
            this.f40615e = z;
            return this;
        }
    }

    void clear();

    @Nullable
    Value get(@NotNull Key key);

    @NotNull
    Set<Key> getKeys();

    int getMaxSize();

    int getSize();

    boolean remove(@NotNull Key key);

    void set(@NotNull Key key, @NotNull Value value);

    void trimMemory(int i);

    @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m28850d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "", Action.KEY_ATTRIBUTE, "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcoil/memory/MemoryCache$Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getKey", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", OperatorName.CURVE_TO, "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n*L\n86#1:217,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Key implements Parcelable {

        /* renamed from: a */
        public final String f40617a;

        /* renamed from: b */
        public final Map f40618b;

        /* renamed from: c */
        public static final C5652a f40616c = new C5652a(null);
        @JvmField
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new Parcelable.Creator<Key>() { // from class: coil.memory.MemoryCache$Key$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public MemoryCache.Key createFromParcel(@NotNull Parcel parcel) {
                String readString = parcel.readString();
                Intrinsics.checkNotNull(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    Intrinsics.checkNotNull(readString2);
                    String readString3 = parcel.readString();
                    Intrinsics.checkNotNull(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new MemoryCache.Key(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public MemoryCache.Key[] newArray(int i) {
                return new MemoryCache.Key[i];
            }
        };

        /* renamed from: coil.memory.MemoryCache$Key$a */
        /* loaded from: classes3.dex */
        public static final class C5652a {
            public /* synthetic */ C5652a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C5652a() {
            }
        }

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.f40617a = str;
            this.f40618b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key copy$default(Key key, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.f40617a;
            }
            if ((i & 2) != 0) {
                map = key.f40618b;
            }
            return key.copy(str, map);
        }

        @NotNull
        public final Key copy(@NotNull String str, @NotNull Map<String, String> map) {
            return new Key(str, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (Intrinsics.areEqual(this.f40617a, key.f40617a) && Intrinsics.areEqual(this.f40618b, key.f40618b)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final Map<String, String> getExtras() {
            return this.f40618b;
        }

        @NotNull
        public final String getKey() {
            return this.f40617a;
        }

        public int hashCode() {
            return (this.f40617a.hashCode() * 31) + this.f40618b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(key=" + this.f40617a + ", extras=" + this.f40618b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.f40617a);
            parcel.writeInt(this.f40618b.size());
            for (Map.Entry entry : this.f40618b.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        public /* synthetic */ Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? AbstractC11687a.emptyMap() : map);
        }
    }

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m28850d2 = {"Lcoil/memory/MemoryCache$Value;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "copy", "(Landroid/graphics/Bitmap;Ljava/util/Map;)Lcoil/memory/MemoryCache$Value;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Value {

        /* renamed from: a */
        public final Bitmap f40619a;

        /* renamed from: b */
        public final Map f40620b;

        public Value(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.f40619a = bitmap;
            this.f40620b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Value copy$default(Value value, Bitmap bitmap, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = value.f40619a;
            }
            if ((i & 2) != 0) {
                map = value.f40620b;
            }
            return value.copy(bitmap, map);
        }

        @NotNull
        public final Value copy(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            return new Value(bitmap, map);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Value) {
                Value value = (Value) obj;
                if (Intrinsics.areEqual(this.f40619a, value.f40619a) && Intrinsics.areEqual(this.f40620b, value.f40620b)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.f40619a;
        }

        @NotNull
        public final Map<String, Object> getExtras() {
            return this.f40620b;
        }

        public int hashCode() {
            return (this.f40619a.hashCode() * 31) + this.f40620b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(bitmap=" + this.f40619a + ", extras=" + this.f40620b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Value(Bitmap bitmap, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? AbstractC11687a.emptyMap() : map);
        }
    }
}
