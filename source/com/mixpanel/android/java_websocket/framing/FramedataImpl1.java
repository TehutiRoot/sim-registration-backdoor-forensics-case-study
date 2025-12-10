package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class FramedataImpl1 implements FrameBuilder {
    protected static byte[] emptyarray = new byte[0];

    /* renamed from: a */
    public ByteBuffer f58452a;
    protected boolean fin;
    protected Framedata.Opcode optcode;
    protected boolean transferemasked;

    public FramedataImpl1() {
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public void append(Framedata framedata) throws InvalidFrameException {
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.f58452a == null) {
            this.f58452a = ByteBuffer.allocate(payloadData.remaining());
            payloadData.mark();
            this.f58452a.put(payloadData);
            payloadData.reset();
        } else {
            payloadData.mark();
            ByteBuffer byteBuffer = this.f58452a;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f58452a;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (payloadData.remaining() > this.f58452a.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(payloadData.remaining() + this.f58452a.capacity());
                this.f58452a.flip();
                allocate.put(this.f58452a);
                allocate.put(payloadData);
                this.f58452a = allocate;
            } else {
                this.f58452a.put(payloadData);
            }
            this.f58452a.rewind();
            payloadData.reset();
        }
        this.fin = framedata.isFin();
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public Framedata.Opcode getOpcode() {
        return this.optcode;
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        return this.f58452a;
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public boolean getTransfereMasked() {
        return this.transferemasked;
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public boolean isFin() {
        return this.fin;
    }

    @Override // com.mixpanel.android.java_websocket.framing.FrameBuilder
    public void setFin(boolean z) {
        this.fin = z;
    }

    @Override // com.mixpanel.android.java_websocket.framing.FrameBuilder
    public void setOptcode(Framedata.Opcode opcode) {
        this.optcode = opcode;
    }

    @Override // com.mixpanel.android.java_websocket.framing.FrameBuilder
    public void setPayload(ByteBuffer byteBuffer) throws InvalidDataException {
        this.f58452a = byteBuffer;
    }

    @Override // com.mixpanel.android.java_websocket.framing.FrameBuilder
    public void setTransferemasked(boolean z) {
        this.transferemasked = z;
    }

    public String toString() {
        return "Framedata{ optcode:" + getOpcode() + ", fin:" + isFin() + ", payloadlength:[pos:" + this.f58452a.position() + ", len:" + this.f58452a.remaining() + "], payload:" + Arrays.toString(Charsetfunctions.utf8Bytes(new String(this.f58452a.array()))) + "}";
    }

    public FramedataImpl1(Framedata.Opcode opcode) {
        this.optcode = opcode;
        this.f58452a = ByteBuffer.wrap(emptyarray);
    }

    public FramedataImpl1(Framedata framedata) {
        this.fin = framedata.isFin();
        this.optcode = framedata.getOpcode();
        this.f58452a = framedata.getPayloadData();
        this.transferemasked = framedata.getTransfereMasked();
    }
}
