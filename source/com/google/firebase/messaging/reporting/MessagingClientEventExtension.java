package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class MessagingClientEventExtension {

    /* renamed from: b */
    public static final MessagingClientEventExtension f55726b = new Builder().build();

    /* renamed from: a */
    public final MessagingClientEvent f55727a;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public MessagingClientEvent f55728a = null;

        public MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.f55728a);
        }

        public Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.f55728a = messagingClientEvent;
            return this;
        }
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.f55727a = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return f55726b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.f55727a;
        if (messagingClientEvent == null) {
            return MessagingClientEvent.getDefaultInstance();
        }
        return messagingClientEvent;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "messagingClientEvent")
    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.f55727a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
