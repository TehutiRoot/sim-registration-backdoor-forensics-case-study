package io.realm.kotlin;

import io.realm.Case;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\t\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\u0010\u000b\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\u0007¢\u0006\u0002\u0010\u000f\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0007¢\u0006\u0002\u0010\u0011\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0007¢\u0006\u0002\u0010\u0013\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0007¢\u0006\u0002\u0010\u0015\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0007¢\u0006\u0002\u0010\u0017\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m29142d2 = {"oneOf", "Lio/realm/RealmQuery;", "T", "Lio/realm/RealmModel;", "propertyName", "", "value", "", "Ljava/util/Date;", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/util/Date;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Boolean;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Byte;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Double;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Float;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Integer;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Long;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Short;)Lio/realm/RealmQuery;", "casing", "Lio/realm/Case;", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/String;Lio/realm/Case;)Lio/realm/RealmQuery;", "realm-kotlin-extensions_baseRelease"}, m29141k = 2, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class RealmQueryExtensionsKt {
    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull String[] value, @NotNull Case casing) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(casing, "casing");
        RealmQuery<T> m29939in = realmQuery.m29939in(propertyName, value, casing);
        Intrinsics.checkNotNullExpressionValue(m29939in, "this.`in`(propertyName, value, casing)");
        return m29939in;
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
        RealmQuery<T> m29946in = realmQuery.m29946in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29946in, "this.`in`(propertyName, value)");
        return m29946in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Short[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29941in = realmQuery.m29941in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29941in, "this.`in`(propertyName, value)");
        return m29941in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Integer[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29943in = realmQuery.m29943in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29943in, "this.`in`(propertyName, value)");
        return m29943in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Long[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29942in = realmQuery.m29942in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29942in, "this.`in`(propertyName, value)");
        return m29942in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Double[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29945in = realmQuery.m29945in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29945in, "this.`in`(propertyName, value)");
        return m29945in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Float[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29944in = realmQuery.m29944in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29944in, "this.`in`(propertyName, value)");
        return m29944in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Boolean[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29947in = realmQuery.m29947in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29947in, "this.`in`(propertyName, value)");
        return m29947in;
    }

    @NotNull
    public static final <T extends RealmModel> RealmQuery<T> oneOf(@NotNull RealmQuery<T> realmQuery, @NotNull String propertyName, @NotNull Date[] value) {
        Intrinsics.checkNotNullParameter(realmQuery, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        RealmQuery<T> m29938in = realmQuery.m29938in(propertyName, value);
        Intrinsics.checkNotNullExpressionValue(m29938in, "this.`in`(propertyName, value)");
        return m29938in;
    }
}