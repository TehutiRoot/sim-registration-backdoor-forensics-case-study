package com.mixpanel.android.java_websocket.drafts;

import android.annotation.SuppressLint;
import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.CloseFrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.HandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.bouncycastle.asn1.cmc.BodyPartID;

@SuppressLint({"UseValueOf"})
/* loaded from: classes5.dex */
public class Draft_76 extends Draft_75 {

    /* renamed from: d */
    public static final byte[] f58458d = {-1, 0};

    /* renamed from: b */
    public boolean f58459b = false;

    /* renamed from: c */
    public final Random f58460c = new Random();

    /* renamed from: a */
    public static String m33676a() {
        Random random = new Random();
        long nextInt = random.nextInt(12) + 1;
        String l = Long.toString((random.nextInt(Math.abs(new Long(BodyPartID.bodyIdMax / nextInt).intValue())) + 1) * nextInt);
        int nextInt2 = random.nextInt(12) + 1;
        for (int i = 0; i < nextInt2; i++) {
            int abs = Math.abs(random.nextInt(l.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l = new StringBuilder(l).insert(abs, nextInt3).toString();
        }
        for (int i2 = 0; i2 < nextInt; i2++) {
            l = new StringBuilder(l).insert(Math.abs(random.nextInt(l.length() - 1) + 1), HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).toString();
        }
        return l;
    }

    /* renamed from: b */
    public static byte[] m33675b(String str) {
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = str.split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).length - 1;
            if (length != 0) {
                long longValue = new Long(parseLong / length).longValue();
                return new byte[]{(byte) (longValue >> 24), (byte) ((longValue << 8) >> 24), (byte) ((longValue << 16) >> 24), (byte) ((longValue << 24) >> 24)};
            }
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    public static byte[] createChallenge(String str, String str2, byte[] bArr) throws InvalidHandshakeException {
        byte[] m33675b = m33675b(str);
        byte[] m33675b2 = m33675b(str2);
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(new byte[]{m33675b[0], m33675b[1], m33675b[2], m33675b[3], m33675b2[0], m33675b2[1], m33675b2[2], m33675b2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        if (this.f58459b) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        try {
            if (serverHandshake.getFieldValue("Sec-WebSocket-Origin").equals(clientHandshake.getFieldValue(HttpHeaders.ORIGIN)) && basicAccept(serverHandshake)) {
                byte[] content = serverHandshake.getContent();
                if (content != null && content.length != 0) {
                    if (Arrays.equals(content, createChallenge(clientHandshake.getFieldValue("Sec-WebSocket-Key1"), clientHandshake.getFieldValue("Sec-WebSocket-Key2"), clientHandshake.getContent()))) {
                        return Draft.HandshakeState.MATCHED;
                    }
                    return Draft.HandshakeState.NOT_MATCHED;
                }
                throw new IncompleteHandshakeException();
            }
            return Draft.HandshakeState.NOT_MATCHED;
        } catch (InvalidHandshakeException e) {
            throw new RuntimeException("bad handshakerequest", e);
        }
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        if (clientHandshake.getFieldValue("Upgrade").equals("WebSocket") && clientHandshake.getFieldValue("Connection").contains("Upgrade") && clientHandshake.getFieldValue("Sec-WebSocket-Key1").length() > 0 && !clientHandshake.getFieldValue("Sec-WebSocket-Key2").isEmpty() && clientHandshake.hasFieldValue(HttpHeaders.ORIGIN)) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft copyInstance() {
        return new Draft_76();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        if (framedata.getOpcode() == Framedata.Opcode.CLOSING) {
            return ByteBuffer.wrap(f58458d);
        }
        return super.createBinaryFrame(framedata);
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        return Draft.CloseHandshakeType.ONEWAY;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put("Upgrade", "WebSocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        clientHandshakeBuilder.put("Sec-WebSocket-Key1", m33676a());
        clientHandshakeBuilder.put("Sec-WebSocket-Key2", m33676a());
        if (!clientHandshakeBuilder.hasFieldValue(HttpHeaders.ORIGIN)) {
            clientHandshakeBuilder.put(HttpHeaders.ORIGIN, "random" + this.f58460c.nextInt());
        }
        byte[] bArr = new byte[8];
        this.f58460c.nextBytes(bArr);
        clientHandshakeBuilder.setContent(bArr);
        return clientHandshakeBuilder;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) throws InvalidHandshakeException {
        serverHandshakeBuilder.setHttpStatusMessage("WebSocket Protocol Handshake");
        serverHandshakeBuilder.put("Upgrade", "WebSocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.put("Sec-WebSocket-Origin", clientHandshake.getFieldValue(HttpHeaders.ORIGIN));
        serverHandshakeBuilder.put("Sec-WebSocket-Location", "ws://" + clientHandshake.getFieldValue("Host") + clientHandshake.getResourceDescriptor());
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Key1");
        String fieldValue2 = clientHandshake.getFieldValue("Sec-WebSocket-Key2");
        byte[] content = clientHandshake.getContent();
        if (fieldValue != null && fieldValue2 != null && content != null && content.length == 8) {
            serverHandshakeBuilder.setContent(createChallenge(fieldValue, fieldValue2, content));
            return serverHandshakeBuilder;
        }
        throw new InvalidHandshakeException("Bad keys");
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_75, com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) throws InvalidDataException {
        byteBuffer.mark();
        List<Framedata> translateRegularFrame = super.translateRegularFrame(byteBuffer);
        if (translateRegularFrame == null) {
            byteBuffer.reset();
            List<Framedata> list = this.readyframes;
            this.readingState = true;
            if (this.currentFrame == null) {
                this.currentFrame = ByteBuffer.allocate(2);
                if (byteBuffer.remaining() <= this.currentFrame.remaining()) {
                    this.currentFrame.put(byteBuffer);
                    if (!this.currentFrame.hasRemaining()) {
                        if (Arrays.equals(this.currentFrame.array(), f58458d)) {
                            list.add(new CloseFrameBuilder(1000));
                            return list;
                        }
                        throw new InvalidFrameException();
                    }
                    this.readyframes = new LinkedList();
                    return list;
                }
                throw new InvalidFrameException();
            }
            throw new InvalidFrameException();
        }
        return translateRegularFrame;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Handshakedata translateHandshake(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        int i;
        HandshakeBuilder translateHandshakeHttp = Draft.translateHandshakeHttp(byteBuffer, this.role);
        if ((translateHandshakeHttp.hasFieldValue("Sec-WebSocket-Key1") || this.role == WebSocket.Role.CLIENT) && !translateHandshakeHttp.hasFieldValue(HttpHeaders.SEC_WEBSOCKET_VERSION)) {
            if (this.role == WebSocket.Role.SERVER) {
                i = 8;
            } else {
                i = 16;
            }
            byte[] bArr = new byte[i];
            try {
                byteBuffer.get(bArr);
                translateHandshakeHttp.setContent(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return translateHandshakeHttp;
    }
}