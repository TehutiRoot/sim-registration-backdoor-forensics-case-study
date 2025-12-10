package com.google.api.client.googleapis.mtls;

import com.google.api.client.util.Beta;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

@Beta
/* loaded from: classes4.dex */
public interface MtlsProvider {
    KeyStore getKeyStore() throws IOException, GeneralSecurityException;

    String getKeyStorePassword();

    boolean useMtlsClientCertificate();
}
