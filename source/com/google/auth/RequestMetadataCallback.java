package com.google.auth;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface RequestMetadataCallback {
    void onFailure(Throwable th2);

    void onSuccess(Map<String, List<String>> map);
}
