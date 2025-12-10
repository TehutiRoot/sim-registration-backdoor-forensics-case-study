package org.apache.http.config;

import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class MessageConstraints implements Cloneable {
    public static final MessageConstraints DEFAULT = new Builder().build();

    /* renamed from: a */
    public final int f73777a;

    /* renamed from: b */
    public final int f73778b;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public int f73779a = -1;

        /* renamed from: b */
        public int f73780b = -1;

        public MessageConstraints build() {
            return new MessageConstraints(this.f73779a, this.f73780b);
        }

        public Builder setMaxHeaderCount(int i) {
            this.f73780b = i;
            return this;
        }

        public Builder setMaxLineLength(int i) {
            this.f73779a = i;
            return this;
        }
    }

    public MessageConstraints(int i, int i2) {
        this.f73777a = i;
        this.f73778b = i2;
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
        return this.f73778b;
    }

    public int getMaxLineLength() {
        return this.f73777a;
    }

    public String toString() {
        return "[maxLineLength=" + this.f73777a + ", maxHeaderCount=" + this.f73778b + "]";
    }

    public MessageConstraints clone() throws CloneNotSupportedException {
        return (MessageConstraints) super.clone();
    }
}
