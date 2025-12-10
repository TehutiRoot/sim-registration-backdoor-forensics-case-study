package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.json.JsonFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public class CloudShellCredential extends GoogleCredential {
    protected static final String GET_AUTH_TOKEN_REQUEST = "2\n[]";

    /* renamed from: u */
    public final int f51797u;

    /* renamed from: v */
    public final JsonFactory f51798v;

    public CloudShellCredential(int i, JsonFactory jsonFactory) {
        this.f51797u = i;
        this.f51798v = jsonFactory;
    }

    @Override // com.google.api.client.googleapis.auth.oauth2.GoogleCredential, com.google.api.client.auth.oauth2.Credential
    public TokenResponse executeRefreshToken() throws IOException {
        Socket socket = new Socket("localhost", getAuthPort());
        socket.setSoTimeout(5000);
        TokenResponse tokenResponse = new TokenResponse();
        try {
            new PrintWriter(socket.getOutputStream(), true).println(GET_AUTH_TOKEN_REQUEST);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.readLine();
            tokenResponse.setAccessToken(((List) this.f51798v.createJsonParser(bufferedReader).parseArray(LinkedList.class, Object.class)).get(2).toString());
            return tokenResponse;
        } finally {
            socket.close();
        }
    }

    public int getAuthPort() {
        return this.f51797u;
    }
}
