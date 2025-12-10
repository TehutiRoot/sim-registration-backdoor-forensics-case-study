package com.tbruyelle.rxpermissions2;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;

/* loaded from: classes5.dex */
public class Permission {
    public final boolean granted;
    public final String name;
    public final boolean shouldShowRequestPermissionRationale;

    /* renamed from: com.tbruyelle.rxpermissions2.Permission$a */
    /* loaded from: classes5.dex */
    public class C9825a implements BiConsumer {
        public C9825a() {
        }

        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void accept(StringBuilder sb, String str) {
            if (sb.length() == 0) {
                sb.append(str);
                return;
            }
            sb.append(", ");
            sb.append(str);
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.Permission$b */
    /* loaded from: classes5.dex */
    public class C9826b implements Function {
        public C9826b() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public String apply(Permission permission) {
            return permission.name;
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.Permission$c */
    /* loaded from: classes5.dex */
    public class C9827c implements Predicate {
        public C9827c() {
        }

        @Override // io.reactivex.functions.Predicate
        /* renamed from: a */
        public boolean test(Permission permission) {
            return permission.granted;
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.Permission$d */
    /* loaded from: classes5.dex */
    public class C9828d implements Predicate {
        public C9828d() {
        }

        @Override // io.reactivex.functions.Predicate
        /* renamed from: a */
        public boolean test(Permission permission) {
            return permission.shouldShowRequestPermissionRationale;
        }
    }

    public Permission(String str, boolean z) {
        this(str, z, false);
    }

    /* renamed from: a */
    public final Boolean m33176a(List list) {
        return Observable.fromIterable(list).all(new C9827c()).blockingGet();
    }

    /* renamed from: b */
    public final String m33175b(List list) {
        return ((StringBuilder) Observable.fromIterable(list).map(new C9826b()).collectInto(new StringBuilder(), new C9825a()).blockingGet()).toString();
    }

    /* renamed from: c */
    public final Boolean m33174c(List list) {
        return Observable.fromIterable(list).any(new C9828d()).blockingGet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission permission = (Permission) obj;
        if (this.granted != permission.granted || this.shouldShowRequestPermissionRationale != permission.shouldShowRequestPermissionRationale) {
            return false;
        }
        return this.name.equals(permission.name);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + (this.granted ? 1 : 0)) * 31) + (this.shouldShowRequestPermissionRationale ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.name + CoreConstants.SINGLE_QUOTE_CHAR + ", granted=" + this.granted + ", shouldShowRequestPermissionRationale=" + this.shouldShowRequestPermissionRationale + '}';
    }

    public Permission(String str, boolean z, boolean z2) {
        this.name = str;
        this.granted = z;
        this.shouldShowRequestPermissionRationale = z2;
    }

    public Permission(List<Permission> list) {
        this.name = m33175b(list);
        this.granted = m33176a(list).booleanValue();
        this.shouldShowRequestPermissionRationale = m33174c(list).booleanValue();
    }
}