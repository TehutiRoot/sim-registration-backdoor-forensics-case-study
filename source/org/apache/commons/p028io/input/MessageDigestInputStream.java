package org.apache.commons.p028io.input;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.p028io.input.ObservableInputStream;

/* renamed from: org.apache.commons.io.input.MessageDigestInputStream */
/* loaded from: classes6.dex */
public final class MessageDigestInputStream extends ObservableInputStream {

    /* renamed from: e */
    public final MessageDigest f73382e;

    /* renamed from: org.apache.commons.io.input.MessageDigestInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ObservableInputStream.AbstractBuilder<Builder> {

        /* renamed from: m */
        public MessageDigest f73383m;

        public Builder setMessageDigest(MessageDigest messageDigest) {
            this.f73383m = messageDigest;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public MessageDigestInputStream get() throws IOException {
            setObservers(Arrays.asList(new MessageDigestMaintainingObserver(this.f73383m)));
            return new MessageDigestInputStream(this);
        }

        public Builder setMessageDigest(String str) throws NoSuchAlgorithmException {
            this.f73383m = MessageDigest.getInstance(str);
            return this;
        }
    }

    /* renamed from: org.apache.commons.io.input.MessageDigestInputStream$MessageDigestMaintainingObserver */
    /* loaded from: classes6.dex */
    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {

        /* renamed from: a */
        public final MessageDigest f73384a;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            Objects.requireNonNull(messageDigest, "messageDigest");
            this.f73384a = messageDigest;
        }

        @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
        public void data(byte[] bArr, int i, int i2) throws IOException {
            this.f73384a.update(bArr, i, i2);
        }

        @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
        public void data(int i) throws IOException {
            this.f73384a.update((byte) i);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public MessageDigest getMessageDigest() {
        return this.f73382e;
    }

    public MessageDigestInputStream(Builder builder) {
        super(builder);
        MessageDigest messageDigest = builder.f73383m;
        Objects.requireNonNull(messageDigest, "builder.messageDigest");
        this.f73382e = messageDigest;
    }
}
