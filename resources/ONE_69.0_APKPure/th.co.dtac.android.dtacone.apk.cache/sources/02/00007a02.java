package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class EchoEncoder<E> extends EncoderBase<E> {

    /* renamed from: c */
    public String f39739c;

    /* renamed from: d */
    public String f39740d;

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] encode(E e) {
        return (e + CoreConstants.LINE_SEPARATOR).getBytes();
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] footerBytes() {
        String str = this.f39740d;
        if (str == null) {
            return null;
        }
        return str.getBytes();
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] headerBytes() {
        String str = this.f39739c;
        if (str == null) {
            return null;
        }
        return str.getBytes();
    }
}