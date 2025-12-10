package com.google.firebase.crashlytics.internal.metadata;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m28850d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", "", "sessionId", "", "timestamp", "", "additionalCustomKeys", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;JLjava/util/Map;)Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSessionId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getTimestamp", OperatorName.CURVE_TO, "Ljava/util/Map;", "getAdditionalCustomKeys", "com.google.firebase-firebase-crashlytics"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EventMetadata {

    /* renamed from: a */
    public final String f54895a;

    /* renamed from: b */
    public final long f54896b;

    /* renamed from: c */
    public final Map f54897c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EventMetadata(@NotNull String sessionId, long j) {
        this(sessionId, j, null, 4, null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String str, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventMetadata.f54895a;
        }
        if ((i & 2) != 0) {
            j = eventMetadata.f54896b;
        }
        if ((i & 4) != 0) {
            map = eventMetadata.f54897c;
        }
        return eventMetadata.copy(str, j, map);
    }

    @NotNull
    public final String component1() {
        return this.f54895a;
    }

    public final long component2() {
        return this.f54896b;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.f54897c;
    }

    @NotNull
    public final EventMetadata copy(@NotNull String sessionId, long j, @NotNull Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        return new EventMetadata(sessionId, j, additionalCustomKeys);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventMetadata) {
            EventMetadata eventMetadata = (EventMetadata) obj;
            return Intrinsics.areEqual(this.f54895a, eventMetadata.f54895a) && this.f54896b == eventMetadata.f54896b && Intrinsics.areEqual(this.f54897c, eventMetadata.f54897c);
        }
        return false;
    }

    @NotNull
    public final Map<String, String> getAdditionalCustomKeys() {
        return this.f54897c;
    }

    @NotNull
    public final String getSessionId() {
        return this.f54895a;
    }

    public final long getTimestamp() {
        return this.f54896b;
    }

    public int hashCode() {
        return (((this.f54895a.hashCode() * 31) + AbstractC17792Ig1.m67882a(this.f54896b)) * 31) + this.f54897c.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventMetadata(sessionId=" + this.f54895a + ", timestamp=" + this.f54896b + ", additionalCustomKeys=" + this.f54897c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @JvmOverloads
    public EventMetadata(@NotNull String sessionId, long j, @NotNull Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f54895a = sessionId;
        this.f54896b = j;
        this.f54897c = additionalCustomKeys;
    }

    public /* synthetic */ EventMetadata(String str, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? AbstractC11687a.emptyMap() : map);
    }
}
