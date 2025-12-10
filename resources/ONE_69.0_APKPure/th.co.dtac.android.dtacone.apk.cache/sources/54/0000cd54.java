package io.opencensus.trace;

import ch.qos.logback.core.joran.action.Action;
import io.opencensus.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Tracestate {

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: c */
        public static final Tracestate f63755c = Tracestate.m30487d(Collections.emptyList());

        /* renamed from: a */
        public final Tracestate f63756a;

        /* renamed from: b */
        public ArrayList f63757b;

        public Tracestate build() {
            ArrayList arrayList = this.f63757b;
            if (arrayList != null) {
                return Tracestate.m30487d(arrayList);
            }
            return this.f63756a;
        }

        public Builder remove(String str) {
            Utils.checkNotNull(str, Action.KEY_ATTRIBUTE);
            if (this.f63757b == null) {
                this.f63757b = new ArrayList(this.f63756a.getEntries());
            }
            int i = 0;
            while (true) {
                if (i >= this.f63757b.size()) {
                    break;
                } else if (((Entry) this.f63757b.get(i)).getKey().equals(str)) {
                    this.f63757b.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            return this;
        }

        public Builder set(String str, String str2) {
            Entry create = Entry.create(str, str2);
            if (this.f63757b == null) {
                this.f63757b = new ArrayList(this.f63756a.getEntries());
            }
            int i = 0;
            while (true) {
                if (i >= this.f63757b.size()) {
                    break;
                } else if (((Entry) this.f63757b.get(i)).getKey().equals(create.getKey())) {
                    this.f63757b.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            this.f63757b.add(0, create);
            return this;
        }

        public Builder(Tracestate tracestate) {
            Utils.checkNotNull(tracestate, "parent");
            this.f63756a = tracestate;
            this.f63757b = null;
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Entry {
        public static Entry create(String str, String str2) {
            Utils.checkNotNull(str, Action.KEY_ATTRIBUTE);
            Utils.checkNotNull(str2, "value");
            Utils.checkArgument(Tracestate.m30486e(str), "Invalid key %s", str);
            Utils.checkArgument(Tracestate.m30485f(str2), "Invalid value %s", str2);
            return new C10720j(str, str2);
        }

        public abstract String getKey();

        public abstract String getValue();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static Tracestate m30487d(List list) {
        boolean z;
        if (list.size() <= 32) {
            z = true;
        } else {
            z = false;
        }
        Utils.checkState(z, "Invalid size");
        return new C10719i(Collections.unmodifiableList(list));
    }

    /* renamed from: e */
    public static boolean m30486e(String str) {
        if (str.length() > 256 || str.isEmpty() || str.charAt(0) < 'a' || str.charAt(0) > 'z') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '*' && charAt != '/')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m30485f(String str) {
        if (str.length() > 256 || str.charAt(str.length() - 1) == ' ') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == ',' || charAt == '=' || charAt < ' ' || charAt > '~') {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public String get(String str) {
        for (Entry entry : getEntries()) {
            if (entry.getKey().equals(str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public abstract List<Entry> getEntries();

    public Builder toBuilder() {
        return new Builder();
    }
}