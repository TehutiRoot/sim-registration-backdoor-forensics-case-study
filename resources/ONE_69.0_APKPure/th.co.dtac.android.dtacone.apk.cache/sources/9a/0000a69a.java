package com.google.auth;

import java.util.Objects;

/* loaded from: classes4.dex */
public interface ServiceAccountSigner {

    /* loaded from: classes4.dex */
    public static class SigningException extends RuntimeException {
        private static final long serialVersionUID = -6503954300538947223L;

        public SigningException(String str, Exception exc) {
            super(str, exc);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SigningException)) {
                return false;
            }
            SigningException signingException = (SigningException) obj;
            if (Objects.equals(getCause(), signingException.getCause()) && Objects.equals(getMessage(), signingException.getMessage())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(getMessage(), getCause());
        }
    }

    String getAccount();

    byte[] sign(byte[] bArr);
}