package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0014\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a`\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\t2'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0013\u001a@\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0006*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m29142d2 = {"", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "properties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperties", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "T", "property", "value", "", "keyPath", "rememberLottieDynamicProperty", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "callback", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "lottie-compose_release"}, m29141k = 2, m29140mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LottieDynamicPropertiesKt {
    /* renamed from: a */
    public static final Function1 m50815a(State state) {
        return (Function1) state.getValue();
    }

    public static final /* synthetic */ LottieDynamicPropertiesKt$toValueCallback$1 access$toValueCallback(Function1 function1) {
        return m50814b(function1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1] */
    /* renamed from: b */
    public static final LottieDynamicPropertiesKt$toValueCallback$1 m50814b(final Function1 function1) {
        return new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Object getValue(@NotNull LottieFrameInfo<Object> frameInfo) {
                Intrinsics.checkNotNullParameter(frameInfo, "frameInfo");
                return Function1.this.invoke(frameInfo);
            }
        };
    }

    @Composable
    @NotNull
    public static final LottieDynamicProperties rememberLottieDynamicProperties(@NotNull LottieDynamicProperty<?>[] properties, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        composer.startReplaceableGroup(34467846);
        Integer valueOf = Integer.valueOf(Arrays.hashCode(properties));
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottieDynamicProperties(ArraysKt___ArraysKt.toList(properties));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) rememberedValue;
        composer.endReplaceableGroup();
        return lottieDynamicProperties;
    }

    @Composable
    @NotNull
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, T t2, @NotNull String[] keyPath, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        composer.startReplaceableGroup(1613443783);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(keyPath);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        KeyPath keyPath2 = (KeyPath) rememberedValue;
        composer.startReplaceableGroup(-3686095);
        boolean changed2 = composer.changed(keyPath2) | composer.changed(t) | composer.changed(t2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LottieDynamicProperty(t, keyPath2, t2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) rememberedValue2;
        composer.endReplaceableGroup();
        return lottieDynamicProperty;
    }

    @Composable
    @NotNull
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, @NotNull String[] keyPath, @NotNull Function1<? super LottieFrameInfo<T>, ? extends T> callback, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceableGroup(1613444845);
        Object valueOf = Integer.valueOf(Arrays.hashCode(keyPath));
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        KeyPath keyPath2 = (KeyPath) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(callback, composer, (i >> 6) & 14);
        composer.startReplaceableGroup(-3686552);
        boolean changed2 = composer.changed(keyPath2) | composer.changed(t);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LottieDynamicProperty((Object) t, keyPath2, (Function1) new LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) rememberedValue2;
        composer.endReplaceableGroup();
        return lottieDynamicProperty;
    }
}