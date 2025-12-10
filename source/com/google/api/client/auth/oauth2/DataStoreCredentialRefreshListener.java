package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;

@Beta
/* loaded from: classes4.dex */
public final class DataStoreCredentialRefreshListener implements CredentialRefreshListener {

    /* renamed from: a */
    public final DataStore f51739a;

    /* renamed from: b */
    public final String f51740b;

    public DataStoreCredentialRefreshListener(String str, DataStoreFactory dataStoreFactory) throws IOException {
        this(str, StoredCredential.getDefaultDataStore(dataStoreFactory));
    }

    public DataStore<StoredCredential> getCredentialDataStore() {
        return this.f51739a;
    }

    public void makePersistent(Credential credential) throws IOException {
        this.f51739a.set(this.f51740b, new StoredCredential(credential));
    }

    @Override // com.google.api.client.auth.oauth2.CredentialRefreshListener
    public void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException {
        makePersistent(credential);
    }

    @Override // com.google.api.client.auth.oauth2.CredentialRefreshListener
    public void onTokenResponse(Credential credential, TokenResponse tokenResponse) throws IOException {
        makePersistent(credential);
    }

    public DataStoreCredentialRefreshListener(String str, DataStore<StoredCredential> dataStore) {
        this.f51740b = (String) Preconditions.checkNotNull(str);
        this.f51739a = (DataStore) Preconditions.checkNotNull(dataStore);
    }
}
