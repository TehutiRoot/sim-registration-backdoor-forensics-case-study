package com.mixpanel.android.java_websocket.drafts;

import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;

/* loaded from: classes5.dex */
public class Draft_17 extends Draft_10 {
    @Override // com.mixpanel.android.java_websocket.drafts.Draft_10, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) throws InvalidHandshakeException {
        if (Draft_10.readVersion(clientHandshake) == 13) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_10, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft copyInstance() {
        return new Draft_17();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_10, com.mixpanel.android.java_websocket.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        super.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
        clientHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_VERSION, "13");
        return clientHandshakeBuilder;
    }
}
