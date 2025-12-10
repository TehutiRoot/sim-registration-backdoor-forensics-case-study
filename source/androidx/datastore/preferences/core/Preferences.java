package androidx.datastore.preferences.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004H&J\u001d\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002J$\u0010\n\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0000¨\u0006\u0011"}, m28850d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "()V", "asMap", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "contains", "", "T", Action.KEY_ATTRIBUTE, "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "toMutablePreferences", "Landroidx/datastore/preferences/core/MutablePreferences;", "toPreferences", PDAnnotationText.NAME_KEY, "Pair", "datastore-preferences-core"}, m28849k = 1, m28848mv = {1, 5, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public abstract class Preferences {

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m28850d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", "T", "", "", "name", "<init>", "(Ljava/lang/String;)V", "value", "Landroidx/datastore/preferences/core/Preferences$Pair;", TypedValues.TransitionType.S_TO, "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Pair;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "datastore-preferences-core"}, m28849k = 1, m28848mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Key<T> {

        /* renamed from: a */
        public final String f34655a;

        public Key(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f34655a = name;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Key) {
                return Intrinsics.areEqual(this.f34655a, ((Key) obj).f34655a);
            }
            return false;
        }

        @NotNull
        public final String getName() {
            return this.f34655a;
        }

        public int hashCode() {
            return this.f34655a.hashCode();
        }

        @NotNull
        /* renamed from: to */
        public final Pair<T> m56216to(T t) {
            return new Pair<>(this, t);
        }

        @NotNull
        public String toString() {
            return this.f34655a;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", "T", "", "Landroidx/datastore/preferences/core/Preferences$Key;", Action.KEY_ATTRIBUTE, "value", "<init>", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/datastore/preferences/core/Preferences$Key;", "getKey$datastore_preferences_core", "()Landroidx/datastore/preferences/core/Preferences$Key;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getValue$datastore_preferences_core", "()Ljava/lang/Object;", "datastore-preferences-core"}, m28849k = 1, m28848mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Pair<T> {

        /* renamed from: a */
        public final Key f34656a;

        /* renamed from: b */
        public final Object f34657b;

        public Pair(@NotNull Key<T> key, T t) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f34656a = key;
            this.f34657b = t;
        }

        @NotNull
        public final Key<T> getKey$datastore_preferences_core() {
            return this.f34656a;
        }

        public final T getValue$datastore_preferences_core() {
            return (T) this.f34657b;
        }
    }

    @NotNull
    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(@NotNull Key<T> key);

    @Nullable
    public abstract <T> T get(@NotNull Key<T> key);

    @NotNull
    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(AbstractC11687a.toMutableMap(asMap()), false);
    }

    @NotNull
    public final Preferences toPreferences() {
        return new MutablePreferences(AbstractC11687a.toMutableMap(asMap()), true);
    }
}
