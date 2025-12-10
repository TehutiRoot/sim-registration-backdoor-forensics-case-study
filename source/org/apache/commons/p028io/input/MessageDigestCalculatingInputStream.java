package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.p028io.input.ObservableInputStream;

@Deprecated
/* renamed from: org.apache.commons.io.input.MessageDigestCalculatingInputStream */
/* loaded from: classes6.dex */
public class MessageDigestCalculatingInputStream extends ObservableInputStream {

    /* renamed from: e */
    public final MessageDigest f73379e;

    /* renamed from: org.apache.commons.io.input.MessageDigestCalculatingInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ObservableInputStream.AbstractBuilder<Builder> {

        /* renamed from: m */
        public MessageDigest f73380m;

        public Builder() {
            try {
                this.f73380m = MessageDigestCalculatingInputStream.m25107o();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        }

        public void setMessageDigest(MessageDigest messageDigest) {
            this.f73380m = messageDigest;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public MessageDigestCalculatingInputStream get() throws IOException {
            setObservers(Arrays.asList(new MessageDigestMaintainingObserver(this.f73380m)));
            return new MessageDigestCalculatingInputStream(this);
        }

        public void setMessageDigest(String str) throws NoSuchAlgorithmException {
            this.f73380m = MessageDigest.getInstance(str);
        }
    }

    /* renamed from: org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver */
    /* loaded from: classes6.dex */
    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {

        /* renamed from: a */
        public final MessageDigest f73381a;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            Objects.requireNonNull(messageDigest, "messageDigest");
            this.f73381a = messageDigest;
        }

        @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
        public void data(byte[] bArr, int i, int i2) throws IOException {
            this.f73381a.update(bArr, i, i2);
        }

        @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
        public void data(int i) throws IOException {
            this.f73381a.update((byte) i);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: o */
    public static MessageDigest m25107o() {
        return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
    }

    public MessageDigest getMessageDigest() {
        return this.f73379e;
    }

    public MessageDigestCalculatingInputStream(Builder builder) {
        super(builder);
        this.f73379e = builder.f73380m;
    }

    @Deprecated
    public MessageDigestCalculatingInputStream(InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, m25107o());
    }

    @Deprecated
    public MessageDigestCalculatingInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, new MessageDigestMaintainingObserver(messageDigest));
        this.f73379e = messageDigest;
    }

    @Deprecated
    public MessageDigestCalculatingInputStream(InputStream inputStream, String str) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance(str));
    }
}
