package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes4.dex */
public final class CredentialAccessBoundary {

    /* renamed from: a */
    public final List f52416a;

    /* loaded from: classes4.dex */
    public static final class AccessBoundaryRule {

        /* renamed from: a */
        public final String f52417a;

        /* renamed from: b */
        public final List f52418b;

        /* renamed from: c */
        public final AvailabilityCondition f52419c;

        /* loaded from: classes4.dex */
        public static final class AvailabilityCondition {

            /* renamed from: a */
            public final String f52420a;

            /* renamed from: b */
            public final String f52421b;

            /* renamed from: c */
            public final String f52422c;

            /* loaded from: classes4.dex */
            public static final class Builder {

                /* renamed from: a */
                public String f52423a;

                /* renamed from: b */
                public String f52424b;

                /* renamed from: c */
                public String f52425c;

                public AvailabilityCondition build() {
                    return new AvailabilityCondition(this.f52423a, this.f52424b, this.f52425c);
                }

                @CanIgnoreReturnValue
                public Builder setDescription(String str) {
                    this.f52425c = str;
                    return this;
                }

                @CanIgnoreReturnValue
                public Builder setExpression(String str) {
                    this.f52423a = str;
                    return this;
                }

                @CanIgnoreReturnValue
                public Builder setTitle(String str) {
                    this.f52424b = str;
                    return this;
                }

                public Builder() {
                }
            }

            public AvailabilityCondition(String str, String str2, String str3) {
                this.f52420a = (String) Preconditions.checkNotNull(str);
                this.f52421b = str2;
                this.f52422c = str3;
                Preconditions.checkArgument(!str.isEmpty(), "The provided expression is empty.");
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Nullable
            public String getDescription() {
                return this.f52422c;
            }

            public String getExpression() {
                return this.f52420a;
            }

            @Nullable
            public String getTitle() {
                return this.f52421b;
            }
        }

        /* loaded from: classes4.dex */
        public static class Builder {

            /* renamed from: a */
            public String f52426a;

            /* renamed from: b */
            public List f52427b;

            /* renamed from: c */
            public AvailabilityCondition f52428c;

            public Builder addAvailablePermission(String str) {
                if (this.f52427b == null) {
                    this.f52427b = new ArrayList();
                }
                this.f52427b.add(str);
                return this;
            }

            public AccessBoundaryRule build() {
                return new AccessBoundaryRule(this.f52426a, this.f52427b, this.f52428c);
            }

            @CanIgnoreReturnValue
            public Builder setAvailabilityCondition(AvailabilityCondition availabilityCondition) {
                this.f52428c = availabilityCondition;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAvailablePermissions(List<String> list) {
                this.f52427b = new ArrayList((Collection) Preconditions.checkNotNull(list));
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAvailableResource(String str) {
                this.f52426a = str;
                return this;
            }

            public Builder() {
            }
        }

        public AccessBoundaryRule(String str, List list, AvailabilityCondition availabilityCondition) {
            this.f52417a = (String) Preconditions.checkNotNull(str);
            this.f52418b = new ArrayList((Collection) Preconditions.checkNotNull(list));
            this.f52419c = availabilityCondition;
            Preconditions.checkArgument(!str.isEmpty(), "The provided availableResource is empty.");
            Preconditions.checkArgument(!list.isEmpty(), "The list of provided availablePermissions is empty.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null) {
                    if (str2.isEmpty()) {
                        throw new IllegalArgumentException("One of the provided available permissions is empty.");
                    }
                } else {
                    throw new IllegalArgumentException("One of the provided available permissions is null.");
                }
            }
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Nullable
        public AvailabilityCondition getAvailabilityCondition() {
            return this.f52419c;
        }

        public List<String> getAvailablePermissions() {
            return this.f52418b;
        }

        public String getAvailableResource() {
            return this.f52417a;
        }
    }

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public List f52429a;

        @CanIgnoreReturnValue
        public Builder addRule(AccessBoundaryRule accessBoundaryRule) {
            if (this.f52429a == null) {
                this.f52429a = new ArrayList();
            }
            this.f52429a.add(Preconditions.checkNotNull(accessBoundaryRule));
            return this;
        }

        public CredentialAccessBoundary build() {
            return new CredentialAccessBoundary(this.f52429a);
        }

        @CanIgnoreReturnValue
        public Builder setRules(List<AccessBoundaryRule> list) {
            this.f52429a = new ArrayList((Collection) Preconditions.checkNotNull(list));
            return this;
        }

        public Builder() {
        }
    }

    public CredentialAccessBoundary(List list) {
        boolean z;
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(!list.isEmpty(), "At least one access boundary rule must be provided.");
        if (list.size() < 10) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, String.format("The provided list has more than %s access boundary rules.", 10));
        this.f52416a = list;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* renamed from: a */
    public String m41677a() {
        ArrayList arrayList = new ArrayList();
        for (AccessBoundaryRule accessBoundaryRule : this.f52416a) {
            GenericJson genericJson = new GenericJson();
            JsonFactory jsonFactory = CJ0.f695f;
            genericJson.setFactory(jsonFactory);
            genericJson.put("availableResource", (Object) accessBoundaryRule.getAvailableResource());
            genericJson.put("availablePermissions", (Object) accessBoundaryRule.getAvailablePermissions());
            AccessBoundaryRule.AvailabilityCondition availabilityCondition = accessBoundaryRule.getAvailabilityCondition();
            if (availabilityCondition != null) {
                GenericJson genericJson2 = new GenericJson();
                genericJson2.setFactory(jsonFactory);
                genericJson2.put("expression", (Object) availabilityCondition.getExpression());
                if (availabilityCondition.getTitle() != null) {
                    genericJson2.put(MessageBundle.TITLE_ENTRY, (Object) availabilityCondition.getTitle());
                }
                if (availabilityCondition.getDescription() != null) {
                    genericJson2.put("description", (Object) availabilityCondition.getDescription());
                }
                genericJson.put("availabilityCondition", (Object) genericJson2);
            }
            arrayList.add(genericJson);
        }
        GenericJson genericJson3 = new GenericJson();
        JsonFactory jsonFactory2 = CJ0.f695f;
        genericJson3.setFactory(jsonFactory2);
        genericJson3.put("accessBoundaryRules", (Object) arrayList);
        GenericJson genericJson4 = new GenericJson();
        genericJson4.setFactory(jsonFactory2);
        genericJson4.put("accessBoundary", (Object) genericJson3);
        return genericJson4.toString();
    }

    public List<AccessBoundaryRule> getAccessBoundaryRules() {
        return this.f52416a;
    }
}
