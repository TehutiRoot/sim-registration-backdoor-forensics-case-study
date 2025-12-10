package okio;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014Jw\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0004\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m28850d2 = {"Lokio/FileMetadata;", "", "", "isRegularFile", "isDirectory", "Lokio/Path;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lkotlin/reflect/KClass;", "extras", "<init>", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "T", "type", "extra", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "copy", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lokio/FileMetadata;", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Lokio/Path;", "getSymlinkTarget", "()Lokio/Path;", "d", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "e", "getCreatedAtMillis", OperatorName.FILL_NON_ZERO, "getLastModifiedAtMillis", OperatorName.NON_STROKING_GRAY, "getLastAccessedAtMillis", OperatorName.CLOSE_PATH, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FileMetadata {

    /* renamed from: a */
    public final boolean f72816a;

    /* renamed from: b */
    public final boolean f72817b;

    /* renamed from: c */
    public final Path f72818c;

    /* renamed from: d */
    public final Long f72819d;

    /* renamed from: e */
    public final Long f72820e;

    /* renamed from: f */
    public final Long f72821f;

    /* renamed from: g */
    public final Long f72822g;

    /* renamed from: h */
    public final Map f72823h;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
        boolean z3;
        boolean z4;
        Path path2;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Map<KClass<?>, ? extends Object> map2;
        if ((i & 1) != 0) {
            z3 = fileMetadata.f72816a;
        } else {
            z3 = z;
        }
        if ((i & 2) != 0) {
            z4 = fileMetadata.f72817b;
        } else {
            z4 = z2;
        }
        if ((i & 4) != 0) {
            path2 = fileMetadata.f72818c;
        } else {
            path2 = path;
        }
        if ((i & 8) != 0) {
            l5 = fileMetadata.f72819d;
        } else {
            l5 = l;
        }
        if ((i & 16) != 0) {
            l6 = fileMetadata.f72820e;
        } else {
            l6 = l2;
        }
        if ((i & 32) != 0) {
            l7 = fileMetadata.f72821f;
        } else {
            l7 = l3;
        }
        if ((i & 64) != 0) {
            l8 = fileMetadata.f72822g;
        } else {
            l8 = l4;
        }
        if ((i & 128) != 0) {
            map2 = fileMetadata.f72823h;
        } else {
            map2 = map;
        }
        return fileMetadata.copy(z3, z4, path2, l5, l6, l7, l8, map2);
    }

    @NotNull
    public final FileMetadata copy(boolean z, boolean z2, @Nullable Path path, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new FileMetadata(z, z2, path, l, l2, l3, l4, extras);
    }

    @Nullable
    public final <T> T extra(@NotNull KClass<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = this.f72823h.get(type);
        if (obj == null) {
            return null;
        }
        return (T) KClasses.cast(type, obj);
    }

    @Nullable
    public final Long getCreatedAtMillis() {
        return this.f72820e;
    }

    @NotNull
    public final Map<KClass<?>, Object> getExtras() {
        return this.f72823h;
    }

    @Nullable
    public final Long getLastAccessedAtMillis() {
        return this.f72822g;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.f72821f;
    }

    @Nullable
    public final Long getSize() {
        return this.f72819d;
    }

    @Nullable
    public final Path getSymlinkTarget() {
        return this.f72818c;
    }

    public final boolean isDirectory() {
        return this.f72817b;
    }

    public final boolean isRegularFile() {
        return this.f72816a;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f72816a) {
            arrayList.add("isRegularFile");
        }
        if (this.f72817b) {
            arrayList.add("isDirectory");
        }
        if (this.f72819d != null) {
            arrayList.add("byteCount=" + this.f72819d);
        }
        if (this.f72820e != null) {
            arrayList.add("createdAt=" + this.f72820e);
        }
        if (this.f72821f != null) {
            arrayList.add("lastModifiedAt=" + this.f72821f);
        }
        if (this.f72822g != null) {
            arrayList.add("lastAccessedAt=" + this.f72822g);
        }
        if (!this.f72823h.isEmpty()) {
            arrayList.add("extras=" + this.f72823h);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public FileMetadata(boolean z, boolean z2, @Nullable Path path, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f72816a = z;
        this.f72817b = z2;
        this.f72818c = path;
        this.f72819d = l;
        this.f72820e = l2;
        this.f72821f = l3;
        this.f72822g = l4;
        this.f72823h = AbstractC11687a.toMap(extras);
    }

    public /* synthetic */ FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : path, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? AbstractC11687a.emptyMap() : map);
    }
}
