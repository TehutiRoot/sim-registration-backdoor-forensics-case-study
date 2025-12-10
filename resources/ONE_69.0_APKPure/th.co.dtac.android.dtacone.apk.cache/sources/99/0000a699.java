package com.google.auth;

/* loaded from: classes4.dex */
public interface Retryable {
    int getRetryCount();

    boolean isRetryable();
}