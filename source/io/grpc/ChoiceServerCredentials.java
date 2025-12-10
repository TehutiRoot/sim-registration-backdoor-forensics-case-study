package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ChoiceServerCredentials extends ServerCredentials {

    /* renamed from: a */
    public final List f63097a;

    public ChoiceServerCredentials(ServerCredentials... serverCredentialsArr) {
        for (ServerCredentials serverCredentials : serverCredentialsArr) {
            serverCredentials.getClass();
        }
        this.f63097a = Collections.unmodifiableList(new ArrayList(Arrays.asList(serverCredentialsArr)));
    }

    public static ServerCredentials create(ServerCredentials... serverCredentialsArr) {
        if (serverCredentialsArr.length != 0) {
            return new ChoiceServerCredentials(serverCredentialsArr);
        }
        throw new IllegalArgumentException("At least one credential is required");
    }

    public List<ServerCredentials> getCredentialsList() {
        return this.f63097a;
    }
}
