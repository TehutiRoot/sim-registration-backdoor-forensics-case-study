package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;

    /* renamed from: a */
    public final String f33693a;

    /* renamed from: b */
    public final CharSequence f33694b;

    /* renamed from: c */
    public final CharSequence[] f33695c;

    /* renamed from: d */
    public final boolean f33696d;

    /* renamed from: e */
    public final int f33697e;

    /* renamed from: f */
    public final Bundle f33698f;

    /* renamed from: g */
    public final Set f33699g;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final String f33700a;

        /* renamed from: d */
        public CharSequence f33703d;

        /* renamed from: e */
        public CharSequence[] f33704e;

        /* renamed from: b */
        public final Set f33701b = new HashSet();

        /* renamed from: c */
        public final Bundle f33702c = new Bundle();

        /* renamed from: f */
        public boolean f33705f = true;

        /* renamed from: g */
        public int f33706g = 0;

        public Builder(@NonNull String str) {
            if (str != null) {
                this.f33700a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @NonNull
        public Builder addExtras(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.f33702c.putAll(bundle);
            }
            return this;
        }

        @NonNull
        public RemoteInput build() {
            return new RemoteInput(this.f33700a, this.f33703d, this.f33704e, this.f33705f, this.f33706g, this.f33702c, this.f33701b);
        }

        @NonNull
        public Bundle getExtras() {
            return this.f33702c;
        }

        @NonNull
        public Builder setAllowDataType(@NonNull String str, boolean z) {
            if (z) {
                this.f33701b.add(str);
            } else {
                this.f33701b.remove(str);
            }
            return this;
        }

        @NonNull
        public Builder setAllowFreeFormInput(boolean z) {
            this.f33705f = z;
            return this;
        }

        @NonNull
        public Builder setChoices(@Nullable CharSequence[] charSequenceArr) {
            this.f33704e = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setEditChoicesBeforeSending(int i) {
            this.f33706g = i;
            return this;
        }

        @NonNull
        public Builder setLabel(@Nullable CharSequence charSequence) {
            this.f33703d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Source {
    }

    /* renamed from: androidx.core.app.RemoteInput$a */
    /* loaded from: classes2.dex */
    public static class C3921a {
        @DoNotInline
        /* renamed from: a */
        public static ClipData m57642a(Intent intent) {
            return intent.getClipData();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57641b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$b */
    /* loaded from: classes2.dex */
    public static class C3922b {
        @DoNotInline
        /* renamed from: a */
        public static void m57640a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static android.app.RemoteInput m57639b(RemoteInput remoteInput) {
            Set<String> allowedDataTypes;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = remoteInput.getAllowedDataTypes()) != null) {
                for (String str : allowedDataTypes) {
                    C3923c.m57633d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C3925e.m57629b(addExtras, remoteInput.getEditChoicesBeforeSending());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        public static RemoteInput m57638c(Object obj) {
            Set<String> m57635b;
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            Builder addExtras = new Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (m57635b = C3923c.m57635b(remoteInput)) != null) {
                for (String str : m57635b) {
                    addExtras.setAllowDataType(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(C3925e.m57630a(remoteInput));
            }
            return addExtras.build();
        }

        @DoNotInline
        /* renamed from: d */
        public static Bundle m57637d(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$c */
    /* loaded from: classes2.dex */
    public static class C3923c {
        @DoNotInline
        /* renamed from: a */
        public static void m57636a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.m57647a(remoteInput), intent, map);
        }

        @DoNotInline
        /* renamed from: b */
        public static Set<String> m57635b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        /* renamed from: c */
        public static Map<String, Uri> m57634c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @DoNotInline
        /* renamed from: d */
        public static RemoteInput.Builder m57633d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$d */
    /* loaded from: classes2.dex */
    public static class C3924d {
        @DoNotInline
        /* renamed from: a */
        public static int m57632a(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57631b(Intent intent, int i) {
            android.app.RemoteInput.setResultsSource(intent, i);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$e */
    /* loaded from: classes2.dex */
    public static class C3925e {
        @DoNotInline
        /* renamed from: a */
        public static int m57630a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* renamed from: b */
        public static RemoteInput.Builder m57629b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.f33693a = str;
        this.f33694b = charSequence;
        this.f33695c = charSequenceArr;
        this.f33696d = z;
        this.f33697e = i;
        this.f33698f = bundle;
        this.f33699g = set;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static android.app.RemoteInput m57647a(RemoteInput remoteInput) {
        return C3922b.m57639b(remoteInput);
    }

    public static void addDataResultToIntent(@NonNull RemoteInput remoteInput, @NonNull Intent intent, @NonNull Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3923c.m57636a(remoteInput, intent, map);
            return;
        }
        Intent m57644d = m57644d(intent);
        if (m57644d == null) {
            m57644d = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = m57644d.getBundleExtra(m57643e(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(remoteInput.getResultKey(), value.toString());
                m57644d.putExtra(m57643e(key), bundleExtra);
            }
        }
        C3921a.m57641b(intent, ClipData.newIntent(RESULTS_CLIP_LABEL, m57644d));
    }

    public static void addResultsToIntent(@NonNull RemoteInput[] remoteInputArr, @NonNull Intent intent, @NonNull Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3922b.m57640a(m57646b(remoteInputArr), intent, bundle);
            return;
        }
        Bundle resultsFromIntent = getResultsFromIntent(intent);
        int resultsSource = getResultsSource(intent);
        if (resultsFromIntent != null) {
            resultsFromIntent.putAll(bundle);
            bundle = resultsFromIntent;
        }
        for (RemoteInput remoteInput : remoteInputArr) {
            Map<String, Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, remoteInput.getResultKey());
            C3922b.m57640a(m57646b(new RemoteInput[]{remoteInput}), intent, bundle);
            if (dataResultsFromIntent != null) {
                addDataResultToIntent(remoteInput, intent, dataResultsFromIntent);
            }
        }
        setResultsSource(intent, resultsSource);
    }

    /* renamed from: b */
    public static android.app.RemoteInput[] m57646b(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = m57647a(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    /* renamed from: c */
    public static RemoteInput m57645c(android.app.RemoteInput remoteInput) {
        return C3922b.m57638c(remoteInput);
    }

    /* renamed from: d */
    public static Intent m57644d(Intent intent) {
        ClipData m57642a = C3921a.m57642a(intent);
        if (m57642a == null) {
            return null;
        }
        ClipDescription description = m57642a.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL)) {
            return null;
        }
        return m57642a.getItemAt(0).getIntent();
    }

    /* renamed from: e */
    public static String m57643e(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    @Nullable
    public static Map<String, Uri> getDataResultsFromIntent(@NonNull Intent intent, @NonNull String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return C3923c.m57634c(intent, str);
        }
        Intent m57644d = m57644d(intent);
        if (m57644d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : m57644d.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = m57644d.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    @Nullable
    public static Bundle getResultsFromIntent(@NonNull Intent intent) {
        return C3922b.m57637d(intent);
    }

    public static int getResultsSource(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3924d.m57632a(intent);
        }
        Intent m57644d = m57644d(intent);
        if (m57644d == null) {
            return 0;
        }
        return m57644d.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void setResultsSource(@NonNull Intent intent, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C3924d.m57631b(intent, i);
            return;
        }
        Intent m57644d = m57644d(intent);
        if (m57644d == null) {
            m57644d = new Intent();
        }
        m57644d.putExtra("android.remoteinput.resultsSource", i);
        C3921a.m57641b(intent, ClipData.newIntent(RESULTS_CLIP_LABEL, m57644d));
    }

    public boolean getAllowFreeFormInput() {
        return this.f33696d;
    }

    @Nullable
    public Set<String> getAllowedDataTypes() {
        return this.f33699g;
    }

    @Nullable
    public CharSequence[] getChoices() {
        return this.f33695c;
    }

    public int getEditChoicesBeforeSending() {
        return this.f33697e;
    }

    @NonNull
    public Bundle getExtras() {
        return this.f33698f;
    }

    @Nullable
    public CharSequence getLabel() {
        return this.f33694b;
    }

    @NonNull
    public String getResultKey() {
        return this.f33693a;
    }

    public boolean isDataOnly() {
        if (!getAllowFreeFormInput() && ((getChoices() == null || getChoices().length == 0) && getAllowedDataTypes() != null && !getAllowedDataTypes().isEmpty())) {
            return true;
        }
        return false;
    }
}
