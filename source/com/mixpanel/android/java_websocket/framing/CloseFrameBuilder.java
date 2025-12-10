package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class CloseFrameBuilder extends FramedataImpl1 implements CloseFrame {

    /* renamed from: d */
    public static final ByteBuffer f58449d = ByteBuffer.allocate(0);

    /* renamed from: b */
    public int f58450b;

    /* renamed from: c */
    public String f58451c;

    public CloseFrameBuilder() {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
    }

    /* renamed from: a */
    public final void m33682a() {
        this.f58450b = 1005;
        ByteBuffer payloadData = super.getPayloadData();
        payloadData.mark();
        if (payloadData.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(payloadData.getShort());
            allocate.position(0);
            int i = allocate.getInt();
            this.f58450b = i;
            if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f58450b);
            }
        }
        payloadData.reset();
    }

    /* renamed from: b */
    public final void m33681b() {
        if (this.f58450b == 1005) {
            this.f58451c = Charsetfunctions.stringUtf8(super.getPayloadData());
            return;
        }
        ByteBuffer payloadData = super.getPayloadData();
        int position = payloadData.position();
        try {
            try {
                payloadData.position(payloadData.position() + 2);
                this.f58451c = Charsetfunctions.stringUtf8(payloadData);
            } catch (IllegalArgumentException e) {
                throw new InvalidFrameException(e);
            }
        } finally {
            payloadData.position(position);
        }
    }

    /* renamed from: c */
    public final void m33680c(int i, String str) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (i == 1015) {
            i = 1005;
        } else {
            str2 = str;
        }
        if (i == 1005) {
            if (str2.length() <= 0) {
                return;
            }
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
        byte[] utf8Bytes = Charsetfunctions.utf8Bytes(str2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(utf8Bytes.length + 2);
        allocate2.put(allocate);
        allocate2.put(utf8Bytes);
        allocate2.rewind();
        setPayload(allocate2);
    }

    @Override // com.mixpanel.android.java_websocket.framing.CloseFrame
    public int getCloseCode() {
        return this.f58450b;
    }

    @Override // com.mixpanel.android.java_websocket.framing.CloseFrame
    public String getMessage() {
        return this.f58451c;
    }

    @Override // com.mixpanel.android.java_websocket.framing.FramedataImpl1, com.mixpanel.android.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        if (this.f58450b == 1005) {
            return f58449d;
        }
        return super.getPayloadData();
    }

    @Override // com.mixpanel.android.java_websocket.framing.FramedataImpl1, com.mixpanel.android.java_websocket.framing.FrameBuilder
    public void setPayload(ByteBuffer byteBuffer) throws InvalidDataException {
        super.setPayload(byteBuffer);
        m33682a();
        m33681b();
    }

    @Override // com.mixpanel.android.java_websocket.framing.FramedataImpl1
    public String toString() {
        return super.toString() + "code: " + this.f58450b;
    }

    public CloseFrameBuilder(int i) throws InvalidDataException {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        m33680c(i, "");
    }

    public CloseFrameBuilder(int i, String str) throws InvalidDataException {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        m33680c(i, str);
    }
}
