package com.google.firebase.appdistribution.gradle;

import com.google.common.base.Splitter;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/NameUtils;", "", "()V", "extractResourceId", "", "resourceName", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class NameUtils {
    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    public final String extractResourceId(@NotNull String resourceName) {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        List<String> splitToList = Splitter.m41289on(RemoteSettings.FORWARD_SLASH_STRING).splitToList(resourceName);
        Intrinsics.checkNotNullExpressionValue(splitToList, "on(\"/\").splitToList(resourceName)");
        Object last = CollectionsKt___CollectionsKt.last((List<? extends Object>) splitToList);
        Intrinsics.checkNotNullExpressionValue(last, "on(\"/\").splitToList(resourceName).last()");
        return (String) last;
    }
}
