package com.google.auth.oauth2;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public class CloudShellCredentials extends GoogleCredentials {
    private static final int ACCESS_TOKEN_INDEX = 2;
    protected static final String GET_AUTH_TOKEN_REQUEST = "2\n[]";
    protected static final byte[] GET_AUTH_TOKEN_REQUEST_BYTES = "2\n[]\n".getBytes(StandardCharsets.UTF_8);
    private static final int READ_TIMEOUT_MS = 5000;
    private static final long serialVersionUID = -2133257318957488451L;
    private final int authPort;

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public int f52412d;

        public Builder() {
        }

        public int getAuthPort() {
            return this.f52412d;
        }

        @CanIgnoreReturnValue
        public Builder setAuthPort(int i) {
            this.f52412d = i;
            return this;
        }

        public Builder(CloudShellCredentials cloudShellCredentials) {
            this.f52412d = cloudShellCredentials.authPort;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            this.quotaProjectId = str;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public CloudShellCredentials build() {
            return new CloudShellCredentials(this);
        }
    }

    public static CloudShellCredentials create(int i) {
        return newBuilder().setAuthPort(i).build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof CloudShellCredentials) || this.authPort != ((CloudShellCredentials) obj).authPort) {
            return false;
        }
        return true;
    }

    public int getAuthPort() {
        return this.authPort;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.authPort));
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        Socket socket = new Socket("localhost", getAuthPort());
        socket.setSoTimeout(5000);
        try {
            socket.getOutputStream().write(GET_AUTH_TOKEN_REQUEST_BYTES);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.readLine();
            return new AccessToken(((List) CJ0.f695f.createJsonParser(bufferedReader).parseArray(ArrayList.class, Object.class)).get(2).toString(), (Date) null);
        } finally {
            socket.close();
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return MoreObjects.toStringHelper(this).add("authPort", this.authPort).toString();
    }

    private CloudShellCredentials(Builder builder) {
        super(builder);
        this.authPort = builder.getAuthPort();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }
}
