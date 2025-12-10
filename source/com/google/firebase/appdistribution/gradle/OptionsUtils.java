package com.google.firebase.appdistribution.gradle;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.p014io.Files;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¨\u0006\u000f"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/OptionsUtils;", "", "()V", "ensureFileExists", "Ljava/io/File;", ClientCookie.PATH_ATTR, "", "missingFileReason", "Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;", "getValueFromStringOrFile", "value", "splitCommaOrNewlineSeparatedString", "", "str", "splitSemicolonOrNewlineSeparatedString", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class OptionsUtils {
    @NotNull
    public static final OptionsUtils INSTANCE = new OptionsUtils();

    @JvmStatic
    @NotNull
    public static final File ensureFileExists(@Nullable String str, @NotNull AppDistributionException.Reason missingFileReason) {
        Intrinsics.checkNotNullParameter(missingFileReason, "missingFileReason");
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        throw new AppDistributionException(missingFileReason, null, null, 6, null);
    }

    @JvmStatic
    @Nullable
    public static final String getValueFromStringOrFile(@Nullable String str, @Nullable String str2) {
        if ((str == null || str.length() == 0) && str2 != null && str2.length() != 0) {
            try {
                return Files.asCharSource(new File(str2), Charsets.UTF_8).read();
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to read file \"" + str2 + '\"', e);
            }
        }
        return str;
    }

    @JvmStatic
    @NotNull
    public static final List<String> splitCommaOrNewlineSeparatedString(@Nullable String str) {
        if (str == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> splitToList = Splitter.m41288on(Pattern.compile("[,\n]")).omitEmptyStrings().trimResults().splitToList(str);
        Intrinsics.checkNotNullExpressionValue(splitToList, "on(Pattern.compile(\"[,\\n…esults().splitToList(str)");
        return splitToList;
    }

    @NotNull
    public final List<String> splitSemicolonOrNewlineSeparatedString(@Nullable String str) {
        if (str == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> splitToList = Splitter.m41288on(Pattern.compile("[;\n]")).omitEmptyStrings().trimResults().splitToList(str);
        Intrinsics.checkNotNullExpressionValue(splitToList, "on(Pattern.compile(\"[;\\n…esults().splitToList(str)");
        return splitToList;
    }
}
