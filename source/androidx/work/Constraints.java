package androidx.work;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Ignore;
import androidx.work.impl.utils.DurationApi26Impl;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 22\u00020\u0001:\u0003324B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012B\u0011\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0014J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0015J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0015J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0015J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, m28850d2 = {"Landroidx/work/Constraints;", "", "Landroidx/work/NetworkType;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/NetworkType;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/NetworkType;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Landroidx/work/Constraints$ContentUriTrigger;", "contentUriTriggers", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/Constraints;)V", "()Z", "hasContentUriTriggers", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/work/NetworkType;", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, "getContentTriggerUpdateDelayMillis", "()J", OperatorName.NON_STROKING_GRAY, "getContentTriggerMaxDelayMillis", OperatorName.CLOSE_PATH, "Ljava/util/Set;", "getContentUriTriggers", "()Ljava/util/Set;", "Companion", "Builder", "ContentUriTrigger", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Constraints {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Constraints NONE = new Constraints(null, false, false, false, 15, null);

    /* renamed from: a */
    public final NetworkType f38205a;

    /* renamed from: b */
    public final boolean f38206b;

    /* renamed from: c */
    public final boolean f38207c;

    /* renamed from: d */
    public final boolean f38208d;

    /* renamed from: e */
    public final boolean f38209e;

    /* renamed from: f */
    public final long f38210f;

    /* renamed from: g */
    public final long f38211g;

    /* renamed from: h */
    public final Set f38212h;

    @Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020 H\u0007¢\u0006\u0004\b\u001e\u0010!J\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m28850d2 = {"Landroidx/work/Constraints$Builder;", "", "<init>", "()V", "Landroidx/work/Constraints;", "constraints", "(Landroidx/work/Constraints;)V", "", "requiresCharging", "setRequiresCharging", "(Z)Landroidx/work/Constraints$Builder;", "requiresDeviceIdle", "setRequiresDeviceIdle", "Landroidx/work/NetworkType;", "networkType", "setRequiredNetworkType", "(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "requiresBatteryNotLow", "setRequiresBatteryNotLow", "requiresStorageNotLow", "setRequiresStorageNotLow", "Landroid/net/Uri;", "uri", "triggerForDescendants", "addContentUriTrigger", "(Landroid/net/Uri;Z)Landroidx/work/Constraints$Builder;", "", TypedValues.TransitionType.S_DURATION, "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setTriggerContentUpdateDelay", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/Constraints$Builder;", "Ljava/time/Duration;", "(Ljava/time/Duration;)Landroidx/work/Constraints$Builder;", "setTriggerContentMaxDelay", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/work/Constraints;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Landroidx/work/NetworkType;", "requiredNetworkType", "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, "triggerContentUpdateDelay", OperatorName.NON_STROKING_GRAY, "triggerContentMaxDelay", "", "Landroidx/work/Constraints$ContentUriTrigger;", OperatorName.CLOSE_PATH, "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f38213a;

        /* renamed from: b */
        public boolean f38214b;

        /* renamed from: c */
        public NetworkType f38215c;

        /* renamed from: d */
        public boolean f38216d;

        /* renamed from: e */
        public boolean f38217e;

        /* renamed from: f */
        public long f38218f;

        /* renamed from: g */
        public long f38219g;

        /* renamed from: h */
        public Set f38220h;

        public Builder() {
            this.f38215c = NetworkType.NOT_REQUIRED;
            this.f38218f = -1L;
            this.f38219g = -1L;
            this.f38220h = new LinkedHashSet();
        }

        @RequiresApi(24)
        @NotNull
        public final Builder addContentUriTrigger(@NotNull Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f38220h.add(new ContentUriTrigger(uri, z));
            return this;
        }

        @NotNull
        public final Constraints build() {
            Set emptySet;
            long j;
            long j2;
            boolean z;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                emptySet = CollectionsKt___CollectionsKt.toSet(this.f38220h);
                j = this.f38218f;
                j2 = this.f38219g;
            } else {
                emptySet = DG1.emptySet();
                j = -1;
                j2 = -1;
            }
            boolean z2 = this.f38213a;
            if (i >= 23 && this.f38214b) {
                z = true;
            } else {
                z = false;
            }
            return new Constraints(this.f38215c, z2, z, this.f38216d, this.f38217e, j, j2, emptySet);
        }

        @NotNull
        public final Builder setRequiredNetworkType(@NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f38215c = networkType;
            return this;
        }

        @NotNull
        public final Builder setRequiresBatteryNotLow(boolean z) {
            this.f38216d = z;
            return this;
        }

        @NotNull
        public final Builder setRequiresCharging(boolean z) {
            this.f38213a = z;
            return this;
        }

        @RequiresApi(23)
        @NotNull
        public final Builder setRequiresDeviceIdle(boolean z) {
            this.f38214b = z;
            return this;
        }

        @NotNull
        public final Builder setRequiresStorageNotLow(boolean z) {
            this.f38217e = z;
            return this;
        }

        @RequiresApi(24)
        @NotNull
        public final Builder setTriggerContentMaxDelay(long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f38219g = timeUnit.toMillis(j);
            return this;
        }

        @RequiresApi(24)
        @NotNull
        public final Builder setTriggerContentUpdateDelay(long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f38218f = timeUnit.toMillis(j);
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setTriggerContentMaxDelay(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f38219g = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setTriggerContentUpdateDelay(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f38218f = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NotNull Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f38215c = NetworkType.NOT_REQUIRED;
            this.f38218f = -1L;
            this.f38219g = -1L;
            this.f38220h = new LinkedHashSet();
            this.f38213a = constraints.requiresCharging();
            int i = Build.VERSION.SDK_INT;
            this.f38214b = i >= 23 && constraints.requiresDeviceIdle();
            this.f38215c = constraints.getRequiredNetworkType();
            this.f38216d = constraints.requiresBatteryNotLow();
            this.f38217e = constraints.requiresStorageNotLow();
            if (i >= 24) {
                this.f38218f = constraints.getContentTriggerUpdateDelayMillis();
                this.f38219g = constraints.getContentTriggerMaxDelayMillis();
                this.f38220h = CollectionsKt___CollectionsKt.toMutableSet(constraints.getContentUriTriggers());
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Landroidx/work/Constraints$Companion;", "", "()V", TopUpMixpanel.OFFER_NONE, "Landroidx/work/Constraints;", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ContentUriTrigger {

        /* renamed from: a */
        public final Uri f38221a;

        /* renamed from: b */
        public final boolean f38222b;

        public ContentUriTrigger(@NotNull Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f38221a = uri;
            this.f38222b = z;
        }

        public boolean equals(@Nullable Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(ContentUriTrigger.class, cls)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            if (Intrinsics.areEqual(this.f38221a, contentUriTrigger.f38221a) && this.f38222b == contentUriTrigger.f38222b) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Uri getUri() {
            return this.f38221a;
        }

        public int hashCode() {
            return (this.f38221a.hashCode() * 31) + AbstractC1705Xp.m65430a(this.f38222b);
        }

        public final boolean isTriggeredForDescendants() {
            return this.f38222b;
        }
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    @SuppressLint({"NewApi"})
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Constraints.class, obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.f38206b != constraints.f38206b || this.f38207c != constraints.f38207c || this.f38208d != constraints.f38208d || this.f38209e != constraints.f38209e || this.f38210f != constraints.f38210f || this.f38211g != constraints.f38211g || this.f38205a != constraints.f38205a) {
            return false;
        }
        return Intrinsics.areEqual(this.f38212h, constraints.f38212h);
    }

    @RequiresApi(24)
    public final long getContentTriggerMaxDelayMillis() {
        return this.f38211g;
    }

    @RequiresApi(24)
    public final long getContentTriggerUpdateDelayMillis() {
        return this.f38210f;
    }

    @RequiresApi(24)
    @NotNull
    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.f38212h;
    }

    @NotNull
    public final NetworkType getRequiredNetworkType() {
        return this.f38205a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasContentUriTriggers() {
        if (Build.VERSION.SDK_INT < 24 || (!this.f38212h.isEmpty())) {
            return true;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        long j = this.f38210f;
        long j2 = this.f38211g;
        return (((((((((((((this.f38205a.hashCode() * 31) + (this.f38206b ? 1 : 0)) * 31) + (this.f38207c ? 1 : 0)) * 31) + (this.f38208d ? 1 : 0)) * 31) + (this.f38209e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f38212h.hashCode();
    }

    public final boolean requiresBatteryNotLow() {
        return this.f38208d;
    }

    public final boolean requiresCharging() {
        return this.f38206b;
    }

    @RequiresApi(23)
    public final boolean requiresDeviceIdle() {
        return this.f38207c;
    }

    public final boolean requiresStorageNotLow() {
        return this.f38209e;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f38205a + ", requiresCharging=" + this.f38206b + ", requiresDeviceIdle=" + this.f38207c + ", requiresBatteryNotLow=" + this.f38208d + ", requiresStorageNotLow=" + this.f38209e + ", contentTriggerUpdateDelayMillis=" + this.f38210f + ", contentTriggerMaxDelayMillis=" + this.f38211g + ", contentUriTriggers=" + this.f38212h + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(@NotNull NetworkType requiredNetworkType, boolean z, boolean z2, boolean z3) {
        this(requiredNetworkType, z, false, z2, z3);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(23)
    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(@NotNull NetworkType requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(requiredNetworkType, z, z2, z3, z4, -1L, 0L, null, CertificateHolderAuthorization.CVCA, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? DG1.emptySet() : set);
    }

    @RequiresApi(24)
    public Constraints(@NotNull NetworkType requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, @NotNull Set<ContentUriTrigger> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f38205a = requiredNetworkType;
        this.f38206b = z;
        this.f38207c = z2;
        this.f38208d = z3;
        this.f38209e = z4;
        this.f38210f = j;
        this.f38211g = j2;
        this.f38212h = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public Constraints(@NotNull Constraints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f38206b = other.f38206b;
        this.f38207c = other.f38207c;
        this.f38205a = other.f38205a;
        this.f38208d = other.f38208d;
        this.f38209e = other.f38209e;
        this.f38212h = other.f38212h;
        this.f38210f = other.f38210f;
        this.f38211g = other.f38211g;
    }
}
