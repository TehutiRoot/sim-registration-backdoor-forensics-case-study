package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

@Beta
@Deprecated
/* loaded from: classes4.dex */
public final class CredentialStoreRefreshListener implements CredentialRefreshListener {

    /* renamed from: a */
    public final CredentialStore f51737a;

    /* renamed from: b */
    public final String f51738b;

    public CredentialStoreRefreshListener(String str, CredentialStore credentialStore) {
        this.f51738b = (String) Preconditions.checkNotNull(str);
        this.f51737a = (CredentialStore) Preconditions.checkNotNull(credentialStore);
    }

    public CredentialStore getCredentialStore() {
        return this.f51737a;
    }

    public void makePersistent(Credential credential) throws IOException {
        this.f51737a.store(this.f51738b, credential);
    }

    @Override // com.google.api.client.auth.oauth2.CredentialRefreshListener
    public void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException {
        makePersistent(credential);
    }

    @Override // com.google.api.client.auth.oauth2.CredentialRefreshListener
    public void onTokenResponse(Credential credential, TokenResponse tokenResponse) throws IOException {
        makePersistent(credential);
    }
}
