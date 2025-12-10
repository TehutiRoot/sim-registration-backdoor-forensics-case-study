package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i, T t, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new C13233r8(Integer.valueOf(i), t, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i, T t, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new C13233r8(Integer.valueOf(i), t, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i, T t, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new C13233r8(Integer.valueOf(i), t, Priority.HIGHEST, productData, eventContext);
    }

    @Nullable
    public abstract Integer getCode();

    @Nullable
    public abstract EventContext getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    @Nullable
    public abstract ProductData getProductData();

    public static <T> Event<T> ofData(int i, T t, @Nullable ProductData productData) {
        return new C13233r8(Integer.valueOf(i), t, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(int i, T t, @Nullable ProductData productData) {
        return new C13233r8(Integer.valueOf(i), t, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(int i, T t, @Nullable ProductData productData) {
        return new C13233r8(Integer.valueOf(i), t, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(int i, T t, @Nullable EventContext eventContext) {
        return new C13233r8(Integer.valueOf(i), t, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i, T t, @Nullable EventContext eventContext) {
        return new C13233r8(Integer.valueOf(i), t, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i, T t, @Nullable EventContext eventContext) {
        return new C13233r8(Integer.valueOf(i), t, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(int i, T t) {
        return new C13233r8(Integer.valueOf(i), t, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(int i, T t) {
        return new C13233r8(Integer.valueOf(i), t, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(int i, T t) {
        return new C13233r8(Integer.valueOf(i), t, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofData(T t, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new C13233r8(null, t, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new C13233r8(null, t, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new C13233r8(null, t, Priority.HIGHEST, productData, eventContext);
    }

    public static <T> Event<T> ofData(T t, @Nullable ProductData productData) {
        return new C13233r8(null, t, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(T t, @Nullable ProductData productData) {
        return new C13233r8(null, t, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(T t, @Nullable ProductData productData) {
        return new C13233r8(null, t, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(T t, @Nullable EventContext eventContext) {
        return new C13233r8(null, t, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t, @Nullable EventContext eventContext) {
        return new C13233r8(null, t, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t, @Nullable EventContext eventContext) {
        return new C13233r8(null, t, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(T t) {
        return new C13233r8(null, t, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(T t) {
        return new C13233r8(null, t, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(T t) {
        return new C13233r8(null, t, Priority.HIGHEST, null, null);
    }
}
