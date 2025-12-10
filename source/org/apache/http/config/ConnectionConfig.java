package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class ConnectionConfig implements Cloneable {
    public static final ConnectionConfig DEFAULT = new Builder().build();

    /* renamed from: a */
    public final int f73765a;

    /* renamed from: b */
    public final int f73766b;

    /* renamed from: c */
    public final Charset f73767c;

    /* renamed from: d */
    public final CodingErrorAction f73768d;

    /* renamed from: e */
    public final CodingErrorAction f73769e;

    /* renamed from: f */
    public final MessageConstraints f73770f;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public int f73771a;

        /* renamed from: b */
        public int f73772b = -1;

        /* renamed from: c */
        public Charset f73773c;

        /* renamed from: d */
        public CodingErrorAction f73774d;

        /* renamed from: e */
        public CodingErrorAction f73775e;

        /* renamed from: f */
        public MessageConstraints f73776f;

        public ConnectionConfig build() {
            int i;
            int i2;
            Charset charset = this.f73773c;
            if (charset == null && (this.f73774d != null || this.f73775e != null)) {
                charset = Consts.ASCII;
            }
            Charset charset2 = charset;
            int i3 = this.f73771a;
            if (i3 > 0) {
                i = i3;
            } else {
                i = 8192;
            }
            int i4 = this.f73772b;
            if (i4 >= 0) {
                i2 = i4;
            } else {
                i2 = i;
            }
            return new ConnectionConfig(i, i2, charset2, this.f73774d, this.f73775e, this.f73776f);
        }

        public Builder setBufferSize(int i) {
            this.f73771a = i;
            return this;
        }

        public Builder setCharset(Charset charset) {
            this.f73773c = charset;
            return this;
        }

        public Builder setFragmentSizeHint(int i) {
            this.f73772b = i;
            return this;
        }

        public Builder setMalformedInputAction(CodingErrorAction codingErrorAction) {
            this.f73774d = codingErrorAction;
            if (codingErrorAction != null && this.f73773c == null) {
                this.f73773c = Consts.ASCII;
            }
            return this;
        }

        public Builder setMessageConstraints(MessageConstraints messageConstraints) {
            this.f73776f = messageConstraints;
            return this;
        }

        public Builder setUnmappableInputAction(CodingErrorAction codingErrorAction) {
            this.f73775e = codingErrorAction;
            if (codingErrorAction != null && this.f73773c == null) {
                this.f73773c = Consts.ASCII;
            }
            return this;
        }
    }

    public ConnectionConfig(int i, int i2, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, MessageConstraints messageConstraints) {
        this.f73765a = i;
        this.f73766b = i2;
        this.f73767c = charset;
        this.f73768d = codingErrorAction;
        this.f73769e = codingErrorAction2;
        this.f73770f = messageConstraints;
    }

    public static Builder copy(ConnectionConfig connectionConfig) {
        Args.notNull(connectionConfig, "Connection config");
        return new Builder().setBufferSize(connectionConfig.getBufferSize()).setCharset(connectionConfig.getCharset()).setFragmentSizeHint(connectionConfig.getFragmentSizeHint()).setMalformedInputAction(connectionConfig.getMalformedInputAction()).setUnmappableInputAction(connectionConfig.getUnmappableInputAction()).setMessageConstraints(connectionConfig.getMessageConstraints());
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getBufferSize() {
        return this.f73765a;
    }

    public Charset getCharset() {
        return this.f73767c;
    }

    public int getFragmentSizeHint() {
        return this.f73766b;
    }

    public CodingErrorAction getMalformedInputAction() {
        return this.f73768d;
    }

    public MessageConstraints getMessageConstraints() {
        return this.f73770f;
    }

    public CodingErrorAction getUnmappableInputAction() {
        return this.f73769e;
    }

    public String toString() {
        return "[bufferSize=" + this.f73765a + ", fragmentSizeHint=" + this.f73766b + ", charset=" + this.f73767c + ", malformedInputAction=" + this.f73768d + ", unmappableInputAction=" + this.f73769e + ", messageConstraints=" + this.f73770f + "]";
    }

    public ConnectionConfig clone() throws CloneNotSupportedException {
        return (ConnectionConfig) super.clone();
    }
}
