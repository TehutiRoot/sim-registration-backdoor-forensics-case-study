package com.google.auth.oauth2;

import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public interface ExecutableHandler {

    /* loaded from: classes4.dex */
    public interface ExecutableOptions {
        Map<String, String> getEnvironmentMap();

        String getExecutableCommand();

        int getExecutableTimeoutMs();

        @Nullable
        String getOutputFilePath();
    }

    /* renamed from: a */
    String mo41485a(ExecutableOptions executableOptions);
}
