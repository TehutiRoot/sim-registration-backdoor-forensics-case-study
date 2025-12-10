package com.google.auth.oauth2;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface AwsSecurityCredentialsSupplier extends Serializable {
    AwsSecurityCredentials getCredentials(ExternalAccountSupplierContext externalAccountSupplierContext) throws IOException;

    String getRegion(ExternalAccountSupplierContext externalAccountSupplierContext) throws IOException;
}
