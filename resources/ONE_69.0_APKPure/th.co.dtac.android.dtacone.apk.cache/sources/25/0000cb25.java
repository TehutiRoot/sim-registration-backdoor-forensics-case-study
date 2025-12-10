package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ChoiceChannelCredentials extends ChannelCredentials {

    /* renamed from: a */
    public final List f63159a;

    public ChoiceChannelCredentials(List list) {
        this.f63159a = list;
    }

    public static ChannelCredentials create(ChannelCredentials... channelCredentialsArr) {
        if (channelCredentialsArr.length != 0) {
            for (ChannelCredentials channelCredentials : channelCredentialsArr) {
                channelCredentials.getClass();
            }
            return new ChoiceChannelCredentials(Collections.unmodifiableList(new ArrayList(Arrays.asList(channelCredentialsArr))));
        }
        throw new IllegalArgumentException("At least one credential is required");
    }

    public List<ChannelCredentials> getCredentialsList() {
        return this.f63159a;
    }

    @Override // io.grpc.ChannelCredentials
    public ChannelCredentials withoutBearerTokens() {
        ArrayList arrayList = new ArrayList();
        for (ChannelCredentials channelCredentials : this.f63159a) {
            arrayList.add(channelCredentials.withoutBearerTokens());
        }
        return new ChoiceChannelCredentials(Collections.unmodifiableList(arrayList));
    }
}