package com.google.auth.oauth2;

/* loaded from: classes4.dex */
public interface PKCEProvider {
    String getCodeChallenge();

    String getCodeChallengeMethod();

    String getCodeVerifier();
}
