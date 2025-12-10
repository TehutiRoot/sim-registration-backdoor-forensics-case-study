package com.mixpanel.android.java_websocket.drafts;

import android.annotation.SuppressLint;
import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.LimitExedeedException;
import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.framing.CloseFrameBuilder;
import com.mixpanel.android.java_websocket.framing.FrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.framing.FramedataImpl1;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.HandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder;
import com.mixpanel.android.java_websocket.util.Base64;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import okhttp3.internal.p026ws.WebSocketProtocol;

@SuppressLint({"Assert", "UseValueOf"})
/* loaded from: classes5.dex */
public class Draft_10 extends Draft {

    /* renamed from: a */
    public ByteBuffer f58452a;

    /* renamed from: b */
    public Framedata f58453b = null;

    /* renamed from: c */
    public final Random f58454c = new Random();

    /* loaded from: classes5.dex */
    public class IncompleteException extends Throwable {
        private static final long serialVersionUID = 7330519489840500997L;
        private int preferedsize;

        public IncompleteException(int i) {
            this.preferedsize = i;
        }

        public int getPreferedSize() {
            return this.preferedsize;
        }
    }

    public static int readVersion(Handshakedata handshakedata) {
        String fieldValue = handshakedata.getFieldValue(HttpHeaders.SEC_WEBSOCKET_VERSION);
        if (fieldValue.length() > 0) {
            try {
                return new Integer(fieldValue.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final byte m33680a(Framedata.Opcode opcode) {
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            return (byte) 0;
        }
        if (opcode == Framedata.Opcode.TEXT) {
            return (byte) 1;
        }
        if (opcode == Framedata.Opcode.BINARY) {
            return (byte) 2;
        }
        if (opcode == Framedata.Opcode.CLOSING) {
            return (byte) 8;
        }
        if (opcode == Framedata.Opcode.PING) {
            return (byte) 9;
        }
        if (opcode == Framedata.Opcode.PONG) {
            return (byte) 10;
        }
        throw new RuntimeException("Don't know how to handle " + opcode.toString());
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) throws InvalidHandshakeException {
        if (clientHandshake.hasFieldValue(HttpHeaders.SEC_WEBSOCKET_KEY) && serverHandshake.hasFieldValue(HttpHeaders.SEC_WEBSOCKET_ACCEPT)) {
            if (m33679b(clientHandshake.getFieldValue(HttpHeaders.SEC_WEBSOCKET_KEY)).equals(serverHandshake.getFieldValue(HttpHeaders.SEC_WEBSOCKET_ACCEPT))) {
                return Draft.HandshakeState.MATCHED;
            }
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) throws InvalidHandshakeException {
        int readVersion = readVersion(clientHandshake);
        if (readVersion != 7 && readVersion != 8) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (basicAccept(clientHandshake)) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    /* renamed from: b */
    public final String m33679b(String str) {
        try {
            return Base64.encodeBytes(MessageDigest.getInstance("SHA1").digest((str.trim() + WebSocketProtocol.ACCEPT_MAGIC).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final byte[] m33678c(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft copyInstance() {
        return new Draft_10();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        ByteBuffer payloadData = framedata.getPayloadData();
        int i5 = 0;
        if (this.role == WebSocket.Role.CLIENT) {
            z = true;
        } else {
            z = false;
        }
        if (payloadData.remaining() <= 125) {
            i = 1;
        } else if (payloadData.remaining() <= 65535) {
            i = 2;
        } else {
            i = 8;
        }
        if (i > 1) {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        int i6 = i2 + 1;
        if (z) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i6 + i3 + payloadData.remaining());
        byte m33680a = m33680a(framedata.getOpcode());
        byte b = Byte.MIN_VALUE;
        if (framedata.isFin()) {
            i4 = -128;
        } else {
            i4 = 0;
        }
        allocate.put((byte) (((byte) i4) | m33680a));
        byte[] m33678c = m33678c(payloadData.remaining(), i);
        if (i == 1) {
            byte b2 = m33678c[0];
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b2 | b));
        } else if (i == 2) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | 126));
            allocate.put(m33678c);
        } else if (i == 8) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | Byte.MAX_VALUE));
            allocate.put(m33678c);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f58454c.nextInt());
            allocate.put(allocate2.array());
            while (payloadData.hasRemaining()) {
                allocate.put((byte) (payloadData.get() ^ allocate2.get(i5 % 4)));
                i5++;
            }
        } else {
            allocate.put(payloadData);
        }
        allocate.flip();
        return allocate;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(byteBuffer);
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.BINARY);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    /* renamed from: d */
    public final Framedata.Opcode m33677d(byte b) {
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    switch (b) {
                        case 8:
                            return Framedata.Opcode.CLOSING;
                        case 9:
                            return Framedata.Opcode.PING;
                        case 10:
                            return Framedata.Opcode.PONG;
                        default:
                            throw new InvalidFrameException("unknow optcode " + ((int) b));
                    }
                }
                return Framedata.Opcode.BINARY;
            }
            return Framedata.Opcode.TEXT;
        }
        return Framedata.Opcode.CONTINUOUS;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        return Draft.CloseHandshakeType.TWOWAY;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put("Upgrade", "websocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        clientHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_VERSION, "8");
        byte[] bArr = new byte[16];
        this.f58454c.nextBytes(bArr);
        clientHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_KEY, Base64.encodeBytes(bArr));
        return clientHandshakeBuilder;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) throws InvalidHandshakeException {
        serverHandshakeBuilder.put("Upgrade", "websocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.setHttpStatusMessage("Switching Protocols");
        String fieldValue = clientHandshake.getFieldValue(HttpHeaders.SEC_WEBSOCKET_KEY);
        if (fieldValue != null) {
            serverHandshakeBuilder.put(HttpHeaders.SEC_WEBSOCKET_ACCEPT, m33679b(fieldValue));
            return serverHandshakeBuilder;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public void reset() {
        this.f58452a = null;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) throws LimitExedeedException, InvalidDataException {
        LinkedList linkedList = new LinkedList();
        if (this.f58452a != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f58452a.remaining();
                if (remaining2 > remaining) {
                    this.f58452a.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f58452a.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(translateSingleFrame((ByteBuffer) this.f58452a.duplicate().position(0)));
                this.f58452a = null;
            } catch (IncompleteException e) {
                this.f58452a.limit();
                ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(e.getPreferedSize()));
                this.f58452a.rewind();
                allocate.put(this.f58452a);
                this.f58452a = allocate;
                return translateFrame(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(translateSingleFrame(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(checkAlloc(e2.getPreferedSize()));
                this.f58452a = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public Framedata translateSingleFrame(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        boolean z;
        boolean z2;
        int i;
        FrameBuilder framedataImpl1;
        int remaining = byteBuffer.remaining();
        int i2 = 2;
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            if ((b >> 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            byte b2 = (byte) ((b & Byte.MAX_VALUE) >> 4);
            if (b2 == 0) {
                byte b3 = byteBuffer.get();
                if ((b3 & Byte.MIN_VALUE) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = (byte) (b3 & Byte.MAX_VALUE);
                Framedata.Opcode m33677d = m33677d((byte) (b & 15));
                if (!z && (m33677d == Framedata.Opcode.PING || m33677d == Framedata.Opcode.PONG || m33677d == Framedata.Opcode.CLOSING)) {
                    throw new InvalidFrameException("control frames may no be fragmented");
                }
                if (i3 < 0 || i3 > 125) {
                    if (m33677d != Framedata.Opcode.PING && m33677d != Framedata.Opcode.PONG && m33677d != Framedata.Opcode.CLOSING) {
                        if (i3 == 126) {
                            if (remaining >= 4) {
                                i3 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                                i2 = 4;
                            } else {
                                throw new IncompleteException(4);
                            }
                        } else {
                            i2 = 10;
                            if (remaining >= 10) {
                                byte[] bArr = new byte[8];
                                for (int i4 = 0; i4 < 8; i4++) {
                                    bArr[i4] = byteBuffer.get();
                                }
                                long longValue = new BigInteger(bArr).longValue();
                                if (longValue <= 2147483647L) {
                                    i3 = (int) longValue;
                                } else {
                                    throw new LimitExedeedException("Payloadsize is to big...");
                                }
                            } else {
                                throw new IncompleteException(10);
                            }
                        }
                    } else {
                        throw new InvalidFrameException("more than 125 octets");
                    }
                }
                if (z2) {
                    i = 4;
                } else {
                    i = 0;
                }
                int i5 = i2 + i + i3;
                if (remaining >= i5) {
                    ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(i3));
                    if (z2) {
                        byte[] bArr2 = new byte[4];
                        byteBuffer.get(bArr2);
                        for (int i6 = 0; i6 < i3; i6++) {
                            allocate.put((byte) (byteBuffer.get() ^ bArr2[i6 % 4]));
                        }
                    } else {
                        allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                        byteBuffer.position(byteBuffer.position() + allocate.limit());
                    }
                    if (m33677d == Framedata.Opcode.CLOSING) {
                        framedataImpl1 = new CloseFrameBuilder();
                    } else {
                        framedataImpl1 = new FramedataImpl1();
                        framedataImpl1.setFin(z);
                        framedataImpl1.setOptcode(m33677d);
                    }
                    allocate.flip();
                    framedataImpl1.setPayload(allocate);
                    return framedataImpl1;
                }
                throw new IncompleteException(i5);
            }
            throw new InvalidFrameException("bad rsv " + ((int) b2));
        }
        throw new IncompleteException(2);
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> createFrames(String str, boolean z) {
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(str)));
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }
}