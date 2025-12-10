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
    public final int f73849a;

    /* renamed from: b */
    public final int f73850b;

    /* renamed from: c */
    public final Charset f73851c;

    /* renamed from: d */
    public final CodingErrorAction f73852d;

    /* renamed from: e */
    public final CodingErrorAction f73853e;

    /* renamed from: f */
    public final MessageConstraints f73854f;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public int f73855a;

        /* renamed from: b */
        public int f73856b = -1;

        /* renamed from: c */
        public Charset f73857c;

        /* renamed from: d */
        public CodingErrorAction f73858d;

        /* renamed from: e */
        public CodingErrorAction f73859e;

        /* renamed from: f */
        public MessageConstraints f73860f;

        public ConnectionConfig build() {
            int i;
            int i2;
            Charset charset = this.f73857c;
            if (charset == null && (this.f73858d != null || this.f73859e != null)) {
                charset = Consts.ASCII;
            }
            Charset charset2 = charset;
            int i3 = this.f73855a;
            if (i3 > 0) {
                i = i3;
            } else {
                i = 8192;
            }
            int i4 = this.f73856b;
            if (i4 >= 0) {
                i2 = i4;
            } else {
                i2 = i;
            }
            return new ConnectionConfig(i, i2, charset2, this.f73858d, this.f73859e, this.f73860f);
        }

        public Builder setBufferSize(int i) {
            this.f73855a = i;
            return this;
        }

        public Builder setCharset(Charset charset) {
            this.f73857c = charset;
            return this;
        }

        public Builder setFragmentSizeHint(int i) {
            this.f73856b = i;
            return this;
        }

        public Builder setMalformedInputAction(CodingErrorAction codingErrorAction) {
            this.f73858d = codingErrorAction;
            if (codingErrorAction != null && this.f73857c == null) {
                this.f73857c = Consts.ASCII;
            }
            return this;
        }

        public Builder setMessageConstraints(MessageConstraints messageConstraints) {
            this.f73860f = messageConstraints;
            return this;
        }

        public Builder setUnmappableInputAction(CodingErrorAction codingErrorAction) {
            this.f73859e = codingErrorAction;
            if (codingErrorAction != null && this.f73857c == null) {
                this.f73857c = Consts.ASCII;
            }
            return this;
        }
    }

    public ConnectionConfig(int i, int i2, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, MessageConstraints messageConstraints) {
        this.f73849a = i;
        this.f73850b = i2;
        this.f73851c = charset;
        this.f73852d = codingErrorAction;
        this.f73853e = codingErrorAction2;
        this.f73854f = messageConstraints;
    }

    public static Builder copy(ConnectionConfig connectionConfig) {
        Args.notNull(connectionConfig, "Connection config");
        return new Builder().setBufferSize(connectionConfig.getBufferSize()).setCharset(connectionConfig.getCharset()).setFragmentSizeHint(connectionConfig.getFragmentSizeHint()).setMalformedInputAction(connectionConfig.getMalformedInputAction()).setUnmappableInputAction(connectionConfig.getUnmappableInputAction()).setMessageConstraints(connectionConfig.getMessageConstraints());
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getBufferSize() {
        return this.f73849a;
    }

    public Charset getCharset() {
        return this.f73851c;
    }

    public int getFragmentSizeHint() {
        return this.f73850b;
    }

    public CodingErrorAction getMalformedInputAction() {
        return this.f73852d;
    }

    public MessageConstraints getMessageConstraints() {
        return this.f73854f;
    }

    public CodingErrorAction getUnmappableInputAction() {
        return this.f73853e;
    }

    public String toString() {
        return "[bufferSize=" + this.f73849a + ", fragmentSizeHint=" + this.f73850b + ", charset=" + this.f73851c + ", malformedInputAction=" + this.f73852d + ", unmappableInputAction=" + this.f73853e + ", messageConstraints=" + this.f73854f + "]";
    }

    public ConnectionConfig clone() throws CloneNotSupportedException {
        return (ConnectionConfig) super.clone();
    }
}