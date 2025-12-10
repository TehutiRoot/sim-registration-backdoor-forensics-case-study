package com.google.firebase.encoders.proto;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class AtProtobuf {

    /* renamed from: a */
    public int f55425a;

    /* renamed from: b */
    public Protobuf.IntEncoding f55426b = Protobuf.IntEncoding.DEFAULT;

    /* renamed from: com.google.firebase.encoders.proto.AtProtobuf$a */
    /* loaded from: classes4.dex */
    public static final class C8497a implements Protobuf {

        /* renamed from: a */
        public final int f55427a;

        /* renamed from: b */
        public final Protobuf.IntEncoding f55428b;

        public C8497a(int i, Protobuf.IntEncoding intEncoding) {
            this.f55427a = i;
            this.f55428b = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.f55427a == protobuf.tag() && this.f55428b.equals(protobuf.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f55427a) + (this.f55428b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.f55428b;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.f55427a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.f55427a + "intEncoding=" + this.f55428b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public Protobuf build() {
        return new C8497a(this.f55425a, this.f55426b);
    }

    public AtProtobuf intEncoding(Protobuf.IntEncoding intEncoding) {
        this.f55426b = intEncoding;
        return this;
    }

    public AtProtobuf tag(int i) {
        this.f55425a = i;
        return this;
    }
}
