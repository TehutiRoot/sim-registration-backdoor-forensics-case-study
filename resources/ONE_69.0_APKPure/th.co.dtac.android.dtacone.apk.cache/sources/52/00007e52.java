package coil.request;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import coil.util.Collections;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003+*,B\u001d\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0018\u0010\u0017J\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b)\u0010!¨\u0006-"}, m29142d2 = {"Lcoil/request/Parameters;", "", "Lkotlin/Pair;", "", "Lcoil/request/Parameters$Entry;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "(Ljava/util/Map;)V", "()V", "", "T", Action.KEY_ATTRIBUTE, "value", "(Ljava/lang/String;)Ljava/lang/Object;", "memoryCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "entry", "(Ljava/lang/String;)Lcoil/request/Parameters$Entry;", "", "isEmpty", "()Z", "values", "()Ljava/util/Map;", "memoryCacheKeys", "", "iterator", "()Ljava/util/Iterator;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcoil/request/Parameters$Builder;", "newBuilder", "()Lcoil/request/Parameters$Builder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "size", "Companion", "Builder", "Entry", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Collections.kt\ncoil/util/-Collections\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,138:1\n442#2:139\n392#2:140\n1238#3,4:141\n72#4,8:145\n125#5:153\n152#5,3:154\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n*L\n44#1:139\n44#1:140\n44#1:141,4\n53#1:145,8\n59#1:153\n59#1:154,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parameters EMPTY = new Parameters();

    /* renamed from: a */
    public final Map f40812a;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J-\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m29142d2 = {"Lcoil/request/Parameters$Builder;", "", "<init>", "()V", "Lcoil/request/Parameters;", "parameters", "(Lcoil/request/Parameters;)V", "", Action.KEY_ATTRIBUTE, "value", "memoryCacheKey", "set", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcoil/request/Parameters$Builder;", ProductAction.ACTION_REMOVE, "(Ljava/lang/String;)Lcoil/request/Parameters$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcoil/request/Parameters;", "", "Lcoil/request/Parameters$Entry;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Map f40813a;

        public Builder() {
            this.f40813a = new LinkedHashMap();
        }

        public static /* synthetic */ Builder set$default(Builder builder, String str, Object obj, String str2, int i, Object obj2) {
            if ((i & 4) != 0) {
                if (obj != null) {
                    str2 = obj.toString();
                } else {
                    str2 = null;
                }
            }
            return builder.set(str, obj, str2);
        }

        @NotNull
        public final Parameters build() {
            return new Parameters(Collections.toImmutableMap(this.f40813a), null);
        }

        @NotNull
        public final Builder remove(@NotNull String str) {
            this.f40813a.remove(str);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder set(@NotNull String str, @Nullable Object obj) {
            return set$default(this, str, obj, null, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder set(@NotNull String str, @Nullable Object obj, @Nullable String str2) {
            this.f40813a.put(str, new Entry(obj, str2));
            return this;
        }

        public Builder(@NotNull Parameters parameters) {
            this.f40813a = AbstractC11663a.toMutableMap(parameters.f40812a);
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lcoil/request/Parameters$Companion;", "", "()V", "EMPTY", "Lcoil/request/Parameters;", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, m29142d2 = {"Lcoil/request/Parameters$Entry;", "", "value", "", "memoryCacheKey", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getMemoryCacheKey", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Entry {

        /* renamed from: a */
        public final Object f40814a;

        /* renamed from: b */
        public final String f40815b;

        public Entry(@Nullable Object obj, @Nullable String str) {
            this.f40814a = obj;
            this.f40815b = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (Intrinsics.areEqual(this.f40814a, entry.f40814a) && Intrinsics.areEqual(this.f40815b, entry.f40815b)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final String getMemoryCacheKey() {
            return this.f40815b;
        }

        @Nullable
        public final Object getValue() {
            return this.f40814a;
        }

        public int hashCode() {
            int i;
            Object obj = this.f40814a;
            int i2 = 0;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str = this.f40815b;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.f40814a + ", memoryCacheKey=" + this.f40815b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ Parameters(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @Nullable
    public final Entry entry(@NotNull String str) {
        return (Entry) this.f40812a.get(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Parameters) && Intrinsics.areEqual(this.f40812a, ((Parameters) obj).f40812a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40812a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f40812a.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map map = this.f40812a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(TuplesKt.m29136to((String) entry.getKey(), (Entry) entry.getValue()));
        }
        return arrayList.iterator();
    }

    @Nullable
    public final String memoryCacheKey(@NotNull String str) {
        Entry entry = (Entry) this.f40812a.get(str);
        if (entry != null) {
            return entry.getMemoryCacheKey();
        }
        return null;
    }

    @NotNull
    public final Map<String, String> memoryCacheKeys() {
        if (isEmpty()) {
            return AbstractC11663a.emptyMap();
        }
        Map map = this.f40812a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String memoryCacheKey = ((Entry) entry.getValue()).getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f40812a.size();
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.f40812a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Nullable
    public final <T> T value(@NotNull String str) {
        Entry entry = (Entry) this.f40812a.get(str);
        if (entry != null) {
            return (T) entry.getValue();
        }
        return null;
    }

    @NotNull
    public final Map<String, Object> values() {
        if (isEmpty()) {
            return AbstractC11663a.emptyMap();
        }
        Map map = this.f40812a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC18946Zn0.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((Entry) entry.getValue()).getValue());
        }
        return linkedHashMap;
    }

    public Parameters(Map map) {
        this.f40812a = map;
    }

    public Parameters() {
        this(AbstractC11663a.emptyMap());
    }
}