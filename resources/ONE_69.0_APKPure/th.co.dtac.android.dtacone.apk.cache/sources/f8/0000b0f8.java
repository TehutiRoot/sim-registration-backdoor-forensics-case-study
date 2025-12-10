package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class MessagingClientEventExtension {

    /* renamed from: b */
    public static final MessagingClientEventExtension f55738b = new Builder().build();

    /* renamed from: a */
    public final MessagingClientEvent f55739a;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public MessagingClientEvent f55740a = null;

        public MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.f55740a);
        }

        public Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.f55740a = messagingClientEvent;
            return this;
        }
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.f55739a = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return f55738b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.f55739a;
        if (messagingClientEvent == null) {
            return MessagingClientEvent.getDefaultInstance();
        }
        return messagingClientEvent;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "messagingClientEvent")
    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.f55739a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}