package coil.request;

import ch.qos.logback.core.CoreConstants;
import coil.util.Collections;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0002\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m29142d2 = {"Lcoil/request/Tags;", "", "", "Ljava/lang/Class;", "tags", "<init>", "(Ljava/util/Map;)V", "T", "tag", "()Ljava/lang/Object;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "asMap", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "Companion", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Tags {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Tags EMPTY = new Tags(AbstractC11663a.emptyMap());

    /* renamed from: a */
    public final Map f40826a;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lcoil/request/Tags$Companion;", "", "()V", "EMPTY", "Lcoil/request/Tags;", "from", "tags", "", "Ljava/lang/Class;", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Tags from(@NotNull Map<Class<?>, ? extends Object> map) {
            return new Tags(Collections.toImmutableMap(map), null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ Tags(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @JvmStatic
    @NotNull
    public static final Tags from(@NotNull Map<Class<?>, ? extends Object> map) {
        return Companion.from(map);
    }

    @NotNull
    public final Map<Class<?>, Object> asMap() {
        return this.f40826a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Tags) && Intrinsics.areEqual(this.f40826a, ((Tags) obj).f40826a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40826a.hashCode();
    }

    public final /* synthetic */ <T> T tag() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) tag(Object.class);
    }

    @NotNull
    public String toString() {
        return "Tags(tags=" + this.f40826a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Tags(Map map) {
        this.f40826a = map;
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> cls) {
        return cls.cast(this.f40826a.get(cls));
    }
}