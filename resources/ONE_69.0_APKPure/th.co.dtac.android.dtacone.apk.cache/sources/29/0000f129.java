package org.apache.http.config;

import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class MessageConstraints implements Cloneable {
    public static final MessageConstraints DEFAULT = new Builder().build();

    /* renamed from: a */
    public final int f73861a;

    /* renamed from: b */
    public final int f73862b;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public int f73863a = -1;

        /* renamed from: b */
        public int f73864b = -1;

        public MessageConstraints build() {
            return new MessageConstraints(this.f73863a, this.f73864b);
        }

        public Builder setMaxHeaderCount(int i) {
            this.f73864b = i;
            return this;
        }

        public Builder setMaxLineLength(int i) {
            this.f73863a = i;
            return this;
        }
    }

    public MessageConstraints(int i, int i2) {
        this.f73861a = i;
        this.f73862b = i2;
    }

    public static Builder copy(MessageConstraints messageConstraints) {
        Args.notNull(messageConstraints, "Message constraints");
        return new Builder().setMaxHeaderCount(messageConstraints.getMaxHeaderCount()).setMaxLineLength(messageConstraints.getMaxLineLength());
    }

    public static Builder custom() {
        return new Builder();
    }

    public static MessageConstraints lineLen(int i) {
        return new MessageConstraints(Args.notNegative(i, "Max line length"), -1);
    }

    public int getMaxHeaderCount() {
        return this.f73862b;
    }

    public int getMaxLineLength() {
        return this.f73861a;
    }

    public String toString() {
        return "[maxLineLength=" + this.f73861a + ", maxHeaderCount=" + this.f73862b + "]";
    }

    public MessageConstraints clone() throws CloneNotSupportedException {
        return (MessageConstraints) super.clone();
    }
}