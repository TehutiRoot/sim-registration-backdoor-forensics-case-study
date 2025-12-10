package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class CrashlyticsWorkers$Companion$checkNotMainThread$2 extends Lambda implements Function0<String> {
    public static final CrashlyticsWorkers$Companion$checkNotMainThread$2 INSTANCE = new CrashlyticsWorkers$Companion$checkNotMainThread$2();

    public CrashlyticsWorkers$Companion$checkNotMainThread$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        String m38952b;
        StringBuilder sb = new StringBuilder();
        sb.append("Must not be called on a main thread, was called on ");
        m38952b = CrashlyticsWorkers.Companion.m38952b();
        sb.append(m38952b);
        sb.append('.');
        return sb.toString();
    }
}
