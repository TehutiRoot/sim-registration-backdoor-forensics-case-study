package ch.qos.logback.core.encoder;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.OutputStreamAppender;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class LayoutWrappingEncoder<E> extends EncoderBase<E> {

    /* renamed from: c */
    public Charset f39743c;

    /* renamed from: d */
    public Appender f39744d;

    /* renamed from: e */
    public Boolean f39745e = null;
    protected Layout<E> layout;

    /* renamed from: b */
    public final void m51536b(StringBuilder sb, String str) {
        if (str != null) {
            sb.append(str);
        }
    }

    /* renamed from: d */
    public final byte[] m51535d(String str) {
        Charset charset = this.f39743c;
        return charset == null ? str.getBytes() : str.getBytes(charset);
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] encode(E e) {
        return m51535d(this.layout.doLayout(e));
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] footerBytes() {
        if (this.layout == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m51536b(sb, this.layout.getPresentationFooter());
        m51536b(sb, this.layout.getFileFooter());
        return m51535d(sb.toString());
    }

    public Charset getCharset() {
        return this.f39743c;
    }

    public Layout<E> getLayout() {
        return this.layout;
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] headerBytes() {
        if (this.layout == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m51536b(sb, this.layout.getFileHeader());
        m51536b(sb, this.layout.getPresentationHeader());
        if (sb.length() > 0) {
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        return m51535d(sb.toString());
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return false;
    }

    public void setCharset(Charset charset) {
        this.f39743c = charset;
    }

    public void setImmediateFlush(boolean z) {
        addWarn("As of version 1.2.0 \"immediateFlush\" property should be set within the enclosing Appender.");
        addWarn("Please move \"immediateFlush\" property into the enclosing appender.");
        this.f39745e = Boolean.valueOf(z);
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public void setParent(Appender<?> appender) {
        this.f39744d = appender;
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.f39745e != null) {
            if (this.f39744d instanceof OutputStreamAppender) {
                addWarn("Setting the \"immediateFlush\" property of the enclosing appender to " + this.f39745e);
                ((OutputStreamAppender) this.f39744d).setImmediateFlush(this.f39745e.booleanValue());
            } else {
                addError("Could not set the \"immediateFlush\" property of the enclosing appender.");
            }
        }
        this.started = true;
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }
}
