package io.grpc;

import com.google.common.base.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.Attributes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
/* loaded from: classes5.dex */
public final class EquivalentAddressGroup {
    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6138")
    public static final Attributes.Key<String> ATTR_AUTHORITY_OVERRIDE = Attributes.Key.create("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a */
    public final List f63235a;

    /* renamed from: b */
    public final Attributes f63236b;

    /* renamed from: c */
    public final int f63237c;

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4972")
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Attr {
    }

    public EquivalentAddressGroup(List<SocketAddress> list) {
        this(list, Attributes.EMPTY);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EquivalentAddressGroup)) {
            return false;
        }
        EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup) obj;
        if (this.f63235a.size() != equivalentAddressGroup.f63235a.size()) {
            return false;
        }
        for (int i = 0; i < this.f63235a.size(); i++) {
            if (!((SocketAddress) this.f63235a.get(i)).equals(equivalentAddressGroup.f63235a.get(i))) {
                return false;
            }
        }
        if (this.f63236b.equals(equivalentAddressGroup.f63236b)) {
            return true;
        }
        return false;
    }

    public List<SocketAddress> getAddresses() {
        return this.f63235a;
    }

    public Attributes getAttributes() {
        return this.f63236b;
    }

    public int hashCode() {
        return this.f63237c;
    }

    public String toString() {
        return "[" + this.f63235a + RemoteSettings.FORWARD_SLASH_STRING + this.f63236b + "]";
    }

    public EquivalentAddressGroup(List<SocketAddress> list, Attributes attributes) {
        Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f63235a = unmodifiableList;
        this.f63236b = (Attributes) Preconditions.checkNotNull(attributes, "attrs");
        this.f63237c = unmodifiableList.hashCode();
    }

    public EquivalentAddressGroup(SocketAddress socketAddress) {
        this(socketAddress, Attributes.EMPTY);
    }

    public EquivalentAddressGroup(SocketAddress socketAddress, Attributes attributes) {
        this(Collections.singletonList(socketAddress), attributes);
    }
}