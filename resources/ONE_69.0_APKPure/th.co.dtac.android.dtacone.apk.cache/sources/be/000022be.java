package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u001a\u001bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@Immutable
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,657:1\n442#2:658\n392#2:659\n1238#3,4:660\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n496#1:658\n496#1:659\n496#1:660,4\n*E\n"})
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final KeyframesSpecConfig f12638a;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007*\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007*\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0004¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001dR,\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m29142d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "", "<init>", "()V", "", "timeStamp", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "at", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;Landroidx/compose/animation/core/Easing;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getDurationMillis", "setDurationMillis", "(I)V", "durationMillis", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDelayMillis", "setDelayMillis", "delayMillis", "", OperatorName.CURVE_TO, "Ljava/util/Map;", "getKeyframes$animation_core_release", "()Ljava/util/Map;", "keyframes", "animation-core_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class KeyframesSpecConfig<T> {
        public static final int $stable = 8;

        /* renamed from: b */
        public int f12642b;

        /* renamed from: a */
        public int f12641a = 300;

        /* renamed from: c */
        public final Map f12643c = new LinkedHashMap();

        @NotNull
        /* renamed from: at */
        public final KeyframeEntity<T> m61644at(T t, int i) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, null, 2, null);
            this.f12643c.put(Integer.valueOf(i), keyframeEntity);
            return keyframeEntity;
        }

        @NotNull
        public final KeyframeEntity<T> atFraction(T t, float f) {
            return m61644at(t, AbstractC22237sr0.roundToInt(this.f12641a * f));
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof KeyframesSpecConfig) {
                KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) obj;
                if (this.f12642b == keyframesSpecConfig.f12642b && this.f12641a == keyframesSpecConfig.f12641a && Intrinsics.areEqual(this.f12643c, keyframesSpecConfig.f12643c)) {
                    return true;
                }
            }
            return false;
        }

        public final int getDelayMillis() {
            return this.f12642b;
        }

        public final int getDurationMillis() {
            return this.f12641a;
        }

        @NotNull
        public final Map<Integer, KeyframeEntity<T>> getKeyframes$animation_core_release() {
            return this.f12643c;
        }

        public int hashCode() {
            return (((this.f12641a * 31) + this.f12642b) * 31) + this.f12643c.hashCode();
        }

        public final void setDelayMillis(int i) {
            this.f12642b = i;
        }

        public final void setDurationMillis(int i) {
            this.f12641a = i;
        }

        public final void with(@NotNull KeyframeEntity<T> keyframeEntity, @NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(keyframeEntity, "<this>");
            Intrinsics.checkNotNullParameter(easing, "easing");
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    public KeyframesSpec(@NotNull KeyframesSpecConfig<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f12638a = config;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof KeyframesSpec) && Intrinsics.areEqual(this.f12638a, ((KeyframesSpec) obj).f12638a)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final KeyframesSpecConfig<T> getConfig() {
        return this.f12638a;
    }

    public int hashCode() {
        return this.f12638a.hashCode();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00040\f\"\b\b\u0002\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00028\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m29142d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "", "value", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "toPair$animation_core_release", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "toPair", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core_release", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core_release", "(Landroidx/compose/animation/core/Easing;)V", "animation-core_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class KeyframeEntity<T> {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Object f12639a;

        /* renamed from: b */
        public Easing f12640b;

        public KeyframeEntity(T t, @NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "easing");
            this.f12639a = t;
            this.f12640b = easing;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
                if (Intrinsics.areEqual(keyframeEntity.f12639a, this.f12639a) && Intrinsics.areEqual(keyframeEntity.f12640b, this.f12640b)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final Easing getEasing$animation_core_release() {
            return this.f12640b;
        }

        public final T getValue$animation_core_release() {
            return (T) this.f12639a;
        }

        public int hashCode() {
            int i;
            Object obj = this.f12639a;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            return (i * 31) + this.f12640b.hashCode();
        }

        public final void setEasing$animation_core_release(@NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "<set-?>");
            this.f12640b = easing;
        }

        @NotNull
        public final <V extends AnimationVector> Pair<V, Easing> toPair$animation_core_release(@NotNull Function1<? super T, ? extends V> convertToVector) {
            Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
            return TuplesKt.m29136to(convertToVector.invoke((Object) this.f12639a), this.f12640b);
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Map<Integer, KeyframeEntity<T>> keyframes$animation_core_release = this.f12638a.getKeyframes$animation_core_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC18946Zn0.mapCapacity(keyframes$animation_core_release.size()));
        Iterator<T> it = keyframes$animation_core_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((KeyframeEntity) entry.getValue()).toPair$animation_core_release(converter.getConvertToVector()));
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.f12638a.getDurationMillis(), this.f12638a.getDelayMillis());
    }
}