package com.google.firebase.crashlytics;

import ch.qos.logback.core.joran.action.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.crashlytics.CustomKeysAndValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000f\u0010\u0013J\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010\u0017J\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b\u000f\u0010\u0019J\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u001a¢\u0006\u0004\b\u000f\u0010\u001bJ\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m28850d2 = {"Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;", "builder", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;)V", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "()V", "Lcom/google/firebase/crashlytics/CustomKeysAndValues;", "build$com_google_firebase_firebase_crashlytics", "()Lcom/google/firebase/crashlytics/CustomKeysAndValues;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", Action.KEY_ATTRIBUTE, "", "value", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;D)V", "", "(Ljava/lang/String;F)V", "", "(Ljava/lang/String;I)V", "", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;", "com.google.firebase-firebase-crashlytics"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class KeyValueBuilder {

    /* renamed from: a */
    public final FirebaseCrashlytics f54751a;

    /* renamed from: b */
    public final CustomKeysAndValues.Builder f54752b;

    public KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics, CustomKeysAndValues.Builder builder) {
        this.f54751a = firebaseCrashlytics;
        this.f54752b = builder;
    }

    @NotNull
    public final CustomKeysAndValues build$com_google_firebase_firebase_crashlytics() {
        CustomKeysAndValues build = this.f54752b.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public final void key(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseCrashlytics firebaseCrashlytics = this.f54751a;
        if (firebaseCrashlytics == null) {
            Intrinsics.checkNotNullExpressionValue(this.f54752b.putBoolean(key, z), "builder.putBoolean(key, value)");
            return;
        }
        firebaseCrashlytics.setCustomKey(key, z);
        Unit unit = Unit.INSTANCE;
    }

    public final void key(@NotNull String key, double d) {
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseCrashlytics firebaseCrashlytics = this.f54751a;
        if (firebaseCrashlytics == null) {
            Intrinsics.checkNotNullExpressionValue(this.f54752b.putDouble(key, d), "builder.putDouble(key, value)");
            return;
        }
        firebaseCrashlytics.setCustomKey(key, d);
        Unit unit = Unit.INSTANCE;
    }

    public final void key(@NotNull String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseCrashlytics firebaseCrashlytics = this.f54751a;
        if (firebaseCrashlytics == null) {
            Intrinsics.checkNotNullExpressionValue(this.f54752b.putFloat(key, f), "builder.putFloat(key, value)");
            return;
        }
        firebaseCrashlytics.setCustomKey(key, f);
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Do not construct this directly. Use `setCustomKeys` instead. To be removed in the next major release.")
    public KeyValueBuilder(@NotNull FirebaseCrashlytics crashlytics) {
        this(crashlytics, new CustomKeysAndValues.Builder());
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
    }

    public final void key(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseCrashlytics firebaseCrashlytics = this.f54751a;
        if (firebaseCrashlytics == null) {
            Intrinsics.checkNotNullExpressionValue(this.f54752b.putInt(key, i), "builder.putInt(key, value)");
            return;
        }
        firebaseCrashlytics.setCustomKey(key, i);
        Unit unit = Unit.INSTANCE;
    }

    public KeyValueBuilder() {
        this(null, new CustomKeysAndValues.Builder());
    }

    public final void key(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseCrashlytics firebaseCrashlytics = this.f54751a;
        if (firebaseCrashlytics == null) {
            Intrinsics.checkNotNullExpressionValue(this.f54752b.putLong(key, j), "builder.putLong(key, value)");
            return;
        }
        firebaseCrashlytics.setCustomKey(key, j);
        Unit unit = Unit.INSTANCE;
    }

    public final void key(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        FirebaseCrashlytics firebaseCrashlytics = this.f54751a;
        if (firebaseCrashlytics == null) {
            Intrinsics.checkNotNullExpressionValue(this.f54752b.putString(key, value), "builder.putString(key, value)");
            return;
        }
        firebaseCrashlytics.setCustomKey(key, value);
        Unit unit = Unit.INSTANCE;
    }
}
