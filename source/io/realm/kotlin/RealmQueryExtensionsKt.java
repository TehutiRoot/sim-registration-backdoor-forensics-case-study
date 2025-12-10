package io.realm.kotlin;

import io.realm.Case;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\t\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\u0010\u000b\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\u0007¢\u0006\u0002\u0010\u000f\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0007¢\u0006\u0002\u0010\u0011\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0007¢\u0006\u0002\u0010\u0013\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0007¢\u0006\u0002\u0010\u0015\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0007¢\u0006\u0002\u0010\u0017\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m28850d2 = {"oneOf", "Lio/realm/RealmQuery;", "T", "Lio/realm/RealmModel;", "propertyName", "", "value", "", "Ljava/util/Date;", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/util/Date;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Boolean;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Byte;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Double;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Float;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Integer;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Long;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Short;)Lio/realm/RealmQuery;", "casing", "Lio/realm/Case;", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/String;Lio/realm/Case;)Lio/realm/RealmQuery;", "realm-kotlin-extensions_baseRelease"}, m28849k = 2, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class RealmQueryExtensionsKt {
    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull String[] value, @NotNull Case casing) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(casing, "casing");
        RealmQuery<T> m29599in = realmQuery.m29599in(propertyName, value, casing);
        Intrinsics.checkNotNullExpressionValue(m29599in, "this.`in`(propertyName, value, casing)");
        return m29599in;
    }

    public static /* synthetic */ RealmQuery oneOf$default(RealmQuery realmQuery, String str, String[] strArr, Case r3, int i, Object obj) {
        if ((i & 4) != 0) {
            r3 = Case.SENSITIVE;
        }
        return oneOf(realmQuery, str, strArr, r3);
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Byte[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29606in = realmQuery.m29606in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29606in, "this.`in`(propertyName, value)");
        return m29606in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Short[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29601in = realmQuery.m29601in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29601in, "this.`in`(propertyName, value)");
        return m29601in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Integer[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29603in = realmQuery.m29603in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29603in, "this.`in`(propertyName, value)");
        return m29603in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Long[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29602in = realmQuery.m29602in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29602in, "this.`in`(propertyName, value)");
        return m29602in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Double[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29605in = realmQuery.m29605in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29605in, "this.`in`(propertyName, value)");
        return m29605in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Float[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29604in = realmQuery.m29604in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29604in, "this.`in`(propertyName, value)");
        return m29604in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Boolean[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29607in = realmQuery.m29607in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29607in, "this.`in`(propertyName, value)");
        return m29607in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Date[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29598in = realmQuery.m29598in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29598in, "this.`in`(propertyName, value)");
        return m29598in;
    }
}
