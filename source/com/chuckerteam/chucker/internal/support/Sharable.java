package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/Sharable;", "", "toSharableContent", "Lokio/Source;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface Sharable {
    @NotNull
    Source toSharableContent(@NotNull Context context);
}
