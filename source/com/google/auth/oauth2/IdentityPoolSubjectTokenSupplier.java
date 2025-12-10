package com.google.auth.oauth2;

import java.io.IOException;
import java.io.Serializable;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface IdentityPoolSubjectTokenSupplier extends Serializable {
    String getSubjectToken(ExternalAccountSupplierContext externalAccountSupplierContext) throws IOException;
}
